# HomeContactInformationChangesApi

All URIs are relative to *https://&lt;tenantHostname&gt;/person/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmailAddress**](HomeContactInformationChangesApi.md#createEmailAddress) | **POST** /homeContactInformationChanges/{ID}/emailAddresses |  |
| [**createInstantMessenger**](HomeContactInformationChangesApi.md#createInstantMessenger) | **POST** /homeContactInformationChanges/{ID}/instantMessengers |  |
| [**createNewAddress**](HomeContactInformationChangesApi.md#createNewAddress) | **POST** /homeContactInformationChanges/{ID}/addresses |  |
| [**createPhoneNumber**](HomeContactInformationChangesApi.md#createPhoneNumber) | **POST** /homeContactInformationChanges/{ID}/phoneNumbers |  |
| [**createWebAddress**](HomeContactInformationChangesApi.md#createWebAddress) | **POST** /homeContactInformationChanges/{ID}/webAddresses |  |
| [**getAddressAsStaged**](HomeContactInformationChangesApi.md#getAddressAsStaged) | **GET** /homeContactInformationChanges/{ID}/addresses/{subresourceID} | An address as it exists staged for update by the parent business process. |
| [**getAddressesStaged**](HomeContactInformationChangesApi.md#getAddressesStaged) | **GET** /homeContactInformationChanges/{ID}/addresses | Retrieve all existing addresses staged for update by the parent business process |
| [**getEmailAddress**](HomeContactInformationChangesApi.md#getEmailAddress) | **GET** /homeContactInformationChanges/{ID}/emailAddresses/{subresourceID} | An email address as it exists staged for update by the parent business process. |
| [**getEventInformation**](HomeContactInformationChangesApi.md#getEventInformation) | **GET** /homeContactInformationChanges/{ID} |  |
| [**getInstantMessenger**](HomeContactInformationChangesApi.md#getInstantMessenger) | **GET** /homeContactInformationChanges/{ID}/instantMessengers/{subresourceID} | An instant messenger as it exists staged for update by the parent business process. |
| [**getPhoneNumbers**](HomeContactInformationChangesApi.md#getPhoneNumbers) | **GET** /homeContactInformationChanges/{ID}/phoneNumbers | Retrieve all existing phone numbers staged for update by the parent business process |
| [**getStagedEmailAddresses**](HomeContactInformationChangesApi.md#getStagedEmailAddresses) | **GET** /homeContactInformationChanges/{ID}/emailAddresses | Retrieve all existing addresses staged for update by the parent business process |
| [**getStagedInstantMessengers**](HomeContactInformationChangesApi.md#getStagedInstantMessengers) | **GET** /homeContactInformationChanges/{ID}/instantMessengers | Retrieve all existing instant messengers staged for update by the parent business process |
| [**getStagedPhoneNumber**](HomeContactInformationChangesApi.md#getStagedPhoneNumber) | **GET** /homeContactInformationChanges/{ID}/phoneNumbers/{subresourceID} | A phone number as it exists staged for update by the parent business process. |
| [**getWebAddress**](HomeContactInformationChangesApi.md#getWebAddress) | **GET** /homeContactInformationChanges/{ID}/webAddresses/{subresourceID} | A web address as it exists staged for update by the parent business process. |
| [**getWebAddressesStaged**](HomeContactInformationChangesApi.md#getWebAddressesStaged) | **GET** /homeContactInformationChanges/{ID}/webAddresses | Retrieve all existing web addresses staged for update by the parent business process |
| [**removeAddress**](HomeContactInformationChangesApi.md#removeAddress) | **DELETE** /homeContactInformationChanges/{ID}/addresses/{subresourceID} |  |
| [**removeEmailAddress**](HomeContactInformationChangesApi.md#removeEmailAddress) | **DELETE** /homeContactInformationChanges/{ID}/emailAddresses/{subresourceID} |  |
| [**removeInstantMessenger**](HomeContactInformationChangesApi.md#removeInstantMessenger) | **DELETE** /homeContactInformationChanges/{ID}/instantMessengers/{subresourceID} |  |
| [**removePhoneNumber**](HomeContactInformationChangesApi.md#removePhoneNumber) | **DELETE** /homeContactInformationChanges/{ID}/phoneNumbers/{subresourceID} |  |
| [**removeWebAddress**](HomeContactInformationChangesApi.md#removeWebAddress) | **DELETE** /homeContactInformationChanges/{ID}/webAddresses/{subresourceID} |  |
| [**submitChange**](HomeContactInformationChangesApi.md#submitChange) | **POST** /homeContactInformationChanges/{ID}/submit | Submit the specified contact change ID. |
| [**updateAddress**](HomeContactInformationChangesApi.md#updateAddress) | **PUT** /homeContactInformationChanges/{ID}/addresses/{subresourceID} |  |
| [**updateEmailAddress**](HomeContactInformationChangesApi.md#updateEmailAddress) | **PATCH** /homeContactInformationChanges/{ID}/emailAddresses/{subresourceID} |  |
| [**updateInstantMessenger**](HomeContactInformationChangesApi.md#updateInstantMessenger) | **PATCH** /homeContactInformationChanges/{ID}/instantMessengers/{subresourceID} |  |
| [**updatePhoneNumber**](HomeContactInformationChangesApi.md#updatePhoneNumber) | **PATCH** /homeContactInformationChanges/{ID}/phoneNumbers/{subresourceID} |  |
| [**updateWebAddress**](HomeContactInformationChangesApi.md#updateWebAddress) | **PATCH** /homeContactInformationChanges/{ID}/webAddresses/{subresourceID} |  |


<a name="createEmailAddress"></a>
# **createEmailAddress**
> EmailAddressReference0918d433e86b100018119edc1b8f00f7 createEmailAddress(ID, emailAddressReference0918d433e86b100018119edc1b8f00f7).execute();



Creates a new email address staged by the parent business process event.  Secured by: Person Data: Home Email, Self-Service: Home Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String emailAddress = "emailAddress_example"; // The email address.
    Usage6333dee5ac2010000c8653405aaa0038 usage = new Usage6333dee5ac2010000c8653405aaa0038();
    String descriptor = "descriptor_example"; // A preview of the instance
    String id = "id_example"; // Id of the instance
    try {
      EmailAddressReference0918d433e86b100018119edc1b8f00f7 result = client
              .homeContactInformationChanges
              .createEmailAddress(ID)
              .emailAddress(emailAddress)
              .usage(usage)
              .descriptor(descriptor)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmailAddress());
      System.out.println(result.getUsage());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#createEmailAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailAddressReference0918d433e86b100018119edc1b8f00f7> response = client
              .homeContactInformationChanges
              .createEmailAddress(ID)
              .emailAddress(emailAddress)
              .usage(usage)
              .descriptor(descriptor)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#createEmailAddress");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **emailAddressReference0918d433e86b100018119edc1b8f00f7** | [**EmailAddressReference0918d433e86b100018119edc1b8f00f7**](EmailAddressReference0918d433e86b100018119edc1b8f00f7.md)|  | |

### Return type

[**EmailAddressReference0918d433e86b100018119edc1b8f00f7**](EmailAddressReference0918d433e86b100018119edc1b8f00f7.md)

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

<a name="createInstantMessenger"></a>
# **createInstantMessenger**
> InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016 createInstantMessenger(ID, instantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016).execute();



Creates a new instant messenger staged by the parent business process event.  Secured by: Person Data: Home Instant Messenger, Self-Service: Home Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    TypeDe08a6c876a810000cb2e3dd8853001a type = new TypeDe08a6c876a810000cb2e3dd8853001a();
    String userName = "userName_example"; // The instant messenger account username.
    UsageDe08a6c876a810000cb2e3d738be0019 usage = new UsageDe08a6c876a810000cb2e3d738be0019();
    String id = "id_example"; // Id of the instance
    try {
      InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016 result = client
              .homeContactInformationChanges
              .createInstantMessenger(ID)
              .type(type)
              .userName(userName)
              .usage(usage)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getType());
      System.out.println(result.getUserName());
      System.out.println(result.getUsage());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#createInstantMessenger");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016> response = client
              .homeContactInformationChanges
              .createInstantMessenger(ID)
              .type(type)
              .userName(userName)
              .usage(usage)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#createInstantMessenger");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **instantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016** | [**InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016**](InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016.md)|  | |

### Return type

[**InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016**](InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016.md)

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

<a name="createNewAddress"></a>
# **createNewAddress**
> HomeAddressReference81f66ab16f7510005c53d881876e4843 createNewAddress(ID, homeAddressReference81f66ab16f7510005c53d881876e4843).execute();



Creates a new address staged by the parent business process event.  Secured by: Person Data: Home Address, Self-Service: Home Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String citySubdivision2Local = "citySubdivision2Local_example"; // City Subdivision 2 - Local
    String addressLine9 = "addressLine9_example"; // Address Line 9
    String citySubdivision1Local = "citySubdivision1Local_example"; // City Subdivision 1 - Local
    String addressLine8Local = "addressLine8Local_example"; // Local Address Line 8
    String addressLine6 = "addressLine6_example"; // Address Line 6
    LocalDate effective = LocalDate.now(); // The date this business process takes effect.
    String addressLine3 = "addressLine3_example"; // Address Line 3
    String postalCode = "postalCode_example"; // Postal Code
    Integer numberDaysWFH = 56; // Number of Days WFH
    String addressLine2Local = "addressLine2Local_example"; // Local Address Line 2
    String cityLocal = "cityLocal_example"; // City - Local
    String addressLine6Local = "addressLine6Local_example"; // Local Address Line 6
    String addressLine1 = "addressLine1_example"; // Address Line 1
    String citySubdivision1 = "citySubdivision1_example"; // City Subdivision 1
    String regionSubdivision2 = "regionSubdivision2_example"; // Region Subdivision 2
    String city = "city_example"; // City
    String addressLine4Local = "addressLine4Local_example"; // Local Address Line 4
    String regionSubdivision1 = "regionSubdivision1_example"; // Region Subdivision 1
    String addressLine7 = "addressLine7_example"; // Address Line 7
    String addressLine2 = "addressLine2_example"; // Address Line 2
    String addressLine5 = "addressLine5_example"; // Address Line 5
    String addressLine9Local = "addressLine9Local_example"; // Local Address Line 9
    String addressLine3Local = "addressLine3Local_example"; // Local Address Line 3
    CountryCity81f66ab16f7510005c53d89089074844 countryCity = new CountryCity81f66ab16f7510005c53d89089074844();
    String addressLine7Local = "addressLine7Local_example"; // Local Address Line 7
    String addressLine1Local = "addressLine1Local_example"; // Local Address Line 1
    Country81f66ab16f7510005c53d8fd5f5b4852 country = new Country81f66ab16f7510005c53d8fd5f5b4852();
    CountryRegion81f66ab16f7510005c53d8be2fe44847 countryRegion = new CountryRegion81f66ab16f7510005c53d8be2fe44847();
    String addressLine5Local = "addressLine5Local_example"; // Local Address Line 5
    String regionSubdivision1Local = "regionSubdivision1Local_example"; // Region Subdivision 1 - Local
    String addressLine4 = "addressLine4_example"; // Address Line 4
    Usage81f66ab16f7510005c53d917926f4857 usage = new Usage81f66ab16f7510005c53d917926f4857();
    String addressLine8 = "addressLine8_example"; // Address Line 8
    String citySubdivision2 = "citySubdivision2_example"; // City Subdivision 2
    String id = "id_example"; // Id of the instance
    try {
      HomeAddressReference81f66ab16f7510005c53d881876e4843 result = client
              .homeContactInformationChanges
              .createNewAddress(ID)
              .citySubdivision2Local(citySubdivision2Local)
              .addressLine9(addressLine9)
              .citySubdivision1Local(citySubdivision1Local)
              .addressLine8Local(addressLine8Local)
              .addressLine6(addressLine6)
              .effective(effective)
              .addressLine3(addressLine3)
              .postalCode(postalCode)
              .numberDaysWFH(numberDaysWFH)
              .addressLine2Local(addressLine2Local)
              .cityLocal(cityLocal)
              .addressLine6Local(addressLine6Local)
              .addressLine1(addressLine1)
              .citySubdivision1(citySubdivision1)
              .regionSubdivision2(regionSubdivision2)
              .city(city)
              .addressLine4Local(addressLine4Local)
              .regionSubdivision1(regionSubdivision1)
              .addressLine7(addressLine7)
              .addressLine2(addressLine2)
              .addressLine5(addressLine5)
              .addressLine9Local(addressLine9Local)
              .addressLine3Local(addressLine3Local)
              .countryCity(countryCity)
              .addressLine7Local(addressLine7Local)
              .addressLine1Local(addressLine1Local)
              .country(country)
              .countryRegion(countryRegion)
              .addressLine5Local(addressLine5Local)
              .regionSubdivision1Local(regionSubdivision1Local)
              .addressLine4(addressLine4)
              .usage(usage)
              .addressLine8(addressLine8)
              .citySubdivision2(citySubdivision2)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getCitySubdivision2Local());
      System.out.println(result.getAddressLine9());
      System.out.println(result.getCitySubdivision1Local());
      System.out.println(result.getAddressLine8Local());
      System.out.println(result.getAddressLine6());
      System.out.println(result.getEffective());
      System.out.println(result.getAddressLine3());
      System.out.println(result.getPostalCode());
      System.out.println(result.getNumberDaysWFH());
      System.out.println(result.getAddressLine2Local());
      System.out.println(result.getCityLocal());
      System.out.println(result.getAddressLine6Local());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getCitySubdivision1());
      System.out.println(result.getRegionSubdivision2());
      System.out.println(result.getCity());
      System.out.println(result.getAddressLine4Local());
      System.out.println(result.getRegionSubdivision1());
      System.out.println(result.getAddressLine7());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getAddressLine5());
      System.out.println(result.getAddressLine9Local());
      System.out.println(result.getAddressLine3Local());
      System.out.println(result.getCountryCity());
      System.out.println(result.getAddressLine7Local());
      System.out.println(result.getAddressLine1Local());
      System.out.println(result.getCountry());
      System.out.println(result.getCountryRegion());
      System.out.println(result.getAddressLine5Local());
      System.out.println(result.getRegionSubdivision1Local());
      System.out.println(result.getAddressLine4());
      System.out.println(result.getUsage());
      System.out.println(result.getAddressLine8());
      System.out.println(result.getCitySubdivision2());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#createNewAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeAddressReference81f66ab16f7510005c53d881876e4843> response = client
              .homeContactInformationChanges
              .createNewAddress(ID)
              .citySubdivision2Local(citySubdivision2Local)
              .addressLine9(addressLine9)
              .citySubdivision1Local(citySubdivision1Local)
              .addressLine8Local(addressLine8Local)
              .addressLine6(addressLine6)
              .effective(effective)
              .addressLine3(addressLine3)
              .postalCode(postalCode)
              .numberDaysWFH(numberDaysWFH)
              .addressLine2Local(addressLine2Local)
              .cityLocal(cityLocal)
              .addressLine6Local(addressLine6Local)
              .addressLine1(addressLine1)
              .citySubdivision1(citySubdivision1)
              .regionSubdivision2(regionSubdivision2)
              .city(city)
              .addressLine4Local(addressLine4Local)
              .regionSubdivision1(regionSubdivision1)
              .addressLine7(addressLine7)
              .addressLine2(addressLine2)
              .addressLine5(addressLine5)
              .addressLine9Local(addressLine9Local)
              .addressLine3Local(addressLine3Local)
              .countryCity(countryCity)
              .addressLine7Local(addressLine7Local)
              .addressLine1Local(addressLine1Local)
              .country(country)
              .countryRegion(countryRegion)
              .addressLine5Local(addressLine5Local)
              .regionSubdivision1Local(regionSubdivision1Local)
              .addressLine4(addressLine4)
              .usage(usage)
              .addressLine8(addressLine8)
              .citySubdivision2(citySubdivision2)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#createNewAddress");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **homeAddressReference81f66ab16f7510005c53d881876e4843** | [**HomeAddressReference81f66ab16f7510005c53d881876e4843**](HomeAddressReference81f66ab16f7510005c53d881876e4843.md)|  | |

### Return type

[**HomeAddressReference81f66ab16f7510005c53d881876e4843**](HomeAddressReference81f66ab16f7510005c53d881876e4843.md)

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

<a name="createPhoneNumber"></a>
# **createPhoneNumber**
> PhoneReference1089da0ab90910000f70891a998b0887 createPhoneNumber(ID, phoneReference1089da0ab90910000f70891a998b0887).execute();



Creates a new phone number staged by the parent business process event.  Secured by: Person Data: Home Phone, Self-Service: Home Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String extension = "extension_example"; // The phone extension.
    String completePhoneNumber = "completePhoneNumber_example"; // The complete phone number.
    CountryPhoneCode1089da0ab90910000f7089365467088c countryPhoneCode = new CountryPhoneCode1089da0ab90910000f7089365467088c();
    DeviceType1089da0ab90910000f7089256c7b0888 deviceType = new DeviceType1089da0ab90910000f7089256c7b0888();
    Usage1089da0ab90910000f70892f2de3088a usage = new Usage1089da0ab90910000f70892f2de3088a();
    String descriptor = "descriptor_example"; // A preview of the instance
    String id = "id_example"; // Id of the instance
    try {
      PhoneReference1089da0ab90910000f70891a998b0887 result = client
              .homeContactInformationChanges
              .createPhoneNumber(ID)
              .extension(extension)
              .completePhoneNumber(completePhoneNumber)
              .countryPhoneCode(countryPhoneCode)
              .deviceType(deviceType)
              .usage(usage)
              .descriptor(descriptor)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getExtension());
      System.out.println(result.getCompletePhoneNumber());
      System.out.println(result.getCountryPhoneCode());
      System.out.println(result.getDeviceType());
      System.out.println(result.getUsage());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#createPhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneReference1089da0ab90910000f70891a998b0887> response = client
              .homeContactInformationChanges
              .createPhoneNumber(ID)
              .extension(extension)
              .completePhoneNumber(completePhoneNumber)
              .countryPhoneCode(countryPhoneCode)
              .deviceType(deviceType)
              .usage(usage)
              .descriptor(descriptor)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#createPhoneNumber");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **phoneReference1089da0ab90910000f70891a998b0887** | [**PhoneReference1089da0ab90910000f70891a998b0887**](PhoneReference1089da0ab90910000f70891a998b0887.md)|  | |

### Return type

[**PhoneReference1089da0ab90910000f70891a998b0887**](PhoneReference1089da0ab90910000f70891a998b0887.md)

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

<a name="createWebAddress"></a>
# **createWebAddress**
> WebAddressReferenceE357ae6d466510000ce259f323be01b0 createWebAddress(ID, webAddressReferenceE357ae6d466510000ce259f323be01b0).execute();



Creates a new web address staged by the parent business process event.  Secured by: Person Data: Home Web Address, Self-Service: Home Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    UsageE357ae6d466510000ce25a08bfe401b3 usage = new UsageE357ae6d466510000ce25a08bfe401b3();
    String url = "url_example"; // The complete URL address for the web address.
    String id = "id_example"; // Id of the instance
    try {
      WebAddressReferenceE357ae6d466510000ce259f323be01b0 result = client
              .homeContactInformationChanges
              .createWebAddress(ID)
              .usage(usage)
              .url(url)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsage());
      System.out.println(result.getUrl());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#createWebAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebAddressReferenceE357ae6d466510000ce259f323be01b0> response = client
              .homeContactInformationChanges
              .createWebAddress(ID)
              .usage(usage)
              .url(url)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#createWebAddress");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **webAddressReferenceE357ae6d466510000ce259f323be01b0** | [**WebAddressReferenceE357ae6d466510000ce259f323be01b0**](WebAddressReferenceE357ae6d466510000ce259f323be01b0.md)|  | |

### Return type

[**WebAddressReferenceE357ae6d466510000ce259f323be01b0**](WebAddressReferenceE357ae6d466510000ce259f323be01b0.md)

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

<a name="getAddressAsStaged"></a>
# **getAddressAsStaged**
> HomeAddressReference81f66ab16f7510005c53d881876e4843 getAddressAsStaged(ID, subresourceID).execute();

An address as it exists staged for update by the parent business process.

Retrieve an existing address as it exists when staged by the parent business process.  Secured by: Person Data: Home Address, Self-Service: Home Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      HomeAddressReference81f66ab16f7510005c53d881876e4843 result = client
              .homeContactInformationChanges
              .getAddressAsStaged(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getCitySubdivision2Local());
      System.out.println(result.getAddressLine9());
      System.out.println(result.getCitySubdivision1Local());
      System.out.println(result.getAddressLine8Local());
      System.out.println(result.getAddressLine6());
      System.out.println(result.getEffective());
      System.out.println(result.getAddressLine3());
      System.out.println(result.getPostalCode());
      System.out.println(result.getNumberDaysWFH());
      System.out.println(result.getAddressLine2Local());
      System.out.println(result.getCityLocal());
      System.out.println(result.getAddressLine6Local());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getCitySubdivision1());
      System.out.println(result.getRegionSubdivision2());
      System.out.println(result.getCity());
      System.out.println(result.getAddressLine4Local());
      System.out.println(result.getRegionSubdivision1());
      System.out.println(result.getAddressLine7());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getAddressLine5());
      System.out.println(result.getAddressLine9Local());
      System.out.println(result.getAddressLine3Local());
      System.out.println(result.getCountryCity());
      System.out.println(result.getAddressLine7Local());
      System.out.println(result.getAddressLine1Local());
      System.out.println(result.getCountry());
      System.out.println(result.getCountryRegion());
      System.out.println(result.getAddressLine5Local());
      System.out.println(result.getRegionSubdivision1Local());
      System.out.println(result.getAddressLine4());
      System.out.println(result.getUsage());
      System.out.println(result.getAddressLine8());
      System.out.println(result.getCitySubdivision2());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getAddressAsStaged");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeAddressReference81f66ab16f7510005c53d881876e4843> response = client
              .homeContactInformationChanges
              .getAddressAsStaged(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getAddressAsStaged");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**HomeAddressReference81f66ab16f7510005c53d881876e4843**](HomeAddressReference81f66ab16f7510005c53d881876e4843.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getAddressesStaged"></a>
# **getAddressesStaged**
> HomeContactInformationChangesGetAddressesStagedResponse getAddressesStaged(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).usedFor(usedFor).execute();

Retrieve all existing addresses staged for update by the parent business process

Retrieve all addresses staged for update by the parent business process  Secured by: Person Data: Home Address, Self-Service: Home Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    Boolean primaryOnly = true;
    String usedFor = "usedFor_example";
    try {
      HomeContactInformationChangesGetAddressesStagedResponse result = client
              .homeContactInformationChanges
              .getAddressesStaged(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getAddressesStaged");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeContactInformationChangesGetAddressesStagedResponse> response = client
              .homeContactInformationChanges
              .getAddressesStaged(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getAddressesStaged");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **primaryOnly** | **Boolean**|  | [optional] |
| **usedFor** | **String**|  | [optional] |

### Return type

[**HomeContactInformationChangesGetAddressesStagedResponse**](HomeContactInformationChangesGetAddressesStagedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getEmailAddress"></a>
# **getEmailAddress**
> EmailAddressReference0918d433e86b100018119edc1b8f00f7 getEmailAddress(ID, subresourceID).execute();

An email address as it exists staged for update by the parent business process.

Retrieve an existing email address as it exists when staged by the parent business process.  Secured by: Person Data: Home Email, Self-Service: Home Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      EmailAddressReference0918d433e86b100018119edc1b8f00f7 result = client
              .homeContactInformationChanges
              .getEmailAddress(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmailAddress());
      System.out.println(result.getUsage());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getEmailAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailAddressReference0918d433e86b100018119edc1b8f00f7> response = client
              .homeContactInformationChanges
              .getEmailAddress(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getEmailAddress");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**EmailAddressReference0918d433e86b100018119edc1b8f00f7**](EmailAddressReference0918d433e86b100018119edc1b8f00f7.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getEventInformation"></a>
# **getEventInformation**
> ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed getEventInformation(ID).execute();



Returns basic information about the home contact change event.  Secured by: Change Home Contact Information (REST Service), Person Data: Home Contact Information, Self-Service: Home Contact Information  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    try {
      ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed result = client
              .homeContactInformationChanges
              .getEventInformation(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getEventInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed> response = client
              .homeContactInformationChanges
              .getEventInformation(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getEventInformation");
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
| **ID** | **String**| The Workday ID of the resource. | |

### Return type

[**ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed**](ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getInstantMessenger"></a>
# **getInstantMessenger**
> InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016 getInstantMessenger(ID, subresourceID).execute();

An instant messenger as it exists staged for update by the parent business process.

Retrieve an existing instant messenger as it exists when staged by the parent business process.  Secured by: Person Data: Home Instant Messenger, Self-Service: Home Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016 result = client
              .homeContactInformationChanges
              .getInstantMessenger(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getType());
      System.out.println(result.getUserName());
      System.out.println(result.getUsage());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getInstantMessenger");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016> response = client
              .homeContactInformationChanges
              .getInstantMessenger(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getInstantMessenger");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016**](InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getPhoneNumbers"></a>
# **getPhoneNumbers**
> HomeContactInformationChangesGetPhoneNumbersResponse getPhoneNumbers(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usageType(usageType).usedFor(usedFor).execute();

Retrieve all existing phone numbers staged for update by the parent business process

Retrieve all phone numbers staged for update by the parent business process  Secured by: Person Data: Home Phone, Self-Service: Home Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    Boolean primaryOnly = true; // If true, returns only the IDs of the person's primary phone numbers.
    Boolean publicOnly = true; // If true, returns only the IDs of the person's public phone numbers.
    String usageType = "usageType_example"; // Specifies usage type, such as home or work. Only used if the service provides access to multiple usage types from the same endpoint.
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      HomeContactInformationChangesGetPhoneNumbersResponse result = client
              .homeContactInformationChanges
              .getPhoneNumbers(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usageType(usageType)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getPhoneNumbers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeContactInformationChangesGetPhoneNumbersResponse> response = client
              .homeContactInformationChanges
              .getPhoneNumbers(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usageType(usageType)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getPhoneNumbers");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **primaryOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s primary phone numbers. | [optional] |
| **publicOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s public phone numbers. | [optional] |
| **usageType** | **String**| Specifies usage type, such as home or work. Only used if the service provides access to multiple usage types from the same endpoint. | [optional] |
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**HomeContactInformationChangesGetPhoneNumbersResponse**](HomeContactInformationChangesGetPhoneNumbersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getStagedEmailAddresses"></a>
# **getStagedEmailAddresses**
> HomeContactInformationChangesGetStagedEmailAddressesResponse getStagedEmailAddresses(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usageType(usageType).usedFor(usedFor).execute();

Retrieve all existing addresses staged for update by the parent business process

Retrieve all email addresses staged for update by the parent business process  Secured by: Person Data: Home Email, Self-Service: Home Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    Boolean primaryOnly = true; // If true, returns only the IDs of the person's primary email addresses.
    Boolean publicOnly = true; // If true, returns only the IDs of the person's public email addresses.
    String usageType = "usageType_example"; // Specifies usage type, such as home or work. Only used if the service provides access to multiple usage types from the same endpoint.
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      HomeContactInformationChangesGetStagedEmailAddressesResponse result = client
              .homeContactInformationChanges
              .getStagedEmailAddresses(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usageType(usageType)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getStagedEmailAddresses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeContactInformationChangesGetStagedEmailAddressesResponse> response = client
              .homeContactInformationChanges
              .getStagedEmailAddresses(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usageType(usageType)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getStagedEmailAddresses");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **primaryOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s primary email addresses. | [optional] |
| **publicOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s public email addresses. | [optional] |
| **usageType** | **String**| Specifies usage type, such as home or work. Only used if the service provides access to multiple usage types from the same endpoint. | [optional] |
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**HomeContactInformationChangesGetStagedEmailAddressesResponse**](HomeContactInformationChangesGetStagedEmailAddressesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getStagedInstantMessengers"></a>
# **getStagedInstantMessengers**
> HomeContactInformationChangesGetStagedInstantMessengersResponse getStagedInstantMessengers(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usageType(usageType).usedFor(usedFor).execute();

Retrieve all existing instant messengers staged for update by the parent business process

Retrieve all instant messengers staged for update by the parent business process  Secured by: Person Data: Home Instant Messenger, Self-Service: Home Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    Boolean primaryOnly = true; // If true, returns only the IDs of the person's primary instant messenger account usernames.
    Boolean publicOnly = true; // If true, returns only the IDs of the person's public instant messenger account usernames.
    String usageType = "usageType_example"; // Specifies usage type, such as home or work. Only used if the service provides access to multiple usage types from the same endpoint.
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      HomeContactInformationChangesGetStagedInstantMessengersResponse result = client
              .homeContactInformationChanges
              .getStagedInstantMessengers(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usageType(usageType)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getStagedInstantMessengers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeContactInformationChangesGetStagedInstantMessengersResponse> response = client
              .homeContactInformationChanges
              .getStagedInstantMessengers(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usageType(usageType)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getStagedInstantMessengers");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **primaryOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s primary instant messenger account usernames. | [optional] |
| **publicOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s public instant messenger account usernames. | [optional] |
| **usageType** | **String**| Specifies usage type, such as home or work. Only used if the service provides access to multiple usage types from the same endpoint. | [optional] |
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**HomeContactInformationChangesGetStagedInstantMessengersResponse**](HomeContactInformationChangesGetStagedInstantMessengersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getStagedPhoneNumber"></a>
# **getStagedPhoneNumber**
> PhoneReference1089da0ab90910000f70891a998b0887 getStagedPhoneNumber(ID, subresourceID).execute();

A phone number as it exists staged for update by the parent business process.

Retrieve an existing phone number as it exists when staged by the parent business process.  Secured by: Person Data: Home Phone, Self-Service: Home Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      PhoneReference1089da0ab90910000f70891a998b0887 result = client
              .homeContactInformationChanges
              .getStagedPhoneNumber(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getExtension());
      System.out.println(result.getCompletePhoneNumber());
      System.out.println(result.getCountryPhoneCode());
      System.out.println(result.getDeviceType());
      System.out.println(result.getUsage());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getStagedPhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneReference1089da0ab90910000f70891a998b0887> response = client
              .homeContactInformationChanges
              .getStagedPhoneNumber(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getStagedPhoneNumber");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**PhoneReference1089da0ab90910000f70891a998b0887**](PhoneReference1089da0ab90910000f70891a998b0887.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getWebAddress"></a>
# **getWebAddress**
> WebAddressReferenceE357ae6d466510000ce259f323be01b0 getWebAddress(ID, subresourceID).execute();

A web address as it exists staged for update by the parent business process.

Retrieve an existing web address as it exists when staged by the parent business process.  Secured by: Person Data: Home Web Address, Self-Service: Home Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      WebAddressReferenceE357ae6d466510000ce259f323be01b0 result = client
              .homeContactInformationChanges
              .getWebAddress(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsage());
      System.out.println(result.getUrl());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getWebAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebAddressReferenceE357ae6d466510000ce259f323be01b0> response = client
              .homeContactInformationChanges
              .getWebAddress(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getWebAddress");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**WebAddressReferenceE357ae6d466510000ce259f323be01b0**](WebAddressReferenceE357ae6d466510000ce259f323be01b0.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getWebAddressesStaged"></a>
# **getWebAddressesStaged**
> HomeContactInformationChangesGetWebAddressesStagedResponse getWebAddressesStaged(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usageType(usageType).usedFor(usedFor).execute();

Retrieve all existing web addresses staged for update by the parent business process

Retrieve all web addresses staged for update by the parent business process  Secured by: Person Data: Home Web Address, Self-Service: Home Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    Boolean primaryOnly = true; // If true, returns only the IDs of the person's primary web addresses.
    Boolean publicOnly = true; // If true, returns only the IDs of the person's public web addresses.
    String usageType = "usageType_example"; // Specifies usage type, such as home or work. Only used if the service provides access to multiple usage types from the same endpoint.
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      HomeContactInformationChangesGetWebAddressesStagedResponse result = client
              .homeContactInformationChanges
              .getWebAddressesStaged(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usageType(usageType)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getWebAddressesStaged");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeContactInformationChangesGetWebAddressesStagedResponse> response = client
              .homeContactInformationChanges
              .getWebAddressesStaged(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usageType(usageType)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#getWebAddressesStaged");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **primaryOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s primary web addresses. | [optional] |
| **publicOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s public web addresses. | [optional] |
| **usageType** | **String**| Specifies usage type, such as home or work. Only used if the service provides access to multiple usage types from the same endpoint. | [optional] |
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**HomeContactInformationChangesGetWebAddressesStagedResponse**](HomeContactInformationChangesGetWebAddressesStagedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="removeAddress"></a>
# **removeAddress**
> removeAddress(ID, subresourceID).execute();



Remove the specified address. If this address existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Home Address, Self-Service: Home Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      client
              .homeContactInformationChanges
              .removeAddress(ID, subresourceID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#removeAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .homeContactInformationChanges
              .removeAddress(ID, subresourceID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#removeAddress");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Deleting resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="removeEmailAddress"></a>
# **removeEmailAddress**
> removeEmailAddress(ID, subresourceID).execute();



Remove the specified email address. If this address existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Home Email, Self-Service: Home Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      client
              .homeContactInformationChanges
              .removeEmailAddress(ID, subresourceID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#removeEmailAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .homeContactInformationChanges
              .removeEmailAddress(ID, subresourceID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#removeEmailAddress");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Deleting resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="removeInstantMessenger"></a>
# **removeInstantMessenger**
> removeInstantMessenger(ID, subresourceID).execute();



Remove the specified instant messenger. If this instant messenger existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Home Instant Messenger, Self-Service: Home Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      client
              .homeContactInformationChanges
              .removeInstantMessenger(ID, subresourceID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#removeInstantMessenger");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .homeContactInformationChanges
              .removeInstantMessenger(ID, subresourceID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#removeInstantMessenger");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Deleting resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="removePhoneNumber"></a>
# **removePhoneNumber**
> removePhoneNumber(ID, subresourceID).execute();



Remove the specified phone number. If this address existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Home Phone, Self-Service: Home Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      client
              .homeContactInformationChanges
              .removePhoneNumber(ID, subresourceID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#removePhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .homeContactInformationChanges
              .removePhoneNumber(ID, subresourceID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#removePhoneNumber");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Deleting resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="removeWebAddress"></a>
# **removeWebAddress**
> removeWebAddress(ID, subresourceID).execute();



Remove the specified web address. If this address existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Home Web Address, Self-Service: Home Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      client
              .homeContactInformationChanges
              .removeWebAddress(ID, subresourceID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#removeWebAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .homeContactInformationChanges
              .removeWebAddress(ID, subresourceID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#removeWebAddress");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Deleting resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="submitChange"></a>
# **submitChange**
> ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed submitChange(ID, changeContactInformationEvent765b18aa13af1000064a10bf37b800ed).execute();

Submit the specified contact change ID.

Submits the specified home contact information change ID.   To submit the Home Contact Change event and initiate the Home Contact Change business process, specify an empty request body: {}. To save for later, specify this request body: {     \&quot;businessProcessParameters\&quot;: {         \&quot;action\&quot;:{             \&quot;id\&quot;: \&quot;d9e41a8c446c11de98360015c5e6daf6\&quot;         }     } }  The action id value is the Workday ID of the Save for Later action. If you submit this endpoint with the Save for Later action, you can no longer edit nor resubmit the Home Contact Change event using the REST APIs. The user with correct permissions can edit and submit the saved Home Contact Change event in the Workday UI.  Secured by: Change Home Contact Information (REST Service)  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    BusinessProcessParameters83f6f6b7c38d100009c7ad91dd414a16 businessProcessParameters = new BusinessProcessParameters83f6f6b7c38d100009c7ad91dd414a16();
    String descriptor = "descriptor_example"; // A preview of the instance
    String id = "id_example"; // Id of the instance
    try {
      ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed result = client
              .homeContactInformationChanges
              .submitChange(ID)
              .businessProcessParameters(businessProcessParameters)
              .descriptor(descriptor)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#submitChange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed> response = client
              .homeContactInformationChanges
              .submitChange(ID)
              .businessProcessParameters(businessProcessParameters)
              .descriptor(descriptor)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#submitChange");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **changeContactInformationEvent765b18aa13af1000064a10bf37b800ed** | [**ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed**](ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed.md)|  | |

### Return type

[**ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed**](ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed.md)

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

<a name="updateAddress"></a>
# **updateAddress**
> HomeAddressReference81f66ab16f7510005c53d881876e4843 updateAddress(ID, subresourceID, homeAddressReference81f66ab16f7510005c53d881876e4843).execute();



Update an existing address that is staged for update by the parent business process event.  Secured by: Person Data: Home Address, Self-Service: Home Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    String citySubdivision2Local = "citySubdivision2Local_example"; // City Subdivision 2 - Local
    String addressLine9 = "addressLine9_example"; // Address Line 9
    String citySubdivision1Local = "citySubdivision1Local_example"; // City Subdivision 1 - Local
    String addressLine8Local = "addressLine8Local_example"; // Local Address Line 8
    String addressLine6 = "addressLine6_example"; // Address Line 6
    LocalDate effective = LocalDate.now(); // The date this business process takes effect.
    String addressLine3 = "addressLine3_example"; // Address Line 3
    String postalCode = "postalCode_example"; // Postal Code
    Integer numberDaysWFH = 56; // Number of Days WFH
    String addressLine2Local = "addressLine2Local_example"; // Local Address Line 2
    String cityLocal = "cityLocal_example"; // City - Local
    String addressLine6Local = "addressLine6Local_example"; // Local Address Line 6
    String addressLine1 = "addressLine1_example"; // Address Line 1
    String citySubdivision1 = "citySubdivision1_example"; // City Subdivision 1
    String regionSubdivision2 = "regionSubdivision2_example"; // Region Subdivision 2
    String city = "city_example"; // City
    String addressLine4Local = "addressLine4Local_example"; // Local Address Line 4
    String regionSubdivision1 = "regionSubdivision1_example"; // Region Subdivision 1
    String addressLine7 = "addressLine7_example"; // Address Line 7
    String addressLine2 = "addressLine2_example"; // Address Line 2
    String addressLine5 = "addressLine5_example"; // Address Line 5
    String addressLine9Local = "addressLine9Local_example"; // Local Address Line 9
    String addressLine3Local = "addressLine3Local_example"; // Local Address Line 3
    CountryCity81f66ab16f7510005c53d89089074844 countryCity = new CountryCity81f66ab16f7510005c53d89089074844();
    String addressLine7Local = "addressLine7Local_example"; // Local Address Line 7
    String addressLine1Local = "addressLine1Local_example"; // Local Address Line 1
    Country81f66ab16f7510005c53d8fd5f5b4852 country = new Country81f66ab16f7510005c53d8fd5f5b4852();
    CountryRegion81f66ab16f7510005c53d8be2fe44847 countryRegion = new CountryRegion81f66ab16f7510005c53d8be2fe44847();
    String addressLine5Local = "addressLine5Local_example"; // Local Address Line 5
    String regionSubdivision1Local = "regionSubdivision1Local_example"; // Region Subdivision 1 - Local
    String addressLine4 = "addressLine4_example"; // Address Line 4
    Usage81f66ab16f7510005c53d917926f4857 usage = new Usage81f66ab16f7510005c53d917926f4857();
    String addressLine8 = "addressLine8_example"; // Address Line 8
    String citySubdivision2 = "citySubdivision2_example"; // City Subdivision 2
    String id = "id_example"; // Id of the instance
    try {
      HomeAddressReference81f66ab16f7510005c53d881876e4843 result = client
              .homeContactInformationChanges
              .updateAddress(ID, subresourceID)
              .citySubdivision2Local(citySubdivision2Local)
              .addressLine9(addressLine9)
              .citySubdivision1Local(citySubdivision1Local)
              .addressLine8Local(addressLine8Local)
              .addressLine6(addressLine6)
              .effective(effective)
              .addressLine3(addressLine3)
              .postalCode(postalCode)
              .numberDaysWFH(numberDaysWFH)
              .addressLine2Local(addressLine2Local)
              .cityLocal(cityLocal)
              .addressLine6Local(addressLine6Local)
              .addressLine1(addressLine1)
              .citySubdivision1(citySubdivision1)
              .regionSubdivision2(regionSubdivision2)
              .city(city)
              .addressLine4Local(addressLine4Local)
              .regionSubdivision1(regionSubdivision1)
              .addressLine7(addressLine7)
              .addressLine2(addressLine2)
              .addressLine5(addressLine5)
              .addressLine9Local(addressLine9Local)
              .addressLine3Local(addressLine3Local)
              .countryCity(countryCity)
              .addressLine7Local(addressLine7Local)
              .addressLine1Local(addressLine1Local)
              .country(country)
              .countryRegion(countryRegion)
              .addressLine5Local(addressLine5Local)
              .regionSubdivision1Local(regionSubdivision1Local)
              .addressLine4(addressLine4)
              .usage(usage)
              .addressLine8(addressLine8)
              .citySubdivision2(citySubdivision2)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getCitySubdivision2Local());
      System.out.println(result.getAddressLine9());
      System.out.println(result.getCitySubdivision1Local());
      System.out.println(result.getAddressLine8Local());
      System.out.println(result.getAddressLine6());
      System.out.println(result.getEffective());
      System.out.println(result.getAddressLine3());
      System.out.println(result.getPostalCode());
      System.out.println(result.getNumberDaysWFH());
      System.out.println(result.getAddressLine2Local());
      System.out.println(result.getCityLocal());
      System.out.println(result.getAddressLine6Local());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getCitySubdivision1());
      System.out.println(result.getRegionSubdivision2());
      System.out.println(result.getCity());
      System.out.println(result.getAddressLine4Local());
      System.out.println(result.getRegionSubdivision1());
      System.out.println(result.getAddressLine7());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getAddressLine5());
      System.out.println(result.getAddressLine9Local());
      System.out.println(result.getAddressLine3Local());
      System.out.println(result.getCountryCity());
      System.out.println(result.getAddressLine7Local());
      System.out.println(result.getAddressLine1Local());
      System.out.println(result.getCountry());
      System.out.println(result.getCountryRegion());
      System.out.println(result.getAddressLine5Local());
      System.out.println(result.getRegionSubdivision1Local());
      System.out.println(result.getAddressLine4());
      System.out.println(result.getUsage());
      System.out.println(result.getAddressLine8());
      System.out.println(result.getCitySubdivision2());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#updateAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeAddressReference81f66ab16f7510005c53d881876e4843> response = client
              .homeContactInformationChanges
              .updateAddress(ID, subresourceID)
              .citySubdivision2Local(citySubdivision2Local)
              .addressLine9(addressLine9)
              .citySubdivision1Local(citySubdivision1Local)
              .addressLine8Local(addressLine8Local)
              .addressLine6(addressLine6)
              .effective(effective)
              .addressLine3(addressLine3)
              .postalCode(postalCode)
              .numberDaysWFH(numberDaysWFH)
              .addressLine2Local(addressLine2Local)
              .cityLocal(cityLocal)
              .addressLine6Local(addressLine6Local)
              .addressLine1(addressLine1)
              .citySubdivision1(citySubdivision1)
              .regionSubdivision2(regionSubdivision2)
              .city(city)
              .addressLine4Local(addressLine4Local)
              .regionSubdivision1(regionSubdivision1)
              .addressLine7(addressLine7)
              .addressLine2(addressLine2)
              .addressLine5(addressLine5)
              .addressLine9Local(addressLine9Local)
              .addressLine3Local(addressLine3Local)
              .countryCity(countryCity)
              .addressLine7Local(addressLine7Local)
              .addressLine1Local(addressLine1Local)
              .country(country)
              .countryRegion(countryRegion)
              .addressLine5Local(addressLine5Local)
              .regionSubdivision1Local(regionSubdivision1Local)
              .addressLine4(addressLine4)
              .usage(usage)
              .addressLine8(addressLine8)
              .citySubdivision2(citySubdivision2)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#updateAddress");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **homeAddressReference81f66ab16f7510005c53d881876e4843** | [**HomeAddressReference81f66ab16f7510005c53d881876e4843**](HomeAddressReference81f66ab16f7510005c53d881876e4843.md)|  | |

### Return type

[**HomeAddressReference81f66ab16f7510005c53d881876e4843**](HomeAddressReference81f66ab16f7510005c53d881876e4843.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="updateEmailAddress"></a>
# **updateEmailAddress**
> EmailAddressReference0918d433e86b100018119edc1b8f00f7 updateEmailAddress(ID, subresourceID, emailAddressReference0918d433e86b100018119edc1b8f00f7).execute();



Partially update an existing email address that is staged for update by the parent business process event.  Secured by: Person Data: Home Email, Self-Service: Home Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    String emailAddress = "emailAddress_example"; // The email address.
    Usage6333dee5ac2010000c8653405aaa0038 usage = new Usage6333dee5ac2010000c8653405aaa0038();
    String descriptor = "descriptor_example"; // A preview of the instance
    String id = "id_example"; // Id of the instance
    try {
      EmailAddressReference0918d433e86b100018119edc1b8f00f7 result = client
              .homeContactInformationChanges
              .updateEmailAddress(ID, subresourceID)
              .emailAddress(emailAddress)
              .usage(usage)
              .descriptor(descriptor)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmailAddress());
      System.out.println(result.getUsage());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#updateEmailAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailAddressReference0918d433e86b100018119edc1b8f00f7> response = client
              .homeContactInformationChanges
              .updateEmailAddress(ID, subresourceID)
              .emailAddress(emailAddress)
              .usage(usage)
              .descriptor(descriptor)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#updateEmailAddress");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **emailAddressReference0918d433e86b100018119edc1b8f00f7** | [**EmailAddressReference0918d433e86b100018119edc1b8f00f7**](EmailAddressReference0918d433e86b100018119edc1b8f00f7.md)|  | |

### Return type

[**EmailAddressReference0918d433e86b100018119edc1b8f00f7**](EmailAddressReference0918d433e86b100018119edc1b8f00f7.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="updateInstantMessenger"></a>
# **updateInstantMessenger**
> InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016 updateInstantMessenger(ID, subresourceID, instantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016).execute();



Partially update an existing instant messenger that is staged for update by the parent business process event.  Secured by: Person Data: Home Instant Messenger, Self-Service: Home Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    TypeDe08a6c876a810000cb2e3dd8853001a type = new TypeDe08a6c876a810000cb2e3dd8853001a();
    String userName = "userName_example"; // The instant messenger account username.
    UsageDe08a6c876a810000cb2e3d738be0019 usage = new UsageDe08a6c876a810000cb2e3d738be0019();
    String id = "id_example"; // Id of the instance
    try {
      InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016 result = client
              .homeContactInformationChanges
              .updateInstantMessenger(ID, subresourceID)
              .type(type)
              .userName(userName)
              .usage(usage)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getType());
      System.out.println(result.getUserName());
      System.out.println(result.getUsage());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#updateInstantMessenger");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016> response = client
              .homeContactInformationChanges
              .updateInstantMessenger(ID, subresourceID)
              .type(type)
              .userName(userName)
              .usage(usage)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#updateInstantMessenger");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **instantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016** | [**InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016**](InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016.md)|  | |

### Return type

[**InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016**](InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="updatePhoneNumber"></a>
# **updatePhoneNumber**
> PhoneReference1089da0ab90910000f70891a998b0887 updatePhoneNumber(ID, subresourceID, phoneReference1089da0ab90910000f70891a998b0887).execute();



Partially update an existing phone number that is staged for update by the parent business process event.  Secured by: Person Data: Home Phone, Self-Service: Home Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    String extension = "extension_example"; // The phone extension.
    String completePhoneNumber = "completePhoneNumber_example"; // The complete phone number.
    CountryPhoneCode1089da0ab90910000f7089365467088c countryPhoneCode = new CountryPhoneCode1089da0ab90910000f7089365467088c();
    DeviceType1089da0ab90910000f7089256c7b0888 deviceType = new DeviceType1089da0ab90910000f7089256c7b0888();
    Usage1089da0ab90910000f70892f2de3088a usage = new Usage1089da0ab90910000f70892f2de3088a();
    String descriptor = "descriptor_example"; // A preview of the instance
    String id = "id_example"; // Id of the instance
    try {
      PhoneReference1089da0ab90910000f70891a998b0887 result = client
              .homeContactInformationChanges
              .updatePhoneNumber(ID, subresourceID)
              .extension(extension)
              .completePhoneNumber(completePhoneNumber)
              .countryPhoneCode(countryPhoneCode)
              .deviceType(deviceType)
              .usage(usage)
              .descriptor(descriptor)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getExtension());
      System.out.println(result.getCompletePhoneNumber());
      System.out.println(result.getCountryPhoneCode());
      System.out.println(result.getDeviceType());
      System.out.println(result.getUsage());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#updatePhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneReference1089da0ab90910000f70891a998b0887> response = client
              .homeContactInformationChanges
              .updatePhoneNumber(ID, subresourceID)
              .extension(extension)
              .completePhoneNumber(completePhoneNumber)
              .countryPhoneCode(countryPhoneCode)
              .deviceType(deviceType)
              .usage(usage)
              .descriptor(descriptor)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#updatePhoneNumber");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **phoneReference1089da0ab90910000f70891a998b0887** | [**PhoneReference1089da0ab90910000f70891a998b0887**](PhoneReference1089da0ab90910000f70891a998b0887.md)|  | |

### Return type

[**PhoneReference1089da0ab90910000f70891a998b0887**](PhoneReference1089da0ab90910000f70891a998b0887.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="updateWebAddress"></a>
# **updateWebAddress**
> WebAddressReferenceE357ae6d466510000ce259f323be01b0 updateWebAddress(ID, subresourceID, webAddressReferenceE357ae6d466510000ce259f323be01b0).execute();



Partially update an existing web address that is staged for update by the parent business process event.  Secured by: Person Data: Home Web Address, Self-Service: Home Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    UsageE357ae6d466510000ce25a08bfe401b3 usage = new UsageE357ae6d466510000ce25a08bfe401b3();
    String url = "url_example"; // The complete URL address for the web address.
    String id = "id_example"; // Id of the instance
    try {
      WebAddressReferenceE357ae6d466510000ce259f323be01b0 result = client
              .homeContactInformationChanges
              .updateWebAddress(ID, subresourceID)
              .usage(usage)
              .url(url)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsage());
      System.out.println(result.getUrl());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#updateWebAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebAddressReferenceE357ae6d466510000ce259f323be01b0> response = client
              .homeContactInformationChanges
              .updateWebAddress(ID, subresourceID)
              .usage(usage)
              .url(url)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeContactInformationChangesApi#updateWebAddress");
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
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **webAddressReferenceE357ae6d466510000ce259f323be01b0** | [**WebAddressReferenceE357ae6d466510000ce259f323be01b0**](WebAddressReferenceE357ae6d466510000ce259f323be01b0.md)|  | |

### Return type

[**WebAddressReferenceE357ae6d466510000ce259f323be01b0**](WebAddressReferenceE357ae6d466510000ce259f323be01b0.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

