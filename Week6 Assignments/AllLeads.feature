Feature: Create,Edit Leads in Leaftaps
Background: 
Given Open the Chrome browser adn Load the URL
And Enter the Username as Demosalesmanager and Password as crmsfa
And Click the Login Button 
And Click the CRMSFA Link
And Click the Leads Link

Scenario Outline:: Create leads.
And Click the Create Lead Link
And Enter the Company Name as <Company Name>
And Enter the First Name as <First Name>
And Enter the Last Name as <Last Name>
When Click on the Create Lead Button
Then Verify the Lead Creation
And Logout and close Browser 

Examples:
|Company Name|First Name|Last Name|
|Zoho|Sriram|S|
|Amazon|Adarsh|Krishna|
|Paypal|Hari|R|

Scenario Outline: Edit leads.
And Click on Find Lead Link
And Enter the Company name <Company Name1>
And Enter the First name <First Name1>
And Enter the Last name <Last Name1>
And Click on Find Button
And Select the Record
And Click on Edit Button
And Enter the New Company Name <New Company Name>
When Click on Submit button
Then Verify the Lead Updation
And Logout and close Browser 

Examples:
|Company Name1|First Name1|Last Name1|New Company Name|
|Zoho|Sriram|S|MindTree|
|Amazon|Adarsh|Krishna|Infosys|
|Paypal|Hari|R|HCL|


Scenario: Duplicate leads.
And Click on Find Lead Link
And Click on Phone tab  
And Enter Phone number  
And Click on Find Button
And Select the Record
And Click on Duplicate leads Button
When Click on Submit button
Then Verify the Lead Creation
And Logout and close Browser


Scenario: Merge leads.
And Click on Merge Lead Link
And Click on First Lookup icon 
And Enter the Fname in lookup as Balaji
And Click on Findlead Button
And Store the leadID of First record
And Select the Record
And Click on Second Lookup icon  
And Enter the Fname in lookup as Ramji  
And Click on Findlead Button
And Select the Record
And Click on Merge Button
And Accept popup alert
When Click on Submit button
And Click on Find Lead Link
And Enter the LeadID
And Click on Find Button
Then Verify the Lead Merge
And Logout and close Browser


Scenario: Delete leads.
And Click on Find Lead Link
And Click on Email tab
And Enter Email Address as xyz@gmail.com  
And Click on Find Button
And Store the leadID of First record 
And Select the Record
When Click on Delete Button
And Click on Find Lead Link
And Enter the LeadID
And Click on Find Button
Then Verify the Lead Deletion
And Logout and close Browser