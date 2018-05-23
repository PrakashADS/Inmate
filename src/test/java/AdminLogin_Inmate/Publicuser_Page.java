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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.POM_PubDefender;
import cucumber.api.DataTable;

public class Publicuser_Page {

	public WebDriver driver;

	public Publicuser_Page(WebDriver driver) {
		this.driver = driver;
	}

	By lnk_Publicuser = By.id("rptUser_menuAnchor_10");
	By txt_username_search = By.id("ContentPlaceHolder1_txtUserNameSearch");
	By btn_search = By.id("btnSearch");
	By export_excel = By.id("ContentPlaceHolder1_imbtnExportToExcel");
	By lnk_username = By.id("lblUserName");
	By pagination = By
			.xpath("//*[@id='grvUsers']/tbody/tr[12]/td/table/tbody/tr/td[2]/a");
	By dwn_Category = By.id("ContentPlaceHolder1_ddlChoose");
	By chk_connection = By.id("chkSelectPublicUsers");
	By txtarea_notes = By.id("ContentPlaceHolder1_txtNotes");
	By btn_block = By.id("btnUpdatePublicUser");
	By dwn_inmate_id = By.name("ctl00$ContentPlaceHolder1$ddlLoadInmates");
	By txt_complementary_fund = By.id("ContentPlaceHolder1_txtCredits");
	By btn_submit = By.id("btnFundSubmit");
	By btn_ok = By.id("btnOk");
	By export_excel_connection = By
			.id("ContentPlaceHolder1_imgbtnConnectionsInfoExporttoExcel");
	By sort_inmate_id = By
			.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[2]/a");
	By sort_inmate_name = By
			.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[3]/a");
	By sort_inmate_status = By
			.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[4]/a");
	By sort_relationship = By
			.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[5]/a");
	By sort_connection_status = By
			.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[6]/a");
	By sort_credit_balance = By
			.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[7]/a");
	By connection_pagination = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[12]/td/table/tbody/tr/td[2]/a");
	By lnk_messages = By
			.xpath("//*[@id='ContentPlaceHolder1_anchrMessages']/i/span");
	By lnk_photos = By.id("ContentPlaceHolder1_anchrPhotos");
	By lnk_payments = By.id("ContentPlaceHolder1_achrPayments");
	By msg_edit_sub = By.id("lblMessageSubject");
	By msg_translate = By.id("lnkbtnTranslate");
	By msg_back = By.id("ContentPlaceHolder1_btnBack");
	By lnk_browser = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[1]/a");
	By lnk_ip_address = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[2]/a");
	By lnk_datetime = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[3]/a");
	By photo_edit_sub = By.id("lblPhotoSubject");
	By btn_payment_back = By.id("ContentPlaceHolder1_btnPaymentsBack");
	By lnk_Ipaddress = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[2]/a");
	By lnk_DateTime = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[3]/a");
	By export_login_info = By
			.id("ContentPlaceHolder1_imgbtnUsersLoginInfoExporttoExcel");
	By login_info_pagination = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[12]/td/table/tbody/tr/td[4]/a");

	By Reports = By.xpath("//*[@id='ContentPlaceHolder1_achrReports']/i/span");
	By FromDate = By.id("ContentPlaceHolder1_txtReportFromDate");
	By ToDate = By.id("ContentPlaceHolder1_txtReportToDate");
	By Direction = By.id("ContentPlaceHolder1_ddlReportMessageDirection");

