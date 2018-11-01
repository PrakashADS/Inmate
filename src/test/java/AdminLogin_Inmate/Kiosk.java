package AdminLogin_Inmate;


import java.util.List;
import java.util.Random;

import org.apache.bcel.generic.LNEG;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;




public class Kiosk {
	
 public WebDriver driver;
 int randomInt;
 int randomInts;
 public Kiosk(WebDriver driver)
 {
	 this.driver=driver;
 }
    By menu_kiosk = By.xpath("//*[@id='rptUser_menuAnchor_8']");
	By btn_addkiosk = By.xpath("//*[@id='ContentPlaceHolder1_btnAddKiosk']");
	By dwn_pod = By.id("ContentPlaceHolder1_ddlPOD");
	By txt_code = By.id("ContentPlaceHolder1_txtKioskCode");
	By txt_computer_name = By.id("ContentPlaceHolder1_txtComputerName");
	By btn_save = By.id("btnSubmit");
	By btn_popup = By.id("btnOk");
	By txt_code_search = By.xpath("//*[@id='ContentPlaceHolder1_txtKioskCodeSearch']");
	By btn_search = By.id("btnSearch");
	By lst_edit = By.xpath("//*[@id='lnkKiosk']");
	By btn_Reset = By.id("ContentPlaceHolder1_btnReset");
	By lnk_code = By.xpath("//*[@id='grvKiosk']/tbody/tr[1]/th[1]/a");
	By lnk_pod = By.xpath("//*[@id='grvKiosk']/tbody/tr[1]/th[3]/a");
	By lnk_computer = By.xpath("//*[@id='grvKiosk']/tbody/tr[1]/th[4]/a");
	By lnk_maintenance = By.xpath("//*[@id='grvKiosk']/tbody/tr[1]/th[5]/a");
	By podname = By.xpath("//*[@id='ContentPlaceHolder1_ddlPODSearch']");
	By Maintenance = By.xpath("//*[@id='ContentPlaceHolder1_ddlNeedMaintenanceSearch']");
	By Status = By.xpath("//*[@id='ContentPlaceHolder1_ddlActiveStatusSearch']");
	By NoofRecrds=By.xpath("//*[@id='ContentPlaceHolder1_ddlRecordsPerPage']");

	
	
	public void Add_kiosk() throws InterruptedException{
	//	try{
			
		//Logger Log=Logger.getLogger("Login_Page");
		//PropertyConfigurator.configure("log4j.properties");		
		Thread.sleep(2000);
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtRemarks']")).sendKeys("Test Remarksss");	
		Thread.sleep(500);
		driver.findElement(btn_save).click();
		Log.info("Save button clicked");
		Thread.sleep(1000);
		String popupMsg=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
		String popup1="Kiosk already exists";
		if(popupMsg.contains(popup1))
				{
			    Thread.sleep(1000);
				driver.findElement(btn_popup).click();
				Thread.sleep(500);
				Random rdd=new Random();
				for(int rdd1=11;rdd1<99;rdd1++)
				{
					randomInts=rdd.nextInt(100);
				}
				Thread.sleep(500);
				driver.findElement(txt_code).sendKeys(""+randomInts);
				Thread.sleep(1000);
				driver.findElement(btn_popup).click();
				Log.info("Ok Popup clicked successfully");
				}
		else{
        Thread.sleep(1000);
		driver.findElement(btn_popup).click();
		Log.info("Ok Popup clicked successfully");
		}
		 
	}
	
