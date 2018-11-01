package PageObjectModel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;

public class POM_PubDefender {
	WebDriver driver;

	@FindBy(id="lnkSignUp")
	public  WebElement SignUpBtn;

	@FindBy(id="txtUserFirstName")
	public  WebElement PUserFirstName;

	@FindBy(id="txtUserLastName")
	public  WebElement PUserLastName;

	@FindBy(id="txtEmail1")
	public  WebElement PUsertxtEmail1;

	@FindBy(id="txtConfEmail1")
	public  WebElement PUserConfEmail1;

	@FindBy(id="txtUserName")
	public  WebElement PUserUserName;

	@FindBy(id="txtpassword")
	public  WebElement PUserPassword;

	@FindBy(id="txtcofmNewpass1")
	public  WebElement PUsercofmNewpass1;

	@FindBy(id="txtUserPhoneNumber")
	public  WebElement PUserPhoneNumber1;

	@FindBy(id="txtLocStrAddress1")
	public  WebElement PUserAddress1;

	@FindBy(id="txtLocStrAddress2")
	public  WebElement PUserAddress2;

	@FindBy(id="txtDob")
	public  WebElement PUserDob;

	@FindBy(id="ddlgender")
	public  WebElement PUserGender;

	@FindBy(id="ddlState")
	public  WebElement PUserState;

	@FindBy(id="txtLocZipCode")
	public  WebElement PUserZipCode;

	@FindBy(id="btnSubmit")
	public  WebElement PUserSubmit;

	@FindBy(xpath="//*[@id='rptUser_menuAnchor_2']")
	public  WebElement RegisteredUsers;

	@FindBy(id="ContentPlaceHolder1_lnkbtnActivateUser")
	public  WebElement ActivateUsers;

	@FindBy(id="txtLocCity")
	public  WebElement PUserCity;

	@FindBy(id="txtUsername")
	public  WebElement txtUsername;

	@FindBy(xpath="//*[@id='txtLoginUserName']")
	public  WebElement Username;

	@FindBy(xpath="//*[@id='txtLoginUserName']")
	public  WebElement UserName;
	
	@FindBy(id="achrFindInmates")
	public  WebElement FindInmates;

	@FindBy(xpath="//*[@id='txtLoginpassword']")
	public  WebElement Passwd;

	@FindBy(xpath="//*[@id='achrWtiteMsg']")
	public  WebElement PUCreateMsg;

	@FindBy(xpath="//*[contains(text(),'Repeated Message Conversation')]")
	public  WebElement RepeatedMsg;
		
	@FindBy(xpath="//*[contains(text(),'Message sent successfully')]")
	public  WebElement MsgSentSuccess;
	
	@FindBy(xpath="//*[contains(text(),'Message cannot be sent until credits are purchased')]")
	public  WebElement MsgCantSendNoCredit;
	
	@FindBy(id="ContentPlaceHolder1_defaultOpen")
	public  WebElement PUMessage;

	@FindBy(id="txtPassword")
	public  WebElement txtPassword;

	@FindBy(id="ContentPlaceHolder1_ddlState")
	public  WebElement State;

	@FindBy(id="ddlFacilityCodes")
	public  WebElement facilityCode;

	@FindBy(id="btnLogin")
	public  WebElement btnLogin;

	@FindBy(xpath="//*[@id='btnlogin']")
	public  WebElement btnlogin;

	@FindBy(xpath="//*[@id='rptUser_menuAnchor_0']")
	public  WebElement GrievancesBtn;

	@FindBy(xpath="///*[@id='rptUser_menuAnchor_0']")
	public  WebElement GrievancesReqBtn;

	@FindBy(id="btnRaiseMyQuery")
	public  WebElement initiateMsg;

	@FindBy(xpath="//a[@href='FindInmates.aspx']")
	public  WebElement Findinmate;

	@FindBy(id="ContentPlaceHolder1_ddlRequestTypeSearch")
	public  WebElement ReqType;

	@FindBy(id="ContentPlaceHolder1_ddlRequestStatusSearch")
	public  WebElement ReqStatus;

	@FindBy(id="ContentPlaceHolder1_txtRequestCreatedStartDateSearch")
	public  WebElement ReqStartDate;

	@FindBy(xpath="//*[@id='ContentPlaceHolder1_ddlRequestTypeSearch']")
	public  WebElement PdFormSelect;

	@FindBy(id="ContentPlaceHolder1_txtRequestCreatedEndDateSearch")
	public  WebElement ReqEndDate;

	@FindBy(id="ContentPlaceHolder1_txtRequestRespondStartDateSearch")
	public  WebElement RespStartDate;

	@FindBy(id="ContentPlaceHolder1_txtRequestRespondEndDateSearch")
	public  WebElement RespEndDate;

	@FindBy(id="btnSearchRequest")
	public  WebElement SearchRequest;

	@FindBy(id="ContentPlaceHolder1_btnAcceptRequest")
	public  WebElement Accept;

	@FindBy(id="lnkNotices")
	public  WebElement Noticess;

	@FindBy(id="ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0")
	public  WebElement MsgToInmate1; 

	@FindBy(xpath="//*[@id='ddlLastNameSearch_chosen']/div/ul/li[1]")
	public  WebElement InmateLastName;

	@FindBy(xpath="//*[@id='ddlLastNameSearch_chosen']/div/div/input")
	public  WebElement LastNameSearch;

	@FindBy(xpath="//*[@id=ddlLastNameSearch_chosen']/div/ul/li[8]")
	public  WebElement LastNameJohn;

	@FindBy(id="ContentPlaceHolder1_ddlPodSearch")
	public  WebElement pod;

	@FindBy(id="ddlFirstNameSearch")
	public  WebElement InmateFrstName;

	@FindBy(xpath="//*[@id='ddlLastNameSearch_chosen']/a/span")
	public  WebElement InmateLastName1;

	@FindBy(xpath="//*[@id='ddlFirstNameSearch_chosen']/a/span")
	public  WebElement InmateFrstName1;

	@FindBy(xpath="//*[@id='ddlFirstNameSearch_chosen']/div/div/input")
	public  WebElement FrstNameSearch;

	@FindBy(id="ContentPlaceHolder1_txtForumContentComment")
	public  WebElement Description;

	@FindBy(id="ContentPlaceHolder1_txtDOBStartDateSearch")
	public  WebElement DobStart;

	@FindBy(id="ContentPlaceHolder1_txtDOBEndDateSearch")
	public  WebElement DobEnd;

	@FindBy(id="ContentPlaceHolder1_ddlKiosksAccessSearch")
	public  WebElement KioskAccess;

	@FindBy(id="ContentPlaceHolder1_ddlGenderSearch")
	public  WebElement Gender;

	@FindBy(id="ContentPlaceHolder1_btnReplyPostComment")
	public  WebElement SubmitReply;

	@FindBy(id="ContentPlaceHolder1_txtForumBodyBoth")
	public  WebElement Description1;

	@FindBy(id="ContentPlaceHolder1_txtForumContent")
	public  WebElement DescriptionText;

	@FindBy(id="ContentPlaceHolder1_txtForumBodyBoth")
	public  WebElement DescriptionBoth;

	@FindBy(id="btnOk")
	public  WebElement btnOk;
	
	@FindBy(xpath="//*[@id='btnOk']")
	public  WebElement btnOk1;
	
	@FindBy(id="btnCreateNew")
	public  WebElement btnCreateNew;

	@FindBy(id="purchaseCredit")
	public  WebElement purchaseCredit;

	@FindBy(id="ContentPlaceHolder1_ValidatorCalloutExtender1_ClientState")
	public  WebElement selInmate;

	@FindBy(xpath="//*[@id='achrMenuInbox']")
	public  WebElement InboxBtn;

	@FindBy(xpath="//*[@id='achrMenuArchive']")
	public  WebElement ArchivedMsg;

	@FindBy(xpath="//*[@id='ContentPlaceHolder1_ddlRequestType']")
	public  WebElement MessageType;

	@FindBy(id="ContentPlaceHolder1_rdolstSelectTypeOfConvo_0")
	public  WebElement InitiateToSingle;

	@FindBy(name="ctl00$ContentPlaceHolder1$btnForumSave")
	public  WebElement btnForumSave;

	@FindBy(name="ctl00$ContentPlaceHolder1$btnForumPDFSave")
	public  WebElement btnForumPdfSave;

	@FindBy(id="btnForumSaveBoth")
	public  WebElement btnForumSaveBoth;

	@FindBy(xpath="//*[@id='example_filter']/label/input")
	public  WebElement SearchContact;

	@FindBy(id="btnTransferFund")
	public  WebElement TransferFund;

	@FindBy(id="txtTransferAmount")
	public  WebElement TransferAmount;

	@FindBy(id="btnTransferNow")
	public  WebElement TransferNow;

	@FindBy(id="ddlInmate")
	public  WebElement InmateNames;

	@FindBy(xpath="//*[@id='ContentPlaceHolder1_ddlCredits']")
	public  WebElement CreditAmt;
	
	@FindBy(xpath="//*[@id='btnSubmit']")
	public  WebElement Purchase;
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_btnCancel']")
	public  WebElement Cancel;
	
	@FindBy(xpath="//*[@id='email']")
	public  WebElement Paypal_uname;
	
	@FindBy(xpath="//*[@id='password']")
	public  WebElement Paypal_passwd;
	
	@FindBy(xpath="//*[@id='btnNext']")
	public  WebElement Next;
	
	@FindBy(xpath="//*[@id='btnLogin']")
	public  WebElement Login;
	
	@FindBy(xpath="//*[@id='confirmButtonTop']")
	public  WebElement Pay;
	
	@FindBy(xpath="//*[@id='achrCODPending']")
	public  WebElement COD_Pending;
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_rptSentMessages_chkHeader']")
	public  WebElement CheckAll;
	
	@FindBy(id="btnForumPDFSave")
	public  WebElement btnForumPDFSaves;

	@FindBy(id="ContentPlaceHolder1_rdolstSelectTypeOfConvo_1")
	public  WebElement InitiateToMulti;

	@FindBy(id="ContentPlaceHolder1_cblstMultiInmate_4")
	public  WebElement selectJames; 

	@FindBy(id="ContentPlaceHolder1_txtForumContent")
	public  WebElement TxtDescription;

	@FindBy(id="ContentPlaceHolder1_ddlSingleInmates")
	public  WebElement DDLSingleInmate;

	@FindBy(id="ContentPlaceHolder1_cblstMultiInmate_1")
	public  WebElement SelectBrownjalil;

	@FindBy(id="ContentPlaceHolder1_cblstMultiInmate_2")
	public  WebElement SelectFord;

	@FindBy(id="ContentPlaceHolder1_cblstMultiInmate_8")
	public  WebElement SelectJohn;

	@FindBy(id="ContentPlaceHolder1_fluDocument")
	public  WebElement ChoosePdf;

	@FindBy(id="ContentPlaceHolder1_fluForumUpload")
	public  WebElement ChoosePdf1; 

	@FindBy(id="ContentPlaceHolder1_fluDocumentBoth")
	public  WebElement ChoosePdfBoth;

	@FindBy(id="ContentPlaceHolder1_fluDocument")
	public  WebElement ChoosePdf2; 

	@FindBy(id="ContentPlaceHolder1_btnReplyPostComment")
	public  WebElement SubmitReply1; 

	@FindBy(id="btnForumSave")
	public  WebElement btnSaveTxt;  

	@FindBy(id="fluDocument")
	public  WebElement ChoosePDF; 

	@FindBy(id="btnForumPDFSave")
	public  WebElement btnForumPDFSave;   

	@FindBy(name="ctl00$ContentPlaceHolder1$btnForumSaveBoth")
	public  WebElement btnSaveBoth; 

	@FindBy(id="ContentPlaceHolder1_ddlRequestStatusSearch")
	public  WebElement SelectReqStatus; 

	@FindBy(id="ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0")
	public  WebElement pdForm; 

	@FindBy(id="ContentPlaceHolder1_ddlPublicDefenders")
	public  WebElement SelectPubdefender;  

	@FindBy(id="ContentPlaceHolder1_btnAssignPD")
	public  WebElement AssignPD;  

	@FindBy(id="btnYes")
	public  WebElement btnYes;

	@FindBy(id="ContentPlaceHolder1_btnPurchaseHistory")
	public  WebElement PurchaseHistory;

	@FindBy(xpath="//a[contains(text(),'Grievances/Requests')]")
	public  WebElement ReqGrievances;

	@FindBy(id="ContentPlaceHolder1_ddlRequestTypeSearch")
	public  WebElement FacilityType;

	@FindBy(id="ContentPlaceHolder1_ddlRequestStatusSearch")
	public  WebElement FacilityStatus;

	@FindBy(xpath="//label[contains(text(),' The requested visitor is former inmate')]")
	public  WebElement chkFormerInmate; 

	@FindBy(id="ContentPlaceHolder1_grvVisitorDetails_txtOthersInfo_0")
	public  WebElement OthersTxtBox; 

	@FindBy(id="ContentPlaceHolder1_grvVisitorDetails_txtOthersInfo_1")
	public  WebElement OthersTxtBox1; 

	@FindBy(name="ctl00$ContentPlaceHolder1$btnResubmit")
	public  WebElement SubmitBtn;

	@FindBy(id="ContentPlaceHolder1_txtInvestigation")
	public  WebElement InvestigationTxt;

	@FindBy(id="ContentPlaceHolder1_txtReviewFindings")
	public  WebElement ReviewFindingTxt;

	@FindBy(id="ContentPlaceHolder1_txtSupervisorSignature")
	public  WebElement SupervisorSign;

	@FindBy(id="ContentPlaceHolder1_txtReviewTitle") 
	public WebElement ReviewTitle;

	@FindBy(id="btnSaveRemedyForm") 
	public WebElement btnSaveRemedyForm; 

	@FindBy(id="ContentPlaceHolder1_btnBack") 
	public WebElement BackBtn;  

	@FindBy(id="ContentPlaceHolder1_btnBackForum") 
	public WebElement BackBtn1;

	@FindBy(xpath="//*[contains(text(),'Documents')]") 
	public WebElement Documents;

	@FindBy(id="ContentPlaceHolder1_btnUploadDocuments") 
	public WebElement UploadDocuments;

	@FindBy(id="ContentPlaceHolder1_uctlAddRelationShip_txtRelationShip") 
	public WebElement RelationShip;

	@FindBy(id="btnSubmit") 
	public WebElement SaveBtn;

	@FindBy(id="ContentPlaceHolder1_btnUpload") 
	public WebElement UploadBtn;

	@FindBy(id="ContentPlaceHolder1_txtTitle") 
	public WebElement DocsTitle;

	@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtUserFirstName']") 
	public WebElement UserFName;
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtUserLastName']") 
	public WebElement UserLName;
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtID']") 
	public WebElement InmatesId;
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_txtDob']") 
	public WebElement Date;
	
	@FindBy(id="ContentPlaceHolder1_btnBack") 
	public WebElement Back;

	@FindBy(id="lnkDocumentTitle") 
	public WebElement DocTitle;

	@FindBy(id="//*[@id='example']/tbody/tr[5]/td[1]") 
	public WebElement InmateId;

	@FindBy(id="ContentPlaceHolder1_btnRotate90") 
	public WebElement btnRotate90;

	@FindBy(id="ContentPlaceHolder1_btnRotate180") 
	public WebElement btnRotate180;

	@FindBy(id="ContentPlaceHolder1_btnRotate270") 
	public WebElement btnRotate270;

	@FindBy(id="rptUser_menuAnchor_2") 
	public WebElement LockDown;

	@FindBy(id="rptUser_menuAnchor_3") 
	public WebElement InMate;

	@FindBy(id="ContentPlaceHolder1_btnInmatesInfoToInmatesBack") 
	public WebElement inmateBack;

	@FindBy(id="btnSearch") 
	public WebElement btnSearch;

	@FindBy(id="ContentPlaceHolder1_ddlInmateStatusSearch") 
	public WebElement InmateStatuses;

	@FindBy(id="ContentPlaceHolder1_txtFrequencyLimits") 
	public WebElement FrequencyLimit; 

	@FindBy(id="ContentPlaceHolder1_txtNote") 
	public WebElement Notes; 

	@FindBy(id="ContentPlaceHolder1_txtInvestigatorEmail") 
	public WebElement InvestigatorEmail;  

	@FindBy(id="btnSaveInmateInformation") 
	public WebElement SaveInmate;

	@FindBy(id="ContentPlaceHolder1_txtInmateIDSearch") 
	public WebElement Inmate_Id;

	@FindBy(name="ctl00$ContentPlaceHolder1$txtRelationShip") 
	public WebElement Relationship;

	@FindBy(id="ContentPlaceHolder1_btnCircle") 
	public WebElement AddtoContacts;

	@FindBy(id="ContentPlaceHolder1_ddlPodCodeSearch") 
	public WebElement Pod_search;

