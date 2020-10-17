package browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChromeHeadless {
    public static void main(String[] args) {
        ChromeOptions chromeOption = new ChromeOptions();
        chromeOption.setHeadless(true);
        new ChromeDriver(chromeOption);
    }
}
