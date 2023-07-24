/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Dao;
import ec.edu.ups.edu.practica05_interface.test.IDao.ICantanteDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Disco;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class CantanteDao implements ICantanteDao {
    private String ruta;
   
    private RandomAccessFile escritura;
    private RandomAccessFile lectura;


    public CantanteDao() {
        this.ruta = "src\\main\\resources\\rutas\\cantante.PSN"; 
    }
    
    
    @Override
    public void create(Cantante cantante) {
        
         try {
            escritura = new RandomAccessFile(ruta, "rw");
            escritura.seek(escritura.length());
            escritura.writeInt(cantante.getCodigo());
            escritura.writeUTF(cantante.getNombre());
           escritura.writeUTF(cantante.getApellido());
            escritura.writeInt(cantante.getEdad());
            escritura.writeUTF(cantante.getNacionalidad());
            escritura.writeUTF(cantante.getNombreArtistico());
            escritura.writeUTF(cantante.getGeneroMusical());
            escritura.writeInt(cantante.getNumeroDeSencillos());
            escritura.writeInt(cantante.getNumeroDeConciertos());
            escritura.writeInt(cantante.getNumeroDeGiras());
            escritura.writeDouble(cantante.getSalario());
            List<Disco> listaDisc = cantante.getDiscos();
             System.out.println(cantante.getSalario());
            for (int i = 0; i < 10; i++) {
                 escritura.writeInt(listaDisc.get(i).getCodigo());
                 escritura.writeUTF(listaDisc.get(i).getNombre());
                 escritura.writeInt(listaDisc.get(i).getAnioDeLanzamiento());
            }
             System.out.println(escritura.length());
            escritura.close();
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
    public Cantante read(int codigo) {
        try {
            lectura = new RandomAccessFile(ruta, "r");
            int bytesPorCantante = 363;
            long numCantantes = lectura.length() / bytesPorCantante;

            for (int i = 0; i < numCantantes; i++) {
                lectura.seek(i * bytesPorCantante);
                int codigoCantante = lectura.readInt();

                if (codigoCantante == codigo) {
                    String nombre = lectura.readUTF();
                     String apellido = lectura.readUTF();
                      int edad = lectura.readInt();
                       String nacionalidad = lectura.readUTF();
                        String nombreArtistico = lectura.readUTF();
                        String generoMusical = lectura.readUTF();
                       int numeroDeSencillos = lectura.readInt();
                      int numeroDeConciertos = lectura.readInt();
                     int numeroDeGiras = lectura.readInt();
                    double salario = lectura.readDouble();
                    Cantante cantante = new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, nacionalidad,salario);
                    for (int j = 0; j < 10; j++) {
                        int codigoCan = lectura.readInt();
                         String nombreCAn = lectura.readUTF();
                        int anio = lectura.readInt();
                        Disco dis = new Disco(codigoCan, nombreCAn, anio);
                        cantante.agregarDisco(dis);
                        
                    }
                    lectura.close();

                    return cantante ;
            }
        }
        lectura.close();
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
    public void update(Cantante cantante) {
         try {
            RandomAccessFile archivo = new RandomAccessFile(ruta, "rw");
            int bytesPorCantante = 363 ;
            long numCantantes = archivo.length() / bytesPorCantante;
            for (int i = 0; i < numCantantes; i++) {
                archivo.seek(i * bytesPorCantante);
                int codigoCantante = archivo.readInt();
                if (codigoCantante == cantante.getCodigo()) {
                    archivo.writeUTF(cantante.getNombre());
                     archivo.writeUTF(cantante.getApellido());
                      archivo.writeInt(cantante.getEdad());
                       archivo.writeUTF(cantante.getNacionalidad());
                         archivo.writeUTF(cantante.getNombreArtistico());
                         archivo.writeUTF(cantante.getGeneroMusical());
                       archivo.writeInt(cantante.getNumeroDeSencillos());
                      archivo.writeInt(cantante.getNumeroDeConciertos());
                     archivo.writeInt(cantante.getNumeroDeGiras());
                    archivo.writeDouble(cantante.getSalario());
                    List<Disco> listaDisc = cantante.getDiscos();
                    for (int j = 0; i < listaDisc.size(); j++) {
                        archivo.writeInt(listaDisc.get(j).getCodigo());
                         archivo.writeUTF(listaDisc.get(j).getNombre());
                        archivo.writeInt(listaDisc.get(j).getAnioDeLanzamiento());
                    }
                    
                    archivo.close();
                    return; 
            }
        }archivo.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ruta no encontrada");
            } catch (IOException e1) {
                System.out.println("Error de Lectura");
            } catch (Exception e) {
                System.out.println("Error General");
        }
    }

    @Override
    public void delete(Cantante cantante) {
        try{
            RandomAccessFile archivito = new RandomAccessFile(ruta, "rw");

            int bytesPorCantante = 363;
            long numCantantes = archivito.length() / bytesPorCantante;
              for (int i = 0; i < numCantantes; i++) {
                archivito.seek(i * bytesPorCantante);
                  int codigoCantante = archivito.readInt();
                  if (codigoCantante == cantante.getCodigo()) {
                    
                    for (int j = i + 1; j < numCantantes; j++) {
                        archivito.seek( j * bytesPorCantante);
                        byte[] datos = new byte[bytesPorCantante];
                        archivito.readFully(datos);
                         archivito.seek((j - 1) * bytesPorCantante);
                        archivito.write(datos);
                    }
                    archivito.setLength((numCantantes-1)*bytesPorCantante);
                    break;
                }
                
            }
            archivito.close();
            System.out.println("No Existe el codgo");
        }catch (FileNotFoundException e) {
            System.out.println("Ruta no encontrada");
        } catch (IOException e1) {
            System.out.println("Error de Lectura/Escritura");
        } catch (Exception e) {
            System.out.println("Error General");
        }
        
    }
    
    @Override
    public Cantante buscarPorNombreDeDisco(String valor) {
        List <Cantante> listaCantantes = this.findAll();
        for(Cantante cantante : listaCantantes){
            if(cantante instanceof Cantante){
                for(Disco disco : cantante.getDiscos()){
                    if(disco.getNombre().equals(valor)){
                        return cantante;
                    }
                }
            }
        }
        return null;
    }

    @Override
      public List<Cantante> findAll() {
        List<Cantante> listaCantantes = new ArrayList<>();
    try {
        RandomAccessFile archivoLectura = new RandomAccessFile(ruta, "r");
        int bytesPorCantante = 363 ;
        long numCantantes = archivoLectura.length() / bytesPorCantante;
        for (int i = 0; i < numCantantes; i++) {
            archivoLectura.seek(i * bytesPorCantante);
            int codigo = archivoLectura.readInt();
            
            String nombre = archivoLectura.readUTF();
             String apellido = archivoLectura.readUTF();
              int edad = archivoLectura.readInt();
               String nacionalidad = archivoLectura.readUTF();
                String nombreArtistico = archivoLectura.readUTF();
                String generoMusical = archivoLectura.readUTF();
               int numeroDeSencillos = archivoLectura.readInt();
              int numeroDeConciertos = archivoLectura.readInt();
             int numeroDeGiras = archivoLectura.readInt();
            double salario = archivoLectura.readDouble();
            Cantante cantante = new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, nacionalidad, salario);
            for (int j = 0; j < 10; j++) {
                int codigoCan = archivoLectura.readInt();
                 String nombreCAn = archivoLectura.readUTF();
                int anio = archivoLectura.readInt();
                Disco dis = new Disco(codigoCan, nombreCAn, anio);
                cantante.agregarDisco(dis);
            }
            listaCantantes.add(cantante);
        }

        archivoLectura.close();
    } catch (FileNotFoundException e) {
        System.out.println("Ruta no encontrada");
    } catch (IOException e1) {
        System.out.println("Error de Lectura");
    } catch (Exception e) {
        System.out.println("Error General");
    }

    return listaCantantes;
    }
    
}
