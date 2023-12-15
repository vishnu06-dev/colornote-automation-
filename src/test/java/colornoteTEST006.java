import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class colornoteTEST006 {
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
        System.out.println("STEP-1 Allow popup notifications ");
        Thread.sleep(2000);
 
         //Allow Notifications
        driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
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
        
        //verifyied notes
        Thread.sleep(2000);
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_title")).sendKeys("testing note");
        System.out.println("STEP:-6 add  a item ");
        
            
        //save note
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn")).click();
        System.out.println("STEP:-7 verified back button ");

        //tap on menu button 
        Thread.sleep(2000);
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/menu_btn")).click();
        System.out.println("STEP:-8 verified menu button ");


        //tap reminder option 
        driver.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout[1]"));
        System.out.println("STEP:-9 verified reminder option ");

        //tap on pin to status bar 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.socialnmobile.dictapps.notepad.color.note:id/text\" and @text=\"Reminder\"]")).click();

        //add text
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/quick_setting_today")).sendKeys("fill task sheet");
        Thread.sleep(2000);
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn"));

        driver.findElement(By.xpath("//android.view.View[@index='4']"));
        System.out.println("STEP:- 10 tap on reminder and add a note existing one  pin in status bar ");
        
        ///reminding note
        Thread.sleep(2000);
       WebElement Remind_aft_15=driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/quick_setting_15min"));
        Remind_aft_15.click();
        System.out.println("STEP:-11 reminder for 15 min  ");

        //tap to done 
        WebElement Done =driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/button1"));
        Done.click();
        Thread.sleep(2000);
        System.out.println("STEP:-11 taped on remind me after 15 min  ");



        //saved a note home 
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn")).click();
        System.out.println("STEP:-11 back button Note ");

        //Navigate to note list 
        Thread.sleep(2000);
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/note_list")).click();
        System.out.println("STEP:-12 navigate to list ");


        driver.quit();
        System.out.println(" scenario end ");
         
    }
 
   }
         
 