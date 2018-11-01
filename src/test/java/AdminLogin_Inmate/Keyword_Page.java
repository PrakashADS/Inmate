package AdminLogin_Inmate;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import utility.Log;

public class Keyword_Page {
	public WebDriver driver;
	private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	private static final int RANDOM_STRING_LENGTH = 4;
	public Keyword_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	By menu_keyword = By.xpath("//*[@id='rptUser_menuAnchor_14']");
	By btn_add_keyword = By.id("ContentPlaceHolder1_bnAddKeyword");
	By txt_keyword = By.id("ContentPlaceHolder1_txtKeyword");
	By btn_Submit = By.id("btnSubmit");
	By btn_popup = By.id("btnOk");
	By dwn_inmate_action = By.id("ContentPlaceHolder1_ddlInmateActionSearch");
	By list_edit = By.id("lnkMessageKeywordID");
	By btn_search = By.id("btnSearch");
	By export_excel = By.id("ContentPlaceHolder1_imbtnExportToExcel");
	By pagination = By.xpath("//*[@id='grvKeywords']/tbody/tr[12]/td/table/tbody/tr/td[2]/a");	
	By btn_reset = By.id("ContentPlaceHolder1_btnReset");
	By lnk_keyword = By.xpath("//*[@id='ContentPlaceHolder1_rptKeywords_lnkKeyword']");	
	By lnk_web_user_action = By.xpath("//*[@id='ContentPlaceHolder1_rptKeywords_lnkWebUserAction']");
	By lnk_inmate_action = By.xpath("//*[@id='ContentPlaceHolder1_rptKeywords_lnkInmateAction']");
	By lnk_filter_type = By.xpath("//*[@id='ContentPlaceHolder1_rptKeywords_lnkFilterType']");
	By sort_status = By.xpath("//*[@id='ContentPlaceHolder1_rptKeywords_lnkStatus']");
	By sorting_keyword = By.id("lnkMessageKeywordID");
	By sorting_webuseraction = By.id("lblWebUserAction");
	By sorting_inmate_action = By.id("lblInmateAction");
	By sorting_filter_type = By.id("lblKeywordFilterType");
	//*[@id="grvKeywords"]/tbody/tr[1]/th[1]/a
	
	public void keyword_add(){
		try{
		
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");
		
		Thread.sleep(3000);
		driver.findElement(menu_keyword).click();
		Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
		sel.selectByValue("105");
		Thread.sleep(2000);		
		driver.findElement(btn_add_keyword).click();
		Log.info("Add button clicked successfully");
		Thread.sleep(1500);
		driver.findElement(txt_keyword).sendKeys("Test"+ getRandomNumber());
		Log.info("Keyword entered successfully");
		Thread.sleep(2000);
		Select s1 = new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlWebUserAction']")));
		s1.selectByIndex(1);
		Log.info("Web user action chosen");
		Thread.sleep(2000);
		Select s2 = new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlInmateAction']")));
		s2.selectByIndex(1);
		Thread.sleep(2000);
		Select s3 = new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlFilterType']")));
		s3.selectByIndex(1);
		Thread.sleep(2000);
	//	driver.findElement(btn_Submit).click();
		Thread.sleep(2000);
		driver.findElement(btn_popup).click();
		Log.info("Ok Popup clicked successfully");
		//webdriverWait(pagination, 50);
		//scroll();
		WebElement element = driver.findElement(pagination);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
		//driver.findElement(pagination).click();
		Log.info("Pagination has been clicked");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void keyword_edit(){
		try{
			
			Logger Log=Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
			
			Thread.sleep(3000);
			driver.findElement(menu_keyword).click();
			Thread.sleep(1500);
			Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
			sel.selectByValue("105");
			Thread.sleep(1000);
			Select srchinmate = new Select(driver.findElement(dwn_inmate_action));			
			srchinmate.selectByValue("1");
			Log.info("Inmate Action Dropdown has been chosen");			
			driver.findElement(btn_search).click();
			int i=0;
			
			Thread.sleep(1000);
			List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKeywords_lnkMessageKeywordID_0']"));
			for(int j=0;i<1;i++)
			{
			Thread.sleep(1000);
			list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKeywords_lnkMessageKeywordID_"+i+"']"));
			Thread.sleep(1000);
			list.get(j).click();			
			}
			Log.info("Edit inmate has been chosen");
			Thread.sleep(1000);
			driver.findElement(txt_keyword).clear();
			driver.findElement(txt_keyword).sendKeys("Inmate"+RandomNumberChars( ));
			Log.info("Keyword has been edited");
			Thread.sleep(1000);
			driver.findElement(btn_Submit).click();		
			Log.info("Submit clicked successfully");
			driver.findElement(btn_popup).click();
			Log.info("Ok Popup clicked successfully");
			//driver.findElement(export_excel).click();
			Log.info("Export has been clicked");
			driver.findElement(btn_reset).click();
			Log.info("Reset button has been clicked");
			Thread.sleep(1000);
			driver.findElement(lnk_keyword).click();
			Log.info("Keyword sorted in ascending");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/* code for scroll*/
	private void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
	}

	/* code for explicit wait*/
	public void webdriverWait(By locator, long sec){
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void keyword_sorting() throws Exception{
		
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");		
		Thread.sleep(3000);
		driver.findElement(menu_keyword).click();
		Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
		sel.selectByValue("105");
		Thread.sleep(2000);
		driver.findElement(lnk_keyword).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_keyword();
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(lnk_keyword).click();
		Thread.sleep(1000);
		sort_keyword();

		driver.findElement(lnk_web_user_action).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_web_user_action();
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(lnk_web_user_action).click();
		Thread.sleep(1000);
		sort_web_user_action();

		driver.findElement(lnk_inmate_action).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_inmate_to();
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(lnk_inmate_action).click();
		Thread.sleep(1000);
		sort_inmate_to();

		driver.findElement(lnk_filter_type).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_filter_type();
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(lnk_filter_type).click();
		Thread.sleep(1000);
		sort_filter_type();
		

		driver.findElement(sort_status).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_status();
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(sort_status).click();
		Thread.sleep(1000);
		sort_status();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imbtnExportToExcel']")).click();
	}
	
	public void sort_keyword(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKeywords_lnkMessageKeywordID_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
		}
	}

	public void sort_web_user_action(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKeywords_lblWebUserAction_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
		}
	}

	public void sort_inmate_to(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKeywords_lblInmateAction_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
		}
	}
	public void sort_status(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKeywords_imgStatus_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getAttribute("title"));
		}
		}
	}
	public void sort_filter_type(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKeywords_lblKeywordFilterType_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
		}
	}
	public void Scroll250()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}
	public void Pagination() throws InterruptedException
	{  
		Next();
		Prev();
	}
	public void Next() throws InterruptedException
	{
		List<WebElement> pagination =driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']")); 
		if(pagination.size()>0){ 
		System.out.println("pagination exists"); 
		for(int i=0; i<2; i++){ 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']")).click();	
		} 
		} else { 
		System.out.println("pagination not exists"); 
		}
	}
	public void Prev() throws InterruptedException
	{List<WebElement> pagination =driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrevious']")); 
	if(pagination.size()>0){ 
	System.out.println("pagination exists"); 
	for(int i=0; i<2; i++){ 
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrevious']")).click();	
	} 
	} else { 
	System.out.println("pagination not exists"); 
	}	
	}
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
