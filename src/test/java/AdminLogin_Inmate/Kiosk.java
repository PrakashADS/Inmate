package AdminLogin_Inmate;

import java.awt.List;
import java.util.Random;

import org.apache.bcel.generic.LNEG;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;




public class Kiosk {
	
 public WebDriver driver;
 int randomInt;
 public Kiosk(WebDriver driver)
 {
	 this.driver=driver;
 }
    By menu_kiosk = By.id("rptUser_menuAnchor_8");
	By btn_addkiosk = By.xpath("//*[@id='ContentPlaceHolder1_btnAddKiosk']");
	By dwn_pod = By.id("ContentPlaceHolder1_ddlPOD");
	By txt_code = By.id("ContentPlaceHolder1_txtKioskCode");
	By txt_computer_name = By.id("ContentPlaceHolder1_txtComputerName");
	By btn_save = By.id("btnSubmit");
	By btn_popup = By.id("btnOk");
	By txt_code_search = By.id("ContentPlaceHolder1_txtKioskCodeSearch");
	By btn_search = By.id("btnSearch");
	By lst_edit = By.xpath("//*[@id='lnkKiosk']");
	By btn_Reset = By.id("ContentPlaceHolder1_btnReset");
	By lnk_code = By.xpath("//*[@id='grvKiosk']/tbody/tr[1]/th[1]/a");
	By lnk_pod = By.xpath("//*[@id='grvKiosk']/tbody/tr[1]/th[3]/a");
	By lnk_computer = By.xpath("//*[@id='grvKiosk']/tbody/tr[1]/th[4]/a");
	By lnk_maintenance = By.xpath("//*[@id='grvKiosk']/tbody/tr[1]/th[5]/a");
	
 
	public void Add_kiosk() throws InterruptedException{
	//	try{
			
		//Logger Log=Logger.getLogger("Login_Page");
		//PropertyConfigurator.configure("log4j.properties");		
		Thread.sleep(1500);
		driver.findElement(menu_kiosk).click();
		Log.info("Kiosk menu has been clicked");
		Thread.sleep(1500);
		driver.findElement(btn_addkiosk).click();
		Log.info("Add kiosk button is clicked");
		Thread.sleep(3000);
		
		Select pod = new Select(driver.findElement(By.name("ctl00$ddlFacilityCodes")));
		pod.selectByValue("114");
		Log.info("Pod has been selected");
		Thread.sleep(2000);
		driver.findElement(btn_addkiosk).click();
		Thread.sleep(1000);
		Select pod1 = new Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlPOD")));
		pod1.selectByIndex(1);
		Random rd1 = new Random();
		for (int x = 20; x <= 200; ++x) {
			 randomInt = rd1.nextInt(201);		
		}
		Thread.sleep(1000);
		driver.findElement(txt_code).sendKeys("F22"+randomInt);
		Log.info("Code has been entered");
		driver.findElement(txt_computer_name).sendKeys("F0001");
		Log.info("Computer name has been entered");
		driver.findElement(btn_save).click();
		Log.info("Save button clicked");
		Thread.sleep(1000);
		driver.findElement(btn_popup).click();
		Log.info("Ok Popup clicked successfully");
		
		 
	}
	
	public void Edit_kiosk(){
		try{
			this.driver = new Login_Page().getDriver();		
			Logger Log=Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");		
			driver.findElement(menu_kiosk).click();
			Log.info("Kiosk menu has been clicked");
			Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
			sel.selectByValue("105");
			Thread.sleep(2000);
			driver.findElement(txt_code_search).sendKeys("A1");
			Log.info("Code has been entered");
			Thread.sleep(2000);
			driver.findElement(btn_search).click();
			Log.info("Search button has been clicked");
			Thread.sleep(2000);
			java.util.List<WebElement> myElements = driver.findElements(lst_edit);
			myElements.get(0).click();
			Log.info("Edit has been selected");
			Thread.sleep(2000);
			driver.findElement(txt_computer_name).clear();		
			Thread.sleep(2000);
			driver.findElement(txt_computer_name).sendKeys("Test");
			Log.info("Computer name has been edited");
			Thread.sleep(2000);
			driver.findElement(btn_save).click();
			Log.info("Save button clicked");
			Thread.sleep(1000);
			driver.findElement(btn_popup).click();
			Log.info("Ok Popup clicked successfully");
			driver.findElement(btn_Reset).click();
			Log.info("Reset button has been clicked");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void sort_kiosk(){
		
	}
}