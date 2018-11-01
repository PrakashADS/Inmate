package AdminLogin_Inmate;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import AdminLogin_Inmate.Log;

public class Lockdown_Page {

	
	public static WebDriver driver;
	public Lockdown_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void lockdown() throws Exception{
		try{
		
		By menu_lockdown = By.id("rptUser_menuAnchor_5");
		By chk_permission = By.id("chkHeaderSelectAllKioskLockDownAllActive");
		By btn_lock = By.id("ContentPlaceHolder1_btnKioskLockdownLock");
		By btn_popup = By.id("btnOk");
		By chk_kiosk_lock = By.id("chkHeaderSelectAllKioskLockDownActive");
		
		Logger Log=Logger.getLogger("Login_Page");
		PropertyConfigurator.configure("log4j.properties");
		Thread.sleep(1500);
		driver.findElement(menu_lockdown).click();
		Log.info("Lockdown menu has been clicked");
		Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
		sel.selectByValue("105");
		Thread.sleep(4000);
		int x=3;
		switch(x)
		{
		case 1:// KIOSKS/INMATE SETTINGS LOCKDOWN [ SELECT ALL ]
			Thread.sleep(1000);
			if(driver.findElement(chk_permission).isSelected())
			{
				System.out.println("Already selected");
			}
			else{
				Thread.sleep(1000);
				driver.findElement(chk_permission).click();
			}
			break;
			
		case 2:// KIOSKS/INMATE SETTINGS LOCKDOWN [ SELECT INDIVIDUAL ] 
			List<WebElement> ChkBox=driver.findElements(By.xpath("//*[@id='chkKioskLockDownAllActive']"));
			
			for(int i=0;i<ChkBox.size();i=i++)
			{
				try {
					if(ChkBox.get(i).isSelected())
					{
						System.out.println("Already selected");
					}
					else{
						ChkBox=driver.findElements(By.xpath("//*[@id='chkKioskLockDownAllActive']"));
						ChkBox.get(i).click();
					}
				} catch (StaleElementReferenceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				break;
			}
			
			    case 3:// KIOSKS LOCKDOWN INFORMATION [ SELECT ALL ]
			    	Thread.sleep(1000);
					if(driver.findElement(By.xpath("//*[@id='chkHeaderSelectAllKioskLockDownActive']")).isSelected())
					{
						System.out.println("Already selected");
					}
					else{
						Thread.sleep(1000);
						driver.findElement(By.xpath("//*[@id='chkHeaderSelectAllKioskLockDownActive']")).click();
					}
					break;
			    case 4:// KIOSKS LOCKDOWN INFORMATION [ SELECT INDIVIDUAL ]
			    	Thread.sleep(1000);
					List<WebElement> ChkBox1=driver.findElements(By.xpath("//*[@id='chkKioskLockDownActive']"));
					
					for(int k=0;k<ChkBox1.size();k=k++)
					{
						try {
							if(ChkBox1.get(k).isSelected())
							{
								System.out.println("Already selected");
							}
							else{
								Thread.sleep(1000);
								ChkBox1=driver.findElements(By.xpath("//*[@id='chkKioskLockDownActive']"));
								ChkBox1.get(k).click();
							}
						} catch (StaleElementReferenceException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
						break;  	
					}
		}
		
		//driver.findElement(chk_permission).click();
		Log.info("Permission has chosen");
		scroll();
		Thread.sleep(4000);	
		scroll();
		driver.findElement(btn_lock).click();
		Log.info("Lock button has clicked");
		Thread.sleep(5000);
		driver.findElement(btn_popup).click();
		Log.info("Ok Popup clicked successfully");
		Thread.sleep(4000);
		driver.findElement(chk_kiosk_lock).click();
		Log.info("Lock button has clicked");
		scroll();
		Thread.sleep(2000);
		driver.findElement(btn_lock).click();
		Log.info("Lock button has clicked");
		Thread.sleep(1000);
		driver.findElement(btn_popup).click();
		Log.info("Ok Popup clicked successfully");
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/* code for scroll*/
	private void scroll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,1300)");
		Thread.sleep(1000);
	}
	public void scroll1()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,150)");
	}
	public void scroll400()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,400)");
	}
	public void Sorting() throws InterruptedException
	{  
		Thread.sleep(1000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdownAllSetting']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("Ascending order Permissions:");
		Sorting_Permission();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdownAllSetting']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("Descending order Permissions:");
		Sorting_Permission();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdownAllSetting']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("Ascending order Status:");
		Sorting_Status();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdownAllSetting']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("Descending order Status:");
		Sorting_Status();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdownAllSetting']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("Ascending order LastAction:");
		Sorting_LastAction();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdownAllSetting']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("Descending order LastAction:");
		Sorting_LastAction();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("Ascending order KioskCode:");
		Sorting_KioskCode();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("Descending order KioskCode:");
		Sorting_KioskCode();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("Ascending order PodName:");
		Sorting_PodName();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("Descending order PodName:");
		Sorting_PodName();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("Ascending order ComputerName:");
		Sorting_CompName();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("Descending order ComputerName:");
		Sorting_CompName();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[5]/a")).click();
		System.out.println("Ascending order Status:");
		Sorting_Status1();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[5]/a")).click();
		System.out.println("Descending order Status:");
		Sorting_Status1();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[6]/a")).click();
		System.out.println("Ascending order LastAction:");
		Sorting_LastAction1();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[6]/a")).click();
		System.out.println("Descending order LastAction:");
		Sorting_LastAction1();
		Thread.sleep(500);
		scroll400();
		Thread.sleep(500);
		Pagination();
	}
	public void Sorting_Permission() throws InterruptedException
	{
		Thread.sleep(1000);
		List<WebElement> permissions=driver.findElements(By.id("lblLockDownName"));
		for(WebElement e:permissions)
		{
			System.out.println(e.getText());
		}
	}
	public void Sorting_Status() throws InterruptedException
	{
		Thread.sleep(1000);
		List<WebElement> Status=driver.findElements(By.id("imgStatus"));
		for(WebElement e:Status)
		{
			System.out.println(e.getAttribute("title"));
		}
	}
	public void Sorting_LastAction() throws InterruptedException
	{
		Thread.sleep(1000);
		List<WebElement> LastAction=driver.findElements(By.id("lblLastAction"));
		for(WebElement e:LastAction)
		{
			System.out.println(e.getText());
		}
	}
	public void Sorting_KioskCode() throws InterruptedException
	{
		Thread.sleep(1000);
		List<WebElement> LastAction=driver.findElements(By.id("lblKiosksCode"));
		for(WebElement e:LastAction)
		{
			System.out.println(e.getText());
		}
	}
	public void Sorting_PodName() throws InterruptedException
	{
		Thread.sleep(1000);
		List<WebElement> LastAction=driver.findElements(By.id("lblPodName"));
		for(WebElement e:LastAction)
		{
			System.out.println(e.getText());
		}
	}
	public void Sorting_CompName() throws InterruptedException
	{
		Thread.sleep(1000);
		List<WebElement> LastAction=driver.findElements(By.id("lblComputerName"));
		for(WebElement e:LastAction)
		{
			System.out.println(e.getText());
		}
	}
	public void Sorting_Status1() throws InterruptedException
	{
		Thread.sleep(1000);
		List<WebElement> LastAction=driver.findElements(By.id("imgStatus"));
		for(WebElement e:LastAction)
		{
			System.out.println(e.getAttribute("title"));
		}
	}
	public void Sorting_LastAction1() throws InterruptedException
	{
		Thread.sleep(1000);
		List<WebElement> LastAction=driver.findElements(By.id("lblLastAction"));
		for(WebElement e:LastAction)
		{
			System.out.println(e.getText());
		}
	}
	public void Pagination() throws InterruptedException{
		Thread.sleep(1000);
		for(int i=2;i<4;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'"+i+"')]"));
		}
	}
}
