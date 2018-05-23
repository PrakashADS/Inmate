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
	By sort_subject = By.id("ContentPlaceHolder1_lblSubject");
	By sorting_subject = By.className("trFirstRow");
	By sort_from = By.id("ContentPlaceHolder1_LinkButton1");
	By sorting_from = By.className("trFirstRow");
	By sort_to = By.id("ContentPlaceHolder1_LinkButton2");
	By sorting_to = By.className("trFirstRow");
	By sort_sent = By.id("ContentPlaceHolder1_LinkButton4");
	By sorting_sent = By.className("trFirstRow");

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
			Select sel1 = new Select(driver.findElement(dwn_flag));			
			sel1.selectByValue("0");
			Log.info("No Flag was chosen in search field");
			Thread.sleep(1000);
			driver.findElement(By.id("btnSearch")).click();
			Thread.sleep(1500);
			driver.findElement(By.id("ContentPlaceHolder1_rptMessages_lblSubject_0")).click();
			Log.info("Message has been clicked");
			Thread.sleep(1000);
			driver.findElement(By.id("lnkbtnTranslate")).click();
			Thread.sleep(1000);
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

	public void sort_message() throws Exception{
		
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");
		driver.findElement(menu_messages).click();
		Log.info("Messages menu has been clicked");
		Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
		sel.selectByValue("105");
		Thread.sleep(2000);
		driver.findElement(sort_subject).click();
		System.out.println("Before Sorting Subj");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_subject();
		Thread.sleep(1000);
		System.out.println("After Sorting subj");
		System.out.println("*************");
		driver.findElement(sort_subject).click();
		Thread.sleep(1000);
		sort_subject();
		
        Thread.sleep(2000);
		driver.findElement(sort_from).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_from();
		Thread.sleep(1000);
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(sort_from).click();
		Thread.sleep(1000);
		sort_from();
		Thread.sleep(1000);
		driver.findElement(sort_to).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_to();
		Thread.sleep(1000);
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(sort_to).click();
		Thread.sleep(1000);
		sort_to();
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
	}

	public void sort_subject(){
		List<WebElement> li = driver.findElements(sorting_subject);
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
	}

	public void sort_from(){
		List<WebElement> li = driver.findElements(sorting_from);
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
	}

	public void sort_to(){
		List<WebElement> li = driver.findElements(sorting_to);
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
	}

	public void sort_sent(){
		List<WebElement> li = driver.findElements(sorting_sent);
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
	}
	
	public void messages(DataTable Msgs) throws InterruptedException, AWTException
	{
		List<List<String>> Msg1=Msgs.raw();
		 POM_PubDefender pu=new POM_PubDefender(driver);
		 Thread.sleep(1000);
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
			 Thread.sleep(1000);
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
		 
	 }}
	

