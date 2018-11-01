package AdminLogin_Inmate;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

//import com.framework.screenshot.CaptureScreenshot;












































import AdminLogin_Inmate.Log;

public class Pod {
	public WebDriver driver;
 int randomInt;
 int randomNums;
 int randomInt1;
	By menu_pod = By.xpath("//*[@id='rptUser_menuAnchor_7']");
	By btn_add_pod = By.id("ContentPlaceHolder1_btnAddPOD");
	By txt_code = By.id("ContentPlaceHolder1_txtPodCode");
	By txt_name = By.id("ContentPlaceHolder1_txtPodName");
	By chk_access_permission = By.xpath(".//*[@id='chkSelectDeselectAll']");
	By btn_save = By.xpath("//*[@id='btnSubmit']");
	By btn_popup = By.id("btnOk");
	By txt_code_search = By.id("ContentPlaceHolder1_txtPODCodeSearch");
	By btn_search = By.id("btnSearch");
	By lnk_list = By.xpath("//*[@id='lnkPod']");
	By lnk_list1 = By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lnkPod_0']");
	By lnk_code = By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lnkCode']");
	By lnk_name = By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lnkName']");
	By lnk_inmates = By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lnkInmates']");
	By lnk_kiosk = By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lnkKiosks']");
	By lnk_shared = By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lnkShared']");
	By TotalRecords = By.xpath("//*[@id='ContentPlaceHolder1_ddlInmateLoginInfoTotalRecords']");
	
	By sort_code = By.id("lnkPod");
	By sort_name = By.id("lblPodName");
	By sort_inmates = By.id("lblnmates");
	By sort_kiosk = By.id("lblKiosks");
	By sort_shared = By.id("lblSharedPod");
	By btn_update = By.xpath("//*[@id='btnSubmit']");
	By lnk_kiosk_view = By.id("lnkKioskView");
	By kiosk_view_pagination = By.xpath("//*[@id='grdvwInmateLoginInfo']/tbody/tr[12]/td/table/tbody/tr/td[3]/a");
	By exportexcel = By.id("ContentPlaceHolder1_imgbtnInmateLoginInfoExportToExcel");
	By search_lastname = By.xpath("//*[@id='ddlLastNameSearch_chosen']/a/span");
	By enter_name = By.xpath("//*[@id='ddlLastNameSearch_chosen']/div/div/input");
	By btn_back = By.id("ContentPlaceHolder1_btnBack");
	
