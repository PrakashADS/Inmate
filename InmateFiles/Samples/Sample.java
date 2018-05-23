package Samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

    WebDriver driver ;


    @Test(priority=1)

    public void openbrowser(){


    	 System.setProperty("webdriver.chrome.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver_win32\\chromedriver.exe");  
        driver = new ChromeDriver();

        driver.get("http://in.yahoo.com");
        
     System.out.println("dddddddd");


    }
   @Test(priority=2)
   public void maximize() throws InterruptedException{
     Thread.sleep(1000);
      driver.manage().window().maximize();

   }
   @Test(priority=3)
   public void transfer_instance() throws InterruptedException{
       Thread.sleep(1000);
       SampleOne s=new SampleOne(driver);
      s.navigate();

   }

}