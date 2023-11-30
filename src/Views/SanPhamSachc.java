/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import Model.DataDescriptor.Sach;
import Model.InteractData.SachDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Admin
 */
public class SanPhamSachc extends javax.swing.JPanel {
    
    private SachDAO contrS = new SachDAO();
    public SanPhamSachc() {
        initComponents();
        LayDuLieuSach(contrS.getSach());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        lblDonGia = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        lblTheLoai = new javax.swing.JLabel();
        lblTacGia = new javax.swing.JLabel();
        lblTenSach = new javax.swing.JLabel();
        lblNXB = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        btnClearTK3 = new javax.swing.JButton();
        jtfTacGia = new javax.swing.JTextField();
        jtfTenSach = new javax.swing.JTextField();
        jtfNXB = new javax.swing.JTextField();
        jtfDonGia = new javax.swing.JTextField();
        jtfSoLuong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfTheLoai = new javax.swing.JTextField();
        jtfIDSach = new javax.swing.JTextField();
        jPanel51 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tblQLSP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfTimMa = new javax.swing.JTextField();
        jtfTimTen = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        txtID1.setEditable(false);
        txtID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID1ActionPerformed(evt);
            }
        });

        setPreferredSize(new java.awt.Dimension(1433, 815));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1102, 802));

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)), "Thông tin sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel31.setForeground(new java.awt.Color(51, 51, 51));
        jPanel31.setName(""); // NOI18N

        lblDonGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDonGia.setText("Đơn giá");

        btnThem.setBackground(new java.awt.Color(204, 204, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setText("Thêm thông tin");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 102, 102));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setText("Xóa thông tin");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 153));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setText("Sửa thông tin");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        lblTheLoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTheLoai.setText("Thể loại");

        lblTacGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTacGia.setText("Tác giả");

        lblTenSach.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenSach.setText("Tên sách");

        lblNXB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNXB.setText("Nhà sản xuất");

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblID.setText("Mã sách");

        lblSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoLuong.setText("Số Lượng");

        btnClearTK3.setBackground(new java.awt.Color(0, 255, 102));
        btnClearTK3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClearTK3.setText("Làm mới");
        btnClearTK3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTK3ActionPerformed(evt);
            }
        });

        jtfTacGia.setName(""); // NOI18N
        jtfTacGia.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtfTacGiaCaretUpdate(evt);
            }
        });
        jtfTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTacGiaActionPerformed(evt);
            }
        });

        jtfTenSach.setName(""); // NOI18N
        jtfTenSach.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtfTenSachCaretUpdate(evt);
            }
        });
        jtfTenSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTenSachActionPerformed(evt);
            }
        });

        jtfNXB.setName(""); // NOI18N
        jtfNXB.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtfNXBCaretUpdate(evt);
            }
        });
        jtfNXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNXBActionPerformed(evt);
            }
        });

        jtfDonGia.setName(""); // NOI18N
        jtfDonGia.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtfDonGiaCaretUpdate(evt);
            }
        });
        jtfDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDonGiaActionPerformed(evt);
            }
        });

        jtfSoLuong.setName(""); // NOI18N
        jtfSoLuong.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtfSoLuongCaretUpdate(evt);
            }
        });
        jtfSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSoLuongActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img1.jpg"))); // NOI18N

        jtfTheLoai.setName(""); // NOI18N
        jtfTheLoai.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtfTheLoaiCaretUpdate(evt);
            }
        });
        jtfTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTheLoaiActionPerformed(evt);
            }
        });

        jtfIDSach.setEditable(false);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblTheLoai)
                        .addGap(18, 18, 18)
                        .addComponent(jtfTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel31Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfIDSach, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel31Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(lblTenSach))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblTacGia)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDonGia)
                    .addComponent(lblSoLuong)
                    .addComponent(lblNXB))
                .addGap(68, 68, 68)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearTK3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(jtfNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNXB)
                            .addComponent(jtfIDSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTenSach)
                                    .addComponent(jtfTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTheLoai)
                                    .addComponent(jtfTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel31Layout.createSequentialGroup()
                                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtfDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDonGia))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSoLuong)))
                                    .addGroup(jPanel31Layout.createSequentialGroup()
                                        .addComponent(btnSua)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnXoa)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClearTK3))))))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)), "Tìm Kiếm Sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblQLSP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        tblQLSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Mã sách", "Tên sách", "Tác giả", " Thể Loại", "Số Lượng", "Ðơn Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQLSP.setGridColor(new java.awt.Color(204, 255, 255));
        tblQLSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLSPMouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(tblQLSP);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tìm tên sách");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tìm tên mã");

        jtfTimMa.setName(""); // NOI18N
        jtfTimMa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtfTimMaCaretUpdate(evt);
            }
        });
        jtfTimMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTimMaActionPerformed(evt);
            }
        });
        jtfTimMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfTimMaKeyReleased(evt);
            }
        });

        jtfTimTen.setName(""); // NOI18N
        jtfTimTen.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtfTimTenCaretUpdate(evt);
            }
        });
        jtfTimTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTimTenActionPerformed(evt);
            }
        });
        jtfTimTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfTimTenKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfTimTenKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jtfTimTen, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jtfTimMa, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 602, Short.MAX_VALUE))
            .addComponent(jScrollPane20, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jtfTimMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTimTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Sản Phẩm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String ID = "", TenSach, TacGia, TheLoai, NXB;
        int DonGia, SoLuong;
        
        TenSach = jtfTenSach.getText();
        TacGia = jtfTacGia.getText();
        TheLoai = jtfTheLoai.getText();
        NXB = jtfNXB.getText();
        SoLuong = Integer.parseInt(jtfSoLuong.getText());
        DonGia = Integer.parseInt(jtfDonGia.getText());
        //SoLuong = jtfSoLuong.getText();
        //DonGia = jtfDonGia.getText();
        
        Sach a = new Sach(ID, TenSach, SoLuong, DonGia, TheLoai, TacGia, NXB);
        try {
            contrS.addSach(a);
            LayDuLieuSach(contrS.getSach());
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamSachc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String ID = "", TenSach, TacGia, TheLoai, NXB;
        int DonGia, SoLuong;
        
        TenSach = jtfTenSach.getText();
        TacGia = jtfTacGia.getText();
        TheLoai = jtfTheLoai.getText();
        NXB = jtfNXB.getText();
        ID = jtfIDSach.getText();

        if(!ID.equals("")){
            try {
                SoLuong = Integer.parseInt(jtfSoLuong.getText());
                DonGia = Integer.parseInt(jtfDonGia.getText());
                Sach a = new Sach(ID, TenSach, SoLuong, DonGia, TheLoai, TacGia, NXB);
                contrS.deleteSach(a);
                LayDuLieuSach(contrS.getSach());
                
            } catch (SQLException ex) {
                Logger.getLogger(SanPhamSachc.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else{
            ThongBao("Bạn chưa chọn Sách muốn xóa", "Lỗi!", 2);
        }
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        String ID, TenSach, TacGia, TheLoai, NXB;
        int DonGia, SoLuong;
        
        TenSach = jtfTenSach.getText();
        TacGia = jtfTacGia.getText();
        TheLoai = jtfTheLoai.getText();
        NXB = jtfNXB.getText();
        ID = jtfIDSach.getText();
        System.out.println("tạo mới một quyển sách");
        if(!ID.equals("")){
            try {
                SoLuong = Integer.parseInt(jtfSoLuong.getText());
                DonGia = Integer.parseInt(jtfDonGia.getText());
                Sach a = new Sach(ID, TenSach, SoLuong, DonGia, TheLoai, TacGia, NXB);
                System.out.println("vào chỗ sửa rồi");
                contrS.updateSach(a);
                LayDuLieuSach(contrS.getSach());
                
            } catch (SQLException ex) {
                Logger.getLogger(SanPhamSachc.class.getName()).log(Level.SEVERE, null, ex);
            }          
        } else{
            ThongBao( "Bạn chưa chọn Sách muốn sửa","Lỗi!", 2);
        }
        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID1ActionPerformed

    private void tblQLSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLSPMouseClicked
        // TODO add your handling code here:
        int viTriDongVuaBam = tblQLSP.getSelectedRow();
        jtfIDSach.setText(tblQLSP.getValueAt(viTriDongVuaBam, 0).toString());
        jtfTenSach.setText(tblQLSP.getValueAt(viTriDongVuaBam, 1).toString());
        jtfTacGia.setText(tblQLSP.getValueAt(viTriDongVuaBam, 2).toString());
        jtfTheLoai.setText(tblQLSP.getValueAt(viTriDongVuaBam, 3).toString());
        jtfSoLuong.setText(tblQLSP.getValueAt(viTriDongVuaBam, 4).toString());
        jtfDonGia.setText(tblQLSP.getValueAt(viTriDongVuaBam, 5).toString());
        jtfNXB.setText(tblQLSP.getValueAt(viTriDongVuaBam, 6).toString());
    }//GEN-LAST:event_tblQLSPMouseClicked

    private void btnClearTK3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTK3ActionPerformed
        //
        ResSach();
    }//GEN-LAST:event_btnClearTK3ActionPerformed

    private void jtfTacGiaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtfTacGiaCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTacGiaCaretUpdate

    private void jtfTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTacGiaActionPerformed

    private void jtfTenSachCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtfTenSachCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTenSachCaretUpdate

    private void jtfTenSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTenSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTenSachActionPerformed

    private void jtfNXBCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtfNXBCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNXBCaretUpdate

    private void jtfNXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNXBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNXBActionPerformed

    private void jtfDonGiaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtfDonGiaCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDonGiaCaretUpdate

    private void jtfDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDonGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDonGiaActionPerformed

    private void jtfSoLuongCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtfSoLuongCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSoLuongCaretUpdate

    private void jtfSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSoLuongActionPerformed

    private void jtfTheLoaiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtfTheLoaiCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTheLoaiCaretUpdate

    private void jtfTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTheLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTheLoaiActionPerformed

    private void jtfTimMaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtfTimMaCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTimMaCaretUpdate

    private void jtfTimMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTimMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTimMaActionPerformed

    private void jtfTimTenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtfTimTenCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTimTenCaretUpdate

    private void jtfTimTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTimTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTimTenActionPerformed

    private void jtfTimTenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTimTenKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTimTenKeyPressed

    private void jtfTimTenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTimTenKeyReleased
        // TODO add your handling code here:
        LayDuLieuSach(contrS.getSachTheoTen(jtfTimTen.getText()));
    }//GEN-LAST:event_jtfTimTenKeyReleased

    private void jtfTimMaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTimMaKeyReleased
        // TODO add your handling code here:
        LayDuLieuSach(contrS.getSachTheoMa(jtfTimMa.getText()));
    }//GEN-LAST:event_jtfTimMaKeyReleased

    public void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }
    
    public void LayDuLieuSach(ArrayList<Sach> listKh) {
        Object[] obj = new Object[]{"Mã Sách", "Tên Sách", "Tác Giả", "Thể loại", "Số Lượng", "Đơn Giá", "NXB"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblQLSP.setModel(tableModel);
        for (Sach x : listKh){
            Object[] item = new Object[7];
                item[0] = x.getID_Sach();
                item[1] = x.getTen();
                item[2] = x.getTacGia();
                item[3] = x.getTheLoai();
                item[4] = x.getSoLuong();
                item[5] = x.getGiaBan();
                item[6] = x.getNXB();
                tableModel.addRow(item);
        }
    }
     
    public void ResSach() {
        jtfIDSach.setText("");
        jtfTenSach.setText("");
        jtfTacGia.setText("");
        jtfSoLuong.setText("");
        jtfDonGia.setText("");
        jtfTheLoai.setText("");
        jtfNXB.setText("");
        LayDuLieuSach(contrS.getSach());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearTK3;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JTextField jtfDonGia;
    private javax.swing.JTextField jtfIDSach;
    private javax.swing.JTextField jtfNXB;
    private javax.swing.JTextField jtfSoLuong;
    private javax.swing.JTextField jtfTacGia;
    private javax.swing.JTextField jtfTenSach;
    private javax.swing.JTextField jtfTheLoai;
    private javax.swing.JTextField jtfTimMa;
    private javax.swing.JTextField jtfTimTen;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNXB;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTacGia;
    private javax.swing.JLabel lblTenSach;
    private javax.swing.JLabel lblTheLoai;
    private javax.swing.JTable tblQLSP;
    private javax.swing.JTextField txtID1;
    // End of variables declaration//GEN-END:variables
}
