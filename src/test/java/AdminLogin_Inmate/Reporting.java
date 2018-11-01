package AdminLogin_Inmate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import AdminLogin_Inmate.Log;

public class Reporting {

	public  WebDriver driver;
	
	public Reporting(WebDriver driver)
	{
		this.driver=driver;
	}
	By menu_reporting = By.id("rptUser_menuAnchor_16");
	By dwn_type = By.id("ContentPlaceHolder1_ddlRequestTypeSearch");
	By txt_start_date = By.id("ContentPlaceHolder1_txtRequestCreatedStartDateSearch");
	By txt_end_date = By.id("ContentPlaceHolder1_txtRequestCreatedEndDateSearch");
	By btn_search = By.id("btnSearchRequest");
	By export_excel = By.id("ContentPlaceHolder1_imgbtnOverAllExportToExcel");
	By btn_reset = By.id("ContentPlaceHolder1_btnSearchCancel");
	By dwn_status = By.id("ContentPlaceHolder1_ddlRequestStatusSearch");
	By lnk_form = By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[1]/a");
	By lnk_request_cnt = By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[2]/a");
	By lnk_respond_time = By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[3]/a");
	By lnk_Avg_respond = By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[4]/a");
	By lnk_Req_cnt_percent = By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[5]/a");
	By lnk_respond_time_percent = By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[6]/a");
	By lnk_avg_respond_percent = By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[6]/a");

