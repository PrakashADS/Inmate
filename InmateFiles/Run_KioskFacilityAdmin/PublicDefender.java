package Run_KioskFacilityAdmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.Console;
import java.io.FileInputStream;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.apache.http.util.Asserts;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import PageObjectModel.POM_PubDefender;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PublicDefender{
public static WebDriver obj;
public static Logger log=Logger.getLogger(PublicDefender.class.getName());

int randomInt;

private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
private static final int RANDOM_STRING_LENGTH = 6;
 
public PublicDefender()
{
	this.obj=obj;
}
public WebDriver getDriver()
{
	return this.obj;
}

@When("^Enter username and password to LogIn$")
public void LoginPage(DataTable login)
{
	List<List<String>> login1=login.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	pu.btnLogin.click();
	pu.txtUsername.sendKeys(login1.get(0).get(1));
	pu.btnLogin.click();
	pu.txtPassword.sendKeys(login1.get(1).get(1));
	pu.btnLogin.click();
	log.info("LoggedIn Success");
	
}

 @Then("^Goto Grievances and initiate Message$")
 public void GrievInitiateMsg()
 {
	POM_PubDefender pu=new POM_PubDefender(obj);
	pu.GrievancesBtn.click();
	pu.initiateMsg.click();
	log.info("Initiate message Clicked");
 }
 
 @Then("^Goto Grievances and Search Request$")
 public void ReqSearch1(DataTable Req) throws InterruptedException, AWTException
 {
	 List<List<String>> req1=Req.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj);
	 pu.GrievancesBtn.click();
	 Thread.sleep(1000);
	 Select StatusSearch=new Select(pu.SelectReqStatus);
	 StatusSearch.selectByVisibleText(req1.get(0).get(1));
	/* Thread.sleep(1000);
	 pu.ReqStartDate.sendKeys(req1.get(1).get(1));
	 pu.ReqEndDate.sendKeys(req1.get(2).get(1));
	 Thread.sleep(1000);
	 pu.RespStartDate.sendKeys(req1.get(3).get(1));
	 pu.RespEndDate.sendKeys(req1.get(4).get(1));*/
	 Thread.sleep(1000);
	    pu.InmateLastName1.click();
		pu.LastNameSearch.sendKeys(req1.get(5).get(1));
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		pu.InmateFrstName1.click();
		pu.FrstNameSearch.sendKeys(req1.get(6).get(1));
		Robot rb1=new Robot();
		rb1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		Select pod=new Select(pu.pod);
		pod.selectByVisibleText(req1.get(7).get(1));
		Thread.sleep(1000);
	    pu.SearchRequest.click();
	    Thread.sleep(1000);
	
       List<WebElement> pdforms = obj.findElements(By.xpath("//*[contains(text(),'pd form')]"));
		Thread.sleep(1000);
		for(int i=0;i<pdforms.size();i++){
			Thread.sleep(1000);
			pdforms = obj.findElements(By.xpath("//*[contains(text(),'pd form')]"));
			Thread.sleep(1000);
		    pdforms.get(0).click();
		    Thread.sleep(1500);
			pu.Accept.click();
			Thread.sleep(1000);
			pu.btnOk.click();
		
		}
			}
			
 @Then("^Goto Grievances,Request Search and Assign public staff$")
 public void ReqSearch(DataTable Req) throws InterruptedException, AWTException
 {
	 try {
		List<List<String>> req1=Req.raw();
		 POM_PubDefender pu=new POM_PubDefender(obj);
		 Thread.sleep(1000);
		 pu.GrievancesBtn.click();
		 Thread.sleep(1000);
		 Select StatusSearch=new Select(pu.SelectReqStatus);
		 StatusSearch.selectByVisibleText(req1.get(0).get(1));
		 Thread.sleep(1000);
		 pu.ReqStartDate.sendKeys(req1.get(1).get(1));
		 pu.ReqStartDate.sendKeys(req1.get(2).get(1));
		 Thread.sleep(1000);
	//	 pu.RespStartDate.sendKeys(req1.get(3).get(1));
	//	 pu.RespEndDate.sendKeys(req1.get(4).get(1));
		 Thread.sleep(1000);
		 pu.InmateLastName1.click();
			pu.LastNameSearch.sendKeys(req1.get(5).get(1));
			Robot rb=new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			pu.InmateFrstName1.click();
			pu.FrstNameSearch.sendKeys(req1.get(6).get(1));
			Robot rb1=new Robot();
			rb1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			Select pod=new Select(pu.pod);
			pod.selectByVisibleText(req1.get(7).get(1));
			Thread.sleep(1000);
		 //  List<WebElement> pdforms1 = obj.findElements(By.xpath("//*[contains(text(),'pd form')]"));
		 List<WebElement> pdforms1 = obj.findElements(By.xpath("//*[contains(text(),'pd form')]"));
		 Thread.sleep(2000);
					for(int i=0;i<=pdforms1.size()-1;i++)
					{
						Thread.sleep(1500);
						pdforms1 = obj.findElements(By.xpath("//*[contains(text(),'pd form')]"));
					//	System.out.println(pdforms1.get(i).getText());
						Thread.sleep(1000);
						pdforms1.get(i).click();
						Thread.sleep(1000);
						Select pubdef=new Select(pu.SelectPubdefender);
						pubdef.selectByVisibleText(req1.get(8).get(1));
						pu.AssignPD.click();
						Thread.sleep(1000);
						YesNo();
						/*int YesNo=2;
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
						}	*/
						Thread.sleep(1300);
						obj.findElement(By.id("ContentPlaceHolder1_btnBackForum")).click();
						
					}
	} catch (StaleElementReferenceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 @And("^Search the Message$")
 public void SearchMsg(DataTable griev) throws InterruptedException, AWTException
 {
	try {
		List<List<String>> grie=griev.raw();
		POM_PubDefender pu=new POM_PubDefender(obj);
		Thread.sleep(1000);
		Select rtypes=new Select(pu.ReqType);
		rtypes.selectByVisibleText(grie.get(0).get(1));
		Select rstatus=new Select(pu.ReqStatus);
		rstatus.selectByVisibleText(grie.get(1).get(1));
	/*	pu.ReqStartDate.clear();
	    pu.ReqStartDate.sendKeys(grie.get( 2).get(1));
	    pu.ReqEndDate.clear();
	    pu.ReqEndDate.sendKeys(grie.get(3).get(1));
	    pu.RespStartDate.clear();
		pu.RespStartDate.sendKeys(grie.get(4).get(1));
		pu.RespEndDate.clear();
		pu.RespEndDate.sendKeys(grie.get(5).get(1));*/
		/*pu.InmateLastName1.click();
		pu.LastNameSearch.sendKeys(grie.get(6).get(1));
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		pu.InmateFrstName1.click();
		pu.FrstNameSearch.sendKeys(grie.get(7).get(1));
		Robot rb1=new Robot();
		rb1.keyPress(KeyEvent.VK_TAB);*/
		Thread.sleep(1000);
		pu.SearchRequest.click();
		log.info("Message searched Success");
	} catch (StaleElementReferenceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 @And("^Create New Messages$")
 public void Create_Msg(DataTable NewMesg) throws InterruptedException, AWTException
 {
	 List<List<String>> nm=NewMesg.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj);
//	 Thread.sleep(1000);
//	 pu.initiateMsg.click();
	 Thread.sleep(1000);
	 pu.btnCreateNew.click();
	 Thread.sleep(1000);
	 Select msgType=new Select(pu.MessageType);
	 msgType.selectByVisibleText(nm.get(0).get(1));
	 List<WebElement> list = obj.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstSelectTypeOfConvo"));
		Boolean is_selected = list.get(0).isSelected();
		if (is_selected == true)
		{
	    list.get(1).click();
	    Thread.sleep(1000);
	   /* List<WebElement> mul=obj.findElements(By.xpath("//*[@id='ContentPlaceHolder1_tdMultiInmate']/div"));
	    for(int i=0;i<mul.size();i=i+1)
	    {
	    	mul.get(i).click();
	    }
	    */
	    pu.SelectBrownjalil.click();
	    Thread.sleep(1500);
	 //   pu.SelectFord.click();
	    
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	   
	    Thread.sleep(1000);
	    pu.SelectJohn.click();
	    Thread.sleep(1000);
	    char ReplyMode='A';
		switch(ReplyMode)
		{
		case 'A':
		        replyModeText(NewMesg);
		        break;
		case 'B':
	            replyModePdf();
	            break;
		case 'C':
	            replyModeBoth(NewMesg);
	            break;
		}
	
		} 
		else
		{
			list.get(0).click();
			 WebElement item1=new WebDriverWait(obj,60)
	         .until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSingleInmates")));
			  
			Select listItem1=new Select(item1); 
			
			for(Integer i=0;i<listItem1.getOptions().size();i++)
			{
			  listItem1.selectByIndex(1);
			
		
	
		char ReplyMode='A';
		switch(ReplyMode)
		{
		case 'A':
		        replyModeText(NewMesg);
		        break;
		case 'B':
	            replyModePdf();
	            break;
		case 'C':
	            replyModeBoth(NewMesg);
	            break;
		}
		
	 }  
	
 }}
@And("^Reply using Text PDF and Both$")
public void SendReply(DataTable NewMesg) throws InterruptedException
{
	char ReplyMode='C';
	switch(ReplyMode)
	{
	case 'A':
		    Thread.sleep(1000);	
	        replyModeText(NewMesg);
	        break;
	case 'B':
		    Thread.sleep(1000);
            replyModePdf();
            break;
	case 'C':
		    Thread.sleep(1000);
            replyModeBoth(NewMesg);
            break;
}
}
 @And("^Goto Message to Inmate$") 
 public void msgToInmate(DataTable rplyMsg) throws InterruptedException
 {
	 
	 POM_PubDefender pu=new POM_PubDefender(obj);
	 String s1=pu.MsgToInmate1.getText();
	 String s2="Message To Inmate 1";
	// if(s1.equalsIgnoreCase(s2))
	 Thread.sleep(1000);
	 List<WebElement> MsgToInmate1=obj.findElements(By.xpath("//a[contains(text(),'Message To Inmate 1')]"));
		 for(int i=0;i<1;i++)
		 {
			// pu.MsgToInmate1.click();
			 Thread.sleep(1000);
			 MsgToInmate1=obj.findElements(By.xpath("//a[contains(text(),'Message To Inmate 1')]"));
			 Thread.sleep(1000);
			 MsgToInmate1.get(i).click();
			 Thread.sleep(2000);
			 char ReplyMode='A';
				switch(ReplyMode)
				{
				case 'A':
					   Thread.sleep(1000);
					    pu.replyModetext1(rplyMsg);
				      //  break;
				case 'B':
					   Thread.sleep(2000);
			            pu.replyModePdf1();
			         //   break;
				case 'C':
					   Thread.sleep(1000);
					    pu.replyModeBoth1(rplyMsg);
			            
				} 
				Thread.sleep(1000);
				pu.BackBtn1.click();
		 }	
 }
 
 @Then("^Goto Grievences,search Visitor,Approve Visitor$")
 public void GrievenceVisitors(DataTable Visitors) throws InterruptedException
 {
	 List<List<String>> ty1=Visitors.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj);
	 Thread.sleep(1000);
	 pu.ReqGrievances.click();
	 Select type1=new Select(pu.FacilityType);
	 type1.selectByVisibleText(ty1.get(0).get(1));
	 Thread.sleep(700);
	 Select status1=new Select(pu.FacilityStatus);
	 status1.selectByVisibleText(ty1.get(1).get(1));
	 pu.SearchRequest.click();
	 Thread.sleep(1000);
	
	 List<WebElement> Visitors1 = obj.findElements(By.xpath("//a[contains(text(),'Visitor')]"));
	 boolean VisitorDisplay = obj.findElement(By.xpath("//a[contains(text(),'Visitor')]")).isDisplayed();
	 if(VisitorDisplay=true)
	
	 {
	 for(int i=0;i<Visitors1.size();i++)
	 {
		 obj.findElements(By.xpath("//a[contains(text(),'Visitor')]"));
		 Visitors1.get(i).click();
	 }
	 Thread.sleep(1000);
	 List<WebElement> Action2 = obj.findElements(By.name("ctl00$ContentPlaceHolder1$grvVisitorDetails$ctl02$rblApproveDisApprove"));
	 Boolean isSelected=Action2.get(0).isSelected();
	  List<WebElement> ChkBox=obj.findElements(By.xpath("//label[contains(text(),' The requested visitor is former inmate')]"));

	  if(isSelected=true)
	  {
		  Thread.sleep(1000);
		  Action2.get(0).click();	
		  pu.SubmitBtn.click();	
			Thread.sleep(1000);
			pu.btnOk.click();
	  }
	 }}
		/*if(isSelected=true)
		{
			Action2.get(0).click();
			Thread.sleep(700);
			ScrollUp250();
			Thread.sleep(700);
			pu.SubmitBtn.click();	
			Thread.sleep(700);
			pu.btnOk.click();
		}
		else
			{		
			Thread.sleep(1000);
			Action2.get(1).click();
			Thread.sleep(1000);
			ScrollUp250();
			Thread.sleep(1000);
			
			ChkBox.get(0).click();
		//	pu.chkFormerInmate.click();
			pu.OthersTxtBox.sendKeys(ty1.get(2).get(1));
			Thread.sleep(700);
			pu.SubmitBtn.click();
			Thread.sleep(700);
			pu.btnOk.click();
			}
	 }
	 else
	 {
		 System.out.println("No Visitors Found");
	 } 
	 Thread.sleep(1000);
	 List<WebElement> Action3 = obj.findElements(By.name("ctl00$ContentPlaceHolder1$grvVisitorDetails$ctl05$rblApproveDisApprove"));
	// Boolean isSelected=Action3.get(0).isSelected();      
	  if(isSelected=true)
	  {
		  Thread.sleep(1000);
		  Action2.get(1).click();	
	  }
     Thread.sleep(1000);
	 WebElement Actions3=obj.findElement(By.name("ctl00$ContentPlaceHolder1$grvVisitorDetails$ctl03$rblApproveDisApprove"));
	 if(Actions3.isDisplayed())                   
	 {
	 char AppDisApp='Y';
	 switch(AppDisApp)
	 {
	 case 'Y':
		    Thread.sleep(2000);
			Action3.get(0).click();
			Thread.sleep(700);
			ScrollUp250();
			Thread.sleep(700);
			pu.SubmitBtn.click();	
			Thread.sleep(700);
			pu.btnOk.click();
			break;
	 case 'N':	
			Thread.sleep(2000);
			ScrollUp250();
			Thread.sleep(1000);
			Action3.get(1).click();
			Thread.sleep(1000);
			ScrollUp250();
			Thread.sleep(1000);
		    List<WebElement> ChkBox1=obj.findElements(By.xpath("//label[contains(text(),' The requested visitor is former inmate')]"));
			ChkBox1.get(0).click();
		//	pu.chkFormerInmate.click();
			pu.OthersTxtBox1.sendKeys(ty1.get(2).get(1));
			Thread.sleep(700);
			pu.SubmitBtn.click();
			Thread.sleep(700);
			pu.btnOk.click();
			break;
			}
	 }
	 else
	 {
	  System.out.println("No Element found for Approval/DisApproval");
	  
	 }
	 }*/
	 
	 
 
 @Then("^Goto Grievences,search f1,send msg$")
 public void Grievencef1(DataTable rplyMsg2) throws InterruptedException, AWTException 
 {
	 List<List<String>> f1=rplyMsg2.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj);
	 Thread.sleep(1000);
	 pu.ReqGrievances.click();
	 Thread.sleep(1000);
	 Select type1=new Select(pu.FacilityType);
	 type1.selectByVisibleText(f1.get(0).get(1)); 
	/* Thread.sleep(700);
	 Select status1=new Select(pu.FacilityStatus);
	 status1.selectByVisibleText(f1.get(1).get(1));*/
	 Thread.sleep(1000);
	/* pu.ReqStartDate.sendKeys(f1.get(2).get(1));
	 pu.ReqEndDate.sendKeys(f1.get(3).get(1));
	 Thread.sleep(1000);
	 pu.RespStartDate.sendKeys(f1.get(4).get(1));
	 pu.RespEndDate.sendKeys(f1.get(5).get(1));
	 Thread.sleep(1000);*/
	    pu.InmateLastName1.click();
		pu.LastNameSearch.sendKeys(f1.get(6).get(1));
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		pu.InmateFrstName1.click();
		pu.FrstNameSearch.sendKeys(f1.get(7).get(1));
		Robot rb1=new Robot();
		rb1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		Select pod=new Select(pu.pod);
		pod.selectByVisibleText(f1.get(8).get(1));
		Thread.sleep(1000);
	 pu.SearchRequest.click();
	 Thread.sleep(2000);
	 List<WebElement> form1=obj.findElements(By.xpath("//a[contains(text(),'f1')]"));
	 Thread.sleep(1000);
//	 for(int i=0;i<form1.size();i++)
	 for(int i=0;i<1;i++)
	 {
		 Thread.sleep(1000);
		 form1=	 obj.findElements(By.xpath("//a[contains(text(),'f1')]"));
		 Thread.sleep(1000);
		 form1.get(i).click();
		 Thread.sleep(2000);
		
		 char replyModee='C';
			switch(replyModee)
			{
			case 'A':
				    Thread.sleep(1000);
				    pu.replyModetext2(rplyMsg2);
			        break;
			case 'B':
				    Thread.sleep(1000);
		            pu.replyModePdf2();
		            break;
			case 'C':
			    	Thread.sleep(1000);
				    pu.replyModeBoth2(rplyMsg2);
		            break;			 
			}
			   Thread.sleep(1000);
	           obj.findElement(By.id("ContentPlaceHolder1_btnBackForum")).click();
			}
	           
	 }
		 
 @Then("^Goto Grievences,search Admin,fill Request Remedy Form$")
 public void GrievenceAdmin(DataTable Admin) throws InterruptedException, AWTException 
 {
	 List<List<String>> Ad1=Admin.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj);
	 Thread.sleep(1000);
	 pu.ReqGrievances.click();
	 Thread.sleep(700);
	 Select type1=new Select(pu.FacilityType);
	 type1.selectByVisibleText(Ad1.get(0).get(1)); 
	 Thread.sleep(700);
	 Select status1=new Select(pu.FacilityStatus);
	 status1.selectByVisibleText(Ad1.get(1).get(1));
	 /* pu.ReqStartDate.sendKeys(Ad1.get(2).get(1));
	 pu.ReqEndDate.sendKeys(Ad1.get(3).get(1));
	 Thread.sleep(1000);
	 pu.RespStartDate.sendKeys(Ad1.get(4).get(1));
	 pu.RespEndDate.sendKeys(Ad1.get(5).get(1));
	 Thread.sleep(1000);*/
	   Thread.sleep(1000);
	    pu.InmateLastName1.click();
		pu.LastNameSearch.sendKeys(Ad1.get(6).get(1));
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		pu.InmateFrstName1.click();
		pu.FrstNameSearch.sendKeys(Ad1.get(7).get(1));
		Robot rb1=new Robot();
		rb1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		Select pod=new Select(pu.pod);
		pod.selectByVisibleText(Ad1.get(8).get(1));
		Thread.sleep(1000);
	 pu.SearchRequest.click();
	 Thread.sleep(1500);
	 List<WebElement> Admin1=obj.findElements(By.xpath("//a[contains(text(),'Admin')]"));
	 Thread.sleep(1000);
	 for(int i=0;i<1;i++)
	 {
		 Thread.sleep(1000);
		 Admin1=obj.findElements(By.xpath("//a[contains(text(),'Admin')]"));
		 Thread.sleep(1000);
		 Admin1.get(i).click();	
		 System.out.println(Admin1.get(i));
		 Thread.sleep(2000);
		 ScrollUp250();
		 Thread.sleep(1500);
		 pu.InvestigationTxt.clear();
		 pu.InvestigationTxt.sendKeys(Ad1.get(9).get(1));
		 pu.ReviewFindingTxt.clear();
		 pu.ReviewFindingTxt.sendKeys(Ad1.get(10).get(1));
		 pu.SupervisorSign.clear();
		 pu.SupervisorSign.sendKeys(Ad1.get(11).get(1));
		 pu.ReviewTitle.clear();
		 pu.ReviewTitle.sendKeys(Ad1.get(12).get(1));
		 pu.btnSaveRemedyForm.click();
		 Thread.sleep(500);
		 pu.btnOk.click();
		 Thread.sleep(1000);
		// obj.findElement(By.name("ctl00$ContentPlaceHolder1$btnBackRemedy")).click();
		
	 } 
	 
 }
 @When("^I click Documents$")
 public void UploadDocs(DataTable UploadDoc) throws InterruptedException
 {
	 List<List<String>> Doc1=UploadDoc.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj); 
	 Thread.sleep(1000);
	 pu.Documents.click();
	 Thread.sleep(1000);
	 pu.UploadDocuments.click();
	 Thread.sleep(1000);
	 pu.SaveBtn.click();
	 Thread.sleep(1000);
	    
	    Random rd = new Random();
		for (int idx = 1; idx <= 99; ++idx) {
			randomInt = rd.nextInt(100);		
		}
	 pu.DocsTitle.sendKeys(Doc1.get(0).get(1)+randomInt);
	 Thread.sleep(1000);
	 pu.ChoosePdf.sendKeys("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\Aws.doc");
	 Thread.sleep(1000);
	 pu.SaveBtn.click();
	 Thread.sleep(1000);
	 pu.ChoosePdf.sendKeys("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\cert.pdf");
	 Thread.sleep(1000);
	 pu.SaveBtn.click();
	 Thread.sleep(1000);
	 pu.btnOk.click();
		} 
 @Then("^Edit Documents$")
 public void EditDocs(DataTable documnts) throws InterruptedException
 {
	List<List<String>> dmt=documnts.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj); 
	 Thread.sleep(2000);
	/* pu.Documents.click();
	 Thread.sleep(1000);*/
	 pu.DocuTitle.sendKeys(dmt.get(0).get(1));
	 Thread.sleep(1000);
	 Select docsts=new Select(pu.DocuStatus);
	 docsts.selectByVisibleText(dmt.get(1).get(1));
	 Thread.sleep(1000);
	 pu.Fromdate.sendKeys(dmt.get(2).get(1));
	 pu.Todate.sendKeys(dmt.get(3).get(1));
	 Thread.sleep(1000);
	 pu.btnSearch.click();
	 Thread.sleep(1000);
	 List<WebElement> DocTitles=obj.findElements(By.id("lnkDocumentTitle"));
	// pu.DocTitle.click();
	 Thread.sleep(1000);
	for(int i=0;i<1;i++)
	
	 {
		 Thread.sleep(1000);
		 DocTitles=obj.findElements(By.id("lnkDocumentTitle"));
		 Thread.sleep(1000);
		 DocTitles.get(i).click();
	     pu.DocsTitle.clear();
	     
	    Random rd = new Random();
		for (int idx = 1; idx <= 99; ++idx) {
			randomInt = rd.nextInt(100);		
		}
	    pu.DocsTitle.sendKeys("Certificate"+randomInt);
	    Thread.sleep(500);
	    List<WebElement> Stats=obj.findElements(By.name("ctl00$ContentPlaceHolder1$rblStatus"));
	  
	    if(Stats.get(0).isSelected()==true || Stats.get(1).isSelected()==false)
	    {
	    	Thread.sleep(1000);
	    	Stats.get(0).click();
	    }
	    else
	    {
	    	Thread.sleep(1000);
	    	Stats.get(1).click();
	    }
	    Thread.sleep(1000);
	    pu.SaveBtn.click();
	    Thread.sleep(1000);
	    pu.btnOk.click(); 
	 }
 }
 @Then("^Delete Documents$")
 public void DeleteDocs(DataTable dele) throws InterruptedException
 {
	 List<List<String>> del=dele.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj); 
	 Thread.sleep(2000);
	 /*pu.Documents.click(); 
	 Thread.sleep(1000);*/
	 pu.DocuTitle.clear();
	 pu.DocuTitle.sendKeys(del.get(0).get(1));
	 Thread.sleep(1000);
	 Select docsts=new Select(pu.DocuStatus);
	 docsts.selectByVisibleText(del.get(1).get(1));
	 Thread.sleep(1000);
	 pu.Fromdate.sendKeys(del.get(2).get(1));
	 pu.Todate.sendKeys(del.get(3).get(1));
	 Thread.sleep(1000);
	 pu.btnSearch.click();
	 Thread.sleep(1000);
	 List<WebElement> DocDelete=obj.findElements(By.xpath("//input[@id='imgbtnDelete']"));
		 Thread.sleep(1000);
		 for(int i=0;i<1;i++)
		 {
			 Thread.sleep(1000);
			 DocDelete=obj.findElements(By.xpath("//input[@id='imgbtnDelete']")); 
			 Thread.sleep(1000);
			 DocDelete.get(i).click();
			 Thread.sleep(1000);
			 YesNoo();
		 }
		 Thread.sleep(1500);
		 obj.findElement(By.id("btnReset")).click();
		 
 }
