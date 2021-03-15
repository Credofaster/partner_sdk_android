/*
 * CredofasterPartnerApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ke.co.credofaster.partner.apitest;

import ke.co.credofaster.partner.apitest.controllers.*;
import ke.co.credofaster.partner.apitest.http.client.HttpClient;

public class CredofasterPartnerApiClient {
    /**
     * Singleton access to Main controller
     * @return	Returns the MainController instance 
     */
    public MainController getMain() {
        return MainController.getInstance();
    }

    /**
     * Singleton access to Events controller
     * @return	Returns the EventsController instance 
     */
    public EventsController getEvents() {
        return EventsController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public CredofasterPartnerApiClient() {
        Configuration.apiKey = "XXXX-XXXX-XXXX-XXXX";
        Configuration.clientId = "ABCDEDFG1234";
    }

    /**
     * Client initialization constructor 
     */     
    public CredofasterPartnerApiClient(String apiKey, String clientId) {
        this();
        if(apiKey != null) Configuration.apiKey = apiKey;
        if(clientId != null) Configuration.clientId = clientId;
    }
}