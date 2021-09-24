
package doanfc2;

import java.util.ArrayList;

public class QLNhanVien {
    
    ArrayList <NhanVien> a = new ArrayList<>();
    
    public ArrayList<NhanVien> getList(){
        return a;
    }
    
    public boolean themMoi(NhanVien x){
        for(NhanVien y: a)
            if(y.getMaNV().equalsIgnoreCase(x.getMaNV())){
                return false;
            }
        a.add(x);
        return true;
    }
    
    public boolean xoaTheoMa(String ma){
        for(NhanVien y: a)
            if(y.getMaNV().equalsIgnoreCase(ma)){
                a.remove(y);
                return true;
            }
        return false;
    }
    
     public NhanVien timTheoMa(String ma){
        for(NhanVien y: a)
            if(y.getMaNV().equalsIgnoreCase(ma)){
                return y;
            }        
        return null;
    }
    
    public ArrayList<NhanVienKhachSan> getLisnhanvien(){
        ArrayList<NhanVienKhachSan> x= new ArrayList<NhanVienKhachSan>();
        for(NhanVien y: a)
            if(y instanceof NhanVienKhachSan)
                x.add((NhanVienKhachSan)y);                
        return x;
    }
    
    public ArrayList<BaoVeKhachSan> getListbaove(){
        ArrayList<BaoVeKhachSan> x= new ArrayList<BaoVeKhachSan>();
        for(NhanVien y: a)
            if(y instanceof BaoVeKhachSan)
                x.add((BaoVeKhachSan)y);                
        return x;
    }
       
    public double tongtien1(){
        double s=0;
        for(NhanVien x: a)
            if(x instanceof NhanVienKhachSan)
                s+=x.tongLuong();
        return s;
    } 
            
    public double tongtien2(){
        double s=0;
        for(NhanVien x: a)
            if(!(x instanceof BaoVeKhachSan))
                s+=x.tongLuong();
        return s;
    } 
 
    
}
