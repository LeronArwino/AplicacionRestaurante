package Frontera;

import Control.ValidarAsignacion;
import DAO.AsignacionDAO;
import Entidad.Asignacion;

public class NuevaAsignacion extends javax.swing.JPanel {
    
    private final Dialogo dialogo = new Dialogo(null, true);
    
    private final Asignacion asignacion = new Asignacion();
    private final ValidarAsignacion validar = new ValidarAsignacion();
    private final AsignacionDAO daoAsi = new AsignacionDAO();
    
    private final DialogoOK dialogoOk = new DialogoOK(null, true);
    
    private int filaU = 0;
    
    public NuevaAsignacion() {
        initComponents();
    }
    
    public boolean validarCampos() {
        return (turnoTF.getText().isEmpty() 
                && mesaTF.getText().isEmpty());
    }
    
    public void vaciarCampos() {
        comRes.setSelectedIndex(0);
        comPer.setSelectedIndex(0);
        turnoTF.setText("");
        mesaTF.setText("");
    }
    
    public void guardarDatos() {
        
        String respuesta;
        
        if ("Ninguno".equals(comRes.getSelectedItem().toString())) {
            asignacion.setRestaurante("");
            asignacion.setPersona(Character.toString(comPer.getSelectedItem().toString().charAt(0)));
            asignacion.setTurno(turnoTF.getText());
            asignacion.setMesa(mesaTF.getText());
            
            respuesta = validar.validarAsignacion(asignacion);
            
            dialogoOk.textoLabel(respuesta);
            dialogoOk.visible();
        } else if ("Ninguna".equals(comPer.getSelectedItem().toString())) {
            asignacion.setRestaurante(Character.toString(comRes.getSelectedItem().toString().charAt(0)));
            asignacion.setPersona("");
            asignacion.setTurno(turnoTF.getText());
            asignacion.setMesa(mesaTF.getText());
            
            respuesta = validar.validarAsignacion(asignacion);
            
            dialogoOk.textoLabel(respuesta);
            dialogoOk.visible();
        } else {
            
            asignacion.setRestaurante(Character.toString(comRes.getSelectedItem().toString().charAt(0)));
            asignacion.setPersona(Character.toString(comPer.getSelectedItem().toString().charAt(0)));
            asignacion.setTurno(turnoTF.getText());
            asignacion.setMesa(mesaTF.getText());
            
            respuesta = validar.validarAsignacion(asignacion);
            
            if ("Longitud restaurante incorrecta".equals(respuesta)) {
                dialogoOk.textoLabel(respuesta);
                dialogoOk.visible();
            } else if ("Longitud persona incorrecta".equals(respuesta)) {
                dialogoOk.textoLabel(respuesta);
                dialogoOk.visible();
            } else if ("Longitud turno incorrecta".equals(respuesta)) {
                dialogoOk.textoLabel(respuesta);
                dialogoOk.visible();
            } else if ("Longitud mesa incorrecta".equals(respuesta)) {
                dialogoOk.textoLabel(respuesta);
                dialogoOk.visible();
            } else {
                daoAsi.crear(asignacion.getRestaurante(), asignacion.getPersona(), asignacion.getTurno(), asignacion.getMesa());
                vaciarCampos();
                dialogoOk.textoLabel(respuesta);
                dialogoOk.visible();
            }
            
        }
    }
    
    public void editar(Asignacion asigna, int fila) {
        
        comRes.setModel(daoAsi.comboRes());
        comPer.setModel(daoAsi.comboPer());
        turnoTF.setText(asigna.getTurno());
        mesaTF.setText(asigna.getMesa());
        
        filaU = fila;
    }
    
