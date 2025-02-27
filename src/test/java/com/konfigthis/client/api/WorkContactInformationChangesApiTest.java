/*
 * person
 * The Person REST APIs enable you to access information about the worker person, including country-specific configuration information about name components.
 *
 * The version of the OpenAPI document: v4
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.AlternateWorkLocationD72a8353f91e1000169a83b894e7046e;
import com.konfigthis.client.model.BusinessProcessParameters83f6f6b7c38d100009c7ad91dd414a16;
import com.konfigthis.client.model.ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed;
import com.konfigthis.client.model.CountryC1bb9f46f65210002d2fa329fe6700b4;
import com.konfigthis.client.model.CountryCityC1bb9f46f65210002d2fa2bb24a300a1;
import com.konfigthis.client.model.CountryPhoneCode1089da0ab90910000f7089365467088c;
import com.konfigthis.client.model.CountryRegionC1bb9f46f65210002d2fa322479a00b2;
import com.konfigthis.client.model.DeviceType1089da0ab90910000f7089256c7b0888;
import com.konfigthis.client.model.ERRORMODELREFERENCE;
import com.konfigthis.client.model.EmailAddressReference0918d433e86b100018119edc1b8f00f7;
import com.konfigthis.client.model.InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016;
import java.time.LocalDate;
import com.konfigthis.client.model.PhoneReference1089da0ab90910000f70891a998b0887;
import com.konfigthis.client.model.TypeDe08a6c876a810000cb2e3dd8853001a;
import com.konfigthis.client.model.Usage1089da0ab90910000f70892f2de3088a;
import com.konfigthis.client.model.Usage6333dee5ac2010000c8653405aaa0038;
import com.konfigthis.client.model.UsageC1bb9f46f65210002d2fa2e7babe00a8;
import com.konfigthis.client.model.UsageDe08a6c876a810000cb2e3d738be0019;
import com.konfigthis.client.model.UsageE357ae6d466510000ce25a08bfe401b3;
import com.konfigthis.client.model.WebAddressReferenceE357ae6d466510000ce259f323be01b0;
import com.konfigthis.client.model.WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095;
import com.konfigthis.client.model.WorkContactChangeEventD72a8353f91e1000169a839c31a0046d;
import com.konfigthis.client.model.WorkContactChangeEventViewBdfa2c83ea5e10002b70a7e9f69e5d67;
import com.konfigthis.client.model.WorkContactInformationChangesGetAddressesStagedResponse;
import com.konfigthis.client.model.WorkContactInformationChangesGetPhoneNumbersResponse;
import com.konfigthis.client.model.WorkContactInformationChangesGetStagedEmailAddressesResponse;
import com.konfigthis.client.model.WorkContactInformationChangesGetStagedInstantMessengersResponse;
import com.konfigthis.client.model.WorkContactInformationChangesGetWebAddressesStagedResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkContactInformationChangesApi
 */
@Disabled
public class WorkContactInformationChangesApiTest {

