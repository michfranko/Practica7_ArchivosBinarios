/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Vista.Compositor;

import ec.edu.ups.edu.practica05_interface.test.controlador.ControladorCompositor;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Usuario
 */
public class VentanaActualizarCompositor extends javax.swing.JInternalFrame {
    private ControladorCompositor controladorCompositor;
    private ResourceBundle mensajes;
    /**
     * Creates new form ActualizarCompositor
     */
    public VentanaActualizarCompositor(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
    }

    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblIdActualizarCompositor.setText(mensajes.getString("ventana.id"));
        jblNombreActualizarCompositor.setText(mensajes.getString("ventana.nombre"));
        jblApellidoActualizarCompositor.setText(mensajes.getString("ventana.apellido"));
        jblEdadActualizarCompositor.setText(mensajes.getString("ventana.edad"));
        jblSalarioActualizarCompositor.setText(mensajes.getString("ventana.salario"));
        jblNacionalidadActualizarCompositor.setText(mensajes.getString("ventana.nacionalidad"));
        jblNumeroComposiciones.setText(mensajes.getString("ventanaCompositor.numerocomposiciones"));
        btnAceptar.setText(mensajes.getString("boton.buscar"));
        btnActualizarCompositor.setText(mensajes.getString("boton.actualizar"));
        btnCancelar.setText(mensajes.getString("boton.cancelar"));
        Border borde = BorderFactory.createTitledBorder(mensajes.getString("panel.actualizarcompositor"));
        jpanelA.setBorder(borde);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jpanelA = new javax.swing.JPanel();
        jblIdActualizarCompositor = new javax.swing.JLabel();
        jblNombreActualizarCompositor = new javax.swing.JLabel();
        jblApellidoActualizarCompositor = new javax.swing.JLabel();
        jblEdadActualizarCompositor = new javax.swing.JLabel();
        jblNacionalidadActualizarCompositor = new javax.swing.JLabel();
        jblSalarioActualizarCompositor = new javax.swing.JLabel();
        jblNumeroComposiciones = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNumeroComposiciones = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnActualizarCompositor = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
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

        jpanelA.setBackground(new java.awt.Color(0, 153, 153));
        jpanelA.setBorder(javax.swing.BorderFactory.createTitledBorder("ACTUALIZAR COMPOSITOR"));
        jpanelA.setLayout(null);

        jblIdActualizarCompositor.setText("Codigo:");
        jpanelA.add(jblIdActualizarCompositor);
        jblIdActualizarCompositor.setBounds(60, 38, 80, 16);

        jblNombreActualizarCompositor.setText("Nombre:");
        jpanelA.add(jblNombreActualizarCompositor);
        jblNombreActualizarCompositor.setBounds(60, 67, 47, 16);

        jblApellidoActualizarCompositor.setText("Apellido:");
        jpanelA.add(jblApellidoActualizarCompositor);
        jblApellidoActualizarCompositor.setBounds(60, 101, 47, 16);

        jblEdadActualizarCompositor.setText("Edad:");
        jpanelA.add(jblEdadActualizarCompositor);
        jblEdadActualizarCompositor.setBounds(60, 135, 29, 16);

        jblNacionalidadActualizarCompositor.setText("Nacionalidad:");
        jpanelA.add(jblNacionalidadActualizarCompositor);
        jblNacionalidadActualizarCompositor.setBounds(60, 169, 73, 16);

        jblSalarioActualizarCompositor.setText("Salario:");
        jpanelA.add(jblSalarioActualizarCompositor);
        jblSalarioActualizarCompositor.setBounds(60, 209, 38, 16);

        jblNumeroComposiciones.setText("Numero de Composiciones:");
        jpanelA.add(jblNumeroComposiciones);
        jblNumeroComposiciones.setBounds(60, 243, 148, 16);

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jpanelA.add(txtId);
        txtId.setBounds(212, 35, 131, 22);

        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jpanelA.add(txtNombre);
        txtNombre.setBounds(212, 64, 131, 22);

        txtApellido.setEnabled(false);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jpanelA.add(txtApellido);
        txtApellido.setBounds(212, 98, 131, 22);

        txtEdad.setEnabled(false);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        jpanelA.add(txtEdad);
        txtEdad.setBounds(212, 132, 131, 22);

