# PeopleApi

All URIs are relative to *https://&lt;tenantHostname&gt;/person/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAdditionalName**](PeopleApi.md#getAdditionalName) | **GET** /people/{ID}/additionalNames/{subresourceID} | Retrieves an additional name. |
| [**getAdditionalNames**](PeopleApi.md#getAdditionalNames) | **GET** /people/{ID}/additionalNames | Retrieves a collection of additional names. |
| [**getById**](PeopleApi.md#getById) | **GET** /people/{ID} | Retrieves a person in your Workday tenant. |
| [**getHomeAddress**](PeopleApi.md#getHomeAddress) | **GET** /people/{ID}/homeAddresses/{subresourceID} | Retrieves a home address. |
| [**getHomeAddresses**](PeopleApi.md#getHomeAddresses) | **GET** /people/{ID}/homeAddresses | Retrieves a collection of home addresses. |
| [**getHomeEmail**](PeopleApi.md#getHomeEmail) | **GET** /people/{ID}/homeEmails/{subresourceID} | Retrieves a home email address. |
| [**getHomeEmails**](PeopleApi.md#getHomeEmails) | **GET** /people/{ID}/homeEmails | Retrieves a collection of home email addresses. |
| [**getHomeInstantMessengerUsername**](PeopleApi.md#getHomeInstantMessengerUsername) | **GET** /people/{ID}/homeInstantMessengers/{subresourceID} | Retrieves a home instant messenger account username. |
| [**getHomeInstantMessengers**](PeopleApi.md#getHomeInstantMessengers) | **GET** /people/{ID}/homeInstantMessengers | Retrieves a collection of home instant messenger account usernames. |
| [**getHomePhone**](PeopleApi.md#getHomePhone) | **GET** /people/{ID}/homePhones/{subresourceID} | Retrieves a home phone number. |
| [**getHomePhones**](PeopleApi.md#getHomePhones) | **GET** /people/{ID}/homePhones | Retrieves a collection of home phone numbers. |
| [**getHomeWebAddress**](PeopleApi.md#getHomeWebAddress) | **GET** /people/{ID}/homeWebAddresses/{subresourceID} | Retrieves a home web address. |
| [**getHomeWebAddresses**](PeopleApi.md#getHomeWebAddresses) | **GET** /people/{ID}/homeWebAddresses | Retrieves a collection of home web addresses. |
| [**getLegalName**](PeopleApi.md#getLegalName) | **GET** /people/{ID}/legalName/{subresourceID} | Retrieves the legal name instance. |
| [**getLegalName_0**](PeopleApi.md#getLegalName_0) | **GET** /people/{ID}/legalName | Retrieves the legal name instance. |
| [**getNamePronunciation**](PeopleApi.md#getNamePronunciation) | **GET** /people/{ID}/audioNamePronunciation/{subresourceID} | Retrieves an Audio Name Pronunciation |
| [**getNamePronunciations**](PeopleApi.md#getNamePronunciations) | **GET** /people/{ID}/audioNamePronunciation | Retrieves a collection of Audio Name Pronunciations |
| [**getPersonById**](PeopleApi.md#getPersonById) | **GET** /people | Retrieves a person in your Workday tenant. |
| [**getPersonalInfo**](PeopleApi.md#getPersonalInfo) | **GET** /people/{ID}/personalInformation | Retrieves a collection of personal information. |
| [**getPersonalInfo_0**](PeopleApi.md#getPersonalInfo_0) | **GET** /people/{ID}/personalInformation/{subresourceID} | Retrieves a person&#39;s personal information. |
| [**getPersonalPhoto**](PeopleApi.md#getPersonalPhoto) | **GET** /people/{ID}/photos/{subresourceID} | Retrieves a personal photo. |
| [**getPersonalPhotos**](PeopleApi.md#getPersonalPhotos) | **GET** /people/{ID}/photos | Retrieves a collection of personal photos. |
| [**getPreferredName**](PeopleApi.md#getPreferredName) | **GET** /people/{ID}/preferredName | Retrieves the preferred name instance. |
| [**getPreferredName_0**](PeopleApi.md#getPreferredName_0) | **GET** /people/{ID}/preferredName/{subresourceID} | Retrieves the preferred name instance. |
| [**getPublicContactInformation**](PeopleApi.md#getPublicContactInformation) | **GET** /people/{ID}/publicContactInformation/{subresourceID} | Retrieves a person&#39;s public contact information. |
| [**getPublicContactInformation_0**](PeopleApi.md#getPublicContactInformation_0) | **GET** /people/{ID}/publicContactInformation | Retrieves a collection of public contact information. |
| [**getWorkAddress**](PeopleApi.md#getWorkAddress) | **GET** /people/{ID}/workAddresses/{subresourceID} | Retrieves a work address. |
| [**getWorkAddresses**](PeopleApi.md#getWorkAddresses) | **GET** /people/{ID}/workAddresses | Retrieves a collection of work addresses. |
| [**getWorkEmail**](PeopleApi.md#getWorkEmail) | **GET** /people/{ID}/workEmails/{subresourceID} | Retrieves a work email address. |
| [**getWorkEmails**](PeopleApi.md#getWorkEmails) | **GET** /people/{ID}/workEmails | Retrieves a collection of work email addresses. |
| [**getWorkInstantMessengerUsername**](PeopleApi.md#getWorkInstantMessengerUsername) | **GET** /people/{ID}/workInstantMessengers/{subresourceID} | Retrieves a work instant messenger account username. |
| [**getWorkInstantMessengerUsernames**](PeopleApi.md#getWorkInstantMessengerUsernames) | **GET** /people/{ID}/workInstantMessengers | Retrieves a collection of work instant messenger accounts usernames. |
| [**getWorkPhone**](PeopleApi.md#getWorkPhone) | **GET** /people/{ID}/workPhones/{subresourceID} | Retrieves a work phone number. |
| [**getWorkPhones**](PeopleApi.md#getWorkPhones) | **GET** /people/{ID}/workPhones | Retrieves a collection of work phone numbers. |
| [**getWorkWebAddress**](PeopleApi.md#getWorkWebAddress) | **GET** /people/{ID}/workWebAddresses/{subresourceID} | Retrieves a work web address. |
| [**getWorkWebAddresses**](PeopleApi.md#getWorkWebAddresses) | **GET** /people/{ID}/workWebAddresses | Retrieves a collection of work web addresses. |


<a name="getAdditionalName"></a>
# **getAdditionalName**
> Name33e26848dc0010002f1ae76d63ec0061 getAdditionalName(ID, subresourceID).execute();

Retrieves an additional name.

Retrieves an additional name for the person with the specified ID.  Secured by: Person Data:  Name, Self-Service: Name  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      Name33e26848dc0010002f1ae76d63ec0061 result = client
              .people
              .getAdditionalName(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getSecondaryLocal());
      System.out.println(result.getSecondaryLast());
      System.out.println(result.getSalutation());
      System.out.println(result.getPrimary());
      System.out.println(result.getPrimaryLocal2());
      System.out.println(result.getTertiaryLast());
      System.out.println(result.getFull());
      System.out.println(result.getSocial());
      System.out.println(result.getFirstLocal());
      System.out.println(result.getFirst());
      System.out.println(result.getHereditary());
      System.out.println(result.getMiddleLocal());
      System.out.println(result.getFirstLocal2());
      System.out.println(result.getPrimaryLocal());
      System.out.println(result.getCountry());
      System.out.println(result.getMiddle());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getAdditionalName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Name33e26848dc0010002f1ae76d63ec0061> response = client
              .people
              .getAdditionalName(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getAdditionalName");
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

[**Name33e26848dc0010002f1ae76d63ec0061**](Name33e26848dc0010002f1ae76d63ec0061.md)

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

<a name="getAdditionalNames"></a>
# **getAdditionalNames**
> PeopleGetAdditionalNamesResponse getAdditionalNames(ID).limit(limit).offset(offset).execute();

Retrieves a collection of additional names.

Retrieves all additional names for the person with the specified ID.  Secured by: Person Data:  Name, Self-Service: Name  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    try {
      PeopleGetAdditionalNamesResponse result = client
              .people
              .getAdditionalNames(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getAdditionalNames");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetAdditionalNamesResponse> response = client
              .people
              .getAdditionalNames(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getAdditionalNames");
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

### Return type

[**PeopleGetAdditionalNamesResponse**](PeopleGetAdditionalNamesResponse.md)

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

<a name="getById"></a>
# **getById**
> PersonRepresentationE451ce2c8b48100007c312f3f72700b3 getById(ID).execute();

Retrieves a person in your Workday tenant.

Retrieves a person with the specified ID. You can use the returned ID from GET /people or GET /workers as the ID of the person whose information you want to retrieve.  Secured by: REST API Public  Contains attachment(s)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      PersonRepresentationE451ce2c8b48100007c312f3f72700b3 result = client
              .people
              .getById(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getPhotos());
      System.out.println(result.getHomeEmails());
      System.out.println(result.getPersonalInformation());
      System.out.println(result.getHomeWebAddresses());
      System.out.println(result.getUniversalID());
      System.out.println(result.getWorkInstantMessengers());
      System.out.println(result.getHomePhones());
      System.out.println(result.getPreferredName());
      System.out.println(result.getWorkEmails());
      System.out.println(result.getWorkAddresses());
      System.out.println(result.getWorkWebAddresses());
      System.out.println(result.getHomeAddresses());
      System.out.println(result.getLegalName());
      System.out.println(result.getAudioNamePronunciation());
      System.out.println(result.getSocialNetworks());
      System.out.println(result.getWorkPhones());
      System.out.println(result.getAdditionalNames());
      System.out.println(result.getHomeInstantMessengers());
      System.out.println(result.getHref());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonRepresentationE451ce2c8b48100007c312f3f72700b3> response = client
              .people
              .getById(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getById");
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

[**PersonRepresentationE451ce2c8b48100007c312f3f72700b3**](PersonRepresentationE451ce2c8b48100007c312f3f72700b3.md)

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

<a name="getHomeAddress"></a>
# **getHomeAddress**
> AddressReference9c3ab7b846e4100009e5ec55fa530024 getHomeAddress(ID, subresourceID).execute();

Retrieves a home address.

Retrieves a home address for the person with the specified ID.  Secured by: Person Data: Home Address, Self-Service: Home Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      AddressReference9c3ab7b846e4100009e5ec55fa530024 result = client
              .people
              .getHomeAddress(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getAddressLine4Local());
      System.out.println(result.getCitySubdivision2Local());
      System.out.println(result.getAddressLine8Local());
      System.out.println(result.getCitySubdivision1Local());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getAddressLine9());
      System.out.println(result.getRegionSubdivision1Local());
      System.out.println(result.getAddressLine8());
      System.out.println(result.getFullFormattedAddress());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getAddressLine6Local());
      System.out.println(result.getRegionSubdivision2());
      System.out.println(result.getCountryCity());
      System.out.println(result.getAddressLine4());
      System.out.println(result.getPostalCode());
      System.out.println(result.getFullFormattedLocalAddress());
      System.out.println(result.getAddressLine1Local());
      System.out.println(result.getCitySubdivision1());
      System.out.println(result.getAddressLine6());
      System.out.println(result.getUsage());
      System.out.println(result.getCity());
      System.out.println(result.getAddressLine3());
      System.out.println(result.getCitySubdivision2());
      System.out.println(result.getAddressLine9Local());
      System.out.println(result.getEffective());
      System.out.println(result.getAddressLine7Local());
      System.out.println(result.getAddressLine5());
      System.out.println(result.getRegionSubdivision1());
      System.out.println(result.getCityLocal());
      System.out.println(result.getAddressLine2Local());
      System.out.println(result.getCountryRegion());
      System.out.println(result.getAddressLine3Local());
      System.out.println(result.getCountry());
      System.out.println(result.getAddressLine5Local());
      System.out.println(result.getAddressLine7());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddressReference9c3ab7b846e4100009e5ec55fa530024> response = client
              .people
              .getHomeAddress(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeAddress");
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

[**AddressReference9c3ab7b846e4100009e5ec55fa530024**](AddressReference9c3ab7b846e4100009e5ec55fa530024.md)

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

<a name="getHomeAddresses"></a>
# **getHomeAddresses**
> PeopleGetHomeAddressesResponse getHomeAddresses(ID).effective(effective).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usedFor(usedFor).execute();

Retrieves a collection of home addresses.

Retrieves all home addresses for the person with the specified ID.  Secured by: Person Data: Home Address, Self-Service: Home Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    LocalDate effective = LocalDate.now(); // The effective date of the person's addresses using the yyyy-mm-dd format.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    Boolean primaryOnly = true; // If true, returns only the IDs of the person's primary addresses.
    Boolean publicOnly = true; // If true, returns only the IDs of the person's public addresses.
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      PeopleGetHomeAddressesResponse result = client
              .people
              .getHomeAddresses(ID)
              .effective(effective)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeAddresses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetHomeAddressesResponse> response = client
              .people
              .getHomeAddresses(ID)
              .effective(effective)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeAddresses");
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
| **effective** | **LocalDate**| The effective date of the person&#39;s addresses using the yyyy-mm-dd format. | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **primaryOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s primary addresses. | [optional] |
| **publicOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s public addresses. | [optional] |
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**PeopleGetHomeAddressesResponse**](PeopleGetHomeAddressesResponse.md)

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

<a name="getHomeEmail"></a>
# **getHomeEmail**
> EmailReference9c3ab7b846e41000327e788d9664012a getHomeEmail(ID, subresourceID).execute();

Retrieves a home email address.

Retrieve a home email address for the person with the specified ID.  Secured by: Person Data: Home Email, Self-Service: Home Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      EmailReference9c3ab7b846e41000327e788d9664012a result = client
              .people
              .getHomeEmail(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsage());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getEmailComment());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailReference9c3ab7b846e41000327e788d9664012a> response = client
              .people
              .getHomeEmail(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeEmail");
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

[**EmailReference9c3ab7b846e41000327e788d9664012a**](EmailReference9c3ab7b846e41000327e788d9664012a.md)

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

<a name="getHomeEmails"></a>
# **getHomeEmails**
> PeopleGetHomeEmailsResponse getHomeEmails(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usedFor(usedFor).execute();

Retrieves a collection of home email addresses.

Retrieve all home email addresses for the person with the specified ID.  Secured by: Person Data: Home Email, Self-Service: Home Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      PeopleGetHomeEmailsResponse result = client
              .people
              .getHomeEmails(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetHomeEmailsResponse> response = client
              .people
              .getHomeEmails(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeEmails");
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
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**PeopleGetHomeEmailsResponse**](PeopleGetHomeEmailsResponse.md)

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

<a name="getHomeInstantMessengerUsername"></a>
# **getHomeInstantMessengerUsername**
> InstantMessengerAccount33e26848dc00100036f723337ebb0132 getHomeInstantMessengerUsername(ID, subresourceID).execute();

Retrieves a home instant messenger account username.

Retrieves a home instant messenger account username for the person with the specified ID.  Secured by: Person Data: Home Instant Messenger, Self-Service: Home Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      InstantMessengerAccount33e26848dc00100036f723337ebb0132 result = client
              .people
              .getHomeInstantMessengerUsername(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getComment());
      System.out.println(result.getType());
      System.out.println(result.getUserName());
      System.out.println(result.getUsage());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeInstantMessengerUsername");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstantMessengerAccount33e26848dc00100036f723337ebb0132> response = client
              .people
              .getHomeInstantMessengerUsername(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeInstantMessengerUsername");
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

[**InstantMessengerAccount33e26848dc00100036f723337ebb0132**](InstantMessengerAccount33e26848dc00100036f723337ebb0132.md)

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

<a name="getHomeInstantMessengers"></a>
# **getHomeInstantMessengers**
> PeopleGetHomeInstantMessengersResponse getHomeInstantMessengers(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usedFor(usedFor).execute();

Retrieves a collection of home instant messenger account usernames.

Retrieves all home instant messenger account usernames for the person with the specified ID.  Secured by: Person Data: Home Instant Messenger, Self-Service: Home Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    Boolean publicOnly = true; // If true, returns only the IDs of the person's public instant messenger usernames.
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      PeopleGetHomeInstantMessengersResponse result = client
              .people
              .getHomeInstantMessengers(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeInstantMessengers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetHomeInstantMessengersResponse> response = client
              .people
              .getHomeInstantMessengers(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeInstantMessengers");
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
| **publicOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s public instant messenger usernames. | [optional] |
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**PeopleGetHomeInstantMessengersResponse**](PeopleGetHomeInstantMessengersResponse.md)

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

<a name="getHomePhone"></a>
# **getHomePhone**
> PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd getHomePhone(ID, subresourceID).execute();

Retrieves a home phone number.

Retrieves a home phone number for the person with the specified ID.  Secured by: Person Data: Home Phone, Self-Service: Home Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd result = client
              .people
              .getHomePhone(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsage());
      System.out.println(result.getCountryPhoneCode());
      System.out.println(result.getCompletePhoneNumber());
      System.out.println(result.getExtension());
      System.out.println(result.getDeviceType());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomePhone");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd> response = client
              .people
              .getHomePhone(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomePhone");
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

[**PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd**](PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd.md)

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

<a name="getHomePhones"></a>
# **getHomePhones**
> PeopleGetHomePhonesResponse getHomePhones(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usedFor(usedFor).execute();

Retrieves a collection of home phone numbers.

Retrieves all home phone numbers for the person with the specified ID.  Secured by: Person Data: Home Phone, Self-Service: Home Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      PeopleGetHomePhonesResponse result = client
              .people
              .getHomePhones(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomePhones");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetHomePhonesResponse> response = client
              .people
              .getHomePhones(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomePhones");
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
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**PeopleGetHomePhonesResponse**](PeopleGetHomePhonesResponse.md)

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

<a name="getHomeWebAddress"></a>
# **getHomeWebAddress**
> WebAddress33e26848dc0010003893a0202ced0165 getHomeWebAddress(ID, subresourceID).execute();

Retrieves a home web address.

Retrieves a home web address for the person with the specified ID.  Secured by: Person Data: Home Web Address, Self-Service: Home Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      WebAddress33e26848dc0010003893a0202ced0165 result = client
              .people
              .getHomeWebAddress(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getComment());
      System.out.println(result.getUrl());
      System.out.println(result.getUsage());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeWebAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebAddress33e26848dc0010003893a0202ced0165> response = client
              .people
              .getHomeWebAddress(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeWebAddress");
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

[**WebAddress33e26848dc0010003893a0202ced0165**](WebAddress33e26848dc0010003893a0202ced0165.md)

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

<a name="getHomeWebAddresses"></a>
# **getHomeWebAddresses**
> PeopleGetHomeWebAddressesResponse getHomeWebAddresses(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usedFor(usedFor).execute();

Retrieves a collection of home web addresses.

Retrieves all home web addresses for the person with the specified ID.  Secured by: Person Data: Home Web Address, Self-Service: Home Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      PeopleGetHomeWebAddressesResponse result = client
              .people
              .getHomeWebAddresses(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeWebAddresses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetHomeWebAddressesResponse> response = client
              .people
              .getHomeWebAddresses(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getHomeWebAddresses");
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
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**PeopleGetHomeWebAddressesResponse**](PeopleGetHomeWebAddressesResponse.md)

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

<a name="getLegalName"></a>
# **getLegalName**
> Name33e26848dc0010002f1ae76d63ec0061 getLegalName(ID, subresourceID).execute();

Retrieves the legal name instance.

Retrieves the legal name for the person with the specified ID.  Secured by: Person Data: Legal Name, Self-Service: Legal Name  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      Name33e26848dc0010002f1ae76d63ec0061 result = client
              .people
              .getLegalName(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getSecondaryLocal());
      System.out.println(result.getSecondaryLast());
      System.out.println(result.getSalutation());
      System.out.println(result.getPrimary());
      System.out.println(result.getPrimaryLocal2());
      System.out.println(result.getTertiaryLast());
      System.out.println(result.getFull());
      System.out.println(result.getSocial());
      System.out.println(result.getFirstLocal());
      System.out.println(result.getFirst());
      System.out.println(result.getHereditary());
      System.out.println(result.getMiddleLocal());
      System.out.println(result.getFirstLocal2());
      System.out.println(result.getPrimaryLocal());
      System.out.println(result.getCountry());
      System.out.println(result.getMiddle());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getLegalName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Name33e26848dc0010002f1ae76d63ec0061> response = client
              .people
              .getLegalName(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getLegalName");
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

[**Name33e26848dc0010002f1ae76d63ec0061**](Name33e26848dc0010002f1ae76d63ec0061.md)

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

<a name="getLegalName_0"></a>
# **getLegalName_0**
> PeopleGetLegalNameResponse getLegalName_0(ID).limit(limit).offset(offset).execute();

Retrieves the legal name instance.

Retrieves the legal name for the person with the specified ID.  Secured by: Person Data: Legal Name, Self-Service: Legal Name  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    try {
      PeopleGetLegalNameResponse result = client
              .people
              .getLegalName_0(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getLegalName_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetLegalNameResponse> response = client
              .people
              .getLegalName_0(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getLegalName_0");
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

### Return type

[**PeopleGetLegalNameResponse**](PeopleGetLegalNameResponse.md)

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

<a name="getNamePronunciation"></a>
# **getNamePronunciation**
> MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 getNamePronunciation(ID, subresourceID).execute();

Retrieves an Audio Name Pronunciation

Retrieves a Audio Name Pronunciation of a Person  Secured by: Person Data: Name Pronunciation  Scope: Personal Data

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 result = client
              .people
              .getNamePronunciation(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getFilename());
      System.out.println(result.getPersonId());
      System.out.println(result.getMediaId());
      System.out.println(result.getDownloadAudio());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getNamePronunciation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MediaDownload5d5f0fb1184b10000b16f0e5c20f0000> response = client
              .people
              .getNamePronunciation(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getNamePronunciation");
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

[**MediaDownload5d5f0fb1184b10000b16f0e5c20f0000**](MediaDownload5d5f0fb1184b10000b16f0e5c20f0000.md)

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

<a name="getNamePronunciations"></a>
# **getNamePronunciations**
> PeopleGetNamePronunciationsResponse getNamePronunciations(ID).currentAudio(currentAudio).limit(limit).offset(offset).execute();

Retrieves a collection of Audio Name Pronunciations

Retrieves all Audio Name Pronunciations of a Person  Secured by: Person Data: Name Pronunciation  Scope: Personal Data

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Boolean currentAudio = true; // Download only the currently active audio
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      PeopleGetNamePronunciationsResponse result = client
              .people
              .getNamePronunciations(ID)
              .currentAudio(currentAudio)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getNamePronunciations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetNamePronunciationsResponse> response = client
              .people
              .getNamePronunciations(ID)
              .currentAudio(currentAudio)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getNamePronunciations");
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
| **currentAudio** | **Boolean**| Download only the currently active audio | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**PeopleGetNamePronunciationsResponse**](PeopleGetNamePronunciationsResponse.md)

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

<a name="getPersonById"></a>
# **getPersonById**
> PeopleGetPersonByIdResponse getPersonById().limit(limit).offset(offset).universalID(universalID).execute();

Retrieves a person in your Workday tenant.

Retrieves a person of the specified ID. You can use the returned ID from GET /people or GET /workers as the ID of the person whose information you want to retrieve. When the person has any person information, for example:home addresses, a hyperlink to the resource of the information will be included in the response.  Secured by: REST API Public  Contains attachment(s)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String universalID = "universalID_example"; // The Universal ID of the person you want to retrieve.
    try {
      PeopleGetPersonByIdResponse result = client
              .people
              .getPersonById()
              .limit(limit)
              .offset(offset)
              .universalID(universalID)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetPersonByIdResponse> response = client
              .people
              .getPersonById()
              .limit(limit)
              .offset(offset)
              .universalID(universalID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonById");
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
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **universalID** | **String**| The Universal ID of the person you want to retrieve. | [optional] |

### Return type

[**PeopleGetPersonByIdResponse**](PeopleGetPersonByIdResponse.md)

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

<a name="getPersonalInfo"></a>
# **getPersonalInfo**
> PeopleGetPersonalInfoResponse getPersonalInfo(ID).country(country).limit(limit).offset(offset).execute();

Retrieves a collection of personal information.

Retrieves all personal information for the person with the specified ID.  Secured by: Person Data: Personal Information, Self-Service: Personal Information  Scope: Personal Data

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String country = "country_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      PeopleGetPersonalInfoResponse result = client
              .people
              .getPersonalInfo(ID)
              .country(country)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonalInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetPersonalInfoResponse> response = client
              .people
              .getPersonalInfo(ID)
              .country(country)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonalInfo");
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
| **country** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**PeopleGetPersonalInfoResponse**](PeopleGetPersonalInfoResponse.md)

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

<a name="getPersonalInfo_0"></a>
# **getPersonalInfo_0**
> PersonalInformation414c4cee7d91100023fe329d6f900018 getPersonalInfo_0(ID, subresourceID).execute();

Retrieves a person&#39;s personal information.

Retrieves personal information for the person with the specified ID.  Secured by: Person Data: Personal Information, Self-Service: Personal Information  Scope: Personal Data

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      PersonalInformation414c4cee7d91100023fe329d6f900018 result = client
              .people
              .getPersonalInfo_0(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getMilitaryServices());
      System.out.println(result.getAdditionalNationalities());
      System.out.println(result.getMaritalStatus());
      System.out.println(result.getMedicalExam());
      System.out.println(result.getRelativeNames());
      System.out.println(result.getUniformServiceReserveStatus());
      System.out.println(result.getActiveMilitaryUniformedService());
      System.out.println(result.getDisabledVeteranLeaveDate());
      System.out.println(result.getHispanicOrLatino());
      System.out.println(result.getPoliticalAffiliation());
      System.out.println(result.getDateOfDeath());
      System.out.println(result.getDisabilityStatuses());
      System.out.println(result.getReligion());
      System.out.println(result.getAboriginalIndigenousIdentification());
      System.out.println(result.getAboriginalIndigenousIdentificationDetails());
      System.out.println(result.getSocialBenefitsLocality());
      System.out.println(result.getPrimaryNationality());
      System.out.println(result.getVeteransPreferenceForRIF());
      System.out.println(result.getGender());
      System.out.println(result.getSelectiveServiceRegistration());
      System.out.println(result.getDateOfBirth());
      System.out.println(result.getVeteransPreference());
      System.out.println(result.getPlaceOfBirth());
      System.out.println(result.getEthnicities());
      System.out.println(result.getSexualOrientationAndGenderIdentity());
      System.out.println(result.getEthnicitiesForVisualSurvey());
      System.out.println(result.getCitizenshipStatuses());
      System.out.println(result.getBloodType());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonalInfo_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonalInformation414c4cee7d91100023fe329d6f900018> response = client
              .people
              .getPersonalInfo_0(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonalInfo_0");
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

[**PersonalInformation414c4cee7d91100023fe329d6f900018**](PersonalInformation414c4cee7d91100023fe329d6f900018.md)

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

<a name="getPersonalPhoto"></a>
# **getPersonalPhoto**
> PersonPhoto6b9baf67ce60100007d43c79e7a30011 getPersonalPhoto(ID, subresourceID).execute();

Retrieves a personal photo.

Retrieves a personal photo for the person with the specified ID.  Secured by: Person Data: Personal Photo, Self-Service: Personal Photo  Scope: Personal Data  Contains attachment(s)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      PersonPhoto6b9baf67ce60100007d43c79e7a30011 result = client
              .people
              .getPersonalPhoto(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getWidth());
      System.out.println(result.getContentType());
      System.out.println(result.getFileLength());
      System.out.println(result.getHeight());
      System.out.println(result.getFileName());
      System.out.println(result.getHref());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonalPhoto");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonPhoto6b9baf67ce60100007d43c79e7a30011> response = client
              .people
              .getPersonalPhoto(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonalPhoto");
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

[**PersonPhoto6b9baf67ce60100007d43c79e7a30011**](PersonPhoto6b9baf67ce60100007d43c79e7a30011.md)

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

<a name="getPersonalPhotos"></a>
# **getPersonalPhotos**
> PeopleGetPersonalPhotosResponse getPersonalPhotos(ID).limit(limit).offset(offset).execute();

Retrieves a collection of personal photos.

Retrieves all personal photos for the person with the specified ID.  Secured by: Person Data: Personal Photo, Self-Service: Personal Photo  Scope: Personal Data  Contains attachment(s)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    try {
      PeopleGetPersonalPhotosResponse result = client
              .people
              .getPersonalPhotos(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonalPhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetPersonalPhotosResponse> response = client
              .people
              .getPersonalPhotos(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonalPhotos");
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

### Return type

[**PeopleGetPersonalPhotosResponse**](PeopleGetPersonalPhotosResponse.md)

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

<a name="getPreferredName"></a>
# **getPreferredName**
> PeopleGetPreferredNameResponse getPreferredName(ID).limit(limit).offset(offset).execute();

Retrieves the preferred name instance.

Retrieves the preferred name for the person with the specified ID.  Secured by: Person Data: Preferred Name, Self-Service: Preferred Name  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    try {
      PeopleGetPreferredNameResponse result = client
              .people
              .getPreferredName(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPreferredName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetPreferredNameResponse> response = client
              .people
              .getPreferredName(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPreferredName");
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

### Return type

[**PeopleGetPreferredNameResponse**](PeopleGetPreferredNameResponse.md)

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

<a name="getPreferredName_0"></a>
# **getPreferredName_0**
> Name33e26848dc0010002f1ae76d63ec0061 getPreferredName_0(ID, subresourceID).execute();

Retrieves the preferred name instance.

Retrieves the preferred name for the person with the specified ID.  Secured by: Person Data: Preferred Name, Self-Service: Preferred Name  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      Name33e26848dc0010002f1ae76d63ec0061 result = client
              .people
              .getPreferredName_0(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getSecondaryLocal());
      System.out.println(result.getSecondaryLast());
      System.out.println(result.getSalutation());
      System.out.println(result.getPrimary());
      System.out.println(result.getPrimaryLocal2());
      System.out.println(result.getTertiaryLast());
      System.out.println(result.getFull());
      System.out.println(result.getSocial());
      System.out.println(result.getFirstLocal());
      System.out.println(result.getFirst());
      System.out.println(result.getHereditary());
      System.out.println(result.getMiddleLocal());
      System.out.println(result.getFirstLocal2());
      System.out.println(result.getPrimaryLocal());
      System.out.println(result.getCountry());
      System.out.println(result.getMiddle());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPreferredName_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Name33e26848dc0010002f1ae76d63ec0061> response = client
              .people
              .getPreferredName_0(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPreferredName_0");
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

[**Name33e26848dc0010002f1ae76d63ec0061**](Name33e26848dc0010002f1ae76d63ec0061.md)

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

<a name="getPublicContactInformation"></a>
# **getPublicContactInformation**
> PersonPublicRepresentationD8f2aecf3d63100016a77ab413a20235 getPublicContactInformation(ID, subresourceID).execute();

Retrieves a person&#39;s public contact information.

Retrieves public contact information for the person with the specified ID.  Secured by: REST API Public

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      PersonPublicRepresentationD8f2aecf3d63100016a77ab413a20235 result = client
              .people
              .getPublicContactInformation(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getInstantMessengers());
      System.out.println(result.getPhoneNumbers());
      System.out.println(result.getAddresses());
      System.out.println(result.getWebAddresses());
      System.out.println(result.getEmails());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPublicContactInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonPublicRepresentationD8f2aecf3d63100016a77ab413a20235> response = client
              .people
              .getPublicContactInformation(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPublicContactInformation");
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

[**PersonPublicRepresentationD8f2aecf3d63100016a77ab413a20235**](PersonPublicRepresentationD8f2aecf3d63100016a77ab413a20235.md)

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

<a name="getPublicContactInformation_0"></a>
# **getPublicContactInformation_0**
> PeopleGetPublicContactInformationResponse getPublicContactInformation_0(ID).limit(limit).offset(offset).execute();

Retrieves a collection of public contact information.

Retrieves all public contact information for the person with the specified ID.  Secured by: REST API Public

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    try {
      PeopleGetPublicContactInformationResponse result = client
              .people
              .getPublicContactInformation_0(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPublicContactInformation_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetPublicContactInformationResponse> response = client
              .people
              .getPublicContactInformation_0(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPublicContactInformation_0");
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

### Return type

[**PeopleGetPublicContactInformationResponse**](PeopleGetPublicContactInformationResponse.md)

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

<a name="getWorkAddress"></a>
# **getWorkAddress**
> AddressReference9c3ab7b846e4100009e5ec55fa530024 getWorkAddress(ID, subresourceID).execute();

Retrieves a work address.

Retrieves a work address for the person with the specified ID.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      AddressReference9c3ab7b846e4100009e5ec55fa530024 result = client
              .people
              .getWorkAddress(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getAddressLine4Local());
      System.out.println(result.getCitySubdivision2Local());
      System.out.println(result.getAddressLine8Local());
      System.out.println(result.getCitySubdivision1Local());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getAddressLine9());
      System.out.println(result.getRegionSubdivision1Local());
      System.out.println(result.getAddressLine8());
      System.out.println(result.getFullFormattedAddress());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getAddressLine6Local());
      System.out.println(result.getRegionSubdivision2());
      System.out.println(result.getCountryCity());
      System.out.println(result.getAddressLine4());
      System.out.println(result.getPostalCode());
      System.out.println(result.getFullFormattedLocalAddress());
      System.out.println(result.getAddressLine1Local());
      System.out.println(result.getCitySubdivision1());
      System.out.println(result.getAddressLine6());
      System.out.println(result.getUsage());
      System.out.println(result.getCity());
      System.out.println(result.getAddressLine3());
      System.out.println(result.getCitySubdivision2());
      System.out.println(result.getAddressLine9Local());
      System.out.println(result.getEffective());
      System.out.println(result.getAddressLine7Local());
      System.out.println(result.getAddressLine5());
      System.out.println(result.getRegionSubdivision1());
      System.out.println(result.getCityLocal());
      System.out.println(result.getAddressLine2Local());
      System.out.println(result.getCountryRegion());
      System.out.println(result.getAddressLine3Local());
      System.out.println(result.getCountry());
      System.out.println(result.getAddressLine5Local());
      System.out.println(result.getAddressLine7());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddressReference9c3ab7b846e4100009e5ec55fa530024> response = client
              .people
              .getWorkAddress(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkAddress");
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

[**AddressReference9c3ab7b846e4100009e5ec55fa530024**](AddressReference9c3ab7b846e4100009e5ec55fa530024.md)

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

<a name="getWorkAddresses"></a>
# **getWorkAddresses**
> PeopleGetWorkAddressesResponse getWorkAddresses(ID).effective(effective).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usedFor(usedFor).execute();

Retrieves a collection of work addresses.

Retrieves all work addresses for the person with the specified ID.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    LocalDate effective = LocalDate.now(); // The effective date of the person's addresses using the yyyy-mm-dd format.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    Boolean primaryOnly = true; // If true, returns only the IDs of the person's primary addresses.
    Boolean publicOnly = true; // If true, returns only the IDs of the person's public addresses.
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      PeopleGetWorkAddressesResponse result = client
              .people
              .getWorkAddresses(ID)
              .effective(effective)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkAddresses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetWorkAddressesResponse> response = client
              .people
              .getWorkAddresses(ID)
              .effective(effective)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkAddresses");
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
| **effective** | **LocalDate**| The effective date of the person&#39;s addresses using the yyyy-mm-dd format. | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **primaryOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s primary addresses. | [optional] |
| **publicOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s public addresses. | [optional] |
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**PeopleGetWorkAddressesResponse**](PeopleGetWorkAddressesResponse.md)

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

<a name="getWorkEmail"></a>
# **getWorkEmail**
> EmailReference9c3ab7b846e41000327e788d9664012a getWorkEmail(ID, subresourceID).execute();

Retrieves a work email address.

Retrieves a work email address for the person with the specified ID.  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      EmailReference9c3ab7b846e41000327e788d9664012a result = client
              .people
              .getWorkEmail(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsage());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getEmailComment());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailReference9c3ab7b846e41000327e788d9664012a> response = client
              .people
              .getWorkEmail(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkEmail");
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

[**EmailReference9c3ab7b846e41000327e788d9664012a**](EmailReference9c3ab7b846e41000327e788d9664012a.md)

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

<a name="getWorkEmails"></a>
# **getWorkEmails**
> PeopleGetWorkEmailsResponse getWorkEmails(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usedFor(usedFor).execute();

Retrieves a collection of work email addresses.

Retrieves all work email addresses for the person with the specified ID.  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      PeopleGetWorkEmailsResponse result = client
              .people
              .getWorkEmails(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetWorkEmailsResponse> response = client
              .people
              .getWorkEmails(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkEmails");
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
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**PeopleGetWorkEmailsResponse**](PeopleGetWorkEmailsResponse.md)

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

<a name="getWorkInstantMessengerUsername"></a>
# **getWorkInstantMessengerUsername**
> InstantMessengerAccount33e26848dc00100036f723337ebb0132 getWorkInstantMessengerUsername(ID, subresourceID).execute();

Retrieves a work instant messenger account username.

Retrieves a work instant messenger account username for the person with the specified ID.  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      InstantMessengerAccount33e26848dc00100036f723337ebb0132 result = client
              .people
              .getWorkInstantMessengerUsername(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getComment());
      System.out.println(result.getType());
      System.out.println(result.getUserName());
      System.out.println(result.getUsage());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkInstantMessengerUsername");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstantMessengerAccount33e26848dc00100036f723337ebb0132> response = client
              .people
              .getWorkInstantMessengerUsername(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkInstantMessengerUsername");
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

[**InstantMessengerAccount33e26848dc00100036f723337ebb0132**](InstantMessengerAccount33e26848dc00100036f723337ebb0132.md)

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

<a name="getWorkInstantMessengerUsernames"></a>
# **getWorkInstantMessengerUsernames**
> PeopleGetWorkInstantMessengerUsernamesResponse getWorkInstantMessengerUsernames(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usedFor(usedFor).execute();

Retrieves a collection of work instant messenger accounts usernames.

Retrieves all work instant messenger account usernames for the person with the specified ID.  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    Boolean publicOnly = true; // If true, returns only the IDs of the person's public instant messenger usernames.
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      PeopleGetWorkInstantMessengerUsernamesResponse result = client
              .people
              .getWorkInstantMessengerUsernames(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkInstantMessengerUsernames");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetWorkInstantMessengerUsernamesResponse> response = client
              .people
              .getWorkInstantMessengerUsernames(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkInstantMessengerUsernames");
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
| **publicOnly** | **Boolean**| If true, returns only the IDs of the person&#39;s public instant messenger usernames. | [optional] |
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**PeopleGetWorkInstantMessengerUsernamesResponse**](PeopleGetWorkInstantMessengerUsernamesResponse.md)

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

<a name="getWorkPhone"></a>
# **getWorkPhone**
> PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd getWorkPhone(ID, subresourceID).execute();

Retrieves a work phone number.

Retrieves a work phone number for the person with the specified ID.  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd result = client
              .people
              .getWorkPhone(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsage());
      System.out.println(result.getCountryPhoneCode());
      System.out.println(result.getCompletePhoneNumber());
      System.out.println(result.getExtension());
      System.out.println(result.getDeviceType());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkPhone");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd> response = client
              .people
              .getWorkPhone(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkPhone");
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

[**PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd**](PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd.md)

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

<a name="getWorkPhones"></a>
# **getWorkPhones**
> PeopleGetWorkPhonesResponse getWorkPhones(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usedFor(usedFor).execute();

Retrieves a collection of work phone numbers.

Retrieves all work phone numbers for the person with the specified ID.  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      PeopleGetWorkPhonesResponse result = client
              .people
              .getWorkPhones(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkPhones");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetWorkPhonesResponse> response = client
              .people
              .getWorkPhones(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkPhones");
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
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**PeopleGetWorkPhonesResponse**](PeopleGetWorkPhonesResponse.md)

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

<a name="getWorkWebAddress"></a>
# **getWorkWebAddress**
> WebAddress33e26848dc0010003893a0202ced0165 getWorkWebAddress(ID, subresourceID).execute();

Retrieves a work web address.

Retrieves a work web address for the person with the specified ID.  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      WebAddress33e26848dc0010003893a0202ced0165 result = client
              .people
              .getWorkWebAddress(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getComment());
      System.out.println(result.getUrl());
      System.out.println(result.getUsage());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkWebAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebAddress33e26848dc0010003893a0202ced0165> response = client
              .people
              .getWorkWebAddress(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkWebAddress");
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

[**WebAddress33e26848dc0010003893a0202ced0165**](WebAddress33e26848dc0010003893a0202ced0165.md)

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

<a name="getWorkWebAddresses"></a>
# **getWorkWebAddresses**
> PeopleGetWorkWebAddressesResponse getWorkWebAddresses(ID).limit(limit).offset(offset).primaryOnly(primaryOnly).publicOnly(publicOnly).usedFor(usedFor).execute();

Retrieves a collection of work web addresses.

Retrieves all work web addresses for the person with the specified ID.  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String usedFor = "usedFor_example"; // Specifies usage behavior, such as mailing, billing, or shipping. Optional.
    try {
      PeopleGetWorkWebAddressesResponse result = client
              .people
              .getWorkWebAddresses(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkWebAddresses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleGetWorkWebAddressesResponse> response = client
              .people
              .getWorkWebAddresses(ID)
              .limit(limit)
              .offset(offset)
              .primaryOnly(primaryOnly)
              .publicOnly(publicOnly)
              .usedFor(usedFor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkWebAddresses");
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
| **usedFor** | **String**| Specifies usage behavior, such as mailing, billing, or shipping. Optional. | [optional] |

### Return type

[**PeopleGetWorkWebAddressesResponse**](PeopleGetWorkWebAddressesResponse.md)

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

