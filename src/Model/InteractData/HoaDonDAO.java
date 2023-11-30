
package Model.InteractData;

import Model.Connect.TP;
import Model.DataDescriptor.ChiTietHoaDon;
import Model.DataDescriptor.HoaDon;
import Model.DataDescriptor.KhachHang;
import Model.DataDescriptor.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sun.util.logging.PlatformLogger.Level;

public class HoaDonDAO {
    protected static ResultSet rs = null;
    protected static ChiTietHoaDonDAO editCTHD = new ChiTietHoaDonDAO();
    protected static KhachHangDAO editKH = new KhachHangDAO();
    protected static NhanVienDAO editNV = new NhanVienDAO();
    public static String idVuaTao;
    
    //Lấy ra một hóa đơn từ csdl theo ID_HD
    public HoaDon getMotHoaDonTheoID(String ID_HD){
        String cautruyvan  = "select HOADON.ID_HoaDon, HOADON.ID_NV, KHACHHANG.ID_KH,HOADON.NgayXuat \n" +
                            "FROM HOADON\n" +
                            "INNER JOIN NHANVIEN ON HOADON.ID_NV = NHANVIEN.ID_NV\n" +
                            "INNER JOIN KHACHHANG ON HOADON.ID_KH = KHACHHANG.ID_KH\n" +
                            "WHERE HOADON.ID_HoaDon = '" + ID_HD + "'";
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        HoaDon a = null;
        try {
            while (rs.next()) {
                String ID = rs.getString("ID_HoaDon");
                System.out.println("Đã lấy ID hóa đơn");
                KhachHang kh1 = editKH.getKHTheoMa(rs.getString("ID_KH"));
                System.out.println("đã lấy khách hàng");
                NhanVien nv1 = editNV.getNVTheoMa(rs.getString("ID_NV"));
                System.out.println("đã lấy nhân viên");
                ArrayList<ChiTietHoaDon> chiTietSach = editCTHD.getChiTietHoaDonTheoID(ID);
                String ngayXuat = rs.getString("NgayXuat");
                HoaDon tp = new  HoaDon(ID, kh1, nv1,chiTietSach, ngayXuat);
                a = tp;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return a;
    }
    
    //Lấy dữ liệu là danh sách hóa đơn từ csdl
    public ArrayList<HoaDon> getHoaDon(){
        String cautruyvan  = "select HOADON.ID_HoaDon, HOADON.ID_NV, KHACHHANG.ID_KH," 
                + " HOADON.NgayXuat\n" 
                + "FROM HOADON\n" 
                + "INNER JOIN NHANVIEN ON HOADON.ID_NV = NHANVIEN.ID_NV\n" 
                + "INNER JOIN KHACHHANG ON HOADON.ID_KH = KHACHHANG.ID_KH";
        System.out.println(cautruyvan);
        ArrayList<HoaDon> listHD = new ArrayList<>();
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        System.out.println("đã thực hiện truy vấn hóa đơn");
        try {
            while (rs.next()) {
                String ID = rs.getString("ID_HoaDon");
                System.out.println("Đã lấy ID hóa đơn");
                KhachHang kh1 = editKH.getKHTheoMa(rs.getString("ID_KH"));
                System.out.println("đã lấy khách hàng");
                NhanVien nv1 = editNV.getNVTheoMa(rs.getString("ID_NV"));
                System.out.println("đã lấy nhân viên");
                ArrayList<ChiTietHoaDon> chiTietSach = editCTHD.getChiTietHoaDonTheoID(ID);
                String ngayXuat = rs.getString("NgayXuat");
                HoaDon a = new  HoaDon(ID, kh1, nv1,chiTietSach, ngayXuat);
                listHD.add(a);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listHD;
    }
    
    //Lấy danh sách Hóa Đơn theo mã hóa đơn
    public ArrayList<HoaDon> getHoaDonTheoID(String id_hd){
        String cautruyvan = "select HOADON.ID_HoaDon, HOADON.ID_NV, KHACHHANG.ID_KH," 
                + " HOADON.NgayXuat\n" 
                + "FROM HOADON\n" 
                + "INNER JOIN NHANVIEN ON HOADON.ID_NV = NHANVIEN.ID_NV\n" 
                + "INNER JOIN KHACHHANG ON HOADON.ID_KH = KHACHHANG.ID_KH\n"
                + "where ID_HoaDon LIKE N'" + id_hd + "%'";
        System.out.println(cautruyvan);
        ArrayList<HoaDon> listHD = new ArrayList<>();
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        System.out.println("đã thực hiện truy vấn hóa đơn theo thời gian");
        try {
            while (rs.next()) {
                String ID = rs.getString("ID_HoaDon");
                System.out.println("Đã lấy ID hóa đơn");
                KhachHang kh1 = editKH.getKHTheoMa(rs.getString("ID_KH"));
                System.out.println("đã lấy khách hàng");
                NhanVien nv1 = editNV.getNVTheoMa(rs.getString("ID_NV"));
                System.out.println("đã lấy nhân viên");
                ArrayList<ChiTietHoaDon> chiTietSach = editCTHD.getChiTietHoaDonTheoID(ID);
                String ngayXuat = rs.getString("NgayXuat");
                HoaDon a = new  HoaDon(ID, kh1, nv1,chiTietSach, ngayXuat);
                listHD.add(a);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listHD;
    }
    
    
    //Lấy danh sách Hóa Đơn trong khoảng thời gian NgayBD và NgayKT
    public ArrayList<HoaDon> getHoaDonTheoThoiGian(String NgayBD, String NgayKT){
        String cautruyvan = "select HOADON.ID_HoaDon, HOADON.ID_NV, KHACHHANG.ID_KH," 
                + " HOADON.NgayXuat\n" 
                + "FROM HOADON\n" 
                + "INNER JOIN NHANVIEN ON HOADON.ID_NV = NHANVIEN.ID_NV\n" 
                + "INNER JOIN KHACHHANG ON HOADON.ID_KH = KHACHHANG.ID_KH\n"
                + "where HOADON.NgayXuat >= '"+ NgayBD + "' AND HOADON.NgayXuat <= '" + NgayKT +"'";
        System.out.println(cautruyvan);
        ArrayList<HoaDon> listHD = new ArrayList<>();
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        System.out.println("đã thực hiện truy vấn hóa đơn theo thời gian");
        try {
            while (rs.next()) {
                String ID = rs.getString("ID_HoaDon");
                System.out.println("Đã lấy ID hóa đơn");
                KhachHang kh1 = editKH.getKHTheoMa(rs.getString("ID_KH"));
                System.out.println("đã lấy khách hàng");
                NhanVien nv1 = editNV.getNVTheoMa(rs.getString("ID_NV"));
                System.out.println("đã lấy nhân viên");
                ArrayList<ChiTietHoaDon> chiTietSach = editCTHD.getChiTietHoaDonTheoID(ID);
                String ngayXuat = rs.getString("NgayXuat");
                HoaDon a = new  HoaDon(ID, kh1, nv1,chiTietSach, ngayXuat);
                listHD.add(a);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listHD;
    }
    
    //Tạo Thêm một hóa đơn mới
    public void addHoaDon(String ID_KH, String ID_NV, String ngayTao) throws SQLException{
        String cautruyvan = "EXEC TaoHoaDon @ID_KH = '" + ID_KH + "', @ID_NV = '" + ID_NV 
                +"', @NgayTao = '"+ ngayTao + "'";
        System.out.println(cautruyvan);
        TP.connection.ExcuteQueryGetTable(cautruyvan);
        String cautruyvan2 = "SELECT dbo.LayID_HoaDonVuaTao()";
        ResultSet rs2 = TP.connection.ExcuteQueryGetTable(cautruyvan2);
        if(rs2.next()) idVuaTao = rs2.getString("");    
    }
}
