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
    public static final String GetDoctorsByFacilityIdAndMedicalServiceId33 = "/PatientOnline.Gateway.Api/api/appointment/GetDoctorsByFacilityIdAndMedicalServiceId?FacilityId=33&MedicalServiceId=80";
    public static final Map<String, String> params = new HashMap<>();

    public static final Map<String, String> endpoints = Map.ofEntries(
            Map.entry("GetFacilities", GetFacilities),
            Map.entry("GetMedicalServicesByFacilityId", GetMedicalServicesByFacilityId),
            Map.entry("GetDoctorsByFacilityIdAndMedicalServiceId", GetDoctorsByFacilityIdAndMedicalServiceId),
            Map.entry("GetDoctorsAutocomplete", GetDoctorsAutocomplete),
            Map.entry("GetDoctorDetail", GetDoctorDetail),
            Map.entry("GetMedicalServicesByFacilityId33", GetMedicalServicesByFacilityId33),
            Map.entry("GetDoctorsByFacilityIdAndMedicalServiceId33", GetDoctorsByFacilityIdAndMedicalServiceId33)
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

