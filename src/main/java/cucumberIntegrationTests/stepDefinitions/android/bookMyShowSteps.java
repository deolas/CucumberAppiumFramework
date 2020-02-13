package cucumberIntegrationTests.stepDefinitions.android;

import java.util.List;
import java.util.Properties;

//import UITestFramework.CreateSession;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberIntegrationTests.CreateSessionCucumber;
import cucumberIntegrationTests.screens.android.bookMyShowScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class bookMyShowSteps {
    
	public CreateSessionCucumber createSessionCucumber;
	public AppiumDriver<MobileElement> driver = null;
	String platform;
	public bookMyShowScreen bookMyShowScreen;
	Properties configFileObject;
	String userName;
	String password;

	@Given("^User has BookMyShow \"([^\"]*)\" app$")
	public void userHasBookMyShowshareApp(String invokeDriver) throws Exception {

		platform = invokeDriver;
		createSessionCucumber = new CreateSessionCucumber();
		createSessionCucumber.createDriver(invokeDriver,
				bookMyShowSteps.class.getDeclaredMethod("userHasBookMyShowshareApp", String.class));
		driver = createSessionCucumber.getWebDriver();

		bookMyShowScreen = new bookMyShowScreen(driver);

		configFileObject = CreateSessionCucumber.localeConfigProp;
	}

	@When("^User selects \"([^\"]*)\" environment")
	public void userEntersCredentials(String env) {
		bookMyShowScreen.waitForVisibility(bookMyShowScreen.envSelect);
		bookMyShowScreen.findElement(bookMyShowScreen.envSelect).click();

	}

	@And("^User navigates to Home Page")
	public void navigatesToHomePage() {
		bookMyShowScreen.waitForVisibility(bookMyShowScreen.letsGetStartedButton);
		bookMyShowScreen.findElement(bookMyShowScreen.letsGetStartedButton).click();
		bookMyShowScreen.waitForVisibility(bookMyShowScreen.facebookButton);
		bookMyShowScreen.findElement(bookMyShowScreen.skipButton).click();
		bookMyShowScreen.waitForVisibility(bookMyShowScreen.locationHeader);
		bookMyShowScreen.waitForInvisibility(bookMyShowScreen.movieBanner);

	}

	@When("^user search \"([^\"]*)\" movie name$")
	public void user_search_movie_name(String movieName) throws Throwable {
		bookMyShowScreen.waitForVisibility(bookMyShowScreen.searchButton);
		bookMyShowScreen.findElement(bookMyShowScreen.searchButton).click();

		bookMyShowScreen.waitForVisibility(bookMyShowScreen.searchTextBox);
		bookMyShowScreen.findElement(bookMyShowScreen.movieOption).click();
		bookMyShowScreen.findElement(bookMyShowScreen.searchTextBox).sendKeys(movieName);
		bookMyShowScreen.waitForVisibility(bookMyShowScreen.searchResults);
	}

	@When("^taps on Book Tickets button for \"([^\"]*)\" movie$")
	public void taps_on_Book_Tickets_button(String movie) throws Throwable {
		List<MobileElement> searchResults = bookMyShowScreen.findElements(bookMyShowScreen.searchResults);

		for (MobileElement mbl : searchResults) {
			if (mbl.getText().equals(movie)) {
				mbl.click();
			}
		}

		bookMyShowScreen.waitForVisibility(bookMyShowScreen.bookTktsButton);
		bookMyShowScreen.findElement(bookMyShowScreen.bookTktsButton).click();
	}

	@Then("^user should be able to select Movie show time$")
	public void user_should_be_able_to_select_Movie_show_time() throws Throwable {
		bookMyShowScreen.waitForVisibility(bookMyShowScreen.movieLang);

		bookMyShowScreen.tap(0.5, 0.5);
		bookMyShowScreen.findElement(bookMyShowScreen.movieSearchResults).click();
	}

	@Then("^user should be able to select (\\d+) movie seats$")
	public void user_should_be_able_to_select_movie_seats(int arg1) throws Throwable {
		bookMyShowScreen.waitForVisibility(bookMyShowScreen.tnCAcceptOption);
		bookMyShowScreen.findElement(bookMyShowScreen.tnCAcceptOption).click();

		bookMyShowScreen.waitForVisibility(bookMyShowScreen.selectSeatsButton);
		bookMyShowScreen.findElement(bookMyShowScreen.numberOfSeats).click();
		bookMyShowScreen.findElement(bookMyShowScreen.selectSeatsButton).click();

		bookMyShowScreen.tap(0.5, 0.8);

		bookMyShowScreen.tap(0.5, 0.9);
	}

	@Then("^user should able to provide email \"([^\"]*)\" and phone number \"([^\"]*)\"$")
	public void user_should_able_to_provide_email_and_phone_number(String email, String mobile) throws Throwable {
		bookMyShowScreen.waitForVisibility(bookMyShowScreen.confirmDetails);
		bookMyShowScreen.findElement(bookMyShowScreen.emailAddress).sendKeys(email);
		bookMyShowScreen.findElement(bookMyShowScreen.phoneNumber).sendKeys(mobile);
		bookMyShowScreen.findElement(bookMyShowScreen.doneButton).click();
	}

	@Then("^user should able to pay through HDFC net banking$")
	public void user_should_able_to_pay_through_HDFC_net_banking() throws Throwable {
		bookMyShowScreen.waitForVisibility(bookMyShowScreen.totalPayAmnt);

		bookMyShowScreen.horizontalVerticalSwipe(0.5, 0.8, 0.5, 0.3);

		bookMyShowScreen.findElement(bookMyShowScreen.netBankingButton).click();
		bookMyShowScreen.waitForVisibility(bookMyShowScreen.hdfcBankButton);
		bookMyShowScreen.findElement(bookMyShowScreen.hdfcBankButton).click();
		bookMyShowScreen.waitForVisibility(bookMyShowScreen.hdfcNetBankPage);
	}

   
}
