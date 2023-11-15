
## Run 

1) terminal -> mvn clean install
2) extent report = cd target -> allure serve allure-results
3) spark report = test-output folder

RunCucumberTest class -> tags ->

regression = @REGRESSION
ANDROID = @ANDROID
IOS = @IOS


etc...

To run a single scenario, you can @TEST the scenario tag and the run tag.


## Report 
It is created in localhost after the test is complete(allure report) 

## Project Detail


-  The browser can be selected by changing the "browser" variable of the [app.properties](/master/src/test/resources/app.properties) file.

-  For test url selection, change testEnv parameters in [app.properties](/master/src/test/resources/app.properties) file.

-  Gets "url" and "test data" from file [data.json](/master/src/test/resources/data.json)

