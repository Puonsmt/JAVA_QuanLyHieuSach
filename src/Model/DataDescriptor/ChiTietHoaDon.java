
package Model.DataDescriptor;

public class ChiTietHoaDon {
    private Sach sach;
    private int soLuong;

    public ChiTietHoaDon(Sach sach, int soLuong) {
        this.sach = sach;
        this.soLuong = soLuong;
    }

    public ChiTietHoaDon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public long getThanhTien(){
        return sach.getGiaBan()*soLuong;
    }
    
    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
   
    
}
