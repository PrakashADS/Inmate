package AdminLogin_Inmate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inmate.publicdefender.PublicDefender;

import PageObjectModel.POM_PubDefender;
import cucumber.api.DataTable;

//import utility.Log;

public class Inmate {

	public  WebDriver driver;
	public Inmate(WebDriver driver)
	{
		this.driver=driver;
	}
	By lnk_inmate_id = By.id("lnkInmateResidentId");
	By txt_id = By.id("ContentPlaceHolder1_txtInmateIDSearch");
	By btn_search = By.id("btnSearch");
	By lnk_inmate = By.id("rptUser_menuAnchor_9");
	By lst_edit = By.id("lnkInmateResidentId");
	By menu_message = By.id("ContentPlaceHolder1_anchrMessages");
	By menu_photo = By.xpath("//*[@id='ContentPlaceHolder1_anchrPhotos']/i/span");
	By menu_free_credits = By.xpath("//*[@id='ContentPlaceHolder1_achrFreeCreditsInfo']/i/span");
	By txt_investigator_mail = By.id("ContentPlaceHolder1_txtInvestigatorEmail");
	By btn_update = By.id("btnSaveInmateInformation");
	By btn_ok = By.id("btnOk");
	By btn_back = By.id("ContentPlaceHolder1_btnFreeCreditsBack");
	By btn_reset = By.id("btnReset");
	By lnk_subject = By.id("lblMessageSubject");
	By btn_translate = By.id("lnkbtnTranslate");
	By btn_message_back = By.id("ContentPlaceHolder1_btnBack");
	By lnk_photo_subject = By.id("lblPhotoSubject");
	By btn_photo_back = By.id("ContentPlaceHolder1_btnBack");
	By export_excel = By.id("ContentPlaceHolder1_imbtnExportToExcel");
	By pagination = By.xpath("//*[@id='grvInmates']/tbody/tr[12]/td/table/tbody/tr/td[2]/a");
	By lnk_publicuser_sort = By.xpath("//*[@id='grvInmatesInfo']/tbody/tr[1]/th[1]/a");
	//By sort_publicuser = By.xpath("//*[@id='grvInmatesInfo']/tbody/tr[1]/th[1]/a");
	
