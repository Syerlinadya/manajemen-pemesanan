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

public class Customer extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null;
    Statement St = null;
    
    public Customer() {
        initComponents();
        showCustomer();
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
        customerNama = new javax.swing.JTextField();
        heading3 = new javax.swing.JLabel();
        customerKontak = new javax.swing.JTextField();
        heading5 = new javax.swing.JLabel();
        customerAlamat = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        customerId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        heading = new javax.swing.JLabel();
        heading8 = new javax.swing.JLabel();
        customerSearch = new javax.swing.JTextField();
        heading12 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnProduk.setBackground(new java.awt.Color(102, 0, 102));
        btnProduk.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 18)); // NOI18N
        btnProduk.setForeground(new java.awt.Color(102, 0, 102));
        btnProduk.setText("Data Produk");
        btnProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdukMouseClicked(evt);
            }
        });

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
                    .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(55, 55, 55))
        );

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        heading2.setBackground(new java.awt.Color(102, 0, 102));
        heading2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading2.setForeground(new java.awt.Color(255, 255, 255));
        heading2.setText("Nama Customer");

        customerNama.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        customerNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNamaActionPerformed(evt);
            }
        });

        heading3.setBackground(new java.awt.Color(102, 0, 102));
        heading3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading3.setForeground(new java.awt.Color(255, 255, 255));
        heading3.setText("Kontak");

        customerKontak.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        customerKontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerKontakActionPerformed(evt);
            }
        });

        heading5.setBackground(new java.awt.Color(102, 0, 102));
        heading5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading5.setForeground(new java.awt.Color(255, 255, 255));
        heading5.setText("Alamat Pengiriman");

        customerAlamat.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        customerAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerAlamatActionPerformed(evt);
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
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        customerId.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        customerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdActionPerformed(evt);
            }
        });

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Customer", "Nama Customer", "Kontak", "Alamat"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCustomer);

        heading.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText("Pengelolaan Customer");

        heading8.setBackground(new java.awt.Color(102, 0, 102));
        heading8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading8.setForeground(new java.awt.Color(255, 255, 255));
        heading8.setText("ID Customer");

        customerSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                customerSearchCaretUpdate(evt);
            }
        });
        customerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerSearchActionPerformed(evt);
            }
        });

        heading12.setBackground(new java.awt.Color(102, 0, 102));
        heading12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading12.setForeground(new java.awt.Color(255, 255, 255));
        heading12.setText("Pencarian");

        btnRefresh.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(102, 0, 102));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(heading5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(customerAlamat)
                                .addComponent(heading3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(heading2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(customerKontak)
                                .addComponent(customerNama)
                                .addComponent(customerId)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(heading8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(heading12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(heading)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heading12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(heading8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(customerId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heading2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerNama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heading3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerKontak, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heading5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
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
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void customerNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNamaActionPerformed

    private void customerKontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerKontakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerKontakActionPerformed

    private void customerAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerAlamatActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if(customerId.getText().isEmpty()|| customerNama.getText().isEmpty() || customerKontak.getText().isEmpty() || customerAlamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong !");
        } else{
            try {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO customer VALUES (?,?,?,?)");
                pstmt.setString(1,customerId.getText().toString());
                pstmt.setString(2, customerNama.getText().toString());
                pstmt.setString(3, customerKontak.getText().toString());
                pstmt.setString(4, customerAlamat.getText().toString());
                
                int rowsAffected = pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan !");
                conn.close();
                showCustomer();
                
                customerId.setText("");
                customerNama.setText("");
                customerKontak.setText("");
                customerAlamat.setText("");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(customerId.getText().isEmpty()|| customerNama.getText().isEmpty() || customerKontak.getText().isEmpty() || customerAlamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong !");
        } else{
            try {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
                PreparedStatement pstmt = conn.prepareStatement("UPDATE customer SET nama_customer = ?, kontak = ?, alamat = ? WHERE id_customer = ?");

                pstmt.setString(1, customerNama.getText()); 
                pstmt.setString(2, customerKontak.getText()); 
                pstmt.setString(3, customerAlamat.getText()); 
                pstmt.setString(4, customerId.getText()); // id
                
                int rowsAffected = pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Data berhasil diedit !");
                conn.close();
                showCustomer();
                
                customerId.setText("");
                customerNama.setText("");
                customerKontak.setText("");
                customerAlamat.setText("");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM customer WHERE id_customer = '"+ customerId.getText()+"'");

            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }   
        
        showCustomer();
        customerId.setText("");
        customerNama.setText("");
        customerKontak.setText("");
        customerAlamat.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void customerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIdActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
        
            int myIndex = tblCustomer.getSelectedRow();

            String id = tblCustomer.getModel().getValueAt(myIndex, 0).toString();
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
            St = conn.createStatement();

            Rs = St.executeQuery("SELECT * FROM customer WHERE id_customer ='" + id + "'");

            if (Rs.next()) {
                customerId.setText(Rs.getString("id_customer"));
                customerNama.setText(Rs.getString("nama_customer"));
                customerKontak.setText(Rs.getString("kontak"));
                customerAlamat.setText(Rs.getString("alamat"));
            }

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void customerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerSearchActionPerformed
        
    }//GEN-LAST:event_customerSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        showCustomer();
        customerSearch.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void customerSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_customerSearchCaretUpdate
        searchCustomer();
    }//GEN-LAST:event_customerSearchCaretUpdate

    private void btnProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdukMouseClicked
       new Produk().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnProdukMouseClicked

    private void btnCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseClicked
        
    }//GEN-LAST:event_btnCustomerMouseClicked

    private void btnPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPemesananMouseClicked
        new Pesanan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPemesananMouseClicked

    private void showCustomer(){
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
            St = conn.createStatement();
            Rs = St.executeQuery("SELECT * FROM customer");
            
            DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();

            model.setRowCount(0); // Reset data tabel

            while (Rs.next()) {
                String id_customer = Rs.getString("id_customer");
                String nama_customer = Rs.getString("nama_customer");
                String kontak = Rs.getString("kontak");
                String alamat = Rs.getString("alamat");

                model.addRow(new Object[]{id_customer, nama_customer, kontak, alamat});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    
    private void searchCustomer(){
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan", "root", "");
            St = conn.createStatement();
            String searchTerm = customerSearch.getText(); // Mendapatkan input pencarian
            String query = "SELECT * FROM customer WHERE id_customer LIKE '%" + searchTerm + "%' OR " +
                            "nama_customer LIKE '%" + searchTerm + "%' OR " +
                            "alamat LIKE '%" + searchTerm + "%' OR " +
                            "kontak LIKE '%" + searchTerm + "%'";
            Rs = St.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
            model.setRowCount(0); // Reset data tabel

            while (Rs.next()) {
                String id_customer = Rs.getString("id_customer");
                String nama_customer = Rs.getString("nama_customer");
                String kontak = Rs.getString("kontak");
                String alamat = Rs.getString("alamat");

                model.addRow(new Object[]{id_customer, nama_customer, kontak, alamat});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

        
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCustomer;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JLabel btnPemesanan;
    private javax.swing.JLabel btnProduk;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField customerAlamat;
    private javax.swing.JTextField customerId;
    private javax.swing.JTextField customerKontak;
    private javax.swing.JTextField customerNama;
    private javax.swing.JTextField customerSearch;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel heading12;
    private javax.swing.JLabel heading2;
    private javax.swing.JLabel heading3;
    private javax.swing.JLabel heading5;
    private javax.swing.JLabel heading8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logout;
    private javax.swing.JTable tblCustomer;
    // End of variables declaration//GEN-END:variables
}
