Feature: test orange hrm login scenario

  Scenario Outline: login with valid credentials
    Given open chrome browser
    Then get valid url
    When login with valid "<username>" and "<password>"
    Then user login succesfully and home page should be diplayed
    And close the browser

    Examples: 
      | username | password  |
      | Admin    | admin123  |
      | naga     | sai pawan |
      | kalyan   | RBG tech  |
