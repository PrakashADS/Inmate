package PUBLICUSER_KIOSK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import PageObjectModel.POM_PubDefender;


public class FindInmates {

	WebDriver obj;
	public FindInmates(WebDriver obj)
	{
		this.obj=obj;
	}
	
	public void findinmate(DataTable findInmte) throws InterruptedException
	{
		List<List<String>> fi=findInmte.raw();
		POM_PubDefender pp=new POM_PubDefender(obj);
		Thread.sleep(1000);
		pp.Findinmate.click();
		Thread.sleep(1000);
		Select state1=new Select(pp.State);
		state1.selectByVisibleText(fi.get(0).get(1));
		Thread.sleep(1000);
		Select facCode=new Select(pp.facilityCode);
		facCode.selectByVisibleText(fi.get(1).get(1));
		Thread.sleep(1000);
		pp.SaveBtn.click();
		Thread.sleep(1000);
		scrollDown();
		Thread.sleep(1000);
		List<WebElement> inmId=obj.findElements(By.className("odd"));
		Thread.sleep(1000);
		for(int i=0;i<1;i++)
		{
			Thread.sleep(1000);
			inmId=obj.findElements(By.className("odd"));
			Thread.sleep(1000);
			inmId.get(2).click();
		}
		//scrollUp();
		Thread.sleep(1000);
		pp.Relationship.sendKeys(fi.get(2).get(1));
		Thread.sleep(500);
		pp.AddtoContacts.click();
	}

public void scrollDown()
{
	JavascriptExecutor jse= (JavascriptExecutor)obj;
	jse.executeScript("window.scrollBy(0,250)", "");
}
public void scrollUp()
{
	JavascriptExecutor jse= (JavascriptExecutor)obj;
	jse.executeScript("window.scrollBy(0,-250)", "");
}

}