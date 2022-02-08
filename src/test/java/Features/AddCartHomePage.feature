Feature: Add Items with Single Search Result in the cart


  
Scenario Outline: Add blue shoes and short in the cart from Store Page
    Given I am in the store page 
    When I search for "<item>"   
    And I add item in cart   
    Then I should see "<item>" in the cart
    Examples:
    | item |
    |Blue Shoes|
    |Blue Denim Shorts|
    
   
   
