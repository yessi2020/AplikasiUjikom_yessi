/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikaskasir_yesi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author OWNER
 */
public class FormLaporanTransaksi extends javax.swing.JFrame {
Connection konek;
PreparedStatement pst;
ResultSet rst;
String tanggal,tanggal2, sql;
    /**
     * Creates new form FormLaporanTransaksi
     */
    public FormLaporanTransaksi() {
        initComponents();
         konek = Koneksi.koneksiDB();
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
        SebelumTgl = new com.toedter.calendar.JDateChooser();
        DiantaraTgl = new com.toedter.calendar.JDateChooser();
        SetelahTgl = new com.toedter.calendar.JDateChooser();
        btncari = new javax.swing.JButton();
        btncari2 = new javax.swing.JButton();
        btncari3 = new javax.swing.JButton();
        sampaitgl = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataProduk = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLapTransaksi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sebelum Tgl");

        jLabel2.setText("Diantara Tgl");

        jLabel3.setText("Setelah Tgl");

        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        btncari2.setText("Cari");
        btncari2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncari2ActionPerformed(evt);
            }
        });

        btncari3.setText("Cari");
        btncari3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncari3ActionPerformed(evt);
            }
        });

        jLabel4.setText("s/d");

        tblDataProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PenjualanID", "DetailID", "TanggalPenjualan", "JamPenjualan", "TotalHarga"
            }
        ));
        jScrollPane1.setViewportView(tblDataProduk);

        tblLapTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DetailID", "ProdukID", "Harga", "JumlahProduk", "Subtotal"
            }
        ));
        tblLapTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLapTransaksiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLapTransaksi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(SetelahTgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(DiantaraTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(sampaitgl, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(btncari3))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(SebelumTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btncari2)
                            .addComponent(btncari))))
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DiantaraTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(SebelumTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btncari))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sampaitgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(btncari2))))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(SetelahTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btncari3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
  try {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    tanggal = format.format(SebelumTgl.getDate());
    sql = "select * from tbl_penjualan where tanggalpenjualan<'"+tanggal+"'";
    pst = konek.prepareStatement(sql);
    rst = pst.executeQuery();
    tblLapTransaksi.setModel(DbUtils.resultSetToTableModel(rst));
} catch (Exception e){
    JOptionPane.showMessageDialog(null,"Data Tidak Tampil");
}// TODO add your handling code here:
    }//GEN-LAST:event_btncariActionPerformed

    private void tblLapTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLapTransaksiMouseClicked
try {
    int row = tblLapTransaksi.getSelectedRow();
String tabelKlik = (tblLapTransaksi.getModel().getValueAt(row,1).toString());
String sql ="select * from detailpenjualan where DetailID=?";
pst = konek.prepareStatement(sql);
pst.setString(1,tabelKlik);
rst = pst.executeQuery();
tblDataProduk.setModel(DbUtils.resultSetToTableModel(rst));
}catch (Exception e) {
   JOptionPane.showMessageDialog(null,e);
}
// TODO add your handling code here:
    }//GEN-LAST:event_tblLapTransaksiMouseClicked

    private void btncari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncari2ActionPerformed
try {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    tanggal = format.format(DiantaraTgl.getDate());
    tanggal2 = format.format(sampaitgl.getDate());
    sql = "select * from penjualan where tanggalpenjualan between '"+tanggal+"' and '"+tanggal2+"'";
    pst = konek.prepareStatement(sql);
    rst = pst.executeQuery();
    tblLapTransaksi.setModel(DbUtils.resultSetToTableModel(rst));
} catch (Exception e){
    JOptionPane.showMessageDialog(null,"Data Tidak Tampil");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_btncari2ActionPerformed

    private void btncari3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncari3ActionPerformed
try {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    tanggal = format.format(SetelahTgl.getDate());
    sql = "select * from penjualan where tanggalpenjualan>'"+tanggal+"'";
    pst = konek.prepareStatement(sql);
    rst = pst.executeQuery();
    tblLapTransaksi.setModel(DbUtils.resultSetToTableModel(rst));
} catch (Exception e){
    JOptionPane.showMessageDialog(null,"Data Tidak Tampil");
}        // TODO add your handling code here:
    }//GEN-LAST:event_btncari3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormLaporanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLaporanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLaporanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLaporanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLaporanTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DiantaraTgl;
    private com.toedter.calendar.JDateChooser SebelumTgl;
    private com.toedter.calendar.JDateChooser SetelahTgl;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btncari2;
    private javax.swing.JButton btncari3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser sampaitgl;
    private javax.swing.JTable tblDataProduk;
    private javax.swing.JTable tblLapTransaksi;
    // End of variables declaration//GEN-END:variables
}
