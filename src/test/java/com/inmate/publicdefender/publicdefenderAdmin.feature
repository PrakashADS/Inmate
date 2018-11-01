Feature: Inmate public defender
@Login
Scenario:Inmate Public Defender Login
  Given Enter the Inmate app URL
  When Enter username and password to LogIn
  | USERNAME  | 2411pdadmin	 |
  | PASSWORD  | mangai123    |
 
 @GrievancesInitiate
 Scenario:Goto Grievances and initiate Message
 Then Goto Grievances and initiate Message
 
 @RequestSearchAssignStaff
 Scenario:Goto Grievances and Request Search
 Then Goto Grievances,Request Search and Assign public staff
 | STATUS              | New          |               |
 | CREATED START DATE  | 02/01/2018   |               |
 | CREATED END DATE    | 12/28/2017   |               |
 | RESP START DATE     | 12/28/2017   |               |
 | RESP END DATE       | 12/28/2017   |               |
 | INMATE LASTNAME     | John         |               |
 | INMATE FRSTNAME     | PETER        |               |
 | POD                 | A            |               |
 | PUBLIC DEFENDER     | 262          | staff2 public |
 
 
 @CreateNewMsg
 Scenario:Create New Messages
 And Create New Messages
 | MESSAGE TYPE  | Message To Inmate 1 | 
 | DESCRIPTION   | Hello dear How ruu  |
 
 @SearchMsg
 Scenario:Search the message
 And Search the Message
 | TYPE    | Message To Inmate 1     |||
 | STATUS  | New   | Request Opened  | All |
 | REQ START DATE  | 12/21/2017      |||
 | REQ END DATE    | 12/21/2017      |||
 | RESP START DATE | 12/21/2017      |||
 | RESP END DATE   | 12/21/2017      |||
 | INMATE LASTNAME | John            |||
 | INMATE FRSTNAME | PETER           |||
 
 @MsgToInmate1
 Scenario:Goto Message to Inmate
 And Goto Message to Inmate
 | TEXT DESCRIPTION | Welcome boss |
 
 @SortInitiateMsg
 Scenario:Sort initiate message
 Then Sort initiate message
 | TYPE    | Message To Inmate 1     |
 | STATUS  | 										 All |
 

 