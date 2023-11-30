/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.InteractData;

import Model.Connect.TP;
import Model.DataDescriptor.NhanVien;
import Model.DataDescriptor.TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaiKhoanDAO {
    protected static ResultSet rs = null;
    protected static NhanVienDAO contrNV = new NhanVienDAO();
    
    public boolean kiemTraTK(String ID_NV){
        String cautruyvan = "select *from TAIKHOAN where ID_NV = '" + ID_NV + "'";
        System.out.println(cautruyvan);
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        try {
            if(rs.next()) return true;
        } catch (SQLException ex) {
            //Logger.getLogger(SiginUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public TaiKhoan getTaiKhoan(String tdn, String mk){
        String cautruyvan="select * from TAIKHOAN where TenDangNhap= '"+ tdn +"' and MatKhau= '"+ mk +"'";
        System.out.println(cautruyvan);
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        TaiKhoan a = null;
        try {
            if (rs.next()){
                String ID_TK = rs.getString("ID_TK");
                String loaiTK = rs.getString("LoaiTaiKhoan");
                String ID_NV = rs.getString("ID_NV");
                NhanVien nv1 = contrNV.getNVTheoMa(ID_NV);
                TaiKhoan tp = new TaiKhoan(ID_TK, loaiTK, nv1, tdn, mk);
                a = tp;
            }
        } catch (SQLException ex) {
            System.out.println("lỗi đăng nhập");
        }
        return a;
    }
    
    public boolean kiemTraDN(String tdn, String mk){
        String cautruyvan="select * from TAIKHOAN where TenDangNhap= '"+ tdn +"' and MatKhau= '"+ mk +"'";
        rs = TP.connection.ExcuteQueryGetTable(cautruyvan);
        System.out.println(cautruyvan);
        try {
            if (rs.next()) return true;
        } catch (SQLException ex) {
            System.out.println("lỗi đăng nhập");
        }

        return false;
    }
    public void taoTK(TaiKhoan a){
        String MaNhanVien = a.getNhanVien().getID_NV();
        String TenDangNhap = a.getTenDN();
        String Password = a.getMatKhau();
        String cautruyvan = "insert into TAIKHOAN values(DEFAULT," + "'Staff','" + MaNhanVien
                    + "' ,'" + TenDangNhap + "' , '" + Password + "')";
        TP.connection.ExcuteQueryGetTable(cautruyvan);
    }
}
