package PublicUserAutomation;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import PageObjectModel.POM_PubDefender;

public class Signup {
	public WebDriver obj;
	int randomInt;
	private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final int RANDOM_STRING_LENGTH = 2;
	
	public Signup(WebDriver driver){
	        this.obj=driver;
	    }
	 
	public void signUp(DataTable signup) throws InterruptedException
	{
		List<List<String>> sUp=signup.raw();
		POM_PubDefender pu=new POM_PubDefender(obj);
		pu.SignUpBtn.click();
		Thread.sleep(1000);
		pu.PUserFirstName.sendKeys(sUp.get(0).get(1));
		pu.PUserLastName.sendKeys(sUp.get(1).get(1));
		 Random rd = new Random();
			
			for (int idx = 1; idx <= 99; ++idx) {
				randomInt = rd.nextInt(100);		
			}
		   
		pu.PUsertxtEmail1.sendKeys(randomInt+sUp.get(2).get(1));
		pu.PUserConfEmail1.sendKeys(randomInt+sUp.get(3).get(1));
		pu.PUserUserName.sendKeys(sUp.get(4).get(1));
		pu.PUserPassword.sendKeys(sUp.get(5).get(1));
		pu.PUsercofmNewpass1.sendKeys(sUp.get(6).get(1));
		pu.PUserPhoneNumber1.sendKeys(sUp.get(7).get(1));
		pu.PUserAddress1.sendKeys(sUp.get(8).get(1));
		pu.PUserAddress2.sendKeys(sUp.get(9).get(1));
		pu.PUserDob.sendKeys(sUp.get(10).get(1));
		pu.PUserGender.sendKeys(sUp.get(11).get(1));
		pu.PUserCity.sendKeys(sUp.get(12).get(1));
		pu.PUserState.sendKeys(sUp.get(13).get(1));
		pu.PUserZipCode.sendKeys(sUp.get(14).get(1));
		pu.PUserSubmit.click();
		Thread.sleep(3000);
		obj.findElement(By.name("uctlTermsAndConditions$btnOk")).click();
		Thread.sleep(3000);
		obj.findElement(By.name("uctlTermsOfService$btnOk")).click();
		Thread.sleep(1000);	
		pu.btnOk.click();
		
	}
	public void LoginRegUsers(DataTable LoginSignup) throws InterruptedException
	{
		List<List<String>> Login11=LoginSignup.raw();
		POM_PubDefender pu=new POM_PubDefender(obj);
		Thread.sleep(1000);
		pu.btnlogin.click();
		pu.Username.sendKeys(Login11.get(0).get(1));
		Thread.sleep(1000);
		pu.btnlogin.click();
		Thread.sleep(1000);
		pu.Passwd.sendKeys(Login11.get(1).get(1));
		Thread.sleep(1000);
		pu.btnlogin.click();
		
	}
	public void FindInmates(DataTable findInmate) throws InterruptedException
	{
		List<List<String>> fi=findInmate.raw();
		POM_PubDefender pu=new POM_PubDefender(obj);
		Thread.sleep(2000);
		pu.FindInmates.click();
		Thread.sleep(1000);
		Select states=new Select(pu.State);
		states.selectByVisibleText(fi.get(0).get(1));
		Thread.sleep(1000);
		Select facCode=new Select(pu.facilityCode);
		facCode.selectByVisibleText(fi.get(1).get(1));
		Thread.sleep(1000);
		pu.SaveBtn.click();
		Thread.sleep(1000);
		List<WebElement> AddContact=obj.findElements(By.className("odd"));
		Thread.sleep(1000);
		AddContact.get(0).click();
		Thread.sleep(1000);
		pu.RelationShip.sendKeys("Son");
		Thread.sleep(2000);
		obj.findElement(By.name("ctl00$ContentPlaceHolder1$uctlAddRelationShip$btnYes")).click();
		/*int x=1;
		switch(x)
		{
		case 1:
			Thread.sleep(1000);
			pu.btnYes.click();
			break;
		case 2:
			Thread.sleep(1000);
			pu.btnOk.click();
			break;	
		}*/
		Thread.sleep(1000);
		pu.btnOk.click();
		
		
 	}
	public void purchaseCredit(DataTable purchase) throws InterruptedException
	{
		List<List<String>> purc=purchase.raw();
		POM_PubDefender pu=new POM_PubDefender(obj);
		Thread.sleep(1000);
		pu.purchaseCredit.click();
		Thread.sleep(1000);
		Select inm=new Select(pu.selInmate);
		inm.selectByIndex(1);
		
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
	public void ScrollUp1000()
	{
		 JavascriptExecutor jse = (JavascriptExecutor)obj;
		 jse.executeScript("window.scrollBy(0,100)", "");
	}
	
}
