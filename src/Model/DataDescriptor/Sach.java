
package Model.DataDescriptor;

public class Sach {
    private String ID_Sach;
    private String ten;
    private int soLuong;
    private int giaBan;
    private String theLoai;
    private String tacGia;
    private String NXB;

    public Sach(String ID_Sach, String ten, int soLuong, int giaBan, String theLoai, String tacGia, String NXB) {
        this.ID_Sach = ID_Sach;
        this.ten = ten;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
        this.NXB = NXB;
    }

    public Sach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getID_Sach() {
        return ID_Sach;
    }

    public void setID_Sach(String ID_Sach) {
        this.ID_Sach = ID_Sach;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }
 
    
}
