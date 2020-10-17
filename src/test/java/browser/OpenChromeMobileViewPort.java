package browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class OpenChromeMobileViewPort {
    public static void main(String[] args) {
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPhone X");
        ChromeOptions opts = new ChromeOptions();
        opts.setExperimentalOption("mobileEmulation", mobileEmulation);
        new ChromeDriver(opts);
    }
}
