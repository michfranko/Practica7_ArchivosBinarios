/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Vista.Disco;
import ec.edu.ups.edu.practica05_interface.test.controlador.ControladorCantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Disco;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author venot
 */
public class VentanaCrearDisco extends javax.swing.JInternalFrame {
    private ControladorCantante controladorCantante ;
    private Cantante cantanteTempo;
    private ResourceBundle mensajes;
    /**
     * Creates new form AgregarDisco
     */
    public VentanaCrearDisco(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
    }
    
    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblCodigoAgregarDisco.setText(mensajes.getString("ventana.codigo"));
        jblIdAgregarDisco.setText(mensajes.getString("jblbuuscar.cantante"));
        jblNombreCAgregarDisco.setText(mensajes.getString("ventana.nombre"));
        jblNombreArAgregarDisco.setText(mensajes.getString("ventanaCantante.nombreartistico"));
        jblEdadCAgregarDisco.setText(mensajes.getString("ventana.edad"));
        jblApellidoAAgregarDisco.setText(mensajes.getString("ventana.apellido"));
        jblNombreDiscoAgregarDisco.setText(mensajes.getString("ventana.nombre"));
        jblAnioLanzamientoAgregarDisco.setText(mensajes.getString("ventanaDisco.aniolanzamiento"));
        jblNombreDiiisco.setText(mensajes.getString("jbl.nombrediscooooo"));
        bntBuscar.setText(mensajes.getString("boton.buscar"));
        bntAgregar.setText(mensajes.getString("boton.agregar"));
        bntCancelar.setText(mensajes.getString("boton.cancelar"));
        jPanel1.setBorder(BorderFactory.createTitledBorder(mensajes.getString("panel.agregardisco")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jblIdAgregarDisco = new javax.swing.JLabel();
        txtIdCantante = new javax.swing.JTextField();
        bntBuscar = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        txtNombreArtistico = new javax.swing.JTextField();
        jblApellidoAAgregarDisco = new javax.swing.JLabel();
        jblNombreArAgregarDisco = new javax.swing.JLabel();
        jblNombreCAgregarDisco = new javax.swing.JLabel();
        jblEdadCAgregarDisco = new javax.swing.JLabel();
        jblNombreDiiisco = new javax.swing.JLabel();
        jblCodigoAgregarDisco = new javax.swing.JLabel();
        jblNombreDiscoAgregarDisco = new javax.swing.JLabel();
        jblAnioLanzamientoAgregarDisco = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombreDisco = new javax.swing.JTextField();
        txtAnioLanzamiento = new javax.swing.JTextField();
        bntAgregar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jblIdAgregarDisco.setText("Buscar cantante a agregar disco : ");

        bntBuscar.setText("Buscar");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });

        txtApellido.setEditable(false);
        txtApellido.setEnabled(false);

        txtNombreArtistico.setEditable(false);
        txtNombreArtistico.setEnabled(false);

        jblApellidoAAgregarDisco.setText("Apellido :");

        jblNombreArAgregarDisco.setText("Nombre artistico :");

        jblNombreCAgregarDisco.setText("Nombre : ");

        jblEdadCAgregarDisco.setText("Edad :");

        jblNombreDiiisco.setText("Ingrese el nombre del disco");

        jblCodigoAgregarDisco.setText("Codigo :");

        jblNombreDiscoAgregarDisco.setText("Nombre :");

        jblAnioLanzamientoAgregarDisco.setText("Año de lanzamiento :");

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNombreDisco.setEnabled(false);

