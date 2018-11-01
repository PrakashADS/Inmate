package AdminLogin_Inmate;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;




























//import com.framework.screenshot.CaptureScreenshot;
import AdminLogin_Inmate.Log;

public class Request_Page {

	public WebDriver driver;
	By menu_request = By.xpath("//*[@id='rptUser_menuAnchor_11']");
	By btn_search = By.id("btnSearchRequest");
	By lnk_remedy = By.xpath(".//*[@id='ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_3']");
	By btn_submit = By.id("btnSaveRemedyForm");
	By btn_popup = By.id("btnOk");
	By lnk_form = By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0");
	By txt_title = By.id("ContentPlaceHolder1_txtReviewTitle");
	By radio_approve = By.id("ContentPlaceHolder1_grvVisitorDetails_rblApproveDisApprove_0_0_0");
	By chk_comments = By.id("ContentPlaceHolder1_grvVisitorDetails_chkVictim_0");
	By btn_update = By.xpath("//*[@id='btnSubmit']");		
	By radio_approve2 = By.id("ContentPlaceHolder1_grvVisitorDetails_rblApproveDisApprove_1_0_1");
	By btn_Initiate_Msg_Inmate = By.id("btnRaiseMyQuery");
	By btn_create_new = By.id("btnCreateNew");
	By dwn_message_type = By.id("ContentPlaceHolder1_ddlRequestType");
	By dwn_choose_inmate_single = By.id("ContentPlaceHolder1_ddlSingleInmates");
	By dwn_choose_inmate_multi = By.id("ContentPlaceHolder1_cbSelectAll");
	By txt_area_description = By.id("ContentPlaceHolder1_txtForumContent");
	By btn_msg_submit = By.id("btnForumSave");		
	By sort_form = By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkForm']"); 
	By sort_inmate = By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkInmate']");
	By sort_created = By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkCreated']");
	By sort_responded = By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkRespondedOn']"); 
	By sort_msg_initiate = By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkInitiatedBy']");
	By btn_initiate_msg = By.id("btnRaiseMyQuery");
	By radio_pdf = By.id("ContentPlaceHolder1_rdolstReplyMode_1");
	By radio_both = By.id("ContentPlaceHolder1_rdolstReplyMode_2");
	By btn_choosefile = By.id("ContentPlaceHolder1_fluDocument");
	By btn_back = By.id("ContentPlaceHolder1_btnBackToMain");
	
