<div align="left">

[![Visit Workday](./header.png)](https://workday.com)

# [Workday](https://workday.com)

The Person REST APIs enable you to access information about the worker person, including country-specific configuration information about name components.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Workday&serviceName=Person&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>workday-person-java-sdk</artifactId>
  <version>v4</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:workday-person-java-sdk:v4"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/workday-person-java-sdk-v4.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerson;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/person/v4";
    WorkdayPerson client = new WorkdayPerson(configuration);
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String person = "person_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getAllowedCountryData()
              .limit(limit)
              .offset(offset)
              .person(person)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getAllowedCountryData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getAllowedCountryData()
              .limit(limit)
              .offset(offset)
              .person(person)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getAllowedCountryData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://&lt;tenantHostname&gt;/person/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PromptValuesApi* | [**getAllowedCountryData**](docs/PromptValuesApi.md#getAllowedCountryData) | **GET** /values/personalInformationCountry/allowedCountry | 
*PromptValuesApi* | [**getCountryPhoneCodes**](docs/PromptValuesApi.md#getCountryPhoneCodes) | **GET** /values/commonPhone/countryPhoneCodes | 
*PromptValuesApi* | [**getHereditaryValues**](docs/PromptValuesApi.md#getHereditaryValues) | **GET** /values/nameComponents/hereditary | 
*PromptValuesApi* | [**getInstances**](docs/PromptValuesApi.md#getInstances) | **GET** /values/nameComponents/religious | 
*PromptValuesApi* | [**getInstances_0**](docs/PromptValuesApi.md#getInstances_0) | **GET** /values/nameComponents/honorary | 
*PromptValuesApi* | [**getInstances_1**](docs/PromptValuesApi.md#getInstances_1) | **GET** /values/countryComponents/countryCity | 
*PromptValuesApi* | [**getInstances_2**](docs/PromptValuesApi.md#getInstances_2) | **GET** /values/nameComponents/social | 
*PromptValuesApi* | [**getInstances_3**](docs/PromptValuesApi.md#getInstances_3) | **GET** /values/countryComponents/country | 
*PromptValuesApi* | [**getInstances_4**](docs/PromptValuesApi.md#getInstances_4) | **GET** /values/nameComponents/academic | 
*PromptValuesApi* | [**getInstances_5**](docs/PromptValuesApi.md#getInstances_5) | **GET** /values/countryComponents/countryRegion | 
*PromptValuesApi* | [**getOptions**](docs/PromptValuesApi.md#getOptions) | **GET** /values/nameComponents/royal | 
*PromptValuesApi* | [**getOptions_0**](docs/PromptValuesApi.md#getOptions_0) | **GET** /values/nameComponents/salutation | 
*PromptValuesApi* | [**getOptions_1**](docs/PromptValuesApi.md#getOptions_1) | **GET** /values/nameComponents/professional | 
*PromptValuesApi* | [**getPhoneDeviceTypes**](docs/PromptValuesApi.md#getPhoneDeviceTypes) | **GET** /values/commonPhone/phoneDeviceTypes | 
*PromptValuesApi* | [**getTitleComponents**](docs/PromptValuesApi.md#getTitleComponents) | **GET** /values/nameComponents/title | 
*PromptValuesApi* | [**listCountryData**](docs/PromptValuesApi.md#listCountryData) | **GET** /values/personalInformationCountry/populatedCountry | 
*CountriesApi* | [**getAddressComponents**](docs/CountriesApi.md#getAddressComponents) | **GET** /countries/{ID}/addressComponents | Retrieves the allowed address components and their configuration for the Country and a given Address Configuration Format. The webServiceAlias of the returned address components map to the enterable fields when submitting address data in other POST/PUT/PATCH operations.
*CountriesApi* | [**getCollectionInformation**](docs/CountriesApi.md#getCollectionInformation) | **GET** /countries | Retrieves a collection of information about countries.
*CountriesApi* | [**getInfo**](docs/CountriesApi.md#getInfo) | **GET** /countries/{ID} | Retrieves information about a country.
*CountriesApi* | [**getNameComponents**](docs/CountriesApi.md#getNameComponents) | **GET** /countries/{ID}/nameComponents | Retrieves a collection of configuration information about name components.
*HomeContactInformationChangesApi* | [**createEmailAddress**](docs/HomeContactInformationChangesApi.md#createEmailAddress) | **POST** /homeContactInformationChanges/{ID}/emailAddresses | 
*HomeContactInformationChangesApi* | [**createInstantMessenger**](docs/HomeContactInformationChangesApi.md#createInstantMessenger) | **POST** /homeContactInformationChanges/{ID}/instantMessengers | 
*HomeContactInformationChangesApi* | [**createNewAddress**](docs/HomeContactInformationChangesApi.md#createNewAddress) | **POST** /homeContactInformationChanges/{ID}/addresses | 
*HomeContactInformationChangesApi* | [**createPhoneNumber**](docs/HomeContactInformationChangesApi.md#createPhoneNumber) | **POST** /homeContactInformationChanges/{ID}/phoneNumbers | 
*HomeContactInformationChangesApi* | [**createWebAddress**](docs/HomeContactInformationChangesApi.md#createWebAddress) | **POST** /homeContactInformationChanges/{ID}/webAddresses | 
*HomeContactInformationChangesApi* | [**getAddressAsStaged**](docs/HomeContactInformationChangesApi.md#getAddressAsStaged) | **GET** /homeContactInformationChanges/{ID}/addresses/{subresourceID} | An address as it exists staged for update by the parent business process.
*HomeContactInformationChangesApi* | [**getAddressesStaged**](docs/HomeContactInformationChangesApi.md#getAddressesStaged) | **GET** /homeContactInformationChanges/{ID}/addresses | Retrieve all existing addresses staged for update by the parent business process
*HomeContactInformationChangesApi* | [**getEmailAddress**](docs/HomeContactInformationChangesApi.md#getEmailAddress) | **GET** /homeContactInformationChanges/{ID}/emailAddresses/{subresourceID} | An email address as it exists staged for update by the parent business process.
*HomeContactInformationChangesApi* | [**getEventInformation**](docs/HomeContactInformationChangesApi.md#getEventInformation) | **GET** /homeContactInformationChanges/{ID} | 
*HomeContactInformationChangesApi* | [**getInstantMessenger**](docs/HomeContactInformationChangesApi.md#getInstantMessenger) | **GET** /homeContactInformationChanges/{ID}/instantMessengers/{subresourceID} | An instant messenger as it exists staged for update by the parent business process.
*HomeContactInformationChangesApi* | [**getPhoneNumbers**](docs/HomeContactInformationChangesApi.md#getPhoneNumbers) | **GET** /homeContactInformationChanges/{ID}/phoneNumbers | Retrieve all existing phone numbers staged for update by the parent business process
*HomeContactInformationChangesApi* | [**getStagedEmailAddresses**](docs/HomeContactInformationChangesApi.md#getStagedEmailAddresses) | **GET** /homeContactInformationChanges/{ID}/emailAddresses | Retrieve all existing addresses staged for update by the parent business process
*HomeContactInformationChangesApi* | [**getStagedInstantMessengers**](docs/HomeContactInformationChangesApi.md#getStagedInstantMessengers) | **GET** /homeContactInformationChanges/{ID}/instantMessengers | Retrieve all existing instant messengers staged for update by the parent business process
*HomeContactInformationChangesApi* | [**getStagedPhoneNumber**](docs/HomeContactInformationChangesApi.md#getStagedPhoneNumber) | **GET** /homeContactInformationChanges/{ID}/phoneNumbers/{subresourceID} | A phone number as it exists staged for update by the parent business process.
*HomeContactInformationChangesApi* | [**getWebAddress**](docs/HomeContactInformationChangesApi.md#getWebAddress) | **GET** /homeContactInformationChanges/{ID}/webAddresses/{subresourceID} | A web address as it exists staged for update by the parent business process.
*HomeContactInformationChangesApi* | [**getWebAddressesStaged**](docs/HomeContactInformationChangesApi.md#getWebAddressesStaged) | **GET** /homeContactInformationChanges/{ID}/webAddresses | Retrieve all existing web addresses staged for update by the parent business process
*HomeContactInformationChangesApi* | [**removeAddress**](docs/HomeContactInformationChangesApi.md#removeAddress) | **DELETE** /homeContactInformationChanges/{ID}/addresses/{subresourceID} | 
*HomeContactInformationChangesApi* | [**removeEmailAddress**](docs/HomeContactInformationChangesApi.md#removeEmailAddress) | **DELETE** /homeContactInformationChanges/{ID}/emailAddresses/{subresourceID} | 
*HomeContactInformationChangesApi* | [**removeInstantMessenger**](docs/HomeContactInformationChangesApi.md#removeInstantMessenger) | **DELETE** /homeContactInformationChanges/{ID}/instantMessengers/{subresourceID} | 
*HomeContactInformationChangesApi* | [**removePhoneNumber**](docs/HomeContactInformationChangesApi.md#removePhoneNumber) | **DELETE** /homeContactInformationChanges/{ID}/phoneNumbers/{subresourceID} | 
*HomeContactInformationChangesApi* | [**removeWebAddress**](docs/HomeContactInformationChangesApi.md#removeWebAddress) | **DELETE** /homeContactInformationChanges/{ID}/webAddresses/{subresourceID} | 
*HomeContactInformationChangesApi* | [**submitChange**](docs/HomeContactInformationChangesApi.md#submitChange) | **POST** /homeContactInformationChanges/{ID}/submit | Submit the specified contact change ID.
*HomeContactInformationChangesApi* | [**updateAddress**](docs/HomeContactInformationChangesApi.md#updateAddress) | **PUT** /homeContactInformationChanges/{ID}/addresses/{subresourceID} | 
*HomeContactInformationChangesApi* | [**updateEmailAddress**](docs/HomeContactInformationChangesApi.md#updateEmailAddress) | **PATCH** /homeContactInformationChanges/{ID}/emailAddresses/{subresourceID} | 
*HomeContactInformationChangesApi* | [**updateInstantMessenger**](docs/HomeContactInformationChangesApi.md#updateInstantMessenger) | **PATCH** /homeContactInformationChanges/{ID}/instantMessengers/{subresourceID} | 
*HomeContactInformationChangesApi* | [**updatePhoneNumber**](docs/HomeContactInformationChangesApi.md#updatePhoneNumber) | **PATCH** /homeContactInformationChanges/{ID}/phoneNumbers/{subresourceID} | 
*HomeContactInformationChangesApi* | [**updateWebAddress**](docs/HomeContactInformationChangesApi.md#updateWebAddress) | **PATCH** /homeContactInformationChanges/{ID}/webAddresses/{subresourceID} | 
*PeopleApi* | [**getAdditionalName**](docs/PeopleApi.md#getAdditionalName) | **GET** /people/{ID}/additionalNames/{subresourceID} | Retrieves an additional name.
*PeopleApi* | [**getAdditionalNames**](docs/PeopleApi.md#getAdditionalNames) | **GET** /people/{ID}/additionalNames | Retrieves a collection of additional names.
*PeopleApi* | [**getById**](docs/PeopleApi.md#getById) | **GET** /people/{ID} | Retrieves a person in your Workday tenant.
*PeopleApi* | [**getHomeAddress**](docs/PeopleApi.md#getHomeAddress) | **GET** /people/{ID}/homeAddresses/{subresourceID} | Retrieves a home address.
*PeopleApi* | [**getHomeAddresses**](docs/PeopleApi.md#getHomeAddresses) | **GET** /people/{ID}/homeAddresses | Retrieves a collection of home addresses.
*PeopleApi* | [**getHomeEmail**](docs/PeopleApi.md#getHomeEmail) | **GET** /people/{ID}/homeEmails/{subresourceID} | Retrieves a home email address.
*PeopleApi* | [**getHomeEmails**](docs/PeopleApi.md#getHomeEmails) | **GET** /people/{ID}/homeEmails | Retrieves a collection of home email addresses.
*PeopleApi* | [**getHomeInstantMessengerUsername**](docs/PeopleApi.md#getHomeInstantMessengerUsername) | **GET** /people/{ID}/homeInstantMessengers/{subresourceID} | Retrieves a home instant messenger account username.
*PeopleApi* | [**getHomeInstantMessengers**](docs/PeopleApi.md#getHomeInstantMessengers) | **GET** /people/{ID}/homeInstantMessengers | Retrieves a collection of home instant messenger account usernames.
*PeopleApi* | [**getHomePhone**](docs/PeopleApi.md#getHomePhone) | **GET** /people/{ID}/homePhones/{subresourceID} | Retrieves a home phone number.
*PeopleApi* | [**getHomePhones**](docs/PeopleApi.md#getHomePhones) | **GET** /people/{ID}/homePhones | Retrieves a collection of home phone numbers.
*PeopleApi* | [**getHomeWebAddress**](docs/PeopleApi.md#getHomeWebAddress) | **GET** /people/{ID}/homeWebAddresses/{subresourceID} | Retrieves a home web address.
*PeopleApi* | [**getHomeWebAddresses**](docs/PeopleApi.md#getHomeWebAddresses) | **GET** /people/{ID}/homeWebAddresses | Retrieves a collection of home web addresses.
*PeopleApi* | [**getLegalName**](docs/PeopleApi.md#getLegalName) | **GET** /people/{ID}/legalName/{subresourceID} | Retrieves the legal name instance.
*PeopleApi* | [**getLegalName_0**](docs/PeopleApi.md#getLegalName_0) | **GET** /people/{ID}/legalName | Retrieves the legal name instance.
*PeopleApi* | [**getNamePronunciation**](docs/PeopleApi.md#getNamePronunciation) | **GET** /people/{ID}/audioNamePronunciation/{subresourceID} | Retrieves an Audio Name Pronunciation
*PeopleApi* | [**getNamePronunciations**](docs/PeopleApi.md#getNamePronunciations) | **GET** /people/{ID}/audioNamePronunciation | Retrieves a collection of Audio Name Pronunciations
*PeopleApi* | [**getPersonById**](docs/PeopleApi.md#getPersonById) | **GET** /people | Retrieves a person in your Workday tenant.
*PeopleApi* | [**getPersonalInfo**](docs/PeopleApi.md#getPersonalInfo) | **GET** /people/{ID}/personalInformation | Retrieves a collection of personal information.
*PeopleApi* | [**getPersonalInfo_0**](docs/PeopleApi.md#getPersonalInfo_0) | **GET** /people/{ID}/personalInformation/{subresourceID} | Retrieves a person&#39;s personal information.
*PeopleApi* | [**getPersonalPhoto**](docs/PeopleApi.md#getPersonalPhoto) | **GET** /people/{ID}/photos/{subresourceID} | Retrieves a personal photo.
*PeopleApi* | [**getPersonalPhotos**](docs/PeopleApi.md#getPersonalPhotos) | **GET** /people/{ID}/photos | Retrieves a collection of personal photos.
*PeopleApi* | [**getPreferredName**](docs/PeopleApi.md#getPreferredName) | **GET** /people/{ID}/preferredName | Retrieves the preferred name instance.
*PeopleApi* | [**getPreferredName_0**](docs/PeopleApi.md#getPreferredName_0) | **GET** /people/{ID}/preferredName/{subresourceID} | Retrieves the preferred name instance.
*PeopleApi* | [**getPublicContactInformation**](docs/PeopleApi.md#getPublicContactInformation) | **GET** /people/{ID}/publicContactInformation/{subresourceID} | Retrieves a person&#39;s public contact information.
*PeopleApi* | [**getPublicContactInformation_0**](docs/PeopleApi.md#getPublicContactInformation_0) | **GET** /people/{ID}/publicContactInformation | Retrieves a collection of public contact information.
*PeopleApi* | [**getWorkAddress**](docs/PeopleApi.md#getWorkAddress) | **GET** /people/{ID}/workAddresses/{subresourceID} | Retrieves a work address.
*PeopleApi* | [**getWorkAddresses**](docs/PeopleApi.md#getWorkAddresses) | **GET** /people/{ID}/workAddresses | Retrieves a collection of work addresses.
*PeopleApi* | [**getWorkEmail**](docs/PeopleApi.md#getWorkEmail) | **GET** /people/{ID}/workEmails/{subresourceID} | Retrieves a work email address.
*PeopleApi* | [**getWorkEmails**](docs/PeopleApi.md#getWorkEmails) | **GET** /people/{ID}/workEmails | Retrieves a collection of work email addresses.
*PeopleApi* | [**getWorkInstantMessengerUsername**](docs/PeopleApi.md#getWorkInstantMessengerUsername) | **GET** /people/{ID}/workInstantMessengers/{subresourceID} | Retrieves a work instant messenger account username.
*PeopleApi* | [**getWorkInstantMessengerUsernames**](docs/PeopleApi.md#getWorkInstantMessengerUsernames) | **GET** /people/{ID}/workInstantMessengers | Retrieves a collection of work instant messenger accounts usernames.
*PeopleApi* | [**getWorkPhone**](docs/PeopleApi.md#getWorkPhone) | **GET** /people/{ID}/workPhones/{subresourceID} | Retrieves a work phone number.
*PeopleApi* | [**getWorkPhones**](docs/PeopleApi.md#getWorkPhones) | **GET** /people/{ID}/workPhones | Retrieves a collection of work phone numbers.
*PeopleApi* | [**getWorkWebAddress**](docs/PeopleApi.md#getWorkWebAddress) | **GET** /people/{ID}/workWebAddresses/{subresourceID} | Retrieves a work web address.
*PeopleApi* | [**getWorkWebAddresses**](docs/PeopleApi.md#getWorkWebAddresses) | **GET** /people/{ID}/workWebAddresses | Retrieves a collection of work web addresses.
*PhoneValidationApi* | [**validatePhoneNumber**](docs/PhoneValidationApi.md#validatePhoneNumber) | **POST** /phoneValidation | Validates phone number data to ensure it is valid for Workday.
*WorkContactInformationChangesApi* | [**createAddress**](docs/WorkContactInformationChangesApi.md#createAddress) | **POST** /workContactInformationChanges/{ID}/addresses | 
*WorkContactInformationChangesApi* | [**createEmailAddress**](docs/WorkContactInformationChangesApi.md#createEmailAddress) | **POST** /workContactInformationChanges/{ID}/emailAddresses | 
*WorkContactInformationChangesApi* | [**createInstantMessenger**](docs/WorkContactInformationChangesApi.md#createInstantMessenger) | **POST** /workContactInformationChanges/{ID}/instantMessengers | 
*WorkContactInformationChangesApi* | [**createPhoneNumber**](docs/WorkContactInformationChangesApi.md#createPhoneNumber) | **POST** /workContactInformationChanges/{ID}/phoneNumbers | 
*WorkContactInformationChangesApi* | [**createStagedWebAddress**](docs/WorkContactInformationChangesApi.md#createStagedWebAddress) | **POST** /workContactInformationChanges/{ID}/webAddresses | 
*WorkContactInformationChangesApi* | [**getAddressAsStaged**](docs/WorkContactInformationChangesApi.md#getAddressAsStaged) | **GET** /workContactInformationChanges/{ID}/addresses/{subresourceID} | An address as it exists staged for update by the parent business process.
*WorkContactInformationChangesApi* | [**getAddressesStaged**](docs/WorkContactInformationChangesApi.md#getAddressesStaged) | **GET** /workContactInformationChanges/{ID}/addresses | Retrieve all existing addresses staged for update by the parent business process
*WorkContactInformationChangesApi* | [**getEmailAddress**](docs/WorkContactInformationChangesApi.md#getEmailAddress) | **GET** /workContactInformationChanges/{ID}/emailAddresses/{subresourceID} | An email address as it exists staged for update by the parent business process.
*WorkContactInformationChangesApi* | [**getEventInfo**](docs/WorkContactInformationChangesApi.md#getEventInfo) | **GET** /workContactInformationChanges/{ID} | 
*WorkContactInformationChangesApi* | [**getPhoneNumber**](docs/WorkContactInformationChangesApi.md#getPhoneNumber) | **GET** /workContactInformationChanges/{ID}/phoneNumbers/{subresourceID} | A phone number as it exists staged for update by the parent business process.
*WorkContactInformationChangesApi* | [**getPhoneNumbers**](docs/WorkContactInformationChangesApi.md#getPhoneNumbers) | **GET** /workContactInformationChanges/{ID}/phoneNumbers | Retrieve all existing phone numbers staged for update by the parent business process
*WorkContactInformationChangesApi* | [**getStagedEmailAddresses**](docs/WorkContactInformationChangesApi.md#getStagedEmailAddresses) | **GET** /workContactInformationChanges/{ID}/emailAddresses | Retrieve all existing addresses staged for update by the parent business process
*WorkContactInformationChangesApi* | [**getStagedInstantMessenger**](docs/WorkContactInformationChangesApi.md#getStagedInstantMessenger) | **GET** /workContactInformationChanges/{ID}/instantMessengers/{subresourceID} | An instant messenger as it exists staged for update by the parent business process.
*WorkContactInformationChangesApi* | [**getStagedInstantMessengers**](docs/WorkContactInformationChangesApi.md#getStagedInstantMessengers) | **GET** /workContactInformationChanges/{ID}/instantMessengers | Retrieve all existing instant messengers staged for update by the parent business process
*WorkContactInformationChangesApi* | [**getWebAddress**](docs/WorkContactInformationChangesApi.md#getWebAddress) | **GET** /workContactInformationChanges/{ID}/webAddresses/{subresourceID} | A web address as it exists staged for update by the parent business process.
*WorkContactInformationChangesApi* | [**getWebAddressesStaged**](docs/WorkContactInformationChangesApi.md#getWebAddressesStaged) | **GET** /workContactInformationChanges/{ID}/webAddresses | Retrieve all existing web addresses staged for update by the parent business process
*WorkContactInformationChangesApi* | [**removeAddress**](docs/WorkContactInformationChangesApi.md#removeAddress) | **DELETE** /workContactInformationChanges/{ID}/addresses/{subresourceID} | 
*WorkContactInformationChangesApi* | [**removeEmailAddress**](docs/WorkContactInformationChangesApi.md#removeEmailAddress) | **DELETE** /workContactInformationChanges/{ID}/emailAddresses/{subresourceID} | 
*WorkContactInformationChangesApi* | [**removeInstantMessenger**](docs/WorkContactInformationChangesApi.md#removeInstantMessenger) | **DELETE** /workContactInformationChanges/{ID}/instantMessengers/{subresourceID} | 
*WorkContactInformationChangesApi* | [**removePhoneNumber**](docs/WorkContactInformationChangesApi.md#removePhoneNumber) | **DELETE** /workContactInformationChanges/{ID}/phoneNumbers/{subresourceID} | 
*WorkContactInformationChangesApi* | [**removeWebAddress**](docs/WorkContactInformationChangesApi.md#removeWebAddress) | **DELETE** /workContactInformationChanges/{ID}/webAddresses/{subresourceID} | 
*WorkContactInformationChangesApi* | [**submit**](docs/WorkContactInformationChangesApi.md#submit) | **POST** /workContactInformationChanges/{ID}/submit | Submit the specified contact change ID.
*WorkContactInformationChangesApi* | [**updateAddress**](docs/WorkContactInformationChangesApi.md#updateAddress) | **PUT** /workContactInformationChanges/{ID}/addresses/{subresourceID} | 
*WorkContactInformationChangesApi* | [**updateAlternateWorkLocation**](docs/WorkContactInformationChangesApi.md#updateAlternateWorkLocation) | **PATCH** /workContactInformationChanges/{ID} | 
*WorkContactInformationChangesApi* | [**updateEmailAddress**](docs/WorkContactInformationChangesApi.md#updateEmailAddress) | **PATCH** /workContactInformationChanges/{ID}/emailAddresses/{subresourceID} | 
*WorkContactInformationChangesApi* | [**updateInstantMessenger**](docs/WorkContactInformationChangesApi.md#updateInstantMessenger) | **PATCH** /workContactInformationChanges/{ID}/instantMessengers/{subresourceID} | 
*WorkContactInformationChangesApi* | [**updatePhoneNumber**](docs/WorkContactInformationChangesApi.md#updatePhoneNumber) | **PATCH** /workContactInformationChanges/{ID}/phoneNumbers/{subresourceID} | 
*WorkContactInformationChangesApi* | [**updateWebAddress**](docs/WorkContactInformationChangesApi.md#updateWebAddress) | **PATCH** /workContactInformationChanges/{ID}/webAddresses/{subresourceID} | 


## Documentation for Models

 - [AboriginalIndigenousDetails37580627f49d1000257d05e999ea0000](docs/AboriginalIndigenousDetails37580627f49d1000257d05e999ea0000.md)
 - [AboriginalIndigenousDetails37580627f49d1000257d05e999ea0000AllOf](docs/AboriginalIndigenousDetails37580627f49d1000257d05e999ea0000AllOf.md)
 - [AboriginalIndigenousIdentification37580627f49d10002587d93d0a820000](docs/AboriginalIndigenousIdentification37580627f49d10002587d93d0a820000.md)
 - [AboriginalIndigenousIdentification37580627f49d10002587d93d0a820000AllOf](docs/AboriginalIndigenousIdentification37580627f49d10002587d93d0a820000AllOf.md)
 - [AboriginalIndigenousIdentification37580627f49d1000258f815dc9c00001](docs/AboriginalIndigenousIdentification37580627f49d1000258f815dc9c00001.md)
 - [AcademicSuffixE08d883b5eae10000403d7c0735402e9](docs/AcademicSuffixE08d883b5eae10000403d7c0735402e9.md)
 - [Action38ff08ab6736100010816009079d0126](docs/Action38ff08ab6736100010816009079d0126.md)
 - [ActiveMilitaryUniformedService9503dc49ae9610001fa8f76ed67d0000](docs/ActiveMilitaryUniformedService9503dc49ae9610001fa8f76ed67d0000.md)
 - [AddressReference9c3ab7b846e4100009e5ec55fa530024](docs/AddressReference9c3ab7b846e4100009e5ec55fa530024.md)
 - [AddressReference9c3ab7b846e4100009e5ec55fa530024AllOf](docs/AddressReference9c3ab7b846e4100009e5ec55fa530024AllOf.md)
 - [AlternateWorkLocationBdfa2c83ea5e10002b70a80a153e5d68](docs/AlternateWorkLocationBdfa2c83ea5e10002b70a80a153e5d68.md)
 - [AlternateWorkLocationD72a8353f91e1000169a83b894e7046e](docs/AlternateWorkLocationD72a8353f91e1000169a83b894e7046e.md)
 - [BloodType6de928ab1284100056beb6e9884101cd](docs/BloodType6de928ab1284100056beb6e9884101cd.md)
 - [BloodType6de928ab1284100056beb6e9884101cdAllOf](docs/BloodType6de928ab1284100056beb6e9884101cdAllOf.md)
 - [BloodTypeA63806bf8576100013fa9dcbb7dc0111](docs/BloodTypeA63806bf8576100013fa9dcbb7dc0111.md)
 - [BusinessProcessParameters83f6f6b7c38d100009c69131dea04a14](docs/BusinessProcessParameters83f6f6b7c38d100009c69131dea04a14.md)
 - [BusinessProcessParameters83f6f6b7c38d100009c69131dea04a14AllOf](docs/BusinessProcessParameters83f6f6b7c38d100009c69131dea04a14AllOf.md)
 - [BusinessProcessParameters83f6f6b7c38d100009c7ad91dd414a16](docs/BusinessProcessParameters83f6f6b7c38d100009c7ad91dd414a16.md)
 - [BusinessProcessParametersBdfa2c83ea5e10002b873037350f5d6c](docs/BusinessProcessParametersBdfa2c83ea5e10002b873037350f5d6c.md)
 - [Category43b30ba735b8100011ee4781a9d50146](docs/Category43b30ba735b8100011ee4781a9d50146.md)
 - [CertificationBasis6de928ab128410005c56a638b9d4024c](docs/CertificationBasis6de928ab128410005c56a638b9d4024c.md)
 - [ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed](docs/ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed.md)
 - [ChangeContactInformationEvent765b18aa13af1000064a10bf37b800edAllOf](docs/ChangeContactInformationEvent765b18aa13af1000064a10bf37b800edAllOf.md)
 - [CitizenshipStatus80df32d43a5810000f452a84da970114](docs/CitizenshipStatus80df32d43a5810000f452a84da970114.md)
 - [CitizenshipStatus80df32d43a5810000f452a84da970114AllOf](docs/CitizenshipStatus80df32d43a5810000f452a84da970114AllOf.md)
 - [CityAb827579ee1710002095f51c0e3f0178](docs/CityAb827579ee1710002095f51c0e3f0178.md)
 - [CityAb827579ee1710002095f51c0e3f0178AllOf](docs/CityAb827579ee1710002095f51c0e3f0178AllOf.md)
 - [Comments86093b8a932f10001499f356ff83012e](docs/Comments86093b8a932f10001499f356ff83012e.md)
 - [Comments86093b8a932f10001499f356ff83012eAllOf](docs/Comments86093b8a932f10001499f356ff83012eAllOf.md)
 - [CommonBooleanRepresentationC6cfba790def100010efb5c8ebf00000](docs/CommonBooleanRepresentationC6cfba790def100010efb5c8ebf00000.md)
 - [CommonBooleanRepresentationC6cfba790def100010efb5c8ebf00000AllOf](docs/CommonBooleanRepresentationC6cfba790def100010efb5c8ebf00000AllOf.md)
 - [ComponentType98e46a86842a10000dc278233c7e0280](docs/ComponentType98e46a86842a10000dc278233c7e0280.md)
 - [ComponentTypeEae9f0331ab51000162aafecb6bf00eb](docs/ComponentTypeEae9f0331ab51000162aafecb6bf00eb.md)
 - [ContactUsage1089da0ab90910000fa7748617db0898](docs/ContactUsage1089da0ab90910000fa7748617db0898.md)
 - [ContactUsage1089da0ab90910000fa7748617db0898AllOf](docs/ContactUsage1089da0ab90910000fa7748617db0898AllOf.md)
 - [ContactUsageAb827579ee171000211397a6dede017d](docs/ContactUsageAb827579ee171000211397a6dede017d.md)
 - [ContactUsageAb827579ee171000211397a6dede017dAllOf](docs/ContactUsageAb827579ee171000211397a6dede017dAllOf.md)
 - [ContentType43b30ba735b8100011ee47993f11014a](docs/ContentType43b30ba735b8100011ee47993f11014a.md)
 - [ContentType6b9baf67ce60100011fd138066140090](docs/ContentType6b9baf67ce60100011fd138066140090.md)
 - [CountriesGetAddressComponentsResponse](docs/CountriesGetAddressComponentsResponse.md)
 - [CountriesGetCollectionInformationResponse](docs/CountriesGetCollectionInformationResponse.md)
 - [CountriesGetNameComponentsResponse](docs/CountriesGetNameComponentsResponse.md)
 - [Country1089da0ab90910000f6d7bd30bb20881](docs/Country1089da0ab90910000f6d7bd30bb20881.md)
 - [Country1089da0ab90910000f6d7bd30bb20881AllOf](docs/Country1089da0ab90910000f6d7bd30bb20881AllOf.md)
 - [Country1089da0ab90910000f6e4df524710885](docs/Country1089da0ab90910000f6e4df524710885.md)
 - [Country33e26848dc0010002f1ae802adc30074](docs/Country33e26848dc0010002f1ae802adc30074.md)
 - [Country6de928ab12841000549fe6404b2101c3](docs/Country6de928ab12841000549fe6404b2101c3.md)
 - [Country6de928ab128410005b9a894c5c67022a](docs/Country6de928ab128410005b9a894c5c67022a.md)
 - [Country80df32d43a5810000f9d096f27060127](docs/Country80df32d43a5810000f9d096f27060127.md)
 - [Country81f66ab16f7510005c53d8fd5f5b4852](docs/Country81f66ab16f7510005c53d8fd5f5b4852.md)
 - [Country8beeb162738910001433a1ef009a01d0](docs/Country8beeb162738910001433a1ef009a01d0.md)
 - [Country8beeb162738910001433a1ef009a01d0AllOf](docs/Country8beeb162738910001433a1ef009a01d0AllOf.md)
 - [CountryA58f621b14ee1000146a3350196300e7](docs/CountryA58f621b14ee1000146a3350196300e7.md)
 - [CountryAb827579ee1710001caa7c36228c0153](docs/CountryAb827579ee1710001caa7c36228c0153.md)
 - [CountryAndNationality06544db2578d10000ec1cd4257350000](docs/CountryAndNationality06544db2578d10000ec1cd4257350000.md)
 - [CountryAndNationality06544db2578d10000ec1cd4257350000AllOf](docs/CountryAndNationality06544db2578d10000ec1cd4257350000AllOf.md)
 - [CountryC1bb9f46f65210002d2fa329fe6700b4](docs/CountryC1bb9f46f65210002d2fa329fe6700b4.md)
 - [CountryCity81f66ab16f7510005c53d89089074844](docs/CountryCity81f66ab16f7510005c53d89089074844.md)
 - [CountryCityA58f621b14ee1000146a333da1c900e6](docs/CountryCityA58f621b14ee1000146a333da1c900e6.md)
 - [CountryCityC1bb9f46f65210002d2fa2bb24a300a1](docs/CountryCityC1bb9f46f65210002d2fa2bb24a300a1.md)
 - [CountryE08d883b5eae10000403d7c8e60502eb](docs/CountryE08d883b5eae10000403d7c8e60502eb.md)
 - [CountryPhoneCode1089da0ab90910000f6e4de36f670883](docs/CountryPhoneCode1089da0ab90910000f6e4de36f670883.md)
 - [CountryPhoneCode1089da0ab90910000f6e4de36f670883AllOf](docs/CountryPhoneCode1089da0ab90910000f6e4de36f670883AllOf.md)
 - [CountryPhoneCode1089da0ab90910000f7089365467088c](docs/CountryPhoneCode1089da0ab90910000f7089365467088c.md)
 - [CountryPhoneCodeA58f621b14ee1000185bf335b38401cb](docs/CountryPhoneCodeA58f621b14ee1000185bf335b38401cb.md)
 - [CountryPhoneCodeAb827579ee1710001caa7c12047d0152](docs/CountryPhoneCodeAb827579ee1710001caa7c12047d0152.md)
 - [CountryPhoneCodeAb827579ee1710001caa7c12047d0152AllOf](docs/CountryPhoneCodeAb827579ee1710001caa7c12047d0152AllOf.md)
 - [CountryPhoneCodeDb1991f2fb091000169c5e0cb7c200b9](docs/CountryPhoneCodeDb1991f2fb091000169c5e0cb7c200b9.md)
 - [CountryPredefinedNameComponentAb5c028f50b310001b9916066f1f0250](docs/CountryPredefinedNameComponentAb5c028f50b310001b9916066f1f0250.md)
 - [CountryPredefinedNameComponentAb5c028f50b310001b9916066f1f0250AllOf](docs/CountryPredefinedNameComponentAb5c028f50b310001b9916066f1f0250AllOf.md)
 - [CountryRegion81f66ab16f7510005c53d8be2fe44847](docs/CountryRegion81f66ab16f7510005c53d8be2fe44847.md)
 - [CountryRegionA58f621b14ee100014b01c1cbabe00f4](docs/CountryRegionA58f621b14ee100014b01c1cbabe00f4.md)
 - [CountryRegionC1bb9f46f65210002d2fa322479a00b2](docs/CountryRegionC1bb9f46f65210002d2fa322479a00b2.md)
 - [DeviceType1089da0ab90910000f7089256c7b0888](docs/DeviceType1089da0ab90910000f7089256c7b0888.md)
 - [DeviceTypeA58f621b14ee100018ac4d72f02901ea](docs/DeviceTypeA58f621b14ee100018ac4d72f02901ea.md)
 - [DeviceTypeDb1991f2fb091000169c5e28fc0400bb](docs/DeviceTypeDb1991f2fb091000169c5e28fc0400bb.md)
 - [Disability15d8b82e323110000d98d0fc4d9903a5](docs/Disability15d8b82e323110000d98d0fc4d9903a5.md)
 - [Disability15d8b82e323110000d98d0fc4d9903a5AllOf](docs/Disability15d8b82e323110000d98d0fc4d9903a5AllOf.md)
 - [Disability6de928ab128410005c56a64ec69f024f](docs/Disability6de928ab128410005c56a64ec69f024f.md)
 - [DisabilityCertificationBasis15d8b82e323110000db825167ee603a9](docs/DisabilityCertificationBasis15d8b82e323110000db825167ee603a9.md)
 - [DisabilityCertificationBasis15d8b82e323110000db825167ee603a9AllOf](docs/DisabilityCertificationBasis15d8b82e323110000db825167ee603a9AllOf.md)
 - [DisabilityGrade15d8b82e323110000ddf3ff73d2e03ae](docs/DisabilityGrade15d8b82e323110000ddf3ff73d2e03ae.md)
 - [DisabilityGrade15d8b82e323110000ddf3ff73d2e03aeAllOf](docs/DisabilityGrade15d8b82e323110000ddf3ff73d2e03aeAllOf.md)
 - [DisabilityStatus6de928ab128410005c56a5a5299c0239](docs/DisabilityStatus6de928ab128410005c56a5a5299c0239.md)
 - [DisabilityStatus6de928ab128410005c56a5a5299c0239AllOf](docs/DisabilityStatus6de928ab128410005c56a5a5299c0239AllOf.md)
 - [ERRORMODELREFERENCE](docs/ERRORMODELREFERENCE.md)
 - [EmailAddressReference0918d433e86b100018119edc1b8f00f7](docs/EmailAddressReference0918d433e86b100018119edc1b8f00f7.md)
 - [EmailAddressReference0918d433e86b100018119edc1b8f00f7AllOf](docs/EmailAddressReference0918d433e86b100018119edc1b8f00f7AllOf.md)
 - [EmailReference9c3ab7b846e41000327e788d9664012a](docs/EmailReference9c3ab7b846e41000327e788d9664012a.md)
 - [EmailReference9c3ab7b846e41000327e788d9664012aAllOf](docs/EmailReference9c3ab7b846e41000327e788d9664012aAllOf.md)
 - [EthnicitiesForVisualSurvey2b5dded3d48e10001154aae4890a0104](docs/EthnicitiesForVisualSurvey2b5dded3d48e10001154aae4890a0104.md)
 - [EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700ae](docs/EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700ae.md)
 - [EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf](docs/EthnicitiesForVisualSurveyEbff7995b021100014bbd5c6cff700aeAllOf.md)
 - [Ethnicity6de928ab1284100058892e53dac501d1](docs/Ethnicity6de928ab1284100058892e53dac501d1.md)
 - [Ethnicity6de928ab1284100058892e53dac501d1AllOf](docs/Ethnicity6de928ab1284100058892e53dac501d1AllOf.md)
 - [EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143](docs/EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143.md)
 - [EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143AllOf](docs/EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143AllOf.md)
 - [FACETSMODELREFERENCEInner](docs/FACETSMODELREFERENCEInner.md)
 - [FACETSMODELREFERENCEInnerValuesInner](docs/FACETSMODELREFERENCEInnerValuesInner.md)
 - [For5d688bd57bb910001815ab3dd10024a9](docs/For5d688bd57bb910001815ab3dd10024a9.md)
 - [Gender414c4cee7d91100023fe32ce16e70019](docs/Gender414c4cee7d91100023fe32ce16e70019.md)
 - [Gender6de928ab12841000544f9cd350c201b9](docs/Gender6de928ab12841000544f9cd350c201b9.md)
 - [Gender6de928ab12841000544f9cd350c201b9AllOf](docs/Gender6de928ab12841000544f9cd350c201b9AllOf.md)
 - [Grade6de928ab128410005c56a5feed2e0244](docs/Grade6de928ab128410005c56a5feed2e0244.md)
 - [Hereditary11c67b72c9c610000edf72cf8506004d](docs/Hereditary11c67b72c9c610000edf72cf8506004d.md)
 - [HereditarySuffixE08d883b5eae10000403d7efe24b02f3](docs/HereditarySuffixE08d883b5eae10000403d7efe24b02f3.md)
 - [HomeAddressReference81f66ab16f7510005c53d881876e4843](docs/HomeAddressReference81f66ab16f7510005c53d881876e4843.md)
 - [HomeAddressReference81f66ab16f7510005c53d881876e4843AllOf](docs/HomeAddressReference81f66ab16f7510005c53d881876e4843AllOf.md)
 - [HomeContactInformationChangesGetAddressesStagedResponse](docs/HomeContactInformationChangesGetAddressesStagedResponse.md)
 - [HomeContactInformationChangesGetPhoneNumbersResponse](docs/HomeContactInformationChangesGetPhoneNumbersResponse.md)
 - [HomeContactInformationChangesGetStagedEmailAddressesResponse](docs/HomeContactInformationChangesGetStagedEmailAddressesResponse.md)
 - [HomeContactInformationChangesGetStagedInstantMessengersResponse](docs/HomeContactInformationChangesGetStagedInstantMessengersResponse.md)
 - [HomeContactInformationChangesGetWebAddressesStagedResponse](docs/HomeContactInformationChangesGetWebAddressesStagedResponse.md)
 - [HomeContactUsageC1bb9f46f65210002d3c341a5dc400b8](docs/HomeContactUsageC1bb9f46f65210002d3c341a5dc400b8.md)
 - [HomeContactUsageC1bb9f46f65210002d3c341a5dc400b8AllOf](docs/HomeContactUsageC1bb9f46f65210002d3c341a5dc400b8AllOf.md)
 - [HonorarySuffixE08d883b5eae10000403d7acba9602e5](docs/HonorarySuffixE08d883b5eae10000403d7acba9602e5.md)
 - [INSTANCEMODELREFERENCE](docs/INSTANCEMODELREFERENCE.md)
 - [InstantMessengerAccount33e26848dc00100036f723337ebb0132](docs/InstantMessengerAccount33e26848dc00100036f723337ebb0132.md)
 - [InstantMessengerAccount33e26848dc00100036f723337ebb0132AllOf](docs/InstantMessengerAccount33e26848dc00100036f723337ebb0132AllOf.md)
 - [InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016](docs/InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016.md)
 - [InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016AllOf](docs/InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016AllOf.md)
 - [InstantMessengerTypeAb827579ee17100023fd6abda45c01b9](docs/InstantMessengerTypeAb827579ee17100023fd6abda45c01b9.md)
 - [InstantMessengerTypeAb827579ee17100023fd6abda45c01b9AllOf](docs/InstantMessengerTypeAb827579ee17100023fd6abda45c01b9AllOf.md)
 - [InstantMessengerTypeE3f4243ada0b10000d441b1688d20087](docs/InstantMessengerTypeE3f4243ada0b10000d441b1688d20087.md)
 - [InstantMessengerTypeE3f4243ada0b10000d441b1688d20087AllOf](docs/InstantMessengerTypeE3f4243ada0b10000d441b1688d20087AllOf.md)
 - [LgbtIdentification6de928ab128410005a65d120bc8c020a](docs/LgbtIdentification6de928ab128410005a65d120bc8c020a.md)
 - [LgbtIdentification6de928ab128410005a65d120bc8c020aAllOf](docs/LgbtIdentification6de928ab128410005a65d120bc8c020aAllOf.md)
 - [LocalNameAb5c028f50b310001cb4684782660256](docs/LocalNameAb5c028f50b310001cb4684782660256.md)
 - [LocalNameAb5c028f50b310001cb4684782660256AllOf](docs/LocalNameAb5c028f50b310001cb4684782660256AllOf.md)
 - [LocalPersonNameE08d883b5eae10000403d7cd713c02ec](docs/LocalPersonNameE08d883b5eae10000403d7cd713c02ec.md)
 - [Location6de928ab128410005960a25f7ff401e5](docs/Location6de928ab128410005960a25f7ff401e5.md)
 - [Location6de928ab1284100059cd755321a501f1](docs/Location6de928ab1284100059cd755321a501f1.md)
 - [Location80df32d43a5810000d59f391b32400d8](docs/Location80df32d43a5810000d59f391b32400d8.md)
 - [LocationAaeb64c958b2100011f0c7fc94120224](docs/LocationAaeb64c958b2100011f0c7fc94120224.md)
 - [LocationAaeb64c958b2100011f0c7fc94120224AllOf](docs/LocationAaeb64c958b2100011f0c7fc94120224AllOf.md)
 - [MULTIPLEINSTANCEMODELREFERENCE](docs/MULTIPLEINSTANCEMODELREFERENCE.md)
 - [MaritalStatus6de928ab1284100059b4fc2c983801e9](docs/MaritalStatus6de928ab1284100059b4fc2c983801e9.md)
 - [MaritalStatus6de928ab1284100059b4fc2c983801e9AllOf](docs/MaritalStatus6de928ab1284100059b4fc2c983801e9AllOf.md)
 - [MaritalStatus6de928ab1284100059f67714875a01f8](docs/MaritalStatus6de928ab1284100059f67714875a01f8.md)
 - [MaritalStatusInformation6de928ab1284100059f5dc52629b01f4](docs/MaritalStatusInformation6de928ab1284100059f5dc52629b01f4.md)
 - [MaritalStatusInformation6de928ab1284100059f5dc52629b01f4AllOf](docs/MaritalStatusInformation6de928ab1284100059f5dc52629b01f4AllOf.md)
 - [MediaDownload5d5f0fb1184b10000b16f0e5c20f0000](docs/MediaDownload5d5f0fb1184b10000b16f0e5c20f0000.md)
 - [MediaDownload5d5f0fb1184b10000b16f0e5c20f0000AllOf](docs/MediaDownload5d5f0fb1184b10000b16f0e5c20f0000AllOf.md)
 - [MedicalExam2b5dded3d48e100016120452b8710164](docs/MedicalExam2b5dded3d48e100016120452b8710164.md)
 - [MedicalExam2b5dded3d48e100016120452b8710164AllOf](docs/MedicalExam2b5dded3d48e100016120452b8710164AllOf.md)
 - [MedicalExam2b5dded3d48e10001612959d7eb30169](docs/MedicalExam2b5dded3d48e10001612959d7eb30169.md)
 - [MilitaryDischargeTypeB15af3935f8910001f7585a44c0b0000](docs/MilitaryDischargeTypeB15af3935f8910001f7585a44c0b0000.md)
 - [MilitaryDischargeTypeB15af3935f8910001f7585a44c0b0000AllOf](docs/MilitaryDischargeTypeB15af3935f8910001f7585a44c0b0000AllOf.md)
 - [MilitaryDischargeTypeReferenceB26f12db214d100010f22b23c4e70000](docs/MilitaryDischargeTypeReferenceB26f12db214d100010f22b23c4e70000.md)
 - [MilitaryRank6de928ab128410005be5dbfb939d0234](docs/MilitaryRank6de928ab128410005be5dbfb939d0234.md)
 - [MilitaryRank6de928ab128410005be5dbfb939d0234AllOf](docs/MilitaryRank6de928ab128410005be5dbfb939d0234AllOf.md)
 - [MilitaryService6de928ab128410005b41e47e6d890218](docs/MilitaryService6de928ab128410005b41e47e6d890218.md)
 - [MilitaryService6de928ab128410005b41e47e6d890218AllOf](docs/MilitaryService6de928ab128410005b41e47e6d890218AllOf.md)
 - [MilitaryServiceReference6de928ab128410005b41e4b2f27d021e](docs/MilitaryServiceReference6de928ab128410005b41e4b2f27d021e.md)
 - [MilitaryServiceReferenceAaeb64c958b2100016889fe0267e0246](docs/MilitaryServiceReferenceAaeb64c958b2100016889fe0267e0246.md)
 - [MilitaryServiceReferenceAaeb64c958b2100016889fe0267e0246AllOf](docs/MilitaryServiceReferenceAaeb64c958b2100016889fe0267e0246AllOf.md)
 - [MilitaryServiceType6de928ab128410005bc12d1bc69b0230](docs/MilitaryServiceType6de928ab128410005bc12d1bc69b0230.md)
 - [MilitaryServiceType6de928ab128410005bc12d1bc69b0230AllOf](docs/MilitaryServiceType6de928ab128410005bc12d1bc69b0230AllOf.md)
 - [MilitaryStatus6de928ab128410005b9a8926efa80226](docs/MilitaryStatus6de928ab128410005b9a8926efa80226.md)
 - [MilitaryStatus6de928ab128410005b9a8926efa80226AllOf](docs/MilitaryStatus6de928ab128410005b9a8926efa80226AllOf.md)
 - [Name33e26848dc0010002f1ae76d63ec0061](docs/Name33e26848dc0010002f1ae76d63ec0061.md)
 - [Name33e26848dc0010002f1ae76d63ec0061AllOf](docs/Name33e26848dc0010002f1ae76d63ec0061AllOf.md)
 - [OverallBusinessProcess5d688bd57bb910001815ab49927724aa](docs/OverallBusinessProcess5d688bd57bb910001815ab49927724aa.md)
 - [PeopleGetAdditionalNamesResponse](docs/PeopleGetAdditionalNamesResponse.md)
 - [PeopleGetHomeAddressesResponse](docs/PeopleGetHomeAddressesResponse.md)
 - [PeopleGetHomeEmailsResponse](docs/PeopleGetHomeEmailsResponse.md)
 - [PeopleGetHomeInstantMessengersResponse](docs/PeopleGetHomeInstantMessengersResponse.md)
 - [PeopleGetHomePhonesResponse](docs/PeopleGetHomePhonesResponse.md)
 - [PeopleGetHomeWebAddressesResponse](docs/PeopleGetHomeWebAddressesResponse.md)
 - [PeopleGetLegalNameResponse](docs/PeopleGetLegalNameResponse.md)
 - [PeopleGetNamePronunciationsResponse](docs/PeopleGetNamePronunciationsResponse.md)
 - [PeopleGetPersonByIdResponse](docs/PeopleGetPersonByIdResponse.md)
 - [PeopleGetPersonalInfoResponse](docs/PeopleGetPersonalInfoResponse.md)
 - [PeopleGetPersonalPhotosResponse](docs/PeopleGetPersonalPhotosResponse.md)
 - [PeopleGetPreferredNameResponse](docs/PeopleGetPreferredNameResponse.md)
 - [PeopleGetPublicContactInformationResponse](docs/PeopleGetPublicContactInformationResponse.md)
 - [PeopleGetWorkAddressesResponse](docs/PeopleGetWorkAddressesResponse.md)
 - [PeopleGetWorkEmailsResponse](docs/PeopleGetWorkEmailsResponse.md)
 - [PeopleGetWorkInstantMessengerUsernamesResponse](docs/PeopleGetWorkInstantMessengerUsernamesResponse.md)
 - [PeopleGetWorkPhonesResponse](docs/PeopleGetWorkPhonesResponse.md)
 - [PeopleGetWorkWebAddressesResponse](docs/PeopleGetWorkWebAddressesResponse.md)
 - [Person86093b8a932f10001499f38c72410130](docs/Person86093b8a932f10001499f38c72410130.md)
 - [PersonCountryViewDefinitionF206795ea40e1000040cc6f5da4f002a](docs/PersonCountryViewDefinitionF206795ea40e1000040cc6f5da4f002a.md)
 - [PersonCountryViewDefinitionF206795ea40e1000040cc6f5da4f002aAllOf](docs/PersonCountryViewDefinitionF206795ea40e1000040cc6f5da4f002aAllOf.md)
 - [PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b](docs/PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027b.md)
 - [PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027bAllOf](docs/PersonLocalizedAddressComponentFormat98e46a86842a10000dc277ddefc7027bAllOf.md)
 - [PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00ea](docs/PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00ea.md)
 - [PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf](docs/PersonLocalizedNameComponentFormat51f9e585eec710001050c68b768b00eaAllOf.md)
 - [PersonPhoto6b9baf67ce60100007d43c79e7a30011](docs/PersonPhoto6b9baf67ce60100007d43c79e7a30011.md)
 - [PersonPhoto6b9baf67ce60100007d43c79e7a30011AllOf](docs/PersonPhoto6b9baf67ce60100007d43c79e7a30011AllOf.md)
 - [PersonPublicRepresentationD8f2aecf3d63100016a77ab413a20235](docs/PersonPublicRepresentationD8f2aecf3d63100016a77ab413a20235.md)
 - [PersonPublicRepresentationD8f2aecf3d63100016a77ab413a20235AllOf](docs/PersonPublicRepresentationD8f2aecf3d63100016a77ab413a20235AllOf.md)
 - [PersonRepresentationE451ce2c8b48100007c312f3f72700b3](docs/PersonRepresentationE451ce2c8b48100007c312f3f72700b3.md)
 - [PersonRepresentationE451ce2c8b48100007c312f3f72700b3AllOf](docs/PersonRepresentationE451ce2c8b48100007c312f3f72700b3AllOf.md)
 - [PersonalInformation414c4cee7d91100023fe329d6f900018](docs/PersonalInformation414c4cee7d91100023fe329d6f900018.md)
 - [PersonalInformation414c4cee7d91100023fe329d6f900018AllOf](docs/PersonalInformation414c4cee7d91100023fe329d6f900018AllOf.md)
 - [PhoneDeviceType1089da0ab90910000f85ace9e4050892](docs/PhoneDeviceType1089da0ab90910000f85ace9e4050892.md)
 - [PhoneDeviceType1089da0ab90910000f85ace9e4050892AllOf](docs/PhoneDeviceType1089da0ab90910000f85ace9e4050892AllOf.md)
 - [PhoneDeviceType33e26848dc00100062db00beab0c0205](docs/PhoneDeviceType33e26848dc00100062db00beab0c0205.md)
 - [PhoneDeviceType33e26848dc00100062db00beab0c0205AllOf](docs/PhoneDeviceType33e26848dc00100062db00beab0c0205AllOf.md)
 - [PhoneNumberValidationDb1991f2fb091000169c5dfa023800b8](docs/PhoneNumberValidationDb1991f2fb091000169c5dfa023800b8.md)
 - [PhoneNumberValidationDb1991f2fb091000169c5dfa023800b8AllOf](docs/PhoneNumberValidationDb1991f2fb091000169c5dfa023800b8AllOf.md)
 - [PhoneReference1089da0ab90910000f70891a998b0887](docs/PhoneReference1089da0ab90910000f70891a998b0887.md)
 - [PhoneReference1089da0ab90910000f70891a998b0887AllOf](docs/PhoneReference1089da0ab90910000f70891a998b0887AllOf.md)
 - [PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd](docs/PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd.md)
 - [PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00ddAllOf](docs/PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00ddAllOf.md)
 - [PlaceOfBirth6de928ab12841000549fe623b1ab01c0](docs/PlaceOfBirth6de928ab12841000549fe623b1ab01c0.md)
 - [PlaceOfBirth6de928ab12841000549fe623b1ab01c0AllOf](docs/PlaceOfBirth6de928ab12841000549fe623b1ab01c0AllOf.md)
 - [PlaceOfBirth6de928ab1284100054a0b7e99c2b01c5](docs/PlaceOfBirth6de928ab1284100054a0b7e99c2b01c5.md)
 - [PoliticalAffiliation6de928ab128410005b04f3329eee0214](docs/PoliticalAffiliation6de928ab128410005b04f3329eee0214.md)
 - [PoliticalAffiliation6de928ab128410005b04f3329eee0214AllOf](docs/PoliticalAffiliation6de928ab128410005b04f3329eee0214AllOf.md)
 - [PoliticalAffiliationBf9cd1638e0f10000a6604bfef01014a](docs/PoliticalAffiliationBf9cd1638e0f10000a6604bfef01014a.md)
 - [PrimaryNationality2b5dded3d48e100013b87a5e15b3012a](docs/PrimaryNationality2b5dded3d48e100013b87a5e15b3012a.md)
 - [ProfessionalSuffixE08d883b5eae10000403d7e2171f02f0](docs/ProfessionalSuffixE08d883b5eae10000403d7e2171f02f0.md)
 - [Rank6de928ab128410005b41e4ba56a6021f](docs/Rank6de928ab128410005b41e4ba56a6021f.md)
 - [Region6de928ab12841000549fe6375a9301c2](docs/Region6de928ab12841000549fe6375a9301c2.md)
 - [RegionAb827579ee1710001f7eb5159a9b0170](docs/RegionAb827579ee1710001f7eb5159a9b0170.md)
 - [RegionAb827579ee1710001f7eb5159a9b0170AllOf](docs/RegionAb827579ee1710001f7eb5159a9b0170AllOf.md)
 - [RelativeNamesE08d883b5eae10000403d79fe6d202e3](docs/RelativeNamesE08d883b5eae10000403d79fe6d202e3.md)
 - [RelativeNamesE08d883b5eae10000403d79fe6d202e3AllOf](docs/RelativeNamesE08d883b5eae10000403d79fe6d202e3AllOf.md)
 - [RelativeTypeE08d883b5eae100003cff859e1ec02dd](docs/RelativeTypeE08d883b5eae100003cff859e1ec02dd.md)
 - [RelativeTypeE08d883b5eae100003cff859e1ec02ddAllOf](docs/RelativeTypeE08d883b5eae100003cff859e1ec02ddAllOf.md)
 - [RelativeTypeE08d883b5eae1000040cc1231a5902f5](docs/RelativeTypeE08d883b5eae1000040cc1231a5902f5.md)
 - [Religion6de928ab128410005a7df872e147020e](docs/Religion6de928ab128410005a7df872e147020e.md)
 - [Religion6de928ab128410005a7df872e147020eAllOf](docs/Religion6de928ab128410005a7df872e147020eAllOf.md)
 - [ReligiousSuffixE08d883b5eae10000403d7eb401e02f2](docs/ReligiousSuffixE08d883b5eae10000403d7eb401e02f2.md)
 - [RoyalSuffixE08d883b5eae10000403d7d259db02ed](docs/RoyalSuffixE08d883b5eae10000403d7d259db02ed.md)
 - [Salutation11c67b72c9c610000edf7291ae7b004c](docs/Salutation11c67b72c9c610000edf7291ae7b004c.md)
 - [SalutationSuffixE08d883b5eae10000403d7d736c102ee](docs/SalutationSuffixE08d883b5eae10000403d7d736c102ee.md)
 - [SelectiveServiceRegistrationCa34e5d6a47710000f902f4d90240000](docs/SelectiveServiceRegistrationCa34e5d6a47710000f902f4d90240000.md)
 - [Social11c67b72c9c610000edf72e003d1004e](docs/Social11c67b72c9c610000edf72e003d1004e.md)
 - [SocialBenefitsLocality80df32d43a5810000ce11ade29d300bc](docs/SocialBenefitsLocality80df32d43a5810000ce11ade29d300bc.md)
 - [SocialBenefitsLocality80df32d43a5810000ce11ade29d300bcAllOf](docs/SocialBenefitsLocality80df32d43a5810000ce11ade29d300bcAllOf.md)
 - [SocialBenefitsLocality80df32d43a5810000ce182cac97500bf](docs/SocialBenefitsLocality80df32d43a5810000ce182cac97500bf.md)
 - [SocialSuffixE08d883b5eae10000403d7dc081502ef](docs/SocialSuffixE08d883b5eae10000403d7dc081502ef.md)
 - [Status6de928ab1284100059f5dc66f77e01f6](docs/Status6de928ab1284100059f5dc66f77e01f6.md)
 - [Status6de928ab128410005b41e4a4e4d2021c](docs/Status6de928ab128410005b41e4a4e4d2021c.md)
 - [Title11c67b72c9c610000edf72f0b3c5004f](docs/Title11c67b72c9c610000edf72f0b3c5004f.md)
 - [TitleE08d883b5eae10000403d7b62abb02e7](docs/TitleE08d883b5eae10000403d7b62abb02e7.md)
 - [TransactionStatus7457adcbe0fa1000089b63ab3a510000](docs/TransactionStatus7457adcbe0fa1000089b63ab3a510000.md)
 - [Type33e26848dc00100037bb584480fe014a](docs/Type33e26848dc00100037bb584480fe014a.md)
 - [Type6de928ab128410005b41e4ac0ec5021d](docs/Type6de928ab128410005b41e4ac0ec5021d.md)
 - [TypeDe08a6c876a810000cb2e3dd8853001a](docs/TypeDe08a6c876a810000cb2e3dd8853001a.md)
 - [UniformServiceReserveStatus9503dc49ae9610001e48857455610000](docs/UniformServiceReserveStatus9503dc49ae9610001e48857455610000.md)
 - [UniformServiceReserveStatusB26f12db214d10000bf4b358ee390000](docs/UniformServiceReserveStatusB26f12db214d10000bf4b358ee390000.md)
 - [UniformServiceReserveStatusB26f12db214d10000bf4b358ee390000AllOf](docs/UniformServiceReserveStatusB26f12db214d10000bf4b358ee390000AllOf.md)
 - [UniversalID814af6e5b9fa100022bff92eb5140117](docs/UniversalID814af6e5b9fa100022bff92eb5140117.md)
 - [UniversalIDE451ce2c8b48100007c31392a1ff00c2](docs/UniversalIDE451ce2c8b48100007c31392a1ff00c2.md)
 - [UploadedByB32ff437243510000e22e06470370160](docs/UploadedByB32ff437243510000e22e06470370160.md)
 - [Usage1089da0ab90910000f70892f2de3088a](docs/Usage1089da0ab90910000f70892f2de3088a.md)
 - [Usage6333dee5ac2010000c8653405aaa0038](docs/Usage6333dee5ac2010000c8653405aaa0038.md)
 - [Usage81f66ab16f7510005c53d917926f4857](docs/Usage81f66ab16f7510005c53d917926f4857.md)
 - [Usage9c3ab7b846e4100032b68c2b58c80134](docs/Usage9c3ab7b846e4100032b68c2b58c80134.md)
 - [UsageA58f621b14ee100014b01c034eeb00f3](docs/UsageA58f621b14ee100014b01c034eeb00f3.md)
 - [UsageAb827579ee171000225b0b528418019f](docs/UsageAb827579ee171000225b0b528418019f.md)
 - [UsageAb827579ee1710002266db48222201a4](docs/UsageAb827579ee1710002266db48222201a4.md)
 - [UsageBehavior1089da0ab90910000fa6c19789ce0896](docs/UsageBehavior1089da0ab90910000fa6c19789ce0896.md)
 - [UsageBehavior1089da0ab90910000fa6c19789ce0896AllOf](docs/UsageBehavior1089da0ab90910000fa6c19789ce0896AllOf.md)
 - [UsageBehavior33e26848dc0010003a3c3827858901b4](docs/UsageBehavior33e26848dc0010003a3c3827858901b4.md)
 - [UsageBehavior33e26848dc0010003a3c3827858901b4AllOf](docs/UsageBehavior33e26848dc0010003a3c3827858901b4AllOf.md)
 - [UsageC1bb9f46f65210002d2fa2e7babe00a8](docs/UsageC1bb9f46f65210002d2fa2e7babe00a8.md)
 - [UsageDe08a6c876a810000cb2e3d738be0019](docs/UsageDe08a6c876a810000cb2e3d738be0019.md)
 - [UsageDf014bc8b5fa10000b2c21c8738d00e7](docs/UsageDf014bc8b5fa10000b2c21c8738d00e7.md)
 - [UsageE357ae6d466510000ce25a08bfe401b3](docs/UsageE357ae6d466510000ce25a08bfe401b3.md)
 - [UsageType51665e7371e310000f554a00d31000f2](docs/UsageType51665e7371e310000f554a00d31000f2.md)
 - [UsageType6a6eaf50b6ad100012e8021249e601fc](docs/UsageType6a6eaf50b6ad100012e8021249e601fc.md)
 - [UsageType6a6eaf50b6ad100012e8021249e601fcAllOf](docs/UsageType6a6eaf50b6ad100012e8021249e601fcAllOf.md)
 - [UsageType81f66ab16f7510005c6076c4248b4875](docs/UsageType81f66ab16f7510005c6076c4248b4875.md)
 - [UsageType901718dd5e7910000cb06dace3950299](docs/UsageType901718dd5e7910000cb06dace3950299.md)
 - [UsageType901718dd5e7910000cc03935c73e029c](docs/UsageType901718dd5e7910000cc03935c73e029c.md)
 - [UsageType901718dd5e7910000cc03935c73e029cAllOf](docs/UsageType901718dd5e7910000cc03935c73e029cAllOf.md)
 - [UsageTypeC1bb9f46f65210002d3c343d773200bc](docs/UsageTypeC1bb9f46f65210002d3c343d773200bc.md)
 - [VALIDATIONERRORMODELREFERENCE](docs/VALIDATIONERRORMODELREFERENCE.md)
 - [VALIDATIONERRORMODELREFERENCEAllOf](docs/VALIDATIONERRORMODELREFERENCEAllOf.md)
 - [VeteransPreference898f4bc8578c100010cc072a1b140000](docs/VeteransPreference898f4bc8578c100010cc072a1b140000.md)
 - [VeteransPreference898f4bc8578c100010cc072a1b140000AllOf](docs/VeteransPreference898f4bc8578c100010cc072a1b140000AllOf.md)
 - [VeteransPreferenceForRIFA04210f7e84510001fb2873228810000](docs/VeteransPreferenceForRIFA04210f7e84510001fb2873228810000.md)
 - [WebAddress33e26848dc0010003893a0202ced0165](docs/WebAddress33e26848dc0010003893a0202ced0165.md)
 - [WebAddress33e26848dc0010003893a0202ced0165AllOf](docs/WebAddress33e26848dc0010003893a0202ced0165AllOf.md)
 - [WebAddressReferenceE357ae6d466510000ce259f323be01b0](docs/WebAddressReferenceE357ae6d466510000ce259f323be01b0.md)
 - [WebAddressReferenceE357ae6d466510000ce259f323be01b0AllOf](docs/WebAddressReferenceE357ae6d466510000ce259f323be01b0AllOf.md)
 - [WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095](docs/WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095.md)
 - [WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095AllOf](docs/WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095AllOf.md)
 - [WorkContactChangeEventD72a8353f91e1000169a839c31a0046d](docs/WorkContactChangeEventD72a8353f91e1000169a839c31a0046d.md)
 - [WorkContactChangeEventD72a8353f91e1000169a839c31a0046dAllOf](docs/WorkContactChangeEventD72a8353f91e1000169a839c31a0046dAllOf.md)
 - [WorkContactChangeEventViewBdfa2c83ea5e10002b70a7e9f69e5d67](docs/WorkContactChangeEventViewBdfa2c83ea5e10002b70a7e9f69e5d67.md)
 - [WorkContactChangeEventViewBdfa2c83ea5e10002b70a7e9f69e5d67AllOf](docs/WorkContactChangeEventViewBdfa2c83ea5e10002b70a7e9f69e5d67AllOf.md)
 - [WorkContactInformationChangesGetAddressesStagedResponse](docs/WorkContactInformationChangesGetAddressesStagedResponse.md)
 - [WorkContactInformationChangesGetPhoneNumbersResponse](docs/WorkContactInformationChangesGetPhoneNumbersResponse.md)
 - [WorkContactInformationChangesGetStagedEmailAddressesResponse](docs/WorkContactInformationChangesGetStagedEmailAddressesResponse.md)
 - [WorkContactInformationChangesGetStagedInstantMessengersResponse](docs/WorkContactInformationChangesGetStagedInstantMessengersResponse.md)
 - [WorkContactInformationChangesGetWebAddressesStagedResponse](docs/WorkContactInformationChangesGetWebAddressesStagedResponse.md)
 - [WorkContactUsage81f66ab16f7510005c60769e6db24871](docs/WorkContactUsage81f66ab16f7510005c60769e6db24871.md)
 - [WorkContactUsage81f66ab16f7510005c60769e6db24871AllOf](docs/WorkContactUsage81f66ab16f7510005c60769e6db24871AllOf.md)
 - [WorkerDocument15d8b82e323110000e0117c92d9803b2](docs/WorkerDocument15d8b82e323110000e0117c92d9803b2.md)
 - [WorkerDocument15d8b82e323110000e0117c92d9803b2AllOf](docs/WorkerDocument15d8b82e323110000e0117c92d9803b2AllOf.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
