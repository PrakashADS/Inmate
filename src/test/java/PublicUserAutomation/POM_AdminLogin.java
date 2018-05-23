package PublicUserAutomation;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;

public class POM_AdminLogin {
	
       WebDriver driver;
       
       public POM_AdminLogin(WebDriver driver)
       {
    	   this.driver=driver;
    	   PageFactory.initElements(driver, this);
       }
       
      @FindBy(id="rptUser_menuAnchor_1")
   	  public  WebElement ManagementUser;
      
      @FindBy(id="ddlFacilityCodes")
   	  public  WebElement FacilityCodes;
      
      @FindBy(id="ContentPlaceHolder1_btnAddUser")
   	  public  WebElement AddUsers;
     
      @FindBy(id="ddlRole")
   	  public  WebElement Role; 
      
      @FindBy(id="ContentPlaceHolder1_txtFirstName")
   	  public  WebElement FName; 
     
      @FindBy(id="ContentPlaceHolder1_txtMiddleName")
   	  public  WebElement MidName; 
      
      @FindBy(id="ContentPlaceHolder1_txtLastName")
   	  public  WebElement LName;
      
      @FindBy(id="ContentPlaceHolder1_txtUserName")
   	  public  WebElement UserName;
      
      @FindBy(id="txtPassword")
   	  public  WebElement Password;
      
      @FindBy(id="ContentPlaceHolder1_txtEmail")
   	  public  WebElement Email;
      
      @FindBy(id="ContentPlaceHolder1_txtAddress")
   	  public  WebElement Address;
      
      @FindBy(id="ContentPlaceHolder1_txtCity")
   	  public  WebElement City;
      
      @FindBy(id="ContentPlaceHolder1_ddlState")
   	  public  WebElement State;
      
      @FindBy(id="ContentPlaceHolder1_txtZipCode")
   	  public  WebElement ZipCode;
      
      @FindBy(id="ContentPlaceHolder1_txtPhone")
   	  public  WebElement Phone;
      
      @FindBy(id="btnSubmit")
   	  public  WebElement Save;
      
      @FindBy(id="ContentPlaceHolder1_btnCancel")
   	  public  WebElement Reset;
   	  
      @FindBy(id="btnOk")
   	  public  WebElement btnOk; 
      
      public void Add_users(DataTable mgmtUser) throws InterruptedException
      {
    	     List<List<String>> mu=mgmtUser.raw();
    	     Thread.sleep(1000);
    	    Select role=new Select(Role);
    		role.selectByVisibleText("Public Defender Staff");
    		Thread.sleep(1000);
    	    FName.sendKeys(mu.get(0).get(1));
    		MidName.sendKeys(mu.get(1).get(1));
    		LName.sendKeys(mu.get(2).get(1));
    		Random rd = new Random();
    		int randomInt = 0;
    		for (int idx = 111; idx <= 999; ++idx) {
    			randomInt = rd.nextInt(1000);		
    		}
    		UserName.sendKeys(mu.get(3).get(1)+randomInt);
    		Password.sendKeys(mu.get(4).get(1));
    		Email.sendKeys(mu.get(5).get(1));
    		Address.sendKeys(mu.get(6).get(1));
    	    City.sendKeys(mu.get(7).get(1));
    		Select state=new Select(State);
    		state.selectByVisibleText(mu.get(8).get(1));
    		ZipCode.sendKeys(mu.get(9).get(1));
    		Phone.sendKeys(mu.get(10).get(1));
    		Thread.sleep(1000);
    		List<WebElement> ActiveInActive = driver.findElements(By.name("ctl00$ContentPlaceHolder1$rblStatus"));
    	    	Boolean is_selected = ActiveInActive.get(0).isSelected();
    	    	if(is_selected==true)
    	    	{
    	    		System.out.println("Already Selected");
    	    	}
    	    	else
    	    	{
    	    		Thread.sleep(1000);
    	    		ActiveInActive.get(0).click();
    	    }
    	    Thread.sleep(3000);
    	    List<WebElement> PDS = driver.findElements(By.name("ctl00$ContentPlaceHolder1$rbPermission"));
    	    	Boolean is_selected1 = PDS.get(1).isSelected();
    	    	if(is_selected==true)
    	    	{
    	    	    Thread.sleep(1000);
    	    		PDS.get(0).click();
    	    	}
    	    	else
    	    	{
    	    		System.out.println("Already Selected");
    	    		
    	    	}
    	    int x=1;
    	    switch(x)
    	    {
    	    case 1:
    	    	Thread.sleep(1000);
    	    	Save.click();
    	    	break;
    	    case 2:
    	    	Thread.sleep(1000);
    	    	Reset.click();
    	    	break;
    	    }
    	    Thread.sleep(1000);
    	    btnOk.click();
      }
}
