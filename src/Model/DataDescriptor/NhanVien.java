/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DataDescriptor;

/**
 *
 * @author PC
 */
public class NhanVien {
    private String ID_NV;
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String SDt;

    public NhanVien(String ID_NV, String ten, String gioiTinh, String ngaySinh, String diaChi, String SDt) {
        this.ID_NV = ID_NV;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.SDt = SDt;
    }

    public NhanVien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getID_NV() {
        return ID_NV;
    }

    public void setID_NV(String ID_NV) {
        this.ID_NV = ID_NV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDt() {
        return SDt;
    }

    public void setSDt(String SDt) {
        this.SDt = SDt;
    }
    
    
    
}
