Feature: Test booking
Scenario Outline: Hotel's rating
   Given I am on a page with url "<URL>"
    When I change a country "<Country>"
    And  I am checking free hotels
    Then I see a hotel with rating more 9 "<value>"
    And  I exit
    Examples: 
      | URL                     | Country        | value |
      | https://www.booking.com | Москва, Россия | 90    |