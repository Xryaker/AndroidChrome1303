package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
    static public RemoteWebDriver driver;
    @BeforeClass
    public static void b(){
        driver=DriverConfigFactory.setup(DEVICES.PIXEL);
    }
    @AfterClass
    public static void a() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}
