/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Vista.Cancion;
import ec.edu.ups.edu.practica05_interface.test.controlador.ControladorCompositor;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cancion;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Usuario
 */
public class VentanaEliminarCancion extends javax.swing.JInternalFrame {
    private ControladorCompositor controladorCompositor;
    private ResourceBundle mensajes;
    
    /**
     * Creates new form EliminarCancion
     */
    public VentanaEliminarCancion(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
    }

    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblCodigoEliminarCancion.setText(mensajes.getString("ventana.codigo"));
        jblTituloEliminarCancion.setText(mensajes.getString("ventanaCancion.titulo"));
        jblLetraEliminarCancion.setText(mensajes.getString("ventanaCancion.letra"));
        jblDuracionCancion.setText(mensajes.getString("ventanaCancion.duracioncancion"));
        jblIdEliminarCancion.setText(mensajes.getString("ventana.codigo"));
        jblNombreEliminarCancion.setText(mensajes.getString("ventana.nombre"));
        jblApellidoEliminarCancion.setText(mensajes.getString("ventana.apellido"));
        jblEdadEliminarCancion.setText(mensajes.getString("ventana.edad"));
        jblNacionalidadEliminarCancion.setText(mensajes.getString("ventana.nacionalidad"));
        jblSalarioEliminarCancion.setText(mensajes.getString("ventana.salario"));
        jblNumeroComposicionesEliminarCancion.setText(mensajes.getString("ventanaCompositor.numerocomposiciones"));
        btnAceptar.setText(mensajes.getString("boton.buscar"));
        btnCancelar.setText(mensajes.getString("boton.cancelar"));
        btnEliminarCancion.setText(mensajes.getString("boton.eliminar"));
        Border borde = BorderFactory.createTitledBorder(mensajes.getString("panel.eliminarcancion"));
        jpanelA.setBorder(borde);
        Border bordea = BorderFactory.createTitledBorder(mensajes.getString("panel.buscarcompositor"));
        jpanelB.setBorder(bordea);
        Border bordeb = BorderFactory.createTitledBorder(mensajes.getString("panel.buscarcancion"));
        jpanelC.setBorder(bordeb);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelA = new javax.swing.JPanel();
        jpanelB = new javax.swing.JPanel();
        jblIdEliminarCancion = new javax.swing.JLabel();
        jblNombreEliminarCancion = new javax.swing.JLabel();
        jblApellidoEliminarCancion = new javax.swing.JLabel();
        jblEdadEliminarCancion = new javax.swing.JLabel();
        jblNacionalidadEliminarCancion = new javax.swing.JLabel();
        jblSalarioEliminarCancion = new javax.swing.JLabel();
        jblNumeroComposicionesEliminarCancion = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNumeroComposiciones = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        BtnAceptar = new javax.swing.JButton();
        btnEliminarCancion = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jpanelC = new javax.swing.JPanel();
        jblCodigoEliminarCancion = new javax.swing.JLabel();
        jblTituloEliminarCancion = new javax.swing.JLabel();
        jblLetraEliminarCancion = new javax.swing.JLabel();
        jblDuracionCancion = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtLetra = new javax.swing.JTextField();
        txtDuracionCancion = new javax.swing.JTextField();
        cbxCancion = new javax.swing.JComboBox<>();

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

        jpanelA.setBackground(new java.awt.Color(0, 153, 153));
        jpanelA.setBorder(javax.swing.BorderFactory.createTitledBorder("ELIMINAR CANCION"));

        jpanelB.setBackground(new java.awt.Color(0, 153, 153));
        jpanelB.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR COMPOSITOR"));

        jblIdEliminarCancion.setText("Codigo:");

        jblNombreEliminarCancion.setText("Nombre:");

        jblApellidoEliminarCancion.setText("Apellido:");

        jblEdadEliminarCancion.setText("Edad:");

        jblNacionalidadEliminarCancion.setText("Nacionalidad:");

        jblSalarioEliminarCancion.setText("Salario:");

