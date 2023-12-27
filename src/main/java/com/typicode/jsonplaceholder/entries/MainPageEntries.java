package com.typicode.jsonplaceholder.entries;

import java.util.HashMap;
import java.util.Map;

public class MainPageEntries {
    public static final String GetPersonById = "/PatientOnline.Gateway.Api/api/person/GetPersonById";
    public static final String GetSubPersons = "/PatientOnline.Gateway.Api/api/person/GetSubPersons";
    public static final String GetPersonNotifications = "/PatientOnline.Gateway.Api/api/person/GetPersonNotifications";
    public static final String GetReportsByPersonIdDashboard = "/PatientOnline.Gateway.Api/api/report/GetReportsByPersonIdDashboard";
    public static final String GetPersonAllMeasurementDetails = "/PatientOnline.Gateway.Api/api/Measurement/GetPersonAllMeasurementDetails";
    public static final String GetCalendar = "/PatientOnline.Gateway.Api/api/person/GetCalendar";
    public static final String GetPatientAppointments = "/PatientOnline.Gateway.Api/api/Appointment/GetPatientAppointments";
    public static final Map<String, String> params = new HashMap<>();

    public static final Map<String, String> endpoints = Map.ofEntries(
            Map.entry("GetPersonById", GetPersonById),
            Map.entry("GetSubPersons", GetSubPersons),
            Map.entry("GetPersonNotifications", GetPersonNotifications),
            Map.entry("GetReportsByPersonIdDashboard", GetReportsByPersonIdDashboard),
            Map.entry("GetPersonAllMeasurementDetails", GetPersonAllMeasurementDetails),
            Map.entry("GetCalendar", GetCalendar),
            Map.entry("GetPatientAppointments", GetPatientAppointments)
    );

    public static Map<String, String> queryParamString(String endpoint) {
        switch (endpoint) {
            case "GetPersonById":
            case "GetSubPersons":
            case "GetReportsByPersonIdDashboard":
                params.put("PersonId", "723067427A56556C36365A547848662F51754A705A673D3D");
                break;
        }

        return params;
    };
}