	public void Edit_kiosk(){
		try{
				
			Logger Log=Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");		
			Thread.sleep(2000);
	    	driver.findElement(menu_kiosk).click();
			Log.info("Kiosk menu has been clicked");
			Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
			sel.selectByValue("105");
			Thread.sleep(2000);
			Select POD=new Select(driver.findElement(podname));
			POD.selectByVisibleText("A2");
			Thread.sleep(500);
		//	driver.findElement(txt_code_search).sendKeys("A");
			Thread.sleep(500);
			Select mainte=new Select(driver.findElement(Maintenance));
			mainte.selectByVisibleText("No");
			Thread.sleep(500);
			Select status1=new Select(driver.findElement(Status));
			status1.selectByVisibleText("Active");
			Thread.sleep(2000);
			driver.findElement(btn_search).click();
			Log.info("Search button has been clicked");
			Thread.sleep(2000);
		    for(int j=0;j<1;j++)
		    {
		    List<WebElement> myElements = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKiosk_lnkKiosk_"+j+"']"));
		    {
		    	 Thread.sleep(1000);
		    	 myElements = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKiosk_lnkKiosk_"+j+"']"));
		    	 Thread.sleep(1000);
				 myElements.get(j).click();
		    }
		   
			Log.info("Edit has been selected");			
			Random rr=new Random();
			int randomrr = 0;
			for(int x=10;x<100;x++)
			{
				randomrr=rr.nextInt(101);
			}
			Thread.sleep(1000);
		//	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtKioskCode']")).sendKeys(""+randomrr);
		//	Thread.sleep(1000);
		//	System.out.println(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtKioskCode']")).getAttribute("title"));
			driver.findElement(txt_computer_name).clear();		
			driver.findElement(txt_computer_name).sendKeys(""+randomrr);
			Log.info("Computer name has been edited");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtRemarks']")).clear();
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtRemarks']")).sendKeys("Test Remarksss");	
			Thread.sleep(1000);
			driver.findElement(btn_save).click();
			Log.info("Save button clicked");
			Thread.sleep(1000);
			driver.findElement(btn_popup).click();
			Log.info("Ok Popup clicked successfully");
			driver.findElement(btn_Reset).click();
			Log.info("Reset button has been clicked");
		}}  catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void sorting_kiosk() throws InterruptedException{
		System.out.println("Code Ascending order");
		Thread.sleep(1500);
		driver.findElement(By.id("ContentPlaceHolder1_rptKiosk_lnkCode")).click();
		Thread.sleep(1000);
		sort_code();
		System.out.println("Code Descending order");
		driver.findElement(By.id("ContentPlaceHolder1_rptKiosk_lnkCode")).click();
		Thread.sleep(1000);
		sort_code();
		
		System.out.println("Key Ascending order");
		driver.findElement(By.id("ContentPlaceHolder1_rptKiosk_lnkKey")).click();
		Thread.sleep(1000);
		sort_key();
		System.out.println("Key Descending order");
		driver.findElement(By.id("ContentPlaceHolder1_rptKiosk_lnkKey")).click();
		Thread.sleep(1000);
		sort_key();
		
		System.out.println("POD Ascending order");
		driver.findElement(By.id("ContentPlaceHolder1_rptKiosk_lnkPOD")).click();
		Thread.sleep(1000);
		sort_POD();
		System.out.println("POD Descending order");
		driver.findElement(By.id("ContentPlaceHolder1_rptKiosk_lnkPOD")).click();
		Thread.sleep(1000);
		sort_POD();
		
		System.out.println("Computer Ascending order");
		driver.findElement(By.id("ContentPlaceHolder1_rptKiosk_lnkComputer")).click();
		Thread.sleep(1000);
		sort_Computer();
		System.out.println("Computer Descending order");
		driver.findElement(By.id("ContentPlaceHolder1_rptKiosk_lnkComputer")).click();
		Thread.sleep(1000);
		sort_Computer();
		
		System.out.println("Maintenance Ascending order");
		driver.findElement(By.id("ContentPlaceHolder1_rptKiosk_lnkMaintenance")).click();
		Thread.sleep(1000);
		sort_maintenance();
		System.out.println("Maintenance Descending order");
		driver.findElement(By.id("ContentPlaceHolder1_rptKiosk_lnkMaintenance")).click();
		Thread.sleep(1000);
		sort_maintenance();
		
		System.out.println("Status Ascending order");
		driver.findElement(By.id("ContentPlaceHolder1_rptKiosk_lnkStatus")).click();
		Thread.sleep(1000);
		sort_status();
		System.out.println("Status Descending order");
		driver.findElement(By.id("ContentPlaceHolder1_rptKiosk_lnkStatus")).click();
		Thread.sleep(1000);
		sort_status();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imbtnExportToExcel']")).click();
	}
	private void scroll250() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,250)");
	}
	public void pagination() throws InterruptedException
	{
		Thread.sleep(1000);
		boolean pagi=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblOutOfPage']")).isDisplayed();
		if(pagi=true)
		{
			Pagination_Kiosk();
		}
		if(pagi=true)
		{
			Thread.sleep(1000);
			Select RecPerPage10=new Select(driver.findElement((NoofRecrds)));
			RecPerPage10.selectByVisibleText("25");
		}
		/*
		if(pagi=true)
		{
			Thread.sleep(1000);
			Select RecPerPage10=new Select(driver.findElement(NoofRecrds));
			RecPerPage10.selectByVisibleText("50");
			Pagination_Kiosk();
		}
		if(pagi=true)
		{
			Thread.sleep(1000);
			Select RecPerPage10=new Select(driver.findElement(NoofRecrds));
			RecPerPage10.selectByVisibleText("100");
			Pagination_Kiosk();
		}*/
		else{
			System.out.println("No pagination Available.....");
		}
		Thread.sleep(1000);
		int x=1;
		switch(x)
		{
		case 1:
			Thread.sleep(1000);
		}
		for(int i=0;i<1;i++)
		{
		List<WebElement> li=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKiosk_imgEnableDisable_"+i+"']"));
		String OnOff=li.get(i).getAttribute("src");
		String ActiveImg="../Images/kactive.png";
		String InActiveImg="../Images/kinactive.png";
		if(OnOff.contains(ActiveImg))
		{
			System.out.println("Already in Active");
		}
		else{
			li.get(0).click();
			System.out.println("Already in Active");
			Thread.sleep(2000);
			driver.findElement(btn_popup).click();
		}
		System.out.println(OnOff);
		}
	}
	public void sort_code() throws InterruptedException
	{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
		       {
			List<WebElement> list  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKiosk_lnkKiosk_"+i+"']"));
			for (WebElement e : list) {
				System.out.println(e.getText());
			}
		   }
		}
	public void sort_key() throws InterruptedException
	{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
		       {
			List<WebElement> list  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKiosk_lnkKiosk_"+i+"']"));
			for (WebElement e : list) {
				System.out.println(e.getText());
			}
		   }
		}
	public void Pagination_Kiosk() throws InterruptedException
	{
		Boolean paginations=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblOutOfPage']")).isDisplayed();
		if(paginations=true)
		{
		String pageSize=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblOutOfPage']")).getText();
		int pgeSize=Integer.parseInt(pageSize);
		scroll250();
		for(int i=0;i<pgeSize-1;i++)
		{
			Thread.sleep(2500);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']")).click();
		}
	
		for(int i=0;i<pgeSize-1;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrevious']")).click();
		}
	}}
	public void sort_POD() throws InterruptedException
	{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
		       {
			List<WebElement> list  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKiosk_lblHousingArea_"+i+"']"));
			for (WebElement e : list) {
				System.out.println(e.getText());
			}
		   }
		}
	public void sort_Computer() throws InterruptedException
	{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
		       {
			List<WebElement> list  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKiosk_lblComputer_"+i+"']"));
			for (WebElement e : list) {
				System.out.println(e.getText());
			}
		   }
		}
	public void sort_maintenance() throws InterruptedException
	{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
		       {
			List<WebElement> list  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKiosk_lblMaintenance_"+i+"']"));
			for (WebElement e : list) {
				System.out.println(e.getText());
			}
		   }
		}
	public void sort_status() throws InterruptedException
	{
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
		       {
			List<WebElement> list  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptKiosk_imgStatus_"+i+"']"));
			for (WebElement e : list) {
				System.out.println(e.getAttribute("title"));
			}
		   }
		}
	}

