package poly.edu.Service;

public class HocLucService {
    //Truyền tham số trực tiếp, không cần thông qua đối tượng SinhVien
    public String xepLoaiHocLuc(double diem){
        //áp dụng cách ném lỗi
        if (diem < 0 || diem > 10){
            throw new IllegalArgumentException("Diem phai tu 0 - 10");
        }
        if (diem >= 9.0) return "Xuat sac";
        if (diem >= 7.0) return "Gioi";
        if (diem >= 5.0) return "TrungBinh";
        return "Yeu";
    }



}
