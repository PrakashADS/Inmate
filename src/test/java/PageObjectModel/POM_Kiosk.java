package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Kiosk {

	 WebDriver driver1;  
	 
	 @FindBy(name="btnEnter")
	 public WebElement LoginBtn;
	 
	 @FindBy(name="txtUsername")
	 public WebElement Username;
	 
	 @FindBy(xpath=".//span[text()='Accept']")
	 public WebElement VK_Accept;
	 
	 @FindBy(name="txtPassword")
	 public WebElement Password;
	 
	 @FindBy(id="txtVisitorDOB")
	 public WebElement VisitorDOB;
	 
	 @FindBy(name="btnLogin")
	 public WebElement btnLogin;
	 
	 @FindBy(name="ctl00$ContentPlaceHolder1$dldashboard$ctl02$imgApps")
	 public WebElement Requests;
	 
	 @FindBy(id="txtVisitorRelation")
	 public WebElement VisitorRelation;
	 
	 @FindBy(id="lst-ib")
	 public WebElement srch;
	 
	 @FindBy(id="btnRaiseMyQuery")
	 public WebElement btnMsgFromInbox; 
	 
	 @FindBy(xpath=".//span[text()='Message To Inmate 1'] and [@class='mCS_img_loaded']")
	 public WebElement VK_MsgToInmate1;
	 
	 @FindBy(name="ctl00$ContentPlaceHolder1$txtForumContent")
	 public WebElement Description; 
	 
	 @FindBy(xpath=".//span[text()='Visitor']")
	 public WebElement Visitor; 
	 
	 @FindBy(xpath=".//td[text()='Wishes..........']")
	 public WebElement Wishes; 
	 
	 @FindBy(xpath=".//a[@href='MyMessage.aspx']")
	 public WebElement Messages; 
	 
	 @FindBy(xpath=".//a[@class='mCSB_buttonDown']")
	 public WebElement mCSB_buttonDown; 
	 
	 @FindBy(id="ContentPlaceHolder1_grvVisitorDetails_btnAddVisitor")
	 public WebElement AddVisitor; 
	 
	 @FindBy(id="txtVisitorName")
	 public WebElement VisitorName; 
	 
	 @FindBy(id="txtVisitorAddress")
	 public WebElement VisitorAddress; 
	 
	 @FindBy(id="txtVisitorCity")
	 public WebElement VisitorCity; 
	 
	 @FindBy(id="ContentPlaceHolder1_grvVisitorDetails_ddlVisitorState_0")
	 public WebElement VisitorState; 
	 
	 @FindBy(id="txtVisitorZipCode")
	 public WebElement VisitorZipCode; 
	 
	 @FindBy(xpath=".//span[text()='a']")
	 public WebElement VK_a;
	 
	 @FindBy(xpath=".//span[text()='b']")
	 public WebElement VK_b;
	 
	 @FindBy(xpath=".//span[text()='c']")
	 public WebElement VK_c;
	 
	 @FindBy(xpath=".//span[text()='d']")
	 public WebElement VK_d;
	 
	 @FindBy(xpath=".//span[text()='e']")
	 public WebElement VK_e;
	 
	 @FindBy(xpath=".//span[text()='f']")
	 public WebElement VK_f;
	 
	 @FindBy(xpath=".//span[text()='g']")
	 public WebElement VK_g;
	 
	 @FindBy(xpath=".//span[text()='h']")
	 public WebElement VK_h;
	 
	 @FindBy(xpath=".//span[text()='i']")
	 public WebElement VK_i;
	 
	 @FindBy(xpath=".//span[text()='j']")
	 public WebElement VK_j;
	 
	 @FindBy(xpath=".//span[text()='k']")
	 public WebElement VK_k;
	 
	 @FindBy(xpath=".//span[text()='l']")
	 public WebElement VK_l;
	 
	 @FindBy(id="btnSend")
	 public WebElement btnSend;
	 
	 @FindBy(name="ctl00$ContentPlaceHolder1$txtEditor")
	 public WebElement MessageText;
	 
	 @FindBy(xpath=".//span[text()='m']")
	 public WebElement VK_m;
	 
	 @FindBy(xpath=".//span[text()='n']")
	 public WebElement VK_n;
	 
	 @FindBy(xpath=".//span[text()='o']")
	 public WebElement VK_o;
	 
	 @FindBy(xpath=".//span[text()='p']")
	 public WebElement VK_p;
	 
	 @FindBy(xpath=".//span[text()='q']")
	 public WebElement VK_q;
	 
	 @FindBy(xpath=".//span[text()='r']")
	 public WebElement VK_r;
	 
	 @FindBy(xpath=".//span[text()='s']")
	 public WebElement VK_s;
	 	 
	 @FindBy(xpath=".//span[text()='t']")
	 public WebElement VK_t;
	 
	 @FindBy(xpath=".//span[text()='u']")
	 public WebElement VK_u;
	 
	 @FindBy(xpath=".//span[text()='v']")
	 public WebElement VK_v;
	 
	 @FindBy(xpath=".//span[text()='w']")
	 public WebElement VK_w;
	 
	 @FindBy(xpath=".//span[text()='x']")
	 public WebElement VK_x;
	 
	 @FindBy(xpath=".//span[text()='y']")
	 public WebElement VK_y;
	 
	 @FindBy(xpath=".//span[text()='z']")
	 public WebElement VK_z;
	 
	 @FindBy(xpath=".//span[text()='!']")
	 public WebElement VK_Excla;
	 
	 @FindBy(xpath=".//span[text()='0']")
	 public WebElement VK_0;
	 	 
	 @FindBy(xpath=".//span[text()='1']")
	 public WebElement VK_1;
	 
	 @FindBy(xpath=".//span[text()='1']")
	 public WebElement VK1;
	 
	 @FindBy(xpath=".//span[text()='2']")
	 public WebElement VK_2;
	 
	 @FindBy(xpath=".//span[text()='3']")
	 public WebElement VK_3;
	 
	 @FindBy(xpath=".//span[text()='4']")
	 public WebElement VK_4;
	 
	 @FindBy(xpath=".//span[text()='5']")
	 public WebElement VK_5;
	 
	 @FindBy(xpath=".//span[text()='6']")
	 public WebElement VK_6;
	 
	 @FindBy(xpath=".//span[text()='7']")
	 public WebElement VK_7;
	 
	 @FindBy(xpath=".//span[text()='8']")
	 public WebElement VK_8;
	 
	 @FindBy(xpath=".//span[text()='9']")
	 public WebElement VK_9;
	 
	 @FindBy(xpath=".//span[text()='-']")
	 public WebElement VK_Dash;
	 
	 @FindBy(xpath=".//span[text()=',']")
	 public WebElement VK_Comma;
	 
	 @FindBy(xpath=".//span[text()='?']")
	 public WebElement VK_Ques;
	 
	 @FindBy(xpath=".//span[text()='.']")
	 public WebElement VK_Dot;
	 
	 @FindBy(xpath=".//span[text()='/']")
	 public WebElement VK_Slash;
	 
	 @FindBy(xpath=".//span[text()='Enter']")
	 public WebElement VK_Enter;
	 
	 @FindBy(xpath=".//span[text()='Caps']")
	 public WebElement VK_Caps;
	 
	 @FindBy(xpath=".//span[text()='Tab']")
	 public WebElement VK_Tab;
	 
	 @FindBy(id="mCSB_1_container")
	 public WebElement Container;
	 
	 @FindBy(id="btnForumSaves")
	 public WebElement SubmitBtn;
	 
	 @FindBy(xpath=".//span[text()='f1']")
	 public WebElement VK_f1; 
	 
	 @FindBy(xpath=".//span[text()='pd form']")
	 public WebElement pdForm; 
	 
	 @FindBy(id="ContentPlaceHolder1_btnBack")
	 public WebElement Back; 
	 
	 @FindBy(id="btnOk")
	 public WebElement btnOk; 
	 
	 @FindBy(id="ddlFormCategory")
	 public WebElement SelectForm; 
	 
	 @FindBy(id="ContentPlaceHolder1_btnSearchFormCategory")
	 public WebElement SearchBtn; 
	 
	 @FindBy(id="ContentPlaceHolder1_dldashboard_imgApps_1")
	 public WebElement Photos1; 
	 
	 @FindBy(id="ContentPlaceHolder1_btnBackVisitor")
	 public WebElement Back1; 
	  
	 
	 @FindBy(id="ContentPlaceHolder1_btnCreateRequest")
	 public WebElement Create;
	 
	 @FindBy(xpath=".//span[text()='H']")
	 public WebElement VK_H;
	 
	 @FindBy(id="txtVisitorPhoneNumber")
	 public WebElement VisitorPhoneNumber; 
	 
	 @FindBy(name="ctl00$ContentPlaceHolder1$dldashboard$ctl04$imgApps")
	 public WebElement MyContacts; 
	 
	 @FindBy(id="lnkSignUp")
	 public WebElement lnkSignUp;
	 
	 public POM_Kiosk (WebDriver driver1)
	 {
		 this.driver1=driver1;
		PageFactory.initElements(driver1, this);
	 }
	 
	 
}
