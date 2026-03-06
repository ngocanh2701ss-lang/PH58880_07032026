import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
public class AuThenTest {
    WebDriver driver;
    // URL đăng ký và đăng nhập của Vitimex
    String urlDangKy = "https://vitimex.com.vn/dang-ky.html";
    String urlDangNhap = "https://vitimex.com.vn/dang-nhap.html";

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup(); // Tự động quản lý driver
        ChromeOptions options = new ChromeOptions();
        // Khi đi thi, nên tắt headless (comment dòng dưới) để thấy trình duyệt chạy cho tự tin
        // options.addArguments("--headless=new");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        // Chờ ngầm định 10s để load phần tử
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testDangKy() {
        driver.get(urlDangKy);

        // Nhập họ tên (Vitimex dùng id="name")
        driver.findElement(By.id("name")).sendKeys("Lãnh Minh Hiếu");

        // Nhập số điện thoại (Vitimex bắt buộc SĐT)
        driver.findElement(By.id("phone")).sendKeys("0987654321");

        // Nhập Email
        driver.findElement(By.id("email")).sendKeys("hieulm" + System.currentTimeMillis() + "@gmail.com");

        // Nhập mật khẩu và xác nhận
        driver.findElement(By.id("pass-regis")).sendKeys("Test123456");
        driver.findElement(By.id("pass-confirm")).sendKeys("Test123456");

        // Click nút đăng ký
        driver.findElement(By.id("register-btn")).click();

        System.out.println("Đã thực hiện kịch bản đăng ký");
    }

    @Test
    public void testDangNhap() {
        driver.get(urlDangNhap);

        // Nhập tài khoản (Email hoặc SĐT)
        driver.findElement(By.id("account")).sendKeys("0987654321");

        // Nhập mật khẩu
        driver.findElement(By.id("pass")).sendKeys("Test123456");

        // Click nút đăng nhập
        driver.findElement(By.id("signin-btn")).click();

        System.out.println("Đã thực hiện kịch bản đăng nhập");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
