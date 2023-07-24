/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Dao;

import ec.edu.ups.edu.practica05_interface.test.IDao.ICompositorDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cancion;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class CompositorDao implements ICompositorDao{
   private String ruta;
    private RandomAccessFile Escritura;
    
   private RandomAccessFile Lectura;
   

    public CompositorDao() {
        this.ruta = "src\\main\\resources\\rutas\\compositor.PSN";
    }
    
    

    @Override
    public void create(Compositor compositor) {
        try {
            Escritura = new RandomAccessFile(ruta, "rw");
            Escritura.seek(Escritura.length());
            
            Escritura.writeInt(compositor.getCodigo());
            Escritura.writeUTF(compositor.getNombre());
            Escritura.writeUTF(compositor.getApellido());
            Escritura.writeInt(compositor.getEdad());
            Escritura.writeUTF(compositor.getNacionalidad());
            Escritura.writeInt(compositor.getNumeroDeComposiciones());
            Escritura.writeDouble(compositor.getSalario());
            List<Cancion> listaCanc = compositor.getCancionesTop100Billboard();
            for (int i = 0; i < listaCanc.size() ; i++) {
                 Escritura.writeInt(listaCanc.get(i).getCodigo());
                 Escritura.writeUTF(listaCanc.get(i).getTitulo());
                 Escritura.writeUTF(listaCanc.get(i).getLetra());
                 Escritura.writeDouble(listaCanc.get(i).getTiempoEnMinutos());
            }
            List<Cantante> listaCantante = compositor.getCliente();
            for (int i = 0; i < listaCantante.size(); i++) {
                Escritura.writeInt(listaCantante.get(i).getCodigo());
                Escritura.writeUTF(listaCantante.get(i).getNombre());
                Escritura.writeUTF(listaCantante.get(i).getApellido());
                Escritura.writeInt(listaCantante.get(i).getEdad());
                Escritura.writeUTF(listaCantante.get(i).getNacionalidad());
                Escritura.writeUTF(listaCantante.get(i).getNombreArtistico());
                Escritura.writeUTF(listaCantante.get(i).getGeneroMusical());
                Escritura.writeInt(listaCantante.get(i).getNumeroDeSencillos());
                Escritura.writeInt(listaCantante.get(i).getNumeroDeConciertos());
                Escritura.writeInt(listaCantante.get(i).getNumeroDeGiras());
                Escritura.writeDouble(listaCantante.get(i).getSalario());
            }
            System.out.println("Tamnio del archivo : "+Escritura.length()); 
            Escritura.close();
         }
        catch(FileNotFoundException e){
            System.out.println("Ruta no ecncontrada");
        } catch(IOException e1){
            System.out.println("Error de Escritura");
        }
        catch (Exception e) {
            System.out.println("Error General");
        }
    }

    @Override
    public Compositor read(int codigo) {
        try {
            Lectura = new RandomAccessFile(ruta, "r");
            int bytesPorCompositor = 1941;
            long numCompositores = Lectura.length() / bytesPorCompositor;

            for (int i = 0; i < numCompositores; i++) {
                Lectura.seek(i * bytesPorCompositor);
                int codigoCantante = Lectura.readInt();

                if (codigoCantante == codigo) {
                    String nombre = Lectura.readUTF();
                    String apellido = Lectura.readUTF();
                    int edad = Lectura.readInt();
                    String nacionalidad = Lectura.readUTF();
                    int numeroComposiciones = Lectura.readInt();
                    double salario = Lectura.readDouble();
                    Compositor compositor = new Compositor(numeroComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);
                    for (int j = 0; j < 10; j++) {
                        int codigoComp = Lectura.readInt();
                        String titulo = Lectura.readUTF();
                        String letra = Lectura.readUTF();
                        double tiempo = Lectura.readDouble();
                        Cancion cancion = new Cancion(codigoComp, titulo, letra,tiempo );
                        compositor.agregarCancion(cancion); 
                        
                    }
                    
                    for (int j = 0; j < 10; j++) {
                        int codigoCan = Lectura.readInt();
                        String nombreCan = Lectura.readUTF();
                        String apellidoCan = Lectura.readUTF();
                        int edadCan = Lectura.readInt();
                        String nacionalidadCan = Lectura.readUTF();
                        String nombreARCan = Lectura.readUTF();
                        String generoMusical = Lectura.readUTF();
                        int numeroSencillos = Lectura.readInt();
                        int numeroConciertos = Lectura.readInt();
                        int numeroGiras = Lectura.readInt();
                        double salarioCan = Lectura.readDouble();
                        Cantante cantante = new Cantante(nombreARCan, generoMusical, numeroSencillos, numeroConciertos, numeroGiras, codigoCan, nombreCan, apellidoCan, edadCan, nacionalidadCan, salarioCan);
                        compositor.agregarClientE(cantante); 
                    }
                    
                    Lectura.close();

                    return compositor ;
            }
        }
        Lectura.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ruta no encontrada");
        } catch (IOException e1) {
            System.out.println("Error de Lectura");
        } catch (Exception e) {
            System.out.println("Error General");
        }
        return null; 
    }

    @Override
    public void update(Compositor nuevoCompositor) {
        try {
            RandomAccessFile archivoEscritura = new RandomAccessFile(ruta, "rw");
            int bytesPorCompositor = 1941; 
            long numCompositores = archivoEscritura.length() / bytesPorCompositor;
            boolean encontrado = false;

            for (int i = 0; i < numCompositores; i++) {
            
                archivoEscritura.seek(i * bytesPorCompositor);

                int codigo = archivoEscritura.readInt();

                if (codigo == nuevoCompositor.getCodigo()) {
                    System.out.println("Codigo " + codigo);
                    encontrado = true;
                    archivoEscritura.writeUTF(nuevoCompositor.getNombre());
                    archivoEscritura.writeUTF(nuevoCompositor.getApellido());
                    archivoEscritura.writeInt(nuevoCompositor.getEdad());
                    archivoEscritura.writeUTF(nuevoCompositor.getNacionalidad());
                    archivoEscritura.writeInt(nuevoCompositor.getNumeroDeComposiciones());
                    archivoEscritura.writeDouble(nuevoCompositor.getSalario());
                    List<Cancion> listaCanc = nuevoCompositor.getCancionesTop100Billboard();
                    for (int j = 0; j < listaCanc.size(); j++) {
                        archivoEscritura.writeInt(listaCanc.get(j).getCodigo());
                        archivoEscritura.writeUTF(listaCanc.get(j).getTitulo());
                        archivoEscritura.writeUTF(listaCanc.get(j).getLetra());
                        archivoEscritura.writeDouble(listaCanc.get(j).getTiempoEnMinutos());
                    }
                    List<Cantante> listaCantante = nuevoCompositor.getCliente();
                    for (int j = 0; j < listaCantante.size(); j++) {
                        archivoEscritura.writeInt(listaCantante.get(j).getCodigo());
                        archivoEscritura.writeUTF(listaCantante.get(j).getNombre());
                        archivoEscritura.writeUTF(listaCantante.get(j).getApellido());
                        archivoEscritura.writeInt(listaCantante.get(j).getEdad());
                        archivoEscritura.writeUTF(listaCantante.get(j).getNacionalidad());
                        archivoEscritura.writeUTF(listaCantante.get(j).getNombreArtistico());
                        archivoEscritura.writeUTF(listaCantante.get(j).getGeneroMusical());
                        archivoEscritura.writeInt(listaCantante.get(j).getNumeroDeSencillos());
                        archivoEscritura.writeInt(listaCantante.get(j).getNumeroDeConciertos());
                        archivoEscritura.writeInt(listaCantante.get(j).getNumeroDeGiras());
                        archivoEscritura.writeDouble(listaCantante.get(j).getSalario());
                    }
                    break; 
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ruta no encontrada");
        } catch (IOException e1) {
            System.out.println("Error de Lectura/Escritura");
        } catch (Exception e) {
            System.out.println("Error General");
        }
    }

    @Override
    public void delete(Compositor compostior) {
        
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta, "rw");
            int bytesPorCompositor = 1941; 
            long numCompositores = archivo.length() / bytesPorCompositor;
            

            for (int i = 0; i < numCompositores; i++) {
                archivo.seek(i * bytesPorCompositor);
                int codigo = archivo.readInt();
                if (codigo == compostior.getCodigo()) {
                    
                    for (int j = i + 1; j < numCompositores; j++) {
                        archivo.seek(j * bytesPorCompositor);
                        byte[] datos = new byte[bytesPorCompositor];
                        archivo.readFully(datos);
                        archivo.seek((j - 1) * bytesPorCompositor);
                        archivo.write(datos);
                    }

                    archivo.setLength((numCompositores - 1) * bytesPorCompositor); 
                    break; 
                }
            }

            archivo.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ruta no encontrada");
        } catch (IOException e1) {
            System.out.println("Error de Lectura/Escritura");
        } catch (Exception e) {
            System.out.println("Error General");
        }
    }
    
    @Override
    public Compositor buscarPorTituloDeCancion(String valor) {
        List<Compositor> listaCompositor = this.findAll();
        for (Compositor compositor : listaCompositor) { 
            if (compositor instanceof Compositor) { 
                for (Cancion cancion : compositor.getCancionesTop100Billboard()) { 
                    if (cancion.getTitulo().equals(valor)) { 
                        return compositor; 
                    }
                }
            }
        }
        return null;
    }
    
    @Override
    public List<Compositor> findAll() {
        List<Compositor> listaCompositores = new ArrayList<>();

        try {
            RandomAccessFile archivoLectura = new RandomAccessFile(ruta, "r");
            int bytesPorCompositor = 1941; 

            long numCompositores = archivoLectura.length() / bytesPorCompositor;
            System.out.println(archivoLectura.length());
            for (int i = 0; i < numCompositores; i++) {
                archivoLectura.seek(i * bytesPorCompositor);

                int codigo = archivoLectura.readInt();
                String nombre = archivoLectura.readUTF();
                String apellido = archivoLectura.readUTF();
                int edad = archivoLectura.readInt();
                String nacionalidad = archivoLectura.readUTF();
                int numeroComposiciones = archivoLectura.readInt();
                double salario = archivoLectura.readDouble();

                Compositor compositor = new Compositor(numeroComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);
                System.out.println(archivoLectura.length());
                for (int j = 0; j < 10; j++) {
                    int codigoCancion = archivoLectura.readInt();
                    String titulo = archivoLectura.readUTF();
                    String letra = archivoLectura.readUTF();
                    double tiempo = archivoLectura.readDouble();
                    Cancion cancion = new Cancion(codigoCancion, titulo, letra, tiempo);
                    compositor.agregarCancion(cancion);
                }

                for (int j = 0; j < 10; j++) {
                    int codigoCantante = archivoLectura.readInt();
                    String nombreCantante = archivoLectura.readUTF();
                    String apellidoCantante = archivoLectura.readUTF();
                    int edadCantante = archivoLectura.readInt();
                    String nacionalidadCantante = archivoLectura.readUTF();
                    String nombreArtistico = archivoLectura.readUTF();
                    String generoMusical = archivoLectura.readUTF();
                    int numeroSencillos = archivoLectura.readInt();
                    int numeroConciertos = archivoLectura.readInt();
                    int numeroGiras = archivoLectura.readInt();
                    double salarioCantante = archivoLectura.readDouble();

                    Cantante cantante = new Cantante(nombreArtistico, generoMusical, numeroSencillos, numeroConciertos, numeroGiras, codigoCantante, nombreCantante, apellidoCantante, edadCantante, nacionalidadCantante, salarioCantante);
                    compositor.agregarClientE(cantante);
                }

                listaCompositores.add(compositor);
            }

            archivoLectura.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ruta no encontrada");
        } catch (IOException e1) {
            System.out.println("Error de Lectura");
        } catch (Exception e) {
            System.out.println("Error General");
        }

        return listaCompositores;
    }
}
    