@Then("^Lock,Unlock kiosk/inmate settings lockdown$")
public void LockUnlock() throws InterruptedException
{
	 POM_PubDefender pu=new POM_PubDefender(obj); 
	 Thread.sleep(1000);
	 pu.LockDown.click();
	 Thread.sleep(1000);
	 List<WebElement> lock=obj.findElements(By.id("chkKioskLockDownAllActive"));
	 Thread.sleep(1000);
	 for(int i=0;i<lock.size();i=i+1)
	 {
		 Thread.sleep(1000);
		 lock=obj.findElements(By.id("chkKioskLockDownAllActive"));
		 lock.get(i).click();
	 }
}
@Then("^Click Inmate,search and edit the inmate$")
public void inmateSearch(DataTable inmatess) throws InterruptedException, AWTException
{
    List<List<String>> inm1=inmatess.raw();
	POM_PubDefender pu=new POM_PubDefender(obj); 
	Thread.sleep(1000);
	pu.InMate.click();
	Thread.sleep(1000);
	/*pu.Inmate_Id.sendKeys(inm1.get(0).get(1));
	Thread.sleep(1000);
	Select pod1=new Select(pu.Pod_search);
	pod1.selectByVisibleText(inm1.get(1).get(1));
	Thread.sleep(1000);*/
	
/*	pu.LastNameSrch.click();
	pu.LastNameSearch.sendKeys(inm1.get(2).get(1));
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	pu.FrstNameSrch.click();
	pu.FrstNameSearch.sendKeys(inm1.get(3).get(1));
	Robot rb1=new Robot();
	rb1.keyPress(KeyEvent.VK_TAB);*/
	
	Thread.sleep(1000);
//	pu.DobStart.sendKeys(inm1.get(4).get(1));
//	pu.DobEnd.sendKeys(inm1.get(5).get(1));
	Thread.sleep(1000);
	Select gender=new Select(pu.Gender);
	gender.selectByVisibleText(inm1.get(4).get(1));
	Thread.sleep(1000);
	Select kioskAcc=new Select(pu.KioskAccess);
	kioskAcc.selectByVisibleText(inm1.get(5).get(1));
	Thread.sleep(1000);
	Select status2=new Select(pu.InmateStatuses);
	status2.selectByVisibleText(inm1.get(6).get(1));
	Thread.sleep(1000);
	pu.btnSearch.click();
	Thread.sleep(1000);
	ScrollUp250();
	Thread.sleep(1000);
	List<WebElement> inmateId=obj.findElements(By.id("lnkInmateResidentId"));
	inmateId.get(7).click();
	Thread.sleep(1000);
		//int k=6;
	/*for(int j=0;j<=10;j++)
	{
		Thread.sleep(1000);
		inmateId=obj.findElements(By.id("lnkInmateResidentId"));
		Thread.sleep(1000);
		inmateId.get(7).click();
	//	inmateId.get(0).click();
	}*/
		Thread.sleep(1000);
		pu.FrequencyLimit.clear();
		pu.FrequencyLimit.sendKeys(inm1.get(7).get(1));
		Thread.sleep(1000);
		pu.Notes.clear();
		pu.Notes.sendKeys(inm1.get(8).get(1));
		Thread.sleep(1000);
		pu.InvestigatorEmail.clear();
		pu.InvestigatorEmail.sendKeys(inm1.get(9).get(1));
		pu.SaveInmate.click();
		Thread.sleep(1000);
		pu.InvestigatorEmail.clear();
		pu.InvestigatorEmail.sendKeys(inm1.get(10).get(1));
		Thread.sleep(1000);
	
	/*	pu.SaveInmate.click();
		Thread.sleep(500);
		pu.btnOk.click();*/
		//Thread.sleep(1000);
		//pu.inmateBack.click();
	}
