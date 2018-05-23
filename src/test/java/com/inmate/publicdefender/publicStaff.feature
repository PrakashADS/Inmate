Feature: Inmate public defender Staff
@LoginPubStaff
Scenario:public Staff login
Given Enter the Inmate app URL
When Enter username and password to LogIn
  | USERNAME  | Smith661 |2411pdstaff	 |
  | PASSWORD  | Smith123 |mangai123    |
 
 @RequestSearch
 Scenario:Goto Grievances and Request Search
 Then Goto Grievances and Search Request1
 | STATUS              | New          |               
 | CREATED START DATE  | 02/01/2017   |               
 | CREATED END DATE    | 12/28/2017   |               
 | RESP START DATE     | 12/28/2017   |               
 | RESP END DATE       | 12/28/2017   |             
 | INMATE LASTNAME     | John         |              
 | INMATE FRSTNAME     | PETER        |               
 | POD                 | A            |               
 
 
 @ReplyTxtPdfBoth
Scenario:Reply using Text PDF and Both
And Reply using Text PDF and Both
 |                  |                |
 | TEXT DESCRIPTION | hoi hw r u     |
    
@InitiateMsg
Scenario:Click Initiate message to Inmate
Then Click Initiate message to Inmate

@createNew
Scenario:Create New Message
Then Create New Message
 | TYPE             | Message To Inmate 1   |
 | TEXT DESCRIPTION | Hi Inmate,Wr r u      |
 
 @SearchMsgs
 Scenario:Search the message
 And Search the Messages
 | TYPE        | Message To Inmate 1 |||
 | STATUS      | New                 | Request Opened  | Request Opened |
 | REQ START DATE  | 12/21/2017      |||
 | REQ END DATE    | 12/21/2017      |||
 | RESP START DATE | 12/21/2017      |||
 | RESP END DATE   | 12/21/2017      |||
 | INMATE LASTNAME | BROWN           |||
 | INMATE FRSTNAME | JALIL           |||
 
 @MsgToInmates1
 Scenario:Goto Message to Inmate
 And Goto Message to Inmates
 | TEXT DESCRIPTION | Welcome to Inmate Team |
 
@SortInitiateMessage
Scenario:Sort initiate message
Then Sort initiate message
 | TYPE        | Message To Inmate 1 |
 | STATUS      | All                 |
 