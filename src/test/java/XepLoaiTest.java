import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import poly.edu.Service.XepLoai;

public class XepLoaiTest {
    XepLoai xepLoai = new XepLoai();

    // Phan vung tuong duong
    @Test
    public void testPhanVungTuongDuongXuatSac() {
        String mongMuon = "Xuất sắc";
        String thucTe = xepLoai.xepLoai(9.5);
        Assertions.assertEquals(mongMuon, thucTe);
    }

    @Test
    public void testPhanVungTuongGioi() {
        String mongMuon = "Giỏi";
        String thucTe = xepLoai.xepLoai(8);
        Assertions.assertEquals(mongMuon, thucTe);
    }

    @Test
    public void testPhanVungTuongTrungBinh() {
        String mongMuon = "Giỏi";
        String thucTe = xepLoai.xepLoai(6);
        Assertions.assertEquals(mongMuon, thucTe);
    }


    // Test vung bien
    @Test
    public void testBienMinXuatSac() {
        String mongMuon = "Xuất sắc";
        String thucTe = xepLoai.xepLoai(9);
        Assertions.assertEquals(mongMuon, thucTe);
    }

    @Test
    public void testBienMinCong1() {
        String mongMuon = "Xuất sắc";
        String thucTe = xepLoai.xepLoai(9.1);
        Assertions.assertEquals(mongMuon, thucTe);
    }

    @Test
    public void testBienMaxXuatSac() {
        String mongMuon = "Xuất sắc";
        String thucTe = xepLoai.xepLoai(10);
        Assertions.assertEquals(mongMuon, thucTe);
    }

    @Test
    public void testDiemTrungBinhNgoaiKhoangMax() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> xepLoai.xepLoai(11));
    }

    @Test
    public void testDiemTrungBinhNgoaiKhoangMin() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> xepLoai.xepLoai(-1));
    }
}
/**git add .

 git commit -m "Anh fix logic test de lay tich xanh"

 git push origin main*/