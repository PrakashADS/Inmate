package AdminLogin_Inmate;


import gherkin.deps.com.google.gson.annotations.Until;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import PageObjectModel.POM_PubDefender;

//import utility.logger;

public class Document_Page {
//test
	public static WebDriver driver;
	By menu_document = By.xpath("//*[@id='rptUser_menuAnchor_4']");
	By btn_upload = By.xpath("//*[@id='ContentPlaceHolder1_btnUploadDocuments']");
	By txt_title = By.id("ContentPlaceHolder1_txtTitle");
	By btn_browse = By.id("ContentPlaceHolder1_fluDocument");
	By btn_save = By.id("btnSubmit");
	By btn_popup = By.id("btnOk");
	By btn_Reset = By.id("ContentPlaceHolder1_btnCancel");
	By btn_Back = By.id("ContentPlaceHolder1_btnBack");
	By lnk_title = By.xpath("//*[@id='grvDocuments']/tbody/tr[1]/th[1]/a");
	By lnk_title1 = By.xpath("//*[@id='ContentPlaceHolder1_rptDocuments_lnkTitle']");
	By lnk_document = By.xpath("//*[@id='ContentPlaceHolder1_rptDocuments_lnkDocument']");
	By lnk_date = By.xpath("//*[@id='ContentPlaceHolder1_rptDocuments_lnkStatus']");
	By status=By.xpath("//*[@id='ContentPlaceHolder1_rptDocuments_lnkStatus']");
	By sort_title = By.id("lnkDocumentTitle");
	By sort_doc = By.id("lnkDocumentFileName");
	By sort_date = By.id("lblDocumentUploadDate");
	//*[@id="grvDocuments"]/tbody/tr[1]/th[1]/a
	