        jblNumeroComposicionesEliminarCancion.setText("Numero de Composiciones:");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNombre.setEditable(false);
        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.setEditable(false);
        txtApellido.setEnabled(false);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtEdad.setEditable(false);
        txtEdad.setEnabled(false);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        txtNacionalidad.setEditable(false);
        txtNacionalidad.setEnabled(false);
        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });

        txtSalario.setEditable(false);
        txtSalario.setEnabled(false);
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        txtNumeroComposiciones.setEditable(false);
        txtNumeroComposiciones.setEnabled(false);
        txtNumeroComposiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroComposicionesActionPerformed(evt);
            }
        });

        btnAceptar.setText("Buscar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        BtnAceptar.setBackground(new java.awt.Color(255, 204, 102));
        BtnAceptar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnAceptar.setText("Aceptar");
        BtnAceptar.setEnabled(false);
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelBLayout = new javax.swing.GroupLayout(jpanelB);
        jpanelB.setLayout(jpanelBLayout);
        jpanelBLayout.setHorizontalGroup(
            jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelBLayout.createSequentialGroup()
                        .addComponent(jblNumeroComposicionesEliminarCancion)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelBLayout.createSequentialGroup()
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpanelBLayout.createSequentialGroup()
                                .addComponent(jblNacionalidadEliminarCancion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelBLayout.createSequentialGroup()
                                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblIdEliminarCancion)
                                    .addComponent(jblNombreEliminarCancion)
                                    .addComponent(jblSalarioEliminarCancion))
                                .addGap(107, 107, 107)
                                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelBLayout.createSequentialGroup()
                                .addComponent(jblApellidoEliminarCancion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelBLayout.createSequentialGroup()
                                .addComponent(jblEdadEliminarCancion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptar)
                            .addComponent(BtnAceptar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelBLayout.setVerticalGroup(
            jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIdEliminarCancion)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelBLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNombreEliminarCancion)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblApellidoEliminarCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jpanelBLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(BtnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblEdadEliminarCancion)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNacionalidadEliminarCancion)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNumeroComposicionesEliminarCancion)
                    .addComponent(txtNumeroComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblSalarioEliminarCancion)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        btnEliminarCancion.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarCancion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEliminarCancion.setText("Eliminar");
        btnEliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCancionActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jpanelC.setBackground(new java.awt.Color(0, 153, 153));
        jpanelC.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR CANCION"));

        jblCodigoEliminarCancion.setText("Codigo:");

        jblTituloEliminarCancion.setText("Titulo:");

        jblLetraEliminarCancion.setText("Letra:");

        jblDuracionCancion.setText("Duración de la Canción: ");

        txtTitulo.setEditable(false);
        txtTitulo.setEnabled(false);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        txtLetra.setEditable(false);
        txtLetra.setEnabled(false);
        txtLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLetraActionPerformed(evt);
            }
        });

        txtDuracionCancion.setEditable(false);
        txtDuracionCancion.setEnabled(false);
        txtDuracionCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionCancionActionPerformed(evt);
            }
        });

        cbxCancion.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        cbxCancion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canciones" }));
        cbxCancion.setEnabled(false);
        cbxCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCancionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelCLayout = new javax.swing.GroupLayout(jpanelC);
        jpanelC.setLayout(jpanelCLayout);
        jpanelCLayout.setHorizontalGroup(
            jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelCLayout.createSequentialGroup()
                        .addComponent(jblTituloEliminarCancion)
                        .addGap(27, 27, 27)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelCLayout.createSequentialGroup()
                        .addComponent(jblCodigoEliminarCancion)
                        .addGap(18, 18, 18)
                        .addComponent(cbxCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelCLayout.createSequentialGroup()
                        .addComponent(jblLetraEliminarCancion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelCLayout.createSequentialGroup()
                        .addComponent(jblDuracionCancion)
                        .addGap(18, 18, 18)
                        .addComponent(txtDuracionCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jpanelCLayout.setVerticalGroup(
            jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCLayout.createSequentialGroup()
                .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelCLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCodigoEliminarCancion)
                            .addComponent(jblLetraEliminarCancion)
                            .addComponent(cbxCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelCLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelCLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblTituloEliminarCancion)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpanelCLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblDuracionCancion)
                            .addComponent(txtDuracionCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanelALayout = new javax.swing.GroupLayout(jpanelA);
        jpanelA.setLayout(jpanelALayout);
        jpanelALayout.setHorizontalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnEliminarCancion)
                .addGap(119, 119, 119)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jpanelC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanelALayout.setVerticalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarCancion)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

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
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.noestalleno")); 
        }else{
            Compositor compositorTempo = controladorCompositor.buscarCompositor(Integer.parseInt(txtCodigo.getText()));
            if (compositorTempo !=null) {
                txtNombre.setText(compositorTempo.getNombre());
                txtApellido.setText(compositorTempo.getApellido());
                txtEdad.setText( String.valueOf(compositorTempo.getEdad()));
                txtNacionalidad.setText(compositorTempo.getNacionalidad());
                txtNacionalidad.setText(compositorTempo.getNacionalidad());
                txtSalario.setText(String.valueOf(compositorTempo.calcularSalario()));
                txtNumeroComposiciones.setText(String.valueOf(compositorTempo.getNumeroDeComposiciones()));
                BtnAceptar.setEnabled(true);
            }else{
                this.limpiarCampos();
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.noexiste")); 
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLetraActionPerformed

    private void txtDuracionCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracionCancionActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiarCamposCancion();
        this.limpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCancionActionPerformed
        
        int respuesta=JOptionPane.showConfirmDialog(this, mensajes.getString("joption.eliminarcancion")); 
        if (respuesta==JOptionPane.YES_OPTION) {
            DefaultComboBoxModel<Cancion> modelo = (DefaultComboBoxModel) cbxCancion.getModel();
             Cancion cancion = (Cancion) modelo.getSelectedItem();
            int codigo = cancion.getCodigo();
            controladorCompositor.eliminarCancion(controladorCompositor.buscarCompositor(Integer.parseInt(txtCodigo.getText())), codigo); 
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.seeliminolacancion")); 
            this.limpiarCamposCancion();
            this.limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.noseeliminolacancion")); 
        }
    }//GEN-LAST:event_btnEliminarCancionActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.limpiarCampos();
        this.limpiarCamposCancion();
    }//GEN-LAST:event_formInternalFrameClosing

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigoIngresado = Integer.parseInt(txtCodigo.getText());
            Compositor compositor = controladorCompositor.buscarCompositor(codigoIngresado);

            if (compositor != null) {
                if (compositor.getNombre().equals(txtNombre.getText()) && compositor.getApellido().equals(txtApellido.getText())) {
                    txtCodigo.setEnabled(false);
                    BtnAceptar.setEnabled(false);
                    cbxCancion.setEnabled(true);
                    cargarDatosCombo();

                }
            }
        }
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void cbxCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCancionActionPerformed
        if (cbxCancion.getSelectedItem() != null) {
            Cancion cancion = (Cancion) cbxCancion.getSelectedItem();
            txtLetra.setText(cancion.getLetra());
            txtTitulo.setText(cancion.getTitulo());
            txtDuracionCancion.setText(String.valueOf(cancion.getTiempoEnMinutos()));
        }
    }//GEN-LAST:event_cbxCancionActionPerformed

    
    private void limpiarCampos(){
        txtCodigo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtSalario.setText("");
        txtNumeroComposiciones.setText("");
    }
    
    private void limpiarCamposCancion(){
        txtDuracionCancion.setText("");
        txtLetra.setText("");
        txtTitulo.setText("");
    }
    
  private void cargarDatosCombo() {
        DefaultComboBoxModel<Cancion> modelo = (DefaultComboBoxModel) cbxCancion.getModel();
        Compositor compositor = this.controladorCompositor.buscarCompositor(Integer.parseInt(txtCodigo.getText()));
        modelo.removeAllElements();
        List<Cancion> listaCanciones = compositor.listaCanciones();

        for (Cancion cancion : listaCanciones) {
            modelo.addElement(cancion);
        }
        Cancion cancion = (Cancion) modelo.getSelectedItem();
        txtTitulo.setText(cancion.getTitulo());
        txtLetra.setText(cancion.getLetra());
        txtDuracionCancion.setText(String.valueOf(cancion.getTiempoEnMinutos()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarCancion;
    private javax.swing.JComboBox<String> cbxCancion;
    private javax.swing.JLabel jblApellidoEliminarCancion;
    private javax.swing.JLabel jblCodigoEliminarCancion;
    private javax.swing.JLabel jblDuracionCancion;
    private javax.swing.JLabel jblEdadEliminarCancion;
    private javax.swing.JLabel jblIdEliminarCancion;
    private javax.swing.JLabel jblLetraEliminarCancion;
    private javax.swing.JLabel jblNacionalidadEliminarCancion;
    private javax.swing.JLabel jblNombreEliminarCancion;
    private javax.swing.JLabel jblNumeroComposicionesEliminarCancion;
    private javax.swing.JLabel jblSalarioEliminarCancion;
    private javax.swing.JLabel jblTituloEliminarCancion;
    private javax.swing.JPanel jpanelA;
    private javax.swing.JPanel jpanelB;
    private javax.swing.JPanel jpanelC;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDuracionCancion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtLetra;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroComposiciones;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
