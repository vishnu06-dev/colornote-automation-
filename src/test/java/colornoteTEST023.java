import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class colornoteTEST023 {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("deviceName","pixel7");
        caps.setCapability("automationName","uiautomator2");
        caps.setCapability("appPackage","com.socialnmobile.dictapps.notepad.color.note");
        caps.setCapability("appActivity","com.socialnmobile.colornote.activity.Main");

        // real device name
        // caps.setCapability("udid","add device serial ID");
        // emulator device name
        caps.setCapability("udid", "emulator-5554");
        // for code to work on both Win and MAC, we use File.separator
        String appURL = System.getProperty("user.dir")+ File.separator + "app" + File.separator + "ColorNote+Notepad.apk";
        caps.setCapability("app", appURL);
        // setting up appium code
        URL url = new URL("http://0.0.0.0:4723/");
        AppiumDriver driver = new AndroidDriver(url, caps);
       
       
        //Allow Popup
        Thread.sleep(4000);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
        System.out.println("STEP-1 Allow popup notifications ");
        Thread.sleep(2000);
  
         //Allow Notifications
        driver.findElement(By.xpath("\t\r\n" + "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
        System.out.println("STEP-2 Allow notification button Done");
  
         //Verify Skip Tutorial
        driver.findElement(By.xpath("//android.widget.Button[@text='SKIP']")).click();
        System.out.println("STEP-3 Skip the tutorial of colornote opend home page");

        //Click on 3 dots
        Thread.sleep(2000);
        WebElement Three_dots=driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/main_btn3"));
        Three_dots.click();
        System.out.println("STEP:-4 click on 3 dots");

        //Click on Settings
        WebElement Settings=driver.findElement(By.xpath("//android.widget.LinearLayout[@index='5']"));
        Settings.click();
        System.out.println("STEP:-5 click on settings");

        //click on Default Color
        WebElement Default_Color=driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/recycler_view']/android.widget.LinearLayout[6]"));
        Default_Color.click();
       System.out.println("STEP:-6 click on default color ");
        //Click on White
        WebElement White_color=driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/btn9"));
        White_color.click();
        Thread.sleep(2000);
        System.out.println("STEP:-7 click on white color");

        driver.quit();
        System.out.println("SCENARIO END");
    }
}