	public  Document_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Upload_doc_add() throws Exception{
		try {
			Logger logger=Logger.getLogger("loggerin_Page");
			PropertyConfigurator.configure("log4j.properties");
		    Thread.sleep(3000);
			driver.findElement(menu_document).click();
			logger.info("Document menu has been clicked");
			Thread.sleep(1000);
			logger.info("Document chosen successfully");
			Thread.sleep(1000);
			Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
			sel.selectByValue("105");
			Thread.sleep(2000);
			driver.findElement(btn_upload).click();		
			logger.info("Upload button has been clicked");
			Thread.sleep(2000);
			driver.findElement(btn_save).click();
			logger.info("Save button clicked successfully");
			Thread.sleep(1000);
			Random rd=new Random();
			int randomInt=0;
			for(int i=0;i<999;i++)
			{
				randomInt=rd.nextInt(1000);	
			}
			driver.findElement(txt_title).sendKeys("pdf1 sample"+randomInt);
			logger.info("Title entered successfully");
			Thread.sleep(4000);
			driver.findElement(btn_save).click();
			logger.info("Save button clicked successfully");
			Thread.sleep(1500);
			driver.findElement(By.id("ContentPlaceHolder1_fluDocument")).sendKeys("C:\\Users\\prakashd\\Desktop\\cert.pdf");
			logger.info("File uploaded successfully");
			Thread.sleep(3000);
			driver.findElement(btn_save).click();
			logger.info("Save button clicked successfully");
			Thread.sleep(1000);
			driver.findElement(btn_popup).click();
			logger.info("Ok Popup clicked successfully");
			/*driver.findElement(btn_Reset).click();
			logger.info("Reset Button clicked successfully");
			driver.findElement(btn_Back).click();
			logger.info("Back Button clicked successfully");*/
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void sort_document() throws Exception{
		Logger logger=Logger.getLogger("loggerin_Page");
		PropertyConfigurator.configure("log4j.properties");
		driver.findElement(menu_document).click();
		logger.info("Document menu has been clicked");
		Thread.sleep(1000);
		logger.info("Document chosen successfully");
		Thread.sleep(1000);
		Select sel = new Select(driver.findElement(By.id("ddlFacilityCodes")));
		sel.selectByValue("105");
		try{
		Thread.sleep(1000);
		System.out.println("Before Sorting title");
		driver.findElement(lnk_title1).click();
		Thread.sleep(1000);
		sort_title();
		driver.findElement(lnk_title1).click();
		System.out.println("After Sorting title");
		Thread.sleep(1000);
		sort_title();
		
		Thread.sleep(1000);
		System.out.println("Before Sorting document");
		driver.findElement(lnk_document).click();
		Thread.sleep(1000);
		sort_doc();
		driver.findElement(lnk_document).click();
		System.out.println("After Sorting document");
		Thread.sleep(1000);
		sort_doc();
		
		Thread.sleep(1000);
		System.out.println("Before Sorting date");
		driver.findElement(lnk_date).click();
		Thread.sleep(1000);
		sort_date();
		driver.findElement(lnk_date).click();
		System.out.println("After Sorting date");
		Thread.sleep(1000);
		sort_date();
		
		Thread.sleep(1000);
		System.out.println("Before Sorting Status");
		driver.findElement(status).click();
		Thread.sleep(1000);
		sort_status();
		driver.findElement(status).click();
		System.out.println("After Sorting Status");
		Thread.sleep(1000);
		sort_status(); 
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imbtnExportToExcel']")).click();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void DeleteAction() throws InterruptedException
	{
		Thread.sleep(1000);
		for(int i=0;i<2;i++)
		{
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptDocuments_imgbtnDelete_"+i+"']")).click();
		    Thread.sleep(1000);
		    YesNo();
	}
		
	}
	public void ClickPdf() throws InterruptedException
	{
		for(int i=0;i<2;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptDocuments_lnkDocumentFileName_"+i+"']")).click();
		}
	}
	public void YesNo() throws InterruptedException
	{
		POM_PubDefender pu=new POM_PubDefender(driver);
		 int YesNo=2;
			switch(YesNo)
			{
			case 1:
				Thread.sleep(2000);
				driver.findElement(By.id("btnYes")).click();
				Thread.sleep(1000);
				pu.btnOk.click();		
				break;
			case 2:
				Thread.sleep(2000);
				driver.findElement(By.id("btnNo")).click();
				break;
			}	}
	public void sort_title(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptDocuments_lnkDocumentTitle_"+i+"']"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}}
	}
	
	public void sort_doc(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptDocuments_lnkDocumentFileName_"+i+"']"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}}
	}
	
	public void sort_date(){
		for(int i=0;i<10;i++)
		{
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptDocuments_lblDocumentUploadDate_"+i+"']"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}}
	}
		public void sort_status(){
			for(int i=0;i<10;i++)
			{
			List<WebElement> list = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptDocuments_imgStatus_"+i+"']"));
			for (WebElement e : list) {
				System.out.println(e.getAttribute("title"));
			}}
	}
	
	public void Pagination_Document() throws InterruptedException
	{
		/*Thread.sleep(1000);
		List<WebElement>pagination = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']"));
		if(pagination.size()>0)
		{
			System.out.println("Pagination doesn't exists");
		}
		else
		{
			Thread.sleep(1000);
			for(int i=0; i<pagination .size(); i++){ 
				
				Thread.sleep(1000);
				pagination = driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']"));
				Thread.sleep(1000);
				pagination.get(i).click();
		}
		}*/
		Thread.sleep(1000);
		scrollDown();
		Thread.sleep(2000);
		/*int x = 0;  
        while(x < 5) {
        	Thread.sleep(500);
        	WebElement paginations=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']"));
        	Thread.sleep(500);
        	paginations.click();
            x++;
	     }*/
		boolean NextPagi=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']")).isDisplayed();
		String PagiSize=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblOutOfPage']")).getText();
		int i=Integer.parseInt(PagiSize);
		int j=0;
		if(NextPagi==true)
			
			while(j<i-1)
		{
		Thread.sleep(1000);
		WebElement nxt=	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']"));
		nxt.click();
		j++;
		}
			
		
        Thread.sleep(1000);
        int y = 0;  
        while(y < i-1) {
        	Thread.sleep(500);
        	WebElement paginationPrev=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrevious']"));
        	Thread.sleep(500);
        	paginationPrev.click();
            y++;
	     }
        Thread.sleep(1500);
	//	driver.findElement(By.id("ContentPlaceHolder1_imgbtnNext")).click();
		
		/*for(int i=0;i<3;i++)
		{
			Thread.sleep(2000);
			driver.findElement(By.id("ContentPlaceHolder1_imgbtnNext")).click();
		}*/
	}
	public void scrollDown()
	{
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,400)");
	}
}
