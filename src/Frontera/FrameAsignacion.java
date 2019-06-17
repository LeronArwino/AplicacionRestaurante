package Frontera;

import javax.swing.JOptionPane;

public class FrameAsignacion extends javax.swing.JPanel {

    private NuevaAsignacion nueva = new NuevaAsignacion();
    private VerAsignacion ver = new VerAsignacion();
    public Dialogo dialogo = new Dialogo(null, true);
    private DialogoOK dialogoOk = new DialogoOK(null, true);

    public FrameAsignacion() {
        initComponents();
        inicioAsignacion();
    }

    public void inicioAsignacion() {
        principalAsignacion.setVisible(false);
        principalAsignacion.removeAll();
        principalAsignacion.add(inicioAsignacion);
        principalAsignacion.setVisible(true);
        back.setVisible(false);
    }

    public void validarInicioAsignacion() {
        if (nueva.validarCampos()) {
            dialogo.textoLabel("¿Desea volver atrás?");
            int selCon = dialogo.visible();
            if (selCon == 1) {
                principalAsignacion.setVisible(false);
                principalAsignacion.removeAll();
                principalAsignacion.add(inicioAsignacion);
                principalAsignacion.setVisible(true);
                back.setVisible(false);
            }
        } else {
            dialogo.textoLabel("¿Desea guardar los datos?");
            int selCon = dialogo.visible();
            if (selCon == 1) {
                System.out.println("Datos guardados");

            }
            if (selCon == 0) {
                principalAsignacion.setVisible(false);
                principalAsignacion.removeAll();
                principalAsignacion.add(inicioAsignacion);
                principalAsignacion.setVisible(true);
                back.setVisible(false);
                nueva.vaciarCampos();
            }
        }
    }

    public void nuevaAsignacion() {
        principalAsignacion.setVisible(false);
        principalAsignacion.removeAll();
        principalAsignacion.add(nueva);
        principalAsignacion.setVisible(true);
        nueva.comboRes();
        nueva.comboPer();
        nueva.nuevoVisible();
        back.setVisible(true);
    }

    public void verAsignacion() {
        principalAsignacion.setVisible(false);
        principalAsignacion.removeAll();
        principalAsignacion.add(ver);
        principalAsignacion.setVisible(true);
        ver.verRestaurante("");
        back.setVisible(true);
        nueva.editarVisible();

    }

    public void editarAsignacion() {
        int temInt = ver.fila();
        if (temInt >= 1) {
            principalAsignacion.setVisible(false);
            principalAsignacion.removeAll();
            principalAsignacion.add(nueva);
            principalAsignacion.setVisible(true);
            editar.setVisible(false);
            nueva.editar(ver.editarAsignacion(), temInt);
            nueva.comboRes();
        } else {
            dialogoOk.textoLabel("Por favor seleccione una fila");
            dialogoOk.visible();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloAsignacion = new javax.swing.JPanel();
        asignacion = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        editar = new javax.swing.JLabel();
        principalAsignacion = new javax.swing.JPanel();
        inicioAsignacion = new javax.swing.JPanel();
        restauranteVerIcon = new javax.swing.JLabel();
        restauranteVerLabel = new javax.swing.JLabel();
        restauranteNuevaLabel = new javax.swing.JLabel();
        restauranteNuevaIcon = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloAsignacion.setBackground(new java.awt.Color(68, 85, 89));
        tituloAsignacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asignacion.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        asignacion.setForeground(new java.awt.Color(164, 186, 191));
        asignacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asignacion.setText("ASIGNACIÓN");
        tituloAsignacion.add(asignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 9, 940, 40));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/log-out.png"))); // NOI18N
        back.setToolTipText("Atrás");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        tituloAsignacion.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        editar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/note.png"))); // NOI18N
        editar.setToolTipText("Editar");
        editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
        });
        tituloAsignacion.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 10, 40, 40));

        add(tituloAsignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 60));

        principalAsignacion.setBackground(new java.awt.Color(19, 38, 35));
        principalAsignacion.setLayout(new java.awt.BorderLayout());

        inicioAsignacion.setBackground(new java.awt.Color(164, 186, 191));

        restauranteVerIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        restauranteVerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/phone-bookB.png"))); // NOI18N
        restauranteVerIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restauranteVerIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restauranteVerIconMouseClicked(evt);
            }
        });

        restauranteVerLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        restauranteVerLabel.setForeground(new java.awt.Color(36, 56, 63));
        restauranteVerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        restauranteVerLabel.setText("VER");
        restauranteVerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restauranteVerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restauranteVerLabelMouseClicked(evt);
            }
        });

        restauranteNuevaLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        restauranteNuevaLabel.setForeground(new java.awt.Color(36, 56, 63));
        restauranteNuevaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        restauranteNuevaLabel.setText("CREAR");
        restauranteNuevaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restauranteNuevaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restauranteNuevaLabelMouseClicked(evt);
            }
        });

        restauranteNuevaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        restauranteNuevaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/support-ticketB.png"))); // NOI18N
        restauranteNuevaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restauranteNuevaIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restauranteNuevaIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inicioAsignacionLayout = new javax.swing.GroupLayout(inicioAsignacion);
        inicioAsignacion.setLayout(inicioAsignacionLayout);
        inicioAsignacionLayout.setHorizontalGroup(
            inicioAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioAsignacionLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(inicioAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioAsignacionLayout.createSequentialGroup()
                        .addComponent(restauranteNuevaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addComponent(restauranteVerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inicioAsignacionLayout.createSequentialGroup()
                        .addComponent(restauranteNuevaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addComponent(restauranteVerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        inicioAsignacionLayout.setVerticalGroup(
            inicioAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioAsignacionLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(inicioAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restauranteNuevaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restauranteVerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(inicioAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restauranteNuevaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restauranteVerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        principalAsignacion.add(inicioAsignacion, java.awt.BorderLayout.CENTER);

        add(principalAsignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1080, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        validarInicioAsignacion();
    }//GEN-LAST:event_backMouseClicked

    private void restauranteNuevaIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restauranteNuevaIconMouseClicked
        nuevaAsignacion();
    }//GEN-LAST:event_restauranteNuevaIconMouseClicked

    private void restauranteNuevaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restauranteNuevaLabelMouseClicked
        nuevaAsignacion();
    }//GEN-LAST:event_restauranteNuevaLabelMouseClicked

    private void restauranteVerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restauranteVerIconMouseClicked
        verAsignacion();
    }//GEN-LAST:event_restauranteVerIconMouseClicked

    private void restauranteVerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restauranteVerLabelMouseClicked
        verAsignacion();
    }//GEN-LAST:event_restauranteVerLabelMouseClicked

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked
        editarAsignacion();
    }//GEN-LAST:event_editarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asignacion;
    private javax.swing.JLabel back;
    private javax.swing.JLabel editar;
    private javax.swing.JPanel inicioAsignacion;
    private javax.swing.JPanel principalAsignacion;
    private javax.swing.JLabel restauranteNuevaIcon;
    private javax.swing.JLabel restauranteNuevaLabel;
    private javax.swing.JLabel restauranteVerIcon;
    private javax.swing.JLabel restauranteVerLabel;
    private javax.swing.JPanel tituloAsignacion;
    // End of variables declaration//GEN-END:variables
}
