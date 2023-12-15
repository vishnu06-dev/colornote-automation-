import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver; 

public class appconfigure{
    
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("deviceName","pixel6");
        caps.setCapability("automationName","uiautomator2");
        // caps.setCapability("appPackage","com.socialnmobile.dictapps.notepad.color.note");
        // caps.setCapability("appActivity","com.socialnmobile.colornote.activity.Main");
        // // caps.setCapability("app", "C:\\apk.files\\ColorNote+Notepad.apk");
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
        //vishnu's branch 


        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.Button[@text='Allow']")).click();
        System.out.println("allow button TEST:- 1 ");
        // Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
        System.out.println("allow button TEST:- 2 ");
        
        Thread.sleep(3000);
        // // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/note_list")).click();
        driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/btn_start_skip")).click();
        System.out.println("skip the tutorial TEST:-3");
        // // Thread.sleep(2000);
        // WebDriverWait wait = newWebDriverWait(driver,10); // 10 seconds timeout
        // WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@index='1']")));
        // Thread.sleep(1000);
        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/main_btn1")).click();
        // System.out.println("allow button TEST:- 4");

        // Thread.sleep(1000);
      
        // Thread.sleep(3000);
        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/main_btn1")).click();
        // System.out.println("add a text button visible and select one TEST:- 4 ");

        // Thread.sleep(3000);
        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_note")).click();
        // System.out.println("adding a text TEST:- 5");

        // Thread.sleep(2000);
        // driver.findElement(By.xpath("//android.widget.EditText[@index='2']")).click();
        // System.out.println("edit text TEST:- 7");

        // Thread.sleep(3000);
        // driver.findElement(By.xpath("//android.widget.ImageButton[@index='1']")).click();
        // System.out.println("colornote back button TEST:- 8 ");

        // Thread.sleep(3000);
        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/main_btn1")).click();
        // System.out.println("colornote main button TEST:- 9");

        // Thread.sleep(2000);
        // driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
        // System.out.println("check list for text TEST:- 10");

        // Thread.sleep(3000);
        // driver.findElement(By.xpath("//android.widget.ImageView[@index='0']")).click();
        // System.out.println("add a text TEST:- 11");

        // Thread.sleep(3000);
        // driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']")).click();
        // driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn")).click();
        // System.out.println("adding text TEST:- 12");

        // Thread.sleep(3000);
        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/main_btn3")).click();
        // System.out.println("tap on three buttons for extra options TEST:- 13");

        // Thread.sleep(3000);

        // driver.findElement(By.xpath("//android.widget.TextView['@index=0']")).click();
        // driver.findElement(By.xpath("//com.socialnmobile.dictapps.notepad.color.note:id/text")).click();
        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/empty_text")).click();
        // Thread.sleep(2000);

        // driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']")).click();
        // // driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']")).click();
        // Thread.sleep(3000);

        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_note")).click();
        // driver.findElement(By.xpath("//com.socialnmobile.dictapps.notepad.color.note:id/edit_note")).click();
        // // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/icon_nav")).click();
        // System.out.println("Adding a new color for text TEST:- 14");

        // Thread.sleep(2000);
        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/note_list")).click();
        // Thread.sleep(3000);
        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/icon_nav")).click();
        // Thread.sleep(3000);
        // driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
        // System.out.println("tap on highlighter-menu open note TEST:-15");

        // Thread.sleep(3000);
        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/note_list")).click();
        // Thread.sleep(2000);
        //  driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/icon_nav")).click();
        //  Thread.sleep(3000);
        // driver.findElement(By.tagName("Calendar"));
        //  Thread.sleep(3000);
        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/month_view")).click();
        //  Thread.sleep(3000);
        // driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/note_list")).click();
        // System.out.println("tap on highlighter-menu to view calander. viwed successfully TEST:- 16");

    







    

   
    }
}