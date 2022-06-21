package stepdefinitions;

import org.openqa.selenium.remote.DesiredCapabilities;


public class Hook {


    static DesiredCapabilities caps = new DesiredCapabilities();

    public static void capabilities(String browser)  {

      //  System.out.println(BUILD_NAME);

        if(browser.equals("ie") || browser.equals("chrome") || browser.equals("firefox")) {
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", browser);
            caps.setCapability("browser_version", "latest");
            caps.setCapability("project", "Automation Test");
         //   caps.setCapability("build", BUILD_NAME);
            caps.setCapability("name", "Proyecto New Design Screenplay");
            caps.setCapability("browserstack.debug", "true");  //logs
            caps.setCapability("browserstack.console", "info");
            caps.setCapability("browserstack.networkLogs", "true");
            caps.setCapability("browserstack.video", "true");

        }
        else if(browser.equals("ios")) {
            caps.setCapability("device", "iPhone 12 Pro");
            caps.setCapability("real_mobile", "true");
            caps.setCapability("os_version", "14");
            caps.setCapability("browserName", "safari");
            caps.setCapability("browser_version", "latest");
            caps.setCapability("project", "Automation Test");
         //   caps.setCapability("build", BUILD_NAME);
            caps.setCapability("name", "Proyecto New Design Screenplay");
            caps.setCapability("browserstack.debug", "true");  //logs
            caps.setCapability("browserstack.console", "info");
            caps.setCapability("browserstack.networkLogs", "true");
            caps.setCapability("browserstack.video", "true");

        }
        else if(browser.equals("android")) {
            caps.setCapability("device", "Google Pixel 5");
            caps.setCapability("real_mobile", "true");
            caps.setCapability("os_version", "11.0");
            caps.setCapability("browserName", "chrome");
            caps.setCapability("browser_version", "latest");
            caps.setCapability("project", "Automation Test");
          //  caps.setCapability("build", BUILD_NAME);
            caps.setCapability("name", "Proyecto New Design Screenplay");
            caps.setCapability("browserstack.debug", "true");  //logs
            caps.setCapability("browserstack.console", "info");
            caps.setCapability("browserstack.networkLogs", "true");
            caps.setCapability("browserstack.video", "true");

        }
        else {
            caps.setCapability("os", "OS X");
            caps.setCapability("os_version", "Big Sur");
            caps.setCapability("browser", "safari");
            caps.setCapability("browser_version", "14");
            caps.setCapability("project", "Automation Test");
       //     caps.setCapability("build", BUILD_NAME);
            caps.setCapability("name", "Proyecto New Design Screenplay");
            caps.setCapability("browserstack.debug", "true");  //logs
            caps.setCapability("browserstack.console", "info");
            caps.setCapability("browserstack.networkLogs", "true");
            caps.setCapability("browserstack.video", "true");

        }
    }
    public static DesiredCapabilities getCaps() {
        return caps;
    }

}
