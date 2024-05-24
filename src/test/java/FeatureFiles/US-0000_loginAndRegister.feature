Feature: loginAndRegister

  @Login @Register
    Scenario:US-0000
    Given Navigate To Website
    When Click On The Element
    |loginAndRegister|
    Then Enter Data in Text Box
    |userName|9923332936|
    When Click On The Element
    |entrance|
    Then Enter Data in Text Box
    |code|2936|
    Then Click On The Element
    |entrance2|







