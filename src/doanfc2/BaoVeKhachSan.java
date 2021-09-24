
package doanfc2;

import java.util.Date;

public class BaoVeKhachSan extends NhanVien{
    private String khuVucBaoVe;
    private int heSoGio;

    public BaoVeKhachSan() {
        super();
        khuVucBaoVe=null;
        heSoGio=0;
    }

    public BaoVeKhachSan( String maNV, String ten, String gmail, String gioiTinh, String SDT, String diaChi, String ngaySinh, double luong,String khuVucBaoVe, int heSoGio) {
        super(maNV, ten, gmail, gioiTinh, SDT, diaChi, ngaySinh, luong);
        this.khuVucBaoVe = khuVucBaoVe;
        this.heSoGio = heSoGio;
    }

    public String getKhuVucBaoVe() {
        return khuVucBaoVe;
    }

    public void setKhuVucBaoVe(String khuVucBaoVe) {
        this.khuVucBaoVe = khuVucBaoVe;
    }

    public int getHeSoGio() {
        return heSoGio;
    }

    public void setHeSoGio(int heSoGio) {
        this.heSoGio = heSoGio;
    }
    
    @Override
    public double tongLuong() {
        return getLuong() * getHeSoGio();
    }

    @Override
    public String toString() {
        return super.toString()+" " +  khuVucBaoVe + " " + heSoGio +" "+ tongLuong();
    }
    
    
    
}
