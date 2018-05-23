package AdminLogin_Inmate;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

//import com.framework.screenshot.CaptureScreenshot;













import cucumber.api.DataTable;
import AdminLogin_Inmate.Log;
import PageObjectModel.POM_PubDefender;

public class Notice_Page {
	
	public WebDriver driver;
	
	public Notice_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By menu_notice = By.xpath("//*[@id='rptUser_menuAnchor_15']");
	By btn_add_notice = By.xpath("//*[@id='ContentPlaceHolder1_btnAddNotice']");
	By txt_title = By.id("txtTitle");
	By txt_desc = By.id("ContentPlaceHolder1_Editor1_ctl02_ctl00");
	By txt_start_Date = By.id("ContentPlaceHolder1_txtStartDate");
	By txt_end_date = By.id("ContentPlaceHolder1_txtEndDate");
	By chk_kiosk = By.xpath("//*[@id='ContentPlaceHolder1_cblSubCompany']/tbody/tr[1]/td");
	By btn_save = By.id("btnSubmit");
	By btn_popup = By.id("btnOk");
	By sort_title = By.xpath("//*[@id='grvNotices']/tbody/tr[1]/th[1]/a");
	By sort_start_form = By.xpath("//*[@id='grvNotices']/tbody/tr[1]/th[2]/a");
	By sort_end_by = By.xpath("//*[@id='grvNotices']/tbody/tr[1]/th[3]/a");
	By sort_status = By.xpath("//*[@id='grvNotices']/tbody/tr[1]/th[4]/a");
	By pagination = By.xpath("//*[@id='grvKeywords']/tbody/tr[11]/td/table/tbody/tr/td[2]/span");
	By export_excel = By.id("ContentPlaceHolder1_imbtnExportToExcel");
	By sorting_title = By.id("lnkNotices");
	By sorting_start_from = By.id("lblStartDate");
	By sorting_end_by = By.id("lblEndDate");
	
