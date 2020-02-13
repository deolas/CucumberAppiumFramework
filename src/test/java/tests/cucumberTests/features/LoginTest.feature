Feature: Verify movie ticket booking functionality on BookMyShow app

 # Background: Create an instance of android before each scenario
 #   Given User has BookMyShow "android" app

  Scenario: As a user,  I should be able to select three tickets of movie “DDLJ”  and be able to land on the HDFC netbanking page.
    Given User has BookMyShow "android" app
    When User selects "Pre Prod" environment
    And User navigates to Home Page
    And user search "DDLJ" movie name
    And taps on Book Tickets button for "Dilwale Dulhania Le Jayenge" movie
    Then user should be able to select Movie show time
    And user should be able to select 3 movie seats
    And user should able to provide email "Test@gmail.com" and phone number "9876543210"
    And user should able to pay through HDFC net banking
