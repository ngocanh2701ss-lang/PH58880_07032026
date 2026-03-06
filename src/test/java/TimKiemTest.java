import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimKiemTest {
    WebDriver driver;
    String url = "https://www.vietjetair.com/vi/ve-may-bay/bay-dang-cap-boss-gia-chi-eco-uu-dai-20-ngay-20-hang-thang/?utm_source=google-vj-sg&utm_medium=cpc&utm_campaign=pmax_singaporesunbird2025_ci_perfmax_0125intflt-sale20_promo-destn-sgp-skyboss-kv_sgpawo2024_cpa_ob&gad_source=1&gclid=Cj0KCQiAkoe9BhDYARIsAH85cDORe2krBlFPX0WLX2b8-jbIkCWMIKBWK8_gIojxLNRwUvz25GcCcnEaAk54EALw_wcB";


    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Test
    public void timKiem() throws InterruptedException {
        driver.get(url);

        driver.findElement(By.id("input-departure")).sendKeys("Hà Nội");
        driver.findElement(By.id("departureDate")).sendKeys("11/03/2026");
        driver.findElement(By.id("input-departure-2")).sendKeys("Hà Nội - HAN");
        driver.findElement(By.id("returnDate")).sendKeys("12/03/2026");
        driver.findElement(By.id("input-passenger-mb")).sendKeys("1 người lớn");
        WebElement btnSearch = driver.findElement(By.id("search_flights"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnSearch);
        Thread.sleep(5000);
       // driver.findElement(By.id("search_flights")).click();
        Thread.sleep(8000);
        System.out.println("Tim kiem thanh cong");
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
