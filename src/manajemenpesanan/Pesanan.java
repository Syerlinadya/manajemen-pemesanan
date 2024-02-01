/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manajemenpesanan;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pesanan extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null;
    Statement St = null;
    
    public Pesanan() {
        initComponents();
        getProduk();
        getCustomer();
        showPesanan();
    }
    
    private void getProduk(){
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan", "root", "");
            St = conn.createStatement();
            Rs = St.executeQuery("SELECT * FROM produk");

            while (Rs.next()) {
                String nama_produk = Rs.getString("nama_produk");
                pesananProduk.addItem(nama_produk); // Menambahkan nama produk ke dalam JComboBox
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }

    private void getCustomer(){
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan", "root", "");
            St = conn.createStatement();
            Rs = St.executeQuery("SELECT * FROM customer");

            while (Rs.next()) {
                String nama_customer = Rs.getString("nama_customer");
                pesananCustomer.addItem(nama_customer); 
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    
    private void showPesanan(){
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
            St = conn.createStatement();
            Rs = St.executeQuery("SELECT pesanan.id_pesanan, customer.nama_customer, produk.nama_produk, pesanan.jumlah, pesanan.alamat, pesanan.status FROM pesanan JOIN customer ON pesanan.customer = customer.id_customer JOIN produk ON pesanan.produk = produk.id_produk");

            DefaultTableModel model = (DefaultTableModel) tblPesanan.getModel();
            model.setRowCount(0); // Reset data tabel

            while (Rs.next()) {
                String id_pesanan = Rs.getString("id_pesanan");
                String nama_customer = Rs.getString("nama_customer");
                String nama_produk = Rs.getString("nama_produk");
                String jumlah = Rs.getString("jumlah");
                String alamat = Rs.getString("alamat");
                String status = Rs.getString("status");

                model.addRow(new Object[]{id_pesanan, nama_customer, nama_produk, jumlah, alamat, status});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading6 = new javax.swing.JLabel();
        username5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        heading2 = new javax.swing.JLabel();
        heading3 = new javax.swing.JLabel();
        heading4 = new javax.swing.JLabel();
        pesananJumlah = new javax.swing.JTextField();
        heading5 = new javax.swing.JLabel();
        pesananAlamat = new javax.swing.JTextField();
        heading7 = new javax.swing.JLabel();
        pesananStatus = new javax.swing.JComboBox<>();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        pesananId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPesanan = new javax.swing.JTable();
        heading = new javax.swing.JLabel();
        heading8 = new javax.swing.JLabel();
        pesananCustomer = new javax.swing.JComboBox<>();
        pesananProduk = new javax.swing.JComboBox<>();
        searchPemesanan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnProduk = new javax.swing.JLabel();
        btnCustomer = new javax.swing.JLabel();
        btnPemesanan = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();

        heading6.setBackground(new java.awt.Color(102, 0, 102));
        heading6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading6.setForeground(new java.awt.Color(255, 255, 255));
        heading6.setText("Alamat Pengiriman");

        username5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        username5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        heading2.setBackground(new java.awt.Color(102, 0, 102));
        heading2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading2.setForeground(new java.awt.Color(255, 255, 255));
        heading2.setText("Nama Customer");

        heading3.setBackground(new java.awt.Color(102, 0, 102));
        heading3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading3.setForeground(new java.awt.Color(255, 255, 255));
        heading3.setText("Nama Produk");

        heading4.setBackground(new java.awt.Color(102, 0, 102));
        heading4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading4.setForeground(new java.awt.Color(255, 255, 255));
        heading4.setText("Jumlah");

        pesananJumlah.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        pesananJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesananJumlahActionPerformed(evt);
            }
        });

        heading5.setBackground(new java.awt.Color(102, 0, 102));
        heading5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading5.setForeground(new java.awt.Color(255, 255, 255));
        heading5.setText("Alamat Pengiriman");

        pesananAlamat.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        pesananAlamat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                pesananAlamatCaretUpdate(evt);
            }
        });
        pesananAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesananAlamatActionPerformed(evt);
            }
        });

        heading7.setBackground(new java.awt.Color(102, 0, 102));
        heading7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading7.setForeground(new java.awt.Color(255, 255, 255));
        heading7.setText("Status Pesanan");

        pesananStatus.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        pesananStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Diproses", "Dikirim", "Selesai" }));

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

        pesananId.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        pesananId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesananIdActionPerformed(evt);
            }
        });

        tblPesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No. Pesanan", "Customer", "Produk", "Jumlah", "Alamat", "Status"
            }
        ));
        tblPesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPesananMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPesanan);

        heading.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText("Pengelolaan Pesanan");

        heading8.setBackground(new java.awt.Color(102, 0, 102));
        heading8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        heading8.setForeground(new java.awt.Color(255, 255, 255));
        heading8.setText("No. Pesanan");

        pesananCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        pesananCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesananCustomerActionPerformed(evt);
            }
        });

        pesananProduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        searchPemesanan.setToolTipText("");
        searchPemesanan.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchPemesananCaretUpdate(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pencarian");

        btnRefresh.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(heading5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(heading7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pesananStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pesananAlamat)
                        .addComponent(heading4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pesananJumlah)
                        .addComponent(heading3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(heading2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pesananId)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(heading8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pesananCustomer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pesananProduk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(heading))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(searchPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(heading8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(pesananId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heading2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesananCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heading3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(pesananProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heading4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesananJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heading5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesananAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heading7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesananStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesananJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesananJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesananJumlahActionPerformed

    private void pesananAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesananAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesananAlamatActionPerformed

    private void username5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username5ActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if(pesananId.getText().isEmpty() || pesananJumlah.getText().isEmpty() || pesananStatus.getSelectedItem().toString().isEmpty() || pesananAlamat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong !");
        } else {
            try {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO pesanan (id_pesanan, customer, produk, jumlah, alamat, status) VALUES (?,?,?,?,?,?)");

                pstmt.setString(1, pesananId.getText().toString());
                pstmt.setString(4, pesananJumlah.getText().toString());
                pstmt.setString(5, pesananAlamat.getText().toString());
                pstmt.setString(6, pesananStatus.getSelectedItem().toString());

                // Mendapatkan ID customer dari ComboBox
                String namaCustomer = pesananCustomer.getSelectedItem().toString();
                ResultSet rsCustomer = St.executeQuery("SELECT id_customer FROM customer WHERE nama_customer='" + namaCustomer + "'");
                if (rsCustomer.next()) {
                    String idCustomer = rsCustomer.getString("id_customer");
                    pstmt.setString(2, idCustomer);
                }

                // Mendapatkan ID produk dari ComboBox
                String namaProduk = pesananProduk.getSelectedItem().toString();
                ResultSet rsProduk = St.executeQuery("SELECT id_produk FROM produk WHERE nama_produk='" + namaProduk + "'");
                if (rsProduk.next()) {
                    String idProduk = rsProduk.getString("id_produk");
                    pstmt.setString(3, idProduk);
                }

                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan !");
                    showPesanan();
                    pesananId.setText("");
                    pesananJumlah.setText("");
                    pesananStatus.setSelectedIndex(0);
                    pesananCustomer.setSelectedIndex(0);
                    pesananProduk.setSelectedIndex(0);
                    pesananAlamat.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menambahkan data !");
                }

                conn.close();
                showPesanan();
                pesananId.setText("");
                pesananJumlah.setText("");
                pesananStatus.setSelectedIndex(0);
                pesananCustomer.setSelectedIndex(0);
                pesananProduk.setSelectedIndex(0);
                pesananAlamat.setText("");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(pesananId.getText().isEmpty() || pesananJumlah.getText().isEmpty() || pesananStatus.getSelectedItem().toString().isEmpty() || pesananAlamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong !");
        } else {
            try {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
                PreparedStatement pstmt = conn.prepareStatement("UPDATE pesanan SET status = ? WHERE id_pesanan = ?");

                pstmt.setString(1, pesananStatus.getSelectedItem().toString()); // status
                pstmt.setString(2, pesananId.getText()); // id

                int rowsAffected = pstmt.executeUpdate();

                JOptionPane.showMessageDialog(this, "Data berhasil diedit !");
                conn.close();
                showPesanan();

                pesananId.setText("");
                pesananJumlah.setText("");
                pesananStatus.setSelectedIndex(0);
                pesananCustomer.setSelectedIndex(0);
                pesananProduk.setSelectedIndex(0);
                pesananAlamat.setText("");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM pesanan WHERE id_pesanan = '"+ pesananId.getText()+"'");

            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
            
            conn.close();
            showPesanan();
            pesananId.setText("");
            pesananJumlah.setText("");
            pesananStatus.setSelectedIndex(0);
            pesananCustomer.setSelectedIndex(0);
            pesananProduk.setSelectedIndex(0);
            pesananAlamat.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }   
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void pesananIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesananIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesananIdActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void btnProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdukMouseClicked
        new Produk().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProdukMouseClicked

    private void btnCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCustomerMouseClicked

    private void pesananCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesananCustomerActionPerformed
         String namaCustomer = pesananCustomer.getSelectedItem().toString();
            try {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan", "root", "");
                St = conn.createStatement();
                ResultSet rs = St.executeQuery("SELECT alamat FROM customer WHERE nama_customer='" + namaCustomer + "'");
                if (rs.next()) {
                    String alamatCustomer = rs.getString("alamat");
                    pesananAlamat.setText(alamatCustomer);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
    }//GEN-LAST:event_pesananCustomerActionPerformed

    private void pesananAlamatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_pesananAlamatCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_pesananAlamatCaretUpdate

    private void tblPesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPesananMouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) tblPesanan.getModel();
        
            int myIndex = tblPesanan.getSelectedRow();

            String id = tblPesanan.getModel().getValueAt(myIndex, 0).toString();
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan","root","");
            St = conn.createStatement();

            Rs = St.executeQuery("SELECT pesanan.id_pesanan, pesanan.jumlah, pesanan.status, customer.nama_customer, produk.nama_produk, customer.alamat FROM pesanan " +
               "JOIN customer ON pesanan.customer = customer.id_customer " +
               "JOIN produk ON pesanan.produk = produk.id_produk " +
               "WHERE id_pesanan ='" + id + "'");

            if (Rs.next()) {
                pesananId.setText(Rs.getString("id_pesanan"));
                pesananJumlah.setText(Rs.getString("jumlah"));
                pesananStatus.setSelectedItem(Rs.getString("status"));
                pesananCustomer.setSelectedItem(Rs.getString("nama_customer"));
                pesananProduk.setSelectedItem(Rs.getString("nama_produk"));
                pesananAlamat.setText(Rs.getString("alamat"));
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_tblPesananMouseClicked

    private void searchPemesananCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchPemesananCaretUpdate
        searchPemesanan();
    }//GEN-LAST:event_searchPemesananCaretUpdate

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        showPesanan();
        searchPemesanan.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void searchPemesanan(){
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpemesanan", "root", "");
            St = conn.createStatement();
            String searchTerm = searchPemesanan.getText(); // Mendapatkan input pencarian
            String query = "SELECT pesanan.id_pesanan, pesanan.jumlah, pesanan.status, customer.nama_customer, produk.nama_produk, customer.alamat FROM pesanan " +
                           "JOIN customer ON pesanan.customer = customer.id_customer " +
                           "JOIN produk ON pesanan.produk = produk.id_produk " +
                           "WHERE pesanan.id_pesanan LIKE '%" + searchTerm + "%' OR " +
                           "customer.nama_customer LIKE '%" + searchTerm + "%' OR " +
                           "pesanan.status LIKE '%" + searchTerm + "%'";
            Rs = St.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) tblPesanan.getModel();
            model.setRowCount(0); // Reset data tabel

            while (Rs.next()) {
                String id_pesanan = Rs.getString("id_pesanan");
                String nama_customer = Rs.getString("nama_customer");
                String nama_produk = Rs.getString("nama_produk");
                String jumlah = Rs.getString("jumlah");
                String alamat = Rs.getString("alamat");
                String status = Rs.getString("status");

                model.addRow(new Object[]{id_pesanan, nama_customer, nama_produk, jumlah, alamat, status});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
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
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesanan().setVisible(true);
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
    private javax.swing.JLabel heading;
    private javax.swing.JLabel heading2;
    private javax.swing.JLabel heading3;
    private javax.swing.JLabel heading4;
    private javax.swing.JLabel heading5;
    private javax.swing.JLabel heading6;
    private javax.swing.JLabel heading7;
    private javax.swing.JLabel heading8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField pesananAlamat;
    private javax.swing.JComboBox<String> pesananCustomer;
    private javax.swing.JTextField pesananId;
    private javax.swing.JTextField pesananJumlah;
    private javax.swing.JComboBox<String> pesananProduk;
    private javax.swing.JComboBox<String> pesananStatus;
    private javax.swing.JTextField searchPemesanan;
    private javax.swing.JTable tblPesanan;
    private javax.swing.JTextField username5;
    // End of variables declaration//GEN-END:variables
}
