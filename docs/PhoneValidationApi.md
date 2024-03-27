# PhoneValidationApi

All URIs are relative to *https://&lt;tenantHostname&gt;/person/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validatePhoneNumber**](PhoneValidationApi.md#validatePhoneNumber) | **POST** /phoneValidation | Validates phone number data to ensure it is valid for Workday. |


<a name="validatePhoneNumber"></a>
# **validatePhoneNumber**
> PhoneNumberValidationDb1991f2fb091000169c5dfa023800b8 validatePhoneNumber(phoneNumberValidationDb1991f2fb091000169c5dfa023800b8).execute();

Validates phone number data to ensure it is valid for Workday.

Validates the specified completePhoneNumber in the request body. The completePhoneNumber field is required in the request body.  If the specified completePhoneNumber is valid, this method returns the 201 response status. If the specified completePhoneNumber is invalid, this method returns the 400 response status with a validation error message.   This method assumes the Allowed Phone Validations for the country of the phone is enabled on the Tenant Setup - Global configuration. If the tenant configuration has disabled the Allowed Phone Validations for the associated country, the validation returns as valid.  Secured by: REST API Public

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PhoneValidationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    DeviceTypeDb1991f2fb091000169c5e28fc0400bb deviceType = new DeviceTypeDb1991f2fb091000169c5e28fc0400bb();
    String completePhoneNumber = "completePhoneNumber_example"; // The complete phone number.
    CountryPhoneCodeDb1991f2fb091000169c5e0cb7c200b9 countryPhoneCode = new CountryPhoneCodeDb1991f2fb091000169c5e0cb7c200b9();
    try {
      PhoneNumberValidationDb1991f2fb091000169c5dfa023800b8 result = client
              .phoneValidation
              .validatePhoneNumber()
              .deviceType(deviceType)
              .completePhoneNumber(completePhoneNumber)
              .countryPhoneCode(countryPhoneCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getDeviceType());
      System.out.println(result.getCompletePhoneNumber());
      System.out.println(result.getCountryPhoneCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneValidationApi#validatePhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneNumberValidationDb1991f2fb091000169c5dfa023800b8> response = client
              .phoneValidation
              .validatePhoneNumber()
              .deviceType(deviceType)
              .completePhoneNumber(completePhoneNumber)
              .countryPhoneCode(countryPhoneCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneValidationApi#validatePhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **phoneNumberValidationDb1991f2fb091000169c5dfa023800b8** | [**PhoneNumberValidationDb1991f2fb091000169c5dfa023800b8**](PhoneNumberValidationDb1991f2fb091000169c5dfa023800b8.md)|  | |

### Return type

[**PhoneNumberValidationDb1991f2fb091000169c5dfa023800b8**](PhoneNumberValidationDb1991f2fb091000169c5dfa023800b8.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Resource created. |  -  |
| **0** | An error occurred. |  -  |

