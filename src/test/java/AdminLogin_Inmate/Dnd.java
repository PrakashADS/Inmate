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
	By sort_email = By.xpath("//a[contains(text(),'Email/Mobile')]");
	By sort_mobile = By.xpath("//a[contains(text(),'Date')]");
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
		
		for(int j=2;j<=4;j++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='grvDNDUsers']/tbody/tr[12]/td/table/tbody/tr/td["+j+"]/a")).click();
		}
	
		Thread.sleep(2000);
		scroll250();
		Thread.sleep(1500);
		driver.findElement(By.id("ContentPlaceHolder1_imbtnTwilioExportToExcel")).click();
		Thread.sleep(1500);
		scroll1();
		Thread.sleep(1500);
		driver.findElement(btn_twilio).click();
		Thread.sleep(2500);
		driver.findElement(btn_ok).click();
		Thread.sleep(1000);
		char dnd = 'B';
		switch (dnd) {
		case 'A':
			driver.findElement(btn_dnd).click();
			Add_DND_Mobilenum();
			sorting();
			break;
		case 'B':
			driver.findElement(btn_dnd).click();
			Thread.sleep(1000);
			driver.findElement(radio_btn_email).click();
			Thread.sleep(1000);
			Add_DND_Email();
			Thread.sleep(1500);
			sorting();
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
		Thread.sleep(1000);
		sort_email();
		Thread.sleep(1000);
		driver.findElement(sort_email).click();
		Thread.sleep(1000);
		sort_email();
		Thread.sleep(1000);
		driver.findElement(sort_mobile).click();
		Thread.sleep(1000);
		sort_Date();
		Thread.sleep(1000);
		driver.findElement(sort_mobile).click();
		Thread.sleep(1000);
		sort_Date();
		Thread.sleep(1000);
		driver.findElement(sort_source).click();
		Thread.sleep(1000);
		sort_Source();
		Thread.sleep(1000);
		driver.findElement(sort_source).click();
		Thread.sleep(1000);
		sort_Source();
		Thread.sleep(1000);
		driver.findElement(sort_Remarks).click();
		Thread.sleep(1000);
		sort_Remarks();
		Thread.sleep(1000);
		driver.findElement(sort_Remarks).click();
		Thread.sleep(1000);
		sort_Remarks();
		Thread.sleep(1000);
		driver.findElement(sort_Status).click();
		Thread.sleep(1000);
		sort_Status();
		Thread.sleep(1000);
		driver.findElement(sort_Status).click();
		Thread.sleep(1000);
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
	public void sort_email(){
		List<WebElement> list = driver.findElements(By.id("lnkbtnEmail"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
}
	public void sort_Date(){
		List<WebElement> list = driver.findElements(By.id("lblCreatedDate"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
}	
	public void sort_Source(){
		List<WebElement> list = driver.findElements(By.id("lblInviteThrough"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
}	
	public void sort_Remarks(){
		List<WebElement> list = driver.findElements(By.id("lblRemarks"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
}	
	public void sort_Status(){
		List<WebElement> list = driver.findElements(By.id("lblActiveStatus"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
}	
	
	}
