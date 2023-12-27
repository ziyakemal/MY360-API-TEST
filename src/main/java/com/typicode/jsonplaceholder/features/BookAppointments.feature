Feature: Book Appointments Services

  Scenario: GetFacilities
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When Read query string from json file and make GET request with "GetFacilities" in "BookAppointmentsEntries"
    Then Compare the expected response with the returned response according to the "GetFacilities" service
    Then the response has a status code of 200

  Scenario: GetMedicalServicesByFacilityId
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When Read query string from json file and make GET request with "GetMedicalServicesByFacilityId" in "BookAppointmentsEntries"
    Then Compare the expected response with the returned response according to the "GetMedicalServicesByFacilityId" service
    Then the response has a status code of 200

  Scenario: GetDoctorsByFacilityIdAndMedicalServiceId
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When Read query string from json file and make GET request with "GetDoctorsByFacilityIdAndMedicalServiceId" in "BookAppointmentsEntries"
    Then Compare the expected response with the returned response according to the "GetDoctorsByFacilityIdAndMedicalServiceId" service
    Then the response has a status code of 200

  Scenario: GetDoctorsAutocomplete
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When I make a GET request with the "GetDoctorsAutocomplete" endpoints with QueryParams on the "BookAppointmentsEntries" page.
    Then Compare the expected response with the returned response according to the "GetDoctorsAutocomplete" service
    Then the response has a status code of 200

  Scenario: GetDoctorDetail
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When Read query string from json file and make GET request with "GetDoctorDetail" in "BookAppointmentsEntries"
    Then Compare the expected response with the returned response according to the "GetDoctorDetail" service
    Then the response has a status code of 200

  Scenario: GetMedicalServicesByFacilityId33
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When I make a GET request with the "GetMedicalServicesByFacilityId33" endpoints with QueryParams on the "BookAppointmentsEntries" page.
    Then Compare the expected response with the returned response according to the "GetMedicalServicesByFacilityId33" service
    Then the response has a status code of 200

  Scenario: GetDoctorsByFacilityIdAndMedicalServiceId33
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When Read query string from json file and make GET request with "GetDoctorsByFacilityIdAndMedicalServiceId33" in "BookAppointmentsEntries"
    Then Compare the expected response with the returned response according to the "GetDoctorsByFacilityIdAndMedicalServiceId33" service
    Then the response has a status code of 200

  Scenario: GetDoctorSlotWithControl
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When Read query string from json file and make GET request with "GetDoctorSlotWithControl" in "BookAppointmentsEntries"
    Then Compare the expected response with the returned response according to the "GetDoctorSlotWithControl" service
    Then the response has a status code of 200

  Scenario: GetDoctorDetail33
    When I make a "POST" request with the "AuthV3" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When I get the "VALIDATION_CODE" information returned from the response.
    When I make a "POST" request with the "OTPConfirmation" endpoints on the "LoginEntries" page.
    When I get the "TOKEN" information returned from the response.
    When Latest version of token information
    When Read query string from json file and make GET request with "GetDoctorDetail33" in "BookAppointmentsEntries"
    Then Compare the expected response with the returned response according to the "GetDoctorDetail33" service
    Then the response has a status code of 200