//}
@And("^Click Inmate Message$")
public void InmateMessage(DataTable InmateMsg) throws InterruptedException, AWTException
{
	List<List<String>> inmsg=InmateMsg.raw();
	POM_PubDefender pu=new POM_PubDefender(obj); 
	Thread.sleep(1000);
	ScrollDown700();
	Thread.sleep(1000);
	ScrollDown700();
	Thread.sleep(1000);
	obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	/*WebDriverWait w1=new WebDriverWait(obj, 50);
	w1.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_anchrMessages")));*/
	pu.Messages.click();
	Thread.sleep(1000);
	pu.LastNameInmate.click();
	Thread.sleep(1000);
	pu.AutoCompleteLastName.sendKeys(inmsg.get(0).get(1));
	Thread.sleep(1000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	pu.FirstNameInmate.click();
	Thread.sleep(1000);
	pu.AutoCompleteFirstName.sendKeys(inmsg.get(1).get(1));
	Thread.sleep(1000);
	Robot r1=new Robot();
	r1.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	pu.SearchMsg.click();
	Thread.sleep(1000);
	List<WebElement> subj1=obj.findElements(By.xpath("//a[@id='lblMessageSubject']"));
	Thread.sleep(1000);
	ScrollUp250();
	Thread.sleep(1000);
	subj1.get(5).click();
	Thread.sleep(1000);
	pu.BtnTranslate.click();
	Thread.sleep(1500);
	//obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	pu.BackButton.click();
	/*WebDriverWait w1=new WebDriverWait(obj, 50);
	w1.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBackForum")));*/
}
@And("^Click Inmate Photos$")
public void InmatePhotos(DataTable InmatePhoto) throws InterruptedException, AWTException
{
	List<List<String>> inPhoto=InmatePhoto.raw();
	POM_PubDefender pu=new POM_PubDefender(obj); 
	Thread.sleep(1500);
	pu.Photos.click();
	Thread.sleep(1000);
	pu.LastNamePhotos.click();
	Thread.sleep(1000);
	pu.AutoCompLastNamePhoto.sendKeys(inPhoto.get(0).get(1));
	Thread.sleep(1000);
	Robot r2=new Robot();
	r2.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	pu.FirstNamePhotos.click();
	Thread.sleep(1000);
	pu.AutoCompFirstNamePhoto.sendKeys(inPhoto.get(1).get(1));
	Thread.sleep(1000);
	Robot r3=new Robot();
	r3.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	pu.btnSearchPhotos.click();
	Thread.sleep(1000);
	List<WebElement> photos=obj.findElements(By.id("lblPhotoSubject"));
	Thread.sleep(1000);
	for(int i=0;i<1;i++)
	{
		Thread.sleep(1000);
		photos=obj.findElements(By.id("lblPhotoSubject"));
		Thread.sleep(1000);
		ScrollUp250();
		Thread.sleep(1000);
		photos.get(i).click();
		Thread.sleep(1000);
		pu.Back1.click();
	}	
}
@Then("^Goto Connection Request and review the information$")
public void ConnectionRequest() throws InterruptedException
{
	POM_PubDefender pu=new POM_PubDefender(obj); 
	Thread.sleep(1500);
	pu.ConnectionRequest.click();
	Thread.sleep(1000);
	ScrollUp400();
	Thread.sleep(1000);
	for(int i=2;i<=3;i++)
	{
		Thread.sleep(1000);
		ScrollUp400();
		Thread.sleep(1000);
		obj.findElement(By.xpath("//*[@id='grdvwInviteRequests']/tbody/tr[12]/td/table/tbody/tr/td["+i+"]/a")).click();	
	} 
	Thread.sleep(1000);
	ScrollDown350();
	Thread.sleep(1000);
	pu.Back2.click();
	
}
@Then("^Initiate Message to Inmate$")
public void initMsg(DataTable InitMsg) throws InterruptedException, AWTException
{
	 List<List<String>> inM=InitMsg.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj);
	 Thread.sleep(1000);
	 pu.ReqGrievances.click();
	 Thread.sleep(1000);
	 pu.initiateMsg.click();
	 Thread.sleep(1000);
	 pu.btnCreateNew.click();
	 Thread.sleep(1000);
	 Select msgType=new Select(pu.MessageType);
	 msgType.selectByVisibleText(inM.get(0).get(1));
	 List<WebElement> list = obj.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstSelectTypeOfConvo"));
		Boolean is_selected = list.get(0).isSelected();
		if (is_selected == true)
		{
	    list.get(1).click();
	    Thread.sleep(1000);
	   /* List<WebElement> mul=obj.findElements(By.xpath("//*[@id='ContentPlaceHolder1_tdMultiInmate']/div"));
	    for(int i=0;i<mul.size();i=i+1)
	    {
	    	mul.get(i).click();
	    }
	    */
	    pu.SelectBrownjalil.click();
	    Thread.sleep(1000);
	 //   pu.SelectFord.click();
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    
       Thread.sleep(1000);
	    pu.SelectJohn.click();
	    Thread.sleep(1000);
	    char ReplyMode='A';
		switch(ReplyMode)
		{
		case 'A':
		        replyModeText(InitMsg);
		        break;
		case 'B':
	            replyModePdf();
	            break;
		case 'C':
	            replyModeBoth(InitMsg);
	            break;
		}
	
		} 
		else
		{
			list.get(0).click();
			 WebElement item1=new WebDriverWait(obj,60)
	         .until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSingleInmates")));
			  
			Select listItem1=new Select(item1); 
			
			for(Integer i=0;i<listItem1.getOptions().size();i++)
			{
			  listItem1.selectByIndex(1);
			
		
	
		char ReplyMode='A';
		switch(ReplyMode)
		{
		case 'A':
		        replyModeText(InitMsg);
		        break;
		case 'B':
	            replyModePdf();
	            break;
		case 'C':
	            replyModeBoth(InitMsg);
	            break;
		}
		
	 }  
	
 }}
