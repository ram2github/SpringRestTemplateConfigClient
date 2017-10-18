# SimpleRestTemplateConfigClient
An exposed Quote Micro Service calls an external SpringBoot QuotesMS for building the final response
This example exposes a REST API to get Quote
 when you type http://localhost:9000/quote/ in the browser URL,
  - an external Microservice is invoked to fetch a random quote on Spring boot
  - some meta data ( like sender ID and timestamp) are added to the final Response (Quote Object)
This example illustrates
 - usage of SpringBoot application
 - usage of AutoWiring of singletons ( RestTemplates and RestTeamplate Builders)
 - usage Jackson libraries to 'bind' JSON response to custom 'Quote' and 'Value' objects
 - how @JsonIgnoreProperties(ignoreUnknown = true) is used to NOT error out during the binding step when extra attributes are present in the custom Object Type
 - loading custom properties from Config Server
 - application name = name of property file
 - usage of boot strap.yml