	@FindBy(xpath="//*[@id='ContentPlaceHolder1_anchrMessages']/i/span") 
	public WebElement Messages;

	@FindBy(id="ddlPublicUserLastNameSearch_chosen") 
	public WebElement LastNameInmate;

	@FindBy(xpath="//*[@id='ddlPublicUserLastNameSearch_chosen']/div/div/input") 
	public WebElement PubLastNameInmate;

	@FindBy(xpath="//*[@id='ddlPublicUserLastNameSearch_chosen']/div/div/input") 
	public WebElement AutoCompleteLastName;

	@FindBy(id="ddlPublicUserFirstNameSearch_chosen") 
	public WebElement FirstNameInmate;

	@FindBy(xpath="//*[@id='ddlPublicUserFirstNameSearch_chosen']/div/div/input") 
	public WebElement AutoCompleteFirstName;

	@FindBy(id="btnSearchMessages") 
	public WebElement SearchMsg;

	@FindBy(id="lnkbtnTranslate") 
	public WebElement BtnTranslate;

	@FindBy(id="rptUser_menuAnchor_7") 
	public WebElement PhotosBtn;

	@FindBy(id="ContentPlaceHolder1_btnBack") 
	public WebElement BackButton;

	@FindBy(id="ContentPlaceHolder1_anchrPhotos") 
	public WebElement Photos;

	@FindBy(id="ddlPublicUserLast_chosen") 
	public WebElement LastNamePhotos;

	@FindBy(id="ddlPublicUserFirst_chosen") 
	public WebElement FirstNamePhotos;

	@FindBy(xpath="//*[@id='ddlPublicUserLast_chosen']/div/div/input") 
	public WebElement AutoCompLastNamePhoto;

	@FindBy(xpath="//*[@id='ddlPublicUserFirst_chosen']/div/div/input") 
	public WebElement AutoCompFirstNamePhoto;

	@FindBy(id="btnSearchPhotos") 
	public WebElement btnSearchPhotos;

	@FindBy(id="ContentPlaceHolder1_btnBack") 
	public WebElement Back1;

	@FindBy(id="ContentPlaceHolder1_achrConnectionRequestsInfo") 
	public WebElement ConnectionRequest;

	@FindBy(id="ContentPlaceHolder1_btnBackFromInvite") 
	public WebElement Back2;

	@FindBy(id="rptUser_menuAnchor_4") 
	public WebElement PublicUsers;

	@FindBy(id="ddlLastNameSearch_chosen") 
	public WebElement LastNameSrch;

	@FindBy(xpath="//*[@id='ddlLastNameSearch_chosen']/div/div/input") 
	public WebElement AutoCompLastNameSrch;

	@FindBy(id="ddlFirstNameSearch_chosen") 
	public WebElement FrstNameSrch;

	@FindBy(xpath="//*[@id='ddlFirstNameSearch_chosen']/div/div/input") 
	public WebElement AutoCompFrstNameSrch;

	@FindBy(id="ContentPlaceHolder1_txtNotes") 
	public WebElement TxtNotes;

	@FindBy(id="ContentPlaceHolder1_anchrMessages") 
	public WebElement PubUserMessage;

	@FindBy(xpath="//*[@id='ddlInmateLastNameSearch_chosen']") 
	public WebElement InmateLastNameSearch;

	@FindBy(xpath="//*[@id='ddlInmateLastNameSearch_chosen']/div/div/input") 
	public WebElement InmateAutoLastName;

	@FindBy(id="ddlInmateFirstNameSearch_chosen") 
	public WebElement InmateFirstNameSearch;

	@FindBy(xpath="//*[@id='ddlInmateFirstNameSearch_chosen']/div/div/input") 
	public WebElement InmateAutoFirstName;

	@FindBy(id="ContentPlaceHolder1_anchrPhotos") 
	public WebElement PubUserPhotos;

	@FindBy(id="ddlInmate") 
	public WebElement InmateName;

	@FindBy(name="ctl00$ContentPlaceHolder1$ddlInmate") 
	public WebElement SelectInmate;

	@FindBy(id="ContentPlaceHolder1_txtTitle") 
	public WebElement Subject;

	@FindBy(id="ddlInmateLastSearch_chosen") 
	public WebElement InmateLastSearch;

	@FindBy(id="ddlInmateFirstSearch_chosen") 
	public WebElement InmateFrstSearch;

	@FindBy(xpath=" //*[@id='ddlInmateLastSearch_chosen']/div/div/input") 
	public WebElement InmateAutoLastSearch;

	@FindBy(xpath="//*[@id='ddlInmateFirstSearch_chosen']/div/div/input") 
	public WebElement InmateAutoFrstSearch;

	@FindBy(id="ContentPlaceHolder1_btnPhotosToInmatesBack") 
	public WebElement Back3;

	@FindBy(id="rptUser_menuAnchor_8") 
	public WebElement Keywords;

	@FindBy(id="ContentPlaceHolder1_bnAddKeyword") 
	public WebElement AddKeyword;

	@FindBy(id="ContentPlaceHolder1_txtKeyword") 
	public WebElement KeywordTxt;

	@FindBy(id="ContentPlaceHolder1_ddlWebUserAction") 
	public WebElement WebUserAction; 

	@FindBy(id="ContentPlaceHolder1_ddlInmateAction") 
	public WebElement InmateAction;

	@FindBy(id="ContentPlaceHolder1_ddlFilterType") 
	public WebElement FilterType;

	@FindBy(id="ContentPlaceHolder1_ddlActiveStatusSearch") 
	public WebElement WebUserStatusSearch; 

	@FindBy(id="ContentPlaceHolder1_txtMessageKeywordSearch") 
	public WebElement WebUserkeywordSearch;  

	@FindBy(id="ContentPlaceHolder1_ddlWebUserActionSearch") 
	public WebElement WebUserActionSearch; 

	@FindBy(id="ContentPlaceHolder1_ddlInmateActionSearch") 
	public WebElement InmateActionSearch; 

	@FindBy(id="ContentPlaceHolder1_ddlActiveStatusSearch") 
	public WebElement StatusSearch; 

	@FindBy(id="ContentPlaceHolder1_ddlFilterTypeSearch") 
	public WebElement FilterSearch;

	@FindBy(id="rptUser_menuAnchor_9") 
	public WebElement Notices;

	@FindBy(id="rptUser_menuAnchor_15") 
	public WebElement Notices_1;

	@FindBy(id="ContentPlaceHolder1_btnAddNotice") 
	public WebElement AddNotices;

	@FindBy(name="ctl00$ContentPlaceHolder1$txtTitle") 
	public WebElement txtTitle;

	@FindBy(id="ContentPlaceHolder1_Editor1_ctl02_ctl01") 
	public WebElement txtDescription;

	@FindBy(id="ContentPlaceHolder1_txtStartDate") 
	public WebElement StartDate;

	@FindBy(id="ContentPlaceHolder1_editor") 
	public WebElement PUMessageBody;

	@FindBy(id="ContentPlaceHolder1_Editor1_ctl02_ctl01") 
	public WebElement Descriptions;

	@FindBy(id="btnSend") 
	public WebElement btnSend;

	@FindBy(id="ContentPlaceHolder1_txtEndDate") 
	public WebElement EndDate;

	@FindBy(id="rptUser_menuAnchor_10") 
	public WebElement Reporting;

	@FindBy(id="ContentPlaceHolder1_ddlRequestTypeSearch") 
	public WebElement Type;

	@FindBy(id="ContentPlaceHolder1_ddlRequestStatusSearch") 
	public WebElement Status;

	@FindBy(id="rptUser_menuAnchor_6") 
	public WebElement Messages1; 

	@FindBy(id="rptUser_menuAnchor_12") 
	public WebElement Messages2;

	@FindBy(xpath="//*[@id='ddlInmateLastNameSearch_chosen']/div/div/input") 
	public WebElement InmLstName; 	

	@FindBy(xpath="//*[@id='ddlInmateFirstNameSearch_chosen']/div/div/input") 
	public WebElement InmFrstName;

	@FindBy(xpath="//*[@id='ddlPublicUserFirstNameSearch_chosen']/div/div/input") 
	public WebElement PubFrstName;

	@FindBy(id="ContentPlaceHolder1_txtMessageFromDateSearch") 
	public WebElement FromDate; 

	@FindBy(id="ContentPlaceHolder1_txtPhotoFromDateSearch") 
	public WebElement FromDatePh;

	@FindBy(id="ContentPlaceHolder1_txtPhotoToDateSearch") 
	public WebElement ToDatePh;

	@FindBy(id="ContentPlaceHolder1_txtMessageToDateSearch") 
	public WebElement ToDate;

	@FindBy(id="ContentPlaceHolder1_ddlMessageDirectionSearch") 
	public WebElement Direction;

	@FindBy(id="ContentPlaceHolder1_ddlMessageFlag") 
	public WebElement Flags;

	@FindBy(id="ContentPlaceHolder1_ddlInmateStatus") 
	public WebElement InmateStatus;

	@FindBy(id="ContentPlaceHolder1_ddlStatusSearch") 
	public WebElement SearchStatus;

	@FindBy(id="ContentPlaceHolder1_ddlKioskSearch") 
	public WebElement KioskSearch;

	@FindBy(id="ContentPlaceHolder1_txtStartDateSearch") 
	public WebElement StartDateSearch;

	@FindBy(id="ContentPlaceHolder1_txtEndDateSearch") 
	public WebElement EndDateSearch;

	@FindBy(id="ContentPlaceHolder1_ddlActiveStatusSearch") 
	public WebElement ActiveStatusSearch;

	@FindBy(id="ContentPlaceHolder1_txtTitleSearch") 
	public WebElement DocuTitle;

	@FindBy(id="ContentPlaceHolder1_ddlStatusSearch") 
	public WebElement DocuStatus;

	@FindBy(id="ContentPlaceHolder1_txtFromDateSearch") 
	public WebElement Fromdate;

	@FindBy(id="ContentPlaceHolder1_txtToDateSearch") 
	public WebElement Todate;

	@FindBy(xpath="//*[@id='achrSentItems']") 
	public WebElement SentItems1;

	@FindBy(xpath="//*[@id='txtSearchNew']") 
	public WebElement SearchPhoto;

	@FindBy(id="ContentPlaceHolder1_photosInfo") 
	public WebElement PUPhotos;

	@FindBy(xpath="//*[@id='achrSentItems']") 
	public WebElement SentItems;

	@FindBy(xpath="//*[@id='achrFindInmates']") 
	public WebElement FindInmate;

	@FindBy(xpath="//*[@id='achrMyContacts']") 
	public WebElement MyContacts;

	@FindBy(xpath="//*[@id='txtSearchNew']") 
	public WebElement SearchInbox;

	@FindBy(xpath="//*[@id='divPopup']/div[3]") 
	public WebElement OKBtn;
	
	@FindBy(id="txtReplyMessage") 
	public WebElement ReplyMessage;

	@FindBy(xpath="//*[@id='divInboxChatCommunication']/div/div[3]/p/img") 
	public WebElement SendMsg;

	@FindBy(xpath="//*[@id='achrCODPending']") 
	public WebElement CODPending;
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_btnsentmsg']") 
	public WebElement CODSentMsg;
	
	@FindBy(xpath="//*[@id='btnOk']") 
	public WebElement BtnOk;
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_lnkbtnApproveAll']") 
	public WebElement ApproveAll;
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_lnkBtnApprovePhotos']") 
	public WebElement ApproveAllPhotos;
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_lnkRejectAll']") 
	public WebElement IgnoreAll;
	
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_btnrecmsg']") 
	public WebElement CODReceivedMsg;
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_btnsentphoto']") 
	public WebElement CODSentPhotos;
	
	@FindBy(xpath="//*[@id='achrMenuArchive']") 
	public WebElement Archievd;
	
	@FindBy(xpath="//*[@id='ulMenu']/li[2]") 
	public WebElement Archievd1;
	
	@FindBy(xpath="//*[@id='divPopup']/div[3]") 
	public WebElement BtnOkk;

	@FindBy(xpath="//*[@id='divPopupYoN']/div[3]/div[1]") 
	public WebElement YesBtn; 

	@FindBy(xpath="//*[@id='divPopupYoN']/div[3]/div[2]") 
	public WebElement NoBtn;

	@FindBy(xpath="//*[@id='txtSearchNew']") 
	public WebElement SearchArchived;
	
	@FindBy(xpath="//*[@id='divInboxChatList']/div/div[4]/label[2]") 
	public WebElement LoadMore;
	
	@FindBy(xpath="//*[@id='txtReplyMessage']") 
	public WebElement ReplyMessage1;
	
	@FindBy(xpath="//*[@id='divInboxChatCommunication']/div/div[3]/p/img") 
	public WebElement Send;
	
	@FindBy(xpath="//*[@id='divPopup']/div[3]") 
	public WebElement OkBtn;
	
	@FindBy(xpath="//*[@id='purchaseCredit']") 
	public WebElement PurchaseCredit;
	
	
	
