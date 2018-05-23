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

public class Revenue_Report {
	// test
	public static WebDriver driver;
	By menu_Report = By.id("rptUser_menuAnchor_6");
	By txt_date = By.id("ContentPlaceHolder1_txtDaily");
	By btn_daily = By.id("btnDaily");
	By radio_facility = By.id("ContentPlaceHolder1_rdbChoices_1");
	By dwn_facility = By.id("ddlFacilityCodes");
	By radio_monthly = By.id("ContentPlaceHolder1_rdbAction_1");
	By radio_daily = By.id("ContentPlaceHolder1_rdbAction_0");
	By lnk_purchased_credit = By
			.id("ContentPlaceHolder1_lnkbtnPurchasedCredits");
	By lnk_Failed_Transactions = By
			.id("ContentPlaceHolder1_lnkbtnFailedTransactions");
	By lnk_pending_transactions = By
			.id("ContentPlaceHolder1_lnkbtnPendingTransaction");
	By btn_back = By.name("ctl00$ContentPlaceHolder1$btnBack");
	By radio_All = By.id("ContentPlaceHolder1_rdbChoices_0");
	By dwn_year = By.id("ContentPlaceHolder1_ddlYear");
	By dwn_month = By.id("ContentPlaceHolder1_ddlMonth");
	By btn_monthly = By.id("btnMonthly");
	By btn_confirm = By.id("ContentPlaceHolder1_grvPayments_ImageButton2_0");
	By btn_cancel = By.id("ContentPlaceHolder1_grvPayments_ImageButton3_0");
	By btn_yes = By.id("btnYes");
	By btn_No = By.id("btnNo");
	By btn_ok = By.id("btnOk");

	public Revenue_Report(WebDriver driver) {
		this.driver = driver;
	}

