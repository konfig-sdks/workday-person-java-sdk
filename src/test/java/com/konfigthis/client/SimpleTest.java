package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://<tenantHostname>/person/v4";
        
        // Configure OAuth2 access token for authorization: OAuth2
        configuration.accessToken = "YOUR ACCESS TOKEN";
        WorkdayPerson client = new WorkdayPerson(configuration);
        assertNotNull(client);
    }
}
