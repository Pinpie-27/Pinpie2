/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import DAO.khoa_DAO;
import controller.KhoaController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import model.khoa;

/**
 *
 * @author Admin
 */
public class KhoaView extends JFrame {

    private DefaultTableModel model;
    private JScrollPane jScrollPane1;
    private JTable table;
    private String maKhoa;
    private JTextField text_id;
    private JTextField text_name;

    public KhoaView() {
        this.setTitle("Danh mục");
        this.setSize(800, 550);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.init();
        this.setVisible(true);
        this.render();
    }

//    public KhoaView() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public void init() {
        ActionListener ac = new KhoaController(this);
        Font font = new Font("Arial", Font.ROMAN_BASELINE, 15);

        ImageIcon addIcon = new ImageIcon("D:\\JavaEasy\\QuanLySinhVien\\src\\main\\java\\img\\them.jpg");
        JButton add = new JButton("Add", addIcon);
        add.setFont(font);
        add.addActionListener(ac);

        ImageIcon addIcon1 = new ImageIcon("D:\\JavaEasy\\QuanLySinhVien\\src\\main\\java\\img\\sua.jpg");
        JButton edit = new JButton("Edit", addIcon1);
        edit.setFont(font);
        edit.addActionListener(ac);
        
        ImageIcon addIcon2 = new ImageIcon("D:\\JavaEasy\\QuanLySinhVien\\src\\main\\java\\img\\xoa.jpg");
        JButton delete = new JButton("Delete", addIcon2);
        delete.setFont(font);
        delete.addActionListener(ac);
        
        ImageIcon addIcon3 = new ImageIcon("D:\\JavaEasy\\QuanLySinhVien\\src\\main\\java\\img\\reset.jpg");
        JButton clear = new JButton("Clear", addIcon3);
        clear.setFont(font);
        clear.addActionListener(ac);

        text_id = new JTextField();
        text_id.setFont(font);
        text_id.setColumns(15);
        JLabel jLabel_id = new JLabel("Mã danh mục khoa");
        jLabel_id.setFont(font);

        text_name = new JTextField();
        text_name.setFont(font);
        text_name.setColumns(15);
        JLabel jLabel_name = new JLabel("Tên danh mục khoa");
        jLabel_name.setFont(font);

        JPanel jp_North = new JPanel(new BorderLayout());
        EmptyBorder border1 = new EmptyBorder(20, 20, 20, 20);

        jp_North.setBorder(border1);
        JPanel jpCenter = new JPanel();

        jpCenter.setBorder(
                new EmptyBorder(10, 20, 20, 20));

        JPanel jp_title = new JPanel(new FlowLayout());

        jp_title.setBorder(border1);
        JLabel title = new JLabel("Quản lý danh mục khoa");

        title.setFont(
                new Font("Arial", Font.BOLD, 20));
        jp_title.add(title);

        GridLayout layout2 = new GridLayout(1, 2);

        layout2.setHgap(
                20);
        layout2.setVgap(
                20);
        GridLayout layout3 = new GridLayout(1, 4);

        layout2.setHgap(
                20);
        layout2.setVgap(
                20);

        JPanel jp_North_content = new JPanel(new BorderLayout());

        jp_North_content.setBorder(border1);
        JPanel jp_North_content_North = new JPanel(layout2);
        JPanel jp_North_content_Center = new JPanel(layout3);

        jp_North_content_Center.setBorder(
                new EmptyBorder(30, 0, 0, 0));

        jp_North_content_North.add(jLabel_id);

        jp_North_content_North.add(text_id);

        jp_North_content_North.add(jLabel_name);

        jp_North_content_North.add(text_name);

        jp_North_content_Center.add(add);

        jp_North_content_Center.add(edit);

        jp_North_content_Center.add(delete);

        jp_North_content_Center.add(clear);

        jp_North_content.add(jp_North_content_North, BorderLayout.NORTH);

        jp_North_content.add(jp_North_content_Center, BorderLayout.CENTER);

        jp_North.add(jp_title, BorderLayout.NORTH);

        jp_North.add(jp_North_content, BorderLayout.CENTER);

        //bảng
        table = new JTable(model);

//          this.render();
        table.setFont(font);

        table.setPreferredScrollableViewportSize(
                new Dimension(600, 190));
        //jScrollPane1= new JScrollPane(table,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        table.addMouseListener(
                new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e
            ) {

                String maKhoa = model.getValueAt(table.getSelectedRow(), 1) + "";
                String tenKhoa = model.getValueAt(table.getSelectedRow(), 2) + "";

                text_id.setText(maKhoa);
                text_name.setText(tenKhoa);

                KhoaView.this.maKhoa = maKhoa;
            }
        }
        );

        jScrollPane1 = new JScrollPane();
        //jScrollPane1.setSize(20, 10);

        jScrollPane1.setViewportView(table);

        jpCenter.add(jScrollPane1);

        this.setLayout(
                new BorderLayout());

        this.add(jp_North, BorderLayout.NORTH);

        this.add(jpCenter, BorderLayout.CENTER);

    }

    public void render() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{
            "STT", "ID", "Tên danh mục"
        });
        ArrayList<khoa> categorys = khoa_DAO.getInstance().selectAll();

        int stt = 0;
        if (categorys.size() > 0) {
            for (khoa ct : categorys) {
                stt++;
                Object[] rowdata = {
                    stt,
                    ct.getMaKhoa(),
                    ct.getTenKhoa(),};

                model.addRow(rowdata);
            }
        }
        table.setModel(model);
    }

    public void reset() {
        // TODO Auto-generated method stub
        text_id.setText("");
        text_name.setText("");

    }

    public void insert() {
        String maKhoa = text_id.getText();
        String tenKhoa = text_name.getText();

        if (tenKhoa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống nội dung");
        } else {

            khoa ct = new khoa(maKhoa, tenKhoa);
            int result = khoa_DAO.getInstance().insert(ct);

            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                this.render();
                this.reset();
            } else {
                System.out.println("Thêm thất bại");
                JOptionPane.showMessageDialog(this, "Thêm thất bại");
            }
        }
    }

    public void update() {
        // Kiểm tra xem maKhoa có giá trị không
        if (maKhoa != null && !maKhoa.isEmpty()) {
            String tenKhoa = text_name.getText();

            khoa ct = new khoa(maKhoa, tenKhoa);
            int result = khoa_DAO.getInstance().update(ct); // Sửa lỗi chính tả ở đây từ updare() thành update()

            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                this.render(); // Hiển thị lại dữ liệu sau khi sửa
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài khoản cần sửa");
        }
    }

    public void delete() {
        // Kiểm tra xem maKhoa có giá trị không
        if (maKhoa != null && !maKhoa.isEmpty()) {
            String tenKhoa = text_name.getText();

            boolean nganhExists = khoa_DAO.getInstance().isExistsForKhoa(maKhoa);

            if (nganhExists) {
                JOptionPane.showMessageDialog(this, "Không thể xóa, dữ liệu còn tồn tại!!.");
            } else {
                int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    khoa ct = new khoa(maKhoa, tenKhoa);
                    int result = khoa_DAO.getInstance().delete(ct);
                    if (result > 0) {
                        JOptionPane.showMessageDialog(this, "Xóa thành công");
                        this.reset();
                        this.render();
                    } else {
                        JOptionPane.showMessageDialog(this, "Xóa thất bại");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài khoản cần xóa");
        }
    }

    public PopupMenu getComponent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
