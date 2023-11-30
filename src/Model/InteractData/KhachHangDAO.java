package Model.InteractData;

import Model.Connect.TP;
import Model.DataDescriptor.KhachHang;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import javafx.collections.ObservableList;

public class KhachHangDAO {
    //protected static ObservableList<KhachHang> khachHang;
    //protected static PreparedStatement kh = null;
    protected static ResultSet rs = null;
    //protected static ObservableList<KhachHang> Khachhang;
    
    //Lấy Khách hàng dự vào SDT từ CSDL
    public KhachHang getKHTheoSDT(String sdt){
        String cautruyvan = "SELECT * FROM KHACHHANG WHERE SDT = '" + sdt + "'";
        System.out.println(cautruyvan);
        rs =  TP.connection.ExcuteQueryGetTable(cautruyvan);
        System.out.println("đã thực hiện truy vấn khách hàng");
        KhachHang a = null;
        try {
            if (rs.next()) {
                System.out.println("lưu thông tin khách hàng");
                String ID = rs.getString("ID_KH");
                String ten = rs.getString("TenKH");
                String SDT = rs.getString("SDT");
                String gioiTinh = rs.getString("GioiTinh");
                String ngaySinh = rs.getString("NgaySinh");
                String diaChi = rs.getString("DiaChi");
                String email = rs.getString("Email");
                KhachHang tp = new KhachHang(ID, ten, gioiTinh, ngaySinh, diaChi, email, SDT);
                a = tp;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return a;
    }
    
    //Lấy Khách hàng dự vào ID_KD từ CSDL
    public KhachHang getKHTheoMa(String ID_KH){
        String cautruyvan = "SELECT * FROM KHACHHANG WHERE ID_KH = '" + ID_KH + "'";
        System.out.println(cautruyvan);
        rs =  TP.connection.ExcuteQueryGetTable(cautruyvan);
        System.out.println("đã thực hiện truy vấn khách hàng");
        KhachHang a = null;
        try {
            if (rs.next()) {
                System.out.println("lưu thông tin khách hàng");
                String ID = rs.getString("ID_KH");
                String ten = rs.getString("TenKH");
                String SDT = rs.getString("SDT");
                String gioiTinh = rs.getString("GioiTinh");
                String ngaySinh = rs.getString("NgaySinh");
                String diaChi = rs.getString("DiaChi");
                String email = rs.getString("Email");
                KhachHang tp = new KhachHang(ID, ten, gioiTinh, ngaySinh, diaChi, email, SDT);
                a = tp;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return a;
    }
    
    
    //Lấy danh sách nhân viên từ CSDL và gán vào danh sách các đối tượng
    public ArrayList<KhachHang> getKhachHang(){
        String cautruyvan = "select * from KHACHHANG";
        ArrayList<KhachHang> listKH = new ArrayList<>();
        try {
            rs =  TP.connection.ExcuteQueryGetTable(cautruyvan); 
            while (rs.next()) {
                String ID = rs.getString("ID_KH");
                String ten = rs.getString("TenKH");
                String SDT = rs.getString("SDT");
                String gioiTinh = rs.getString("GioiTinh");
                String ngaySinh = rs.getString("NgaySinh");
                String diaChi = rs.getString("DiaChi");
                String email = rs.getString("Email");
                KhachHang a = new KhachHang(ID, ten, gioiTinh, ngaySinh, diaChi, email, SDT);
                listKH.add(a);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listKH;
    }
    
    //Tìm kiếm danh sách đối tượng theo mã nhân viên
    public ArrayList<KhachHang> getKhachHangTheoSDT(String search){
        String cautruyvan = "select * from KHACHHANG "
                + "where SDT LIKE N'" + search + "%'";
        ArrayList<KhachHang> listKH = new ArrayList<>();
        try {
            rs =  TP.connection.ExcuteQueryGetTable(cautruyvan); 
            while (rs.next()) {
                String ID = rs.getString("ID_KH");
                String ten = rs.getString("TenKH");
                String SDT = rs.getString("SDT");
                String gioiTinh = rs.getString("GioiTinh");
                String ngaySinh = rs.getString("NgaySinh");
                String diaChi = rs.getString("DiaChi");
                String email = rs.getString("Email");
                KhachHang a = new KhachHang(ID, ten, gioiTinh, ngaySinh, diaChi, email, SDT);
                listKH.add(a);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listKH;
    }
    
    //Tìm kiếm danh sách đối tượng theo tên nhân viên
    public ArrayList<KhachHang> getKhachHangTheoTen(String search){
        String cautruyvan = "select * from KHACHHANG "
                + "where TenKH LIKE N'" + search + "%'";
        ArrayList<KhachHang> listKH = new ArrayList<>();
        try {
            rs =  TP.connection.ExcuteQueryGetTable(cautruyvan); 
            while (rs.next()) {
                String ID = rs.getString("ID_KH");
                String ten = rs.getString("TenKH");
                String SDT = rs.getString("SDT");
                String gioiTinh = rs.getString("GioiTinh");
                String ngaySinh = rs.getString("NgaySinh");
                String diaChi = rs.getString("DiaChi");
                String email = rs.getString("Email");
                KhachHang a = new KhachHang(ID, ten, gioiTinh, ngaySinh, diaChi, email, SDT);
                listKH.add(a);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listKH;
    }
    
    //Thêm một người vào CSDL
    public void addKhachHang(KhachHang a) throws SQLException{
        String TenKH, SDT, GioiTinh, NgaySinh, DiaChi, Email;
        TenKH = a.getTen();
        SDT = a.getSDT();
        GioiTinh = a.getGioiTinh();
        NgaySinh  = a.getNgaySinh();
        DiaChi = a.getDiaChi();
        Email = a.getEmail();
        String cautruyvan = "insert into KHACHHANG values(DEFAULT, N'" 
                + TenKH + "',N'" + GioiTinh + "','" + NgaySinh 
                + "',N'" + DiaChi + "','" + Email +  "','" + SDT + "')";
        System.out.println(cautruyvan);
        TP.connection.ExcuteQueryGetTable(cautruyvan);
        //Update nhan vien
    }
    
    //Xóa một nhân viên khỏi CSDL
    public void deleteKhachHang(KhachHang a) throws SQLException{
        String ID_KH = a.getID_KH();
        String cautruyvan = "delete KHACHHANG where ID_KH='" + ID_KH + "'";
        TP.connection.ExcuteQueryGetTable(cautruyvan);
        //update list nv
    }
    
    //Sửa thông tin của 1 nhân viên
    public void updateKhachHang(KhachHang a) throws SQLException{
        String TenKH, SDT, GioiTinh, NgaySinh, DiaChi, Email;
        TenKH = a.getTen();
        SDT = a.getSDT();
        GioiTinh = a.getGioiTinh();
        NgaySinh  = a.getNgaySinh();
        DiaChi = a.getDiaChi();
        Email = a.getEmail();
        String ID_KH = a.getID_KH();
        String cautruyvan = "UPDATE KHACHHANG SET TenKH = N'" + TenKH + "', GioiTinh = N'" 
                    + GioiTinh + "', NgaySinh = '" + NgaySinh + "', DiaChi = N'" 
                    + DiaChi + "', Email = '" + Email + "', SDT = '" 
                    + SDT + "' where ID_KH = '" + ID_KH + "'"; 
        System.out.println(cautruyvan);
        TP.connection.ExcuteQueryGetTable(cautruyvan);
        //update list nv
    }
    
    public boolean kiemTraKH(String SDT){
        String cautruyvan = "SELECT * FROM KHACHHANG WHERE SDT = '" + SDT +"'";
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        try {
            if(rs.next()) return true;
        } catch (SQLException ex) {
            //Logger.getLogger(SiginUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Kiểm tra xem Khách hàng đã có trong csdl chưa
    public boolean kiemTraKH(KhachHang a){
        String TenKH = a.getTen();
        String SDT = a.getSDT();
        String cautruyvan = "SELECT * FROM KHACHHANG WHERE TenKH = N'" + TenKH +"' and SDT = '" + SDT +"'";
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        try {
            if(rs.next()) return true;
        } catch (SQLException ex) {
            //Logger.getLogger(SiginUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
