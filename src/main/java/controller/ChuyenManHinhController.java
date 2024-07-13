/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.proit4all.quanlysinhvien.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.DiemHPView;
import view.HocPhanView;
import view.KhoaView;
import view.LoginView;
import view.LopView;
import view.NganhView;
import view.SinhVienView;
import view.TrangChuJPN;


/**
 *
 * @author Admin
 */
//public class ChuyenManHinhController implements ActionListener{
//    private TrangChuView homeview;
//    public  ChuyenManHinhController(TrangChuView homeView){
//        this.homeview= homeView;
//    }
   // @Override
//    public void actionPerformed(ActionEvent e) {
//        String check= e.getActionCommand();
//        if(check.equals("Logout")){
//            this.homeview.logout();
//        }
//        if(check.equals("Close")){
//            this.homeview.close();
//        }
//        if(check.equals("Khoa")){
//            this.homeview.khoa();
//        }
//        if(check.equals("Ngành")){
//            this.homeview.nganh();
//        }
//        if(check.equals("Lớp")){
//            this.homeview.lop();
//        }
//        if(check.equals("Sinh viên")){
//            this.homeview.sinhvien();
//        }
//        if(check.equals("Học phần")){
//            this.homeview.hocphan();
//        }
//        if(check.equals("Điểm học phần")){
//            this.homeview.diemhp();
//        }
//   
//        
//    }
    
//}
public class ChuyenManHinhController{
    private JPanel root;
    private String kindSelected = "";
    private List<DanhMucBean> listItem =null;
    private JPanel currentView = null;

    public ChuyenManHinhController(JPanel root) {
        this.root = root;
    }

    public void setView(JPanel jpnItem,JLabel jlbItem){
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChuJPN());
        root.validate();
        root.repaint();
    }
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem =listItem;
        for(DanhMucBean item :listItem )
        {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(),item.getJlb()));
        }
    }
    class LabelEvent implements MouseListener{
        
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent( String kind, JPanel jpnItem, JLabel jlbItem) {
           
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        
        @Override
        public void mouseClicked(MouseEvent e) {
          switch(kind)
                  {
              case "TrangChu":
                   root.removeAll();
                    root.setLayout(new BorderLayout());
                    root.add(new TrangChuJPN());
                    break;
              case "Khoa":
                    root.removeAll();
                    root.setLayout(new BorderLayout());
                    root.add(new KhoaView().getComponent());
                    break;
                   
              case "Nganh":
                    root.removeAll();
                    root.setLayout(new BorderLayout());
                    root.add(new NganhView().getComponent());
                    break;
                    
              case "Lop":
                    root.removeAll();
                    root.setLayout(new BorderLayout());
                    root.add(new LopView().getComponent());
                    break;
                    
              case "SinhVien":
                    root.removeAll();
                    root.setLayout(new BorderLayout());
                    root.add(new SinhVienView().getComponent());
                    break;
                     case "HocPhan":
                    root.removeAll();
                    root.setLayout(new BorderLayout());
                    root.add(new HocPhanView().getComponent());
                    break;
                     case "DiemHP":
                    root.removeAll();
                    root.setLayout(new BorderLayout());
                    root.add(new DiemHPView().getComponent());
                    break;
                    case "LogOut":
                    root.removeAll();
                    root.setLayout(new BorderLayout());
                    root.add(new LoginView().getComponent());
                    break;
                  }
            root.validate();
            root.repaint();
        }
       

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                 jpnItem.setBackground(new Color(76,175,80));
                 jlbItem.setBackground(new Color(76,175,80));
            }
        }
        
    }
    private void setChangeBackGround(String kind){
        for(DanhMucBean item :listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(96,100,191));
                item.getJlb().setBackground(new Color(96,100,191));
            }else {
                 item.getJpn().setBackground(new Color(76,175,80));
                item.getJlb().setBackground(new Color(76,175,80));
            }
        }
    }
}