    public void actualizar() {
        if (filaU != 0) {
            
            String respuesta;
            if ("Ninguno".equals(comRes.getSelectedItem().toString())) {
                asignacion.setRestaurante("");
                asignacion.setPersona(Character.toString(comPer.getSelectedItem().toString().charAt(0)));
                asignacion.setTurno(turnoTF.getText());
                asignacion.setMesa(mesaTF.getText());
                
                respuesta = validar.validarAsignacion(asignacion);
                
                dialogoOk.textoLabel(respuesta);
                dialogoOk.visible();
            } else if ("Ninguna".equals(comPer.getSelectedItem().toString())) {
                asignacion.setRestaurante(Character.toString(comRes.getSelectedItem().toString().charAt(0)));
                asignacion.setPersona("");
                asignacion.setTurno(turnoTF.getText());
                asignacion.setMesa(mesaTF.getText());
                
                respuesta = validar.validarAsignacion(asignacion);
                
                dialogoOk.textoLabel(respuesta);
                dialogoOk.visible();
            } else {
                
                asignacion.setRestaurante(Character.toString(comRes.getSelectedItem().toString().charAt(0)));
                asignacion.setPersona(Character.toString(comPer.getSelectedItem().toString().charAt(0)));
                asignacion.setTurno(turnoTF.getText());
                asignacion.setMesa(mesaTF.getText());
                
                respuesta = validar.validarAsignacion(asignacion);
                
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
                    daoAsi.editar(Integer.parseInt(asignacion.getRestaurante()), Integer.parseInt(asignacion.getPersona()), asignacion.getTurno(), asignacion.getMesa(), filaU);
                    vaciarCampos();
                    dialogoOk.textoLabel(respuesta);
                    dialogoOk.visible();
                    filaU = 0;
                }
            }
        } else {
            dialogoOk.textoLabel("Por favor vuelva atrás");
            dialogoOk.visible();
        }
    }
    
    public void comboRes() {
        comRes.setVisible(false);
        comRes.removeAll();
        comRes.setModel(daoAsi.comboRes());
        comRes.setVisible(true);
    }
    
    public void comboPer() {
        comPer.setVisible(false);
        comPer.removeAll();
        comPer.setModel(daoAsi.comboPer());
        comPer.setVisible(true);
    }
    
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        turnoTF = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        mesaTF = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        comPer = new javax.swing.JComboBox<>();
        comRes = new javax.swing.JComboBox<>();
        editarNuevo = new javax.swing.JLabel();
        guardar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(164, 186, 191));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 56, 63));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Persona");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 56, 63));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Restaurante");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 56, 63));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mesa");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(36, 56, 63));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Turno");

        turnoTF.setBackground(new java.awt.Color(164, 186, 191));
        turnoTF.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        turnoTF.setForeground(new java.awt.Color(36, 56, 63));
        turnoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        turnoTF.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(36, 56, 63));

        mesaTF.setBackground(new java.awt.Color(164, 186, 191));
        mesaTF.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        mesaTF.setForeground(new java.awt.Color(36, 56, 63));
        mesaTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mesaTF.setBorder(null);

        jSeparator4.setBackground(new java.awt.Color(36, 56, 63));

        comPer.setBackground(new java.awt.Color(164, 186, 191));
        comPer.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        comPer.setForeground(new java.awt.Color(36, 56, 63));

        comRes.setBackground(new java.awt.Color(164, 186, 191));
        comRes.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        comRes.setForeground(new java.awt.Color(36, 56, 63));

        editarNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editarNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/test.png"))); // NOI18N
        editarNuevo.setToolTipText("Actualizar");
        editarNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarNuevoMouseClicked(evt);
            }
        });

        guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/clipboardM.png"))); // NOI18N
        guardar.setToolTipText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comRes, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(352, 352, 352)
                        .addComponent(editarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comPer, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(turnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(mesaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(980, 980, 980)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comRes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comPer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        guardarDatos();
    }//GEN-LAST:event_guardarMouseClicked

    private void editarNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarNuevoMouseClicked
        actualizar();
    }//GEN-LAST:event_editarNuevoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comPer;
    private javax.swing.JComboBox<String> comRes;
    private javax.swing.JLabel editarNuevo;
    private javax.swing.JLabel guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField mesaTF;
    private javax.swing.JTextField turnoTF;
    // End of variables declaration//GEN-END:variables
}
