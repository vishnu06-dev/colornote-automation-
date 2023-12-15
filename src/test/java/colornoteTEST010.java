import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class colornoteTEST010 {
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
        
        //Click on Add Note
        driver.findElement(By.xpath("//android.widget.ImageView[@index='0']")).click();
        System.out.println("STEP:-5 tap on text button to add text ");

        //Adding Text in Note
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_note")).sendKeys("EmpowerQA");
        System.out.println("STEP:-6 Type a text in note ");

        //Save Note
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn")).click();
       System.out.println("STEP:-7 back button Note ");
       
        //Navigate to note list
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn")).click();
        System.out.println("STEP:-8 navigate to list ");

        //Capture Note Title
        Thread.sleep(2000);
        String Note_title= driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/title")).getText();
        System.out.println("STEP:-9 Verify capture note title ");

        //Verify Note Title
        if (Note_title.equals("hy Mob Team ")) {
           System.out.println("Note title is "+Note_title);
          } 
          System.out.println("STEP:-10 TO Verify note title ");

          //Open Existing Note
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/title")).click();
        System.out.println("STEP:- 11 tap on existing one");

        //Clickon 3 dots
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/menu_btn")).click();
        System.out.println("STEP:-12 verified menu button ");

        //click on Archive
        driver.findElement(By.xpath("//android.widget.LinearLayout[@index='5']")).click();
        System.out.println("STEP:-13 tap on archive button ");

        //click on ok
        driver.findElement(By.id("android:id/button1")).click();
        Thread.sleep(1000);
        System.out.println("STEP:-14 Tap on Ok button  ");

        //Open Main menu 
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/icon_nav")).click();
        System.out.println("STEP:-15 Open main menu ");

        //Open archive list
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Archive']")).click();
         System.out.println("STEP:-16 Tap on archive list ");

        //Open Archived Note 
        driver.findElement(By.xpath("(//android.widget.ListView[@resource-id=\"com.socialnmobile.dictapps.notepad.color.note:id/note_list\"])[1]/android.widget.RelativeLayout")).click();
         System.out.println("STEP:-17 Tap on Arcived Note");

        //Verify Title
        String Archived_Note_Text= driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_title")).getText();
        if(Archived_Note_Text.equals(Note_title)){
            System.out.println("STEP:-18 Archived note is verified");;
        }
       
        //Click on 3 dots 
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/menu_btn")).click();
         System.out.println("STEP:-19 verified menu button ");

        //Click on Unarchive
        driver.findElement(By.xpath("//android.widget.LinearLayout[@index='4']")).click();
        Thread.sleep(2000);
        System.out.println("STEP:-20 Tap on Unarchive Button");

        driver.quit();
        System.out.println("SCENARIO END ");
    }
}