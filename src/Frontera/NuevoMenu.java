package Frontera;

//import DAO.MenuDAO;
public class NuevoMenu extends javax.swing.JPanel {

//    private MenuDAO daoMen = new MenuDAO();
    public NuevoMenu() {
        initComponents();
    }

    public boolean validarCampos() {
        return true/*("Ninguno".equals(comRes.getSelectedItem().toString())
                && "Ninguna".equals(comCom1.getSelectedItem().toString())
                && "Ninguna".equals(comCom4.getSelectedItem().toString())
                && "Ninguna".equals(comCom5.getSelectedItem().toString())
                && "Ninguna".equals(comCom6.getSelectedItem().toString())
                && "Ninguna".equals(comCom7.getSelectedItem().toString())
                && "Ninguna".equals(comCom8.getSelectedItem().toString())
                && "Ninguna".equals(comCom9.getSelectedItem().toString()))*/;
    }

    /*    
    public void guardarDatos() {

        restaurante.setNombre(nombreTF.getText());
        restaurante.setUbicacion(ubicacionTF.getText());
        restaurante.setTipo(tipoTF.getText());
        restaurante.setHorario(horarioTF.getText());

        String respuesta = validar.validarRestaurante(restaurante);

        if ("Longitud nombre incorrecta".equals(respuesta)) {
            dialogoOk.textoLabel(respuesta);
            dialogoOk.visible();
        } else if ("Longitud ubicación incorrecta".equals(respuesta)) {
            dialogoOk.textoLabel(respuesta);
            dialogoOk.visible();
        } else if ("Longitud tipo incorrecta".equals(respuesta)) {
            dialogoOk.textoLabel(respuesta);
            dialogoOk.visible();
        } else if ("Longitud horario incorrecta".equals(respuesta)) {
            dialogoOk.textoLabel(respuesta);
            dialogoOk.visible();
        } else {
            daoRes.crear(restaurante.getNombre(), ubicacionTF.getText(), tipoTF.getText(), horarioTF.getText());
            vaciarCampos();
            dialogoOk.textoLabel(respuesta);
            dialogoOk.visible();
        }
    }

    public void comboCom() {
        comRes.setVisible(false);
        
        comCom1.setVisible(false);
        comCom4.setVisible(false);
        comCom5.setVisible(false);
        comCom6.setVisible(false);
        comCom7.setVisible(false);
        comCom8.setVisible(false);
        comCom9.setVisible(false);

        comRes.removeAll();
        
        comCom1.removeAll();
        comCom4.removeAll();
        comCom5.removeAll();
        comCom6.removeAll();
        comCom7.removeAll();
        comCom8.removeAll();
        comCom9.removeAll();

        comRes.setModel(daoMen.comboRes());
        
        comCom1.setModel(daoMen.comboCom());
        comCom4.setModel(daoMen.comboCom());
        comCom5.setModel(daoMen.comboCom());
        comCom6.setModel(daoMen.comboCom());
        comCom7.setModel(daoMen.comboCom());
        comCom8.setModel(daoMen.comboCom());
        comCom9.setModel(daoMen.comboCom());
        
        comRes.setVisible(true);
        
        comCom1.setVisible(true);
        comCom4.setVisible(true);
        comCom5.setVisible(true);
        comCom6.setVisible(true);
        comCom7.setVisible(true);
        comCom8.setVisible(true);
        comCom9.setVisible(true);
    }
     */
    public void nuevoVisible() {
        guardar.setVisible(true);
        editarNuevo.setVisible(false);
    }

