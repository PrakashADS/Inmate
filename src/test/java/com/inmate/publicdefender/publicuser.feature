Feature: Inmate Public User Login

@SignupPublicUser
Scenario:public User Signup
  Given Enter the Inmate public user URL
  When Signup using values
  | FIRST NAME     | Mathew                 |
  | LAST NAME      | Hayden                 |
  | EMAIL          | 1mathay@gmails.com      |
  | CONFIRM EMAIL  | 1mathay@gmails.com      |
  | USERNAME       | MatHayden              |
  | PASSWORD       | MatHay@123             |
  | RE PASSWORD    | MatHay@123             |
  | PHONE NUMBER   | 9999999999             |
  | ADDRESS1       | 123,Harington Road     |
  | ADDRESS2       | Florida                |
  | DOB            | 02/02/1980             |
  | GENDER         | Male                   |
  | CITY           | Phoenix                |
  | STATE          | Arizona                |
  | ZIPCODE        | 64101                  |
  
  @LoginUsingRegUsers
  Scenario:Login using registered values
  Given Enter the Inmate public user URL
  Then Login using registered values
   | USERNAME       | 1MatHayden            |
   | PASSWORD       | MatHay@123            |
 
 @LoginPublicUser
 Scenario:Signin public user
 Given Enter the Inmate public user URL
 Then Enter userName and passWord to LogIn
  | USERNAME  | prabhu	   |
  | PASSWORD  | prabhu123  | 
  
  @FindInmate
Scenario:Find the inmate
And Find the Inmate
| STATE        | Alaska   |
|FACILITY CODE | fac2411  |
|RELATIONSHIP  | Son      |

@PurchaseCredit
Scenario:Goto purchaseCredit and buy
Then Goto purchaseCredit and buy
| | |

@NewMsg
Scenario:Create the Message
Then Create the Message and send
| INMATE NAME  | John PETER A - fac2411 |
| SUBJECT      |  family fn  |
| MESSAGE      |  family fn  |
 
 @NewPhoto 
 Scenario:Create the Photo and send
 And Create the Photo and send
| INMATE NAME  | John PETER A - fac2411 |
| SUBJECT      | Rug                    |

@Inbox
Scenario:Goto Inbox and Reply
Then Goto Inbox,Search message and Reply
| SEARCH NAME  | Arn          |
| MESSAGE      | Test message |

@Archived
Scenario:Goto Archived and Reply
Then Goto Archived,Search message and Reply
| SEARCH NAME  | Arn          |
| MESSAGE      | Test message |

@SortInbox
Scenario:Sort the inbox
Then Sort the inbox

@SortSentItems
Scenario:sort the sent items
Then Sort the Sent items

@SortFindtheInmate
Scenario:Find the inmate
Then Find the inmate
| STATE        | Alaska   |
|FACILITY CODE | fac2411  |

@SortMyContacts
Scenario:Sorting My Contacts
Then Sorting My Contacts
| SEARCH CONTACT  | 13                       |
| INMATE NAME     | Jenkins PAUL A - fac2411 |
| TRANSFER AMOUNT | 0.01                     |


