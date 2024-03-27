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
import com.konfigthis.client.model.ERRORMODELREFERENCE;
import com.konfigthis.client.model.MULTIPLEINSTANCEMODELREFERENCE;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PromptValuesApi
 */
@Disabled
public class PromptValuesApiTest {

    private static PromptValuesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PromptValuesApi(apiClient);
    }

    /**
     * The set of countries a person is allowed to populated with country specific data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllowedCountryDataTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        String person = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getAllowedCountryData()
                .limit(limit)
                .offset(offset)
                .person(person)
                .execute();
        // TODO: test validations
    }

    /**
     * Exposes prompting for country phone codes, which are used during the collection of phone numbers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCountryPhoneCodesTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getCountryPhoneCodes()
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves instances that can be used as values for other endpoint parameters in this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHereditaryValuesTest() throws ApiException {
        String country = null;
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getHereditaryValues()
                .country(country)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves instances that can be used as values for other endpoint parameters in this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInstancesTest() throws ApiException {
        String country = null;
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getInstances()
                .country(country)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves instances that can be used as values for other endpoint parameters in this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInstances_0Test() throws ApiException {
        String country = null;
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getInstances_0()
                .country(country)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves instances that can be used as values for other endpoint parameters in this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInstances_1Test() throws ApiException {
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getInstances_1()
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves instances that can be used as values for other endpoint parameters in this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInstances_2Test() throws ApiException {
        String country = null;
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getInstances_2()
                .country(country)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves instances that can be used as values for other endpoint parameters in this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInstances_3Test() throws ApiException {
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getInstances_3()
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves instances that can be used as values for other endpoint parameters in this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInstances_4Test() throws ApiException {
        String country = null;
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getInstances_4()
                .country(country)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves instances that can be used as values for other endpoint parameters in this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInstances_5Test() throws ApiException {
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getInstances_5()
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves instances that can be used as values for other endpoint parameters in this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOptionsTest() throws ApiException {
        String country = null;
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getOptions()
                .country(country)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves instances that can be used as values for other endpoint parameters in this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOptions_0Test() throws ApiException {
        String country = null;
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getOptions_0()
                .country(country)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves instances that can be used as values for other endpoint parameters in this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOptions_1Test() throws ApiException {
        String country = null;
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getOptions_1()
                .country(country)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Exposes prompting for phone device types, which are used during the collection of phone numbers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPhoneDeviceTypesTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getPhoneDeviceTypes()
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves instances that can be used as values for other endpoint parameters in this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTitleComponentsTest() throws ApiException {
        String country = null;
        Long limit = null;
        Long offset = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.getTitleComponents()
                .country(country)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * The set of countries a person has populated with country specific data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCountryDataTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        String person = null;
        MULTIPLEINSTANCEMODELREFERENCE response = api.listCountryData()
                .limit(limit)
                .offset(offset)
                .person(person)
                .execute();
        // TODO: test validations
    }

}