	public Request_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	Logger Log=Logger.getLogger("Login_Page");
	//PropertyConfigurator.configure("log4j.properties");	
	public void request(){
		try{
			
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");		
		scroll();
		Thread.sleep(2000);
		driver.findElement(menu_request).click();
		Log.info("Request form has been chosen");
		Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
		sel.selectByValue("105");	
		Thread.sleep(2000);
	Initiate_msg_to_inmate();
	Request_Sort();
	visitor_form();
	remedy_form();
		//CaptureScreenshot.captureScreenShot1();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	/* code for scroll*/
	private void scroll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,1550)");
		Thread.sleep(1000);
	}
	private void scroll22() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,-150)");
		Thread.sleep(1000);
	}
	private void scroll150() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,150)");
		Thread.sleep(1000);
	}
	public void remedy_form() throws Exception{
		Thread.sleep(2000);
		Select type = new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlRequestTypeSearch")));
		type.selectByValue("2");
		Log.info("Type dropdown has chosen successfully");
		driver.findElement(btn_search).click();
		Log.info("Search button has chosen");
		Thread.sleep(2000);
		/*List<WebElement> myElements = driver.findElements(lnk_form);
		Thread.sleep(1000);			
		myElements.get(0).click();*/
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_4']")).click();
		//driver.findElement(lnk_remedy).click();
		scroll();
		//scroll();
		//scroll();
		Log.info("Admin Remedy form has been chosen");
		driver.findElement(txt_title).sendKeys("Admin form");
		Log.info("Title entered successfully");
		driver.findElement(btn_submit).click();
		Log.info("Submit button clicked successfully");
		Thread.sleep(1500);
		driver.findElement(btn_popup).click();
		Log.info("Ok Popup clicked successfully");
	}
	
	
	public void visitor_form() throws Exception{
		Thread.sleep(2000);
		Select type = new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlRequestTypeSearch")));
		type.selectByValue("1");
		Thread.sleep(1500);
		Select status=new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlRequestStatusSearch")));
		status.selectByValue("3");
		Log.info("Type dropdown has chosen successfully");
		driver.findElement(btn_search).click();
		Log.info("Search button has chosen");
		Thread.sleep(2000);
		List<WebElement> myElements = driver.findElements(lnk_form);
		Thread.sleep(1000);			
		myElements.get(0).click();	
		//driver.findElement(lnk_remedy).click();
		scroll();
		//scroll();
		//scroll();
		
		Log.info("Visitor form has been chosen");
		Thread.sleep(3000);
		driver.findElement(radio_approve).click();
		Log.info("Approve button chosen successfully");
		Thread.sleep(1000);
		//driver.findElement(radio_approve2).click();
		//Log.info("Approve button chosen successfully");
		scroll();
		//List<WebElement> myElement = driver.findElements(chk_comments);
		Thread.sleep(2000);			
		//.get(0).click();	
		//driver.findElement(chk_comments).click();
		//Log.info("Checkbox clicked successfully");
		driver.findElement(btn_update).click();
		Log.info("Submit button clicked successfully");
		Thread.sleep(1000);
		driver.findElement(btn_popup).click();
		Log.info("Ok Popup clicked successfully");
	}
	
	
	public void Initiate_msg_to_inmate() throws Exception{
				
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");	
		Thread.sleep(2000);
		driver.findElement(menu_request).click();
		Log.info("Request form has been chosen");
		Thread.sleep(2000);
		Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
		sel.selectByValue("114");	
				
		Thread.sleep(2000);
		driver.findElement(btn_Initiate_Msg_Inmate).click();
		Thread.sleep(3000);
		Log.info("Initiate msg button clicked");
		driver.findElement(btn_create_new).click();
		Thread.sleep(1000);
		Select s1 = new Select(driver.findElement(dwn_message_type));
		s1.selectByValue("54");
		Log.info("Message type chosen");
		Thread.sleep(1000);
		Select s2 = new Select(driver.findElement(dwn_choose_inmate_single));
		s2.selectByIndex(2);
		Log.info("Single inmate dropdown chosen");
		Thread.sleep(1000);
		driver.findElement(radio_both).click();
		Thread.sleep(2000);
		driver.findElement(btn_choosefile).sendKeys("C:\\Users\\prakashd\\Desktop\\cert.pdf");
		driver.findElement(txt_area_description).sendKeys("Helllooooo");
		Log.info("Description entered");
		Thread.sleep(2000);
		driver.findElement(btn_msg_submit).click();
		Log.info("Submit button clicked");
		Thread.sleep(2000);
		driver.findElement(btn_popup).click();
		Thread.sleep(1500);
		driver.findElement(sort_form).click();
		System.out.println("Form Ascending order");
		Sort_form();
		Thread.sleep(2000);
		driver.findElement(sort_form).click();
		System.out.println("Form Descending order");
		Sort_form();
		Thread.sleep(1000);
		driver.findElement(sort_msg_initiate).click();
		System.out.println("InitBy Ascending order");
		Sort_InitBy();
		Thread.sleep(1000);
		driver.findElement(sort_msg_initiate).click();	
		System.out.println("InitBy Descending order");
		Sort_InitBy();
		Thread.sleep(1000);
		driver.findElement(sort_inmate).click();
		Thread.sleep(1000);
		System.out.println("Inmate Ascending order");
		Sort_InMate();
		Thread.sleep(1000);
		driver.findElement(sort_inmate).click();
		System.out.println("Inmate Descending order");
		Sort_InMate();
		Thread.sleep(1000);
		driver.findElement(sort_created).click();
		System.out.println("Created Ascending order");
		Sort_created();
		driver.findElement(sort_created).click();
		System.out.println("Created Descending order");
		Sort_created();
		Thread.sleep(1000);
		driver.findElement(sort_responded).click();
		System.out.println("Responded Descending order");
		Sort_Responded();
		Thread.sleep(1000);
		driver.findElement(sort_responded).click();
		System.out.println("Responded Descending order");
		Sort_Responded();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkStatusStatus']")).click();
		Thread.sleep(1000);
		System.out.println("Status Ascending order");
		Sort_status();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkStatusStatus']")).click();
		System.out.println("Status Descending order");
		Sort_status();
		Thread.sleep(1000);
		scroll150();
		Thread.sleep(2000);           
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrevious']")).click();
	/*	for(int i=1;i<2;i++)
		{
			Thread.sleep(2000);          
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']")).click();
		}
		for(int i=1;i<2;i++)
		{
			Thread.sleep(2000);          
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrevious']")).click();
		}*/
		Thread.sleep(3000);
		scroll22();
		Thread.sleep(4000);
		driver.findElement(btn_back).click();
	}
	public void Sort_form() throws InterruptedException
	{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
			{                      
			By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lbtnRequestFormTitle_"+i+"']");
			List<WebElement> myElements = driver.findElements(list11);
			for (WebElement e : myElements) {
				Thread.sleep(1000);
				System.out.println(e.getText());
			}}
		}
	public void Sort_InitBy() throws InterruptedException
	{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
			{                      
			By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lblInitiatedBy_"+i+"']");
			List<WebElement> myElements = driver.findElements(list11);
			for (WebElement e : myElements) {
				Thread.sleep(1000);
				System.out.println(e.getText());
			}}
		}
	public void Sort_InMate() throws InterruptedException
	{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
			{                      
			By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lblInmateName_"+i+"']");
			List<WebElement> myElements = driver.findElements(list11);
			for (WebElement e : myElements) {
				Thread.sleep(1000);
				System.out.println(e.getText());
			}}
		}
	public void Sort_created() throws InterruptedException
	{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
			{                      
			By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lblRequestCreateDate_"+i+"']");
			List<WebElement> myElements = driver.findElements(list11);
			for (WebElement e : myElements) {
				Thread.sleep(1000);
				System.out.println(e.getText());
			}}
		}
	public void Sort_Responded() throws InterruptedException
	{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
			{                      
			By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lblRequestReSubmitDate_"+i+"']");
			List<WebElement> myElements = driver.findElements(list11);
			for (WebElement e : myElements) {
				Thread.sleep(1000);
				System.out.println(e.getText());
			}}
		}
	public void Sort_status() throws InterruptedException
	{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
			{                      
			By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_imgStatus_"+i+"']");
			List<WebElement> myElements = driver.findElements(list11);
			for (WebElement e : myElements) {
				Thread.sleep(1000);
				System.out.println(e.getAttribute("title"));
			}}
		}
	public void Request_Sort() throws Exception{
	//	this.driver = new Login_Page().getDriver();			
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");	
		scroll22();
		Thread.sleep(2000);
		driver.findElement(menu_request).click();
		Log.info("Request form has been chosen");
		Thread.sleep(1500);
		Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
		sel.selectByValue("114");	
		System.out.println("*****sorting*****");
		Thread.sleep(4000);
		driver.findElement(sort_form).click();
		System.out.println("Sorting Form Before");
		Thread.sleep(1000);
		sort_Form();
		Thread.sleep(1000);
		driver.findElement(sort_form).click();
		System.out.println("Sorting Form After");
		Thread.sleep(1000);
		sort_Form();
		Log.info("Request Form has been sorted successfully");
		Thread.sleep(2000);
		driver.findElement(sort_inmate).click();
		System.out.println("Sorting Inmate before");
		Thread.sleep(1000);
		sort_Inmates();
		Thread.sleep(1000);
		driver.findElement(sort_inmate).click();
		Thread.sleep(1000);
		System.out.println("Sorting Inmate After");
		sort_Inmates();
		Log.info("Inmate has been sorted successfully");
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkPOD']")).click();
		Thread.sleep(1000);
		System.out.println("Sorting POD before");
		sort_pod();
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkPOD']")).click();
		Thread.sleep(1000);
		System.out.println("Sorting POD After");
		sort_pod();
		Thread.sleep(1000);
		driver.findElement(sort_created).click();
		Thread.sleep(1000);
		System.out.println("Sorting CreatedDate before");
		Sort_created();
		driver.findElement(sort_created).click();
		Thread.sleep(1000);
		System.out.println("Sorting CreatedDate after");
		Sort_created();
		Log.info("Form has been sorted successfully");
		Thread.sleep(1000);
		driver.findElement(sort_responded).click();
		System.out.println("Sorting RespondedOn before");
		Thread.sleep(1000);
		Sort_Responded();
		driver.findElement(sort_responded).click();
		System.out.println("Sorting RespondedOn after");
		Thread.sleep(1000);
		Sort_Responded();
		Log.info("Responded on has been sorted successfully");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnRequestExporttoExcel']")).click();
	}
	
	public void sort_Form()
	{
		for(int i=0;i<10;i++)
		{
		List<WebElement> form=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lbtnRequestFormTitle_"+i+"']"));
		for(WebElement e:form)
		{
			System.out.println(e.getText());
		}
	}}
	public void sort_pod()
	{
		for(int i=0;i<10;i++)
		{
		List<WebElement> form=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_Label1_"+i+"']"));
		for(WebElement e:form)
		{
			System.out.println(e.getText());
		}
	}}
	
	
	public void sort_Inmates()
	{
		for(int i=0;i<10;i++)
		{
		List<WebElement> form=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lblInmateName_"+i+"']"));
		for(WebElement e:form)
		{
			System.out.println(e.getText());
		}
	}}
	
	public void sort_Inmate()
	{
		for(int i=0;i<10;i++)
		{
		List<WebElement> form=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lblInmateName_"+i+"']"));
		for(WebElement e:form)
		{
			System.out.println(e.getText());
		}
	}}
	
}
