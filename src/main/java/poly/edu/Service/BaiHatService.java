package poly.edu.Service;

import poly.edu.Entity.BaiHat;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    List<BaiHat> lstBaiHat = new ArrayList<>();

    public void add(BaiHat baiHat) {
        if (baiHat == null) {
            throw new NullPointerException("Khong tim thay bai hat");
        }
        if (baiHat.getMa() == null || baiHat.getMa().trim().isEmpty()) {
            throw new IllegalArgumentException("Ma bai hat khong duoc de trong");
        }
        if ((baiHat.getTen() == null || baiHat.getTen().trim().isEmpty())) {
            throw new IllegalArgumentException("Ten bai hat khong duoc de trong");
        }
        if (baiHat.getTenCaSi() == null || baiHat.getTenCaSi().trim().isEmpty()) {
            throw new IllegalArgumentException("Ten ca si khong duoc de trong");
        }
        if (baiHat.getTheLoai() == null || baiHat.getTheLoai().trim().isEmpty()) {
            throw new IllegalArgumentException("The loai bai hat khong duoc de trong");
        }
        if (baiHat.getThoiLuong() < 0) {
            throw new IllegalArgumentException("Thoi luong bai hat phai lon hon 0");
        }
        if (baiHat.getThoiLuong() < 2 || baiHat.getThoiLuong() > 5.59f) {
            throw new IllegalArgumentException("Thoi luong bai hat phai trong khoang 2 - 5,59");
        }
        lstBaiHat.add(baiHat);
    }

    public int size() {
        return lstBaiHat.size();
    }
























































//    private List<BaiHat> list = new ArrayList<>();
//
//    public List<BaiHat> getAll() { return list; }
//
//    // Chức năng Thêm (Add)
//    public void them(BaiHat bh) {
//        if (bh == null) throw new IllegalArgumentException("Đối tượng không được null");
//
//        // Validate TRỐNG cho tất cả các trường String (Điểm quan trọng)
//        if (bh.getMa().isBlank() || bh.getTen().isBlank() ||
//                bh.getTenCaSi().isBlank() || bh.getTheLoai().isBlank()) {
//            throw new IllegalArgumentException("Các trường không được để trống");
//        }
//
//        // Validate Biên thời lượng (120s - 359s)
//        if (bh.getThoiLuong() < 120 || bh.getThoiLuong() > 359) {
//            throw new IllegalArgumentException("Thời lượng phải từ 120s đến 359s");
//        }
//
//        list.add(bh);
//    }
//
//    // Chức năng Sửa (Update)
//    public void sua(String ma, BaiHat newBh) {
//        if (newBh == null) throw new IllegalArgumentException("Dữ liệu mới không hợp lệ");
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getMa().equals(ma)) {
//                // Sửa cũng phải validate trống trường mới
//                if (newBh.getTen().isBlank() || newBh.getTenCaSi().isBlank() || newBh.getTheLoai().isBlank()) {
//                    throw new IllegalArgumentException("Dữ liệu mới không được để trống");
//                }
//
//                // Check lại biên thời lượng cho dữ liệu mới
//                if (newBh.getThoiLuong() < 120 || newBh.getThoiLuong() > 359) {
//                    throw new IllegalArgumentException("Thời lượng mới sai");
//                }
//
//                list.set(i, newBh);
//                return;
//            }
//        }
//        throw new RuntimeException("Không tìm thấy mã bài hát để sửa");
//    }
//
//    public boolean xoa(String ma) {
//        return list.removeIf(bh -> bh.getMa().equals(ma));
//    }
//
//    public BaiHat timKiem(String ma) {
//        if (ma == null || ma.isBlank()) throw new IllegalArgumentException("Mã tìm kiếm trống");
//        return list.stream().filter(bh -> bh.getMa().equals(ma)).findFirst().orElse(null);
//    }
}
