# WorkContactInformationChangesApi

All URIs are relative to *https://&lt;tenantHostname&gt;/person/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAddress**](WorkContactInformationChangesApi.md#createAddress) | **POST** /workContactInformationChanges/{ID}/addresses |  |
| [**createEmailAddress**](WorkContactInformationChangesApi.md#createEmailAddress) | **POST** /workContactInformationChanges/{ID}/emailAddresses |  |
| [**createInstantMessenger**](WorkContactInformationChangesApi.md#createInstantMessenger) | **POST** /workContactInformationChanges/{ID}/instantMessengers |  |
| [**createPhoneNumber**](WorkContactInformationChangesApi.md#createPhoneNumber) | **POST** /workContactInformationChanges/{ID}/phoneNumbers |  |
| [**createStagedWebAddress**](WorkContactInformationChangesApi.md#createStagedWebAddress) | **POST** /workContactInformationChanges/{ID}/webAddresses |  |
| [**getAddressAsStaged**](WorkContactInformationChangesApi.md#getAddressAsStaged) | **GET** /workContactInformationChanges/{ID}/addresses/{subresourceID} | An address as it exists staged for update by the parent business process. |
| [**getAddressesStaged**](WorkContactInformationChangesApi.md#getAddressesStaged) | **GET** /workContactInformationChanges/{ID}/addresses | Retrieve all existing addresses staged for update by the parent business process |
| [**getEmailAddress**](WorkContactInformationChangesApi.md#getEmailAddress) | **GET** /workContactInformationChanges/{ID}/emailAddresses/{subresourceID} | An email address as it exists staged for update by the parent business process. |
| [**getEventInfo**](WorkContactInformationChangesApi.md#getEventInfo) | **GET** /workContactInformationChanges/{ID} |  |
| [**getPhoneNumber**](WorkContactInformationChangesApi.md#getPhoneNumber) | **GET** /workContactInformationChanges/{ID}/phoneNumbers/{subresourceID} | A phone number as it exists staged for update by the parent business process. |
| [**getPhoneNumbers**](WorkContactInformationChangesApi.md#getPhoneNumbers) | **GET** /workContactInformationChanges/{ID}/phoneNumbers | Retrieve all existing phone numbers staged for update by the parent business process |
| [**getStagedEmailAddresses**](WorkContactInformationChangesApi.md#getStagedEmailAddresses) | **GET** /workContactInformationChanges/{ID}/emailAddresses | Retrieve all existing addresses staged for update by the parent business process |
| [**getStagedInstantMessenger**](WorkContactInformationChangesApi.md#getStagedInstantMessenger) | **GET** /workContactInformationChanges/{ID}/instantMessengers/{subresourceID} | An instant messenger as it exists staged for update by the parent business process. |
| [**getStagedInstantMessengers**](WorkContactInformationChangesApi.md#getStagedInstantMessengers) | **GET** /workContactInformationChanges/{ID}/instantMessengers | Retrieve all existing instant messengers staged for update by the parent business process |
| [**getWebAddress**](WorkContactInformationChangesApi.md#getWebAddress) | **GET** /workContactInformationChanges/{ID}/webAddresses/{subresourceID} | A web address as it exists staged for update by the parent business process. |
| [**getWebAddressesStaged**](WorkContactInformationChangesApi.md#getWebAddressesStaged) | **GET** /workContactInformationChanges/{ID}/webAddresses | Retrieve all existing web addresses staged for update by the parent business process |
| [**removeAddress**](WorkContactInformationChangesApi.md#removeAddress) | **DELETE** /workContactInformationChanges/{ID}/addresses/{subresourceID} |  |
| [**removeEmailAddress**](WorkContactInformationChangesApi.md#removeEmailAddress) | **DELETE** /workContactInformationChanges/{ID}/emailAddresses/{subresourceID} |  |
| [**removeInstantMessenger**](WorkContactInformationChangesApi.md#removeInstantMessenger) | **DELETE** /workContactInformationChanges/{ID}/instantMessengers/{subresourceID} |  |
| [**removePhoneNumber**](WorkContactInformationChangesApi.md#removePhoneNumber) | **DELETE** /workContactInformationChanges/{ID}/phoneNumbers/{subresourceID} |  |
| [**removeWebAddress**](WorkContactInformationChangesApi.md#removeWebAddress) | **DELETE** /workContactInformationChanges/{ID}/webAddresses/{subresourceID} |  |
| [**submit**](WorkContactInformationChangesApi.md#submit) | **POST** /workContactInformationChanges/{ID}/submit | Submit the specified contact change ID. |
| [**updateAddress**](WorkContactInformationChangesApi.md#updateAddress) | **PUT** /workContactInformationChanges/{ID}/addresses/{subresourceID} |  |
| [**updateAlternateWorkLocation**](WorkContactInformationChangesApi.md#updateAlternateWorkLocation) | **PATCH** /workContactInformationChanges/{ID} |  |
| [**updateEmailAddress**](WorkContactInformationChangesApi.md#updateEmailAddress) | **PATCH** /workContactInformationChanges/{ID}/emailAddresses/{subresourceID} |  |
| [**updateInstantMessenger**](WorkContactInformationChangesApi.md#updateInstantMessenger) | **PATCH** /workContactInformationChanges/{ID}/instantMessengers/{subresourceID} |  |
| [**updatePhoneNumber**](WorkContactInformationChangesApi.md#updatePhoneNumber) | **PATCH** /workContactInformationChanges/{ID}/phoneNumbers/{subresourceID} |  |
| [**updateWebAddress**](WorkContactInformationChangesApi.md#updateWebAddress) | **PATCH** /workContactInformationChanges/{ID}/webAddresses/{subresourceID} |  |


<a name="createAddress"></a>
# **createAddress**
> WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095 createAddress(ID, workAddressReferenceC1bb9f46f65210002d2fa259a1c10095).execute();



Creates a new address staged by the parent business process event.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String addressLine3 = "addressLine3_example"; // Address Line 3
    String addressLine8Local = "addressLine8Local_example"; // Local Address Line 8
    String regionSubdivision2 = "regionSubdivision2_example"; // Region Subdivision 2
    String cityLocal = "cityLocal_example"; // City - Local
    String citySubdivision1Local = "citySubdivision1Local_example"; // City Subdivision 1 - Local
    String addressLine6Local = "addressLine6Local_example"; // Local Address Line 6
    String addressLine4Local = "addressLine4Local_example"; // Local Address Line 4
    String regionSubdivision1Local = "regionSubdivision1Local_example"; // Region Subdivision 1 - Local
    CountryC1bb9f46f65210002d2fa329fe6700b4 country = new CountryC1bb9f46f65210002d2fa329fe6700b4();
    String addressLine9 = "addressLine9_example"; // Address Line 9
    String addressLine4 = "addressLine4_example"; // Address Line 4
    String citySubdivision1 = "citySubdivision1_example"; // City Subdivision 1
    String addressLine8 = "addressLine8_example"; // Address Line 8
    String addressLine1 = "addressLine1_example"; // Address Line 1
    String addressLine5Local = "addressLine5Local_example"; // Local Address Line 5
    String addressLine6 = "addressLine6_example"; // Address Line 6
    String city = "city_example"; // City
    String addressLine3Local = "addressLine3Local_example"; // Local Address Line 3
    String postalCode = "postalCode_example"; // Postal Code
    String addressLine9Local = "addressLine9Local_example"; // Local Address Line 9
    String addressLine2 = "addressLine2_example"; // Address Line 2
    String addressLine1Local = "addressLine1Local_example"; // Local Address Line 1
    String addressLine7Local = "addressLine7Local_example"; // Local Address Line 7
    CountryRegionC1bb9f46f65210002d2fa322479a00b2 countryRegion = new CountryRegionC1bb9f46f65210002d2fa322479a00b2();
    String addressLine5 = "addressLine5_example"; // Address Line 5
    UsageC1bb9f46f65210002d2fa2e7babe00a8 usage = new UsageC1bb9f46f65210002d2fa2e7babe00a8();
    String regionSubdivision1 = "regionSubdivision1_example"; // Region Subdivision 1
    String addressLine7 = "addressLine7_example"; // Address Line 7
    LocalDate effective = LocalDate.now(); // The date this business process takes effect.
    String citySubdivision2Local = "citySubdivision2Local_example"; // City Subdivision 2 - Local
    String addressLine2Local = "addressLine2Local_example"; // Local Address Line 2
    CountryCityC1bb9f46f65210002d2fa2bb24a300a1 countryCity = new CountryCityC1bb9f46f65210002d2fa2bb24a300a1();
    String citySubdivision2 = "citySubdivision2_example"; // City Subdivision 2
    String id = "id_example"; // Id of the instance
    try {
      WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095 result = client
              .workContactInformationChanges
              .createAddress(ID)
              .addressLine3(addressLine3)
              .addressLine8Local(addressLine8Local)
              .regionSubdivision2(regionSubdivision2)
              .cityLocal(cityLocal)
              .citySubdivision1Local(citySubdivision1Local)
              .addressLine6Local(addressLine6Local)
              .addressLine4Local(addressLine4Local)
              .regionSubdivision1Local(regionSubdivision1Local)
              .country(country)
              .addressLine9(addressLine9)
              .addressLine4(addressLine4)
              .citySubdivision1(citySubdivision1)
              .addressLine8(addressLine8)
              .addressLine1(addressLine1)
              .addressLine5Local(addressLine5Local)
              .addressLine6(addressLine6)
              .city(city)
              .addressLine3Local(addressLine3Local)
              .postalCode(postalCode)
              .addressLine9Local(addressLine9Local)
              .addressLine2(addressLine2)
              .addressLine1Local(addressLine1Local)
              .addressLine7Local(addressLine7Local)
              .countryRegion(countryRegion)
              .addressLine5(addressLine5)
              .usage(usage)
              .regionSubdivision1(regionSubdivision1)
              .addressLine7(addressLine7)
              .effective(effective)
              .citySubdivision2Local(citySubdivision2Local)
              .addressLine2Local(addressLine2Local)
              .countryCity(countryCity)
              .citySubdivision2(citySubdivision2)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getAddressLine3());
      System.out.println(result.getAddressLine8Local());
      System.out.println(result.getRegionSubdivision2());
      System.out.println(result.getCityLocal());
      System.out.println(result.getCitySubdivision1Local());
      System.out.println(result.getAddressLine6Local());
      System.out.println(result.getAddressLine4Local());
      System.out.println(result.getRegionSubdivision1Local());
      System.out.println(result.getCountry());
      System.out.println(result.getAddressLine9());
      System.out.println(result.getAddressLine4());
      System.out.println(result.getCitySubdivision1());
      System.out.println(result.getAddressLine8());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getAddressLine5Local());
      System.out.println(result.getAddressLine6());
      System.out.println(result.getCity());
      System.out.println(result.getAddressLine3Local());
      System.out.println(result.getPostalCode());
      System.out.println(result.getAddressLine9Local());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getAddressLine1Local());
      System.out.println(result.getAddressLine7Local());
      System.out.println(result.getCountryRegion());
      System.out.println(result.getAddressLine5());
      System.out.println(result.getUsage());
      System.out.println(result.getRegionSubdivision1());
      System.out.println(result.getAddressLine7());
      System.out.println(result.getEffective());
      System.out.println(result.getCitySubdivision2Local());
      System.out.println(result.getAddressLine2Local());
      System.out.println(result.getCountryCity());
      System.out.println(result.getCitySubdivision2());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#createAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095> response = client
              .workContactInformationChanges
              .createAddress(ID)
              .addressLine3(addressLine3)
              .addressLine8Local(addressLine8Local)
              .regionSubdivision2(regionSubdivision2)
              .cityLocal(cityLocal)
              .citySubdivision1Local(citySubdivision1Local)
              .addressLine6Local(addressLine6Local)
              .addressLine4Local(addressLine4Local)
              .regionSubdivision1Local(regionSubdivision1Local)
              .country(country)
              .addressLine9(addressLine9)
              .addressLine4(addressLine4)
              .citySubdivision1(citySubdivision1)
              .addressLine8(addressLine8)
              .addressLine1(addressLine1)
              .addressLine5Local(addressLine5Local)
              .addressLine6(addressLine6)
              .city(city)
              .addressLine3Local(addressLine3Local)
              .postalCode(postalCode)
              .addressLine9Local(addressLine9Local)
              .addressLine2(addressLine2)
              .addressLine1Local(addressLine1Local)
              .addressLine7Local(addressLine7Local)
              .countryRegion(countryRegion)
              .addressLine5(addressLine5)
              .usage(usage)
              .regionSubdivision1(regionSubdivision1)
              .addressLine7(addressLine7)
              .effective(effective)
              .citySubdivision2Local(citySubdivision2Local)
              .addressLine2Local(addressLine2Local)
              .countryCity(countryCity)
              .citySubdivision2(citySubdivision2)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#createAddress");
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
| **workAddressReferenceC1bb9f46f65210002d2fa259a1c10095** | [**WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095**](WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095.md)|  | |

### Return type

[**WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095**](WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095.md)

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

<a name="createEmailAddress"></a>
# **createEmailAddress**
> EmailAddressReference0918d433e86b100018119edc1b8f00f7 createEmailAddress(ID, emailAddressReference0918d433e86b100018119edc1b8f00f7).execute();



Creates a new email address staged by the parent business process event.  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#createEmailAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailAddressReference0918d433e86b100018119edc1b8f00f7> response = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#createEmailAddress");
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



Creates a new instant messenger staged by the parent business process event.  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#createInstantMessenger");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016> response = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#createInstantMessenger");
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

<a name="createPhoneNumber"></a>
# **createPhoneNumber**
> PhoneReference1089da0ab90910000f70891a998b0887 createPhoneNumber(ID, phoneReference1089da0ab90910000f70891a998b0887).execute();



Creates a new phone number staged by the parent business process event.  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#createPhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneReference1089da0ab90910000f70891a998b0887> response = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#createPhoneNumber");
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

<a name="createStagedWebAddress"></a>
# **createStagedWebAddress**
> WebAddressReferenceE357ae6d466510000ce259f323be01b0 createStagedWebAddress(ID, webAddressReferenceE357ae6d466510000ce259f323be01b0).execute();



Creates a new web address staged by the parent business process event.  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
              .createStagedWebAddress(ID)
              .usage(usage)
              .url(url)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsage());
      System.out.println(result.getUrl());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#createStagedWebAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebAddressReferenceE357ae6d466510000ce259f323be01b0> response = client
              .workContactInformationChanges
              .createStagedWebAddress(ID)
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#createStagedWebAddress");
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
> WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095 getAddressAsStaged(ID, subresourceID).execute();

An address as it exists staged for update by the parent business process.

Retrieve an existing address as it exists when staged by the parent business process.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
      WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095 result = client
              .workContactInformationChanges
              .getAddressAsStaged(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getAddressLine3());
      System.out.println(result.getAddressLine8Local());
      System.out.println(result.getRegionSubdivision2());
      System.out.println(result.getCityLocal());
      System.out.println(result.getCitySubdivision1Local());
      System.out.println(result.getAddressLine6Local());
      System.out.println(result.getAddressLine4Local());
      System.out.println(result.getRegionSubdivision1Local());
      System.out.println(result.getCountry());
      System.out.println(result.getAddressLine9());
      System.out.println(result.getAddressLine4());
      System.out.println(result.getCitySubdivision1());
      System.out.println(result.getAddressLine8());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getAddressLine5Local());
      System.out.println(result.getAddressLine6());
      System.out.println(result.getCity());
      System.out.println(result.getAddressLine3Local());
      System.out.println(result.getPostalCode());
      System.out.println(result.getAddressLine9Local());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getAddressLine1Local());
      System.out.println(result.getAddressLine7Local());
      System.out.println(result.getCountryRegion());
      System.out.println(result.getAddressLine5());
      System.out.println(result.getUsage());
      System.out.println(result.getRegionSubdivision1());
      System.out.println(result.getAddressLine7());
      System.out.println(result.getEffective());
      System.out.println(result.getCitySubdivision2Local());
      System.out.println(result.getAddressLine2Local());
      System.out.println(result.getCountryCity());
      System.out.println(result.getCitySubdivision2());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getAddressAsStaged");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095> response = client
              .workContactInformationChanges
              .getAddressAsStaged(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getAddressAsStaged");
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

[**WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095**](WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095.md)

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
> WorkContactInformationChangesGetAddressesStagedResponse getAddressesStaged(ID).limit(limit).offset(offset).publicOnly(publicOnly).usedFor(usedFor).execute();

Retrieve all existing addresses staged for update by the parent business process

Retrieve all addresses staged for update by the parent business process  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
    Boolean publicOnly = true;
    String usedFor = "usedFor_example";
    try {
      WorkContactInformationChangesGetAddressesStagedResponse result = client
              .workContactInformationChanges
              .getAddressesStaged(ID)
              .limit(limit)
              .offset(offset)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getAddressesStaged");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkContactInformationChangesGetAddressesStagedResponse> response = client
              .workContactInformationChanges
              .getAddressesStaged(ID)
              .limit(limit)
              .offset(offset)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getAddressesStaged");
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
| **publicOnly** | **Boolean**|  | [optional] |
| **usedFor** | **String**|  | [optional] |

### Return type

[**WorkContactInformationChangesGetAddressesStagedResponse**](WorkContactInformationChangesGetAddressesStagedResponse.md)

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

Retrieve an existing email address as it exists when staged by the parent business process.  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
              .getEmailAddress(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmailAddress());
      System.out.println(result.getUsage());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getEmailAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailAddressReference0918d433e86b100018119edc1b8f00f7> response = client
              .workContactInformationChanges
              .getEmailAddress(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getEmailAddress");
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

<a name="getEventInfo"></a>
# **getEventInfo**
> WorkContactChangeEventViewBdfa2c83ea5e10002b70a7e9f69e5d67 getEventInfo(ID).execute();



Returns basic information about the work contact change event, as well as the Alternate Work Location staged by the event, if there is one.  Secured by: Change Work Contact Information (REST Service), Person Data: Work Contact Information, Self-Service: Work Contact Information  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
      WorkContactChangeEventViewBdfa2c83ea5e10002b70a7e9f69e5d67 result = client
              .workContactInformationChanges
              .getEventInfo(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getAlternateWorkLocation());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getEventInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkContactChangeEventViewBdfa2c83ea5e10002b70a7e9f69e5d67> response = client
              .workContactInformationChanges
              .getEventInfo(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getEventInfo");
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

[**WorkContactChangeEventViewBdfa2c83ea5e10002b70a7e9f69e5d67**](WorkContactChangeEventViewBdfa2c83ea5e10002b70a7e9f69e5d67.md)

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

<a name="getPhoneNumber"></a>
# **getPhoneNumber**
> PhoneReference1089da0ab90910000f70891a998b0887 getPhoneNumber(ID, subresourceID).execute();

A phone number as it exists staged for update by the parent business process.

Retrieve an existing phone number as it exists when staged by the parent business process.  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
              .getPhoneNumber(ID, subresourceID)
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#getPhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneReference1089da0ab90910000f70891a998b0887> response = client
              .workContactInformationChanges
              .getPhoneNumber(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getPhoneNumber");
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

<a name="getPhoneNumbers"></a>
# **getPhoneNumbers**
> WorkContactInformationChangesGetPhoneNumbersResponse getPhoneNumbers(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usageType(usageType).usedFor(usedFor).execute();

Retrieve all existing phone numbers staged for update by the parent business process

Retrieve all phone numbers staged for update by the parent business process  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
      WorkContactInformationChangesGetPhoneNumbersResponse result = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#getPhoneNumbers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkContactInformationChangesGetPhoneNumbersResponse> response = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#getPhoneNumbers");
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

[**WorkContactInformationChangesGetPhoneNumbersResponse**](WorkContactInformationChangesGetPhoneNumbersResponse.md)

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
> WorkContactInformationChangesGetStagedEmailAddressesResponse getStagedEmailAddresses(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usageType(usageType).usedFor(usedFor).execute();

Retrieve all existing addresses staged for update by the parent business process

Retrieve all email addresses staged for update by the parent business process  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
      WorkContactInformationChangesGetStagedEmailAddressesResponse result = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#getStagedEmailAddresses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkContactInformationChangesGetStagedEmailAddressesResponse> response = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#getStagedEmailAddresses");
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

[**WorkContactInformationChangesGetStagedEmailAddressesResponse**](WorkContactInformationChangesGetStagedEmailAddressesResponse.md)

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

<a name="getStagedInstantMessenger"></a>
# **getStagedInstantMessenger**
> InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016 getStagedInstantMessenger(ID, subresourceID).execute();

An instant messenger as it exists staged for update by the parent business process.

Retrieve an existing instant messenger as it exists when staged by the parent business process.  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
              .getStagedInstantMessenger(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getType());
      System.out.println(result.getUserName());
      System.out.println(result.getUsage());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getStagedInstantMessenger");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016> response = client
              .workContactInformationChanges
              .getStagedInstantMessenger(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getStagedInstantMessenger");
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

<a name="getStagedInstantMessengers"></a>
# **getStagedInstantMessengers**
> WorkContactInformationChangesGetStagedInstantMessengersResponse getStagedInstantMessengers(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usageType(usageType).usedFor(usedFor).execute();

Retrieve all existing instant messengers staged for update by the parent business process

Retrieve all instant messengers staged for update by the parent business process  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
      WorkContactInformationChangesGetStagedInstantMessengersResponse result = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#getStagedInstantMessengers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkContactInformationChangesGetStagedInstantMessengersResponse> response = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#getStagedInstantMessengers");
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

[**WorkContactInformationChangesGetStagedInstantMessengersResponse**](WorkContactInformationChangesGetStagedInstantMessengersResponse.md)

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

Retrieve an existing web address as it exists when staged by the parent business process.  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
              .getWebAddress(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsage());
      System.out.println(result.getUrl());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getWebAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebAddressReferenceE357ae6d466510000ce259f323be01b0> response = client
              .workContactInformationChanges
              .getWebAddress(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#getWebAddress");
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
> WorkContactInformationChangesGetWebAddressesStagedResponse getWebAddressesStaged(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usageType(usageType).usedFor(usedFor).execute();

Retrieve all existing web addresses staged for update by the parent business process

Retrieve all web addresses staged for update by the parent business process  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
      WorkContactInformationChangesGetWebAddressesStagedResponse result = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#getWebAddressesStaged");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkContactInformationChangesGetWebAddressesStagedResponse> response = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#getWebAddressesStaged");
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

[**WorkContactInformationChangesGetWebAddressesStagedResponse**](WorkContactInformationChangesGetWebAddressesStagedResponse.md)

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



Remove the specified address. If this address existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
              .removeAddress(ID, subresourceID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#removeAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workContactInformationChanges
              .removeAddress(ID, subresourceID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#removeAddress");
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



Remove the specified email address. If this address existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
              .removeEmailAddress(ID, subresourceID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#removeEmailAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workContactInformationChanges
              .removeEmailAddress(ID, subresourceID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#removeEmailAddress");
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



Remove the specified instant messenger. If this instant messenger existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
              .removeInstantMessenger(ID, subresourceID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#removeInstantMessenger");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workContactInformationChanges
              .removeInstantMessenger(ID, subresourceID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#removeInstantMessenger");
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



Remove the specified phone number. If this address existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
              .removePhoneNumber(ID, subresourceID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#removePhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workContactInformationChanges
              .removePhoneNumber(ID, subresourceID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#removePhoneNumber");
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



Remove the specified web address. If this address existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
              .removeWebAddress(ID, subresourceID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#removeWebAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workContactInformationChanges
              .removeWebAddress(ID, subresourceID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#removeWebAddress");
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

<a name="submit"></a>
# **submit**
> ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed submit(ID, changeContactInformationEvent765b18aa13af1000064a10bf37b800ed).execute();

Submit the specified contact change ID.

Submits the specified work contact information change ID.   To submit the Work Contact Change event and initiate the Work Contact Change business process, specify an empty request body: {}. To save for later, specify this request body: {     \&quot;businessProcessParameters\&quot;: {         \&quot;action\&quot;:{             \&quot;id\&quot;: \&quot;d9e41a8c446c11de98360015c5e6daf6\&quot;         }     } }  The action id value is the Workday ID of the Save for Later action. If you submit this endpoint with the Save for Later action, you can no longer edit nor resubmit the Work Contact Change event using the REST APIs. The user with correct permissions can edit and submit the saved Work Contact Change event in the Workday UI.  Secured by: Change Work Contact Information (REST Service)  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
              .submit(ID)
              .businessProcessParameters(businessProcessParameters)
              .descriptor(descriptor)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#submit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed> response = client
              .workContactInformationChanges
              .submit(ID)
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#submit");
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
> WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095 updateAddress(ID, subresourceID, workAddressReferenceC1bb9f46f65210002d2fa259a1c10095).execute();



Update an existing address that is staged for update by the parent business process event.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
    String addressLine3 = "addressLine3_example"; // Address Line 3
    String addressLine8Local = "addressLine8Local_example"; // Local Address Line 8
    String regionSubdivision2 = "regionSubdivision2_example"; // Region Subdivision 2
    String cityLocal = "cityLocal_example"; // City - Local
    String citySubdivision1Local = "citySubdivision1Local_example"; // City Subdivision 1 - Local
    String addressLine6Local = "addressLine6Local_example"; // Local Address Line 6
    String addressLine4Local = "addressLine4Local_example"; // Local Address Line 4
    String regionSubdivision1Local = "regionSubdivision1Local_example"; // Region Subdivision 1 - Local
    CountryC1bb9f46f65210002d2fa329fe6700b4 country = new CountryC1bb9f46f65210002d2fa329fe6700b4();
    String addressLine9 = "addressLine9_example"; // Address Line 9
    String addressLine4 = "addressLine4_example"; // Address Line 4
    String citySubdivision1 = "citySubdivision1_example"; // City Subdivision 1
    String addressLine8 = "addressLine8_example"; // Address Line 8
    String addressLine1 = "addressLine1_example"; // Address Line 1
    String addressLine5Local = "addressLine5Local_example"; // Local Address Line 5
    String addressLine6 = "addressLine6_example"; // Address Line 6
    String city = "city_example"; // City
    String addressLine3Local = "addressLine3Local_example"; // Local Address Line 3
    String postalCode = "postalCode_example"; // Postal Code
    String addressLine9Local = "addressLine9Local_example"; // Local Address Line 9
    String addressLine2 = "addressLine2_example"; // Address Line 2
    String addressLine1Local = "addressLine1Local_example"; // Local Address Line 1
    String addressLine7Local = "addressLine7Local_example"; // Local Address Line 7
    CountryRegionC1bb9f46f65210002d2fa322479a00b2 countryRegion = new CountryRegionC1bb9f46f65210002d2fa322479a00b2();
    String addressLine5 = "addressLine5_example"; // Address Line 5
    UsageC1bb9f46f65210002d2fa2e7babe00a8 usage = new UsageC1bb9f46f65210002d2fa2e7babe00a8();
    String regionSubdivision1 = "regionSubdivision1_example"; // Region Subdivision 1
    String addressLine7 = "addressLine7_example"; // Address Line 7
    LocalDate effective = LocalDate.now(); // The date this business process takes effect.
    String citySubdivision2Local = "citySubdivision2Local_example"; // City Subdivision 2 - Local
    String addressLine2Local = "addressLine2Local_example"; // Local Address Line 2
    CountryCityC1bb9f46f65210002d2fa2bb24a300a1 countryCity = new CountryCityC1bb9f46f65210002d2fa2bb24a300a1();
    String citySubdivision2 = "citySubdivision2_example"; // City Subdivision 2
    String id = "id_example"; // Id of the instance
    try {
      WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095 result = client
              .workContactInformationChanges
              .updateAddress(ID, subresourceID)
              .addressLine3(addressLine3)
              .addressLine8Local(addressLine8Local)
              .regionSubdivision2(regionSubdivision2)
              .cityLocal(cityLocal)
              .citySubdivision1Local(citySubdivision1Local)
              .addressLine6Local(addressLine6Local)
              .addressLine4Local(addressLine4Local)
              .regionSubdivision1Local(regionSubdivision1Local)
              .country(country)
              .addressLine9(addressLine9)
              .addressLine4(addressLine4)
              .citySubdivision1(citySubdivision1)
              .addressLine8(addressLine8)
              .addressLine1(addressLine1)
              .addressLine5Local(addressLine5Local)
              .addressLine6(addressLine6)
              .city(city)
              .addressLine3Local(addressLine3Local)
              .postalCode(postalCode)
              .addressLine9Local(addressLine9Local)
              .addressLine2(addressLine2)
              .addressLine1Local(addressLine1Local)
              .addressLine7Local(addressLine7Local)
              .countryRegion(countryRegion)
              .addressLine5(addressLine5)
              .usage(usage)
              .regionSubdivision1(regionSubdivision1)
              .addressLine7(addressLine7)
              .effective(effective)
              .citySubdivision2Local(citySubdivision2Local)
              .addressLine2Local(addressLine2Local)
              .countryCity(countryCity)
              .citySubdivision2(citySubdivision2)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getAddressLine3());
      System.out.println(result.getAddressLine8Local());
      System.out.println(result.getRegionSubdivision2());
      System.out.println(result.getCityLocal());
      System.out.println(result.getCitySubdivision1Local());
      System.out.println(result.getAddressLine6Local());
      System.out.println(result.getAddressLine4Local());
      System.out.println(result.getRegionSubdivision1Local());
      System.out.println(result.getCountry());
      System.out.println(result.getAddressLine9());
      System.out.println(result.getAddressLine4());
      System.out.println(result.getCitySubdivision1());
      System.out.println(result.getAddressLine8());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getAddressLine5Local());
      System.out.println(result.getAddressLine6());
      System.out.println(result.getCity());
      System.out.println(result.getAddressLine3Local());
      System.out.println(result.getPostalCode());
      System.out.println(result.getAddressLine9Local());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getAddressLine1Local());
      System.out.println(result.getAddressLine7Local());
      System.out.println(result.getCountryRegion());
      System.out.println(result.getAddressLine5());
      System.out.println(result.getUsage());
      System.out.println(result.getRegionSubdivision1());
      System.out.println(result.getAddressLine7());
      System.out.println(result.getEffective());
      System.out.println(result.getCitySubdivision2Local());
      System.out.println(result.getAddressLine2Local());
      System.out.println(result.getCountryCity());
      System.out.println(result.getCitySubdivision2());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#updateAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095> response = client
              .workContactInformationChanges
              .updateAddress(ID, subresourceID)
              .addressLine3(addressLine3)
              .addressLine8Local(addressLine8Local)
              .regionSubdivision2(regionSubdivision2)
              .cityLocal(cityLocal)
              .citySubdivision1Local(citySubdivision1Local)
              .addressLine6Local(addressLine6Local)
              .addressLine4Local(addressLine4Local)
              .regionSubdivision1Local(regionSubdivision1Local)
              .country(country)
              .addressLine9(addressLine9)
              .addressLine4(addressLine4)
              .citySubdivision1(citySubdivision1)
              .addressLine8(addressLine8)
              .addressLine1(addressLine1)
              .addressLine5Local(addressLine5Local)
              .addressLine6(addressLine6)
              .city(city)
              .addressLine3Local(addressLine3Local)
              .postalCode(postalCode)
              .addressLine9Local(addressLine9Local)
              .addressLine2(addressLine2)
              .addressLine1Local(addressLine1Local)
              .addressLine7Local(addressLine7Local)
              .countryRegion(countryRegion)
              .addressLine5(addressLine5)
              .usage(usage)
              .regionSubdivision1(regionSubdivision1)
              .addressLine7(addressLine7)
              .effective(effective)
              .citySubdivision2Local(citySubdivision2Local)
              .addressLine2Local(addressLine2Local)
              .countryCity(countryCity)
              .citySubdivision2(citySubdivision2)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#updateAddress");
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
| **workAddressReferenceC1bb9f46f65210002d2fa259a1c10095** | [**WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095**](WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095.md)|  | |

### Return type

[**WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095**](WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095.md)

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

<a name="updateAlternateWorkLocation"></a>
# **updateAlternateWorkLocation**
> WorkContactChangeEventD72a8353f91e1000169a839c31a0046d updateAlternateWorkLocation(ID, workContactChangeEventD72a8353f91e1000169a839c31a0046d).execute();



Update the Alternate Work Location staged by this business process event.   Any Home or Work address for the target Person is valid for use as an Alternate Work Location.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    AlternateWorkLocationD72a8353f91e1000169a83b894e7046e alternateWorkLocation = new AlternateWorkLocationD72a8353f91e1000169a83b894e7046e();
    String descriptor = "descriptor_example"; // A preview of the instance
    String id = "id_example"; // Id of the instance
    try {
      WorkContactChangeEventD72a8353f91e1000169a839c31a0046d result = client
              .workContactInformationChanges
              .updateAlternateWorkLocation(ID)
              .alternateWorkLocation(alternateWorkLocation)
              .descriptor(descriptor)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getAlternateWorkLocation());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#updateAlternateWorkLocation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkContactChangeEventD72a8353f91e1000169a839c31a0046d> response = client
              .workContactInformationChanges
              .updateAlternateWorkLocation(ID)
              .alternateWorkLocation(alternateWorkLocation)
              .descriptor(descriptor)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkContactInformationChangesApi#updateAlternateWorkLocation");
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
| **workContactChangeEventD72a8353f91e1000169a839c31a0046d** | [**WorkContactChangeEventD72a8353f91e1000169a839c31a0046d**](WorkContactChangeEventD72a8353f91e1000169a839c31a0046d.md)|  | |

### Return type

[**WorkContactChangeEventD72a8353f91e1000169a839c31a0046d**](WorkContactChangeEventD72a8353f91e1000169a839c31a0046d.md)

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



Partially update an existing email address that is staged for update by the parent business process event.  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#updateEmailAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailAddressReference0918d433e86b100018119edc1b8f00f7> response = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#updateEmailAddress");
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



Partially update an existing instant messenger that is staged for update by the parent business process event.  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#updateInstantMessenger");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016> response = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#updateInstantMessenger");
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



Partially update an existing phone number that is staged for update by the parent business process event.  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#updatePhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneReference1089da0ab90910000f70891a998b0887> response = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#updatePhoneNumber");
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



Partially update an existing web address that is staged for update by the parent business process event.  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkContactInformationChangesApi;
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
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#updateWebAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebAddressReferenceE357ae6d466510000ce259f323be01b0> response = client
              .workContactInformationChanges
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
      System.err.println("Exception when calling WorkContactInformationChangesApi#updateWebAddress");
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

