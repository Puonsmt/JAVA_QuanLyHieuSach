
package Model.DataDescriptor;

public class TaiKhoan {
    private String ID_TK;
    private String loaiTK;
    private NhanVien nhanVien;
    private String tenDN;
    private String matKhau;

    public TaiKhoan(String ID_TK, String loaiTK, NhanVien nhanVien, String tenDN, String matKhau) {
        this.ID_TK = ID_TK;
        this.loaiTK = loaiTK;
        this.nhanVien = nhanVien;
        this.tenDN = tenDN;
        this.matKhau = matKhau;
    }
    
    public String getID_TK() {
        return ID_TK;
    }

    public void setID_TK(String ID_TK) {
        this.ID_TK = ID_TK;
    }

    public String getLoaiTK() {
        return loaiTK;
    }

    public void setLoaiTK(String loaiTK) {
        this.loaiTK = loaiTK;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    
}
