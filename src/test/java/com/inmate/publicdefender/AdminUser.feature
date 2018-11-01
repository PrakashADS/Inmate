Feature: Inmate Admin Login

  @Login
  Scenario: Login Admin User
    Given Enter the Inmate Admin URL
    When Enter userName and passWord to LogIn AdminUser
      | USERNAME | test     | admin       |   
      | PASSWORD | test@123 | Admin123    |

  @Facility
  Scenario:Goto Facility page
  Then Goto Facility page
  | CODE          | Code  |						 |
  | FACILITY NAME | Fac   |						 |
  | EMAIL         | test  | @test.com  |
  | PHONE         | 9998887770  |      |
  | ADDRESS       | Test Address| 		 |
  | CITY          | California  |      |
  | STATE         | Florida     |      |
  | PINCODE       | 32210       |      |
  | COMMISSARY URL |http://inmatecr01.sgssys.info/Admin/AddFacility.aspx |  |
  | LAW LIBRARY URL|http://inmatecr01.sgssys.info/Admin/AddFacility.aspx |  |
  | FREQUENCY LIMIT   | 50 | |
  | LIMITS OER SOURCE | 5  | |
  | SERVER URL        | 192.168.10.27    | |
  | FILE PATH         |  /Inmate/Inmate  | |
  | USERNAME          | inmate_ftp   | |  
  | PASSWORD          | inmate2017   | | 
  | VISITOR REQ FORM  | VisReqForm1  | |
  | PUBLIC DEF FORM   | PDForm1      | |
  | PDS FORM          | PDS1         | |
  | REMEDY FORM       | Remedy form1 | |
  | REQUEST FORM1     | ReqForm1     | |
  | MESSAGE TO INMATE | MsgtoInmate1 | |
  | FROM TIME         | 01:00        | |
  | TO TIME           | 01:15        | |
  | FOR               | Break time   | |
  | MESSAGE COST      | 0.01         | |
  | PHOTO COST        | 0.01         | |
  
  
@RegUsers
Scenario: Click registered users
Then Click the Registered Users
    
@MgmtUsers
Scenario:Goto Management users and Add Users
Then Goto Management users and Add Users
| FIRST NAME   | suresh 		|
| MIDDLE NAME  | xxx  	    |
| LAST NAME    | raina 		  |
| USERNAME     | suresh 	 	|
| PASSWORD     | suresh123  |
| EMAIL        |xyz@abc.com|
| ADDRESS      | 12,db road|
| CITY         | Miami     |
| STATE        | Florida   |
| ZIPCODE      | 32216     |
| PHONE        |1234567890 |

 @RegisteredUsers
 Scenario:Goto Registered users
 Then Goto Registered users          

 @Dashboard
 Scenario:Goto Dashboard
 Then Goto Dashboard
 
 @Documents
 Scenario:Goto Documents Page
 Then Goto Documents Page
 
 @LockDown
 Scenario:Goto LockDown page
 Then Goto LockDown page
 
 @RevenueReport
 Scenario:Goto Revenue Report page
 Then Goto Revenue Report page
 
 @Pod
 Scenario:Goto POD page
 Then Goto POD page
 
 @Kiosks
 Scenario:Goto Kiosk page
 Then Goto Kiosk page
 
 @Inmate
 Scenario:Goto Inmate page
 Then Goto Inmate page
 |FROM DATE | 01/24/2017 |
 |TO DATE   | 05/10/2018 |
 |DIRECTION | --ALL--    |
 |NOTE      | Test Test Test|
 |EMAIL     |mangaipriya@themajesticpeople.com |
 
 @Publicusers
 Scenario:Goto Public users
 Then Goto Public user page
 |FROM DATE | 01/24/2017 |
 |TO DATE   | 05/10/2018 |
 |DIRECTION | --ALL--    |
 
@GrievancesRequest
 Scenario:Goto Grievances and Requests page
 Then Goto Grievances and Requests page
 
 @Messages
 Scenario:Goto Messages page
 Then Goto Messages page
 | INMATE LASTNAME | John  |
 | INMATE FRSTNAME | PETER |
 | PUBLIC USER LASTNAME | priyatest  |
 | PUBLIC USER FRSTNAME | mangai     |
 | FROM DATE            | 01/10/2017 |
 | TO DATE              | 02/10/2018 |
 | DIRECTION            | From Inmate   |
 | FLAGS                | No Flag       |
 | STATUS               | Active        |
 | SUBJECT              | demo          |
 
 @Photos
 Scenario:Goto Photos
 Then Goto Photos
 | LAST NAME   | priyatest  |
 | FIRST NAME  | mangai     |
 | STATUS      | ALL        |
 
 @Keywords
 Scenario:Goto keywords page
 Then Goto keywords page
 | KEYWORD          | inmates |
 | WEB USER ACTION  | Flag    |
 | INMATE ACTION    | Flag    |
 | FILTER TYPE      | Partial Word |
 | STATUS           | Active       |
 
 @Notices
 Scenario:Goto Notice page
 Then Goto Notice page
 | TITLE        | Notice1 |
 | DESCRIPTION  | Notice is the legal concept describing a requirement that a party be aware of legal process affecting their rights, obligations or duties.|
 | START DATE   | 01/10/2018  |
 | END DATE     | 02/10/2018  |
 | SELECT KIOSK | A1          |
 | START FROM   | 01/10/2018  |
 | END FROM     | 06/20/2018  |
 | STATUS       | Active      |
 
 @Reporting
 Scenario:Goto Reporting page and Sort
 Then Goto Reporting page and Sort
 
 @DndUsers
 Scenario:Goto DND users and Add 
 Then Goto DND users and Add 
  