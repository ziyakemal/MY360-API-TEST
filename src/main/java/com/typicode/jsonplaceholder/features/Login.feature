Feature: Login Endpoint

  Scenario: Login Properties
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I get the "TOKEN" information returned from the response.
    Then the response has a status code of 200

  Scenario:  GetPatient
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I make a GET request with the "GetPersonById" endpoints with QueryParams on the "MainPageEntries" page.
    Then Compare the expected response with the returned response according to the "GetPersonById" service
    Then the response has a status code of 200






