
package Model.InteractData;

import Model.Connect.TP;
import Model.DataDescriptor.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NhanVienDAO {
    //protected static ObservableList<NhanVien> nhanVien;
    //protected static PreparedStatement nv = null;
    protected static ResultSet rs = null;
    //protected static ObservableList<NhanVien> Nhanvien;
    
    //Lấy Nhân viên với ID_NV từ CSDL
    public NhanVien getNVTheoMa(String ID_NV){
        String cautruyvan = "SELECT * FROM NHANVIEN WHERE ID_NV = '" + ID_NV + "'";
        System.out.println(cautruyvan);
        rs =  TP.connection.ExcuteQueryGetTable(cautruyvan);
        NhanVien a = null;
        try {
            if (rs.next()) {
                System.out.println("lưu thông tin khách hàng");
                String ID = rs.getString("ID_NV");
                String ten = rs.getString("TenNV");
                String SDT = rs.getString("SDT");
                String gioiTinh = rs.getString("GioiTinh");
                String ngaySinh = rs.getString("NgaySinh");
                String diaChi = rs.getString("DiaChi");
                NhanVien tp = new NhanVien(ID, ten, gioiTinh, ngaySinh, diaChi, SDT);    
                a = tp;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return a;
    }
    
    //Lấy danh sách nhân viên từ CSDL và gán vào danh sách các đối tượng
    public ArrayList<NhanVien> getNhanVien(){
        String cautruyvan = "select * from NHANVIEN";
        ArrayList<NhanVien> listNV = new ArrayList<>();
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        try {
            while (rs.next()) {
                String ID = rs.getString("ID_NV");
                String ten = rs.getString("TenNV");
                String SDT = rs.getString("SDT");
                String gioiTinh = rs.getString("GioiTinh");
                String ngaySinh = rs.getString("NgaySinh");
                String diaChi = rs.getString("DiaChi");
                NhanVien a = new NhanVien(ID, ten, gioiTinh, ngaySinh, diaChi, SDT);
                listNV.add(a);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listNV;
    }
    
    //Tìm kiếm danh sách đối tượng theo mã nhân viên
    public ArrayList<NhanVien> getNhanVienTheoMa(String search){
        String cautruyvan = "select * from NHANVIEN "
                + "where ID_NV LIKE N'" + search + "%'";
        ArrayList<NhanVien> listNV = new ArrayList<>();
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        try {
            while (rs.next()) {
                String ID = rs.getString("ID_NV");
                String ten = rs.getString("TenNV");
                String SDT = rs.getString("SDT");
                String gioiTinh = rs.getString("GioiTinh");
                String ngaySinh = rs.getString("NgaySinh");
                String diaChi = rs.getString("DiaChi");
                NhanVien a = new NhanVien(ID, ten, gioiTinh, ngaySinh, diaChi, SDT);
                listNV.add(a);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listNV;
    }
    
    //Tìm kiếm danh sách đối tượng theo tên nhân viên
    public ArrayList<NhanVien> getNhanVienTheoTen(String search){
        String cautruyvan = "select * from NHANVIEN "
                + "where TenNV LIKE N'" + search + "%'";
        ArrayList<NhanVien> listNV = new ArrayList<>();
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        try {
            while (rs.next()) {
                String ID = rs.getString("ID_NV");
                String ten = rs.getString("TenNV");
                String SDT = rs.getString("SDT");
                String gioiTinh = rs.getString("GioiTinh");
                String ngaySinh = rs.getString("NgaySinh");
                String diaChi = rs.getString("DiaChi");
                NhanVien a = new NhanVien(ID, ten, gioiTinh, ngaySinh, diaChi, SDT);
                listNV.add(a);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listNV;
    }
    
    //Thêm một người vào CSDL
    public void addNhanVien(NhanVien a) throws SQLException{
        String TenNV, SDT, GioiTinh = null, NgaySinh, DiaChi;
        TenNV = a.getTen();
        SDT = a.getSDt();
        GioiTinh = a.getGioiTinh();
        NgaySinh  = a.getNgaySinh();
        DiaChi = a.getDiaChi();
        String cautruyvan = "insert into NHANVIEN values( DEFAULT, N'" 
                + TenNV + "',N'" + GioiTinh + "','" + NgaySinh + "',N'" 
                + DiaChi +  "','" + SDT + "')";
        TP.connection.ExcuteQueryGetTable(cautruyvan);
        //Update nhan vien
    }
    
    //Xóa một nhân viên khỏi CSDL
    public void deleteNhanVien(NhanVien a) throws SQLException{
        String ID_NV = a.getID_NV();
        String cautruyvan = "delete NHANVIEN where ID_NV='" + ID_NV + "'";
        TP.connection.ExcuteQueryUpdateDB(cautruyvan);
        //update list nv
    }
    
    //Sửa thông tin của 1 nhân viên
    public void updateNhanVien(NhanVien a) throws SQLException{
        String TenNV, SDT, GioiTinh, NgaySinh, DiaChi;
        TenNV = a.getTen();
        SDT = a.getSDt();
        GioiTinh = a.getGioiTinh();
        NgaySinh  = a.getNgaySinh();
        DiaChi = a.getDiaChi();
        String ID_NV = a.getID_NV();
        String cautruyvan = "UPDATE NHANVIEN SET TenNV = N'" + TenNV + "', GioiTinh = N'" 
                    + GioiTinh + "', NgaySinh = '" + NgaySinh + "', DiaChi = N'" 
                    + DiaChi + "', SDT = '" + SDT + "' where ID_NV = '" + ID_NV + "'"; 
        TP.connection.ExcuteQueryUpdateDB(cautruyvan);
        //update list nv
    }
}
