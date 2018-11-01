Feature: Inmate Public User Login

 @LoginPublicUser
 Scenario:Signin public user
 Given Enter the Inmate public user URL
 Then Enter userName and passWord to LogIn
  | USERNAME  | mangai    |
  | PASSWORD  | mangai123 |

@NewMsg
Scenario:Create the Message
Then Create the Message and send
| INMATE NAME  | BENNETT JORDAN ALAN - fac2612    |
| SUBJECT      | Bday Function                    |
| MESSAGE      | Have a nice day                  |
| CREDIT AMOUNT| $ 5.00                           |
| PAYPAL UNAME | inmateinbox-buyer5@sgstechie.com |
| PAYPAL PASSWD| SGS@2017                         |
 
 @NewPhoto 
 Scenario:Create the Photo and send
 And Create the Photo and send
| INMATE NAME  | John PETER A - fac2411 |
| SUBJECT      | Test Image             |

@Inbox
Scenario:Goto Inbox and Reply
Then Goto Inbox,Search message and Reply
| SEARCH NAME  | peter ma                         |
| MESSAGE      | Welcome to inmate                |
| CREDIT AMOUNT| $ 5.00                           |
| PAYPAL UNAME | inmateinbox-buyer5@sgstechie.com  |
| PAYPAL PASSWD| SGS@2017                         |
  
 @FindInmate
Scenario:Find the inmate
And Find the Inmate
| STATE        | Arkansas   |
|FACILITY CODE | fac2612    |
|RELATIONSHIP  | Son        |
|FIRST NAME    | PAUL       |
|LAST NAME     |            |
|INMATE ID     |            |
|DATE          | 10/11/2018 |

@SortFindtheInmate
Scenario:Find the inmate
Then Find the inmate
| STATE        | Arkansas     |
|FACILITY CODE | fac2612      |

@SortMyContacts
Scenario:Sorting My Contacts
Then Sorting My Contacts
| SEARCH CONTACT  | John                     |
| INMATE NAME     | John PETER A - fac2411   |
| TRANSFER AMOUNT | 0.01                     |

@SentPhotos
Scenario:Goto SentPhotos 
Then Goto SentPhotos
| SEARCH NAME     | John     |

@CODpending
Scenario:Goto COD Pending
Then Goto COD Pending

@ArchivedMsg
Scenario:Goto Archived
Then Goto Archived page
| SEARCH NAME   | peter          |
| REPLY MESSAGE | where are you? |
| CREDIT AMOUNT| $ 5.00                           |
| PAYPAL UNAME | inmateinbox-buyer5@sgstechie.com |
| PAYPAL PASSWD| SGS@2017                         |


@PurchaseCredit
Scenario:Perform purchase credit
Then Click purchase credit and pay
| INMATE NAME  | John PETER A - fac2411           |
| CREDIT AMOUNT| $ 5.00                           |
| PAYPAL UNAME | inmateinbox-buyer5@sgstechie.com |
| PAYPAL PASSWD| SGS@2017                         |









