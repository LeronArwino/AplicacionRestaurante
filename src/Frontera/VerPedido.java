package Frontera;

import DAO.PedidoDAO;
import Entidad.Pedido;

public class VerPedido extends javax.swing.JPanel {

    private final PedidoDAO daoPed = new PedidoDAO();

    public VerPedido() {
        initComponents();
    }

    public void verMenu() {
        tablePed.setModel(daoPed.ver());
    }

    public Pedido editarMenu() {
        Pedido pedido = new Pedido();

        int rowSel = tablePed.getSelectedRow();
        if (rowSel >= 0) {        
            pedido.setHabitacion(Integer.parseInt(tablePed.getValueAt(rowSel, 2 ).toString()));
            pedido.setTipoH(tablePed.getValueAt(rowSel, 4).toString());
        }
        return pedido;
    }

    public int fila() {
        int rowSel = tablePed.getSelectedRow();
        if (rowSel >= 0) {
            return Integer.parseInt(tablePed.getValueAt(rowSel, 0).toString());
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
        tablePed = new javax.swing.JTable();

        setBackground(new java.awt.Color(164, 186, 191));

        tablePed.setBackground(new java.awt.Color(36, 56, 63));
        tablePed.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        tablePed.setForeground(new java.awt.Color(192, 212, 216));
        tablePed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablePed.setToolTipText("");
        tablePed.setGridColor(new java.awt.Color(36, 56, 63));
        tablePed.setSelectionBackground(new java.awt.Color(164, 186, 191));
        tablePed.setSelectionForeground(new java.awt.Color(36, 56, 63));
        jScrollPane1.setViewportView(tablePed);

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
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePed;
    // End of variables declaration//GEN-END:variables
}