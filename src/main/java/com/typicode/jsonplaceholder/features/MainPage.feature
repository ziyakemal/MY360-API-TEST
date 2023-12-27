Feature: Main Page Services

  Scenario:  GetPatient
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When I make a GET request with the "GetPersonById" endpoints with QueryParams on the "MainPageEntries" page.
    Then Compare the expected response with the returned response according to the "GetPersonById" service
    Then the response has a status code of 200

  Scenario:  GetSubPersons
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When I make a GET request with the "GetSubPersons" endpoints with QueryParams on the "MainPageEntries" page.
    Then Compare the expected response with the returned response according to the "GetSubPersons" service
    Then the response has a status code of 200

  Scenario: GetPersonNotifications
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When Read query string from json file and make GET request with "GetPersonNotifications" in "MainPageEntries"
    Then Compare the expected response with the returned response according to the "GetPersonNotifications" service
    Then the response has a status code of 200

  Scenario: GetPersonAllMeasurementDetails
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When Read query string from json file and make GET request with "GetPersonAllMeasurementDetails" in "MainPageEntries"
    Then Compare the expected response with the returned response according to the "GetPersonAllMeasurementDetails" service
    Then the response has a status code of 200

  Scenario:  GetReportsByPersonIdDashboard
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When I make a GET request with the "GetReportsByPersonIdDashboard" endpoints with QueryParams on the "MainPageEntries" page.
    Then Compare the expected response with the returned response according to the "GetReportsByPersonIdDashboard" service
    Then the response has a status code of 200

  Scenario: GetCalendar
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When Read query string from json file and make GET request with "GetCalendar" in "MainPageEntries"
    Then Compare the expected response with the returned response according to the "GetCalendar" service
    Then the response has a status code of 200

  Scenario: GetPatientAppointments
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When Read query string from json file and make GET request with "GetPatientAppointments" in "MainPageEntries"
    Then Compare the expected response with the returned response according to the "GetPatientAppointments" service
    Then the response has a status code of 200