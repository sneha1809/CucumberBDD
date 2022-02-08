Feature: Place order for unsigned user


  
Scenario: Add blue shoes in the cart from Store Page
    Given I am in the store page 
    And   I search for blue shoes   
    When  I add item in cart   
    And   I proceed to checkout and fill billing details
    And   I place order
    Then  I should see order details
    
   
   
