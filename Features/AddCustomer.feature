Feature: : Validate the Demo guru page

  #Scenario: Add the customer
  # Given Go to DemoGuru site and click on Add customer
  # When Enter all the informations and click on sumit
  #Then verify we are able to get the customer ID
 
  Scenario Outline: Add the customer
    Given Go to DemoGuru site and click on Add customer
    When Enter all the informations "<fname>","<lname>","<email>","<add>","<phone>" and click on sumit
    Then verify we are able to get the customer ID

    Examples: 
      | fname    | lname  | email          | add   | phone      |
      | Jayanthi | Venkat | Jay1@gmail.com | Erode | 9967452354 |
