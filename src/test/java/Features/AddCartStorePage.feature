Feature: Add blue shoes in the cart via Home Page

    
Scenario: Add first featured item in homepage to cart
     
    Given I click first featured item in homepage
    And I add item in cart   
    Then I should see items in the cart   
   
