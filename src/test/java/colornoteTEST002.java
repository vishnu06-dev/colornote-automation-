import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class colornoteTEST002 {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("deviceName","pixel6");
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

         //Verify Click On AddNote Icon
         Thread.sleep(2000);
         driver.findElement(By.xpath("//android.widget.ImageButton[@index='2']")).click();
         System.out.println("STEP-4 Verifying an home page addnote icon ");

         //Click on Add Note
         driver.findElement(By.xpath("//android.widget.ImageView[@index='0']")).click();
        System.out.println("STEP-5 Verifying an home page addnote icon ");

         //Adding Text in Note
         driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_note")).sendKeys("EMPOWERQA");
         System.out.println("STEP-6 Verify Adding a Text in note  icon ");

         //Save Note
         driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn")).click();
         System.out.println("STEP-7  Save Note  ");

         //Navigate to note list
         driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn")).click();
         System.out.println("STEP-8 navigate to Note list ");

         //Capture Note Title
         Thread.sleep(2000);
         String MOB_TEAM= driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/title")).getText();
         System.out.println("STEP-9 capture a note title  ");

         //Verify Note Title
         if (MOB_TEAM.equals("EMPOWERQA")) {
            System.out.println("STEP-10 Note title is "+MOB_TEAM);
         
        }

        driver.quit();
        System.out.println("SCENARIO END ");
       
          
    }
}