        txtAnioLanzamiento.setEnabled(false);
        txtAnioLanzamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioLanzamientoActionPerformed(evt);
            }
        });

        bntAgregar.setText("Agregar");
        bntAgregar.setEnabled(false);
        bntAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgregarActionPerformed(evt);
            }
        });

        bntCancelar.setText("Cancelar");
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        txtNombre.setEditable(false);
        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtEdad.setEditable(false);
        txtEdad.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblNombreCAgregarDisco)
                            .addComponent(jblEdadCAgregarDisco))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblNombreArAgregarDisco)
                            .addComponent(jblApellidoAAgregarDisco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellido)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblNombreDiiisco)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblCodigoAgregarDisco)
                                    .addComponent(jblNombreDiscoAgregarDisco)
                                    .addComponent(jblAnioLanzamientoAgregarDisco))
                                .addGap(91, 91, 91)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo)
                                    .addComponent(txtNombreDisco)
                                    .addComponent(txtAnioLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bntAgregar)
                                    .addComponent(bntCancelar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jblIdAgregarDisco)
                                .addGap(44, 44, 44)
                                .addComponent(txtIdCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(bntBuscar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIdAgregarDisco)
                    .addComponent(txtIdCantante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNombreCAgregarDisco)
                            .addComponent(jblApellidoAAgregarDisco)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblEdadCAgregarDisco)
                            .addComponent(jblNombreArAgregarDisco)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jblNombreDiiisco)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCodigoAgregarDisco)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntCancelar)
                        .addGap(3, 3, 3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNombreDiscoAgregarDisco)
                    .addComponent(txtNombreDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblAnioLanzamientoAgregarDisco)
                            .addComponent(txtAnioLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntAgregar)
                        .addGap(45, 45, 45))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnioLanzamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioLanzamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioLanzamientoActionPerformed

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed
        if (txtIdCantante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.noestalleno"));
        }else{
            cantanteTempo = controladorCantante.buscarCantante(Integer.parseInt(txtIdCantante.getText()));
            if (cantanteTempo!=null) {
                txtIdCantante.setEnabled(false);
                this.mostrarDatos(cantanteTempo);
                bntBuscar.setEnabled(false);
                bntAgregar.setEnabled(true);
                txtNombreDisco.setEnabled(true);
                txtCodigo.setEnabled(true);
                txtAnioLanzamiento.setEnabled(true);
                System.out.println(cantanteTempo.getDiscos().toString());
                
            }else{
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.noexiste"));
            }
        }
    }//GEN-LAST:event_bntBuscarActionPerformed

    private void bntAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAgregarActionPerformed
         if (txtAnioLanzamiento.getText().isEmpty()||txtNombreDisco.getText().isEmpty()||txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.nosehanllenado")); 
        }else{
            int codigo = Integer.parseInt( txtCodigo.getText());
            if (cantanteTempo.buscarDisco(codigo)==null) {
                if (txtNombreDisco.getText().length()>10) {
                    JOptionPane.showMessageDialog(this, "Es muy largo el nombre ");
                }
                else{
                if (codigo!=0) {
                    String nombre =txtNombreDisco.getText();
                    int anio = Integer.parseInt( txtAnioLanzamiento.getText());
                    Disco disco = new Disco(codigo, this.llenarEspacio(nombre), anio);
                List<Disco>listaDiscos = cantanteTempo.getDiscos();
                boolean noEspacio =false;
                System.out.println("Discos vacios "+listaDiscos.toString());
                
                for (int i = 0; i < listaDiscos.size(); i++) {
                    if (listaDiscos.get(i).getCodigo()==0) {
                        System.out.println("Numero de i  : "+i);
                        listaDiscos.set(i, disco);
                        noEspacio= true;
                        break;
                    }
                }
                if (noEspacio) {
                    System.out.println("Lista de discos + "+listaDiscos.toString()+"\n--------------------------------");
                    cantanteTempo.setDiscos(listaDiscos);
                    controladorCantante.actualizar(cantanteTempo);
                    JOptionPane.showMessageDialog(this, mensajes.getString("joption.seacreado")); 
                    txtNombreDisco.setText("");
                    txtCodigo.setText("");
                    txtAnioLanzamiento.setText("");
                    System.out.println(cantanteTempo);
                }else{
                    JOptionPane.showMessageDialog(this, "No existe mas espacio");
                }
                
                
                }else{
                    JOptionPane.showMessageDialog(this, "El codigo debe de ser distinto a cero ");
                }
            }
                
        }else{
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.elid")); 
        }
        }
    }//GEN-LAST:event_bntAgregarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
        this.setVisible(false);
        bntAgregar.setEnabled(false);
        bntBuscar.setEnabled(true);
        txtIdCantante.setEnabled(true);
        txtNombreDisco.setEnabled(false);
        txtAnioLanzamiento.setEnabled(false);
        txtCodigo.setEnabled(false);
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.limpiarCampos();
    }//GEN-LAST:event_formInternalFrameClosing
  public void limpiarCampos(){
        txtIdCantante.setText("");
        txtNombreDisco.setText("");
        txtApellido.setText("");
        txtCodigo.setText("");
        txtEdad.setText("");
        txtNombreArtistico.setText("");
        txtNombreDisco.setText("");
        txtAnioLanzamiento.setText("");
        txtNombre.setText("");
    }
    public void mostrarDatos(Cantante cantante){
        txtIdCantante.setEnabled(false);
        bntBuscar.setEnabled(false);
        txtNombre.setText(cantante.getNombre());
        txtEdad.setText( String.valueOf(cantante.getEdad()));
        txtNombreArtistico.setText(cantante.getNombreArtistico());
        txtApellido.setText(cantante.getApellido());
        
    }
    private String llenarEspacio(String palabra){
        StringBuilder nueva = new StringBuilder(palabra);
        for (int i = palabra.length(); i < 10; i++) {
            nueva.append(" ");
        }
        System.out.println("Espacio del caracter :" + nueva.length());
        return nueva.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAgregar;
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblAnioLanzamientoAgregarDisco;
    private javax.swing.JLabel jblApellidoAAgregarDisco;
    private javax.swing.JLabel jblCodigoAgregarDisco;
    private javax.swing.JLabel jblEdadCAgregarDisco;
    private javax.swing.JLabel jblIdAgregarDisco;
    private javax.swing.JLabel jblNombreArAgregarDisco;
    private javax.swing.JLabel jblNombreCAgregarDisco;
    private javax.swing.JLabel jblNombreDiiisco;
    private javax.swing.JLabel jblNombreDiscoAgregarDisco;
    private javax.swing.JTextField txtAnioLanzamiento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdCantante;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNombreDisco;
    // End of variables declaration//GEN-END:variables
}
