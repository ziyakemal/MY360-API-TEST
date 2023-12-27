package com.typicode.jsonplaceholder.entries;

import java.util.HashMap;
import java.util.Map;

public class BookAppointmentsEntries {
    public static final String GetFacilities = "/PatientOnline.Gateway.Api/api/appointment/GetFacilities?MedicalServiceId=&DoctorCode=";
    public static final String GetMedicalServicesByFacilityId = "/PatientOnline.Gateway.Api/api/appointment/GetMedicalServicesByFacilityId";
    public static final String GetDoctorsByFacilityIdAndMedicalServiceId = "/api/appointment/GetDoctorsByFacilityIdAndMedicalServiceId";
    public static final String GetDoctorsAutocomplete = "/PatientOnline.Gateway.Api/api/appointment/GetDoctorsAutocomplete";
    public static final String GetDoctorDetail = "/PatientOnline.Gateway.Api/api/appointment/GetDoctorDetail";
    public static final String GetMedicalServicesByFacilityId33 = "/PatientOnline.Gateway.Api/api/appointment/GetMedicalServicesByFacilityId";
    public static final String GetDoctorsByFacilityIdAndMedicalServiceId33 = "/PatientOnline.Gateway.Api/api/appointment/GetDoctorsByFacilityIdAndMedicalServiceId";
    public static final String GetDoctorSlotWithControl = "/PatientOnline.Gateway.Api/api/appointment/GetDoctorSlotWithControl";
    public static final String GetDoctorDetail33 = "/PatientOnline.Gateway.Api/api/appointment/GetDoctorDetail";
    public static final String GetDoctorReportsByPersonId = "/PatientOnline.Gateway.Api/api/report/GetDoctorReportsByPersonId";
    public static final String GetCalendar10 = "/PatientOnline.Gateway.Api/api/person/GetCalendar";
    public static final String InsertAppointment = "/PatientOnline.Gateway.Api/api/appointment/InsertAppointment";
    public static final String GetFacilitiesWithMapping = "/PatientOnline.Gateway.Api/api/appointment/GetFacilitiesWithMapping";
    public static final String GetPatientAppointments = "/PatientOnline.Gateway.Api/api/Appointment/GetPatientAppointments";
    public static final String GetPatientDoctors = "/PatientOnline.Gateway.Api/api/appointment/GetPatientDoctors";
    public static final Map<String, String> params = new HashMap<>();

    public static final Map<String, String> endpoints = Map.ofEntries(
            Map.entry("GetFacilities", GetFacilities),
            Map.entry("GetMedicalServicesByFacilityId", GetMedicalServicesByFacilityId),
            Map.entry("GetDoctorsByFacilityIdAndMedicalServiceId", GetDoctorsByFacilityIdAndMedicalServiceId),
            Map.entry("GetDoctorsAutocomplete", GetDoctorsAutocomplete),
            Map.entry("GetDoctorDetail", GetDoctorDetail),
            Map.entry("GetMedicalServicesByFacilityId33", GetMedicalServicesByFacilityId33),
            Map.entry("GetDoctorsByFacilityIdAndMedicalServiceId33", GetDoctorsByFacilityIdAndMedicalServiceId33),
            Map.entry("GetDoctorSlotWithControl", GetDoctorSlotWithControl),
            Map.entry("GetDoctorDetail33", GetDoctorDetail33),
            Map.entry("GetDoctorReportsByPersonId", GetDoctorReportsByPersonId),
            Map.entry("GetCalendar10", GetCalendar10),
            Map.entry("InsertAppointment", InsertAppointment),
            Map.entry("GetFacilitiesWithMapping", GetFacilitiesWithMapping),
            Map.entry("GetPatientAppointmentsDrCode", GetPatientAppointments),
            Map.entry("GetPatientDoctors", GetPatientDoctors)
    );

    public static Map<String, String> queryParamString(String endpoint) {
        switch (endpoint) {
            case "GetFacilities":
                params.put("PersonId", "723067427A56556C36365A547848662F51754A705A673D3D");
                break;
            case "GetDoctorsAutocomplete":
                params.put("Keyword", "awa");
                break;
            case "GetMedicalServicesByFacilityId33":
                params.put("FacilityId", "33");
                break;
        }

        return params;
    }

    ;
}

