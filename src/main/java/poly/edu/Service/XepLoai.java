package poly.edu.Service;

public class XepLoai {
    public String xepLoai(double diemTrungBinh) {
        if (diemTrungBinh < 0 || diemTrungBinh > 10) {
            throw new IllegalArgumentException("Diem trung binh chi trong khoang 0-10");
        }
        if (diemTrungBinh >= 9) {
            return "Xuất sắc";
        }
        if (diemTrungBinh >= 7 || diemTrungBinh < 9) {
            return "Giỏi";
        }
        if (diemTrungBinh >= 5 || diemTrungBinh < 7) {
            return "Trung bình";
        }
        if (diemTrungBinh < 5) {
            return "Yếu";
        }

        throw new IllegalArgumentException("Diem trung binh khong duoc de trong");
    }
}