	public Pod(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Add_Pod() throws Exception{
		try {
						
			Logger Log=Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
			Thread.sleep(3000);
			driver.findElement(menu_pod).click();
			Thread.sleep(1500);
			Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
			sel.selectByValue("105");
			Thread.sleep(3000);			
			driver.findElement(btn_add_pod).click();
			Log.info("Add Pod has been chosen");
			Thread.sleep(1000);
			Random rd1 = new Random();
			for (int x = 20; x <= 200; ++x) {
				 randomInt1 = rd1.nextInt(201);		
			}
			Thread.sleep(2000);
			driver.findElement(txt_code).sendKeys("Z1"+randomInt1);
			Log.info("Pod code has been entered");
			Thread.sleep(1000);
			driver.findElement(txt_name).sendKeys("Z1test"+randomInt1);
			Log.info("Pod name has been entered");
			Thread.sleep(1000);
			
			boolean SharedChk=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_chkShared']")).isSelected();
			if(SharedChk==true)
			{
				System.out.println("Shared Checkbox has Already Selected");
			}
			else{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_chkShared']")).click();
			}
			int s=1;
			List<WebElement> Status=driver.findElements(By.xpath("//*[@type='radio']"));
			for(int i=0;i<Status.size();i++)
			switch(s)
			{
			case 1:
				Status.get(0).click();
				break;
			case 2:
				Status.get(1).click();
				break;	 
			}
		    int t=2;
		    switch(t)
		    {
		    case 1:
		         Thread.sleep(1000);
		    	 driver.findElement(By.xpath("//*[@id='chkSelectDeselectAll']")).click();
		    	 break;
		    case 2:
		    	List<WebElement> AccessPermission=driver.findElements(By.xpath("//*[@type='checkbox']"));
		    	for(int i=2;i<AccessPermission.size();i++)
		    	     {
		    			 AccessPermission=driver.findElements(By.xpath("//*[@type='checkbox']"));
		    			 AccessPermission.get(i).click();
		    		 }
		    	break;
		    	}
		//	driver.findElement(chk_access_permission).click();
			Log.info("Permission Checkbox has been selected");
			Thread.sleep(1000);
			scroll200();
			Thread.sleep(1500);
		//	driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();
			Log.info("Save button clicked successfully");
			Thread.sleep(1500);
		//	driver.findElement(btn_popup).click();
			Log.info("Ok Popup clicked successfully");
			//CaptureScreenshot.captureScreenShot1();	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Edit_Pod() throws Exception{
		try {
						
			Logger Log=Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
			/*driver.findElement(menu_pod).click();
			Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
			sel.selectByValue("105");*/
			Thread.sleep(3000);
			driver.findElement(menu_pod).click();
			Thread.sleep(1500);
			Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
			sel.selectByValue("105");
			Thread.sleep(2000);
			driver.findElement(txt_code_search).sendKeys("A");
			Log.info("Search button has been clicked");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id='btnSearch']")).click();
			Thread.sleep(1000);
			
		     for(int i=0;i<1;i++)
		     {
		    Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lnkPod_"+i+"']")).click();
			Log.info("Edit option chosen");
		     }
			Thread.sleep(1000);
			driver.findElement(txt_code).clear();
			Thread.sleep(1000);	
			/* scroll();
			Thread.sleep(2000);	
			driver.findElement(btn_update).click();*/
			
			Random rd1 = new Random();
			for (int x = 300; x <= 3000; ++x) {
				 randomInt = rd1.nextInt(3001);		
			}
			Thread.sleep(1000);
			driver.findElement(txt_code).sendKeys("A112"+randomInt); 
			Log.info("Edit Pod code");
			Thread.sleep(1000);
			Random rr= new Random();
			for(int y=100;y<1000;y++)
			{
				 randomNums = rr.nextInt(1001);
			}
			Thread.sleep(1000);          
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPodName']")).clear();
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPodName']")).sendKeys("PodName123"+randomNums);
			Thread.sleep(1000);	
			if(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_chkShared']")).isSelected())
			{
				System.out.println("Shared Already Selected");
			}
			else{
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_chkShared']")).click();
			}
			Thread.sleep(1000);
			int u=1;
			List<WebElement> Status=driver.findElements(By.xpath("//*[@type='radio']"));
			for(int i=0;i<Status.size();i++)
			switch(u)
			{
			case 1:
				Status.get(0).click();
				break;
			case 2:
				Status.get(1).click();
				break;	 
			}
			Thread.sleep(1000);
			scroll200();
			Thread.sleep(1000);	
			driver.findElement(btn_update).click();
			Thread.sleep(2000);
			driver.findElement(btn_popup).click();
			Log.info("Ok Popup clicked successfully");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void sort_pod() throws Exception{
				
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");
		driver.findElement(menu_pod).click();
		Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
		sel.selectByValue("105");
		Thread.sleep(2000);
		System.out.println("Before Sorting");
		driver.findElement(lnk_code).click();
		Thread.sleep(1000);
		sorting_code();
		System.out.println("After Sorting");
		driver.findElement(lnk_code).click();
		Thread.sleep(1000);
		sorting_code();

		System.out.println("Before Sorting");
		driver.findElement(lnk_name).click();
		Thread.sleep(1000);
		sort_name();
		System.out.println("After Sorting");
		driver.findElement(lnk_name).click();
		Thread.sleep(1000);
		sort_name();

		System.out.println("Before Sorting");
		driver.findElement(lnk_inmates).click();
		Thread.sleep(1000);
		sort_inmates();
		System.out.println("After Sorting");
		driver.findElement(lnk_inmates).click();
		Thread.sleep(1000);
		sort_inmates();

		System.out.println("Before Sorting");
		driver.findElement(lnk_kiosk).click();
		Thread.sleep(1000);
		sort_kiosk();
		System.out.println("After Sorting");
		driver.findElement(lnk_kiosk).click();
		Thread.sleep(1000);
		sort_kiosk();

		System.out.println("Before Sorting");
		driver.findElement(lnk_shared).click();
		Thread.sleep(1000);
		sort_shared();
		System.out.println("After Sorting");
		driver.findElement(lnk_shared).click();
		Thread.sleep(2000);
		sort_shared();
		
		System.out.println("Before Sorting");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lnkStatus']")).click();
		Thread.sleep(1000);
		sort_status();
		System.out.println("After Sorting");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lnkStatus']")).click();
		Thread.sleep(2000);
		sort_status();
		
		Thread.sleep(2000);
		scroll200();
		Thread.sleep(1000);
		for(int i=1;i<4;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']")).click();
		}
		Thread.sleep(1000);
		for(int i=1;i<4;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrevious']")).click();
		}
		Thread.sleep(1500);
		scrollup250();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imbtnExportToExcel']")).click();
		Thread.sleep(1500);
        int j=1;
 		
 		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lnkKioskView_"+j+"']")).click();
 		
		 Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnInmateLoginInfoExportToExcel']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkDate']")).click();
         System.out.println("Before sorting date:");
         SortDate();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkDate']")).click();
         System.out.println("After sorting date:");
         SortDate();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkInmateId']")).click();
         System.out.println("Before sorting InmateId:");
         SortInmateId();
         driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkInmateId']")).click();
         System.out.println("After sorting InmateId:");
         SortInmateId();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkPODName']")).click();
         System.out.println("Before sorting POD Name:");
         SortPodName();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkPODName']")).click();
         System.out.println("After sorting POD Name:");
         SortPodName();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkKiosksCode']")).click();
         System.out.println("Before sorting KioskCode:");
         SortKiosksCode();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkKiosksCode']")).click();
         System.out.println("After sorting KioskCode:");
         SortKiosksCode();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkLoginStatus']")).click();
         System.out.println("Before sorting LoginStatus:");
         SortLoginStatus();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkLoginStatus']")).click();
         System.out.println("After sorting LoginStatus:");
         SortLoginStatus();
         Thread.sleep(2000);
         scroll200();
         Thread.sleep(1500);
         Select TotalRecord=new Select(driver.findElement(TotalRecords));
         TotalRecord.selectByVisibleText("25");
         Thread.sleep(1000);
         PrevNext();
        
 		/*Thread.sleep(1500);
 		List<WebElement> LogPod=driver.findElements(By.xpath("//*[@title='View Log']"));
 		for(int i=0;i<1;i++)
 		{
 			Thread.sleep(1000);
 			LogPod=driver.findElements(By.xpath("//*[@title='View Log']"));
 			Thread.sleep(1000);
 			LogPod.get(0).click();
 			Thread.sleep(1000);
 		}
 		int i=1;
 		
 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lnkKioskView_"+i+"']")).click();
 		
 		Thread.sleep(2500);
 		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkDate']")).click();
 		System.out.println("Ascending order Date:");
 		sort_Date();
 		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkDate']")).click();
 		System.out.println("Descending order Date:");
 		sort_Date();
 		
 		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkInmateId']")).click();
 		System.out.println("Ascending order Inmate Id:");
 		sort_InmateId();
 		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkInmateId']")).click();
 		System.out.println("Descending order Inmate Id:");
 		sort_InmateId();
 		
 		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkPODName']")).click();
 		System.out.println("Ascending order POD Name:");
 		sort_podname();
 		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkPODName']")).click();
 		System.out.println("Descending order POD Name:");
 		sort_podname();
 		
 		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkKiosksCode']")).click();
 		System.out.println("Ascending order Kiosk Code:");
 		sort_kioskcode();
 		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkKiosksCode']")).click();
 		System.out.println("Descending order Kiosk Code:");
 		sort_kioskcode();
 		
 		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkLoginStatus']")).click();
 		System.out.println("Ascending order Login Status:");
 		sort_LoginStatus();
 		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lnkLoginStatus']")).click();;
 		System.out.println("Descending order Login Status:");
 		sort_LoginStatus();
 		}
     //   driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']")).click();
         
         
		Thread.sleep(2000);
		driver.findElement(lnk_kiosk_view).click();
		Thread.sleep(1000);
		
		scroll();
		Thread.sleep(1000);
		//driver.findElement(kiosk_view_pagination).click();
		Thread.sleep(1000);
		driver.findElement(exportexcel).click();
		Thread.sleep(1000);
		scroll1();
		Thread.sleep(1000);
		driver.findElement(search_lastname).click();
		Thread.sleep(1000);
		driver.findElement(enter_name).sendKeys("ford");
		Thread.sleep(1000);
		driver.findElement(enter_name).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(btn_back).click();
		
		
	
	public void sort_Date() throws Exception{
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
	       {
		List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoDate_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}}
	}
	public void sort_InmateId() throws Exception{
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
	       {
		List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoInmateResidentId_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}}
	}
	
	public void sort_podname() throws Exception{
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
	       {
		List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoPodName_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}}
	}
	
	public void sort_kioskcode() throws Exception{
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
	       {
		List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoKiosksCode_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}}
	}
	
	public void sort_LoginStatus() throws Exception{
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
	       {
		List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoLoginStatus_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}}*/
	}
	public void PrevNext() throws InterruptedException
	{
		  for(int i=1;i<4;i++)
	         {
	        	 Thread.sleep(1000);
	        	 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']")).click();
	         }
	         Thread.sleep(1000);
	 		for(int i=1;i<4;i++)
	 		{
	 			Thread.sleep(1000);           
	 			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrevious']")).click();
	 		}
	}
public void SortDate() throws InterruptedException
{
	Thread.sleep(1000);
    for(int i=0;i<10;i++)
    {
 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoDate_"+i+"']")); 
		for (WebElement e : li) {
			System.out.println(e.getText());
		}}
}
public void SortInmateId() throws InterruptedException
{
	Thread.sleep(1000);
    for(int i=0;i<10;i++)
    {
 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoInmateResidentId_"+i+"']")); 
		for (WebElement e : li) {
			System.out.println(e.getText());
		}}
}
public void SortPodName() throws InterruptedException
{
	Thread.sleep(1000);
    for(int i=0;i<10;i++)
    {
 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoPodName_"+i+"']")); 
		for (WebElement e : li) {
			System.out.println(e.getText());
	}}
}
public void SortKiosksCode() throws InterruptedException
{
	Thread.sleep(1000);
    for(int i=0;i<10;i++)
    {
 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoKiosksCode_"+i+"']")); 
		for (WebElement e : li) {
			System.out.println(e.getText());
		}}
}
public void SortLoginStatus() throws InterruptedException
{
	Thread.sleep(1000);
    for(int i=0;i<10;i++)
    {
 	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmateLoginInfo_lblLoginInfoLoginStatus_"+i+"']")); 
		for (WebElement e : li) {
			System.out.println(e.getText());
		}}
}
	public void sorting_code() throws Exception{
		Thread.sleep(1000);
       for(int i=0;i<10;i++)
       {
    	   List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lnkPod_"+i+"']")); 
		for (WebElement e : li) {
			System.out.println(e.getText());
		}}
	}
	public void sort_name() throws Exception{
		Thread.sleep(1000);
		 for(int i=0;i<10;i++)
	       {
		List<WebElement> list  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lblPodName_"+i+"']"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}}
	}

	public void sort_inmates() throws Exception{
		Thread.sleep(1000);
		 for(int i=0;i<10;i++)
	       {
		List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lblnmates_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}
	}}
	public void sort_kiosk() throws Exception{
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
	       {
		List<WebElement> list  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lblKiosks_"+i+"']"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
	   }
	}
	public void sort_shared() throws Exception{
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
	       {
		List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_lblSharedPod_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getText());
		}}
	}
	public void sort_status() throws Exception{
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
	       {
		List<WebElement> li  = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptPodsInfo_imgStatus_"+i+"']"));
		for (WebElement e : li) {
			System.out.println(e.getAttribute("title"));
		//	System.out.println(e.getAttribute("src"));
		}}
	}

	/* code for scroll*/
	private void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
	}
	private void scroll200() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,250)");
	}
	private void scroll1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(-250,-350)");
	}
	private void scrollup250() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,-250)");
	}

}
