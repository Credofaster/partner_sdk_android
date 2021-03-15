# Getting started

Buy Airtime on the most simplistic System. We abstract all the nitty-gritty leaving you with just the option to specify the account number to receive airtime and how much. 

We guarantee 95% uptime, 99% reliability.

Just Request and we will make sure you get, in realtime. If not, you will be notified immediately by events.

Now, what Credo is faster that Credofaster!

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

* Browse to locate the folder containing the source code. Select the location of the CredofasterPartnerApi gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

## How to Use

The following section explains how to use the CredofasterPartnerApi library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

In the following step first navigate to the ``` SampleApplication > settings.gradle ``` file and add the line
```include ':CredofasterPartnerApiLib'```

Then navigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line 
```implementation project(path: ':CredofasterPartnerApiLib')```
to the dependencies section as shown in the illustration below. Also add the following packagingOptions.

packagingOptions
    exclude 'META-INF/LICENSE'
    exclude 'META-INF/NOTICE'
    exclude 'META-INF/DEPENDENCIES'
}

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=Credofaster%20Partner%20Api&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > CredofasterPartnerApiLib > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| apiKey | Assigned APIKey |
| clientId | Assigned ClientId |



API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java
// Configuration parameters and credentials
String apiKey = "XXXX-XXXX-XXXX-XXXX"; // Assigned APIKey
String clientId = "ABCDEDFG1234"; // Assigned ClientId

ke.co.credofaster.partner.apitest.Configuration.initialize(appContext);
CredofasterPartnerApiClient client = new CredofasterPartnerApiClient(apiKey, clientId);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [MainController](#main_controller)
* [EventsController](#events_controller)

## <a name="main_controller"></a>![Class: ](https://apidocs.io/img/class.png "ke.co.credofaster.partner.apitest.controllers.MainController") MainController

### Get singleton instance

The singleton instance of the ``` MainController ``` class can be accessed from the API Client.

```java
MainController main = client.getMain();
```

### <a name="airtime_request_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.credofaster.partner.apitest.controllers.MainController.airtimeRequestAsync") airtimeRequestAsync

> Request Airtime Purchase


```java
void airtimeRequestAsync(
        final PartnerAirtimeRequest request,
        final APICallBack<List<PartnerAirtimeResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    PartnerAirtimeRequest request = new PartnerAirtimeRequest();
    // Invoking the API call with sample inputs
    main.airtimeRequestAsync(request, new APICallBack<List<PartnerAirtimeResponse>>() {
        public void onSuccess(HttpContext context, List<PartnerAirtimeResponse> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="airtime_balance_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.credofaster.partner.apitest.controllers.MainController.airtimeBalanceAsync") airtimeBalanceAsync

> Gets the current Working Balance. 
> Balance is SIGNED


```java
void airtimeBalanceAsync(final APICallBack<PartnerAirtimeBalanceResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
main.airtimeBalanceAsync(new APICallBack<PartnerAirtimeBalanceResponse>() {
    public void onSuccess(HttpContext context, PartnerAirtimeBalanceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="events_controller"></a>![Class: ](https://apidocs.io/img/class.png "ke.co.credofaster.partner.apitest.controllers.EventsController") EventsController

### Get singleton instance

The singleton instance of the ``` EventsController ``` class can be accessed from the API Client.

```java
EventsController events = client.getEvents();
```

### <a name="register_callback_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.credofaster.partner.apitest.controllers.EventsController.registerCallbackAsync") registerCallbackAsync

> A callback to receive the below Callbacks


```java
void registerCallbackAsync(
        final RegisterCallbackRequest request,
        final APICallBack<RegisterCallbackResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    RegisterCallbackRequest request = new RegisterCallbackRequest();
    // Invoking the API call with sample inputs
    events.registerCallbackAsync(request, new APICallBack<RegisterCallbackResponse>() {
        public void onSuccess(HttpContext context, RegisterCallbackResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="client_event_feedback_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.credofaster.partner.apitest.controllers.EventsController.clientEventFeedbackAsync") clientEventFeedbackAsync

> *Tags:*  ``` Skips Authentication ``` 

> You are required to provide a HTTP/HTTPS endpoint, to which we will publish various events. 
> 
> This Endpoint will be hosted on the CLIENT's Environment. If no endpoint is provided, we are not liable to any missing events. 
> 
> NOTE: A DETAILED PDF of all Events is shared on request. It contains application events, System Health Events and Alerts on the same.


```java
void clientEventFeedbackAsync(
        final EventCallbackPayload payloadToReceive,
        final APICallBack<EventCallbackFeedback> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| payloadToReceive |  ``` Required ```  | Sample Payload: {"EventId":"123456789","EventType":"QUEUED","RequestId":"A09797a11e2564061b859781b18bb34dd","EventData":{}} |


#### Example Usage

```java
try {
    String payloadToReceiveValue = "{\"EventId\":\"123456789\",\"EventType\":\"QUEUED\",\"RequestId\":\"A09797a11e2564061b859781b18bb34dd\",\"EventData\":{}}";
    EventCallbackPayload payloadToReceive = mapper.readValue(payloadToReceiveValue,new TypeReference<EventCallbackPayload> (){});
    // Invoking the API call with sample inputs
    events.clientEventFeedbackAsync(payloadToReceive, new APICallBack<EventCallbackFeedback>() {
        public void onSuccess(HttpContext context, EventCallbackFeedback response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)



