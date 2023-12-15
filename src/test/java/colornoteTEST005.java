import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class colornoteTEST005 {
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

        //Click On AddNote Icon
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.ImageButton[@index='2']")).click();
        System.out.println("STEP:-4 tap on add button to check ");
        
        //Click on check list Note
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Checklist']")).click();
        System.out.println("STEP:-5 tap on on check list ");
            
        //add check list 
        Thread.sleep(2000);
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_title")).sendKeys("testing note");
        System.out.println("STEP:-6 add  a item ");
        
        //save note
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn")).click();
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn")).click();
        System.out.println("STEP:-7 back button Note ");
        
        //Navigate to note list 
        Thread.sleep(2000);
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/note_list")).click();
        System.out.println("STEP:-8 navigate to list ");
        
        Thread.sleep(2000);
        String add_item= driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/title")).getText();
        System.out.println("STEP:-9 Verify capture note title ");
        
        //Verify Note Title
        if (add_item.equals("hy mob Team")) {
           System.out.println("Note title is "+add_item);
          } 
          System.out.println("STEP:-10 TO Verify note title ");

          driver.quit();
          System.out.println("SCENARIO END ");

     }
 }