import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class colornoteTEST021 {
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
      
        //Click On AddNote Icon
        Thread.sleep(2000);
        WebElement Add_note_Icon =driver.findElement(By.xpath("//android.widget.ImageButton[@index='2']"));
        Add_note_Icon.click();
      System.out.println("STEP:-4 click on addnote icon ");
      
        //Click on Add Note
        WebElement Add_note=driver.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
        Add_note.click();
        System.out.println("STEP:-5 click on add note ");
         
        //Adding Text in Note
        WebElement Note_Text=driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_note"));
        Note_Text.sendKeys("Mob Team");
       System.out.println("STEP:-6 adding in a text note");

        //Save Note
        WebElement Save_btn =driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn"));
        Save_btn.click();
       System.out.println("STEP:-7 saved note ");

        //Navigate to note list
        Thread.sleep(2000);
        Save_btn.click();
         System.out.println("STEP:-8 navigate to note list");     

        //Capture Note Title
        Thread.sleep(2000);
        WebElement Note_Title =driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/title"));
        String Note_title_Text= Note_Title.getText();
       System.out.println("STEP:-9 capature a note title");

        //Verify Note Title
        if (Note_title_Text.equals("EmpowerQA")) {
           System.out.println("Note title is "+Note_title_Text);
          } 
        //Open Existing Note
        Note_Title.click();
       System.out.println("STEP:-10 open a Existing note");

        //Clickon 3 dots
        WebElement Three_dots=driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/menu_btn"));
        Three_dots.click();
       System.out.println("STEP:-11 click on 3 dots");

        //Click on reminder
        Thread.sleep(2000);
        WebElement Reminder =driver.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout[3]"));
        Reminder.click();
        System.out.println("STEP:-12 click on reminder");

        //Pin to taskbar
        WebElement Pin_to_taskbar=driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/quick_setting_status_bar"));
        Pin_to_taskbar.click();
        System.out.println("STEP:-13 tap on pin to taskbar");

        // //Pin symbol verification
        // WebElement Pin_symbol = driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/datetime_absolute"));
        // if(Pin_symbol.isDisplayed()){
        //     System.out.println("Note is Pinned");
        // }else{
        //     System.out.println("Note is not pinned");
        // }

        driver.quit();
        System.out.println("SCENARIO END ");
    }
}