package Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.POM_Kiosk;

public class SampleOne {

    WebDriver driver1;
    
    
    public SampleOne(WebDriver driver){
        this.driver1=driver;
    }


    @Test(priority=1)

    public void navigate(){
    	this.driver1.get("http://www.google.com");
    	POM_Kiosk pk=new POM_Kiosk(driver1);
    	pk.srch.sendKeys("exampleeee");
     

    }

}