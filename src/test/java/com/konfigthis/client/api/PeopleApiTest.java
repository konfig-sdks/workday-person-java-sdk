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
import com.konfigthis.client.model.AddressReference9c3ab7b846e4100009e5ec55fa530024;
import com.konfigthis.client.model.ERRORMODELREFERENCE;
import com.konfigthis.client.model.EmailReference9c3ab7b846e41000327e788d9664012a;
import com.konfigthis.client.model.InstantMessengerAccount33e26848dc00100036f723337ebb0132;
import java.time.LocalDate;
import com.konfigthis.client.model.MediaDownload5d5f0fb1184b10000b16f0e5c20f0000;
import com.konfigthis.client.model.Name33e26848dc0010002f1ae76d63ec0061;
import com.konfigthis.client.model.PeopleGetAdditionalNamesResponse;
import com.konfigthis.client.model.PeopleGetHomeAddressesResponse;
import com.konfigthis.client.model.PeopleGetHomeEmailsResponse;
import com.konfigthis.client.model.PeopleGetHomeInstantMessengersResponse;
import com.konfigthis.client.model.PeopleGetHomePhonesResponse;
import com.konfigthis.client.model.PeopleGetHomeWebAddressesResponse;
import com.konfigthis.client.model.PeopleGetLegalNameResponse;
import com.konfigthis.client.model.PeopleGetNamePronunciationsResponse;
import com.konfigthis.client.model.PeopleGetPersonByIdResponse;
import com.konfigthis.client.model.PeopleGetPersonalInfoResponse;
import com.konfigthis.client.model.PeopleGetPersonalPhotosResponse;
import com.konfigthis.client.model.PeopleGetPreferredNameResponse;
import com.konfigthis.client.model.PeopleGetPublicContactInformationResponse;
import com.konfigthis.client.model.PeopleGetWorkAddressesResponse;
import com.konfigthis.client.model.PeopleGetWorkEmailsResponse;
import com.konfigthis.client.model.PeopleGetWorkInstantMessengerUsernamesResponse;
import com.konfigthis.client.model.PeopleGetWorkPhonesResponse;
import com.konfigthis.client.model.PeopleGetWorkWebAddressesResponse;
import com.konfigthis.client.model.PersonPhoto6b9baf67ce60100007d43c79e7a30011;
import com.konfigthis.client.model.PersonPublicRepresentationD8f2aecf3d63100016a77ab413a20235;
import com.konfigthis.client.model.PersonRepresentationE451ce2c8b48100007c312f3f72700b3;
import com.konfigthis.client.model.PersonalInformation414c4cee7d91100023fe329d6f900018;
import com.konfigthis.client.model.PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd;
import com.konfigthis.client.model.WebAddress33e26848dc0010003893a0202ced0165;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PeopleApi
 */
@Disabled
public class PeopleApiTest {

