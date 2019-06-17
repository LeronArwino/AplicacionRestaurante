package Frontera;

import DAO.AsignacionDAO;
import Entidad.Asignacion;

public class VerAsignacion extends javax.swing.JPanel {

    private AsignacionDAO daoAsi = new AsignacionDAO();

    public VerAsignacion() {
        initComponents();
    }

    public void verRestaurante(String nombre) {
        tableAsi.setModel(daoAsi.ver());
    }

    public Asignacion editarAsignacion() {

        Asignacion asignacion = new Asignacion();

        int rowSel = tableAsi.getSelectedRow();
        if (rowSel >= 0) {
            asignacion.setRestaurante(tableAsi.getValueAt(rowSel, 1).toString());
            asignacion.setPersona(tableAsi.getValueAt(rowSel, 2).toString());
            asignacion.setTurno(tableAsi.getValueAt(rowSel, 3).toString());
            asignacion.setMesa(tableAsi.getValueAt(rowSel, 4).toString());
        }
        return asignacion;
    }

    public int fila() {
        int rowSel = tableAsi.getSelectedRow();
        if (rowSel >= 0) {
            return Integer.parseInt(tableAsi.getValueAt(rowSel, 0).toString());
        }
        return 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableAsi = new javax.swing.JTable();

        setBackground(new java.awt.Color(164, 186, 191));

        tableAsi.setBackground(new java.awt.Color(36, 56, 63));
        tableAsi.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        tableAsi.setForeground(new java.awt.Color(192, 212, 216));
        tableAsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableAsi.setGridColor(new java.awt.Color(36, 56, 63));
        tableAsi.setSelectionBackground(new java.awt.Color(164, 186, 191));
        tableAsi.setSelectionForeground(new java.awt.Color(36, 56, 63));
        jScrollPane1.setViewportView(tableAsi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAsi;
    // End of variables declaration//GEN-END:variables
}
