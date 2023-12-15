import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class colornoteTEST016 {
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
        WebElement Text_Content=driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_note"));
        Text_Content.sendKeys("hy Mob Team");
        Text_Content.clear();
        Text_Content.sendKeys("hy Mob TM ");
        System.out.println("STEP:-6 adding text  on note ");

        //Undo button
        WebElement Undo_btn=driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/btn_undo"));
        if(Undo_btn.isDisplayed()){
            System.out.println("Undo button is present");
        }else{
            System.out.println("Undo button not present");
        }
        Undo_btn.click();
        Thread.sleep(2000);
        System.out.println("STEP:- 7 undo button verified ");
 
        //Redo button
        WebElement Redo_btn =driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/btn_redo"));
        if(Redo_btn.isDisplayed()){
            System.out.println("Redo button is present");
        }else{
            System.out.println("Redo button not present");
        }
        Redo_btn.click();
        Thread.sleep(2000);
        System.out.println("STEP:-8 Verified REDO button ");
        
        driver.quit();
        System.out.println("SCENARIO END ");
    }
}