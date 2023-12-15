import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class colornoteTEST020 {
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
        //first change
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
     
        //Open Hamberger menu
        Thread.sleep(2000);
        WebElement Hamberger_menu = driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/icon_nav"));
        Hamberger_menu.click();
        System.out.println("STEP:-4 open Hamberger menu button");

        //Click on tutorial
        WebElement Tutorial_btn = driver.findElement(By.xpath("//android.widget.LinearLayout[@index='8']"));
        Tutorial_btn.click();
        System.out.println("STEP:-5 click on tutorial ");

        //Click on Start
        WebElement Start_btn=driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/btn_start"));
        Start_btn.click();
        System.out.println("STEP:-6 click on START");

        //Click on next button
        Thread.sleep(2000);
        WebElement Next_btn =driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/btn_next"));
        Next_btn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.ImageButton[@index='2']")).click();
        System.out.println("STEP:-7 click on next button ");
        //Next_btn.click();
        Thread.sleep(3000);
        
        driver.quit();
        System.out.println("SCENARIO END ");


    }
}