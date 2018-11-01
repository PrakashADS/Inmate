package AdminLogin_Inmate;

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

public class Registered_Users_Page {
	public static WebDriver driver;
	By menu_Registered_user = By.xpath("//*[@id='rptUser_menuAnchor_2']");
	By dwn_user_status = By.id("ContentPlaceHolder1_ddlCurrentStatus");
	By btn_submit = By.id("ContentPlaceHolder1_btnUpdateUserCurrentStatus");
	By lnk_username = By.id("lblUserName");
	By btn_ok = By.name("ctl00$ContentPlaceHolder1$uctlMessage$btnOk");
	By txt_username = By.id("ContentPlaceHolder1_txtSearchUserName");
	By btn_search = By.id("btnSearch");
	By btn_export_excel = By.id("ContentPlaceHolder1_imbtnExportToExcel");
	By lnk_pagination = By.xpath("//*[@id='grvUsers']/tbody/tr[12]/td/table/tbody/tr/td[2]/a");
	By btn_back = By.id("ContentPlaceHolder1_btnBack");
	By btn_Reset = By.id("btnReset");
	By sort_username = By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lnkUserName']");
	By sort_lastname = By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lnkLastName']");
	By sort_fname = By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lnkFirstName']"); 
	By sort_email = By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lnkEmail']");
	By sort_city = By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lnkCity']");
	By sort_state = By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lnkState']");
	By sort_list_username = By.id("lblUserName");
	By sort_list_lastname = By.id("lblLastName");
	By sort_list_firstname = By.id("lblFirstName");
	By sort_list_email = By.id("lblEmail");
	By sort_list_city = By.id("lblCity");
	By sort_list_state = By.id("lblState");
	By sort_conn = By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lnkConnection']");
public Registered_Users_Page (WebDriver driver)
{
	this.driver=driver;
}

	public void Registered_user(){

		try{
			Logger Log=Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
						
            Thread.sleep(1500);
			driver.findElement(menu_Registered_user).click();
			Log.info("Registered user menu has been chosen");				
			//Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));			
			//sel.selectByIndex(2);
			//Log.info("Facility code has been chosen");
			Thread.sleep(2000);
			driver.findElement(btn_export_excel).click();
			Log.info("Export to excel has been clicked");	

			Thread.sleep(2000);
			scroll();
		//	driver.findElement(lnk_pagination).click();
		//	Log.info("Pagination has been clicked");	

			Thread.sleep(2000);
			driver.findElement(txt_username).sendKeys("mangai");
			Log.info("Submit button has been clicked");		

			Thread.sleep(2000);			
			driver.findElement(btn_search).click();
			Log.info("Search button has been clicked");

			Thread.sleep(5000);           
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lblUserName_1']")).click();
			Log.info("Username has been selected");

			Thread.sleep(2000);
			Select status = new Select(driver.findElement(dwn_user_status));
			status.selectByValue("1");
			Log.info("Inactive has been chosen");

			Thread.sleep(2000);
			driver.findElement(btn_submit).click();
			Log.info("Submit button has been clicked");

			Thread.sleep(2000);
			driver.findElement(btn_ok).click();
			Log.info("OK button has been clicked");

			Thread.sleep(2000);
			Select status1 = new Select(driver.findElement(dwn_user_status));
			Thread.sleep(2000);
			status1.selectByValue("2"); 
			Log.info("Active has been chosen");

			Thread.sleep(2000);
			driver.findElement(btn_submit).click();
			Log.info("Submit button has been clicked");

			Thread.sleep(2000);
			driver.findElement(btn_ok).click();
			Log.info("OK button has been clicked");
			Thread.sleep(2000);
			Sort_LoginInfo();
			
			
			/*	driver.findElement(btn_back).click();
			Log.info("Back button has been clicked");

		  Thread.sleep(2000);
			driver.findElement(btn_Reset).click();
			Log.info("Reset button has been clicked");*/


		}catch(Exception e){
			e.printStackTrace();
		}

	}

