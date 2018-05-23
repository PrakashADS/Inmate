package Run_KioskFacilityAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import PUBLICUSER_KIOSK.FindInmates;
import PageObjectModel.POM_PubDefender;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PublicUser5 {
private static WebDriver obj;
public static Logger log=Logger.getLogger(PublicUser5.class.getName());

public PublicUser5()
{
	this.obj=obj;
}
public WebDriver getDriver()
{
	return this.obj;
}
@When("^Enter userName and passWord to LogIn$")
public void Login(DataTable Login) throws InterruptedException
{
	List<List<String>> Login1=Login.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(1000);
	pu.btnlogin.click();
	pu.Username.sendKeys(Login1.get(0).get(1));
	Thread.sleep(1000);
	pu.btnlogin.click();
	Thread.sleep(1000);
	pu.Passwd.sendKeys(Login1.get(1).get(1));
	Thread.sleep(1000);
	pu.btnlogin.click();
	log.info("LoggedIn Success");
}

@Then("^Create the Message and send$")
public void createNewMsg(DataTable Msgs) throws InterruptedException
{
	List<List<String>> Msgs1=Msgs.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(2000);
	pu.PUCreateMsg.click();
	Thread.sleep(1000);
	pu.PUMessage.click();
	Thread.sleep(1000);
	Select inmate=new Select(pu.SelectInmate);
	inmate.selectByVisibleText(Msgs1.get(0).get(1));
	Thread.sleep(1000);
	pu.Subject.sendKeys(Msgs1.get(1).get(1));
	Thread.sleep(1000);
	pu.PUMessageBody.sendKeys(Msgs1.get(2).get(1));
	Thread.sleep(1000);
	pu.btnSend.click();
	Thread.sleep(1000);
	pu.btnOk.click();
}
@And("^Create the Photo and send$")
public void CreatePhoto(DataTable Photo) throws InterruptedException
{
	List<List<String>> pho1=Photo.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(2000);
	pu.PUCreateMsg.click();
	Thread.sleep(1000);
	pu.PUPhotos.click();
	Select inmate=new Select(pu.SelectInmate);
	inmate.selectByVisibleText(pho1.get(0).get(1));
	Thread.sleep(1000);
	pu.Subject.sendKeys(pho1.get(1).get(1));
	Thread.sleep(1000);
	pu.ChoosePDF.sendKeys("C:\\Users\\prakashd\\Desktop\\rug.jpg");
	Thread.sleep(1000);
	pu.UploadBtn.click();
	Thread.sleep(1000);
	pu.btnRotate90.click();
	Thread.sleep(1000);
	pu.btnRotate180.click();
	Thread.sleep(1000);
	pu.btnRotate270.click();
	Thread.sleep(1000);
	pu.btnSend.click();
	Thread.sleep(1000);
	pu.btnOk.click();
}
@Then("^Goto Inbox and Reply$")
public void Inbox() throws InterruptedException
{
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(2000);
	pu.InboxBtn.click();
	Thread.sleep(1000);
//	List<WebElement> inboxMsg=obj.findElements(By.xpath("//*[@id='example']/tbody/tr"));
	List<WebElement> inboxMsg=obj.findElements(By.className("odd"));
	
	for(int i=0;i<inboxMsg.size();i++)                   
	{
		Thread.sleep(1000);
		inboxMsg=obj.findElements(By.className("odd"));
	//	inboxMsg=obj.findElements(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[1]"));
		Thread.sleep(1000);
		inboxMsg.get(i).click();
		Thread.sleep(1000);
	//	pu.BackBtn.click();
	
		
		List<WebElement> rply=obj.findElements(By.className("fa-reply"));
		Thread.sleep(1000);
		for(int j=0;j<rply.size();j++)
		{
			Thread.sleep(1000);
			rply=obj.findElements(By.className("fa-reply"));
			Thread.sleep(1000);
			rply.get(j).click();
			Thread.sleep(1000);
			pu.PUMessageBody.sendKeys("xxxxxxxxx");
			Thread.sleep(1000);
			pu.btnSend.click();
			Thread.sleep(1000);
			pu.btnOk.click();
			Thread.sleep(1000);
			pu.InboxBtn.click();
		}
	}
}
@Then("^Find the Inmate$")
public void pdForm(DataTable findInmte) throws InterruptedException
{
	 FindInmates fi=new FindInmates(obj);
	 fi.findinmate(findInmte);
	 
}
@BeforeMethod
@Given("^Enter the Inmate public user URL$")
public void beforeMethod() {
	
	  PropertyConfigurator.configure("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\log4j.properties");

	   System.setProperty("webdriver.chrome.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver_win32\\chromedriver.exe");  
		  obj=new ChromeDriver();
	  
	  	  obj.get("http://inmatecr01.sgssys.info/");
	  	  obj.manage().window().maximize();
	  	  obj.manage().logs().getClass();
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