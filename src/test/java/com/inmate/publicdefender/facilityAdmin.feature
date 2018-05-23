Feature: Inmate Facility Admin
@LoginFacilityAdmin
Scenario:Facility Admin login
Given Enter the Inmate app URL
 When Enter username and password to LogIn
  | USERNAME  | 2411facadmin	 |
  | PASSWORD  | mangai123      |
 
 @SortingRequest
 Scenario:Sort f1
 Then Sort the f1
 | TYPE                | f1      | 
 | STATUS              | All          |
 | CREATED START DATE  | 01/12/2018   |               
 | CREATED END DATE    | 01/12/2018   |               
 | RESP START DATE     | 01/12/2018   |               
 | RESP END DATE       | 01/12/2018   |               
 | INMATE LASTNAME     | John         |               
 | INMATE FRSTNAME     | PETER        |               
 | POD                 | A            | 
 
 @SortingInitiateMessage
  Scenario:Sort Initiate Message
  Then Sort Message to Inmate
 | TYPE                | Message To Inmate 1  |            
 | STATUS              | All          |
 | CREATED START DATE  | 12/28/2017   |               
 | CREATED END DATE    | 12/28/2017   |               
 | RESP START DATE     | 12/28/2017   |               
 | RESP END DATE       | 12/28/2017   |               
 | INMATE LASTNAME     | John         |               
 | INMATE FRSTNAME     | PETER        |  
 
 @CreateNewMsg1
 Scenario:Click Initiate Message to Inmate
 Then Initiate Message to Inmate
 | MESSAGE TYPE  | Message To Inmate 1 | 
 | DESCRIPTION   | Hello dear wrruu    |
  
 @SendMsg1
 Scenario:Click Message to Inmate
 And Click Message to Inmate
 | TYPE                | Message To Inmate 1  |            
 | STATUS              | All          |
 | CREATED START DATE  | 12/28/2017   |               
 | CREATED END DATE    | 12/28/2017   |               
 | RESP START DATE     | 12/28/2017   |               
 | RESP END DATE       | 12/28/2017   |               
 | INMATE LASTNAME     | John         |               
 | INMATE FRSTNAME     | PETER        |               
 | TEXT DESCRIPTION    | Welcome to Inmate family |
  
 @Visitor
 Scenario:Goto Grievences and search Request
 Then Goto Grievences,search Visitor,Approve Visitor
 | TYPE               | Visitor               |
 | STATUS             | All                   |
 | DISAPPROVAL REASON | You are Not eligible  |
 
 @f1
 Scenario:Goto Grievences,search f1,send msg
 Then Goto Grievences,search f1,send msg
 | TYPE                | f1           | 
 | STATUS              | All          |
 | CREATED START DATE  | 12/28/2017   |               
 | CREATED END DATE    | 12/28/2017   |               
 | RESP START DATE     | 12/28/2017   |               
 | RESP END DATE       | 12/28/2017   |               
 | INMATE LASTNAME     | John         |               
 | INMATE FRSTNAME     | PETER        |               
 | POD                 | A            |               
 | TEXT DESCRIPTION    | Hai,How are yu |
 
 @Admin
 Scenario:Goto Grievences,search Admin,fill Request Remedy Form
 Then Goto Grievences,search Admin,fill Request Remedy Form
 | TYPE                | Admin               |
 | STATUS              | New                 |
 | CREATED START DATE  | 12/28/2017  				 |               
 | CREATED END DATE    | 12/28/2017   		 	 |               
 | RESP START DATE     | 12/28/2017  				 |               
 | RESP END DATE       | 12/28/2017  				 |               
 | INMATE LASTNAME     | John        				 |               
 | INMATE FRSTNAME     | PETER             	 |               
 | POD                 | A            			 |   
 | INVESTIGATION       | Theft case          |
 | REVIEW              | Review12345         |
 | SIGNATURE           | Morkel              |
 | Title               | Title12345          |
 
 @Documents
 Scenario:Click Documents
 When I click Documents
 | DOCUMENT TITLE   | Certificate  |
 
 
 @EditDocuments
 Scenario:Edit Documents
 Then Edit Documents
 | DOCUMENT NAME | Certif      |
 | STATUS        | Active     |
 | FROM DATE     | 01/08/2018 |
 | TO DATE       | 04/16/2018 |
 
 @DeleteDocuments
 Scenario:Delete Documents
 Then Delete Documents
 | DOCUMENT NAME | Certif      |
 | STATUS        | Active     |
 | FROM DATE     | 01/23/2018 |
 | TO DATE       | 04/16/2018 |
 
 @DocumentSort
 Scenario:Perform sorting in documents
 Then Perform Sorting in Documents
 
 
 @LockDown
 Scenario:Lock and unlock
 Then Lock,Unlock kiosk/inmate settings lockdown
 
 @LockDownSorting
 Scenario:Perform sorting in LockDown
 Then Perform Sorting in LockDown
 
 @inmateSearch
 Scenario:Goto Inmate,search,edit
 Then Click Inmate,search and edit the inmate
 | ID                 | 11	     |
 | POD                |  B  	   |
 | LAST NAME          | John	   |
 | FIRST NAME         | PETER    |
 | GENDER             | Male     |
 | KIOSK ACCESS       | Yes      |
 | STATUS             | Active   |
 | FREQUENCY LIMIT    | 10       |
 | NOTES              |Inmate means,A person living in an institution such as a prison or hospital |
 | WRONG EMAIL        | aaa@           |
 | CORRECT EMAIL      | inm@gmail.com  |
 	
 @InmateMessages
 Scenario:Click Inmate message
 And Click Inmate Message
 | LAST NAME  | PRIYA    |
 | FIRST NAME | MANGAI   |
 
 @InmatePhotos
 Scenario:Click Inmate Photos
 And Click Inmate Photos
 | LAST NAME  | PRIYA    |
 | FIRST NAME | MANGAI   |
 | STATUS     | ALL      |
 
 @InmateConnRequest
 Scenario:Goto Connection Request
 Then Goto Connection Request and review the information
 
 @inmateSort
 Scenario:Perform Sorting in inmates
 Then Perform Sorting in inmates
 
 @publicUserSearch
 Scenario:Goto public users
 Then Click public users
 | LAST NAME     | PRIYA    |
 | FIRST NAME    | MANGAI   |
 | TEXT NOTES    | Inmate means,A person living in an institution such as a prison or hospital |
 
 @publicUserMessages
 Scenario:Goto public user Messages
 Then Click public user messages
 | LAST NAME     | BROWN   |
 | FIRST NAME    | JALIL   |
 
 @publicUserPhotos
 Scenario:Goto public user Photos
 And Click public user Photos
 | LAST NAME     | John     |
 | FIRST NAME    | PETER    |
 
 @PublicUserSort
 Scenario:Goto PublicUser and Sort
 Then Goto PublicUser and Sort 
 
 @Messages
 Scenario:Click Messages,Search and Translate
 Then Click Messages,Search and Translate
 | INMATE LASTNAME | John  |
 | INMATE FRSTNAME | PETER |
 | PUBLIC USER LASTNAME | priyatest  |
 | PUBLIC USER FRSTNAME | mangai     |
 | FROM DATE            | 01/10/2017 |
 | TO DATE              | 02/10/2018 |
 | DIRECTION            | From Inmate   |
 | FLAGS                | No Flag       |
 | STATUS               | Active        |
 
 @Photos
 Scenario:Click Photos and review
 Then Click Photos and review
 | INMATE LASTNAME      | John       |
 | INMATE FRSTNAME      | PETER      |
 | PUBLIC USER LASTNAME | PRIYA      |
 | PUBLIC USER FRSTNAME | MANGAI     |
 | FROM DATE            | 01/10/2017 |
 | TO DATE              | 02/10/2018 |
 | STATUS               | ALL        |
 
 
 @Keyword
 Scenario:Click Keywords and Add,Search,Update
 Then Click Keywords and Add,Search,Update
 | KEYWORD          | inmates |
 | WEB USER ACTION  | Flag    |
 | INMATE ACTION    | Flag    |
 | FILTER TYPE      | Partial Word |
 | STATUS           | Active       |
 
 @NoticesAdd
 Scenario:Click Notices and Add
 Then Click Notices and Add
 | TITLE        | Notice1 |
 | DESCRIPTION  | Notice is the legal concept describing a requirement that a party be aware of legal process affecting their rights, obligations or duties.|
 | START DATE   | 01/10/2018  |
 | END DATE     | 02/10/2018  |
 
 @NoticeUpdate
 Scenario:Search and Update the Notices
 And Search and Update the Notices
 | KIOSK      | A1          |
 | START DATE | 01/10/2018  |
 | END DATE   | 02/10/2018  |
 | STATUS     | Active      |
  
 @Reporting
 Scenario:Goto Reporting and search
 Then Click Reporting and search
 | TYPE       | f1          |
 | STATUS     | Both        |
 | START DATE | 01/10/2018  |
 | END DATE   | 02/10/2018  |
 
 
 