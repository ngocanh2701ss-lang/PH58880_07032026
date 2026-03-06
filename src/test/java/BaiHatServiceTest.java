import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import poly.edu.Entity.BaiHat;
import poly.edu.Service.BaiHatService;

public class BaiHatServiceTest {
    BaiHatService service;

    @BeforeEach
    public void setUp() {
        service = new BaiHatService();
    }

    @Test
    public void testAddThanhCong() {
        int sizeTruoc = service.size();
        BaiHat entity = new BaiHat("BH001", "Bài hát đầu tiên", "Lê Thị Ngọc Ánh", 3.5f, "Pop");
        service.add(entity);

        Assertions.assertEquals(sizeTruoc + 1, service.size());

    }

    @Test
    public void testAddBienMin() {
        int sizeTruoc = service.size();
        BaiHat entity = new BaiHat("BH002", "Bài hát đầu tiên", "Lê Thị Ngọc Ánh", 2f, "Pop");
        service.add(entity);

        Assertions.assertEquals(sizeTruoc + 1, service.size());
    }

    @Test
    public void testAddBienMinCong1() {
        int sizeTruoc = service.size();
        BaiHat entity = new BaiHat("BH003", "Bài hát đầu tiên", "Lê Thị Ngọc Ánh", 2.1f, "Pop");
        service.add(entity);

        Assertions.assertEquals(sizeTruoc + 1, service.size());
    }

    @Test
    public void testAddBienMinTru1() {
        BaiHat entity = new BaiHat("BH004", "Bài hát đầu tiên", "Lê Thị Ngọc Ánh", 1.9f, "Pop");
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.add(entity));
    }

    @Test
    public void testAddBienMax() {
        int sizeTruoc = service.size();
        BaiHat entity = new BaiHat("BH005", "Bài hát đầu tiên", "Lê Thị Ngọc Ánh", 5.59f, "Pop");
        service.add(entity);

        Assertions.assertEquals(sizeTruoc + 1, service.size());
    }

    @Test
    public void testAddBienMaxTru1() {
        int sizeTruoc = service.size();
        BaiHat entity = new BaiHat("BH005", "Bài hát đầu tiên", "Lê Thị Ngọc Ánh", 5.4f, "Pop");
        service.add(entity);

        Assertions.assertEquals(sizeTruoc + 1, service.size());
    }

    @Test
    public void testAddBienMaxCong1() {
        BaiHat entity = new BaiHat("BH004", "Bài hát đầu tiên", "Lê Thị Ngọc Ánh", 6f, "Pop");
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.add(entity));
    }
}
