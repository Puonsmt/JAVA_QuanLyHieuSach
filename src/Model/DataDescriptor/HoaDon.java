
package Model.DataDescriptor;

import java.util.ArrayList;

public class HoaDon {
    private String ID_HD;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private ArrayList<ChiTietHoaDon> chiTietSach = new ArrayList<>();
    private String ngayXuat;

    public HoaDon(String ID_HD, KhachHang khachHang, NhanVien nhanVien, ArrayList<ChiTietHoaDon> chiTietSach, String ngayXuat) {
        this.ID_HD = ID_HD;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.chiTietSach = chiTietSach;
        this.ngayXuat = ngayXuat;
    }

    public long getTongTien(){
        long tong = 0;
        for(ChiTietHoaDon x : chiTietSach){
            tong += x.getThanhTien();
        }
        return tong;
    }

    public ArrayList<ChiTietHoaDon> getChiTietSach() {
        return chiTietSach;
    }

    public void setChiTietSach(ArrayList<ChiTietHoaDon> chiTietSach) {
        this.chiTietSach = chiTietSach;
    }
    
    public String getID_HD() {
        return ID_HD;
    }

    public void setID_HD(String ID_HD) {
        this.ID_HD = ID_HD;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }
    
    
}