	public void report_facility_daily() {
		try {
			Thread.sleep(1000);

			Logger Log = Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
			driver.findElement(menu_Report).click();
			driver.findElement(radio_facility).click();
			Log.info("Facility radio button has been chosen");
			Select sel = new Select(driver.findElement(By
					.id("ddlFacilityCodes")));
			sel.selectByValue("105");
			Log.info("Facility code has been chosen");
			Thread.sleep(1000);
			driver.findElement(txt_date).sendKeys("12/14/2017");
			Thread.sleep(1000);
			driver.findElement(btn_daily).click();
			driver.findElement(lnk_purchased_credit).click();
			Log.info("Purchased credits link has been chosen");
			Thread.sleep(2000);
			driver.findElement(btn_back).click();
			Log.info("Back button has been clicked");
			driver.findElement(lnk_Failed_Transactions).click();
			Thread.sleep(2000);
			Log.info("Failed Transaction link has been chosen");
			Thread.sleep(2000);
			String payment = "cancel";
			switch (payment) {
			case "confirm":
				ScrollUp250();
				if (driver.findElement(btn_confirm).isDisplayed()) {
					Thread.sleep(1000);
					driver.findElement(btn_confirm).click();
					Log.info("Confirm button has been clicked");
					Thread.sleep(1000);
					driver.findElement(btn_yes).click();
					Log.info("Yes button has been clicked");
				}
				break;
			case "cancel":
				if (driver.findElement(btn_cancel).isDisplayed()) {
					Thread.sleep(1000);
					driver.findElement(btn_cancel).click();
					Log.info("Cancel button has been clicked");
					Thread.sleep(1000);
					driver.findElement(btn_No).click();
					Log.info("No button has been clicked");
				}

				break;
			}
			Thread.sleep(2000);
			driver.findElement(btn_back).click();
			Log.info("Back button has been clicked");
			Thread.sleep(2000);
			driver.findElement(lnk_pending_transactions).click();
			Log.info("Pending Transaction has been clicked");
			Thread.sleep(2000);
			driver.findElement(btn_ok).click();
			Log.info("ok button has been clicked");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void ScrollUp250()
	 {
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,250)", "");
	 }
	public void report_all_daily() {
		try {
			Logger Log = Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
			Thread.sleep(1500);
			driver.findElement(menu_Report).click();
			driver.findElement(radio_facility).click();
			Log.info("Facility radio button has been chosen");
			Thread.sleep(2000);
		
			Select sel = new Select(driver.findElement(By
					.id("ddlFacilityCodes")));
			sel.selectByValue("105");
			Log.info("Facility code has been chosen");
			driver.findElement(radio_All).click();
			Thread.sleep(2000);
			driver.findElement(radio_daily).click();
			driver.findElement(txt_date).sendKeys("12/14/2017");
			Thread.sleep(1000);
			driver.findElement(btn_daily).click();
			driver.findElement(lnk_purchased_credit).click();
			Log.info("Purchased credits link has been chosen");
			Thread.sleep(2000);
			driver.findElement(btn_back).click();
			Log.info("Back button has been clicked");
			driver.findElement(lnk_Failed_Transactions).click();
			Thread.sleep(2000);
			Log.info("Failed Transaction link has been chosen");
			Thread.sleep(2000);
			
			char pay = 'A';
			switch (pay) {
			case 'A':
				ScrollUp250();
				Thread.sleep(1000);
			
				List<WebElement> l1=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvPayments$ctl06$ImageButton2"));
				try {
					Thread.sleep(1000);
					if(driver.findElement(By.name("ctl00$ContentPlaceHolder1$grvPayments$ctl06$ImageButton2")).isDisplayed())
					{	
						for(int i=0;i<=l1.size();i++)
						{
							Thread.sleep(1000);
							driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvPayments$ctl06$ImageButton2"));
							Thread.sleep(1000);
							l1.get(0).click();
							Thread.sleep(1000);
							YesNo();
						}
							
					}
				} catch (StaleElementReferenceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			case 'B':
				ScrollUp250();
				Thread.sleep(1000);
				List<WebElement> l2=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvPayments$ctl05$ImageButton3"));
				try {
					Thread.sleep(1000);
					if(driver.findElement(By.name("ctl00$ContentPlaceHolder1$grvPayments$ctl05$ImageButton3")).isDisplayed())
					{	                           
						for(int i=0;i<=l2.size();i++)
						{
							Thread.sleep(1000);
							driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvPayments$ctl05$ImageButton3"));
							Thread.sleep(1000);
							l2.get(0).click();
							Thread.sleep(1000);
							YesNo();
						}
							
					}
				} catch (StaleElementReferenceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Log.info("No button has been clicked");
				break;
			
			}
			Thread.sleep(2000);
			driver.findElement(btn_back).click();
			Log.info("Back button has been clicked");
			Thread.sleep(2000);
			driver.findElement(lnk_pending_transactions).click();
			Log.info("Pending Transaction has been clicked");
			Thread.sleep(2000);

			driver.findElement(btn_ok).click();
			Log.info("ok button has been clicked");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void report_all_monthly() {
		try {
			Logger Log = Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
			Thread.sleep(1500);
			driver.findElement(menu_Report).click();
			Thread.sleep(1000);
			driver.findElement(radio_facility).click();
			Log.info("Facility radio button has been chosen");
			Thread.sleep(1000);
			Select sel = new Select(driver.findElement(By
					.id("ddlFacilityCodes")));
			sel.selectByValue("105");
			Log.info("Facility code has been chosen");
			driver.findElement(radio_All).click();
			Thread.sleep(2000);
			driver.findElement(radio_monthly).click();
			Thread.sleep(2000);
			Select year = new Select(driver.findElement(dwn_year));
			year.selectByValue("2017");
			Thread.sleep(1000);
			Select monthly = new Select(driver.findElement(dwn_month));
			monthly.selectByValue("12");
			Thread.sleep(1000);
			driver.findElement(btn_monthly).click();
			Log.info("Monthly has been clicked");
			driver.findElement(lnk_purchased_credit).click();
			Log.info("Purchased credits link has been chosen");
			Thread.sleep(2000);
			driver.findElement(btn_back).click();
			Log.info("Back button has been clicked");
			driver.findElement(lnk_Failed_Transactions).click();
			Thread.sleep(2000);
			Log.info("Failed Transaction link has been chosen");
			Thread.sleep(2000);
			String payment = "cancel";
			switch (payment) {
			case "confirm":
				driver.findElement(btn_confirm).click();
				Log.info("Confirm button has been clicked");
				Thread.sleep(1000);
				driver.findElement(btn_yes).click();
				Log.info("Yes button has been clicked");
			case "cancel":
				driver.findElement(btn_cancel).click();
				Log.info("Cancel button has been clicked");
				Thread.sleep(1000);
				driver.findElement(btn_No).click();
				Log.info("No button has been clicked");
			default:
				System.out.println("exit");
			}
			Thread.sleep(2000);
			driver.findElement(btn_back).click();
			Log.info("Back button has been clicked");
			Thread.sleep(2000);
			driver.findElement(lnk_pending_transactions).click();
			Log.info("Pending Transaction has been clicked");
			Thread.sleep(2000);
			driver.findElement(btn_ok).click();
		//	driver.findElement(btn_back).click();
			Log.info("Back button has been clicked");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void report_facility_monthly() {
		try {
			Logger Log = Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
			Thread.sleep(2000);
			driver.findElement(menu_Report).click();
			Thread.sleep(1000);
			driver.findElement(radio_facility).click();
			Log.info("Facility radio button has been chosen");
			Thread.sleep(1000);
			Select sel = new Select(driver.findElement(By
					.id("ddlFacilityCodes")));
			sel.selectByValue("105");
			Log.info("Facility code has been chosen");
			driver.findElement(radio_facility).click();
			Log.info("Facility radio button has been chosen");
			Thread.sleep(2000);
			Select obj = new Select(driver.findElement(dwn_facility));
			obj.selectByValue("114");
			Log.info("Facility has been selected");
			driver.findElement(radio_monthly).click();
			Log.info("Monthly radio button has been selected");
			Thread.sleep(1000);
			Select year = new Select(driver.findElement(dwn_year));
			year.selectByValue("2017");
			Thread.sleep(1000);
			Select monthly = new Select(driver.findElement(dwn_month));
			monthly.selectByValue("12");
			Thread.sleep(1000);
			driver.findElement(btn_monthly).click();
			Log.info("Monthly has been clicked");
			driver.findElement(lnk_purchased_credit).click();
			Log.info("Purchased credits link has been chosen");
			Thread.sleep(2000);
			driver.findElement(btn_back).click();
			Log.info("Back button has been clicked");
			driver.findElement(lnk_Failed_Transactions).click();
			Thread.sleep(2000);
			Log.info("Failed Transaction link has been chosen");
			Thread.sleep(2000);
			driver.findElement(btn_back).click();
			Log.info("Back button has been clicked");
			Thread.sleep(2000);
			driver.findElement(lnk_pending_transactions).click();
			Log.info("Pending Transaction has been clicked");
			Thread.sleep(2000);
			driver.findElement(btn_ok).click();
			Log.info("ok button has been clicked");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	 public void YesNo() throws InterruptedException
	 {
		 int YesNo=2;
			switch(YesNo)
			{
			case 1:
				
				Thread.sleep(1500);
				driver.findElement(By.id("btnYes")).click();
				break;
			case 2:
				Thread.sleep(1500);
				driver.findElement(By.id("btnNo")).click();
				break;
			}	
	 }

}
