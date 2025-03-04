public class SeleniumConcepts {

    SeleniumConcepts Concepts;


//    Opening and Closing Browsers
//
//    WebDriver driver = new ChromeDriver(); // Open Chrome
//      driver.get("https://www.example.com"); // Navigate to URL
//      driver.quit(); // Close all browser windows
//      driver.close(); // Close the current browser window
//
//    Element Interaction
//
//      driver.findElement(By.id("username")).sendKeys("testuser"); // Enter text
//      driver.findElement(By.name("submit")).click(); // Click a button
//      driver.findElement(By.linkText("Home")).click(); // Click a link
//      driver.findElement(By.xpath("//div[@class='message']")).getText(); // Get text
//
//    Navigation
//
//      driver.navigate().to("https://www.newsite.com"); // Navigate to a new URL
//      driver.navigate().back(); // Go back to the previous page
//      driver.navigate().forward(); // Go forward to the next page
//      driver.navigate().refresh(); // Refresh the current page
//
//    Window and Frame Handling
//
//      driver.switchTo().window("windowName"); // Switch to a specific window
//      driver.switchTo().frame("frameId"); // Switch to a frame
//  	driver.switchTo().defaultContent(); // Switch back to the main content
//
//    Browser Management
//
//      driver.manage().window().maximize(); // Maximize the browser window
//      driver.manage().window().fullscreen(); // Set full-screen mode
//      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Set  implicit wait
//
//    Mouse and Keyboard Actions
//
//    Actions actions = new Actions(driver);
//      actions.moveToElement(element).click().build().perform(); // Move to and click
//      actions.doubleClick(element).perform(); // Double-click
//      actions.dragAndDrop(source, target).perform(); // Drag and drop
//      actions.sendKeys(element, "text").perform(); // Send keystrokes
//
//    Assertions
//
//      Assert.assertTrue(element.isDisplayed()); // Assert element visibility
//      Assert.assertEquals(driver.getTitle(), "Expected Title"); // Assert title
//
//    By default these are hard assertions, means if these fail then tests will be  exited or stopped
//
//    Soft Assertions
//
//      SoftAssert softAssert = new SoftAssert();
//      softAssert.assertEquals(ActualTitle, ExpectedTitle); // Soft assert applied to verify title
//      softAssert.assertAll();
//
//    By default these assertions, do not stop if these assertions fail & are reported  in your test reports
//
//    Explicit Wait
//
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      wait.until(ExpectedConditions.elementToBeClickable(element)); // Explicit wait
//
//      These are conditional waits & can be applied to satisfy a particular condition, then  continue test execution if condition met or failed if not met in mentioned amount of time
//
//     Implicit Wait
//
//         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//      Once the command is run, Implicit Wait remains for the entire duration for which  the browser is open.
//      Its default setting is 0, and the specific wait time needs to be  set by the following protocol.
//
//      Implicit wait increases test script execution time
//
//          Fluent Wait - looks for a web element repeatedly at regular intervals until timeout happens or until the object is found
//
//          FluentWait wait = new FluentWait(driver);
//
//      Specify the timeout of the wait
//         wait.withTimeout(5000, TimeUnit.MILLISECONDS);
//
//      Specify polling time
//          wait.pollingEvery(250, TimeUnit.MILLISECONDS);
//
//      Specify what exceptions to ignore
//          wait.ignoring(NoSuchElementException.class)
//
//      This is how we specify the condition to wait on.
//            wait.until(ExpectedConditions.alertIsPresent());
//
//
//    Alerts
//
//      Alert alert = driver.switchTo().alert();
//      alert.accept(); // Accept an alert
//      alert.dismiss(); // Dismiss an alert
//      alert.sendKeys("text"); // Send text to an alert
//
//
//    Getting Page Information
//
//      driver.getTitle(); // Get the page title
//      driver.getCurrentUrl(); // Get the current URL
//      driver.getPageSource(); // Get the entire page source code
//      element.isDisplayed(); // Check if an element is visible
//      element.isEnabled(); // Check if an element is enabled
//      element.isSelected(); // Check if an element is selected
//      element.getAttribute("attribute_name"); // Get an element's attribute value
//      element.getTagName(); // Get an element's tag name
//
//    Menu Handling
//
//    Select select = new Select(element); // Create a Select object for dropdowns
//      select.selectByIndex(1); // Select an option by index
//      select.selectByValue("option2"); // Select an option by value
//      select.selectByVisibleText("Option 3"); // Select an option by visible text
//
//    Keyboard Actions
//
//      actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); // Ctrl+A
//      actions.keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).perform(); //  Type "HELLO"
//      actions.sendKeys(Keys.ENTER).perform(); // Press Enter
//
//    Mouse Actions
//
//      actions.contextClick(element).perform(); // Right-click
//      actions.clickAndHold(element).perform(); // Click and hold
//      actions.release(element).perform(); // Release the mouse button
//
//    Taking Screenshot
//
//    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//    Switching to Iframes
//
//      driver.switchTo().frame("iframe_name");
//
//    Scrolling
//
//    JavascriptExecutor js = (JavascriptExecutor)driver;
//     js.executeScript("window.scrollTo(0, 1000)");
//    Actions actions = new Actions(driver);
//
//    Scroll down a specific distance
//      actions.moveToElement(element).clickAndHold().moveByOffset(0,  500).release().build().perform();
//
//    Cookie Management
//
//    //Get all cookies
//    Set<Cookie> cookies = driver.manage().getCookies();
//    //Get a specific cookie
//    Cookie cookie = driver.manage().getCookieNamed("cookie_name");
//
//     Add a cookie
//      driver.manage().addCookie(new Cookie("cookie_name",  "cookie_value"));
//
//      Delete a cookie
//      driver.manage().deleteCookieNamed("cookie_name");
//
//    Delete all cookies
//      driver.manage().deleteAllCookies();
//
//
//    Alert Handling (Extended)
//
//     Dismiss an alert
//      alert.dismiss();
//
//    Get alert text:
//      String alertText = alert.getText();
//
//
//    Page Source Interactions
//
//    Find elements in page source:
//      List<WebElement> elements =  driver.findElements(By.xpath("//*"));
//
//    Execute JavaScript code:
//      JavascriptExecutor js = (JavascriptExecutor)driver;  js.executeScript("document.getElementById('myElement').click();");
//
//    Advanced Navigation
//
//      Refresh the page with hard reload:
//          driver.navigate().refresh(true);
//
//    Navigate to a page relative to the current URL:
//            driver.navigate().to("new_page.html");
//
//    Logging and Reporting
//
//      Enable logging
//      System.setProperty("webdriver.chrome.logfile",  "chromedriver.log");
//
//    Create custom test reports
//    Utilize third-party libraries like ExtentReports or Allure  or TestNG reports
//
//    ExtentReports extent = new ExtentReports();
//    ExtentTest test = extent.createTest("MyTest");
//
//      Start test logging
//        test.log(Status.INFO, "Test Started");
//        test.pass("Test Passed");
//
//       Flush report
//      extent.flush();
//
//    Headless Mode
//
//    Run tests without a visible browser:
//    ChromeOptions options = new  ChromeOptions();
//     options.addArguments("--headless");
//    WebDriver driver = new ChromeDriver(options);
//
//
//    Setting browser capabilities
//
//    ChromeOptions options = new ChromeOptions();
//     options.addArguments("--start-maximized");
//    WebDriver driver = new ChromeDriver(options)
//
//    Disabling images
//
//  options.addArguments("--disable-images");
//
//    Enabling experimental features
//  options.setExperimentalOption("useAutomationExtension", false);
//
//
//    Uploading Files
//
//    //Using sendKeys() for file uploads:
//    WebElement uploadElement = driver.findElement(By.id("upload"));  uploadElement.sendKeys("C:\\path\\to\\file.txt");
//
//
//    Handling Shadow DOM Elements
//
//    //Using executeScript() to interact with shadow DOM:
//    JavascriptExecutor js = (JavascriptExecutor)driver;
//    WebElement shadowRoot = (WebElement)js.executeScript("return  document.querySelector('shadow-host').shadowRoot");
//    WebElement element = shadowRoot.findElement(By.id("element-inside-shadow-dom"));
//
//
//    Cross-Browser Testing:
//
//    //Using different WebDriver implementations for various browsers:
//    WebDriver driver = new FirefoxDriver();
//    WebDriver driver = new EdgeDriver();
//
//    Different Browser Options
//
//    ChromeOptions options = new ChromeOptions();
//      options.setCapability("browserName", "chrome");
//      options.setCapability("version", "104.0");
//      options.setCapability("platformName", "Windows 10");
//      options.addArguments("--start-maximized");
//      options.setCapability("acceptInsecureCerts", true);
//      WebDriver driver = new ChromeDriver(options);






//    RestAssured Cheat Sheet




//    Static Imports - Project Configuration: Typically involves adding the RestAssured dependency to your project (e.g., in a Maven pom.xml or Gradle build.gradle).
//    Static Imports: Allows you to write tests in a more readable “given-when-then” style.
//
//      import static io.restassured.RestAssured.*;
//      import static io.restassured.matcher.RestAssuredMatchers.*; import static org.hamcrest.Matchers.*;
//
//    Get Request
//    given().queryParam("key", "value") .when().get("/endpoint")
//.then().statusCode(200)
//.body("key", equalTo("expectedValue"));
//
//    POST Request
//    given().header("Content-Type", "application/json") .body("{\"name\":\"John\"}")
//.when().post("/endpoint")
//.then().statusCode(201).body("id", notNullValue());
//
//    Request Specification -Why Use It: Helps you avoid repetitive code by setting common details like base URL, headers, and timeouts in one place.
//
//    RestAssured.baseURI = "https://api.example.com"; Rest Assured.basePath = "/v1";
//
//    Using Request Specification
//    RequestSpecification requestSpec = new RequestSpecBuilder().setBaseUri("https://api.exam
//            ple.com").addHeader("Authorization", "Bearer
//            token").build();
//            given().spec(requestSpec).when().get("/endpoint").
//                    then().statusCode(200);
//
//    Handling Response
//    Response Body: Could be in JSON, XML, or another format; you’ll typically parse or validate key values.
//            Response response =given().when().get("/endpoint");
//
//    OAuth2
//    given().auth().oauth2("your_oauth2_token
//                          String jsonResponse = response.asString();").when().get("/endpoint").then().statusCo int statusCode = response.getStatusCode(); de(200);
//
//    Validating Response
//    Critical Step: Ensures that the API is returning the expected code (e.g., 200, 201, 404, etc.).
//    when().get("/endpoint") .then().statusCode(200) .body("name", equalTo("John")) .body("age", greaterThan(20));
//
//    Query Parameters -Usage: Useful for filtering or searching data, like ?userId=123.
//    Parameter Types: Can be single values or multiple values (e.g., arrays)
//
//    given().queryParam("param1", "value") queryParam("param2", "value2") .when().get("/endpoint") .then().statusCode(200);
//
//    Path Parameters given().pathParam("id", 123) .when().get("/endpoint/{id}") .then().statusCode(200);
//
//    DeSerialize Response POJO
//    User user = given().when().get("/endpoint") .then().extract().as(User.class);
//
//    Sending JSON Body
//
//    Map<String, String> jsonBody = new HashMap<>(); jsonBody.put("name", "John");
//jsonBody.put("age", "30");
//    given().header("Content-Type", "application/json") .body(jsonBody).when().post("/endpoint")
//.then().statusCode(201);
//
//    Serialize POJO to JSON
//    Serialization: Converting your Java objects into JSON (or another format) before sending them in a request.
//    Deserialization: Taking the JSON (or other format) response and converting it back into Java objects to assert values in tests.
//    Why It’s Important: Helps ensure that your data is consistent between test code and API requests/responses.
//
//            User user = new User("John", 30);
//    given().contentType("application/json") .body(user).when().post("/endpoint") .then().statusCode(201);
//
//    Basic Authentication- Basic Auth: Usually requires a username and password.
//    OAuth2: Involves tokens that you include in your request to access protected resources
//
//    given().auth().basic("username", "password").when().get("/endpoint").then(
//    ).statusCode(200);







//    BDD






//    BDD or behavior-driven development, in which an application is specified and  designed by describing how it behaves. BDD offers the ability to enlarge the pool  of input and feedback to include business stakeholders and end users like Scrum  Master, Product Owner, Business Analyst etc., who may not even have software  development knowledge.
//
//    Cucumber
//    Software tool based on Behavior Driven Development (BDD) framework which is  used to write acceptance tests for the web application. The tests are written in  easily readable and understandable format for Business Analysts, Developers and  Testers.
//
//    Features of BDD
//    Shifting from thinking in "tests" to thinking in "behavior"
//    Collaboration between Business stakeholders, Business Analysts, QA Team and  developers
//    Driven by Business Value
//    Extends Test-Driven Development (TDD) by utilizing natural language that non technical stakeholders can understand
//    BDD frameworks such as Cucumber or JBehave are an enabler, acting a "bridge"  between Business & Technical Language
//    BDD is popular and can be utilized for Unit level test cases and for UI level test  cases.
//    Feature
//    The Feature keyword's aim is to collect relevant scenarios and provide a high level description of a software feature.
//    Scenario
//    The scenarios are written based on the expected behavior of the software and it  is tested to check if it matches said scenarios.
//    Step
//    Each line in a scenario is called a step
//            Given
//    Describes the initial steps of pre-condition before the start of a test
//            When
//    Describes user actions during a test or steps performed
//            Then
//    Describes test results or outcome from When actions
//    And
//    Between any two statements, it gives the logical AND condition. AND can be  combined with the GIVEN, WHEN, and THEN statements
//            But
//    It denotes a logical OR relationship between two propositions. OR can be  combined with the GIVEN, WHEN, and THEN statements
//            Background
//    The Background section describes any common context to be established before  each scenario.
//            Step Definitions
//    Cucumber scenarios become automated tests with the addition of what are  called step definitions. A step definition is a block of code associated with one or  more steps by a regular expression
//    Example
//    This is a practical illustration of a business rule. It comprises a series of steps.
//    Scenario Outline
//    The scenario outline is similar to scenario, with the exception that several inputs  are provided.
//    tags
//    Tags in cucumber provide a way to run scenarios in a specific sequence from a  runner file. Each situation can be labeled with a useful tag. Later, in the runner  file, user may specify which tag (and hence which scenario(s)) Cucumber should  run. “@” is the first character in a tag. Any relevant content after "@" can be  used to define your tag.
//            Example - "@SmokeTest"
//
//
//
//    hooks
//    Hooks are code blocks that execute before or after each Cucumber scenario in  the execution cycle. This enables us to better control the development workflow  and decrease code redundancy. Setting up the web driver and terminating the  web driver session resembles a test setup. The methods @Before and @After can be used to define hooks anywhere in the project or step definition layers. Before  hook is executed before any other test situations, and after the hook is executed  after all test scenarios have been completed.
//            Feature File
//    It has plain text descriptions of single or numerous test situations. Keywords like  Then, When, Background, Scenario Outline, Feature, And, But, and so on are used in the tests. As a result, it's a file that keeps track of features and their  descriptions.
//    Step Definition File
//    It essentially acts as a translator between the test scenario steps provided in the  feature file and the automation code. Cucumber searches the step definition file  and executes the relevant functions that are assigned to that step when it runs a  step described in the feature file.
//            TestRunner
//    It connects the feature file and the step definition file. It allows the user to run  one or more feature files at the same time. It contains the locations of the step  definition and feature files
//    Prerequisite required  for using Cucumber
//    Step 1: Download and install the Java platform on user machine Step 2: Download and install Eclipse IDE
//    Step 3: Download Cucumber Eclipse Plugin:
//    a. In the eclipse, navigate to Help > Install New Software. Copy the URL  "http://cucumber.github.io/cucumber-eclipse/update-site/" and press Enter. b. User would see a checkbox named "Cucumber Eclipse Plugin", Select the  checkbox ‘Cucumber Eclipse Plugin’.
//    c. Click ‘Next’
//    d. Again click ‘Next’ and Accept the license terms.
//            e. Click Finish
//    f. Click ‘Install anyway’
//    g. Click ‘Restart Now’
//    Step 4: Create a Maven Project in Eclipse
//    Step 5: Open the pom.xml file in eclipse and the below dependency after  navigating to Maven Repository "https://mvnrepository.com/" a. cucumber-java
//    b. cucumber-core
//    c. cucumber-junit
//
//

//    Cucumber Maven  Dependency
//            <dependency>
// <groupId>io.cucumber</groupId>
// <artifactId>cucumber-core</artifactId>
// <version>7.0.0</version>
//</dependency>
//
// <dependency>
// <groupId>io.cucumber</groupId>
// <artifactId>cucumber-java</artifactId>
// <version>7.0.0</version>
//</dependency>
// <dependency>
// <groupId>io.cucumber</groupId>
// <artifactId>cucumber-junit</artifactId>
// <version>7.0.0</version>
// <scope>test</scope>
//</dependency>
//    Sample Feature File
//    Feature: Search in Google Home Page
//    Scenario: Search Cucumber Tutorial
//
//    Given Google Page open
//    And Search Text Box should be present in the Google Home Page  When User Search a Course with keyword Cucumber Tutorial  And Hit Enter Button
//    Then All Courses related to Cucumber Tutorial should be displayed
//    Sample Step
//    Definitions Class
//    public class GoogleSearchEngine {
//        @Given("Google Page open")
//        public void google_page_open() {
//        }
//        @Given("Search Text Box should be present in the Google Home Page")  public void search_text_box_should_be_present_in_the_google_home_page() {    }
//        @When("User Search a Course with keyword Cucumber Tutorial")  public void user_search_a_course_with_keyword_cucumber_tutorial() {    }
//        @When("Hit Enter Button")
//        public void hit_enter_button() {
//        }
//        @Then("All Courses related to Cucumber Tutorial should be displayed")  public void all_courses_related_to_cucumber_tutorial_should_be_displayed() {    }
//
//
//
//        Sample Runner Class
//        @RunWith(Cucumber.class)
//        @CucumberOptions(
//                features = ("src/test/java/Features"),
//                glue = ("StepDefinitions"),
//                plugin = ("pretty"),
//                monochrome = true
//        )
//        public class Runner {
//        }
//        Sample Cucumber  Hooks
//        @Before Hook: It will execute before every scenario. Example
//        @Before
//        public void setUp() {
//            System.out.println("Starting the test");
//        }
//        @After Hook: It will execute after every scenario.
//        @After
//        Public void tearDown () {
//            System.out.println("Closing the test");
//        }
//        Sample Scenario
//        Outline Example
//        Feature: Facebook Login
//        Scenario Outline: To check the login functionality for the facebook site  Given User Navigates to the Facebook Login Page
//        When User Enter <username> as UserName and <password> as Password  Then Login should be <status> for Facebook
//        Examples:
//                | username | password | status |
//                | username1 | password1 | Successful |
//                | username1 | password2 | Unsuccessful |
//                | username2 | password3 | Unsuccessful |
//        Sample Cucumber  Tags and Background
//        Feature: Search in Google Home Page
//        Background:
//        Given Google Home Page Open
//        And Search Text Box is visible and Enabled
//        @Smoke @Regression
//        Scenario: Search Cucumber Tutorial in Google Home Page
//        When User Search a Course with Keyword Cucumber Tutorial  And Hit Enter
//        Then All Courses related to Cucumber Tutorial should be displayed
//        @Regression @Integration
//        Scenario: Search Java Tutorial in Google Home Page
//        When User Search a Course with Keyword Java Tutorial
//        And Hit Enter
//        Then All Courses related to Java Tutorial should be displayed
//
//
//
//        Sample Runner Class  to accommodate tags
//        @RunWith(Cucumber.class)
//        @CucumberOptions(
//                features = ("src/test/java/Features"),
//                glue = ("StepDefinitions"),
//                //tags = ("@Integration"),
//                //tags = ("not @Integration"),
//                tags = ("@Integration or @UAT"),
//                // tags = ("@Integration and @Regression"),
//                publish = true,
//                plugin = ("pretty"),
//                monochrome = true
//        )
//        public class Runner {
//        }
//        Sample Runner Class  to accommodate  reports
//        @RunWith(Cucumber.class)
//        @CucumberOptions(
//                features = ("src/test/java/Features"),
//                glue = ("StepDefinitions"),
//                tags = ("@UAT"),
//                publish = true,
//                plugin = ("pretty"),
//                //plugin = {"pretty", "html:target/html-reports/report.html", "junit:target/junit reports/", "junit:target/xml-reports/report.xml", "json:target/json reports/report.json"},
//                //plugin = {"pretty", "html:target/html-reports/report.html"},
//                monochrome = true
//        )
//        public class Runner {
//        }

    }
