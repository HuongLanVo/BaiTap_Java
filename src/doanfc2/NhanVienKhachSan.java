
package doanfc2;

import java.util.Date;

public class NhanVienKhachSan extends NhanVien{
    private String chucVu;
    private int HSL;

    public NhanVienKhachSan() {
        super();
        chucVu=null;
        HSL=0;
        
    }

    public NhanVienKhachSan( String maNV, String ten, String gmail, String gioiTinh, String SDT, String diaChi, String ngaySinh, double luong,String chucVu, int HSL) {
        super(maNV, ten, gmail, gioiTinh, SDT, diaChi, ngaySinh, luong);
        this.chucVu = chucVu;
        this.HSL = HSL;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getHSL() {
        return HSL;
    }

    public void setHSL(int HSL) {
        this.HSL = HSL;
    }
    
    @Override
    public double tongLuong() {
        return getLuong() *  getHSL();
    }

    @Override
    public String toString() {
        return super.toString()+" " + chucVu + " " + HSL + " "+ tongLuong();
    }
    
    

    
}