    private static PeopleApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PeopleApi(apiClient);
    }

    /**
     * Retrieves an additional name.
     *
     * Retrieves an additional name for the person with the specified ID.  Secured by: Person Data:  Name, Self-Service: Name  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAdditionalNameTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        Name33e26848dc0010002f1ae76d63ec0061 response = api.getAdditionalName(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of additional names.
     *
     * Retrieves all additional names for the person with the specified ID.  Secured by: Person Data:  Name, Self-Service: Name  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAdditionalNamesTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        PeopleGetAdditionalNamesResponse response = api.getAdditionalNames(ID)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a person in your Workday tenant.
     *
     * Retrieves a person with the specified ID. You can use the returned ID from GET /people or GET /workers as the ID of the person whose information you want to retrieve.  Secured by: REST API Public  Contains attachment(s)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String ID = null;
        PersonRepresentationE451ce2c8b48100007c312f3f72700b3 response = api.getById(ID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a home address.
     *
     * Retrieves a home address for the person with the specified ID.  Secured by: Person Data: Home Address, Self-Service: Home Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHomeAddressTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        AddressReference9c3ab7b846e4100009e5ec55fa530024 response = api.getHomeAddress(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of home addresses.
     *
     * Retrieves all home addresses for the person with the specified ID.  Secured by: Person Data: Home Address, Self-Service: Home Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHomeAddressesTest() throws ApiException {
        String ID = null;
        LocalDate effective = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usedFor = null;
        PeopleGetHomeAddressesResponse response = api.getHomeAddresses(ID)
                .effective(effective)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a home email address.
     *
     * Retrieve a home email address for the person with the specified ID.  Secured by: Person Data: Home Email, Self-Service: Home Email  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHomeEmailTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        EmailReference9c3ab7b846e41000327e788d9664012a response = api.getHomeEmail(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of home email addresses.
     *
     * Retrieve all home email addresses for the person with the specified ID.  Secured by: Person Data: Home Email, Self-Service: Home Email  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHomeEmailsTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usedFor = null;
        PeopleGetHomeEmailsResponse response = api.getHomeEmails(ID)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a home instant messenger account username.
     *
     * Retrieves a home instant messenger account username for the person with the specified ID.  Secured by: Person Data: Home Instant Messenger, Self-Service: Home Instant Messenger  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHomeInstantMessengerUsernameTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        InstantMessengerAccount33e26848dc00100036f723337ebb0132 response = api.getHomeInstantMessengerUsername(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of home instant messenger account usernames.
     *
     * Retrieves all home instant messenger account usernames for the person with the specified ID.  Secured by: Person Data: Home Instant Messenger, Self-Service: Home Instant Messenger  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHomeInstantMessengersTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usedFor = null;
        PeopleGetHomeInstantMessengersResponse response = api.getHomeInstantMessengers(ID)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a home phone number.
     *
     * Retrieves a home phone number for the person with the specified ID.  Secured by: Person Data: Home Phone, Self-Service: Home Phone  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHomePhoneTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd response = api.getHomePhone(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of home phone numbers.
     *
     * Retrieves all home phone numbers for the person with the specified ID.  Secured by: Person Data: Home Phone, Self-Service: Home Phone  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHomePhonesTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usedFor = null;
        PeopleGetHomePhonesResponse response = api.getHomePhones(ID)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a home web address.
     *
     * Retrieves a home web address for the person with the specified ID.  Secured by: Person Data: Home Web Address, Self-Service: Home Web Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHomeWebAddressTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        WebAddress33e26848dc0010003893a0202ced0165 response = api.getHomeWebAddress(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of home web addresses.
     *
     * Retrieves all home web addresses for the person with the specified ID.  Secured by: Person Data: Home Web Address, Self-Service: Home Web Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHomeWebAddressesTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usedFor = null;
        PeopleGetHomeWebAddressesResponse response = api.getHomeWebAddresses(ID)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves the legal name instance.
     *
     * Retrieves the legal name for the person with the specified ID.  Secured by: Person Data: Legal Name, Self-Service: Legal Name  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLegalNameTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        Name33e26848dc0010002f1ae76d63ec0061 response = api.getLegalName(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves the legal name instance.
     *
     * Retrieves the legal name for the person with the specified ID.  Secured by: Person Data: Legal Name, Self-Service: Legal Name  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLegalName_0Test() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        PeopleGetLegalNameResponse response = api.getLegalName_0(ID)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves an Audio Name Pronunciation
     *
     * Retrieves a Audio Name Pronunciation of a Person  Secured by: Person Data: Name Pronunciation  Scope: Personal Data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNamePronunciationTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        MediaDownload5d5f0fb1184b10000b16f0e5c20f0000 response = api.getNamePronunciation(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of Audio Name Pronunciations
     *
     * Retrieves all Audio Name Pronunciations of a Person  Secured by: Person Data: Name Pronunciation  Scope: Personal Data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNamePronunciationsTest() throws ApiException {
        String ID = null;
        Boolean currentAudio = null;
        Long limit = null;
        Long offset = null;
        PeopleGetNamePronunciationsResponse response = api.getNamePronunciations(ID)
                .currentAudio(currentAudio)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a person in your Workday tenant.
     *
     * Retrieves a person of the specified ID. You can use the returned ID from GET /people or GET /workers as the ID of the person whose information you want to retrieve. When the person has any person information, for example:home addresses, a hyperlink to the resource of the information will be included in the response.  Secured by: REST API Public  Contains attachment(s)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPersonByIdTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        String universalID = null;
        PeopleGetPersonByIdResponse response = api.getPersonById()
                .limit(limit)
                .offset(offset)
                .universalID(universalID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of personal information.
     *
     * Retrieves all personal information for the person with the specified ID.  Secured by: Person Data: Personal Information, Self-Service: Personal Information  Scope: Personal Data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPersonalInfoTest() throws ApiException {
        String ID = null;
        String country = null;
        Long limit = null;
        Long offset = null;
        PeopleGetPersonalInfoResponse response = api.getPersonalInfo(ID)
                .country(country)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a person&#39;s personal information.
     *
     * Retrieves personal information for the person with the specified ID.  Secured by: Person Data: Personal Information, Self-Service: Personal Information  Scope: Personal Data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPersonalInfo_0Test() throws ApiException {
        String ID = null;
        String subresourceID = null;
        PersonalInformation414c4cee7d91100023fe329d6f900018 response = api.getPersonalInfo_0(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a personal photo.
     *
     * Retrieves a personal photo for the person with the specified ID.  Secured by: Person Data: Personal Photo, Self-Service: Personal Photo  Scope: Personal Data  Contains attachment(s)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPersonalPhotoTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        PersonPhoto6b9baf67ce60100007d43c79e7a30011 response = api.getPersonalPhoto(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of personal photos.
     *
     * Retrieves all personal photos for the person with the specified ID.  Secured by: Person Data: Personal Photo, Self-Service: Personal Photo  Scope: Personal Data  Contains attachment(s)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPersonalPhotosTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        PeopleGetPersonalPhotosResponse response = api.getPersonalPhotos(ID)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves the preferred name instance.
     *
     * Retrieves the preferred name for the person with the specified ID.  Secured by: Person Data: Preferred Name, Self-Service: Preferred Name  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPreferredNameTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        PeopleGetPreferredNameResponse response = api.getPreferredName(ID)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves the preferred name instance.
     *
     * Retrieves the preferred name for the person with the specified ID.  Secured by: Person Data: Preferred Name, Self-Service: Preferred Name  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPreferredName_0Test() throws ApiException {
        String ID = null;
        String subresourceID = null;
        Name33e26848dc0010002f1ae76d63ec0061 response = api.getPreferredName_0(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a person&#39;s public contact information.
     *
     * Retrieves public contact information for the person with the specified ID.  Secured by: REST API Public
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPublicContactInformationTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        PersonPublicRepresentationD8f2aecf3d63100016a77ab413a20235 response = api.getPublicContactInformation(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of public contact information.
     *
     * Retrieves all public contact information for the person with the specified ID.  Secured by: REST API Public
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPublicContactInformation_0Test() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        PeopleGetPublicContactInformationResponse response = api.getPublicContactInformation_0(ID)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a work address.
     *
     * Retrieves a work address for the person with the specified ID.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkAddressTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        AddressReference9c3ab7b846e4100009e5ec55fa530024 response = api.getWorkAddress(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of work addresses.
     *
     * Retrieves all work addresses for the person with the specified ID.  Secured by: Person Data: Work Address, Self-Service: Work Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkAddressesTest() throws ApiException {
        String ID = null;
        LocalDate effective = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usedFor = null;
        PeopleGetWorkAddressesResponse response = api.getWorkAddresses(ID)
                .effective(effective)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a work email address.
     *
     * Retrieves a work email address for the person with the specified ID.  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkEmailTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        EmailReference9c3ab7b846e41000327e788d9664012a response = api.getWorkEmail(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of work email addresses.
     *
     * Retrieves all work email addresses for the person with the specified ID.  Secured by: Person Data: Work Email, Self-Service: Work Email  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkEmailsTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usedFor = null;
        PeopleGetWorkEmailsResponse response = api.getWorkEmails(ID)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a work instant messenger account username.
     *
     * Retrieves a work instant messenger account username for the person with the specified ID.  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkInstantMessengerUsernameTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        InstantMessengerAccount33e26848dc00100036f723337ebb0132 response = api.getWorkInstantMessengerUsername(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of work instant messenger accounts usernames.
     *
     * Retrieves all work instant messenger account usernames for the person with the specified ID.  Secured by: Person Data: Work Instant Messenger, Self-Service: Work Instant Messenger  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkInstantMessengerUsernamesTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usedFor = null;
        PeopleGetWorkInstantMessengerUsernamesResponse response = api.getWorkInstantMessengerUsernames(ID)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a work phone number.
     *
     * Retrieves a work phone number for the person with the specified ID.  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkPhoneTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        PhoneReferenceDf014bc8b5fa10000af0fe7cb0ab00dd response = api.getWorkPhone(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of work phone numbers.
     *
     * Retrieves all work phone numbers for the person with the specified ID.  Secured by: Person Data: Work Phone, Self-Service: Work Phone  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkPhonesTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usedFor = null;
        PeopleGetWorkPhonesResponse response = api.getWorkPhones(ID)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a work web address.
     *
     * Retrieves a work web address for the person with the specified ID.  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkWebAddressTest() throws ApiException {
        String ID = null;
        String subresourceID = null;
        WebAddress33e26848dc0010003893a0202ced0165 response = api.getWorkWebAddress(ID, subresourceID)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a collection of work web addresses.
     *
     * Retrieves all work web addresses for the person with the specified ID.  Secured by: Person Data: Work Web Address, Self-Service: Work Web Address  Scope: Contact Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkWebAddressesTest() throws ApiException {
        String ID = null;
        Long limit = null;
        Long offset = null;
        Boolean primaryOnly = null;
        Boolean publicOnly = null;
        String usedFor = null;
        PeopleGetWorkWebAddressesResponse response = api.getWorkWebAddresses(ID)
                .limit(limit)
                .offset(offset)
                .primaryOnly(primaryOnly)
                .publicOnly(publicOnly)
                .usedFor(usedFor)
                .execute();
        // TODO: test validations
    }

}
