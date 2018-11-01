package com.inmate.publicdefender;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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

/*public PublicUser()
{
	this.obj=obj;
}
public WebDriver getDriver()
{
	return this.obj;
}*/


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
	Thread.sleep(2000);
	pu.UserName.sendKeys(Login2.get(0).get(1));
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
	obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(1000);
	pu.UserName.sendKeys(Login1.get(0).get(1));
	Thread.sleep(1500);
	pu.Passwd.sendKeys(Login1.get(1).get(1));
	Thread.sleep(1000);
	pu.btnlogin.click();
	Thread.sleep(1000);
	pu.UserName.sendKeys(Login1.get(0).get(1));
	Thread.sleep(1000);
	pu.btnlogin.click();
	log.info("LoggedIn Success");
}
@Then("^Create the Message and send$")
public void createNewMsg(DataTable Msgs) throws InterruptedException
{
	List<List<String>> Msgs1=Msgs.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(5000);
	obj.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	Thread.sleep(1000);
	pu.PUCreateMsg.click();
	Thread.sleep(1000);
	pu.PUMessage.click();
	Thread.sleep(1000);
	pu.btnSend.click();
	Thread.sleep(1000);
	Select inmate=new Select(pu.SelectInmate);
	inmate.selectByVisibleText(Msgs1.get(0).get(1));
	Thread.sleep(1000);
	pu.btnSend.click();
	Thread.sleep(1000);
	pu.Subject.sendKeys(Msgs1.get(1).get(1));
	Thread.sleep(1000);
	pu.btnSend.click();
	Thread.sleep(1000);
	pu.btnOk.click();
	Thread.sleep(1000);
	pu.PUMessageBody.sendKeys(Msgs1.get(2).get(1));
	Thread.sleep(1000);
	pu.btnSend.click();
	obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(2000);
	String PopupMsg=obj.findElement(By.id("ContentPlaceHolder1_uctlMessage_lblMessage")).getText();
												
	String pop1="Message cannot be sent until credits are purchased";
	String pop2="Repeated";
	String pop3="Message sent successfully";
 
	if(PopupMsg.contains(pop2) || PopupMsg.contains(pop3) )
	{
		 Thread.sleep(1000);
		 System.out.println("Message is going to send");
		 pu.btnOk.click();
	}
	else{
		 System.out.println("Msg Can't be Send because No Credit");
		 Thread.sleep(1000);
		 pu.btnOk.click();
		 Thread.sleep(2000);
			Select creditamts=new Select(pu.CreditAmt);
			creditamts.selectByVisibleText(Msgs1.get(3).get(1));
			Thread.sleep(1000);
			int x=1;
			switch(x)
			{
			case 1:
				Thread.sleep(1000);
				pu.Purchase.click();
				break;
			case 2:
				Thread.sleep(1000);
				pu.Cancel.click();
				break;
			}
			obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			pu.Paypal_uname.sendKeys(Msgs1.get(4).get(1));
			Thread.sleep(1000);
			pu.Next.click();
			obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			pu.Paypal_passwd.sendKeys(Msgs1.get(5).get(1));
			obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			pu.Login.click();
			Thread.sleep(25000);
			pu.Pay.click();
	}
}
@And("^Create the Photo and send$")
public void CreatePhoto(DataTable Photo) throws InterruptedException
{
	List<List<String>> pho1=Photo.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(4000);
	pu.PUCreateMsg.click();
	Thread.sleep(1000);
	pu.PUPhotos.click();
	Thread.sleep(1000);
	pu.btnSend.click();
	Thread.sleep(1000);
	Select inmate=new Select(pu.SelectInmate);
	inmate.selectByVisibleText(pho1.get(0).get(1));
	Thread.sleep(1000);
	pu.btnSend.click();
	Thread.sleep(1000);
	pu.Subject.sendKeys(pho1.get(1).get(1));
	Thread.sleep(1300);
	pu.btnSend.click();
	Thread.sleep(1000);
	pu.ChoosePDF.sendKeys("C:\\Users\\prakashd.MPIDC\\Desktop\\sfc.svg");
	Thread.sleep(2000);
	pu.UploadBtn.click();
	Thread.sleep(1000);
	pu.btnSend.click();
	Thread.sleep(1000);
	pu.ChoosePDF.sendKeys("C:\\Users\\prakashd.MPIDC\\Desktop\\rug.jpg");
	Thread.sleep(2000);
	pu.UploadBtn.click();
	Thread.sleep(2000);
	pu.btnRotate90.click();
	Thread.sleep(1000);
	pu.btnRotate180.click();
	Thread.sleep(1000);
	pu.btnRotate270.click();
	Thread.sleep(1000);
	pu.btnSend.click();
	Thread.sleep(2000);
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
/*	Thread.sleep(2000);
	pu.InboxBtn.click();*/
	/*Thread.sleep(1500);
	if(obj.findElement(By.xpath("//*[@id='pagewrap']/div[2]/div[3]/div[2]/i")).isDisplayed())
	{
		Thread.sleep(1500);
		obj.findElement(By.xpath("//*[@id='pagewrap']/div[2]/div[3]/div[2]/i")).click();
	}*/
	Thread.sleep(4000);
	pu.InboxBtn.click();
	/*Thread.sleep(4000);
	pu.SearchInbox.sendKeys(inbox.get(0).get(1));*/
	Thread.sleep(1500);
	for(int j=1;j<2;j++)
	{
	Thread.sleep(1000);
	obj.findElement(By.xpath("//*[@id='divLoadList']/div["+j+"]/i")).click();
	String Inbox_Username=obj.findElement(By.xpath("//*[@id='divLoadList']/div["+j+"]/i")).getText();
	System.out.println(Inbox_Username);
	Thread.sleep(1000);
	String COD_popupp="Message thread contains";
    String codd=obj.findElement(By.xpath("//span[@id='lblMessage']")).getText();
    if(codd.contains(COD_popupp))
    {
    //	Thread.sleep(2000);
    	pu.OkBtn.click();
    	Thread.sleep(1000);
    	pu.COD_Msg(inboxmsg);
    	
    	/*Thread.sleep(35000);
    	pu.COD_Pending.click(); 
    	Thread.sleep(1500);
    	pu.CheckAll.click();
    	Thread.sleep(1000);
    	String LowBalance=obj.findElement(By.xpath("//*[contains(text(),'Credit balance is low to select all items.')]")).getText();
        String lowbal="Credit balance is low";
        if(LowBalance.contains(lowbal))
        {
        	Thread.sleep(1000);
        	pu.BtnOk.click();
        	Thread.sleep(1000);
        	pu.ApproveAll.click();
        	Thread.sleep(1000);
        	pu.BtnOk.click();
        	Thread.sleep(1000);
        	pu.PurchaseCredit(inboxmsg);
        }*/
    }
    else{
    	Thread.sleep(1000);
    	ReplyMsg(inboxmsg);
    }
	}
	
	/*obj.findElement(By.xpath("//*[contains(text(),'peter MATHE...')]")).click();
	Thread.sleep(3000);
    String COD_popup="Message thread contains";
    String cod1=obj.findElement(By.xpath("//span[@id='lblMessage']")).getText();
    if(cod1.contains(COD_popup))
    {
    	Thread.sleep(1000);
    	pu.OkBtn.click();
    }
    Thread.sleep(1000);
    pu.scroll();
    Thread.sleep(500);
    pu.SendMsg.click();
    Thread.sleep(1000);
    pu.OkBtn.click();
    Thread.sleep(1000);
    pu.ReplyMessage.sendKeys(inbox.get(1).get(1));
 	Thread.sleep(2000);
 	pu.SendMsg.click();
 	Thread.sleep(10000);
 	pu.BtnOkk.click();
 	
 	// Paying to Public user using sandbox account
 	Thread.sleep(2000);
	Select creditamts=new Select(pu.CreditAmt);
	creditamts.selectByVisibleText(inbox.get(2).get(1));
	Thread.sleep(1000);
	int x=1;
	switch(x)
	{
	case 1:
		Thread.sleep(1000);
		pu.Purchase.click();
		break;
	case 2:
		Thread.sleep(1000);
		pu.Cancel.click();
		break;
	}
	obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	pu.Paypal_uname.sendKeys(inbox.get(3).get(1));
	Thread.sleep(1000);
	pu.Next.click();
	obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	pu.Paypal_passwd.sendKeys(inbox.get(4).get(1));
	obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	pu.Login.click();
	Thread.sleep(25000);
	pu.Pay.click();*/
	
	
//	WebElement inboxNamElement=obj.findElement(By.xpath("//*[contains(text(),'C.O.D Pendi...')]"));
//	List<WebElement> inboxName1=obj.findElements(By.xpath("//*[contains(text(),'C.O.D Pendi...')]"));
/*	if(inboxNamElement.getText()=="C.O.D Pendi...")
	{
		Thread.sleep(1000);
		inboxName1.get(0).click();
		Thread.sleep(5000);
		//System.out.println(obj.findElement(By.className("formheadingPopup")).getText());
		//pu.BtnOkk.click();
		obj.findElement(By.xpath("//*[@class='col-popup-submit' and contains(text(),'Ok')]")).click();
	}
	else{
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
	}*/
	  Thread.sleep(2000);
    //  ReplyMsg(inboxmsg);
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
	Thread.sleep(2000);
	if(obj.findElement(By.xpath("//*[@id='pagewrap']/div[2]/div[3]/div[2]/i")).isDisplayed())
	{
		Thread.sleep(1500);
		obj.findElement(By.xpath("//*[@id='pagewrap']/div[2]/div[3]/div[2]/i")).click();
	}
	Thread.sleep(2000);
	//pu.SearchInbox.sendKeys(arc.get(0).get(1));
	Thread.sleep(1500);
	List<WebElement> Msgs=obj.findElements(By.className("col-user"));
	{
		for(int i=0;i<Msgs.size();i++)
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
public void find_Inmate(DataTable Findinmates) throws InterruptedException, IOException
{
	List<List<String>> fi=Findinmates.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(3000);
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
	Sorting_FindInmate();
}
@Then("^Sorting My Contacts$")
public void Sorting_MyContacts(DataTable mycont) throws InterruptedException
{
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(4000);
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
@Then("^Goto SentPhotos$")
public void SentPhotos(DataTable SentPhoto) throws InterruptedException
{
	POM_PubDefender pom=new POM_PubDefender(obj);
	pom.SentPhotos(SentPhoto);
}
@Then("^Goto COD Pending$")
public void COD_Pending() throws InterruptedException, AWTException
{
	POM_PubDefender pom=new POM_PubDefender(obj);
	pom.COD_Pending();
}
@Then("^Goto Archived page$")
public void Archived_Msg(DataTable ArchivMsg) throws InterruptedException
{
	POM_PubDefender pom=new POM_PubDefender(obj);
	pom.ArchivedMsg(ArchivMsg);
}

@Then("^Click purchase credit and pay$")
public void Purchase_Credit(DataTable inmate) throws InterruptedException
{
	POM_PubDefender pom=new POM_PubDefender(obj);
	pom.PurchaseCredit(inmate);
}


@BeforeMethod
@Given("^Enter the Inmate public user URL$")
public void beforeMethod() {
	  PropertyConfigurator.configure("D:\\Prakash_Automation\\Inmate\\log4j.properties");

	      System.setProperty("webdriver.chrome.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver.exe");  
		  obj=new ChromeDriver();
	    
	  	  obj.get("http://inmatecr01.sgssys.info/");
	  	  obj.manage().window().maximize();
	  	  obj.manage().logs().getClass();
	  	  obj.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS); 
	  }


	 @After
	  public String Screenshot(Scenario scenario) throws IOException {  
	      /*if (scenario.isFailed()) {  
	          try {  
	        	  scenario.write("Current Page URL is " + obj.getCurrentUrl());
	              byte[] screenshot = ((TakesScreenshot) obj).getScreenshotAs(OutputType.BYTES); 
	              
	              scenario.embed(screenshot, "image/png");  
	          } catch (WebDriverException wde) {  
	              System.err.println(wde.getMessage());  
	          } catch (ClassCastException cce) {  
	              cce.printStackTrace();  
	          }  
	      }*/
		 if(scenario.isFailed())
		 {
		    String timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime());;
			TakesScreenshot screen = (TakesScreenshot) obj;
			File src = screen.getScreenshotAs(OutputType.FILE);
			String dest ="D:\\Prakash_Automation\\Chif\\Screenshots_Admin\\"+timeStamp+".png";
			File target = new File(dest);
			FileUtils.copyFile(src, target);
			return dest;
		 }
		return null;
	      }
	 public void ReplyMsg(DataTable inboxmsg) throws InterruptedException
	 {
	 	List<List<String>> inbx=inboxmsg.raw();
	 	POM_PubDefender pd = new POM_PubDefender(obj);
	 	Thread.sleep(2000);
	// 	Deletemsg();
	 //	Thread.sleep(2000);
	 	pd.SendMsg.click();
	 	Thread.sleep(2000);
	 	pd.BtnOkk.click();
	 	Thread.sleep(1500);
	 	pd.ReplyMessage.sendKeys(inbx.get(1).get(1));
	 	Thread.sleep(2000);
	 	pd.SendMsg.click();
	 	Thread.sleep(10000);
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
	 		 for(int i=0;i<1;i++)
	 		 {
	 			 Thread.sleep(1000);
	 			inmates=obj.findElements(By.className("odd"));
	 			Thread.sleep(1000);
	 			inmates.get(0).click();
	 		 }
	 		Thread.sleep(4000);
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
	 		 Thread.sleep(2000);
	 		 pd.TransferFund.click();
	 		 Thread.sleep(1500);
	 		 Select ToInmate=new Select(pd.InmateNames);
	 		 ToInmate.selectByVisibleText(myc.get(1).get(1));
	 		 Thread.sleep(1000);
	 		 pd.TransferAmount.clear();
	 		 pd.TransferAmount.sendKeys(myc.get(2).get(1));
	 		 Thread.sleep(2000);
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
	 		 for(int i=2;i<3;i++)
	 		 {
	 			 Thread.sleep(1000);
	 			inmates=obj.findElements(By.className("odd"));
	 			Thread.sleep(1000);
	 			inmates.get(2).click();
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
	 		 for(int i=0;i<1;i++)
	 		 {
	 			Thread.sleep(1000);
	 			inmates=obj.findElements(By.className("odd"));
	 			Thread.sleep(1000);
	 			inmates.get(0).click();
	 		 }
	 		 Thread.sleep(2500);
	 		 pd.PurchaseHistory.click();
	 		 Thread.sleep(5000);
	 		 obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[1]")).click();
	 		 System.out.println("Amount Before Sorting:");
	 		 Sorting_purchaseHistory_Before();
	 		 Thread.sleep(1000); 
	 	     obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[1]")).click();
	 	     System.out.println("Amount After Sorting:");
	 		 Sorting_purchaseHistory_After();
	 		 
	 		 Thread.sleep(1000);
	 		 obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[2]")).click();
	 		 System.out.println("CreditDebitId Before Sorting:");
	 		 Sorting_purchaseHistory_Before();
	 		 Thread.sleep(1000); 
	 	     obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[2]")).click();
	 	    System.out.println("CreditDebitId After Sorting:");
	 		 Sorting_purchaseHistory_After();
	 		 
	 		 Thread.sleep(1000);
	 		 obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[3]")).click();
	 		 System.out.println("Credit(+) Before Sorting:");
	 		 Sorting_purchaseHistory_Before();
	 		 Thread.sleep(1000); 
	 	     obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[3]")).click();
	 	    System.out.println("Credit(+) After Sorting:");
	 		 Sorting_purchaseHistory_After();
	 		 Thread.sleep(1000);
	 		 
	 		 obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[4]")).click();
	 		   System.out.println("Debit(-) Before Sorting:");
	 		 Sorting_purchaseHistory_Before();
	 		 Thread.sleep(1000); 
	 	     obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[4]")).click();
	 	    System.out.println("Debit(-) After Sorting:");
	 		 Sorting_purchaseHistory_After();
	 		 Thread.sleep(1000);
	 		 
	 		 obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[5]")).click();
	 		 System.out.println("Purpose Before Sorting:");
	 		 Sorting_purchaseHistory_Before();
	 		 Thread.sleep(1000); 
	 	     obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[5]")).click();
	 		 System.out.println("Purpose After Sorting:");
	 		 Sorting_purchaseHistory_After();
	 		 Thread.sleep(1000);
	 		 
	 		 obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[6]")).click();
	 		 System.out.println("Date Before Sorting:");
	 		 Sorting_purchaseHistory_Before();
	 		 Thread.sleep(1000); 
	 	     obj.findElement(By.xpath("//*[@id='example']/thead/tr/th[6]")).click();
	 		 System.out.println("Date After Sorting:");
	 		 Sorting_purchaseHistory_After();
	 		 Thread.sleep(1000);
	 		 
	 		 
	 		 for(int i=2;i<5;i++)
	 		 {
	 			Thread.sleep(2000);
	 			obj.findElement(By.xpath("//*[@id='example_next']")).click();
	 			
	 		 }
	 		 Thread.sleep(1000);
	 		 for(int i=2;i<5;i++)
	 		 {
	 			Thread.sleep(2000);
	 			obj.findElement(By.xpath("//*[@id='example_previous']")).click();
	 			
	 		 }
	 	 }
	 	 public void Sorting_purchaseHistory_Before()
	 	 {
	 		
	 		List<WebElement> Amt=obj.findElements(By.className("odd"));
	 		List<WebElement> Amt1=obj.findElements(By.className("even"));
	 		 /*for(WebElement e:Amt)
	 		 {
	 			 System.out.println(e.getText());
	 		 }
	 		 for(WebElement e1:Amt1)
	 		 {
	 			 System.out.println(e1.getText());
	 		 }*/
	 		for(int i=0;i<5;i++)
	 		{
	 			System.out.println(Amt.get(i).getText());
	 			System.out.println(Amt1.get(i).getText());
	 		}
	 	 }
	 	 public void Sorting_purchaseHistory_After()
	 	 {
	 		
	 		List<WebElement> Amt=obj.findElements(By.className("odd"));
	 		List<WebElement> Amt1=obj.findElements(By.className("even"));
	 		for(int i=0;i<5;i++)
	 		{
	 			System.out.println(Amt.get(i).getText());
	 			System.out.println(Amt1.get(i).getText());
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
	 	public void Sorting_FindInmate() throws InterruptedException, IOException
	 	{
	 		
	 		POM_PubDefender pu=new POM_PubDefender(obj);
	 		System.out.println("Ascending order FindInmate_ID");
	 	    pu.PublicUser_FindInmate_ID();
	 	    System.out.println("Descending order FindInmate_ID");
	 	    pu.PublicUser_FindInmate_ID();
	 	    
	 		System.out.println("Ascending order FindInmate_FirstName");
	 	    pu.PublicUser_FindInmate_FirstName();
	 	    System.out.println("Descending order FindInmate_FirstName");
	 	    pu.PublicUser_FindInmate_FirstName();
	 	    
	 	    System.out.println("Ascending order FindInmate_LastName");
	 	 	pu.PublicUser_FindInmate_LastName();
	 	    System.out.println("Descending order FindInmate_LastName");
	 	 	pu.PublicUser_FindInmate_LastName();
	 	 	
	 	 	System.out.println("Ascending order FindInmate_Dob");
	 	 	pu.PublicUser_FindInmate_Dob();
	 		System.out.println("Descending order FindInmate_Dob");
	 	 	pu.PublicUser_FindInmate_Dob();
	 	 	
	 	 	System.out.println("Ascending order FindInmate_Location");
	 		pu.PublicUser_FindInmate_Location();
	 		System.out.println("Descending order FindInmate_Location");
	 		pu.PublicUser_FindInmate_Location();
	 		
	 		
	 	}
	 }