        txtNacionalidad.setEnabled(false);
        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });
        jpanelA.add(txtNacionalidad);
        txtNacionalidad.setBounds(212, 166, 131, 22);

        txtSalario.setEnabled(false);
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });
        jpanelA.add(txtSalario);
        txtSalario.setBounds(212, 206, 131, 22);

        txtNumeroComposiciones.setEnabled(false);
        txtNumeroComposiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroComposicionesActionPerformed(evt);
            }
        });
        jpanelA.add(txtNumeroComposiciones);
        txtNumeroComposiciones.setBounds(214, 240, 131, 22);

        btnAceptar.setText("Buscar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jpanelA.add(btnAceptar);
        btnAceptar.setBounds(370, 35, 72, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jpanelA.add(btnCancelar);
        btnCancelar.setBounds(260, 300, 110, 23);

        btnActualizarCompositor.setText("Actualizar");
        btnActualizarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCompositorActionPerformed(evt);
            }
        });
        jpanelA.add(btnActualizarCompositor);
        btnActualizarCompositor.setBounds(122, 300, 120, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelA, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelA, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtNumeroComposicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroComposicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroComposicionesActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.noestalleno")); 
        }else{
            Compositor compositorTempo = controladorCompositor.buscarCompositor(Integer.parseInt(txtId.getText()));
            if (compositorTempo !=null) {
                this.visibilidad(true); 
                txtNombre.setText(compositorTempo.getNombre());
                txtApellido.setText(compositorTempo.getApellido());
                txtEdad.setText( String.valueOf(compositorTempo.getEdad()));
                txtNacionalidad.setText(compositorTempo.getNacionalidad());
                txtNacionalidad.setText(compositorTempo.getNacionalidad());
                txtSalario.setText(String.valueOf(compositorTempo.calcularSalario()));
                txtNumeroComposiciones.setText(String.valueOf(compositorTempo.getNumeroDeComposiciones()));

            }else{
                this.limpiarCampos();
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.noexiste")); 

            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtId.setText("");
        this.limpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCompositorActionPerformed

        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String nacionalidad = txtNacionalidad.getText();
        double salario = Double.parseDouble(txtSalario.getText());
        int numeroComposiciones = Integer.parseInt(txtNumeroComposiciones.getText());
        if (nombre.length()>25 || apellido.length()>25||nacionalidad.length()>25) {
            JOptionPane.showMessageDialog(this, "El nombre ,apellido o apellido es muy largo debe ser menor a 25");
        }else{
            Compositor compositorAc = new Compositor(numeroComposiciones, id, llenarEspacio(nombre), llenarEspacio(apellido), edad, llenarEspacio(nacionalidad), salario);
            //cantante.setDiscos(listaDiscos);
            controladorCompositor.actualizarCompositor(compositorAc);
            this.limpiarCampos();
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.actualizocompositro")); 
            System.out.println(controladorCompositor.verCompositores());
            this.visibilidad(false);
            btnActualizarCompositor.setEnabled(false);
            this.limpiarCampos();
            btnAceptar.setEnabled(true);
        }
        
    }//GEN-LAST:event_btnActualizarCompositorActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.limpiarCampos();
    }//GEN-LAST:event_formInternalFrameClosing

    
    private String llenarEspacio(String palabra){
        StringBuilder nueva = new StringBuilder(palabra);
        for (int i = palabra.length(); i < 25; i++) {
            nueva.append(" ");
        }
        System.out.println("Espacio del caracter :" + nueva.length());
        return nueva.toString();
    }
    
    private void limpiarCampos(){
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtSalario.setText("");
        txtNumeroComposiciones.setText("");
    }
    
    private void visibilidad(boolean variable){
        
        txtId.setEnabled(!variable);
        txtNombre.setEnabled(variable);
        txtApellido.setEnabled(variable);
        txtEdad.setEnabled(variable);
        txtNacionalidad.setEnabled(variable);
        txtSalario.setEnabled(variable);
        txtNumeroComposiciones.setEnabled(variable);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActualizarCompositor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jblApellidoActualizarCompositor;
    private javax.swing.JLabel jblEdadActualizarCompositor;
    private javax.swing.JLabel jblIdActualizarCompositor;
    private javax.swing.JLabel jblNacionalidadActualizarCompositor;
    private javax.swing.JLabel jblNombreActualizarCompositor;
    private javax.swing.JLabel jblNumeroComposiciones;
    private javax.swing.JLabel jblSalarioActualizarCompositor;
    private javax.swing.JPanel jpanelA;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroComposiciones;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
