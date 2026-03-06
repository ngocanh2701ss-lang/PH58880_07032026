import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import poly.edu.Entity.BaiHat;
import poly.edu.Service.BaiHatService;

public class BaiHatTest {
    BaiHatService service;

    @BeforeEach
    public void setup() {
        service = new BaiHatService();
        // Add 1 bài mặc định để Test sửa/xóa/tìm kiếm
        service.them(new BaiHat("BH01", "Hello", "Adele", 200, "Pop"));
    }

    // --- TEST THÊM ---
    @Test
    public void testThemThanhCong() {
        BaiHat bh = new BaiHat("BH02", "Lạc Trôi", "Sơn Tùng", 300, "V-Pop");
        service.them(bh);
        Assertions.assertEquals(2, service.getAll().size());
    }

    @Test
    public void testThemThatBaiTenTrong() {
        BaiHat bh = new BaiHat("BH03", "", "Ca sĩ", 200, "Pop");
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.them(bh));
    }

    // --- TEST BIÊN THỜI LƯỢNG (120 - 359) ---
    @Test
    public void testBienDuoiHopLe() { // 120s
        BaiHat bh = new BaiHat("BH04", "Min", "A", 120, "Pop");
        service.them(bh);
        Assertions.assertEquals(120, service.timKiem("BH04").getThoiLuong());
    }

    @Test
    public void testSatBienDuoiLoi() { // 119s
        BaiHat bh = new BaiHat("BH05", "Min-1", "A", 119, "Pop");
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.them(bh));
    }

    @Test
    public void testBienTrenHopLe() { // 359s
        BaiHat bh = new BaiHat("BH06", "Max", "A", 359, "Pop");
        service.them(bh);
        Assertions.assertEquals(359, service.timKiem("BH06").getThoiLuong());
    }

    @Test
    public void testSatBienTrenLoi() { // 360s
        BaiHat bh = new BaiHat("BH07", "Max+1", "A", 360, "Pop");
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.them(bh));
    }

    // --- TEST SỬA & XÓA ---
    @Test
    public void testSuaThanhCong() {
        BaiHat moi = new BaiHat("BH01", "Tên Mới", "Ca Sĩ Mới", 250, "EDM");
        service.sua("BH01", moi);
        Assertions.assertEquals("Tên Mới", service.timKiem("BH01").getTen());
    }

    @Test
    public void testXoaThanhCong() {
        service.xoa("BH01");
        Assertions.assertEquals(0, service.getAll().size());
    }
}
