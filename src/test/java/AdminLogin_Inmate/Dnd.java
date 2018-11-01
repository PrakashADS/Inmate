package AdminLogin_Inmate;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Dnd {
	public Dnd(WebDriver driver)
	{
		this.driver=driver;
	}
	
	Logger log = Logger.getLogger(Dnd.class.getName());
	public WebDriver driver;	
	By menu_dnd = By.id("rptUser_menuAnchor_17");
	By btn_dnd = By.xpath("//input[@id='ContentPlaceHolder1_bnAddDNDUsers']");
	By radio_btn_email = By.id("ContentPlaceHolder1_rdoDNDType_1");
	By txt_mobile = By.id("ContentPlaceHolder1_txtDNDUserEmail");
	By txt_email = By.id("ContentPlaceHolder1_txtDNDUserEmail");
	By btn_save = By.id("btnSubmit");
	By sort_email = By.xpath("//*[@id='ContentPlaceHolder1_rptDNDUsers_lnkEmailMobile']");
	By sort_date = By.xpath("//a[contains(text(),'Date')]");
	By sort_source = By.xpath("//a[contains(text(),'Source')]");
	By sort_Remarks = By.xpath("//a[contains(text(),'Remarks')]");
	By sort_Status = By.xpath("//a[contains(text(),'Status')]");
	By export = By.id("ContentPlaceHolder1_imbtnExportToExcel");
	By pagination = By.xpath("//*[@id='grvDNDUsers']/tbody/tr[12]/td/table/tbody/tr/td[3]/a");
	By btn_twilio = By.id("btnGetDndFromTwilio");
	By btn_ok = By.name("ctl00$ContentPlaceHolder1$uctlMessage$btnOk");
	public void dnd_users() throws Exception{
		
		
		System.out.println("Navigated to DND user");
		scroll();
		Thread.sleep(2000);
		driver.findElement(menu_dnd).click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		driver.findElement(export).click();
		log.info("Export to excel clicked successfully");
		Thread.sleep(1000);
		scroll();
		Thread.sleep(2500);
/*		WebDriverWait w1 = new WebDriverWait(driver, 50);
		w1.until(ExpectedConditions.elementToBeClickable(pagination));*/
		
		/*for(int j=2;j<=4;j++)
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='grvDNDUsers']/tbody/tr[12]/td/table/tbody/tr/td["+j+"]/a")).click();
		}
	*/
		Thread.sleep(2000);
		scroll250();
		Thread.sleep(1500);
		driver.findElement(By.id("ContentPlaceHolder1_imbtnTwilioExportToExcel")).click();
		Thread.sleep(1500);
		scroll1();
		Thread.sleep(1500);
		driver.findElement(btn_twilio).click();
		Thread.sleep(4000);
		driver.findElement(btn_ok).click();
		Thread.sleep(2000);
		char dnd = 'B';
		switch (dnd) {
		case 'A':
			driver.findElement(btn_dnd).click();
			Add_DND_Mobilenum();
		//	sorting();
			break;
		case 'B':
			driver.findElement(btn_dnd).click();
			Thread.sleep(1000);
			driver.findElement(radio_btn_email).click();
			Thread.sleep(1000);
			Add_DND_Email();
			Thread.sleep(1500);
		//	sorting();
			break;
		default:
			break;
		}
		
	}
	
	public void Add_DND_Mobilenum() throws Exception{
		Thread.sleep(1000);
		driver.findElement(txt_mobile).sendKeys("9876543210");
		Thread.sleep(1000);
		driver.findElement(btn_save).click();
		Thread.sleep(2500);
		driver.findElement(btn_ok).click();
		log.info("Dnd Mobile number added successfully");
	}
	
	public void Add_DND_Email() throws Exception{
		Thread.sleep(1000);
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  

		driver.findElement(txt_email).sendKeys("test"+randomInt+"@gmail.com");
		Thread.sleep(1000);
		driver.findElement(btn_save).click();
		Thread.sleep(1000);
		driver.findElement(btn_ok).click();
		log.info("Dnd Email added successfully");
	}
	
	public void sorting() throws Exception{
		Thread.sleep(2000);
		driver.findElement(sort_email).click();
		System.out.println("Email Ascending order");
		Thread.sleep(1000);
		sort_emails();
		Thread.sleep(1000);
		driver.findElement(sort_email).click();
		Thread.sleep(1000);
		System.out.println("Email Descending order");
		sort_emails();
		Thread.sleep(1000);
		driver.findElement(sort_date).click();
		Thread.sleep(1000);
		System.out.println("Date Ascending order");
		sort_Date();
		Thread.sleep(1000);
		driver.findElement(sort_date).click();
		Thread.sleep(1000);
		System.out.println("Date Descending order");
		sort_Date();
		Thread.sleep(1000);
		driver.findElement(sort_source).click();
		Thread.sleep(1000);
		System.out.println("Source Ascending order");
		sort_Source();
		Thread.sleep(1000);
		driver.findElement(sort_source).click();
		Thread.sleep(1000);
		System.out.println("Source Descending order");
		sort_Source();
		Thread.sleep(1000);
		driver.findElement(sort_Remarks).click();
		Thread.sleep(1000);
		System.out.println("Remarks Ascending order");
		sort_Remarks();
		Thread.sleep(1000);
		driver.findElement(sort_Remarks).click();
		Thread.sleep(1000);
		System.out.println("Remarks Descending order");
		sort_Remarks();
		Thread.sleep(1000);
		driver.findElement(sort_Status).click();
		Thread.sleep(1000);
		System.out.println("Status Ascending order");
		sort_Status();
		Thread.sleep(1000);
		driver.findElement(sort_Status).click();
		Thread.sleep(1000);
		System.out.println("Status Descending order");
		sort_Status();
	}
	
	/* code for scroll*/
	private void scroll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,500)");
		Thread.sleep(1000);
	}
	
	/* code for scroll*/
	private void scroll1() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,-500)");
		Thread.sleep(1000);
	}
	private void scroll250() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,250)");
		Thread.sleep(1000);
	}
	public void sort_emails() throws InterruptedException{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptDNDUsers_lnkbtnEmail_"+i+"']"));
		for (WebElement e : list) {                        
			System.out.println(e.getText());
		}
		}
}
	public void sort_Date(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptDNDUsers_lblCreatedDate_"+i+"']"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}}
}	
	public void sort_Source(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptDNDUsers_lblInviteThrough_"+i+"']"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}}
}	
	public void sort_Remarks(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptDNDUsers_lblRemarks_"+i+"']"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}}
}	
	public void sort_Status(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptDNDUsers_lblActiveStatus_"+i+"']"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
   }	}
	public void pagination() throws InterruptedException
	{
		for(int i=0;i<4;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']")).click();
		}
		for(int i=0;i<4;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrevious']")).click();
		}
	}
	public void ScrollUp250()
	{
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,250)", "");
	}
	public void TwilioDND_sort() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptTwilioDNDUsers_lnkMobile']")).click();
		System.out.println("Mobile Ascending order");
		Thread.sleep(1000);
		sort_Mob();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptTwilioDNDUsers_lnkMobile']")).click();
		Thread.sleep(1000);
		System.out.println("Mobile Ascending order");
		sort_Mob();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptTwilioDNDUsers_lnkDate']")).click();
		Thread.sleep(1000);
		System.out.println("Date Ascending order");
		sort_Dates();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptTwilioDNDUsers_lnkDate']")).click();
		Thread.sleep(1000);
		System.out.println("Date Descending order");
		sort_Dates();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptTwilioDNDUsers_lnkStatus']")).click();
		Thread.sleep(1000);
		System.out.println("Status Ascending order");
		sort_Status1();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptTwilioDNDUsers_lnkStatus']")).click();
		Thread.sleep(1000);
		System.out.println("Status Descending order");
		sort_Status1();
	}
	public void sort_Mob(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptTwilioDNDUsers_lblTwilioDNDMobile_"+i+"']"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
   }	}
	
	public void sort_Dates(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptTwilioDNDUsers_lblTwilioCreatedDate_"+i+"']"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
   }	}
	
	public void sort_Status1(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptTwilioDNDUsers_lblTwilioStatus_"+i+"']"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
   }	}
	}
