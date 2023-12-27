package com.typicode.jsonplaceholder.helpers;

import com.typicode.jsonplaceholder.entries.BookAppointmentsEntries;
import com.typicode.jsonplaceholder.entries.LoginEntries;
import com.typicode.jsonplaceholder.entries.MainPageEntries;

import java.util.Map;

public class EntriesSelectHelpers {
    public static String pageEntry = "";
    public static Map<String, String> paramsSelect;

    public static String selectEntry(String entry, String endpoint) {

        switch (entry) {
            case "LoginEntries":
                pageEntry = LoginEntries.endpoints.get(endpoint);
                break;

            case "MainPageEntries":
                pageEntry = MainPageEntries.endpoints.get(endpoint);
                break;

            case "BookAppointmentsEntries":
                pageEntry = BookAppointmentsEntries.endpoints.get(endpoint);
                break;
        }

        return pageEntry;
    }

    public static Map<String, String> selectQuery(String entry, String endpoint) {

        switch (entry) {
            case "MainPageEntries":
                paramsSelect = MainPageEntries.queryParamString(endpoint);
                break;

            case "BookAppointmentsEntries":
                paramsSelect = BookAppointmentsEntries.queryParamString(endpoint);
                break;
        }

        return paramsSelect;
    }
}