	public void publicuser_edit(DataTable puReport) {
		try {

			Logger Log = Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
			Thread.sleep(1000);
			driver.findElement(lnk_Publicuser).click();
			Log.info("Public User Menu clicked");
			Select sel = new Select(driver.findElement(By
					.id("ddlFacilityCodes")));
			sel.selectByValue("105");
			Log.info("Facility code has been chosen");
			Thread.sleep(2000);
			driver.findElement(txt_username_search).sendKeys("mangai");
			Log.info("Username has been entered");
			driver.findElement(btn_search).click();
			Log.info("Search button has clicked");
			Thread.sleep(2000);
			List<WebElement> list = driver.findElements(lnk_username);
			list.get(2).click();
			Log.info("Username has been clicked");
			Thread.sleep(1000);
			/*
			 * Select s1 = new Select(driver.findElement(dwn_Category));
			 * s1.selectByValue("Complementary Fund");
			 * Log.info("Category has been clicked"); Thread.sleep(2000); Select
			 * s2 = new Select(driver.findElement(dwn_inmate_id));
			 * s2.selectByIndex(1); Log.info("Inmate Id has been clicked");
			 * Thread.sleep(1000);
			 * driver.findElement(txt_complementary_fund).sendKeys("5");
			 * Log.info("Complementary fund added successfully");
			 * Thread.sleep(1000); driver.findElement(btn_submit).click();
			 * Log.info("Submit button has been clicked"); Thread.sleep(1000);
			 * driver.findElement(btn_ok).click();
			 * Log.info("Ok button has been clicked");
			 */
			Thread.sleep(1000);
			scroll();
			List<WebElement> chkbox = driver.findElements(chk_connection);
			int isize = chkbox.size();
			// System.out.println("Total Size of checkbox"+isize);
			for (int i = 1; i < isize; i++) {
				chkbox = driver.findElements(chk_connection);
				chkbox.get(0).click();
			}
			chkbox.get(0).click();
			Log.info("Inmate id has been clicked");
			driver.findElement(btn_block).click();
			Log.info("Block button clicked");
			Thread.sleep(1000);
			driver.findElement(btn_ok).click();
			Log.info("Ok button has been clicked");
			Thread.sleep(1000);
			// driver.findElement(export_excel_connection).click();
			Log.info("Export to Excel_Connections has been clicked");

			Log.info("******Before Inmate ID Sorting*****");
			scroll();

			POM_PubDefender pu = new POM_PubDefender(driver);
			Thread.sleep(2000);
			// pu.PublicUsers.click();
			scroll1();
			Thread.sleep(1500);
			pu.PubUserMessage.click();
			Thread.sleep(2000);
			pu.InmateLastNameSearch.click();
			Thread.sleep(1000);
			pu.InmateAutoLastName.sendKeys("JoHN");
			Thread.sleep(1000);
			Robot r4 = new Robot();
			r4.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			pu.InmateFirstNameSearch.click();
			Thread.sleep(1000);
			pu.InmateAutoFirstName.sendKeys("PETER");
			Thread.sleep(1000);
			Robot r5 = new Robot();
			r5.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			pu.SearchMsg.click();
			Thread.sleep(1000);
			/*
			 * log.info("public user message searched Success");
			 * List<WebElement>
			 * InmateMessage=obj.findElements(By.id("lblMessageSubject"));
			 * Thread.sleep(1000); for(int i=0;i<1;i++) { Thread.sleep(1000);
			 * InmateMessage=obj.findElements(By.id("lblMessageSubject"));
			 * Thread.sleep(1000); InmateMessage.get(i).click();
			 * Thread.sleep(1000); pu.BtnTranslate.click(); Thread.sleep(1000);
			 * pu.BackButton.click(); Thread.sleep(1000); }
			 */
			Thread.sleep(1500);
			driver.findElement(
					By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblSubject_0']"))
					.click();
			Thread.sleep(1500);
			pu.BtnTranslate.click();
			Thread.sleep(1500);
			pu.Back.click();

			/*
			 * Thread.sleep(2000);
			 * driver.findElement(connection_pagination).click();
			 * webdriverWait(sort_inmate_id,50); Thread.sleep(2000);
			 * driver.findElement(sort_inmate_id).click();
			 * webdriverWait(sort_inmate_id,50); Sorting_Inmate_ID();
			 * //scroll(); Thread.sleep(2000); webdriverWait(sort_inmate_id,50);
			 * Thread.sleep(3000); driver.findElement(sort_inmate_id).click();
			 * Log.info("***After Inmate ID Sorting***"); Thread.sleep(1000);
			 * Sorting_Inmate_ID(); Thread.sleep(1000);
			 * Pub_User_reports(puReport);
			 * Log.info("******Before Inmate Name Sorting*****"); //scroll();
			 * Thread.sleep(2000);
			 * //driver.findElement(connection_pagination).click();
			 * webdriverWait(sort_inmate_name,50); Thread.sleep(1000);
			 * driver.findElement(sort_inmate_name).click();
			 * webdriverWait(sort_inmate_name,50); Sorting_Inmate_Name();
			 * //scroll(); Thread.sleep(2000);
			 * webdriverWait(sort_inmate_name,50); Thread.sleep(3000);
			 * driver.findElement(sort_inmate_name).click();
			 * Log.info("***After Inmate Name Sorting***"); Thread.sleep(1000);
			 * Sorting_Inmate_Name();
			 * 
			 * 
			 * Log.info("******Before Inmate Status Sorting*****");
			 * Thread.sleep(2000); webdriverWait(sort_inmate_status,50);
			 * Thread.sleep(1000);
			 * driver.findElement(sort_inmate_status).click();
			 * webdriverWait(sort_inmate_status,50); Sorting_Inmate_Status();
			 * Thread.sleep(2000); webdriverWait(sort_inmate_status,50);
			 * Thread.sleep(3000);
			 * driver.findElement(sort_inmate_status).click();
			 * Log.info("***After Inmate status Sorting***");
			 * Thread.sleep(1000); Sorting_Inmate_Status();
			 * 
			 * 
			 * Log.info("******Before Inmate Relationship Sorting*****");
			 * Thread.sleep(2000); webdriverWait(sort_relationship,50);
			 * Thread.sleep(1000);
			 * driver.findElement(sort_relationship).click();
			 * webdriverWait(sort_relationship,50);
			 * Sorting_Inmate_Relationship(); Thread.sleep(2000);
			 * webdriverWait(sort_relationship,50); Thread.sleep(3000);
			 * driver.findElement(sort_relationship).click();
			 * Log.info("***After Inmate Relationship Sorting***");
			 * Thread.sleep(1000); Sorting_Inmate_Relationship();
			 * 
			 * 
			 * Log.info("******Before Inmate Connection Status Sorting*****");
			 * Thread.sleep(2000); webdriverWait(sort_connection_status,50);
			 * Thread.sleep(1000);
			 * driver.findElement(sort_connection_status).click();
			 * webdriverWait(sort_connection_status,50);
			 * Sorting_Inmate_Connection_Status();; Thread.sleep(2000);
			 * webdriverWait(sort_connection_status,50); Thread.sleep(3000);
			 * driver.findElement(sort_connection_status).click();
			 * Log.info("***After Inmate Connection status Sorting***");
			 * Thread.sleep(1000); Sorting_Inmate_Connection_Status();
			 * 
			 * 
			 * Log.info("******Before Inmate Credit Balance Sorting*****");
			 * Thread.sleep(2000); webdriverWait(sort_credit_balance,50);
			 * Thread.sleep(1000);
			 * driver.findElement(sort_credit_balance).click();
			 * webdriverWait(sort_credit_balance,50);
			 * Sorting_Inmate_Credit_Balance(); Thread.sleep(2000);
			 * webdriverWait(sort_credit_balance,50); Thread.sleep(3000);
			 * driver.findElement(sort_credit_balance).click();
			 * Log.info("***After Inmate Credit Balance Sorting***");
			 * Thread.sleep(1000); Sorting_Inmate_Credit_Balance();
			 * 
			 * scroll(); scroll(); Thread.sleep(1000);
			 * driver.findElement(lnk_browser).click();
			 * 
			 * Log.info("******Before Browser Sorting*****");
			 * Thread.sleep(2000); webdriverWait(lnk_browser,50);
			 * Thread.sleep(1000); driver.findElement(lnk_browser).click();
			 * webdriverWait(lnk_browser,50); Sorting_browser();
			 * Thread.sleep(2000); webdriverWait(lnk_browser,50);
			 * Thread.sleep(3000); driver.findElement(lnk_browser).click();
			 * Log.info("***After Browser Sorting***"); Thread.sleep(1000);
			 * Sorting_browser();
			 * 
			 * 
			 * Log.info("******Before IPAddress Sorting*****");
			 * Thread.sleep(2000); webdriverWait(lnk_ip_address,50);
			 * Thread.sleep(1000); driver.findElement(lnk_ip_address).click();
			 * webdriverWait(lnk_ip_address,50); Sorting_IpAdress();
			 * Thread.sleep(2000); webdriverWait(lnk_ip_address,50);
			 * Thread.sleep(3000); driver.findElement(lnk_ip_address).click();
			 * Log.info("***After IPAddress Sorting***"); Thread.sleep(1000);
			 * Sorting_IpAdress();
			 * 
			 * 
			 * Log.info("******Before DateTime Sorting*****");
			 * Thread.sleep(2000); webdriverWait(lnk_DateTime,50);
			 * Thread.sleep(1000); driver.findElement(lnk_datetime).click();
			 * webdriverWait(lnk_datetime,50); Sorting_Datetime();
			 * Thread.sleep(2000); webdriverWait(lnk_datetime,50);
			 * Thread.sleep(3000); driver.findElement(lnk_datetime).click();
			 * Log.info("***After DateTime Sorting***"); Thread.sleep(1000);
			 * Sorting_Datetime();
			 */

			/*
			 * Thread.sleep(1000); scroll1(); webdriverWait(lnk_messages, 50);
			 * Thread.sleep(1000); driver.findElement(lnk_messages).click();
			 * Log.info("Messages tab has been clicked successfully");
			 * Thread.sleep(1000); List<WebElement> l1 =
			 * driver.findElements(msg_edit_sub); l1.get(1).click();
			 * Thread.sleep(1000); driver.findElement(msg_translate).click();
			 * Log.info("Translate button has been clicked successfully");
			 * Thread.sleep(2000); driver.findElement(msg_back).click();
			 * Log.info("Message Back button has been clicked successfully");
			 * Thread.sleep(1000); driver.findElement(lnk_photos).click();
			 * Log.info("Photos tab has been clicked successfully");
			 * Thread.sleep(1000); List<WebElement> photos =
			 * driver.findElements(photo_edit_sub); photos.get(1).click();
			 * Thread.sleep(1000); driver.findElement(msg_back).click();
			 * Log.info("Photos Back button has been clicked successfully");
			 * driver.findElement(lnk_payments).click();
			 * Log.info("Payment tab has been clicked successfully");
			 * driver.findElement(btn_payment_back).click();
			 * Log.info("Payment Back button has been clicked successfully");
			 * Thread.sleep(1000);
			 */
	       	 PublicUser_photos();
		
			Thread.sleep(2000);
			scroll200();
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_achrPayments']/i/span")).click();
				
			Thread.sleep(1000);

			Pub_User_reports(puReport);
			/*
			 * //driver.findElement(page_sort).click(); List<WebElement> list1 =
			 * driver.findElements(By.id("lblInmateResidentId")); int totalelem
			 * = list1.size(); String value = list1.toString();
			 * value.getBytes(value); for(int i=0;i<=totalelem;i++){
			 * 
			 * System.out.println(list1.get(1)); }
			 */

			// driver.findElement(page_sort).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* code for scroll */
	private void scroll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,650)");
		Thread.sleep(1000);
	}

	private void scroll1() throws InterruptedException {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("javascript:window.scrollBy(0,-1700)");
	}
	private void scroll200() throws InterruptedException {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("javascript:window.scrollBy(0,-200)");
	}
	private void scroll450() throws InterruptedException {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("javascript:window.scrollBy(0,450)");
	}

	/* code for explicit wait */
	public void webdriverWait(By locator, long sec) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void Sorting_Inmate_ID() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblInmateResidentId");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());

		}
		/*
		 * List<WebElement> alllinks
		 * =driver.findElements(By.id("lblInmateResidentId")); String a[]=new
		 * String[alllinks.size()]; for(int i=0;i<alllinks.size();i++) {
		 * a[i]=alllinks.get(i).getText(); Thread.sleep(1000);
		 * System.out.println(a[i]); }
		 */
	}

	public void Sorting_Inmate_Name() throws Exception {
		Thread.sleep(1000);
		By list11 = By.id("lblInmateName");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}
	}

	public void Sorting_Inmate_Status() throws Exception {
		Thread.sleep(1000);
		By list11 = By.id("lblInmateStatus");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}
	}

	public void Sorting_Inmate_Relationship() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblRelationShip");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());

		}
	}

	public void Sorting_Inmate_Connection_Status() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblConnectionStatus");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());

		}
	}

	public void Sorting_Inmate_Credit_Balance() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblCreditBalance");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}
	}

	public void Sorting_browser() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblSigninBrowserType");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}
	}

	public void Sorting_IpAdress() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblSigninIPAddress");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}
	}

	public void Sorting_Datetime() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblSigninDateTime");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}
	}

	public void Pub_User_reports(DataTable puReport)
			throws InterruptedException {
		List<List<String>> report = puReport.raw();
		Thread.sleep(2000);
		driver.findElement(Reports).click();
		Thread.sleep(1000);
		driver.findElement(FromDate).sendKeys(report.get(0).get(1));
		Thread.sleep(1000);
		driver.findElement(ToDate).sendKeys(report.get(1).get(1));
		Thread.sleep(1000);
		Select dir = new Select(driver.findElement(Direction));
		dir.selectByVisibleText(report.get(2).get(1));
		Thread.sleep(1000);
		driver.findElement(By.id("btnMessagesDownload")).click();
		Thread.sleep(1000);
		int x=1;
		switch(x)
		{
		case 1:
			Thread.sleep(1000);
			driver.findElement(By.id("btnDownloadMessages")).click();
			break;
		case 2:
			Thread.sleep(1000);
			driver.findElement(By.id("btnMessageCancelDownload")).click();
			break;
		}
	}

	public void PublicUser_photos()
			throws InterruptedException, AWTException {
		
		POM_PubDefender pu = new POM_PubDefender(driver);
		Thread.sleep(1500);
		ScrollDown450();
		Thread.sleep(2000);
		pu.PubUserPhotos.click();
		Thread.sleep(2000);
		pu.InmateLastSearch.click();
		Thread.sleep(1000);
		pu.InmateAutoLastSearch.sendKeys("JoHN");
		Thread.sleep(1000);
		Robot r4 = new Robot();
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		pu.InmateFrstSearch.click();
		Thread.sleep(1000);
		pu.InmateAutoFrstSearch.sendKeys("PETER");
		Thread.sleep(1000);
		Robot r5 = new Robot();
		r5.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1300);
		/*
		 * Select ststus=new Select(pu.SearchStatus); ststus.selectByValue("4");
		 */
		Thread.sleep(1000);
		pu.btnSearchPhotos.click();

		Thread.sleep(1000);

		/*
		 * List<WebElement>
		 * photoSubj=obj.findElements(By.id("lblPhotoSubject"));
		 * Thread.sleep(1000); for(int i=0;i<1;i++) { Thread.sleep(1000);
		 * photoSubj=obj.findElements(By.id("lblPhotoSubject"));
		 * Thread.sleep(1000); photoSubj.get(i).click(); Thread.sleep(1000);
		 * 
		 * int x=1; switch(x) { case 1: Thread.sleep(1000);
		 * obj.findElement(By.id("ContentPlaceHolder1_btnApprove")).click();
		 * log.info("Photos Approved Success"); break; case 2:
		 * Thread.sleep(1000);
		 * obj.findElement(By.id("ContentPlaceHolder1_btnReject")).click();
		 * log.info("Photos Rejected Success"); break; } int y=1; switch(y) {
		 * case 1: Thread.sleep(1250); obj.findElement(By.id("btnYes")).click();
		 * break; case 2: Thread.sleep(1200);
		 * obj.findElement(By.id("btnNo")).click(); break; }
		 * 
		 * Thread.sleep(1000); pu.btnOk.click(); Thread.sleep(1000); //
		 * pu.Back3.click();
		 * 
		 * 
		 * }
		 */

		Thread.sleep(1000);
		ScrollUp250();
		// pu.PublicUser_Photos_Subject_Sort();
		// pu.PublicUser_Photos_From_Sort();
		// pu.PublicUser_Photos_To_Sort();
		// pu.PublicUser_Photos_SentOn_Sort();
		//pu.PublicUser_Photos_Status_Sort();

	}

	public void ScrollDown450() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-450)", "");
	}

	public void ScrollUp250() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}
}
