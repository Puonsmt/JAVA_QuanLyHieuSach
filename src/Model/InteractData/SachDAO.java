
package Model.InteractData;

import Model.Connect.TP;
//import Model.DataDescriptor.KhachHang;
import Model.DataDescriptor.Sach;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import javafx.collections.ObservableList;

public class SachDAO {
    //protected static ObservableList<Sach> sach;
    //protected static PreparedStatement s = null;
    protected static ResultSet rs = null;
    //protected static ObservableList<KhachHang> sach_s;
    
    //Lấy một quyển sách từ ID_Sach
    public Sach getMotSachID(String id){
        String cautruyvan = "select * from sach where ID_Sach = '" + id + "'";
        Sach a = null;
        try {
            rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
            while (rs.next()) {                
                String ID = rs.getString("ID_Sach");
                String ten = rs.getString("TenSach");
                String tacGia = rs.getString("TenTG");
                String theLoai = rs.getString("TheLoai");
                int soLuong = rs.getInt("SoLuong");
                int giaBan =  rs.getInt("GiaBan");
                String NXB = rs.getString("TenNXB");
                
                Sach tp = new Sach(ID, ten, soLuong, giaBan, theLoai, tacGia, NXB);
                a = tp;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return a;
    }
    
    //Lấy danh sách nhân viên từ CSDL và gán vào danh sách các đối tượng
    public ArrayList<Sach> getSach(){
        String cautruyvan = "select * from SACH";
        ArrayList<Sach> listS = new ArrayList<>();
        try {
            rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
            while (rs.next()) {                
                String ID = rs.getString("ID_Sach");
                String ten = rs.getString("TenSach");
                String tacGia = rs.getString("TenTG");
                String theLoai = rs.getString("TheLoai");
                int soLuong = rs.getInt("SoLuong");
                int giaBan =  rs.getInt("GiaBan");
                String NXB = rs.getString("TenNXB");
                
                Sach a = new Sach(ID, ten, soLuong, giaBan, theLoai, tacGia, NXB);
                listS.add(a);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listS;
    }
    
    //Tìm kiếm danh sách đối tượng theo mã nhân viên
    public ArrayList<Sach> getSachTheoMa(String search){
        String cautruyvan = "select * from SACH "
                + "where ID_Sach LIKE N'" + search + "%'";
        ArrayList<Sach> listS = new ArrayList<>();
        try {
            rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
            while (rs.next()) {                
                String ID = rs.getString("ID_Sach");
                String ten = rs.getString("TenSach");
                String tacGia = rs.getString("TenTG");
                String theLoai = rs.getString("TheLoai");
                int soLuong = rs.getInt("SoLuong");
                int giaBan =  rs.getInt("GiaBan");
                String NXB = rs.getString("TenNXB");
                
                Sach a = new Sach(ID, ten, soLuong, giaBan, theLoai, tacGia, NXB);
                listS.add(a);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listS;
    }
    
    //Tìm kiếm danh sách đối tượng theo tên nhân viên
    public ArrayList<Sach> getSachTheoTen(String search){
        String cautruyvan = "select * from SACH "
                + "where TenSach LIKE N'" + search + "%'";
        ArrayList<Sach> listS = new ArrayList<>();
        try {
            rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
            while (rs.next()) {                
                String ID = rs.getString("ID_Sach");
                String ten = rs.getString("TenSach");
                String tacGia = rs.getString("TenTG");
                String theLoai = rs.getString("TheLoai");
                int soLuong = rs.getInt("SoLuong");
                int giaBan =  rs.getInt("GiaBan");
                String NXB = rs.getString("TenNXB");
                
                Sach a = new Sach(ID, ten, soLuong, giaBan, theLoai, tacGia, NXB);
                listS.add(a);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listS;
    }
    
    //Thêm một người vào CSDL
    public void addSach(Sach a) throws SQLException{
        String TenSach, TacGia, TheLoai, NXB, DonGia, SoLuong;
        TenSach = a.getTen();
        TacGia = a.getTacGia();
        TheLoai = a.getTheLoai();
        NXB = a.getNXB();
        SoLuong = String.valueOf(a.getSoLuong());
        DonGia = String.valueOf(a.getGiaBan());
        String cautruyvan = "INSERT INTO SACH VALUES (DEFAULT, N'" + TenSach 
                + "'," + SoLuong + "," + DonGia + ", N'" + TheLoai + "', N'" 
                + TacGia + "', N'" + NXB + "')";
        TP.connection.ExcuteQueryGetTable(cautruyvan);
        //Update nhan vien
    }
    
    //Xóa một nhân viên khỏi CSDL
    public void deleteSach(Sach a) throws SQLException{
        String ID_Sach = a.getID_Sach();
        String cautruyvan = "delete SACH where ID_Sach='" + ID_Sach + "'";
        TP.connection.ExcuteQueryGetTable(cautruyvan);
        //update list nv
    }
    
    //Sửa thông tin của 1 nhân viên
    public void updateSach(Sach a) throws SQLException{
        String TenSach, TacGia, TheLoai, NXB, DonGia, SoLuong;
        TenSach = a.getTen();
        TacGia = a.getTacGia();
        TheLoai = a.getTheLoai();
        NXB = a.getNXB();
        SoLuong = String.valueOf(a.getSoLuong());
        DonGia = String.valueOf(a.getGiaBan());
        String ID_Sach = a.getID_Sach();
        String cautruyvan = "UPDATE SACH SET TenSach = N'" + TenSach + "', SoLuong = " 
                    + SoLuong + ", GiaBan = " + DonGia + ", TheLoai = N'" + TheLoai + "', TenTG = N'"
                    + TacGia + "', TenNXB = N'" + NXB + "' where ID_Sach = '" + ID_Sach + "'";  
        TP.connection.ExcuteQueryGetTable(cautruyvan);
        //update list nv
    }
}
