package RUN_Kiosk2PublicDefenderStaff;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import PageObjectModel.POM_Kiosk;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KioskLogin {
	public static WebDriver obj;
	public static Logger log=Logger.getLogger(KioskLogin.class.getName());
	
	int randomInt;
	int randomInt1;
	int randomInt2;
	int randomInt3;
	int randomInt4;
	int randomInt5;
	int randomInt6;
	int randomInt7;
	int randomInt8;
	
	public KioskLogin()
	{
		this.obj=obj;
	}
	public WebDriver getDriver()
	{
		return this.obj;
	}
	
	@When("^Enter the kiosk username and password to login$")
	public void KioskLogin() throws InterruptedException
	{
		  POM_Kiosk pk=new POM_Kiosk(obj);
		  Thread.sleep(1000);
		  pk.LoginBtn.click();
		  Thread.sleep(1000);
	      pk.Username.click();
		  Thread.sleep(1000);
	      pk.VK_1.click();
		  Thread.sleep(1000);
	      pk.Username.click();
		  Thread.sleep(1000);
	      pk.VK_1.click();
		  Thread.sleep(1000);
	      pk.VK_Accept.click();
		  Thread.sleep(1000);
	      pk.Password.click();
		  Thread.sleep(1000);
	      pk.VK_1.click();
		  Thread.sleep(1000);
	      pk.Password.click();
		  Thread.sleep(1000);
	      pk.VK_1.click();
		  Thread.sleep(1000);
	      pk.VK_Accept.click();
		  Thread.sleep(1000);
	      pk.btnLogin.click();
	}
	@When("^Enter the kiosk userName and passWord to login$")
	public void KioskLogin1() throws InterruptedException
	{
		  POM_Kiosk pk=new POM_Kiosk(obj);
		  Thread.sleep(1000);
		  pk.LoginBtn.click();
		  Thread.sleep(1000);
	      pk.Username.click();
		  Thread.sleep(1000);
	      pk.VK_1.click();
		  Thread.sleep(1000);
		  pk.Username.click();
		  Thread.sleep(1000);
	      pk.VK_1.click();
		  Thread.sleep(1000);
		  pk.Username.click();
		  Thread.sleep(1000);
		  pk.VK_0.click();
		  Thread.sleep(1000);
		  pk.Username.click();
		  Thread.sleep(1000);
	      pk.VK_0.click();
	      Thread.sleep(1000);
	      pk.VK_Accept.click();
		  Thread.sleep(1000);
	      pk.Password.click();
		  Thread.sleep(1000);
	      pk.VK_1.click();
		  Thread.sleep(1000);
	      pk.Password.click();
	      Thread.sleep(1000);
		  pk.VK_0.click();
		  Thread.sleep(1000);
		  pk.Password.click();
	      Thread.sleep(1000);
	      pk.VK_9.click();
		  Thread.sleep(1000);
		  pk.Password.click();
	      Thread.sleep(1000);
		  pk.VK_1.click();
		  Thread.sleep(1000);
	      pk.VK_Accept.click();
		  Thread.sleep(1000);
	      pk.btnLogin.click();
	}
	@Then("^Goto Mycontacts and Accept$")
	public void MyContacts() throws InterruptedException
	{
		  POM_Kiosk pk=new POM_Kiosk(obj);
		  Thread.sleep(1000);
		  pk.MyContacts.click();
		  Thread.sleep(1000);
		  List <WebElement> puser=obj.findElements(By.className("odd"));
		  for(int i=0;i<1;i++)
		  {
			  Thread.sleep(1000);
			  puser=obj.findElements(By.className("odd"));
			  Thread.sleep(1000);
			  puser.get(0).click();
		  }
	}
	@Then("^Goto Request and send the Messages$")
	public void Requestsearch() throws InterruptedException, AWTException
	{
		 POM_Kiosk pk=new POM_Kiosk(obj);
		 Thread.sleep(1000);
		 pk.Requests.click();
		 Thread.sleep(1000);
		 pk.btnMsgFromInbox.click();
		 Thread.sleep(1000);
		 List<WebElement> msgTo=obj.findElements(By.xpath(".//span[text()='Message To Inmate 1']"));
		 Thread.sleep(1000);
		 for(int i=0;i<1;i++)
		 {
			 Thread.sleep(1000);
			 msgTo=obj.findElements(By.xpath(".//span[text()='Message To Inmate 1']")); 
			 Thread.sleep(1500);
			 msgTo.get(i).click();
			 Thread.sleep(1000);
			
			/*pk.Description.click();
	       	Thread.sleep(1000);
			pk.VK_a.click();*/
			for(i=0;i<5;i++)
			{
				Thread.sleep(2000);
				pk.Description.click();
				Thread.sleep(1000);
				pk.VK_b.click();
			}
			Thread.sleep(1000);	
			obj.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
			Thread.sleep(1000);
			pk.VK_Accept.click();
			Thread.sleep(1000);
			obj.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
			Thread.sleep(1000);
			pk.SubmitBtn.click();
			Thread.sleep(1000);
			pk.btnOk.click();
		 }
		 }
		 @Then("^Select f1,send form$")
			public void f1() throws InterruptedException
			{
				POM_Kiosk pk=new POM_Kiosk(obj);
				Thread.sleep(1000);
			    pk.Requests.click();
				Thread.sleep(2000);
				Select f1=new Select(pk.SelectForm);
				f1.selectByValue("3");
				Thread.sleep(1000);
				pk.SearchBtn.click();
				Thread.sleep(1000);
				pk.Create.click();
				Thread.sleep(1000);
				pk.Description.click();
				Thread.sleep(1000);
				pk.VK_h.click();
				Thread.sleep(1000);
				for(int i=0;i<4;i++)
				{
					Thread.sleep(1000);
					pk.Description.click();
					Thread.sleep(1000);
					pk.VK_i.click();
				}
				Thread.sleep(1000);
				obj.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
				Thread.sleep(1000);
				pk.VK_Accept.click();
				Thread.sleep(1000);
				obj.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
				Thread.sleep(1000);
				pk.SubmitBtn.click();
				Thread.sleep(1000);
				pk.btnOk.click();
				
			}
			@Then("^Send reply to f1$")
			public void replyf1() throws InterruptedException
			{
				 POM_Kiosk pk=new POM_Kiosk(obj);
				 Thread.sleep(1000);
				 pk.Requests.click();
				 Thread.sleep(1000);
				 Select f1=new Select(pk.SelectForm);
				 f1.selectByValue("3");
				 Thread.sleep(1000);
				 pk.SearchBtn.click();
				 Thread.sleep(1000);
				 List<WebElement> msgTo=obj.findElements(By.xpath(".//span[text()='f1']"));
				 Thread.sleep(1000);
				 for(int i=0;i<1;i++)
				 {
					 Thread.sleep(1000);
					 msgTo=obj.findElements(By.xpath(".//span[text()='f1']")); 
					 Thread.sleep(1500);
					 msgTo.get(i).click();
					 Thread.sleep(1000);
					 pk.Description.click();
					 Thread.sleep(1000);
					 pk.VK_g.click();
					for(i=0;i<4;i++)
					{
						Thread.sleep(1000);
						pk.Description.click();
						Thread.sleep(1000);
						pk.VK_o.click();
					}
					Thread.sleep(1000);	
					obj.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
					Thread.sleep(1000);
					pk.VK_Accept.click();
					Thread.sleep(1000);
					obj.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
					Thread.sleep(1000);
					pk.SubmitBtn.click();
					Thread.sleep(1000);
					pk.btnOk.click();
					Thread.sleep(1000);
					pk.Back.click();
				 }
			
	}
	@And("^Select Visitor and add visitor$")
	public void visitor() throws InterruptedException
	{
		 POM_Kiosk pk=new POM_Kiosk(obj);
		 Thread.sleep(1000);
		 pk.Requests.click();
		 Thread.sleep(1000);
		 Select f1=new Select(pk.SelectForm);
		 f1.selectByValue("1");
		 Thread.sleep(1000);
		 pk.SearchBtn.click();
		 Thread.sleep(1000);
		 pk.Visitor.click();
		 Thread.sleep(1000);
		 pk.AddVisitor.click();
		 
		 Thread.sleep(1000);
		 pk.VisitorName.click();
		 Thread.sleep(1000);
		 pk.VK_v.click();
		 pk.VK_i.click();
		 pk.VK_s.click();
		 Thread.sleep(1000);

		   Random rd = new Random();
			
			for (int idx = 0; idx <= 9; ++idx) {
				randomInt = rd.nextInt(9);		
			}
		    
		 obj.findElement(By.xpath(".//span[text()='"+randomInt+"']")).click();
		 Thread.sleep(1500);
		 pk.VK_Accept.click();
		 Thread.sleep(1000);
		 pk.VisitorDOB.click();
		 Thread.sleep(1000);
			
			for (int idx = 0; idx <= 3; ++idx) {
				randomInt1 = rd.nextInt(3);		
			}
		 obj.findElement(By.xpath(".//span[text()='"+randomInt1+"']")).click();
		 Thread.sleep(1000);
		 obj.findElement(By.name("ctl00$ContentPlaceHolder1$grvVisitorDetails$ctl02$txtVisitorDOB")).click();
		
		 for (int idx = 0; idx <= 3; ++idx) {
				randomInt3 = rd.nextInt(3);		
			}
		 Thread.sleep(1000);
		 obj.findElement(By.xpath(".//span[text()='"+randomInt3+"']")).click();
		 Thread.sleep(1000);
		 pk.VK_Slash.click();
		 Thread.sleep(1000);
		 for (int idx = 0; idx <= 1; ++idx) {
				randomInt2 = rd.nextInt(1);		
			}
		 obj.findElement(By.xpath(".//span[text()='"+randomInt2+"']")).click();
		 Thread.sleep(1000);
		 obj.findElement(By.name("ctl00$ContentPlaceHolder1$grvVisitorDetails$ctl02$txtVisitorDOB")).click();
		 for (int idx = 1; idx <= 2; ++idx) {
				randomInt4 = rd.nextInt(2);		
			}
		 obj.findElement(By.xpath(".//span[text()='"+randomInt4+"']")).click();
		 Thread.sleep(1000);
		 pk.VK_Slash.click();
		 Thread.sleep(1000);
		 for (int idx = 1; idx <= 1; ++idx) {
				randomInt5 = rd.nextInt(1);		
			}
		 obj.findElement(By.xpath(".//span[text()='"+randomInt5+"']")).click();
		 Thread.sleep(1000);
		 obj.findElement(By.name("ctl00$ContentPlaceHolder1$grvVisitorDetails$ctl02$txtVisitorDOB")).click();
		 for (int idx = 0; idx <= 9; ++idx) {
				randomInt6 = rd.nextInt(9);		
			}
		    
		 obj.findElement(By.xpath(".//span[text()='"+randomInt6+"']")).click();
		 obj.findElement(By.name("ctl00$ContentPlaceHolder1$grvVisitorDetails$ctl02$txtVisitorDOB")).click();
		 for (int idx = 0; idx <= 9; ++idx) {
				randomInt7 = rd.nextInt(9);		
			}
		    
		 obj.findElement(By.xpath(".//span[text()='"+randomInt7+"']")).click();
		 obj.findElement(By.name("ctl00$ContentPlaceHolder1$grvVisitorDetails$ctl02$txtVisitorDOB")).click();
		 for (int idx = 1; idx <= 9; ++idx) {
				randomInt8 = rd.nextInt(9);		
			}
		    
		 obj.findElement(By.xpath(".//span[text()='"+randomInt8+"']")).click();
		 Thread.sleep(1000);
		 pk.VK_Accept.click();
		 
		 Thread.sleep(1000);
		 pk.VisitorRelation.click();
		 Thread.sleep(1000);
		 pk.VK_s.click();
		 Thread.sleep(1000);
		 pk.VK_o.click();
		 Thread.sleep(1000);
		 pk.VK_n.click();
		 Thread.sleep(1000);
		 pk.VK_Accept.click();  
		 
		 Thread.sleep(1000);
		 pk.VisitorPhoneNumber.click();
		 for(int i=0;i<3;i++)
		 {
			 Thread.sleep(1000);
			 pk.VK_9.click();
			 Thread.sleep(1000);
			 obj.findElement(By.name("ctl00$ContentPlaceHolder1$grvVisitorDetails$ctl02$txtVisitorPhoneNumber")).click();
		 }
		 for(int i=0;i<3;i++)
		 {
			 Thread.sleep(1000);
			 pk.VK_8.click();
			 Thread.sleep(1000);
			 obj.findElement(By.name("ctl00$ContentPlaceHolder1$grvVisitorDetails$ctl02$txtVisitorPhoneNumber")).click();
		 }
		 for(int i=0;i<4;i++)
		 {
			 Thread.sleep(1000);
			 pk.VK_7.click();
			 Thread.sleep(1000);
			 obj.findElement(By.name("ctl00$ContentPlaceHolder1$grvVisitorDetails$ctl02$txtVisitorPhoneNumber")).click();
		 }
		 Thread.sleep(1000);
		 pk.VK_Accept.click();  
		 
		 Thread.sleep(1000);
		 pk.VisitorAddress.click();
		 pk.VK_t.click();
		 pk.VK_e.click();
		 pk.VK_x.click();
		 pk.VK_a.click();
		 pk.VK_s.click();
		 Thread.sleep(1000);
		 pk.VK_Accept.click(); 
		 
		 Thread.sleep(1000);
		 pk.VisitorCity.click();
		 Thread.sleep(1000);
		 pk.VK_w.click();
		 pk.VK_a.click();
		 pk.VK_c.click();
		 pk.VK_o.click();
	     Thread.sleep(1000);
		 pk.VK_Accept.click(); 
		 
		 Thread.sleep(1000);
		 Select state=new Select(pk.VisitorState);
		 state.selectByVisibleText("Texas");
		 Thread.sleep(1000);
		 
		 pk.VisitorZipCode.click();
		 Thread.sleep(1000);
		 pk.VK_6.click();
		 pk.VK_4.click();
		 pk.VK_3.click();
		 pk.VK_1.click();
		 pk.VK_0.click();
		 Thread.sleep(1000);
		 pk.VK_Accept.click();
		 
	}
	@Then("^Create the PdForm$")
	public void create_PdForm() throws InterruptedException
	{
	  POM_Kiosk pk=new POM_Kiosk(obj);
	  Thread.sleep(1000);
	  pk.Requests.click();
      Thread.sleep(1000);
      Select f1=new Select(pk.SelectForm);
	  f1.selectByIndex(3);
	  Thread.sleep(1000);
	  pk.SearchBtn.click();
	  Thread.sleep(1000);
	  pk.Create.click();
	  Thread.sleep(1000);
	  pk.Description.click();
	  Thread.sleep(1000);
	  pk.VK_p.click();
	  pk.VK_d.click();
	  Thread.sleep(1000);
	  obj.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		Thread.sleep(1000);
		pk.VK_Accept.click();
		Thread.sleep(1000);
		obj.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		Thread.sleep(1000);
		pk.SubmitBtn.click();
		Thread.sleep(1000);
		pk.btnOk.click();
		Thread.sleep(1000);
		

	}
	@Then("^Send reply to pdForm$")
	public void ReplyToPdForm() throws InterruptedException
	{
		  POM_Kiosk pk=new POM_Kiosk(obj);
		  Thread.sleep(1000);
		  pk.Requests.click();
	      Thread.sleep(1000);
	      Select f1=new Select(pk.SelectForm);
		  f1.selectByIndex(3);
		  Thread.sleep(1000);
		  pk.SearchBtn.click();
		  Thread.sleep(1000);
		  List<WebElement> pdFrm=obj.findElements(By.xpath(".//span[text()='pd form']"));
		  Thread.sleep(1000);
		  for(int i=0;i<1;i++)
		  {
			  Thread.sleep(1000);
			  pdFrm=obj.findElements(By.xpath(".//span[text()='pd form']"));
			  Thread.sleep(1000);
			  pdFrm.get(i).click();
		  }
		  Thread.sleep(1000);
		  pk.Description.click();
		  Thread.sleep(1000);
		  pk.VK_f.click();
		  pk.VK_i.click();
		  pk.VK_n.click();
		  pk.VK_e.click();
		  Thread.sleep(1000);
		  obj.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
			Thread.sleep(1000);
			pk.VK_Accept.click();
			Thread.sleep(1000);
			obj.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
			Thread.sleep(1000);
			pk.SubmitBtn.click();
			Thread.sleep(1000);
			pk.btnOk.click();
			Thread.sleep(1000);
			pk.Back.click();
	}
	@Then("^Goto Messages and Reply$")
	public void Msgs() throws InterruptedException
	{
		POM_Kiosk pk=new POM_Kiosk(obj);
		Thread.sleep(1000);
		pk.Requests.click();
		Thread.sleep(2000);
		pk.Messages.click();
		Thread.sleep(1000);
		obj.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		Thread.sleep(2000);
		List<WebElement> subj=obj.findElements(By.xpath(".//td[text()='Wishes']"));
		Thread.sleep(1000);
		for(int i=0;i<=1;i++)
		{
			Thread.sleep(1000);
			subj=obj.findElements(By.xpath(".//td[text()='Wishes']"));
			 Thread.sleep(1000);
			 subj.get(0).click();
		}
	
		
	}
	@BeforeMethod
	@Given("^Enter the Kiosk app URL$")
	public void Beforemethods() throws InterruptedException
	{
	
		  PropertyConfigurator.configure("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\log4jj.properties");
		
			  System.setProperty("webdriver.ie.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\IEDriverServer.exe");
			  obj=new InternetExplorerDriver(); 
	
		 
		//  System.setProperty("webdriver.chrome.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver_win32\\chromedriver.exe");  
		//  obj=new ChromeDriver();
           Thread.sleep(1500);
		  obj.get("http://inmatecr01.sgssys.info/kioskapplogin");
		  log.info("Logged in Success");
		  obj.manage().window().maximize();
		
		  obj.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS); 
		 
		  
		  }
		 @After
		  public void Screenshot(Scenario scenario) {  
		      if (scenario.isFailed()) {  
		          try {  
		        	  scenario.write("Current Page URL is " + obj.getCurrentUrl());
		              byte[] screenshot = ((TakesScreenshot) obj).getScreenshotAs(OutputType.BYTES); 
		              
		              scenario.embed(screenshot, "image/png");  
		          } catch (WebDriverException wde) {  
		              System.err.println(wde.getMessage());  
		          } catch (ClassCastException cce) {  
		              cce.printStackTrace();  
		          }  
		      }
		 }
}
	
