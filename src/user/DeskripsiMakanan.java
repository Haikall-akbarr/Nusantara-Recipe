/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Haikal
 */
public class DeskripsiMakanan extends javax.swing.JFrame {

    /**
     * Creates new form DeskripsiMakanan
     */
    public DeskripsiMakanan() {
        initComponents();
        loadDataToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btBerikutnya = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeskripsiMakanan = new javax.swing.JTable();
        btKembali1 = new javax.swing.JButton();
        btNasikuning = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(223, 204, 203));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(624, 542));

        btBerikutnya.setBackground(new java.awt.Color(255, 209, 228));
        btBerikutnya.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btBerikutnya.setText("Berikutnya");
        btBerikutnya.setAlignmentY(0.0F);
        btBerikutnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBerikutnyaActionPerformed(evt);
            }
        });

        tblDeskripsiMakanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Masakan", "Asal Masakan", "Jenis Masakan", "Chef"
            }
        ));
        jScrollPane1.setViewportView(tblDeskripsiMakanan);
        if (tblDeskripsiMakanan.getColumnModel().getColumnCount() > 0) {
            tblDeskripsiMakanan.getColumnModel().getColumn(0).setHeaderValue("Nama Masakan");
            tblDeskripsiMakanan.getColumnModel().getColumn(1).setHeaderValue("Asal Masakan");
            tblDeskripsiMakanan.getColumnModel().getColumn(2).setHeaderValue("Jenis Masakan");
            tblDeskripsiMakanan.getColumnModel().getColumn(3).setHeaderValue("Chef");
        }

        btKembali1.setBackground(new java.awt.Color(255, 209, 228));
        btKembali1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btKembali1.setText("Kembali");
        btKembali1.setAlignmentY(0.0F);
        btKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKembali1ActionPerformed(evt);
            }
        });

        btNasikuning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nasi_kuning.png"))); // NOI18N
        btNasikuning.setAlignmentY(0.0F);
        btNasikuning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNasikuningMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btBerikutnya)
                        .addGap(23, 23, 23))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(btNasikuning, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btKembali1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btKembali1)
                .addGap(57, 57, 57)
                .addComponent(btNasikuning, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btBerikutnya, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(72, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_Kecil.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Nusantara Recipe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(252, 252, 252)
                    .addComponent(jLabel2)
                    .addContainerGap(254, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel2)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


     private void loadDataToTable() {
        // Model untuk JTable
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Masakan");
        model.addColumn("Asal Makanan");
        model.addColumn("Jenis Makanan");
        model.addColumn("Chef");

        // Set model ke JTable
        tblDeskripsiMakanan.setModel(model);

        // Koneksi ke database dan ambil data
        Connection conn = Config.getConnection(); // Ganti connect() dengan getConnection()
    if (conn != null) {
        try {
            String query = "SELECT * FROM deskripsi_nasiKuning WHERE nama_masakan = 'Nasi kuning'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);


                while (rs.next()) {
                    // Tambahkan baris data ke model tabel
                    model.addRow(new Object[]{
                        rs.getString("Nama_Masakan"),
                        rs.getString("Asal_Makanan"),
                        rs.getString("Jenis_Makanan"),
                        rs.getString("Chef")
                    });
                }

                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    
    private void btBerikutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBerikutnyaActionPerformed
        // TODO add your handling code here:
        NasiKuning NasiKuningFrame = new NasiKuning();
        NasiKuningFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btBerikutnyaActionPerformed

    private void btKembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKembali1ActionPerformed
        // TODO add your handling code here:
        Resep ResepFrame = new Resep();
        ResepFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btKembali1ActionPerformed

    private void btNasikuningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNasikuningMouseClicked
        // TODO add your handling code here:
        //DeskripsiMakanan DeskripsiMakananFrame = new DeskripsiMakanan();
        //DeskripsiMakananFrame.setVisible(true);
        //dispose();
    }//GEN-LAST:event_btNasikuningMouseClicked

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
            java.util.logging.Logger.getLogger(DeskripsiMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeskripsiMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeskripsiMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeskripsiMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeskripsiMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBerikutnya;
    private javax.swing.JButton btKembali1;
    private javax.swing.JLabel btNasikuning;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeskripsiMakanan;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //private void loadData() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
}