    private static WorkContactInformationChangesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new WorkContactInformationChangesApi(apiClient);
    }

    /**
     * Creates a new address staged by the parent business process event.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAddressTest() throws ApiException {
        String ID = null;
        String addressLine3 = null;
        String addressLine8Local = null;
        String regionSubdivision2 = null;
        String cityLocal = null;
        String citySubdivision1Local = null;
        String addressLine6Local = null;
        String addressLine4Local = null;
        String regionSubdivision1Local = null;
        CountryC1bb9f46f65210002d2fa329fe6700b4 country = null;
        String addressLine9 = null;
        String addressLine4 = null;
        String citySubdivision1 = null;
        String addressLine8 = null;
        String addressLine1 = null;
        String addressLine5Local = null;
        String addressLine6 = null;
        String city = null;
        String addressLine3Local = null;
        String postalCode = null;
        String addressLine9Local = null;
        String addressLine2 = null;
        String addressLine1Local = null;
        String addressLine7Local = null;
        CountryRegionC1bb9f46f65210002d2fa322479a00b2 countryRegion = null;
        String addressLine5 = null;
        UsageC1bb9f46f65210002d2fa2e7babe00a8 usage = null;
        String regionSubdivision1 = null;
        String addressLine7 = null;
        LocalDate effective = null;
        String citySubdivision2Local = null;
        String addressLine2Local = null;
        CountryCityC1bb9f46f65210002d2fa2bb24a300a1 countryCity = null;
        String citySubdivision2 = null;
        String id = null;
        WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095 response = api.createAddress(ID)
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
        // TODO: test validations
    }

    /**
     * Creates a new email address staged by the parent business process event.  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEmailAddressTest() throws ApiException {
        String ID = null;
        String emailAddress = null;
        Usage6333dee5ac2010000c8653405aaa0038 usage = null;
        String descriptor = null;
        String id = null;
        EmailAddressReference0918d433e86b100018119edc1b8f00f7 response = api.createEmailAddress(ID)
                .emailAddress(emailAddress)
                .usage(usage)
                .descriptor(descriptor)
                .id(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a new instant messenger staged by the parent business process event.  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createInstantMessengerTest() throws ApiException {
        String ID = null;
        TypeDe08a6c876a810000cb2e3dd8853001a type = null;
        String userName = null;
        UsageDe08a6c876a810000cb2e3d738be0019 usage = null;
        String id = null;
        InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016 response = api.createInstantMessenger(ID)
                .type(type)
                .userName(userName)
                .usage(usage)
                .id(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a new phone number staged by the parent business process event.  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPhoneNumberTest() throws ApiException {
        String ID = null;
        String extension = null;
        String completePhoneNumber = null;
        CountryPhoneCode1089da0ab90910000f7089365467088c countryPhoneCode = null;
        DeviceType1089da0ab90910000f7089256c7b0888 deviceType = null;
        Usage1089da0ab90910000f70892f2de3088a usage = null;
        String descriptor = null;
        String id = null;
        PhoneReference1089da0ab90910000f70891a998b0887 response = api.createPhoneNumber(ID)
                .extension(extension)
                .completePhoneNumber(completePhoneNumber)
                .countryPhoneCode(countryPhoneCode)
                .deviceType(deviceType)
                .usage(usage)
                .descriptor(descriptor)
                .id(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a new web address staged by the parent business process event.  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createStagedWebAddressTest() throws ApiException {
        String ID = null;
        UsageE357ae6d466510000ce25a08bfe401b3 usage = null;
        String url = null;
        String id = null;
        WebAddressReferenceE357ae6d466510000ce259f323be01b0 response = api.createStagedWebAddress(ID)
                .usage(usage)
                .url(url)
                .id(id)
                .execute();
        // TODO: test validations
    }

    /**
     * An address as it exists staged for update by the parent business process.
     *
     * Retrieve an existing address as it exists when staged by the parent business process.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAddressAsStagedTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095 response = api.getAddressAsStaged(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve all existing addresses staged for update by the parent business process
     *
     * Retrieve all addresses staged for update by the parent business process  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAddressesStagedTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean publicOnly = null;
        String usedFor = null;
        WorkContactInformationChangesGetAddressesStagedResponse response = api.getAddressesStaged(ID)
                .limit(limit)
                .offset(offset)
                .publicOnly(publicOnly)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * An email address as it exists staged for update by the parent business process.
     *
     * Retrieve an existing email address as it exists when staged by the parent business process.  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmailAddressTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        EmailAddressReference0918d433e86b100018119edc1b8f00f7 response = api.getEmailAddress(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns basic information about the work contact change event, as well as the Alternate Work Location staged by the event, if there is one.  Secured by: Change Work Contact Information (REST Service), Person Data: Work Contact Information, Self-Service: Work Contact Information  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEventInfoTest() throws ApiException {
        String ID = null;
        WorkContactChangeEventViewBdfa2c83ea5e10002b70a7e9f69e5d67 response = api.getEventInfo(ID)
                .execute();
        // TODO: test validations
    }

    /**
     * A phone number as it exists staged for update by the parent business process.
     *
     * Retrieve an existing phone number as it exists when staged by the parent business process.  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPhoneNumberTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        PhoneReference1089da0ab90910000f70891a998b0887 response = api.getPhoneNumber(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve all existing phone numbers staged for update by the parent business process
     *
     * Retrieve all phone numbers staged for update by the parent business process  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPhoneNumbersTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usageType = null;
        String usedFor = null;
        WorkContactInformationChangesGetPhoneNumbersResponse response = api.getPhoneNumbers(ID)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usageType(usageType)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve all existing addresses staged for update by the parent business process
     *
     * Retrieve all email addresses staged for update by the parent business process  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStagedEmailAddressesTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usageType = null;
        String usedFor = null;
        WorkContactInformationChangesGetStagedEmailAddressesResponse response = api.getStagedEmailAddresses(ID)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usageType(usageType)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * An instant messenger as it exists staged for update by the parent business process.
     *
     * Retrieve an existing instant messenger as it exists when staged by the parent business process.  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStagedInstantMessengerTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016 response = api.getStagedInstantMessenger(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve all existing instant messengers staged for update by the parent business process
     *
     * Retrieve all instant messengers staged for update by the parent business process  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStagedInstantMessengersTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usageType = null;
        String usedFor = null;
        WorkContactInformationChangesGetStagedInstantMessengersResponse response = api.getStagedInstantMessengers(ID)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usageType(usageType)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * A web address as it exists staged for update by the parent business process.
     *
     * Retrieve an existing web address as it exists when staged by the parent business process.  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebAddressTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        WebAddressReferenceE357ae6d466510000ce259f323be01b0 response = api.getWebAddress(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve all existing web addresses staged for update by the parent business process
     *
     * Retrieve all web addresses staged for update by the parent business process  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebAddressesStagedTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usageType = null;
        String usedFor = null;
        WorkContactInformationChangesGetWebAddressesStagedResponse response = api.getWebAddressesStaged(ID)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usageType(usageType)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove the specified address. If this address existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAddressTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        api.removeAddress(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove the specified email address. If this address existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeEmailAddressTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        api.removeEmailAddress(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove the specified instant messenger. If this instant messenger existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeInstantMessengerTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        api.removeInstantMessenger(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove the specified phone number. If this address existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removePhoneNumberTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        api.removePhoneNumber(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove the specified web address. If this address existed before the start of the current business process, it won&#39;t be removed from the target Person until the parent business process completes.  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeWebAddressTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        api.removeWebAddress(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Submit the specified contact change ID.
     *
     * Submits the specified work contact information change ID.   To submit the Work Contact Change event and initiate the Work Contact Change business process, specify an empty request body: {}. To save for later, specify this request body: {     \&quot;businessProcessParameters\&quot;: {         \&quot;action\&quot;:{             \&quot;id\&quot;: \&quot;d9e41a8c446c11de98360015c5e6daf6\&quot;         }     } }  The action id value is the Workday ID of the Save for Later action. If you submit this endpoint with the Save for Later action, you can no longer edit nor resubmit the Work Contact Change event using the REST APIs. The user with correct permissions can edit and submit the saved Work Contact Change event in the Workday UI.  Secured by: Change Work Contact Information (REST Service)  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitTest() throws ApiException {
        String ID = null;
        BusinessProcessParameters83f6f6b7c38d100009c7ad91dd414a16 businessProcessParameters = null;
        String descriptor = null;
        String id = null;
        ChangeContactInformationEvent765b18aa13af1000064a10bf37b800ed response = api.submit(ID)
                .businessProcessParameters(businessProcessParameters)
                .descriptor(descriptor)
                .id(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing address that is staged for update by the parent business process event.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAddressTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        String addressLine3 = null;
        String addressLine8Local = null;
        String regionSubdivision2 = null;
        String cityLocal = null;
        String citySubdivision1Local = null;
        String addressLine6Local = null;
        String addressLine4Local = null;
        String regionSubdivision1Local = null;
        CountryC1bb9f46f65210002d2fa329fe6700b4 country = null;
        String addressLine9 = null;
        String addressLine4 = null;
        String citySubdivision1 = null;
        String addressLine8 = null;
        String addressLine1 = null;
        String addressLine5Local = null;
        String addressLine6 = null;
        String city = null;
        String addressLine3Local = null;
        String postalCode = null;
        String addressLine9Local = null;
        String addressLine2 = null;
        String addressLine1Local = null;
        String addressLine7Local = null;
        CountryRegionC1bb9f46f65210002d2fa322479a00b2 countryRegion = null;
        String addressLine5 = null;
        UsageC1bb9f46f65210002d2fa2e7babe00a8 usage = null;
        String regionSubdivision1 = null;
        String addressLine7 = null;
        LocalDate effective = null;
        String citySubdivision2Local = null;
        String addressLine2Local = null;
        CountryCityC1bb9f46f65210002d2fa2bb24a300a1 countryCity = null;
        String citySubdivision2 = null;
        String id = null;
        WorkAddressReferenceC1bb9f46f65210002d2fa259a1c10095 response = api.updateAddress(ID, subresourceID)
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
        // TODO: test validations
    }

    /**
     * Update the Alternate Work Location staged by this business process event.   Any Home or Work address for the target Person is valid for use as an Alternate Work Location.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAlternateWorkLocationTest() throws ApiException {
        String ID = null;
        AlternateWorkLocationD72a8353f91e1000169a83b894e7046e alternateWorkLocation = null;
        String descriptor = null;
        String id = null;
        WorkContactChangeEventD72a8353f91e1000169a839c31a0046d response = api.updateAlternateWorkLocation(ID)
                .alternateWorkLocation(alternateWorkLocation)
                .descriptor(descriptor)
                .id(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Partially update an existing email address that is staged for update by the parent business process event.  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEmailAddressTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        String emailAddress = null;
        Usage6333dee5ac2010000c8653405aaa0038 usage = null;
        String descriptor = null;
        String id = null;
        EmailAddressReference0918d433e86b100018119edc1b8f00f7 response = api.updateEmailAddress(ID, subresourceID)
                .emailAddress(emailAddress)
                .usage(usage)
                .descriptor(descriptor)
                .id(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Partially update an existing instant messenger that is staged for update by the parent business process event.  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateInstantMessengerTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        TypeDe08a6c876a810000cb2e3dd8853001a type = null;
        String userName = null;
        UsageDe08a6c876a810000cb2e3d738be0019 usage = null;
        String id = null;
        InstantMessengerReferenceDe08a6c876a810000cb2e38a1d2a0016 response = api.updateInstantMessenger(ID, subresourceID)
                .type(type)
                .userName(userName)
                .usage(usage)
                .id(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Partially update an existing phone number that is staged for update by the parent business process event.  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePhoneNumberTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        String extension = null;
        String completePhoneNumber = null;
        CountryPhoneCode1089da0ab90910000f7089365467088c countryPhoneCode = null;
        DeviceType1089da0ab90910000f7089256c7b0888 deviceType = null;
        Usage1089da0ab90910000f70892f2de3088a usage = null;
        String descriptor = null;
        String id = null;
        PhoneReference1089da0ab90910000f70891a998b0887 response = api.updatePhoneNumber(ID, subresourceID)
                .extension(extension)
                .completePhoneNumber(completePhoneNumber)
                .countryPhoneCode(countryPhoneCode)
                .deviceType(deviceType)
                .usage(usage)
                .descriptor(descriptor)
                .id(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Partially update an existing web address that is staged for update by the parent business process event.  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWebAddressTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        UsageE357ae6d466510000ce25a08bfe401b3 usage = null;
        String url = null;
        String id = null;
        WebAddressReferenceE357ae6d466510000ce259f323be01b0 response = api.updateWebAddress(ID, subresourceID)
                .usage(usage)
                .url(url)
                .id(id)
                .execute();
        // TODO: test validations
    }

}
