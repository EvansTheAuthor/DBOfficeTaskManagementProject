/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package azzamproyekdb01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guest OSN
 */
public class ManagerTableInterface extends javax.swing.JFrame {

    /**
     * Creates new form ManagerTableInterface
     */
    public ManagerTableInterface() {
        initComponents();
        loadManagers();
    }
    
    private Long manager_id;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManager = new javax.swing.JTable();
        btnDataEdit = new javax.swing.JButton();
        btnEmpTableReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("TABEL DATA MANAJER");

        tblManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Manajer", "ID Karyawan", "Nama"
            }
        ));
        jScrollPane1.setViewportView(tblManager);

        btnDataEdit.setText("Ubah Data");
        btnDataEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataEditActionPerformed(evt);
            }
        });

        btnEmpTableReturn.setText("Kembali ke Daftar Karyawan");
        btnEmpTableReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpTableReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDataEdit)
                    .addComponent(btnEmpTableReturn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDataEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmpTableReturn)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataEditActionPerformed
        // TODO add your handling code here:
        ManagerDataInput manInput=new ManagerDataInput();
        
        manInput.setVisible(true);
    }//GEN-LAST:event_btnDataEditActionPerformed

    private void btnEmpTableReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpTableReturnActionPerformed
        // TODO add your handling code here:
        EmployeeTableInterface empTable=new EmployeeTableInterface();
        
        empTable.setVisible(true);
        ManagerTableInterface.this.setVisible(false);
    }//GEN-LAST:event_btnEmpTableReturnActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerTableInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerTableInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerTableInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerTableInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerTableInterface().setVisible(true);
            }
        });
    }
    
    void loadManagers(){
    // Tidak perlu memeriksa manager_id jika ingin memuat semua data
    DefaultTableModel tableModel = (DefaultTableModel) tblManager.getModel();
    tableModel.setRowCount(0);  // Bersihkan tabel sebelum memuat data baru

    String query = "SELECT m.manager_id, m.employee_id, e.name "
                 + "FROM ManagerList m "
                 + "JOIN EmployeeList e ON m.employee_id = e.employee_id";

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(query);
         ResultSet rs = pstmt.executeQuery()) {
        
        while (rs.next()) {
            long manager_id = rs.getLong("manager_id");
            long employee_id = rs.getLong("employee_id");
            String employee_name = rs.getString("name");
            
            // Tambahkan data ke tabel
            Object[] row = {manager_id, employee_id, employee_name};
            tableModel.addRow(row);
        }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error saat memuat data manajer: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataEdit;
    private javax.swing.JButton btnEmpTableReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManager;
    // End of variables declaration//GEN-END:variables
}
