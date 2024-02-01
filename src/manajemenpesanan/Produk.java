/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manajemenpesanan;

import java.sql.*;
import com.mysql.jdbc.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Produk extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null;
    Statement St = null;
    
    public Produk() {
        initComponents();
        showProduk();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnProduk = new javax.swing.JLabel();
        btnCustomer = new javax.swing.JLabel();
        btnPemesanan = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        heading2 = new javax.swing.JLabel();
        produkNama = new javax.swing.JTextField();
        heading3 = new javax.swing.JLabel();
        produkHarga = new javax.swing.JTextField();
        heading5 = new javax.swing.JLabel();
        produkDeskripsi = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        produkId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        produkTbl = new javax.swing.JTable();
        heading = new javax.swing.JLabel();
        heading8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnProduk.setBackground(new java.awt.Color(102, 0, 102));
        btnProduk.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 18)); // NOI18N
        btnProduk.setForeground(new java.awt.Color(102, 0, 102));
        btnProduk.setText("Data Produk");

        btnCustomer.setBackground(new java.awt.Color(102, 0, 102));
        btnCustomer.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 18)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(102, 0, 102));
        btnCustomer.setText("Data Customer");
        btnCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerMouseClicked(evt);
            }
        });

        btnPemesanan.setBackground(new java.awt.Color(102, 0, 102));
        btnPemesanan.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 18)); // NOI18N
        btnPemesanan.setForeground(new java.awt.Color(102, 0, 102));
        btnPemesanan.setText("Pemesanan");
        btnPemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPemesananMouseClicked(evt);
            }
        });

        logout.setBackground(new java.awt.Color(102, 0, 102));
        logout.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(102, 0, 102));
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269)
                .addComponent(logout)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        heading2.setBackground(new java.awt.Color(102, 0, 102));
        heading2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading2.setForeground(new java.awt.Color(255, 255, 255));
        heading2.setText("Nama Produk");

        produkNama.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        produkNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkNamaActionPerformed(evt);
            }
        });

        heading3.setBackground(new java.awt.Color(102, 0, 102));
        heading3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading3.setForeground(new java.awt.Color(255, 255, 255));
        heading3.setText("Harga");

        produkHarga.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        produkHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkHargaActionPerformed(evt);
            }
        });

        heading5.setBackground(new java.awt.Color(102, 0, 102));
        heading5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading5.setForeground(new java.awt.Color(255, 255, 255));
        heading5.setText("Deskripsi");

        produkDeskripsi.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        produkDeskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkDeskripsiActionPerformed(evt);
            }
        });

        btnTambah.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        produkId.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        produkId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkIdActionPerformed(evt);
            }
        });

        produkTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Produk", "Nama Produk", "Harga", "Deskripsi"
            }
        ));
        produkTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produkTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(produkTbl);

        heading.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText("Pengelolaan Produk");

        heading8.setBackground(new java.awt.Color(102, 0, 102));
        heading8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading8.setForeground(new java.awt.Color(255, 255, 255));
        heading8.setText("ID Produk");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(heading)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(heading5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produkDeskripsi)
                            .addComponent(heading3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heading2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produkHarga)
                            .addComponent(produkNama)
                            .addComponent(produkId)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(heading8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(heading8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(produkId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heading2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produkNama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heading3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produkHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heading5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produkDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void produkNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkNamaActionPerformed

    private void produkHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkHargaActionPerformed

    private void produkDeskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkDeskripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkDeskripsiActionPerformed

    private void showProduk(){
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
            St = conn.createStatement();
            Rs = St.executeQuery("SELECT * FROM produk");
            
            DefaultTableModel model = (DefaultTableModel) produkTbl.getModel();

            model.setRowCount(0); // Reset data tabel

            while (Rs.next()) {
                String id_produk = Rs.getString("id_produk");
                String nama_produk = Rs.getString("nama_produk");
                String harga = Rs.getString("harga");
                String deskripsi = Rs.getString("deskripsi");

                model.addRow(new Object[]{id_produk, nama_produk, harga, deskripsi});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if(produkId.getText().isEmpty()|| produkNama.getText().isEmpty() || produkHarga.getText().isEmpty() || produkDeskripsi.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong !");
        } else{
            try {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO produk VALUES (?,?,?,?)");
                pstmt.setString(1,produkId.getText().toString());
                pstmt.setString(2, produkNama.getText().toString());
                pstmt.setString(3, produkHarga.getText().toString());
                pstmt.setString(4, produkDeskripsi.getText().toString());
                
                int rowsAffected = pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan !");
                conn.close();
                showProduk();
                
                produkId.setText("");
                produkNama.setText("");
                produkHarga.setText("");
                produkDeskripsi.setText("");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       if(produkId.getText().isEmpty()|| produkNama.getText().isEmpty() || produkHarga.getText().isEmpty() || produkDeskripsi.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong !");
        } else{
            try {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
                PreparedStatement pstmt = conn.prepareStatement("UPDATE produk SET nama_produk = ?, harga = ?, deskripsi = ? WHERE id_produk = ?");

                pstmt.setString(1, produkNama.getText()); 
                pstmt.setString(2, produkHarga.getText()); 
                pstmt.setString(3, produkDeskripsi.getText()); 
                pstmt.setString(4, produkId.getText()); // id
                
                int rowsAffected = pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Data berhasil diedit !");
                conn.close();
                showProduk();
                
                produkId.setText("");
                produkNama.setText("");
                produkHarga.setText("");
                produkDeskripsi.setText("");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed

        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM produk WHERE id_produk = '"+ produkId.getText()+"'");

            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        showProduk();
        
        produkId.setText("");
        produkNama.setText("");
        produkHarga.setText("");
        produkDeskripsi.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void produkIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkIdActionPerformed

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        
    }//GEN-LAST:event_btnHapusMouseClicked

    private void produkTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produkTblMouseClicked
       
        try {
            DefaultTableModel model = (DefaultTableModel) produkTbl.getModel();
        
            int myIndex = produkTbl.getSelectedRow();

            String id = produkTbl.getModel().getValueAt(myIndex, 0).toString();
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
            St = conn.createStatement();

            Rs = St.executeQuery("SELECT * FROM produk WHERE id_produk ='" + id + "'");

            if (Rs.next()) {
                produkId.setText(Rs.getString("id_produk"));
                produkNama.setText(Rs.getString("nama_produk"));
                produkHarga.setText(Rs.getString("harga"));
                produkDeskripsi.setText(Rs.getString("deskripsi"));
            }

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex);
        }
        
    }//GEN-LAST:event_produkTblMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCustomerMouseClicked

    private void btnPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPemesananMouseClicked
        new Pesanan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPemesananMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCustomer;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JLabel btnPemesanan;
    private javax.swing.JLabel btnProduk;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel heading2;
    private javax.swing.JLabel heading3;
    private javax.swing.JLabel heading5;
    private javax.swing.JLabel heading8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField produkDeskripsi;
    private javax.swing.JTextField produkHarga;
    private javax.swing.JTextField produkId;
    private javax.swing.JTextField produkNama;
    private javax.swing.JTable produkTbl;
    // End of variables declaration//GEN-END:variables
}