	public void report(){
		try{
	
			Logger Log=Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
			Thread.sleep(1000);
			scroll250();
            Thread.sleep(1000);
			driver.findElement(menu_reporting).click();
			Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
			sel.selectByValue("114");	
			Thread.sleep(1000);


			String type ="Request";
			switch (type) {
			case "visitor":
				search_visitor_form();	
				Log.info("Visitor Form has been chosen");	
				staus_both();
				break;
			case "Admin":
				search_admin_form();
				Log.info("Administrative Remedy Form has been chosen");		
				staus_Request_close();
				break;
			case "Request":
				search_request_form();
				Log.info("Request Form Type has been chosen");	
				staus_Request_open();
				break;
			default:
				break;
			}


			driver.findElement(txt_start_date).sendKeys("01/02/2017");
			Log.info("Start date entered");
		//	driver.findElement(txt_end_date).sendKeys("09/25/2017");
			Log.info("Start date entered");
			Thread.sleep(1000);
			Select status=new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlRequestStatusSearch")));
			status.selectByValue("2");
			Thread.sleep(1000);
			driver.findElement(btn_search).click();
			Log.info("Search button has clicked");
			/*WebElement element = driver.findElement(export_excel);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", element);		
			Log.info("Export to excel clicked successfully");*/
			Thread.sleep(2000);
			
			driver.findElement(By.id("ContentPlaceHolder1_imgbtnOverAllExportToExcel")).click();
			Log.info("Export to excel clicked successfully");
			Thread.sleep(1000);
		//	sorting_form();
			Thread.sleep(1500);
//	driver.findElement(btn_reset).click();
   Log.info("Reset button clicked successfully");
   
   List<WebElement> rep=driver.findElements(By.className("listoneGrid"));
   List<WebElement> rep1=driver.findElements(By.className("listoneGrid"));
   for(WebElement e:rep)
   {
	   System.out.println(e.getText());
	   System.out.println(rep.size());
   }
   for(WebElement e2:rep1)
   {
	   System.out.println(e2.getText());
	   System.out.println(rep1.size());
   }
   int Total=rep.size()+rep1.size();
  String NoOfRecords=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblORequestTotalRecords']")).getText();
  System.out.println(Total);  
int Count = Integer.parseInt(NoOfRecords);
if(Total==Count)
    {
	System.out.println("Sorting count is success");
   }
else{
	System.out.println("Sorting count is wrong"); 
    }
			Thread.sleep(1000);
			Sorting_Reporting();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void search_request_form(){
		Select select = new Select(driver.findElement(dwn_type));
		select.selectByValue("3");
	}

	public void search_admin_form(){
		Select select = new Select(driver.findElement(dwn_type));
		select.selectByValue("2");

	}

	public void search_visitor_form(){
		Select select = new Select(driver.findElement(dwn_type));
		select.selectByValue("1");

	}

	public void staus_both(){
		Select select = new Select(driver.findElement(dwn_status));
		select.selectByValue("2");
	}

	public void staus_Request_open(){
		Select select = new Select(driver.findElement(dwn_status));
		select.selectByValue("1");
	}

	public void staus_Request_close(){
		Select select = new Select(driver.findElement(dwn_status));
		select.selectByValue("1");
	}

	public void sorting_form() throws Exception{
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");
		scroll();
		Thread.sleep(3000);
		driver.findElement(lnk_form).click();
		Log.info("Form sorted as Ascending");
		form_sort();
		Thread.sleep(3000);
		driver.findElement(lnk_form).click();		
		Log.info("Form sorted as Decending");
		form_sort();
		Thread.sleep(3000);
		driver.findElement(lnk_request_cnt).click();
		Log.info("Request Count sorted as Ascending");
		Thread.sleep(3000);
		driver.findElement(lnk_request_cnt).click();		
		Log.info("Request Count sorted as Descending");
		
		Thread.sleep(3000);
		driver.findElement(lnk_respond_time).click();
		Log.info("Respond time sorted as Ascending");
		Thread.sleep(3000);
		driver.findElement(lnk_respond_time).click();		
		Log.info("Respond time sorted as Descending");
		
		Thread.sleep(3000);
		driver.findElement(lnk_Avg_respond).click();
		Log.info("Average Respond time sorted as Ascending");
		Thread.sleep(3000);
		driver.findElement(lnk_Avg_respond).click();		
		Log.info("Average Respond time sorted as Descending");
		
		Thread.sleep(3000);
		driver.findElement(lnk_Req_cnt_percent).click();
		Log.info("Avg Request Count sorted as Ascending");
		Thread.sleep(3000);
		driver.findElement(lnk_respond_time).click();		
		Log.info("Avg Request Count sorted as Descending");
		
		Thread.sleep(3000);
		driver.findElement(lnk_respond_time_percent).click();
		Log.info("Avg Respond sorted as Ascending");
		Thread.sleep(3000);
		driver.findElement(lnk_respond_time_percent).click();		
		Log.info("Avg Respond Count sorted as Descending");
		
		Thread.sleep(3000);
		driver.findElement(lnk_avg_respond_percent).click();
		Log.info("Avg Respond Percent sorted as Ascending");
		Thread.sleep(3000);
		driver.findElement(lnk_avg_respond_percent).click();		
		Log.info("Avg Respond Percent sorted as Descending");
		
	}

	/* code for scroll*/
	private void scroll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,650)");
		Thread.sleep(1000);

	}
	private void scroll250() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,250)");
	}
	public void form_sort()
	{
		
		List<WebElement> form1=driver.findElements(By.className("listoneGrid"));
		for(WebElement e:form1)
		{
			System.out.println(e.getText());
		}
		
	}
	public void Sorting_Reporting() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[1]/a")).click();
		Thread.sleep(1000);	
		System.out.println("\nForm Sorting Before:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[1]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nForm Sorting After:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[2]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nReq Count Sorting Before:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[2]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nReq Count Sorting After:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[3]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nResp Time Sorting Before:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[3]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nResp Time Sorting After:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[4]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nAvg Resp Time Sorting before:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[4]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nAvg Resp Time Sorting After:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[5]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nReq count Sorting Before:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[5]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nReq count Sorting After:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[6]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nResp Time percent Sorting before:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[6]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nResp Time percent Sorting After:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[7]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nAvg Resp percent Sorting Before:");
		form_sort();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[7]/a")).click();
		Thread.sleep(1000);
		System.out.println("\nAvg Resp percent Sorting After:");
		form_sort();
		
	}
	
	
}


