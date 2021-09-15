package starter;
import org.openqa.selenium.*;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.safari.SafariDriver;

public class TestInstrument {
    protected static WebDriver webDriver;
    protected static boolean isRunning = false;
    public static boolean web = true;

    public static void setUp() {
        if (!isRunning) {
            webDriver = new SafariDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
            isRunning = true;
        }
    }

    public static void tearDown() {
        try {
            isRunning = false;
            webDriver.quit();
        } catch (Exception e) {
//            do nothing
        }
    }

    public static boolean isWeb() {
        return web;
    }

    public static void setWeb(boolean web) {
        TestInstrument.web = web;
    }

}
