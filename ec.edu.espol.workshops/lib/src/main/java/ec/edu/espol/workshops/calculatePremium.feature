
Feature: Calculate the insurance prime for a customer 
 

  Scenario: Men are over 25 years old
    Given M Are over 25 years old
    When Calculate the premium
    Then Show 500
    

  Scenario: Men are over 65 years old
    Given M Are over 65 years old
    When Calculate the premium
    Then Show 500
    
  Scenario: Men are under 25 years old
    Given M Are under 25 years old
    When Calculate the premium
    Then Show 2000
    

  Scenario: Women are less than 45 years old
    Given F Are under 45 years old
    When Calculate the premium
    Then Show 300  
    
    
  Scenario: Women are over 65 years old
    Given F Are over 65 years old
    When Calculate the premium
    Then Show 300   
   
  Scenario: Both genders, married, age younger than 45
    Given MF Are under 45 years old
    When Calculate the premium
    Then Show 300  
    
    
  Scenario: Both genders, married, age older than 65
    Given MF Are over 65 years old
    When Calculate the premium
    Then Show 300     
    
  Scenario: Both genders, married, age older than 80
    Given MF Are over 80 years old
    When Calculate the premium
    Then Show menos 1
    
  Scenario: Women, married, age between 45 and 65
    Given F Are between 45 and 65 years old
    When Calculate the premium
    Then Show 200     
    
  Scenario: Men, married, age between 45 and 65
    Given M Are between 45 and 65 years old
    When Calculate the premium
    Then Show 200    
    
   
