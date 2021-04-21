# rest-api

Created my first spring boot application
pushed into git

*got the zip from start.spring.io
*import into intellije

Add to github
*VCS -  enable version control integration - choose git
*commit the files you want to push
*VCS - import into version control - share project on github

Customize your default banner in your spring boot application
* Add banner.txt under src-main-resources
* https://www.kammerl.de/ascii/AsciiSignature.php
* Update the test you want
* Run the application, you can see your test in the terminal

create customer using @postmapping annotation to add new customer.
* Run appilcation
* open postman
* use localhost:8080/customers in post mapping
* add body in json type with customer first name, customer last name and email

Demonstrating @GetMapping
* Run appilcation
* open postman
* add customer using post
* check localhost:8080/customers in get
* check localhost:8080/customers/"customerid" in get
* edit the json

Demonstrating @PutMapping to update customer details based on customerId
* Run appilcation
* open postman
* add customer using post
* use localhost:8080/customers/"customerId" in put
* edit the json

Demonstrating @DeleteMapping to delete customer based on customerId
* Run the application
* Open postman
* add customers
* use localhost:8080/customer/"customerId" in delete

Demonstrating @JsonProperty
* This will change the key value of json as mentioned in the json property annotation instead of the actual variable name


