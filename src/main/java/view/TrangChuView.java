/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.proit4all.quanlysinhvien.DanhMucBean;
import controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TrangChuView extends javax.swing.JFrame {

    /**
     * Creates new form TrangChuView
     */
    public TrangChuView() {
        initComponents();
        setTitle("QUẢN LÝ SINH VIÊN");
        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        controller.setView(jpnTrangChu, jlbTrangChu);
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu",jpnTrangChu,jlbTrangChu));
        listItem.add(new DanhMucBean("Khoa",jpnKhoa,jlbKhoa));
        listItem.add(new DanhMucBean("Nganh",jpnNganh,jlbNganh));
        listItem.add(new DanhMucBean("Lop",jpnLop,jlbLop));
        listItem.add(new DanhMucBean("SinhVien",jpnSinhVien,jlbSinhVien));
        listItem.add(new DanhMucBean("HocPhan",jpnHocPhan,jlbHocPhan));
        listItem.add(new DanhMucBean("DiemHP",jpnDiem,jlbDiem));
        listItem.add(new DanhMucBean("LogOut",jpnLogOut,jlbLogOut));
        
        controller.setEvent(listItem);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnKhoa = new javax.swing.JPanel();
        jlbKhoa = new javax.swing.JLabel();
        jpnNganh = new javax.swing.JPanel();
        jlbNganh = new javax.swing.JLabel();
        jpnLop = new javax.swing.JPanel();
        jlbLop = new javax.swing.JLabel();
        jpnSinhVien = new javax.swing.JPanel();
        jlbSinhVien = new javax.swing.JLabel();
        jpnHocPhan = new javax.swing.JPanel();
        jlbHocPhan = new javax.swing.JLabel();
        jpnDiem = new javax.swing.JPanel();
        jlbDiem = new javax.swing.JLabel();
        jpnLogOut = new javax.swing.JPanel();
        jlbLogOut = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(82, 83, 81));

        jPanel4.setBackground(new java.awt.Color(232, 64, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\2x\\2x\\baseline_groups_white_24dp.png")); // NOI18N
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnTrangChu.setBackground(new java.awt.Color(76, 175, 80));
        jpnTrangChu.setPreferredSize(new java.awt.Dimension(280, 50));

        jlbTrangChu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangChu.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\2x\\2x\\Home.png")); // NOI18N
        jlbTrangChu.setText("TRANG CHỦ");

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnKhoa.setBackground(new java.awt.Color(76, 175, 80));
        jpnKhoa.setPreferredSize(new java.awt.Dimension(280, 50));

        jlbKhoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbKhoa.setForeground(new java.awt.Color(255, 255, 255));
        jlbKhoa.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\2x\\2x\\Khoa.png")); // NOI18N
        jlbKhoa.setText("QUẢN LÝ KHOA");

        javax.swing.GroupLayout jpnKhoaLayout = new javax.swing.GroupLayout(jpnKhoa);
        jpnKhoa.setLayout(jpnKhoaLayout);
        jpnKhoaLayout.setHorizontalGroup(
            jpnKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhoaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpnKhoaLayout.setVerticalGroup(
            jpnKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhoaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnNganh.setBackground(new java.awt.Color(76, 175, 80));
        jpnNganh.setPreferredSize(new java.awt.Dimension(280, 50));

        jlbNganh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbNganh.setForeground(new java.awt.Color(255, 255, 255));
        jlbNganh.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\2x\\2x\\Nganh.png")); // NOI18N
        jlbNganh.setText("QUẢN LÝ NGÀNH");

        javax.swing.GroupLayout jpnNganhLayout = new javax.swing.GroupLayout(jpnNganh);
        jpnNganh.setLayout(jpnNganhLayout);
        jpnNganhLayout.setHorizontalGroup(
            jpnNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNganhLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpnNganhLayout.setVerticalGroup(
            jpnNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNganhLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnLop.setBackground(new java.awt.Color(76, 175, 80));
        jpnLop.setPreferredSize(new java.awt.Dimension(280, 50));

        jlbLop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbLop.setForeground(new java.awt.Color(255, 255, 255));
        jlbLop.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\2x\\2x\\Class.png")); // NOI18N
        jlbLop.setText("QUẢN LÝ LỚP");

        javax.swing.GroupLayout jpnLopLayout = new javax.swing.GroupLayout(jpnLop);
        jpnLop.setLayout(jpnLopLayout);
        jpnLopLayout.setHorizontalGroup(
            jpnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLopLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpnLopLayout.setVerticalGroup(
            jpnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLopLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnSinhVien.setBackground(new java.awt.Color(76, 175, 80));
        jpnSinhVien.setPreferredSize(new java.awt.Dimension(280, 50));

        jlbSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbSinhVien.setForeground(new java.awt.Color(255, 255, 255));
        jlbSinhVien.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\2x\\2x\\SinhVien.png")); // NOI18N
        jlbSinhVien.setText("QUẢN LÝ SINH VIÊN");

        javax.swing.GroupLayout jpnSinhVienLayout = new javax.swing.GroupLayout(jpnSinhVien);
        jpnSinhVien.setLayout(jpnSinhVienLayout);
        jpnSinhVienLayout.setHorizontalGroup(
            jpnSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSinhVienLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpnSinhVienLayout.setVerticalGroup(
            jpnSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSinhVienLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlbSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnHocPhan.setBackground(new java.awt.Color(76, 175, 80));
        jpnHocPhan.setPreferredSize(new java.awt.Dimension(280, 50));

        jlbHocPhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbHocPhan.setForeground(new java.awt.Color(255, 255, 255));
        jlbHocPhan.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\2x\\2x\\Hocphan.png")); // NOI18N
        jlbHocPhan.setText("QUẢN LÝ HỌC PHẦN");

        javax.swing.GroupLayout jpnHocPhanLayout = new javax.swing.GroupLayout(jpnHocPhan);
        jpnHocPhan.setLayout(jpnHocPhanLayout);
        jpnHocPhanLayout.setHorizontalGroup(
            jpnHocPhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHocPhanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpnHocPhanLayout.setVerticalGroup(
            jpnHocPhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHocPhanLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlbHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnDiem.setBackground(new java.awt.Color(76, 175, 80));
        jpnDiem.setPreferredSize(new java.awt.Dimension(280, 50));

        jlbDiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbDiem.setForeground(new java.awt.Color(255, 255, 255));
        jlbDiem.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\2x\\2x\\Diem.png")); // NOI18N
        jlbDiem.setText("QUẢN LÝ ĐIỂM");

        javax.swing.GroupLayout jpnDiemLayout = new javax.swing.GroupLayout(jpnDiem);
        jpnDiem.setLayout(jpnDiemLayout);
        jpnDiemLayout.setHorizontalGroup(
            jpnDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDiemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpnDiemLayout.setVerticalGroup(
            jpnDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDiemLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlbDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnLogOut.setBackground(new java.awt.Color(82, 83, 81));

        jlbLogOut.setForeground(new java.awt.Color(255, 255, 255));
        jlbLogOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\1x\\baseline_logout_white_24dp.png")); // NOI18N
        jlbLogOut.setText("LogOut");

        javax.swing.GroupLayout jpnLogOutLayout = new javax.swing.GroupLayout(jpnLogOut);
        jpnLogOut.setLayout(jpnLogOutLayout);
        jpnLogOutLayout.setHorizontalGroup(
            jpnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );
        jpnLogOutLayout.setVerticalGroup(
            jpnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLogOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jpnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnNganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnHocPhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jpnKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jpnNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jpnLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jpnSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jpnHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jpnDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jpnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  public void logout() {
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        dispose();
    }


    public void khoa() {
        KhoaView khoaView = new KhoaView();
        khoaView.setVisible(true);

    }

    public void nganh() {
        NganhView nganhView = new NganhView();
        nganhView.setVisible(true);
    }

    public void lop() {
        LopView lopView = new LopView();
        lopView.setVisible(true);
    }

    public void sinhvien() {
        SinhVienView sinhvienView = new SinhVienView();
        sinhvienView.setVisible(true);
    }

    public void hocphan() {
        HocPhanView hocphanView = new HocPhanView();
        hocphanView.setVisible(true);
    }

    public void diemhp() {
        DiemHPView diemhpView = new DiemHPView();
        diemhpView.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlbDiem;
    private javax.swing.JLabel jlbHocPhan;
    private javax.swing.JLabel jlbKhoa;
    private javax.swing.JLabel jlbLogOut;
    private javax.swing.JLabel jlbLop;
    private javax.swing.JLabel jlbNganh;
    private javax.swing.JLabel jlbSinhVien;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnDiem;
    private javax.swing.JPanel jpnHocPhan;
    private javax.swing.JPanel jpnKhoa;
    private javax.swing.JPanel jpnLogOut;
    private javax.swing.JPanel jpnLop;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNganh;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnSinhVien;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