	public void Add_Notice(){
		try{
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");
		driver.findElement(menu_notice).click();
		Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
		sel.selectByValue("105");
		
		scroll();
		Thread.sleep(2000);
		driver.findElement(sort_title).click();
		Log.info("Title has been sorted as ascending");
		Thread.sleep(2000);
		driver.findElement(sort_title).click();
		Log.info("Title has been sorted as descending");
		
		Thread.sleep(2000);
		driver.findElement(sort_start_form).click();
		Log.info("Start Form has been sorted as ascending");
		Thread.sleep(2000);
		driver.findElement(sort_start_form).click();
		Log.info("Start Form has been sorted as descending");
		
		Thread.sleep(2000);
		driver.findElement(sort_end_by).click();
		Log.info("End By has been sorted as ascending");
		Thread.sleep(2000);
		driver.findElement(sort_end_by).click();
		Log.info("End By has been sorted as descending");		

		Thread.sleep(2000);
		driver.findElement(sort_status).click();
		Log.info("Status has been sorted as ascending");
		Thread.sleep(2000);
		driver.findElement(sort_status).click();
		Log.info("Status has been sorted as descending");
		
		Thread.sleep(2000);
		
		//driver.findElement(pagination).click();
				for(int i=2;i<4;i++)
				{
					Thread.sleep(1000);
					scroll250();
					driver.findElement(By.xpath("//*[@id='grvNotices']/tbody/tr[12]/td/table/tbody/tr/td["+i+"]/a")).click();
					Thread.sleep(500);
					Log.info("Pagination has been clicked");
				}
		
		
		Thread.sleep(2000);
		driver.findElement(export_excel).click();
		Log.info("Export Excel has been clicked");
		
		
		Thread.sleep(2000);
		driver.findElement(btn_add_notice).click();
		Thread.sleep(1000);
		Log.info("Add notice button clicked successfully");
		
		
		
		//Thread.sleep(1000);
		//WebElement iframe = driver.findElement(By.id("ContentPlaceHolder1_Editor1_ctl02_ctl00"));
		//driver.findElement(txt_title)
		//Thread.sleep(1000);
		//driver.switchTo().frame(iframe);
		Thread.sleep(1000);
		//iframe.sendKeys("Test description");
		driver.findElement(txt_title).sendKeys("Test Notice");
		Log.info("Title has been entered successfully");
		Thread.sleep(1000);
		 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,"
	                + driver.findElement(
	                       (txt_desc)).getLocation().y + ")");
	        WebElement descriptionElement = driver.findElement(txt_desc);
	        driver.switchTo().frame(descriptionElement);
	        WebElement editable = driver.switchTo().activeElement();
	        editable.sendKeys("Title Description");
	        driver.switchTo().defaultContent();
		//driver.findElement(txt_desc).sendKeys("Hello");
		Log.info("Description has been entered successfully");
		Thread.sleep(1000);
		
		
		driver.findElement(txt_start_Date).sendKeys("05/05/1995");
		Log.info("Start date entered successfully");
		driver.findElement(txt_end_date).sendKeys("07/10/2017");
		Log.info("End date entered successfully");
		driver.findElement(chk_kiosk).click();
		Log.info("Kiosk chosen successfully");
		driver.findElement(btn_save).click();
		Thread.sleep(2000);
		driver.findElement(btn_popup).click();
		Log.info("Ok Popup clicked successfully");
		
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/* code for scroll*/
	private void scroll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,850)");
		Thread.sleep(1000);
	}
	private void scroll250() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,250)");
		Thread.sleep(1000);
	}
	
	public void sort_notice() throws Exception{
			
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");
		Thread.sleep(1000);
		scroll();
		driver.findElement(menu_notice).click();
		Log.info("Photo menu has been chosen");
		Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
		sel.selectByValue("105");
		Thread.sleep(1000);
		
		driver.findElement(sort_title).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_title();
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(sort_title).click();
		Thread.sleep(1000);
		sort_title();

		driver.findElement(sort_start_form).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_start_from();
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(sorting_start_from).click();
		Thread.sleep(1000);
		sort_start_from();

		driver.findElement(sorting_end_by).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_End_By();
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(sorting_end_by).click();
		Thread.sleep(1000);
		sort_End_By();

		driver.findElement(By.xpath("//*[@id='grvNotices']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("Before Sorting");
		System.out.println("*************");
		Thread.sleep(1000);
		sort_End_By();
		System.out.println("After Sorting");
		System.out.println("*************");
		driver.findElement(By.xpath("//*[@id='grvNotices']/tbody/tr[1]/th[4]/a")).click();
		Thread.sleep(1000);
		sort_End_By();
				
	}
	
	public void sort_title(){
		List<WebElement> li = driver.findElements(sorting_title);
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
	}

	public void sort_start_from(){
		List<WebElement> li = driver.findElements(sorting_start_from);
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
	}

	public void sort_End_By(){
		List<WebElement> li = driver.findElements(sorting_end_by);
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
	}
	public void SortByStatus()
	{
		List<WebElement> li = driver.findElements(By.xpath("imgStatus"));
		for (WebElement e : li) {
			System.out.println(e.getAttribute("title"));
		}
	}
public void Add_Notices(DataTable notices) throws InterruptedException
{
	List<List<String>> noti=notices.raw();
	POM_PubDefender pu=new POM_PubDefender(driver);
	Thread.sleep(2000);
	ScrollUp250();
	Thread.sleep(1500);
	pu.Notices_1.click();
	Thread.sleep(2000);
	Select fsc=new Select(driver.findElement(By.xpath("//*[@id='ddlFacilityCodes']")));
	fsc.selectByVisibleText("2411fac");
	Thread.sleep(1000);
	pu.AddNotices.click();
	Thread.sleep(2000);
	ScrollUp250();
	Thread.sleep(1000);
	pu.SaveBtn.click();
	Thread.sleep(1000);
    pu.txtTitle.sendKeys(noti.get(0).get(1));
	driver.findElement(By.id("ContentPlaceHolder1_Editor1_ctl03_ctl01")).click();
	Thread.sleep(1000);
	pu.Descriptions.sendKeys(noti.get(1).get(1));
	pu.StartDate.sendKeys(noti.get(2).get(1));
	pu.EndDate.sendKeys(noti.get(3).get(1));
	Thread.sleep(2000);
/*	List<WebElement> SelectKiosk=driver.findElements(By.xpath("//label[contains(text(),'A1')]"));
	Thread.sleep(1000);
	for(int i=0;i<1;i++)
	{
		Thread.sleep(1000);
		SelectKiosk=driver.findElements(By.xpath("//label[contains(text(),'A1')]"));
		Thread.sleep(1000);
		SelectKiosk.get(i).click();
	}*/
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_cblSubCompany_0']")).click();
	Thread.sleep(1000);
	List <WebElement> Status=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rblNoticesStatus"));
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
	
public void ScrollUp250()
{
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("window.scrollBy(0,250)", "");
}

}