@And("^Click Message to Inmate$")
public void SendmsgToInmate(DataTable Message) throws InterruptedException, AWTException
{
	 List<List<String>> ms=Message.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj);
	// String s1=pu.MsgToInmate1.getText();
//	 String s2="Message To Inmate 1";
	// if(s1.equalsIgnoreCase(s2))
	 Thread.sleep(1000);
	 pu.ReqGrievances.click();
	 Thread.sleep(1000);
	 pu.initiateMsg.click();
	 Thread.sleep(1000);
	 Select Type=new Select(pu.Type);
	 Type.selectByVisibleText(ms.get(0).get(1));
	 Thread.sleep(1000);
	 Select status1=new Select(pu.FacilityStatus);
	 status1.selectByVisibleText(ms.get(1).get(1));
	 Thread.sleep(1000);
	/* pu.ReqStartDate.sendKeys(ms.get(2).get(1));
	 pu.ReqEndDate.sendKeys(ms.get(3).get(1));
	 Thread.sleep(1000);
	 pu.RespStartDate.sendKeys(ms.get(4).get(1));
	 pu.RespEndDate.sendKeys(ms.get(5).get(1));
	 Thread.sleep(1000);*/
	 pu.InmateLastName1.click();
	 	pu.LastNameSearch.sendKeys(ms.get(6).get(1));
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		pu.InmateFrstName1.click();
		pu.FrstNameSearch.sendKeys(ms.get(7).get(1));
		Robot rb1=new Robot();
		rb1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		pu.SearchRequest.click();
		Thread.sleep(1000);
	 List<WebElement> Msg2Inmate=obj.findElements(By.xpath("//a[contains(text(),'Message To Inmate 1')]"));
		 for(int i=0;i<1;i++)
		 {
			// pu.MsgToInmate1.click();
			 Thread.sleep(1000);
			 Msg2Inmate=obj.findElements(By.xpath("//a[contains(text(),'Message To Inmate 1')]"));
			 Thread.sleep(1000);
			 Msg2Inmate.get(i).click();
			 Thread.sleep(2000);
			 char ReplyMode='A';
				switch(ReplyMode)
				{
				case 'A':
					   Thread.sleep(1000);
					    pu.replyModetext1(Message);
				      //  break;
				case 'B':
					   Thread.sleep(2000);
			            pu.replyModePdf1();
			         //   break;
				case 'C':
					   Thread.sleep(1000);
					    pu.replyModeBoth1(Message);
			            
				} 
				Thread.sleep(1200);
				pu.BackBtn1.click();
		 }	
}
@Then("^Click public users$")
public void publicUsers(DataTable pubusers) throws InterruptedException, AWTException
{
	List<List<String>> pusers=pubusers.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(1000);
	pu.PublicUsers.click();
	Thread.sleep(1000);
	pu.LastNameSrch.click();
	Thread.sleep(1000);
	pu.AutoCompLastNameSrch.sendKeys(pusers.get(0).get(1));
	Thread.sleep(1000);
	Robot r4=new Robot();
	r4.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	pu.FrstNameSrch.click();
	Thread.sleep(1000);
	pu.AutoCompFrstNameSrch.sendKeys(pusers.get(1).get(1));
	Thread.sleep(1000);
	Robot r5=new Robot();
	r5.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	pu.btnSearch.click();
	Thread.sleep(1000);
	List<WebElement> UserName=obj.findElements(By.xpath("//a[contains(text(),'mangai')]"));
	Thread.sleep(1000);
	for(int i=0;i<UserName.size()-1;i++)
	{
		Thread.sleep(1000);
		UserName=obj.findElements(By.xpath("//a[contains(text(),'mangai')]"));
		Thread.sleep(1000);
		UserName.get(i).click();
		Thread.sleep(1000);
		pu.TxtNotes.clear();
		pu.TxtNotes.sendKeys(pusers.get(2).get(1));
		Thread.sleep(1000);
		pu.SaveBtn.click();
		Thread.sleep(1500);
		pu.btnOk.click();
		Thread.sleep(1000);
		//pu.Back.click();
	}
}
@Then("^Click public user messages$")
public void publicUserMessages(DataTable PubMesg) throws InterruptedException, AWTException
{
	List<List<String>> pMsg=PubMesg.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(1000);
	ScrollDown350();
	Thread.sleep(1500);
	pu.PubUserMessage.click();
	Thread.sleep(1200);
	pu.InmateLastNameSearch.click();
	Thread.sleep(1000);
	pu.InmateAutoLastName.sendKeys(pMsg.get(0).get(1));
	Thread.sleep(1000);
	Robot r4=new Robot();
	r4.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	pu.InmateFirstNameSearch.click();
	Thread.sleep(1000);
	pu.InmateAutoFirstName.sendKeys(pMsg.get(1).get(1));
	Thread.sleep(1000);
	Robot r5=new Robot();
	r5.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	pu.SearchMsg.click();
	Thread.sleep(1000);
	List<WebElement> InmateMessage=obj.findElements(By.id("lblMessageSubject"));
	Thread.sleep(1000);
	for(int i=0;i<=1;i++)
	{
		Thread.sleep(1000);
		InmateMessage=obj.findElements(By.id("lblMessageSubject"));
		Thread.sleep(1000);
		InmateMessage.get(i).click();
		Thread.sleep(1000);
		pu.BtnTranslate.click();
		Thread.sleep(1000);
		pu.BackButton.click();
	}
}
@And("^Click public user Photos$")
public void pubUserPhotos(DataTable PubPhotos) throws InterruptedException, AWTException
{
	List<List<String>> pPhoto=PubPhotos.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(1500);
	pu.PubUserPhotos.click();
	Thread.sleep(1000);
	pu.InmateLastSearch.click();
	Thread.sleep(1000);
	pu.InmateAutoLastSearch.sendKeys(pPhoto.get(0).get(1));
	Thread.sleep(1000);
	Robot r4=new Robot();
	r4.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	pu.InmateFrstSearch.click();
	Thread.sleep(1000);
	pu.InmateAutoFrstSearch.sendKeys(pPhoto.get(1).get(1));
	Thread.sleep(1000);
	Robot r5=new Robot();
	r5.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1300);
	Select ststus=new Select(pu.SearchStatus);
	ststus.selectByIndex(3);
	Thread.sleep(1000);
	pu.btnSearchPhotos.click();
	Thread.sleep(1000);
	List<WebElement> photoSubj=obj.findElements(By.id("lblPhotoSubject"));
	Thread.sleep(1000);
	for(int i=0;i<1;i++)
	{
		Thread.sleep(1000);
		photoSubj=obj.findElements(By.id("lblPhotoSubject"));
		Thread.sleep(1000);
		photoSubj.get(i).click();
		Thread.sleep(1000);
		
		int x=1;
		switch(x)
		{
		case 1:
			Thread.sleep(1000);
			obj.findElement(By.id("ContentPlaceHolder1_btnApprove")).click();
			break;
		case 2:
			Thread.sleep(1000);
			obj.findElement(By.id("ContentPlaceHolder1_btnReject")).click();
			Thread.sleep(1000);
			break;
		}
		int y=1;
		switch(y)
		{
		case 1:
			Thread.sleep(1250);
			obj.findElement(By.id("btnYes")).click();
			break;
		case 2:
			Thread.sleep(1200);
			obj.findElement(By.id("btnNo")).click();
			break;	
		}
		
		Thread.sleep(1000);
		pu.btnOk.click();
		Thread.sleep(1000);
	//	pu.Back3.click();		
	}
		
	
}
@Then("^Click Keywords and Add,Search,Update$")
public void Keywords(DataTable Keywords) throws InterruptedException
{
	List<List<String>> kw=Keywords.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(1000);
	pu.Keywords.click();
	Thread.sleep(1000);
	pu.AddKeyword.click();
	Thread.sleep(2000);
	pu.KeywordTxt.sendKeys(kw.get(0).get(1));
	Thread.sleep(1000);
	Select s1=new Select(pu.WebUserAction);
	s1.selectByVisibleText(kw.get(1).get(1));
	Thread.sleep(1000);
	Select s2=new Select(pu.InmateAction);
	s2.selectByVisibleText(kw.get(2).get(1));
	Thread.sleep(1000);
	Select s3=new Select(pu.FilterType);
	s3.selectByVisibleText(kw.get(3).get(1));
	Thread.sleep(1000);
	List<WebElement> status2=obj.findElements(By.id("ContentPlaceHolder1_rblKeywordstatus"));
	Thread.sleep(1000);
	for(int i=0;i<status2.size();i++)
	{
		Thread.sleep(1000);
		status2=obj.findElements(By.id("ContentPlaceHolder1_rblKeywordstatus"));	
		Thread.sleep(1000);
		status2.get(0).click();
		Thread.sleep(1000);
		pu.SaveBtn.click();
		Thread.sleep(1000);
		pu.btnOk.click();
	}
    Thread.sleep(2000);
	Select s4=new Select(pu.InmateActionSearch);
	s4.selectByVisibleText(kw.get(2).get(1));
	Thread.sleep(1000);
    pu.WebUserkeywordSearch.sendKeys(kw.get(0).get(1));
	Thread.sleep(1000);
	Select s5=new Select(pu.WebUserActionSearch);
	s5.selectByVisibleText(kw.get(1).get(1));
	Thread.sleep(1000);
	Select s7=new Select(pu.StatusSearch);
	s7.selectByVisibleText(kw.get(4).get(1));
	Thread.sleep(1000);
	Select s6=new Select(pu.FilterSearch);
	s6.selectByVisibleText(kw.get(3).get(1));
	Thread.sleep(1000);
	pu.btnSearch.click();
	Thread.sleep(1000);
	List<WebElement>KeywordID =obj.findElements(By.id("lnkMessageKeywordID"));
	Thread.sleep(1000);
	for(int j=0;j<1;j++)
	{
		Thread.sleep(1000);
		KeywordID =obj.findElements(By.id("lnkMessageKeywordID"));
		Thread.sleep(1000);
		KeywordID.get(j).click();
	}
	Thread.sleep(2000);
	Random rd1 = new Random();
	for (int x = 100; x <= 1000; ++x) {
		randomInt = rd1.nextInt(1001);		
	}
	Thread.sleep(1000);
    pu.KeywordTxt.clear();
	pu.KeywordTxt.sendKeys(kw.get(0).get(1)+randomInt);
	Thread.sleep(1000);
	Select ss1=new Select(pu.WebUserAction);
	ss1.selectByVisibleText(kw.get(1).get(1));
	Thread.sleep(1000);
	Select ss2=new Select(pu.InmateAction);
	ss2.selectByVisibleText(kw.get(2).get(1));
	Thread.sleep(1000);
	Select ss3=new Select(pu.FilterType);
	ss3.selectByVisibleText(kw.get(3).get(1));
	Thread.sleep(1000);
	List<WebElement> statuss2=obj.findElements(By.id("ContentPlaceHolder1_rblKeywordstatus"));
	Thread.sleep(1000);
	for(int i=0;i<statuss2.size();i++)
	{
		Thread.sleep(1000);
		statuss2=obj.findElements(By.id("ContentPlaceHolder1_rblKeywordstatus"));	
		Thread.sleep(1000);
		statuss2.get(0).click();
		Thread.sleep(1000);
		pu.SaveBtn.click();
		Thread.sleep(1000);
		pu.btnOk.click();
	}
}

