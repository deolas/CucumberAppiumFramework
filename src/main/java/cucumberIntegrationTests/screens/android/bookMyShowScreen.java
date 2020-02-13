package cucumberIntegrationTests.screens.android;

import UITestFramework.GenericMethods;
import cucumberIntegrationTests.CreateSessionCucumber;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * contains all the locators present on the login Screen
 */
public class bookMyShowScreen extends GenericMethods {

	public bookMyShowScreen(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By letsGetStartedButton = By.id("language_text_view_label");
	public By envSelect = By.xpath("//android.widget.TextView[@text='Pre Prod']");
	
	public By facebookButton = By.id("social_bt_facebook");
	public By skipButton = By.id("launcher_tv_for_skip");
	public By locationHeader = By.id("subtitle_header_main");
	public By movieBanner = By.id("iv_interstitial_card_view_cancel");
	public By searchButton = By.id("imgNotifications");
	public By movieOption = By.xpath("//android.widget.TextView[@text='Movies']");
	
	public By searchTextBox = By.id("edtSearch");
	
	public By searchResults = By.id("search_result_title");

	public By bookTktsButton = By.id("movie_details_activity_lin_bookticket");
	public By movieLang = By.xpath("//android.widget.TextView[@text='Hindi 2D']");
	public By tomorrowDateOption = By.xpath("//*[contains(text(),'Tomorrow')]");
	public By todayOption = By.xpath("//android.widget.TextView[contains(text(),'Today')]");

	public By movieSearchResults = By.xpath("(//android.widget.ScrollView//android.widget.TextView)[3]");
	public By tnCAcceptOption = By.xpath("//android.widget.TextView[@text='Accept']");
	public By numberOfSeats = By.xpath("//android.widget.TextView[@text='How many seats?']/following-sibling::android.widget.TextView[@text='3']");
	public By selectSeatsButton = By.xpath("//android.widget.TextView[@text='Select Seats']");
	
	public By payButton = By.xpath("//android.widget.TextView[@text='Pay ₹ 60.00']");
	public By confirmDetails = By.xpath("//android.widget.TextView[@text='Confirm Details']");
	public By emailAddress = By.xpath("(//android.widget.EditText)[1]");
	public By phoneNumber = By.xpath("(//android.widget.EditText)[2]");
	public By doneButton = By.xpath("//android.widget.TextView[@text='Done']");
	public By totalPayAmnt = By.xpath("//android.widget.TextView[@text='Total Payable Amount']");
	public By netBankingButton = By.xpath("//android.widget.TextView[@text='Net Banking']");
	public By hdfcBankButton = By.xpath("//android.widget.TextView[@text='HDFC Bank']");
	public By hdfcNetBankPage = By.xpath("//android.webkit.WebView[@text='Welcome to HDFC Bank Direct Pay']");
	
}

