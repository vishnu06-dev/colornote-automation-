import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;




public class colornoteTEST024 {
    
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("deviceName","pixel7");
        caps.setCapability("automationName","uiautomator2");
        caps.setCapability("appPackage","com.socialnmobile.dictapps.notepad.color.note");
        caps.setCapability("appActivity","com.socialnmobile.colornote.activity.Main");
        //emulator
        caps.setCapability("udid","emulator-5554");
        //real device
        // caps.setCapability("udid","decive id");

        // for code to work on both Win and MAC, we use File.separator
        String appURL = System.getProperty("user.dir")+ File.separator + "app" + File.separator + "ColorNote+Notepad.apk";
        caps.setCapability("app", appURL);
        // setting up appium code
        URL url = new URL("http://0.0.0.0:4723/");
        AppiumDriver driver = new AndroidDriver(url, caps);
       

        //Allow Popup
        Thread.sleep(4000);
        driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
        System.out.println("STEP-1 Allow popup notifications ");
        Thread.sleep(2000);
         
        //Allow Notifications
        driver.findElement(By.xpath("\t\r\n" + "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
        System.out.println("STEP-2 Allow notification button Done");
          
        //Verify Skip Tutorial
        driver.findElement(By.xpath("//android.widget.Button[@text='SKIP']")).click();
        System.out.println("STEP-3 Skip the tutorial of colornote opend home page");
        
        //tap on hamburger menu button 
        Thread.sleep(2000);
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/icon_nav")).click();
        System.out.println("STEP:4");
        //tap on calender 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Calendar']"));
        System.out.println("STEP:5");
        //add text for calender
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/main_btn1")).click();
        System.out.println("STEP:6");
        //tap on text 
        driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
        System.out.println("STEP:-7");


        //add check list
        // driver.findElement(By.xpath("//android.widget.TextView[@text='Calendar']")).click();
        // System.out.println("STEP:7");
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/text")).sendKeys("remind mob team");
        System.out.println("STEP:8");
        //save 
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn"));

        driver.quit();
        System.out.println("END");



    }
}