    public void editarVisible() {
        guardar.setVisible(false);
        editarNuevo.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        restaurante = new javax.swing.JLabel();
        comRes = new javax.swing.JComboBox<>();
        descripcionLabel = new javax.swing.JLabel();
        descripcionTF = new javax.swing.JTextField();
        comida1 = new javax.swing.JLabel();
        comCom1 = new javax.swing.JComboBox<>();
        comida4 = new javax.swing.JLabel();
        comCom4 = new javax.swing.JComboBox<>();
        comida5 = new javax.swing.JLabel();
        comCom5 = new javax.swing.JComboBox<>();
        comida6 = new javax.swing.JLabel();
        comCom6 = new javax.swing.JComboBox<>();
        comida7 = new javax.swing.JLabel();
        comCom7 = new javax.swing.JComboBox<>();
        comida8 = new javax.swing.JLabel();
        comCom8 = new javax.swing.JComboBox<>();
        comida9 = new javax.swing.JLabel();
        comCom9 = new javax.swing.JComboBox<>();
        editarNuevo = new javax.swing.JLabel();
        guardar = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(164, 186, 191));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        restaurante.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        restaurante.setForeground(new java.awt.Color(36, 56, 63));
        restaurante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        restaurante.setText("Restaurante");
        add(restaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 200, 30));

        comRes.setBackground(new java.awt.Color(164, 186, 191));
        comRes.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        comRes.setForeground(new java.awt.Color(36, 56, 63));
        add(comRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 60, 240, 30));

        descripcionLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        descripcionLabel.setForeground(new java.awt.Color(36, 56, 63));
        descripcionLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        descripcionLabel.setText("Descripción");
        add(descripcionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 200, 30));

        descripcionTF.setBackground(new java.awt.Color(164, 186, 191));
        descripcionTF.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        descripcionTF.setForeground(new java.awt.Color(36, 56, 63));
        descripcionTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descripcionTF.setBorder(null);
        add(descripcionTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 240, 30));

        comida1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        comida1.setForeground(new java.awt.Color(36, 56, 63));
        comida1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        comida1.setText("Comida #1");
        add(comida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 200, 30));

        comCom1.setBackground(new java.awt.Color(164, 186, 191));
        comCom1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        comCom1.setForeground(new java.awt.Color(36, 56, 63));
        add(comCom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 240, 30));

        comida4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        comida4.setForeground(new java.awt.Color(36, 56, 63));
        comida4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        comida4.setText("Comida #2");
        add(comida4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 200, 30));

        comCom4.setBackground(new java.awt.Color(164, 186, 191));
        comCom4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        comCom4.setForeground(new java.awt.Color(36, 56, 63));
        add(comCom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 240, 31));

        comida5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        comida5.setForeground(new java.awt.Color(36, 56, 63));
        comida5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        comida5.setText("Comida #3");
        add(comida5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 30));

        comCom5.setBackground(new java.awt.Color(164, 186, 191));
        comCom5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        comCom5.setForeground(new java.awt.Color(36, 56, 63));
        add(comCom5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 240, 30));

        comida6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        comida6.setForeground(new java.awt.Color(36, 56, 63));
        comida6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        comida6.setText("Comida #4");
        add(comida6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 200, 30));

        comCom6.setBackground(new java.awt.Color(164, 186, 191));
        comCom6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        comCom6.setForeground(new java.awt.Color(36, 56, 63));
        add(comCom6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 240, 31));

        comida7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        comida7.setForeground(new java.awt.Color(36, 56, 63));
        comida7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        comida7.setText("Comida #5");
        add(comida7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 200, 30));

        comCom7.setBackground(new java.awt.Color(164, 186, 191));
        comCom7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        comCom7.setForeground(new java.awt.Color(36, 56, 63));
        add(comCom7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 240, 30));

        comida8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        comida8.setForeground(new java.awt.Color(36, 56, 63));
        comida8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        comida8.setText("Comida #6");
        add(comida8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 200, 30));

        comCom8.setBackground(new java.awt.Color(164, 186, 191));
        comCom8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        comCom8.setForeground(new java.awt.Color(36, 56, 63));
        add(comCom8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 240, 31));

        comida9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        comida9.setForeground(new java.awt.Color(36, 56, 63));
        comida9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        comida9.setText("Comida #7");
        add(comida9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 200, 30));

        comCom9.setBackground(new java.awt.Color(164, 186, 191));
        comCom9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        comCom9.setForeground(new java.awt.Color(36, 56, 63));
        add(comCom9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 240, 30));

        editarNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editarNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/test.png"))); // NOI18N
        editarNuevo.setToolTipText("Actualizar");
        editarNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarNuevoMouseClicked(evt);
            }
        });
        add(editarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, 70, 70));

        guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/clipboardM.png"))); // NOI18N
        guardar.setToolTipText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });
        add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 470, 70, 70));

        separador1.setBackground(new java.awt.Color(36, 56, 63));
        separador1.setForeground(new java.awt.Color(36, 56, 63));
        add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 142, 240, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void editarNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarNuevoMouseClicked

    }//GEN-LAST:event_editarNuevoMouseClicked

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked

    }//GEN-LAST:event_guardarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comCom1;
    private javax.swing.JComboBox<String> comCom4;
    private javax.swing.JComboBox<String> comCom5;
    private javax.swing.JComboBox<String> comCom6;
    private javax.swing.JComboBox<String> comCom7;
    private javax.swing.JComboBox<String> comCom8;
    private javax.swing.JComboBox<String> comCom9;
    private javax.swing.JComboBox<String> comRes;
    private javax.swing.JLabel comida1;
    private javax.swing.JLabel comida4;
    private javax.swing.JLabel comida5;
    private javax.swing.JLabel comida6;
    private javax.swing.JLabel comida7;
    private javax.swing.JLabel comida8;
    private javax.swing.JLabel comida9;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JTextField descripcionTF;
    private javax.swing.JLabel editarNuevo;
    private javax.swing.JLabel guardar;
    private javax.swing.JLabel restaurante;
    private javax.swing.JSeparator separador1;
    // End of variables declaration//GEN-END:variables
}