@Then("^Click Notices and Add$")
public void Notices(DataTable notices) throws InterruptedException, AWTException
{
	List<List<String>> noti=notices.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(1000);
	pu.Notices.click();
	Thread.sleep(1000);
	pu.AddNotices.click();
	Thread.sleep(2000);
	ScrollUp250();
	Thread.sleep(1000);
	pu.SaveBtn.click();
	Thread.sleep(1000);
    pu.txtTitle.sendKeys(noti.get(0).get(1));
	obj.findElement(By.id("ContentPlaceHolder1_Editor1_ctl03_ctl01")).click();
	Thread.sleep(1000);
	pu.Descriptions.sendKeys(noti.get(1).get(1));
	pu.StartDate.sendKeys(noti.get(2).get(1));
	pu.EndDate.sendKeys(noti.get(3).get(1));
	Thread.sleep(1000);
	List<WebElement> SelectKiosk=obj.findElements(By.xpath("//label[contains(text(),'A1')]"));
	Thread.sleep(1000);
	for(int i=0;i<1;i++)
	{
		Thread.sleep(1000);
		SelectKiosk=obj.findElements(By.xpath("//label[contains(text(),'A1')]"));
		Thread.sleep(1000);
		SelectKiosk.get(i).click();
	}
	Thread.sleep(1000);
	List <WebElement> Status=obj.findElements(By.name("ctl00$ContentPlaceHolder1$rblNoticesStatus"));
	if(Status.get(0).isSelected())
	{
		Status.get(0).click();
	}
	else
	{
		Status.get(1).click();
	}
	Thread.sleep(1000);
	pu.SaveBtn.click();
	Thread.sleep(1000);
	pu.btnOk.click();
}
@And("Search and Update the Notices")
public void searchNotices(DataTable Kiosk) throws InterruptedException
{
	List<List<String>> kio=Kiosk.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Select kiosk=new Select(pu.KioskSearch);
	kiosk.selectByVisibleText(kio.get(0).get(1));
	Thread.sleep(1000);
	pu.StartDateSearch.sendKeys(kio.get(1).get(1));
	pu.EndDateSearch.sendKeys(kio.get(2).get(1));
	Thread.sleep(1000);
	Select sts=new Select(pu.ActiveStatusSearch);
	sts.selectByVisibleText(kio.get(3).get(1));
	Thread.sleep(1000);
	pu.btnSearch.click();
	Thread.sleep(1000);
	List<WebElement> noti=obj.findElements(By.id("lnkNotices"));
	Thread.sleep(1000);
   for(int i=0;i<1;i++)
   {
	   Thread.sleep(1000);
	   noti=obj.findElements(By.id("lnkNotices"));
	   Thread.sleep(1000);
	   noti.get(i).click();
	  /* Thread.sleep(1000);
	   pu.txtTitle.clear();*/
	 //  pu.txtTitle.sendKeys("\u0008");
	     Thread.sleep(1000);
	   
	      for(int j=0; j<5;j++){
		   Thread.sleep(1000);
		   pu.txtTitle.sendKeys("\u0008");  
       }
       Thread.sleep(1000);
	   pu.txtTitle.sendKeys(RandomNumberChars());
	   Thread.sleep(1000);
	   pu.Descriptions.sendKeys("\u0008");
	   Thread.sleep(1000);
	   pu.Descriptions.sendKeys(RandomNumberChars()+getRandomNumber());
	   Thread.sleep(2000);
	   /*pu.StartDate.clear();
	   pu.StartDate.sendKeys(kio.get(2).get(1));
	   Thread.sleep(1000);
	   pu.EndDate.clear();
		pu.EndDate.sendKeys(kio.get(3).get(1));
		Thread.sleep(1000);*/
		List <WebElement> Status=obj.findElements(By.name("ctl00$ContentPlaceHolder1$rblNoticesStatus"));
		if(Status.get(0).isSelected())                     
		{
			Status.get(1).click();
		}
		else
		{
			Status.get(0).click();
		}
		Thread.sleep(1000);
		ScrollUp250();
		Thread.sleep(1000);
		pu.SaveBtn.click();
		Thread.sleep(1000);
		pu.btnOk.click();
		/*Thread.sleep(1000);
		pu.BackBtn.click();*/
   }
}
@Then("^Click Reporting and search$")
public void Reporting(DataTable Reportings) throws InterruptedException
{
	List<List<String>> rep=Reportings.raw();
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(1000);
	pu.Reporting.click();
	Thread.sleep(1200);
	Select Type=new Select(pu.Type);
	Type.selectByVisibleText(rep.get(0).get(1));
	Thread.sleep(1000);
	Select Status=new Select(pu.Status);
	Status.selectByVisibleText(rep.get(1).get(1));
	Thread.sleep(1000);
	pu.SearchRequest.click();
	Thread.sleep(1000);
	obj.findElement(By.xpath("//a[contains(text(),'Form')]")).click();
	
	Thread.sleep(1000);
	List<WebElement> lis=obj.findElements(By.className("listoneGrid"));
	for(int i=0;i<lis.size();i++)
	{
		System.out.println(lis.get(i).getText());
	}
}
@Then("^Click Initiate message to Inmate$")
public void Create_Messasges() throws InterruptedException, AWTException
{
	 POM_PubDefender pu=new POM_PubDefender(obj);
	 Thread.sleep(1000);
	 pu.GrievancesBtn.click();
	 Thread.sleep(1000);
	 pu.initiateMsg.click();
	
	
}
@Then("Create New Message")
public void create_Msg(DataTable NewMesg) throws InterruptedException, AWTException
{    Thread.sleep(1000);
	 Create_Msg(NewMesg);
}
 @And("^Search the Messages$")
 public void SearchingMessage(DataTable griev) throws InterruptedException, AWTException
 {
	 Thread.sleep(1000);
	 SearchMsg(griev);
 }
 
 @And("^Goto Message to Inmates$")
 public void MsgToInm(DataTable rplyMsg) throws InterruptedException
 {
	 Thread.sleep(1000);
	 msgToInmate(rplyMsg);
 }
 @Then("^Click Messages,Search and Translate$")
 public void Messages(DataTable Msgs) throws InterruptedException, AWTException
 {
	 List<List<String>> Msg1=Msgs.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj);
	 Thread.sleep(1000);
	 pu.Messages1.click();
	 Thread.sleep(1000);
	 pu.InmateLastNameSearch.click();
	 Thread.sleep(700);
	 pu.InmLstName.sendKeys(Msg1.get(0).get(1));
	 Thread.sleep(1000);
	 Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(1000);
	 pu.InmateFirstNameSearch.click();
	 Thread.sleep(700);
	 pu.InmFrstName.sendKeys(Msg1.get(1).get(1));
	 Thread.sleep(1000);
	 Robot r1=new Robot();
	 r1.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(1000);
	 pu.LastNameInmate.click();
	 Thread.sleep(700);
	 pu.PubLastNameInmate.sendKeys(Msg1.get(2).get(1));
	 Thread.sleep(1000);
	 Robot r3=new Robot();
	 r3.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(1000);
	 pu.FirstNameInmate.click();
	 Thread.sleep(700);
	 pu.PubFrstName.sendKeys(Msg1.get(3).get(1));
	 Thread.sleep(1000);
	 Robot r4=new Robot();
	 r4.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(2000);
	 pu.FromDate.sendKeys(Msg1.get(4).get(1));
	 pu.ToDate.sendKeys(Msg1.get(5).get(1));
	 /*Thread.sleep(1000);
	 Select dir=new Select(pu.Direction);
	 dir.selectByVisibleText(Msg1.get(6).get(1));*/
	 Thread.sleep(1000);
	 Select flgs=new Select(pu.Flags);
	 flgs.selectByVisibleText(Msg1.get(7).get(1));
	 Select sts=new Select(pu.InmateStatus);
	 sts.selectByVisibleText(Msg1.get(8).get(1));
	 Thread.sleep(1000);
	 pu.btnSearch.click();
	 List<WebElement> MsgSubj=obj.findElements(By.id("lblMessageSubject"));
	 Thread.sleep(1000);
	 for(int i=0;i<2;i++)
	 {
		 Thread.sleep(1000);
		 MsgSubj=obj.findElements(By.id("lblMessageSubject"));
		 Thread.sleep(1000);
		 MsgSubj.get(i).click();
		 Thread.sleep(1000);
		 pu.BtnTranslate.click();
		 Thread.sleep(1000);
		 pu.BackButton.click();
		 }
	 
 }
 @Then("^Click Photos and review$")
 public void Photos(DataTable photos1) throws InterruptedException, AWTException
 {
	 List<List<String>> pho1=photos1.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj);
	 Thread.sleep(1000);
	 pu.PhotosBtn.click();
	 Thread.sleep(1000);
	 /*	 pu.InmateLastNameSearch.click();
	 Thread.sleep(700);
	 pu.InmLstName.sendKeys(pho1.get(0).get(1));
	 Thread.sleep(1000);
	 Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(1000);
	 pu.InmateFirstNameSearch.click();
	 Thread.sleep(700);
	 pu.InmFrstName.sendKeys(pho1.get(1).get(1));
	 Thread.sleep(1000);
	 Robot r1=new Robot();
	 r1.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(1000);
	 pu.LastNameInmate.click();
	 Thread.sleep(700);
	 pu.PubLastNameInmate.sendKeys(pho1.get(2).get(1));
	 Thread.sleep(1000);
	 Robot r3=new Robot();
	 r3.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(1000);
	 pu.FirstNameInmate.click();
	 Thread.sleep(700);
	 pu.PubFrstName.sendKeys(pho1.get(3).get(1));
	 Thread.sleep(1000);
	 Robot r4=new Robot();
	 r4.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(1000);
	 pu.FromDatePh.sendKeys(pho1.get(4).get(1));
	 pu.ToDatePh.sendKeys(pho1.get(5).get(1));
	 Thread.sleep(1000);
	 Select sts1=new Select(pu.SearchStatus);
	 sts1.selectByVisibleText(pho1.get(6).get(1));
	 Thread.sleep(1000);*/
	 pu.btnSearch.click();
	 Thread.sleep(1000);
		List<WebElement> photoSubj=obj.findElements(By.id("lblPhotoSubject"));
		Thread.sleep(1000);
		for(int i=0;i<1;i++)
		{
			Thread.sleep(1000);
			photoSubj=obj.findElements(By.id("lblPhotoSubject"));
			Thread.sleep(1000);
			photoSubj.get(i).click();
			Thread.sleep(1000);
		int x=1;
		switch(x)
		{
		case 1:
			Thread.sleep(1000);
			obj.findElement(By.id("ContentPlaceHolder1_btnApprove")).click();
			break;
		case 2:
			Thread.sleep(1000);
			obj.findElement(By.id("ContentPlaceHolder1_btnReject")).click();
			Thread.sleep(1000);
			break;
		}
		int y=1;
		switch(y)
		{
		case 1:
			Thread.sleep(1000);
			obj.findElement(By.id("btnYes")).click();
			break;
		case 2:
			Thread.sleep(1000);
			obj.findElement(By.id("btnNo")).click();
			break;	
		}
		
		Thread.sleep(1000);
		pu.btnOk.click();
		}
 }
 @Then("^Goto Grievances and Search Request1$")
 public void ReqSearch2(DataTable Req) throws InterruptedException, AWTException
 {
	 List<List<String>> req1=Req.raw();
	 POM_PubDefender pu=new POM_PubDefender(obj);
	 pu.GrievancesBtn.click();
	 Thread.sleep(1000);
	 Select StatusSearch=new Select(pu.SelectReqStatus);
	 StatusSearch.selectByVisibleText(req1.get(0).get(1));
	/* Thread.sleep(1000);
	 pu.ReqStartDate.sendKeys(req1.get(1).get(1));
	 pu.ReqEndDate.sendKeys(req1.get(2).get(1));
	 Thread.sleep(1000);
	 pu.RespStartDate.sendKeys(req1.get(3).get(1));
	 pu.RespEndDate.sendKeys(req1.get(4).get(1));*/
	 Thread.sleep(1000);
	    pu.InmateLastName1.click();
		pu.LastNameSearch.sendKeys(req1.get(5).get(1));
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		pu.InmateFrstName1.click();
		pu.FrstNameSearch.sendKeys(req1.get(6).get(1));
		Robot rb1=new Robot();
		rb1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		Select pod=new Select(pu.pod);
		pod.selectByVisibleText(req1.get(7).get(1));
		Thread.sleep(1000);
	    pu.SearchRequest.click();
	    Thread.sleep(1000);
	
       List<WebElement> pdforms = obj.findElements(By.xpath("//*[contains(text(),'pd form')]"));
		Thread.sleep(1000);
		for(int i=0;i<pdforms.size();i++){
			Thread.sleep(1000);
			pdforms = obj.findElements(By.xpath("//*[contains(text(),'pd form')]"));
			Thread.sleep(1000);
		    pdforms.get(0).click();
		    Thread.sleep(1500);
	/*		pu.btnOk.click();*/
		
		}
			}

 @BeforeMethod
 @Given("^Enter the Inmate app URL$")
 public void beforeMethod() {
	  PropertyConfigurator.configure("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\log4j.properties");

	/*  char browser='A';
	  switch(browser)
	  {
		  case 'A':
			  System.setProperty("webdriver.chrome.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver_win32\\chromedriver.exe");  
			  obj=new ChromeDriver();
			  break;
    	  case 'B':
    		  obj=new FirefoxDriver();
    		  break;
    		  
	  }*/
	   System.setProperty("webdriver.chrome.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver_win32\\chromedriver.exe");  
		  obj=new ChromeDriver();
	  
	  	  obj.get("http://inmatecr01.sgssys.info/facilityuser");
	  	  obj.manage().window().maximize();
	  	  obj.manage().logs().getClass();
	  	  obj.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS); 
	 
	  }