	public POM_PubDefender(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void scroll()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)", "");
	}

	public void scroll1500()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,3000)", "");
	}
	public void scrollup1500()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-3000)", "");
	}
	public void replyModePdf1() throws InterruptedException
	{
		List<WebElement> rplyModePdf1=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstForumReplyMode"));
		int b1=rplyModePdf1.size();
		for(int i=0;i<b1;i++)
		{
			//	Thread.sleep(1000);
			//	rplyModePdf1=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstForumReplyMode"));
			try {
				//Thread.sleep(1000);
				rplyModePdf1.get(1).click();
				Thread.sleep(1000);
				ChoosePdf1.sendKeys("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\cert.pdf");
				Thread.sleep(1000);
				SubmitReply1.click();
				btnOk.click();
			} catch (org.openqa.selenium.StaleElementReferenceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void replyModetext1(DataTable rplyMsg ) throws InterruptedException 
	{
		Thread.sleep(2000);

		List<List<String>>tt=rplyMsg.raw();
		List<WebElement> rplyModeTxt1=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstForumReplyMode"));
		int a1=rplyModeTxt1.size();                                

		for(int i=0;i<a1;i++)
		{
			//	Thread.sleep(1000);
			//	rplyModeTxt1=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstForumReplyMode"));
			try {
				//	Thread.sleep(1000);
				rplyModeTxt1.get(0).click();
				Thread.sleep(1000);
				Description.clear();
				Description.sendKeys(tt.get(0).get(1));
				SubmitReply1.click();
				btnOk.click();
			} catch (org.openqa.selenium.StaleElementReferenceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void replyModeBoth1(DataTable rplyMsg ) throws InterruptedException
	{
		List<List<String>>tb=rplyMsg.raw();
		List<WebElement> rplyModeBoth1=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstForumReplyMode"));
		int c1=rplyModeBoth1.size();
		for(int i=0;i<c1;i++)
		{
			try {
				rplyModeBoth1.get(2).click();
				Thread.sleep(1000);
				ChoosePdf1.sendKeys("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\cert.pdf");
				Thread.sleep(1000);
				Description.clear();
				Description.sendKeys(tb.get(0).get(1));
				SubmitReply1.click();
				btnOk.click();
			} catch (org.openqa.selenium.StaleElementReferenceException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		}
	}
	public void replyModePdf2() throws InterruptedException
	{
		List<WebElement> rplyModePdf2=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstReplyMode"));
		int b2=rplyModePdf2.size();
		for(int i=0;i<b2;i++)
		{
			Thread.sleep(1000);

			rplyModePdf2.get(1).click();
			Thread.sleep(1000);
			ChoosePdf2.sendKeys("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\cert.pdf");
			Thread.sleep(700);
			btnForumPDFSave.click();
			Thread.sleep(700);
			btnOk.click();
		}
	}
	public void replyModetext2(DataTable rplyMsg2) throws InterruptedException 
	{

		List<List<String>>tt2=rplyMsg2.raw();
		List<WebElement> rplyModeTxt2=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstReplyMode"));
		int a2=rplyModeTxt2.size();                                
		for(int i=0;i<a2;i++)
		{
			rplyModeTxt2.get(0).click();
			Thread.sleep(1500);
			Description1.sendKeys(tt2.get(9).get(1));
			Thread.sleep(700);
			btnSaveTxt.click();
			Thread.sleep(700);
			btnOk.click();
			break;
		}

	}
	public void replyModeBoth2(DataTable rplyMsg2 ) throws InterruptedException
	{
		List<List<String>>tb2=rplyMsg2.raw();
		List<WebElement> rplyModeBoth2=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rdolstReplyMode"));
		int c2=rplyModeBoth2.size();
		for(int i=0;i<c2;i++)
		{
			try {
				rplyModeBoth2.get(2).click();
				Thread.sleep(1000);
				ChoosePdfBoth.sendKeys("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\cert.pdf");
				ScrollsUp250();
				Thread.sleep(500);
				DescriptionBoth.sendKeys(tb2.get(9).get(1));
				Thread.sleep(2000);
				btnSaveBoth.click();
				Thread.sleep(1000);
				btnOk.click();
			} catch (org.openqa.selenium.StaleElementReferenceException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		}
	}
	public void ScrollsUp250()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}
	public void SortTitle() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvDocuments']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING TITLE:");
		Thread.sleep(1000);
		List<WebElement> sorttitle=driver.findElements(By.id("lnkDocumentTitle"));
		Thread.sleep(1000);
		for(int i=0;i<sorttitle.size();i++)
		{
			Thread.sleep(1000);
			sorttitle=driver.findElements(By.id("lnkDocumentTitle"));
			System.out.println(sorttitle.get(i).getText());
		}
	}
	public void SortDocument() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvDocuments']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING DOCUMENTS:");
		Thread.sleep(1000);
		List<WebElement> sortdocument=driver.findElements(By.id("lnkDocumentFileName"));
		Thread.sleep(1000);
		for(int i=0;i<sortdocument.size();i++)
		{
			Thread.sleep(1000);
			sortdocument=driver.findElements(By.id("lnkDocumentFileName"));
			System.out.println(sortdocument.get(i).getText());
		}
	}
	public void SortDate() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvDocuments']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING DATE:");
		Thread.sleep(1000);
		List<WebElement> sortdate=driver.findElements(By.id("lblDocumentUploadDate"));
		Thread.sleep(1000);
		for(int i=0;i<sortdate.size();i++)
		{
			Thread.sleep(1000);
			sortdate=driver.findElements(By.id("lblDocumentUploadDate"));
			System.out.println(sortdate.get(i).getText());
		}
	}
	public void SortStatus() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvDocuments']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("SORTING STATUS:");
		Thread.sleep(1000);
		List<WebElement> sortstatus=driver.findElements(By.id("imgStatus"));
		Thread.sleep(1000);
		for(int i=0;i<sortstatus.size();i++)
		{
			Thread.sleep(1000);
			sortstatus=driver.findElements(By.id("imgStatus"));
			System.out.println(sortstatus.get(i).getAttribute("title"));
		}
	}
	public void Sort_LockDown_Kiosk_Inmate_Setting() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdownAllSetting']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING PERMISSIONS:");
		Thread.sleep(1000);
		List<WebElement> sortstatus=driver.findElements(By.id("lblLockDownName"));
		Thread.sleep(1000);
		for(int i=0;i<sortstatus.size();i++)
		{
			Thread.sleep(1000);
			sortstatus=driver.findElements(By.id("lblLockDownName"));
			System.out.println(sortstatus.get(i).getText());
		}
	}
	public void Sort_LockDown_Kiosk_Inmate_Status() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdownAllSetting']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING STATUS:");
		Thread.sleep(1000);
		List<WebElement> sortstatus=driver.findElements(By.id("imgStatus"));
		Thread.sleep(1000);
		for(int i=0;i<sortstatus.size();i++)
		{
			Thread.sleep(1000);
			sortstatus=driver.findElements(By.id("imgStatus"));
			System.out.println(sortstatus.get(i).getAttribute("title"));
		}
	}

	public void Sort_LockDown_Kiosk_Inmate_LastAction() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdownAllSetting']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("SORTING LASTACTION:");
		Thread.sleep(1000);
		List<WebElement> sortLastAction=driver.findElements(By.id("lblLastAction"));
		Thread.sleep(1000);
		for(int i=0;i<sortLastAction.size();i++)
		{
			Thread.sleep(1000);
			sortLastAction=driver.findElements(By.id("lblLastAction"));
			System.out.println(sortLastAction.get(i).getText());
		}
	}
	public void Sort_LockDown_Kiosk_LockDown_Info_KioskCode() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING KIOSKCODE:");
		Thread.sleep(1000);
		List<WebElement> sortKiosksCode=driver.findElements(By.id("lblKiosksCode"));
		Thread.sleep(1000);
		for(int i=0;i<sortKiosksCode.size();i++)
		{
			Thread.sleep(1000);
			sortKiosksCode=driver.findElements(By.id("lblKiosksCode"));
			System.out.println(sortKiosksCode.get(i).getText());
		}
	}
	public void Sort_LockDown_Kiosk_LockDown_Info_POD() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING POD:");
		Thread.sleep(1000);
		List<WebElement> sortpod=driver.findElements(By.id("lblPodName"));
		Thread.sleep(1000);
		for(int i=0;i<sortpod.size();i++)
		{
			Thread.sleep(1000);
			sortpod=driver.findElements(By.id("lblPodName"));
			System.out.println(sortpod.get(i).getText());
		}
	}
	public void Sort_LockDown_Kiosk_LockDown_ComputerName() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKiosksLockdown']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("SORTING COMPUTERNAME:");
		Thread.sleep(1000);
		List<WebElement> sortcomputer=driver.findElements(By.id("lblComputerName"));
		Thread.sleep(1000);
		for(int i=0;i<sortcomputer.size();i++)
		{
			Thread.sleep(1000);
			sortcomputer=driver.findElements(By.id("lblComputerName"));
			System.out.println(sortcomputer.get(i).getText());
		}
	}
	public void Sort_Inmates_Id() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING INMATE ID:");
		Thread.sleep(1000);
		List<WebElement> sortinmateid=driver.findElements(By.id("lnkInmateResidentId"));
		Thread.sleep(1000);
		for(int i=0;i<sortinmateid.size();i++)
		{
			Thread.sleep(1000);
			sortinmateid=driver.findElements(By.id("lnkInmateResidentId"));
			System.out.println(sortinmateid.get(i).getText());
		}
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[12]/td/table/tbody/tr/td[2]/a")).click();
		List<WebElement> sortinmateid1=driver.findElements(By.id("lnkInmateResidentId"));
		Thread.sleep(1000);
		for(int i=0;i<sortinmateid1.size();i++)
		{
			Thread.sleep(1000);
			sortinmateid1=driver.findElements(By.id("lnkInmateResidentId"));
			System.out.println(sortinmateid1.get(i).getText());
		}
	}
	public void Sort_Inmate_LastName() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING INMATE LASTNAME:");
		Thread.sleep(1000);
		List<WebElement> sortLastName=driver.findElements(By.id("lblLastName"));
		Thread.sleep(1000);
		for(int i=0;i<sortLastName.size();i++)
		{
			Thread.sleep(1000);
			sortLastName=driver.findElements(By.id("lblLastName"));
			System.out.println(sortLastName.get(i).getText());
		}
		Thread.sleep(1000);
		scroll();
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[12]/td/table/tbody/tr/td[2]/a")).click();
		List<WebElement> sortLastName1=driver.findElements(By.id("lblLastName"));
		Thread.sleep(1000);
		for(int i=0;i<sortLastName1.size();i++)
		{
			Thread.sleep(1000);
			sortLastName1=driver.findElements(By.id("lblLastName"));
			System.out.println(sortLastName1.get(i).getText());
		}
	}

	public void Sort_Inmate_FirstName() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING INMATE FIRSTNAME:");
		Thread.sleep(1000);
		List<WebElement> sortFirstName=driver.findElements(By.id("lblFirstName"));
		Thread.sleep(1000);
		for(int i=0;i<sortFirstName.size();i++)
		{
			Thread.sleep(1000);
			sortFirstName=driver.findElements(By.id("lblFirstName"));
			System.out.println(sortFirstName.get(i).getText());
		}
		Thread.sleep(1000);
		scroll();
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[12]/td/table/tbody/tr/td[2]/a")).click();
		List<WebElement> sortFirstName1=driver.findElements(By.id("lblFirstName"));
		Thread.sleep(1000);
		for(int i=0;i<sortFirstName1.size();i++)
		{
			Thread.sleep(1000);
			sortFirstName1=driver.findElements(By.id("lblFirstName"));
			System.out.println(sortFirstName1.get(i).getText());
		}
	}
	public void Sort_Inmate_POD() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("SORTING INMATE POD:");
		Thread.sleep(1000);
		List<WebElement> sortPOD=driver.findElements(By.id("lblPodCode"));
		Thread.sleep(1000);
		for(int i=0;i<sortPOD.size();i++)
		{
			Thread.sleep(1000);
			sortPOD=driver.findElements(By.id("lblPodCode"));
			System.out.println(sortPOD.get(i).getText());
		}
		Thread.sleep(1000);
		scroll();
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[12]/td/table/tbody/tr/td[2]/a")).click();
		List<WebElement> sortPOD1=driver.findElements(By.id("lblPodCode"));
		Thread.sleep(1000);
		for(int i=0;i<sortPOD1.size();i++)
		{
			Thread.sleep(1000);
			sortPOD1=driver.findElements(By.id("lblPodCode"));
			System.out.println(sortPOD1.get(i).getText());
		}
	}

	public void Sort_Inmate_Gender() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[1]/th[5]/a")).click();
		System.out.println("SORTING INMATE GENDER:");
		Thread.sleep(1000);
		List<WebElement> sortgender=driver.findElements(By.id("lblGender"));
		Thread.sleep(1000);
		for(int i=0;i<sortgender.size();i++)
		{
			Thread.sleep(1000);
			sortgender=driver.findElements(By.id("lblGender"));
			System.out.println(sortgender.get(i).getText());
		}
		Thread.sleep(1000);
		scroll();
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[12]/td/table/tbody/tr/td[2]/a")).click();
		List<WebElement> sortgender1=driver.findElements(By.id("lblGender"));
		Thread.sleep(1000);
		for(int i=0;i<sortgender1.size();i++)
		{
			Thread.sleep(1000);
			sortgender1=driver.findElements(By.id("lblGender"));
			System.out.println(sortgender1.get(i).getText());
		}
	}
	public void Sort_Inmate_DOB() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[1]/th[6]/a")).click();
		System.out.println("SORTING INMATE DOB:");
		Thread.sleep(1000);
		List<WebElement> sortdob=driver.findElements(By.id("lblDOB"));
		Thread.sleep(1000);
		for(int i=0;i<sortdob.size();i++)
		{
			Thread.sleep(1000);
			sortdob=driver.findElements(By.id("lblDOB"));
			System.out.println(sortdob.get(i).getText());
		}
		Thread.sleep(1000);
		scroll();
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[12]/td/table/tbody/tr/td[2]/a")).click();
		List<WebElement> sortdob1=driver.findElements(By.id("lblDOB"));
		Thread.sleep(1000);
		for(int i=0;i<sortdob1.size();i++)
		{
			Thread.sleep(1000);
			sortdob1=driver.findElements(By.id("lblDOB"));
			System.out.println(sortdob1.get(i).getText());
		}
	}
	public void Sort_Inmate_FreeCredits() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[1]/th[7]/a")).click();
		System.out.println("SORTING INMATE FREECREDITS:");
		Thread.sleep(1000);
		List<WebElement> sortFreeCredits=driver.findElements(By.id("lblFreeCredits"));
		Thread.sleep(1000);
		for(int i=0;i<sortFreeCredits.size();i++)
		{
			Thread.sleep(1000);
			sortFreeCredits=driver.findElements(By.id("lblFreeCredits"));
			System.out.println(sortFreeCredits.get(i).getText());
		}
		Thread.sleep(1000);
		scroll();
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[12]/td/table/tbody/tr/td[2]/a")).click();
		List<WebElement> sortFreeCredits1=driver.findElements(By.id("lblFreeCredits"));
		Thread.sleep(1000);
		for(int i=0;i<sortFreeCredits1.size();i++)
		{
			Thread.sleep(1000);
			sortFreeCredits1=driver.findElements(By.id("lblFreeCredits"));
			System.out.println(sortFreeCredits1.get(i).getText());
		}
	}
	public void Sort_Inmate_Status() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[1]/th[8]/a")).click();
		System.out.println("SORTING INMATE STATUS:");
		Thread.sleep(1000);
		List<WebElement> sortStatuss=driver.findElements(By.id("imgStatus"));
		Thread.sleep(1000);
		for(int i=0;i<sortStatuss.size();i++)
		{
			Thread.sleep(1000);
			sortStatuss=driver.findElements(By.id("imgStatus"));
			System.out.println(sortStatuss.get(i).getAttribute("title"));
		}
		Thread.sleep(1000);
		scroll();
		driver.findElement(By.xpath("//*[@id='grvInmates']/tbody/tr[12]/td/table/tbody/tr/td[2]/a")).click();
		List<WebElement> sortStatuss1=driver.findElements(By.id("imgStatus"));
		Thread.sleep(1000);
		for(int i=0;i<sortStatuss1.size();i++)
		{
			Thread.sleep(1000);
			sortStatuss1=driver.findElements(By.id("imgStatus"));
			System.out.println(sortStatuss1.get(i).getAttribute("title"));
		}
	}
	public void PublicUser_Search_Username_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvUsers']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING USERNAME:");
		Thread.sleep(1000);
		List<WebElement> sortusername=driver.findElements(By.xpath("//a[@id='lblUserName']"));
		Thread.sleep(1000);
		for(int i=0;i<sortusername.size();i++)
		{
			Thread.sleep(1000);
			sortusername=driver.findElements(By.xpath("//a[@id='lblUserName']"));
			System.out.println(sortusername.get(i).getText());
		}
	}
	public void PublicUser_Search_LastName_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvUsers']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING LASTNAME:");
		Thread.sleep(1000);
		List<WebElement> sortlastname=driver.findElements(By.id("lblLastName"));
		Thread.sleep(1000);
		for(int i=0;i<sortlastname.size();i++)
		{
			Thread.sleep(1000);
			sortlastname=driver.findElements(By.id("lblLastName"));
			System.out.println(sortlastname.get(i).getText());
		}
	}
	public void PublicUser_Search_FirstName_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvUsers']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING FIRSTNAME:");
		Thread.sleep(1000);
		List<WebElement> sortfirstname=driver.findElements(By.id("lblFirstName"));
		Thread.sleep(1000);
		for(int i=0;i<sortfirstname.size();i++)
		{
			Thread.sleep(1000);
			sortfirstname=driver.findElements(By.id("lblFirstName"));
			System.out.println(sortfirstname.get(i).getText());
		}
	}
	public void PublicUser_Search_Email_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvUsers']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("SORTING EMAIL:");
		Thread.sleep(1000);
		List<WebElement> sortemail=driver.findElements(By.id("lblEmail"));
		Thread.sleep(1000);
		for(int i=0;i<sortemail.size();i++)
		{
			Thread.sleep(1000);
			sortemail=driver.findElements(By.id("lblEmail"));
			System.out.println(sortemail.get(i).getText());
		}
	}
	public void PublicUser_Search_City_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvUsers']/tbody/tr[1]/th[5]/a")).click();
		System.out.println("SORTING CITY:");
		Thread.sleep(1000);
		List<WebElement> sortcity=driver.findElements(By.id("lblCity"));
		Thread.sleep(1000);
		for(int i=0;i<sortcity.size();i++)
		{
			Thread.sleep(1000);
			sortcity=driver.findElements(By.id("lblCity"));
			System.out.println(sortcity.get(i).getText());
		}
	}
	public void PublicUser_Search_State_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvUsers']/tbody/tr[1]/th[6]/a")).click();
		System.out.println("SORTING STATE:");
		Thread.sleep(1000);
		List<WebElement> sortstate=driver.findElements(By.id("lblState"));
		Thread.sleep(1000);
		for(int i=0;i<sortstate.size();i++)
		{
			Thread.sleep(1000);
			sortstate=driver.findElements(By.id("lblState"));
			System.out.println(sortstate.get(i).getText());
		}
	}
	public void PublicUser_Search_Connections_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvUsers']/tbody/tr[1]/th[7]/a")).click();
		System.out.println("SORTING CONNECTIONS:");
		Thread.sleep(1000);
		List<WebElement> sortconn=driver.findElements(By.id("lblConnectionAccept"));
		Thread.sleep(1000);
		for(int i=0;i<sortconn.size();i++)
		{
			Thread.sleep(1000);
			sortconn=driver.findElements(By.id("lblConnectionAccept"));
			System.out.println(sortconn.get(i).getText());
		}
	}
	public void Connections_InmateId() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING CONNECTIONS INMATE ID:");
		Thread.sleep(1000);
		List<WebElement> sortconninmateid=driver.findElements(By.id("lblInmateResidentId"));
		Thread.sleep(1000);
		for(int i=0;i<sortconninmateid.size();i++)
		{
			Thread.sleep(1000);
			sortconninmateid=driver.findElements(By.id("lblInmateResidentId"));
			System.out.println(sortconninmateid.get(i).getText());
		}
	}
	public void Connections_InmateName() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING CONNECTIONS INMATE NAME:");
		Thread.sleep(1000);
		List<WebElement> sortconninmatename=driver.findElements(By.id("lblInmateName"));
		Thread.sleep(1000);
		for(int i=0;i<sortconninmatename.size();i++)
		{
			Thread.sleep(1000);
			sortconninmatename=driver.findElements(By.id("lblInmateName"));
			System.out.println(sortconninmatename.get(i).getText());
		}
	}
	public void Connections_InmateStatus() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("SORTING CONNECTIONS INMATE STATUS:");
		Thread.sleep(1000);
		List<WebElement> sortconninmatestatus=driver.findElements(By.id("lblInmateStatus"));
		Thread.sleep(1000);
		for(int i=0;i<sortconninmatestatus.size();i++)
		{
			Thread.sleep(1000);
			sortconninmatestatus=driver.findElements(By.id("lblInmateStatus"));
			System.out.println(sortconninmatestatus.get(i).getText());
		}
	}
	public void Connections_InmateRelationship() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[5]/a")).click();
		System.out.println("SORTING CONNECTIONS INMATE RELATIONSHIP:");
		Thread.sleep(1000);
		List<WebElement> sortconninmaterelation=driver.findElements(By.id("lblRelationShip"));
		Thread.sleep(1000);
		for(int i=0;i<sortconninmaterelation.size();i++)
		{
			Thread.sleep(1000);
			sortconninmaterelation=driver.findElements(By.id("lblRelationShip"));
			System.out.println(sortconninmaterelation.get(i).getText());
		}
	}
	public void Connections_InmateConnStatus() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[6]/a")).click();
		System.out.println("SORTING CONNECTIONS INMATE CONNSTATUS:");
		Thread.sleep(1000);
		List<WebElement> sortconnstatus=driver.findElements(By.id("lblConnectionStatus"));
		Thread.sleep(1000);
		for(int i=0;i<sortconnstatus.size();i++)
		{
			Thread.sleep(1000);
			sortconnstatus=driver.findElements(By.id("lblConnectionStatus"));
			System.out.println(sortconnstatus.get(i).getText());
		}
	}
	public void Connections_InmateConnCreditBalance() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[7]/a")).click();
		System.out.println("SORTING CONNECTIONS INMATE CREDIT BALANCE:");
		Thread.sleep(1000);
		List<WebElement> sortconncredit=driver.findElements(By.id("lblCreditBalance"));
		Thread.sleep(1000);
		for(int i=0;i<sortconncredit.size();i++)
		{
			Thread.sleep(1000);
			sortconncredit=driver.findElements(By.id("lblCreditBalance"));
			System.out.println(sortconncredit.get(i).getText());
		}
	}
	public void Connections_Inmate_Browser() throws InterruptedException
	{
		Thread.sleep(1000);
		//	 driver.findElement(By.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING CONNECTIONS INMATE BROWSER:");
		Thread.sleep(1000);
		List<WebElement> sortconnbrowser=driver.findElements(By.id("lblSigninBrowserType"));
		Thread.sleep(1000);
		for(int i=0;i<sortconnbrowser.size();i++)
		{
			Thread.sleep(1000);
			sortconnbrowser=driver.findElements(By.id("lblSigninBrowserType"));
			System.out.println(sortconnbrowser.get(i).getText());
		}
		driver.findElement(By.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING CONNECTIONS INMATE BROWSER:");
		Thread.sleep(1000);
		List<WebElement> sortconnbrowser1=driver.findElements(By.id("lblSigninBrowserType"));
		Thread.sleep(1000);
		for(int i=0;i<sortconnbrowser1.size();i++)
		{
			Thread.sleep(1000);
			sortconnbrowser1=driver.findElements(By.id("lblSigninBrowserType"));
			System.out.println(sortconnbrowser1.get(i).getText());
		}
		ScrollsUp250();
		Thread.sleep(1000);

		for(int j=2;j<6;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void Connections_IpAddress() throws InterruptedException
	{
		Thread.sleep(1000);
		//	 driver.findElement(By.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING CONNECTIONS INMATE BROWSER:");
		Thread.sleep(1000);
		List<WebElement> sortip=driver.findElements(By.id("lblSigninIPAddress"));
		Thread.sleep(1000);
		for(int i=0;i<sortip.size();i++)
		{
			Thread.sleep(1000);
			sortip=driver.findElements(By.id("lblSigninIPAddress"));
			System.out.println(sortip.get(i).getText());
		}
		driver.findElement(By.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING CONNECTIONS INMATE BROWSER:");
		Thread.sleep(1000);
		List<WebElement> sortip1=driver.findElements(By.id("lblSigninIPAddress"));
		Thread.sleep(1000);
		for(int i=0;i<sortip1.size();i++)
		{
			Thread.sleep(1000);
			sortip1=driver.findElements(By.id("lblSigninIPAddress"));
			System.out.println(sortip1.get(i).getText());
		}
		ScrollsUp250();
		Thread.sleep(1000);

		for(int j=2;j<6;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void Connections_DateTime() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING CONNECTIONS INMATE DATETIME:");
		Thread.sleep(1000);
		List<WebElement> sortdatetime1=driver.findElements(By.id("lblSigninDateTime"));
		Thread.sleep(1000);
		for(int i=0;i<sortdatetime1.size();i++)
		{
			Thread.sleep(1000);
			sortdatetime1=driver.findElements(By.id("lblSigninDateTime"));
			System.out.println(sortdatetime1.get(i).getText());
		}
		ScrollsUp250();
		Thread.sleep(1000);

		for(int j=2;j<6;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}

	}
	public void Message_Sorting() throws InterruptedException
	{
		POM_PubDefender pu = new POM_PubDefender(driver);
		System.out.println("Message Subj Ascending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkSubject']")).click();
		pu.PublicUser_Message_Subj_Sort1();
		System.out.println("Message Subj Descending order");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkSubject']")).click();
		Thread.sleep(1000);
		pu.PublicUser_Message_Subj_Sort1();


		System.out.println("Message From Ascending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkFrom']")).click();
		pu.PublicUser_Message_From_Sort1();
		System.out.println("Message From Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkFrom']")).click();
		Thread.sleep(1000);
		pu.PublicUser_Message_From_Sort1();


		System.out.println("Message To Ascending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkTo']")).click();
		pu.PublicUser_Message_To_Sort1();
		System.out.println("Message To Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkTo']")).click();
		Thread.sleep(1000);
		pu.PublicUser_Message_To_Sort1();


		System.out.println("Message Flag Ascending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkFlag']")).click();
		pu.PublicUser_Message_Flag_Sort1();
		System.out.println("Message Flag Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkFlag']")).click();
		Thread.sleep(1000);
		pu.PublicUser_Message_Flag_Sort1();


		System.out.println("Message Sent Ascending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkSent']")).click();
		pu.PublicUser_Message_Sent_Sort1();
		System.out.println("Message Sent Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkSent']")).click();
		Thread.sleep(1000);
		pu.PublicUser_Message_Sent_Sort1();


		System.out.println("Message Status Ascending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkStatus']")).click();
		pu.PublicUser_Message_Status_Sort1();
		System.out.println("Message Status Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkStatus']")).click();
		Thread.sleep(1000);
		pu.PublicUser_Message_Status_Sort1();

		for(int i=0;i<4;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnMessagesNext']")).click();
		}
		for(int i=0;i<4;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnMessagesPrev']")).click();
		}
	}
	public void PublicUser_Message_Status_Sort1() throws InterruptedException
	{
		{
			for(int i=0;i<10;i++)
			{
				Thread.sleep(1000);
				By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_imgStatus_"+i+"']");
				List<WebElement> myElements = driver.findElements(list11);
				for (WebElement e : myElements) {
					Thread.sleep(1000);
					System.out.println(e.getAttribute("title"));
				}}
		}

	}
	public void PublicUser_Message_Sent_Sort1() throws InterruptedException
	{
		{
			for(int i=0;i<10;i++)
			{
				Thread.sleep(1000);
				By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblSent_"+i+"']");
				List<WebElement> myElements = driver.findElements(list11);
				for (WebElement e : myElements) {
					Thread.sleep(1000);
					System.out.println(e.getText());
				}}
		}

	}
	public void PublicUser_Message_Flag_Sort1() throws InterruptedException
	{
		{
			for(int i=0;i<10;i++)
			{
				Thread.sleep(1000);
				By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_imgFlag_"+i+"']");
				List<WebElement> myElements = driver.findElements(list11);
				for (WebElement e : myElements) {
					Thread.sleep(1000);
					System.out.println(e.getAttribute("src"));
				}}
		}

	}
	public void PublicUser_Message_To_Sort1() throws InterruptedException
	{
		{
			for(int i=0;i<10;i++)
			{
				Thread.sleep(1000);
				By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblTo_"+i+"']");
				List<WebElement> myElements = driver.findElements(list11);
				for (WebElement e : myElements) {
					Thread.sleep(1000);
					System.out.println(e.getText());
				}}
		}

	}
	public void PublicUser_Message_From_Sort1() throws InterruptedException
	{
		{
			for(int i=0;i<10;i++)
			{
				Thread.sleep(1000);
				By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblSubject_"+i+"']");
				List<WebElement> myElements = driver.findElements(list11);
				for (WebElement e : myElements) {
					Thread.sleep(1000);
					System.out.println(e.getText());
				}}
		}

	}
	public void PublicUser_Message_Subj_Sort1() throws InterruptedException
	{
		{
			for(int i=0;i<10;i++)
			{
				Thread.sleep(1000);
				By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblSubject_"+i+"']");
				List<WebElement> myElements = driver.findElements(list11);
				for (WebElement e : myElements) {
					Thread.sleep(1000);
					System.out.println(e.getText());
				}}
		}

	}
	public void PublicUser_Message_Subj_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lnkSubject']")).click();
		System.out.println("SORTING PUBLIC USER MSG SUBJECT:");
		Thread.sleep(1000);
		List<WebElement> sortmsgSubj=driver.findElements(By.id("lblMessageSubject"));
		Thread.sleep(1000);
		for(int i=0;i<sortmsgSubj.size();i++)
		{
			Thread.sleep(1000);
			sortmsgSubj=driver.findElements(By.id("lblMessageSubject"));
			System.out.println(sortmsgSubj.get(i).getText());
		}
		ScrollsUp250();
		Thread.sleep(1000);

		for(int j=2;j<6;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void PublicUser_Message_From_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING PUBLIC USER MSG FROM:");
		Thread.sleep(1000);
		List<WebElement> sortmsgFrom=driver.findElements(By.id("lblMessageFrom"));
		Thread.sleep(1000);
		for(int i=0;i<sortmsgFrom.size();i++)
		{
			Thread.sleep(1000);
			sortmsgFrom=driver.findElements(By.id("lblMessageFrom"));
			System.out.println(sortmsgFrom.get(i).getText());
		}
		ScrollsUp250();
		Thread.sleep(1000);

		for(int j=2;j<6;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void PublicUser_Message_To_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING PUBLIC USER MSG FROM:");
		Thread.sleep(1000);
		List<WebElement> sortmsgTo=driver.findElements(By.id("lblMessageTo"));
		Thread.sleep(1000);
		for(int i=0;i<sortmsgTo.size();i++)
		{
			Thread.sleep(1000);
			sortmsgTo=driver.findElements(By.id("lblMessageTo"));
			System.out.println(sortmsgTo.get(i).getText());
		}
		ScrollsUp250();
		Thread.sleep(1000);

		for(int j=2;j<6;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void PublicUser_Message_Flag_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("SORTING PUBLIC USER MSG FLAG:");
		Thread.sleep(1000);
		List<WebElement> sortmsgflag=driver.findElements(By.id("imgFlag"));
		Thread.sleep(1000);
		for(int i=0;i<sortmsgflag.size();i++)
		{
			Thread.sleep(1000);
			sortmsgflag=driver.findElements(By.id("imgFlag"));
			System.out.println(sortmsgflag.get(i).getAttribute("src"));
		}
		ScrollsUp250();
		Thread.sleep(1000);

		for(int j=2;j<6;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}

	}	
	public void PublicUser_Message_SentOn_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[1]/th[5]/a")).click();
		System.out.println("SORTING PUBLIC USER MSG SENT ON:");
		Thread.sleep(1000);
		List<WebElement> sortmsgSentOn=driver.findElements(By.id("lblMessageSentDate"));
		Thread.sleep(1000);
		for(int i=0;i<sortmsgSentOn.size();i++)
		{
			Thread.sleep(1000);
			sortmsgSentOn=driver.findElements(By.id("lblMessageSentDate"));
			System.out.println(sortmsgSentOn.get(i).getText());
		}
		ScrollsUp250();
		Thread.sleep(1000);

		for(int j=2;j<6;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}	

	public void PublicUser_Message_Status_Sort() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[1]/th[6]/a")).click();
		System.out.println("SORTING PUBLIC USER MSG SENT ON:");
		Thread.sleep(1000);
		List<WebElement> sortmsgSentOn=driver.findElements(By.id("imgStatus"));
		Thread.sleep(1000);
		for(int i=0;i<sortmsgSentOn.size();i++)
		{
			Thread.sleep(1000);
			sortmsgSentOn=driver.findElements(By.id("imgStatus"));
			System.out.println(sortmsgSentOn.get(i).getAttribute("title"));
		}
		ScrollsUp250();
		Thread.sleep(1000);

		for(int j=2;j<6;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}	
	public void PublicUser_Photos_Subject_Sort() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkSubject']")).click();
		System.out.println("SORTING PUBLIC USER PHOTO SUBJECT:");
		Thread.sleep(1000);
		List<WebElement> sortPhotoSubj=driver.findElements(By.id("lblPhotoSubject"));
		Thread.sleep(1000);
		for(int i=0;i<sortPhotoSubj.size();i++)
		{
			Thread.sleep(1000);
			sortPhotoSubj=driver.findElements(By.id("lblPhotoSubject"));
			System.out.println(sortPhotoSubj.get(i).getText());
		}
		/*scroll();
		for(int j=2;j<4;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}*/


	}
	public void PublicUser_Photos_Subject_Sort1() throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
			By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lblPhotoSubject_"+i+"']");
			List<WebElement> myElements = driver.findElements(list11);
			for (WebElement e : myElements) {
				Thread.sleep(1000);
				System.out.println(e.getText());
			}}
	}

	public void PublicUser_Photos_From_Sort1() throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
			By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lblPhotoFrom_"+i+"']");
			List<WebElement> myElements = driver.findElements(list11);
			for (WebElement e : myElements) {
				Thread.sleep(1000);
				System.out.println(e.getText());
			}}
	}
	public void PublicUser_Photos_To_Sort1() throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
			By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lblPhotoTo_"+i+"']");
			List<WebElement> myElements = driver.findElements(list11);
			for (WebElement e : myElements) {
				Thread.sleep(1000);
				System.out.println(e.getText());
			}}
	}
	public void PublicUser_Photos_SentOn_Sort1() throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
			By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lblPhotoSentDate_"+i+"']");
			List<WebElement> myElements = driver.findElements(list11);
			for (WebElement e : myElements) {
				Thread.sleep(1000);
				System.out.println(e.getText());
			}}
	}
	public void PublicUser_Photos_Status_Sort1() throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
			By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_imgStatus_"+i+"']");
			List<WebElement> myElements = driver.findElements(list11);
			for (WebElement e : myElements) {
				Thread.sleep(1000);
				System.out.println(e.getAttribute("title"));
			}}
	}
	public void PublicUser_Photos_From_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPhotosInfo']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING PUBLIC USER PHOTO FROM:");
		Thread.sleep(1000);
		List<WebElement> sortPhotofrom=driver.findElements(By.id("lblPhotoFrom"));
		Thread.sleep(1000);
		for(int i=0;i<sortPhotofrom.size();i++)
		{
			Thread.sleep(1000);
			sortPhotofrom=driver.findElements(By.id("lblPhotoFrom"));
			System.out.println(sortPhotofrom.get(i).getText());
		}
		scroll();
		for(int j=2;j<4;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void PublicUser_Photos_To_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPhotosInfo']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING PUBLIC USER PHOTO TO:");
		Thread.sleep(1000);
		List<WebElement> sortPhotoTo=driver.findElements(By.id("lblPhotoTo"));
		Thread.sleep(1000);
		for(int i=0;i<sortPhotoTo.size();i++)
		{
			Thread.sleep(1000);
			sortPhotoTo=driver.findElements(By.id("lblPhotoTo"));
			System.out.println(sortPhotoTo.get(i).getText());
		}
		scroll();
		for(int j=2;j<4;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}

	public void PublicUser_Photos_SentOn_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPhotosInfo']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("SORTING PUBLIC USER PHOTO SENT_ON:");
		Thread.sleep(1000);
		List<WebElement> sortPhotoSentOn=driver.findElements(By.id("lblPhotoSentDate"));
		Thread.sleep(1000);
		for(int i=0;i<sortPhotoSentOn.size();i++)
		{
			Thread.sleep(1000);
			sortPhotoSentOn=driver.findElements(By.id("lblPhotoSentDate"));
			System.out.println(sortPhotoSentOn.get(i).getText());
		}
		scroll();
		for(int j=2;j<4;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void PublicUser_Photos_Status_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPhotosInfo']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("SORTING PUBLIC USER PHOTO STATUS:");
		Thread.sleep(1000);
		List<WebElement> sortPhotoStatus=driver.findElements(By.id("imgStatus"));
		Thread.sleep(1000);
		for(int i=0;i<sortPhotoStatus.size();i++)
		{
			Thread.sleep(1000);
			sortPhotoStatus=driver.findElements(By.id("imgStatus"));
			System.out.println(sortPhotoStatus.get(i).getAttribute("title"));
		}
		scroll();
		for(int j=2;j<4;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void PublicUser_Keywords_Keyword_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKeywords']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING PUBLIC USER KEYWORDS KEYWORD:");
		Thread.sleep(1000);
		List<WebElement> sortKeywordkw=driver.findElements(By.id("lnkMessageKeywordID"));
		Thread.sleep(1000);
		for(int i=0;i<sortKeywordkw.size();i++)
		{
			Thread.sleep(1000);
			sortKeywordkw=driver.findElements(By.id("lnkMessageKeywordID"));
			System.out.println(sortKeywordkw.get(i).getText());
		}
	}
	public void PublicUser_Keywords_WebUserAction_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKeywords']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING PUBLIC USER KEYWORDS WEBUSERACTION:");
		Thread.sleep(1000);
		List<WebElement> sortKeywordwua=driver.findElements(By.id("lblWebUserAction"));
		Thread.sleep(1000);
		for(int i=0;i<sortKeywordwua.size();i++)
		{
			Thread.sleep(1000);
			sortKeywordwua=driver.findElements(By.id("lblWebUserAction"));
			System.out.println(sortKeywordwua.get(i).getText());
		}
	}
	public void PublicUser_Keywords_InmateAction_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKeywords']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING PUBLIC USER KEYWORDS INMATEACTION:");
		Thread.sleep(1000);
		List<WebElement> sortKeywordia=driver.findElements(By.id("lblInmateAction"));
		Thread.sleep(1000);
		for(int i=0;i<sortKeywordia.size();i++)
		{
			Thread.sleep(1000);
			sortKeywordia=driver.findElements(By.id("lblInmateAction"));
			System.out.println(sortKeywordia.get(i).getText());
		}
	}
	public void PublicUser_Keywords_FilterType_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKeywords']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("SORTING PUBLIC USER KEYWORDS FILTERTYPE:");
		Thread.sleep(1000);
		List<WebElement> sortKeywordft=driver.findElements(By.id("lblKeywordFilterType"));
		Thread.sleep(1000);
		for(int i=0;i<sortKeywordft.size();i++)
		{
			Thread.sleep(1000);
			sortKeywordft=driver.findElements(By.id("lblKeywordFilterType"));
			System.out.println(sortKeywordft.get(i).getText());
		}
	}
	public void PublicUser_Keywords_Status_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvKeywords']/tbody/tr[1]/th[5]/a")).click();
		System.out.println("SORTING PUBLIC USER KEYWORDS STATUS:");
		Thread.sleep(1000);
		List<WebElement> sortKeywordstatus=driver.findElements(By.id("imgStatus"));
		Thread.sleep(1000);
		for(int i=0;i<sortKeywordstatus.size();i++)
		{
			Thread.sleep(1000);
			sortKeywordstatus=driver.findElements(By.id("imgStatus"));
			System.out.println(sortKeywordstatus.get(i).getAttribute("title"));
		}
	}
	public void PublicUser_Notices_Title_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvNotices']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING PUBLIC USER NOTICES TITLE:");
		Thread.sleep(1000);
		List<WebElement> sortNoticeTitle=driver.findElements(By.id("lnkNotices"));
		Thread.sleep(1000);
		for(int i=0;i<sortNoticeTitle.size();i++)
		{
			Thread.sleep(1000);
			sortNoticeTitle=driver.findElements(By.id("lnkNotices"));
			System.out.println(sortNoticeTitle.get(i).getText());
		}
		for(int j=2;j<5;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void PublicUser_Notices_StartFrom_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvNotices']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING PUBLIC USER NOTICES STARTFROM:");
		Thread.sleep(1000);
		List<WebElement> sortNoticestartfrom=driver.findElements(By.id("lblStartDate"));
		Thread.sleep(1000);
		for(int i=0;i<sortNoticestartfrom.size();i++)
		{
			Thread.sleep(1000);
			sortNoticestartfrom=driver.findElements(By.id("lblStartDate"));
			System.out.println(sortNoticestartfrom.get(i).getText());
		}
		for(int j=2;j<5;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void PublicUser_Notices_EndBy_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvNotices']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING PUBLIC USER NOTICES STARTFROM:");
		Thread.sleep(1000);
		List<WebElement> sortNoticeEndby=driver.findElements(By.id("lblEndDate"));
		Thread.sleep(1000);
		for(int i=0;i<sortNoticeEndby.size();i++)
		{
			Thread.sleep(1000);
			sortNoticeEndby=driver.findElements(By.id("lblEndDate"));
			System.out.println(sortNoticeEndby.get(i).getText());
		}
		for(int j=2;j<5;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void PublicUser_Notices_status_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvNotices']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING PUBLIC USER NOTICES STARTFROM:");
		Thread.sleep(1000);
		List<WebElement> sortNoticeStatus=driver.findElements(By.id("imgStatus"));
		Thread.sleep(1000);
		for(int i=0;i<sortNoticeStatus.size();i++)
		{
			Thread.sleep(1000);
			sortNoticeStatus=driver.findElements(By.id("imgStatus"));
			System.out.println(sortNoticeStatus.get(i).getAttribute("title"));
		}
		for(int j=2;j<5;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void PublicUser_Reporting_Form_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdvwOverAllRequest']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING PUBLIC USER REPORTING FORM:");
		Thread.sleep(1000);
		List<WebElement> sortReportingform=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortReportingform1=driver.findElements(By.className("listtwoGrid"));
		Thread.sleep(1000);
		for(int i=0;i<sortReportingform.size();i++)
		{
			Thread.sleep(1000);
			sortReportingform=driver.findElements(By.className("listoneGrid"));
			sortReportingform1=driver.findElements(By.className("listtwoGrid"));
			System.out.println(sortReportingform.get(i).getText());
			System.out.println("\n");
			System.out.println(sortReportingform1.get(i).getText());
		}
	}
	public void Photos_Subject_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPhotosInfo']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING PHOTOS SUBJECT SORT:");
		Thread.sleep(1000);
		List<WebElement> sortphotoSubj=driver.findElements(By.id("lblPhotoSubject"));
		Thread.sleep(1000);
		for(int i=0;i<sortphotoSubj.size();i++)
		{
			Thread.sleep(1000);
			sortphotoSubj=driver.findElements(By.id("lblPhotoSubject"));
			System.out.println(sortphotoSubj.get(i).getText());
		}
	}
	public void PublicUser_Messages_Subject_Sort() throws InterruptedException 
	{
		Thread.sleep(3000);
		//	driver.findElement(By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[1]/th[1]/a")).click();
		driver.findElement(By.id("ContentPlaceHolder1_lblSubject")).click();
		System.out.println("SORTING PUBLIC USER MESSAGES SUBJECT:");
		Thread.sleep(1000);
		List<WebElement> sortmessagesSubj=driver.findElements(By.id("lblMessageSubject"));
		Thread.sleep(1000);
		for(int i=0;i<sortmessagesSubj.size();i++)
		{
			Thread.sleep(1000);
			sortmessagesSubj=driver.findElements(By.id("lblMessageSubject"));
			System.out.println(sortmessagesSubj.get(i).getText());
		}
	}
	public void PublicUser_Messages_From_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[1]/th[2]/a")).click();
		driver.findElement(By.id("ContentPlaceHolder1_LinkButton1")).click();
		System.out.println("SORTING PUBLIC USER MESSAGES FROM:");
		Thread.sleep(1000);
		List<WebElement> sortmessagesfrom=driver.findElements(By.id("lblMessageFrom"));
		Thread.sleep(1000);
		for(int i=0;i<sortmessagesfrom.size();i++)
		{
			Thread.sleep(1000);
			sortmessagesfrom=driver.findElements(By.id("lblMessageFrom"));
			System.out.println(sortmessagesfrom.get(i).getText());
		}
	}
	public void PublicUser_Messages_To_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[1]/th[3]/a")).click();
		driver.findElement(By.id("ContentPlaceHolder1_LinkButton2")).click();
		System.out.println("SORTING PUBLIC USER MESSAGES TO:");
		Thread.sleep(1000);
		List<WebElement> sortmessagesto=driver.findElements(By.id("lblMessageTo"));
		Thread.sleep(1000);
		for(int i=0;i<sortmessagesto.size();i++)
		{
			Thread.sleep(1000);
			sortmessagesto=driver.findElements(By.id("lblMessageTo"));
			System.out.println(sortmessagesto.get(i).getText());
		}
	}
	public void PublicUser_Messages_Flag_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[1]/th[4]/a")).click();
		driver.findElement(By.id("ContentPlaceHolder1_LinkButton3")).click();
		System.out.println("SORTING PUBLIC USER MESSAGES FLAG:");
		Thread.sleep(1000);
		List<WebElement> sortmessagesto=driver.findElements(By.id("imgFlag"));
		Thread.sleep(1000);
		for(int i=0;i<sortmessagesto.size();i++)
		{

			Thread.sleep(1000);
			sortmessagesto=driver.findElements(By.id("imgFlag"));
			System.out.println(sortmessagesto.get(i).getAttribute("src"));
		}
	}

	public void PublicUser_Messages_SentDate_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[1]/th[5]/a")).click();
		driver.findElement(By.id("ContentPlaceHolder1_LinkButton4")).click();
		System.out.println("SORTING PUBLIC USER MESSAGES SENT DATE:");
		Thread.sleep(1000);
		List<WebElement> sortmessagesSentdate=driver.findElements(By.id("lblMessageSentDate"));
		Thread.sleep(1000);
		for(int i=0;i<sortmessagesSentdate.size();i++)
		{
			Thread.sleep(1000);
			sortmessagesSentdate=driver.findElements(By.id("lblMessageSentDate"));
			System.out.println(sortmessagesSentdate.get(i).getText());
		}
	}
	public void PublicUser_Messages_Status_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//*[@id='grvMessagesInfo']/tbody/tr[1]/th[6]/a")).click();
		driver.findElement(By.id("ContentPlaceHolder1_LinkButton5")).click();
		System.out.println("SORTING PUBLIC USER MESSAGES STATUS:");
		Thread.sleep(1000);
		List<WebElement> sortmessagesSentdate=driver.findElements(By.id("lblMessageSentDate"));
		Thread.sleep(1000);
		for(int i=0;i<sortmessagesSentdate.size();i++)
		{
			Thread.sleep(1000);
			sortmessagesSentdate=driver.findElements(By.id("lblMessageSentDate"));
			System.out.println(sortmessagesSentdate.get(i).getText());
		}
	}
	public void f1_Form_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING FORM f1:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sortformf1=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortform1f1=driver.findElements(By.className("listtwoGrid"));
		Thread.sleep(1000);
		for(int i=0;i<sortformf1.size();i++)
			for(int j=0;j<sortformf1.size();j++)
			{
				Thread.sleep(1000);
				//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
				sortformf1=driver.findElements(By.className("listoneGrid"));
				sortform1f1=driver.findElements(By.className("listtwoGrid"));
				System.out.println(sortformf1.get(i).getText());
				System.out.println(sortform1f1.get(i).getText());

			}
		scroll();
		for(int j=2;j<5;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void f1_Inmate_Sort() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING f1 INMATE:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sortf1inmate=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortf1inmate1=driver.findElements(By.className("listtwoGrid"));
		Thread.sleep(1000);
		for(int i=0;i<sortf1inmate.size();i++)
			for(int j=0;j<sortf1inmate.size();j++)
			{
				Thread.sleep(1000);
				//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
				sortf1inmate=driver.findElements(By.className("listoneGrid"));
				sortf1inmate1=driver.findElements(By.className("listtwoGrid"));
				System.out.println(sortf1inmate.get(i).getText());
				System.out.println(sortf1inmate1.get(j).getText());

			}
		scroll();
		for(int j=2;j<5;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void f1_POD_Sort() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING f1 POD:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sorf1POD=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sorf1POD1=driver.findElements(By.className("listtwoGrid"));
		Thread.sleep(1000);
		for(int i=0;i<sorf1POD.size();i++)
			for(int j=0;j<sorf1POD.size();j++)
			{
				Thread.sleep(1000);
				//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
				sorf1POD=driver.findElements(By.className("listoneGrid"));
				sorf1POD1=driver.findElements(By.className("listtwoGrid"));
				System.out.println(sorf1POD.get(i).getText());
				System.out.println(sorf1POD1.get(j).getText());
			}
	}
	public void f1_POD_Sort1() throws InterruptedException 
	{
		for(int k=0;k<3;k++)
		{
			f1_POD_Sort();
			scroll();
			for(int j=2;j<5;j++)
			{
				List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				for(int i=0;i<ff.size();i++)
				{
					Thread.sleep(1000);
					ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
					Thread.sleep(1000);
					ff.get(i).click();	
				}

			}
		}


	}
	public void f1_created1() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("SORTING f1 CREATED:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sortf1Created=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortf1Created1=driver.findElements(By.className("listtwoGrid"));
		Thread.sleep(1000);
		for(int i=0;i<sortf1Created.size();i++)
			for(int j=0;j<sortf1Created.size();j++)
			{
				Thread.sleep(1000);
				//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
				sortf1Created=driver.findElements(By.className("listoneGrid"));
				sortf1Created1=driver.findElements(By.className("listtwoGrid"));
				System.out.println(sortf1Created.get(i).getText());
				System.out.println(sortf1Created1.get(j).getText());

			}}
	public void f1_Created_Sort1() throws InterruptedException 
	{   for(int k=0;k<3;k++){
		f1_created1();
		scroll();
		for(int j=2;j<5;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}}
	}


	public void f1_RespondedOn() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[5]/a")).click();
		System.out.println("SORTING f1 RESPONDED ON:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sortf1RespondedOn=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortf1RespondedOn1=driver.findElements(By.className("listtwoGrid"));
		Thread.sleep(1000);
		for(int i=0;i<sortf1RespondedOn.size();i++)
			for(int j=0;j<sortf1RespondedOn1.size();j++)
			{
				Thread.sleep(1000);
				//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
				sortf1RespondedOn=driver.findElements(By.className("listoneGrid"));
				sortf1RespondedOn1=driver.findElements(By.className("listtwoGrid"));
				System.out.println(sortf1RespondedOn.get(i).getText());
				System.out.println(sortf1RespondedOn1.get(j).getText());

			}}
	public void f1_RespondedOn_Sort1() throws InterruptedException 
	{   for(int k=1;k<3;k++){
		f1_RespondedOn();
		scroll();

		for(int j=2;j<4;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}}

	public void f1_Status() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[6]/a")).click();
		System.out.println("SORTING f1 STATUS:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sortf1status=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortf1status1=driver.findElements(By.className("listtwoGrid"));

		Thread.sleep(1000);
		for(int i=0;i<sortf1status.size();i++)
		{
			Thread.sleep(1000);
			//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
			sortf1status=driver.findElements(By.className("listoneGrid"));
			sortf1status1=driver.findElements(By.className("listtwoGrid"));
			System.out.println(sortf1status.get(i).getText());
			System.out.println(sortf1status1.get(i).getText());


		}}
	public void f1_Status_Sort1() throws InterruptedException 
	{   for(int k=0;k<3;k++){
		f1_Status();
		scroll();
		for(int j=2;j<5;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	}
	public void InitMsg_Form() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING f1 STATUS:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sortInitMsg_Form=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortInitMsg_Form1=driver.findElements(By.className("listtwoGrid"));

		Thread.sleep(1000);
		for(int i=0;i<sortInitMsg_Form.size();i++)
			for(int j=0;j<sortInitMsg_Form1.size();j++)
			{
				Thread.sleep(1000);
				//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
				sortInitMsg_Form=driver.findElements(By.className("listoneGrid"));
				sortInitMsg_Form1=driver.findElements(By.className("listtwoGrid"));
				System.out.println(sortInitMsg_Form.get(i).getText());
				System.out.println(sortInitMsg_Form1.get(j).getText());


			}}
	public void InitMsg_Form_Sort1() throws InterruptedException 
	{   for(int k=0;k<3;k++){
		InitMsg_Form();
		scroll();
		for(int j=2;j<5;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}
		}
	}
	}
	public void InitiateMsg_Form() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[1]/a")).click();
		System.out.println("SORTING FORM:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sortInitiMsg_Form=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortInitiMsg_Form1=driver.findElements(By.className("listtwoGrid"));

		Thread.sleep(1000);
		for(int i=0;i<sortInitiMsg_Form.size();i++)
			for(int j=0;j<sortInitiMsg_Form1.size();j++)
			{
				Thread.sleep(1000);
				//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
				sortInitiMsg_Form=driver.findElements(By.className("listoneGrid"));
				sortInitiMsg_Form1=driver.findElements(By.className("listtwoGrid"));
				System.out.println(sortInitiMsg_Form.get(i).getText());
				System.out.println(sortInitiMsg_Form1.get(j).getText());


			}}
	public void InitiateMsg_Form_Sort1() throws InterruptedException 
	{  

		Thread.sleep(1000);
		InitiateMsg_Form();
		scroll();
		for(int j=2;j<5;j++)
		{
			List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
			Thread.sleep(1000);
			for(int i=0;i<ff.size();i++)
			{
				Thread.sleep(1000);
				ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				ff.get(i).click();	
			}

		}
	}
	public void InitiateMsg_InitiatedBy() throws InterruptedException
	{
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[2]/a")).click();
		System.out.println("SORTING INITIATEDBY:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sortInitMsgInitBy=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortInitMsgInitBy1=driver.findElements(By.className("listtwoGrid"));

		Thread.sleep(1000);
		for(int i=0;i<sortInitMsgInitBy.size();i++)
			for(int j=0;j<sortInitMsgInitBy1.size();j++)
			{
				Thread.sleep(1000);
				//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
				sortInitMsgInitBy=driver.findElements(By.className("listoneGrid"));
				sortInitMsgInitBy1=driver.findElements(By.className("listtwoGrid"));
				System.out.println(sortInitMsgInitBy.get(i).getText());
				System.out.println(sortInitMsgInitBy1.get(j).getText());


			}}
	public void InitiateMsg_InitiatedBySort1() throws InterruptedException 
	{  
		for(int k=1;k<4;k++)
		{
			Thread.sleep(1000);
			InitiateMsg_InitiatedBy();
			scroll();
			for(int j=2;j<5;j++)
			{
				List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				for(int i=0;i<ff.size();i++)
				{
					Thread.sleep(1000);
					ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
					Thread.sleep(1000);
					ff.get(i).click();	
				}

			}
		}}
	public void InitiateMsg_Inmate() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[3]/a")).click();
		System.out.println("SORTING INMATE:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sortInitMsgInitInmate=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortInitMsgInitInmate1=driver.findElements(By.className("listtwoGrid"));

		Thread.sleep(1000);
		for(int i=0;i<sortInitMsgInitInmate.size();i++)
			for(int j=0;j<sortInitMsgInitInmate1.size();j++)
			{
				Thread.sleep(1000);
				//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
				sortInitMsgInitInmate=driver.findElements(By.className("listoneGrid"));
				sortInitMsgInitInmate1=driver.findElements(By.className("listtwoGrid"));
				System.out.println(sortInitMsgInitInmate.get(i).getText());
				System.out.println(sortInitMsgInitInmate1.get(j).getText());


			}}
	public void InitiateMsg_Inmate_Sort1() throws InterruptedException 
	{  
		for(int k=1;k<4;k++)
		{
			Thread.sleep(1000);
			InitiateMsg_InitiatedBy();
			scroll();
			for(int j=2;j<5;j++)
			{
				List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				for(int i=0;i<ff.size();i++)
				{
					Thread.sleep(1000);
					ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
					Thread.sleep(1000);
					ff.get(i).click();	
				}

			}}
	}
	public void InitiateMsg_Created() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[4]/a")).click();
		System.out.println("SORTING CREATED:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sortInitMsgInitcreated=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortInitMsgInitcreated1=driver.findElements(By.className("listtwoGrid"));

		Thread.sleep(1000);
		for(int i=0;i<sortInitMsgInitcreated.size();i++)
			for(int j=0;j<sortInitMsgInitcreated1.size();j++)
			{
				Thread.sleep(1000);
				//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
				sortInitMsgInitcreated=driver.findElements(By.className("listoneGrid"));
				sortInitMsgInitcreated1=driver.findElements(By.className("listtwoGrid"));
				System.out.println(sortInitMsgInitcreated.get(i).getText());
				System.out.println(sortInitMsgInitcreated1.get(j).getText());


			}}
	public void InitiateMsg_Created_Sort1() throws InterruptedException 
	{  
		for(int k=1;k<4;k++)
		{
			Thread.sleep(1000);
			InitiateMsg_Created();
			scroll();
			for(int j=2;j<5;j++)
			{
				List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				for(int i=0;i<ff.size();i++)
				{
					Thread.sleep(1000);
					ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
					Thread.sleep(1000);
					ff.get(i).click();	
				}

			}}
	}

	public void InitiateMsg_Responded() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[5]/a")).click();
		System.out.println("SORTING RESPONDED:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sortInitMsgInitResponded=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortInitMsgInitResponded1=driver.findElements(By.className("listtwoGrid"));

		Thread.sleep(1000);
		for(int i=0;i<sortInitMsgInitResponded.size();i++)
			for(int j=0;j<sortInitMsgInitResponded1.size();j++)
			{
				Thread.sleep(1000);
				//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
				sortInitMsgInitResponded=driver.findElements(By.className("listoneGrid"));
				sortInitMsgInitResponded1=driver.findElements(By.className("listtwoGrid"));
				System.out.println(sortInitMsgInitResponded.get(i).getText());
				System.out.println(sortInitMsgInitResponded1.get(j).getText());


			}}
	public void InitiateMsg_Responded_Sort1() throws InterruptedException 
	{  
		for(int k=1;k<4;k++)
		{
			Thread.sleep(1000);
			InitiateMsg_Responded();
			scroll();
			for(int j=2;j<5;j++)
			{
				List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				for(int i=0;i<ff.size();i++)
				{
					Thread.sleep(1000);
					ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
					Thread.sleep(1000);
					ff.get(i).click();	
				}

			}}
	}

	public void InitiateMsg_Status() throws InterruptedException
	{
		Thread.sleep(1000);           
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[6]/a")).click();
		System.out.println("SORTING RESPONDED:");
		Thread.sleep(1000);
		//List<WebElement> sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
		List<WebElement> sortInitMsgInitStatus=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortInitMsgInitStatus1=driver.findElements(By.className("listtwoGrid"));

		Thread.sleep(1000);
		for(int i=0;i<sortInitMsgInitStatus.size();i++)
			for(int j=0;j<sortInitMsgInitStatus1.size();j++)
			{
				Thread.sleep(1000);
				//sortformf1=driver.findElements(By.id("ContentPlaceHolder1_grvRequestInfo_lbtnRequestFormTitle_0"));
				sortInitMsgInitStatus=driver.findElements(By.className("listoneGrid"));
				sortInitMsgInitStatus=driver.findElements(By.className("listtwoGrid"));
				System.out.println(sortInitMsgInitStatus.get(i).getText());
				System.out.println(sortInitMsgInitStatus1.get(j).getText());


			}}
	public void InitiateMsg_Status_Sort1() throws InterruptedException 
	{  
		for(int k=1;k<4;k++)
		{
			Thread.sleep(1000);
			InitiateMsg_Status();
			scroll();
			for(int j=2;j<5;j++)
			{
				List<WebElement> ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
				Thread.sleep(1000);
				for(int i=0;i<ff.size();i++)
				{
					Thread.sleep(1000);
					ff=driver.findElements(By.xpath("//*[@class='pager']//*[text()='"+j+"']"));
					Thread.sleep(1000);
					ff.get(i).click();	
				}

			}
		}

	}		


	public void PublicUser_Inbox_Subj() throws InterruptedException
	{
		Thread.sleep(2000);
		InboxBtn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[1]")).click();
		System.out.println("SORTING INBOX SUBJECT:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("odd"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//	for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("odd"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}
	public void PublicUser_Inbox_From() throws InterruptedException
	{
		Thread.sleep(2000);
		InboxBtn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[2]")).click();
		System.out.println("SORTING INBOX FROM:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("odd"));
		List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			for(int j=0;j<sortinboxSubj1.size();j++)
			{
				Thread.sleep(1000);
				sortinboxSubj=driver.findElements(By.className("odd"));
				sortinboxSubj1=driver.findElements(By.className("even"));
				System.out.println(sortinboxSubj.get(i).getText());
				System.out.println(sortinboxSubj1.get(j).getText());

			}}
	public void PublicUser_Inbox_Date() throws InterruptedException
	{
		Thread.sleep(2000);
		InboxBtn.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[3]")).click();
		System.out.println("SORTING INBOX DATE:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("odd"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("odd"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}

	public void PublicUser_Inbox_Status() throws InterruptedException
	{
		Thread.sleep(2000);
		InboxBtn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[4]")).click();
		System.out.println("SORTING INBOX STATUS:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getAttribute("title"));
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}
	public void PublicUser_SentItems_Subject() throws InterruptedException
	{
		Thread.sleep(2000);
		InboxBtn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[1]")).click();
		System.out.println("SORTING SENTITEMS SUBJECT:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}
	public void PublicUser_SentItems_To() throws InterruptedException
	{
		Thread.sleep(2000);
		InboxBtn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[2]")).click();
		System.out.println("SORTING SENTITEMS TO:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}
	public void PublicUser_SentItems_date() throws InterruptedException
	{
		Thread.sleep(2000);
		InboxBtn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[3]")).click();
		System.out.println("SORTING SENTITEMS DATE:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}

	public void PublicUser_FindInmate_ID() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[1]")).click();
	//	System.out.println("SORTING FINDINMATES ID:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}
	public void PublicUser_FindInmate_FirstName() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[2]")).click();
	//	System.out.println("SORTING FINDINMATES FIRST NAME:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}
	public void PublicUser_FindInmate_LastName() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[3]")).click();
	//	System.out.println("SORTING FINDINMATES LAST NAME:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}
	public void PublicUser_FindInmate_Dob() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[4]")).click();
	//	System.out.println("SORTING FINDINMATES DOB:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}
	public void PublicUser_FindInmate_Location() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[5]")).click();
	//	System.out.println("SORTING FINDINMATES LOCATION:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}

	public void PublicUser_MyContact_InmateID() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[1]")).click();
		System.out.println("SORTING MYCONTACTS INMATEID:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}
	public void PublicUser_MyContact_LastName() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[2]")).click();
		System.out.println("SORTING MYCONTACTS LASTNAME:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}
	public void PublicUser_MyContact_FirstName() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[3]")).click();
		System.out.println("SORTING MYCONTACTS FIRSTNAME:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}
	public void PublicUser_MyContact_FacilityName() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[4]")).click();
		System.out.println("SORTING MYCONTACTS FACILITY NAME:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}

	public void PublicUser_MyContact_Credits() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[5]")).click();
		System.out.println("SORTING MYCONTACTS CREDITS:");
		Thread.sleep(1000);
		List<WebElement> sortinboxSubj=driver.findElements(By.className("sorting_1"));
		//	List<WebElement> sortinboxSubj1=driver.findElements(By.className("even"));

		Thread.sleep(1000);
		for(int i=0;i<sortinboxSubj.size();i++)
			//		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			sortinboxSubj=driver.findElements(By.className("sorting_1"));
			//	sortinboxSubj1=driver.findElements(By.className("even"));
			System.out.println(sortinboxSubj.get(i).getText());
			//	System.out.println(sortinboxSubj1.get(j).getText());

		}}
	public void Initiatemessage_Form() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkForm']")).click();
		System.out.println("SORTING INITIATE MESSAGE FORM:");
		Thread.sleep(1000);
		//	List<WebElement> sortinboxSubj=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortinboxSubj1=driver.findElements(By.className("trFirstRow"));

		Thread.sleep(1000);
		//	for(int i=0;i<sortinboxSubj.size();i++)
		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			//		sortinboxSubj=driver.findElements(By.className("listoneGrid"));
			sortinboxSubj1=driver.findElements(By.className("trFirstRow"));
			//		System.out.println(sortinboxSubj.get(i).getText());
			System.out.println(sortinboxSubj1.get(j).getText());

		}
	}
	public void Initiatemessage_InitiatedBy() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkInitiatedBy']")).click();
		System.out.println("SORTING INITIATE MESSAGE INITIATED BY:");
		Thread.sleep(1000);
		//	List<WebElement> sortinboxSubj=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortinboxSubj1=driver.findElements(By.className("trFirstRow"));

		Thread.sleep(1000);
		//	for(int i=0;i<sortinboxSubj.size();i++)
		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			//		sortinboxSubj=driver.findElements(By.className("listoneGrid"));
			sortinboxSubj1=driver.findElements(By.className("trFirstRow"));
			//		System.out.println(sortinboxSubj.get(i).getText());
			System.out.println(sortinboxSubj1.get(j).getText());

		}

	}
	public void Initiatemessage_Inmate() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkInmate']")).click();
		System.out.println("SORTING INITIATE MESSAGE INMATE:");
		Thread.sleep(1000);
		//	List<WebElement> sortinboxSubj=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortinboxSubj1=driver.findElements(By.className("trFirstRow"));

		Thread.sleep(1000);
		//	for(int i=0;i<sortinboxSubj.size();i++)
		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			//		sortinboxSubj=driver.findElements(By.className("listoneGrid"));
			sortinboxSubj1=driver.findElements(By.className("trFirstRow"));
			//		System.out.println(sortinboxSubj.get(i).getText());
			System.out.println(sortinboxSubj1.get(j).getText());

		}

	}
	public void Initiatemessage_Created() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkCreated']")).click();
		System.out.println("SORTING INITIATE MESSAGE CREATED:");
		Thread.sleep(1000);
		//	List<WebElement> sortinboxSubj=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortinboxSubj1=driver.findElements(By.className("trFirstRow"));

		Thread.sleep(1000);
		//	for(int i=0;i<sortinboxSubj.size();i++)
		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			//		sortinboxSubj=driver.findElements(By.className("listoneGrid"));
			sortinboxSubj1=driver.findElements(By.className("trFirstRow"));
			//		System.out.println(sortinboxSubj.get(i).getText());
			System.out.println(sortinboxSubj1.get(j).getText());

		}
	}
	public void Initiatemessage_Responded() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkRespondedOn']")).click();
		System.out.println("SORTING INITIATE MESSAGE RESPONDED:");
		Thread.sleep(1000);
		//	List<WebElement> sortinboxSubj=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortinboxSubj1=driver.findElements(By.className("trFirstRow"));

		Thread.sleep(1000);
		//	for(int i=0;i<sortinboxSubj.size();i++)
		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			//		sortinboxSubj=driver.findElements(By.className("listoneGrid"));
			sortinboxSubj1=driver.findElements(By.className("trFirstRow"));
			//		System.out.println(sortinboxSubj.get(i).getText());
			System.out.println(sortinboxSubj1.get(j).getText());

		}
	}	
	public void Initiatemessage_Status() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvRequestInfo']/tbody/tr[1]/th[6]/a")).click();
		System.out.println("SORTING INITIATE MESSAGE RESPONDED:");
		Thread.sleep(1000);
		//	List<WebElement> sortinboxSubj=driver.findElements(By.className("listoneGrid"));
		List<WebElement> sortinboxSubj1=driver.findElements(By.className("listtwoGrid"));

		Thread.sleep(1000);
		//	for(int i=0;i<sortinboxSubj.size();i++)
		for(int j=0;j<sortinboxSubj1.size();j++)
		{
			Thread.sleep(1000);
			//		sortinboxSubj=driver.findElements(By.className("listoneGrid"));
			sortinboxSubj1=driver.findElements(By.className("listtwoGrid"));
			//		System.out.println(sortinboxSubj.get(i).getText());
			System.out.println(sortinboxSubj1.get(j).getText());

		}
	}	
	public void SentPhotos(DataTable SentPhoto) throws InterruptedException
	{
		List<List<String>> photo=SentPhoto.raw();
		Thread.sleep(4000);
		SentItems1.click();
		Thread.sleep(1000);
		SearchPhoto.sendKeys(photo.get(0).get(1));
		Thread.sleep(1500);
		List<WebElement> searchPhoto1=driver.findElements(By.xpath("//*[@class='col-lbl-username']"));
		for(int i=0;i<searchPhoto1.size();i++)
		{
			if(searchPhoto1.get(i).isDisplayed()==true)
			{
			Thread.sleep(1000);
			searchPhoto1=driver.findElements(By.xpath("//*[@class='col-lbl-username']"));
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			searchPhoto1.get(i).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='divInboxChatCommunication']/div/div[1]/div[1]/i")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='divInboxChatCommunication']/div/div[1]/div[1]/i")).click();
			}
			else if(searchPhoto1.get(i).isDisplayed()==false){
				
			//	String dd=searchPhoto1.get(i).getText();
			//	System.out.println(dd+"is not available");
			}
		}
	}
	public void COD_Pending() throws InterruptedException, AWTException
	{
       Thread.sleep(7000);
       CODPending.click();
       String CODpendingSize=driver.findElement(By.xpath("//*[@id='lblCODCount']")).getText();
       System.out.println(CODpendingSize);
       Thread.sleep(1000);
       CODSentMsg.click();
       Thread.sleep(1000);
       int i=0;int j=0;
      
       char cod='A';
       switch(cod)
       {
       case 'A':
    	    Thread.sleep(2000);
            CODSentMsg.click();
            Thread.sleep(1000);
            COD_SentMsg();
    	  /*  Thread.sleep(1000);
    	    String SentMsgCOD=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblNodataFoundSentMsg']")).getText();
   	        String noData="No data found";                 
   	        if(SentMsgCOD.contains(noData))
   	        {
   	        	System.out.println("No Data Found");
   	        }
   	        else{
   	        	COD_SentMsg();
   	        }  */
    	    break;
       case 'B':
    	    Thread.sleep(2000);
            CODReceivedMsg.click();
            Thread.sleep(2000);
            COD_ReceivedMsg();
   	       /* String ReceivedMsgCOD=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblNodataFoundReceivedMsg']")).getText();
   	        String noData1="No data found";                    
   	        if(ReceivedMsgCOD.contains(noData1))
   	        {
   	        	System.out.println("No Data Found");
   	        }
   	        else{
   	             COD_ReceivedMsg();
   	            }
   	       */
   	        break;   
       case 'C'  :
    	    Thread.sleep(2000);
            CODSentPhotos.click(); 
            Thread.sleep(2000);
            COD_SentPhotos();
  	       /* String SentPhotoCOD=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblNodataFoundSentPhotos']")).getText();
  	        String noData2="No data found";                  
  	        if(SentPhotoCOD.contains(noData2))
  	        {
  	        	System.out.println("No Data Found");
  	        }
  	        else{
  	           COD_SentPhotos();
  	        }*/
   	        
  	        break; 
       }
      
	}
public void ArchivedMsg(DataTable ArchivMsg) throws InterruptedException
{
	List<List<String>> arMsg=ArchivMsg.raw();
	Thread.sleep(2000);
	for(int i=0;i<2;i++)
	{
	Thread.sleep(4000);
	Archievd1.click();
	Thread.sleep(2000);
	/*SearchArchived.click();
	Thread.sleep(1000);
	scroll1500();
	Thread.sleep(3000);
	LoadMore.click();
	Thread.sleep(1000);
	scrollup1500();
	Thread.sleep(1000);*/
	
	SearchArchived.click();
//	SearchArchived.sendKeys(arMsg.get(0).get(1));
	Thread.sleep(3000);
	
//	List<WebElement> ArchivMessage1=driver.findElements(By.xpath("//*[@class='col-lbl-username' and contains(text(),'ARNOLD PETE...')]"));
	List<WebElement> ArchivMessage=driver.findElements(By.xpath("//*[@class='col-user']"));
	for(int j=0;j<1;j++)
	{
		Thread.sleep(1500);
		ArchivMessage.get(j).click();
    Thread.sleep(2000);
	SendMsg.click();
	Thread.sleep(1000);
	OkBtn.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='txtReplyMessage']")).sendKeys(arMsg.get(1).get(1));
	Thread.sleep(1000);
	SendMsg.click();
	Thread.sleep(5000);
    WebElement MsgPopup=driver.findElement(By.xpath("//*[@id='lblMessage']"));
    String MsgPopupValue=MsgPopup.getText();
	String MsgSent="Message sent successfully";
	String MSg_cod="Message thread contains COD messages";
	if(MsgPopupValue.contains(MsgSent) )
	{
		Thread.sleep(3000);
		OkBtn.click();	
	}
	else{
			Thread.sleep(5000);
			OkBtn.click();
			Thread.sleep(1000);
			COD_Msg(ArchivMsg);
			Thread.sleep(1000);	
		}
	}
	i++;
	/*String Popup_Msg=driver.findElement(By.xpath("//*[contains(text(),'Message thread contains COD messages.')]")).getText();
	String popupMsg="Message thread contains";
	if(Popup_Msg.contains(popupMsg))*/
	/*else 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		OkBtn.click();
		Thread.sleep(1000);
		COD_Msg(ArchivMsg);
	}*/
	Thread.sleep(1000);
	}	
	
	}
	
public void Pagination() throws InterruptedException
{
	Thread.sleep(1000);
	scroll();
	Thread.sleep(2000);
	int x = 0;  
    while(x < 5) {
    	Thread.sleep(500);
    	WebElement paginations=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNext']"));
    	Thread.sleep(500);
    	paginations.click();
        x++;
     }
    Thread.sleep(1000);
    int y = 0;  
    while(y < 5) {
    	Thread.sleep(500);
    	WebElement paginationPrev=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrevious']"));
    	Thread.sleep(500);
    	paginationPrev.click();
        y++;
     }
}

public void Sorting() throws InterruptedException
{
	Thread.sleep(1000);
	System.out.println("Ascending order Form:");
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkForm']")).click();
	SortingForm();
	Thread.sleep(1000);
	System.out.println("Descending order Form:");
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkForm']")).click();
	SortingForm();
	
	Thread.sleep(1000);
	System.out.println("Ascending order InitiatedBy:");
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkInitiatedBy']")).click();
	SortingInitBy();
	Thread.sleep(1000);
	System.out.println("Descending order InitiatedBy:");
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkInitiatedBy']")).click();
	SortingInitBy();
	
	Thread.sleep(1000);
	System.out.println("Ascending order Inmate:");
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkInmate']")).click();
	SortingInmate();
	Thread.sleep(1000);
	System.out.println("Descending order Inmate:");
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkInmate']")).click();
	SortingInmate();
	
	Thread.sleep(1000);
	System.out.println("Ascending order Created:");
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkInmate']")).click();
	SortingCreated();
	Thread.sleep(1000);
	System.out.println("Descending order Created:");
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkInmate']")).click();
	SortingCreated();
	
	Thread.sleep(1000);
	System.out.println("Ascending order RespondedOn:");
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkRespondedOn']")).click();
	SortingResponded();
	Thread.sleep(1000);
	System.out.println("Descending order RespondedOn:");
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lnkRespondedOn']")).click();
	SortingResponded();
	
	
}
public void SortingForm() throws InterruptedException
{
	for(int i=0;i<10;i++)
	{
		Thread.sleep(500);
		List<WebElement> formsort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lbtnRequestFormTitle_"+i+"']"));
	  for(WebElement e:formsort)
	  {
		  System.out.println(e.getText());
	  }
	}
}
public void SortingInitBy() throws InterruptedException
{
	for(int i=0;i<10;i++)
	{
		Thread.sleep(500);
		List<WebElement> initbysort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lblInitiatedBy_"+i+"']"));
	  for(WebElement e:initbysort)
	  {
		  System.out.println(e.getText());
	  }
	}
}

public void SortingInmate() throws InterruptedException
{
	for(int i=0;i<10;i++)
	{
		Thread.sleep(500);
		List<WebElement> inmatesort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lblInmateName_"+i+"']"));
	  for(WebElement e:inmatesort)
	  {
		  System.out.println(e.getText());
	  }
	}
}
public void SortingCreated() throws InterruptedException
{
	for(int i=0;i<10;i++)
	{
		Thread.sleep(500);
		List<WebElement> createdsort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lblRequestCreateDate_"+i+"']"));
	  for(WebElement e:createdsort)
	  {
		  System.out.println(e.getText());
	  }
	}
}
public void SortingResponded() throws InterruptedException
{
	for(int i=0;i<10;i++)
	{
		Thread.sleep(500);
		List<WebElement> respondedsort=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptReequestsInfo_lblRequestReSubmitDate_"+i+"']"));
	  for(WebElement e:respondedsort)
	  {
		  System.out.println(e.getText());
	  }
	}
}

public void PurchaseCredit(DataTable inmate) throws InterruptedException
{
	List<List<String>> inm=inmate.raw();
	Thread.sleep(5000);
	PurchaseCredit.click();
	Thread.sleep(2000);
	Select Inmates=new Select(InmateNames);
	Inmates.selectByVisibleText(inm.get(0).get(1));
	Thread.sleep(1000);
	Select creditamts=new Select(CreditAmt);
	creditamts.selectByVisibleText(inm.get(1).get(1));
	Thread.sleep(1000);
	int x=1;
	switch(x)
	{
	case 1:
		Thread.sleep(1000);
		Purchase.click();
		break;
	case 2:
		Thread.sleep(1000);
		Cancel.click();
		break;
	}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Paypal_uname.sendKeys(inm.get(2).get(1));
	Thread.sleep(1000);
	Next.click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Paypal_passwd.sendKeys(inm.get(3).get(1));
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Login.click();
	Thread.sleep(25000);
	Pay.click();
	Thread.sleep(10000);
	boolean paySuccess=driver.findElement(By.xpath("//*[@id='PaymentSuccess']/div/img")).isDisplayed();
	boolean payFailed=driver.findElement(By.xpath("//*[@id='PaymentUnConfirmed']/div/img")).isDisplayed();
	if(paySuccess==true)
	{
		System.out.println("Payment is Success");
	}
	else{
		System.out.println("Payment is Not Success");
	}
	}
public void COD_Msg(DataTable inboxmsg) throws InterruptedException
{  
	List<List<String>> inbox=inboxmsg.raw();
	String COD_popup="Message thread contains";
    String cod1=driver.findElement(By.xpath("//span[@id='lblMessage']")).getText();
    if(cod1.contains(COD_popup))
    {
    	Thread.sleep(1000);
    	OkBtn.click();
    }
    Thread.sleep(1000);
    scroll();
    Thread.sleep(1000);
    SendMsg.click();
    Thread.sleep(1000);
    OkBtn.click();
    Thread.sleep(1000);
    ReplyMessage.sendKeys(inbox.get(1).get(1));
 	Thread.sleep(2000);
 	SendMsg.click();
 	Thread.sleep(10000);
 	BtnOkk.click();
 	
 	// Paying to Public user using sandbox account
 	Thread.sleep(2000);
	Select creditamts=new Select(CreditAmt);
	creditamts.selectByVisibleText(inbox.get(2).get(1));
	Thread.sleep(1000);
	int x=1;
	switch(x)
	{
	case 1:
		Thread.sleep(1000);
		Purchase.click();
		break;
	case 2:
		Thread.sleep(1000);
		Cancel.click();
		break;
	}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Paypal_uname.sendKeys(inbox.get(3).get(1));
	Thread.sleep(1000);
	Next.click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Paypal_passwd.sendKeys(inbox.get(4).get(1));
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Login.click();
	Thread.sleep(20000);
	Pay.click();
	Thread.sleep(10000);
	/*boolean paySuccess=driver.findElement(By.xpath("//*[@id='PaymentSuccess']/div/img")).isDisplayed();
	boolean payFailed=driver.findElement(By.xpath("//*[@id='PaymentUnConfirmed']/div/img")).isDisplayed();
	if(paySuccess==true)
	{
		System.out.println("Payment is Success");
	}
	else{
		System.out.println("Payment is Not Success");
	}*/
	}

public void COD_SentMsg() throws InterruptedException, AWTException
{
	 List<WebElement> acceptIgnoreAll=driver.findElements(By.xpath("//*[@type='checkbox']"));
     
     char ApproveIgnoreAll='A';
     switch(ApproveIgnoreAll)
     {
     case 'A'://Accept and Ignore once
  	   int x=1;
         switch(x)
         {
         case 1://Accept
           	 Thread.sleep(1000);
           //	 acceptIgnoreAll.get(2).click();
           for(int i=0;i<1;i++)
           {
        	   
        	 Thread.sleep(1000);
        	 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkbtnApproveAll']")).click();
        	 Thread.sleep(1000);
        	 String s3=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
        	 String s4="Please choose any messages from the list.";
        	 if(s3.contains(s4))
        	 {
        	 Thread.sleep(2000);
        	 BtnOk.click();
        	 Thread.sleep(1500);
      	     driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptSentMessages_chkRow1_"+i+"']")).click();
      	
      	     Thread.sleep(2000);
    	    
    	     if(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).isDisplayed())
    	     {
    	     String CODPopup=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
    	     String s1="Credit balance is low.";
    	     if(CODPopup.contains(s1))
    	     {
      	     Thread.sleep(1000);
      	     String CODSentMsgCBValue=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptSentMessages_chkRow1_"+i+"']")).getAttribute("id");
      	     System.out.println(CODSentMsgCBValue);
      	 
      	     Integer result = Integer.valueOf(CODSentMsgCBValue.charAt(44)-48);
      	    int CODSentMsgCBValue1=CODSentMsgCBValue.charAt(44)-48; 
      	     
      	    String InmateName=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptSentMessages_lblSentTo_"+CODSentMsgCBValue1+"']")).getText();
      	    System.out.println(InmateName);
      	    BtnOk.click();
      		Thread.sleep(5000);
      		PurchaseCredit.click();
      		Thread.sleep(2000);
      		Select Inmates=new Select(InmateNames);
      		Thread.sleep(2000);
      		Inmates.selectByVisibleText(driver.findElement(By.xpath("//select[@id='ddlInmate']/option[contains(text(),'"+InmateName+"')]")).getText());
      		Thread.sleep(1000);
      		Select creditamts=new Select(CreditAmt);
      		creditamts.selectByVisibleText("$ 20.00");
      		Thread.sleep(1000);
      		int P=1;
      		switch(P)
      		{
      		case 1:
      			Thread.sleep(1000);
      			Purchase.click();
      			break;
      		case 2:
      			Thread.sleep(1000);
      			Cancel.click();
      			break;
      		}
      		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      		Paypal_uname.sendKeys("inmateinbox-buyer5@sgstechie.com");
      		Thread.sleep(1000);
      		Next.click();
      		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      		Paypal_passwd.sendKeys("SGS@2017");
      		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      		Login.click();
      		Thread.sleep(25000);
      		Pay.click();
      		Thread.sleep(10000);
      		boolean paymentStatus=driver.findElement(By.className("divPaymentStatus")).isDisplayed();
      		
      		if(paymentStatus==true)
      		{
      			System.out.println(driver.findElement(By.className("divPaymentStatus")).getAttribute("id"));
      		}
        	 }}
        	 else{
        		 Thread.sleep(1000);
        		 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkbtnApproveAll']")).click();
        		 Thread.sleep(1000);
        		 BtnOk.click();
        		 System.out.println(s3);
        	 }
      	     }
           }
      	     break;
          case 2://Ignore
      	    Thread.sleep(1000);
      	
      	    for(int j=0;j<1;j++)
      	    {
      	    Thread.sleep(1000);
      	    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkRejectAll']")).click();
      	    Thread.sleep(3000);
 	        BtnOk.click();
      	    Thread.sleep(1500);
      	    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptSentMessages_lnkbtnDisApprove_"+j+"']")).click();
      	    Thread.sleep(2000);
   	        System.out.println(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText());
      	    BtnOk.click();
      	    }
      	    break;
         }
        break;
     case 'B'://Approve and Ignore All
  	   int y=1;
  	   switch(y)
  	   {
  	   case 1://Approve All
  		   /*Thread.sleep(1000);
  		   List<WebElement> acceptAll=driver.findElements(By.xpath("//*[@type='checkbox']"));
  		   acceptAll.get(2).click();
  		   Thread.sleep(1000);
  		   ApproveAll.click();
  		   Thread.sleep(1000);
  		   BtnOk.click();*/
  		   for(int k=0;k<1;k++)
  		   {
  			Thread.sleep(2000);
  		   driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptSentMessages_lnkbtnApprove_0']")).click();
  		                                   
  		   Thread.sleep(1000);
  		   String PopUpMsg=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
  		 
  		   String Insuff="Your account have insufficient credits.";
  		   if(PopUpMsg.contains(Insuff))
  		   {
  			   Thread.sleep(1000);
  			 Thread.sleep(1000);
      	     String CODSentMsgCBValue=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptSentMessages_lblSentTo_"+k+"']")).getAttribute("id");
      	     System.out.println(CODSentMsgCBValue);
      	 
      	     Integer result = Integer.valueOf(CODSentMsgCBValue.charAt(44)-108);
      	     int CODSentMsgCBValue1=CODSentMsgCBValue.charAt(44)-108;
      	   String InmateName=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptSentMessages_lblSentTo_"+CODSentMsgCBValue1+"']")).getText();
     	    System.out.println(InmateName);
     	    Thread.sleep(1000);
    		   BtnOk.click();
    		   Thread.sleep(5000);
         		PurchaseCredit.click();
         		Thread.sleep(2000);
         		Select Inmates=new Select(InmateNames);
         		Thread.sleep(2000);
         		Inmates.selectByVisibleText(driver.findElement(By.xpath("//select[@id='ddlInmate']/option[contains(text(),'"+InmateName+"')]")).getText());
         		Thread.sleep(1000);
         		Select creditamts=new Select(CreditAmt);
         		creditamts.selectByVisibleText("$ 20.00");
         		Thread.sleep(1000);
         		int P=1;
         		switch(P)
         		{
         		case 1:
         			Thread.sleep(1000);
         			Purchase.click();
         			break;
         		case 2:
         			Thread.sleep(1000);
         			Cancel.click();
         			break;
         		}
         		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         		Paypal_uname.sendKeys("inmateinbox-buyer5@sgstechie.com");
         		Thread.sleep(1000);
         		Next.click();
         		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         		Paypal_passwd.sendKeys("SGS@2017");
         		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         		Login.click();
         		Thread.sleep(25000);
         		Pay.click();
         		Thread.sleep(10000);
         		boolean paymentStatus=driver.findElement(By.className("divPaymentStatus")).isDisplayed();
         		
         		if(paymentStatus==true)
         		{
         			System.out.println(driver.findElement(By.className("divPaymentStatus")).getAttribute("id"));
         		}
           	 }
    		   
  		   else{
  			 
  			 Thread.sleep(1000);
			 System.out.println(PopUpMsg);
  		      BtnOk.click();
  		   }}
  		   }
  		   break;
  	   case 2://Ignore All
  		   Thread.sleep(1000);
  		   for(int m=0;m<1;m++)
  		   {
  			 Thread.sleep(1000);
  			 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptSentMessages_lnkbtnDisApprove_"+m+"']")).click();
    		   Thread.sleep(1000);
    		   BtnOk.click();
  		   }
  		   
  		   break;
  	   }
     }

     public void COD_ReceivedMsg() throws InterruptedException
     {
    	
         Thread.sleep(1000);            
         List<WebElement> ApproveIgnore2=driver.findElements(By.xpath("//*[@type='checkbox']")); 
                                             
         char ApproveIgnoreAll2='B';
         switch(ApproveIgnoreAll2)
         {
         case 'A'://Accept and Ignore once
      	   int x=1;
             switch(x)
             {
             case 1:
               	 Thread.sleep(2000);
          	     driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkbtnApproveMessagesReceived']")).click();
          	     for(int i=0;i<1;i++)
          	     {
             Thread.sleep(1500);
          	 String s3=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
          	 String s4="Please choose any messages from the list.";
          	 if(s3.contains(s4))
          	 {
          	 Thread.sleep(2000);
          	 BtnOk.click();
          	 Thread.sleep(1500);
        	     driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedMessages_chkRowReceived_"+i+"']")).click();
        	
        	     Thread.sleep(2000);
      	    
      	     if(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).isDisplayed())
      	     {
      	     String CODPopup=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
      	     String s1="Credit balance is low.";
      	     if(CODPopup.contains(s1))
      	     {
        	     Thread.sleep(1000);
        	     String CODReceivedMsgCBValue=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedMessages_chkRowReceived_"+i+"']")).getAttribute("id");
        	     System.out.println(CODReceivedMsgCBValue);
        	     BtnOk.click();
        	     Integer result = Integer.valueOf(CODReceivedMsgCBValue.charAt(44)-111);
        	    int CODReceivedMsgCBValue1=CODReceivedMsgCBValue.charAt(44)-111; 
        	     
        	    String InmateName=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedMessages_lblReceivedFrom_"+CODReceivedMsgCBValue1+"']")).getText();
        	    System.out.println(InmateName);                
        	  
        		Thread.sleep(5000);
        		PurchaseCredit.click();
        		Thread.sleep(2000);
        		Select Inmates=new Select(InmateNames);
        		Thread.sleep(2000);
        		Inmates.selectByVisibleText(driver.findElement(By.xpath("//select[@id='ddlInmate']/option[contains(text(),'John PETER A - test0610')]")).getText());
        		Thread.sleep(1000);
        		Select creditamts=new Select(CreditAmt);
        		creditamts.selectByVisibleText("$ 5.00");
        		Thread.sleep(1000);
        		int P=1;
        		switch(P)
        		{
        		case 1:
        			Thread.sleep(1000);
        			Purchase.click();
        			break;
        		case 2:
        			Thread.sleep(1000);
        			Cancel.click();
        			break;
        		}
        		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        		Paypal_uname.sendKeys("inmateinbox-buyer5@sgstechie.com");
        		Thread.sleep(1000);
        		Next.click();
        		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        		Paypal_passwd.sendKeys("SGS@2017");
        		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        		Login.click();
        		Thread.sleep(25000);
        		Pay.click();
        		Thread.sleep(10000);
        		boolean paymentStatus=driver.findElement(By.className("divPaymentStatus")).isDisplayed();
        		
        		if(paymentStatus==true)
        		{
        			System.out.println(driver.findElement(By.className("divPaymentStatus")).getAttribute("id"));
        		}
          	 }}
          	 else{
          		 Thread.sleep(1000);
          		 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkbtnApproveMessagesReceived']")).click();
          		 Thread.sleep(1000);
          		 System.out.println(s3);
          		 BtnOk.click();
          		
          	 }
        	     }
             }
          	     break;
             case 2:
          	    Thread.sleep(1000);
          	    for(int n=0;n<1;n++)
          	    {
          	    Thread.sleep(1000);
          	    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedMessages_lnkbtnDisRecApprove_"+n+"']")).click();
          	    Thread.sleep(1000);
         	    BtnOk.click();
          	    }
          	    break;
             }
            break;
         case 'B'://Approve and Ignore All
      	   int y=2;
      	   switch(y)
      	   {
      	   case 1:
      		 for(int k=0;k<1;k++)
    		   {
    			Thread.sleep(2000);
    		   driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedMessages_lnkbtnRecApprove_"+k+"']")).click();
    		                                   
    		   Thread.sleep(1000);
    		   String PopUpMsg=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
    		 
    		   String Insuff="Your account have insufficient credits.";
    		   if(PopUpMsg.contains(Insuff))
    		   {
    			   Thread.sleep(1000);
    			 Thread.sleep(1000);                                    
        	     String CODSentMsgCBValue=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedMessages_lnkbtnRecApprove_"+k+"']")).getAttribute("id");
        	     System.out.println(CODSentMsgCBValue);
        	 
        	     Integer result = Integer.valueOf(CODSentMsgCBValue.charAt(44)-116);
        	     int CODSentMsgCBValue1=CODSentMsgCBValue.charAt(44)-116;
        	   String InmateName=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedMessages_lblReceivedFrom_"+CODSentMsgCBValue1+"']")).getText();
       	       System.out.println(InmateName);
       	       Thread.sleep(1000);
      		   BtnOk.click();
      		   Thread.sleep(5000);
           		PurchaseCredit.click();
           		Thread.sleep(2000);
           		Select Inmates=new Select(InmateNames);
           		Thread.sleep(2000);
           		Inmates.selectByVisibleText(driver.findElement(By.xpath("//select[@id='ddlInmate']/option[contains(text(),'"+InmateName+"')]")).getText());
           		Thread.sleep(1000);
           		Select creditamts=new Select(CreditAmt);
           		creditamts.selectByVisibleText("$ 20.00");
           		Thread.sleep(1000);
           		int P=1;
           		switch(P)
           		{
           		case 1:
           			Thread.sleep(1000);
           			Purchase.click();
           			break;
           		case 2:
           			Thread.sleep(1000);
           			Cancel.click();
           			break;
           		}
           		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           		Paypal_uname.sendKeys("inmateinbox-buyer5@sgstechie.com");
           		Thread.sleep(1000);
           		Next.click();
           		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
           		Paypal_passwd.sendKeys("SGS@2017");
           		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
           		Login.click();
           		Thread.sleep(25000);
           		Pay.click();
           		Thread.sleep(10000);
           		boolean paymentStatus=driver.findElement(By.className("divPaymentStatus")).isDisplayed();
           		
           		if(paymentStatus==true)
           		{
           			System.out.println(driver.findElement(By.className("divPaymentStatus")).getAttribute("id"));
           		}
             	 }
      		   
    		   else{
    			 
    			 Thread.sleep(1000);
  			     System.out.println(PopUpMsg);
    		     BtnOk.click();
    		   }}
      		   break;
      	   case 2:
      		  String PopUpMsgs=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
      		   Thread.sleep(1000);
      		   for(int p=0;p<1;p++)
      		   {
      		   driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedMessages_lnkbtnDisRecApprove_"+p+"']")).click();
      		   Thread.sleep(1000);
      		   System.out.println(PopUpMsgs);
      		   BtnOk.click();
      		   }
      		   break;
      	   }
         }
     }
     public void COD_SentPhotos() throws InterruptedException
     {                                     
         List<WebElement> ApproveIgnore1=driver.findElements(By.xpath("//*[@type='checkbox']")); 
                                             
         char ApproveIgnoreAll1='B';
         switch(ApproveIgnoreAll1)
         {
         case 'A'://Accept and Ignore once
      	   int x=2;
             switch(x)
             {
             case 1:
              
            	 Thread.sleep(1500);
            	 for(int k=0;k<1;k++)
                 {
              	 Thread.sleep(1000);
              	 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkBtnApprovePhotos']")).click();
              	 Thread.sleep(1000);                  
              	 String s3=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
              	 String s4="Please choose any photos from the list.";
              	 if(s3.contains(s4))
              	 {
              	 Thread.sleep(2000);
              	 BtnOk.click();
              	 Thread.sleep(1500);
            	     driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedPhotos_chkRow3_"+k+"']")).click();
            	
            	     Thread.sleep(2000);
          	    
          	     if(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).isDisplayed())
          	     {
          	    	 String CODPopup=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
          	     String s1="Credit balance is low.";
          	     if(CODPopup.contains(s1))
          	     {
            	     Thread.sleep(2000);     
            	     BtnOk.click();
            	     Thread.sleep(1000);
            	     String CODSentPhotoValue=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedPhotos_chkRow3_"+k+"']")).getAttribute("id");
            	     System.out.println(CODSentPhotoValue);
            	 
            	     Integer result = Integer.valueOf(CODSentPhotoValue.charAt(44)-51);
            	    int CODSentPhotoValue1=CODSentPhotoValue.charAt(44)-51; 
            	     System.out.println(CODSentPhotoValue1);
            	    String InmateName=driver.findElement(By.xpath(" //*[@id='ContentPlaceHolder1_rptReceivedPhotos_lblSentTo_"+CODSentPhotoValue1+"']")).getText();
            	    System.out.println(InmateName); 
            		Thread.sleep(5000);
            		PurchaseCredit.click();
            		Thread.sleep(2000);
            		Select Inmates=new Select(InmateNames);
            		Thread.sleep(2000);
            		Inmates.selectByVisibleText(driver.findElement(By.xpath("//select[@id='ddlInmate']/option[contains(text(),'"+InmateName+"')]")).getText());
            		Thread.sleep(1000);
            		Select creditamts=new Select(CreditAmt);
            		creditamts.selectByVisibleText("$ 20.00");
            		Thread.sleep(1000);
            		int P=1;
            		switch(P)
            		{
            		case 1:
            			Thread.sleep(1000);
            			Purchase.click();
            			break;
            		case 2:
            			Thread.sleep(1000);
            			Cancel.click();
            			break;
            		}
            		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            		Paypal_uname.sendKeys("inmateinbox-buyer5@sgstechie.com");
            		Thread.sleep(1000);
            		Next.click();
            		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            		Paypal_passwd.sendKeys("SGS@2017");
            		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            		Login.click();
            		Thread.sleep(25000);
            		Pay.click();
            		Thread.sleep(10000);
            		boolean paymentStatus=driver.findElement(By.className("divPaymentStatus")).isDisplayed();
            		
            		if(paymentStatus==true)
            		{
            			System.out.println(driver.findElement(By.className("divPaymentStatus")).getAttribute("id"));
            		}
              	 }}
              	 
              	else{
           		 Thread.sleep(2000);
           		 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkBtnApprovePhotos']")).click();
           		 Thread.sleep(1000);
           		 String S4=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
           		 System.out.println(S4); 
           		 Thread.sleep(1000);          
           		 BtnOk.click();
                 }}
                 }
          	     break;
             case 2:
          	   for(int r=0;r<1;r++)
          	   {
          	    Thread.sleep(1500);
          	    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedPhotos_lnkbtnDisApprove_"+r+"']")).click();
          	    Thread.sleep(1000);
          	    String S5=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
        	    System.out.println(S5); 
         	    BtnOk.click();
          	   }
          	   break;
             }
            break;
         case 'B'://Approve and Ignore All
      	   int y=2;
      	   switch(y)
      	   {
      	   case 1:
      		  /* Thread.sleep(1500);
      		   ApproveAllPhotos.click();
      		   Thread.sleep(1000);
      		   String SentPhotosPopup=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
      		   String SentPhotosPopup1="Please choose any photos from the list.";
      		   String SentPhotosPopup2="Credit balance is low.";
      		   String SentPhotosPopup3="Processed Successfully.";
      		  
      		   if(SentPhotosPopup.contains(SentPhotosPopup1))
      		   {
      			  Thread.sleep(1000); 
      			  BtnOk.click();
      			  Thread.sleep(1000);
      			  System.out.println(SentPhotosPopup1);
      			  for(int i=0;i<1;i++)
      			  {
      			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedPhotos_chkRow3_"+i+"']")).click();
      			ApproveAllPhotos.click();
      			  }
      			if(SentPhotosPopup.contains(SentPhotosPopup2))
      			{
    
      				Thread.sleep(1000); 
        			  BtnOk.click();
      				System.out.println();
      			}
      			else{
      				Thread.sleep(1000); 
        			  BtnOk.click();
        			  System.out.println(SentPhotosPopup3);
      			}
      		   }*/
      		   for(int k=0;k<1;k++)
      		   {
      		 Thread.sleep(2000);         
  		   driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedPhotos_lnkbtnApprove_"+k+"']")).click();
  		                                   
  		   Thread.sleep(1000);
  		   String PopUpMsg=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
  		 
  		   String Insuff="Your account have insufficient credits.";
  		   if(PopUpMsg.contains(Insuff))
  		   {
  			   Thread.sleep(1000);
  			 Thread.sleep(1000);                                    
      	     String CODSentMsgCBValue=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedPhotos_lnkbtnApprove_"+k+"']")).getAttribute("id");
      	     System.out.println(CODSentMsgCBValue);
      	 
      	     Integer result = Integer.valueOf(CODSentMsgCBValue.charAt(44)-64);
      	     int CODSentMsgCBValue1=CODSentMsgCBValue.charAt(44)-64;
      	   String InmateName=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedPhotos_lblSentTo_"+CODSentMsgCBValue1+"']")).getText();
     	       System.out.println(InmateName);
     	       Thread.sleep(1000);
    		   BtnOk.click();
    		   Thread.sleep(5000);
         		PurchaseCredit.click();
         		Thread.sleep(2000);
         		Select Inmates=new Select(InmateNames);
         		Thread.sleep(2000);
         		Inmates.selectByVisibleText(driver.findElement(By.xpath("//select[@id='ddlInmate']/option[contains(text(),'"+InmateName+"')]")).getText());
         		Thread.sleep(1000);
         		Select creditamts=new Select(CreditAmt);
         		creditamts.selectByVisibleText("$ 20.00");
         		Thread.sleep(1000);
         		int P=1;
         		switch(P)
         		{
         		case 1:
         			Thread.sleep(1000);
         			Purchase.click();
         			break;
         		case 2:
         			Thread.sleep(1000);
         			Cancel.click();
         			break;
         		}
         		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         		Paypal_uname.sendKeys("inmateinbox-buyer5@sgstechie.com");
         		Thread.sleep(1000);
         		Next.click();
         		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         		Paypal_passwd.sendKeys("SGS@2017");
         		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         		Login.click();
         		Thread.sleep(25000);
         		Pay.click();
         		Thread.sleep(10000);
         		boolean paymentStatus=driver.findElement(By.className("divPaymentStatus")).isDisplayed();
         		
         		if(paymentStatus==true)
         		{
         			System.out.println(driver.findElement(By.className("divPaymentStatus")).getAttribute("id"));
         		}
           	 }
      		   
  		   else{
  			 
  			 Thread.sleep(1000);
			   System.out.println(PopUpMsg);
  		     BtnOk.click();
  		   }}
      	   }
      		   break;
      	   case 2:
      		  /* Thread.sleep(1000);
      		   driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkDisapprovePhotos']")).click();
      		   Thread.sleep(1500);
      		   String PhotosIgnoreAllPopup=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
      		   String PhotosIgnoreAllPopup1="Please choose any photos from the list.";
      		
      		   if(PhotosIgnoreAllPopup.contains(PhotosIgnoreAllPopup1))
      		   {
      			   Thread.sleep(1000);
      			   BtnOk.click();
      			   for(int k=0;k<1;k++)
      			   {
      				Thread.sleep(1000);
      			   driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedPhotos_chkRow03_"+k+"']")).click();
      			   Thread.sleep(1000);
      			   driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkDisapprovePhotos']")).click();
      			   Thread.sleep(1000);           
    			   BtnOk.click();
       			   }
      		   }*/
      		   String PopUpMsgs=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uctlMessage_lblMessage']")).getText();
    		   Thread.sleep(1000);
    		   for(int q=0;q<1;q++)
    		   {
    		   driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptReceivedPhotos_lnkbtnDisApprove_"+q+"']")).click();
    		   Thread.sleep(1000);
    		   System.out.println(PopUpMsgs);
    		   BtnOk.click();
    		   }
      		   break;
      	   }
         }
     }



