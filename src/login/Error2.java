/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author Gabriel Cabrera
 */
public class Error2 extends javax.swing.JDialog {
        int xMouse,yMouse;
        Registro registro=new Registro();
    /**
     * Creates new form Error
     */
    public Error2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        todoelpanel = new javax.swing.JPanel();
        BotonSalir = new javax.swing.JPanel();
        imagenX = new javax.swing.JLabel();
        barritadearriba = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        botonaceptar = new javax.swing.JPanel();
        botonAceptartexto = new javax.swing.JLabel();
        escritura2 = new javax.swing.JLabel();
        escritura1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        todoelpanel.setBackground(new java.awt.Color(66, 72, 96));
        todoelpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setBackground(new java.awt.Color(215, 81, 81));
        BotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonSalirMouseExited(evt);
            }
        });

        imagenX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/imagenes/icons8_Delete_17px.png"))); // NOI18N

        javax.swing.GroupLayout BotonSalirLayout = new javax.swing.GroupLayout(BotonSalir);
        BotonSalir.setLayout(BotonSalirLayout);
        BotonSalirLayout.setHorizontalGroup(
            BotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagenX, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );
        BotonSalirLayout.setVerticalGroup(
            BotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagenX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        todoelpanel.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        barritadearriba.setBackground(new java.awt.Color(215, 81, 81));
        barritadearriba.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barritadearribaMouseDragged(evt);
            }
        });
        barritadearriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barritadearribaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barritadearribaLayout = new javax.swing.GroupLayout(barritadearriba);
        barritadearriba.setLayout(barritadearribaLayout);
        barritadearribaLayout.setHorizontalGroup(
            barritadearribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        barritadearribaLayout.setVerticalGroup(
            barritadearribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        todoelpanel.add(barritadearriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 10));

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Errores/imagenes/icons8_No_Phones_55px.png"))); // NOI18N
        todoelpanel.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, 60));

        botonaceptar.setBackground(new java.awt.Color(215, 81, 81));
        botonaceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonAceptartexto.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        botonAceptartexto.setForeground(new java.awt.Color(255, 255, 255));
        botonAceptartexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonAceptartexto.setText("Aceptar");
        botonAceptartexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 51, 51)));
        botonAceptartexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAceptartextoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAceptartextoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAceptartextoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout botonaceptarLayout = new javax.swing.GroupLayout(botonaceptar);
        botonaceptar.setLayout(botonaceptarLayout);
        botonaceptarLayout.setHorizontalGroup(
            botonaceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAceptartexto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        botonaceptarLayout.setVerticalGroup(
            botonaceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAceptartexto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        todoelpanel.add(botonaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, 30));

        escritura2.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        escritura2.setForeground(new java.awt.Color(255, 255, 255));
        escritura2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        todoelpanel.add(escritura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 200, 20));

        escritura1.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        escritura1.setForeground(new java.awt.Color(255, 255, 255));
        escritura1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        escritura1.setText("No ha ingresado un teléfono válido");
        todoelpanel.add(escritura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 200, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(todoelpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(todoelpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        this.dispose();        // salir al clickear
        Registro registro=new Registro();
        registro.setEnabled(true);
    }//GEN-LAST:event_BotonSalirMouseClicked

    private void BotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseEntered
        BotonSalir.setBackground(new java.awt.Color(222,114,114)); //brillo del boton de salir al tocar mouse
    }//GEN-LAST:event_BotonSalirMouseEntered

    private void BotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseExited
        BotonSalir.setBackground(new java.awt.Color(215,81,81));       // se va el brillo cuando se va el mouse
    }//GEN-LAST:event_BotonSalirMouseExited

    private void barritadearribaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barritadearribaMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();               //crea una variable para usar luego en el mouse con los valores de X
        int y=evt.getYOnScreen();               //crea una variable para usar luego en el mouse con los valores Y
        this.setLocation(x-xMouse, y-yMouse);   /*a los valores anteriores que estaban basados en 0,0, se les resta los valores
        calculados debajo para así al mover, se mueva la ventana desde la posición del mouse
        */
    }//GEN-LAST:event_barritadearribaMouseDragged

    private void barritadearribaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barritadearribaMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX(); //tomar posicion X y enviarlo a xMouse
        yMouse=evt.getY();  //tomar posicion Y y enviarlo a yMouse
    }//GEN-LAST:event_barritadearribaMousePressed

    private void botonAceptartextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptartextoMouseClicked
        this.dispose();
        registro.setEnabled(true);
    }//GEN-LAST:event_botonAceptartextoMouseClicked

    private void botonAceptartextoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptartextoMouseEntered
        botonaceptar.setBackground(new java.awt.Color(222,114,114));
    }//GEN-LAST:event_botonAceptartextoMouseEntered

    private void botonAceptartextoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptartextoMouseExited
        botonaceptar.setBackground(new java.awt.Color(215,81,81));
    }//GEN-LAST:event_botonAceptartextoMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Error2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Error2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Error2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Error2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Error2 dialog = new Error2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonSalir;
    private javax.swing.JPanel barritadearriba;
    private javax.swing.JLabel botonAceptartexto;
    private javax.swing.JPanel botonaceptar;
    private javax.swing.JLabel escritura1;
    private javax.swing.JLabel escritura2;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel imagenX;
    private javax.swing.JPanel todoelpanel;
    // End of variables declaration//GEN-END:variables
}
