Feature: PhoneModeWithoutLogin

  Scenario:US-0001
    Given Navigate To Website
    When Click On The Element WithJavascript
    |firstBanner|
    Then Click On The Element WithJavascript
    |firstProduct|
    Then SelectDropdown
    Then Click On The Element WithJavascript
    |date|
    Then  Click On The Element WithJavascript
    |orderButton|

