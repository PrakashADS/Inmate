Feature: Kiosk
@LoginPage
Scenario: Kiosk Login
Given Enter the Kiosk app URL
When Enter the kiosk username and password to login
  
@LoginPage1
Scenario: Kiosk Login
Given Enter the Kiosk app URL
When Enter the kiosk userName and passWord to login
 
 @MyContacts
 Scenario:Goto Mycontacts and Accept
 Then Goto Mycontacts and Accept 
 
@RequestsPage
Scenario: Goto Request and send the Messages
Then Goto Request and send the Messages
 
 @f1
 Scenario:Select f1,send form
 Then Select f1,send form
 
 @f1Reply
 Scenario:Send reply to f1
 Then Send reply to f1
 
 @Visitors
 Scenario:Select Visitor and add visitor
 And Select Visitor and add visitor
 
 @PdForm
 Scenario:Create PdForm
 Then Create the PdForm
 
 @ReplyPdForm
 Scenario:Send reply to pdForm
 Then Send reply to pdForm
 
@Messages
Scenario:Goto Messages and Reply
Then Goto Messages and Reply
 
@Photos
Scenario:Goto Photos and see
And Goto Photos and see