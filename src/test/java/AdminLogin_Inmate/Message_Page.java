package AdminLogin_Inmate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

//import com.framework.screenshot.CaptureScreenshot;
import cucumber.api.DataTable;
import AdminLogin_Inmate.Log;
import PageObjectModel.POM_PubDefender;

public class Message_Page {

	public WebDriver driver;
	By menu_messages = By.id("rptUser_menuAnchor_12");
	By lnk_subject = By.xpath("//*[@id='lblMessageSubject']");
	By btn_back = By.xpath("//*[@id='ContentPlaceHolder1_btnBack']");
	By btn_duplicate = By.id("ContentPlaceHolder1_lnkduplicate");
	By lnk_subject_duplicate = By.className("col-03");
	By dwn_flag_search = By.id("ContentPlaceHolder1_ddlMessageFlag");
	By btn_Search = By.id("btnSearch");
	By btn_back1 = By.id("ContentPlaceHolder1_Button1");
	By dwn_flag = By.id("ContentPlaceHolder1_ddlMessageFlag");
	By lnk_export_to_excel = By.id("ContentPlaceHolder1_imgbtnMessagesExporttoExcel");
	By lnk_pagination = By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[12]/td/table/tbody/tr/td[3]/a");
	//By sort_subject = By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[1]/th[1]/a");
	By sort_subject = By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkSubject']");
	By sorting_subject = By.className("trFirstRow");
	By sort_from = By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkFrom']");
	By sorting_from = By.className("trFirstRow");
	By sort_to = By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkTo']");
	By sorting_to = By.className("trFirstRow");
	By sort_sent = By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkSent']");
	By sorting_sent = By.className("trFirstRow");
    By sort_flag=By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkFlag']");
    By sorting_flag = By.className("trFirstRow");
    By sort_status=By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkStatus']");
    By sorting_status = By.className("trFirstRow");
    
