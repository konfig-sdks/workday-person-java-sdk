package com.konfigthis.client;

import com.konfigthis.client.api.PromptValuesApi;
import com.konfigthis.client.api.CountriesApi;
import com.konfigthis.client.api.HomeContactInformationChangesApi;
import com.konfigthis.client.api.PeopleApi;
import com.konfigthis.client.api.PhoneValidationApi;
import com.konfigthis.client.api.WorkContactInformationChangesApi;

public class WorkdayPerson {
    private ApiClient apiClient;
    public final PromptValuesApi promptValues;
    public final CountriesApi countries;
    public final HomeContactInformationChangesApi homeContactInformationChanges;
    public final PeopleApi people;
    public final PhoneValidationApi phoneValidation;
    public final WorkContactInformationChangesApi workContactInformationChanges;

    public WorkdayPerson() {
        this(null);
    }

    public WorkdayPerson(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.promptValues = new PromptValuesApi(this.apiClient);
        this.countries = new CountriesApi(this.apiClient);
        this.homeContactInformationChanges = new HomeContactInformationChangesApi(this.apiClient);
        this.people = new PeopleApi(this.apiClient);
        this.phoneValidation = new PhoneValidationApi(this.apiClient);
        this.workContactInformationChanges = new WorkContactInformationChangesApi(this.apiClient);
    }

}
