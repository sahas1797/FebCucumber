Feature: Login Feature


  Scenario Outline: Log In with correct credentails
    Given The user is in Login page
    When The user enters <username> and <Password>
    And click on Login Button
    Then The user should be logged In


    Examples:
    |username|Password|
    |sahasinnovapath|Innovapath|
    |Vinay          |Innovapath123|