	public Message_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void message(){
		try {
			
			Logger Log=Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
			driver.findElement(menu_messages).click();
			Log.info("Messages menu has been clicked");
			Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
			sel.selectByValue("105");	
			Thread.sleep(1000);
			/*Select sel1 = new Select(driver.findElement(dwn_flag));			
			sel1.selectByValue("1");
			Log.info("No Flag was chosen in search field");*/
			Thread.sleep(1000);
			driver.findElement(By.id("btnSearch")).click();
			Thread.sleep(1500);
			driver.findElement(By.id("ContentPlaceHolder1_rptMessages_lblSubject_0")).click();
			Log.info("Message has been clicked");
			Thread.sleep(2000);
			Thread.sleep(1000);
			for(int i=0;i<1;i++)
			{
				List<WebElement> list1=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblSubject_"+i+"']"));
				for (WebElement e : list1) {
					Thread.sleep(1000);
				    e.click();
				}
			}
			Thread.sleep(1000);
			
			int x = 0;  
	        while(x < 5) {
	        	Thread.sleep(1000);
	        	WebElement paginations=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgNextMsgs']"));
	        	Thread.sleep(500);
	        	paginations.click();
	            x++;
		     }
	        Thread.sleep(1000);
	        int y = 0;  
	        while(y < 5) {
	        	Thread.sleep(1000);
	        	WebElement paginationPrev=driver.findElement(By.xpath(" //*[@id='ContentPlaceHolder1_imgPrevMsgs']"));
	        	Thread.sleep(500);
	        	paginationPrev.click();
	            y++;
		     }
	        Thread.sleep(1500);
			driver.findElement(By.id("lnkbtnTranslate")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id='lnkbtnViewFullConvo']")).click();
			Thread.sleep(1000);
			scroll400();
			Thread.sleep(1000);
			scroll400();
			Thread.sleep(1000);
			scrollUp400();
			Thread.sleep(1000);
			scrollUp400();
			Thread.sleep(2000);
			driver.findElement(btn_back).click();
			Log.info("Back button clicked");
			Thread.sleep(2000);
			driver.findElement(lnk_export_to_excel).click();
			Log.info("Export to excel clicked successfully");
			Thread.sleep(2000);
			scroll();
			Thread.sleep(2000);
			
			
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

	/* code for scroll*/
	private void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
	}
	 public void scroll400() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,400)");
	}
	 public void scrollUp400() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("javascript:window.scrollBy(0,-400)");
		}
	public void sort_message() throws Exception{
		
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");
		Thread.sleep(1000);
		driver.findElement(menu_messages).click();
		Log.info("Messages menu has been clicked");
		Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
		sel.selectByValue("105");
		Thread.sleep(3000);
		
		driver.findElement(sort_subject).click();
		System.out.println("Before Sorting Subj");
		Thread.sleep(1000);
		sort_subject();
		Thread.sleep(1000);
		System.out.println("After Sorting subj");
		driver.findElement(sort_subject).click();
		Thread.sleep(1000);
		sort_subject();
		
        Thread.sleep(2000);
		driver.findElement(sort_from).click();
		System.out.println("Before Sorting From");
		sort_from();
		Thread.sleep(1000);
		System.out.println("After Sorting From");
		driver.findElement(sort_from).click();
		sort_from();
		
		Thread.sleep(1000);
		driver.findElement(sort_to).click();
		System.out.println("Before Sorting To");
		Thread.sleep(1000);
		sort_to();
		Thread.sleep(1000);
		System.out.println("After Sorting To");
		driver.findElement(sort_to).click();
		Thread.sleep(1000);
		sort_to();
		
		Thread.sleep(1000);
		driver.findElement(sort_flag).click();
		System.out.println("Before Sorting Flag");
		Thread.sleep(1000);
		sort_flag();
		Thread.sleep(1000);
		System.out.println("After Sorting Flag");
		driver.findElement(sort_flag).click();
		Thread.sleep(1000);
		sort_flag();
		
		Thread.sleep(1000);
		driver.findElement(sort_sent).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_sent();
		Thread.sleep(1000);
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(sort_sent).click();
		Thread.sleep(1000);
		sort_sent();
		
		Thread.sleep(1000);
		driver.findElement(sort_status).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_status();
		Thread.sleep(1000);
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(sort_status).click();
		Thread.sleep(1000);
		sort_status();
	}
 public void Pagination() throws InterruptedException
 {
	 for(int i=0;i<4;i++)
	 {
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']")).click();
	 }
	 for(int i=0;i<4;i++)
	 {
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrev']")).click();
	 }
	 
 }
	public void sort_status() throws InterruptedException{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_imgStatus_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getAttribute("title"));
		}
	}}
	public void sort_subject() throws InterruptedException{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblSubject_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
	}}
	public void sort_flag() throws InterruptedException{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_imgFlag_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getAttribute("src"));
		}
	}}
	public void sort_from() throws InterruptedException{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblSender_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
	}}

	public void sort_to() throws InterruptedException{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblTo_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}}
	}

	public void sort_sent() throws InterruptedException{
		for(int i=0;i<10;i++){
			Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblSent_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
	}}
	
	public void messages(DataTable Msgs) throws InterruptedException, AWTException
	{
		List<List<String>> Msg1=Msgs.raw();
		 POM_PubDefender pu=new POM_PubDefender(driver);
		 Thread.sleep(3000);
		 pu.Messages2.click();
		 Thread.sleep(2000);
		 Select s1=new Select(driver.findElement(By.id("ddlFacilityCodes")));
		 s1.selectByValue("114");	
		 Thread.sleep(1500);
		 pu.InmateLastNameSearch.click();
		 Thread.sleep(1000);
		 pu.InmLstName.sendKeys(Msg1.get(0).get(1));
		 Thread.sleep(1000);
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(1000);
		 pu.InmateFirstNameSearch.click();
		 Thread.sleep(1000);
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
		// log.info("Messages clicked Success");
		 Thread.sleep(1000);
		/* List<WebElement> MsgSubj=driver.findElements(By.id("lblMessageSubject"));
		 Thread.sleep(1000);
		 for(int i=0;i<2;i++)
		 {
			 Thread.sleep(1000);
			 MsgSubj=driver.findElements(By.id("lblMessageSubject"));
			 Thread.sleep(1000);
			 MsgSubj.get(i).click();*/
		       Thread.sleep(2000);
		       driver.findElement(By.id("ContentPlaceHolder1_rptMessages_lblSubject_0")).click();
			 Thread.sleep(2000);
			 pu.BtnTranslate.click();
			 Thread.sleep(1000);
			// log.info("Messages Translated Success");
			 pu.BackButton.click();
			 
		  Thread.sleep(1000);
	//	  pu.PublicUser_Messages_Subject_Sort();
	//	  pu.PublicUser_Messages_From_Sort();
	//	  pu.PublicUser_Messages_To_Sort();
	//	  pu.PublicUser_Messages_Flag_Sort();
	 //	  pu.PublicUser_Messages_Status_Sort();
		 
	 }
	}
	