	By Messages_reports = By.xpath("//*[@id='divTitleHeader']/ul/li[1]/label");
	By Reports = By.id("ContentPlaceHolder1_achrReports");
	By Direction = By.id("ContentPlaceHolder1_ddlMsgsReportDirection");
	By LoadData = By.id("btnMessagesDownload");
	By Download = By.id("btnDownloadMessages");
	By Cancel = By.id("btnMessageCancelDownload");
	By ExportAll = By.id("ContentPlaceHolder1_btnExportAllDatasFromInmate");
	By RequestMenu = By.xpath("//*[@id='divTitleHeader']/ul/li[2]/label");
	By ReqFromDate = By.id("ContentPlaceHolder1_txtRequestReportFrom");
	By ReqToDate = By.id("ContentPlaceHolder1_txtRequestReportTo");
	By LoadData1 = By.id("btnRequestsInfoExport");
	By Download1 = By.id("btnReportDownLoad");
	By cancel1 = By.id("btnReportCancel");
	By InitMsg = By.xpath("//*[@id='divTitleHeader']/ul/li[3]/label");
	By ReqFormType = By.id("ddlMgRequestFormType");
	By Frmdate = By.id("ContentPlaceHolder1_txtInitiateReportFrom");
	By todate = By.id("ContentPlaceHolder1_txtInitiateReportTo");
	By export = By.id("btnInitiateExport");
	By DownloadInit = By.id("btnDownloadInitiate");
	By CancelInit = By.id("btnInitiateCancel");
	By Msgs = By.xpath("//*[@id='ContentPlaceHolder1_anchrMessages']/i/span");
	
	
	public void Edit_Inmate(DataTable msgReport) throws Exception{
	
			List<List<String>> mr=msgReport.raw();
			Thread.sleep(1000);
			Logger logger=Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
			Thread.sleep(1500);	
			for(int i=0;i<1;i++)
			{
			List<WebElement> ResId=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmates_lnkInmateResidentId_"+i+"']"));
			ResId.get(i).click();
			logger.info("Edit has been chosen");
			}
			
			Thread.sleep(2000);
			driver.findElement(By.id("chkSelectDeselectAll")).click();
			Thread.sleep(1500);
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtNote")).clear();
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtNote")).sendKeys(mr.get(3).get(1));
			Thread.sleep(1000);
			driver.findElement(By.id("ContentPlaceHolder1_txtInvestigatorEmail")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_txtInvestigatorEmail")).sendKeys(mr.get(4).get(1));
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lnkPublicUser']")).click();
			Thread.sleep(1000);
			System.out.println("\nBefore Sorting:");
			Puser_sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lnkPublicUser']")).click();
			Thread.sleep(1000);
			System.out.println("\nAfter Sorting:");
			Puser_sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lnkRelationship']")).click();
			Thread.sleep(1000);
			System.out.println("\nBefore Sorting:");
			Relationship_Sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lnkRelationship']")).click();
			Thread.sleep(1000);
			System.out.println("\nAfter Sorting:");
			Relationship_Sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lnkConnectionStatus']")).click();
			Thread.sleep(1000);
			System.out.println("\nBefore Sorting:");
			Conn_sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lnkConnectionStatus']")).click();
			Thread.sleep(1000);
			System.out.println("\nAfter Sorting:");
			Conn_sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lnkRequestSentOn']")).click();
			Thread.sleep(1000);
			System.out.println("\nBefore Sorting:");
			Req_Sent_Sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lnkRequestSentOn']")).click();
			Thread.sleep(1000);
			System.out.println("\nAfter Sorting:");
			Req_Sent_Sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lnkCreditBalance']")).click();
			Thread.sleep(1000);
			System.out.println("\nBefore Sorting:");
			Credit_Bal__sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lnkCreditBalance']")).click();
			Thread.sleep(1000);
			System.out.println("\nAfter Sorting:");
			Credit_Bal__sort();
			Thread.sleep(2500);
			driver.findElement(By.id("ContentPlaceHolder1_imgbtnConnectionsInfoExporttoExcel")).click();
			Thread.sleep(1000);
			scroll500();
			/*	String Pagi1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbltxtInmatesInfoSelectedPageOutOfPage']")).getText();
			int pagiValue=Integer.parseInt(Pagi1);
			Thread.sleep(2000);
			for(int i=0;i<pagiValue-1;i++)
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnInmatesInfoSelectedPageNext']")).click();
			}                                
			Thread.sleep(1000);
			for(int i=0;i<pagiValue-1;i++)
			{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnInmatesInfoSelectedPagePrev']")).click();
			}*/
			                                                  
			Boolean paginations=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbltxtInmatesInfoSelectedPageOutOfPage']")).isDisplayed();
			if(paginations=true)
			{
			String pageSize=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbltxtInmatesInfoSelectedPageOutOfPage']")).getText();
			int pgeSize=Integer.parseInt(pageSize);
			scroll250();
			for(int i=0;i<pgeSize-1;i++)
			{
				Thread.sleep(2000);           
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnInmatesInfoSelectedPageNext']")).click();
			}
			Thread.sleep(1000);  
			scroll_250();
			Thread.sleep(1000);  
			for(int i=0;i<pgeSize-1;i++)
			{
				Thread.sleep(1500);          
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnInmatesInfoSelectedPagePrev']")).click();
			}
		}
			Thread.sleep(1000);
			scroll150();
			Thread.sleep(1000);
			driver.findElement(By.id("ContentPlaceHolder1_rptInmateLoginInfo_lnkDate")).click();
			Thread.sleep(1000);
			System.out.println("\nBefore Sorting:");
			Date__sort();
			Thread.sleep(2000);
			driver.findElement(By.id("ContentPlaceHolder1_rptInmateLoginInfo_lnkDate")).click();
			Thread.sleep(1000);
			System.out.println("\nAfter Sorting:");
			Date__sort();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkInmateId']")).click();
			Thread.sleep(1000);
			System.out.println("\nBefore Sorting:");
			InmateId__sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkInmateId']")).click();
			Thread.sleep(1000);
			System.out.println("\nAfter Sorting:");
			InmateId__sort();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkPodName']")).click();
			Thread.sleep(1000);
			System.out.println("\nBefore Sorting:");
			pod__sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkPodName']")).click();
			Thread.sleep(1000);
			System.out.println("\nAfter Sorting:");
			pod__sort();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkKiosksCode']")).click();
			Thread.sleep(1000);
			System.out.println("\nBefore Sorting:");
			kiosk__sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkKiosksCode']")).click();
			Thread.sleep(1000);
			System.out.println("\nAfter Sorting:");
			kiosk__sort();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkLoginStatus']")).click();
			Thread.sleep(1000);
			System.out.println("\nBefore Sorting:");
			loginStatus__sort();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkLoginStatus']")).click();
			Thread.sleep(1000);
			System.out.println("\nAfter Sorting:");
			loginStatus__sort();
			Thread.sleep(1500);
			driver.findElement(By.id("ContentPlaceHolder1_imgbtnInmateLoginInfoExportToExcel")).click();
			Thread.sleep(1500);
			scroll150();
			
		/*	for(int i=0;i<5;i++)
			{
				Thread.sleep(1000);
				driver.findElement(By.id("ContentPlaceHolder1_imgbtnInmatesLoginInfoSelectedPageNext")).click();
			}
			Thread.sleep(1000);
			for(int i=0;i<5;i++)
			{
				Thread.sleep(1000);
				driver.findElement(By.id("ContentPlaceHolder1_imgbtnInmatesLoginInfoSelectedPagePrev")).click();
			}*/                                               
			Boolean paginations1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblInmatesLoginInfoSelectedPageOutOf']")).isDisplayed();
			if(paginations1=true)
			{
			String pageSize1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblInmatesLoginInfoSelectedPageOutOf']")).getText();
			int pgeSize1=Integer.parseInt(pageSize1);
			scroll250();
			for(int i=0;i<pgeSize1-90;i++)
			{
				Thread.sleep(2500);        
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnInmatesLoginInfoSelectedPageNext']")).click();
			}
			
			for(int i=0;i<pgeSize1-90;i++)
			{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnInmatesLoginInfoSelectedPagePrev']")).click();
			}
			
			}
				Thread.sleep(3000);
				 int z=1;
				switch(z)
				{
				case 1:
					Thread.sleep(1000);
					driver.findElement(By.id("btnSaveInmateInformation")).click();
					Thread.sleep(1200);
					driver.findElement(By.id("btnOk")).click();
					break;
				case 2:
					Thread.sleep(1000);
					driver.findElement(By.id("ContentPlaceHolder1_btnCancel")).click();
					break;				
				}
			/*	Thread.sleep(3000);		
				driver.findElement(By.xpath("//*[@id='lnkInmateResidentId']")).click();
				Thread.sleep(1500);*/
				
				Thread.sleep(1000);
				/*messages_Inmate();
				photos_Inmate();
				ConnectionReq();*/
				/*driver.findElement(txt_id).clear();
				driver.findElement(txt_id).sendKeys("11");
				logger.info("Id has been entered ");	
				driver.findElement(btn_search).click();
				logger.info("search has been clicked ");
				Thread.sleep(1000);	
				List<WebElement> elements1 = driver.findElements(lst_edit);
				elements1.get(0).click();
				Thread.sleep(1500);       
				driver.findElement(By.id("lnkbtnTranslate")).click();
				Thread.sleep(1500);
				driver.findElement(By.id("ContentPlaceHolder1_btnMessagesToInmatesBack")).click();*/
				
				
		/*	Edit_Info();
			logger.info("Investigator mail added successfully");
			webdriverWait(lnk_publicuser_sort, 50);
			driver.findElement(lnk_publicuser_sort).click();
			//scroll();
			Thread.sleep(1000);
			Sorting();
			logger.info("PU user sorted successfully");
			
			
			driver.findElement(menu_message).click();
			logger.info("Message Tab has been clicked");
			Thread.sleep(3000);
		//	List<WebElement> element1 = driver.findElements(lnk_subject);
		//	Thread.sleep(1000);
		//	element1.get(0).click();
			driver.findElement(By.id("ContentPlaceHolder1_rptMessages_lblSubject_0")).click();
			logger.info("Message link has been clicked");
			Thread.sleep(1000);
			driver.findElement(btn_translate).click();
			logger.info("Translate button clicked");
			Thread.sleep(10000);
			driver.findElement(btn_message_back).click();
			logger.info("Messages back button has been clicked");	
			Thread.sleep(2000);
			driver.findElement(menu_photo).click();
			logger.info("Photo Tab has been clicked");		
			Thread.sleep(2000);
			List<WebElement> element2 = driver.findElements(lnk_photo_subject);
			element2.get(1).click();
			logger.info("Photo link has been clicked");
			driver.findElement(btn_photo_back).click();
			Thread.sleep(1000);
			logger.info("Photo Back Button has been clicked");
			Thread.sleep(1000);
			driver.findElement(menu_free_credits).click();
			logger.info("Free credits Tab has been clicked");
			Thread.sleep(1000);
			driver.findElement(btn_back).click();
			Thread.sleep(1000);
			driver.findElement(btn_reset).click();
			Thread.sleep(1000);
			driver.findElement(export_excel).click();
			logger.info("Export to excel link clicked");
			Thread.sleep(1000);
			scroll();
			Thread.sleep(1500);
			webdriverWait(pagination, 50);
			driver.findElement(pagination).click();
			Thread.sleep(2000);
			
			
			*/
		} 
	
	public void Puser_sort() throws InterruptedException
	{
		Thread.sleep(1000);
	    for(int i=0;i<10;i++)
	    {
	 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lbtnPublicUserName_"+i+"']")); 
			for (WebElement e : li) {
				System.out.println(e.getText());
			}}
	}
	
	public void Relationship_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
	    for(int i=0;i<10;i++)
	    {
	 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lblRelationShip_"+i+"']")); 
			for (WebElement e : li) {
				System.out.println(e.getText());
			}}
	}
	
