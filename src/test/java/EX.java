import config.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EX extends BaseClass {
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Ukraine");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElements(By.xpath("//div[@jsname=\"bVqjv\"]")).get(3).click();
        Thread.sleep(2000);
        for (WebElement l : driver.findElements(By.xpath("//div[contains(@class,\"V82bz\")]"))) {
            System.out.println(l.getText());
        }
    }
}
