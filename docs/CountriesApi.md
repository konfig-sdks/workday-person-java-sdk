# CountriesApi

All URIs are relative to *https://&lt;tenantHostname&gt;/person/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAddressComponents**](CountriesApi.md#getAddressComponents) | **GET** /countries/{ID}/addressComponents | Retrieves the allowed address components and their configuration for the Country and a given Address Configuration Format. The webServiceAlias of the returned address components map to the enterable fields when submitting address data in other POST/PUT/PATCH operations. |
| [**getCollectionInformation**](CountriesApi.md#getCollectionInformation) | **GET** /countries | Retrieves a collection of information about countries. |
| [**getInfo**](CountriesApi.md#getInfo) | **GET** /countries/{ID} | Retrieves information about a country. |
| [**getNameComponents**](CountriesApi.md#getNameComponents) | **GET** /countries/{ID}/nameComponents | Retrieves a collection of configuration information about name components. |


<a name="getAddressComponents"></a>
# **getAddressComponents**
> CountriesGetAddressComponentsResponse getAddressComponents(ID).addressConfigurationFormat(addressConfigurationFormat).currentAddress(currentAddress).limit(limit).offset(offset).useWesternScript(useWesternScript).execute();

Retrieves the allowed address components and their configuration for the Country and a given Address Configuration Format. The webServiceAlias of the returned address components map to the enterable fields when submitting address data in other POST/PUT/PATCH operations.

Retrieves the allowed address components and their configuration for the Country and a given Address Configuration Format.  Secured by: REST API Public

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CountriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String addressConfigurationFormat = "addressConfigurationFormat_example"; // The Address Configuration Format to return values for.  Required. Failure to provide this will result in no address components being returned. Available values are: - DEFAULT_AREAS - RECRUITING_FORMAT
    String currentAddress = "currentAddress_example"; // The existing address being updated.  Required when you use Default Format and a Country using Local Script to get component data for an existing address. Failure to provide this when appropriate may result in incorrect address component data being returned.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    Boolean useWesternScript = true; // Enables Local Script components for Countries using Local Script in Default Format. Optional. When applicable, setting this value to true will enable Local Script components and enforce Western Components as optional. Local Components that are requireable will be enforced as required.
    try {
      CountriesGetAddressComponentsResponse result = client
              .countries
              .getAddressComponents(ID)
              .addressConfigurationFormat(addressConfigurationFormat)
              .currentAddress(currentAddress)
              .limit(limit)
              .offset(offset)
              .useWesternScript(useWesternScript)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getAddressComponents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CountriesGetAddressComponentsResponse> response = client
              .countries
              .getAddressComponents(ID)
              .addressConfigurationFormat(addressConfigurationFormat)
              .currentAddress(currentAddress)
              .limit(limit)
              .offset(offset)
              .useWesternScript(useWesternScript)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getAddressComponents");
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
| **addressConfigurationFormat** | **String**| The Address Configuration Format to return values for.  Required. Failure to provide this will result in no address components being returned. Available values are: - DEFAULT_AREAS - RECRUITING_FORMAT | [optional] |
| **currentAddress** | **String**| The existing address being updated.  Required when you use Default Format and a Country using Local Script to get component data for an existing address. Failure to provide this when appropriate may result in incorrect address component data being returned. | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **useWesternScript** | **Boolean**| Enables Local Script components for Countries using Local Script in Default Format. Optional. When applicable, setting this value to true will enable Local Script components and enforce Western Components as optional. Local Components that are requireable will be enforced as required. | [optional] |

### Return type

[**CountriesGetAddressComponentsResponse**](CountriesGetAddressComponentsResponse.md)

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

<a name="getCollectionInformation"></a>
# **getCollectionInformation**
> CountriesGetCollectionInformationResponse getCollectionInformation().limit(limit).offset(offset).execute();

Retrieves a collection of information about countries.

Retrieves a collection of information about countries, including their alpha codes, and whether or not they are enabled for address lookup.  Secured by: REST API Public

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CountriesApi;
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
    try {
      CountriesGetCollectionInformationResponse result = client
              .countries
              .getCollectionInformation()
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getCollectionInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CountriesGetCollectionInformationResponse> response = client
              .countries
              .getCollectionInformation()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getCollectionInformation");
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

### Return type

[**CountriesGetCollectionInformationResponse**](CountriesGetCollectionInformationResponse.md)

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

<a name="getInfo"></a>
# **getInfo**
> PersonCountryViewDefinitionF206795ea40e1000040cc6f5da4f002a getInfo(ID).execute();

Retrieves information about a country.

Retrieves information about a country, including their alpha codes, and whether or not they are enabled for address lookup.  Secured by: REST API Public

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CountriesApi;
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
      PersonCountryViewDefinitionF206795ea40e1000040cc6f5da4f002a result = client
              .countries
              .getInfo(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getEnabledForAddressLookup());
      System.out.println(result.getAlpha2Code());
      System.out.println(result.getAlpha3Code());
      System.out.println(result.getDescriptor());
      System.out.println(result.getHref());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonCountryViewDefinitionF206795ea40e1000040cc6f5da4f002a> response = client
              .countries
              .getInfo(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getInfo");
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

[**PersonCountryViewDefinitionF206795ea40e1000040cc6f5da4f002a**](PersonCountryViewDefinitionF206795ea40e1000040cc6f5da4f002a.md)

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

<a name="getNameComponents"></a>
# **getNameComponents**
> CountriesGetNameComponentsResponse getNameComponents(ID).currentName(currentName).limit(limit).nameConfigurationFormat(nameConfigurationFormat).offset(offset).useWesternScript(useWesternScript).execute();

Retrieves a collection of configuration information about name components.

Retrieves a collection of configuration information about name components. The Maintain Name Components by Country task enables administrators to configure the allowed and required name components for a country.   You must specify the required nameConfigurationFormat query parameter.  Secured by: REST API Public

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CountriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String currentName = "currentName_example"; // The Workday ID of the person's current name being updated.  Required when you use Default Format and a Country using Local Script to get component data for an existing name. Failure to provide this when appropriate may result in incorrect name component data being returned.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    String nameConfigurationFormat = "nameConfigurationFormat_example"; // The Name Configuration Format for which to return values.  Required. Failure to provide this will result in no name components being returned. Available values are: - RECRUITING_FORMAT - The name components specific to Recruiting. - OTHER_FUNCTIONAL_AREAS - The name components for all other functional areas in Workday. Example: nameConfigurationFormat=Name_Configuration_Format_ID=OTHER_FUNCTIONAL_AREAS
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    Boolean useWesternScript = true; // If true, this method returns the set of allowed and required name components that uses Western Script.  The default is false.
    try {
      CountriesGetNameComponentsResponse result = client
              .countries
              .getNameComponents(ID)
              .currentName(currentName)
              .limit(limit)
              .nameConfigurationFormat(nameConfigurationFormat)
              .offset(offset)
              .useWesternScript(useWesternScript)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getNameComponents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CountriesGetNameComponentsResponse> response = client
              .countries
              .getNameComponents(ID)
              .currentName(currentName)
              .limit(limit)
              .nameConfigurationFormat(nameConfigurationFormat)
              .offset(offset)
              .useWesternScript(useWesternScript)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getNameComponents");
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
| **currentName** | **String**| The Workday ID of the person&#39;s current name being updated.  Required when you use Default Format and a Country using Local Script to get component data for an existing name. Failure to provide this when appropriate may result in incorrect name component data being returned. | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **nameConfigurationFormat** | **String**| The Name Configuration Format for which to return values.  Required. Failure to provide this will result in no name components being returned. Available values are: - RECRUITING_FORMAT - The name components specific to Recruiting. - OTHER_FUNCTIONAL_AREAS - The name components for all other functional areas in Workday. Example: nameConfigurationFormat&#x3D;Name_Configuration_Format_ID&#x3D;OTHER_FUNCTIONAL_AREAS | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **useWesternScript** | **Boolean**| If true, this method returns the set of allowed and required name components that uses Western Script.  The default is false. | [optional] |

### Return type

[**CountriesGetNameComponentsResponse**](CountriesGetNameComponentsResponse.md)

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

