/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Vista.Cantante;
import ec.edu.ups.edu.practica05_interface.test.controlador.ControladorCantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Disco;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class VentanaCrearCantante extends javax.swing.JInternalFrame {
    private ControladorCantante controladorCantante;
    private ResourceBundle mensajes;
    /**
     * Creates new form VentanaCrearCantante
     */
    public VentanaCrearCantante(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
    }

    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblIdCrearCantante.setText(mensajes.getString("ventana.id"));
        jblNombreCrearCantante.setText(mensajes.getString("ventana.nombre"));
        jblApellidoCrearCantante.setText(mensajes.getString("ventana.apellido"));
        jblEdadCrearCantante.setText(mensajes.getString("ventana.edad"));
        jblSalarioCrearCantante.setText(mensajes.getString("ventana.salario"));
        jblNacionalidadCrearCantante.setText(mensajes.getString("ventana.nacionalidad"));
        jblGeneroMusicalCrearCantante.setText(mensajes.getString("ventanaCantante.generomusical"));
        jblNumeroConciertosCrearCantante.setText(mensajes.getString("ventanaCantante.numeroconciertos"));
        jblNumeroGirasCrearCantante.setText(mensajes.getString("ventanaCantante.numerogiras"));
        jblNumeroSencillosCrearCantante.setText(mensajes.getString("ventanaCantante.numerosencillos"));
        jblNombreArCrearCantante.setText(mensajes.getString("ventanaCantante.nombreartistico"));
        btnCancelar.setText(mensajes.getString("boton.cancelar"));
        btnCrearCantante.setText(mensajes.getString("boton.aceptar"));
        jpanelAD.setBorder(BorderFactory.createTitledBorder(mensajes.getString("panel.crearcantante")));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jpanelAD = new javax.swing.JPanel();
        jblIdCrearCantante = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jblNombreCrearCantante = new javax.swing.JLabel();
        jblApellidoCrearCantante = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jblEdadCrearCantante = new javax.swing.JLabel();
        jblNacionalidadCrearCantante = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        jblSalarioCrearCantante = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jblNombreArCrearCantante = new javax.swing.JLabel();
        txtNombreArtistico = new javax.swing.JTextField();
        jblGeneroMusicalCrearCantante = new javax.swing.JLabel();
        cbxGeneroMusical = new javax.swing.JComboBox<>();
        jblNumeroSencillosCrearCantante = new javax.swing.JLabel();
        txtNumeroSencillos = new javax.swing.JTextField();
        jblNumeroConciertosCrearCantante = new javax.swing.JLabel();
        txtNumeroConciertos = new javax.swing.JTextField();
        txtNumeroGiras = new javax.swing.JTextField();
        jblNumeroGirasCrearCantante = new javax.swing.JLabel();
        btnCrearCantante = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
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

        jpanelAD.setBackground(new java.awt.Color(0, 153, 153));

        jblIdCrearCantante.setText("Codigo:");

        jblNombreCrearCantante.setText("Nombre:");

        jblApellidoCrearCantante.setText("Apellido:");

        jblEdadCrearCantante.setText("Edad:");

        jblNacionalidadCrearCantante.setText("Nacionalidad:");

        jblSalarioCrearCantante.setText("Salario:");

        jblNombreArCrearCantante.setText("Nombre Artistico:");

        jblGeneroMusicalCrearCantante.setText("Genero Musical:");

        cbxGeneroMusical.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione el Género Musical-", "Reggaeton", "Trap", "Pop", "Rap", "Rock", "Bachata", "Cumbia", "Salsa", "Otro" }));
        cbxGeneroMusical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGeneroMusicalActionPerformed(evt);
            }
        });

        jblNumeroSencillosCrearCantante.setText("Numero de Sencillos:");

        jblNumeroConciertosCrearCantante.setText("Numero de Conciertos:");

        jblNumeroGirasCrearCantante.setText("Numero de Giras:");

        btnCrearCantante.setText("Aceptar");
        btnCrearCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCantanteActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelADLayout = new javax.swing.GroupLayout(jpanelAD);
        jpanelAD.setLayout(jpanelADLayout);
        jpanelADLayout.setHorizontalGroup(
            jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelADLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jblIdCrearCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addComponent(jblNombreCrearCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addComponent(jblApellidoCrearCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addComponent(jblEdadCrearCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addComponent(jblNacionalidadCrearCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addComponent(jblSalarioCrearCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addComponent(jblNombreArCrearCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addComponent(jblGeneroMusicalCrearCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(cbxGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addComponent(jblNumeroSencillosCrearCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(txtNumeroSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addComponent(jblNumeroConciertosCrearCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(txtNumeroConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addComponent(jblNumeroGirasCrearCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(txtNumeroGiras, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnCrearCantante)
                        .addGap(88, 88, 88)
                        .addComponent(btnCancelar)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jpanelADLayout.setVerticalGroup(
            jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelADLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jblIdCrearCantante))
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblNombreCrearCantante)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblApellidoCrearCantante)
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jblEdadCrearCantante))
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jblNacionalidadCrearCantante))
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jblSalarioCrearCantante))
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblNombreArCrearCantante)
                    .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblGeneroMusicalCrearCantante)
                    .addComponent(cbxGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jblNumeroSencillosCrearCantante))
                    .addComponent(txtNumeroSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jblNumeroConciertosCrearCantante))
                    .addComponent(txtNumeroConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelADLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jblNumeroGirasCrearCantante))
                    .addComponent(txtNumeroGiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jpanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearCantante)
                    .addComponent(btnCancelar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.limpiarCampos();
    }//GEN-LAST:event_formInternalFrameClosing

    private void cbxGeneroMusicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGeneroMusicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxGeneroMusicalActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCrearCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCantanteActionPerformed
 if (this.validacionDeCampos()) {
            int id = Integer.parseInt(txtID.getText());
            if(controladorCantante.buscarCantante(id)==null) {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                int edad = Integer.parseInt(txtEdad.getText());
                String nacionalidad = txtNacionalidad.getText();
                double salario = Double.parseDouble(txtSalario.getText());
                String nombreArtistico = txtNombreArtistico.getText();
                String genero = cbxGeneroMusical.getSelectedItem().toString(); 
                int numeroSencillos = Integer.parseInt(txtNumeroSencillos.getText());
                int numeroConciertos = Integer.parseInt(txtNumeroConciertos.getText());
                int numeroGiras = Integer.parseInt(txtNumeroGiras.getText());
                if (genero==cbxGeneroMusical.getItemAt(0)) {                    
                    JOptionPane.showMessageDialog(this,"Cambie el genero musical" );
                }else{
                    if (nombre.length()>25 || apellido.length()>25||nacionalidad.length()>25) {
                        JOptionPane.showMessageDialog(this, "El nombre o apellido es muy largo debe ser menor a 25");
                    }else{
                        Cantante cantante = new Cantante(llenarEspacio(nombreArtistico), llenarEspacio(genero), numeroSencillos, numeroConciertos, numeroGiras, id, llenarEspacio(nombre), llenarEspacio(apellido), edad, llenarEspacio(nacionalidad), salario);
                        this.agregarDiscosVacios(cantante);
                        controladorCantante.registrar(cantante); 
                        this.limpiarCampos();
                        JOptionPane.showMessageDialog(this, mensajes.getString("joption.secreocantante")); 
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.elid")); 
            }
        }else{
            JOptionPane.showMessageDialog(this,mensajes.getString("joption.nosehanllenado")); 
        }
    }//GEN-LAST:event_btnCrearCantanteActionPerformed
   private boolean validacionDeCampos(){
        if (txtID.getText().isEmpty()||txtNombre.getText().isEmpty()||txtApellido.getText().isEmpty()||txtEdad.getText().isEmpty()||txtNacionalidad.getText().isEmpty()
                || txtSalario.getText().isEmpty()||txtNombreArtistico.getText().isEmpty() ||txtNumeroSencillos.getText().isEmpty()
                ||txtNumeroConciertos.getText().isEmpty()||txtNumeroGiras.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private void limpiarCampos(){
        txtID.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtSalario.setText("");
        txtNombreArtistico.setText("");
        txtNumeroConciertos.setText("");
        txtNumeroSencillos.setText("");
        txtNumeroGiras.setText("");
        cbxGeneroMusical.setSelectedIndex(0); 
    }
    
    private String llenarEspacio(String palabra){
        StringBuilder nueva = new StringBuilder(palabra);
        for (int i = palabra.length(); i < 25; i++) {
            nueva.append(" ");
        }
        System.out.println("Espacio del caracter :" + nueva.length());
        return nueva.toString();
        //f
    }
    public void agregarDiscosVacios(Cantante can){
        for (int i = 0; i < 10; i++) {
            int codigo = 0;
            String nombre = "          ";
            int fecha = 0;
            Disco disco = new Disco(codigo, nombre,fecha);
            can.agregarDisco(disco);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearCantante;
    private javax.swing.JComboBox<String> cbxGeneroMusical;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jblApellidoCrearCantante;
    private javax.swing.JLabel jblEdadCrearCantante;
    private javax.swing.JLabel jblGeneroMusicalCrearCantante;
    private javax.swing.JLabel jblIdCrearCantante;
    private javax.swing.JLabel jblNacionalidadCrearCantante;
    private javax.swing.JLabel jblNombreArCrearCantante;
    private javax.swing.JLabel jblNombreCrearCantante;
    private javax.swing.JLabel jblNumeroConciertosCrearCantante;
    private javax.swing.JLabel jblNumeroGirasCrearCantante;
    private javax.swing.JLabel jblNumeroSencillosCrearCantante;
    private javax.swing.JLabel jblSalarioCrearCantante;
    private javax.swing.JPanel jpanelAD;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNumeroConciertos;
    private javax.swing.JTextField txtNumeroGiras;
    private javax.swing.JTextField txtNumeroSencillos;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