	/* code for scroll*/
	private void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
	}
	private void scroll250() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,250)");
	}

	public void field_sorting() throws Exception{
	
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");
		//driver.findElement(menu_Registered_user).click();
		//Log.info("Registered user menu has been chosen");	

		Thread.sleep(2000);
		driver.findElement(sort_username).click();
		System.out.println("Username before sort");
		sorting_username();
		Thread.sleep(1000);
		driver.findElement(sort_username).click();
		System.out.println("Username after sort");
		sorting_username();
		
		Thread.sleep(1000);
		driver.findElement(sort_lastname).click();
		System.out.println("Username before sort");
		sorting_lastname();
		Thread.sleep(1000);
		driver.findElement(sort_lastname).click();
		System.out.println("Username after sort");
		sorting_lastname();
		
		Thread.sleep(1000);
		driver.findElement(sort_fname).click();
		System.out.println("fname before sort");
		sorting_firstname();
		Thread.sleep(1000);
		driver.findElement(sort_fname).click();
		System.out.println("fname after sort");
		sorting_firstname();
		
		Thread.sleep(1000);
		driver.findElement(sort_email).click();
		System.out.println("email before sort");
		sorting_email();
		Thread.sleep(1000);
		driver.findElement(sort_email).click();
		System.out.println("email after sort");
		sorting_email();
		
		Thread.sleep(1000);
		driver.findElement(sort_city).click();
		System.out.println("city before sort");
		sorting_city();
		Thread.sleep(1000);
		driver.findElement(sort_city).click();
		System.out.println("city after sort");
		sorting_city();
		
		Thread.sleep(1000);
		driver.findElement(sort_state).click();
		System.out.println("state before sort");
		sorting_state();
		Thread.sleep(1000);
		driver.findElement(sort_state).click();
		System.out.println("state after sort");
		sorting_state();
		
		Thread.sleep(1000);
		driver.findElement(sort_conn).click();
		System.out.println("connection before sort");
		sorting_conn();
		Thread.sleep(1000);
		driver.findElement(sort_conn).click();
		System.out.println("connection after sort");
		Thread.sleep(1000);
		sorting_conn();
	/*	Thread.sleep(1000);
		driver.findElement(sort_conn).click();
		System.out.println("connection before sort");
		sorting_conn();
		Thread.sleep(1000);
		driver.findElement(sort_conn).click();
		System.out.println("connection after sort");
		sorting_conn();*/
		Thread.sleep(1000);
		pagination();
		
	}
public void pagination() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrev']")).click();
}
	public void sorting_username() throws Exception{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lblUserName_"+i+"']"));
		for(WebElement e : li) {
			Thread.sleep(1000);	
			System.out.println(e.getText());
		}}
	}

	public void sorting_lastname() throws Exception{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> ln = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lblLastName_"+i+"']"));
		for(WebElement e : ln) {
			Thread.sleep(1000);	
			System.out.println(e.getText());
		}}
	}

	public void sorting_firstname() throws Exception{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lblFirstName_"+i+"']"));
		for(WebElement e : li) {
			Thread.sleep(1000);	
			System.out.println(e.getText());
		}}
	}

	public void sorting_email() throws Exception{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lblEmail_"+i+"']"));
		for(WebElement e : li) {
			Thread.sleep(1000);	
			System.out.println(e.getText());
		}}
	}

	public void sorting_city() throws Exception{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lblCity_"+i+"']"));
		for(WebElement e : li) {
			Thread.sleep(1000);	
			System.out.println(e.getText());
		}}
	}

	public void sorting_state() throws Exception{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lblState_"+i+"']"));
		for(WebElement e : li) {
			Thread.sleep(1000);	
			System.out.println(e.getText());
		}}
	}

	public void sorting_conn() throws Exception{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptRegisteredUsersUsers_lblConnectionAccept_"+i+"']"));
		for(WebElement e : li) {
			Thread.sleep(1000);	
			System.out.println(e.getText());
		}}
	}
	public void Sort_LoginInfo() throws Exception
	{
		scroll250();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lnkSigninBrowserType']")).click();
		System.out.println("connection before sort");
		sorting_browserType();
		Thread.sleep(1000);
		driver.findElement(sort_conn).click();
		System.out.println("connection after sort");
		sorting_browserType();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lnkSigninIPAddress']")).click();
		System.out.println("connection before sort");
		sorting_ipaddress();
		Thread.sleep(1000);
		driver.findElement(sort_conn).click();
		System.out.println("connection after sort");
		sorting_ipaddress();
		
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lnkSigninOn']")).click();
		System.out.println("connection before sort");
		sorting_signinOn();
		Thread.sleep(1000);
		driver.findElement(sort_conn).click();
		System.out.println("connection after sort");
		sorting_signinOn();
	}
	public void sorting_browserType() throws Exception{
		for(int i=0;i<10;i++)
		{
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lblSigninBrowserType_"+i+"']"));
		for(WebElement e : li) {
			Thread.sleep(1000);	
			System.out.println(e.getText());
		}}
	}
	public void sorting_ipaddress() throws Exception{
		for(int i=0;i<10;i++)
		{
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lblSigninIPAddress_"+i+"']"));
		for(WebElement e : li) {
			Thread.sleep(1000);	
			System.out.println(e.getText());
		}}
	}
		public void sorting_signinOn() throws Exception{
			for(int i=0;i<10;i++)
			{
			List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lblSigninDateTime_"+i+"']"));
			for(WebElement e : li) {
				Thread.sleep(1000);	
				System.out.println(e.getText());
			}}
	}
	
	

	/* code for explicit wait*/
	public void webdriverWait(By locator, long sec){
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

}