	public void Conn_sort() throws InterruptedException
	{
		Thread.sleep(1000);
	    for(int i=0;i<10;i++)
	    {
	 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lblConnectionStatus_"+i+"']")); 
			for (WebElement e : li) {
				System.out.println(e.getText());
			}}
	}
	public void Req_Sent_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
	    for(int i=0;i<10;i++)
	    {
	 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lblRequestSentDate_"+i+"']")); 
			for (WebElement e : li) {
				System.out.println(e.getText());
			}}
	}

	public void Credit_Bal__sort() throws InterruptedException
	{
		Thread.sleep(1000);
	    for(int i=0;i<10;i++)
	    {
	 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmatesInfo_lblCreditBalance_"+i+"']")); 
			for (WebElement e : li) {
				System.out.println(e.getText());
			}}
	}
	
	public void Date__sort() throws InterruptedException

	{
		Thread.sleep(1000);
	    for(int i=0;i<10;i++)
	    {
	 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoDate_"+i+"']")); 
			for (WebElement e : li) {
				System.out.println(e.getText());
		}}
	}
	public void InmateId__sort() throws InterruptedException
	{
		Thread.sleep(1000);
	    for(int i=0;i<10;i++)
	    {
	 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoInmateResidentId_"+i+"']")); 
			for (WebElement e : li) {
				System.out.println(e.getText());
		}}
	}
	public void pod__sort() throws InterruptedException
	{
		Thread.sleep(1000);
	    for(int i=0;i<10;i++)
	    {
	 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoPodName_"+i+"']")); 
			for (WebElement e : li) {
				System.out.println(e.getText());
		}}
	}
	public void kiosk__sort() throws InterruptedException
	{
		Thread.sleep(1000);
	    for(int i=0;i<10;i++)
	    {
	 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoKiosksCode_"+i+"']")); 
			for (WebElement e : li) {
				System.out.println(e.getText());
		}}
	}
	public void loginStatus__sort() throws InterruptedException
	{
		Thread.sleep(1000);
	    for(int i=0;i<10;i++)
	    {
	 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoLoginStatus_"+i+"']")); 
			for (WebElement e : li) {
				System.out.println(e.getText());
		}}
	}
	
	public void Edit_Info(){
		try {
			Thread.sleep(1000);
			driver.findElement(txt_investigator_mail).clear();
			driver.findElement(txt_investigator_mail).sendKeys("mangaipriya@themajesticpeople.com");
			
			Thread.sleep(1000);
			driver.findElement(btn_update).click();
			Thread.sleep(2000);
			driver.findElement(btn_ok).click();
			Thread.sleep(2000);
			List<WebElement> elements = driver.findElements(lst_edit);
			elements.get(0).click();
					
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}

	}
	

	/* code for scroll*/
	private void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
	}

	private void scroll250() {
		
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			 jse.executeScript("window.scrollBy(0,250)", "");

	}
	private void scroll_250() {
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,-250)", "");

}
	private void scroll1() {
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,900)", "");

}
	private void scroll500() {
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,500)", "");

}
	private void scroll150() {
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,150)", "");

}
	/* code for explicit wait*/
	public void webdriverWait(By locator, long sec){
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void Sorting() throws Exception{
		
		
		List<WebElement> alllinks =driver.findElements(By.id("lblInmateResidentId"));
	    String a[]=new String[alllinks.size()];
	   
	    for(int i=0;i<alllinks.size();i++)
	    {
	        a[i]=alllinks.get(i).getText(); 
	        System.out.println(a[i]);
	     
	    }
}
	
	public void Edit_Message(){
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public void Reports(DataTable msgReport) throws InterruptedException, AWTException
	{
	
		List<List<String>>MsgReports=msgReport.raw();
		Thread.sleep(2000);
		driver.findElement(Reports).click();
		Thread.sleep(2000);
	//	driver.findElement(ExportAll).click();
		Thread.sleep(1800);
		driver.findElement(Messages_reports).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ContentPlaceHolder1_txtMsgsReportFromDate")).sendKeys(MsgReports.get(0).get(1));
		Thread.sleep(1000);       
		driver.findElement(By.id("ContentPlaceHolder1_txtMsgsReportToDate")).sendKeys(MsgReports.get(1).get(1));
		Thread.sleep(1000);
		Select dir=new Select(driver.findElement(Direction));
		dir.selectByVisibleText(MsgReports.get(2).get(1));
		Thread.sleep(1000);
		driver.findElement(LoadData).click();
		Thread.sleep(2500);
		int x=1;
		switch(x)
		{
		case 1:
			Thread.sleep(1000);
			driver.findElement(Download).click();
			break;
		case 2:
			Thread.sleep(1000);
			driver.findElement(Cancel).click();
			break;
			
		}
		Thread.sleep(2000);
		Request_reports(msgReport);
		InitialteMsg_reports(msgReport);
	}
	public void Request_reports(DataTable msgReport) throws InterruptedException
	{
		List<List<String>>ReqReports=msgReport.raw();
		Thread.sleep(3000);
		driver.findElement(RequestMenu).click();
		Thread.sleep(1000);
		List<WebElement> radio=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstReporRequestType"));
		if(radio.get(0).isSelected())	
		{
			Thread.sleep(1000);
			radio.get(1).click();
			Thread.sleep(1000);
				driver.findElement(ReqFromDate).sendKeys(ReqReports.get(0).get(1));
				Thread.sleep(1000);
				driver.findElement(ReqToDate).sendKeys(ReqReports.get(1).get(1));
				Thread.sleep(2000);
				driver.findElement(LoadData1).click();
				Thread.sleep(2000);
			int y=1;
			switch(y)
			{
			case 1:
				Thread.sleep(1000);
				driver.findElement(Download1).click();
				break;
			case 2:
				Thread.sleep(1000);
				driver.findElement(cancel1).click();
				break;
				
			}
		}
	}
	public void InitialteMsg_reports(DataTable msgReport) throws InterruptedException, AWTException
	{
		List<List<String>>InitReports=msgReport.raw();
		Thread.sleep(1000);
		ScrollUp150();
		Thread.sleep(3000);
	    driver.findElement(InitMsg).click();
	    Thread.sleep(1500);
	    Select reqType=new Select(driver.findElement(ReqFormType));
	    reqType.selectByValue("0");
	    Thread.sleep(1000);
	    driver.findElement(Frmdate).sendKeys(InitReports.get(0).get(1));
	    Thread.sleep(1000);
	    driver.findElement(todate).sendKeys(InitReports.get(1).get(1));
	    Thread.sleep(1000);
	    driver.findElement(export).click();
	    int z=1;
		switch(z)
		{
		case 1:
			Thread.sleep(2500);
			driver.findElement(DownloadInit).click();
			break;
		case 2:
			Thread.sleep(1000);
			driver.findElement(CancelInit).click();
			break;
			
		}
		
	}
	
	public void messages_Inmate() throws InterruptedException, AWTException
	{
		Thread.sleep(1000);
		Logger logger=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmates_lnkInmateResidentId_0']")).click();
		POM_PubDefender pu=new POM_PubDefender(driver);
		Thread.sleep(3000);
		pu.Messages.click();
		Thread.sleep(2000);
		pu.LastNameInmate.click();
		Thread.sleep(1000);
		pu.AutoCompleteLastName.sendKeys("PRIYA");
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		pu.FirstNameInmate.click();
		Thread.sleep(1000);
		pu.AutoCompleteFirstName.sendKeys("MANGAI");
		Thread.sleep(1000);
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		pu.SearchMsg.click();
		Thread.sleep(2000);
		//obj.findElement(By.xpath("//*[@id='ContentPlaceHolder1_anchrMessages']/i/span")).click();
		/*Thread.sleep(1000);
		List<WebElement> subj1=obj.findElements(By.className("trFirstRow"));
		for(int i=0;i<subj1.size();i++)
		{
			Thread.sleep(1000);
			 subj1=obj.findElements(By.className("trFirstRow"));
			 Thread.sleep(1000);
				ScrollUp250();
				Thread.sleep(1500);
				subj1.get(0).click();
		}
		*/
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblSubject_0']")).click();
		Thread.sleep(2000);       
		pu.BtnTranslate.click();
		Thread.sleep(1500);
		//obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		pu.BackButton.click();
		Thread.sleep(1000);
		Message_Sorting();
	}
	public void photos_Inmate() throws InterruptedException
	{
		POM_PubDefender pu=new POM_PubDefender(driver);
		Thread.sleep(2500);
		for(int i=0;i<1;i++)
		{
		List<WebElement> ResId=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmates_lnkInmateResidentId_"+i+"']"));
		ResId.get(i).click();
		}
		Thread.sleep(1500);
		pu.Photos.click();
		Thread.sleep(1000);
		/*pu.LastNamePhotos.click();
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
		Thread.sleep(1000);*/
	
		pu.btnSearchPhotos.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPhotosExporttoExcel']")).click();
		Thread.sleep(1500);
		List<WebElement> photos=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lblPhotoSubject_0']"));
		Thread.sleep(1000);
		for(int i=0;i<1;i++)
		{
			Thread.sleep(1000);
			photos=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lblPhotoSubject_"+i+"']"));
			Thread.sleep(1000);
			scroll250();
			Thread.sleep(1000);
			photos.get(i).click();
			
			int x=2;
			switch(x)
			{
			case 1:
				Thread.sleep(1000);
				if(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnApprove']")).isDisplayed())
				{
			   Thread.sleep(500);
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnApprove']")).click();
				YesNo();
				}
				else{
					System.out.println("No Approve Button Appeared");
				}
				break;
			case 2:
				Thread.sleep(1000);
				if(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnReject']")).isDisplayed())
				{
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnReject']")).click();
				YesNo();
				}
				else{
					System.out.println("No Reject Button Appeared");
				}
				break;
			}
			Thread.sleep(1500);
			pu.Back1.click();
		}
		Photos_Sorting();
	}
	public void YesNo() throws InterruptedException
	{
		int y=2;
		switch(y)
		{
		case 1:
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='btnYes']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='btnOk']")).click();
			break;
		case 2:
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='btnNo']")).click();
			break;
		}
	}
	public void Photos_Sorting() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkSubject']")).click();
		System.out.println("Ascending Order Subject:");
		Subj_Sorting();
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkSubject']")).click();
		System.out.println("Descending Order Subject:");
		Subj_Sorting();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkFrom']")).click();
		System.out.println("Ascending Order From:");
		From_Sorting();
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkFrom']")).click();
		System.out.println("Descending Order From:");
		From_Sorting();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkTo']")).click();
		System.out.println("Ascending Order To:");
		To_Sorting();
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkTo']")).click();
		System.out.println("Descending Order To:");
		To_Sorting();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkSentOn']")).click();
		System.out.println("Ascending Order SentOn:");
		SentOn_Sorting();
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkSentOn']")).click();
		System.out.println("Descending Order SentOn:");
		SentOn_Sorting();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkStatus']")).click();
		System.out.println("Ascending Order Status:");
		Status_Sorting();
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkStatus']")).click();
		System.out.println("Descending Order Status:");
		Status_Sorting();
	}
	public void Status_Sorting() throws InterruptedException
	{
		{
			{
				Thread.sleep(1000);
				for(int i=0;i<10;i++)
				{                                                           
					List<WebElement> ToSort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_imgStatus_"+i+"']"));
					for(WebElement e:ToSort)
					{
					  System.out.println(e.getAttribute("title"));
					}
				}
			}
		}
	}
	public void SentOn_Sorting() throws InterruptedException
	{
		{
			{
				Thread.sleep(1000);
				for(int i=0;i<10;i++)
				{                                                           
					List<WebElement> ToSort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lblPhotoSentDate_"+i+"']"));
					for(WebElement e:ToSort)
					{
					  System.out.println(e.getText());
					}
				}
			}
		}
	}
	public void To_Sorting() throws InterruptedException
	{
		{
			{
				Thread.sleep(1000);
				for(int i=0;i<10;i++)
				{                                                           
					List<WebElement> ToSort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lblPhotoTo_"+i+"']"));
					for(WebElement e:ToSort)
					{
					  System.out.println(e.getText());
					}
				}
			}
		}
	}
	public void From_Sorting() throws InterruptedException
	{
		{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
			{                                                            
				List<WebElement> fromSort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lblPhotoFrom_"+i+"']"));
				for(WebElement e:fromSort)
				{
				  System.out.println(e.getText());
				}
			}
		}
	}
	public void Subj_Sorting() throws InterruptedException
	{
		{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
			{                                                           
				List<WebElement> SubjSort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lblPhotoSubject_"+i+"']"));
				for(WebElement e:SubjSort)
				{
				  System.out.println(e.getText());
				}
			}
		}
	}
	public void Message_Sorting() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkSubject']")).click();
		System.out.println("Before Sorting Subject:");
		Sort_Subject();
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkSubject']")).click();
		System.out.println("After Sorting Subject:");
		Sort_Subject();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkFrom']")).click();
		System.out.println("Before Sorting From:");
		Sort_From();
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkFrom']")).click();
		System.out.println("After Sorting From:");
		Sort_From();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkTo']")).click();
		System.out.println("Before Sorting To:");
		Sort_To();
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkTo']")).click();
		System.out.println("After Sorting To:");
		Sort_To();
	}
	public void Sort_Subject() throws InterruptedException
	{
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
		{                                                           
			List<WebElement> SubjSort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblSubject_"+i+"']"));
			for(WebElement e:SubjSort)
			{
				System.out.println(e.getText());
			}
		}
	}
	public void Sort_From() throws InterruptedException
	{
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
		{                                                                
			List<WebElement> FromSort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblSender_"+i+"']"));
			for(WebElement e:FromSort)
			{
			System.out.println(e.getText());
			}
		}
	}	
	public void Sort_To() throws InterruptedException
	{
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
		{                                                           
			List<WebElement> ToSort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblTo_"+i+"']"));
			for(WebElement e:ToSort)
			{
			System.out.println(e.getText());
			}
		}
	}	
	public void Sort_Flag() throws InterruptedException
	{
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
		{                                                           
			List<WebElement> FlagSort=driver.findElements(By.xpath("src"));
			for(WebElement e:FlagSort)
			{
			System.out.println(e.getText());
			}
		}
	}	
	 public void ScrollUp150()
	 {
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,150)", "");
	 }
	 public void free_credit() throws InterruptedException
	 {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_achrFreeCreditsInfo']")).click();
		Thread.sleep(1500);
	    driver.findElement(By.id("ContentPlaceHolder1_imgbtnFreeCreditsExportExcel")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptFreeCredits_lnkDate']")).click();
		Thread.sleep(1000);
		System.out.println("\nBefore Sorting:");
		Date_sort();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptFreeCredits_lnkDate']")).click();
		Thread.sleep(1000);
		System.out.println("\nAfter Sorting:");
		Date_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptFreeCredits_lnkCredit']")).click();
		Thread.sleep(1000);
		System.out.println("\nBefore Sorting:");
		Credit_sort();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptFreeCredits_lnkCredit']")).click();
		Thread.sleep(1000);
		System.out.println("\nAfter Sorting:");
		Credit_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptFreeCredits_lnkDebit']")).click();
		Thread.sleep(1000);
		System.out.println("\nBefore Sorting:");
		Debit_sort();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptFreeCredits_lnkDebit']")).click();
		Thread.sleep(1000);
		System.out.println("\nAfter Sorting:");
		Debit_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptFreeCredits_lnkBalance']")).click();
		Thread.sleep(1000);
		System.out.println("\nBefore Sorting:");
		Balance_sort();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptFreeCredits_lnkBalance']")).click();
		Thread.sleep(1000);
		System.out.println("\nAfter Sorting:");
		Balance_sort();
	 }
	 
	 public void Date_sort() throws InterruptedException
	 {
	 	Thread.sleep(1000);
	     for(int i=0;i<10;i++)
	     {
	  	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptFreeCredits_lblFreeCreditsDate_"+i+"']")); 
	 		for (WebElement e : li) {
	 			System.out.println(e.getText());
	 		}}
	 }
	 public void Credit_sort() throws InterruptedException
	 {
		 	Thread.sleep(1000);
		     for(int i=0;i<10;i++)
		     {
		  	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptFreeCredits_lblCreditAmount_"+i+"']")); 
		 		for (WebElement e : li) {
		 			System.out.println(e.getText());
		 		}}
		 }
	 public void Debit_sort() throws InterruptedException
	 {
		 	Thread.sleep(1000);
		     for(int i=0;i<10;i++)
		     {
		  	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptFreeCredits_lblDebitAmount_"+i+"']")); 
		 		for (WebElement e : li) {
		 			System.out.println(e.getText());
		 		}}
		 }
		public void Balance_sort() throws InterruptedException
		 {
		 	Thread.sleep(1000);
		     for(int i=0;i<10;i++)
		     {
		  	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptFreeCredits_lblFreeCredits_"+i+"']")); 
		 		for (WebElement e : li) {
		 			System.out.println(e.getText());
		 		}}
		 }
		
		public void ConnectionReq() throws InterruptedException
		{
			POM_PubDefender pu=new POM_PubDefender(driver); 
			Thread.sleep(1500);
			pu.ConnectionRequest.click();
			Thread.sleep(1000);
			ScrollUp400();
			Thread.sleep(1000);
			for(int i=0;i<3;i++)
			{
				Thread.sleep(1000);
				ScrollUp400();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNextIn']")).click();	
			} 
			Thread.sleep(1000);
			ScrollDown350();
		}
		 public void ScrollUp400()
		 {
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			 jse.executeScript("window.scrollBy(0,400)", "");
		 }
		 public void ScrollDown350()
		 {
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			 jse.executeScript("window.scrollBy(0,-350)", "");
		 }
		 
	 }

	

