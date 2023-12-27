package com.typicode.jsonplaceholder.steps;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import com.typicode.jsonplaceholder.helpers.EntriesSelectHelpers;
import com.typicode.jsonplaceholder.helpers.RequestHelpers;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.gson.Gson;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CommonSteps {

    private static final String POSTS_ENDPOINT = "/posts";
    private static final String COMMENTS_ENDPOINT = "/comments";
    private static final String ALBUMS_ENDPOINT = "/albums";
    private static final String PHOTOS_ENDPOINT = "/photos";
    private static final String TODOS_ENDPOINT = "/todos";
    private static final String USERS_ENDPOINT = "/users";
    private static final String VALIDATE_ENDPOINT = "/gateway.api/api/account/ValidatePassword";


    public static HttpResponse<String> response;
    public static List<HttpResponse<String>> responses;
    public static Object token;
    public static Object validationCode;

    @Before
    public static void setup() {
        responses = new ArrayList<>();
    }


    @When("I make a {string} request with the {string} endpoints on the {string} page.")
    public void ıMakeARequestWithTheEndpointsOnThePage(String requestType, String endpoint, String pageEntry) throws IOException {
        String folderPath = "src/test/resources/requestBodies/";
        String folderName = "";

        //String filename = SCHEMAS_DIR + type.replaceAll(" ", "") + "Schema.json";
        switch (pageEntry) {
            case "LoginEntries":
            case "BookAppointmentsEntries":
                folderName = pageEntry.replace("Entries", "").trim();
                break;
        }


        String json = Files.readString(new File(folderPath
                + folderName.replaceAll(" ", "")
                + "/"
                + endpoint.replaceAll(" ", "")
                + "Body.json").toPath());

        /*
          Aşağıdaki ifade OTPConfirmation servisinde requestBody'e
         "ValidationCode" isminde bir değişken eklemeyi sağlamaktadır.
         */
        if (endpoint.equals("OTPConfirmation")) {
            //           validationCode = JsonPath.parse(response.body()).read("$.Result.ValidationCode");
//            Gson gson = new Gson();
//            Object validationCode_ = gson.toJson(validationCode);
            // String ifadenin sonundaki "}" karakterini sil
            json = json.substring(0, json.length() - 1);
            // "ValidationCode": "alfa}" değerini ekle
            json += ",\"ValidationCode\": \"" + validationCode + "\"\n}";
            // Değiştirilmiş JSON'u yazdır
            System.out.println("------ json'un son hali: " + json);
        }


        response = requestType.equals("POST") ?
                RequestHelpers.sendPostRequestTo(EntriesSelectHelpers.selectEntry(pageEntry, endpoint), json) :
                RequestHelpers.sendPutRequestTo(EntriesSelectHelpers.selectEntry(pageEntry, endpoint), json);
        responses.add(response);

        System.out.println("--> --> Request Body: \n" + json); // json'dan okunan requestBody bilgilerini yazdır
        String beautifiedBody = beautifyJson(response.body());
        System.out.println("--> --> Response Body: \n" + beautifiedBody); // response'dan dönen body bilgilerini yazdır.

    }


    /*
     * Aşağıda pretty print işlemi gerçekleştirmeyi sağlayan metot yer almaktadır.
     * */
    public static String beautifyJson(String json) {
        if (json == null || json.isEmpty()) {
            return "";
        }
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(json);
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(node);
        } catch (IOException e) {
            e.printStackTrace();
            return json; // Hata durumunda orijinal haliyle geri döndürme
        }
    }

    @When("I get the {string} information returned from the response.")
    public void ıGetTheInformationReturnedFromTheResponse(String value) {
        Object resultObject = "";
        if (value.equals("TOKEN") && JsonPath.parse(response.body()).read("$.Result") != null) {
            resultObject = JsonPath.parse(response.body()).read("$.Result.Token");
            try {
                token = resultObject;
            } catch (Exception e) {
                System.out.println("Token not found...");
            }

            try {
                validationCode = JsonPath.parse(response.body()).read("$.Result.ValidationCode");
            } catch (Exception e) {
                System.out.println("validationCode not found...");
            }
            System.out.println("## TOKEN INFORMATION ##\n" + resultObject);
        } else if (value.equals("VALIDATION_CODE") && validationCode != null) {
            resultObject = JsonPath.parse(response.body()).read("$.Result.ValidationCode");
            validationCode = resultObject;
            System.out.println("## VALIDATION_CODE INFORMATION ##\n" + resultObject);
        }
    }

    @Then("the response has a status code of {int}")
    public void theResponseHasAStatusCodeOf(int code) {
        System.out.println("Status Code : " + response.statusCode());
        assertEquals(code, response.statusCode());

    }

    @When("I make a GET request with the {string} endpoints with QueryParams on the {string} page.")
    public void ıMakeAGETRequestWithTheEndpointsWithQueryParamsOnThePage(String endpoint, String pageEntry) {

        response = RequestHelpers.sendGetRequestTo(EntriesSelectHelpers.selectEntry(pageEntry, endpoint)
                + RequestHelpers.buildQueryParamsString(EntriesSelectHelpers.selectQuery(pageEntry, endpoint)));
        responses.add(response);

        String beautifiedBody = beautifyJson(response.body());
        System.out.println("--> --> Response Body: \n" + beautifiedBody); // response'dan dönen body bilgilerini yazdır.
    }

    @Then("Compare the expected response with the returned response according to the {string} service")
    public void compareTheExpectedResponseWithTheReturnedResponseAccordingToTheService(String endpoint) throws IOException {
        String folderPath = "src/test/resources/ExpectedResponses/";
        String filename = folderPath + endpoint.replaceAll(" ", "") + "Response.json";

        String expected = Files.readString(new File(filename).toPath());
        System.out.println("#### Expected Body: ####\n" + expected);

        String beautifiedBody = beautifyJson(response.body());
        Assert.assertEquals(expected, beautifiedBody);

        System.out.println(":) Comparison successful :)");
    }

    @When("Latest version of token information")
    public void latestVersionOfTokenInformation() {
        System.out.println("## Latest version of token information ##\n" + token);
    }

    @When("Read query string from json file and make GET request with {string} in {string}")
    public void readQueryStringFromJsonFileAndMakeGETRequestWithIn(String endpoint, String pageEntry) throws IOException {
        String folderPath = "src/test/resources/QueryStrings/";
        String folderName = "";

        folderName = folderPath + endpoint;

        String json = Files.readString(new File(folderName
                + "QueryStrings.json").toPath());

        if (json.startsWith("\"") && json.endsWith("\"")) {
            json = json.substring(1);
            json = json.substring(0, json.length() - 1);
        }

        response = RequestHelpers.sendGetRequestTo(EntriesSelectHelpers.selectEntry(pageEntry, endpoint) + json);
        responses.add(response);

        String beautifiedBody = beautifyJson(response.body());
        System.out.println("--> --> Response Body: \n" + beautifiedBody); // response'dan dönen body bilgilerini yazdır.
    }
}