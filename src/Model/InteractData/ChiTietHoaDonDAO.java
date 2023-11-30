
package Model.InteractData;

import Model.Connect.TP;
import Model.DataDescriptor.ChiTietHoaDon;
import Model.DataDescriptor.HoaDon;
import Model.DataDescriptor.NhanVien;
import Model.DataDescriptor.Sach;
import static Model.InteractData.NhanVienDAO.rs;
import static Model.InteractData.SachDAO.rs;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChiTietHoaDonDAO {
    protected static ResultSet rs = null;
    protected static SachDAO editS = new SachDAO();
    
    //Trả về một chi tiết hóa đơn dựa vào ID_HD và ID_Sách
    public ChiTietHoaDon getMotCTHD(String ID_HD, String ID_Sach){
        String cautruyvan = "SELECT SACH.*,CHI_TIET_HOA_DON.SoLuong as soLuongMua\n" +
                    "FROM CHI_TIET_HOA_DON\n" +
                    "INNER JOIN SACH ON CHI_TIET_HOA_DON.ID_Sach = SACH.ID_Sach\n" +
                    "WHERE CHI_TIET_HOA_DON.ID_HoaDon = '" + ID_HD +"' and SACH.ID_Sach = '" + ID_Sach +"'";
        ChiTietHoaDon ct = new ChiTietHoaDon();
        try {
            if (rs.next()) {
                String ID = rs.getString("ID_Sach");
                String ten = rs.getString("TenSach");
                String tacGia = rs.getString("TenTG");
                String theLoai = rs.getString("TheLoai");
                int soLuong = rs.getInt("SoLuong");
                int giaBan =  rs.getInt("GiaBan");
                String NXB = rs.getString("TenNXB");
                
                Sach tp = new Sach(ID, ten, soLuong, giaBan, theLoai, tacGia, NXB);
                int soLuongMua = rs.getInt("soLuongMua");
                ChiTietHoaDon ct1 = new ChiTietHoaDon(tp, soLuongMua);
                ct = ct1;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return ct;
    }
    
    //Lấy danh sách chi tiết hóa đơn của hóa đơn a theo ID_HD
    public ArrayList<ChiTietHoaDon> getChiTietHoaDonTheoID(String ID_HD){
        String cautruyvan = "SELECT SACH.*, CHI_TIET_HOA_DON.SoLuong as soLuongMua\n" +
"                FROM CHI_TIET_HOA_DON\n" +
"                INNER JOIN SACH ON CHI_TIET_HOA_DON.ID_Sach = SACH.ID_Sach\n" +
"                WHERE CHI_TIET_HOA_DON.ID_HoaDon = '" + ID_HD + "'";
        ArrayList<ChiTietHoaDon> listCTHD = new ArrayList<>();
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        try {
            while (rs.next()) {
                String ID = rs.getString("ID_Sach");
                String ten = rs.getString("TenSach");
                String tacGia = rs.getString("TenTG");
                String theLoai = rs.getString("TheLoai");
                int soLuong = rs.getInt("SoLuong");
                int giaBan =  rs.getInt("GiaBan");
                String NXB = rs.getString("TenNXB");
                
                Sach tp = new Sach(ID, ten, soLuong, giaBan, theLoai, tacGia, NXB);
                int soLuongMua = rs.getInt("soLuongMua");
                ChiTietHoaDon ct1 = new ChiTietHoaDon(tp, soLuongMua);
                listCTHD.add(ct1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listCTHD;
    }
    
    //Lấy dữ liệu là danh sách chi tiết hóa đơn của hóa đơn a
    public ArrayList<ChiTietHoaDon> getChiTietHoaDon(HoaDon a){
        String cautruyvan = "SELECT SACH.*, CHI_TIET_HOA_DON.SoLuong as soLuongMua\n" +
"                FROM CHI_TIET_HOA_DON\n" +
"                INNER JOIN SACH ON CHI_TIET_HOA_DON.ID_Sach = SACH.ID_Sach\n" +
"                WHERE CHI_TIET_HOA_DON.ID_HoaDon = '" + a.getID_HD() + "'";
        ArrayList<ChiTietHoaDon> listCTHD = new ArrayList<>();
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        try {
            while (rs.next()) {
                String ID = rs.getString("ID_Sach");
                String ten = rs.getString("TenSach");
                String tacGia = rs.getString("TenTG");
                String theLoai = rs.getString("TheLoai");
                int soLuong = rs.getInt("SoLuong");
                int giaBan =  rs.getInt("GiaBan");
                String NXB = rs.getString("TenNXB");
                
                Sach tp = new Sach(ID, ten, soLuong, giaBan, theLoai, tacGia, NXB);
                int soLuongMua = rs.getInt("soLuongMua");
                ChiTietHoaDon ct1 = new ChiTietHoaDon(tp, soLuongMua);
                listCTHD.add(ct1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listCTHD;
    }
    
    public ArrayList<ChiTietHoaDon> getChiTietHoaDon(String ID_HD){
        String cautruyvan = "SELECT SACH.*, CHI_TIET_HOA_DON.SoLuong as soLuongMua\n" +
"                FROM CHI_TIET_HOA_DON\n" +
"                INNER JOIN SACH ON CHI_TIET_HOA_DON.ID_Sach = SACH.ID_Sach\n" +
"                WHERE CHI_TIET_HOA_DON.ID_HoaDon = '" + ID_HD + "'";
        ArrayList<ChiTietHoaDon> listCTHD = new ArrayList<>();
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        try {
            while (rs.next()) {
                String ID = rs.getString("ID_Sach");
                String ten = rs.getString("TenSach");
                String tacGia = rs.getString("TenTG");
                String theLoai = rs.getString("TheLoai");
                int soLuong = rs.getInt("SoLuong");
                int giaBan =  rs.getInt("GiaBan");
                String NXB = rs.getString("TenNXB");
                
                Sach tp = new Sach(ID, ten, soLuong, giaBan, theLoai, tacGia, NXB);
                int soLuongMua = rs.getInt("soLuongMua");
                ChiTietHoaDon ct1 = new ChiTietHoaDon(tp, soLuongMua);
                listCTHD.add(ct1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listCTHD;
    }
    
    //Thêm một quyển Sách vào hóa đơn a
    public void addChiTietHoaDon(HoaDon a, ChiTietHoaDon ct) throws SQLException{
        String ID_HD = a.getID_HD();
        Sach sachCanThem = ct.getSach();
        String soLuong = String.valueOf(ct.getSoLuong());
        String cautruyvan = "insert into CHI_TIET_HOA_DON values('" + ID_HD + "' ,'" 
                            + sachCanThem.getID_Sach() + "'," + soLuong + ")";
        TP.connection.ExcuteQueryGetTable(cautruyvan);
        int so = sachCanThem.getSoLuong() - ct.getSoLuong();
        sachCanThem.setSoLuong(so);
        editS.updateSach(sachCanThem);
        TP.connection.ExcuteQueryGetTable(cautruyvan);
    }
    
    //Xóa một quyển Sách khỏi Hóa Đơn a
    public void deleteChiTietHoaDon(HoaDon a, ChiTietHoaDon ct) throws SQLException{
        String ID_HD = a.getID_HD();
        Sach sachCanXoa = ct.getSach();
        String cautruyvan = "Delete CHI_TIET_HOA_DON where ID_HoaDon = '"
                + ID_HD +"' and ID_Sach = '" + sachCanXoa.getID_Sach() +"'";
        System.out.println(cautruyvan);
        TP.connection.ExcuteQueryGetTable(cautruyvan);
        int so = sachCanXoa.getSoLuong() + ct.getSoLuong();
        sachCanXoa.setSoLuong(so);
        editS.updateSach(sachCanXoa);
    }
}















