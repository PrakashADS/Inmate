package com.inmate.publicdefender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

import PageObjectModel.POM_PubDefender;
import PublicUserAutomation.Signup;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PublicUser {
private static WebDriver obj;
public static Logger log=Logger.getLogger(PublicUser.class.getName());

public PublicUser()
{
	this.obj=obj;
}
public WebDriver getDriver()
{
	return this.obj;
}


@When("^Signup using values$")
public void Signup_user(DataTable signup) throws InterruptedException
{
	Signup su=new Signup(obj);
	su.signUp(signup);
	
}
@Then("^Login using registered values$")
public void login_regUsers(DataTable LoginSignup) throws InterruptedException
{
	Signup su=new Signup(obj);
	su.LoginRegUsers(LoginSignup);
}
@And("^Find the Inmate$")
public void findInmate(DataTable findInmate) throws InterruptedException
{
	Signup su=new Signup(obj);
	su.FindInmates(findInmate);
}

@Then("^Goto purchaseCredit and buy$")
public void purchaseCredits(DataTable purchase) throws InterruptedException
{
	Signup su=new Signup(obj);
	su.purchaseCredit(purchase);
}
@Then("^Enter the userName and passWord to LogIn$")
public void LoginSignup(DataTable Logins) throws InterruptedException
{
	obj.findElement(By.id("lnkLogin")).click();
	List<List<String>> Login2=Logins.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(1000);
	pu.btnlogin.click();
	pu.Username.sendKeys(Login2.get(0).get(1));
	Thread.sleep(1000);
	pu.btnlogin.click();
	Thread.sleep(1000);
	pu.Passwd.sendKeys(Login2.get(1).get(1));
	Thread.sleep(1000);
	pu.btnlogin.click();
	log.info("LoggedIn Success");
}
@Then("^Enter userName and passWord to LogIn$")
public void Login(DataTable Login) throws InterruptedException
{
	List<List<String>> Login1=Login.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(1500);
	pu.btnlogin.click();
	Thread.sleep(1500);
	pu.Username.sendKeys(Login1.get(0).get(1));
	Thread.sleep(1500);
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
@Then("^Goto Inbox,Search message and Reply$")
public void Inbox(DataTable inboxmsg) throws InterruptedException
{
/*	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(2000);
	pu.InboxBtn.click();
	Thread.sleep(1000);
//	List<WebElement> inboxMsg=obj.findElements(By.xpath("//*[@id='example']/tbody/tr"));
	List<WebElement> inboxMsg=obj.findElements(By.className("odd"));
	
	for(int i=0;i<3;i++)                   
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
			Thread.sleep(1000);
			
		}
		
	}*/
	List<List<String>> inbox=inboxmsg.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(1500);
	pu.InboxBtn.click();
	Thread.sleep(1500);
	if(obj.findElement(By.xpath("//*[@id='pagewrap']/div[2]/div[3]/div[2]/i")).isDisplayed())
	{
		Thread.sleep(1500);
		obj.findElement(By.xpath("//*[@id='pagewrap']/div[2]/div[3]/div[2]/i")).click();
	}
	Thread.sleep(2000);
	pu.SearchInbox.sendKeys(inbox.get(0).get(1));
	Thread.sleep(1500);
	List<WebElement> Msgs=obj.findElements(By.className("col-user"));
	{
		for(int i=0;i<1;i++)
		{
			Thread.sleep(1000);
			Msgs=obj.findElements(By.className("col-user"));
			Thread.sleep(1000);
			Msgs.get(i).click();
		}
	}
	Thread.sleep(1000);
	ReplyMsg(inboxmsg);
	Thread.sleep(3000);
	
}

@Then("^Goto Archived,Search message and Reply$")
public void ArchivedMsg(DataTable inboxmsg) throws InterruptedException
{
	Thread.sleep(1000);
	List<List<String>> arc=inboxmsg.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(1500);
	pu.ArchivedMsg.click();
	Thread.sleep(1500);
	if(obj.findElement(By.xpath("//*[@id='pagewrap']/div[2]/div[3]/div[2]/i")).isDisplayed())
	{
		Thread.sleep(1500);
		obj.findElement(By.xpath("//*[@id='pagewrap']/div[2]/div[3]/div[2]/i")).click();
	}
	Thread.sleep(2000);
	pu.SearchInbox.sendKeys(arc.get(0).get(1));
	Thread.sleep(1500);
	List<WebElement> Msgs=obj.findElements(By.className("col-user"));
	{
		for(int i=0;i<1;i++)
		{
			Thread.sleep(1000);
			Msgs=obj.findElements(By.className("col-user"));
			Thread.sleep(1000);
			Msgs.get(i).click();
		}
	}
	Thread.sleep(1000);
	ReplyMsg(inboxmsg);
   //Thread.sleep(3000);
	Deletemsg();
}


@Then("^Sort the inbox$")
public void Sorting_Inbox() throws InterruptedException
{
	   POM_PubDefender pu=new POM_PubDefender(obj);
	   Thread.sleep(1000);
	 //   pu.PublicUser_Inbox_Subj();	
    //    pu.PublicUser_Inbox_From();
          pu.PublicUser_Inbox_Date();
          
}
@Then("^Sort the Sent items")
public void Sorting_SentItems() throws InterruptedException
{
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(2500);
	pu.SentItems.click();
	Thread.sleep(1000);
	//	pu.PublicUser_SentItems_Subject();
	//  pu.PublicUser_SentItems_To();
	    pu.PublicUser_SentItems_date();
}

@Then("^Find the inmate$")
public void find_Inmate(DataTable Findinmates) throws InterruptedException
{
	List<List<String>> fi=Findinmates.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(1000);
	pu.FindInmates.click();
	Thread.sleep(1000);
	Select states=new Select(pu.State);
	states.selectByVisibleText(fi.get(0).get(1));
	Thread.sleep(1000);
	Select facCode=new Select(pu.facilityCode);
	facCode.selectByVisibleText(fi.get(1).get(1));
	Thread.sleep(1000);
	pu.SaveBtn.click();
	Thread.sleep(1000);
  //pu.PublicUser_FindInmate_ID();
  //pu.PublicUser_FindInmate_FirstName();
 //	pu.PublicUser_FindInmate_LastName();
 //	pu.PublicUser_FindInmate_Dob();
	pu.PublicUser_FindInmate_Location();
	
}
@Then("^Sorting My Contacts$")
public void Sorting_MyContacts(DataTable mycont) throws InterruptedException
{
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(2000);
	pu.MyContacts.click();
	Thread.sleep(1000);
	//pu.PublicUser_MyContact_InmateID();
	
	//pu.PublicUser_MyContact_InmateID();
	
	/*pu.PublicUser_MyContact_LastName();
	pu.PublicUser_MyContact_FirstName();
	pu.PublicUser_MyContact_FacilityName();
	pu.PublicUser_MyContact_Credits();*/
	MyContacts(mycont);
	
	
}
@BeforeMethod
@Given("^Enter the Inmate public user URL$")
public void beforeMethod() {
	  PropertyConfigurator.configure("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\log4j.properties");

	      System.setProperty("webdriver.chrome.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver.exe");  
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
	 public void ReplyMsg(DataTable inboxmsg) throws InterruptedException
	 {
	 	List<List<String>> inbx=inboxmsg.raw();
	 	POM_PubDefender pd = new POM_PubDefender(obj);
	 	Thread.sleep(1000);
	 	Deletemsg();
	 	Thread.sleep(1000);
	 	pd.SendMsg.click();
	 	Thread.sleep(2000);
	 	pd.BtnOkk.click();
	 	Thread.sleep(1500);
	 	pd.ReplyMessage.sendKeys(inbx.get(1).get(1));
	 	Thread.sleep(2000);
	 	pd.SendMsg.click();
	 	Thread.sleep(7000);
	 	pd.BtnOkk.click();
	 }
	 public void Deletemsg() throws InterruptedException
	 {
	 	Thread.sleep(1000);
	 	if(obj.findElement(By.className("col-left-delete")).isDisplayed())
	 	{
	 		List<WebElement> del=obj.findElements(By.className("col-left-delete"));
	 		
	 		for(int i=0;i<1;i++)
	 		{
	 			Thread.sleep(1000);
	 			del=obj.findElements(By.className("col-left-delete"));
	 			Thread.sleep(1000);
	 			del.get(i).click();
	 		}
	 		Thread.sleep(1000);
	 		YesNo();
	 		
	 		
	 	}}
	 	 public void YesNo() throws InterruptedException
	 	 {
	 		 int YesNo=2;
	 			switch(YesNo)
	 			{
	 			case 1:
	 				
	 				Thread.sleep(1500);
	 				obj.findElement(By.xpath("//*[@id='divPopupYoN']/div[3]/div[1]")).click();
	 				break;
	 			case 2:
	 				Thread.sleep(1500);
	 				obj.findElement(By.xpath("//*[@id='divPopupYoN']/div[3]/div[2]")).click();
	 				break;
	 				
	 	 }}
	 	 public void MyContacts(DataTable mycont) throws InterruptedException
	 	 {
	 		 List<List<String>> myc=mycont.raw();
	 		 POM_PubDefender pd=new POM_PubDefender(obj);
	 		 Thread.sleep(1000);
	 		pd.SearchContact.clear();
	 		 pd.SearchContact.sendKeys(myc.get(0).get(1));
	 		 Thread.sleep(1000);
	 		 List<WebElement> inmates=obj.findElements(By.className("odd"));
	 		 for(int i=0;i<inmates.size();i++)
	 		 {
	 			 Thread.sleep(1000);
	 			inmates=obj.findElements(By.className("odd"));
	 			Thread.sleep(1000);
	 			inmates.get(0).click();
	 		 }
	 		Thread.sleep(1000);
	 		TransferFund(mycont);
	 		Thread.sleep(1000);
	 		CancelRequest(mycont);
	 		Thread.sleep(1000);
	 		PurchaseHistory(mycont);
	 	 }
	 	 public void TransferFund(DataTable mycont) throws InterruptedException
	 	 {
	 		 List<List<String>> myc=mycont.raw();
	 		 POM_PubDefender pd=new POM_PubDefender(obj);
	 		 Thread.sleep(1500);
	 		 pd.TransferFund.click();
	 		 Thread.sleep(1500);
	 		 Select ToInmate=new Select(pd.InmateNames);
	 		 ToInmate.selectByVisibleText(myc.get(1).get(1));
	 		 Thread.sleep(1000);
	 		 pd.TransferAmount.clear();
	 		 pd.TransferAmount.sendKeys(myc.get(2).get(1));
	 		 Thread.sleep(1000);
	 		 pd.TransferNow.click();
	 		 Thread.sleep(1000);
	 		 pd.btnOk.click();
	 	 }
	 	 public void CancelRequest(DataTable mycont) throws InterruptedException
	 	 {
	 		 List<List<String>> myc=mycont.raw();
	 		 POM_PubDefender pd=new POM_PubDefender(obj);
	 		 Thread.sleep(2000);
	 		 pd.SearchContact.clear();
	 		 pd.SearchContact.sendKeys(myc.get(0).get(1));
	 		 Thread.sleep(1500);
	 		 List<WebElement> inmates=obj.findElements(By.className("odd"));
	 		 for(int i=0;i<inmates.size();i++)
	 		 {
	 			 Thread.sleep(1000);
	 			inmates=obj.findElements(By.className("odd"));
	 			Thread.sleep(1000);
	 			inmates.get(0).click();
	 		 }
	 		 Thread.sleep(2500);
             obj.findElement(By.id("btnCancelRequest")).click();
             YesNoo();
	 	 }
	 	 public void PurchaseHistory(DataTable mycont) throws InterruptedException
	 	 {
	 		List<List<String>> myc=mycont.raw();
	 		 Thread.sleep(1000);
	 		 POM_PubDefender pd=new POM_PubDefender(obj);
	 		 Thread.sleep(2000);
	 		 pd.SearchContact.clear();
	 		 pd.SearchContact.sendKeys(myc.get(0).get(1));
	 		 Thread.sleep(1500);
	 		 List<WebElement> inmates=obj.findElements(By.className("odd"));
	 		 for(int i=0;i<inmates.size();i++)
	 		 {
	 			 Thread.sleep(1000);
	 			inmates=obj.findElements(By.className("odd"));
	 			Thread.sleep(1000);
	 			inmates.get(0).click();
	 		 }
	 		 Thread.sleep(2500);
	 		 pd.PurchaseHistory.click();
	 		 Thread.sleep(1000);
	 		 obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[1]")).click();
	 		 Sorting_purchaseHistory();
	 		 Thread.sleep(1000);
	 		 obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[2]")).click();
	 		 Sorting_purchaseHistory();
	 		 Thread.sleep(1000);
	 		 obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[3]")).click();
	 		 Sorting_purchaseHistory();
	 		 Thread.sleep(1000);
	 		 obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[4]")).click();
	 		 Sorting_purchaseHistory(); 
	 		 Thread.sleep(1000);
	 		 obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[5]")).click();
	 		 Sorting_purchaseHistory(); 
	 		 Thread.sleep(1000);
	 		 obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[6]")).click();
	 		 Sorting_purchaseHistory();
	 		 Thread.sleep(1500);
	 		 
	 		 for(int i=2;i<5;i++)
	 		 {
	 			Thread.sleep(2000);
	 			obj.findElement(By.xpath("//*[@id='example_paginate']/span/a["+i+"]")).click();
	 			
	 		 }
	 	 }
	 	 public void Sorting_purchaseHistory()
	 	 {
	 		List<WebElement> Amt=obj.findElements(By.className("odd"));
	 		 for(WebElement e:Amt)
	 		 {
	 			 System.out.println("After Sorting:"+e.getText());
	 		 }
	 	 }
	 	 public void YesNoo() throws InterruptedException
		 {
			 int YesNo=2;
				switch(YesNo)
				{
				case 1:
					
					Thread.sleep(1500);
					obj.findElement(By.id("btnYes")).click();
					break;
				case 2:
					Thread.sleep(1500);
					obj.findElement(By.id("btnNo")).click();
					break;
				}	
		 }
	 }