
package doanfc2;

import java.util.Date;

public abstract class NhanVien implements IDKhachSan{
    protected String maNV, ten, gmail, gioiTinh, SDT, diaChi;
    protected  String ngaySinh;
    protected double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String ten, String gmail, String gioiTinh, String SDT, String diaChi, String ngaySinh, double luong) {
        this.maNV = maNV;
        this.ten = ten;
        this.gmail = gmail;
        this.gioiTinh = gioiTinh;
        this.SDT = SDT;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public double tongLuong() {
        return 0;
    }
 

    @Override
    public String toString() {
        return "NhanVien : " + maNV + " " + ten + " " + gmail + " " + gioiTinh + " " + SDT + " " + diaChi + " " + ngaySinh + " " + luong ;
    }
    
    
    
    
}