/* @BeforeMethod
 @Given("^Enter the Inmate app URL$")
 @Parameters("browser")
 public void setup(String browserName) throws Exception{
     if (browserName.equalsIgnoreCase("Firefox")) {
         obj = new FirefoxDriver();
     }
     else if (browserName.equalsIgnoreCase("Chrome")) {
         System.setProperty("webdriver.chrome.driver",
                 "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver_win32\\chromedriver.exe");
         obj = new ChromeDriver();
     }
     
     else {
         throw new Exception("Browser is not correct");
     }
     obj.get("http://inmatecr01.sgssys.info/facilityuser");
 	  obj.manage().window().maximize();
 	  obj.manage().logs().getClass();
 	  obj.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS); 
 }
 */
 
 
 
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
	      }}
	
	 public void replyModeBoth(DataTable NewMesg) throws InterruptedException
	 {
		 List<List<String>> tx=NewMesg.raw();
		 POM_PubDefender pu=new POM_PubDefender(obj);
		 List<WebElement> rplyModesBoth=obj.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstReplyMode"));
			int c=rplyModesBoth.size();
			for(int j=0;j<c;j++)
			{
				try {
					Thread.sleep(1000);
					rplyModesBoth.get(2).click();
					Thread.sleep(1000);
					pu.ChoosePdfBoth.sendKeys("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\cert.pdf");
					Thread.sleep(1000);
					pu.Description1.clear();
					pu.Description1.sendKeys(tx.get(1).get(1));
					Thread.sleep(1000);
					ScrollUp250();
					Thread.sleep(1000);
					pu.btnSaveBoth.click();
					Thread.sleep(700);
					pu.btnOk.click();
					Thread.sleep(1000);
					pu.BackBtn1.click();
				} catch (StaleElementReferenceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
			
	 } 
	 public void replyModePdf() throws InterruptedException
	 {
		  POM_PubDefender pu=new POM_PubDefender(obj);
		  List<WebElement> rplyModesPdf=obj.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstReplyMode"));
			int b=rplyModesPdf.size();
			for(int j=0;j<b;j++)
			{
				rplyModesPdf.get(1).click();	
				Thread.sleep(1000);
				pu.ChoosePdf.sendKeys("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\cert.pdf");
				Thread.sleep(1000);
				pu.btnForumPDFSaves.click();
				Thread.sleep(700);
				pu.btnOk.click();
				Thread.sleep(1000);
				pu.BackBtn1.click();
			}	
	 }
	 public void replyModeText(DataTable InitMsg) throws InterruptedException
	 {
		 POM_PubDefender pu=new POM_PubDefender(obj);
		 List<List<String>> tx=InitMsg.raw();
		 List<WebElement> rplyModestxt=obj.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstReplyMode"));
			int a=rplyModestxt.size();
			for(int j=0;j<a;j++)
			{
				try {
					rplyModestxt.get(0).click();
					Thread.sleep(1500);
					//pu.DescriptionText.clear();
					pu.DescriptionText.sendKeys(tx.get(1).get(1)); 
					Thread.sleep(1000);
					pu.btnForumSave.click();
					Thread.sleep(700);
					pu.btnOk.click();
					Thread.sleep(1000);
					
				} catch (org.openqa.selenium.StaleElementReferenceException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}	
	 }
	 public void ScrollUp250()
	 {
		 JavascriptExecutor jse = (JavascriptExecutor)obj;
		 jse.executeScript("window.scrollBy(0,250)", "");
	 }
	 public void ScrollUp400()
	 {
		 JavascriptExecutor jse = (JavascriptExecutor)obj;
		 jse.executeScript("window.scrollBy(0,450)", "");
	 }
	 public void ScrollDown350()
	 {
		 JavascriptExecutor jse = (JavascriptExecutor)obj;
		 jse.executeScript("window.scrollBy(0,-350)", "");
	 }
	 public void ScrollDown700()
	 {
		 JavascriptExecutor jse = (JavascriptExecutor)obj;
		 jse.executeScript("window.scrollBy(0,-700)", "");
	 }
	 public void YesNo() throws InterruptedException
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

/*//	String ex1=obj.findElement(By.xpath("//span[contains(text(),'Keyword already exists')]")).getText();
String ex11="Keyword already exists";
//String ex2=obj.findElement(By.xpath("//td[contains(text(),'Keyword information save successfully')]")).getText();

//if(ex1.contentEquals(ex11)==true && ex2.isEmpty())
Thread.sleep(2000);
if(obj.findElement(By.xpath("//span[contains(text(),'Keyword already exists')]")).getText().contains(ex11))
{
	Thread.sleep(1000);
	pu.btnOk.click();
	Thread.sleep(1000);
	 Random rd1 = new Random();
		for (int x = 100; x <= 1000; ++x) {
			randomInt = rd1.nextInt(1001);		
		}
		Thread.sleep(1000);
	pu.KeywordTxt.sendKeys(""+randomInt);
	Thread.sleep(1000);
	pu.SaveBtn.click();
	Thread.sleep(1000);
	pu.btnOk.click();
}
else 
{
	
	System.out.print(true);
}*/
public void YesNoo() throws InterruptedException
{
	POM_PubDefender pu=new POM_PubDefender(obj);
	 int YesNo=1;
		switch(YesNo)
		{
		case 1:
			Thread.sleep(1500);
			obj.findElement(By.id("btnYes")).click();
			Thread.sleep(1000);
			pu.btnOk.click();
			
			break;
		case 2:
			Thread.sleep(1500);
			obj.findElement(By.id("btnNo")).click();
			break;
		}	}
public String RandomNumberChars()
{
        StringBuffer randStr = new StringBuffer();
        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }
private int getRandomNumber() {
    int randomInt = 0;
    Random randomGenerator = new Random();
    randomInt = randomGenerator.nextInt(CHAR_LIST.length());
    if (randomInt - 1 == -1) {
        return randomInt;
    } else {
        return randomInt - 1;
    }
}
}