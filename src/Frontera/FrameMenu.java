package Frontera;

public final class FrameMenu extends javax.swing.JPanel {

    private final NuevoMenu nuevo = new NuevoMenu();

    private Dialogo dialogo = new Dialogo(null, true);
    private VerMenu ver = new VerMenu();
    private final DialogoOK dialogoOk = new DialogoOK(null, true);

    public FrameMenu() {
        initComponents();
        inicioMenu();
    }

    public void inicioMenu() {
        principalMenu.setVisible(false);
        principalMenu.removeAll();
        principalMenu.add(inicioMenu);
        principalMenu.setVisible(true);
        back.setVisible(false);
        editar.setVisible(false);
    }

    public void validarInicioMenu() {
        if (!nuevo.validarCampos()) {
            dialogo.textoLabel("¿Desea guardar los datos?");
            int selCon = dialogo.visible();
            if (selCon == 0) {
                principalMenu.setVisible(false);
                principalMenu.removeAll();
                principalMenu.add(inicioMenu);
                principalMenu.setVisible(true);
                back.setVisible(false);
                editar.setVisible(false);
                nuevo.vaciarCampos();
            }
        }
        if (nuevo.validarCampos()) {
            principalMenu.setVisible(false);
            principalMenu.removeAll();
            principalMenu.add(inicioMenu);
            principalMenu.setVisible(true);
            back.setVisible(false);
            editar.setVisible(false);
        }
    }

    public void nuevoMenu() {
        principalMenu.setVisible(false);
        principalMenu.removeAll();
        principalMenu.add(nuevo);
        principalMenu.setVisible(true);
        nuevo.comboRes();
        nuevo.vaciarCampos();
        back.setVisible(true);
        editar.setVisible(false);
        nuevo.nuevoVisible();
    }

    public void verMenu() {
        principalMenu.setVisible(false);
        principalMenu.removeAll();
        principalMenu.add(ver);
        principalMenu.setVisible(true);
        nuevo.comboRes();
        nuevo.vaciarCampos();
        ver.verMenu();
        back.setVisible(true);
        editar.setVisible(true);
        nuevo.editarVisible();
    }

    public void editarMenu() {
        int temInt = ver.fila();
        if (temInt >= 1) {
            principalMenu.setVisible(false);
            principalMenu.removeAll();
            principalMenu.add(nuevo);
            principalMenu.setVisible(true);
            editar.setVisible(false);
            nuevo.editar(ver.editarMenu(), temInt);
            nuevo.comboRes();
        } else {
            dialogoOk.textoLabel("Por favor seleccione una fila");
            dialogoOk.visible();
        }
    }

    public void inicioPrincipal() {
        principalMenu.setVisible(false);
        principalMenu.removeAll();
        principalMenu.add(inicioMenu);
        principalMenu.setVisible(true);
        back.setVisible(false);
        editar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloMenu = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        editar = new javax.swing.JLabel();
        principalMenu = new javax.swing.JPanel();
        inicioMenu = new javax.swing.JPanel();
        menuVerIcon = new javax.swing.JLabel();
        menuVerLabel = new javax.swing.JLabel();
        menuNuevaLabel = new javax.swing.JLabel();
        menuNuevaIcon = new javax.swing.JLabel();

        tituloMenu.setBackground(new java.awt.Color(68, 85, 89));
        tituloMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        menu.setForeground(new java.awt.Color(164, 186, 191));
        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setText("MENÚ RESTAURANTE");
        tituloMenu.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 9, 940, 40));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/log-out.png"))); // NOI18N
        back.setToolTipText("Atrás");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        tituloMenu.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        editar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/note.png"))); // NOI18N
        editar.setToolTipText("Editar");
        editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
        });
        tituloMenu.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 10, 40, 40));

        principalMenu.setBackground(new java.awt.Color(19, 38, 35));
        principalMenu.setLayout(new java.awt.BorderLayout());

        inicioMenu.setBackground(new java.awt.Color(164, 186, 191));

        menuVerIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuVerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/phone-bookB.png"))); // NOI18N
        menuVerIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuVerIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVerIconMouseClicked(evt);
            }
        });

        menuVerLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        menuVerLabel.setForeground(new java.awt.Color(36, 56, 63));
        menuVerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuVerLabel.setText("VER");
        menuVerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuVerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVerLabelMouseClicked(evt);
            }
        });

        menuNuevaLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        menuNuevaLabel.setForeground(new java.awt.Color(36, 56, 63));
        menuNuevaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuNuevaLabel.setText("CREAR");
        menuNuevaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuNuevaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuNuevaLabelMouseClicked(evt);
            }
        });

        menuNuevaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuNuevaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/support-ticketB.png"))); // NOI18N
        menuNuevaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuNuevaIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuNuevaIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inicioMenuLayout = new javax.swing.GroupLayout(inicioMenu);
        inicioMenu.setLayout(inicioMenuLayout);
        inicioMenuLayout.setHorizontalGroup(
            inicioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioMenuLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(inicioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioMenuLayout.createSequentialGroup()
                        .addComponent(menuNuevaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addComponent(menuVerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inicioMenuLayout.createSequentialGroup()
                        .addComponent(menuNuevaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addComponent(menuVerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        inicioMenuLayout.setVerticalGroup(
            inicioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioMenuLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(inicioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuNuevaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuVerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(inicioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuNuevaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuVerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        principalMenu.add(inicioMenu, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(principalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(principalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        validarInicioMenu();
    }//GEN-LAST:event_backMouseClicked

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked
        editarMenu();
    }//GEN-LAST:event_editarMouseClicked

    private void menuVerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVerIconMouseClicked
        verMenu();
    }//GEN-LAST:event_menuVerIconMouseClicked

    private void menuVerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVerLabelMouseClicked
        verMenu();
    }//GEN-LAST:event_menuVerLabelMouseClicked

    private void menuNuevaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuNuevaLabelMouseClicked
        nuevoMenu();
    }//GEN-LAST:event_menuNuevaLabelMouseClicked

    private void menuNuevaIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuNuevaIconMouseClicked
        nuevoMenu();
    }//GEN-LAST:event_menuNuevaIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel editar;
    private javax.swing.JPanel inicioMenu;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel menuNuevaIcon;
    private javax.swing.JLabel menuNuevaLabel;
    private javax.swing.JLabel menuVerIcon;
    private javax.swing.JLabel menuVerLabel;
    private javax.swing.JPanel principalMenu;
    private javax.swing.JPanel tituloMenu;
    // End of variables declaration//GEN-END:variables
}
