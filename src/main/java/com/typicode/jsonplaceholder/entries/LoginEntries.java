package com.typicode.jsonplaceholder.entries;

import java.util.Map;

public class LoginEntries {
    public static final String AuthV3 = "/PatientOnline.Gateway.Api/api/person/AuthV3";
    public static final String OTPConfirmation = "/PatientOnline.Gateway.Api/api/person/OTPConfirmation";

    public static final Map<String, String> endpoints = Map.ofEntries(
            Map.entry("AuthV3", AuthV3),
            Map.entry("OTPConfirmation", OTPConfirmation)
    );


}
