import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class colornoteTEST019 {
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
        WebElement Add_Note_icon=driver.findElement(By.xpath("//android.widget.ImageButton[@index='2']"));
        Add_Note_icon.click();
        System.out.println("STEP:-4 click on add note icon ");

        //Click on Add Checklist
        WebElement Add_Checklist =driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']"));
        Add_Checklist.click();
        System.out.println("STEP:-5 Tap on add checklist");

        // Add item
        WebElement Add_Item=driver.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
        Add_Item.click();
        System.out.println("STEP:-6 add item");

        //Item Name
        WebElement ItemName = driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit"));
        ItemName.sendKeys("pen");
        System.out.println("STEP:-8 add item names");

        // // Click on Next
        WebElement Next = driver.findElement(By.id("android:id/button3"));
        Next.click();
      System.out.println("STEP:-9 click on next");

        // //Second item
        // Thread.sleep(2000);
        ItemName.click();
        ItemName.sendKeys("Books");
        Next.click();
      System.out.println("STEP:-10 second item entered and click on next ");
        // //Third item
        ItemName.sendKeys("pencil");
        System.out.println("STEP:-11 entered thired item ");

        //CLick on ok
        WebElement OK = driver.findElement(By.id("android:id/button1"));
        OK.click();
        System.out.println("STEP:-12 click on OK button ");

        //Click on save
        Thread.sleep(2000);
        WebElement Save = driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn"));
        Save.click();
        System.out.println("STEP:-13 click on save button");

        
        driver.quit();
        System.out.println("SCENARIO END ");

    }
}