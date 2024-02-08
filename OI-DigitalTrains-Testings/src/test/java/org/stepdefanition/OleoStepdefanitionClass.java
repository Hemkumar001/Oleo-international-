package org.stepdefanition;


import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.baseclass.OleoBaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojo.OleoPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OleoStepdefanitionClass extends OleoBaseClass {

	// login functionality


	@Given("User have to enter digital trains login chrome browser")
	public void user_have_to_enter_digital_trains_login_chrome_browser() throws InterruptedException {
		launchChromeBrowser();
		wait5seconds();
		launchURL("https://testphp.digitaltrains.online/");
		wait1Seconds();
		screenMaximize();
		implicitWait();
		wait1Seconds();
		o=new OleoPojo();
	
	}

	public static OleoPojo o;

	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String email, String password) throws InterruptedException {
		o=new OleoPojo();
		sendKeys(o.getLoginusername(), email);
		wait1Seconds();
		sendKeys(o.getLoginpassword(), password);
		wait1Seconds();
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
		o=new OleoPojo();
		elementClick(o.getLoginrmember());
		wait1Seconds();
		elementClick(o.getLoginsubmit());
		wait5seconds();
	}

	@Then("User have to reach Invalid credentials page")
	public void user_have_to_reach_Invalid_credentials_page() {
		String url = driver.getCurrentUrl();
		if (url.equals("https://testphp.digitaltrains.online/")) {
			System.out.println("-----User enter invalid credentials page-----");
			quitTab();
		} else {
			System.out.println("-----User enter valid credentials page-----");
			quitTab();
		}
	}

	@Given("User have to launch browser and Url")
	public void user_have_to_launch_browser_and_Url() throws InterruptedException {
		launchChromeBrowser();
		launchURL("https://testphp.digitaltrains.online/");
		screenMaximize();
		implicitWait();
		wait1Seconds();
		o=new OleoPojo();
	}

	@Given("User have to click the forgotten button")
	public void user_have_to_click_the_forgotten_button() throws InterruptedException {
		
		elementClick(o.getForgottenpassword());
		wait1Seconds();
	}

	@Given("User have to enter forgotten page")
	public void user_have_to_enter_forgotten_page() throws InterruptedException {
		wait1Seconds();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("forgetpassword page","https://testphp.digitaltrains.online/auth/forgot_password",url);
		if (url.equals("https://testphp.digitaltrains.online/auth/forgot_password")) {
			System.out.println("-----User enter the forget password option-----");
		} else {
			System.out.println("-----User is not enter forget password oprion-----");
		}

	}

	@Then("User have to close the tab")
	public void user_have_to_close_the_tab() throws InterruptedException {
		wait1Seconds();
		quitTab();
	}

	@When("User have to click back to login button")
	public void user_have_to_click_back_to_login_button() throws InterruptedException {
	
		elementClick(o.getForgottenpasswordbacktologin());
		wait1Seconds();
	}

	@Then("User have to enter login main page")
	public void user_have_to_enter_login_main_page() throws InterruptedException {
		wait1Seconds();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://testphp.digitaltrains.online/auth/login", url);
	}

	@When("User have to enter email address")
	public void user_have_to_enter_email_address() throws InterruptedException {
		
		sendKeys(o.getForgottenpasswordemailbox(), "hemkumard@oleo.co.in");
		wait1Seconds();
	}

	@When("User have to click the submit button")
	public void user_have_to_click_the_submit_button() throws InterruptedException {
	
		elementClick(o.getForgottenpaswordsubmit());
		screenMaximize();
		wait1Seconds();
	}

	@Then("User have to get msg for our login page")
	public void user_have_to_get_msg_for_our_login_page() throws InterruptedException {
		wait1Seconds();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("DigitalTrains - Login", title);
		if (title.contains("DigitalTrains - Login")) {
			System.out.println("-----User enter the digital train account-----");
		} else {
			System.out.println("-----User has not enter the digital train account-----");
		}
		quitTab();
	}
	
	

	// Digital train and digital train support main menu functionality

	@When("User have to click the digitaltrains tm link")
	public void user_have_to_click_the_digitaltrains_tm_link() throws InterruptedException {
		elementClick(o.getDigitaltrainsaboutlink());
		wait5seconds();
	}

	@Given("User have to launch the browser and digitalotrains url")
	public void user_have_to_launch_the_browser_and_digitalotrains_url() throws InterruptedException {
		launchChromeBrowser();
		launchURL("https://testphp.digitaltrains.online/");
		
		o = new OleoPojo();
		screenMaximize();
		implicitWait();
		sendKeys(o.getLoginusername(), "hemkumard@digitaltrains.online");  // Mail id
		sendKeys(o.getLoginpassword(), "Password!12");
		elementClick(o.getLoginrmember());
		elementClick(o.getLoginsubmit());
		wait5seconds();

	}

	@When("User have to click the about button")
	public void user_have_to_click_the_about_button() throws InterruptedException {
		o = new OleoPojo();
		elementClick(o.getDigitaltrainsaboutlink());
		wait1Seconds();
		switchWindow();
		wait1Seconds();
		elementClick(o.getDigitaltrainsaboutbutton());
		wait1Seconds();
	}

	@When("User have to enter on about URL")
	public void user_have_to_enter_on_about_URL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/#about");
	}

	@Given("User have to click the read the getting strated guide")
	public void user_have_to_click_the_read_the_getting_strated_guide() throws InterruptedException {
		elementClick(o.getDigitaltrainsreadthegettingstartedguide());
		wait1Seconds();
	}

	@Given("User have to click the read the getting strated guide homepage option")
	public void user_have_to_click_the_read_the_getting_strated_guide_homepage_option() throws InterruptedException {
		elementClick(o.getDigitaltrainsreadthegettingstartedguidehomepage());
		wait1Seconds();
	}

	@Then("User have to click back button")
	public void user_have_to_click_back_button() throws InterruptedException {
		o = new OleoPojo();
		navigateBack();
		wait1Seconds();
	}

	@When("User have to click the feature button")
	public void user_have_to_click_the_feature_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsfeatures1());
		wait1Seconds();
	}

	@When("User have to enter on feature URL")
	public void user_have_to_enter_on_feature_URL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/#features");
	}

	@When("User have to click the contact button")
	public void user_have_to_click_the_contact_button() throws InterruptedException {
		elementClick(o.getDigitaltrainscontactbutton());
		wait1Seconds();
	}

	@When("User have to enter on contact URL")
	public void user_have_to_enter_on_contact_URL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/#contact");
	}

	@When("User have to click the gettouch button")
	public void user_have_to_click_the_gettouch_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsgetintouchbutton());
		wait1Seconds();
	}

	@When("User have to click the subscribe button")
	public void user_have_to_click_the_subscribe_button() throws InterruptedException {
		elementClick(o.getDigitaltarinssubscribebutton());
		wait1Seconds();
	}

	@When("User have to click the tarin running gettouch button")
	public void user_have_to_click_the_tarin_running_gettouch_button() throws InterruptedException {
		elementClick(o.getTrainrunninggetintouch());
		wait1Seconds();
	}

	@When("User have to click the crash energy manage gettouch button")
	public void user_have_to_click_the_crash_energy_manage_gettouch_button() throws InterruptedException {
		elementClick(o.getCrashenergymanagmentgetintouch());
		wait1Seconds();
	}

	@When("User have to click the buffer stops gettouch button")
	public void user_have_to_click_the_buffer_stops_gettouch_button() throws InterruptedException {
		elementClick(o.getBufferstopsgetintouch());
		wait1Seconds();

	}

	@When("User have to click the login button")
	public void user_have_to_click_the_login_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsloginbutton());
		wait1Seconds();
	}

	@When("User have to enter on login URL")
	public void user_have_to_enter_on_login_URL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://simulate.digitaltrains.online/account/login");
	}

	@When("User have to click the feature{int} button")
	public void user_have_to_click_the_feature_button(Integer int1) throws InterruptedException {
		elementClick(o.getDigitaltrainsfeatures2());
		wait1Seconds();
	}

	@When("User have to click the homepage option")
	public void user_have_to_click_the_homepage_option() throws InterruptedException {

		o = new OleoPojo();
		elementClick(o.getDigitaltarinssupporttophomepagebutton());
		wait1Seconds();
	}

	@When("User have to enter on homepage URL")
	public void user_have_to_enter_on_homepage_URL() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/");
	}

	@When("User have to click the getstarted button")
	public void user_have_to_click_the_getstarted_button() throws InterruptedException {
		elementClick(o.getDigitaltrainssupportgetstarted());
		wait1Seconds();
	}

	@When("User have to enter on getstarted URL")
	public void user_have_to_enter_on_getstarted_URL() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://digitaltrains:watchandlearn@support.digitaltrains.online/docs/about-digitaltrains.html");
	}

	@When("User have to click the devices button")
	public void user_have_to_click_the_devices_button() throws InterruptedException {
		elementClick(o.getDigitaltrainssupportdevices());
		wait1Seconds();
	}

	@When("User have to enter on devices URL")
	public void user_have_to_enter_on_devices_URL() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://digitaltrains:watchandlearn@support.digitaltrains.online/docs/devices-library-introduction.html");
	}

	@When("User have to click the interfaces button")
	public void user_have_to_click_the_interfaces_button() throws InterruptedException {
		elementClick(o.getDigitaltrainssupportinterface());
		wait1Seconds();
	}

	@When("User have to enter on interfaces URL")
	public void user_have_to_enter_on_interfaces_URL() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://digitaltrains:watchandlearn@support.digitaltrains.online/docs/interfaces-library-introduction.html");
	}

	@When("User have to click the bufferstop button")
	public void user_have_to_click_the_bufferstop_button() throws InterruptedException {
		elementClick(o.getDigitaltarainssupportbufferstop());
		wait1Seconds();
	}

	@When("User have to enter on bufferstop URL")
	public void user_have_to_enter_on_bufferstop_URL() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://digitaltrains:watchandlearn@support.digitaltrains.online/docs/buffer-stops-library-introduction.html");
	}

	@When("User have to click the vehicles button")
	public void user_have_to_click_the_vehicles_button() throws InterruptedException {
		elementClick(o.getDigitaltrainssupportvehicles());
		wait1Seconds();
	}

	@When("User have to enter on vehicles URL")
	public void user_have_to_enter_on_vehicles_URL() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://digitaltrains:watchandlearn@support.digitaltrains.online/docs/vehicles-library-introduction.html");
	}

	@When("User have to click the trains option")
	public void user_have_to_click_the_trains_option() throws InterruptedException {
		elementClick(o.getDigitaltrainssupporttrains());
		wait1Seconds();
	}

	@When("User have to enter on trains URL")
	public void user_have_to_enter_on_trains_URL() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://digitaltrains:watchandlearn@support.digitaltrains.online/docs/trains-library-introduction.html");
	}

	@When("User have to click the topcontact button")
	public void user_have_to_click_the_topcontact_button() throws InterruptedException {
		elementClick(o.getDigitaltrainssupporttopcontactbutton());
		wait1Seconds();
	}

	@When("User have to enter on topcontact URL")
	public void user_have_to_enter_on_topcontact_URL() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://oleointernational.atlassian.net/servicedesk/customer/portals");

	}

	@When("User have to enter on buffer stops contact URL")
	public void user_have_to_enter_on_buffer_stops_contact_URL() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/#contact");
		navigateBack();
		wait1Seconds();
	}

	@Then("User have to click digitaltrain page help button")
	public void user_have_to_click_digitaltrain_page_help_button() throws InterruptedException {
		elementClick(o.getDigitaltrainssupporthelpbutton());
		switchWindow();
		wait5seconds();
	}
	
	

	/// digital train support new edit

	@When("User have to click the new homepage option")
	public void user_have_to_click_the_new_homepage_option() throws InterruptedException {
		elementClick(o.getDigitaltrainsupporthomeoption());
		wait1Seconds();
	}

	@Given("User have to click the new login button")
	public void user_have_to_click_the_new_login_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportlogin());
		wait1Seconds();
		switchWindow();
	}

	@Given("User have to click the new topcontact button")
	public void user_have_to_click_the_new_topcontact_button() throws InterruptedException, AWTException {
		wait1Seconds();
		wait1Seconds();
		elementClick(o.getDigitaltrainsupportcontact());
		wait1Seconds();
		switchWindow();
	}

	@Then("User have to close the page")
	public void user_have_to_close_the_page() throws InterruptedException {

		closeTab();

	}

	@When("User have to click the dwon new home option")
	public void user_have_to_click_the_dwon_new_home_option() throws InterruptedException {
		elementClick(o.getDigitaltrainsupporthomeoptiondown());
		wait1Seconds();
	}

	@Given("User have to click the new topgetstarted button")
	public void user_have_to_click_the_new_topgetstarted_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportgettingstarted());
		wait1Seconds();
	}

	@Given("User have to click the new topdevices button")
	public void user_have_to_click_the_new_topdevices_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportdevicelibrary());
		wait1Seconds();
	}

	@Given("User have to click the new topinterfaces button")
	public void user_have_to_click_the_new_topinterfaces_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportinterfaceslibrary());
		wait1Seconds();
	}

	@Given("User have to click the new topbufferstop button")
	public void user_have_to_click_the_new_topbufferstop_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportbufferstoplibrary());
		wait1Seconds();
	}

	@Given("User have to click the new topvehicles button")
	public void user_have_to_click_the_new_topvehicles_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportvehicleslibrary());
		wait1Seconds();
	}

	@Given("User have to click the new toptrains option")
	public void user_have_to_click_the_new_toptrains_option() throws InterruptedException {
		elementClick(o.getDigitaltrainsupporttrainslibrary());
		wait1Seconds();
	}

	@Given("User have to click the new down getstarted button")
	public void user_have_to_click_the_new_down_getstarted_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportgettingstarteddown());
		wait1Seconds();
	}

	@Given("User have to click the new down devices button")
	public void user_have_to_click_the_new_down_devices_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportdevicelibrarydown());
		wait1Seconds();
	}

	@Given("User have to click the new down interfaces button")
	public void user_have_to_click_the_new_down_interfaces_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportinterfaceslibrarydown());
		wait1Seconds();
	}

	@Given("User have to click the new down bufferstop button")
	public void user_have_to_click_the_new_down_bufferstop_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportbufferstoplibrarydown());
		wait1Seconds();
	}

	@Given("User have to click the new down vehicles button")
	public void user_have_to_click_the_new_down_vehicles_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportvehicleslibrarydown());
		wait1Seconds();
	}

	@Given("User have to click the new down trains option")
	public void user_have_to_click_the_new_down_trains_option() throws InterruptedException {
		elementClick(o.getDigitaltrainsupporttrainslibrarydown());
		wait1Seconds();
	}

	@Given("User have to click the digital train button")
	public void user_have_to_click_the_digital_train_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportdigitaltrainsbutton());
		wait1Seconds();
	}

	@When("User have to enter on digital trains URL")
	public void user_have_to_enter_on_digital_trains_URL() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://simulate.digitaltrains.online/account/login");
	}

	@Given("User have to click the new down contact button")
	public void user_have_to_click_the_new_down_contact_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsupportcontactdown());
		wait1Seconds();
	}

	@When("User have to enter on new homepage URL")
	public void user_have_to_enter_on_new_homepage_URL() throws InterruptedException {

		String currentUrl = driver.getCurrentUrl();
		wait1Seconds();
		Assert.assertEquals(currentUrl, "https://support.digitaltrains.online/");
		wait1Seconds();
	}

	@When("User have to enter on new login URL")
	public void user_have_to_enter_on_new_login_URL() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		wait1Seconds();
		Assert.assertEquals(currentUrl, "https://simulate.digitaltrains.online/account/login");
		wait1Seconds();
	}

	@When("User have to enter on new topcontact URL")
	public void user_have_to_enter_on_new_topcontact_URL() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		wait1Seconds();
		Assert.assertEquals(currentUrl, "https://support.digitaltrains.online/need-help/");
	}

	@When("User have to enter on new getstarted URL")
	public void user_have_to_enter_on_new_getstarted_URL() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		wait1Seconds();
		Assert.assertEquals(currentUrl, "https://support.digitaltrains.online/getting-started/about-digitaltrains/");
	}

	@When("User have to enter on new devices URL")
	public void user_have_to_enter_on_new_devices_URL() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		wait1Seconds();
		Assert.assertEquals(currentUrl, "https://support.digitaltrains.online/devices-library/overview/");
	}

	@When("User have to enter on new interfaces URL")
	public void user_have_to_enter_on_new_interfaces_URL() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		wait1Seconds();
		Assert.assertEquals(currentUrl, "https://support.digitaltrains.online/interfaces-library/overview-2/");
	}

	@When("User have to enter on new bufferstop URL")
	public void user_have_to_enter_on_new_bufferstop_URL() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		wait1Seconds();
		Assert.assertEquals(currentUrl, "https://support.digitaltrains.online/buffer-stops-library/introduction/");
	}

	@When("User have to enter on new vehicles URL")
	public void user_have_to_enter_on_new_vehicles_URL() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		wait1Seconds();
		Assert.assertEquals(currentUrl, "https://support.digitaltrains.online/vehicles-library/introduction-2/");
	}

	@When("User have to enter on new trains URL")
	public void user_have_to_enter_on_new_trains_URL() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		wait1Seconds();
		Assert.assertEquals(currentUrl, "https://support.digitaltrains.online/trains-library/introduction-3/");
	}

	@When("User have to enter on new contact URL")
	public void user_have_to_enter_on_new_contact_URL() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		wait1Seconds();
		Assert.assertEquals(currentUrl, "https://oleointernational.atlassian.net/servicedesk/customer/portals");
	}

	
	
	// Digital trains main menu options

	@Given("User have to launch browser and URL,click login button")
	public void user_have_to_launch_browser_and_URL_click_login_button() {
		o=new OleoPojo();
		launchChromeBrowser();
		launchURL("https://testphp.digitaltrains.online/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/login");
		screenMaximize();
		implicitWait();

	}

	@Given("User have to enter the user name and password,click submit button")
	public void user_have_to_enter_the_user_name_and_password_click_submit_button() throws InterruptedException {
		o = new OleoPojo();
		sendKeys(o.getLoginusername(), "hemkumard@digitaltrains.online"); // Mail id
		sendKeys(o.getLoginpassword(), "Password!12");
		elementClick(o.getLoginrmember());
		elementClick(o.getLoginsubmit());
		wait5seconds();
	}

	@When("User have to click the project button")
	public void user_have_to_click_the_project_button() {
		elementClick(o.getDigitaltrainsprojects());
	}

	@When("User have to enter project url")
	public void user_have_to_enter_project_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/projects");
		wait1Seconds();
	}

	@Given("User have to click the trains button")
	public void user_have_to_click_the_trains_button() {
		elementClick(o.getDigitaltrainstrins());
	}

	@When("User have to enter trains url")
	public void user_have_to_enter_trains_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/trains");
		wait1Seconds();
	}

	@Given("User have to click the vehicle button")
	public void user_have_to_click_the_vehicle_button() {
		elementClick(o.getDigitaltrainsvehicles());
	}

	@When("User have to enter vehicles url")
	public void user_have_to_enter_vehicles_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/vehicles");
		wait1Seconds();
	}

	@Given("User have to click the wheelsrail button")
	public void user_have_to_click_the_wheelsrail_button() {
		elementClick(o.getDigitaltrainswheelsrails());
	}

	@Given("User have to click the wheelsrailprofiles button")
	public void user_have_to_click_the_wheelsrailprofiles_button() {
		elementClick(o.getWheelsrailprofiles());
	}

	@When("User have to enter wheelsrailprofiles url")
	public void user_have_to_enter_wheelsrailprofiles_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/profiles");
		wait1Seconds();
	}

	@Given("User have to click the wheelsrailcontacts button")
	public void user_have_to_click_the_wheelsrailcontacts_button() {
		elementClick(o.getWheelsrailscontacts());
	}

	@When("User have to enter wheelsrailcontacts url")
	public void user_have_to_enter_wheelsrailcontacts_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/contacts");
		wait1Seconds();
	}

	@Given("User have to click the bogiesassambles button")
	public void user_have_to_click_the_bogiesassambles_button() {
		elementClick(o.getBogiesassemblies());
	}

	@When("User have to enter bogiesassambles url")
	public void user_have_to_enter_bogiesassambles_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/bogies");
		wait1Seconds();
	}

	@Given("User have to click the bogieparts button")
	public void user_have_to_click_the_bogieparts_button() {
		elementClick(o.getBogiesparts());
	}

	@When("User have to enter bogieparts url")
	public void user_have_to_enter_bogieparts_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/parts");
		wait1Seconds();
	}

	@Given("User have to click the gauges button")
	public void user_have_to_click_the_gauges_button() {
		elementClick(o.getDigitaltrainsgauges());
	}

	@When("User have to enter gauges url")
	public void user_have_to_enter_gauges_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/gauges");
		wait1Seconds();
	}

	@Given("User have to click the routprofile button")
	public void user_have_to_click_the_routprofile_button() {
		elementClick(o.getDigitaltrainsrouteprofiles());
	}

	@When("User have to enter routprofile url")
	public void user_have_to_enter_routprofile_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/terrains");
		wait1Seconds();
	}

	@When("User have to enter bufferstop url")
	public void user_have_to_enter_bufferstop_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/endstops");
		wait1Seconds();
	}

	@Given("User have to click the coupling interface button")
	public void user_have_to_click_the_coupling_interface_button() {
		elementClick(o.getDigitaltrainscouplinginterfaces());
	}

	@When("User have to enter coupling interface url")
	public void user_have_to_enter_coupling_interface_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/interfaces");
		wait1Seconds();
	}

	@Given("User have to click the dashboard button")
	public void user_have_to_click_the_dashboard_button() {
		elementClick(o.getDigitaltrainsdashboard());
	}

	@When("User have to enter dashboard url")
	public void user_have_to_enter_dashboard_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/dashboard");
		wait1Seconds();
	}

	@Given("User have to click devices button")
	public void user_have_to_click_devices_button() {
		elementClick(o.getDigitaltrainsdevices());
	}

	@When("User have to enter devices url")
	public void user_have_to_enter_devices_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/devices");
		wait1Seconds();
	}

	@Given("User have to click sharedlibrary button")
	public void user_have_to_click_sharedlibrary_button() {
		elementClick(o.getDigitaltrainssharedlibrary());
	}

	@When("User have to enter sharedlibrary url")
	public void user_have_to_enter_sharedlibrary_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/corporate");
		wait1Seconds();
	}

	@Given("User have to click services button")
	public void user_have_to_click_services_button() {
		elementClick(o.getDigitaltrainsservices());
	}

	@When("User have to enter services url")
	public void user_have_to_enter_services_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/services");
		wait1Seconds();
	}

	@Given("User have to click the bogies button")
	public void user_have_to_click_the_bogies_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsbogies());
		wait1Seconds();
	}

	
	
	// Register login page option

	@Given("User have to click the sign up button")
	public void user_have_to_click_the_sign_up_button() throws InterruptedException {

		elementClick(o.getRegistersignupbutton());
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl,"https://testphp.digitaltrains.online/account/login");
		wait1Seconds();

	}

	@Given("User have to click the monthly option and select the proceed to next step option")
	public void user_have_to_click_the_monthly_option_and_select_the_proceed_to_next_step_option()
			throws InterruptedException {
		wait1Seconds();
		elementClick(o.getRegisterviewplanoption());
		wait1Seconds();
		elementClick(o.getRegistermonthlyoption());
		wait1Seconds();
		elementClick(o.getRegisterselectimpacttest());
		wait1Seconds();
		elementClick(o.getRegisterselectviewpluse());
		wait1Seconds();
		elementClick(o.getRegisterproceedtonextstepbutton());
		wait1Seconds();
		try {
			String currentUrl = driver.getCurrentUrl();
			Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/checkout/details");
		} catch (Exception e) {
			closeTab();
			System.out.println(e);
		}
		

	}

	@Given("User have to enter details and select the agree option")
	public void user_have_to_enter_details_and_select_the_agree_option() throws InterruptedException {
		sendKeys(o.getRegistercompanyname(), "AB private ltd");
		wait1Seconds();
		sendKeys(o.getRegistercompanyregisternumber(), "12345");
		wait1Seconds();
		sendKeys(o.getRegisteraddone(), "14");
		wait1Seconds();
		sendKeys(o.getRegisteraddtwo(), "B");
		wait1Seconds();
		sendKeys(o.getRegisteraddthree(), "2 Main Road");
		wait1Seconds();
		sendKeys(o.getRegistercity(), "Chennai");
		wait1Seconds();
		sendKeys(o.getRegisterstate(), "Tamilnadu");
		wait1Seconds();
		sendKeys(o.getRegisterzipcode(), "600028");
		wait1Seconds();
		elementClick(o.getRegistercountrybox());
		wait1Seconds();
		elementClick(o.getRegisterindia());
		wait1Seconds();
		sendKeys(o.getRegisterfirstname(), "Hemkumar");
		wait1Seconds();
		sendKeys(o.getRegisterlastname(), "D");
		wait1Seconds();
		sendKeys(o.getRegisteremail(), "hemkumard@oleo1.co.in");   ///// ***** All time to change the mail id for avoid
																   ///// the
																   ///// error(existing mail id) 
		wait1Seconds();
		sendKeys(o.getRegisterphonenumber(), "9944406259");
		wait1Seconds();
		sendKeys(o.getRegisterjobtitle(), "Testing");
		wait1Seconds();
		sendKeys(o.getRegisterpassword(), "12345678");
		wait1Seconds();
		sendKeys(o.getRegisterreenterpassword(), "12345678");
		wait1Seconds();
		elementClick(o.getRegisterselectyourplanbox());
		wait1Seconds();
		elementClick(o.getRegisterdigitaltrainsimpactviewerplusoption());
		wait1Seconds();
		elementClick(o.getRegisteragreethetermsandcondition());
		wait5seconds();

	}

	@When("User have to click the proceed to payment button")
	public void user_have_to_click_the_proceed_to_payment_button() throws InterruptedException {

		elementClick(o.getRegisterproceedtopaymentbutton());
		wait5seconds();
		 

	}

	@When("User have to enter the card details")
	public void user_have_to_enter_the_card_details() throws InterruptedException {
		try {
			Thread.sleep(3000);
			driver.switchTo().frame(o.getRegisterswitchtoframe());
			wait1Seconds();
			sendKeys(o.getRegistercardnumber(), "5555555555554444");
			wait1Seconds();
			sendKeys(o.getRegisterexpirydate(), "12/24");
			wait1Seconds();
			sendKeys(o.getRegistercvcnumber(), "123");
			wait1Seconds();
		} catch (Exception e) {
			System.out.println("-----Check the register page payment proceed option is not working reason for same mailid or stripe link issue");
			closeTab();
		    System.out.println(e);
		}
		
	}

	@When("User have to click the pay now button")
	public void user_have_to_click_the_pay_now_button() throws InterruptedException {
		driver.switchTo().parentFrame();
		wait1Seconds();
		elementClick(o.getRegisterpaynowbutton());
		Thread.sleep(15000);

	}
	
	
	// digital trains project creation simulation

	@Given("User have to click the project button in main menu")
	public void user_have_to_click_the_project_button_in_main_menu() {

		elementClick(o.getDigitaltrainsprojects());
	}

	@Given("User have to click the create simulation")
	public void user_have_to_click_the_create_simulation() throws InterruptedException {
		o = new OleoPojo();
		elementClick(o.getDigitaltrainscreatesimulation());
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Projects");
		wait5seconds();

	}

	@Given("User have to enter simulation name and project name")
	public void user_have_to_enter_simulation_name_and_project_name() throws InterruptedException {
		sendKeys(o.getCreatesimulationname(), "Impact test");
		sendKeys(o.getCreatesimulationproject(), "DVRS 1");
		elementClick(o.getCreatesimulationproject());

	}

	@Given("User have to click the simulation type and simulation speeed")
	public void user_have_to_click_the_simulation_type_and_simulation_speeed() throws InterruptedException {
		elementClick(o.getCreatesimulationtrainimpact());
		o = new OleoPojo();
		jsPassValue(o.getCreatesimulationspeed(), "20.1");

	}

	@When("User have to select train{int} and click train{int} is identical ,enter brake")
	public void user_have_to_select_train_and_click_train_is_identical_enter_brake(Integer int1, Integer int2)
			throws InterruptedException {

		elementClick(o.getCreatesimulationtrain2());
		o = new OleoPojo();
		jsPassValue(o.getCreatesimulationbrakestrain2(), "0.2");
		wait5seconds();

	}

	@When("User have to click run button")
	public void user_have_to_click_run_button() throws InterruptedException {
		elementClick(o.getCreatesimulationrun());
		Thread.sleep(70000);
	}

	@Then("User have to click the threeD view of project")
	public void user_have_to_click_the_threeD_view_of_project() throws InterruptedException {
		implicitWait();
		wait1Seconds();
		elementClick(o.getCreatesimulationsimulationresult());
		wait5seconds();
		scrollDown(o.getCreatesimulationtotalforce());
		Thread.sleep(15000);
		elementClick(o.getCreatesimulation3d());
		Thread.sleep(20000);
	}

	@Given("User have to click the simulation type and simulation speed")
	public void user_have_to_click_the_simulation_type_and_simulation_speed() throws InterruptedException {

		//expicetWait();
		o = new OleoPojo();

		jsPassValue(o.getCreatesimulationspeed(), "20.1");
		wait5seconds();
	}

	@When("User have to give gradient and select train{int} options select train and mass condition brake value")
	public void user_have_to_give_gradient_and_select_train_options_select_train_and_mass_condition_brake_value(
			Integer int1) throws InterruptedException {
		elementClick(o.getCreatesimulationtrain1());
		elementClick(o.getCreatesimulationselecttrain1library());
		elementClick(o.getPubliclibrary4X90tonnewagons());
		sendKeys(o.getCreatesimulationbrakestrain1(), "");

	}

	@Given("User have to launch browser and testurl")
	public void user_have_to_launch_browser_and_testurl() throws InterruptedException {
		launchChromeBrowser();
		o=new OleoPojo();
		launchURL("https://testphp.digitaltrains.online/account/login");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/login");
		screenMaximize();
		implicitWait();
		wait5seconds();
	}

	@Given("User have to enter username and password,click submit button")
	public void user_have_to_enter_username_and_password_click_submit_button() throws InterruptedException {
		o = new OleoPojo();
		sendKeys(o.getLoginusername(), "hemkumard@digitaltrains.online"); // Mail id
		sendKeys(o.getLoginpassword(), "Password!12");
		elementClick(o.getLoginrmember());
		elementClick(o.getLoginsubmit());
		wait5seconds();
	}

	@Then("User have to click threeD view")
	public void user_have_to_click_threeD_view() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getCreatesimulation3d());
		Thread.sleep(15000);
	}

	@Given("User have to click the project option")
	public void user_have_to_click_the_project_option() throws InterruptedException {
		elementClick(o.getDigitaltrainsprojects());
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/projects");
		wait1Seconds();
	}
	
	

	// Delete the project(inside project option)

	@When("User have to click the project button and click the sim button")
	public void user_have_to_click_the_project_button_and_click_the_sim_button() throws InterruptedException {
		o=new OleoPojo();
		elementClick(o.getProject());
		wait1Seconds();
		elementClick(o.getSim());
	}

	@When("User have to click the action button and click delete option")
	public void user_have_to_click_the_action_button_and_click_delete_option() throws InterruptedException {
		mouseOverAction(o.getProjectbox());
		elementClick(o.getActionbutton());
		wait1Seconds();
		elementClick(o.getDeleteproject());
		wait1Seconds();
		elementClick(o.getDeletebutton());
		wait5seconds();
	}
	
	

	// create buffer stops impact simulation(inside the project creation)

	@Given("User have to click the create simulation option")
	public void user_have_to_click_the_create_simulation_option() {
		implicitWait();
		elementClick(o.getDigitaltrainscreatesimulation());
	}

	@Given("User have to click bufferstop impact type and enter simulationspeed")
	public void user_have_to_click_bufferstop_impact_type_and_enter_simulationspeed() {
		elementClick(o.getCreatebufferstopimapacttype());
		o = new OleoPojo();

		jsPassValue(o.getCreatesimulationspeed(), "10.1");

	}
	@Given("User have to enter simulation name and select the project")
	public void user_have_to_enter_simulation_name_and_select_the_project() throws InterruptedException {
		sendKeys(o.getCreatesimulationname(), "Impact test2");
		elementClick(o.getCreatesimulationproject());
		wait1Seconds();
		elementClick(o.getProjectdvrs1());
//		sendKeys(o.getCreatesimulationproject(), "DVRS 1");
//		elementClick(o.getCreatesimulationproject());
	}


	@When("User have to give gradient and select train options select train and mass condition brake value")
	public void user_have_to_give_gradient_and_select_train_options_select_train_and_mass_condition_brake_value() {

		elementClick(o.getCreatesimulationselecttrain1usingbufferstopimpact());
	//	elementClick(o.getPubliclibrary4X90tonnewagons());
		elementClick(o.getCreatesimulationselectgenericmainline());

	}

	@When("User have to click bufferstop button")
	public void user_have_to_click_bufferstop_button() throws InterruptedException {
		elementClick(o.getCreatebufferstopbufferstopbutton());
		wait1Seconds();
	}

	@When("User have to click buffer stop selection")
	public void user_have_to_click_buffer_stop_selection() throws InterruptedException {

		elementClick(o.getCreatesimulationselectbufferstop());
		wait1Seconds();
	}

	@When("User have to select fixed buffer stop and click run button")
	public void user_have_to_select_fixed_buffer_stop_and_click_run_button() throws InterruptedException {
		elementClick(o.getCreatesimulationthreepointslidingbufferstop());
		elementClick(o.getCreatebufferstoprunbutton());
		Thread.sleep(160000);
	}

	@When("User have to click simulation result")
	public void user_have_to_click_simulation_result() throws InterruptedException {
		try {
			implicitWait();
			elementClick(o.getCreatesimulationsimulationresult());
			Thread.sleep(15000);
			scrollDown(o.getCreatesimulationtotalforce());
			Thread.sleep(20000);
		} catch (Exception e) {
			System.out.println("-----Check the simulation is not able to rendering the bufferstop imapct-----");
			elementClick(o.getCreatesimulationsaveandexitoption());
			wait1Seconds();
			closeTab();
		}
		

	}

	@When("User have to click threeD view in bufferstop impact")
	public void user_have_to_click_threeD_view_in_bufferstop_impact() throws InterruptedException {
		implicitWait();
		elementClick(o.getCreatesimulation3d());
		implicitWait();
		Thread.sleep(60000);
		elementClick(o.getBufferstopplaybutton());
		wait5seconds();
	}

	@Given("User have to click project button")
	public void user_have_to_click_project_button() throws InterruptedException {
		elementClick(o.getDigitaltrainsprojects());
		wait1Seconds();
	}

	
	
	// create Running train(in side the project create simulation)

	@When("User have to click the running train option and enter simulation speed")
	public void user_have_to_click_the_running_train_option_and_enter_simulation_speed() throws InterruptedException {

		elementClick(o.getCreaterunningtrainoption());
        wait1Seconds();
		sendKeys(o.getCreatesimulationspeed(), "20.0");
		wait1Seconds();
	}

	@When("User have to click the routprofile and select the profile")
	public void user_have_to_click_the_routprofile_and_select_the_profile() throws InterruptedException {
		elementClick(o.getCreaterunningtrainselectprofileoption());
		elementClick(o.getCreaterunningtrainfirstprofile());
		wait5seconds();
	}

	@When("User have to click the run button and click the simulation results")
	public void user_have_to_click_the_run_button_and_click_the_simulation_results() throws InterruptedException {
		
		elementClick(o.getCreaterunningtrainrunbutton());
		implicitWait();
		Thread.sleep(30000);		
		elementClick(o.getCreaterunningtrainsimulationresult());

	}

	@Given("User have to enter simulation name and project name of running train")
	public void user_have_to_enter_simulation_name_and_project_name_of_running_train() {
		sendKeys(o.getCreatesimulationname(), "Running train 2");
		elementClick(o.getCreatesimulationproject());
		sendKeys(o.getCreatesimulationproject(), "DVRS3");
	}

	@When("User have to give gradient and select train options select train and mass condition brake value of running train")
	public void user_have_to_give_gradient_and_select_train_options_select_train_and_mass_condition_brake_value_of_running_train()
			throws InterruptedException {
		elementClick(o.getCreaterunningtrainselecttrainoption());
		wait1Seconds();
	//	elementClick(o.getPubliclibrary4X90tonnewagons());
		elementClick(o.getCreatesimulationselectgenericmainline());
		wait1Seconds();
	}
	
	@When("User have to click running train threeD view")
	public void user_have_to_click_running_train_threeD_view() throws InterruptedException {
	    
		try {
			wait1Seconds();
			elementClick(o.getCreatesimulation3d());
			Thread.sleep(15000);
			
		} catch (Exception e) {
			System.out.println("-----Check the simulation result page 3D option of the simulation-----");
			elementClick(o.getCreatesimulationsaveandexitoption());
			wait5seconds();
			closeTab();
		}

	}


	
	
	// create tunnel added running train

	@When("User have to click the tunnel routprofile and select the profile")
	public void user_have_to_click_the_tunnel_routprofile_and_select_the_profile() throws InterruptedException {
		elementClick(o.getSelecttheroutprofilebox());
		wait1Seconds();
		elementClick(o.getTunneladdedreversecurveroute());
		wait5seconds();
	}

	@Given("User have to enter simulation name and project name of tunnel running train")
	public void user_have_to_enter_simulation_name_and_project_name_of_tunnel_running_train() {
		sendKeys(o.getCreatesimulationname(), "Impact test3");
		elementClick(o.getCreatesimulationproject());
		elementClick(o.getCreatesimulationproject());
		elementClick(o.getTunnelsimulationselectdvrs1());

	}

	@When("User have to click the run button and click the simulation results tunnel profile")
	public void user_have_to_click_the_run_button_and_click_the_simulation_results_tunnel_profile()
			throws InterruptedException {
		elementClick(o.getCreaterunningtrainrunbutton());
		Thread.sleep(150000);
		elementClick(o.getCreaterunningtrainsimulationresult());
	}

	
	
	// create train

	@Given("User have to click train option enter in train url")
	public void user_have_to_click_train_option_enter_in_train_url() {
		screenMaximize();
		elementClick(o.getDigitaltrainstrins());
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/trains");
		
	}

	@Given("User have to click createtrain button")
	public void user_have_to_click_createtrain_button() throws InterruptedException {
		elementClick(o.getCreatetrainbutton());
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Setup Train");
		wait5seconds();
	}

	@When("User have to click high speed train and click next")
	public void user_have_to_click_high_speed_train_and_click_next() throws InterruptedException {
		elementClick(o.getCreatetrainselecthighspeedtrain());
		elementClick(o.getCreatetrainnextbutton());
		Thread.sleep(7000);
	}

	@When("User have to click to create button")
	public void user_have_to_click_to_create_button() throws InterruptedException {
		elementClick(o.getCreatetraincompletebutton());
		wait5seconds();
	}

	@Then("User have to click create train threeD button")
	public void user_have_to_click_create_train_threeD_button() throws InterruptedException {
		elementClick(o.getCreatetrainviewinthreeD());
		Thread.sleep(17000);
	}

	
	
	// Delete train

	@When("User have to click the action button and click delete train option")
	public void user_have_to_click_the_action_button_and_click_delete_train_option() throws InterruptedException {
		mouseOverAction(o.getTrainbox());
		wait1Seconds();
		elementClick(o.getTrainactionbutton());
		wait1Seconds();
		elementClick(o.getDeletetrain());
		wait1Seconds();
		elementClick(o.getDeletebutton());
		wait5seconds();

	}

	
	
	// create vehicle

	@Given("User have to click the create vehicle button")
	public void user_have_to_click_the_create_vehicle_button() throws InterruptedException {
		implicitWait();
		elementClick(o.getCreatevehiclebutton());
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Vehicles");
		wait5seconds();
	}

	@Given("User have to click the select template type")
	public void user_have_to_click_the_select_template_type() {
		elementClick(o.getCreatevehicleselecttemplatetype());
	}

	@Given("User have to click generic high speed train")
	public void user_have_to_click_generic_high_speed_train() throws InterruptedException {
		elementClick(o.getCreatevehicleselectgenerichighspeed());
		wait5seconds();
		elementClick(o.getCreatevehicleselecttemplatetypevehicle());
		wait1Seconds();
		elementClick(o.getCreatevehicleselectfirst());
		wait1Seconds();
	}

	@When("User have to click vehicle threeD button")
	public void user_have_to_click_vehicle_threeD_button() throws InterruptedException {
		elementClick(o.getCreatevehiclethreeDview());
		Thread.sleep(15000);
	}

	@When("User have to click save button")
	public void user_have_to_click_save_button() {
		elementClick(o.getCreatevehiclesave());
	}

	@When("User have to click select vehicle template")
	public void user_have_to_click_select_vehicle_template() {
		o = new OleoPojo();
		elementClick(o.getCreatevehicleselecttemplatebutton());

	}

	
	
	// Delete vehicle (main menu vehicle option)

	@Given("User have to click the action button and click delete vehicle option")
	public void user_have_to_click_the_action_button_and_click_delete_vehicle_option() throws InterruptedException {
		mouseOverAction(o.getVehiclebox());
		wait1Seconds();
		elementClick(o.getVehicleaction());
		wait1Seconds();
		elementClick(o.getVehicledeleteoption());
		wait1Seconds();
		elementClick(o.getDeletebutton());
		wait5seconds();
	}

	
	
	// create buffer stop(Main menu inside buffer stop option)

	@Given("User have to click the create buffer stop button")
	public void user_have_to_click_the_create_buffer_stop_button() throws InterruptedException {

		elementClick(o.getBufferstopcreatebufferstopbutton());
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Buffer Stops");
		wait5seconds();
	}

	@Given("User have to click template and select the three poin sliding buffer")
	public void user_have_to_click_template_and_select_the_three_poin_sliding_buffer() {
		elementClick(o.getBufferstopselecttemplatebufferstop());
		elementClick(o.getBufferstopselectthreepointslidingbufferstop());

	}

	@When("User have to click the select buffer stop template button")
	public void user_have_to_click_the_select_buffer_stop_template_button() throws InterruptedException {
		elementClick(o.getBufferstopselecttemplatebutton());
		wait1Seconds();
	}

	@When("User have to click buffer stop save&review")
	public void user_have_to_click_buffer_stop_save_review() throws InterruptedException {
		elementClick(o.getBufferstopsaveandreview());
		wait5seconds();
	}

	@Then("User have to click the buffer stop threeD button")
	public void user_have_to_click_the_buffer_stop_threeD_button() throws InterruptedException {
		elementClick(o.getBufferstopthreedview());
		Thread.sleep(15000);
	}

	@Given("User have to click buffer stop button")
	public void user_have_to_click_buffer_stop_button() {
		elementClick(o.getDigitaltrainsbufferstop());
	}

	
	
	// Delete buffer stop( inside of main menu buffer stop option)

	@Given("User have to click the action button and click delete bufferstop option")
	public void user_have_to_click_the_action_button_and_click_delete_bufferstop_option() throws InterruptedException {
		mouseOverAction(o.getBufferstopbox());
		elementClick(o.getBufferstopaction());
		wait1Seconds();
		elementClick(o.getBufferstopdelete());
		wait1Seconds();
		elementClick(o.getDeletebutton());
		wait1Seconds();
	}

	
	
	// Create coupling interface (Main menu Coupling interface)

	@Given("User have to click the coupling interface option and its enter coupling interface url")
	public void user_have_to_click_the_coupling_interface_option_and_its_enter_coupling_interface_url()
			throws InterruptedException {
		elementClick(o.getDigitaltrainscouplinginterfaces());
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/interfaces");
		wait5seconds();
		implicitWait();
	}

	@Given("User have to click create couplin interface button")
	public void user_have_to_click_create_couplin_interface_button() throws InterruptedException {
		elementClick(o.getCreatecouplinginterface());
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Interfaces");
		wait1Seconds();
		elementClick(o.getCreatecouplinginterfaceselectlibrary());
		wait5seconds();
	}

	@When("User have to click the select template dropdown")
	public void user_have_to_click_the_select_template_dropdown() throws InterruptedException {
		elementClick(o.getCreatecouplinginterfaceselecttemplate());
		wait5seconds();
	}

	@When("User have to click select coupling interface and click EFG{int}plus option")
	public void user_have_to_click_select_coupling_interface_and_click_EFG_plus_option(Integer int1) {
		elementClick(o.getCreatecouplinginterfaceEFG3type());
	}

	@When("User have to click select template button in coupling interface")
	public void user_have_to_click_select_template_button_in_coupling_interface() throws InterruptedException {
		elementClick(o.getCreatecouplinginterfaceselecttemplatebutton());
		wait5seconds();
	}

	@When("User have to click coupling interface threeD view")
	public void user_have_to_click_coupling_interface_threeD_view() throws InterruptedException {
		elementClick(o.getCreatecouplinginterfacethreeDview());
		Thread.sleep(12000);
	}

	@Then("User have to click create button")
	public void user_have_to_click_create_button() throws InterruptedException {
		elementClick(o.getCreatecouplinginterfacecreatebutton());
		wait1Seconds();
	}

	
	
	// Delete coupling interface (inside main menu coupling interface option)

	@When("User have to click the action button and click delete coupling interface option")
	public void user_have_to_click_the_action_button_and_click_delete_coupling_interface_option()throws InterruptedException {
		mouseOverAction(o.getCouplinginterfacebox());
		wait1Seconds();
		elementClick(o.getCouplinginterfaceaction());
		wait1Seconds();
		elementClick(o.getCouplinginterfacedeleteoption());
		wait1Seconds();
		elementClick(o.getDeletebutton());
		wait1Seconds();
	}

	
	
	// create route profile(inside manual and map profile)

	@Given("User have to click the route profile option")
	public void user_have_to_click_the_route_profile_option() throws InterruptedException {
		elementClick(o.getDigitaltrainsrouteprofiles());
		wait1Seconds();

	}

	@Given("User have to enter the route profile url")
	public void user_have_to_enter_the_route_profile_url() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/terrains");
	}

	@Given("User have to click the create route profile button")
	public void user_have_to_click_the_create_route_profile_button() throws InterruptedException {
		elementClick(o.getCreaterouteprofileoptionbutton());
		wait1Seconds();
	}

	@When("User have to click the create manual profile option")
	public void user_have_to_click_the_create_manual_profile_option() throws InterruptedException {
		
		elementClick(o.getCreatemanulaprofileroute());
		wait1Seconds();
	}

	@When("User have to enter create manual profile url")
	public void user_have_to_enter_create_manual_profile_url() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/terrains/review/manual");
	}

	@When("User have to click the manual inputdata and location setting")
	public void user_have_to_click_the_manual_inputdata_and_location_setting() throws InterruptedException {
		elementClick(o.getManualinputdatabutton());
		wait1Seconds();
		elementClick(o.getLoactionsettingbutton());
	}

	@When("User have to click route profile option")
	public void user_have_to_click_route_profile_option() {
		elementClick(o.getDigitaltrainsrouteprofiles());
	}

	@When("User have to click the create profile button")
	public void user_have_to_click_the_create_profile_button() {
		elementClick(o.getCreaterouteprofileoptionbutton());
	}

	@When("User have to click the map profile and enter map profile url")
	public void user_have_to_click_the_map_profile_and_enter_map_profile_url() {
		elementClick(o.getCreatemapprofileoption());
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/terrains/review/map");
	}

	@When("User have to click upload mapdata and location settings")
	public void user_have_to_click_upload_mapdata_and_location_settings() throws InterruptedException {
		elementClick(o.getUploadmapdatabutton());
		wait1Seconds();
		elementClick(o.getLoactionsettingbutton());
	}

	@Then("User have to click moretools and click satelite map and zoom")
	public void user_have_to_click_moretools_and_click_satelite_map_and_zoom() throws InterruptedException {
		elementClick(o.getMoretoolsbutton());
		wait1Seconds();
		elementClick(o.getSatelitemapbutton());
		wait1Seconds();
		elementClick(o.getMoretoolsbutton());
		elementClick(o.getSatelitezoomin());
		elementClick(o.getSatelitezoomin());
		wait1Seconds();
		elementClick(o.getSatelitezoomin());
		elementClick(o.getSatelitezoomin());
		wait1Seconds();
		elementClick(o.getSatelitezoomout());
		elementClick(o.getSatelitezoomout());
		wait1Seconds();
		elementClick(o.getSatelitezoomout());
		elementClick(o.getSatelitezoomout());
		wait1Seconds();
		quitTab();
	}

	
	
	// Shared library options

	@Given("User have to click the profiles")
	public void user_have_to_click_the_profiles() throws InterruptedException {
		elementClick(o.getSharedlibraryprofiles());
		Thread.sleep(3000);
	}

	@Given("User have to click the contacts")
	public void user_have_to_click_the_contacts() throws InterruptedException {
		elementClick(o.getSharedlibrarycontacts());
		Thread.sleep(3000);
	}

	@Given("User have to click the bogies")
	public void user_have_to_click_the_bogies() throws InterruptedException {
		elementClick(o.getSharedlibrarybogies());
		Thread.sleep(3000);
	}

	@When("User have to click the parts")
	public void user_have_to_click_the_parts() throws InterruptedException {
		elementClick(o.getSharedlibraryparts());
		Thread.sleep(3000);
	}

	@When("User have to click the gauges")
	public void user_have_to_click_the_gauges() throws InterruptedException {
		elementClick(o.getSharedlibrarygauges());
		Thread.sleep(3000);
	}

	@When("User have to click the routeprofiles")
	public void user_have_to_click_the_routeprofiles() throws InterruptedException {
		elementClick(o.getSharedlibraryrouteprofiles());
		Thread.sleep(3000);
	}

	@When("User have to click the bufferstops")
	public void user_have_to_click_the_bufferstops() throws InterruptedException {
		elementClick(o.getSharedlibrarybufferstops());
		Thread.sleep(3000);
	}

	@When("User have to click the couplinginterfaces")
	public void user_have_to_click_the_couplinginterfaces() throws InterruptedException {
		elementClick(o.getSharedlibrarycouplinginterfaces());
		Thread.sleep(3000);
	}

	@When("User have to click the devices")
	public void user_have_to_click_the_devices() throws InterruptedException {
		elementClick(o.getSharedlibrarydevices());
		Thread.sleep(3000);
	}

	@When("User have to click the trains")
	public void user_have_to_click_the_trains() throws InterruptedException {
		elementClick(o.getSharedlibrarytrains());
		Thread.sleep(3000);
	}

	@Given("User have to click the vehicles")
	public void user_have_to_click_the_vehicles() throws InterruptedException {
		elementClick(o.getSharedlibraryvehicles());
		Thread.sleep(3000);
	}

	
	
	// Create Coupling Head (inside of main menu devices)

	@Given("User have to click create device button")
	public void user_have_to_click_create_device_button() throws InterruptedException {
		elementClick(o.getCreatedevicebutton());
		wait1Seconds();
	}

	@Given("User have to click couplerhead option")
	public void user_have_to_click_couplerhead_option() throws InterruptedException {
		elementClick(o.getCouplerhead());
		wait1Seconds();
	}

	@Given("User have to click choose from library")
	public void user_have_to_click_choose_from_library() throws InterruptedException {
		elementClick(o.getCouplerheadchoosefromlibrary());
		wait1Seconds();
	}

	@When("User have to public library")
	public void user_have_to_public_library() throws InterruptedException {
		elementClick(o.getCouplerheadSelectpubliclibrary());
		wait1Seconds();
	}

	@When("User have to click generic type ten")
	public void user_have_to_click_generic_type_ten() throws InterruptedException {
		elementClick(o.getCouplerheadselectgenerictypeten());
		wait1Seconds();
	}

	@When("User have to click select template button")
	public void user_have_to_click_select_template_button() throws InterruptedException {
		elementClick(o.getCouplerheadselecttemplatebutton());
		wait1Seconds();
	}

	@When("User have to img mouse over")
	public void user_have_to_img_mouse_over() throws InterruptedException {
        try {
        	elementClick(o.getCouplerheaddeviceimage());
    		wait5seconds();
   
		} catch (Exception e) {
			System.out.println(e);
			elementClick(o.getSavebutton());
			System.out.println("-----Check the device option after create image icon is not present the page-----");
			closeTab();
		}
	
	}

	@When("User have to click save")
	public void user_have_to_click_save() throws InterruptedException {
		elementClick(o.getSavebutton());
		wait5seconds();
	}

	// create coupler bar (inside of main menu devices)

	@Given("User have to click coupler bar option")
	public void user_have_to_click_coupler_bar_option() throws InterruptedException {
		elementClick(o.getCouplerbaroption());
		wait1Seconds();
	}

	@When("User have to click select coupler bar")
	public void user_have_to_click_select_coupler_bar() throws InterruptedException {
		elementClick(o.getCouplerbarselectfirstbar());
	}

	@Given("User have to click coupler bar choose from library")
	public void user_have_to_click_coupler_bar_choose_from_library() throws InterruptedException {
		elementClick(o.getCouplerbarchoosefromlibrary());
		wait1Seconds();
	}

	@When("User have to click coupler bar public library")
	public void user_have_to_click_coupler_bar_public_library() throws InterruptedException {
		elementClick(o.getCouplerbarselectpubliclibrary());
		wait1Seconds();
	}

	@When("User have to click coupler bar select template button")
	public void user_have_to_click_coupler_bar_select_template_button() {
		elementClick(o.getCouplerbarselecttemplate());
	}

	@When("User have to click couplerbar save button")
	public void user_have_to_click_couplerbar_save_button() throws InterruptedException {
		elementClick(o.getCouplerbarsavebutton());
		wait5seconds();
	}

	
	
	// create modular coupler shanks(inside the main menu devices)

	@Given("User have to click modular coupler shanks option")
	public void user_have_to_click_modular_coupler_shanks_option() throws InterruptedException {
		elementClick(o.getCouplershanksoption());
		wait1Seconds();
	}

	@Given("User have to  click coupler shank public library")
	public void user_have_to_click_coupler_shank_public_library() throws InterruptedException {
		elementClick(o.getCouplershankpubliclibrary());
		wait1Seconds();
	}

	@Given("User have to click select second coupler shank option")
	public void user_have_to_click_select_second_coupler_shank_option() {
		elementClick(o.getCouplershankselectsecond());
	}

	@When("User have to click the coupler shank select template")
	public void user_have_to_click_the_coupler_shank_select_template() {
		elementClick(o.getCouplershankselecttemplatebutton());
	}

	@When("User have to click the coupler shank img")
	public void user_have_to_click_the_coupler_shank_img() throws InterruptedException {
	     try {
	    	 elementClick(o.getCouplershankimg());
	 		 wait5seconds();
	   
			} catch (Exception e) {
				System.out.println(e);
				elementClick(o.getCouplershanksavebutton());
				System.out.println("-----Check the device option after create image icon is not present the page-----");
				closeTab();
			}
	}

	@Then("User have to click the coupler shank save button")
	public void user_have_to_click_the_coupler_shank_save_button() throws InterruptedException {
		elementClick(o.getCouplershanksavebutton());
		wait5seconds();
	}

	
	
	// create Deformation tube (inside main menu device option)

	@Given("User have to click the deformation option")
	public void user_have_to_click_the_deformation_option() throws InterruptedException {
		elementClick(o.getDeformationtubeoption());
		wait1Seconds();
	}

	@Given("User have to click the deformation tube choose for library")
	public void user_have_to_click_the_deformation_tube_choose_for_library() throws InterruptedException {
		elementClick(o.getDeformationtubechooselibrary());
		wait1Seconds();
	}

	@When("User have to click the drformation tube public library")
	public void user_have_to_click_the_drformation_tube_public_library() throws InterruptedException {
		elementClick(o.getDeformationtubepubliclibrary());
		wait1Seconds();
	}

	@When("User have to click the deformation tube first option")
	public void user_have_to_click_the_deformation_tube_first_option() {
		elementClick(o.getDeformationtubeselectsecond());
	}

	@When("User have to click the deformation select template")
	public void user_have_to_click_the_deformation_select_template() {
		elementClick(o.getDeformationtubeselecttemplate());
	}

	@When("User have to click the deformation tube img")
	public void user_have_to_click_the_deformation_tube_img() throws InterruptedException {
		   try {
			    elementClick(o.getDeformationtubeimg());
				wait5seconds();
		   
				} catch (Exception e) {
					System.out.println(e);
					elementClick(o.getDeformationtubesavebutton());
					System.out.println("-----Check the device option after create image icon is not present the page-----");
					closeTab();
				}
		
	}

	@Then("User have to click the deformation tube save button")
	public void user_have_to_click_the_deformation_tube_save_button() throws InterruptedException {
		elementClick(o.getDeformationtubesavebutton());
		wait5seconds();
	}

	
	
	// create Rubber or spring(inside of main menu device option)

	@Given("User have to click the rubber or spring option")
	public void user_have_to_click_the_rubber_or_spring_option() throws InterruptedException {
		elementClick(o.getRubberorspringoption());
		wait1Seconds();
	}

	@Given("User have to click rubber or spring choose from library")
	public void user_have_to_click_rubber_or_spring_choose_from_library() throws InterruptedException {
		elementClick(o.getRubberorspringchooselibrary());
		wait1Seconds();
	}

	@When("User have to click rubber or spring public library")
	public void user_have_to_click_rubber_or_spring_public_library() throws InterruptedException {
		elementClick(o.getRubberorspringselectpubliclibrary());
		wait1Seconds();
	}

	@When("User have to select rubber or spring second option")
	public void user_have_to_select_rubber_or_spring_second_option() {
		elementClick(o.getRubberorspringselectsecond());
	}

	@When("User have to  click rubber or spring select template button")
	public void user_have_to_click_rubber_or_spring_select_template_button() {
		elementClick(o.getRubberorspringselecttemplatebutton());
	}

	@Then("User have to click the rubber or spring save button")
	public void user_have_to_click_the_rubber_or_spring_save_button() throws InterruptedException {
		elementClick(o.getRubberorspringsavebutton());
		wait5seconds();
	}

	
	
	// create Pivot Assembly (inside main menu devices option)

	@Given("User have to click the pivot assembly option")
	public void user_have_to_click_the_pivot_assembly_option() throws InterruptedException {
		elementClick(o.getPivotassemblyoption());
		wait1Seconds();
	}

	@Given("User have to click pivot assembly choose library")
	public void user_have_to_click_pivot_assembly_choose_library() throws InterruptedException {
		elementClick(o.getPivotassemblychooselibrary());
		wait1Seconds();
	}

	@Given("User have to click pivot assembly public library")
	public void user_have_to_click_pivot_assembly_public_library() throws InterruptedException {
		elementClick(o.getPivotassemblyselectpubliclibrary());
		wait1Seconds();
	}

	@When("User have to click pivote assembly first option")
	public void user_have_to_click_pivote_assembly_first_option() {
		elementClick(o.getPivotassemblyselectsecond());
	}

	@When("User have to click pivote assembly select template button")
	public void user_have_to_click_pivote_assembly_select_template_button() {
		elementClick(o.getPivotassemblyselecttemplate());
	}

	@When("User have to click pivote assembly img")
	public void user_have_to_click_pivote_assembly_img() throws InterruptedException {
		try {
			elementClick(o.getPivoteassemblyimg());
			wait5seconds();
	   
			} catch (Exception e) {
				System.out.println(e);
				elementClick(o.getPivoteassemblysave());
				System.out.println("-----Check the device option after create image icon is not present the page-----");
				closeTab();
			}
	}

	@When("User have to click pivote assembly save button")
	public void user_have_to_click_pivote_assembly_save_button() throws InterruptedException {
		elementClick(o.getPivoteassemblysave());
		wait5seconds();
	}

	
	
	// create Shear out(inside of main menu devices)

	@Given("User have to click shear out option")
	public void user_have_to_click_shear_out_option() throws InterruptedException {
		elementClick(o.getShearoutoption());
		wait1Seconds();
	}

	@Given("User have to click shear out choose library")
	public void user_have_to_click_shear_out_choose_library() throws InterruptedException {
		elementClick(o.getShearoutchooselibrary());
		wait1Seconds();
	}

	@When("User have to click shear out public library")
	public void user_have_to_click_shear_out_public_library() throws InterruptedException {
		elementClick(o.getShearoutpubliclibrary());
		wait1Seconds();
	}

	@When("User have to select shear out first option")
	public void user_have_to_select_shear_out_first_option() {
		elementClick(o.getShearoutselectfirst());
	}

	@When("User have to click shear out select template")
	public void user_have_to_click_shear_out_select_template() {
		elementClick(o.getShearoutselecttemplate());
	}

	@When("User have to click the plot graph")
	public void user_have_to_click_the_plot_graph() throws InterruptedException {
		elementClick(o.getShearoutplotgraph());
		wait5seconds();
	}

	@When("User have to click shear out cancel button")
	public void user_have_to_click_shear_out_cancel_button() throws InterruptedException {
		elementClick(o.getShearoutcancelbutton());
		wait1Seconds();
	}

	@Then("User have to click shear out save button")
	public void user_have_to_click_shear_out_save_button() throws InterruptedException {
		elementClick(o.getShearoutsavebutton());
		wait5seconds();
	}

	
	
	// create anti climber (inside of main menu devices)

	@Given("User have to click anti climber option")
	public void user_have_to_click_anti_climber_option() throws InterruptedException {
		elementClick(o.getAnticlimberoption());
		wait1Seconds();
	}

	@Given("User have to click side anti climber option")
	public void user_have_to_click_side_anti_climber_option() throws InterruptedException {
		elementClick(o.getAnticlimbersaidanticlimberoption());
		wait1Seconds();
	}

	@Given("User have to click anti climber choose library")
	public void user_have_to_click_anti_climber_choose_library() throws InterruptedException {
		elementClick(o.getAnticlimberchooselibrary());
		wait1Seconds();
	}

	@When("User have to click anti climber public library")
	public void user_have_to_click_anti_climber_public_library() throws InterruptedException {
		elementClick(o.getAnticlimberselectpubliclibrary());
		wait1Seconds();
	}

	@When("User have to select second anti climber")
	public void user_have_to_select_second_anti_climber() {
		elementClick(o.getAnticlimberselectAmmodel());
	}

	@When("User have to click anti climber select template button")
	public void user_have_to_click_anti_climber_select_template_button() {
		elementClick(o.getAnticlimberselecttemplatebutton());
	}

	@When("User have to click anti climber img")
	public void user_have_to_click_anti_climber_img() throws InterruptedException {
		try {
			elementClick(o.getAnticlimberimg());
			wait5seconds();
	   
			} catch (Exception e) {
				System.out.println(e);
				elementClick(o.getAnticlimbersavebutton());
				System.out.println("-----Check the device option after create image icon is not present the page-----");
				closeTab();
			}
	}

	@Then("User have to click anti climber save button")
	public void user_have_to_click_anti_climber_save_button() throws InterruptedException {
		elementClick(o.getAnticlimbersavebutton());
		wait5seconds();
	}
	
	

	// delete the all devices (inside the device option)

	@When("User have to click the bulk delete option")
	public void user_have_to_click_the_bulk_delete_option() throws InterruptedException {
		elementClick(o.getDeletealldevicesoption());
		wait1Seconds();

	}

	@When("User have to click the select all option")
	public void user_have_to_click_the_select_all_option() throws InterruptedException {
		elementClick(o.getSelectalldevicesoption());
		wait1Seconds();

	}

	@When("User have to click the delete all selected option")
	public void user_have_to_click_the_delete_all_selected_option() throws InterruptedException {
		elementClick(o.getDeleteallselecteddevices());
		wait1Seconds();

	}

	
	
	// Wheels and rails (inside of main menu wheels and rail)

	@Given("User have to click profile option")
	public void user_have_to_click_profile_option() throws InterruptedException {
		elementClick(o.getProfileoption());
		wait1Seconds();
	}

	@When("User have to click the create profile option")
	public void user_have_to_click_the_create_profile_option() throws InterruptedException {
		elementClick(o.getCreateprofilebutton());
		wait1Seconds();
	}

	@When("User have to click wheel oprion and click cancel")
	public void user_have_to_click_wheel_oprion_and_click_cancel() throws InterruptedException {
		elementClick(o.getCreateprofilewheel());
		wait1Seconds();
		String title = driver.getTitle();
		Assert.assertEquals(title, "DigitalTrains - Profiles");
		elementClick(o.getWheelprofilecancel());
		wait1Seconds();
	}

	@When("User have to click rail option and click cancel")
	public void user_have_to_click_rail_option_and_click_cancel() throws InterruptedException {
		elementClick(o.getCreateprofilerail());
		wait1Seconds();
		String title = driver.getTitle();
		Assert.assertEquals(title, "DigitalTrains - Profiles");
		elementClick(o.getRailprofilecancel());
		wait1Seconds();
	}

	@Then("User have to click the wheel rail option")
	public void user_have_to_click_the_wheel_rail_option() throws InterruptedException {
		elementClick(o.getDigitaltrainswheelsrails());
		wait1Seconds();
	}

	@Given("User have to click the contact option")
	public void user_have_to_click_the_contact_option() throws InterruptedException {
		elementClick(o.getContactoption());
		wait1Seconds();
	}

	@Given("User have to click the create contact option")
	public void user_have_to_click_the_create_contact_option() throws InterruptedException {
		elementClick(o.getCreatecontactoption());
		wait1Seconds();
	}

	@Given("User have to Click raildata option")
	public void user_have_to_Click_raildata_option() throws InterruptedException {
		elementClick(o.getRaildataoption());
		wait1Seconds();
	}

	@When("User have to click setting option")
	public void user_have_to_click_setting_option() throws InterruptedException {
		elementClick(o.getSettingoption());
		wait1Seconds();
	}

	@When("User have to click cancel button")
	public void user_have_to_click_cancel_button() throws InterruptedException {
		elementClick(o.getContactcancel());
		wait1Seconds();
	}

	
	
	// create Gauges option(main menu gauges)

	@Given("User have to click create gauges button")
	public void user_have_to_click_create_gauges_button() throws InterruptedException {
		elementClick(o.getCreategaugebutton());
		wait1Seconds();
	}

	@Given("User have to click vehicle option")
	public void user_have_to_click_vehicle_option() throws InterruptedException {
		elementClick(o.getCreategaugevehicle());
		wait1Seconds();
	}

	@Given("User have to click structural option")
	public void user_have_to_click_structural_option() throws InterruptedException {
		elementClick(o.getCreategaugestructural());
		wait1Seconds();
	}

	@When("User have to select the vehicle template")
	public void user_have_to_select_the_vehicle_template() throws InterruptedException {
		elementClick(o.getCreategaugevehicleselecttemplate());
		wait1Seconds();
	}

	@When("User have to select the structural template")
	public void user_have_to_select_the_structural_template() throws InterruptedException {
		elementClick(o.getCreategaugesstructuralselecttemplate());
		wait1Seconds();

	}

	@Given("User have to click gauges option")
	public void user_have_to_click_gauges_option() throws InterruptedException {
		elementClick(o.getDigitaltrainsgauges());
		String title = driver.getTitle();
		Assert.assertEquals(title, "DigitalTrains - Gauges");
		wait1Seconds();
	}

@When("User have to click structural choose from library")
public void user_have_to_click_structural_choose_from_library() throws InterruptedException {
    elementClick(o.getCreategaugesstructuralchoosefromlibrary());
    wait1Seconds();
}


	@When("User have to click choose from vehicle option library")
	public void user_have_to_click_choose_from_vehicle_option_library() throws InterruptedException {
		elementClick(o.getCreategaugevehiclechoosefromlibrary());
		wait1Seconds();
	}

	@Then("User have to click vehicle option cancel button")
	public void user_have_to_click_vehicle_option_cancel_button() throws InterruptedException {
		elementClick(o.getCreategaugevehiclecancel());
		wait1Seconds();
	}

	@When("User have to select the structural structural option template")
	public void user_have_to_select_the_structural_structural_option_template() throws InterruptedException {
		elementClick(o.getCreategaugesstructuralselecttemplate());
		wait1Seconds();
	}

	@When("User have to click structural option cancel button")
	public void user_have_to_click_structural_option_cancel_button() throws InterruptedException {
		elementClick(o.getCreategaugesstructuralcancel());
		wait1Seconds();
	}

	@When("User have to select the vehicle option template")
	public void user_have_to_select_the_vehicle_option_template() throws InterruptedException {
		elementClick(o.getCreategaugevehicleselecttemplate());
		wait1Seconds();
	}

	
	
	// Check the statistics under options(main menu page statistics)

	@When("User have to click the statistics project button")
	public void user_have_to_click_the_statistics_project_button() throws InterruptedException {
		o = new OleoPojo();
		wait1Seconds();
		elementClick(o.getStatisticsproject());
	}

	@Given("User have to click the sim button")
	public void user_have_to_click_the_sim_button() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getStatisticssim());
	}

	@Given("User have to click the statistics trains button")
	public void user_have_to_click_the_statistics_trains_button() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getStatisticstrains());
	}

	@Given("User have to click the statistics vehicle button")
	public void user_have_to_click_the_statistics_vehicle_button() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getStatisticsvehicles());
	}

	@Given("User have to click the statistics bufferstop button")
	public void user_have_to_click_the_statistics_bufferstop_button() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getStatisticsbufferstops());
	}

	@Given("User have to click the statistics gauges button")
	public void user_have_to_click_the_statistics_gauges_button() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getStatisticsgauges());
	}

	@Given("User have to click the statistics routprofile button")
	public void user_have_to_click_the_statistics_routprofile_button() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getStatisticsrouteprofiles());
	}

	@Given("User have to click the statistics coupling interface button")
	public void user_have_to_click_the_statistics_coupling_interface_button() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getStatisticscouplinginterfaces());

	}

	@Given("User have to click statistics devices button")
	public void user_have_to_click_statistics_devices_button() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getStatisticsdevices());

	}
	
	

	// Under the Get started Option(under main menu(payment options))

	@Given("User have to click the get started butoon enter get started url")
	public void user_have_to_click_the_get_started_butoon_enter_get_started_url() throws InterruptedException {
		elementClick(o.getDigitaltrainsgetstarted());
		wait1Seconds();
		String l = driver.getCurrentUrl();
		Assert.assertEquals(l, "https://testphp.digitaltrains.online/services/");
		wait1Seconds();

	}

	@When("User have to click optimised buffer stop perfromance sliding")
	public void user_have_to_click_optimised_buffer_stop_perfromance_sliding() throws InterruptedException {
		elementClick(o.getGetbufferstopoption());
		wait5seconds();
		elementClick(o.getOptimisedbufferstopperformancesliding());
		wait1Seconds();

	}

	@When("User have to enter optimised buffer stop perfromance sliding url")
	public void user_have_to_enter_optimised_buffer_stop_perfromance_sliding_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/optimised_buffer_stop_performance_sliding");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("300");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click optimised buffer stop perfromance hydraulic sliding")
	public void user_have_to_click_optimised_buffer_stop_perfromance_hydraulic_sliding() throws InterruptedException {
		elementClick(o.getGetbufferstopoption());
		wait1Seconds();
		elementClick(o.getOptimisedbufferstopperformacehydraulicsliding());
		wait1Seconds();
	
	}

	@When("User have to enter optimised buffer stop perfromance hydraulic sliding url")
	public void user_have_to_enter_optimised_buffer_stop_perfromance_hydraulic_sliding_url()
			throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/optimised_buffer_stop_performance_hydraulic_sliding");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("400");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click optimised buffer stop perfromance fixed sliding")
	public void user_have_to_click_optimised_buffer_stop_perfromance_fixed_sliding() throws InterruptedException {
		elementClick(o.getGetbufferstopoption());
		wait1Seconds();
		elementClick(o.getOptimisedbufferstopperformancefixedsliding());
		wait1Seconds();
	}

	@When("User have to enter optimised buffer stop perfromance fixed sliding url")
	public void user_have_to_enter_optimised_buffer_stop_perfromance_fixed_sliding_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/optimised_buffer_stop_performance_fixed_sliding");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("250");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@When("User have to click add structural cad model to route profile")
	public void user_have_to_click_add_structural_cad_model_to_route_profile() throws InterruptedException {
		elementClick(o.getGetinfrastructure());
		wait1Seconds();
		elementClick(o.getAddstructuralCADmodeltorouteprofile());
		wait1Seconds();
	}

	@When("User have to enter add structural cad model to route profile url")
	public void user_have_to_enter_add_structural_cad_model_to_route_profile_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/add_structural_cad_model_to_route_profile");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("100");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click mapping and rendering background scene")
	public void user_have_to_click_mapping_and_rendering_background_scene() throws InterruptedException {
		elementClick(o.getGetinfrastructure());
		wait1Seconds();
		elementClick(o.getMappingrenderingbackgroundscene());
		wait1Seconds();
	}

	@When("User have to enter mapping and rendering background scene url")
	public void user_have_to_enter_mapping_and_rendering_background_scene_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/mapping_rendering_background_scene");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("Quote");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@When("User have to click map existing railway from online mapping satelite view")
	public void user_have_to_click_map_existing_railway_from_online_mapping_satelite_view()
			throws InterruptedException {
		elementClick(o.getGetrouteprofiles());
		wait1Seconds();
		elementClick(o.getMapexistingrailwayfromonlinemappingsateliteview());
		wait1Seconds();
	}

	@When("User have to enter map existing railway from online mapping satelite view url")
	public void user_have_to_enter_map_existing_railway_from_online_mapping_satelite_view_url()
			throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/map_existing_railway_from_online_mapping_satelite_view");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("50");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click map exisiting railway from GPS route data")
	public void user_have_to_click_map_exisiting_railway_from_GPS_route_data() throws InterruptedException {
		elementClick(o.getGetrouteprofiles());
		wait1Seconds();
		elementClick(o.getMapexisitingrailwayfromGPSroutedata());
		wait1Seconds();
	}

	@When("User have to enter map exisiting railway from GPS route data url")
	public void user_have_to_enter_map_exisiting_railway_from_GPS_route_data_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/map_existing_railway_from_gps_route_data");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("50");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click map railway using survey data")
	public void user_have_to_click_map_railway_using_survey_data() throws InterruptedException {
		elementClick(o.getGetrouteprofiles());
		wait1Seconds();
		elementClick(o.getMaprailwayusingsurveydata());
		wait1Seconds();
	}

	@When("User have to enter map railway using survey data url")
	public void user_have_to_enter_map_railway_using_survey_data_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/services/map_railway_using_survey_data");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("150");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click creation of a test facility digital twin")
	public void user_have_to_click_creation_of_a_test_facility_digital_twin() throws InterruptedException {
		elementClick(o.getGetrouteprofiles());
		wait1Seconds();
		elementClick(o.getCreationofatestfacilitydigitaltwin());
		wait1Seconds();
	}

	@When("User have to enter creation of a test facility digital twin url")
	public void user_have_to_enter_creation_of_a_test_facility_digital_twin_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/creation_test_facility_digital_twin");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("Quote");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click add event marker to route profile")
	public void user_have_to_click_add_event_marker_to_route_profile() throws InterruptedException {
		elementClick(o.getGetrouteprofiles());
		wait1Seconds();
		elementClick(o.getAddeventmarkertorouteprofile());
		wait1Seconds();
	}

	@When("User have to enter add event marker to route profile url")
	public void user_have_to_enter_add_event_marker_to_route_profile_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/add_event_markers_to_route_profile");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("50");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@When("User have to click identical train impact simulation logitudional dynamics")
	public void user_have_to_click_identical_train_impact_simulation_logitudional_dynamics()
			throws InterruptedException {
		elementClick(o.getGetsimulationoption());
		wait1Seconds();
		elementClick(o.getIdenticaltrainimpactsimulationlongitudionaldynamics());
		wait1Seconds();
	}

	@When("User have to enter identical train impact simulation logitudional dynamics url")
	public void user_have_to_enter_identical_train_impact_simulation_logitudional_dynamics_url()
			throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/identical_train_impact_simulation_longitudinal_dynamics");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("100");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click identical train impact simulation threeD multi body dynamics")
	public void user_have_to_click_identical_train_impact_simulation_threeD_multi_body_dynamics()
			throws InterruptedException {
		elementClick(o.getGetsimulationoption());
		wait1Seconds();
		elementClick(o.getIdenticaltrainimpactsimulation3Dmultibodydynamics());
		wait1Seconds();
	}

	@When("User have to enter identical train impact simulation threeD multi body dynamics url")
	public void user_have_to_enter_identical_train_impact_simulation_threeD_multi_body_dynamics_url()
			throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/identical_train_impact_simulation_3d_multi_body_dynamics");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("200");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click train to other train impact simulation longitudional dynamics")
	public void user_have_to_click_train_to_other_train_impact_simulation_longitudional_dynamics()
			throws InterruptedException {
		elementClick(o.getGetsimulationoption());
		wait1Seconds();
		elementClick(o.getTraintoothertrainimpactsimulationlongitudionaldynamics());
		wait1Seconds();
	}

	@When("User have to enter train to other train impact simulation longitudional dynamics url")
	public void user_have_to_enter_train_to_other_train_impact_simulation_longitudional_dynamics_url()
			throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/train_to_train_impact_simulation_longitudinal_dynamics");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("150");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click train to other train impact simulation threeD multi body dynamics")
	public void user_have_to_click_train_to_other_train_impact_simulation_threeD_multi_body_dynamics()
			throws InterruptedException {
		elementClick(o.getGetsimulationoption());
		wait1Seconds();
		elementClick(o.getTraintoothertrainimpactsimulation3Dmultibobydynamics());
		wait1Seconds();
	}

	@When("User have to enter train to other train impact simulation threeD multi body dynamics url")
	public void user_have_to_enter_train_to_other_train_impact_simulation_threeD_multi_body_dynamics_url()
			throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/train_to_train_impact_simulation_3d_multi_body_dynamics");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("300");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click train to buffer stop simulation longitudional dynamics")
	public void user_have_to_click_train_to_buffer_stop_simulation_longitudional_dynamics()
			throws InterruptedException {
		elementClick(o.getGetsimulationoption());
		wait1Seconds();
		elementClick(o.getTraintobufferstopsimulationlongitudinaldynamics());
		wait1Seconds();
	}

	@When("User have to enter train to buffer stop simulation longitudional dynamics url")
	public void user_have_to_enter_train_to_buffer_stop_simulation_longitudional_dynamics_url()
			throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/train_to_buffer_stop_simulation_longitudinal_dynamics");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("150");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click train to buffer stop simulation threeD multi body dynamics")
	public void user_have_to_click_train_to_buffer_stop_simulation_threeD_multi_body_dynamics()
			throws InterruptedException {
		elementClick(o.getGetsimulationoption());
		wait1Seconds();
		elementClick(o.getTraintobufferstopsimulation3Dmultibodydynamics());
		wait1Seconds();
	}

	@When("User have to enter train to buffer stop simulation threeD multi body dynamics url")
	public void user_have_to_enter_train_to_buffer_stop_simulation_threeD_multi_body_dynamics_url()
			throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/train_to_buffer_stop_simulation_3d_multi_body_dynamics");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("300");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click effect of braking characteristics on simulation")
	public void user_have_to_click_effect_of_braking_characteristics_on_simulation() throws InterruptedException {
		elementClick(o.getGetsimulationoption());
		wait1Seconds();
		elementClick(o.getEffectofbrakingcharacteristicsonsimulation());
		wait1Seconds();
	}

	@When("User have to enter effect of braking characteristics on simulation url")
	public void user_have_to_enter_effect_of_braking_characteristics_on_simulation_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/effect_braking_characteristics_on_simulations");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("1000");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click effect of drive characteristics on simulation")
	public void user_have_to_click_effect_of_drive_characteristics_on_simulation() throws InterruptedException {
		elementClick(o.getGetsimulationoption());
		wait1Seconds();
		elementClick(o.getEffectofdrivercharacteristicsonsimulation());
		wait1Seconds();
	}

	@When("User have to enter effect of drive characteristics on simulation url")
	public void user_have_to_enter_effect_of_drive_characteristics_on_simulation_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/effect_drive_characteristics_on_simulations");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("1000");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click effect of braking and drive characteristics on simulation")
	public void user_have_to_click_effect_of_braking_and_drive_characteristics_on_simulation()
			throws InterruptedException {
		elementClick(o.getGetsimulationoption());
		wait1Seconds();
		elementClick(o.getEffectofbrakinganddrivecharacteristicsonsimulation());
		wait1Seconds();
	}

	@When("User have to enter effect of braking and drive characteristics on simulation url")
	public void user_have_to_enter_effect_of_braking_and_drive_characteristics_on_simulation_url()
			throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/effect_braking_drive_characteristics_on_simulations");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("1500");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click track lift vertical force applied to track")
	public void user_have_to_click_track_lift_vertical_force_applied_to_track() throws InterruptedException {
		elementClick(o.getGetsimulationoption());
		wait1Seconds();
		elementClick(o.getTrackliftverticalforceappliedtotrack());
		wait1Seconds();
	}

	@When("User have to enter track lift vertical force applied to track url")
	public void user_have_to_enter_track_lift_vertical_force_applied_to_track_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/track_lift_vertical_force_applied_to_track");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("150");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@When("User have to click custom train using library components")
	public void user_have_to_click_custom_train_using_library_components() throws InterruptedException {
		elementClick(o.getGettrainmodelling());
		wait1Seconds();
		elementClick(o.getCustomtrainusinglibrarycomponents());
		wait1Seconds();
	}

	@When("User have to enter custom train using library url")
	public void user_have_to_enter_custom_train_using_library_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/services/custom_train_library");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("1000");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click customised vehicle geometry")
	public void user_have_to_click_customised_vehicle_geometry() throws InterruptedException {
		elementClick(o.getGettrainmodelling());
		wait1Seconds();
		elementClick(o.getCustomisedvehiclegeometry());
		wait1Seconds();
	}

	@When("User have to enter customised vehicle geometry url")
	public void user_have_to_enter_customised_vehicle_geometry_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/services/customised_vehicle_geometry");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("250");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click custom bogie")
	public void user_have_to_click_custom_bogie() throws InterruptedException {
		elementClick(o.getGettrainmodelling());
		wait1Seconds();
		elementClick(o.getCustombogies());
		wait1Seconds();
	}

	@When("User have to enter custom  bogie url")
	public void user_have_to_enter_custom_bogie_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/services/custom_bogie");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("Quote");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click custom coupling interface using library components")
	public void user_have_to_click_custom_coupling_interface_using_library_components() throws InterruptedException {
		elementClick(o.getGettrainmodelling());
		wait1Seconds();
		elementClick(o.getCustomcouplinginterfaceusinglibrarycomponents());
		wait1Seconds();
	}

	@When("User have to enter custom coupling interface using library components url")
	public void user_have_to_enter_custom_coupling_interface_using_library_components_url()
			throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/services/custom_coupling_interface_library");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("100");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click custom coupling interface using user defined components")
	public void user_have_to_click_custom_coupling_interface_using_user_defined_components()
			throws InterruptedException {
		elementClick(o.getGettrainmodelling());
		wait1Seconds();
		elementClick(o.getCustomcouplinginterfaceusinguserdefinedcomponents());
		wait1Seconds();
	}

	@When("User have to enter custom coupling interface using user defined components url")
	public void user_have_to_enter_custom_coupling_interface_using_user_defined_components_url()
			throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/services/custom_coupling_interface_defined");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("500");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click hydralic performance optimisation of a coupling interface")
	public void user_have_to_click_hydralic_performance_optimisation_of_a_coupling_interface()
			throws InterruptedException {
		elementClick(o.getGettrainmodelling());
		wait1Seconds();
		elementClick(o.getHydraulicperformanceoptimisationofacpouplinginterface());
		wait1Seconds();
	}

	@When("User have to enter hydralic performance optimisation of a coupling interface url")
	public void user_have_to_enter_hydralic_performance_optimisation_of_a_coupling_interface_url()
			throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://testphp.digitaltrains.online/services/hydraulic_performance_optimisation_coupling_interface");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("50");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click coupling interface super elements")
	public void user_have_to_click_coupling_interface_super_elements() throws InterruptedException {
		elementClick(o.getGettrainmodelling());
		wait1Seconds();
		elementClick(o.getCoupinginterfacesuperelements());
		wait1Seconds();
	}

	@When("User have to enter coupling interface super elements url")
	public void user_have_to_enter_coupling_interface_super_elements_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/services/coupling_interface_super_elements");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("5000");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click customised interface components CAD")
	public void user_have_to_click_customised_interface_components_CAD() throws InterruptedException {
		elementClick(o.getGettrainmodelling());
		wait1Seconds();
		elementClick(o.getCustomisedinterfacecomponentsCAD());
		wait1Seconds();
	}

	@When("User have to enter customised interface components CAD url")
	public void user_have_to_enter_customised_interface_components_CAD_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,"https://testphp.digitaltrains.online/services/customised_interface_componenets_cad");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("Quote");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click customised vehicle model CAD")
	public void user_have_to_click_customised_vehicle_model_CAD() throws InterruptedException {
		elementClick(o.getGettrainmodelling());
		wait1Seconds();
		elementClick(o.getCustomisedvehiclemodel());
		wait1Seconds();
	}

	@When("User have to enter customised vehicle model CAD url")
	public void user_have_to_enter_customised_vehicle_model_CAD_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/services/customised_vehicle_model_cad");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("Quote");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	@Given("User have to click customised vehicle livery")
	public void user_have_to_click_customised_vehicle_livery() throws InterruptedException {
		elementClick(o.getGettrainmodelling());
		wait1Seconds();
		elementClick(o.getCustomisedvehiclelivery());
		wait1Seconds();
	}

	@When("User have to enter customised vehicle livery url")
	public void user_have_to_enter_customised_vehicle_livery_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/services/customised_vehicle_livery");
		wait1Seconds();
		String text = o.getGetstaetedbodyfortext().getText();
		System.out.println(text);
		boolean contains = text.contains("Quote");
	    Assert.assertTrue("Check the Price",contains);
	    wait1Seconds();
	}

	
	
	// create simulation (train impact simulation max value)

	@Given("User have to enter simulation name")
	public void user_have_to_enter_simulation_name() throws InterruptedException {
		sendKeys(o.getCreatesimulationname(), "Impact2");
		wait1Seconds();
	}

	@Given("User have to click project name and select the project")
	public void user_have_to_click_project_name_and_select_the_project() throws InterruptedException {
		elementClick(o.getCreatesimulationproject());
		wait1Seconds();
		elementClick(o.getProjectdvrs1());
		wait1Seconds();
	}

	@Given("User have to click the simulation type and simulation speed max value")
	public void user_have_to_click_the_simulation_type_and_simulation_speed_max_value() throws InterruptedException {

		jsPassValue(o.getCreatesimulationspeed(), "999");
		wait1Seconds();
	}

	@When("User have to give max gradient and select train{int} options select train and mass condition brake value")
	public void user_have_to_give_max_gradient_and_select_train_options_select_train_and_mass_condition_brake_value(
			Integer int1) throws InterruptedException, AWTException {
		o.getCreatesimulationimpactgradient().clear();
		wait1Seconds();
		sendKeys(o.getCreatesimulationimpactgradient(), "99");
		wait1Seconds();
		elementClick(o.getCreatesimulationtrain1());
		wait1Seconds();
		elementClick(o.getCreatesimulationselecttrain1library());
		wait1Seconds();
		elementClick(o.getPubliclibrary4X90tonnewagons());
		wait1Seconds();
		sendKeys(o.getCreatesimulationbrakestrain1(), "");
		wait1Seconds();
	}

	@When("User have to select train{int} and click train{int} is identical ,enter max brake")
	public void user_have_to_select_train_and_click_train_is_identical_enter_max_brake(Integer int1, Integer int2)
			throws InterruptedException {

		elementClick(o.getCreatesimulationtrain2());
		o = new OleoPojo();
		wait1Seconds();
		jsPassValue(o.getCreatesimulationbrakestrain2(), "99");
	}

	@When("User have to enter simulation url")
	public void user_have_to_enter_simulation_url() {
		String currentUrl = driver.getCurrentUrl();
		try {
			if (currentUrl=="https://testphp.digitaltrains.online/simulations/setup/9848/continue") {
				System.out.println("-----simulation is not runing for user entered maximum values in the simulation-----");
			}
			
		} catch (Exception e) {
			Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/simulations/setup/19458/continue");
			System.out.println("-----simulation is runing for user entered valied values in the simulation-----");
			closeTab();
			System.out.println(e);
		}
		
	}

	
	
	// create simulation (train impact simulation max value)

	@Given("User have to enter simulation name{int}")
	public void user_have_to_enter_simulation_name(Integer int1) throws InterruptedException {
		sendKeys(o.getCreatesimulationname(), "Impact3");
		wait1Seconds();
	}

	@Given("User have to click the simulation type and simulation speed out of max value")
	public void user_have_to_click_the_simulation_type_and_simulation_speed_out_of_max_value()
			throws InterruptedException {

		jsPassValue(o.getCreatesimulationspeed(), "1000");
		wait1Seconds();
	}

	@When("User have to give out of max gradient and select train{int} options select train and mass condition brake value")
	public void user_have_to_give_out_of_max_gradient_and_select_train_options_select_train_and_mass_condition_brake_value(
			Integer int1) throws InterruptedException {
		o.getCreatesimulationimpactgradient().clear();
		wait1Seconds();
		sendKeys(o.getCreatesimulationimpactgradient(), "100");
		wait1Seconds();
		elementClick(o.getCreatesimulationtrain1());
		wait1Seconds();
		elementClick(o.getCreatesimulationselecttrain1library());
		wait1Seconds();
		elementClick(o.getPubliclibrary4X90tonnewagons());
		wait1Seconds();
		sendKeys(o.getCreatesimulationbrakestrain1(), "");
		wait1Seconds();
	}

	@When("User have to select train{int} and click train{int} is identical ,enter out of max brake")
	public void user_have_to_select_train_and_click_train_is_identical_enter_out_of_max_brake(Integer int1,
			Integer int2) throws InterruptedException {

		elementClick(o.getCreatesimulationtrain2());
		o = new OleoPojo();
		wait1Seconds();
		jsPassValue(o.getCreatesimulationbrakestrain2(), "100");
	}

	@When("User have to not enter simulation url")
	public void user_have_to_not_enter_simulation_url() throws InterruptedException {
		   
		    Thread.sleep(8000);
		    String text = o.getCreaterunningtrainsimulationshadowtab().getText();
		    System.out.println(text); 
			if (text.contains("Simulation values are not able to run")) {
				System.out.println("-----Maximum and minimum values not allowing the simulation-----");
			    boolean contains = text.contains("Simulation is not allowing the values");
			    Assert.assertTrue(contains);
			}else {
				System.out.println("-----Maximum and minimum values allowing the simulation-----");
			}	
    }


	// create simulation (impact train simulation minimum value)

	@Given("User have to enter simulation name three")
	public void user_have_to_enter_simulation_name_three() throws InterruptedException {
		sendKeys(o.getCreatesimulationname(), "Impact4");
		wait1Seconds();

	}

	@Given("User have to click the simulation type and simulation speed  min value")
	public void user_have_to_click_the_simulation_type_and_simulation_speed_min_value() throws InterruptedException {
		jsPassValue(o.getCreatesimulationspeed(), "1");
		wait1Seconds();
	}

	@When("User have to give out of min gradient and select train one options select train and mass condition brake value")
	public void user_have_to_give_out_of_min_gradient_and_select_train_one_options_select_train_and_mass_condition_brake_value()
			throws InterruptedException {
		o.getCreatesimulationimpactgradient().clear();
		wait1Seconds();
		sendKeys(o.getCreatesimulationimpactgradient(), "-99");
		wait1Seconds();
		elementClick(o.getCreatesimulationtrain1());
		wait1Seconds();
		elementClick(o.getCreatesimulationselecttrain1library());
		wait1Seconds();
		elementClick(o.getPubliclibrary4X90tonnewagons());
		wait1Seconds();
		sendKeys(o.getCreatesimulationbrakestrain1(), "");
		wait1Seconds();

	}

	@When("User have to select train two and click train two is identical ,enter out of min brake")
	public void user_have_to_select_train_two_and_click_train_two_is_identical_enter_out_of_min_brake()
			throws InterruptedException {
		elementClick(o.getCreatesimulationtrain2());
		o = new OleoPojo();
		wait1Seconds();
		jsPassValue(o.getCreatesimulationbrakestrain2(), "-20");

	}

	
	
	// create bogie parts mass option

	@Given("User have to click mass button")
	public void user_have_to_click_mass_button() throws InterruptedException {
		implicitWait();
		elementClick(o.getBogiesmass());
		String title = driver.getTitle();
		System.out.println(title);
		wait1Seconds();
	}

	@When("User have to enter mass name in part name box")
	public void user_have_to_enter_mass_name_in_part_name_box() {
		sendKeys(o.getBogiespartmassnamebox(), "SHY-05Mass");
	}

	@When("User have to enter mass,roll inretia,pitch inretia,yaw inretia value")
	public void user_have_to_enter_mass_roll_inretia_pitch_inretia_yaw_inretia_value()
			throws InterruptedException, AWTException {
		o.getBogiespartmassmassbox().clear();
		sendKeys(o.getBogiespartmassmassbox(), "1800");
		wait1Seconds();
		o.getBogiespartmassrollinertia().clear();
		sendKeys(o.getBogiespartmassrollinertia(), "1200");
		wait1Seconds();
		o.getBogiespartmasspitchinertia().clear();
		sendKeys(o.getBogiespartmasspitchinertia(), "800");
		wait1Seconds();
		o.getBogiespartmassyawinertia().clear();
		sendKeys(o.getBogiespartmassyawinertia(), "2100");

	}

	@When("User have to click bogies save button")
	public void user_have_to_click_bogies_save_button() throws InterruptedException {
		elementClick(o.getBogiespartmasssavebutton());
		wait1Seconds();
	}

	@Given("User have to click create bogie part")
	public void user_have_to_click_create_bogie_part() {
		o = new OleoPojo();
		elementClick(o.getBogiescreatepartoption());

	}
	
	

	// create bogie wheel set(Inside of bogie option)

	@When("User have to click create wheelset option")
	public void user_have_to_click_create_wheelset_option() throws InterruptedException {
		elementClick(o.getBogieswheelset());
		String title = driver.getTitle();
		System.out.println(title);
		wait1Seconds();
	}

	@When("User have to enter name and mass value,roll inertia value")
	public void user_have_to_enter_name_and_mass_value_roll_inertia_value() throws InterruptedException, AWTException {
		sendKeys(o.getBogiespartwheelsetnamebox(), "SHY-05Wheel set");
		o.getBogiespartwheelsetmass().clear();
		sendKeys(o.getBogiespartwheelsetmass(), "1300");
		wait5seconds();
		o.getBogiespartwheelsetrollinertia().clear();
		sendKeys(o.getBogiespartwheelsetrollinertia(), "600");
	}

	@When("User have to click the axelboxpitch inertia and pass value in axelbox pitch inertia")
	public void user_have_to_click_the_axelboxpitch_inertia_and_pass_value_in_axelbox_pitch_inertia()
			throws InterruptedException {
		elementClick(o.getBogiespartwheelsetaxelpitchinertia());
		wait1Seconds();
		o.getBogiespartwheelsetaxelpitchinertiabox().clear();
		sendKeys(o.getBogiespartwheelsetaxelpitchinertiabox(), "10");
	}

	@When("User have to click wheelset save button")
	public void user_have_to_click_wheelset_save_button() throws InterruptedException {
		elementClick(o.getBogiespartwheelsetsave());
        wait1Seconds();
        quitTab();
	}

	
	
	// create bogie friction(Inside of bogie option)

	@Given("User have to click the friction option")
	public void user_have_to_click_the_friction_option() throws InterruptedException {
		o = new OleoPojo();
		elementClick(o.getBogiesfriction());
		String title = driver.getTitle();
		System.out.println(title);

		wait1Seconds();
	}

	@When("User have to enter the name box")
	public void user_have_to_enter_the_name_box() throws InterruptedException {
		sendKeys(o.getBogiespartfrictionnamebox(), "SHY-05 Friction");
		wait1Seconds();
	}

	@When("User have to click the details option")
	public void user_have_to_click_the_details_option() throws InterruptedException {
		elementClick(o.getBogiespartfrictiondetailedoption());

		wait1Seconds();
	}

	@When("User have to enter coefficient of friction commprestion box")
	public void user_have_to_enter_coefficient_of_friction_commprestion_box() throws InterruptedException {
		o.getBogiespartfrictioncoefficientoffrictioncompression().clear();
		wait1Seconds();
		sendKeys(o.getBogiespartfrictioncoefficientoffrictioncompression(), "0.4");
	}

	@When("User have to enter coefficient of friction tension")
	public void user_have_to_enter_coefficient_of_friction_tension() throws InterruptedException {
		o.getBogiespartfrictioncoefficientoffrictiontension().clear();
		wait1Seconds();
		sendKeys(o.getBogiespartfrictioncoefficientoffrictiontension(), "0.4");
	}

	@When("User have to enter static part of load")
	public void user_have_to_enter_static_part_of_load() throws InterruptedException {

		o.getBogiespartfrictionstaticpartofnormalload().clear();
		wait1Seconds();
		sendKeys(o.getBogiespartfrictionstaticpartofnormalload(), "3.67");
	}

	@When("User have to click the stiffness damper button and enter series stiffness")
	public void user_have_to_click_the_stiffness_damper_button_and_enter_series_stiffness()
			throws InterruptedException {
		elementClick(o.getBogiespartfrictionstiffnessdampingbutton());
		wait1Seconds();
		elementClick(o.getBogiespartfrictionstiffnessdampingcheckboxs());
		o.getBogiespartfrictionstiffnessdampingseriesstiffnessbox().clear();
		wait1Seconds();
		sendKeys(o.getBogiespartfrictionstiffnessdampingseriesstiffnessbox(), "60");
	}

	@When("User have to click the friction save button")
	public void user_have_to_click_the_friction_save_button() throws InterruptedException {
		elementClick(o.getBogiespartfrictionstiffnessdampingsavebutton());
		wait5seconds();
	}
	
	

	// create Bogie Bump Stop (Inside the bogie part bump stop)

	@Given("User have to enter bumstop name box")
	public void user_have_to_enter_bumstop_name_box() throws InterruptedException {
		jsPassValue(o.getBogiespartbumpstopnamebox(), "SHY-05 Bumpstop");
		wait1Seconds();

	}

	@Given("User have to click pluse button two time")
	public void user_have_to_click_pluse_button_two_time() throws InterruptedException {
		elementClick(o.getBogiespartbumpstopplusbutton());
		elementClick(o.getBogiespartbumpstopplusbuttontwo());
		wait1Seconds();

	}

	@Given("User have to click the bumpstop option")
	public void user_have_to_click_the_bumpstop_option() throws InterruptedException {
		
		elementClick(o.getBogiesbumpstop());
		String title = driver.getTitle();
		System.out.println(title);
		wait1Seconds();
	}

	@When("User have to fill the stock and force box")
	public void user_have_to_fill_the_stock_and_force_box() throws InterruptedException {
		sendKeys(o.getBogiespartbumpstopstrokeone(), "-10");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopstroketwo(), "0");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopstrokethree(), "10");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopforceone(), "-8.16");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopforcetwo(), "0");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopforcethree(), "0");
		wait1Seconds();
	}

	@When("User have to click define offset check box")
	public void user_have_to_click_define_offset_check_box() throws InterruptedException {
		elementClick(o.getBogiespartbumpstopdefineoffset());
		wait1Seconds();

	}

	@When("User have to click clearance check box")
	public void user_have_to_click_clearance_check_box() {
		elementClick(o.getBogiespartbumpstopclearancerediobutton());

	}

	@When("User have to enter clearance value")
	public void user_have_to_enter_clearance_value() throws InterruptedException {
		sendKeys(o.getBogiespartbumpstopclearancebox(), "6");
		wait1Seconds();

	}

	@When("User have to click bumpstop save button")
	public void user_have_to_click_bumpstop_save_button() throws InterruptedException {

		elementClick(o.getBogiespartbumpstopsavebutton());
		wait5seconds();
	}
	
	

	// create bogie Bush (Inside of bogie part option)

	@Given("User have to click the bush option")
	public void user_have_to_click_the_bush_option() throws InterruptedException {
		o = new OleoPojo();
		elementClick(o.getBogiesbush());
		String title = driver.getTitle();
		System.out.println(title);
		wait1Seconds();

	}

	@When("User have to enter bush part name")
	public void user_have_to_enter_bush_part_name() throws InterruptedException {
		sendKeys(o.getBogiespartbushpartname(), "SHY-05 Bush");
		wait1Seconds();
	}

	@When("User have to click has stiffness redio button")
	public void user_have_to_click_has_stiffness_redio_button() throws InterruptedException {
		elementClick(o.getBogiespartbushhasstiffnessrediobutton());
		wait1Seconds();
	}

	@When("User have to enter x and y value")
	public void user_have_to_enter_x_and_y_value() throws InterruptedException {
		o.getBogiespartbushxbox().clear();
		sendKeys(o.getBogiespartbushxbox(), "80");
		wait1Seconds();
		o.getBogiespartbushybox().clear();
		sendKeys(o.getBogiespartbushybox(), "80");
	}

	@When("User have to click appearance option")
	public void user_have_to_click_appearance_option() throws InterruptedException {
		elementClick(o.getBogiespartbushappearancebutton());
		wait1Seconds();
	}

	@When("User have to click the small and axiz z")
	public void user_have_to_click_the_small_and_axiz_z() throws InterruptedException {
		elementClick(o.getBogiespartbushsizesmall());
		wait1Seconds();
		elementClick(o.getBogiespartbushaxisz());
	}

	@When("User have to click the bush save button")
	public void user_have_to_click_the_bush_save_button() throws InterruptedException {
		elementClick(o.getBogiespartbushsavebutton());
		wait5seconds();
	}

	
	
	// create bogie stiffness(Inside the bogie part option)

	@Given("User have to click the stiffness option")
	public void user_have_to_click_the_stiffness_option() throws InterruptedException {
		elementClick(o.getBogiesstiffness());
		String title = driver.getTitle();
		System.out.println(title);
		wait1Seconds();
	}

	@When("User have to enter stiffness part name")
	public void user_have_to_enter_stiffness_part_name() throws InterruptedException {
		sendKeys(o.getBogiespartsiffnesspartnamebox(), "SHY-05 Stiffness");
		wait1Seconds();
	}

	@When("User have to enter linear stiffness value box")
	public void user_have_to_enter_linear_stiffness_value_box() throws InterruptedException {
		o.getBogiespartstiffnesslinearstiffness().clear();
		wait1Seconds();
		sendKeys(o.getBogiespartstiffnesslinearstiffness(), "0.56");
	}

	@When("User have to click the stiffness save button")
	public void user_have_to_click_the_stiffness_save_button() throws InterruptedException {
		elementClick(o.getBogiespartstiffnesssavebutton());
		wait5seconds();
	}

	
	
	// create bogie center point friction(Inside of bogie part friction option)

	@When("User have to enter the center friction name box")
	public void user_have_to_enter_the_center_friction_name_box() throws InterruptedException {
		sendKeys(o.getBogiespartfrictionnamebox(), "SHY-05 Center friction pivot");
		wait1Seconds();
	}

	@When("User have to enter coefficient of center friction commprestion box")
	public void user_have_to_enter_coefficient_of_center_friction_commprestion_box() throws InterruptedException {
		o.getBogiespartfrictioncoefficientoffrictioncompression().clear();
		wait1Seconds();
		sendKeys(o.getBogiespartfrictioncoefficientoffrictioncompression(), "0.25");
	}

	@When("User have to enter coefficient of center friction tension")
	public void user_have_to_enter_coefficient_of_center_friction_tension() throws InterruptedException {
		o.getBogiespartfrictioncoefficientoffrictiontension().clear();
		wait1Seconds();
		sendKeys(o.getBogiespartfrictioncoefficientoffrictiontension(), "0.25");

	}

	@When("User have to enter center friction static part of load")
	public void user_have_to_enter_center_friction_static_part_of_load() throws InterruptedException {
		o.getBogiespartfrictionstaticpartofnormalload().clear();
		wait1Seconds();
		sendKeys(o.getBogiespartfrictionstaticpartofnormalload(), "26.86");
	}

	@When("User have to click the center friction stiffness damper button and enter series stiffness")
	public void user_have_to_click_the_center_friction_stiffness_damper_button_and_enter_series_stiffness()
			throws InterruptedException {
		elementClick(o.getBogiespartfrictionstiffnessdampingbutton());
		wait1Seconds();
		elementClick(o.getBogiespartfrictionstiffnessdampingcheckboxs());
		o.getBogiespartfrictionstiffnessdampingseriesstiffnessbox().clear();
		wait1Seconds();
		sendKeys(o.getBogiespartfrictionstiffnessdampingseriesstiffnessbox(), "80");
	}

	
	
	// create bogie part shear spring( Inside the bogie option)

	@When("User have to the shear spring option")
	public void user_have_to_the_shear_spring_option() throws InterruptedException {
		elementClick(o.getBogiesshearspring());
		wait1Seconds();
	}

	@When("User have to enter the shear spring part name")
	public void user_have_to_enter_the_shear_spring_part_name() throws InterruptedException {
		sendKeys(o.getBogiesshearspringpartnamebox(), "SHY-05 shear spring");
		wait1Seconds();
	}

	@When("User have to enter shear spring x y z values")
	public void user_have_to_enter_shear_spring_x_y_z_values() throws InterruptedException {
		o.getBogiesshearspringxbox().clear();
		wait1Seconds();
		sendKeys(o.getBogiesshearspringxbox(), "0.16");
		wait1Seconds();
		o.getBogiesshearspringybox().clear();
		wait1Seconds();
		sendKeys(o.getBogiesshearspringybox(), "0.18");
		wait1Seconds();
		o.getBogiesshearspringzbox().clear();
		wait1Seconds();
		sendKeys(o.getBogiesshearspringzbox(), "0.416");
		wait1Seconds();
	}

	@Then("User have to click the shear spring save button")
	public void user_have_to_click_the_shear_spring_save_button() throws InterruptedException {
		elementClick(o.getBogiesshearspringsavebutton());
		wait1Seconds();
	}

	
	
	// create bogie part side stiffness(Inside the bogie option)

	@When("User have to enter side stiffness part name")
	public void user_have_to_enter_side_stiffness_part_name() throws InterruptedException {
		sendKeys(o.getBogiespartsiffnesspartnamebox(), "SHY-05 Side Stiffness");
		wait1Seconds();
	}

	@When("User have to enter linear side stiffness value box")
	public void user_have_to_enter_linear_side_stiffness_value_box() throws InterruptedException {
		o.getBogiespartstiffnesslinearstiffness().clear();
		sendKeys(o.getBogiespartstiffnesslinearstiffness(), "0.56");
		wait1Seconds();
	}

	
	
	// create side bearer bump stop in bogie part (In side the bogie option)

	@Given("User have to enter side bearer bumstop name box")
	public void user_have_to_enter_side_bearer_bumstop_name_box() throws InterruptedException {
		jsPassValue(o.getBogiespartbumpstopnamebox(), "SHY-05 side bearer Bumpstop");
		wait1Seconds();

	}

	@When("User have to fill the side bearer stock and force box")
	public void user_have_to_fill_the_side_bearer_stock_and_force_box() throws InterruptedException {
		sendKeys(o.getBogiespartbumpstopstrokeone(), "-10");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopstroketwo(), "0");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopstrokethree(), "10");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopforceone(), "-600");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopforcetwo(), "0");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopforcethree(), "0");
		wait1Seconds();

	}

	@When("User have to enter side bearer clearance value")
	public void user_have_to_enter_side_bearer_clearance_value() throws InterruptedException {
		o.getBogiespartbumpstopclearancebox().clear();
		sendKeys(o.getBogiespartbumpstopclearancebox(), "12");
		wait1Seconds();

	}

	
	
	// create bogie side bearer mass (In side the bogie option)

	@When("User have to enter side bearer  mass name in part name box")
	public void user_have_to_enter_side_bearer_mass_name_in_part_name_box() {
		sendKeys(o.getBogiespartmassnamebox(), "SHY-05 Side bearer Mass");

	}

	@When("User have to enter side bearer  mass,roll inretia,pitch inretia,yaw inretia value")
	public void user_have_to_enter_side_bearer_mass_roll_inretia_pitch_inretia_yaw_inretia_value()
			throws InterruptedException {
		o.getBogiespartmassmassbox().clear();
		sendKeys(o.getBogiespartmassmassbox(), "10");
		wait1Seconds();
		o.getBogiespartmassrollinertia().clear();
		sendKeys(o.getBogiespartmassrollinertia(), "10");
		wait1Seconds();
		o.getBogiespartmasspitchinertia().clear();
		sendKeys(o.getBogiespartmasspitchinertia(), "10");
		wait1Seconds();
		o.getBogiespartmassyawinertia().clear();
		sendKeys(o.getBogiespartmassyawinertia(), "10");

	}

	// create bogie long side bearer bump stop (In side the Bogie option)

	@Given("User have to enter long side bearer bumstop name box")
	public void user_have_to_enter_long_side_bearer_bumstop_name_box() throws InterruptedException {
		jsPassValue(o.getBogiespartbumpstopnamebox(), "SHY-05 Long Side Bearer Bumpstop");
		wait1Seconds();
	}

	@Given("User have to click pluse button three time")
	public void user_have_to_click_pluse_button_three_time() {
		elementClick(o.getBogiespartbumpstopplusbutton());
		elementClick(o.getBogiespartbumpstopplusbuttontwo());
		elementClick(o.getBogiespartbumpstopplusbuttonthree());
		elementClick(o.getBogiespartbumpstopplusbuttonfoure());
	}

	@When("User have to fill the long side bearer stock and force box")
	public void user_have_to_fill_the_long_side_bearer_stock_and_force_box() throws InterruptedException {
		sendKeys(o.getBogiespartbumpstopstrokeone(), "-11");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopstroketwo(), "-1");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopstrokethree(), "0");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopstrokefour(), "1");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopstrokefive(), "11");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopforceone(), "-600.464");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopforcetwo(), "-0.464");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopforcethree(), "0");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopforcefour(), "0.464");
		wait1Seconds();
		sendKeys(o.getBogiespartbumpstopforcefive(), "-600.464");
		wait1Seconds();
	}

	@When("User have to enter long side bearer clearance value")
	public void user_have_to_enter_long_side_bearer_clearance_value() throws InterruptedException {
		o.getBogiespartbumpstopclearancebox().clear();
		sendKeys(o.getBogiespartbumpstopclearancebox(), "2");
		wait1Seconds();
		
	}

	// Delete bogie part in bulk delete option(inside of bogie part)

	@When("User have to click the bogies bulk delete option")
	public void user_have_to_click_the_bogies_bulk_delete_option() throws InterruptedException {
		elementClick(o.getBulkdeleteoptioninbogiespart());
		wait1Seconds();
	}

	@When("User have to click the bogies bulk delete select all option")
	public void user_have_to_click_the_bogies_bulk_delete_select_all_option() throws InterruptedException {
		elementClick(o.getSelectalloptioninbogiespart());
		wait1Seconds();
	}

	@When("User have to click the bogies bulk delete delete button")
	public void user_have_to_click_the_bogies_bulk_delete_delete_button() throws InterruptedException {
		elementClick(o.getDeleteallbuttoninbogiespart());
		wait1Seconds();
	}

	
	
	// Delete bogie assembly (inside of bogie assembly option)

	@When("User have to click the bogies bulk assembly delete option")
	public void user_have_to_click_the_bogies_bulk_assembly_delete_option() throws InterruptedException {
		elementClick(o.getBulkdeleteoptioninbogiesassembly());
		wait1Seconds();
	}

	@When("User have to click the bogies bulk assembly delete select all option")
	public void user_have_to_click_the_bogies_bulk_assembly_delete_select_all_option() throws InterruptedException {
		elementClick(o.getSellectalloptionbogiesassembly());
		wait1Seconds();
	}

	@When("User have to click the bogies bulk assembly delete delete button")
	public void user_have_to_click_the_bogies_bulk_assembly_delete_delete_button() throws InterruptedException {
		elementClick(o.getDeleteallbuttoninbogiesassembly());
		wait1Seconds();
	}

	
	
	// create hydrolic sliding buffer stop(In side of buffer stop option)

	@Given("User have to select type,contact and select template")
	public void user_have_to_select_type_contact_and_select_template() throws InterruptedException {
		elementClick(o.getBufferstopselectbufferstoptype());
		wait1Seconds();
		elementClick(o.getBufferstopselectslidingtype());
		elementClick(o.getBufferstopselectcontacttype());
		wait1Seconds();
		elementClick(o.getBufferstopselectcentercontact());
		wait1Seconds();
	}

	@Given("User have to click the bufferstop select template button")
	public void user_have_to_click_the_bufferstop_select_template_button() throws InterruptedException {
		elementClick(o.getBufferstopselecttemlatebufferstop());
		wait1Seconds();
		elementClick(o.getBufferstopselecttemplatecouplerslidingbufferstop());
		wait1Seconds();
		elementClick(o.getBufferstopselecttemplatebutton());
	}

	@When("User have to click the save and review of sliding bufferstop")
	public void user_have_to_click_the_save_and_review_of_sliding_bufferstop() throws InterruptedException {
		elementClick(o.getBufferstopsaveandreviewslidingbufferstop());
		Thread.sleep(4000);
	}

	@When("User have to click add friction shoes")
	public void user_have_to_click_add_friction_shoes() throws InterruptedException {
		elementClick(o.getBufferstopaddfrictionshoes());
		wait1Seconds();
	}

	@When("User have to enter elements under frame")
	public void user_have_to_enter_elements_under_frame() throws InterruptedException {
		o.getBufferstopeditfrictionshoes().clear();
		wait1Seconds();
		sendKeys(o.getBufferstopeditfrictionshoes(), "2");
		wait1Seconds();

	}

	@When("User have to click the attach the friction shoe button and save")
	public void user_have_to_click_the_attach_the_friction_shoe_button_and_save() throws InterruptedException {
		elementClick(o.getBufferstopattachfrictionshoes());
		wait1Seconds();
		elementClick(o.getBufferstopsaveditfrictionshoes());
		wait1Seconds();
		elementClick(o.getBufferstopgashydrolicplusbutton());
		wait1Seconds();
		elementClick(o.getBufferstopchoosefromlibrary());
		wait1Seconds();
		elementClick(o.getBufferstopselectdevicebox());
		elementClick(o.getBufferstopselecttype53());
		elementClick(o.getBufferstopselecttemplatehydrolicbutton());
		sendKeys(o.getBufferstopparalleloption(), "2");
		elementClick(o.getBufferstopattachbutton());
		wait1Seconds();

	}

	@When("User have to click the threeD view of sliding bufferstop")
	public void user_have_to_click_the_threeD_view_of_sliding_bufferstop() throws InterruptedException {
		elementClick(o.getBufferstopfrictionshoes3dview());
		Thread.sleep(8000);
	}

	
	
	// fred jones check the payment option

	@Given("User have to enter fredjones name and password click login")
	public void user_have_to_enter_fredjones_name_and_password_click_login() throws InterruptedException {

		o = new OleoPojo();
		sendKeys(o.getLoginusername(), "fred.jones@examplecompamy.co.uk");
		wait1Seconds();
		sendKeys(o.getLoginpassword(), "testing123");
		wait1Seconds();
		implicitWait();
		elementClick(o.getLoginsubmit());
		wait1Seconds();
	}

	@Given("User have to enter dashboard and click the fred jones user and settings")
	public void user_have_to_enter_dashboard_and_click_the_fred_jones_user_and_settings() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Dashboard");
		wait1Seconds();
		elementClick(o.getFredjohnoption());
		elementClick(o.getFredjonessettingoption());
		wait1Seconds();
	}

	@Given("User have to click upgrade your account and select impact option in fred jones account")
	public void user_have_to_click_upgrade_your_account_and_select_impact_option_in_fred_jones_account()
			throws InterruptedException {
		elementClick(o.getFredjonesupgradeaccount());
		wait1Seconds();
		elementClick(o.getFredjonesselectfirstoption());
		wait1Seconds();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Settings");
	}

	@When("User have to click the first upgrade plan")
	public void user_have_to_click_the_first_upgrade_plan() throws InterruptedException {
		elementClick(o.getFredjonesupgradebutton());
		wait1Seconds();
	}

	@When("User have to click the proceed to payment in fred jones account")
	public void user_have_to_click_the_proceed_to_payment_in_fred_jones_account() throws InterruptedException {
		elementClick(o.getFredjonesproceedtopayment());
		Thread.sleep(5000);
	}

	@When("User have to enter invalid  card number and valid expiration date ,valid cvc number")
	public void user_have_to_enter_invalid_card_number_and_valid_expiration_date_valid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFredjonescardnumber(), "4000000000000069");
		wait1Seconds();
		sendKeys(o.getFredjonesexpiredate(), "1224");
		wait1Seconds();
		sendKeys(o.getFredjonescvcnumber(), "123");
	}

	@When("User have to click the fred jones pay button")
	public void user_have_to_click_the_fred_jones_pay_button() throws InterruptedException {
		driver.switchTo().defaultContent();
		elementClick(o.getFredjonespaynowbutton());
		Thread.sleep(2000);
	}

	@When("User have to click the fred jones pay button wait load time")
	public void user_have_to_click_the_fred_jones_pay_button_wait_load_time() throws InterruptedException {
		driver.switchTo().defaultContent();
		elementClick(o.getFredjonespaynowbutton());
		Thread.sleep(25000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	@When("User have to enter valid  card number and invalid expiration date ,valid cvc number")
	public void user_have_to_enter_valid_card_number_and_invalid_expiration_date_valid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFredjonescardnumber(), "4000003560000008");
		wait1Seconds();
		sendKeys(o.getFredjonesexpiredate(), "1222");
		wait1Seconds();
		sendKeys(o.getFredjonescvcnumber(), "123");
	}

	@When("User have to enter valid  card number and valid expiration date ,invalid cvc number")
	public void user_have_to_enter_valid_card_number_and_valid_expiration_date_invalid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFredjonescardnumber(), "4000003560000008");
		wait1Seconds();
		sendKeys(o.getFredjonesexpiredate(), "1223");
		wait1Seconds();
		sendKeys(o.getFredjonescvcnumber(), "12");
	}

	@When("User have to enter invalid  card number and invalid expiration date ,valid cvc number")
	public void user_have_to_enter_invalid_card_number_and_invalid_expiration_date_valid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFredjonescardnumber(), "4000000000000069");
		wait1Seconds();
		sendKeys(o.getFredjonesexpiredate(), "1222");
		wait1Seconds();
		sendKeys(o.getFredjonescvcnumber(), "123");
	}

	@When("User have to enter valid  card number and invalid expiration date ,invalid cvc number")
	public void user_have_to_enter_valid_card_number_and_invalid_expiration_date_invalid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFredjonescardnumber(), "4000003560000008");
		wait1Seconds();
		sendKeys(o.getFredjonesexpiredate(), "1222");
		wait1Seconds();
		sendKeys(o.getFredjonescvcnumber(), "12");
	}

	@When("User have to enter invalid  card number and valid expiration date ,invalid cvc number")
	public void user_have_to_enter_invalid_card_number_and_valid_expiration_date_invalid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFredjonescardnumber(), "4000000000000069");
		wait1Seconds();
		sendKeys(o.getFredjonesexpiredate(), "1223");
		wait1Seconds();
		sendKeys(o.getFredjonescvcnumber(), "12");
	}

	@When("User have to enter invalid  card number and invalid expiration date ,invalid cvc number")
	public void user_have_to_enter_invalid_card_number_and_invalid_expiration_date_invalid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFredjonescardnumber(), "4000000000000069");
		wait1Seconds();
		sendKeys(o.getFredjonesexpiredate(), "1222");
		wait1Seconds();
		sendKeys(o.getFredjonescvcnumber(), "12");
	}

	@When("User have to enter valid  card number and valid expiration date ,valid cvc number")
	public void user_have_to_enter_valid_card_number_and_valid_expiration_date_valid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFredjonescardnumber(), "4000003560000008");
		wait1Seconds();
		sendKeys(o.getFredjonesexpiredate(), "1223");
		wait1Seconds();
		sendKeys(o.getFredjonescvcnumber(), "123");
	}

	
	
	// first user check the payment option(inside the upgrade option)

	@Given("User have to enter first user name and password click login")
	public void user_have_to_enter_first_user_name_and_password_click_login() throws InterruptedException {

		o = new OleoPojo();
		sendKeys(o.getLoginusername(),"first.user@acme.co.uk");
		wait1Seconds();
		sendKeys(o.getLoginpassword(),"testing123");
		wait1Seconds();
		implicitWait();
		elementClick(o.getLoginsubmit());
		wait5seconds();

	}

	@Given("User have to enter dashboard and click the first user and settings")
	public void user_have_to_enter_dashboard_and_click_the_first_user_and_settings() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Dashboard");
		wait1Seconds();
		elementClick(o.getFirstuseroption());
		wait1Seconds();
		elementClick(o.getFirstusersettingoption());
		wait1Seconds();
	}

	@Given("User have to click upgrade your account and select impact option")
	public void user_have_to_click_upgrade_your_account_and_select_impact_option() throws InterruptedException {

		elementClick(o.getFirstuserupgradeaccount());
		wait1Seconds();
		elementClick(o.getFirstuserselectfirstoption());
		wait1Seconds();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Settings");

	}

	@When("User have to click the first plan")
	public void user_have_to_click_the_first_plan() throws InterruptedException {
		elementClick(o.getFirstuserupgradebutton());
		wait1Seconds();

	}

	@When("User have to click the proceed to payment")
	public void user_have_to_click_the_proceed_to_payment() throws InterruptedException {
		elementClick(o.getFirstuserproceedtopayment());
		Thread.sleep(5000);
	}

	@When("User have to enter valid credit card number and valid expiration date ,valid cvc number")
	public void user_have_to_enter_valid_credit_card_number_and_valid_expiration_date_valid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "5555555555554444");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "1224");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "123");

	}

	@When("User have to enter invalid credit card number and valid expiration date ,valid cvc number")
	public void user_have_to_enter_invalid_credit_card_number_and_valid_expiration_date_valid_cvc_number()
			throws InterruptedException {

		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000000000000069");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "1224");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "123");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
	}

	@When("User have to enter valid credit card number and invalid expiration date ,valid cvc number")
	public void user_have_to_enter_valid_credit_card_number_and_invalid_expiration_date_valid_cvc_number()
			throws InterruptedException {

		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000003560000008");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "0509");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "123");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
	}

	@When("User have to enter valid credit card number and valid expiration date ,invalid cvc number")
	public void user_have_to_enter_valid_credit_card_number_and_valid_expiration_date_invalid_cvc_number()
			throws InterruptedException {

		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000003560000008");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "1224");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "23");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");

	}

	@When("User have to enter invalid credit card number and invalid expiration date ,invalid cvc number")
	public void user_have_to_enter_invalid_credit_card_number_and_invalid_expiration_date_invalid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000000000000069");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "0509");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "23");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
	}

	@When("User have to enter valid credit card number and invalid expiration date ,invalid cvc number")
	public void user_have_to_enter_valid_credit_card_number_and_invalid_expiration_date_invalid_cvc_number()
			throws InterruptedException {

		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000003560000008");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "0509");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "23");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
	}

	@When("User have to enter invalid credit card number and invalid expiration date ,valid cvc number")
	public void user_have_to_enter_invalid_credit_card_number_and_invalid_expiration_date_valid_cvc_number()
			throws InterruptedException {

		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000000000000069");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "0509");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "123");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
	}

	@When("User have to enter invalid credit card number and valid expiration date ,invalid cvc number")
	public void user_have_to_enter_invalid_credit_card_number_and_valid_expiration_date_invalid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000000000000069");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "1224");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "23");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
	}

	@When("User have to click the first user pay button")
	public void user_have_to_click_the_first_user_pay_button() throws InterruptedException {
		driver.switchTo().defaultContent();
		elementClick(o.getFirstuserpaynowbutton());
		Thread.sleep(2000);

	}

	@When("User have to click the first user pay button wait load time")
	public void user_have_to_click_the_first_user_pay_button_wait_load_time() throws InterruptedException {
		driver.switchTo().defaultContent();
		elementClick(o.getFirstuserpaynowbutton());
		Thread.sleep(25000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	@Given("User have to click the first user sub scription")
	public void user_have_to_click_the_first_user_sub_scription() throws InterruptedException {
		elementClick(o.getFirstuserSubscriptions());
		wait1Seconds();
	}

	@When("User have to click the first user last page")
	public void user_have_to_click_the_first_user_last_page() throws InterruptedException {
		elementClick(o.getFirstuserselectlastpage());
		wait1Seconds();
	}

	@When("User have to click the first user action button")
	public void user_have_to_click_the_first_user_action_button() throws InterruptedException {
		mouseOverAction(o.getFirstuseractionsbutton());
		wait1Seconds();
		elementClick(o.getFirstuseractionsbutton());
		wait1Seconds();
	}

	@When("User have to click the cancel sub scription")
	public void user_have_to_click_the_cancel_sub_scription() throws InterruptedException {
		elementClick(o.getFirstusercancelsub());
		wait1Seconds();
	}

	@When("User have to click the first user cancel conform button")
	public void user_have_to_click_the_first_user_cancel_conform_button() throws InterruptedException {
		elementClick(o.getFirstuserconfirmbutton());
		wait1Seconds();
	}

	
	
	// declined card payment in first user account

	@When("User have to enter declined credit card number and valid expiration date ,valid cvc number")
	public void user_have_to_enter_declined_credit_card_number_and_valid_expiration_date_valid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000000000000002");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "1224");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "123");

	}

	@When("User have to click the first user pay button and wait a second")
	public void user_have_to_click_the_first_user_pay_button_and_wait_a_second() throws InterruptedException {
		driver.switchTo().defaultContent();
		elementClick(o.getFirstuserpaynowbutton());
		Thread.sleep(4000);
	}
	
	@When("User have to check the declined card payment error")
	public void user_have_to_check_the_declined_card_payment_error() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
	}

	
	
	// incorrect card in first user account
	
	@When("User have to enter incorrect card number and valid expiration date ,valid cvc number")
	public void user_have_to_enter_incorrect_card_number_and_valid_expiration_date_valid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4242424242424241");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "1224");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "123");

	}

	@When("User have to check the incorrect card payment error")
	public void user_have_to_check_the_incorrect_card_payment_error() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
	}

	
	
	// High risk card first user account

	@When("User have to enter highest risk card number and valid expiration date ,valid cvc number")
	public void user_have_to_enter_highest_risk_card_number_and_valid_expiration_date_valid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000000000004954");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "1224");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "123");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
	}

@When("User have to check the highest risk card payment error")
public void user_have_to_check_the_highest_risk_card_payment_error() {
	String currentUrl = driver.getCurrentUrl();
	Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
}



	
	// CVC check fail card first user account

	@When("User have to enter cvc check fail card number and valid expiration date ,valid cvc number")
	public void user_have_to_enter_cvc_check_fail_card_number_and_valid_expiration_date_valid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000000000000101");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "1224");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "123");

	}
	@When("User have to check the fail card payment error")
	public void user_have_to_check_the_fail_card_payment_error() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
	}

	
	
	// Elevated risk card first user account

	@When("User have to enter elevated risk card number and valid expiration date ,valid cvc number")
	public void user_have_to_enter_elevated_risk_card_number_and_valid_expiration_date_valid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000000000009235");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "1224");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "123");
		
	}

	@When("User have to click the first user pay button and wait to check")
	public void user_have_to_click_the_first_user_pay_button_and_wait_to_check() throws InterruptedException {
		driver.switchTo().defaultContent();
		elementClick(o.getFirstuserpaynowbutton());
	    Thread.sleep(2000);
	    String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");

		
	}

	
	
	// lost card payment in first user account

	@When("User have to enter lost card number and valid expiration date ,valid cvc number")
	public void user_have_to_enter_lost_card_number_and_valid_expiration_date_valid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000000000009987");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "1224");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "123");

	}
	@When("User have to check the lost card payment error")
	public void user_have_to_check_the_lost_card_payment_error() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
	}
	

	// insufficient card payment in first user account

	@When("User have to enter insufficient card number and valid expiration date ,valid cvc number")
	public void user_have_to_enter_insufficient_card_number_and_valid_expiration_date_valid_cvc_number()
			throws InterruptedException {
		driver.switchTo().frame(o.getFirstuserpaymentoptioninsideframe());
		wait1Seconds();
		sendKeys(o.getFirstusercardnumber(), "4000000000009995");
		wait1Seconds();
		sendKeys(o.getFirstuserexpiredate(), "1224");
		wait1Seconds();
		sendKeys(o.getFirstusercvcnumber(), "123");

	}
	@When("User have to check the insufficient card payment error")
	public void user_have_to_check_the_insufficient_card_payment_error() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/payment/10");
	}
	

	// first employ basic payment option check

	@When("User have to click the upgarde your account option")
	public void user_have_to_click_the_upgarde_your_account_option() throws InterruptedException {
		elementClick(o.getFirstuserupgradeyouraccountoption());
		wait1Seconds();
	}

	@When("User have to enter Upgarde page url")
	public void user_have_to_enter_Upgarde_page_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade");
	}

	@Given("User have to click the impact option")
	public void user_have_to_click_the_impact_option() throws InterruptedException {
		elementClick(o.getFirstuserselectimpact());
		wait1Seconds();
	}

	@Given("User have to select the impact view plus option")
	public void user_have_to_select_the_impact_view_plus_option() throws InterruptedException {
		elementClick(o.getFirstuserimpactselectviewoption());
		wait1Seconds();
	}

	@When("User have to reach in impact view plus url")
	public void user_have_to_reach_in_impact_view_plus_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/details/10");
	}

	@Given("User have to select the impact pro option")
	public void user_have_to_select_the_impact_pro_option() throws InterruptedException {
		elementClick(o.getFirstuserimpactselectprooption());
		wait1Seconds();
	}

	@When("User have to reach in impact pro url")
	public void user_have_to_reach_in_impact_pro_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/details/11");
	}

	@Given("User have to select the impact expert option")
	public void user_have_to_select_the_impact_expert_option() throws InterruptedException {
		elementClick(o.getFirstuserimpactselectexpertoption());
		wait1Seconds();
	}

	@When("User have to reach in impact expert url")
	public void user_have_to_reach_in_impact_expert_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/details/12");
	}

	@Given("User have to click the train running option")
	public void user_have_to_click_the_train_running_option() throws InterruptedException {
		elementClick(o.getFirstuserrunningtrainoption());
		wait1Seconds();
	}

	@Given("User have to select the train running view plus option")
	public void user_have_to_select_the_train_running_view_plus_option() throws InterruptedException {
		elementClick(o.getFirstuserrunningtrainselectviewoption());
		wait1Seconds();
	}

	@When("User have to reach in train running view plus url")
	public void user_have_to_reach_in_train_running_view_plus_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/details/13");
	}

	@Given("User have to select the train running pro option")
	public void user_have_to_select_the_train_running_pro_option() throws InterruptedException {
		elementClick(o.getFirstuserrunningtrainselectprooption());
		wait1Seconds();
	}

	@When("User have to reach in train running pro url")
	public void user_have_to_reach_in_train_running_pro_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/details/14");
	}

	@Given("User have to select the train running expert option")
	public void user_have_to_select_the_train_running_expert_option() throws InterruptedException {
		elementClick(o.getFirstuserrunningtrainselectexpertoption());
		wait1Seconds();
	}

	@When("User have to reach in train running expert url")
	public void user_have_to_reach_in_train_running_expert_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/details/15");
	}

	@Given("User have to click the gauging option")
	public void user_have_to_click_the_gauging_option() throws InterruptedException {
		elementClick(o.getFirstusergaugingoption());
		wait1Seconds();
	}

	@Given("User have to select the gauging view plus option")
	public void user_have_to_select_the_gauging_view_plus_option() throws InterruptedException {
		elementClick(o.getFirstusergaugingselectviewoption());
		wait1Seconds();
	}

	@When("User have to reach in gauging view plus url")
	public void user_have_to_reach_in_gauging_view_plus_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/details/16");
	}

	@Given("User have to select the gauging pro option")
	public void user_have_to_select_the_gauging_pro_option() throws InterruptedException {
		elementClick(o.getFirstusergaugingselectprooption());
		wait1Seconds();
	}

	@When("User have to reach in gauging pro url")
	public void user_have_to_reach_in_gauging_pro_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/details/17");
	}

	@Given("User have to select the gauging expert option")
	public void user_have_to_select_the_gauging_expert_option() throws InterruptedException {
		elementClick(o.getFirstusergaugingselectexpertoption());
		wait1Seconds();
	}

	@When("User have to reach in gauging expert url")
	public void user_have_to_reach_in_gauging_expert_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/upgrade/details/18");
	}

	@Given("User have to click the user option")
	public void user_have_to_click_the_user_option() throws InterruptedException {
		elementClick(o.getFirstuseruseroption());
		wait1Seconds();
	}

	@Given("User have to enter user url")
	public void user_have_to_enter_user_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/users");
	}

	@Given("User have to click the subscription option")
	public void user_have_to_click_the_subscription_option() throws InterruptedException {
		elementClick(o.getFirstusersubscriptionoption());
		wait1Seconds();

	}

	@Given("User have to enter subscription url")
	public void user_have_to_enter_subscription_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/subscriptions");
	}

	@When("User have to click the invoice option")
	public void user_have_to_click_the_invoice_option() throws InterruptedException {
		elementClick(o.getFirstuserinvoicesoption());
		wait1Seconds();
	}

	@When("User have to enter invoice url")
	public void user_have_to_enter_invoice_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/invoices");
	}

	@When("User have to click the userpayment details option")
	public void user_have_to_click_the_userpayment_details_option() throws InterruptedException {
		elementClick(o.getFirstuserupdatepaymentdetails());
		wait5seconds();
	}

	@When("User have to enter user payment url")
	public void user_have_to_enter_user_payment_url() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/payment");
	}

	@Then("User have close the tab")
	public void user_have_close_the_tab() {
		quitTab();
	}

	
	
	// Example company employs same subscription check

	@Given("User have to click first user upgrade your account and select impact option")
	public void user_have_to_click_first_user_upgrade_your_account_and_select_impact_option()
			throws InterruptedException {
		elementClick(o.getFirstuserupgradeaccount());
		wait1Seconds();
		elementClick(o.getFirstuserselectimpact());
		wait1Seconds();
		elementClick(o.getFirstusergaugingselectviewoption());
		wait1Seconds();
	}

	@Given("User have to click second user upgrade your account and select impact option")
	public void user_have_to_click_second_user_upgrade_your_account_and_select_impact_option()
			throws InterruptedException {
		elementClick(o.getFirstuserupgradeaccount());
		wait1Seconds();
		elementClick(o.getFirstuserselectimpact());
		wait1Seconds();
		elementClick(o.getFirstusergaugingselectviewoption());
		wait1Seconds();
	}

	@Given("User have to enter first employe name and password click login")
	public void user_have_to_enter_first_employe_name_and_password_click_login() throws InterruptedException {
		o = new OleoPojo();
		sendKeys(o.getLoginusername(), "fred.jones@examplecompamy.co.uk");
		wait1Seconds();
		sendKeys(o.getLoginpassword(), "testing123");
		wait1Seconds();
		elementClick(o.getLoginsubmit());
		wait1Seconds();
	}

	@Given("User have to enter dashboard and click the first employe and settings")
	public void user_have_to_enter_dashboard_and_click_the_first_employe_and_settings() {
		elementClick(o.getFredjohnoption());

	}

	@Given("User have to enter second employe name and password click login")
	public void user_have_to_enter_second_employe_name_and_password_click_login() throws InterruptedException {
		o = new OleoPojo();
		sendKeys(o.getLoginusername(), "john.smith@examplecompany.co.uk");
		wait1Seconds();
		sendKeys(o.getLoginpassword(), "testing123");
		wait1Seconds();
		elementClick(o.getLoginsubmit());
		wait1Seconds();
	}

	@When("User have to click the second user pay button wait load time")
	public void user_have_to_click_the_second_user_pay_button_wait_load_time() throws InterruptedException {
		driver.switchTo().defaultContent();
		elementClick(o.getFirstuserpaynowbutton());
		Thread.sleep(25000);
	}

	@Given("User have to enter dashboard and click the second employe and settings")
	public void user_have_to_enter_dashboard_and_click_the_second_employe_and_settings() {
		elementClick(o.getJohnsmithoption());
	}

	
	
	// fred jones Add plan option check (setting > User >Add plan )

	@Given("User have to click the User option fred jones account")
	public void user_have_to_click_the_User_option_fred_jones_account() throws InterruptedException {
		elementClick(o.getFredjonesuserbutton());
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/users");
	}

	@Given("User have to click the add paln for fred jones account")
	public void user_have_to_click_the_add_paln_for_fred_jones_account() throws InterruptedException {
		elementClick(o.getFredjonesadduserplan());
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/users/add");
	}

	@When("User have to click the existing user option fred jones account")
	public void user_have_to_click_the_existing_user_option_fred_jones_account() throws InterruptedException {
		elementClick(o.getFredjonesexistinguseroption());
		wait1Seconds();

	}

	@When("User have to select the user box and select the john smith")
	public void user_have_to_select_the_user_box_and_select_the_john_smith() throws InterruptedException {
		elementClick(o.getFredjonesselectuserbox());
		wait1Seconds();
		elementClick(o.getFredjonesaddjohnsmithaccount());
		wait1Seconds();
	}

	@When("User have to select the sub scription length and select the month")
	public void user_have_to_select_the_sub_scription_length_and_select_the_month() throws InterruptedException {
		elementClick(o.getFredjonesselectsubscriptionbox());
		wait1Seconds();
		elementClick(o.getFredjonesmonthlysubscription());
		wait1Seconds();
	}

	@When("User have to select the type of simulation and select the impact expert option")
	public void user_have_to_select_the_type_of_simulation_and_select_the_impact_expert_option()
			throws InterruptedException {
		elementClick(o.getFredjonesselectsubscriptionlistbox());
		wait1Seconds();
		elementClick(o.getFredjonesselectexpertimpactoption());
		wait1Seconds();
	}

	@When("User have to click conform to paybutton fred jones account")
	public void user_have_to_click_conform_to_paybutton_fred_jones_account() throws InterruptedException {
		elementClick(o.getFredjonesconfirmpaybutton());
		wait1Seconds();
	}

	@When("User have to click the pay button in fred jones account")
	public void user_have_to_click_the_pay_button_in_fred_jones_account() throws InterruptedException {
		elementClick(o.getFredjonespaybutton());
		Thread.sleep(8000);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Settings");
	}

	// john smith add plane check the upgraded account

	@Given("User have to enter john smith name and password click login")
	public void user_have_to_enter_john_smith_name_and_password_click_login() throws InterruptedException {
		o = new OleoPojo();
		sendKeys(o.getLoginusername(), "john.smith@examplecompany.co.uk");
		wait1Seconds();
		sendKeys(o.getLoginpassword(), "testing123");
		wait1Seconds();
		elementClick(o.getLoginsubmit());
		wait1Seconds();
	}

	@When("User have to click the project button and click create simulation")
	public void user_have_to_click_the_project_button_and_click_create_simulation() throws InterruptedException {
		elementClick(o.getJohnsmithcreateasimulation());
		wait1Seconds();
		elementClick(o.getJohnsmithprojectoption());
		wait1Seconds();
//		elementClick(o.getJohnsmithcreatesimulationoption());
//		wait1Seconds();
	}

	@When("User have to check the url and options")
	public void user_have_to_check_the_url_and_options() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/projects/");
		if (currentUrl == "https://testphp.digitaltrains.online/projects") {
			System.out.println("-----John smith account is upgraded successfully-----");
		}
		wait1Seconds();
	}

	
	
	// create bogie Assambly option(inside the bogie)

	@When("User have to click the assambly option")
	public void user_have_to_click_the_assambly_option() throws InterruptedException {
		elementClick(o.getBogiesassembliesoption());
		wait1Seconds();
	}

	@When("User have to click the create bogie option")
	public void user_have_to_click_the_create_bogie_option() throws InterruptedException {
		elementClick(o.getBogiescreatebogiesoption());
		wait1Seconds();
	}

	@When("User have to click the personal and enter the bogie name")
	public void user_have_to_click_the_personal_and_enter_the_bogie_name() throws InterruptedException {
		elementClick(o.getBogiescreatebogiespersonaloption());
		wait1Seconds();
		sendKeys(o.getBogiescreatebogiesentername(), "SHY-05 Bogie");
		wait1Seconds();
	}

	@Then("User have to click the create button")
	public void user_have_to_click_the_create_button() {

		elementClick(o.getBogiescreatebogiescreatebutton());

	}

	
	
	// Add mass in bogie assambly option(Inside the bogie)

	@Given("User have to click the add option")
	public void user_have_to_click_the_add_option() throws InterruptedException {
		implicitWait();
		elementClick(o.getBogiescreatebogiesaddoption());
		wait1Seconds();
	}

	@Given("User have to select the mass part")
	public void user_have_to_select_the_mass_part() throws InterruptedException {
		elementClick(o.getBogiescreatebogiesselectmassoption());
		wait1Seconds();

	}

	@Given("User have to select the choose library and click the select template button")
	public void user_have_to_select_the_choose_library_and_click_the_select_template_button()
			throws InterruptedException {
		elementClick(o.getBogiescreatebogieschoosefromlibrary());
		wait1Seconds();
		elementClick(o.getBogiescreatebogiesselectfirstoption());
		wait1Seconds();
		elementClick(o.getBogiescreatebogiesselecttamplatebutton());
		wait1Seconds();
	}

	@When("User have to enter the center of gravity in z value")
	public void user_have_to_enter_the_center_of_gravity_in_z_value() throws InterruptedException {
		o.getBogiescreatebogiescenterofgravityz().clear();
		wait1Seconds();
		sendKeys(o.getBogiescreatebogiescenterofgravityz(), "0.52");
		wait5seconds();

	}

	@Then("User have to click the add button")
	public void user_have_to_click_the_add_button() throws InterruptedException {

		elementClick(o.getBogiescreatebogiesaddbutton());
		wait5seconds();

	}

	@Then("User have to click the refresh three D button")
	public void user_have_to_click_the_refresh_three_D_button() throws InterruptedException {
		elementClick(o.getBogiescreatebogiesrefreshthreeDview());
		wait5seconds();
	}

	
	
	// Add side mass assembly in bogie option

	@Given("User have to select the side mass choose library and click the select template button")
	public void user_have_to_select_the_side_mass_choose_library_and_click_the_select_template_button()
			throws InterruptedException {
		elementClick(o.getBogiescreatebogieschoosefromlibrary());
		wait1Seconds();
		elementClick(o.getBogiescreatebogiesselectfirstoption());
		wait1Seconds();
		elementClick(o.getBogiescreatebogiesselecttamplatebutton());
		wait1Seconds();
	}

@Given("User have to edit center mass name box")
public void user_have_to_edit_center_mass_name_box() throws InterruptedException {
	o.getBogiescreatebogiespartnamebox().clear();
	sendKeys(o.getBogiescreatebogiespartnamebox(), "SHY-05 center mass");
	wait1Seconds();
}


	@When("User have to enter the center of gravity in y,z value")
	public void user_have_to_enter_the_center_of_gravity_in_y_z_value() throws InterruptedException {
		o.getBogiescreatebogiescenterofgravityz().clear();
		wait1Seconds();
		sendKeys(o.getBogiescreatebogiescenterofgravityz(), "0.8");
		wait1Seconds();
		o.getBogiescreatebogiescenterofgravityy().clear();
		wait1Seconds();
		sendKeys(o.getBogiescreatebogiescenterofgravityy(), "0.85");
	}

	@When("User have to enter the center of gravity in y,z negative value")
	public void user_have_to_enter_the_center_of_gravity_in_y_z_negative_value() throws InterruptedException {
		o.getBogiescreatebogiescenterofgravityz().clear();
		wait1Seconds();
		sendKeys(o.getBogiescreatebogiescenterofgravityz(), "0.8");
		wait1Seconds();
		o.getBogiescreatebogiescenterofgravityy().clear();
		wait1Seconds();
		sendKeys(o.getBogiescreatebogiescenterofgravityy(), "-0.85");
	}

	@Given("User have to edit side right mass name box")
	public void user_have_to_edit_side_right_mass_name_box() throws InterruptedException {
		o.getBogiescreatebogiespartnamebox().clear();
		sendKeys(o.getBogiescreatebogiespartnamebox(), "SHY-05 Right side mass");
		wait1Seconds();
	}

	@Given("User have to edit side left mass name box")
	public void user_have_to_edit_side_left_mass_name_box() throws InterruptedException {
		o.getBogiescreatebogiespartnamebox().clear();
		sendKeys(o.getBogiescreatebogiespartnamebox(), "SHY-05 left side mass");
		wait1Seconds();
	}

	
	
	// Add wheel set in bogie assembly option

	@Given("User have to select wheel set option")
	public void user_have_to_select_wheel_set_option() throws InterruptedException {
		elementClick(o.getBogieswheelset());
		wait1Seconds();
		implicitWait();
	}

	@Given("User have to select the choose library and select first wheel set template button")
	public void user_have_to_select_the_choose_library_and_select_first_wheel_set_template_button()
			throws InterruptedException {
		o = new OleoPojo();
		elementClick(o.getAddwheelsetchoosefromlibrary());
		wait1Seconds();
		elementClick(o.getAddwheelsetpubliclibrarybox());
		wait1Seconds();
		elementClick(o.getAddwheelsetselectfirstwheelset());
		wait1Seconds();
		elementClick(o.getAddwheelsetselecttemplatebutton());
		wait1Seconds();
	}

	@When("User have to enter center of gravity x and z value of wheel set")
	public void user_have_to_enter_center_of_gravity_x_and_z_value_of_wheel_set() throws InterruptedException {

		o.getAddwheelsetpartname().clear();
		wait1Seconds();
		sendKeys(o.getAddwheelsetpartname(), "SHY-05 Right Wheel set");
		wait1Seconds();
		o.getBogiescreatebogiescenterofgravityxwheelset().clear();
		wait1Seconds();
		sendKeys(o.getBogiescreatebogiescenterofgravityxwheelset(), "0.90");
		wait1Seconds();
		o.getBogiescreatebogiescenterofgravityzwheelset().clear();
		wait1Seconds();
		sendKeys(o.getBogiescreatebogiescenterofgravityzwheelset(), "0.405");
		wait1Seconds();

	}

	@When("User have to click the wheelset add button")
	public void user_have_to_click_the_wheelset_add_button() throws InterruptedException {
		elementClick(o.getAddwheelsetaddbutton());
		wait1Seconds();
	}

	
	
	// Add the clone wheel set in bogie option

	@Given("User have to click the wheelset dropdwon and select dropdown")
	public void user_have_to_click_the_wheelset_dropdwon_and_select_dropdown() throws InterruptedException {
		elementClick(o.getAddclonewheelsetdropdwon());
		wait1Seconds();
		elementClick(o.getAddclonewheelsetSHY());
		wait1Seconds();
	}

	@Given("User have to select the clone option")
	public void user_have_to_select_the_clone_option() throws InterruptedException {
		elementClick(o.getAddwheelsetcloneoption());
		wait1Seconds();
	}

	@When("User have to enter center of gravity x and z in clone wheel set")
	public void user_have_to_enter_center_of_gravity_x_and_z_in_clone_wheel_set() throws InterruptedException {
		o.getAddclonepartnamebox().clear();
		sendKeys(o.getAddclonepartnamebox(), "SHY-05 Left Wheel set");
		wait1Seconds();
		o.getBogiescreatebogiescenterofgravityxwheelset().clear();
		wait1Seconds();
		sendKeys(o.getBogiescreatebogiescenterofgravityxwheelset(), "-0.90");
		wait1Seconds();
		o.getBogiescreatebogiescenterofgravityzwheelset().clear();
		sendKeys(o.getBogiescreatebogiescenterofgravityzwheelset(), "0.405");
		wait1Seconds();
	}

	@When("User have to click the wheel set clone save button")
	public void user_have_to_click_the_wheel_set_clone_save_button() {
		elementClick(o.getAddclonewheelsetsavebutton());
	}

	@Then("User have to save the clone wheelset")
	public void user_have_to_save_the_clone_wheelset() throws InterruptedException {
		elementClick(o.getAddclonewheelsetsavebuttontwo());
		wait1Seconds();
		elementClick(o.getAddclonewheelsetsavebogie());
	}

	
	
	// Add shear spring in bogie assemble option

	@Then("User have to close the tabs")
	public void user_have_to_close_the_tabs() {
		closeTab();

	}

	@Given("User have to click the shear spring action button")
	public void user_have_to_click_the_shear_spring_action_button() throws InterruptedException {
		mouseOverAction(o.getShearspringactionsbutton());
		elementClick(o.getShearspringactionsbutton());
		wait1Seconds();

	}

	@Given("User have to click the shear spring edit option")
	public void user_have_to_click_the_shear_spring_edit_option() throws InterruptedException {
		elementClick(o.getShearspringeditbox());
		wait1Seconds();
	}

	@Given("User have to select the shear spring option")
	public void user_have_to_select_the_shear_spring_option() throws InterruptedException {
		elementClick(o.getBogiesshearspring());
		wait1Seconds();
	}

	@Given("User have to click the choose from library and select the personal library")
	public void user_have_to_click_the_choose_from_library_and_select_the_personal_library()
			throws InterruptedException {

		elementClick(o.getBogiesshearspringchoosefromlibrary());
		wait1Seconds();
		elementClick(o.getShearspringselectfirst());
	}

	@Given("User have to click the select template button")
	public void user_have_to_click_the_select_template_button() throws InterruptedException {
		elementClick(o.getShearspringselecttemplate());
		wait1Seconds();
	}

	@Then("User have to clear the part name box and enter the part name box")
	public void user_have_to_clear_the_part_name_box_and_enter_the_part_name_box() throws InterruptedException {
		o.getShearspringpartnamebox().clear();
		wait1Seconds();
		sendKeys(o.getShearspringpartnamebox(), "Right shear spring");
	}

	@Then("User have to enter endponit one x y z and end point two z values")
	public void user_have_to_enter_endponit_one_x_y_z_and_end_point_two_z_values() throws InterruptedException {
		o = new OleoPojo();
		o.getShearspringxbox().clear();
		wait1Seconds();
		sendKeys(o.getShearspringxbox(), "1.25");
		o.getShearspringybox().clear();
		wait1Seconds();
		sendKeys(o.getShearspringybox(), "1");
		o.getShearspringzbox().clear();
		elementClick(o.getShearspringzbox());
		wait1Seconds();
		sendKeys(o.getShearspringzbox(), "vehiclebodymass");
		o.getShearspringzsecondbox().clear();
		elementClick(o.getShearspringzsecondbox());
		wait1Seconds();
		sendKeys(o.getShearspringzsecondbox(), "wheelradius");
	}

	@Then("User have to select the first and second mass")
	public void user_have_to_select_the_first_and_second_mass() throws InterruptedException {
		elementClick(o.getShearspringmassone());
		wait1Seconds();
		elementClick(o.getShearspringrightsidemass());
		wait1Seconds();
		elementClick(o.getShearspringmasstwo());
		wait1Seconds();
		elementClick(o.getShearspringwheelset());
		wait1Seconds();

	}

	@Then("User have to click the shear spring add button")
	public void user_have_to_click_the_shear_spring_add_button() throws InterruptedException {
		elementClick(o.getShearspringaddbutton());
		wait1Seconds();

	}

	
	
	// Add friction part in bogie assembly option

	@Given("User have to select the friction option")
	public void user_have_to_select_the_friction_option() throws InterruptedException {

		elementClick(o.getBogiesfriction());
		wait1Seconds();

	}

	@When("User have to select the choose library and select friction select template button")
	public void user_have_to_select_the_choose_library_and_select_friction_select_template_button()
			throws InterruptedException {
		elementClick(o.getBogiesfrictionchooesfromlib());
		wait1Seconds();
		elementClick(o.getBogiesfrictionpleaseselectbox());
		wait1Seconds();
		elementClick(o.getBogiesfrictionselectcenterfrictionpivot());
		wait1Seconds();
		elementClick(o.getBogiesfrictionselecttemplate());
		wait1Seconds();
		elementClick(o.getBogiesfrictionaddbutton());

	}

	@When("User have to click the friction add button")
	public void user_have_to_click_the_friction_add_button() throws InterruptedException {

		elementClick(o.getBogiesfrictionaddbutton());
		wait1Seconds();

	}

	
	
	// Add Bumpstop part in bogie assembly option

	@Given("User have to select the bumpstop option")
	public void user_have_to_select_the_bumpstop_option() throws InterruptedException {
		elementClick(o.getBogiesbumpstop());
		wait1Seconds();

	}

	@When("User have to select the choose library and select bumpstop select template button")
	public void user_have_to_select_the_choose_library_and_select_bumpstop_select_template_button()
			throws InterruptedException {
		elementClick(o.getBogiesbumpstopchoosefromlibrary());
		wait1Seconds();
		elementClick(o.getBogiesbumpstopselectbox());
		wait1Seconds();
		elementClick(o.getBogiesbumpstopselectfirstoption());
		wait1Seconds();
		elementClick(o.getBogiesbumpstopselecttemplate());
		wait1Seconds();

	}

	@When("User have to change the name and x y and z mass values")
	public void user_have_to_change_the_name_and_x_y_and_z_mass_values() throws InterruptedException {
		o.getBogiesbumpstoppartname().clear();
		sendKeys(o.getBogiesbumpstoppartname(), "Pri laden LRO");
		wait1Seconds();
		o.getBogiesbumpstopxonebox().clear();
		sendKeys(o.getBogiesbumpstopxonebox(), "1.215");
		wait1Seconds();
		o.getBogiesbumpstopxtwobox().clear();
		sendKeys(o.getBogiesbumpstopxtwobox(), "1.215");
		wait1Seconds();
		o.getBogiesbumpstopyonebox().clear();
		sendKeys(o.getBogiesbumpstopyonebox(), "1");
		wait1Seconds();
		o.getBogiesbumpstopytwobox().clear();
		sendKeys(o.getBogiesbumpstopytwobox(), "1");
		wait1Seconds();
		o.getBogiesbumpstopzonebox().clear();
		o.getBogiesbumpstopzonebox().click();
		elementClick(o.getBogiesbumpstopsemiwheelbase());
		wait1Seconds();
		o.getBogiesbumpstopztwobox().clear();
		o.getBogiesbumpstopztwobox().click();
		elementClick(o.getBogiesbumpstopwheelradius());
		wait1Seconds();
		elementClick(o.getBogiesbumpstopmassone());
		wait1Seconds();
		elementClick(o.getBogiesbumpstopShywheelset());
		wait1Seconds();
		elementClick(o.getBogiesbumpstopmasstwo());
		wait1Seconds();
		elementClick(o.getBogiesbumpstopvehiclebody());
		wait1Seconds();

	}

	@When("User have to click the bump stop add button")
	public void user_have_to_click_the_bump_stop_add_button() throws InterruptedException {
		elementClick(o.getBogiesbumpstopaddbutton());
		wait1Seconds();

	}

	
	
	// Add bush option in bogie assembly option

	@Given("User have to select the bush option")
	public void user_have_to_select_the_bush_option() throws InterruptedException {

		elementClick(o.getBogiesbush());
		wait1Seconds();

	}

	@When("User have to select the chooselibrary and select bush select template button")
	public void user_have_to_select_the_chooselibrary_and_select_bush_select_template_button()
			throws InterruptedException {
		elementClick(o.getBogiesbushchoosefromlibrary());
		wait1Seconds();
		elementClick(o.getBogiesbushuserlibrarybox());
		wait1Seconds();
		elementClick(o.getBogiesbushselectSHYbush());
		wait1Seconds();
		elementClick(o.getBogiesbushselecttemplatebutton());
		wait1Seconds();

	}

	@When("User have to change the name and top z,bottom z value")
	public void user_have_to_change_the_name_and_top_z_bottom_z_value() throws InterruptedException {
		o.getBogiesbushnamebox().clear();
		sendKeys(o.getBogiesbushnamebox(), "Center_Pivot");
		wait1Seconds();
		o.getBogiesbushtopzbox().clear();
		sendKeys(o.getBogiesbushtopzbox(), "0.73");
		elementClick(o.getBogiesbushmassone());
		wait1Seconds();
		elementClick(o.getBogiesbushvehiclebody());
		wait1Seconds();
		elementClick(o.getBogiesbushmasstwo());
		wait1Seconds();
		elementClick(o.getBogiesbushground());
		wait1Seconds();

	}

	@When("User have to click the bush add button")
	public void user_have_to_click_the_bush_add_button() throws InterruptedException {
		elementClick(o.getBogiesbushaddbutton());
		wait1Seconds();

	}

	
	
	// Add stiffness part in bogie assembly option

	@Given("User have to select the stiffness option")
	public void user_have_to_select_the_stiffness_option() throws InterruptedException {
		elementClick(o.getBogiesstiffness());
		wait1Seconds();

	}

	@When("User have to select the chooselibrary and select stiffness select template button")
	public void user_have_to_select_the_chooselibrary_and_select_stiffness_select_template_button()
			throws InterruptedException {

		elementClick(o.getBogiesstiffnesschoosefromlibrary());
		wait1Seconds();
		elementClick(o.getBogiesstiffnesspubliclibrarybox());
		wait1Seconds();
		elementClick(o.getBogiesstiffnessSHYstiffness());
		wait1Seconds();
		elementClick(o.getBogiesstiffnessselecttemplatebutton());
		wait1Seconds();

	}

	@When("User have to change the name and end one z,end two z values")
	public void user_have_to_change_the_name_and_end_one_z_end_two_z_values() throws InterruptedException {
		o.getBogiesstiffnessnamebox().clear();
		sendKeys(o.getBogiesstiffnessnamebox(), "Y25_Centerpivotz");
		wait1Seconds();
		o.getBogiesstiffnessendonez().clear();
		sendKeys(o.getBogiesstiffnessendonez(), "0.73");
		wait1Seconds();
		o.getBogiesstiffnessendtwoz().clear();
		sendKeys(o.getBogiesstiffnessendtwoz(), "0.68");
		wait1Seconds();
		elementClick(o.getBogiesstiffnessmassone());
		wait1Seconds();
		elementClick(o.getBogiesstiffnessvehiclebody());
		wait1Seconds();
		elementClick(o.getBogiesstiffnessmasstwo());
		wait1Seconds();
		elementClick(o.getBogiesstiffnessground());
		wait1Seconds();

	}

	@When("User have to click the stiffness add button")
	public void user_have_to_click_the_stiffness_add_button() throws InterruptedException {
		elementClick(o.getBogiesstiffnessaddbutton());
		wait1Seconds();

	}

	// After the bogie completed save and come to see next time present or not

	@Given("User have to click the bogies assably option")
	public void user_have_to_click_the_bogies_assably_option() throws InterruptedException {
		elementClick(o.getBogiesassemblyoption());
		wait1Seconds();

	}

	@When("User have to select bogie and click to edit option")
	public void user_have_to_select_bogie_and_click_to_edit_option() throws InterruptedException {

		elementClick(o.getBogiesassemblyselectSYHbogies());
		wait1Seconds();
		elementClick(o.getBogiesassemblyselectaction());
		wait1Seconds();
		elementClick(o.getBogiesassemblyeditbogieoption());
		wait1Seconds();
	}

	@When("User have to check the assembly url is correct or not")
	public void user_have_to_check_the_assembly_url_is_correct_or_not() {

	}
	
	

	// Setting under update unit option

	@Given("User have to click the hemkumar and click the setting option")
	public void user_have_to_click_the_hemkumar_and_click_the_setting_option() throws InterruptedException {
		elementClick(o.getHemkumaroption());
		wait1Seconds();
		elementClick(o.getHemkumarsettingoption());
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/details");

	}

	@When("User have to click the units option")
	public void user_have_to_click_the_units_option() throws InterruptedException {
		elementClick(o.getHemkumarunitoption());
		wait1Seconds();
		String text = o.getHemkumarunitoptionbody().getText();
		if (text.contains("Units")) {
		      System.out.println("-----After click the unit option to navigate correct page-----");
		} else {
              System.out.println("-----After click the unit option to navigate incorrect page-----");
		}
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/units");
		if (currentUrl == "https://testphp.digitaltrains.online/account/settings/units") {
			System.out.println("-----User enter the unit option-----");
		} else {
			System.out.println("-----User not enter the unit option-----");
		}

	}

	@When("User have to select metric unit standerd")
	public void user_have_to_select_metric_unit_standerd() throws InterruptedException {
		elementClick(o.getHemkumarselectbox());
		wait1Seconds();
		elementClick(o.getHemkumarmetricoption());
		wait1Seconds();

	}

	@When("User have to click submit button")
	public void user_have_to_click_submit_button() throws InterruptedException {
		elementClick(o.getHemkumarsubmitbutton());
		wait1Seconds();

	}

	@When("User have to select the Us unit standerd")
	public void user_have_to_select_the_Us_unit_standerd() throws InterruptedException {
		elementClick(o.getHemkumarselectbox());
		wait1Seconds();
		elementClick(o.getHemkumarusoption());
		wait1Seconds();

	}
	
	

	// Setting under select currency option(inside the your details)

	@Given("User have to click the your details")
	public void user_have_to_click_the_your_details() throws InterruptedException {
		elementClick(o.getHemkumaryourdetails());
		wait1Seconds();
		String text = o.getHemkumaryourdetailsbody().getText();
		if (text.contains("Your Details")) {
			System.out.println("-----After click the your details navigate to correct page-----");
		} else {
			System.out.println("-----After click the your details navigate to incorrect page-----");
		}
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/details");
	}

	@When("User have to click the currency box")
	public void user_have_to_click_the_currency_box() throws InterruptedException {
		elementClick(o.getHemkumarselectcurrencybox());
		wait1Seconds();
	}

	@When("User have to select the EUR option")
	public void user_have_to_select_the_EUR_option() throws InterruptedException {
		elementClick(o.getHemkuamrselectEURcurrency());
		wait1Seconds();
	}

	@Then("User have to click the currency submit button")
	public void user_have_to_click_the_currency_submit_button() throws InterruptedException {
		elementClick(o.getHemkumarcurrencysubmitbutton());
		wait1Seconds();

	}

	@When("User have to select the USD option")
	public void user_have_to_select_the_USD_option() throws InterruptedException {
		elementClick(o.getHemkuamrselectUSDcurrency());
		wait1Seconds();
	}

	@When("User have to select the GBP option")
	public void user_have_to_select_the_GBP_option() throws InterruptedException {
		elementClick(o.getHemkuamrselectGBPcurrency());
		wait1Seconds();
	}

	
	
	// Setting under create shared library and delete options(inside the shared
	// library option)

	@When("User have to click the shared library option")
	public void user_have_to_click_the_shared_library_option() throws InterruptedException {

		elementClick(o.getHemkumarsharedlibrariesoption());
		wait1Seconds();
		String text = o.getHemkumarsharedlibrariesbody().getText();
		if (text.contains("Shared Libraries")) {
			System.out.println("-----After click the sharedlibraries navigate to correct page-----");
		} else {
			System.out.println("-----After click the sharedlibraries navigate to incorrect page-----");
		}
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/libraries");

	}

	@When("User have to click the create shared library option")
	public void user_have_to_click_the_create_shared_library_option() throws InterruptedException {

		elementClick(o.getHemkumarcreatesharedlibrariesoption());
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/account/settings/addlibrary");
		if (currentUrl == "https://testphp.digitaltrains.online/account/settings/addlibrary") {
			System.out.println("-----User enter the shared library url------");
		} else {
			System.out.println("-----User not enter the shared library url-----");
		}

	}

	@Then("User have to enter name of library and click create button")
	public void user_have_to_enter_name_of_library_and_click_create_button() throws InterruptedException {
		sendKeys(o.getHemkumarsharedlibrarysendbox(), "BufferStop Impact Simulation");
		wait1Seconds();
		elementClick(o.getHemkumarsharedlibrarycreatebutton());
		Thread.sleep(3000);

	}

	@When("User have to click the delete shared library button")
	public void user_have_to_click_the_delete_shared_library_button() throws InterruptedException {
		mouseOverAction(o.getHemkumarsharedlibraryaction());
		wait1Seconds();
		elementClick(o.getHemkumarsharedlibrarydeletebutton());
		wait1Seconds();
		elementClick(o.getHemkumarsharedlibrarydeleteconform());
		Thread.sleep(3000);

	}

	
	
	// create vehicle gauges (in side the gauges main menu)

	@When("User have to enter gauge name")
	public void user_have_to_enter_gauge_name() throws InterruptedException {
		implicitWait();
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl == "https://testphp.digitaltrains.online/gauges") {
			System.out.println("-----User enter the gauges url-----");
		} else {
			System.out.println("-----User not enter the gauges url-----");
		}
		sendKeys(o.getCreategaugesnamebox(), "Y25gaugemodel");
		wait1Seconds();
	}

	@When("User have to click the plus option on upper,lower and footstep gauges")
	public void user_have_to_click_the_plus_option_on_upper_lower_and_footstep_gauges() throws InterruptedException {

		elementClick(o.getUpperplus());
		wait1Seconds();
		elementClick(o.getUpperplustwo());
		wait1Seconds();
		elementClick(o.getUpperplusthree());
		wait1Seconds();
		elementClick(o.getLowerplus());
		wait1Seconds();
		elementClick(o.getLowerplustwo());
		wait1Seconds();
		elementClick(o.getLowerplusthree());
		wait1Seconds();
		elementClick(o.getLowerplusfour());
		wait1Seconds();
		elementClick(o.getLowerplusfive());
		wait1Seconds();
		elementClick(o.getFootstepplus());
		wait1Seconds();
		elementClick(o.getFootstepplustwo());
		wait1Seconds();
		elementClick(o.getFootstepplusthree());

	}

	@When("User have to enter x and y values")
	public void user_have_to_enter_x_and_y_values() throws InterruptedException {
		// x
		sendKeys(o.getCreategaugesupperxone(), "1300");
		wait1Seconds();
		sendKeys(o.getCreategaugesupperxtwo(), "1300");
		wait1Seconds();
		sendKeys(o.getCreategaugesupperxthree(), "1");
		wait1Seconds();
		sendKeys(o.getCreategaugesupperxfour(), "1800");
		wait1Seconds();
		sendKeys(o.getCreategaugeslowerxfive(), "1300");
		wait1Seconds();
		sendKeys(o.getCreategaugeslowerxsix(), "1000");
		wait1Seconds();
		sendKeys(o.getCreategaugeslowerxseven(), "435");
		wait1Seconds();
		sendKeys(o.getCreategaugeslowerxeight(), "256");
		wait1Seconds();
		sendKeys(o.getCreategaugeslowerxnine(), "1000");
		wait1Seconds();
		sendKeys(o.getCreategaugeslowerxten(), "3333");
		wait1Seconds();
		sendKeys(o.getCreategaugesfootstepxone(), "1000");
		wait1Seconds();
		sendKeys(o.getCreategaugesfootstepxtwo(), "1000");
		wait1Seconds();
		sendKeys(o.getCreategaugesfootstepxthree(), "434");
		wait1Seconds();
		sendKeys(o.getCreategaugesfootstepxfour(), "246");
		wait1Seconds();

		// y

		sendKeys(o.getCreategaugesupperyone(), "0");
		wait1Seconds();
		sendKeys(o.getCreategaugesupperytwo(), "2500");
		wait1Seconds();
		sendKeys(o.getCreategaugesupperythree(), "12");
		wait1Seconds();
		sendKeys(o.getCreategaugesupperyfour(), "55");
		wait1Seconds();
		sendKeys(o.getCreategaugesloweryfive(), "2500");
		wait1Seconds();
		sendKeys(o.getCreategaugeslowerysix(), "1000");
		wait1Seconds();
		sendKeys(o.getCreategaugesloweryseven(), "0");
		wait1Seconds();
		sendKeys(o.getCreategaugesloweryeight(), "2800");
		wait1Seconds();
		sendKeys(o.getCreategaugeslowerynine(), "44");
		wait1Seconds();
		sendKeys(o.getCreategaugesloweryten(), "435");
		wait1Seconds();
		sendKeys(o.getCreategaugesfootstepyone(), "350");
		wait1Seconds();
		sendKeys(o.getCreategaugesfootstepytwo(), "1000");
		wait1Seconds();
		sendKeys(o.getCreategaugesfootstepythree(), "434");
		wait1Seconds();
		sendKeys(o.getCreategaugesfootstepyfour(), "866");
		Thread.sleep(2000);
	}

	@When("User have to click to save gauge button")
	public void user_have_to_click_to_save_gauge_button() throws InterruptedException {
		elementClick(o.getCreategaugessavebutton());
		wait1Seconds();
	}

	
	
	// create second vehicle gauges(in gauges option)

	@When("User have to enter second gauge name")
	public void user_have_to_enter_second_gauge_name() throws InterruptedException {
		implicitWait();
		sendKeys(o.getSecondvehiclegaugenamebox(), "Y26vehicle gauges");
		wait1Seconds();
	}

	@When("User have to click the plus option on upper,lower")
	public void user_have_to_click_the_plus_option_on_upper_lower() throws InterruptedException {
		elementClick(o.getSecondvehiclegaugeupperplusone());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugeupperplustwo());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugeupperplusthree());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugeupperplusfour());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugeupperplusfive());
		wait1Seconds();

		elementClick(o.getSecondvehiclegaugelowerplusone());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugelowerplustwo());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugelowerplusthree());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugelowerplusfour());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugelowerplusfive());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugelowerplussix());
		wait1Seconds();
		
		elementClick(o.getSecondvehiclegaugefootstepgaugeplusone());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugefootstepgaugeplustwo());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugefootstepgaugeplusthree());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugefootstepgaugeplusfour());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugefootstepgaugeplusfive());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugefootstepgaugeplussix());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugefootstepgaugeplusseven());
		wait1Seconds();
		elementClick(o.getSecondvehiclegaugefootstepgaugepluseight());
		wait1Seconds();
		

	}

	@When("User have to enter upper and lower x and y values")
	public void user_have_to_enter_upper_and_lower_x_and_y_values() throws InterruptedException {
		// x
		sendKeys(o.getSecondvehiclegaugeupperxone(), "1410");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeupperxtwo(), "1410");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeupperxthree(), "1345");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeupperxfour(), "1220");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeupperxfive(), "795");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeupperxsix(), "152.5");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugelowerxone(), "680");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugelowerxtwo(), "680");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugelowerxthree(), "894");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugelowerxfour(), "894");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugelowerxfive(), "1037.5");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugelowerxsix(), "1350");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugelowerxseven(), "1350");
		wait1Seconds();

		// y
		sendKeys(o.getSecondvehiclegaugeupperyone(), "1000");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeupperytwo(), "3080");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeupperythree(), "3300");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeupperyfour(), "3440");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeupperyfive(), "3750");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeupperysix(), "3965");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeloweryone(), "75");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugelowerytwo(), "100");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugelowerythree(), "100");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeloweryfour(), "135");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeloweryfive(), "135");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugelowerysix(), "280");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugeloweryseven(), "1000");
		wait1Seconds();

		// z
		sendKeys(o.getSecondvehiclegaugefootstepxboxone(), "1277.9");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepyboxone(), "1165");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepxboxtwo(),"1582.7");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepyboxtwo(),"1165");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepxboxthree(),"1582.7");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepyboxthree(),"1144.2");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepxboxfour(),"1568.7");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepyboxfour(),"1144.2");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepxboxfive(),"1437.9");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepyboxfive(),"1127");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepxboxsix(),"1397.3");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepyboxsix(),"1100.8");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepxboxseven(),"1385.8");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepyboxseven(),"1099.9");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepxboxeight(),"1243.9");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepyboxeight(),"1097.4");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepxboxnine(),"1226.3");
		wait1Seconds();
		sendKeys(o.getSecondvehiclegaugefootstepyboxnine(),"1088.9");
		wait1Seconds();
        
	}

	
	
	// Create the Structural gauges in main menu gauges option

	@Given("User have to click structural gauge option")
	public void user_have_to_click_structural_gauge_option() throws InterruptedException {

		elementClick(o.getStructuralgaugesoption());
		wait1Seconds();
	}

	@When("User have to enter structural gauge name")
	public void user_have_to_enter_structural_gauge_name() throws InterruptedException {
		sendKeys(o.getStructuralgaugenamebox(), "Japan Structural gauge");
		wait1Seconds();
	}

	@When("User have to enter structural x and y values")
	public void user_have_to_enter_structural_x_and_y_values() {
		// 1
		sendKeys(o.getStructuralx1(), "1275");
		sendKeys(o.getStructuraly1(), "55");
		elementClick(o.getStructuralplus1());
		// 2
		sendKeys(o.getStructuralx2(), "1556");
		sendKeys(o.getStructuraly2(), "380");
		elementClick(o.getStructuralplus2());
		// 3
		sendKeys(o.getStructuralx3(), "1656");
		sendKeys(o.getStructuraly3(), "380");
		elementClick(o.getStructuralplus3());
		// 4
		sendKeys(o.getStructuralx4(), "1665");
		sendKeys(o.getStructuraly4(), "1150");
		elementClick(o.getStructuralplus4());
		// 5
		sendKeys(o.getStructuralx5(), "1690");
		sendKeys(o.getStructuraly5(), "1200");
		elementClick(o.getStructuralplus5());
		// 6
		sendKeys(o.getStructuralx6(), "2200");
		sendKeys(o.getStructuraly6(), "1200");
		elementClick(o.getStructuralplus6());
		// 7
		sendKeys(o.getStructuralx7(), "2200");
		sendKeys(o.getStructuraly7(), "0");
		elementClick(o.getStructuralplus7());
		// 8
		sendKeys(o.getStructuralx8(), "-2200");
		sendKeys(o.getStructuraly8(), "0");
		elementClick(o.getStructuralplus8());
		// 9
		sendKeys(o.getStructuralx9(), "-2200");
		sendKeys(o.getStructuraly9(), "1200");
		elementClick(o.getStructuralplus9());
		// 10
		sendKeys(o.getStructuralx10(), "-1690");
		sendKeys(o.getStructuraly10(), "1200");
		elementClick(o.getStructuralplus10());
		// 11
		sendKeys(o.getStructuralx11(), "-1665");
		sendKeys(o.getStructuraly11(), "1150");
		elementClick(o.getStructuralplus11());
		// 12
		sendKeys(o.getStructuralx12(), "-1656");
		sendKeys(o.getStructuraly12(), "380");
		elementClick(o.getStructuralplus12());
		// 13
		sendKeys(o.getStructuralx13(), "-1556");
		sendKeys(o.getStructuraly13(), "380");
		elementClick(o.getStructuralplus13());
		// 14
		sendKeys(o.getStructuralx14(), "-1275");
		sendKeys(o.getStructuraly14(), "55");

	}

	@When("User have to click to save structural gauge button")
	public void user_have_to_click_to_save_structural_gauge_button() throws InterruptedException {
		Thread.sleep(8000);
		elementClick(o.getStructuralgaugesave());
		wait1Seconds();
	}

	
	
	// creating the tunnel gauge

	@When("User have to enter structural gauge tunnel name")
	public void user_have_to_enter_structural_gauge_tunnel_name() throws InterruptedException {

		sendKeys(o.getStructuralgaugenamebox(), "Tunnel");
		wait1Seconds();
	}

	@When("User have to enter structural tunnel x and y values")
	public void user_have_to_enter_structural_tunnel_x_and_y_values() throws InterruptedException {

		elementClick(o.getTunnelcheckbox());
		wait1Seconds();
		// 1
		sendKeys(o.getStructuralx1(), "1000");
		sendKeys(o.getStructuraly1(), "4500");
		elementClick(o.getStructuralplus1());
		// 2
		sendKeys(o.getStructuralx2(), "2500");
		sendKeys(o.getStructuraly2(), "3500");
		elementClick(o.getStructuralplus2());
		// 3
		sendKeys(o.getStructuralx3(), "2500");
		sendKeys(o.getStructuraly3(), "0");
		elementClick(o.getStructuralplus3());
		// 4
		sendKeys(o.getStructuralx4(), "3000");
		sendKeys(o.getStructuraly4(), "0");
		elementClick(o.getStructuralplus4());
		// 5
		sendKeys(o.getStructuralx5(), "3000");
		sendKeys(o.getStructuraly5(), "5000");
		wait1Seconds();

	}
	
	

	// Edit the gauge option

	@Given("User have to click the tunal gauge action and edit")
	public void user_have_to_click_the_tunal_gauge_action_and_edit() throws InterruptedException {

		mouseOverAction(o.getGaugetunnel());
		elementClick(o.getGaugetunnelaction());
		elementClick(o.getGaugeeditoption());
		wait1Seconds();
	}

	@When("User have to click the comparison gauge box and select the japan structural gauge")
	public void user_have_to_click_the_comparison_gauge_box_and_select_the_japan_structural_gauge()
			throws InterruptedException {
		elementClick(o.getGaugecomarisonbox());
		elementClick(o.getJapanstructuralgauge());

	}

	@When("User have to click the vehicle gauge box and click the Y type second gauge")
	public void user_have_to_click_the_vehicle_gauge_box_and_click_the_Y_type_second_gauge()
			throws InterruptedException {
		elementClick(o.getGaugevechiclebopx());
		elementClick(o.getYtypevehiclegauge());
		wait1Seconds();
		elementClick(o.getScrolltolastbox());
		wait5seconds();
	}

	@When("User have to click the save new button")
	public void user_have_to_click_the_save_new_button() throws InterruptedException {
		elementClick(o.getSaveasnewbutton());
		wait1Seconds();
		sendKeys(o.getNewnamebox(), "Newedit");
		elementClick(o.getNewnamesavebutton());
		wait1Seconds();
	}

	
	
	// project options (sort the project name in project main menu)

	@Given("User have to click create project button")
	public void user_have_to_click_create_project_button() throws InterruptedException {

		elementClick(o.getProjectcreateprojectoption());
		wait1Seconds();
		implicitWait();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/projects");
		if (currentUrl == "https://testphp.digitaltrains.online/projects") {
			System.out.println("User enter the create project url");
		} else {
			System.out.println("User not enter the create project url");
		}

	}

	@Given("User have to enter project name one and click create button")
	public void user_have_to_enter_project_name_one_and_click_create_button() throws InterruptedException {

		sendKeys(o.getProjectprojectnamebox(), "DVRS1");
		wait1Seconds();
		elementClick(o.getProjectcreatebutton());
		wait1Seconds();

	}

	@Given("User have to enter project name two and click create button")
	public void user_have_to_enter_project_name_two_and_click_create_button() throws InterruptedException {

		sendKeys(o.getProjectprojectnamebox(), "DVRS2");
		wait1Seconds();
		elementClick(o.getProjectcreatebutton());
		wait1Seconds();
	}

	@When("User have click the sort option and select project name")
	public void user_have_click_the_sort_option_and_select_project_name() throws InterruptedException {

		elementClick(o.getProjectsortbox());
		wait1Seconds();
		elementClick(o.getProjectselectprojectname());
		wait1Seconds();

	}

	@When("User have to enter value one in search box")
	public void user_have_to_enter_value_one_in_search_box() throws InterruptedException {

		sendKeys(o.getProjectsearchbox(), "DVRS1");
		Thread.sleep(2000);
		o.getProjectsearchbox().clear();
		wait1Seconds();

	}

	@When("User have to enter value two in search box")
	public void user_have_to_enter_value_two_in_search_box() throws InterruptedException {
		sendKeys(o.getProjectsearchbox(), "DVRS2");
		Thread.sleep(2000);
		o.getProjectsearchbox().clear();
		wait1Seconds();
		sendKeys(o.getProjectsearchbox(), "Dvrs1");
		wait1Seconds();
		o.getProjectsearchbox().clear();
		wait1Seconds();

	}

	@When("User have to click the sort order box select Asc and Desc order")
	public void user_have_to_click_the_sort_order_box_select_Asc_and_Desc_order() throws InterruptedException {

		elementClick(o.getProjectasendingordesandingbox());
		wait1Seconds();
		elementClick(o.getProjectselectAsc());
		wait1Seconds();
		elementClick(o.getProjectselectDesc());
		wait1Seconds();

	}

	@When("User have to select the date filter option")
	public void user_have_to_select_the_date_filter_option() throws InterruptedException {
		elementClick(o.getProjectcreatedatebox());
		wait1Seconds();
		elementClick(o.getProjectselectdate());
		wait1Seconds();
		elementClick(o.getProjectcreatedatebox());
		wait1Seconds();
		elementClick(o.getProjectclearbutton());
		wait1Seconds();
		elementClick(o.getProjectmodifieddatebox());
		wait1Seconds();
		elementClick(o.getProjectselectseconddate());
		wait1Seconds();
		elementClick(o.getProjectmodifieddatebox());
		wait1Seconds();
		elementClick(o.getProjectclearsecondbutton());
		wait1Seconds();

	}

	@When("User have to delete project one and project two")
	public void user_have_to_delete_project_one_and_project_two() throws InterruptedException {
		elementClick(o.getProjectDVRStwo());
		wait1Seconds();
		mouseOverAction(o.getProjectDVRStwo());
		wait1Seconds();
		elementClick(o.getProjectDVRStwoaction());
		wait1Seconds();
		elementClick(o.getProjectDVRStwodeleteoption());
		wait1Seconds();
		elementClick(o.getProjectDVRStwodeletebutton());
		wait1Seconds();
		mouseOverAction(o.getProjectDVRSone());
		wait1Seconds();
		elementClick(o.getProjectDVRSoneaction());
		wait1Seconds();
		elementClick(o.getProjectDVRSonedeleteoption());
		wait1Seconds();
		elementClick(o.getProjectDVRSonedeletebutton());
		wait1Seconds();

	}

	// Y25 bogie add parameter options

	@Given("User have to clikc the bogies assembly option and click create bogie assembly")
	public void user_have_to_clikc_the_bogies_assembly_option_and_click_create_bogie_assembly()
			throws InterruptedException {
		
		implicitWait();
		elementClick(o.getDigitaltrainsbogies());
		wait1Seconds();
		elementClick(o.getBogiesassemblyoption());
		wait1Seconds();
		elementClick(o.getCreatebogie());
		wait1Seconds();

	}

	@Given("User have to enter bogies name and create")
	public void user_have_to_enter_bogies_name_and_create() throws InterruptedException {
		sendKeys(o.getBogiesnamebox(), "Y25Bogie");
		elementClick(o.getBogiescreatebutton());
		wait1Seconds();

	}

	@When("User have to click the parameter option")
	public void user_have_to_click_the_parameter_option() throws InterruptedException {
		elementClick(o.getBogiesparametersoption());
		wait1Seconds();
		String text = o.getBogiesparameterbody().getText();
		String title2 = driver.getTitle();
		System.out.println(title2);
		System.out.println(text);
		  if (text.contains("Parameters")) {
				System.out.println("-----After click the bogie parameters option it is open parameter body-----");
				String title = "Parameters";
				Assert.assertTrue(text.contains(title));
			} else {
				System.out.println("-----After click the bogie parameters option it is not open parameter body-----");
				String partial = "Parameters";
				Assert.assertTrue(text.contains(partial));
			}

	}

	@When("User have to click the four time press plus")
	public void user_have_to_click_the_four_time_press_plus() throws InterruptedException {

		elementClick(o.getBogiesparameterplusnumberonebutton());
		elementClick(o.getBogiesparameterplusnumbertwobutton());
		elementClick(o.getBogiesparameterplusnumberthreebutton());

	}

	@When("User have to enter the parameter")
	public void user_have_to_enter_the_parameter() throws InterruptedException {

		sendKeys(o.getBogiesparameterdescriptionnumberonebox(), "Prim friction height of action");
		sendKeys(o.getBogiesparameterdescriptionnumbertwobox(), "Prim bumpstop height of action");
		sendKeys(o.getBogiesparameterdescriptionnumberthreebox(), "Prime spring top");
		sendKeys(o.getBogiesparameterdescriptionnumberfourbox(), "Prime spring bottom");
		sendKeys(o.getBogiesparameterparameternumberonebox(), "p_f_hoa");
		sendKeys(o.getBogiesparameterparameternumbertwobox(), "p_b_hoa");
		sendKeys(o.getBogiesparameterparameternumberthreebox(), "p_s_top");
		sendKeys(o.getBogiesparameterparameternumberfourbox(), "p_s_bottom");
		sendKeys(o.getBogiesparametervaluenumberonebox(), "0.5125");
		sendKeys(o.getBogiesparametervaluenumbertwobox(), "0.4785");
		sendKeys(o.getBogiesparametervaluenumberthreebox(), "0.5825");
		sendKeys(o.getBogiesparametervaluenumberfourbox(), "0.3025");
		o.getBogiesparametervalueforsemiwheelbasebox().clear();
		sendKeys(o.getBogiesparametervalueforsemiwheelbasebox(), "900");
		o.getBogiesparametervalueforwheelradiusbox().clear();
		sendKeys(o.getBogiesparametervalueforwheelradiusbox(), "478.5");
		wait1Seconds();
		o.getBogiesparametervaluedorvehiclebodybox().clear();
		sendKeys(o.getBogiesparametervaluedorvehiclebodybox(),"2");
		wait1Seconds();

	}

	@When("User have to save the parameter")
	public void user_have_to_save_the_parameter() throws InterruptedException {

		elementClick(o.getBogiesparametersavebutton());
		wait1Seconds();

	}
	
	

	// Y25 bogie create part for assembly

	@When("User have to click the wheelset option")
	public void user_have_to_click_the_wheelset_option() throws InterruptedException {
		implicitWait();
		elementClick(o.getBogieswheelset());
		wait1Seconds();
	}

	@When("User have to fill the parameter and click the appearance option in wheelset")
	public void user_have_to_fill_the_parameter_and_click_the_appearance_option_in_wheelset()
			throws InterruptedException {
		elementClick(o.getBogiesmassnameeditbox());
		sendKeys(o.getBogiesmassnameeditbox(), "Y25 Wheelset");
		o.getBogiesaddmassinertiamassbox().clear();
		sendKeys(o.getBogiesaddmassinertiamassbox(), "1300");
		o.getBogiesaddmassinertiarollinertiabox().clear();
		sendKeys(o.getBogiesaddmassinertiarollinertiabox(), "600");
		elementClick(o.getBogiesaddpitchinertiacheckbox());
		o.getBogiesaddmassinertiapitchinertiabox().clear();
		sendKeys(o.getBogiesaddmassinertiapitchinertiabox(), "10");
		wait1Seconds();
	}

	@When("User have ot choose the appearance and save")
	public void user_have_ot_choose_the_appearance_and_save() throws InterruptedException {
		elementClick(o.getBogiesaddmassappearanceoption());
		elementClick(o.getBogiesaddmassselectleftaxlebox());
		elementClick(o.getBogiesselectytype());
		elementClick(o.getBogiesaddmassselectlrightaxlebox());
		elementClick(o.getBogiesselectytype());
		elementClick(o.getBogiesaddmassaddbutton());
		wait1Seconds();
	}

	@Then("User have to click bogie option")
	public void user_have_to_click_bogie_option() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getCreatepartoption());
		wait1Seconds();
		elementClick(o.getBogiesmass());
		wait1Seconds();
	}

	@When("User have to click the side bearer option")
	public void user_have_to_click_the_side_bearer_option() throws InterruptedException {

		elementClick(o.getBogiesmass());
		wait1Seconds();
	}

	@When("User have to fill the parameter and click the appearance option in side bearer")
	public void user_have_to_fill_the_parameter_and_click_the_appearance_option_in_side_bearer()
			throws InterruptedException {

		elementClick(o.getBogiesaddmassnamebox());
		sendKeys(o.getBogiesaddmassnamebox(), "Y25 Sidebearer");
		o.getBogiesaddmasseditmassbox().clear();
		sendKeys(o.getBogiesaddmasseditmassbox(), "10");
		o.getBogiesaddmasseditrollinertiabox().clear();
		sendKeys(o.getBogiesaddmasseditrollinertiabox(), "10");
		o.getBogiesaddmasseditpitchinertiabox().clear();
		sendKeys(o.getBogiesaddmasseditpitchinertiabox(), "10");
		o.getBogiesaddmassedityowinertiabox().clear();
		sendKeys(o.getBogiesaddmassedityowinertiabox(), "10");
		wait1Seconds();
	}

	@When("User have ot choose the appearance and save for side bearer")
	public void user_have_ot_choose_the_appearance_and_save_for_side_bearer() throws InterruptedException {
		elementClick(o.getBogiesaddmasseditappearance());
		elementClick(o.getBogiesaddmasseditthreeDmodelselectbox());
		elementClick(o.getBogiesaddmassseectymodel());
		elementClick(o.getBogiesaddmasssaveone());
		wait1Seconds();

	}

	@When("User have to click the bogiesframe option")
	public void user_have_to_click_the_bogiesframe_option() throws InterruptedException {
		o = new OleoPojo();
		wait1Seconds();
		elementClick(o.getCreatepartoption());
		wait1Seconds();
		elementClick(o.getBogiesmass());
		wait1Seconds();

	}

	@When("User have to fill the parameter and click the appearance option in bogieframe")
	public void user_have_to_fill_the_parameter_and_click_the_appearance_option_in_bogieframe()
			throws InterruptedException {

		elementClick(o.getBogiesaddmassnamebox());
		sendKeys(o.getBogiesaddmassnamebox(), "Y25 Bogieframe");
		o.getBogiesaddmasseditmassbox().clear();
		sendKeys(o.getBogiesaddmasseditmassbox(), "1800");
		o.getBogiesaddmasseditrollinertiabox().clear();
		sendKeys(o.getBogiesaddmasseditrollinertiabox(), "1200");
		o.getBogiesaddmasseditpitchinertiabox().clear();
		sendKeys(o.getBogiesaddmasseditpitchinertiabox(), "900");
		o.getBogiesaddmassedityowinertiabox().clear();
		sendKeys(o.getBogiesaddmassedityowinertiabox(), "2100");
		wait1Seconds();

	}

	@When("User have ot choose the appearance and save for bogies frame")
	public void user_have_ot_choose_the_appearance_and_save_for_bogies_frame() throws InterruptedException {

		elementClick(o.getBogiesaddmasseditappearance());
		elementClick(o.getBogiesaddmasseditthreeDmodelselectbox());
		elementClick(o.getBogiesaddmassseectymodel());
		elementClick(o.getBogiesaddmasssaveone());
		wait1Seconds();

	}

	// Y25 bogie Y type mass add options

	@Given("User have to select the y type mass one option")
	public void user_have_to_select_the_y_type_mass_one_option() throws InterruptedException {

		implicitWait();
		elementClick(o.getBogiesmassoption());
		Thread.sleep(3000);
		String text = o.getBogiesmassbody().getText();
		System.out.println(text);
		  if (text.contains("Mass")) {
				System.out.println("-----After click the bogie mass option it is open mass body-----");
				String title = "Mass";
				Assert.assertTrue(text.contains(title));
				
			} else {
				System.out.println("-----After click the bogie mass option it is not open mass body-----");
				String title = "Mass";
				Assert.assertTrue(text.contains(title));
			}

	}

	@When("User have to enter the y type mass one data")
	public void user_have_to_enter_the_y_type_mass_one_data() throws InterruptedException {
		sendKeys(o.getBogiespartnameeditbox(), "Bogies_Frame_Modelled");
		o.getBogiesmassxeditbox().clear();
		sendKeys(o.getBogiesmassxeditbox(), "0");
		o.getBogiesmassyeditbox().clear();
		sendKeys(o.getBogiesmassyeditbox(), "0");
		o.getBogiesmasszeditbox().clear();
		sendKeys(o.getBogiesmasszeditbox(), "0.52");
		elementClick(o.getBogiesmassinertiaoption());
		o.getBogiesaddmasseditmassbox().clear();
		sendKeys(o.getBogiesaddmasseditmassbox(), "1800");
		o.getBogiesaddmasseditrollinertiabox().clear();
		sendKeys(o.getBogiesaddmasseditrollinertiabox(), "1200");
		o.getBogiesaddmasseditpitchinertiabox().clear();
		sendKeys(o.getBogiesaddmasseditpitchinertiabox(), "900");
		o.getBogiesaddmassedityowinertiabox().clear();
		sendKeys(o.getBogiesaddmassedityowinertiabox(), "2100");
		elementClick(o.getBogiesaddmasseditappearance());
		elementClick(o.getBogiesaddmasseditthreeDmodelselectbox());
		elementClick(o.getBogiesaddmassseectymodel());
		

	}

	@Then("User have to click the bogies refresh button")
	public void user_have_to_click_the_bogies_refresh_button() throws InterruptedException {

		elementClick(o.getBogiesclicktorefreshthreeDview());
		Thread.sleep(26000);
		wait5seconds();

	}
	@Then("User have to wait for ten seconds")
	public void user_have_to_wait_for_ten_seconds() throws InterruptedException {
		
		Thread.sleep(20000);
	}

	@Given("User have to select the y type mass two option")
	public void user_have_to_select_the_y_type_mass_two_option() throws InterruptedException {
		o = new OleoPojo();
		elementClick(o.getBogiesmassoption());
		wait1Seconds();

	}

	@When("User have to enter the y type mass two data")
	public void user_have_to_enter_the_y_type_mass_two_data() throws InterruptedException {
		sendKeys(o.getBogiespartnameeditbox(), "Side bearer_L_Modelled");
		elementClick(o.getBogiesaddmasspositionoption());
		o.getBogiesmassxeditbox().clear();
		sendKeys(o.getBogiesmassxeditbox(), "0");
		o.getBogiesmassyeditbox().clear();
		sendKeys(o.getBogiesmassyeditbox(), "-0.85");
		o.getBogiesmasszeditbox().clear();
		sendKeys(o.getBogiesmasszeditbox(), "0.8");
		elementClick(o.getBogiesmassinertiaoption());
		o.getBogiesaddmasseditmassbox().clear();
		sendKeys(o.getBogiesaddmasseditmassbox(), "10");
		o.getBogiesaddmasseditrollinertiabox().clear();
		sendKeys(o.getBogiesaddmasseditrollinertiabox(), "10");
		o.getBogiesaddmasseditpitchinertiabox().clear();
		sendKeys(o.getBogiesaddmasseditpitchinertiabox(), "10");
		o.getBogiesaddmassedityowinertiabox().clear();
		sendKeys(o.getBogiesaddmassedityowinertiabox(), "10");
		elementClick(o.getBogiesaddmasseditappearance());
		elementClick(o.getBogiesaddmassselectthreeDtype());
		elementClick(o.getBogiesaddmasssidebearer());
		

	}

	@Given("User have to select the y type mass three option")
	public void user_have_to_select_the_y_type_mass_three_option() throws InterruptedException {
		o = new OleoPojo();
		elementClick(o.getBogiesmassoption());
		wait1Seconds();

	}

	@When("User have to enter the y type mass three data")
	public void user_have_to_enter_the_y_type_mass_three_data() throws InterruptedException {
		wait1Seconds();
		sendKeys(o.getBogiespartnameeditbox(), "Side bearer_R_Modelled");
		elementClick(o.getBogiesaddmasspositionoption());
		o.getBogiesmassxeditbox().clear();
		sendKeys(o.getBogiesmassxeditbox(), "0");
		o.getBogiesmassyeditbox().clear();
		sendKeys(o.getBogiesmassyeditbox(), "0.85");
		o.getBogiesmasszeditbox().clear();
		sendKeys(o.getBogiesmasszeditbox(), "0.8");
		elementClick(o.getBogiesmassinertiaoption());
		o.getBogiesaddmasseditmassbox().clear();
		sendKeys(o.getBogiesaddmasseditmassbox(), "10");
		o.getBogiesaddmasseditrollinertiabox().clear();
		sendKeys(o.getBogiesaddmasseditrollinertiabox(), "10");
		o.getBogiesaddmasseditpitchinertiabox().clear();
		sendKeys(o.getBogiesaddmasseditpitchinertiabox(), "10");
		o.getBogiesaddmassedityowinertiabox().clear();
		sendKeys(o.getBogiesaddmassedityowinertiabox(), "10");
		elementClick(o.getBogiesaddmasseditappearance());
		elementClick(o.getBogiesaddmassselectthreeDtype());
		elementClick(o.getBogiesaddmasssidebearer());
		

	}

	@Given("User have to click the bogies add button")
	public void user_have_to_click_the_bogies_add_button() throws InterruptedException {
		o = new OleoPojo();
		elementClick(o.getBogiesaddbutton());
		wait1Seconds();
		

	}

	@When("User have to click mass one save button")
	public void user_have_to_click_mass_one_save_button() throws InterruptedException {
		elementClick(o.getBogiesaddmassavebutton());
		wait1Seconds();

	}

	@When("User have to click mass two save button")
	public void user_have_to_click_mass_two_save_button() throws InterruptedException {
		elementClick(o.getBogiesaddmassavebutton());
		wait1Seconds();

	}

	@When("User have to click mass three save button")
	public void user_have_to_click_mass_three_save_button() throws InterruptedException {
		elementClick(o.getBogiesaddmassavebutton());
		wait1Seconds();

	}

//Y25 bogie add Wheelset options

	@Given("User have to select the y type wheelset option")
	public void user_have_to_select_the_y_type_wheelset_option() throws InterruptedException {
		o = new OleoPojo();
		implicitWait();
		elementClick(o.getBogiespartwheelset());
		Thread.sleep(3000);
		String text = o.getBogieswheelsetbody().getText();
		System.out.println(text);
		  if (text.contains("Wheelset")) {
				System.out.println("After click the bogie wheelset option it is open wheelset body");
				String title = "Wheelset";
				Assert.assertTrue(text.contains(title));
			
			} else {
				System.out.println("After click the bogie wheelset option it is not open wheelset body");
				String title = "Wheelset";
				Assert.assertTrue(text.contains(title));
				
			}

	}

	@When("User have to enter the y type wheelset firstweel data")
	public void user_have_to_enter_the_y_type_wheelset_firstweel_data() throws InterruptedException {
		sendKeys(o.getBogiesfrictionwheelsetnamebox(), "Fron_Wheelset_modelled");
		o.getBogiesfrictionwheelsetxbox().clear();
		sendKeys(o.getBogiesfrictionwheelsetxbox(), "0.90");
		o.getBogiesfrictionwheelsetybox().clear();
		sendKeys(o.getBogiesfrictionwheelsetybox(), "0");
		o.getBogiesfrictionwheelsetzbox().clear();
		sendKeys(o.getBogiesfrictionwheelsetzbox(), "0.4785");
		elementClick(o.getBogiesfrictionwheelsetinertia());
		o.getAddwheelsetinertiamass().clear();
		sendKeys(o.getAddwheelsetinertiamass(), "1300");
		o.getAddwheelsetrollinertia().clear();
		sendKeys(o.getAddwheelsetrollinertia(), "600");
		elementClick(o.getBogiesfrictionwheelsetaxelpitch());
		o.getBogiesfrictionwheelsetaxelpitchbox().clear();
		sendKeys(o.getBogiesfrictionwheelsetaxelpitchbox(), "10");
		elementClick(o.getBogiesfrictionwheelsetappearanceoption());
		elementClick(o.getBogiesfrictionwheelsetleftaxlebox());
		elementClick(o.getBogiesfrictionwheelsetselectytype());
		elementClick(o.getBogiesfrictionwheelsetrightaxlebox());
		elementClick(o.getBogiesfrictionwheelsetselectytype());

	}

	@When("User have to click the y type wheelset save option")
	public void user_have_to_click_the_y_type_wheelset_save_option() throws InterruptedException {
		elementClick(o.getBogiesfrictionwheelsetaddbutton());
		wait1Seconds();

	}

	@When("User have to enter the y type wheelset secondtweel data")
	public void user_have_to_enter_the_y_type_wheelset_secondtweel_data() throws InterruptedException {
		sendKeys(o.getBogiesfrictionwheelsetnamebox(), "Rear_Wheelset_modelled");
		elementClick(o.getBogiespositionforwheelset());
		wait1Seconds();
		o.getBogiesfrictionwheelsetxbox().clear();
		sendKeys(o.getBogiesfrictionwheelsetxbox(), "-0.90");
		o.getBogiesfrictionwheelsetybox().clear();
		sendKeys(o.getBogiesfrictionwheelsetybox(), "0");
		o.getBogiesfrictionwheelsetzbox().clear();
		sendKeys(o.getBogiesfrictionwheelsetzbox(), "0.4785");
		elementClick(o.getBogiesfrictionwheelsetinertia());
		o.getAddwheelsetinertiamass().clear();
		sendKeys(o.getAddwheelsetinertiamass(), "1300");
		o.getAddwheelsetrollinertia().clear();
		sendKeys(o.getAddwheelsetrollinertia(), "600");
		elementClick(o.getBogiesfrictionwheelsetaxelpitch());
		o.getBogiesfrictionwheelsetaxelpitchbox().clear();
		sendKeys(o.getBogiesfrictionwheelsetaxelpitchbox(), "10");
		elementClick(o.getBogiesfrictionwheelsetappearanceoption());
		elementClick(o.getBogiesfrictionwheelsetleftaxlebox());
		elementClick(o.getBogiesfrictionwheelsetselectytype());
		elementClick(o.getBogiesfrictionwheelsetrightaxlebox());
		elementClick(o.getBogiesfrictionwheelsetselectytype());

	}

//Y25 bogie shear spring options

	@Given("User have to click the shear spring option")
	public void user_have_to_click_the_shear_spring_option() throws InterruptedException {
		o = new OleoPojo();
		implicitWait();
		elementClick(o.getBogiesfrictionshearspring());
		Thread.sleep(3000);
		String text = o.getBogiesshearspringbody().getText();
		System.out.println(text);
		 if (text.contains("Shear Spring")) {
				System.out.println("-----After click the bogie Shear Spring option it is open Shear Spring body-----");
				String title = "Shear Spring";
				Assert.assertTrue(text.contains(title));
				
			} else {
				System.out.println("-----After click the bogie Shear Spring option it is not open Shear Spring body-----");
				String title = "Shear Spring";
				Assert.assertTrue(text.contains(title));
			}
	}

	@When("User have to enter the data of first shear spring")
	public void user_have_to_enter_the_data_of_first_shear_spring() throws InterruptedException {

		sendKeys(o.getBogiesfrictionshearspringpartname(), "PR1_LL_1");
		o.getBogiesfrictionshearspringxbox().clear();
		sendKeys(o.getBogiesfrictionshearspringxbox(), "0.585");
		o.getBogiesfrictionshearspringybox().clear();
		sendKeys(o.getBogiesfrictionshearspringybox(), "-1");
		o.getBogiesfrictionshearspringtopzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringtopzbox(), "p_s_top");
		o.getBogiesfrictionshearspringbottomzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionshearspringtopmassbox());
		elementClick(o.getBogiesframemodelled());
		elementClick(o.getBogiesfrictionshearspringbottommassbox());
		elementClick(o.getBogiesshearspringfrontwheelset());
		elementClick(o.getBogiesshearspringoption());
		o.getBogiesshearspringxvaluebox().clear();
		sendKeys(o.getBogiesshearspringxvaluebox(), "0.160");
		o.getBogiesshearspringyvaluebox().clear();
		sendKeys(o.getBogiesshearspringyvaluebox(), "0.180");
		o.getBogiesshearspringzvaluebox().clear();
		sendKeys(o.getBogiesshearspringzvaluebox(), "0.416");

	}

	@When("User have to save the y type shear spring")
	public void user_have_to_save_the_y_type_shear_spring() throws InterruptedException {
		elementClick(o.getBogiesfrictionshearspringaddbutton());
		wait1Seconds();
	}

	@When("User have to enter the data of second shear spring")
	public void user_have_to_enter_the_data_of_second_shear_spring() throws InterruptedException {
		elementClick(o.getBogiesshearspringposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionshearspringpartname(), "PR1_LL_0");
		o.getBogiesfrictionshearspringxbox().clear();
		sendKeys(o.getBogiesfrictionshearspringxbox(), "1.2149999999999999");
		o.getBogiesfrictionshearspringybox().clear();
		sendKeys(o.getBogiesfrictionshearspringybox(), "-1");
		o.getBogiesfrictionshearspringtopzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringtopzbox(), "p_s_top");
		o.getBogiesfrictionshearspringbottomzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionshearspringtopmassbox());
		elementClick(o.getBogiesframemodelled());
		elementClick(o.getBogiesfrictionshearspringbottommassbox());
		elementClick(o.getBogiesshearspringfrontwheelset());
		elementClick(o.getBogiesshearspringoption());
		o.getBogiesshearspringxvaluebox().clear();
		sendKeys(o.getBogiesshearspringxvaluebox(), "0.16");
		o.getBogiesshearspringyvaluebox().clear();
		sendKeys(o.getBogiesshearspringyvaluebox(), "0.18");
		o.getBogiesshearspringzvaluebox().clear();
		sendKeys(o.getBogiesshearspringzvaluebox(), "0.416");

	}

	@When("User have to enter the data of third shear spring")
	public void user_have_to_enter_the_data_of_third_shear_spring() throws InterruptedException {
		elementClick(o.getBogiesshearspringposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionshearspringpartname(), "PR1_LR_1");
		o.getBogiesfrictionshearspringxbox().clear();
		sendKeys(o.getBogiesfrictionshearspringxbox(), "0.585");
		o.getBogiesfrictionshearspringybox().clear();
		sendKeys(o.getBogiesfrictionshearspringybox(), "1");
		o.getBogiesfrictionshearspringtopzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringtopzbox(), "p_s_top");
		o.getBogiesfrictionshearspringbottomzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionshearspringtopmassbox());
		elementClick(o.getBogiesframemodelled());
		elementClick(o.getBogiesfrictionshearspringbottommassbox());
		elementClick(o.getBogiesshearspringfrontwheelset());
		elementClick(o.getBogiesshearspringoption());
		o.getBogiesshearspringxvaluebox().clear();
		sendKeys(o.getBogiesshearspringxvaluebox(), "0.160");
		o.getBogiesshearspringyvaluebox().clear();
		sendKeys(o.getBogiesshearspringyvaluebox(), "0.180");
		o.getBogiesshearspringzvaluebox().clear();
		sendKeys(o.getBogiesshearspringzvaluebox(), "0.416");
	}

	@When("User have to enter the data of fourth shear spring")
	public void user_have_to_enter_the_data_of_fourth_shear_spring() throws InterruptedException {
		elementClick(o.getBogiesshearspringposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionshearspringpartname(), "PR1_LR_0");
		o.getBogiesfrictionshearspringxbox().clear();
		sendKeys(o.getBogiesfrictionshearspringxbox(), "1.2149999999999999");
		o.getBogiesfrictionshearspringybox().clear();
		sendKeys(o.getBogiesfrictionshearspringybox(), "1");
		o.getBogiesfrictionshearspringtopzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringtopzbox(), "p_s_top");
		o.getBogiesfrictionshearspringbottomzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionshearspringtopmassbox());
		elementClick(o.getBogiesframemodelled());
		elementClick(o.getBogiesfrictionshearspringbottommassbox());
		elementClick(o.getBogiesshearspringfrontwheelset());
		elementClick(o.getBogiesshearspringoption());
		o.getBogiesshearspringxvaluebox().clear();
		sendKeys(o.getBogiesshearspringxvaluebox(), "0.16");
		o.getBogiesshearspringyvaluebox().clear();
		sendKeys(o.getBogiesshearspringyvaluebox(), "0.18");
		o.getBogiesshearspringzvaluebox().clear();
		sendKeys(o.getBogiesshearspringzvaluebox(), "0.416");

	}

	@When("User have to enter the data of fiveth shear spring")
	public void user_have_to_enter_the_data_of_fiveth_shear_spring() throws InterruptedException {
		elementClick(o.getBogiesshearspringposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionshearspringpartname(), "PR1_TL_1");
		o.getBogiesfrictionshearspringxbox().clear();
		sendKeys(o.getBogiesfrictionshearspringxbox(), "-0.585");
		o.getBogiesfrictionshearspringybox().clear();
		sendKeys(o.getBogiesfrictionshearspringybox(), "-1");
		o.getBogiesfrictionshearspringtopzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringtopzbox(), "p_s_top");
		o.getBogiesfrictionshearspringbottomzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionshearspringtopmassbox());
		elementClick(o.getBogiesframemodelled());
		elementClick(o.getBogiesfrictionshearspringbottommassbox());
		elementClick(o.getBogiesshearspringrearwheelset());
		elementClick(o.getBogiesshearspringoption());
		o.getBogiesshearspringxvaluebox().clear();
		sendKeys(o.getBogiesshearspringxvaluebox(), "0.160");
		o.getBogiesshearspringyvaluebox().clear();
		sendKeys(o.getBogiesshearspringyvaluebox(), "0.180");
		o.getBogiesshearspringzvaluebox().clear();
		sendKeys(o.getBogiesshearspringzvaluebox(), "0.416");

	}

	@When("User have to enter the data of sixth shear spring")
	public void user_have_to_enter_the_data_of_sixth_shear_spring() throws InterruptedException {
		elementClick(o.getBogiesshearspringposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionshearspringpartname(), "PR1_TL_0");
		o.getBogiesfrictionshearspringxbox().clear();
		sendKeys(o.getBogiesfrictionshearspringxbox(), "-1.2149999999999999");
		o.getBogiesfrictionshearspringybox().clear();
		sendKeys(o.getBogiesfrictionshearspringybox(), "-1");
		o.getBogiesfrictionshearspringtopzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringtopzbox(), "p_s_top");
		o.getBogiesfrictionshearspringbottomzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionshearspringtopmassbox());
		elementClick(o.getBogiesframemodelled());
		elementClick(o.getBogiesfrictionshearspringbottommassbox());
		elementClick(o.getBogiesshearspringrearwheelset());
		elementClick(o.getBogiesshearspringoption());
		o.getBogiesshearspringxvaluebox().clear();
		sendKeys(o.getBogiesshearspringxvaluebox(), "0.16");
		o.getBogiesshearspringyvaluebox().clear();
		sendKeys(o.getBogiesshearspringyvaluebox(), "0.18");
		o.getBogiesshearspringzvaluebox().clear();
		sendKeys(o.getBogiesshearspringzvaluebox(), "0.416");

	}

	@When("User have to enter the data of seventh shear spring")
	public void user_have_to_enter_the_data_of_seventh_shear_spring() throws InterruptedException {
		elementClick(o.getBogiesshearspringposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionshearspringpartname(), "PR1_TR_1");
		o.getBogiesfrictionshearspringxbox().clear();
		sendKeys(o.getBogiesfrictionshearspringxbox(), "-0.585");
		o.getBogiesfrictionshearspringybox().clear();
		sendKeys(o.getBogiesfrictionshearspringybox(), "1");
		o.getBogiesfrictionshearspringtopzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringtopzbox(), "p_s_top");
		o.getBogiesfrictionshearspringbottomzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionshearspringtopmassbox());
		elementClick(o.getBogiesframemodelled());
		elementClick(o.getBogiesfrictionshearspringbottommassbox());
		elementClick(o.getBogiesshearspringrearwheelset());
		elementClick(o.getBogiesshearspringoption());
		o.getBogiesshearspringxvaluebox().clear();
		sendKeys(o.getBogiesshearspringxvaluebox(), "0.160");
		o.getBogiesshearspringyvaluebox().clear();
		sendKeys(o.getBogiesshearspringyvaluebox(), "0.180");
		o.getBogiesshearspringzvaluebox().clear();
		sendKeys(o.getBogiesshearspringzvaluebox(), "0.416");

	}

	@When("User have to enter the data of eighth shear spring")
	public void user_have_to_enter_the_data_of_eighth_shear_spring() throws InterruptedException {
		elementClick(o.getBogiesshearspringposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionshearspringpartname(), "PR1_TR_0");
		o.getBogiesfrictionshearspringxbox().clear();
		sendKeys(o.getBogiesfrictionshearspringxbox(), "-1.2149999999999999");
		o.getBogiesfrictionshearspringybox().clear();
		sendKeys(o.getBogiesfrictionshearspringybox(), "1");
		o.getBogiesfrictionshearspringtopzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringtopzbox(), "p_s_top");
		o.getBogiesfrictionshearspringbottomzbox().clear();
		sendKeys(o.getBogiesfrictionshearspringbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionshearspringtopmassbox());
		elementClick(o.getBogiesframemodelled());
		elementClick(o.getBogiesfrictionshearspringbottommassbox());
		elementClick(o.getBogiesshearspringrearwheelset());
		elementClick(o.getBogiesshearspringoption());
		o.getBogiesshearspringxvaluebox().clear();
		sendKeys(o.getBogiesshearspringxvaluebox(), "0.16");
		o.getBogiesshearspringyvaluebox().clear();
		sendKeys(o.getBogiesshearspringyvaluebox(), "0.18");
		o.getBogiesshearspringzvaluebox().clear();
		sendKeys(o.getBogiesshearspringzvaluebox(), "0.416");

	}

	@Then("User have to click the bogies shearspring refresh button")
	public void user_have_to_click_the_bogies_shearspring_refresh_button() throws InterruptedException {
		elementClick(o.getBogiesshearspringThreeDoption());
		Thread.sleep(20000);
	}

//Y25 bogie create bush element option

	@Given("User have to click y type bogie bush option")
	public void user_have_to_click_y_type_bogie_bush_option() throws InterruptedException {
		o = new OleoPojo();
		implicitWait();
		elementClick(o.getBogiesfrictionbushoption());
		Thread.sleep(3000);
		String text = o.getBogiesbushbody().getText();
		System.out.println(text);
		 if (text.contains("Bush")) {
				System.out.println("-----After click the bogie Bush option it is open Bush body-----");
				String title = "Bush";
				Assert.assertTrue(text.contains(title));
			} else {
				System.out.println("-----After click the bogie Bush option it is not open Bush body-----");
				String title = "Bush";
				Assert.assertTrue(text.contains(title));
			}
	}

	@When("User have to enter y type bogie bush parameter")
	public void user_have_to_enter_y_type_bogie_bush_parameter() throws InterruptedException {
		sendKeys(o.getBogiesbbusheditnamebox(), "Center_Pivot");
		o.getBogiesfrictionbushxbox().clear();
		sendKeys(o.getBogiesfrictionbushxbox(), "0");
		o.getBogiesfrictionbushybox().clear();
		sendKeys(o.getBogiesfrictionbushybox(), "0");
		o.getBogiesfrictionbushzbox().clear();
		sendKeys(o.getBogiesfrictionbushzbox(), "0.73");
		elementClick(o.getBogiesfrictionbushtopmassbox());
		elementClick(o.getBogiesframemodelledbush());
		elementClick(o.getBogiesfrictionbushbottommassbox());
		elementClick(o.getVehiclenodymodelledbush());
		elementClick(o.getBogiesfrictionbushstiffnessoption());
		elementClick(o.getBogiesfrictionbushstiffnesscheckbox());
		o.getBogiesfrictionbushstiffnessxbox().clear();
		sendKeys(o.getBogiesfrictionbushstiffnessxbox(), "80");
		o.getBogiesfrictionbushstiffnessybox().clear();
		sendKeys(o.getBogiesfrictionbushstiffnessybox(), "80");
		elementClick(o.getBogiesfrictionbushapprearanceoption());
		wait1Seconds();
		elementClick(o.getBogiesfrictionbushsmall());
		elementClick(o.getBogiesfrictionbushaxisz());

	}

	@When("User have to click the y type bogie add button")
	public void user_have_to_click_the_y_type_bogie_add_button() throws InterruptedException {
		elementClick(o.getBogiesfrictionbushaddbutton());
		wait1Seconds();
	}

	// Y25 bogies stiffness options

	@Given("User have to click the y type bogie stiffness option")
	public void user_have_to_click_the_y_type_bogie_stiffness_option() throws InterruptedException {
		o = new OleoPojo();
		wait1Seconds();
		elementClick(o.getBogiesfrictionytypestiffnessoption());
		Thread.sleep(3000);
		String text = o.getBogiesstiffnessbody().getText();
		System.out.println(text);
		 if (text.contains("Stiffness")) {
				System.out.println("-----After click the bogie Stiffness option it is open Stiffness body-----");
				String title = "Stiffness";
				Assert.assertTrue(text.contains(title));
				
			} else {
				System.out.println("-----After click the bogie Stiffness option it is not open Stiffness body-----");
				String title = "Stiffness";
				Assert.assertTrue(text.contains(title));	
			}

	}

	@When("User have to enter y type bogie stiffness one parameter")
	public void user_have_to_enter_y_type_bogie_stiffness_one_parameter() throws InterruptedException {
		sendKeys(o.getBogiesfrictionstiffnessnamebox(), "Center_Pivot_Z");
		o.getBogiesfrictionstiffnesstopzbox().clear();
		sendKeys(o.getBogiesfrictionstiffnesstopzbox(), "0.78");
		o.getBogiesfrictionstiffnessbottomzbox().clear();
		sendKeys(o.getBogiesfrictionstiffnessbottomzbox(), "0.68");
		elementClick(o.getBogiesfrictionstiffnesstopmassboxsecond());
		elementClick(o.getBogiesfrictionstiffnessvehiclebody());
		elementClick(o.getBogiesfrictionstiffnessbottommassboxsecond());
		elementClick(o.getBogiesfrictionstiffnessbogiesframemodelled());
		elementClick(o.getBogiesfrictionstiffnessvalueoption());
		o.getBogiesfrictionstiffnesslinearbox().clear();
		sendKeys(o.getBogiesfrictionstiffnesslinearbox(), "80.0");

	}

	@When("User have to click the y type bogie stiffness add button")
	public void user_have_to_click_the_y_type_bogie_stiffness_add_button() throws InterruptedException {
		elementClick(o.getBogiesfrictionstiffnessaddbutton());
		wait1Seconds();

	}

	@When("User have to enter y type bogie stiffness two parameter")
	public void user_have_to_enter_y_type_bogie_stiffness_two_parameter() throws InterruptedException {
		elementClick(o.getBogiesfrictionstiffnesspositionoption());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionstiffnessnamebox(), "Sidebearer_Stiff_Z_L");
		o.getBogiesfrictionstiffnesstopzbox().clear();
		sendKeys(o.getBogiesfrictionstiffnesstopzbox(), "0.78");
		o.getBogiesfrictionstiffnessbottomzbox().clear();
		sendKeys(o.getBogiesfrictionstiffnessbottomzbox(), "0.68");
		o.getBogiesfrictionstiffnesstopybox().clear();
		sendKeys(o.getBogiesfrictionstiffnesstopybox(), "-0.85");
		o.getBogiesfrictionstiffnessbottomybox().clear();
		sendKeys(o.getBogiesfrictionstiffnessbottomybox(), "-0.85");
		elementClick(o.getBogiesfrictionstiffnesstopmassboxsecond());
		elementClick(o.getBogiesfrictionstiffnesssidebearerleft());
		elementClick(o.getBogiesfrictionstiffnessbottommassboxsecond());
		elementClick(o.getBogiesfrictionstiffnessbogiesframemodelled());
		elementClick(o.getBogiesfrictionstiffnessvalueoptiontwo());
		o.getBogiesfrictionstiffnesslinearbox().clear();
		sendKeys(o.getBogiesfrictionstiffnesslinearbox(), "0.56");

	}

	@When("User have to enter y type bogie stiffness three parameter")
	public void user_have_to_enter_y_type_bogie_stiffness_three_parameter() throws InterruptedException {

		elementClick(o.getBogiesfrictionstiffnesspositionoption());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionstiffnessnamebox(), "Sidebearer_Stiff_Z_R");
		o.getBogiesfrictionstiffnesstopzbox().clear();
		sendKeys(o.getBogiesfrictionstiffnesstopzbox(), "0.78");
		o.getBogiesfrictionstiffnessbottomzbox().clear();
		sendKeys(o.getBogiesfrictionstiffnessbottomzbox(), "0.68");
		o.getBogiesfrictionstiffnesstopybox().clear();
		sendKeys(o.getBogiesfrictionstiffnesstopybox(), "0.85");
		o.getBogiesfrictionstiffnessbottomybox().clear();
		sendKeys(o.getBogiesfrictionstiffnessbottomybox(), "0.85");
		elementClick(o.getBogiesfrictionstiffnesstopmassboxsecond());
		elementClick(o.getBogiesfrictionstiffnesssidebearerright());
		elementClick(o.getBogiesfrictionstiffnessbottommassboxsecond());
		elementClick(o.getBogiesfrictionstiffnessbogiesframemodelled());
		elementClick(o.getBogiesfrictionstiffnessvalueoptiontwo());
		o.getBogiesfrictionstiffnesslinearbox().clear();
		sendKeys(o.getBogiesfrictionstiffnesslinearbox(), "0.56");

	}

	// Y25 Bogie add friction element

	@Given("User have to click the y type friction option")
	public void user_have_to_click_the_y_type_friction_option() throws InterruptedException {
		o = new OleoPojo();
		implicitWait();
		elementClick(o.getBogiesfrictionmainfrictionoption());
		Thread.sleep(3000);
		String text = o.getBogiesfrictionbody().getText();
		System.out.println(text);
		 if (text.contains("Friction")) {
				System.out.println("-----After click the bogie Friction option it is open Friction body-----");
				String title = "Friction";
				Assert.assertTrue(text.contains(title));
				
			} else {
				System.out.println("-----After click the bogie Friction option it is not open Friction body-----");
				String title = "Friction";
				Assert.assertTrue(text.contains(title));
			}
	}

	@When("User have to enter first friction values")
	public void user_have_to_enter_first_friction_values() throws InterruptedException {
		sendKeys(o.getBogiesfrictioneditnamebox(), "Center Pivot_X_L");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "-0.0999999999999964");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "0.0999999999999964");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "-0.19");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-0.19");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "0.73");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "0.73");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionvehiclebody());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionoption());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.25");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.25");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "321.16");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "80");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessselectbox());
		elementClick(o.getBogiesfrictiondynamicstiffnesscenterpivotz());
		o.getBogiesfrictiondynamicstiffnessfactorbox().clear();
		sendKeys(o.getBogiesfrictiondynamicstiffnessfactorbox(), "0.25");

	}

	@When("User have to click the y type friction add button")
	public void user_have_to_click_the_y_type_friction_add_button() throws InterruptedException {
		elementClick(o.getYtypeBogiesfrictionaddbutton());
		wait1Seconds();
	}

	@When("User have to enter second friction values")
	public void user_have_to_enter_second_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Center Pivot_X_R");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "-0.0999999999999964");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "0.0999999999999964");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "0.19");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "0.19");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "0.73");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "0.73");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionvehiclebody());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.25");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.25");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "321.16");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "80");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessselectbox());
		elementClick(o.getBogiesfrictiondynamicstiffnesscenterpivotz());
		o.getBogiesfrictiondynamicstiffnessfactorbox().clear();
		sendKeys(o.getBogiesfrictiondynamicstiffnessfactorbox(), "0.25");

	}

	@When("User have to enter thired friction values")
	public void user_have_to_enter_thired_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Center Pivot_Y_B");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "0.1900000000000004");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "0.1900000000000004");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "0.1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-0.1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "0.73");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "0.73");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionvehiclebody());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.25");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.25");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "321.16");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "80");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessselectbox());
		elementClick(o.getBogiesfrictiondynamicstiffnesscenterpivotz());
		o.getBogiesfrictiondynamicstiffnessfactorbox().clear();
		sendKeys(o.getBogiesfrictiondynamicstiffnessfactorbox(), "0.25");

	}

	@When("User have to enter fourth friction values")
	public void user_have_to_enter_fourth_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Center Pivot_Y_F");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "-0.1900000000000004");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "-0.1900000000000004");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "0.1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-0.1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "0.73");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "0.73");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionvehiclebody());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.25");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.25");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "321.16");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "80");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessselectbox());
		elementClick(o.getBogiesfrictiondynamicstiffnesscenterpivotz());
		o.getBogiesfrictiondynamicstiffnessfactorbox().clear();
		sendKeys(o.getBogiesfrictiondynamicstiffnessfactorbox(), "0.25");

	}

	@When("User have to enter fiveth friction values")
	public void user_have_to_enter_fiveth_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Center Pivot_Z_B");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "0.1900000000000004");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "0.1900000000000004");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "0");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "0");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "0.83");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "0.63");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionvehiclebody());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.25");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.25");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "321.16");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "80");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessselectbox());
		elementClick(o.getBogiesfrictiondynamicstiffnesscenterpivotz());
		o.getBogiesfrictiondynamicstiffnessfactorbox().clear();
		sendKeys(o.getBogiesfrictiondynamicstiffnessfactorbox(), "0.25");

	}

	@When("User have to enter sixth friction values")
	public void user_have_to_enter_sixth_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Center Pivot_Z_F");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "-0.1900000000000004");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "-0.1900000000000004");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "0");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "0");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "0.83");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "0.63");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionvehiclebody());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.25");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.25");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "321.16");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "80");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessselectbox());
		elementClick(o.getBogiesfrictiondynamicstiffnesscenterpivotz());
		o.getBogiesfrictiondynamicstiffnessfactorbox().clear();
		sendKeys(o.getBogiesfrictiondynamicstiffnessfactorbox(), "0.25");

	}

	@When("User have to enter seventh friction values")
	public void user_have_to_enter_seventh_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Center Pivot_Z_L");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "0");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "0");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "-0.19");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-0.19");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "0.83");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "0.63");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionvehiclebody());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.25");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.25");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "321.16");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "80");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessselectbox());
		elementClick(o.getBogiesfrictiondynamicstiffnesscenterpivotz());
		o.getBogiesfrictiondynamicstiffnessfactorbox().clear();
		sendKeys(o.getBogiesfrictiondynamicstiffnessfactorbox(), "0.25");

	}

	@When("User have to enter eight friction values")
	public void user_have_to_enter_eight_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Center Pivot_Z_R");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "0");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "0");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "0.19");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "0.19");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "0.83");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "0.63");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionvehiclebody());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.25");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.25");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "321.16");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "80");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessselectbox());
		elementClick(o.getBogiesfrictiondynamicstiffnesscenterpivotz());
		o.getBogiesfrictiondynamicstiffnessfactorbox().clear();
		sendKeys(o.getBogiesfrictiondynamicstiffnessfactorbox(), "0.25");

	}

	@When("User have to enter nineth friction values")
	public void user_have_to_enter_nineth_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Lateral_Friction_LL_1");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "0.79");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "0.79");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "-0.9");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-1.1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionfrontwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPR1_X_LL_1());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");
		elementClick(o.getBogiesfrictiondynamicshearspringoption());
		elementClick(o.getBogiesfrictiondynmaicshearspringbox());
		elementClick(o.getBogiesfrictiondynamicshearspringPR1_LL_1());
		o.getBogiesfrictiondynamicshearspringforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicshearspringforcebox(), "0.384");

	}

	@When("User have to enter tenth friction values")
	public void user_have_to_enter_tenth_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Lateral_Friction_LL_O");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "1.0099999999999998");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "1.0099999999999998");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "-0.9");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-1.1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionfrontwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPrimery_X_LL_O());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");

	}

	@When("User have to enter number one friction values")
	public void user_have_to_enter_number_one_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Lateral_Friction_LR_1");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "0.79");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "0.79");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "1.1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "0.9");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionfrontwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPR1_X_RL_1());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");
		elementClick(o.getBogiesfrictiondynamicshearspringoption());
		elementClick(o.getBogiesfrictiondynmaicshearspringbox());
		elementClick(o.getBogiesfrictiondynamicshearspringPR1_LR_1());
		o.getBogiesfrictiondynamicshearspringforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicshearspringforcebox(), "0.384");
	}

	@When("User have to enter number two friction values")
	public void user_have_to_enter_number_two_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Lateral_Friction_LR_O");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "1.0099999999999998");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "1.0099999999999998");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "1.1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "0.9");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionfrontwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPrimery_X_LR_O());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");

	}

	@When("User have to enter number three friction values")
	public void user_have_to_enter_number_three_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Lateral_Friction_TL_1");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "-0.79");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "-0.79");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "-0.9");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-1.1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionrearwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopY25D_primary_long_Bump_Stop_Inner());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");
		elementClick(o.getBogiesfrictiondynamicshearspringoption());
		elementClick(o.getBogiesfrictiondynmaicshearspringbox());
		elementClick(o.getBogiesfrictiondynamicshearspringPR1_TL_1());
		o.getBogiesfrictiondynamicshearspringforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicshearspringforcebox(), "0.384");

	}

	@When("User have to enter number four friction values")
	public void user_have_to_enter_number_four_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Lateral_Friction_TL_O");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "-1.0099999999999998");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "-1.0099999999999998");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "-0.9");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-1.1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionrearwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPrimery_X_TL_O());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");

	}

	@When("User have to enter number five friction values")
	public void user_have_to_enter_number_five_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Lateral_Friction_TR_1");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "-0.79");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "-0.79");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "1.1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "0.9");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionrearwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPR1_X_TR_1());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");
		elementClick(o.getBogiesfrictiondynamicshearspringoption());
		elementClick(o.getBogiesfrictiondynmaicshearspringbox());
		elementClick(o.getBogiesfrictiondynamicshearspringPR1_TR_1());
		o.getBogiesfrictiondynamicshearspringforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicshearspringforcebox(), "0.384");

	}

	@When("User have to enter number six friction values")
	public void user_have_to_enter_number_six_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Lateral_Friction_TR_O");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "-1.0099999999999998");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "-1.0099999999999998");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "1.1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "0.9");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionrearwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPrimery_X_TR_O());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");

	}

	@When("User have to enter number seven friction values")
	public void user_have_to_enter_number_seven_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Vertical_Friction_LL_1");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "0.79");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "0.79");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "-1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa+0.1");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa-0.1");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionfrontwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPR1_X_LL_1());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");
		elementClick(o.getBogiesfrictiondynamicshearspringoption());
		elementClick(o.getBogiesfrictiondynmaicshearspringbox());
		elementClick(o.getBogiesfrictiondynamicshearspringPR1_LL_1());
		o.getBogiesfrictiondynamicshearspringforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicshearspringforcebox(), "0.384");

	}

	@When("User have to enter number eight friction values")
	public void user_have_to_enter_number_eight_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Vertical_Friction_LL_O");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "1.0099999999999998");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "1.0099999999999998");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "-1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa+0.1");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa-0.1");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionfrontwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPrimery_X_LL_O());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");

	}

	@When("User have to enter number nine friction values")
	public void user_have_to_enter_number_nine_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Vertical_Friction_LR_1");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "0.79");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "0.79");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa+0.1");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa-0.1");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionfrontwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPR1_X_RL_1());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");
		elementClick(o.getBogiesfrictiondynamicshearspringoption());
		elementClick(o.getBogiesfrictiondynmaicshearspringbox());
		elementClick(o.getBogiesfrictiondynamicshearspringPR1_LR_1());
		o.getBogiesfrictiondynamicshearspringforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicshearspringforcebox(), "0.384");

	}

	@When("User have to enter number ten friction values")
	public void user_have_to_enter_number_ten_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Vertical_Friction_LR_O");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "1.0099999999999998");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "1.0099999999999998");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa+0.1");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa-0.1");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionfrontwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPrimery_X_LR_O());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");

	}

	@When("User have to enter count one friction values")
	public void user_have_to_enter_count_one_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Vertical_Friction_TL_1");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "-0.79");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "-0.79");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "-1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa+0.1");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa-0.1");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionrearwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopY25D_primary_long_Bump_Stop_Inner());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");
		elementClick(o.getBogiesfrictiondynamicshearspringoption());
		elementClick(o.getBogiesfrictiondynmaicshearspringbox());
		elementClick(o.getBogiesfrictiondynamicshearspringPR1_TL_1());
		o.getBogiesfrictiondynamicshearspringforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicshearspringforcebox(), "0.384");

	}

	@When("User have to enter count two friction values")
	public void user_have_to_enter_count_two_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Vertical_Friction_TL_O");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "-1.0099999999999998");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "-1.0099999999999998");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "-1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa+0.1");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa-0.1");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionrearwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPrimery_X_TL_O());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");

	}

	@When("User have to enter count three friction values")
	public void user_have_to_enter_count_three_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Vretical_Friction_TR_1");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "-0.79");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "-0.79");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa+0.1");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa-0.1");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionrearwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPR1_X_TR_1());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");
		elementClick(o.getBogiesfrictiondynamicshearspringoption());
		elementClick(o.getBogiesfrictiondynmaicshearspringbox());
		elementClick(o.getBogiesfrictiondynamicshearspringPR1_TR_1());
		o.getBogiesfrictiondynamicshearspringforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicshearspringforcebox(), "0.384");

	}

	@When("User have to enter count four friction values")
	public void user_have_to_enter_count_four_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Primary_Vretical_Friction_TR_O");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "-1.0099999999999998");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "-1.0099999999999998");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "1");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "1");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "p_f_hoa+0.1");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "p_f_hoa-0.1");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionbogiesframemodelled());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionrearwheelset());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.4");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.4");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "3.67");
		elementClick(o.getBogiesfrictionstiffnessoption());
		elementClick(o.getBogiesfrictionstiffnessselectseriesstiffness());
		o.getBogiesfrictionstiffnessvaluebox().clear();
		sendKeys(o.getBogiesfrictionstiffnessvaluebox(), "60");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumpstopPrimery_X_TR_O());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");

	}

	@When("User have to enter count five friction values")
	public void user_have_to_enter_count_five_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Sidebarer_X_L");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "0.2000000000000018");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "-0.2000000000000018");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "-0.85");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "-0.85");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "0.8");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "0.8");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionvehiclebody());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionsidebearerleft());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.43");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.43");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "16.0");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumstopY25sidebearer());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessselectbox());
		elementClick(o.getBogiesfrictiondynamicstiffnesssidebearerstiffzleft());
		o.getBogiesfrictiondynamicstiffnessfactorbox().clear();
		sendKeys(o.getBogiesfrictiondynamicstiffnessfactorbox(), "1");

	}

	@When("User have to enter count six friction values")
	public void user_have_to_enter_count_six_friction_values() throws InterruptedException {
		elementClick(o.getBOgiesfrictionpositionoption());
		sendKeys(o.getBogiesfrictioneditnamebox(), "Sidebarer_X_R");
		o.getBogiesfrictionpositiontopxbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopxbox(), "0.2000000000000018");
		o.getBogiesfrictionpositionbottomxbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomxbox(), "-0.2000000000000018");
		o.getBogiesfrictionpositiontopybox().clear();
		sendKeys(o.getBogiesfrictionpositiontopybox(), "0.85");
		o.getBogiesfrictionpositionbottomybox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomybox(), "0.85");
		o.getBogiesfrictionpositiontopzbox().clear();
		sendKeys(o.getBogiesfrictionpositiontopzbox(), "0.8");
		o.getBogiesfrictionpositionbottomzbox().clear();
		sendKeys(o.getBogiesfrictionpositionbottomzbox(), "0.8");
		elementClick(o.getBogiesfrictiontopmassbox());
		elementClick(o.getBogiesfrictionvehiclebody());
		elementClick(o.getBogiesfrictionbottommassbox());
		elementClick(o.getBogiesfrictionsidebearerright());
		elementClick(o.getBogiesfrictionoptiontwo());
		elementClick(o.getBogiesfrictiondetailedoption());
		o.getBogiesfrictiondetailedCOFC().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFC(), "0.43");
		o.getBogiesfrictiondetailedCOFT().clear();
		sendKeys(o.getBogiesfrictiondetailedCOFT(), "0.43");
		o.getBogiesfrictiondetailedsaticpartnormalload().clear();
		sendKeys(o.getBogiesfrictiondetailedsaticpartnormalload(), "16.0");
		elementClick(o.getBogiesfrictiondynamicoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopoption());
		elementClick(o.getBogiesfrictiondynamicbumpstopbox());
		elementClick(o.getBogiesfrictiondynamicbumstopY25sidebearer());
		o.getBogiesfrictiondynamicbumpstopforcebox().clear();
		sendKeys(o.getBogiesfrictiondynamicbumpstopforcebox(), "1");
		elementClick(o.getBogiesfrictiondynamicstiffnessoption());
		elementClick(o.getBogiesfrictiondynamicstiffnessselectbox());
		elementClick(o.getBogiesfrictiondynamicstiffnesssidebearerstiffzright());
		o.getBogiesfrictiondynamicstiffnessfactorbox().clear();
		sendKeys(o.getBogiesfrictiondynamicstiffnessfactorbox(), "1");

	}

	// Y25 Bogie add bump stop

	@Given("User have to click the y type bumpstop option")
	public void user_have_to_click_the_y_type_bumpstop_option() throws InterruptedException {
		o = new OleoPojo();
		elementClick(o.getBogiesfrictionbumpstop());
		Thread.sleep(3000);
		String text = o.getBogiebumopstopbody().getText();
		System.out.println(text);
		if (text.contains("Bumpstop")) {
			System.out.println("-----After click the bogie Bumpstop option it is open Bumpstop body-----");
			String title = "Bumpstop";
			Assert.assertTrue(text.contains(title));
			
		} else {
			System.out.println("-----After click the bogie Bumpstop option it is not open Bumpstop body-----");
			String title = "Bumpstop";
			Assert.assertTrue(text.contains(title));
		}
		
	}

	@When("User have to enter the data of first bumpstop")
	public void user_have_to_enter_the_data_of_first_bumpstop() throws InterruptedException {
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Primery_X_LL_O");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "1.1100000000000003");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "0.9100000000000001");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "-1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "-1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "wheelradius");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "wheelradius");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopfrontwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstoppreloadcheckbox());
		o.getBogiesfrictionbumpstoppreloadbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoppreloadbox(), "3.67");

	}

	@When("User have to save the y type bumpstop")
	public void user_have_to_save_the_y_type_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopaddbutton());
		wait1Seconds();
	}

	@When("User have to enter the data of number two bumpstop")
	public void user_have_to_enter_the_data_of_number_two_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Primery_X_LR_O");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "1.1100000000000003");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "0.9100000000000001");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "wheelradius");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "wheelradius");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopfrontwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstoppreloadcheckbox());
		o.getBogiesfrictionbumpstoppreloadbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoppreloadbox(), "3.67");

	}

	@When("User have to enter the data of number three bumpstop")
	public void user_have_to_enter_the_data_of_number_three_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Primery_X_TL_O");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "-1.1099999999999994");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "-0.9100000000000001");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "-1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "-1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "wheelradius");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "wheelradius");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstoprearwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstoppreloadcheckbox());
		o.getBogiesfrictionbumpstoppreloadbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoppreloadbox(), "3.67");

	}

	@When("User have to enter the data of number four bumpstop")
	public void user_have_to_enter_the_data_of_number_four_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Primery_X_TR_O");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "-1.1099999999999994");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "-0.9100000000000001");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "wheelradius");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "wheelradius");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstoprearwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstoppreloadcheckbox());
		o.getBogiesfrictionbumpstoppreloadbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoppreloadbox(), "3.67");

	}

	@When("User have to enter the data of number five bumpstop")
	public void user_have_to_enter_the_data_of_number_five_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Pri_Landen_LL1");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "0.585");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "0.585");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "-1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "-1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "p_s_top");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopfrontwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-8.16");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.006");

	}

	@When("User have to enter the data of number six bumpstop")
	public void user_have_to_enter_the_data_of_number_six_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Pri_Landen_LLO");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "1.2149999999999999");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "1.2149999999999999");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "-1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "-1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "p_s_top");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopfrontwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-8.16");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.006");

	}

	@When("User have to enter the data of number seven bumpstop")
	public void user_have_to_enter_the_data_of_number_seven_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Pri_Laden_LR1");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "0.585");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "0.585");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "p_s_top");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopfrontwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-8.16");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.006");

	}

	@When("User have to enter the data of number eight bumpstop")
	public void user_have_to_enter_the_data_of_number_eight_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Pri_Laden_LRO");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "1.2149999999999999");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "1.2149999999999999");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "p_s_top");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopfrontwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-8.16");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.006");

	}

	@When("User have to enter the data of number nine bumpstop")
	public void user_have_to_enter_the_data_of_number_nine_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Pri_Laden_TL1");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "-0.585");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "-0.585");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "-1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "-1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "p_s_top");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstoprearwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-8.16");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.006");

	}

	@When("User have to enter the data of number ten bumpstop")
	public void user_have_to_enter_the_data_of_number_ten_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(),"Pri_Laden_TLO");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(),"-1.2149999999999999");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(),"-1.2149999999999999");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(),"-1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(),"-1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(),"p_s_top");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(),"p_s_bottom");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstoprearwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-8.16");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.006");

	}

	@When("User have to enter the data of serial number one bumpstop")
	public void user_have_to_enter_the_data_of_serial_number_one_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Pri_Laden_TR1");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "-0.585");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "-0.585");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "p_s_top");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstoprearwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-8.16");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.006");

	}

	@When("User have to enter the data of serial number two bumpstop")
	public void user_have_to_enter_the_data_of_serial_number_two_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Pri_Laden_TRO");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "-1.2149999999999999");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "-1.2149999999999999");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "p_s_top");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "p_s_bottom");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstoprearwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-8.16");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.006");

	}

	@When("User have to enter the data of serial number three bumpstop")
	public void user_have_to_enter_the_data_of_serial_number_three_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "PR1_X_LL_1");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "0.6900000000000004");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "0.8899999999999997");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "-1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "-1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "wheelradius");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "wheelradius");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopfrontwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.004");

	}

	@When("User have to enter the data of serial number four bumpstop")
	public void user_have_to_enter_the_data_of_serial_number_four_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "PR1_X_RL_1");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "0.6900000000000004");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "0.8899999999999997");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "wheelradius");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "wheelradius");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopfrontwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.004");

	}

	@When("User have to enter the data of serial number five bumpstop")
	public void user_have_to_enter_the_data_of_serial_number_five_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "PR1_X_TR_1");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "-0.6900000000000004");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "-0.8899999999999997");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "wheelradius");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "wheelradius");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstoprearwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.004");

	}

	@When("User have to enter the data of serial number six bumpstop")
	public void user_have_to_enter_the_data_of_serial_number_six_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "PR1_Y_LL");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "-0.9000000000000004");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "-0.9000000000000004");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "-1.1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "-0.9");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "wheelradius");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "wheelradius");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopfrontwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.010");

	}

	@When("User have to enter the data of serial number seven bumpstop")
	public void user_have_to_enter_the_data_of_serial_number_seven_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "PR1_Y_LR");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "0.9000000000000004");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "0.9000000000000004");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "1.1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "0.9");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "wheelradius");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "wheelradius");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstoprearwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.010");

	}

	@When("User have to enter the data of serial number eight bumpstop")
	public void user_have_to_enter_the_data_of_serial_number_eight_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "PR1_Y_TL");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "0.9000000000000004");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "0.9000000000000004");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "-1.1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "-0.9");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "wheelradius");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "wheelradius");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstoprearwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.010");

	}

	@When("User have to enter the data of serial number nine bumpstop")
	public void user_have_to_enter_the_data_of_serial_number_nine_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "PR1_Y_TR");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "-0.9000000000000004");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "-0.9000000000000004");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "1.1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "0.9");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "wheelradius");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "wheelradius");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstoprearwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.010");

	}

	@When("User have to enter the data of serial number ten bumpstop")
	public void user_have_to_enter_the_data_of_serial_number_ten_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Sidebearer_Stop_Z_R");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "0.0");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "0.0");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "0.85");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "0.85");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "0.77");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "0.65");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopvehiclebody());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.012");

	}

	@When("User have to enter the data of count number one bumpstop")
	public void user_have_to_enter_the_data_of_count_number_one_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Side_Bar_Clearance_L");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "0.2000000000000018");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "-0.2000000000000018");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "-0.85");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "-0.85");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "0.8");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "0.8");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopsidebearerleft());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-11");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600.464");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "-1");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "-0.464");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokefour(), "1");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcefour(), "0.464");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokefive(), "11");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcefive(), "600.464");

	}

	@When("User have to enter the data of count number two bumpstop")
	public void user_have_to_enter_the_data_of_count_number_two_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Y25D_Primary_Long_Bumper_Stop_Inner");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "-0.6900000000000004");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "-0.8899999999999997");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "-1");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "-1");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "wheelradius");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "wheelradius");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstoprearwheelset());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.004");

	}

	@When("User have to enter the data of count number three bumpstop")
	public void user_have_to_enter_the_data_of_count_number_three_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Y25D_Sidebearer_Stop");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "0.0");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "0.0");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "-0.85");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "-0.85");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "0.77");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "0.65");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopvehiclebody());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "10");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		elementClick(o.getBogiesfrictionbumpstopdefineoffsetcheckbox());
		elementClick(o.getBogiesfrictionbumpstopclearancecheckbox());
		o.getBogiesfrictionbumpstopclearancebox().clear();
		sendKeys(o.getBogiesfrictionbumpstopclearancebox(), "0.012");

	}

	@When("User have to enter the data of count number four bumpstop")
	public void user_have_to_enter_the_data_of_count_number_four_bumpstop() throws InterruptedException {
		elementClick(o.getBogiesfrictionbumpstopposition());
		wait1Seconds();
		sendKeys(o.getBogiesfrictionbumpstopnamebox(), "Y25D_Side_Bar_Clearance");
		o.getBogiesfrictionbumpstoptopxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopxbox(), "0.2000000000000018");
		o.getBogiesfrictionbumpstopbottomxbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomxbox(), "-0.2000000000000018");
		o.getBogiesfrictionbumpstoptopybox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopybox(), "0.85");
		o.getBogiesfrictionbumpstopbottomybox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomybox(), "0.85");
		o.getBogiesfrictionbumpstoptopzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstoptopzbox(), "0.8");
		o.getBogiesfrictionbumpstopbottomzbox().clear();
		sendKeys(o.getBogiesfrictionbumpstopbottomzbox(), "0.8");
		elementClick(o.getBogiesfrictionbumpstoptopmassbox());
		elementClick(o.getBogiesfrictionbumpstopsidebearerright());
		elementClick(o.getBogiesfrictionbumpstopbottommassbox());
		elementClick(o.getBogiesfrictionbumpstopbogiesframemodelled());
		elementClick(o.getBogiesfrictionbumpstopstiffnessoption());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		elementClick(o.getBogiesfrictionbumpstopstiffnesplusbutton());
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokeone(), "-11");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforceone(), "-600.464");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstoketwo(), "-1");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcetwo(), "-0.464");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokethree(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcethree(), "0");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokefour(), "1");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcefour(), "0.464");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessstokefive(), "11");
		sendKeys(o.getBogiesfrictionbumpstopstiffnessforcefive(), "600.464");

	}
	
	

	// coupling the friction elements

	@Given("User have to clikc the coupling friction option and click the first friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_first_friction() {
		o = new OleoPojo();
		elementClick(o.getBogiesselectfrictiondropdwon());
		elementClick(o.getBogiescenterpivot_X_R());
	}

	@When("User have to click edit and click coupling select the centerpivot_Z_R")
	public void user_have_to_click_edit_and_click_coupling_select_the_centerpivot_Z_R() throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2centerpivot_Z_R());

	}

	@Then("User have to save the coupling option")
	public void user_have_to_save_the_coupling_option() throws InterruptedException {
		elementClick(o.getBogiescouplingsave());
		wait1Seconds();
	}

	@Given("User have to clikc the coupling friction option and click the second friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_second_friction() {

		elementClick(o.getBogiescenterpivot_Y_B());
	}

	@When("User have to click edit and click coupling select the centerpivot_Z_F")
	public void user_have_to_click_edit_and_click_coupling_select_the_centerpivot_Z_F() throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2centerpivot_Z_F());

	}

	@Given("User have to clikc the coupling friction option and click the third friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_third_friction() {

		elementClick(o.getBogiescenterpivot_X_L());

	}

	@When("User have to click edit and click coupling select the centerpivot_Z_L")
	public void user_have_to_click_edit_and_click_coupling_select_the_centerpivot_Z_L() throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2centerpivot_Z_L());
	}

	@Given("User have to clikc the coupling friction option and click the four friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_four_friction() {

		elementClick(o.getBogiescenterpivot_Y_F());
	}

	@When("User have to click edit and click coupling select the centerpivot_Z_B")
	public void user_have_to_click_edit_and_click_coupling_select_the_centerpivot_Z_B() throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2centerpivot_Z_B());
	}

	@Given("User have to clikc the coupling friction option and click the fiveth friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_fiveth_friction() {

		elementClick(o.getBogiescenterpivot_Z_R());
	}

	@When("User have to click edit and click coupling select the centerpivot_X_R")
	public void user_have_to_click_edit_and_click_coupling_select_the_centerpivot_X_R() throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2centerpivot_X_R());
	}

	@Given("User have to clikc the coupling friction option and click the sixth friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_sixth_friction() {

		elementClick(o.getBogiescenterpivot_Z_F());
	}

	@When("User have to click edit and click coupling select the centerpivot_Y_F")
	public void user_have_to_click_edit_and_click_coupling_select_the_centerpivot_Y_F() throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2centerpivot_Y_B());
	}

	@Given("User have to clikc the coupling friction option and click the seventh friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_seventh_friction() {

		elementClick(o.getBogiescenterpivot_Z_L());
	}

	@When("User have to click edit and click coupling select the centerpivot_Y_B")
	public void user_have_to_click_edit_and_click_coupling_select_the_centerpivot_Y_B() throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2centerpivot_X_L());

	}

	@Given("User have to clikc the coupling friction option and click the eight friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_eight_friction() {

		elementClick(o.getBogiescenterpivot_Z_B());
	}

	@When("User have to click edit and click coupling select the centerpivot_X_L")
	public void user_have_to_click_edit_and_click_coupling_select_the_centerpivot_X_L() throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2centerpivot_Y_F());
	}

	@Given("User have to clikc the coupling friction option and click the nineth friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_nineth_friction() {

		elementClick(o.getBogiesprimarylateralfriction_TL_O());
	}

	@When("User have to click edit and click coupling select the primaryverticalfriction_TL_O")
	public void user_have_to_click_edit_and_click_coupling_select_the_primaryverticalfriction_TL_O()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2primaryverticalfriction_TL_O());
	}

	@Given("User have to clikc the coupling friction option and click the tenth friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_tenth_friction() {

		elementClick(o.getBogiesprimarylateralfriction_TL_1());
	}

	@When("User have to click edit and click coupling select the primaryvertical friction_TL_L")
	public void user_have_to_click_edit_and_click_coupling_select_the_primaryvertical_friction_TL_L()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingboxtwo());
		elementClick(o.getBogies2primaryverticalfriction_TL_1());
	}

	@Given("User have to clikc the coupling friction option and click the number one friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_number_one_friction() {

		elementClick(o.getBogiesprimarylateralfriction_LL_1());
	}

	@When("User have to click edit and click coupling select the primaryvertical friction_LL_L")
	public void user_have_to_click_edit_and_click_coupling_select_the_primaryvertical_friction_LL_L()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingboxtwo());
		elementClick(o.getBogies2primaryverticalfriction_LL_1());

	}

	@Given("User have to clikc the coupling friction option and click the number two friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_number_two_friction() {

		elementClick(o.getBogiesprimarylateralfriction_LL_O());
	}

	@When("User have to click edit and click coupling select the primaryvertical friction_LL_O")
	public void user_have_to_click_edit_and_click_coupling_select_the_primaryvertical_friction_LL_O()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2primaryverticalfriction_LL_O());
	}

	@Given("User have to clikc the coupling friction option and click the number three friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_number_three_friction() {

		elementClick(o.getBogiesprimarylateralfriction_TR_O());
	}

	@When("User have to click edit and click coupling select the primaryvertical friction_TR_O")
	public void user_have_to_click_edit_and_click_coupling_select_the_primaryvertical_friction_TR_O()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2primaryverticalfriction_TR_O());

	}

	@Given("User have to clikc the coupling friction option and click the number four friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_number_four_friction() {

		elementClick(o.getBogiesprimarylateralfriction_TR_1());
	}

	@When("User have to click edit and click coupling select the primaryvertical friction_TR_L")
	public void user_have_to_click_edit_and_click_coupling_select_the_primaryvertical_friction_TR_L()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingboxtwo());
		elementClick(o.getBogies2primaryverticalfriction_TR_1());
	}

	@Given("User have to clikc the coupling friction option and click the number five friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_number_five_friction() {

		elementClick(o.getBogiesprimarylateralfriction_LR_1());
	}

	@When("User have to click edit and click coupling select the primaryvertical friction_LR_L")
	public void user_have_to_click_edit_and_click_coupling_select_the_primaryvertical_friction_LR_L()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingboxtwo());
		elementClick(o.getBogies2primaryverticalfriction_LR_1());
	}

	@Given("User have to clikc the coupling friction option and click the number six friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_number_six_friction() {

		elementClick(o.getBogiesprimarylateralfriction_LR_O());
	}

	@When("User have to click edit and click coupling select the primaryvertical friction_LR_O")
	public void user_have_to_click_edit_and_click_coupling_select_the_primaryvertical_friction_LR_O()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2primaryverticalfriction_LR_O());
	}

	@Given("User have to clikc the coupling friction option and click the number seven friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_number_seven_friction() {

		elementClick(o.getBogiesprimaryverticalfriction_TL_O());
	}

	@When("User have to click edit and click coupling select the primarylateral friction_TL_O")
	public void user_have_to_click_edit_and_click_coupling_select_the_primarylateral_friction_TL_O()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2primarylateralfriction_TL_O());
	}

	@Given("User have to clikc the coupling friction option and click the number eight friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_number_eight_friction()
			throws InterruptedException {

		elementClick(o.getBogiesprimaryverticalfriction_TL_1());
	}

	@When("User have to click edit and click coupling select the primarylateral friction_TL_L")
	public void user_have_to_click_edit_and_click_coupling_select_the_primarylateral_friction_TL_L()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2primarylateralfriction_TL_1());
	}

	@Given("User have to clikc the coupling friction option and click the number nine friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_number_nine_friction() {

		elementClick(o.getBogiesprimaryverticalfriction_LL_1());
	}

	@When("User have to click edit and click coupling select the primarylateral friction_LL_L")
	public void user_have_to_click_edit_and_click_coupling_select_the_primarylateral_friction_LL_L()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2primarylateralfriction_LL_1());
	}

	@Given("User have to clikc the coupling friction option and click the number ten friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_number_ten_friction()
			throws InterruptedException {

		elementClick(o.getBogiesprimaryverticalfriction_LL_O());
	}

	@When("User have to click edit and click coupling select the primarylateral friction_LL_O")
	public void user_have_to_click_edit_and_click_coupling_select_the_primarylateral_friction_LL_O()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2primarylateralfriction_LL_O());
	}

	@Given("User have to clikc the coupling friction option and click the count one friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_count_one_friction()
			throws InterruptedException {

		elementClick(o.getBogiesprimaryverticalfriction_TR_O());
	}

	@When("User have to click edit and click coupling select the primarylateral friction_TR_O")
	public void user_have_to_click_edit_and_click_coupling_select_the_primarylateral_friction_TR_O()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2primarylateralfriction_TR_O());
	}

	@Given("User have to clikc the coupling friction option and click the count two friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_count_two_friction()
			throws InterruptedException {

		elementClick(o.getBogiesprimaryverticalfriction_TR_1());
	}

	@When("User have to click edit and click coupling select the primarylateral friction_TR_L")
	public void user_have_to_click_edit_and_click_coupling_select_the_primarylateral_friction_TR_L()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2primarylateralfriction_TR_1());
	}

	@Given("User have to clikc the coupling friction option and click the count three friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_count_three_friction()
			throws InterruptedException {

		elementClick(o.getBogiesprimaryverticalfriction_LR_1());
	}

	@When("User have to click edit and click coupling select the primarylateral friction_LR_L")
	public void user_have_to_click_edit_and_click_coupling_select_the_primarylateral_friction_LR_L()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2primarylateralfriction_LR_1());
	}

	@Given("User have to clikc the coupling friction option and click the count four friction")
	public void user_have_to_clikc_the_coupling_friction_option_and_click_the_count_four_friction()
			throws InterruptedException {

		elementClick(o.getBogiesprimaryverticalfriction_LR_O());
	}

	@When("User have to click edit and click coupling select the primarylateral friction_LR_O")
	public void user_have_to_click_edit_and_click_coupling_select_the_primarylateral_friction_LR_O()
			throws InterruptedException {
		elementClick(o.getBogieseditoption());
		Thread.sleep(2000);
		elementClick(o.getBogiescouplingoption());
		elementClick(o.getBogiesselectcheckboxcouplingopiton());
		elementClick(o.getBogiesselectcouplingbox());
		elementClick(o.getBogies2primarylateralfriction_LR_O());

	}

	@Then("User have to close the coupling  tab")
	public void user_have_to_close_the_coupling_tab() throws InterruptedException {

		Thread.sleep(8000);
		elementClick(o.getBogiesfullsave());
		wait1Seconds();
		elementClick(o.getBogiesconformsave());
		Thread.sleep(3000);
		String text = o.getBogoiefirsttitle().getText();
		System.out.println(text);
		if (text=="Y25Bogie") {
			System.out.println("Y25 Bogie has sucessfully created");
		}else {
            System.out.println("Y25 Bogie has not created");
		}
		if (text.contains("Y25Bogie")) {
			System.out.println("After click the bogie save option after it show in the Y25 bogie assembly dashbord");
			String title = "Y25Bogie";
			Assert.assertTrue(text.contains(title));
			
		} else {
			System.out.println("After click the bogie save option after it not show in the Y25 bogie assembly dashbord");
			String title = "Y25Bogie";
			Assert.assertTrue(text.contains(title));
		}
		
		wait1Seconds();
		quitTab();
	}

	
	
	// creating the manual route profile options(singapore route profile)

	@When("User have to enter manual profile name and click the manual input data option")
	public void user_have_to_enter_manual_profile_name_and_click_the_manual_input_data_option()
			throws InterruptedException {
		wait1Seconds();
		implicitWait();
		o=new OleoPojo();
		sendKeys(o.getManualrouteprofilenamebox(), "singapore route profile");
		elementClick(o.getCreatemanualinputdata());
	}

	@When("User have to enter vertical and horizandal data details")
	public void user_have_to_enter_vertical_and_horizandal_data_details() throws InterruptedException {

		// vertical details
		o = new OleoPojo();
		elementClick(o.getVerticalcheckbox());
		elementClick(o.getVerticalplusbutton());
		elementClick(o.getVerticalplusbutton());
		elementClick(o.getVerticalplusbutton());
		elementClick(o.getVerticalplusbutton());
		sendKeys(o.getVerticalgradienttwo(), "2");
		sendKeys(o.getVerticalgradientthree(), "0");
		sendKeys(o.getVerticalgradientfour(), "-2.0");
		sendKeys(o.getVerticalgradientfive(), "0");
		o.getVerticaldistanceone().clear();
		sendKeys(o.getVerticaldistanceone(), "1578");
		o.getVerticaldistancetwo().clear();
		sendKeys(o.getVerticaldistancetwo(), "200");
		o.getVerticaldistancethree().clear();
		sendKeys(o.getVerticaldistancethree(), "50");
		o.getVerticaldistancefour().clear();
		sendKeys(o.getVerticaldistancefour(), "200");
		o.getVerticaldistancefive().clear();
		sendKeys(o.getVerticaldistancefive(), "172.11");
		o.getVerticalconnectingradiusone().clear();
		sendKeys(o.getVerticalconnectingradiusone(), "10000");
		o.getVerticalconnectingradiustwo().clear();
		sendKeys(o.getVerticalconnectingradiustwo(), "10000");
		o.getVerticalconnectingradiusthree().clear();
		sendKeys(o.getVerticalconnectingradiusthree(), "10000");
		o.getVerticalconnectingradiusfour().clear();
		sendKeys(o.getVerticalconnectingradiusfour(), "10000");
		o.getVerticalconnectingradiusfive().clear();
		sendKeys(o.getVerticalconnectingradiusfive(), "10000");

		// Horizondal details

		// 1
		elementClick(o.getHorizontalprofile());
		elementClick(o.getHorizontalcheckbox());
		o.getHorizontalstraightone().clear();
		sendKeys(o.getHorizontalstraightone(), "366");
		o.getHorizontalcurveradiusone().clear();
		sendKeys(o.getHorizontalcurveradiusone(), "202.5");
		o.getHorizontalcurveangleone().clear();
		sendKeys(o.getHorizontalcurveangleone(), "230.5");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",o.getLocationsetting());
		wait1Seconds();
		elementClick(o.getHorizontalsettingone());
		wait1Seconds();
		elementClick(o.getHorizontalcalculatetranstioncurve());
		wait1Seconds();
		elementClick(o.getHorizontalunlockgradient());
		wait1Seconds();
		o.getHorizontaltransitionin().clear();
		sendKeys(o.getHorizontaltransitionin(), "49.9");
		o.getHorizontaltransitionout().clear();
		sendKeys(o.getHorizontaltransitionout(), "66.9");
		elementClick(o.getHorizontalinserttranstion());

		// 2
		
	
		js.executeScript("arguments[0].scrollIntoView(true)",o.getLocationsetting());
		elementClick(o.getHorizontalplusbutton());
		o.getHorizontalstraighttwo().clear();
		sendKeys(o.getHorizontalstraighttwo(), "0");
		o.getHorizontalcurveradiustwo().clear();
		sendKeys(o.getHorizontalcurveradiustwo(), "230");
		o.getHorizontalcurveangletwo().clear();
		sendKeys(o.getHorizontalcurveangletwo(), "-64");
		elementClick(o.getHorizontalsettingtwo());
		wait1Seconds();
		elementClick(o.getHorizontalcalculatetranstioncurve());
		wait1Seconds();
		elementClick(o.getHorizontalunlockgradient());
		elementClick(o.getHorizontalunlockgradient());
		wait1Seconds();
		o.getHorizontaltransitionin().clear();
		sendKeys(o.getHorizontaltransitionin(), "60");
		o.getHorizontaltransitionout().clear();
		sendKeys(o.getHorizontaltransitionout(), "19");
		elementClick(o.getHorizontalinserttranstion());
		// 3
		js.executeScript("arguments[0].scrollIntoView(true)",o.getLocationsetting());
		elementClick(o.getHorizandalplustwobutton());
		o.getHorizontalstraightthree().clear();
		sendKeys(o.getHorizontalstraightthree(), "63");
		o.getHorizontalcurveradiusthree().clear();
		sendKeys(o.getHorizontalcurveradiusthree(), "200");
		o.getHorizontalcurveanglethree().clear();
		sendKeys(o.getHorizontalcurveanglethree(), "-36.5");
		elementClick(o.getHorizontalsettingthree());
		wait1Seconds();
		elementClick(o.getHorizontalcalculatetranstioncurve());
		wait1Seconds();
		elementClick(o.getHorizontalunlockgradient());
		elementClick(o.getHorizontalunlockgradient());
		wait1Seconds();
		o.getHorizontaltransitionin().clear();
		sendKeys(o.getHorizontaltransitionin(), "50.5");
		o.getHorizontaltransitionout().clear();
		sendKeys(o.getHorizontaltransitionout(), "34.5");
		elementClick(o.getHorizontalinserttranstion());
		// 4
		js.executeScript("arguments[0].scrollIntoView(true)",o.getLocationsetting());
		elementClick(o.getHorizontalplusthreebutton());
		o.getHorizontalstraightfour().clear();
		sendKeys(o.getHorizontalstraightfour(), "0");
		o.getHorizontalcurveradiusfour().clear();
		sendKeys(o.getHorizontalcurveradiusfour(), "197");
		o.getHorizontalcurveanglefour().clear();
		sendKeys(o.getHorizontalcurveanglefour(), "230");
		elementClick(o.getHorizontalsettingfour());
		wait1Seconds();
		elementClick(o.getHorizontalcalculatetranstioncurve());
		wait1Seconds();
		elementClick(o.getHorizontalunlockgradient());
		elementClick(o.getHorizontalunlockgradient());
		wait1Seconds();
		o.getHorizontaltransitionin().clear();
		sendKeys(o.getHorizontaltransitionin(), "40");
		o.getHorizontaltransitionout().clear();
		sendKeys(o.getHorizontaltransitionout(), "35.1");
		elementClick(o.getHorizontalinserttranstion());
		// 5
		js.executeScript("arguments[0].scrollIntoView(true)",o.getLocationsetting());
		elementClick(o.getHorizontalplusfourbutton());
		o.getHorizontalstraightfive().clear();
		sendKeys(o.getHorizontalstraightfive(), "404.26");
		o.getHorizontalcurveradiusfive().clear();
		sendKeys(o.getHorizontalcurveradiusfive(), "0");
		o.getHorizontalcurveanglefive().clear();
		sendKeys(o.getHorizontalcurveanglefive(), "0");

	}

	@When("User have to click the location setting and enter setting details")
	public void user_have_to_click_the_location_setting_and_enter_setting_details() throws InterruptedException {
		elementClick(o.getLocationsetting());
		o.getLocationlatitude().clear();
		sendKeys(o.getLocationlatitude(), "1.3420");
		o.getLocationlongtitude().clear();
		sendKeys(o.getLocationlongtitude(), "103.6438");
		o.getLocationheading().clear();
		sendKeys(o.getLocationheading(), "-227.5");
		elementClick(o.getLocationsetcoordinates());
		elementClick(o.getTerrainrefreshbutton());
		wait5seconds();
		elementClick(o.getMapviewoption());
		wait5seconds();

	}

	@When("User have to click the markes and enter details")
	public void user_have_to_click_the_markes_and_enter_details() {
		elementClick(o.getMarkersbutton());
		elementClick(o.getMarkerscheckbox());
		elementClick(o.getMarkerspluse());
		sendKeys(o.getMarkernameone(), "A");
		sendKeys(o.getMarkernametwo(), "B");
		sendKeys(o.getMarkerdistanceone(), "1600");
		sendKeys(o.getMarkerdistancetwo(), "2300");

	}

	@When("User have to click the manual route profile refresh button")
	public void user_have_to_click_the_manual_route_profile_refresh_button() throws InterruptedException {
		elementClick(o.getTerrainrefreshbutton());
		wait5seconds();

	}

	@Then("User have to save and close the tab")
	public void user_have_to_save_and_close_the_tab() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)",o.getManualinputdatatitle());
		wait1Seconds();
		elementClick(o.getManualprofilesavebutton());
		wait1Seconds();
		quitTab();
	}

	// Use Y25bogie to create vehicle

	@Given("User have to select the template and click select template button")
	public void user_have_to_select_the_template_and_click_select_template_button() throws InterruptedException {
		o = new OleoPojo();
		implicitWait();
		elementClick(o.getY25bogiesvehicletemplatebox());
		wait1Seconds();
		elementClick(o.getY25bogiesvehicleselectDMU());
		wait1Seconds();
		elementClick(o.getY25bogiesvehicleselectsecondbox());
		wait1Seconds();
		elementClick(o.getY25bogiesgeneric4carmetro());
		wait1Seconds();
		elementClick(o.getY25bogiesselecttemplate());
		wait1Seconds();

	}

	@When("User have to click the suspension option")
	public void user_have_to_click_the_suspension_option() throws InterruptedException {

		elementClick(o.getY25bogiesselectsuspension());

	}

	@When("User have to select the check box and enter the details")
	public void user_have_to_select_the_check_box_and_enter_the_details() {
		elementClick(o.getY25bogievehiclecheckbox());
		sendKeys(o.getY25bogievehiclebodymass(), "36.4");
		sendKeys(o.getY25bogiecogx(), "0");
		sendKeys(o.getY25bogiecogy(), "0");
		sendKeys(o.getY25bogiecogz(), "957");
		sendKeys(o.getY25bogierollinertia(), "57000");
		sendKeys(o.getY25bogiepitchinertia(), "19840");
		sendKeys(o.getY25bogieyawinertia(), "19840");
		o.getY25bogievehiclenamebox().clear();
		sendKeys(o.getY25bogievehiclenamebox(), "My vehicle");

	}

	@When("User have to select rear and front bogie option")
	public void user_have_to_select_rear_and_front_bogie_option() throws InterruptedException {
		elementClick(o.getY25bogierearbogiebox());
		elementClick(o.getY25bogieselectY25bogie());
		wait1Seconds();
		elementClick(o.getY25bogierearbogiebox());
		elementClick(o.getY25bogieselectY25bogie());

	}

	@When("User have to click three D view option")
	public void user_have_to_click_three_D_view_option() throws InterruptedException {

		elementClick(o.getY25bogievehicle3doption());
		Thread.sleep(15000);
	}

	@When("User have to save the y type vehicle")
	public void user_have_to_save_the_y_type_vehicle() throws InterruptedException {
		elementClick(o.getY25bogievehiclesavebutton());
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/vehicles");

	}
	
	

	// create Y25 based train

	@Given("User have to click the create train dropdwon button")
	public void user_have_to_click_the_create_train_dropdwon_button() throws InterruptedException {
		o = new OleoPojo();
		elementClick(o.getY25bogietraindropdwon());
		wait1Seconds();
	}

	@Given("User have to click the vehicle based create train option")
	public void user_have_to_click_the_vehicle_based_create_train_option() throws InterruptedException {

		elementClick(o.getY25bogiecreatewithvehicles());
		wait1Seconds();

	}

	@When("User have to click the choose from library and select the type,template")
	public void user_have_to_click_the_choose_from_library_and_select_the_type_template() throws InterruptedException {
		elementClick(o.getY25bogiechoosefromlibrary());
		wait1Seconds();
		elementClick(o.getY25bogieselecttraintype());
		elementClick(o.getY25bogieselectmetrotype());
		wait1Seconds();
		elementClick(o.getY25bogieselecttemplatebox());
		elementClick(o.getY25bogieselectgeneric4carmetro());
		elementClick(o.getY25bogieslecttempaltebutton());
		wait1Seconds();

	}

	@When("User have to change the name of the train")
	public void user_have_to_change_the_name_of_the_train() throws InterruptedException {

		o.getY25bogietrainnamebox().clear();
		wait1Seconds();
		sendKeys(o.getY25bogietrainnamebox(), "My train");

	}

	@When("User have to choose the four cabin vehicle option")
	public void user_have_to_choose_the_four_cabin_vehicle_option() throws InterruptedException {

		elementClick(o.getY25bogiesselectvehiclebox());
		elementClick(o.getY25bogieselectmyvehicle());
		wait1Seconds();
		elementClick(o.getY25bogiesecondcabin());
		mouseOverAction(o.getY25bogielibrary());
		elementClick(o.getY25bogiesselectvehicleboxsecond());
		elementClick(o.getY25bogieselectmyvehicle());
		wait1Seconds();
		elementClick(o.getY25bogiethiredcabin());
		mouseOverAction(o.getY25bogielibrarytwo());
		elementClick(o.getY25bogiesselectvehicleboxthird());
		elementClick(o.getY25bogieselectmyvehicle());
		wait1Seconds();
		elementClick(o.getY25bogiefourthcabin());
		mouseOverAction(o.getY25bogielibrarythree());
		elementClick(o.getY25bogiesselectvehicleboxfourth());
		elementClick(o.getY25bogieselectmyvehicle());
	}

	@When("User have to click the save and review button")
	public void user_have_to_click_the_save_and_review_button() throws InterruptedException {
		mouseOverAction(o.getY25bogiesaveandreview());
		wait1Seconds();
		elementClick(o.getY25bogiesaveandreview());

	}

	@When("User have to see the threeD view option of the train")
	public void user_have_to_see_the_threeD_view_option_of_the_train() throws InterruptedException {

		elementClick(o.getY25bogietrain3Dview());
		Thread.sleep(15000);

	}

	@When("User have to click the return to library option")
	public void user_have_to_click_the_return_to_library_option() throws InterruptedException {

		elementClick(o.getY25bogiereturntolibrary());
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/trains");

	}

	
	
	// create Y25 project based on Y25 train and Y25 vehicle

	@Given("User have to enter Y type simulation project name and simulation name")
	public void user_have_to_enter_Y_type_simulation_project_name_and_simulation_name() throws InterruptedException {

		sendKeys(o.getY25bogiesimulationnamebox(), "Running Train");
		wait1Seconds();
		elementClick(o.getY25bogieselectsimulationname());

	}

	@Given("User have to enter the simulation speed")
	public void user_have_to_enter_the_simulation_speed() {

		sendKeys(o.getY25bogiesimulationspeedbox(), "55");

	}

	@When("User have to click the Y type simulation running train option")
	public void user_have_to_click_the_Y_type_simulation_running_train_option() {

		elementClick(o.getY25bogieselectrunningtrainoption());

	}

	@When("User have to select the Y type simulation route profile and select the train")
	public void user_have_to_select_the_Y_type_simulation_route_profile_and_select_the_train()
			throws InterruptedException {

		elementClick(o.getY25bogieselectroutprofilebox());
		wait1Seconds();
		elementClick(o.getCreaterunningtrainfirstprofile());

	}

	@When("User have to enter Y type simulation brack over ride and select the mass condition")
	public void user_have_to_enter_Y_type_simulation_brack_over_ride_and_select_the_mass_condition()
			throws InterruptedException {
		elementClick(o.getY25bogieslecttrainbox());
		elementClick(o.getY25bogieselectmytrain1());
		wait1Seconds();
		elementClick(o.getY25bogiemasscondition());
		elementClick(o.getY25bogieAW1mass());
		sendKeys(o.getY25bogiebrakeoverride(), "0");

	}

	@When("User have to click the Y type simulation run button")
	public void user_have_to_click_the_Y_type_simulation_run_button() throws InterruptedException {
		elementClick(o.getY25bogierunbutton());
		wait5seconds();

	}

	@When("User have to click the Y type simulation stop button")
	public void user_have_to_click_the_Y_type_simulation_stop_button()throws InterruptedException  {

		elementClick(o.getY25bogiestopbutton());

	}

	// Edit the My Train Dimension of projection

     
	@Given("User have to mouse over the my train and click the action button")
	public void user_have_to_mouse_over_the_my_train_and_click_the_action_button()throws InterruptedException  {
	    elementClick(o.getMytrain());
	    elementClick(o.getMytrainaction());
	    wait1Seconds();
	   
	}

	@Given("User have to click the edit train option")
	public void user_have_to_click_the_edit_train_option()throws InterruptedException  {
		 elementClick(o.getMytrainedittrainoption());
		 wait1Seconds();
	}

	@When("User have to click the firstcabin action button and click view vehicle button")
	public void user_have_to_click_the_firstcabin_action_button_and_click_view_vehicle_button()throws InterruptedException  {
	    elementClick(o.getMytrainfistcabin());
	    elementClick(o.getMytrainfirstcabinaction());
	    elementClick(o.getMytrainviewvehicleoption());
	    wait1Seconds();
	}

	@When("User have to click the geomantory button and click firstcabin the rear option")
	public void user_have_to_click_the_geomantory_button_and_click_firstcabin_the_rear_option()throws InterruptedException  {
	   
   	    elementClick(o.getMytraingeometryoption());
	    wait1Seconds();
		elementClick(o.getMytrainrearone());
	}

	@When("User have to click the geomantory button and click secondcabin the rear option")
	public void user_have_to_click_the_geomantory_button_and_click_secondcabin_the_rear_option()throws InterruptedException  {
		   elementClick(o.getMytraingeometryoption());
		    wait1Seconds();
		    elementClick(o.getMytrainreartwo());
	}

	@When("User have to click the geomantory button and click thirdcabin the rear option")
	public void user_have_to_click_the_geomantory_button_and_click_thirdcabin_the_rear_option()throws InterruptedException  {
		   elementClick(o.getMytraingeometryoption());
		    wait1Seconds();
		    elementClick(o.getMytrainrearthree());
	}

	@When("User have to click the geomantory button and click the fourthcabin rear option")
	public void user_have_to_click_the_geomantory_button_and_click_the_fourthcabin_rear_option()throws InterruptedException  {
		   elementClick(o.getMytraingeometryoption());
		    wait1Seconds();
		    elementClick(o.getMytrainrearfour());
	}

	@When("User have to click the check box")
	public void user_have_to_click_the_check_box() throws InterruptedException {
	    elementClick(o.getMytrainrearcheckbox());
	}

	@When("User have to clear the projection box and enter the new value")
	public void user_have_to_clear_the_projection_box_and_enter_the_new_value()throws InterruptedException  {
	  
	    o.getMytrainbodyprojectionbox().clear();
	    sendKeys(o.getMytrainbodyprojectionbox(),"1500");
	}

	@Then("User have to save the my train new value")
	public void user_have_to_save_the_my_train_new_value()throws InterruptedException  {
	    elementClick(o.getMytrainsavedimention());
	    wait1Seconds();
	    elementClick(o.getMytrainsaveconform());
	    wait1Seconds();
	}

	@Given("User have to click the second vehicle option")
	public void user_have_to_click_the_second_vehicle_option()throws InterruptedException  {
	    elementClick(o.getMytrainsecondcabin());
	}

	@When("User have to click the secondcabin action button and click view vehicle button")
	public void user_have_to_click_the_secondcabin_action_button_and_click_view_vehicle_button()throws InterruptedException  {
	    elementClick(o.getMytrainsecondcabinaction());
	    elementClick(o.getMytrainviewsecondvehicleoption());
	    wait1Seconds();
	}

	@Given("User have to click the third vehicle option")
	public void user_have_to_click_the_third_vehicle_option()throws InterruptedException  {
	    elementClick(o.getMytrainthiredcabin());
	}

	@When("User have to click the thirdcabin action button and click view vehicle button")
	public void user_have_to_click_the_thirdcabin_action_button_and_click_view_vehicle_button() throws InterruptedException {
	    elementClick(o.getMytrainthiredcabinaction());
	    elementClick(o.getMytrainviewthiredvehicleoption());
	    wait1Seconds();
	}

	@Given("User have to click the fourth vehicle option")
	public void user_have_to_click_the_fourth_vehicle_option() throws InterruptedException {
		elementClick(o.getMytrainfourthcabin());
	}

	@When("User have to click the fourthcabin action button and click view vehicle button")
	public void user_have_to_click_the_fourthcabin_action_button_and_click_view_vehicle_button() throws InterruptedException {
	    elementClick(o.getMytrainfourthcabinaction());
	    elementClick(o.getMytrainviewfourthvehicleoption());
	    wait1Seconds();
	}

	@When("User have to click the save and review button after load to click return to library")
	public void user_have_to_click_the_save_and_review_button_after_load_to_click_return_to_library() throws InterruptedException {
	   elementClick(o.getMytrainfinalsave());
	   wait1Seconds();
	   elementClick(o.getMytarinfinalconformsave());
	   wait1Seconds();
	}


	
	
	// create the reverse curve Route profile

	@When("User have to enter revers route profile name and click the manual input data oprion")
	public void user_have_to_enter_revers_route_profile_name_and_click_the_manual_input_data_oprion()
			throws InterruptedException {

		wait1Seconds();
		implicitWait();
		sendKeys(o.getManualrouteprofilenamebox(), "Reverse curve route profile");
		elementClick(o.getCreatemanualinputdata());

	}

	@When("User have to enter revers curve vertical and horizandal data details")
	public void user_have_to_enter_revers_curve_vertical_and_horizandal_data_details() throws InterruptedException {

		// vertical details

		elementClick(o.getVerticalcheckbox());
		o.getVerticaldistanceone().clear();
		sendKeys(o.getVerticaldistanceone(), "236");
		o.getVerticalconnectingradiusone().clear();
		sendKeys(o.getVerticalconnectingradiusone(), "1000");

		// Horizondal details
		o = new OleoPojo();
		elementClick(o.getHorizontalprofile());
		elementClick(o.getHorizontalcheckbox());

		// 1
		o.getHorizontalstraightone().clear();
		o.getHorizontalcurveradiusone().clear();
		o.getHorizontalcurveangleone().clear();
		wait1Seconds();
		sendKeys(o.getHorizontalstraightone(), "0.01");
		sendKeys(o.getHorizontalcurveradiusone(), "105");
		sendKeys(o.getHorizontalcurveangleone(), "20");
		wait1Seconds();
		// 2
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",o.getLocationsetting());
		elementClick(o.getCurvehorizontalpluseone());
		o.getHorizontalstraighttwo().clear();
		o.getHorizontalcurveradiustwo().clear();
		o.getHorizontalcurveangletwo().clear();
		wait1Seconds();
		sendKeys(o.getHorizontalstraighttwo(), "6");
		sendKeys(o.getHorizontalcurveradiustwo(), "150");
		sendKeys(o.getHorizontalcurveangletwo(), "-20");
		// 3
		js.executeScript("arguments[0].scrollIntoView(true)",o.getLocationsetting());
		elementClick(o.getCurvehorizontalplusetwo());
		o.getHorizontalstraightthree().clear();
		o.getHorizontalcurveradiusthree().clear();
		o.getHorizontalcurveanglethree().clear();
		wait1Seconds();
		sendKeys(o.getHorizontalstraightthree(), "150");
		sendKeys(o.getHorizontalcurveradiusthree(), "0");
		sendKeys(o.getHorizontalcurveanglethree(), "0");
		wait5seconds();

	}

	@When("User have to enter the revers curve location setting and enter the data")
	public void user_have_to_enter_the_revers_curve_location_setting_and_enter_the_data() throws InterruptedException, IOException {

		elementClick(o.getLocationsetting());
		wait1Seconds();
		o.getLocationlatitude().clear();
		o.getLocationlongtitude().clear();
		o.getLocationheading().clear();
		wait1Seconds();
		sendKeys(o.getLocationlatitude(), "52.406");
		sendKeys(o.getLocationlongtitude(), "-1.512");
		sendKeys(o.getLocationheading(), "90");
		elementClick(o.getLocationsetcoordinates());
		elementClick(o.getCurverefreshterrainbutton());
		wait5seconds();
		elementClick(o.getMapviewoption());
		wait5seconds();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	  	js.executeScript("arguments[0].scrollIntoView(false)",o.getManualinputdatatitle());
//		js.executeScript("arguments[0].scrollIntoView(false)",o.getLocationsetting());
	  	wait1Seconds();
	  	TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"/Users/hemkumardevarajan/eclipse-workspaces/OI-DigitalTrains-Testing/Report/Screenshot/Digitaltrains.png");
		FileUtils.copyFile(src, dest);

	}
	
	@Then("User have to save reverse curve profile and close the tab")
	public void user_have_to_save_reverse_curve_profile_and_close_the_tab() throws InterruptedException {
		
		elementClick(o.getManualprofilesavebutton());
		wait1Seconds();
		quitTab();
	}

	
	

	// Adding the tunnel option in the route profile

	@When("User have to add the tunnel data start and end point")
	public void user_have_to_add_the_tunnel_data_start_and_end_point() throws InterruptedException {
		elementClick(o.getStructuresoption());
		wait1Seconds();
		elementClick(o.getStructuresgaugebox());
		elementClick(o.getStructurestunneloption());
		wait1Seconds();
		sendKeys(o.getStructuresstartbox(), "120");
		sendKeys(o.getStructuresendbox(), "210");
	}

	@When("User have to enter revers route profile name and click the manual input data option select tunnel")
	public void user_have_to_enter_revers_route_profile_name_and_click_the_manual_input_data_option_select_tunnel()
			throws InterruptedException {
		wait1Seconds();
		implicitWait();
		sendKeys(o.getManualrouteprofilenamebox(), "Tunnel Added Reverse curve route ");
		elementClick(o.getCreatemanualinputdata());
	}

	
	
	// Create the manual Wheel profile

	@When("User have to click the wheel option")
	public void user_have_to_click_the_wheel_option() throws InterruptedException {

		elementClick(o.getWheelrailWheeloption());
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://testphp.digitaltrains.online/profiles");

	}

	@When("User have to click the manual and enter the data")
	public void user_have_to_click_the_manual_and_enter_the_data() {

		int n = 57;
		for (int i = 0; i <= n; i++) {
			elementClick(o.getWheelrailmanualplus());
		}

		// LL
		sendKeys(o.getWheelrailleftlateralone(), "-815.0000");
		sendKeys(o.getWheelrailleftlateraltwo(), "-815.0000");
		sendKeys(o.getWheelrailleftlateralthree(), "-810.0000");
		sendKeys(o.getWheelrailleftlateralfour(), "-799.5000");
		sendKeys(o.getWheelrailleftlateralfive(), "-797.0000");
		sendKeys(o.getWheelrailleftlateralsix(), "-794.5000");
		sendKeys(o.getWheelrailleftlateralseven(), "-792.0000");
		sendKeys(o.getWheelrailleftlateraleight(), "-789.5000");
		sendKeys(o.getWheelrailleftlateralnine(), "-787.0000");
		sendKeys(o.getWheelrailleftlateralten(), "-784.5000");
		sendKeys(o.getWheelrailleftlateralcountone(), "-782.0000");
		sendKeys(o.getWheelrailleftlateralcounttwo(), "-779.5000");
		sendKeys(o.getWheelrailleftlateralcountthree(), "-777.0000");
		sendKeys(o.getWheelrailleftlateralcountfour(), "-774.5000");
		sendKeys(o.getWheelrailleftlateralcountfive(), "-772.0000");
		sendKeys(o.getWheelrailleftlateralcountsix(), "-769.5000");
		sendKeys(o.getWheelrailleftlateralcountseven(), "-767.0000");
		sendKeys(o.getWheelrailleftlateralcounteight(), "-764.5000");
		sendKeys(o.getWheelrailleftlateralcountnine(), "-762.0000");
		sendKeys(o.getWheelrailleftlateralcountten(), "-759.5000");
		sendKeys(o.getWheelrailleftlateralnumberone(), "-757.0000");
		sendKeys(o.getWheelrailleftlateralnumbertwo(), "-754.5000");
		sendKeys(o.getWheelrailleftlateralnumberthree(), "-752.0000");
		sendKeys(o.getWheelrailleftlateralnumberfour(), "-749.5000");
		sendKeys(o.getWheelrailleftlateralnumberfive(), "-747.0000");
		sendKeys(o.getWheelrailleftlateralnumbersix(), "-744.5000");
		sendKeys(o.getWheelrailleftlateralnumberseven(), "-742.0000");
		sendKeys(o.getWheelrailleftlateralnumbereight(), "-739.5000");
		sendKeys(o.getWheelrailleftlateralnumbernine(), "-737.0000");
		sendKeys(o.getWheelrailleftlateralnumberten(), "-734.5000");
		sendKeys(o.getWheelrailleftlateralunitone(), "-732.0000");
		sendKeys(o.getWheelrailleftlateralunittwo(), "-729.5000");
		sendKeys(o.getWheelrailleftlateralunitthree(), "-727.0000");
		sendKeys(o.getWheelrailleftlateralunitfour(), "-724.5000");
		sendKeys(o.getWheelrailleftlateralunitfive(), "-722.0000");
		sendKeys(o.getWheelrailleftlateralunitsix(), "-719.5000");
		sendKeys(o.getWheelrailleftlateralunitseven(), "-717.0000");
		sendKeys(o.getWheelrailleftlateraluniteight(), "-714.5000");
		sendKeys(o.getWheelrailleftlateralunitnine(), "-712.0000");
		sendKeys(o.getWheelrailleftlateralunitten(), "-709.5000");
		sendKeys(o.getWheelrailleftlateralmassone(), "-707.0000");
		sendKeys(o.getWheelrailleftlateralmasstwo(), "-704.5000");
		sendKeys(o.getWheelrailleftlateralmassthree(), "-702.0000");
		sendKeys(o.getWheelrailleftlateralmassfour(), "-700.0000");
		sendKeys(o.getWheelrailleftlateralmassfive(), "-698.0000");
		sendKeys(o.getWheelrailleftlateralmasssix(), "-696.5000");
		sendKeys(o.getWheelrailleftlateralmassseven(), "-695.0000");
		sendKeys(o.getWheelrailleftlateralmasseight(), "-693.5000");
		sendKeys(o.getWheelrailleftlateralmassnine(), "-692.0000");
		sendKeys(o.getWheelrailleftlateralmassten(), "-690.0000");
		sendKeys(o.getWheelrailleftlaterallabone(), "-688.0000");
		sendKeys(o.getWheelrailleftlaterallabtwo(), "-686.0000");
		sendKeys(o.getWheelrailleftlaterallabthree(), "-684.0000");
		sendKeys(o.getWheelrailleftlaterallabfour(), "-682.0000");
		sendKeys(o.getWheelrailleftlaterallabfive(), "-680.5000");
		sendKeys(o.getWheelrailleftlaterallabsix(), "-680.0000");
		sendKeys(o.getWheelrailleftlaterallabseven(), "-680.0000");
		sendKeys(o.getWheelrailleftlaterallabeight(), "-680.0000");
		sendKeys(o.getWheelrailleftlaterallabnine(), "-680.0000");

		// LV
		sendKeys(o.getWheelrailleftverticalone(), "-18.0000");
		sendKeys(o.getWheelrailleftverticaltwo(), "-7.6350");
		sendKeys(o.getWheelrailleftverticalthree(), "-2.6350");
		sendKeys(o.getWheelrailleftverticalfour(), "-1.9360");
		sendKeys(o.getWheelrailleftverticalfive(), "-1.7690");
		sendKeys(o.getWheelrailleftverticalsix(), "-1.6020");
		sendKeys(o.getWheelrailleftverticalseven(), "-1.4360");
		sendKeys(o.getWheelrailleftverticaleight(), "-1.2690");
		sendKeys(o.getWheelrailleftverticalnine(), "-1.1020");
		sendKeys(o.getWheelrailleftverticalten(), "-0.9360");
		sendKeys(o.getWheelrailleftverticalcountone(), "-0.7690");
		sendKeys(o.getWheelrailleftverticalcounttwo(), "-0.6190");
		sendKeys(o.getWheelrailleftverticalcountthree(), "-0.4990");
		sendKeys(o.getWheelrailleftverticalcountfour(), "-0.4100");
		sendKeys(o.getWheelrailleftverticalcountfive(), "-0.3480");
		sendKeys(o.getWheelrailleftverticalcountsix(), "-0.3040");
		sendKeys(o.getWheelrailleftverticalcountseven(), "-0.2740");
		sendKeys(o.getWheelrailleftverticalcounteight(), "-0.2510");
		sendKeys(o.getWheelrailleftverticalcountnine(), "-0.2290");
		sendKeys(o.getWheelrailleftverticalcountten(), "-0.2030");
		sendKeys(o.getWheelrailleftverticalnumberone(), "-0.1680");
		sendKeys(o.getWheelrailleftverticalnumbertwo(), "-0.1220");
		sendKeys(o.getWheelrailleftverticalnumberthree(), "-0.0610");
		sendKeys(o.getWheelrailleftverticalnumberfour(), "0.0170");
		sendKeys(o.getWheelrailleftverticalnumberfive(), "0.1160");
		sendKeys(o.getWheelrailleftverticalnumbersix(), "0.2370");
		sendKeys(o.getWheelrailleftverticalnumberseven(), "0.3840");
		sendKeys(o.getWheelrailleftverticalnumbereight(), "0.5610");
		sendKeys(o.getWheelrailleftverticalnumbernine(), "0.7710");
		sendKeys(o.getWheelrailleftverticalnumberten(), "1.0210");
		sendKeys(o.getWheelrailleftverticalunitone(), "1.3180");
		sendKeys(o.getWheelrailleftverticalunittwo(), "1.6730");
		sendKeys(o.getWheelrailleftverticalunitthree(), "2.1010");
		sendKeys(o.getWheelrailleftverticalunitfour(), "2.6230");
		sendKeys(o.getWheelrailleftverticalunitfive(), "3.2700");
		sendKeys(o.getWheelrailleftverticalunitsix(), "4.1140");
		sendKeys(o.getWheelrailleftverticalunitseven(), "5.3570");
		sendKeys(o.getWheelrailleftverticaluniteight(), "7.3520");
		sendKeys(o.getWheelrailleftverticalunitnine(), "10.9680");
		sendKeys(o.getWheelrailleftverticalunitten(), "17.4310");
		sendKeys(o.getWheelrailleftverticalmassone(), "21.4020");
		sendKeys(o.getWheelrailleftverticalmasstwo(), "23.9840");
		sendKeys(o.getWheelrailleftverticalmassthree(), "25.8210");
		sendKeys(o.getWheelrailleftverticalmassfour(), "26.9090");
		sendKeys(o.getWheelrailleftverticalmassfive(), "27.6190");
		sendKeys(o.getWheelrailleftverticalmasssix(), "27.9060");
		sendKeys(o.getWheelrailleftverticalmassseven(), "28.0000");
		sendKeys(o.getWheelrailleftverticalmasseight(), "27.9060");
		sendKeys(o.getWheelrailleftverticalmassnine(), "27.6190");
		sendKeys(o.getWheelrailleftverticalmassten(), "26.9090");
		sendKeys(o.getWheelrailleftverticallabone(), "25.7470");
		sendKeys(o.getWheelrailleftverticallabtwo(), "24.0110");
		sendKeys(o.getWheelrailleftverticallabthree(), "21.6850");
		sendKeys(o.getWheelrailleftverticallabfour(), "18.3510");
		sendKeys(o.getWheelrailleftverticallabfive(), "14.0190");
		sendKeys(o.getWheelrailleftverticallabsix(), "9.5190");
		sendKeys(o.getWheelrailleftverticallabseven(), "0.0000");
		sendKeys(o.getWheelrailleftverticallabeight(), "-18.0000");
		sendKeys(o.getWheelrailleftverticallabnine(), "-18.1000");

		// RL
		sendKeys(o.getWheelrailrightlateralone(), "815.0000");
		sendKeys(o.getWheelrailrightlateraltwo(), "815.0000");
		sendKeys(o.getWheelrailrightlateralthree(), "810.0000");
		sendKeys(o.getWheelrailrightlateralfour(), "799.5000");
		sendKeys(o.getWheelrailrightlateralfive(), "797.0000");
		sendKeys(o.getWheelrailrightlateralsix(), "794.5000");
		sendKeys(o.getWheelrailrightlateralseven(), "792.0000");
		sendKeys(o.getWheelrailrightlateraleight(), "789.5000");
		sendKeys(o.getWheelrailrightlateralnine(), "787.0000");
		sendKeys(o.getWheelrailrightlateralten(), "784.5000");
		sendKeys(o.getWheelrailrightlateralcountone(), "782.0000");
		sendKeys(o.getWheelrailrightlateralcounttwo(), "779.5000");
		sendKeys(o.getWheelrailrightlateralcountthree(), "777.0000");
		sendKeys(o.getWheelrailrightlateralcountfour(), "774.5000");
		sendKeys(o.getWheelrailrightlateralcountfive(), "772.0000");
		sendKeys(o.getWheelrailrightlateralcountsix(), "769.5000");
		sendKeys(o.getWheelrailrightlateralcountseven(), "767.0000");
		sendKeys(o.getWheelrailrightlateralcounteight(), "764.5000");
		sendKeys(o.getWheelrailrightlateralcountnine(), "762.0000");
		sendKeys(o.getWheelrailrightlateralcountten(), "759.5000");
		sendKeys(o.getWheelrailrightlateralnumberone(), "757.0000");
		sendKeys(o.getWheelrailrightlateralnumbertwo(), "754.5000");
		sendKeys(o.getWheelrailrightlateralnumberthree(), "752.0000");
		sendKeys(o.getWheelrailrightlateralnumberfour(), "749.5000");
		sendKeys(o.getWheelrailrightlateralnumberfive(), "747.0000");
		sendKeys(o.getWheelrailrightlateralnumbersix(), "744.5000");
		sendKeys(o.getWheelrailrightlateralnumberseven(), "742.0000");
		sendKeys(o.getWheelrailrightlateralnumbereight(), "739.5000");
		sendKeys(o.getWheelrailrightlateralnumbernine(), "737.0000");
		sendKeys(o.getWheelrailrightlateralnumberten(), "734.5000");
		sendKeys(o.getWheelrailrightlateralunitone(), "732.0000");
		sendKeys(o.getWheelrailrightlateralunittwo(), "729.5000");
		sendKeys(o.getWheelrailrightlateralunitthree(), "727.0000");
		sendKeys(o.getWheelrailrightlateralunitfour(), "724.5000");
		sendKeys(o.getWheelrailrightlateralunitfive(), "722.0000");
		sendKeys(o.getWheelrailrightlateralunitsix(), "719.5000");
		sendKeys(o.getWheelrailrightlateralunitseven(), "717.0000");
		sendKeys(o.getWheelrailrightlateraluniteight(), "714.5000");
		sendKeys(o.getWheelrailrightlateralunitnine(), "712.0000");
		sendKeys(o.getWheelrailrightlateralunitten(), "709.5000");
		sendKeys(o.getWheelrailrightlateralmassone(), "707.0000");
		sendKeys(o.getWheelrailrightlateralmasstwo(), "704.5000");
		sendKeys(o.getWheelrailrightlateralmassthree(), "702.0000");
		sendKeys(o.getWheelrailrightlateralmassfour(), "700.0000");
		sendKeys(o.getWheelrailrightlateralmassfive(), "698.0000");
		sendKeys(o.getWheelrailrightlateralmasssix(), "696.5000");
		sendKeys(o.getWheelrailrightlateralmassseven(), "695.0000");
		sendKeys(o.getWheelrailrightlateralmasseight(), "693.5000");
		sendKeys(o.getWheelrailrightlateralmassnine(), "692.0000");
		sendKeys(o.getWheelrailrightlateralmassten(), "690.0000");
		sendKeys(o.getWheelrailrightlaterallabone(), "688.0000");
		sendKeys(o.getWheelrailrightlaterallabtwo(), "686.0000");
		sendKeys(o.getWheelrailrightlaterallabthree(), "684.0000");
		sendKeys(o.getWheelrailrightlaterallabfour(), "682.0000");
		sendKeys(o.getWheelrailrightlaterallabfive(), "680.5000");
		sendKeys(o.getWheelrailrightlaterallabsix(), "680.0000");
		sendKeys(o.getWheelrailrightlaterallabseven(), "680.0000");
		sendKeys(o.getWheelrailrightlaterallabeight(), "680.0000");
		sendKeys(o.getWheelrailrightlaterallabnine(), "680.0000");

		// RV
		sendKeys(o.getWheelrailrightverticalone(), "-18.0000");
		sendKeys(o.getWheelrailrightverticaltwo(), "-7.6350");
		sendKeys(o.getWheelrailrightverticalthree(), "-2.6350");
		sendKeys(o.getWheelrailrightverticalfour(), "-1.9360");
		sendKeys(o.getWheelrailrightverticalfive(), "-1.7690");
		sendKeys(o.getWheelrailrightverticalsix(), "-1.6020");
		sendKeys(o.getWheelrailrightverticalseven(), "-1.4360");
		sendKeys(o.getWheelrailrightverticaleight(), "-1.2690");
		sendKeys(o.getWheelrailrightverticalnine(), "-1.1020");
		sendKeys(o.getWheelrailrightverticalten(), "-0.9360");
		sendKeys(o.getWheelrailrightverticalcountone(), "-0.7690");
		sendKeys(o.getWheelrailrightverticalcounttwo(), "-0.6190");
		sendKeys(o.getWheelrailrightverticalcountthree(), "-0.4790");
		sendKeys(o.getWheelrailrightverticalcountfour(), "-0.4100");
		sendKeys(o.getWheelrailrightverticalcountfive(), "-0.3480");
		sendKeys(o.getWheelrailrightverticalcountsix(), "-0.3040");
		sendKeys(o.getWheelrailrightverticalcountseven(), "-0.2740");
		sendKeys(o.getWheelrailrightverticalcounteight(), "-0.2510");
		sendKeys(o.getWheelrailrightverticalcountnine(), "-0.2290");
		sendKeys(o.getWheelrailrightverticalcountten(), "-0.2030");
		sendKeys(o.getWheelrailrightverticalnumberone(), "-0.1680");
		sendKeys(o.getWheelrailrightverticalnumbertwo(), "-0.1220");
		sendKeys(o.getWheelrailrightverticalnumberthree(), "-0.0610");
		sendKeys(o.getWheelrailrightverticalnumberfour(), "0.0170");
		sendKeys(o.getWheelrailrightverticalnumberfive(), "0.1160");
		sendKeys(o.getWheelrailrightverticalnumbersix(), "0.2370");
		sendKeys(o.getWheelrailrightverticalnumberseven(), "0.3840");
		sendKeys(o.getWheelrailrightverticalnumbereight(), "0.5610");
		sendKeys(o.getWheelrailrightverticalnumbernine(), "0.7710");
		sendKeys(o.getWheelrailrightverticalnumberten(), "1.0210");
		sendKeys(o.getWheelrailrightverticalunitone(), "1.3180");
		sendKeys(o.getWheelrailrightverticalunittwo(), "1.6730");
		sendKeys(o.getWheelrailrightverticalunitthree(), "2.1010");
		sendKeys(o.getWheelrailrightverticalunitfour(), "2.6230");
		sendKeys(o.getWheelrailrightverticalunitfive(), "3.2700");
		sendKeys(o.getWheelrailrightverticalunitsix(), "4.1140");
		sendKeys(o.getWheelrailrightverticalunitseven(), "5.3570");
		sendKeys(o.getWheelrailrightverticaluniteight(), "7.3520");
		sendKeys(o.getWheelrailrightverticalunitnine(), "10.9680");
		sendKeys(o.getWheelrailrightverticalunitten(), "17.4310");
		sendKeys(o.getWheelrailrightverticalmassone(), "21.4020");
		sendKeys(o.getWheelrailrightverticalmasstwo(), "23.9840");
		sendKeys(o.getWheelrailrightverticalmassthree(), "25.8210");
		sendKeys(o.getWheelrailrightverticalmassfour(), "26.9090");
		sendKeys(o.getWheelrailrightverticalmassfive(), "27.6190");
		sendKeys(o.getWheelrailrightverticalmasssix(), "27.9060");
		sendKeys(o.getWheelrailrightverticalmassseven(), "28.0000");
		sendKeys(o.getWheelrailrightverticalmasseight(), "27.9060");
		sendKeys(o.getWheelrailrightverticalmassnine(), "27.6190");
		sendKeys(o.getWheelrailrightverticalmassten(), "26.9090");
		sendKeys(o.getWheelrailrightverticallabone(), "25.7470");
		sendKeys(o.getWheelrailrightverticallabtwo(), "24.0110");
		sendKeys(o.getWheelrailrightverticallabthree(), "21.6850");
		sendKeys(o.getWheelrailrightverticallabfour(), "18.3510");
		sendKeys(o.getWheelrailrightverticallabfive(), "14.0190");
		sendKeys(o.getWheelrailrightverticallabsix(), "9.5190");
		sendKeys(o.getWheelrailrightverticallabseven(), "0.0000");
		sendKeys(o.getWheelrailrightverticallabeight(), "-18.0000");
		sendKeys(o.getWheelrailrightverticallabnine(), "-18.1000");

	}

	@When("User have to enter profile name and click the save button")
	public void user_have_to_enter_profile_name_and_click_the_save_button() throws InterruptedException {
		sendKeys(o.getWheelrailprofilename(), "Y25bogies wheel profile");
		wait5seconds();
		o.getWheelrailflangbackbox().clear();
		sendKeys(o.getWheelrailflangbackbox(), "0");
		elementClick(o.getWheelrailprofilesave());
		wait1Seconds();

	}

	
	
	// Create the rail profile for manual option

	@When("User have to click the rail profile option")
	public void user_have_to_click_the_rail_profile_option() throws InterruptedException {
		wait1Seconds();
		o = new OleoPojo();
		elementClick(o.getRailprofilebutton());
	}

	@When("User have to click the manual and enter the rail data")
	public void user_have_to_click_the_manual_and_enter_the_rail_data() throws IOException {
		o = new OleoPojo();
		int n = 51;
		for (int i = 0; i <= n; i++) {
			elementClick(o.getRailprofileplusbutton());
		}

		// LL

		sendKeys(o.getRailprofileleftlateralone(), "-789.4368");
		sendKeys(o.getRailprofileleftlateraltwo(), "-789.0054");
		sendKeys(o.getRailprofileleftlateralthree(), "-787.8876");
		sendKeys(o.getRailprofileleftlateralfour(), "-786.1383");
		sendKeys(o.getRailprofileleftlateralfive(), "-785.0517");
		sendKeys(o.getRailprofileleftlateralsix(), "-783.8362");
		sendKeys(o.getRailprofileleftlateralseven(), "-782.501");
		sendKeys(o.getRailprofileleftlateraleight(), "-781.0546");
		sendKeys(o.getRailprofileleftlateralnine(), "-779.5053");
		sendKeys(o.getRailprofileleftlateralten(), "-777.8936");
		sendKeys(o.getRailprofileleftlateralnumberone(), "-776.3119");
		sendKeys(o.getRailprofileleftlateralnumbertwo(), "-774.7644");
		sendKeys(o.getRailprofileleftlateralnumberthree(), "-771.767");
		sendKeys(o.getRailprofileleftlateralnumberfour(), "-768.892");
		sendKeys(o.getRailprofileleftlateralnumberfive(), "-766.1288");
		sendKeys(o.getRailprofileleftlateralnumbersix(), "-763.4667");
		sendKeys(o.getRailprofileleftlateralnumberseven(), "-760.903");
		sendKeys(o.getRailprofileleftlateralnumbereight(), "-758.425");
		sendKeys(o.getRailprofileleftlateralnumbernine(), "-756.0094");
		sendKeys(o.getRailprofileleftlateralnumberten(), "-753.6354");
		sendKeys(o.getRailprofileleftlateralcountone(), "-751.2829");
		sendKeys(o.getRailprofileleftlateralcounttwo(), "-748.9327");
		sendKeys(o.getRailprofileleftlateralcountthree(), "-746.5658");
		sendKeys(o.getRailprofileleftlateralcountfour(), "-744.1625");
		sendKeys(o.getRailprofileleftlateralcountfive(), "-741.703");
		sendKeys(o.getRailprofileleftlateralcountsix(), "-739.1817");
		sendKeys(o.getRailprofileleftlateralcountseven(), "-736.5921");
		sendKeys(o.getRailprofileleftlateralcounteight(), "-733.925");
		sendKeys(o.getRailprofileleftlateralcountnine(), "-731.1711");
		sendKeys(o.getRailprofileleftlateralcountten(), "-728.3216");
		sendKeys(o.getRailprofileleftlateralserialone(), "-726.8598");
		sendKeys(o.getRailprofileleftlateralserialtwo(), "-725.4405");
		sendKeys(o.getRailprofileleftlateralserialthree(), "-724.1074");
		sendKeys(o.getRailprofileleftlateralserialfour(), "-722.869");
		sendKeys(o.getRailprofileleftlateralserialfive(), "-721.7338");
		sendKeys(o.getRailprofileleftlateralserialsix(), "-720.7103");
		sendKeys(o.getRailprofileleftlateralserialseven(), "-719.8072");
		sendKeys(o.getRailprofileleftlateralserialeight(), "-719.0328");
		sendKeys(o.getRailprofileleftlateralserialnine(), "-718.3959");
		sendKeys(o.getRailprofileleftlateralserialten(), "-717.9053");
		sendKeys(o.getRailprofileleftlateralthredone(), "-717.5704");
		sendKeys(o.getRailprofileleftlateralthredtwo(), "-717.4016");
		sendKeys(o.getRailprofileleftlateralthredthree(), "-717.3582");
		sendKeys(o.getRailprofileleftlateralthredfour(), "-717.3214");
		sendKeys(o.getRailprofileleftlateralthredfive(), "-717.2857");
		sendKeys(o.getRailprofileleftlateralthredsix(), "-717.217");
		sendKeys(o.getRailprofileleftlateralthredseven(), "-717.1511");
		sendKeys(o.getRailprofileleftlateralthredeight(), "-717.0874");
		sendKeys(o.getRailprofileleftlateralthrednine(), "-717.0251");
		sendKeys(o.getRailprofileleftlateralthredten(), "-716.9636");
		sendKeys(o.getRailprofileleftlateralserialnumberone(), "-716.9023");
		sendKeys(o.getRailprofileleftlateralserialnumbertwo(), "-716.8405");
		sendKeys(o.getRailprofileleftlateralserialnumberthree(), "-716.7777");

		// LR
		sendKeys(o.getRailprofileleftverticalone(), "19.3679");
		sendKeys(o.getRailprofileleftverticaltwo(), "22.5411");
		sendKeys(o.getRailprofileleftverticalthree(), "25.4463");
		sendKeys(o.getRailprofileleftverticalfour(), "27.9719");
		sendKeys(o.getRailprofileleftverticalfive(), "29.0628");
		sendKeys(o.getRailprofileleftverticalsix(), "30.0227");
		sendKeys(o.getRailprofileleftverticalseven(), "30.8389");
		sendKeys(o.getRailprofileleftverticaleight(), "31.4975");
		sendKeys(o.getRailprofileleftverticalnine(), "31.9829");
		sendKeys(o.getRailprofileleftverticalten(), "32.3184");
		sendKeys(o.getRailprofileleftverticalnumberone(), "32.6075");
		sendKeys(o.getRailprofileleftverticalnumbertwo(), "32.8588");
		sendKeys(o.getRailprofileleftverticalnumberthree(), "33.2574");
		sendKeys(o.getRailprofileleftverticalnumberfour(), "33.5322");
		sendKeys(o.getRailprofileleftverticalnumberfive(), "33.698");
		sendKeys(o.getRailprofileleftverticalnumbersix(), "33.7672");
		sendKeys(o.getRailprofileleftverticalnumberseven(), "33.7814");
		sendKeys(o.getRailprofileleftverticalnumbereight(), "33.7743");
		sendKeys(o.getRailprofileleftverticalnumbernine(), "33.7478");
		sendKeys(o.getRailprofileleftverticalnumberten(), "33.7027");
		sendKeys(o.getRailprofileleftverticalcountone(), "33.6395");
		sendKeys(o.getRailprofileleftverticalcounttwo(), "33.5578");
		sendKeys(o.getRailprofileleftverticalcountthree(), "33.457");
		sendKeys(o.getRailprofileleftverticalcountfour(), "33.3355");
		sendKeys(o.getRailprofileleftverticalcountfive(), "33.1879");
		sendKeys(o.getRailprofileleftverticalcountsix(), "32.9701");
		sendKeys(o.getRailprofileleftverticalcountseven(), "32.6625");
		sendKeys(o.getRailprofileleftverticalcounteight(), "32.2555");
		sendKeys(o.getRailprofileleftverticalcountnine(), "31.7378");
		sendKeys(o.getRailprofileleftverticalcountten(), "31.0959");
		sendKeys(o.getRailprofileleftverticalserialone(), "30.7218");
		sendKeys(o.getRailprofileleftverticalserialtwo(), "30.2321");
		sendKeys(o.getRailprofileleftverticalserialthree(), "29.5933");
		sendKeys(o.getRailprofileleftverticalserialfour(), "28.8169");
		sendKeys(o.getRailprofileleftverticalserialfive(), "27.9136");
		sendKeys(o.getRailprofileleftverticalserialsix(), "26.8941");
		sendKeys(o.getRailprofileleftverticalserialseven(), "25.7684");
		sendKeys(o.getRailprofileleftverticalserialeight(), "24.5468");
		sendKeys(o.getRailprofileleftverticalserialnine(), "23.2394");
		sendKeys(o.getRailprofileleftverticalserialten(), "21.8566");
		sendKeys(o.getRailprofileleftverticalthredone(), "20.4086");
		sendKeys(o.getRailprofileleftverticalthredtwo(), "18.9059");
		sendKeys(o.getRailprofileleftverticalthredthree(), "17.3849");
		sendKeys(o.getRailprofileleftverticalthredfour(), "15.9101");
		sendKeys(o.getRailprofileleftverticalthredfive(), "14.4787");
		sendKeys(o.getRailprofileleftverticalthredsix(), "11.7256");
		sendKeys(o.getRailprofileleftverticalthredseven(), "9.0887");
		sendKeys(o.getRailprofileleftverticalthredeight(), "6.5365");
		sendKeys(o.getRailprofileleftverticalthrednine(), "4.041");
		sendKeys(o.getRailprofileleftverticalthredten(), "1.5768");
		sendKeys(o.getRailprofileleftverticalserialnumberone(), "-0.8807");
		sendKeys(o.getRailprofileleftverticalserialnumbertwo(), "-3.3553");
		sendKeys(o.getRailprofileleftverticalserialnumberthree(), "-5.872");

		// RL

		sendKeys(o.getRailprofilerightlateralone(), "789.4368");
		sendKeys(o.getRailprofilerightlateraltwo(), "789.0054");
		sendKeys(o.getRailprofilerightlateralthree(), "787.8876");
		sendKeys(o.getRailprofilerightlateralfour(), "786.1383");
		sendKeys(o.getRailprofilerightlateralfive(), "785.0517");
		sendKeys(o.getRailprofilerightlateralsix(), "783.8362");
		sendKeys(o.getRailprofilerightlateralseven(), "782.501");
		sendKeys(o.getRailprofilerightlateraleight(), "781.0546");
		sendKeys(o.getRailprofilerightlateralnine(), "779.5053");
		sendKeys(o.getRailprofilerightlateralten(), "777.8936");
		sendKeys(o.getRailprofilerightlateralnumberone(), "776.3119");
		sendKeys(o.getRailprofilerightlateralnumbertwo(), "774.7644");
		sendKeys(o.getRailprofilerightlateralnumberthree(), "771.767");
		sendKeys(o.getRailprofilerightlateralnumberfour(), "768.892");
		sendKeys(o.getRailprofilerightlateralnumberfive(), "766.1288");
		sendKeys(o.getRailprofilerightlateralnumbersix(), "763.4667");
		sendKeys(o.getRailprofilerightlateralnumberseven(), "760.903");
		sendKeys(o.getRailprofilerightlateralnumbereight(), "758.425");
		sendKeys(o.getRailprofilerightlateralnumbernine(), "756.0094");
		sendKeys(o.getRailprofilerightlateralnumberten(), "753.6354");
		sendKeys(o.getRailprofilerightlateralcountone(), "751.2829");
		sendKeys(o.getRailprofilerightlateralcounttwo(), "748.9327");
		sendKeys(o.getRailprofilerightlateralcountthree(), "746.5658");
		sendKeys(o.getRailprofilerightlateralcountfour(), "744.1625");
		sendKeys(o.getRailprofilerightlateralcountfive(), "741.703");
		sendKeys(o.getRailprofilerightlateralcountsix(), "739.1817");
		sendKeys(o.getRailprofilerightlateralcountseven(), "736.5921");
		sendKeys(o.getRailprofilerightlateralcounteight(), "733.925");
		sendKeys(o.getRailprofilerightlateralcountnine(), "731.1711");
		sendKeys(o.getRailprofilerightlateralcountten(), "728.3216");
		sendKeys(o.getRailprofilerightlateralserialone(), "726.8598");
		sendKeys(o.getRailprofilerightlateralserialtwo(), "725.4405");
		sendKeys(o.getRailprofilerightlateralserialthree(), "724.1074");
		sendKeys(o.getRailprofilerightlateralserialfour(), "722.869");
		sendKeys(o.getRailprofilerightlateralserialfive(), "721.7338");
		sendKeys(o.getRailprofilerightlateralserialsix(), "720.7103");
		sendKeys(o.getRailprofilerightlateralserialseven(), "719.8072");
		sendKeys(o.getRailprofilerightlateralserialeight(), "719.0328");
		sendKeys(o.getRailprofilerightlateralserialnine(), "718.3959");
		sendKeys(o.getRailprofilerightlateralserialten(), "717.9053");
		sendKeys(o.getRailprofilerightlateralthredone(), "717.5704");
		sendKeys(o.getRailprofilerightlateralthredtwo(), "717.4016");
		sendKeys(o.getRailprofilerightlateralthredthree(), "717.3582");
		sendKeys(o.getRailprofilerightlateralthredfour(), "717.3214");
		sendKeys(o.getRailprofilerightlateralthredfive(), "717.2857");
		sendKeys(o.getRailprofilerightlateralthredsix(), "717.217");
		sendKeys(o.getRailprofilerightlateralthredseven(), "717.1511");
		sendKeys(o.getRailprofilerightlateralthredeight(), "717.0874");
		sendKeys(o.getRailprofilerightlateralthrednine(), "717.0251");
		sendKeys(o.getRailprofilerightlateralthredten(), "716.9636");
		sendKeys(o.getRailprofilerightlateralserialnumberone(), "716.9023");
		sendKeys(o.getRailprofilerightlateralserialnumbertwo(), "716.8405");
		sendKeys(o.getRailprofilerightlateralserialnumberthree(), "716.7777");

		// RV
		sendKeys(o.getRailprofilerightverticalone(), "19.3679");
		sendKeys(o.getRailprofilerightverticaltwo(), "22.5411");
		sendKeys(o.getRailprofilerightverticalthree(), "25.4463");
		sendKeys(o.getRailprofilerightverticalfour(), "27.9719");
		sendKeys(o.getRailprofilerightverticalfive(), "29.0628");
		sendKeys(o.getRailprofilerightverticalsix(), "30.0227");
		sendKeys(o.getRailprofilerightverticalseven(), "30.8389");
		sendKeys(o.getRailprofilerightverticaleight(), "31.4975");
		sendKeys(o.getRailprofilerightverticalnine(), "31.9829");
		sendKeys(o.getRailprofilerightverticalten(), "32.3184");
		sendKeys(o.getRailprofilerightverticalnumberone(), "32.6075");
		sendKeys(o.getRailprofilerightverticalnumbertwo(), "32.8588");
		sendKeys(o.getRailprofilerightverticalnumberthree(), "33.2574");
		sendKeys(o.getRailprofilerightverticalnumberfour(), "33.5322");
		sendKeys(o.getRailprofilerightverticalnumberfive(), "33.698");
		sendKeys(o.getRailprofilerightverticalnumbersix(), "33.7672");
		sendKeys(o.getRailprofilerightverticalnumberseven(), "33.7814");
		sendKeys(o.getRailprofilerightverticalnumbereight(), "33.7743");
		sendKeys(o.getRailprofilerightverticalnumbernine(), "33.7478");
		sendKeys(o.getRailprofilerightverticalnumberten(), "33.7027");
		sendKeys(o.getRailprofilerightverticalcountone(), "33.6395");
		sendKeys(o.getRailprofilerightverticalcounttwo(), "33.5578");
		sendKeys(o.getRailprofilerightverticalcountthree(), "33.457");
		sendKeys(o.getRailprofilerightverticalcountfour(), "33.3355");
		sendKeys(o.getRailprofilerightverticalcountfive(), "33.1879");
		sendKeys(o.getRailprofilerightverticalcountsix(), "32.9701");
		sendKeys(o.getRailprofilerightverticalcountseven(), "32.6625");
		sendKeys(o.getRailprofilerightverticalcounteight(), "32.2555");
		sendKeys(o.getRailprofilerightverticalcountnine(), "31.7378");
		sendKeys(o.getRailprofilerightverticalcountten(), "31.0959");
		sendKeys(o.getRailprofilerightverticalserialone(), "30.7218");
		sendKeys(o.getRailprofilerightverticalserialtwo(), "30.2321");
		sendKeys(o.getRailprofilerightverticalserialthree(), "29.5933");
		sendKeys(o.getRailprofilerightverticalserialfour(), "28.8169");
		sendKeys(o.getRailprofilerightverticalserialfive(), "27.9136");
		sendKeys(o.getRailprofilerightverticalserialsix(), "26.8941");
		sendKeys(o.getRailprofilerightverticalserialseven(), "25.7684");
		sendKeys(o.getRailprofilerightverticalserialeight(), "24.5468");
		sendKeys(o.getRailprofilerightverticalserialnine(), "23.2394");
		sendKeys(o.getRailprofilerightverticalserialten(), "21.8566");
		sendKeys(o.getRailprofilerightverticalthredone(), "20.4086");
		sendKeys(o.getRailprofilerightverticalthredtwo(), "18.9059");
		sendKeys(o.getRailprofilerightverticalthredthree(), "17.3849");
		sendKeys(o.getRailprofilerightverticalthredfour(), "15.9101");
		sendKeys(o.getRailprofilerightverticalthredfive(), "14.4787");
		sendKeys(o.getRailprofilerightverticalthredsix(), "11.7256");
		sendKeys(o.getRailprofilerightverticalthredseven(), "9.0887");
		sendKeys(o.getRailprofilerightverticalthredeight(), "6.5365");
		sendKeys(o.getRailprofilerightverticalthrednine(), "4.041");
		sendKeys(o.getRailprofilerightverticalthredten(), "1.5768");
		sendKeys(o.getRailprofilerightverticalserialnumberone(), "-0.8807");
		sendKeys(o.getRailprofilerightverticalserialnumbertwo(), "-3.3553");
		sendKeys(o.getRailprofilerightverticalserialnumberthree(), "-5.872");

	}

	@When("User have to enter profile name and click the rail save button")
	public void user_have_to_enter_profile_name_and_click_the_rail_save_button() throws InterruptedException {
		wait1Seconds();
		sendKeys(o.getRailprofilenamebox(), "Rail Profile");
		wait1Seconds();
		sendKeys(o.getRailprofilegaugebox(), "4");
		wait1Seconds();
		elementClick(o.getRailprofilesavebutton());
		wait5seconds();
	}

	// Check the functionality of contact gauge option

	@Given("User have to enter the contact name and whell data")
	public void user_have_to_enter_the_contact_name_and_whell_data() throws InterruptedException {
		o = new OleoPojo();
		wait1Seconds();
		sendKeys(o.getContactnamebox(), "Whell&rail profile contact");
		elementClick(o.getWheelprofileselectbox());
		elementClick(o.getSelecty25bogieswheelprofile());
		elementClick(o.getSelecteuropean70mm());

	}

	@When("User have to enter the rail data")
	public void user_have_to_enter_the_rail_data() throws InterruptedException {
		elementClick(o.getRaildatabutton());
		wait1Seconds();
		elementClick(o.getRailprofileselectbox());
		elementClick(o.getSelectrailprofile());
		elementClick(o.getSelecteuropean14mm());

	}

	@When("User have to click the setting and select the uk option")
	public void user_have_to_click_the_setting_and_select_the_uk_option() throws InterruptedException {
		elementClick(o.getSettingsbutton());
		wait1Seconds();
		elementClick(o.getSelectukoptionsetting());

	}

	@When("User have to click calculate button")
	public void user_have_to_click_calculate_button() throws InterruptedException {
		elementClick(o.getCalculatebutton());
		wait5seconds();
		try {
			elementClick(o.getCalculatecancelbutton());
			wait1Seconds();
			elementClick(o.getCalculatesecondcancelbutton());
			wait1Seconds();
			System.out.println("After click the contact profile save button it not show the review button");
			
		} catch (Exception e) {
			elementClick(o.getContactprofilereviewbutton());
			wait5seconds();
			elementClick(o.getCalculatebutton());
			Thread.sleep(3000);
			elementClick(o.getCalculateconformbutton());
			Thread.sleep(6000);
            elementClick(o.getCalculatesecondcancelbutton());
			Thread.sleep(6000);
			mouseOverAction(o.getNewcontactprofile());
			wait1Seconds();
			elementClick(o.getNewcontactprofilefirstaction());
			wait1Seconds();
			elementClick(o.getNewcontactprofileeditbuttonfirst());
			wait1Seconds();
			elementClick(o.getCalculatebutton());
			Thread.sleep(3000);
			elementClick(o.getCalculateconformbutton());
			Thread.sleep(5000);
			elementClick(o.getCalculatesecondcancelbutton());
			closeTab();
		}
		

	}
	
	

	// Check the functionality of New Digital trains Web page

	@Given("User have to click the digitaltrains link")
	public void user_have_to_click_the_digitaltrains_link() throws InterruptedException {
		implicitWait();
		wait1Seconds();
		elementClick(o.getNewdigitaltraindwebsitebutton());
		Thread.sleep(8000);
		switchWindow();
	}

	@When("User have to click the digitaltrain about button")
	public void user_have_to_click_the_digitaltrain_about_button() throws InterruptedException {
		elementClick(o.getDigitaltrainabout());
		wait1Seconds();
	}

	@When("User have to enter on about URL and scroll down")
	public void user_have_to_enter_on_about_URL_and_scroll_down() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/#about");
		System.out.println("User enter the about url");

	}

	@Given("User have to select the simulation dropdown and select the digital train impact")
	public void user_have_to_select_the_simulation_dropdown_and_select_the_digital_train_impact()
			throws InterruptedException {
		elementClick(o.getDigitaltrainsimulator());
		wait1Seconds();
		elementClick(o.getDigitaltrainimapct());
		wait1Seconds();
	}

	@When("User have to enter the impact test url")
	public void user_have_to_enter_the_impact_test_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/digitaltrains-impact/");
		System.out.println("User enter the impact train url");

	}

	@Given("User have to select the simulation dropdown and select the digital train trainrunning")
	public void user_have_to_select_the_simulation_dropdown_and_select_the_digital_train_trainrunning()
			throws InterruptedException {
		elementClick(o.getDigitaltrainsimulator());
		wait1Seconds();
		elementClick(o.getDigitaltraintrainrunning());
		wait1Seconds();

	}

	@When("User have to enter the train running url")
	public void user_have_to_enter_the_train_running_url() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/digitaltrains-train-running/");
		System.out.println("User enter the train running url");
	}

	@Given("User have to select the simulation dropdown and select the digital train gauging")
	public void user_have_to_select_the_simulation_dropdown_and_select_the_digital_train_gauging()
			throws InterruptedException {
		elementClick(o.getDigitaltrainsimulator());
		wait1Seconds();
		elementClick(o.getDigitaltraingauging());
		wait1Seconds();
	}

	@When("User have to enter the train gauging url")
	public void user_have_to_enter_the_train_gauging_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/digitaltrains-gauging/");
		System.out.println("User enter the train gauging url");
	}

	@Given("User have to select the tool dropdown and select the route profile")
	public void user_have_to_select_the_tool_dropdown_and_select_the_route_profile() throws InterruptedException {
		elementClick(o.getDigitaltraintools());
		wait1Seconds();
		elementClick(o.getDigitaltrainrouteptofiles());
		wait1Seconds();
	}

	@When("User have to enter the new route profile url")
	public void user_have_to_enter_the_new_route_profile_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/route-profiles/");
		System.out.println("User enter the route profile url");
	}

	@Given("User have to select the tool dropdown and select the trains")
	public void user_have_to_select_the_tool_dropdown_and_select_the_trains() throws InterruptedException {
		elementClick(o.getDigitaltraintools());
		wait1Seconds();
		elementClick(o.getDigitaltraintrains());
		wait1Seconds();
	}

	@When("User have to enter the train url")
	public void user_have_to_enter_the_train_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/trains/");
		System.out.println("User enter the train url");
	}

	@Given("User have to select the tool dropdown and select the vehicle")
	public void user_have_to_select_the_tool_dropdown_and_select_the_vehicle() throws InterruptedException {
		elementClick(o.getDigitaltraintools());
		wait1Seconds();
		elementClick(o.getDigitaltrainvehicles());
	}

	@When("User have to enter the vehicle url")
	public void user_have_to_enter_the_vehicle_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/vehicles/");
		System.out.println("User enter the vehicle url");
	}

	@Given("User have to select the tool dropdown and select the wheels rails")
	public void user_have_to_select_the_tool_dropdown_and_select_the_wheels_rails() throws InterruptedException {
		elementClick(o.getDigitaltraintools());
		wait1Seconds();
		elementClick(o.getDigitaltrainwheelsrails());
	}

	@When("User have to enter the wheels rails url")
	public void user_have_to_enter_the_wheels_rails_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/wheels-rails/");
		System.out.println("User enter the wheel rails url");
	}

	@Given("User have to select the tool dropdown and select the bogies")
	public void user_have_to_select_the_tool_dropdown_and_select_the_bogies() throws InterruptedException {
		elementClick(o.getDigitaltraintools());
		wait1Seconds();
		elementClick(o.getDigitaltrainbogies());
	}

	@When("User have to enter the bogies url")
	public void user_have_to_enter_the_bogies_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/bogies/");
		System.out.println("User enter the bogies url");
	}

	@Given("User have to select the tool dropdown and select the buffer stops")
	public void user_have_to_select_the_tool_dropdown_and_select_the_buffer_stops() throws InterruptedException {
		elementClick(o.getDigitaltraintools());
		wait1Seconds();
		elementClick(o.getDigitaltrainbufferstops());
	}

	@When("User have to enter the buffer stops url")
	public void user_have_to_enter_the_buffer_stops_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/buffer-stops/");
		System.out.println("User enter the bufferstop url");
	}

	@Given("User have to select the tool dropdown and select the devices")
	public void user_have_to_select_the_tool_dropdown_and_select_the_devices() throws InterruptedException {
		elementClick(o.getDigitaltraintools());
		wait1Seconds();
		elementClick(o.getDigitaltraindevices());
	}

	@When("User have to enter the devices url")
	public void user_have_to_enter_the_devices_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/devices/");
		System.out.println("User enter the device url");
	}

	@Given("User have to select the tool dropdown and select the coupling interfaces")
	public void user_have_to_select_the_tool_dropdown_and_select_the_coupling_interfaces() throws InterruptedException {
		elementClick(o.getDigitaltraintools());
		wait1Seconds();
		elementClick(o.getDigitaltraincouplinginterfaces());
	}

	@When("User have to enter the coupling interfaces url")
	public void user_have_to_enter_the_coupling_interfaces_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/coupling-interfaces/");
		System.out.println("User enter the copling interface url");
	}

	@Given("User have to select the tool dropdown and select the train optimiser")
	public void user_have_to_select_the_tool_dropdown_and_select_the_train_optimiser() throws InterruptedException {
		elementClick(o.getDigitaltraintools());
		wait1Seconds();
		elementClick(o.getDigitaltraintrainoptimiser());
	}

	@When("User have to enter the train optimiser url")
	public void user_have_to_enter_the_train_optimiser_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/optimise/");
		System.out.println("User enter the train optimiser url");
	}

	@Given("User have to select the tool dropdown and select the comparison tool")
	public void user_have_to_select_the_tool_dropdown_and_select_the_comparison_tool() throws InterruptedException {
		elementClick(o.getDigitaltraintools());
		wait1Seconds();
		elementClick(o.getDigitaltraincomparisontool());
	}

	@When("User have to enter the comparison url")
	public void user_have_to_enter_the_comparison_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/comparison-tools/");
		System.out.println("User enter the comparison tool url");
	}

	@Given("User have to select the tool dropdown and select the analysis tool")
	public void user_have_to_select_the_tool_dropdown_and_select_the_analysis_tool() throws InterruptedException {
		elementClick(o.getDigitaltraintools());
		wait1Seconds();
		elementClick(o.getDigitaltrainanalysistools());
	}

	@When("User have to enter the analysis tool url")
	public void user_have_to_enter_the_analysis_tool_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://www.digitaltrains.online/interactive-graphical-analysis-3d-visualisation-reports/");
		System.out.println("User enter the analysis tool url");
	}

	@Given("User have to select the tool dropdown and select the degital twins")
	public void user_have_to_select_the_tool_dropdown_and_select_the_degital_twins() throws InterruptedException {
		elementClick(o.getDigitaltraintools());
		wait1Seconds();
		elementClick(o.getDigitaltraindigitaltwins());
	}

	@When("User have to enter the degital twins url")
	public void user_have_to_enter_the_degital_twins_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/digital-twins/");
		System.out.println("User enter the digital twin url");
	}

	@When("User have to enter the contact url")
	public void user_have_to_enter_the_contact_url() throws InterruptedException {
		elementClick(o.getDigitaltraincontact());
	}

	@Given("User have to click the free demo licence button")
	public void user_have_to_click_the_free_demo_licence_button() throws InterruptedException {
		elementClick(o.getDigitaltrainfreedemolicence());
		wait1Seconds();
	}

	@Given("User have to click the sigup and login button")
	public void user_have_to_click_the_sigup_and_login_button() throws InterruptedException {
		wait5seconds();
		elementClick(o.getDigitaltrainsignupandlogin());
		
	}

	@When("User have to enter the login page url")
	public void user_have_to_enter_the_login_page_url() throws InterruptedException {
		wait5seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://simulate.digitaltrains.online/account/login");
		System.out.println("User enter the digital train login url");
	}

	@Given("User have to click the second free demo licence button")
	public void user_have_to_click_the_second_free_demo_licence_button() throws InterruptedException {

		wait1Seconds();
		elementClick(o.getDigitaltrainfreedemolicencetwo());
		wait1Seconds();
	}

	@Given("User have to click the findout more button")
	public void user_have_to_click_the_findout_more_button() throws InterruptedException {
		wait1Seconds();
		jsClick(o.getDigitaltrainvampirefindoutmorebutton());
		wait1Seconds();
	}

	@When("User have to enter the findout more url and handle the alert")
	public void user_have_to_enter_the_findout_more_url_and_handle_the_alert() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/vampire-pro/");
		wait1Seconds();

	}

	@Given("User have to click the feature collaborating option")
	public void user_have_to_click_the_feature_collaborating_option() throws InterruptedException {
		o = new OleoPojo();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",o.getDigitaltrainfeatures());
		wait1Seconds();
		elementClick(o.getDigitaltraincollaborating());
	}

	@Given("User have to click the feature modelling and visualisation option")
	public void user_have_to_click_the_feature_modelling_and_visualisation_option() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getDigitaltrainmodellingandvisualisation());
	}

	@Given("User have to click the modelling under route profile option")
	public void user_have_to_click_the_modelling_under_route_profile_option() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getDigitaltrainmodellingrouteprofiles());
	}

	@Given("user have to enter the routeprofile url")
	public void user_have_to_enter_the_routeprofile_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/route-profiles/");
		System.out.println("User enter the route profile url");
	}

	@Given("User have to click the modelling under vehicle option")
	public void user_have_to_click_the_modelling_under_vehicle_option() throws InterruptedException {
		elementClick(o.getDigitaltrainmodellingvehicles());
	}

	@Given("User have to click the modelling under interface option")
	public void user_have_to_click_the_modelling_under_interface_option() throws InterruptedException {
		elementClick(o.getDigitaltrainmodellinginterfaces());
	}

	@Given("User have to enter the interface url")
	public void user_have_to_enter_the_interface_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/coupling-interfaces/");
		System.out.println("User enter the interface url");
	}

	@Given("User have to click the modulling under bufferstops option")
	public void user_have_to_click_the_modulling_under_bufferstops_option() throws InterruptedException {
		elementClick(o.getDigitaltrainmodellingbufferstops());
	}

	@Given("User have to enter the bufferstop url")
	public void user_have_to_enter_the_bufferstop_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/buffer-stops/");
		System.out.println("User enter the bufferstop url");
	}

	@Given("User have to click the data bases and libraries option")
	public void user_have_to_click_the_data_bases_and_libraries_option() throws InterruptedException {
		elementClick(o.getDigitaltraindatabasesandlibraries());
	}

	@Given("User have to click the data bogie components")
	public void user_have_to_click_the_data_bogie_components() throws InterruptedException {
		elementClick(o.getDigitaltraindatabogiecomponents());
	}

	@Given("user have to enter the bogies compaonents url")
	public void user_have_to_enter_the_bogies_compaonents_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/bogies/");
		System.out.println("User enter the bogies compaonents");
	}

	@Given("User have to click the data bogie assemblies")
	public void user_have_to_click_the_data_bogie_assemblies() throws InterruptedException {
		elementClick(o.getDigitaltraindatabogieassemblies());
	}

	@Given("User have to enter the bogie assemblies url")
	public void user_have_to_enter_the_bogie_assemblies_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/bogies/");
		System.out.println("User enter the bogies assamblies url");
	}

	@When("User have to click the data vehicle")
	public void user_have_to_click_the_data_vehicle() throws InterruptedException {
		elementClick(o.getDigitaltraindatavehicles());
	}

	@When("User have to click the data coupling components")
	public void user_have_to_click_the_data_coupling_components() throws InterruptedException {
		elementClick(o.getDigitaltraindatacouplingcomponents());
	}

	@When("User have to enter the coupling components url")
	public void user_have_to_enter_the_coupling_components_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/coupling-interfaces/");
		System.out.println("User enter the coupling interface url");
	}

	@When("User have to click the data coupling interface")
	public void user_have_to_click_the_data_coupling_interface() throws InterruptedException {
		elementClick(o.getDigitaltraindatacouplinginterface());
	}

	@When("User have to enter the coupling interface url")
	public void user_have_to_enter_the_coupling_interface_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/coupling-interfaces/");
		System.out.println("User enter the coupling interface url");
	}

	@When("User have to click the data trains")
	public void user_have_to_click_the_data_trains() throws InterruptedException {
		elementClick(o.getDigitaltraindatatrains());
	}

	@When("User have to enter the data trains url")
	public void user_have_to_enter_the_data_trains_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/trains/");
		System.out.println("User enter the train url");
	}

	@When("User have to click the data rail routes")
	public void user_have_to_click_the_data_rail_routes() throws InterruptedException {
		elementClick(o.getDigitaltraindatarailroutes());
	}

	@When("User have to enter the rail routes url")
	public void user_have_to_enter_the_rail_routes_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/route-profiles/");
		System.out.println("User enter the rail route profile url");
	}

	@When("User have to click the data wheel and rail profile")
	public void user_have_to_click_the_data_wheel_and_rail_profile() throws InterruptedException {
		elementClick(o.getDigitaltraindatawheelandrailprofiles());
	}

	@When("User have to enter the wheel and rail profile url")
	public void user_have_to_enter_the_wheel_and_rail_profile_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/wheels-rails/");
		System.out.println("User enter the wheel and rail profile url");
	}

	@When("User have to click the data train gauges")
	public void user_have_to_click_the_data_train_gauges() throws InterruptedException {
		elementClick(o.getDigitaltraindatatraingauges());
		wait1Seconds();
	}

	@When("User have to enter the train gauges url")
	public void user_have_to_enter_the_train_gauges_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/digitaltrains-gauging/");
		System.out.println("User enter the train gauges url");
	}

	@When("User have to click the data stractural gauges")
	public void user_have_to_click_the_data_stractural_gauges() throws InterruptedException {
		elementClick(o.getDigitaltraindatastructuralgauges());
		wait1Seconds();
	}

	@When("User have to enter the stractural gauges url")
	public void user_have_to_enter_the_stractural_gauges_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/digitaltrains-gauging/");
		System.out.println("User enter the stractural gauges url");
	}

	@When("User have to click the data bufferstops")
	public void user_have_to_click_the_data_bufferstops() throws InterruptedException {
		elementClick(o.getDigitaltraindatabufferstops());
		wait1Seconds();
	}

	@When("User have to enter the bufferstops url")
	public void user_have_to_enter_the_bufferstops_url() throws InterruptedException {
		wait1Seconds();
		o = new OleoPojo();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/buffer-stops/");
		System.out.println("User enter the bufferstop url"); 
		wait1Seconds();
	}

	@Given("User have to click the simulation under imapct train findout more option")
	public void user_have_to_click_the_simulation_under_imapct_train_findout_more_option() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getDigitaltrainsimulationimpactfindoutmore());
		wait1Seconds();
	}

	@Given("User have to enter the imapct train url")
	public void user_have_to_enter_the_imapct_train_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/digitaltrains-impact/");
		System.out.println("User enter the impact train url");
	}

	@Given("User have to click the simulation under train running findout more option")
	public void user_have_to_click_the_simulation_under_train_running_findout_more_option()
			throws InterruptedException {
		elementClick(o.getDigitaltrainsimulationtrainrunningfindoutmore());
	}

	@Given("User have to enter the train runnig url")
	public void user_have_to_enter_the_train_runnig_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/digitaltrains-train-running/");
		System.out.println("User enter the train running url");
	}

	@When("User have to click the simulation under gauging findout more option")
	public void user_have_to_click_the_simulation_under_gauging_findout_more_option() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getDigitaltrainsimulationgaugingfindoutmore());
		wait1Seconds();
	}

	@When("User have to enter the gauging url")
	public void user_have_to_enter_the_gauging_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/digitaltrains-gauging/");
		System.out.println("User enter the gauging url");
	}

	@Given("User have to click the infrastracture route profile option")
	public void user_have_to_click_the_infrastracture_route_profile_option() throws InterruptedException {
		elementClick(o.getDigitaltraininfrastracturerouteprofiles());
		wait1Seconds();
	}

	@Given("User have to enter route profile url")
	public void user_have_to_enter_route_profile_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/route-profiles/");
		System.out.println("User enter the profile url");
	}

	@Given("User have to click the infrastracture trains option")
	public void user_have_to_click_the_infrastracture_trains_option() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getDigitaltraininfrastracturetrains());
		wait1Seconds();
	}

	@Given("User have to enter train url")
	public void user_have_to_enter_train_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/trains/");
		System.out.println("User enter the train url");
	}

	@Given("User have to click back train button")
	public void user_have_to_click_back_train_button() throws InterruptedException {
		navigateBack();
		wait1Seconds();
	}

	@Given("User have to click the infrastracture bufferstops option")
	public void user_have_to_click_the_infrastracture_bufferstops_option() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getDigitaltraininfrastracturebufferstops());
		wait1Seconds();
	}

	@Given("User have to enter bufferstops url")
	public void user_have_to_enter_bufferstops_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/buffer-stops/");
		System.out.println("User enter the bufferstop url");
	}

	@Given("User have to click the rolling stock vehicle option")
	public void user_have_to_click_the_rolling_stock_vehicle_option() throws InterruptedException {
		elementClick(o.getDigitaltraininfrastracturevehicles());
		wait1Seconds();
	}

	@Given("User have to enter vehicle url")
	public void user_have_to_enter_vehicle_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/vehicles/");
		System.out.println("User enter the vehicle url");
	}

	@Given("User have to click the rolling stock bogies option")
	public void user_have_to_click_the_rolling_stock_bogies_option() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getDigitaltraininfrastracturebogies());
		wait1Seconds();
	}

	@Given("User have to enter bogies url")
	public void user_have_to_enter_bogies_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/bogies/");
		System.out.println("User enter the bogies url");
	}

	@When("User have to click the rolling stock coupling interface option")
	public void user_have_to_click_the_rolling_stock_coupling_interface_option() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getDigitaltraininfrastracturecouplinginterfaces());
		wait1Seconds();
	}

	@When("User have to enter rooling stock coupling interface url")
	public void user_have_to_enter_rooling_stock_coupling_interface_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/coupling-interfaces/");
		System.out.println("User enter the coupling interface url");
	}

	@When("User have to click the component wheels and rails option")
	public void user_have_to_click_the_component_wheels_and_rails_option() throws InterruptedException {
		elementClick(o.getDigitaltraincomponentswheelsandrails());
		wait1Seconds();
	}

	@When("User have to enter wheels and rails url")
	public void user_have_to_enter_wheels_and_rails_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/wheels-rails/");
		System.out.println("User enter the wheel rails url");
	}

	@When("User have to click the component devices option")
	public void user_have_to_click_the_component_devices_option() throws InterruptedException {
		elementClick(o.getDigitaltraincomponentsdevices());
		wait1Seconds();
	}

	@When("User have to enter component devices url")
	public void user_have_to_enter_component_devices_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/devices/");
		System.out.println("User enter the device url");
	}

	@When("User have to click the component digital twins option")
	public void user_have_to_click_the_component_digital_twins_option() throws InterruptedException {
		elementClick(o.getDigitaltraincomponentsdigitaltwins());
		wait1Seconds();
	}

	@When("User have to enter digital twins url")
	public void user_have_to_enter_digital_twins_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/digital-twins/");
		System.out.println("User enter the digital twins url");
	}

	@Given("User have to click the tool under comparison option")
	public void user_have_to_click_the_tool_under_comparison_option() throws InterruptedException {
		elementClick(o.getDigitaltraintoolscomparisontools());
		wait1Seconds();
	}

	@Given("User have to enter comparison url")
	public void user_have_to_enter_comparison_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/comparison-tools/");
		System.out.println("User enter the comparison url");
	}

	@When("User have to click the tool under analysis option")
	public void user_have_to_click_the_tool_under_analysis_option() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getDigitaltraintoolsanalysistools());
		wait1Seconds();
	}

	@When("User have to enter analysis url")
	public void user_have_to_enter_analysis_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,
				"https://www.digitaltrains.online/interactive-graphical-analysis-3d-visualisation-reports/");
		System.out.println("User enter the analysis url");
	}

	@When("User have to click the tool under train optimiser option")
	public void user_have_to_click_the_tool_under_train_optimiser_option() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getDigitaltraintooltrainoptimiser());
	}

	@When("User have to enter optimiser url")
	public void user_have_to_enter_optimiser_url() throws InterruptedException {
		wait1Seconds();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.digitaltrains.online/optimise/");
        System.out.println("user enter the optimiser url");

	}
	
	
	

	// check the filter option of train module

	@When("User have to click the trains by box")
	public void user_have_to_click_the_trains_by_box() throws InterruptedException {
		elementClick(o.getTrainbybox());
		wait1Seconds();

	}

	@When("User have to click the all option it show all trains")
	public void user_have_to_click_the_all_option_it_show_all_trains() throws InterruptedException {
		elementClick(o.getTrainselctbyall());
		wait1Seconds();

	}

	@When("User have to click the mainline option it show only mainline train")
	public void user_have_to_click_the_mainline_option_it_show_only_mainline_train() throws InterruptedException {
		elementClick(o.getTrainselectbymainline());
		wait1Seconds();
	}

	@When("User have to click the freight option")
	public void user_have_to_click_the_freight_option() throws InterruptedException {
		elementClick(o.getTrainselectbyfreight());
		wait1Seconds();
	}

	@When("User have to click the metro train")
	public void user_have_to_click_the_metro_train() throws InterruptedException {
		elementClick(o.getTrainselectbymetro());
		wait1Seconds();
	}

	@Then("User have to click the all option")
	public void user_have_to_click_the_all_option() {
		elementClick(o.getTrainselctbyall());

	}

	@Given("User have to click the search box")
	public void user_have_to_click_the_search_box() throws InterruptedException {
		elementClick(o.getTrainsearchoption());
		wait1Seconds();
	}

	@Given("User have to enter the mytrain and my train in search box")
	public void user_have_to_enter_the_mytrain_and_my_train_in_search_box() throws InterruptedException {
		sendKeys(o.getTrainsearchoption(), "My train");
		wait1Seconds();
	}

	@When("User have to check the metro trains are showing")
	public void user_have_to_check_the_metro_trains_are_showing() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Trains");

	}

	@Then("User have to clear the all in search box")
	public void user_have_to_clear_the_all_in_search_box() throws InterruptedException {
		sendKeys(o.getTrainsearchoption(), "My Train");
		wait1Seconds();
		o.getTrainsearchoption().clear();
		wait1Seconds();
		
	}

	@Given("User have to click the date from box")
	public void user_have_to_click_the_date_from_box() throws InterruptedException {
		elementClick(o.getTrainfromdate());
		wait1Seconds();
	}

	@When("User have to click the date to box")
	public void user_have_to_click_the_date_to_box() throws InterruptedException {
		elementClick(o.getTraintodate());
		wait1Seconds();
	}

	@Given("User have to click the first date in the celander")
	public void user_have_to_click_the_first_date_in_the_celander() throws InterruptedException {
		elementClick(o.getTrainselectdateseven());
		wait1Seconds();
	}

	@When("User have to click the second date in the celander")
	public void user_have_to_click_the_second_date_in_the_celander() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getTrainselectdatesecodseven());
		wait1Seconds();
	}

	@Then("User have to erase the all selected date")
	public void user_have_to_erase_the_all_selected_date() throws InterruptedException {
		elementClick(o.getTrainfromdate());
		wait1Seconds();
		elementClick(o.getTraincleardate());
		wait1Seconds();
		elementClick(o.getTraintodate());
		wait1Seconds();
		elementClick(o.getTraincleardateto());
		wait1Seconds();

	}

	@Given("User have to click the first sort option")
	public void user_have_to_click_the_first_sort_option() throws InterruptedException {
		elementClick(o.getTrainsortoption());
		wait1Seconds();
		elementClick(o.getTrainselectbyname());
		wait1Seconds();

	}

	@Given("User have to select the all options of sort first box")
	public void user_have_to_select_the_all_options_of_sort_first_box() throws InterruptedException {
		elementClick(o.getTrainsortoption());
		wait1Seconds();
		elementClick(o.getTrainselectbycreateddate());
		wait1Seconds();
		elementClick(o.getTrainsortoption());
		wait1Seconds();
		elementClick(o.getTrainselectbymodifieddate());
		wait1Seconds();
	}

	@When("User have to click the sort two option")
	public void user_have_to_click_the_sort_two_option() throws InterruptedException {
		elementClick(o.getTrainsort2());
		wait1Seconds();
		elementClick(o.getTrainselectasc());
		wait1Seconds();
        
	}

	@When("User have to select the sort two box options")
	public void user_have_to_select_the_sort_two_box_options() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getTrainsort2());
		wait1Seconds();
		elementClick(o.getTrainselectdesc());
	}
	
	

	// Check the filter option of vehicle module

	@When("User have to click the vehicle by option")
	public void user_have_to_click_the_vehicle_by_option() throws InterruptedException {
		elementClick(o.getVehiclebybox());
		wait1Seconds();

	}

	@When("User have to click the all option show all vehicles")
	public void user_have_to_click_the_all_option_show_all_vehicles() throws InterruptedException {
		elementClick(o.getVehicleselectall());
		wait1Seconds();
	}

	@When("User have to click the DMU cab option")
	public void user_have_to_click_the_DMU_cab_option() {
		elementClick(o.getVehiclebybox());
		elementClick(o.getVehicleselectdmucab());
	}

	@When("User have to click the DMU Carriage")
	public void user_have_to_click_the_DMU_Carriage() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getVehiclebybox());
		elementClick(o.getVehicleselectdmucarriage());
	}

	@When("User have to click the EMU cab and EMU Carriage option")
	public void user_have_to_click_the_EMU_cab_and_EMU_Carriage_option() throws InterruptedException {
		elementClick(o.getVehiclebybox());
		elementClick(o.getVehicleselectemucab());
		wait1Seconds();
	}

	@Then("User have to select default all option")
	public void user_have_to_select_default_all_option() throws InterruptedException {
		elementClick(o.getVehiclebybox());
		elementClick(o.getVehicleselectemucarriage());
		wait1Seconds();
		elementClick(o.getVehicleselectall());
		wait1Seconds();
	}

	@Given("User have to send the My vehicle in search box")
	public void user_have_to_send_the_My_vehicle_in_search_box() throws InterruptedException {
		sendKeys(o.getVehiclesearchbox(), "My vehicle");
		wait1Seconds();
	}

	@Given("User have to see the correct vehicle in the dashboard")
	public void user_have_to_see_the_correct_vehicle_in_the_dashboard() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Vehicles");
	}

	@Given("User have to send the Myvehicle in the search box")
	public void user_have_to_send_the_Myvehicle_in_the_search_box() throws InterruptedException {
		sendKeys(o.getVehiclesearchbox(), "myvehicle");
		wait1Seconds();
	}

	@When("User not see the train in the dashboard")
	public void user_not_see_the_train_in_the_dashboard() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DigitalTrains - Vehicles");
	}

	@Then("User have to clear the searh box")
	public void user_have_to_clear_the_searh_box() {
		o.getVehiclesearchbox().clear();

	}

	@Given("User have to click the from date")
	public void user_have_to_click_the_from_date() throws InterruptedException {
		elementClick(o.getVehicleselectfromdate());
		wait1Seconds();
	}

	@Given("User have to select the date seven")
	public void user_have_to_select_the_date_seven() throws InterruptedException {
		elementClick(o.getVehiclefirstdate());
		wait1Seconds();
	}

	@When("User have to click the to date")
	public void user_have_to_click_the_to_date() throws InterruptedException {
		elementClick(o.getVehicleselecttodate());
		wait1Seconds();
	}

	@When("User have to select the date seven two")
	public void user_have_to_select_the_date_seven_two() throws InterruptedException {
		elementClick(o.getVehicleseconddate());
		wait1Seconds();
	}

	@Then("User have to clear the two date")
	public void user_have_to_clear_the_two_date() throws InterruptedException {
		elementClick(o.getVehicleselectfromdate());
		wait1Seconds();
		elementClick(o.getVehiclefirstclear());
		wait1Seconds();
		elementClick(o.getVehicleselecttodate());
		wait1Seconds();
		elementClick(o.getVehiclesecondclear());
		wait1Seconds();
	}

	@Given("User have to click the first sort box")
	public void user_have_to_click_the_first_sort_box() {
		elementClick(o.getVehiclesort());
	}

	@Given("User have to check the three options of sort one option")
	public void user_have_to_check_the_three_options_of_sort_one_option() throws InterruptedException {
		elementClick(o.getVehiclesortbyname());
		wait1Seconds();
		elementClick(o.getVehiclesort());
		elementClick(o.getVehiclesortbycreatedate());
		wait1Seconds();
		elementClick(o.getVehiclesort());
		elementClick(o.getVehiclesortbymodifieddate());
		wait1Seconds();
	}

	@When("User have to click the second sort option")
	public void user_have_to_click_the_second_sort_option() {
		elementClick(o.getVehiclesort2());
	}

	@When("User have to click the two option of sort two oprion")
	public void user_have_to_click_the_two_option_of_sort_two_oprion() throws InterruptedException {

		elementClick(o.getVehiclesortasc());
		wait1Seconds();
		elementClick(o.getVehiclesort2());
		elementClick(o.getVehiclesortdesc());
		wait1Seconds();
	}
	
	

  //check the wheel and rail profile filter option

	@When("User have to click the profile by option")
	public void user_have_to_click_the_profile_by_option() {
		elementClick(o.getWheelrailprofileselectbox());
	}

	@When("User have to select the all and wheel,rail options")
	public void user_have_to_select_the_all_and_wheel_rail_options() throws InterruptedException {
		elementClick(o.getWheelrailprofileselectwheel());
		wait1Seconds();
		elementClick(o.getWheelrailprofileselectbox());
		elementClick(o.getWheelrailprofileselectrail());

	}

	@Then("User have to select the default all option")
	public void user_have_to_select_the_default_all_option() throws InterruptedException {
		elementClick(o.getWheelrailprofileselectbox());
		elementClick(o.getWheelrailprofileselectall());
		wait1Seconds();
	}

	@Given("User have to enter the Rail Profile in search box")
	public void user_have_to_enter_the_Rail_Profile_in_search_box() throws InterruptedException {
		sendKeys(o.getWheelrailprofilesearchbox(), "Rail profile");
		wait1Seconds();
	}

	@When("User have to see the railprofile in the dashboard")
	public void user_have_to_see_the_railprofile_in_the_dashboard() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "DigitalTrains - Profiles");
	}

	@When("User have to enter the Railprofile in search box")
	public void user_have_to_enter_the_Railprofile_in_search_box() throws InterruptedException {
		sendKeys(o.getWheelrailprofilesearchbox(), "Railprofile");
		wait1Seconds();
	}

	@When("User have not able to the profile in dashboard")
	public void user_have_not_able_to_the_profile_in_dashboard() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "DigitalTrains - Profiles");
	}

	@Then("User have to clear the search box")
	public void user_have_to_clear_the_search_box() throws InterruptedException {
		o.getWheelrailprofilesearchbox().clear();
		wait1Seconds();
	}

	@Given("User have to click the first date box")
	public void user_have_to_click_the_first_date_box() throws InterruptedException {
		wait1Seconds();
		elementClick(o.getWheelrailprofiledatefrom());
		wait1Seconds();
	}

	@Given("User have to click the date seven")
	public void user_have_to_click_the_date_seven() {
		elementClick(o.getWheelrailfirstseven());
	}

	@When("User have to click the second date box")
	public void user_have_to_click_the_second_date_box() throws InterruptedException {
		elementClick(o.getWheelrailprofiledateto());
		wait1Seconds();
	}

	@When("User have to click the date seven second")
	public void user_have_to_click_the_date_seven_second() throws InterruptedException {
		elementClick(o.getWheelrailsecondseven());
        wait1Seconds();
	}

	@Given("User have to click the wheel and rail first sort box")
	public void user_have_to_click_the_wheel_and_rail_first_sort_box() {

		elementClick(o.getWheelrailprofilesortbox());
	}

	@When("User have to click four option of the sort box")
	public void user_have_to_click_four_option_of_the_sort_box() throws InterruptedException {
		elementClick(o.getWheelrailprofilesortbyname());
		wait1Seconds();
		elementClick(o.getWheelrailprofilesortbox());
		wait1Seconds();
		elementClick(o.getWheelrailprofilesortbycreatedate());
		wait1Seconds();
		elementClick(o.getWheelrailprofilesortbox());
		wait1Seconds();
		elementClick(o.getWheelrailprofilesortbymodifieddate());
		wait1Seconds();
	}

	@Then("User have to set the default name setting")
	public void user_have_to_set_the_default_name_setting() throws InterruptedException {
		elementClick(o.getWheelrailprofilesortbox());
		elementClick(o.getWheelrailprofilesortbyname());
		wait1Seconds();
	}

	@Given("User have to click the wheel rail profile second sort box")
	public void user_have_to_click_the_wheel_rail_profile_second_sort_box() throws InterruptedException {
		elementClick(o.getWheelrailprofilesort2());
		wait1Seconds();
	}

	@Then("User have to clear the selected date")
	public void user_have_to_clear_the_selected_date() throws InterruptedException {
		elementClick(o.getWheelrailprofiledatefrom());
		elementClick(o.getWheelrailclearone());
		wait1Seconds();
		elementClick(o.getWheelrailprofiledateto());
		elementClick(o.getWheelrailcleartwo());
		wait1Seconds();
	}

	@When("User have to click two options of the sort box")
	public void user_have_to_click_two_options_of_the_sort_box() throws InterruptedException {
		elementClick(o.getWheelrailsortbyasc());
		wait1Seconds();
		elementClick(o.getWheelrailprofilesort2());
		elementClick(o.getWheelrailsortbydesc());
	}

	
	
	//check the functionality of bogie part filter option
	
	
	
	@Given("User have to click the part by option and check the all type filter")
	public void user_have_to_click_the_part_by_option_and_check_the_all_type_filter()throws InterruptedException  {
	   
		elementClick(o.getBogiespartbybox());
		elementClick(o.getBogiespartsortbyall());
		wait1Seconds();
		elementClick(o.getBogiespartbybox());
		elementClick(o.getBogiespartsortbymass());
		wait1Seconds();
		elementClick(o.getBogiespartbybox());
		elementClick(o.getBogiespartsortbywheelset());
	}

	@When("User have to send the key in search box")
	public void user_have_to_send_the_key_in_search_box() throws InterruptedException {
		sendKeys(o.getBogiespartsearchbox(),"Y25wheelset");
	    wait5seconds();
	    o.getBogiespartsearchbox().clear();
	    wait1Seconds();
	}

	@When("User have to click the date from box and click the date six")
	public void user_have_to_click_the_date_from_box_and_click_the_date_six()throws InterruptedException  {
	    elementClick(o.getBogiespartdatefrom());
	    wait1Seconds();
	    elementClick(o.getBogiespartselect6());
	    wait1Seconds();
	    
	}

	@When("User have to click the date to box and click the date six")
	public void user_have_to_click_the_date_to_box_and_click_the_date_six()throws InterruptedException  {
		 elementClick(o.getBogiespartdateto());
		 wait1Seconds();
		 elementClick(o.getBogiespartselect6two());
		 wait1Seconds();
	}

	@When("User have to clear the two date box")
	public void user_have_to_clear_the_two_date_box()throws InterruptedException  {
		  elementClick(o.getBogiespartdatefrom());
		  wait1Seconds();
		  elementClick(o.getBogiespartdateclear());
		  wait1Seconds();
		  elementClick(o.getBogiespartdateto());
		  wait1Seconds();
		  elementClick(o.getBogiespartdatecleartwo());
	}

	@When("User have to click the first sort box and check the option")
	public void user_have_to_click_the_first_sort_box_and_check_the_option()throws InterruptedException  {
	      elementClick(o.getBogiespartsortbox());
	      elementClick(o.getBogiespartsortbyname());
	      wait1Seconds();
	      elementClick(o.getBogiespartsortbox());
	      elementClick(o.getBogiespartsortbycreateddate());
	      wait1Seconds();
	      elementClick(o.getBogiespartsortbox());
	      elementClick(o.getBogiespartsortbymodifieddate());
	      
	}

	@When("User have to clic the second sort box and check the option")
	public void user_have_to_clic_the_second_sort_box_and_check_the_option() throws InterruptedException {
	       elementClick(o.getBogiespartsort2());
	       elementClick(o.getBogiespartsortbyasc());
	       wait1Seconds();
	       elementClick(o.getBogiespartsort2());
	       elementClick(o.getBogiespartsortbydesc());
	       wait1Seconds();
	}
	
	
	
	//check the functionality of bogie assembly filter option
	
	
	
	@Given("User have to click the assembly option")
	public void user_have_to_click_the_assembly_option() {
	    elementClick(o.getBogieassemblyoption());
	}

	@Given("User have to enter bogie assambly url")
	public void user_have_to_enter_bogie_assambly_url() {
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
	   Assert.assertEquals("https://testphp.digitaltrains.online/bogies",currentUrl);
       System.out.println("User enter bogie assambly url");
	}

	@When("User have to send the key in assembly search box")
	public void user_have_to_send_the_key_in_assembly_search_box() throws InterruptedException {
		sendKeys(o.getBogieassemblysearchbox(), "Y25 bogie");
		wait1Seconds();
		o.getBogieassemblysearchbox().clear();
		wait1Seconds();
	}

	@When("User have to click the bogie assambly date from box and click the date six")
	public void user_have_to_click_the_bogie_assambly_date_from_box_and_click_the_date_six() throws InterruptedException {
	   elementClick(o.getBogieassemblydatefrombox());
	   wait1Seconds();
	   elementClick(o.getBogieassemblyselectdatesix());
	   wait1Seconds();
	}

	@When("User have to click the bogie assambly date to box and click the date six")
	public void user_have_to_click_the_bogie_assambly_date_to_box_and_click_the_date_six() throws InterruptedException {
	    elementClick(o.getBogieassemblydatetobox());
	    wait1Seconds();
	    elementClick(o.getBogieassemblyselectdatesixsecond());
	    wait1Seconds();
	    
	}

	@When("User have to clear the bogie assambly two date box")
	public void user_have_to_clear_the_bogie_assambly_two_date_box() throws InterruptedException {
		elementClick(o.getBogieassemblydatefrombox());
	    elementClick(o.getBogieassemblycleardateone());
	    wait1Seconds();
	    elementClick(o.getBogieassemblydatetobox());
	    elementClick(o.getBogieassemblycleardatesecond());
	    wait1Seconds();
	    
	}

	@When("User have to click the bogie assambly first sort box and check the option")
	public void user_have_to_click_the_bogie_assambly_first_sort_box_and_check_the_option() throws InterruptedException {
	    elementClick(o.getBogieassemblysortone());
	    elementClick(o.getBogieassemblysortname());
	    wait1Seconds();
	    elementClick(o.getBogieassemblysortone());
	    elementClick(o.getBogieassemblysortcreateddate());
	    wait1Seconds();
	    elementClick(o.getBogieassemblysortone());
	    elementClick(o.getBogieassemblysortmodifieddate());
	    wait1Seconds();
	}

	@When("User have to clic the bogie assambly second sort box and check the option")
	public void user_have_to_clic_the_bogie_assambly_second_sort_box_and_check_the_option() throws InterruptedException {
	    elementClick(o.getBogieassemblysorttwo());
	    elementClick(o.getBogieassemblysortasc());
	    wait1Seconds();
	    elementClick(o.getBogieassemblysorttwo());
	    elementClick(o.getBogieassemblysortdesc());
	    wait1Seconds();
	}
	
	
	
	
	
	//check the gauges filter option
	
	
	
	@When("User have to click the gauges by box and click the all option")
	public void user_have_to_click_the_gauges_by_box_and_click_the_all_option()throws InterruptedException {
	     elementClick(o.getGaugesbybox());
	     wait1Seconds();
	     elementClick(o.getGaugesall());
		
	}

	@When("User have to click the vehicle gauges option")
	public void user_have_to_click_the_vehicle_gauges_option()throws InterruptedException {
		 elementClick(o.getGaugesbybox());
		 wait1Seconds();
		 elementClick(o.getGaugesvehicle());
	}

	@When("User have to click the stractural gauges option")
	public void user_have_to_click_the_stractural_gauges_option()throws InterruptedException {
		 elementClick(o.getGaugesbybox());
		 wait1Seconds();
		 elementClick(o.getGaugesstractural());
	}

	@Then("User have to set the default All gauges option")
	public void user_have_to_set_the_default_All_gauges_option() throws InterruptedException{
		 elementClick(o.getGaugesbybox());
		 wait1Seconds();
		 elementClick(o.getGaugesall());
		 wait1Seconds();
	}

	@Given("User have to click the gauges search box")
	public void user_have_to_click_the_gauges_search_box() throws InterruptedException{
		 elementClick(o.getGaugessearchbox());
	}

	
	@When("User have to send the particular gauge name in the search box")
	public void user_have_to_send_the_particular_gauge_name_in_the_search_box()throws InterruptedException {
	
		 sendKeys(o.getGaugessearchbox(),"Tunnel");
		 wait1Seconds();
		
	}
	
	@Then("User have to clear the gauges search box")
	public void user_have_to_clear_the_gauges_search_box() throws InterruptedException {
		 o.getGaugessearchbox().clear();
		 wait1Seconds();
	}

	@Given("User have to click the gauges date from box and select the date")
	public void user_have_to_click_the_gauges_date_from_box_and_select_the_date()throws InterruptedException {
		 elementClick(o.getGaugesdatefrom());
		 wait1Seconds();
		 elementClick(o.getGaugesdate7());
		 wait1Seconds();
	}

	@When("User have to click the gauges date to box and select the date")
	public void user_have_to_click_the_gauges_date_to_box_and_select_the_date()throws InterruptedException {
		 elementClick(o.getGaugesdateto());
		 wait1Seconds();
		 elementClick(o.getGaugesdate7two());
		 wait1Seconds();
	}

	@Then("User have to clear the both of gauges date filter option")
	public void user_have_to_clear_the_both_of_gauges_date_filter_option()throws InterruptedException {
		 elementClick(o.getGaugesdatefrom());
		 elementClick(o.getGaugesclearone());
		 wait1Seconds();
		 elementClick(o.getGaugesdateto());
		 elementClick(o.getGaugescleartwo());
	}

	
	@Given("User have to click the gauges first sort option")
	public void user_have_to_click_the_gauges_first_sort_option()throws InterruptedException {
		 elementClick(o.getGaugessortone());
	}
	

	@Given("User have to select the gauges various first sort option")
	public void user_have_to_select_the_gauges_various_first_sort_option()throws InterruptedException {
		 elementClick(o.getGaugessortname());
		 wait1Seconds();
		 elementClick(o.getGaugessortone());
		 elementClick(o.getGaugessortcreateddate());
		 wait1Seconds();
		 elementClick(o.getGaugessortone());
		 elementClick(o.getGaugessortmodifieddate());
	}

	
	@When("User have to click the gauges second sort option")
	public void user_have_to_click_the_gauges_second_sort_option()throws InterruptedException {
		
		 elementClick(o.getGaugessorttwo());
	}

	
	@When("User have to select the gauges various second sort option")
	public void user_have_to_select_the_gauges_various_second_sort_option() throws InterruptedException {
		 elementClick(o.getGaugessortasc());
		 wait1Seconds();
		 elementClick(o.getGaugessorttwo());
		 wait1Seconds();
		 elementClick(o.getGaugessortdesc());
	}
	
	
	
	//check the Route profile filter options
	
	
	
	@When("User have to enter the route profile name in the search box")
	public void user_have_to_enter_the_route_profile_name_in_the_search_box()throws InterruptedException  {
	    sendKeys(o.getRouteprofilesearchbox(), "singapore routeprofile");
	    wait1Seconds();
	}

	@Then("user have to clear the route profile search box")
	public void user_have_to_clear_the_route_profile_search_box()throws InterruptedException  {
	    o.getRouteprofilesearchbox().clear();
	    wait1Seconds(); 
	}

	@Given("User have ot click the route profile date from option")
	public void user_have_ot_click_the_route_profile_date_from_option()throws InterruptedException  {
	    elementClick(o.getRouteprofiledatefrom());
	    wait1Seconds();
	}

	@Given("User have to select the first date in route profile option")
	public void user_have_to_select_the_first_date_in_route_profile_option()throws InterruptedException  {
	    elementClick(o.getRouteprofiledate6());
	    wait1Seconds();
	}

	@When("User have to click the route profile date to option")
	public void user_have_to_click_the_route_profile_date_to_option()throws InterruptedException  {
		 elementClick(o.getRouteprofiledateto());
		 wait1Seconds();
	}

	@When("User have to click the second date in route profile option")
	public void user_have_to_click_the_second_date_in_route_profile_option()throws InterruptedException  {
	    elementClick(o.getRouteprofiledate7());
	    wait1Seconds();
	}

	@Then("User have to clear the both date filter in route profile option")
	public void user_have_to_clear_the_both_date_filter_in_route_profile_option()throws InterruptedException  {
		elementClick(o.getRouteprofiledatefrom());
		elementClick(o.getRouteprofileclearone());
		wait1Seconds();
		elementClick(o.getRouteprofiledateto());
		elementClick(o.getRouteprofilecleartwo());
		wait1Seconds();
	}

	@Given("User have to click the route profile sort one option")
	public void user_have_to_click_the_route_profile_sort_one_option()throws InterruptedException  {
	   elementClick(o.getRouteprofilesortone());
	   wait1Seconds();
	   
	}

	@Given("User have to check the verious options of the sort one route profile")
	public void user_have_to_check_the_verious_options_of_the_sort_one_route_profile()throws InterruptedException  {
		elementClick(o.getRouteprofilesortname());
		wait1Seconds();
		elementClick(o.getRouteprofilesortone());
		wait1Seconds();
		elementClick(o.getRouteprofilesortcreateddate());
		wait1Seconds();
		elementClick(o.getRouteprofilesortone());
		wait1Seconds();
		elementClick(o.getRouteprofilesortmodifieddate());
		
	}

	@When("User have to click the route profile sort two option")
	public void user_have_to_click_the_route_profile_sort_two_option() throws InterruptedException {
	    elementClick(o.getRouteprofilesorttwo());
	    wait1Seconds();
	}

	@When("User have to check the types of sort two options")
	public void user_have_to_check_the_types_of_sort_two_options() throws InterruptedException {
	    elementClick(o.getRouteprofilesortasc());
	    wait1Seconds();
	    elementClick(o.getRouteprofilesorttwo());
	    wait1Seconds();
	    elementClick(o.getRouteprofilesortdesc());
	}
	
	

	
	//check the Buffer stop filter option
	
	
	@When("User have to enter the bufferstop name in the search box")
	public void user_have_to_enter_the_bufferstop_name_in_the_search_box()throws InterruptedException {
		sendKeys(o.getBufferstopsearchbox(),"3 Point Sliding Buffer Stop");
		Thread.sleep(5000);
		
	}

	@Then("User have to clear the bufferstop name in searchbox")
	public void user_have_to_clear_the_bufferstop_name_in_searchbox()throws InterruptedException {
		o.getBufferstopsearchbox().clear();
		wait1Seconds();
		sendKeys(o.getBufferstopsearchbox(),"Fixed Buffer Stop");
		Thread.sleep(5000);
		o.getBufferstopsearchbox().clear();
		wait1Seconds();
		sendKeys(o.getBufferstopsearchbox(),"3 Point Sliding Buffer Stop");
		Thread.sleep(5000);
		wait1Seconds();
		o.getBufferstopsearchbox().clear();
		wait1Seconds();
		
	}

	@Given("User have to click the bufferstop date from box")
	public void user_have_to_click_the_bufferstop_date_from_box()throws InterruptedException {
		elementClick(o.getBufferstopdatefrom());
		wait1Seconds();
		
	}

	@Given("User have to select the date in buffer stop from box")
	public void user_have_to_select_the_date_in_buffer_stop_from_box()throws InterruptedException {
	    
		elementClick(o.getBufferstopdate6());
		wait1Seconds();
	}

	@When("User have to click the bufferstop date to box")
	public void user_have_to_click_the_bufferstop_date_to_box()throws InterruptedException {
	    
		elementClick(o.getBufferstopdateto());
		wait1Seconds();
	}

	@When("User have to select the date in buffer stop to box")
	public void user_have_to_select_the_date_in_buffer_stop_to_box()throws InterruptedException {
	    
		elementClick(o.getBufferstopdate7());
		wait1Seconds();
	}

	@Then("User have to clear the both date in buffer stop filter option")
	public void user_have_to_clear_the_both_date_in_buffer_stop_filter_option()throws InterruptedException {
		elementClick(o.getBufferstopdatefrom());
		elementClick(o.getBufferstopfirstclear());
		wait1Seconds();
		elementClick(o.getBufferstopdateto());
		elementClick(o.getBufferstopsecondclear());
		wait1Seconds();
		
	}

	@Given("User have to click the bufferstop sort one option")
	public void user_have_to_click_the_bufferstop_sort_one_option() throws InterruptedException{
		elementClick(o.getBufferstopsortone());
		wait1Seconds();
		
	}

	@Given("User have to check the types of bufferstop sort one box")
	public void user_have_to_check_the_types_of_bufferstop_sort_one_box() throws InterruptedException{
		elementClick(o.getBufferstopsortname());
		wait1Seconds();
		elementClick(o.getBufferstopsortone());
		wait1Seconds();
		elementClick(o.getBufferstopsortcreateddate());
		wait1Seconds();
		elementClick(o.getBufferstopsortone());
		wait1Seconds();
		elementClick(o.getBufferstopsortmodifieddate());
		wait1Seconds();
		
	}

	@When("User have to click the bufferstop sort two option")
	public void user_have_to_click_the_bufferstop_sort_two_option() throws InterruptedException {
	    
		elementClick(o.getBufferstopsorttwo());
		wait1Seconds();
	}

	@When("User have to check the types of bufferstop sort two box")
	public void user_have_to_check_the_types_of_bufferstop_sort_two_box()throws InterruptedException {
	    
		elementClick(o.getBufferstopsortasc());
		wait1Seconds();
		elementClick(o.getBufferstopsorttwo());
		wait1Seconds();
		elementClick(o.getBufferstopsortdesc());
		wait1Seconds();
	}
	
	
	//check the coupling interface and devices filter option
	
	@When("User have to send the one name of coupling interface in search box")
	public void user_have_to_send_the_one_name_of_coupling_interface_in_search_box()throws InterruptedException {
		
	    sendKeys(o.getInterfacesearchbox(),"");
	    wait1Seconds();
		
	}

	@Then("User have to clear the coupling interface search box")
	public void user_have_to_clear_the_coupling_interface_search_box()throws InterruptedException {
	    
		o.getInterfacesearchbox().clear();
		wait1Seconds();
	}

	@Given("User have to click the coupling interface date from box")
	public void user_have_to_click_the_coupling_interface_date_from_box()throws InterruptedException {
	    elementClick(o.getInterfacedatefrombox());
	    wait1Seconds();
	  
	}

	@Given("User have to click the coupling interface sixth date from box")
	public void user_have_to_click_the_coupling_interface_sixth_date_from_box()throws InterruptedException {
		 elementClick(o.getInterfacedate6());
		 wait1Seconds();
	}

	@When("User have to click the coupling interface date to box")
	public void user_have_to_click_the_coupling_interface_date_to_box() throws InterruptedException{
	    elementClick(o.getInterfacedateto());
	    wait1Seconds();
	}

	@When("User have to click the coupling interface seventh date to box")
	public void user_have_to_click_the_coupling_interface_seventh_date_to_box() throws InterruptedException{
		elementClick(o.getInterfacedate7());
	    wait1Seconds();
	}

	@Then("User have to clear the both of date from and date to option")
	public void user_have_to_clear_the_both_of_date_from_and_date_to_option()throws InterruptedException {
	    elementClick(o.getInterfacedatefrombox());
	    wait1Seconds();
	    elementClick(o.getInterfaceclearone());
	    wait1Seconds();
	    elementClick(o.getInterfacedateto());
	    wait1Seconds();
	    elementClick(o.getInterfacecleartwo());
	    wait1Seconds();
	}

	@Given("User have to click the coupling interface sort one option")
	public void user_have_to_click_the_coupling_interface_sort_one_option()throws InterruptedException {
	    elementClick(o.getInterfacesortone());
	    wait1Seconds();
	}

	@Given("User have to click the coupling interface name sort")
	public void user_have_to_click_the_coupling_interface_name_sort()throws InterruptedException {
		 elementClick(o.getInterfacesortname());
		    wait1Seconds();
		
	}

	@Given("User have to click the coupling interface created date sort")
	public void user_have_to_click_the_coupling_interface_created_date_sort()throws InterruptedException {
		 elementClick(o.getInterfacesortone());
		    wait1Seconds();
		    elementClick(o.getInterfacesortcreateddate());
		    wait1Seconds();
	}

	@Given("User have to click the coupling interface modifed date sort")
	public void user_have_to_click_the_coupling_interface_modifed_date_sort()throws InterruptedException {
		 elementClick(o.getInterfacesortone());
		    wait1Seconds();
		    elementClick(o.getInterfacesortmodifieddate());
		    wait1Seconds();
	}

	@When("User have to click the coupling interface sort two option")
	public void user_have_to_click_the_coupling_interface_sort_two_option()throws InterruptedException {
		 elementClick(o.getInterfacesorttwo());
		    wait1Seconds();
	}

	@When("User have to click the coupling interface ASC sort")
	public void user_have_to_click_the_coupling_interface_ASC_sort() throws InterruptedException{
		 elementClick(o.getInterfacesortasc());
		    wait1Seconds();
	}

	@When("User have to click the coupling interface DESC sort")
	public void user_have_to_click_the_coupling_interface_DESC_sort() throws InterruptedException {
		 elementClick(o.getInterfacesorttwo());
		    wait1Seconds();
		    elementClick(o.getInterfacesortdesc());
		    wait1Seconds();
	}
	
	
	
	//check the functionality of device filter option
	
	
	@When("User have to click the device by box")
	public void user_have_to_click_the_device_by_box()throws InterruptedException {
	    
		elementClick(o.getDevicebyoptionbox());
		wait1Seconds();
	}

	@When("User have to check the types of deviceby filter")
	public void user_have_to_check_the_types_of_deviceby_filter()throws InterruptedException {
	    
		elementClick(o.getDevicesortall());
		wait1Seconds();
		elementClick(o.getDevicebyoptionbox());
		wait1Seconds();
		elementClick(o.getDevicesortcouplerhead());
		wait1Seconds();
		elementClick(o.getDevicebyoptionbox());
		wait1Seconds();
		elementClick(o.getDevicesortcouplerbar());
		wait1Seconds();
		elementClick(o.getDevicebyoptionbox());
		wait1Seconds();
		
	
	}
	
	@Then("User have to set defalut device all filter option")
	public void user_have_to_set_defalut_device_all_filter_option() throws InterruptedException{
		elementClick(o.getDevicesortall());
		wait1Seconds();
	}

	@Given("User have to send the same device name in search box")
	public void user_have_to_send_the_same_device_name_in_search_box()throws InterruptedException {
	    sendKeys(o.getDevicesearchbox(),"Coupler head");
	    wait1Seconds();
	}

	@When("User have to clear the device search box")
	public void user_have_to_clear_the_device_search_box()throws InterruptedException {
	    o.getDevicesearchbox().clear();
	  wait1Seconds();  
	}

	@Then("User have to click the refresh button")
	public void user_have_to_click_the_refresh_button() throws InterruptedException{
		driver.navigate().refresh();
		wait1Seconds();
	}

	@Given("User have to click the device date from box")
	public void user_have_to_click_the_device_date_from_box() throws InterruptedException{
		elementClick(o.getDevicedatefrom());
		wait1Seconds();
	}

	@Given("User have to click the device date six")
	public void user_have_to_click_the_device_date_six()throws InterruptedException {
		elementClick(o.getDevicedatesix());
		wait1Seconds();
	}

	@When("User have to click the device date to box")
	public void user_have_to_click_the_device_date_to_box()throws InterruptedException {
		elementClick(o.getDevicedateto());
		wait1Seconds();
	}

	@When("User have to click the device date seven")
	public void user_have_to_click_the_device_date_seven()throws InterruptedException {
		elementClick(o.getDevicedateseven());
		wait1Seconds();
	}

	@Then("User have to clear the both device date filter option")
	public void user_have_to_clear_the_both_device_date_filter_option()throws InterruptedException {
		elementClick(o.getDevicedatefrom());
		wait1Seconds();
		elementClick(o.getDevicedateclearone());
		wait1Seconds();
		elementClick(o.getDevicedateto());
		wait1Seconds();
		elementClick(o.getDevicedatecleartwo());
		wait1Seconds();
		
	}

	@Given("User have to click the device sort one")
	public void user_have_to_click_the_device_sort_one() throws InterruptedException{
		elementClick(o.getDevicesortone());
		wait1Seconds();
	}

	@Given("User have to check the types of device sort one options")
	public void user_have_to_check_the_types_of_device_sort_one_options()throws InterruptedException {
		elementClick(o.getDevicesortname());
		wait1Seconds();
		elementClick(o.getDevicesortone());
		wait1Seconds();
		elementClick(o.getDevicesortcreateddate());
		wait1Seconds();
		wait1Seconds();
		Select S =s = new Select(o.getDevicesortone());
		S.selectByVisibleText("Modified date");
		Thread.sleep(3000);
	}

	@When("User have to click the device sort two")
	public void user_have_to_click_the_device_sort_two()throws InterruptedException {
		elementClick(o.getDevicesorttwo());
		wait1Seconds();
	}

	@When("User have to click the types of device sort two option")
	public void user_have_to_click_the_types_of_device_sort_two_option() throws InterruptedException {
		elementClick(o.getDevicesortasc());
		wait1Seconds();
		elementClick(o.getDevicesorttwo());
		wait1Seconds();
		elementClick(o.getDevicesortdesc());
		Thread.sleep(3000);
	}
	
	
	
	//Check the functionality of shared library filter option
	
	
	@When("User have to click the shared library status button")
	public void user_have_to_click_the_shared_library_status_button()throws InterruptedException {
	    
		elementClick(o.getSharedlibrarystatusbox());
		wait1Seconds();
		
	}

	@When("User have to select the shared library sort all")
	public void user_have_to_select_the_shared_library_sort_all()throws InterruptedException {
		elementClick(o.getSharedlibrarysortall());
		wait1Seconds();
	}

	@When("User have to click the shared library sort Published")
	public void user_have_to_click_the_shared_library_sort_Published()throws InterruptedException {
		elementClick(o.getSharedlibrarystatusbox());
		wait1Seconds();
		elementClick(o.getSharedlibrarysortpublished());
		wait1Seconds();
	}

	@When("User have to click the shared library sort Unpublished")
	public void user_have_to_click_the_shared_library_sort_Unpublished()throws InterruptedException {
		elementClick(o.getSharedlibrarystatusbox());
		wait1Seconds();
		elementClick(o.getSharedlibrarysortunpublished());
		wait1Seconds();
	}

	@Then("User have to click the shared library sort default")
	public void user_have_to_click_the_shared_library_sort_default()throws InterruptedException {
		elementClick(o.getSharedlibrarystatusbox());
		wait1Seconds();
		elementClick(o.getSharedlibrarysortall());
		wait1Seconds();
	}

	@Given("User have to send the value on shared library search box")
	public void user_have_to_send_the_value_on_shared_library_search_box()throws InterruptedException {
	    sendKeys(o.getSharedlibrarysearchbox(),"Buffer stop impact");
	    wait1Seconds();
	}

	@When("User have to clear the shared library search box")
	public void user_have_to_clear_the_shared_library_search_box()throws InterruptedException {
	 
		o.getSharedlibrarysearchbox().clear();
		wait1Seconds();
	}
	

	@Then("User have to refresh the shared library page")
	public void user_have_to_refresh_the_shared_library_page()throws InterruptedException {
		navigateRefresh();
		wait1Seconds();
	}

	
	@Given("User have to click the shared library date from box")
	public void user_have_to_click_the_shared_library_date_from_box()throws InterruptedException {
		elementClick(o.getSharedlibrarydatefrom());
		wait1Seconds();
	}

	@Given("User have to click the shared library date six")
	public void user_have_to_click_the_shared_library_date_six()throws InterruptedException {
		elementClick(o.getSharedlibrarydatesix());
		wait1Seconds();
	}

	@When("User have to click the shared library date to box")
	public void user_have_to_click_the_shared_library_date_to_box()throws InterruptedException {
		elementClick(o.getSharedlibrarydateto());
		wait1Seconds();
	}
	

	@When("User have to click the shared library date seven")
	public void user_have_to_click_the_shared_library_date_seven()throws InterruptedException {
		elementClick(o.getSharedlibrarydateseven());
		wait1Seconds();
	}

	
	@Then("User have to clear the both shared library filter option")
	public void user_have_to_clear_the_both_shared_library_filter_option()throws InterruptedException {
		elementClick(o.getSharedlibrarydatefrom());
		wait1Seconds();
		elementClick(o.getSharedlibrarycencelone());
		wait1Seconds();
		elementClick(o.getSharedlibrarydateto());
		wait1Seconds();
		elementClick(o.getSharedlibrarycanceltwo());
		wait1Seconds();
	}
	

	@Given("User have to click the shared library sort one")
	public void user_have_to_click_the_shared_library_sort_one()throws InterruptedException {
		elementClick(o.getSharedlibrarysortone());
		wait1Seconds();
	}

	
	@Given("User have to check types of shared library sort one")
	public void user_have_to_check_types_of_shared_library_sort_one()throws InterruptedException {
		elementClick(o.getSharedlibrarysortname());
		wait1Seconds();
		elementClick(o.getSharedlibrarysortone());
		wait1Seconds();
		elementClick(o.getSharedlibrarysortcreateddate());
		wait1Seconds();
		elementClick(o.getSharedlibrarysortone());
		wait1Seconds();
		elementClick(o.getSharedlibrarysortmodifieddate());
		wait1Seconds();
	}

	
	
	@When("User have to click the shared library sort two")
	public void user_have_to_click_the_shared_library_sort_two() throws InterruptedException{
		elementClick(o.getSharedlibrarysorttwo());
		wait1Seconds();
	}
	
	

	@When("User have to check types of shared library sort two")
	public void user_have_to_check_types_of_shared_library_sort_two() throws InterruptedException {
		elementClick(o.getSharedlibrarysortasc());
		wait1Seconds();
		elementClick(o.getSharedlibrarysorttwo());
		wait1Seconds();
		elementClick(o.getSharedlibrarysortdesc());
		wait1Seconds();
	}
	
	
	
	//check the functionality of Admin Area options
	
	

@Given("User have to click the user name and select the admin area option")
public void user_have_to_click_the_user_name_and_select_the_admin_area_option() throws InterruptedException {
    
	elementClick(o.getAdminusername());
	wait1Seconds();
	elementClick(o.getAdminareabutton());
	wait1Seconds();
	String currentUrl = driver.getCurrentUrl();
    Assert.assertEquals("check the url of admin page","https://testphp.digitaltrains.online/admin",currentUrl);
    System.out.println("User have to enter the currect admin url");
}

@When("User have to click the admin user option and Scrolldwon")
public void user_have_to_click_the_admin_user_option_and_Scrolldwon()throws InterruptedException {
    elementClick(o.getAdminuseroption());
    wait1Seconds();
	String currentUrl = driver.getCurrentUrl();
    Assert.assertEquals("check the url of user","https://testphp.digitaltrains.online/admin/users",currentUrl);
    wait1Seconds();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
    Thread.sleep(2000);
}

@When("User have to click the admin under user companies option and Scrolldwon")
public void user_have_to_click_the_admin_under_user_companies_option_and_Scrolldwon()throws InterruptedException {
    
	elementClick(o.getAdmincompanies());
	wait1Seconds();
	String currentUrl = driver.getCurrentUrl();
    Assert.assertEquals("check the url of companies","https://testphp.digitaltrains.online/admin/companies",currentUrl);
	wait1Seconds();  
    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
	    Thread.sleep(2000);
}

@Then("User have to click the admin back button")
public void user_have_to_click_the_admin_back_button()throws InterruptedException {
    navigateBack();
    wait1Seconds();
}

@Given("User have to click the admin invoice button")
public void user_have_to_click_the_admin_invoice_button()throws InterruptedException {
    elementClick(o.getAdmininvoices());
    wait1Seconds();
	String currentUrl = driver.getCurrentUrl();
    Assert.assertEquals("check the url of invoice","https://testphp.digitaltrains.online/admin/invoices",currentUrl);
}

@Given("User have to click the admin invoice option under invoice button")
public void user_have_to_click_the_admin_invoice_option_under_invoice_button() throws InterruptedException{
    elementClick(o.getAdminsecondinvoices());
    wait1Seconds();
}

@Given("User have to scrolldwon the admin invoice page")
public void user_have_to_scrolldwon_the_admin_invoice_page()throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
	Thread.sleep(2000);
}

@When("User have to click the admin subscription option under the invoice button")
public void user_have_to_click_the_admin_subscription_option_under_the_invoice_button()throws InterruptedException {
	 elementClick(o.getAdminsubscriptions());
	    wait1Seconds();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals("check the url of subsricption","https://testphp.digitaltrains.online/admin/invoices/subscriptions",currentUrl);
}

@When("User have to scrolldwon the admin subscription page")
public void user_have_to_scrolldwon_the_admin_subscription_page()throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
	Thread.sleep(2000);
}

@Given("User have to click the admin files button")
public void user_have_to_click_the_admin_files_button()throws InterruptedException {
    elementClick(o.getAdminfiles());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    Assert.assertEquals("check the url of file","https://testphp.digitaltrains.online/admin/files",currentUrl);
}

@Given("User have to click the admin library and scrolldwon")
public void user_have_to_click_the_admin_library_and_scrolldwon()throws InterruptedException {
	   elementClick(o.getAdminlibrary());
	    wait1Seconds();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
        Thread.sleep(2000);
}

@Given("User have to click the admin superseded and scrolldwon")
public void user_have_to_click_the_admin_superseded_and_scrolldwon()throws InterruptedException {
	   elementClick(o.getAdminsuperseded());
	    wait1Seconds();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
	    Thread.sleep(2000);
}

@When("User have to click the admin archive and scrolldwon")
public void user_have_to_click_the_admin_archive_and_scrolldwon()throws InterruptedException {
	   elementClick(o.getAdminarchived());
	    wait1Seconds();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
	    Thread.sleep(2000);
}

@When("User have to click the admin upload file and scrolldwon")
public void user_have_to_click_the_admin_upload_file_and_scrolldwon()throws InterruptedException {
	   elementClick(o.getAdminuploadfile());
	    wait1Seconds();
}

@Then("User have to click the admin upload cancel button")
public void user_have_to_click_the_admin_upload_cancel_button()throws InterruptedException {
    elementClick(o.getAdminuploadfilecancel());
    Thread.sleep(2000);
}

@Given("User have to click the admin config button")
public void user_have_to_click_the_admin_config_button()throws InterruptedException {
	   elementClick(o.getAdminconfig());
	    wait1Seconds();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals("check the url of config","https://testphp.digitaltrains.online/admin/config",currentUrl);
}

@Given("User have to click the admin vehicle type option")
public void user_have_to_click_the_admin_vehicle_type_option()throws InterruptedException {
	   elementClick(o.getAdminvehicletypes());
	    wait1Seconds();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
	    Thread.sleep(2000);
}

@When("User have to click the admin device mounting diagram option")
public void user_have_to_click_the_admin_device_mounting_diagram_option()throws InterruptedException {
	   elementClick(o.getAdmindevicemountingdiagrams());
	    wait1Seconds();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals("check the url of device mounting","https://testphp.digitaltrains.online/admin/config/mountings",currentUrl);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
	    Thread.sleep(2000);
}
@When("User have to check the all options under mounting diagram")
public void user_have_to_check_the_all_options_under_mounting_diagram() throws InterruptedException {
    elementClick(o.getAdminanticliber());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    Assert.assertEquals("check the url of device anticliber","https://testphp.digitaltrains.online/admin/config/mountings/climber",currentUrl);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
    Thread.sleep(2000);
    elementClick(o.getAdminsidebuffer());
    wait1Seconds();
    String currentUrl1 = driver.getCurrentUrl();
    Assert.assertEquals("check the url of device side buffers","https://testphp.digitaltrains.online/admin/config/mountings/buffer",currentUrl1);
    js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
    Thread.sleep(2000);
    elementClick(o.getAdminbuffercasing());
    wait1Seconds();
    String currentUrl2 = driver.getCurrentUrl();
    Assert.assertEquals("check the url of device buffer casing","https://testphp.digitaltrains.online/admin/config/mountings/buffer-casing",currentUrl2);
    js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
    Thread.sleep(2000);
    elementClick(o.getAdminpivotassembly());
    wait1Seconds();
    String currentUrl3 = driver.getCurrentUrl();
    Assert.assertEquals("check the url of device pivot assembly","https://testphp.digitaltrains.online/admin/config/mountings/pivot",currentUrl3);
    js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
    Thread.sleep(2000);
}


@When("User have to click the admin currency option")
public void user_have_to_click_the_admin_currency_option()throws InterruptedException {
	   elementClick(o.getAdmincurrency());
	    wait1Seconds();
	    wait1Seconds();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals("check the url of currency","https://testphp.digitaltrains.online/admin/config/currency",currentUrl);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",o.getAdminpreviousbutton());
	    Thread.sleep(2000);
}

@When("User have to click the admin device configrator option")
public void user_have_to_click_the_admin_device_configrator_option()throws InterruptedException {
	   elementClick(o.getAdmindeviceconfigurator());
	    wait1Seconds();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals("check the url of device configrator","https://testphp.digitaltrains.online/admin/config/deviceconfigurator",currentUrl);
	   
}

@When("User have to check the all options under device configrator")
public void user_have_to_check_the_all_options_under_device_configrator() throws InterruptedException {
	elementClick(o.getAdimnautocouplingelectricalhead());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    Assert.assertEquals("check the url of config coupling electric head","https://testphp.digitaltrains.online/admin/config/deviceconfigurator/automatic-coupling-head/electrical-head",currentUrl);
    elementClick(o.getAdminautocouplingmechanicalhead());
    wait1Seconds();
    String currentUrl1 = driver.getCurrentUrl();
    Assert.assertEquals("check the url of config coupling mechanical head","https://testphp.digitaltrains.online/admin/config/deviceconfigurator/automatic-coupling-head/mechanical-head",currentUrl1);
    elementClick(o.getAdminpivotassemblyadditionalextras());
    wait1Seconds();
    String currentUrl2 = driver.getCurrentUrl();
    Assert.assertEquals("check the url of config additionalextras","https://testphp.digitaltrains.online/admin/config/deviceconfigurator/pivot-assembly/additional-extras",currentUrl2);
    elementClick(o.getAdminextrasmuff());
    wait1Seconds();
    String currentUrl3 = driver.getCurrentUrl();
    Assert.assertEquals("check the url of config extrasmuff","https://testphp.digitaltrains.online/admin/config/deviceconfigurator/extras/muff",currentUrl3);
    elementClick(o.getAdminextrasfinal());
    wait1Seconds();
    String currentUrl4 = driver.getCurrentUrl();
    Assert.assertEquals("check the url of config extrasfinal","https://testphp.digitaltrains.online/admin/config/deviceconfigurator/extras/final",currentUrl4);
}



@Then("User have to click the admin train builder templates option")
public void user_have_to_click_the_admin_train_builder_templates_option()throws InterruptedException {
	   elementClick(o.getAdmintrainbuildertemplates());
	    wait1Seconds();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals("check the url of templates","https://testphp.digitaltrains.online/admin/config/traintemplate",currentUrl);
	    
	
}

@Given("User have to click the admin report button")
public void user_have_to_click_the_admin_report_button()throws InterruptedException {
	 elementClick(o.getAdminreports());
	    wait1Seconds();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals("check the url of admin reports","https://testphp.digitaltrains.online/admin/reports",currentUrl);
	    
}

@Given("User have to check the report under companies types of filter")
public void user_have_to_check_the_report_under_companies_types_of_filter()throws InterruptedException {
	    elementClick(o.getAdmincompanyfilterbox());
	    wait1Seconds();
	    elementClick(o.getAdminsortall());
	    Thread.sleep(1000);
	    elementClick(o.getAdmincompanyfilterbox());
	    wait1Seconds();
	    elementClick(o.getAdminsortoleointernational());
	    wait1Seconds();
	    elementClick(o.getAdmincompanyfilterbox());
	    wait1Seconds();
	    elementClick(o.getAdminsortdeletedcompany());
	    wait1Seconds();
}

@Given("User have to set the report companies default all")
public void user_have_to_set_the_report_companies_default_all()throws InterruptedException {
	    elementClick(o.getAdmincompanyfilterbox());
	    wait1Seconds();
	    elementClick(o.getAdminsortall());
	    Thread.sleep(7000);
}

@Given("User have to click the admin all report enable the checkbox")
public void user_have_to_click_the_admin_all_report_enable_the_checkbox()throws InterruptedException {
	 elementClick(o.getAdminallreports());
	 Thread.sleep(7000);
}

@Given("User have to click the admin devices option")
public void user_have_to_click_the_admin_devices_option()throws InterruptedException {
	 elementClick(o.getAdminreportdevices());
	    wait1Seconds();

}

@Given("User have to check the all option of under the device")
public void user_have_to_check_the_all_option_of_under_the_device()throws InterruptedException {
    elementClick(o.getAdmindevicescreated());
    wait1Seconds();
    elementClick(o.getAdmindevicessent());
    wait1Seconds();
    elementClick(o.getAdmindevicedigitaltwins());
    wait1Seconds();
    elementClick(o.getAdmindeviceclimberattachestointerfaces());
    wait1Seconds();
    elementClick(o.getAdmindevicebufferattachedtointerfaces());
    wait1Seconds();
    elementClick(o.getAdmindevicehydroliccouplershanksattachedinterfaces());
    wait1Seconds();
    elementClick(o.getAdmindevicecouplerheadsattachedinterfaces());
    wait1Seconds();
    elementClick(o.getAdmindevicegashydraulicsattachedinterfaces());
    wait1Seconds();
    elementClick(o.getAdmindevicedeformationtubesattachedinterface());
    wait1Seconds();
    elementClick(o.getAdmindevicesprindsandrubbers());
    wait1Seconds();
    elementClick(o.getAdmindeviceshearsattachedinterfaces());
    wait1Seconds();
    elementClick(o.getAdmindevicepivotassembliesattached());
    wait1Seconds();
    elementClick(o.getAdmindevicefrictionshoesattached());
    wait1Seconds();
    elementClick(o.getAdmindeviceindustrialhydraulicsattached());
    wait1Seconds();
    elementClick(o.getAdmindeviceendstopbuffersattached());
    wait1Seconds();
    elementClick(o.getAdmindeviceendstopbufferrubbersattached());
    wait1Seconds();
    elementClick(o.getAdmindevicedrawgearattached());
    wait1Seconds();
}

@When("User have to click the admin project and simulation option")
public void user_have_to_click_the_admin_project_and_simulation_option() throws InterruptedException{
	elementClick(o.getAdminreportprojectandsimulations());
    wait1Seconds();
	
 
}

@When("User have to check the all option of under the project and simulation")
public void user_have_to_check_the_all_option_of_under_the_project_and_simulation()throws InterruptedException {
	elementClick(o.getAdminreportprojectcreated());
    wait1Seconds();
    elementClick(o.getAdminreportsimulationscreated());
    wait1Seconds();
    elementClick(o.getAdminreportsimulationsent());
    wait1Seconds();
    elementClick(o.getAdminreportsimulationsrun());
    wait1Seconds();
    elementClick(o.getAdminreportsimulationPDFgenerated());
    wait1Seconds();
    elementClick(o.getAdminreportsimulationsdevicedrawings());
    wait1Seconds();
   
}

@When("User have to click the admin train buffer stop and vehicle option")
public void user_have_to_click_the_admin_train_buffer_stop_and_vehicle_option()throws InterruptedException {
	elementClick(o.getAdminreporttrainvehiclesbufferstopinterfaces());
    wait1Seconds();
}

@When("User have to check the all option under the train bufferstop and vehicle")
public void user_have_to_check_the_all_option_under_the_train_bufferstop_and_vehicle()throws InterruptedException {
	elementClick(o.getAdminreporttrainscreated());
    wait1Seconds();
    elementClick(o.getAdminreporttrainsent());
    wait1Seconds();
    elementClick(o.getAdminreportvehiclescreated());
    wait1Seconds();
    elementClick(o.getAdminreportvehiclessent());
    wait1Seconds();
    elementClick(o.getAdminreportendstopscreated());
    wait1Seconds();
    elementClick(o.getAdminreportendstopssent());
    wait1Seconds();
    elementClick(o.getAdminreportinterfacescreated());
    wait1Seconds();
    elementClick(o.getAdminreportinterfacessent());
    wait1Seconds();
}

@When("User have to click the admin route profile option")
public void user_have_to_click_the_admin_route_profile_option() throws InterruptedException{
	elementClick(o.getAdminreportrouteprofiles());
    wait1Seconds();
}

@When("User have to check the all option under the route profile")
public void user_have_to_check_the_all_option_under_the_route_profile()throws InterruptedException {
	elementClick(o.getAdminreportrouteprofilescreated());
    wait1Seconds();
    elementClick(o.getAdminreportrouteprofilessent());
    wait1Seconds();
}

@When("User have to click the admin gauges option")
public void user_have_to_click_the_admin_gauges_option()throws InterruptedException {
	elementClick(o.getAdminreportgauges());
    wait1Seconds();
}

@Then("User have to check the all option under the gauges option")
public void user_have_to_check_the_all_option_under_the_gauges_option()throws InterruptedException {
	elementClick(o.getAdminreportgaugescreated());
    wait1Seconds();
    elementClick(o.getAdminreportgaugessent());
    wait1Seconds();
    quitTab();
}

	
	

 //Create the Air spring Bogie(semiwheelbase,wheelradius,semitrackgauge)



//Air spring bogie parameter creation 
@When("User have to enter air spring bogies name and create")
public void user_have_to_enter_air_spring_bogies_name_and_create() throws InterruptedException {
    sendKeys(o.getAirspringbogienamebox(),"Air Spring Bogie");
    wait1Seconds();
    elementClick(o.getAirspringbogiecreatebutton());
    wait5seconds();
}
@Then("User have click the air spring parameter and save")
public void user_have_click_the_air_spring_parameter_and_save()throws InterruptedException {
	    o.getAirspringfirstparameterbox().clear();
	    wait1Seconds();
		sendKeys(o.getAirspringfirstparameterbox(),"1285");
		o.getAirspringsecondparameterbox().clear();
		wait1Seconds();
		sendKeys(o.getAirspringsecondparameterbox(),"475");
		o.getAirspringthiredparameterbox().clear();
		wait1Seconds();
		sendKeys(o.getAirspringthiredparameterbox(),"717.5");
		elementClick(o.getAirspringsaveparameter());
		wait1Seconds();
}


//Air spring Boige mass creation

@Given("User have to click the air spring add button")
public void user_have_to_click_the_air_spring_add_button()throws InterruptedException {
    elementClick(o.getAirspringadd());
    wait1Seconds();
    
}

@Given("User have to click the air spring mass option")
public void user_have_to_click_the_air_spring_mass_option()throws InterruptedException {
	elementClick(o.getAirspringmass());
	wait1Seconds();
}

@When("User have to fill the air spring mass data")
public void user_have_to_fill_the_air_spring_mass_data()throws InterruptedException {
    sendKeys(o.getAirspringmassnamebox(),"Bogie frame");
    o.getAirspringmasspositionzbox().clear();
    sendKeys(o.getAirspringmasspositionzbox(),"0.56");
    wait1Seconds();

}

@When("User have to click the air spring inertia and fill the data")
public void user_have_to_click_the_air_spring_inertia_and_fill_the_data()throws InterruptedException {
    elementClick(o.getAirspringmassinertia());
    o.getAirspringmassinertiamass().clear();
    sendKeys(o.getAirspringmassinertiamass(),"2000");
    o.getAirspringmassinertiarollinertia().clear();
    sendKeys(o.getAirspringmassinertiarollinertia(),"1000");
    o.getAirspringmassinertiapitchinertia().clear();
    sendKeys(o.getAirspringmassinertiapitchinertia(),"1000");
    o.getAirspringmassinertiayawinertia().clear();
    sendKeys(o.getAirspringmassinertiayawinertia(),"2500");
   
    
}

@Then("User have to click the air spring save button")
public void user_have_to_click_the_air_spring_save_button() throws InterruptedException {
	 elementClick(o.getAirspringmasssavebutton());
	    wait1Seconds();
	    elementClick(o.getAirspringsrefreshbutton());
	    wait5seconds();
}

	

//Air spring Bogie wheel set creation



@Given("User have to click the air spring wheelset option")
public void user_have_to_click_the_air_spring_wheelset_option() throws InterruptedException {
    elementClick(o.getAirspringwheelset());
    wait1Seconds();
}

@Given("User have to fill the air spring wheelset data")
public void user_have_to_fill_the_air_spring_wheelset_data() throws InterruptedException {
    sendKeys(o.getAirspringwheelsetnamebox(), "003wheelsetL");
    o.getAirspringwheelsetxbox().clear();
    sendKeys(o.getAirspringwheelsetxbox(), "-semiwheelbase");
    o.getAirspringwheelsetzbox().clear();
    sendKeys(o.getAirspringwheelsetzbox(), "wheelradius");
    elementClick(o.getAirspringwheelsetinertia());
    o.getAirspringwheelsetinertiamass().clear();
    sendKeys(o.getAirspringwheelsetinertiamass(), "1120");
    o.getAirspringwheelsetinertiaroll().clear();
    sendKeys(o.getAirspringwheelsetinertiaroll(), "730");
    elementClick(o.getAirspringwheelsetinertiaaxelboxcheckbox());
    o.getAirspringwheelsetinertiaaxelbox().clear();
    sendKeys(o.getAirspringwheelsetinertiaaxelbox(), "30");
    elementClick(o.getAirsparigwheelsetsavebutton());
    wait1Seconds();
    elementClick(o.getAirspringsrefreshbutton());
    wait5seconds();
    
}

@When("User have to click the air spring wheelset two option")
public void user_have_to_click_the_air_spring_wheelset_two_option() throws InterruptedException {
	   elementClick(o.getAirspringwheelset());
	    wait1Seconds();
}

@When("User have to fill the air spring wheelset two data")
public void user_have_to_fill_the_air_spring_wheelset_two_data() throws InterruptedException {
    sendKeys(o.getAirspringwheelsetnamebox(), "003wheelsetT");
    elementClick(o.getAirspringwheelsetposition());
    o.getAirspringwheelsetxbox().clear();
    sendKeys(o.getAirspringwheelsetxbox(), "semiwheelbase");
    o.getAirspringwheelsetzbox().clear();
    sendKeys(o.getAirspringwheelsetzbox(), "wheelradius");
    elementClick(o.getAirspringwheelsetinertia());
    o.getAirspringwheelsetinertiamass().clear();
    sendKeys(o.getAirspringwheelsetinertiamass(), "1120");
    o.getAirspringwheelsetinertiaroll().clear();
    sendKeys(o.getAirspringwheelsetinertiaroll(), "730");
    elementClick(o.getAirspringwheelsetinertiaaxelboxcheckbox());
    o.getAirspringwheelsetinertiaaxelbox().clear();
    sendKeys(o.getAirspringwheelsetinertiaaxelbox(), "30");

    
}

@Then("User have to click the air spring wheelset save button")
public void user_have_to_click_the_air_spring_wheelset_save_button() throws InterruptedException {
    elementClick(o.getAirsparigwheelsetsavebutton());
    wait1Seconds();
    elementClick(o.getAirspringsrefreshbutton());
    wait5seconds();
  
}



//create the Air spring bush

@Given("User have to click the air spring bush option")
public void user_have_to_click_the_air_spring_bush_option() throws InterruptedException {
    
	elementClick(o.getAirspringbush());
	wait1Seconds();
	
}

@Given("User have to fill the air spring bush one data")
public void user_have_to_fill_the_air_spring_bush_one_data() throws InterruptedException {
    sendKeys(o.getAirspringbushnamebox(),"033Prime_bush_LL");
    o.getAirspringbushxbox().clear();
    sendKeys(o.getAirspringbushxbox(),"semiwheelbase-0.5");
    o.getAirspringbushybox().clear();
    sendKeys(o.getAirspringbushybox(),"-1.0");
    o.getAirspringbushzbox().clear();
    sendKeys(o.getAirspringbushzbox(),"0.455");
    elementClick(o.getAirspringbushmassbox());
    elementClick(o.getAirspringbushbogieframe());
    wait1Seconds();
    elementClick(o.getAirspringbushmassbox());
    elementClick(o.getAirspringbush003wheelsett());
    wait1Seconds();
    elementClick(o.getAirspringbushstiffness());
    elementClick(o.getAirspringbushstiffnesscheckbox());
    o.getAirspringbushstiffnessxbox().clear();
    sendKeys(o.getAirspringbushstiffnessxbox(),"8.0");
    o.getAirspringbushstiffnessybox().clear();
    sendKeys(o.getAirspringbushstiffnessybox(),"2.0");
    o.getAirspringbushstiffnesszbox().clear();
    sendKeys(o.getAirspringbushstiffnesszbox(),"8.0");
    o.getAirspringbushstiffnesspitch().clear();
    sendKeys(o.getAirspringbushstiffnesspitch(),"0.005");
    wait1Seconds();
    elementClick(o.getAirspringbushdamping());
    elementClick(o.getAirspringbushdampingcheckbox());
    o.getAirspaingbushdampingxbox().clear();
    sendKeys(o.getAirspaingbushdampingxbox(),"0.008");
    o.getAirspringbushdampingybox().clear();
    sendKeys(o.getAirspringbushdampingybox(),"0.002");
    o.getAirspringbushdampingzbox().clear();
    sendKeys(o.getAirspringbushdampingzbox(),"0.008");
    o.getAirspringbushdampingpitchbox().clear();
    sendKeys(o.getAirspringbushdampingpitchbox(),"0.0004");
    wait1Seconds();
    elementClick(o.getAirspringbushseriesstiffness());
    elementClick(o.getAirspringbushseriesstiffnesscheckbox());
    o.getAirspringbushseriesstiffnessxbox().clear();
    sendKeys(o.getAirspringbushseriesstiffnessxbox(),"8.0");
    o.getAirspringbushseriesstiffnessybox().clear();
    sendKeys(o.getAirspringbushseriesstiffnessybox(),"2.0");
    o.getAirspringbushseriesstiffnesszbox().clear();
    sendKeys(o.getAirspringbushseriesstiffnesszbox(),"8.0");
    o.getAirspringbushseriesstiffnesspitchbox().clear();
    sendKeys(o.getAirspringbushseriesstiffnesspitchbox(),"0.005");
    wait1Seconds();
    elementClick(o.getAirspringbushappearance());
    elementClick(o.getAirspringbushappearancebush());
    elementClick(o.getAirspringbushappearancesmall());
    elementClick(o.getAirspringbushappearanceyaxis());
    wait1Seconds();
    elementClick(o.getAirspringbushsavebutton());
    wait1Seconds();
    elementClick(o.getAirspringsrefreshbutton());
    wait5seconds();
    
    
	
}

@When("User have to fill the air spring bush two data")
public void user_have_to_fill_the_air_spring_bush_two_data()throws InterruptedException {
    sendKeys(o.getAirspringbushnamebox(),"033Prime_bush_LR");
    elementClick(o.getAirspringbushposition());
    o.getAirspringbushxbox().clear();
    sendKeys(o.getAirspringbushxbox(),"semiwheelbase-0.5");
    o.getAirspringbushybox().clear();
    sendKeys(o.getAirspringbushybox(),"1.0");
    o.getAirspringbushzbox().clear();
    sendKeys(o.getAirspringbushzbox(),"0.455");
    elementClick(o.getAirspringbushmassbox());
    wait1Seconds();
    elementClick(o.getAirspringbushbogieframe());
    elementClick(o.getAirspringbushmassbox());
    wait1Seconds();
    elementClick(o.getAirspringbush003wheelsett());
    wait1Seconds();
    elementClick(o.getAirspringbushstiffness());
    elementClick(o.getAirspringbushstiffnesscheckbox());
    o.getAirspringbushstiffnessxbox().clear();
    sendKeys(o.getAirspringbushstiffnessxbox(),"8.0");
    o.getAirspringbushstiffnessybox().clear();
    sendKeys(o.getAirspringbushstiffnessybox(),"2.0");
    o.getAirspringbushstiffnesszbox().clear();
    sendKeys(o.getAirspringbushstiffnesszbox(),"8.0");
    o.getAirspringbushstiffnesspitch().clear();
    sendKeys(o.getAirspringbushstiffnesspitch(),"0.005");
    wait1Seconds();
    elementClick(o.getAirspringbushdamping());
    elementClick(o.getAirspringbushdampingcheckbox());
    o.getAirspaingbushdampingxbox().clear();
    sendKeys(o.getAirspaingbushdampingxbox(),"0.008");
    o.getAirspringbushdampingybox().clear();
    sendKeys(o.getAirspringbushdampingybox(),"0.002");
    o.getAirspringbushdampingzbox().clear();
    sendKeys(o.getAirspringbushdampingzbox(),"0.008");
    o.getAirspringbushdampingpitchbox().clear();
    sendKeys(o.getAirspringbushdampingpitchbox(),"0.0004");
    wait1Seconds();
    elementClick(o.getAirspringbushseriesstiffness());
    elementClick(o.getAirspringbushseriesstiffnesscheckbox());
    o.getAirspringbushseriesstiffnessxbox().clear();
    sendKeys(o.getAirspringbushseriesstiffnessxbox(),"8.0");
    o.getAirspringbushseriesstiffnessybox().clear();
    sendKeys(o.getAirspringbushseriesstiffnessybox(),"2.0");
    o.getAirspringbushseriesstiffnesszbox().clear();
    sendKeys(o.getAirspringbushseriesstiffnesszbox(),"8.0");
    o.getAirspringbushseriesstiffnesspitchbox().clear();
    sendKeys(o.getAirspringbushseriesstiffnesspitchbox(),"0.005");
    wait1Seconds();
    elementClick(o.getAirspringbushappearance());
    elementClick(o.getAirspringbushappearancebush());
    elementClick(o.getAirspringbushappearancesmall());
    elementClick(o.getAirspringbushappearanceyaxis());
    wait1Seconds();
    elementClick(o.getAirspringbushsavebutton());
    wait1Seconds();
    elementClick(o.getAirspringsrefreshbutton());
    wait5seconds();
	
}

@When("User have to fill the air spring bush three data")
public void user_have_to_fill_the_air_spring_bush_three_data()throws InterruptedException {
	  sendKeys(o.getAirspringbushnamebox(),"033Prime_bush_TL");
	    elementClick(o.getAirspringbushposition());
	    o.getAirspringbushxbox().clear();
	    sendKeys(o.getAirspringbushxbox(),"-semiwheelbase+0.5");
	    o.getAirspringbushybox().clear();
	    sendKeys(o.getAirspringbushybox(),"-1.0");
	    o.getAirspringbushzbox().clear();
	    sendKeys(o.getAirspringbushzbox(),"0.455");
	    elementClick(o.getAirspringbushmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringbushbogieframe());
	    elementClick(o.getAirspringbushmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringbush003wheelsetl());
	    wait1Seconds();
	    elementClick(o.getAirspringbushstiffness());
	    elementClick(o.getAirspringbushstiffnesscheckbox());
	    o.getAirspringbushstiffnessxbox().clear();
	    sendKeys(o.getAirspringbushstiffnessxbox(),"8.0");
	    o.getAirspringbushstiffnessybox().clear();
	    sendKeys(o.getAirspringbushstiffnessybox(),"2.0");
	    o.getAirspringbushstiffnesszbox().clear();
	    sendKeys(o.getAirspringbushstiffnesszbox(),"8.0");
	    o.getAirspringbushstiffnesspitch().clear();
	    sendKeys(o.getAirspringbushstiffnesspitch(),"0.005");
	    wait1Seconds();
	    elementClick(o.getAirspringbushdamping());
	    elementClick(o.getAirspringbushdampingcheckbox());
	    o.getAirspaingbushdampingxbox().clear();
	    sendKeys(o.getAirspaingbushdampingxbox(),"0.008");
	    o.getAirspringbushdampingybox().clear();
	    sendKeys(o.getAirspringbushdampingybox(),"0.002");
	    o.getAirspringbushdampingzbox().clear();
	    sendKeys(o.getAirspringbushdampingzbox(),"0.008");
	    o.getAirspringbushdampingpitchbox().clear();
	    sendKeys(o.getAirspringbushdampingpitchbox(),"0.0004");
	    wait1Seconds();
	    elementClick(o.getAirspringbushseriesstiffness());
	    elementClick(o.getAirspringbushseriesstiffnesscheckbox());
	    o.getAirspringbushseriesstiffnessxbox().clear();
	    sendKeys(o.getAirspringbushseriesstiffnessxbox(),"8.0");
	    o.getAirspringbushseriesstiffnessybox().clear();
	    sendKeys(o.getAirspringbushseriesstiffnessybox(),"2.0");
	    o.getAirspringbushseriesstiffnesszbox().clear();
	    sendKeys(o.getAirspringbushseriesstiffnesszbox(),"8.0");
	    o.getAirspringbushseriesstiffnesspitchbox().clear();
	    sendKeys(o.getAirspringbushseriesstiffnesspitchbox(),"0.005");
	    wait1Seconds();
	    elementClick(o.getAirspringbushappearance());
	    elementClick(o.getAirspringbushappearancebush());
	    elementClick(o.getAirspringbushappearancesmall());
	    elementClick(o.getAirspringbushappearanceyaxis());
	    wait1Seconds();
	    elementClick(o.getAirspringbushsavebutton());
	    wait1Seconds();
	    elementClick(o.getAirspringsrefreshbutton());
	    wait5seconds();

	
}

@When("User have to fill the air spting bush four data")
public void user_have_to_fill_the_air_spting_bush_four_data()throws InterruptedException {
	 sendKeys(o.getAirspringbushnamebox(),"033Prime_bush_TR");
	    elementClick(o.getAirspringbushposition());
	    o.getAirspringbushxbox().clear();
	    sendKeys(o.getAirspringbushxbox(),"-semiwheelbase+0.5");
	    o.getAirspringbushybox().clear();
	    sendKeys(o.getAirspringbushybox(),"1.0");
	    o.getAirspringbushzbox().clear();
	    sendKeys(o.getAirspringbushzbox(),"0.455");
	    elementClick(o.getAirspringbushmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringbushbogieframe());
	    elementClick(o.getAirspringbushmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringbush003wheelsetl());
	    wait1Seconds();
	    elementClick(o.getAirspringbushstiffness());
	    elementClick(o.getAirspringbushstiffnesscheckbox());
	    o.getAirspringbushstiffnessxbox().clear();
	    sendKeys(o.getAirspringbushstiffnessxbox(),"8.0");
	    o.getAirspringbushstiffnessybox().clear();
	    sendKeys(o.getAirspringbushstiffnessybox(),"2.0");
	    o.getAirspringbushstiffnesszbox().clear();
	    sendKeys(o.getAirspringbushstiffnesszbox(),"8.0");
	    o.getAirspringbushstiffnesspitch().clear();
	    sendKeys(o.getAirspringbushstiffnesspitch(),"0.005");
	    wait1Seconds();
	    elementClick(o.getAirspringbushdamping());
	    elementClick(o.getAirspringbushdampingcheckbox());
	    o.getAirspaingbushdampingxbox().clear();
	    sendKeys(o.getAirspaingbushdampingxbox(),"0.008");
	    o.getAirspringbushdampingybox().clear();
	    sendKeys(o.getAirspringbushdampingybox(),"0.002");
	    o.getAirspringbushdampingzbox().clear();
	    sendKeys(o.getAirspringbushdampingzbox(),"0.008");
	    o.getAirspringbushdampingpitchbox().clear();
	    sendKeys(o.getAirspringbushdampingpitchbox(),"0.0004");
	    wait1Seconds();
	    elementClick(o.getAirspringbushseriesstiffness());
	    elementClick(o.getAirspringbushseriesstiffnesscheckbox());
	    o.getAirspringbushseriesstiffnessxbox().clear();
	    sendKeys(o.getAirspringbushseriesstiffnessxbox(),"8.0");
	    o.getAirspringbushseriesstiffnessybox().clear();
	    sendKeys(o.getAirspringbushseriesstiffnessybox(),"2.0");
	    o.getAirspringbushseriesstiffnesszbox().clear();
	    sendKeys(o.getAirspringbushseriesstiffnesszbox(),"8.0");
	    o.getAirspringbushseriesstiffnesspitchbox().clear();
	    sendKeys(o.getAirspringbushseriesstiffnesspitchbox(),"0.005");
	    wait1Seconds();
	    elementClick(o.getAirspringbushappearance());
	    elementClick(o.getAirspringbushappearancebush());
	    elementClick(o.getAirspringbushappearancesmall());
	    elementClick(o.getAirspringbushappearanceyaxis());
	    wait1Seconds();
	    elementClick(o.getAirspringbushsavebutton());
	    wait1Seconds();
	    elementClick(o.getAirspringsrefreshbutton());
	    wait5seconds();

	
}

@When("User have to fill the air spring bush five data")
public void user_have_to_fill_the_air_spring_bush_five_data()throws InterruptedException {
	 sendKeys(o.getAirspringbushnamebox(),"Sec_bush");
	    elementClick(o.getAirspringbushposition());
	    o.getAirspringbushzbox().clear();
	    sendKeys(o.getAirspringbushzbox(),"0.751");
	    elementClick(o.getAirspringbushmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringbushvehiclebody());
	    elementClick(o.getAirspringbushmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringbushbogieframe());
	    wait1Seconds();
	    elementClick(o.getAirspringbushstiffness());
	    elementClick(o.getAirspringbushstiffnesscheckbox());
	    o.getAirspringbushstiffnessxbox().clear();
	    sendKeys(o.getAirspringbushstiffnessxbox(),"15.0");
	    o.getAirspringbushstiffnessybox().clear();
	    sendKeys(o.getAirspringbushstiffnessybox(),"15.0");
	    o.getAirspringbushstiffnessroll().clear();
	    sendKeys(o.getAirspringbushstiffnessroll(),"1.0");
	    o.getAirspringbushstiffnessyaw().clear();
	    sendKeys(o.getAirspringbushstiffnessyaw(),"0.05");
	    wait1Seconds();
	    elementClick(o.getAirspringbushdamping());
	    elementClick(o.getAirspringbushdampingcheckbox());
	    o.getAirspaingbushdampingxbox().clear();
	    sendKeys(o.getAirspaingbushdampingxbox(),"0.1");
	    o.getAirspringbushdampingybox().clear();
	    sendKeys(o.getAirspringbushdampingybox(),"0.1");
	    wait1Seconds();
	    elementClick(o.getAirspringbushappearance());
	    elementClick(o.getAirspringbushappearancebush());
	    elementClick(o.getAirspringbushappearancestandard());
	    elementClick(o.getAirspringbushappearancezaxis());
	    wait1Seconds();


	
}


@Then("User have to click the air spring bush save button")
public void user_have_to_click_the_air_spring_bush_save_button() throws InterruptedException {
    elementClick(o.getAirspringbushsavebutton());
    wait1Seconds();
    elementClick(o.getAirspringsrefreshbutton());
    wait5seconds();
	
}



//create the Air spring Bump stop


@Given("User have to click the air spring bumpstop option")
public void user_have_to_click_the_air_spring_bumpstop_option() throws InterruptedException {
   
	elementClick(o.getAirspringbumpstop());
    wait1Seconds();
	
}

@Given("User have to fill the air spring bumpstop one data")
public void user_have_to_fill_the_air_spring_bumpstop_one_data() throws InterruptedException {
    sendKeys(o.getAirspringbumpstopnamebox(),"SecondarystopFL");
    o.getAirspringbumpstopxone().clear();
    sendKeys(o.getAirspringbumpstopxone(),"0.35");
    o.getAirspringbumpstopyone().clear();
    sendKeys(o.getAirspringbumpstopyone(),"-1.0");
    o.getAirspringbumpstopzone().clear();
    sendKeys(o.getAirspringbumpstopzone(),"0.95");
    o.getAirspringbumpstopxtwo().clear();
    sendKeys(o.getAirspringbumpstopxtwo(),"0.35");
    o.getAirspringbumpstopytwo().clear();
    sendKeys(o.getAirspringbumpstopytwo(),"-1.0");
    o.getAirspringbumpstopztwo().clear();
    sendKeys(o.getAirspringbumpstopztwo(),"0.7");
    elementClick(o.getAirspringbumpstopmassbox());
    wait1Seconds();
    elementClick(o.getAirspringbumpstopvehiclebody());
    elementClick(o.getAirspringbumpstopmassbox());
    wait1Seconds();
    elementClick(o.getAirspringbumpstopbogieframe());
    wait1Seconds();
    elementClick(o.getAirspringbumpstopstiffness());
    elementClick(o.getAirspringbumpstopstiffnesspluesone());
    elementClick(o.getAirspringbumpstopstiffnesspluestwo());
    wait1Seconds();
    sendKeys(o.getAirspringbumpstopstiffnessstrockone(),"-10");
    sendKeys(o.getAirspringbumpstopstiffnessforceone(),"-1000");
    sendKeys(o.getAirspringbumpstopstiffnessstrocktwo(),"0");
    sendKeys(o.getAirspringbumpstopstiffnessforcetwo(),"0");
    sendKeys(o.getAirspringbumpstopstiffnessstrockthree(),"10");
    sendKeys(o.getAirspringbumpstopstiffnessforcethree(),"0");
    wait1Seconds();
    elementClick(o.getAirspringbumpstopstiffnessdefineoffsetcheckbox());
    elementClick(o.getAirspringbumpstopstiffnessclearancecheckbox());
    o.getAirspringbumpstopstiffnessclearancebox().clear();
    sendKeys(o.getAirspringbumpstopstiffnessclearancebox(),"0.025");
    wait1Seconds();
    elementClick(o.getAirspringbumpstopsavebutton());
    elementClick(o.getAirspringsrefreshbutton());
    wait5seconds();
    
	
}

@Given("User have to fill the air spring bumpstop two data")
public void user_have_to_fill_the_air_spring_bumpstop_two_data() throws InterruptedException {
	   sendKeys(o.getAirspringbumpstopnamebox(),"SecondarystopFR");
	   elementClick(o.getAirspringbumpstopposition());
	    o.getAirspringbumpstopxone().clear();
	    sendKeys(o.getAirspringbumpstopxone(),"0.35");
	    o.getAirspringbumpstopyone().clear();
	    sendKeys(o.getAirspringbumpstopyone(),"1.0");
	    o.getAirspringbumpstopzone().clear();
	    sendKeys(o.getAirspringbumpstopzone(),"0.95");
	    o.getAirspringbumpstopxtwo().clear();
	    sendKeys(o.getAirspringbumpstopxtwo(),"0.35");
	    o.getAirspringbumpstopytwo().clear();
	    sendKeys(o.getAirspringbumpstopytwo(),"1.0");
	    o.getAirspringbumpstopztwo().clear();
	    sendKeys(o.getAirspringbumpstopztwo(),"0.7");
	    elementClick(o.getAirspringbumpstopmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopvehiclebody());
	    elementClick(o.getAirspringbumpstopmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopbogieframe());
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopstiffness());
	    elementClick(o.getAirspringbumpstopstiffnesspluesone());
	    elementClick(o.getAirspringbumpstopstiffnesspluestwo());
	    wait1Seconds();
	    sendKeys(o.getAirspringbumpstopstiffnessstrockone(),"-10");
	    sendKeys(o.getAirspringbumpstopstiffnessforceone(),"-1000");
	    sendKeys(o.getAirspringbumpstopstiffnessstrocktwo(),"0");
	    sendKeys(o.getAirspringbumpstopstiffnessforcetwo(),"0");
	    sendKeys(o.getAirspringbumpstopstiffnessstrockthree(),"10");
	    sendKeys(o.getAirspringbumpstopstiffnessforcethree(),"0");
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopstiffnessdefineoffsetcheckbox());
	    elementClick(o.getAirspringbumpstopstiffnessclearancecheckbox());
	    o.getAirspringbumpstopstiffnessclearancebox().clear();
	    sendKeys(o.getAirspringbumpstopstiffnessclearancebox(),"0.025");
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopsavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	    wait5seconds();
	
}

@When("User have to fill the air spring bumpstop three data")
public void user_have_to_fill_the_air_spring_bumpstop_three_data() throws InterruptedException {
	   sendKeys(o.getAirspringbumpstopnamebox(),"SecondarystopTL");
	   elementClick(o.getAirspringbumpstopposition());
	    o.getAirspringbumpstopxone().clear();
	    sendKeys(o.getAirspringbumpstopxone(),"-0.35");
	    o.getAirspringbumpstopyone().clear();
	    sendKeys(o.getAirspringbumpstopyone(),"-1.0");
	    o.getAirspringbumpstopzone().clear();
	    sendKeys(o.getAirspringbumpstopzone(),"0.95");
	    o.getAirspringbumpstopxtwo().clear();
	    sendKeys(o.getAirspringbumpstopxtwo(),"-0.35");
	    o.getAirspringbumpstopytwo().clear();
	    sendKeys(o.getAirspringbumpstopytwo(),"-1.0");
	    o.getAirspringbumpstopztwo().clear();
	    sendKeys(o.getAirspringbumpstopztwo(),"0.7");
	    elementClick(o.getAirspringbumpstopmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopvehiclebody());
	    elementClick(o.getAirspringbumpstopmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopbogieframe());
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopstiffness());
	    elementClick(o.getAirspringbumpstopstiffnesspluesone());
	    elementClick(o.getAirspringbumpstopstiffnesspluestwo());
	    wait1Seconds();
	    sendKeys(o.getAirspringbumpstopstiffnessstrockone(),"-10");
	    sendKeys(o.getAirspringbumpstopstiffnessforceone(),"-1000");
	    sendKeys(o.getAirspringbumpstopstiffnessstrocktwo(),"0");
	    sendKeys(o.getAirspringbumpstopstiffnessforcetwo(),"0");
	    sendKeys(o.getAirspringbumpstopstiffnessstrockthree(),"10");
	    sendKeys(o.getAirspringbumpstopstiffnessforcethree(),"0");
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopstiffnessdefineoffsetcheckbox());
	    elementClick(o.getAirspringbumpstopstiffnessclearancecheckbox());
	    o.getAirspringbumpstopstiffnessclearancebox().clear();
	    sendKeys(o.getAirspringbumpstopstiffnessclearancebox(),"0.025");
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopsavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	    wait5seconds();
	
}


@When("User have to fill the air spring bumpstop four data")
public void user_have_to_fill_the_air_spring_bumpstop_four_data() throws InterruptedException {
	   sendKeys(o.getAirspringbumpstopnamebox(),"SecondarystopTR");
	   elementClick(o.getAirspringbumpstopposition());
	    o.getAirspringbumpstopxone().clear();
	    sendKeys(o.getAirspringbumpstopxone(),"-0.35");
	    o.getAirspringbumpstopyone().clear();
	    sendKeys(o.getAirspringbumpstopyone(),"1.0");
	    o.getAirspringbumpstopzone().clear();
	    sendKeys(o.getAirspringbumpstopzone(),"0.95");
	    o.getAirspringbumpstopxtwo().clear();
	    sendKeys(o.getAirspringbumpstopxtwo(),"-0.35");
	    o.getAirspringbumpstopytwo().clear();
	    sendKeys(o.getAirspringbumpstopytwo(),"1.0");
	    o.getAirspringbumpstopztwo().clear();
	    sendKeys(o.getAirspringbumpstopztwo(),"0.7");
	    elementClick(o.getAirspringbumpstopmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopvehiclebody());
	    elementClick(o.getAirspringbumpstopmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopbogieframe());
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopstiffness());
	    elementClick(o.getAirspringbumpstopstiffnesspluesone());
	    elementClick(o.getAirspringbumpstopstiffnesspluestwo());
	    wait1Seconds();
	    sendKeys(o.getAirspringbumpstopstiffnessstrockone(),"-10");
	    sendKeys(o.getAirspringbumpstopstiffnessforceone(),"-1000");
	    sendKeys(o.getAirspringbumpstopstiffnessstrocktwo(),"0");
	    sendKeys(o.getAirspringbumpstopstiffnessforcetwo(),"0");
	    sendKeys(o.getAirspringbumpstopstiffnessstrockthree(),"10");
	    sendKeys(o.getAirspringbumpstopstiffnessforcethree(),"0");
	    wait1Seconds();
	    elementClick(o.getAirspringbumpstopstiffnessdefineoffsetcheckbox());
	    elementClick(o.getAirspringbumpstopstiffnessclearancecheckbox());
	    o.getAirspringbumpstopstiffnessclearancebox().clear();
	    sendKeys(o.getAirspringbumpstopstiffnessclearancebox(),"0.025");
	    wait1Seconds();
	  
	
}

@Then("User have to click the air spring bumpstop save button")
public void user_have_to_click_the_air_spring_bumpstop_save_button() throws InterruptedException {
	  elementClick(o.getAirspringbumpstopsavebutton());
	  wait1Seconds();
	    elementClick(o.getAirspringsrefreshbutton());
	    wait5seconds();
	
}



//Create the Air spring pin link

@Given("User have to click the air spring pinlink option")
public void user_have_to_click_the_air_spring_pinlink_option() throws InterruptedException {
    elementClick(o.getAirspringpinlink());
    wait1Seconds();
}

@When("User have to fill the air spring pinlink one data")
public void user_have_to_fill_the_air_spring_pinlink_one_data() throws InterruptedException {
    sendKeys(o.getAirspringpinlinkpartnamebox(),"003Sec_yaw_damper_L");
    o.getAirspringpinlinkyone().clear();
    sendKeys(o.getAirspringpinlinkyone(),"-1.18");
    o.getAirspringpinlinkzone().clear();
    sendKeys(o.getAirspringpinlinkzone(),"0.57");
    o.getAirspringpinlinkxtwo().clear();
    sendKeys(o.getAirspringpinlinkxtwo(),"0.805");
    o.getAirspringpinlinkytwo().clear();
    sendKeys(o.getAirspringpinlinkytwo(),"-1.18");
    o.getAirspringpinlinkztwo().clear();
    sendKeys(o.getAirspringpinlinkztwo(),"0.57");
    elementClick(o.getAirspringpinlinkmassbox());
    wait1Seconds();
    elementClick(o.getAirspringpinlinkbogieframe());
    elementClick(o.getAirspringpinlinkmassbox());
    wait1Seconds();
    elementClick(o.getAirspringpinlinkvehiclebody());
    wait1Seconds();
    elementClick(o.getAirspringpinlinkstiffness());
    elementClick(o.getAirspringpinlinkstiffnesscheckbox());
    o.getAirsptingpinlinkstiffnesslinearstiffnessbox().clear();
    sendKeys(o.getAirsptingpinlinkstiffnesslinearstiffnessbox(),"0.2");
    elementClick(o.getAirspringpinlinkstiffnessnonlinear());
    wait1Seconds();
    elementClick(o.getAirspringpinlinkstiffnessnonlinearplusone());
    elementClick(o.getAirspringpinlinkstiffnessnonlinearplustwo());
    sendKeys(o.getAirspringpinlinkstiffnessnonlinearstockone(),"0");
    sendKeys(o.getAirspringpinlinkstiffnessnonlinearstocktwo(),"30");
    sendKeys(o.getAirspringpinlinkstiffnessnonlinearstockthree(),"60");
    sendKeys(o.getAirspringpinlinkstiffnessnonlinearforceone(),"0");
    sendKeys(o.getAirspringpinlinkstiffnessnonlinearforcetwo(),"2500");
    sendKeys(o.getAirspringpinlinkstiffnessnonlinearforcethree(),"2500");
    wait1Seconds();
    elementClick(o.getAirspringpinlinkdamping());
    elementClick(o.getAirspringpinlinkdampingcheckbox());
    o.getAirspringpinlinkdampinglineardampingbox().clear();
    sendKeys(o.getAirspringpinlinkdampinglineardampingbox(),"0.2");
    wait1Seconds();
    mouseOverAction(o.getAirspringpinlinkdampingnonlineardamping());
    elementClick(o.getAirspringpinlinkdampingnonlineardamping());
    wait1Seconds();
    elementClick(o.getAirspringpinlinkdampingnonlinearpluesone());
    elementClick(o.getAirspringpinlinkdampingnonlinearpluestwo());
    sendKeys(o.getAirspringpinlinkdampingnonlinearvelocityone(),"0");
    sendKeys(o.getAirspringpinlinkdampingnonlinearvelocitytwo(),"30");
    sendKeys(o.getAirspringpinlinkdampingnonlinearvelocitythree(),"60");
    sendKeys(o.getAirspringpinlinkdampingnonlinearforceone(),"0");
    sendKeys(o.getAirspringpinlinkdampingnonlinearforcetwo(),"2500");
    sendKeys(o.getAirspringpinlinkdampingnonlinearforcethree(),"2500");
    wait1Seconds();
    elementClick(o.getAirspringpinlinkoptions());
    elementClick(o.getAirspringpinlinkoptionscheckbox());
    o.getAirspringpinlinkoptionsseriesstiffnessbox().clear();
    sendKeys(o.getAirspringpinlinkoptionsseriesstiffnessbox(),"4.0");
    wait1Seconds();
    elementClick(o.getAirspringpinlinkdamping());
    elementClick(o.getAirspringpinlinkdampinglineardamping());
    wait1Seconds();
elementClick(o.getAirspringpinlinkstiffness());
wait1Seconds();
elementClick(o.getAirspringpinlinkstiffnessnonlinearplusthree());
elementClick(o.getAirspringpinlinkstiffnessnonlinearminusthree());
elementClick(o.getAirspringpinlinkstiffnessnonlinearminustwo());
elementClick(o.getAirspringpinlinkstiffnessnonlinearminusone());
elementClick(o.getAirspringpinlinkstiffnesslinearstiffness());
wait1Seconds();
elementClick(o.getAirspringpinlinksavebutton());
    elementClick(o.getAirspringsrefreshbutton());
    wait5seconds();
}


@When("User have to fill the air spring pinlink two data")
public void user_have_to_fill_the_air_spring_pinlink_two_data() throws InterruptedException {
    sendKeys(o.getAirspringpinlinkpartnamebox(),"003Sec_yaw_damper_R");
    elementClick(o.getAirspringpinlinkposition());
    o.getAirspringpinlinkyone().clear();
    sendKeys(o.getAirspringpinlinkyone(),"1.18");
    o.getAirspringpinlinkzone().clear();
    sendKeys(o.getAirspringpinlinkzone(),"0.62");
    o.getAirspringpinlinkxtwo().clear();
    sendKeys(o.getAirspringpinlinkxtwo(),"0.805");
    o.getAirspringpinlinkytwo().clear();
    sendKeys(o.getAirspringpinlinkytwo(),"1.2");
    o.getAirspringpinlinkztwo().clear();
    sendKeys(o.getAirspringpinlinkztwo(),"0.62");
    elementClick(o.getAirspringpinlinkmassbox());
    wait1Seconds();
    elementClick(o.getAirspringpinlinkbogieframe());
    elementClick(o.getAirspringpinlinkmassbox());
    wait1Seconds();
    elementClick(o.getAirspringpinlinkvehiclebody());
    wait1Seconds();
    elementClick(o.getAirspringpinlinkstiffness());
    elementClick(o.getAirspringpinlinkstiffnesscheckbox());
    o.getAirsptingpinlinkstiffnesslinearstiffnessbox().clear();
    sendKeys(o.getAirsptingpinlinkstiffnesslinearstiffnessbox(),"0.2");
    elementClick(o.getAirspringpinlinkstiffnessnonlinear());
    wait1Seconds();
    elementClick(o.getAirspringpinlinkstiffnessnonlinearplusone());
    elementClick(o.getAirspringpinlinkstiffnessnonlinearplustwo());
    sendKeys(o.getAirspringpinlinkstiffnessnonlinearstockone(),"0");
    sendKeys(o.getAirspringpinlinkstiffnessnonlinearstocktwo(),"30");
    sendKeys(o.getAirspringpinlinkstiffnessnonlinearstockthree(),"60");
    sendKeys(o.getAirspringpinlinkstiffnessnonlinearforceone(),"0");
    sendKeys(o.getAirspringpinlinkstiffnessnonlinearforcetwo(),"2500");
    sendKeys(o.getAirspringpinlinkstiffnessnonlinearforcethree(),"2500");
    wait1Seconds();
    elementClick(o.getAirspringpinlinkdamping());
    elementClick(o.getAirspringpinlinkdampingcheckbox());
    o.getAirspringpinlinkdampinglineardampingbox().clear();
    sendKeys(o.getAirspringpinlinkdampinglineardampingbox(),"0.2");
    wait1Seconds();
    mouseOverAction(o.getAirspringpinlinkdampingnonlineardamping());
     elementClick(o.getAirspringpinlinkdampingnonlineardamping());
     wait1Seconds();
    elementClick(o.getAirspringpinlinkdampingnonlinearpluesone());
    elementClick(o.getAirspringpinlinkdampingnonlinearpluestwo());
    sendKeys(o.getAirspringpinlinkdampingnonlinearvelocityone(),"0");
    sendKeys(o.getAirspringpinlinkdampingnonlinearvelocitytwo(),"30");
    sendKeys(o.getAirspringpinlinkdampingnonlinearvelocitythree(),"60");
    sendKeys(o.getAirspringpinlinkdampingnonlinearforceone(),"0");
    sendKeys(o.getAirspringpinlinkdampingnonlinearforcetwo(),"2500");
    sendKeys(o.getAirspringpinlinkdampingnonlinearforcethree(),"2500");
    wait1Seconds();
    elementClick(o.getAirspringpinlinkoptions());
    elementClick(o.getAirspringpinlinkoptionscheckbox());
    o.getAirspringpinlinkoptionsseriesstiffnessbox().clear();
    sendKeys(o.getAirspringpinlinkoptionsseriesstiffnessbox(),"4.0");
    wait1Seconds();
    elementClick(o.getAirspringpinlinkdamping());
    elementClick(o.getAirspringpinlinkdampinglineardamping());
    wait1Seconds();
elementClick(o.getAirspringpinlinkstiffness());
wait1Seconds();
elementClick(o.getAirspringpinlinkstiffnessnonlinearplusthree());
elementClick(o.getAirspringpinlinkstiffnessnonlinearminusthree());
elementClick(o.getAirspringpinlinkstiffnessnonlinearminustwo());
elementClick(o.getAirspringpinlinkstiffnessnonlinearminusone());
elementClick(o.getAirspringpinlinkstiffnesslinearstiffness());
wait1Seconds();
   
}

@Then("User have to click the air spring pinlink save button")
public void user_have_to_click_the_air_spring_pinlink_save_button() throws InterruptedException {
	 elementClick(o.getAirspringpinlinksavebutton());
	 wait1Seconds();
	    elementClick(o.getAirspringsrefreshbutton());
	    wait5seconds();
}




//Create the Air spring in Air spring bogie


  @Given("User have to click the air spring option")
  public void user_have_to_click_the_air_spring_option() throws InterruptedException {
    elementClick(o.getAirspringbutton());
    wait1Seconds();
	
}

@When("User have to fill the air spring one data")
public void user_have_to_fill_the_air_spring_one_data()throws InterruptedException {
    sendKeys(o.getAirspringnamebox(),"air spring L");
    o.getAirspringyone().clear();
    sendKeys(o.getAirspringyone(),"-0.925");
    o.getAirspringzone().clear();
    sendKeys(o.getAirspringzone(),"1.2");
    o.getAirspringztwo().clear();
    sendKeys(o.getAirspringztwo(),"0.7");
    elementClick(o.getAirspringmassbox());
    wait1Seconds();
    elementClick(o.getAirspringvehiclebody());
    elementClick(o.getAirspringmassbox());
    wait1Seconds();
    elementClick(o.getAirspringbogieframe());
    wait1Seconds();
    elementClick(o.getAirspringvertical());
    wait1Seconds();
    o.getAirspringverticalsamplelinearstiffness().clear();
    sendKeys(o.getAirspringverticalsamplelinearstiffness(),"0.2");
    elementClick(o.getAirspringverticaldetailed());
    elementClick(o.getAirspringverticaldetailedcheckboxone());
    elementClick(o.getAirspringverticaldetailedcheckboxtwo());
    elementClick(o.getAirspringverticaldetailedcheckboxthree());
    elementClick(o.getAirspringverticaldetailedcheckboxfour());
    o.getAirspringverticaldetailedairspringstiffness().clear();
    sendKeys(o.getAirspringverticaldetailedairspringstiffness(),"1.2");
    o.getAirspringverticaldetailedreservoirstiffness().clear();
    sendKeys(o.getAirspringverticaldetailedreservoirstiffness(),"1.35");
    o.getAirspringverticaldetailedsquaredamping().clear();
    sendKeys(o.getAirspringverticaldetailedsquaredamping(),"1.6");
    o.getAirspringverticaldetailedviscousdamping().clear();
    sendKeys(o.getAirspringverticaldetailedviscousdamping(),"0.075");
    o.getAirspringverticaldetailedreferredinertia().clear();
    sendKeys(o.getAirspringverticaldetailedreferredinertia(),"0.5");
    o.getAirspringverticaldetailedauxiliarystiffness().clear();
    sendKeys(o.getAirspringverticaldetailedauxiliarystiffness(),"6.0");
    wait1Seconds();
    elementClick(o.getAirspringlateralstiffness());
    o.getAirspringlateralstiffnessbox().clear();
    sendKeys(o.getAirspringlateralstiffnessbox(),"0.15");
    elementClick(o.getAirspringlateralstiffnesslineardampingcheckbox());
    o.getAirspringlateralstiffnesslineardampingbox().clear();
    sendKeys(o.getAirspringlateralstiffnesslineardampingbox(),"0.02");
    wait1Seconds();
    elementClick(o.getAirspringlateralstiffnessnonlinearstiffness());
    elementClick(o.getAirspringlateralstiffnessnonlinearstiffnessplusone());
    elementClick(o.getAirspringlateralstiffnessnonlinearstiffnessplusone());
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessstrokeone(),"0");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessstroketwo(),"30");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessstrokethree(),"60");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessforceone(),"0");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessforcetwo(),"2500");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessforcethree(),"2500");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessmomentone(),"0");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessmomenttwo(),"2500");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessmomentthree(),"2500");
    wait1Seconds();
    elementClick(o.getAirspringlateralhysteresis());
    elementClick(o.getAirspringlateralhysteresischeckboxone());
    elementClick(o.getAirspringlateralhysteresischeckboxtwo());
    elementClick(o.getAirspringlateralhysteresischeckboxthree());
    elementClick(o.getAirspringlateralhysteresischeckboxfour());
    o.getAirspringlateralhysteresisforcebox().clear();
    sendKeys(o.getAirspringlateralhysteresisforcebox(),"0.5");
    o.getAirspringlateralhysteresisexponent().clear();
    sendKeys(o.getAirspringlateralhysteresisexponent(),"100");
    o.getAirspringlateralhysteresisequivalentstiffness().clear();
    sendKeys(o.getAirspringlateralhysteresisequivalentstiffness(),"0.029");
    o.getAirspringlateralhysteresisequivalentdamping().clear();
    sendKeys(o.getAirspringlateralhysteresisequivalentdamping(),"0.03");
    o.getAirspringlateralhysteresisequivalentseriesstiffness().clear();
    sendKeys(o.getAirspringlateralhysteresisequivalentseriesstiffness(),"0");
    wait1Seconds();
    elementClick(o.getAirspringvertical());
    elementClick(o.getAirspringverticalsample());
    wait1Seconds();
    elementClick(o.getAirspringlateralstiffness());
    elementClick(o.getAirspringlateralstiffnesslinearstiffness());
    wait1Seconds();
    elementClick(o.getAirspringsavebutton());
    elementClick(o.getAirspringsrefreshbutton());
    Thread.sleep(3000);
    
    
}


@When("User have to fill the airspring two data")
public void user_have_to_fill_the_airspring_two_data() throws InterruptedException{
 
    sendKeys(o.getAirspringnamebox(),"air spring R");
    elementClick(o.getAirspringposition());
    o.getAirspringyone().clear();
    sendKeys(o.getAirspringyone(),"0.925");
    o.getAirspringzone().clear();
    sendKeys(o.getAirspringzone(),"1.2");
    o.getAirspringztwo().clear();
    sendKeys(o.getAirspringztwo(),"0.7");
    elementClick(o.getAirspringmassbox());
    wait1Seconds();
    elementClick(o.getAirspringvehiclebody());
    elementClick(o.getAirspringmassbox());
    wait1Seconds();
    elementClick(o.getAirspringbogieframe());
    wait1Seconds();
    elementClick(o.getAirspringvertical()); 
    wait1Seconds();
    o.getAirspringverticalsamplelinearstiffness().clear();
    sendKeys(o.getAirspringverticalsamplelinearstiffness(),"0.2");
    elementClick(o.getAirspringverticaldetailed());
    elementClick(o.getAirspringverticaldetailedcheckboxone());
    elementClick(o.getAirspringverticaldetailedcheckboxtwo());
    elementClick(o.getAirspringverticaldetailedcheckboxthree());
    elementClick(o.getAirspringverticaldetailedcheckboxfour());
    o.getAirspringverticaldetailedairspringstiffness().clear();
    sendKeys(o.getAirspringverticaldetailedairspringstiffness(),"1.2");
    o.getAirspringverticaldetailedreservoirstiffness().clear();
    sendKeys(o.getAirspringverticaldetailedreservoirstiffness(),"1.35");
    o.getAirspringverticaldetailedsquaredamping().clear();
    sendKeys(o.getAirspringverticaldetailedsquaredamping(),"1.6");
    o.getAirspringverticaldetailedviscousdamping().clear();
    sendKeys(o.getAirspringverticaldetailedviscousdamping(),"0.075");
    o.getAirspringverticaldetailedreferredinertia().clear();
    sendKeys(o.getAirspringverticaldetailedreferredinertia(),"0.5");
    o.getAirspringverticaldetailedauxiliarystiffness().clear();
    sendKeys(o.getAirspringverticaldetailedauxiliarystiffness(),"6.0");
    wait1Seconds();
    elementClick(o.getAirspringlateralstiffness());
    o.getAirspringlateralstiffnessbox().clear();
    sendKeys(o.getAirspringlateralstiffnessbox(),"0.15");
    elementClick(o.getAirspringlateralstiffnesslineardampingcheckbox());
    o.getAirspringlateralstiffnesslineardampingbox().clear();
    sendKeys(o.getAirspringlateralstiffnesslineardampingbox(),"0.02");
    wait1Seconds();
    elementClick(o.getAirspringlateralstiffnessnonlinearstiffness());
    elementClick(o.getAirspringlateralstiffnessnonlinearstiffnessplusone());
    elementClick(o.getAirspringlateralstiffnessnonlinearstiffnessplusone());
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessstrokeone(),"0");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessstroketwo(),"30");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessstrokethree(),"60");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessforceone(),"0");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessforcetwo(),"2500");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessforcethree(),"2500");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessmomentone(),"0");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessmomenttwo(),"2500");
    sendKeys(o.getAirspringlateralstiffnessnonlinearstiffnessmomentthree(),"2500");
    wait1Seconds();
    elementClick(o.getAirspringlateralhysteresis());
    elementClick(o.getAirspringlateralhysteresischeckboxone());
    elementClick(o.getAirspringlateralhysteresischeckboxtwo());
    elementClick(o.getAirspringlateralhysteresischeckboxthree());
    elementClick(o.getAirspringlateralhysteresischeckboxfour());
    o.getAirspringlateralhysteresisforcebox().clear();
    sendKeys(o.getAirspringlateralhysteresisforcebox(),"0.5");
    o.getAirspringlateralhysteresisexponent().clear();
    sendKeys(o.getAirspringlateralhysteresisexponent(),"100");
    o.getAirspringlateralhysteresisequivalentstiffness().clear();
    sendKeys(o.getAirspringlateralhysteresisequivalentstiffness(),"0.029");
    o.getAirspringlateralhysteresisequivalentdamping().clear();
    sendKeys(o.getAirspringlateralhysteresisequivalentdamping(),"0.03");
    o.getAirspringlateralhysteresisequivalentseriesstiffness().clear();
    sendKeys(o.getAirspringlateralhysteresisequivalentseriesstiffness(),"0");
    wait1Seconds();
    wait1Seconds();
    elementClick(o.getAirspringvertical());
    elementClick(o.getAirspringverticalsample());
    wait1Seconds();
    elementClick(o.getAirspringlateralstiffness());
    elementClick(o.getAirspringlateralstiffnesslinearstiffness());
    Thread.sleep(3000);
   
}

@Then("User have to click the Air spring save button")
public void user_have_to_click_the_Air_spring_save_button()throws InterruptedException {
	 elementClick(o.getAirspringsavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	    wait1Seconds();
	
}




//Create the Air spring damper


@Given("User have to click the air spring damper option")
public void user_have_to_click_the_air_spring_damper_option()throws InterruptedException {
    
	elementClick(o.getAirspringdamper());
	wait1Seconds();
}

@Given("User have to fill the air spring damper one data")
public void user_have_to_fill_the_air_spring_damper_one_data() throws InterruptedException{
    sendKeys(o.getAirspringdampernamebox(),"004scondary y");
    wait1Seconds();
    o.getAirspringdamperxone().clear();
    sendKeys(o.getAirspringdamperxone(),"0");
    o.getAirspringdamperyone().clear();
    sendKeys(o.getAirspringdamperyone(),"0.15");
    o.getAirspringdamperzone().clear();
    sendKeys(o.getAirspringdamperzone(),"0.75");
    o.getAirsoringdamperxtwo().clear();
    sendKeys(o.getAirsoringdamperxtwo(),"0");
    o.getAirsoringdamperytwo().clear();
    sendKeys(o.getAirsoringdamperytwo(),"0.75");
    o.getAirsoringdamperztwo().clear();
    sendKeys(o.getAirsoringdamperztwo(),"0.75");
    wait1Seconds();
    elementClick(o.getAirspringdampermassbox());
    wait1Seconds();
    elementClick(o.getAirspringdampervehiclebody());
    elementClick(o.getAirspringdampermassbox());
    wait1Seconds();
    elementClick(o.getAirspringdamperbogieframe());
    wait1Seconds();
    elementClick(o.getAirdpringdamperdamping());
    elementClick(o.getAirspringdamperdampingsttiffnesscheckbox());
    elementClick(o.getAirspringdamperdampinglineardampingcheckbox());
    o.getAirsptingdamperdampingstiffnessbox().clear();
    sendKeys(o.getAirsptingdamperdampingstiffnessbox(),"3.0");
    o.getAirspringdamperdampinglineardampingbox().clear();
    sendKeys(o.getAirspringdamperdampinglineardampingbox(),"0.03");
    wait1Seconds();
    elementClick(o.getAirspringdampersavebutton());
    wait1Seconds();
    elementClick(o.getAirspringsrefreshbutton());
   wait1Seconds();
    
}

@Given("User have to fill the air spring damper two data")
public void user_have_to_fill_the_air_spring_damper_two_data()throws InterruptedException {
    sendKeys(o.getAirspringdampernamebox(),"Primery damper IFL");
    elementClick(o.getAirspringdamperposition());
    wait1Seconds();
    o.getAirspringdamperxone().clear();
    sendKeys(o.getAirspringdamperxone(),"semiwheelbase-0.325");
    o.getAirspringdamperyone().clear();
    sendKeys(o.getAirspringdamperyone(),"-1.0");
    o.getAirspringdamperzone().clear();
    sendKeys(o.getAirspringdamperzone(),"0.75");
    o.getAirsoringdamperxtwo().clear();
    sendKeys(o.getAirsoringdamperxtwo(),"semiwheelbase-0.325");
    o.getAirsoringdamperytwo().clear();
    sendKeys(o.getAirsoringdamperytwo(),"-1.0");
    o.getAirsoringdamperztwo().clear();
    sendKeys(o.getAirsoringdamperztwo(),"0.5");
    wait1Seconds();
    elementClick(o.getAirspringdampermassbox());
    wait1Seconds();
    elementClick(o.getAirspringdamperbogieframe());
    elementClick(o.getAirspringdampermassbox());
    wait1Seconds();
    elementClick(o.getAirspringdamperwheelsetl());
    wait1Seconds();
    elementClick(o.getAirdpringdamperdamping());
    elementClick(o.getAirspringdamperdampingsttiffnesscheckbox());
    elementClick(o.getAirspringdamperdampinglineardampingcheckbox());
    o.getAirsptingdamperdampingstiffnessbox().clear();
    sendKeys(o.getAirsptingdamperdampingstiffnessbox(),"2.0");
    o.getAirspringdamperdampinglineardampingbox().clear();
    sendKeys(o.getAirspringdamperdampinglineardampingbox(),"0.05");
    wait1Seconds();
    elementClick(o.getAirspringdampersavebutton());
    elementClick(o.getAirspringsrefreshbutton());
   wait1Seconds();
}

@Given("User have to fill the air spring damper three data")
public void user_have_to_fill_the_air_spring_damper_three_data()throws InterruptedException {
    sendKeys(o.getAirspringdampernamebox(),"Primery damper IFR");
    elementClick(o.getAirspringdamperposition());
    wait1Seconds();
    o.getAirspringdamperxone().clear();
    sendKeys(o.getAirspringdamperxone(),"semiwheelbase-0.325");
    o.getAirspringdamperyone().clear();
    sendKeys(o.getAirspringdamperyone(),"1.0");
    o.getAirspringdamperzone().clear();
    sendKeys(o.getAirspringdamperzone(),"0.75");
    o.getAirsoringdamperxtwo().clear();
    sendKeys(o.getAirsoringdamperxtwo(),"semiwheelbase-0.325");
    o.getAirsoringdamperytwo().clear();
    sendKeys(o.getAirsoringdamperytwo(),"1.0");
    o.getAirsoringdamperztwo().clear();
    sendKeys(o.getAirsoringdamperztwo(),"0.5");
    wait1Seconds();
    elementClick(o.getAirspringdampermassbox());
    wait1Seconds();
    elementClick(o.getAirspringdamperbogieframe());
    elementClick(o.getAirspringdampermassbox());
    wait1Seconds();
    elementClick(o.getAirspringdamperwheelsetl());
    wait1Seconds();
    elementClick(o.getAirdpringdamperdamping());
    elementClick(o.getAirspringdamperdampingsttiffnesscheckbox());
    elementClick(o.getAirspringdamperdampinglineardampingcheckbox());
    o.getAirsptingdamperdampingstiffnessbox().clear();
    sendKeys(o.getAirsptingdamperdampingstiffnessbox(),"2.0");
    o.getAirspringdamperdampinglineardampingbox().clear();
    sendKeys(o.getAirspringdamperdampinglineardampingbox(),"0.05");
    wait1Seconds();
    elementClick(o.getAirspringdampersavebutton());
    elementClick(o.getAirspringsrefreshbutton());
   wait1Seconds();
}

@When("User have to fill the air spring damper four data")
public void user_have_to_fill_the_air_spring_damper_four_data()throws InterruptedException {
    sendKeys(o.getAirspringdampernamebox(),"Primery damper ITL");
    elementClick(o.getAirspringdamperposition());
    wait1Seconds();
    o.getAirspringdamperxone().clear();
    sendKeys(o.getAirspringdamperxone(),"-semiwheelbase+0.325");
    o.getAirspringdamperyone().clear();
    sendKeys(o.getAirspringdamperyone(),"-1.0");
    o.getAirspringdamperzone().clear();
    sendKeys(o.getAirspringdamperzone(),"0.75");
    o.getAirsoringdamperxtwo().clear();
    sendKeys(o.getAirsoringdamperxtwo(),"-semiwheelbase+0.325");
    o.getAirsoringdamperytwo().clear();
    sendKeys(o.getAirsoringdamperytwo(),"-1.0");
    o.getAirsoringdamperztwo().clear();
    sendKeys(o.getAirsoringdamperztwo(),"0.5");
    wait1Seconds();
    elementClick(o.getAirspringdampermassbox());
    wait1Seconds();
    elementClick(o.getAirspringdamperbogieframe());
    elementClick(o.getAirspringdampermassbox());
    wait1Seconds();
    elementClick(o.getAirspringdamperwheelsett());
    wait1Seconds();
    elementClick(o.getAirdpringdamperdamping());
    elementClick(o.getAirspringdamperdampingsttiffnesscheckbox());
    elementClick(o.getAirspringdamperdampinglineardampingcheckbox());
    o.getAirsptingdamperdampingstiffnessbox().clear();
    sendKeys(o.getAirsptingdamperdampingstiffnessbox(),"2.0");
    o.getAirspringdamperdampinglineardampingbox().clear();
    sendKeys(o.getAirspringdamperdampinglineardampingbox(),"0.05");
    wait1Seconds();
    elementClick(o.getAirspringdampersavebutton());
    elementClick(o.getAirspringsrefreshbutton());
   wait1Seconds();
}

@When("User have to fill the air spring damper five data")
public void user_have_to_fill_the_air_spring_damper_five_data()throws InterruptedException{
    sendKeys(o.getAirspringdampernamebox(),"Primery damper ITR");
    elementClick(o.getAirspringdamperposition());
    wait1Seconds();
    o.getAirspringdamperxone().clear();
    sendKeys(o.getAirspringdamperxone(),"-semiwheelbase+0.325");
    o.getAirspringdamperyone().clear();
    sendKeys(o.getAirspringdamperyone(),"1.0");
    o.getAirspringdamperzone().clear();
    sendKeys(o.getAirspringdamperzone(),"0.75");
    o.getAirsoringdamperxtwo().clear();
    sendKeys(o.getAirsoringdamperxtwo(),"-semiwheelbase+0.325");
    o.getAirsoringdamperytwo().clear();
    sendKeys(o.getAirsoringdamperytwo(),"1.0");
    o.getAirsoringdamperztwo().clear();
    sendKeys(o.getAirsoringdamperztwo(),"0.5");
    wait1Seconds();
    elementClick(o.getAirspringdampermassbox());
    wait1Seconds();
    elementClick(o.getAirspringdamperbogieframe());
    elementClick(o.getAirspringdampermassbox());
    wait1Seconds();
    elementClick(o.getAirspringdamperwheelsett());
    wait1Seconds();
    elementClick(o.getAirdpringdamperdamping());
    elementClick(o.getAirspringdamperdampingsttiffnesscheckbox());
    elementClick(o.getAirspringdamperdampinglineardampingcheckbox());
    o.getAirsptingdamperdampingstiffnessbox().clear();
    sendKeys(o.getAirsptingdamperdampingstiffnessbox(),"2.0");
    o.getAirspringdamperdampinglineardampingbox().clear();
    sendKeys(o.getAirspringdamperdampinglineardampingbox(),"0.05");
    wait1Seconds();
    elementClick(o.getAirspringdampersavebutton());
    elementClick(o.getAirspringsrefreshbutton());
   wait1Seconds();
}

@When("User have to fill the air spring damper six data")
public void user_have_to_fill_the_air_spring_damper_six_data()throws InterruptedException {
    sendKeys(o.getAirspringdampernamebox(),"Primery damper OFL");
    elementClick(o.getAirspringdamperposition());
    wait1Seconds();
    o.getAirspringdamperxone().clear();
    sendKeys(o.getAirspringdamperxone(),"semiwheelbase+0.325");
    o.getAirspringdamperyone().clear();
    sendKeys(o.getAirspringdamperyone(),"-1.0");
    o.getAirspringdamperzone().clear();
    sendKeys(o.getAirspringdamperzone(),"0.75");
    o.getAirsoringdamperxtwo().clear();
    sendKeys(o.getAirsoringdamperxtwo(),"semiwheelbase+0.325");
    o.getAirsoringdamperytwo().clear();
    sendKeys(o.getAirsoringdamperytwo(),"-1.0");
    o.getAirsoringdamperztwo().clear();
    sendKeys(o.getAirsoringdamperztwo(),"0.5");
    wait1Seconds();
    elementClick(o.getAirspringdampermassbox());
    wait1Seconds();
    elementClick(o.getAirspringdamperbogieframe());
    elementClick(o.getAirspringdampermassbox());
    wait1Seconds();
    elementClick(o.getAirspringdamperwheelsetl());
    wait1Seconds();
    elementClick(o.getAirdpringdamperdamping());
    elementClick(o.getAirspringdamperdampingsttiffnesscheckbox());
    elementClick(o.getAirspringdamperdampinglineardampingcheckbox());
    o.getAirsptingdamperdampingstiffnessbox().clear();
    sendKeys(o.getAirsptingdamperdampingstiffnessbox(),"2.0");
    o.getAirspringdamperdampinglineardampingbox().clear();
    sendKeys(o.getAirspringdamperdampinglineardampingbox(),"0.05");
    wait1Seconds();
    elementClick(o.getAirspringdampersavebutton());
    elementClick(o.getAirspringsrefreshbutton());
    wait1Seconds();
}

@When("User have to fill the air spring damper seven data")
public void user_have_to_fill_the_air_spring_damper_seven_data()throws InterruptedException {
	    sendKeys(o.getAirspringdampernamebox(),"Primery damper OFR");
	    elementClick(o.getAirspringdamperposition());
	    wait1Seconds();
	    o.getAirspringdamperxone().clear();
	    sendKeys(o.getAirspringdamperxone(),"semiwheelbase+0.325");
	    o.getAirspringdamperyone().clear();
	    sendKeys(o.getAirspringdamperyone(),"1.0");
	    o.getAirspringdamperzone().clear();
	    sendKeys(o.getAirspringdamperzone(),"0.75");
	    o.getAirsoringdamperxtwo().clear();
	    sendKeys(o.getAirsoringdamperxtwo(),"semiwheelbase+0.325");
	    o.getAirsoringdamperytwo().clear();
	    sendKeys(o.getAirsoringdamperytwo(),"1.0");
	    o.getAirsoringdamperztwo().clear();
	    sendKeys(o.getAirsoringdamperztwo(),"0.5");
	    wait1Seconds();
	    elementClick(o.getAirspringdampermassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringdamperbogieframe());
	    elementClick(o.getAirspringdampermassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringdamperwheelsetl());
	    wait1Seconds();
	    elementClick(o.getAirdpringdamperdamping());
	    elementClick(o.getAirspringdamperdampingsttiffnesscheckbox());
	    elementClick(o.getAirspringdamperdampinglineardampingcheckbox());
	    o.getAirsptingdamperdampingstiffnessbox().clear();
	    sendKeys(o.getAirsptingdamperdampingstiffnessbox(),"2.0");
	    o.getAirspringdamperdampinglineardampingbox().clear();
	    sendKeys(o.getAirspringdamperdampinglineardampingbox(),"0.05");
	    wait1Seconds();
	    elementClick(o.getAirspringdampersavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	    wait1Seconds();
}

@When("User have to fill the air spring damper eight data")
public void user_have_to_fill_the_air_spring_damper_eight_data()throws InterruptedException {
	  sendKeys(o.getAirspringdampernamebox(),"Primery damper OTL");
	  elementClick(o.getAirspringdamperposition());
	    wait1Seconds();
	    o.getAirspringdamperxone().clear();
	    sendKeys(o.getAirspringdamperxone(),"-semiwheelbase-0.325");
	    o.getAirspringdamperyone().clear();
	    sendKeys(o.getAirspringdamperyone(),"-1.0");
	    o.getAirspringdamperzone().clear();
	    sendKeys(o.getAirspringdamperzone(),"0.75");
	    o.getAirsoringdamperxtwo().clear();
	    sendKeys(o.getAirsoringdamperxtwo(),"-semiwheelbase-0.325");
	    o.getAirsoringdamperytwo().clear();
	    sendKeys(o.getAirsoringdamperytwo(),"-1.0");
	    o.getAirsoringdamperztwo().clear();
	    sendKeys(o.getAirsoringdamperztwo(),"0.5");
	    wait1Seconds();
	    elementClick(o.getAirspringdampermassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringdamperbogieframe());
	    elementClick(o.getAirspringdampermassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringdamperwheelsett());
	    wait1Seconds();
	    elementClick(o.getAirdpringdamperdamping());
	    elementClick(o.getAirspringdamperdampingsttiffnesscheckbox());
	    elementClick(o.getAirspringdamperdampinglineardampingcheckbox());
	    o.getAirsptingdamperdampingstiffnessbox().clear();
	    sendKeys(o.getAirsptingdamperdampingstiffnessbox(),"2.0");
	    o.getAirspringdamperdampinglineardampingbox().clear();
	    sendKeys(o.getAirspringdamperdampinglineardampingbox(),"0.05");
	    wait1Seconds();
	    elementClick(o.getAirspringdampersavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	    wait1Seconds();
}

@When("User have to fill the air spring damper nine data")
public void user_have_to_fill_the_air_spring_damper_nine_data()throws InterruptedException {
	    sendKeys(o.getAirspringdampernamebox(),"Primery damper OTR");
	    elementClick(o.getAirspringdamperposition());
	    wait1Seconds();
	    o.getAirspringdamperxone().clear();
	    sendKeys(o.getAirspringdamperxone(),"-semiwheelbase-0.325");
	    o.getAirspringdamperyone().clear();
	    sendKeys(o.getAirspringdamperyone(),"1.0");
	    o.getAirspringdamperzone().clear();
	    sendKeys(o.getAirspringdamperzone(),"0.75");
	    o.getAirsoringdamperxtwo().clear();
	    sendKeys(o.getAirsoringdamperxtwo(),"-semiwheelbase-0.325");
	    o.getAirsoringdamperytwo().clear();
	    sendKeys(o.getAirsoringdamperytwo(),"1.0");
	    o.getAirsoringdamperztwo().clear();
	    sendKeys(o.getAirsoringdamperztwo(),"0.5");
	    wait1Seconds();
	    elementClick(o.getAirspringdampermassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringdamperbogieframe());
	    elementClick(o.getAirspringdampermassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringdamperwheelsett());
	    wait1Seconds();
	    elementClick(o.getAirdpringdamperdamping());
	    elementClick(o.getAirspringdamperdampingsttiffnesscheckbox());
	    elementClick(o.getAirspringdamperdampinglineardampingcheckbox());
	    o.getAirsptingdamperdampingstiffnessbox().clear();
	    sendKeys(o.getAirsptingdamperdampingstiffnessbox(),"2.0");
	    o.getAirspringdamperdampinglineardampingbox().clear();
	    sendKeys(o.getAirspringdamperdampinglineardampingbox(),"0.05");
	    wait1Seconds();
	  
	  
}

@Then("User have to click the air spring damper save button")
public void user_have_to_click_the_air_spring_damper_save_button() throws InterruptedException {
	  elementClick(o.getAirspringdampersavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	   wait1Seconds();
	  
}




//Create the Air spring Shear spring device


@Given("User have to click the air spring shear spring button")
public void user_have_to_click_the_air_spring_shear_spring_button() throws InterruptedException {
    elementClick(o.getAirspringshearspring());
    wait1Seconds();
	
}

@Given("User have to fill the air spring shear spring one data")
public void user_have_to_fill_the_air_spring_shear_spring_one_data() throws InterruptedException{
    sendKeys(o.getAirspringshearspringpartname(),"003 Primshear spring iFL");
    o.getAirsptingshaerspringxone().clear();
    sendKeys(o.getAirsptingshaerspringxone(),"semiwheelbase-0.325");
    o.getAirsptingshaerspringyone().clear();
    sendKeys(o.getAirsptingshaerspringyone(),"-1.0");
    o.getAirsptingshaerspringzone().clear();
    sendKeys(o.getAirsptingshaerspringzone(),"0.75");
    o.getAirspringshearspringztwo().clear();
    sendKeys(o.getAirspringshearspringztwo(),"0.5");
    elementClick(o.getAirspringshaerspringmassbox());
    wait1Seconds();
    elementClick(o.getAirspringshearspringbogieframe());
    elementClick(o.getAirspringshaerspringmassbox());
    wait1Seconds();
    elementClick(o.getAirspringshearspringwheelsett());
    wait1Seconds();
    elementClick(o.getAirspringshearspringspoption());
    o.getAirspringshearspringspxbox().clear();
    sendKeys(o.getAirspringshearspringspxbox(),"0.5");
    o.getAirspringshearspringspybox().clear();
    sendKeys(o.getAirspringshearspringspybox(),"0.5");
    o.getAirspringshearspringspzbox().clear();
    sendKeys(o.getAirspringshearspringspzbox(),"1.0");
    o.getAirspringshearspringsprollbox().clear();
    sendKeys(o.getAirspringshearspringsprollbox(),"0.05");
    o.getAirspringshearspringsppitchbox().clear();
    sendKeys(o.getAirspringshearspringsppitchbox(),"0.05");
    o.getAirspringshearspringspyawbox().clear();
    sendKeys(o.getAirspringshearspringspyawbox(),"0.001");
    wait1Seconds();
    elementClick(o.getAirspringshearspringsavebutton());
    elementClick(o.getAirspringsrefreshbutton());
    Thread.sleep(2000);
}

@Given("User have to fill the air spring shear spring two data")
public void user_have_to_fill_the_air_spring_shear_spring_two_data()throws InterruptedException {
	    sendKeys(o.getAirspringshearspringpartname(),"003 Primshear spring iFR");
	    elementClick(o.getAirspringshearspringposition());
	    o.getAirsptingshaerspringxone().clear();
	    sendKeys(o.getAirsptingshaerspringxone(),"semiwheelbase-0.325");
	    o.getAirsptingshaerspringyone().clear();
	    sendKeys(o.getAirsptingshaerspringyone(),"1.0");
	    o.getAirsptingshaerspringzone().clear();
	    sendKeys(o.getAirsptingshaerspringzone(),"0.75");
	    o.getAirspringshearspringztwo().clear();
	    sendKeys(o.getAirspringshearspringztwo(),"0.5");
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringbogieframe());
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringwheelsett());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringspoptiontwo());
	    o.getAirspringshearspringspxbox().clear();
	    sendKeys(o.getAirspringshearspringspxbox(),"0.5");
	    o.getAirspringshearspringspybox().clear();
	    sendKeys(o.getAirspringshearspringspybox(),"0.5");
	    o.getAirspringshearspringspzbox().clear();
	    sendKeys(o.getAirspringshearspringspzbox(),"1.0");
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringsavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	    Thread.sleep(2000);
}

@Given("User have to fill the air spring shear spring three data")
public void user_have_to_fill_the_air_spring_shear_spring_three_data()throws InterruptedException {
	    sendKeys(o.getAirspringshearspringpartname(),"003 Primshear spring iTL");
	    elementClick(o.getAirspringshearspringposition());
	    o.getAirsptingshaerspringxone().clear();
	    sendKeys(o.getAirsptingshaerspringxone(),"-semiwheelbase+0.325");
	    o.getAirsptingshaerspringyone().clear();
	    sendKeys(o.getAirsptingshaerspringyone(),"-1.0");
	    o.getAirsptingshaerspringzone().clear();
	    sendKeys(o.getAirsptingshaerspringzone(),"0.75");
	    o.getAirspringshearspringztwo().clear();
	    sendKeys(o.getAirspringshearspringztwo(),"0.5");
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringbogieframe());
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringwheelsetl());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringspoptiontwo());
	    o.getAirspringshearspringspxbox().clear();
	    sendKeys(o.getAirspringshearspringspxbox(),"0.5");
	    o.getAirspringshearspringspybox().clear();
	    sendKeys(o.getAirspringshearspringspybox(),"0.5");
	    o.getAirspringshearspringspzbox().clear();
	    sendKeys(o.getAirspringshearspringspzbox(),"1.0");
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringsavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	    Thread.sleep(2000);
}

@Given("User have to fill the air spring shear spring four data")
public void user_have_to_fill_the_air_spring_shear_spring_four_data()throws InterruptedException {
	    sendKeys(o.getAirspringshearspringpartname(),"003 Primshear spring iTR");
	    elementClick(o.getAirspringshearspringposition());
	    o.getAirsptingshaerspringxone().clear();
	    sendKeys(o.getAirsptingshaerspringxone(),"-semiwheelbase+0.325");
	    o.getAirsptingshaerspringyone().clear();
	    sendKeys(o.getAirsptingshaerspringyone(),"1.0");
	    o.getAirsptingshaerspringzone().clear();
	    sendKeys(o.getAirsptingshaerspringzone(),"0.75");
	    o.getAirspringshearspringztwo().clear();
	    sendKeys(o.getAirspringshearspringztwo(),"0.5");
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringbogieframe());
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringwheelsetl());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringspoptiontwo());
	    o.getAirspringshearspringspxbox().clear();
	    sendKeys(o.getAirspringshearspringspxbox(),"0.5");
	    o.getAirspringshearspringspybox().clear();
	    sendKeys(o.getAirspringshearspringspybox(),"0.5");
	    o.getAirspringshearspringspzbox().clear();
	    sendKeys(o.getAirspringshearspringspzbox(),"1.0");
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringsavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	    Thread.sleep(2000);
}

@Given("User have to fill the air spring shear spring five data")
public void user_have_to_fill_the_air_spring_shear_spring_five_data()throws InterruptedException {
	    sendKeys(o.getAirspringshearspringpartname(),"003 Primshear spring OFL");
	    elementClick(o.getAirspringshearspringposition());
	    o.getAirsptingshaerspringxone().clear();
	    sendKeys(o.getAirsptingshaerspringxone(),"semiwheelbase+0.325");
	    o.getAirsptingshaerspringyone().clear();
	    sendKeys(o.getAirsptingshaerspringyone(),"-1.0");
	    o.getAirsptingshaerspringzone().clear();
	    sendKeys(o.getAirsptingshaerspringzone(),"0.75");
	    o.getAirspringshearspringztwo().clear();
	    sendKeys(o.getAirspringshearspringztwo(),"0.5");
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringbogieframe());
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringwheelsett());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringspoptiontwo());
	    o.getAirspringshearspringspxbox().clear();
	    sendKeys(o.getAirspringshearspringspxbox(),"0.5");
	    o.getAirspringshearspringspybox().clear();
	    sendKeys(o.getAirspringshearspringspybox(),"0.5");
	    o.getAirspringshearspringspzbox().clear();
	    sendKeys(o.getAirspringshearspringspzbox(),"1.0");
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringsavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	    Thread.sleep(2000);
}

@Given("User have to fill the air spring shear spring six data")
public void user_have_to_fill_the_air_spring_shear_spring_six_data()throws InterruptedException {
	    sendKeys(o.getAirspringshearspringpartname(),"003 Primshear spring OFR");
	    elementClick(o.getAirspringshearspringposition());
	    o.getAirsptingshaerspringxone().clear();
	    sendKeys(o.getAirsptingshaerspringxone(),"semiwheelbase+0.325");
	    o.getAirsptingshaerspringyone().clear();
	    sendKeys(o.getAirsptingshaerspringyone(),"1.0");
	    o.getAirsptingshaerspringzone().clear();
	    sendKeys(o.getAirsptingshaerspringzone(),"0.75");
	    o.getAirspringshearspringztwo().clear();
	    sendKeys(o.getAirspringshearspringztwo(),"0.5");
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringbogieframe());
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringwheelsett());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringspoptiontwo());
	    o.getAirspringshearspringspxbox().clear();
	    sendKeys(o.getAirspringshearspringspxbox(),"0.5");
	    o.getAirspringshearspringspybox().clear();
	    sendKeys(o.getAirspringshearspringspybox(),"0.5");
	    o.getAirspringshearspringspzbox().clear();
	    sendKeys(o.getAirspringshearspringspzbox(),"1.0");
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringsavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	    Thread.sleep(2000);
}

@Given("User have to fill the air spring shear spring seven data")
public void user_have_to_fill_the_air_spring_shear_spring_seven_data()throws InterruptedException {
	    sendKeys(o.getAirspringshearspringpartname(),"003 Primshear spring OTL");
	    elementClick(o.getAirspringshearspringposition());
	    o.getAirsptingshaerspringxone().clear();
	    sendKeys(o.getAirsptingshaerspringxone(),"-semiwheelbase-0.325");
	    o.getAirsptingshaerspringyone().clear();
	    sendKeys(o.getAirsptingshaerspringyone(),"-1.0");
	    o.getAirsptingshaerspringzone().clear();
	    sendKeys(o.getAirsptingshaerspringzone(),"0.75");
	    o.getAirspringshearspringztwo().clear();
	    sendKeys(o.getAirspringshearspringztwo(),"0.5");
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringbogieframe());
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringwheelsetl());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringspoptiontwo());
	    o.getAirspringshearspringspxbox().clear();
	    sendKeys(o.getAirspringshearspringspxbox(),"0.5");
	    o.getAirspringshearspringspybox().clear();
	    sendKeys(o.getAirspringshearspringspybox(),"0.5");
	    o.getAirspringshearspringspzbox().clear();
	    sendKeys(o.getAirspringshearspringspzbox(),"1.0");
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringsavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	    Thread.sleep(2000);
}

@Given("User have to fill the air spring shear spring eight data")
public void user_have_to_fill_the_air_spring_shear_spring_eight_data()throws InterruptedException {
	    sendKeys(o.getAirspringshearspringpartname(),"003 Primshear spring OTR");
	    elementClick(o.getAirspringshearspringposition());
	    o.getAirsptingshaerspringxone().clear();
	    sendKeys(o.getAirsptingshaerspringxone(),"-semiwheelbase-0.325");
	    o.getAirsptingshaerspringyone().clear();
	    sendKeys(o.getAirsptingshaerspringyone(),"1.0");
	    o.getAirsptingshaerspringzone().clear();
	    sendKeys(o.getAirsptingshaerspringzone(),"0.75");
	    o.getAirspringshearspringztwo().clear();
	    sendKeys(o.getAirspringshearspringztwo(),"0.5");
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringbogieframe());
	    elementClick(o.getAirspringshaerspringmassbox());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringwheelsetl());
	    wait1Seconds();
	    elementClick(o.getAirspringshearspringspoptiontwo());
	    o.getAirspringshearspringspxbox().clear();
	    sendKeys(o.getAirspringshearspringspxbox(),"0.5");
	    o.getAirspringshearspringspybox().clear();
	    sendKeys(o.getAirspringshearspringspybox(),"0.5");
	    o.getAirspringshearspringspzbox().clear();
	    sendKeys(o.getAirspringshearspringspzbox(),"1.0");
	    wait1Seconds();
	   
	   
}

@Then("User have to click the air spring shear spring save button")
public void user_have_to_click_the_air_spring_shear_spring_save_button()throws InterruptedException {
	    elementClick(o.getAirspringshearspringsavebutton());
	    elementClick(o.getAirspringsrefreshbutton());
	    Thread.sleep(10000);
	    elementClick(o.getAirspringbogiefinalsave());
	    wait1Seconds();
	    elementClick(o.getAirspringbogieconformfinalsave());
	    Thread.sleep(4000);
	    String text = o.getAirspringbogiedashboardbody().getText();
	    System.out.println(text);
	    boolean contains = text.contains("Air Spring Bogie");
		Assert.assertTrue("Check the simulation crate or not",contains);
		wait1Seconds();
		String text2 = o.getAirspringbogiesimulationtitle().getText();
		if (text2=="Air Spring Bogie") {
			System.out.println("-----Air spring bogie has crated-----");
		} else {
            System.out.println("-----Air spring bogie not crated-----");
		}
	    quitTab();
}




// Digital trains Sales Tools page


@Given("User have to click the username and select the salestool option")
public void user_have_to_click_the_username_and_select_the_salestool_option() throws InterruptedException{
    
	elementClick(o.getSalestooluserhemkumarsetting());
	elementClick(o.getSalestooloption());
	wait1Seconds();
	
}

@When("User have to click the create invoice option")
public void user_have_to_click_the_create_invoice_option()throws InterruptedException {
	String url = driver.getCurrentUrl();
	boolean contains = url.contains("salestools");
	Assert.assertTrue("Check the url",contains);
	elementClick(o.getSalestoolmanageinvoices());
	wait1Seconds();
	String url2 = driver.getCurrentUrl();
	boolean contains2 = url2.contains("manageinvoices");
	Assert.assertTrue("Check the url", contains2);
	elementClick(o.getSalestoolcreateinvoice());
	wait1Seconds();
	String url3 = driver.getCurrentUrl();
	boolean contains3 = url3.contains("create");
	Assert.assertTrue("Check the url", contains3);
	
}

@When("User have to fill the all details in the invoice page")
public void user_have_to_fill_the_all_details_in_the_invoice_page()throws InterruptedException, AWTException {
    
	elementClick(o.getSalestoolusernamedropdown());
	wait1Seconds();
	sendKeys(o.getSalestoolusernamesearchbox(),"hemkumar");
	elementClick(o.getSalestooluserhemkumar());
	sendKeys(o.getSalestoolemailref(),"hemkumard@digitaltrains.online");
	wait1Seconds();
	elementClick(o.getSalestoolduedate());
	elementClick(o.getSalestoolduedate16());
	wait1Seconds();
	Select s = new Select(o.getSalestoolamountareinusdbox());
	s.selectByIndex(1);
	wait1Seconds();
	sendKeys(o.getSalestooldescription(),"Train running simulation");
	o.getSalestoolunitprice().clear();
	sendKeys(o.getSalestoolunitprice(),"3500");
	o.getSalestoolqty().clear();
	sendKeys(o.getSalestoolqty(),"2");
	wait1Seconds();
	elementClick(o.getSalestooladdbuton());
	wait1Seconds();
	sendKeys(o.getSalestooldescription2(),"Impact Simulation");
	o.getSalestoolunitprice2().clear();
	sendKeys(o.getSalestoolunitprice2(),"2500");
	o.getSalestoolqty2().clear();
	sendKeys(o.getSalestoolqty2(),"2");
	wait1Seconds();
	sendKeys(o.getSalestoolnotetextarea(),"Monthly due");
    wait1Seconds();
	
	
}

@When("User have to click the invoice save button")
public void user_have_to_click_the_invoice_save_button()throws InterruptedException {
	elementClick(o.getSalestoolsavebutton());
	wait5seconds();
}


@When("User have to click the invoice save&send button")
public void user_have_to_click_the_invoice_save_send_button()throws InterruptedException {
	elementClick(o.getSalestoolsaveandsendbutton());
	wait5seconds();
}

@Then("User have to click the invoice cancel button")
public void user_have_to_click_the_invoice_cancel_button()throws InterruptedException {
	elementClick(o.getSalestoolcancelbutton());
	wait5seconds();
}

@Given("User have to click the draft status invoice action button")
public void user_have_to_click_the_draft_status_invoice_action_button() throws InterruptedException{
	mouseOverAction(o.getSalestooldts103());
	wait1Seconds();
    elementClick(o.getSalestooldraftaction());
    wait1Seconds();
   
}

@Given("User have to click the edit invoice option")
public void user_have_to_click_the_edit_invoice_option()throws InterruptedException {
	 elementClick(o.getSalestooldrafteditinvoice());
	 wait1Seconds();
}

@When("User have to change the Exclude to Include tax")
public void user_have_to_change_the_Exclude_to_Include_tax()throws InterruptedException {
	wait1Seconds();
	Select s = new Select(o.getSalestoolamountareinusdbox());
	s.selectByIndex(0);
	wait1Seconds();
}

@Given("User have to click the invoice action button")
public void user_have_to_click_the_invoice_action_button()throws InterruptedException {
	mouseOverAction(o.getSalestooldts101());
	wait1Seconds();
    elementClick(o.getSalestoolactionbutton());
    wait1Seconds();
    
}

@Given("User have to click the viewinvoice option")
public void user_have_to_click_the_viewinvoice_option()throws InterruptedException {
    elementClick(o.getSalestoolactioninvoice());
    wait5seconds();
}

@When("User have to click the download invoice option")
public void user_have_to_click_the_download_invoice_option()throws InterruptedException {
    elementClick(o.getSalestooldwonloadinvoice());
    wait1Seconds();
}


@Then("User have to click the invoice back button")
public void user_have_to_click_the_invoice_back_button() throws InterruptedException {
    driver.navigate().back();
    wait1Seconds();
}


@When("User have to click the resend invoice option")
public void user_have_to_click_the_resend_invoice_option()throws InterruptedException {
	 elementClick(o.getSalestoolresendinvoice());
	    wait1Seconds();
}

@When("User have to click the invoice dwonload pdf option")
public void user_have_to_click_the_invoice_dwonload_pdf_option() throws InterruptedException{
	 elementClick(o.getSalestooldwonloadpdf());
	    wait1Seconds();
}




//Check the functionality of Composite Graph option(Under the my train option)


@Given("User have to mouseover the mytrain and click the action button")
public void user_have_to_mouseover_the_mytrain_and_click_the_action_button() throws InterruptedException {
    
	mouseOverAction(o.getTrainmytrainoption());
	wait1Seconds();
	elementClick(o.getTrainmytrainactionbutton());
	wait1Seconds();
}

@Given("User have to click the review train option")
public void user_have_to_click_the_review_train_option()throws InterruptedException {
    elementClick(o.getTrainreviewoption());
    wait5seconds();
    String url = driver.getCurrentUrl();
	boolean contains = url.contains("trains/review");
	Assert.assertTrue("Check the url",contains);
}

@When("User have to click the first compartment Composite Graph option")
public void user_have_to_click_the_first_compartment_Composite_Graph_option()throws InterruptedException {
 
	elementClick(o.getTraincompositegraph());
    Thread.sleep(4000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrainlegend());
    Thread.sleep(4000);
    elementClick(o.getTraincancelbutton());
    wait1Seconds();
    
}


@When("User have to click the next coupling interface button")
public void user_have_to_click_the_next_coupling_interface_button() throws InterruptedException {
	
	    elementClick(o.getTrainnextcouplerinterface());
	    wait1Seconds();
	    elementClick(o.getTraincompositegraph());
	    Thread.sleep(4000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrainlegend());
	    Thread.sleep(4000);
	    elementClick(o.getTraincancelbutton());
	    wait1Seconds();
}



//Check the project delete option 


@When("User have to mouse over the DVRS one")
public void user_have_to_mouse_over_the_DVRS_one() throws InterruptedException {
    mouseOverAction(o.getProjectDVRS1());
    wait1Seconds();
    
}

@When("User have to click the DVRS one action")
public void user_have_to_click_the_DVRS_one_action()throws InterruptedException {
    elementClick(o.getProjectactionbutton());
    wait1Seconds();
    
}

@When("User have to click the DVRS one delete option")
public void user_have_to_click_the_DVRS_one_delete_option() throws InterruptedException{
    elementClick(o.getProjectdeletebutton());
    wait1Seconds();
    elementClick(o.getProjectconformdelete());
    wait5seconds();
}



//Check the wheel rail profile contact functionality



@When("User have to enter contact name and click and select the wheelprofile")
public void user_have_to_enter_contact_name_and_click_and_select_the_wheelprofile()throws InterruptedException {
	
	sendKeys(o.getWheelrailcontactnamebox(),"New contact profile");
	wait1Seconds();
	elementClick(o.getWheelprofilebox());
	wait1Seconds();
	elementClick(o.getWheelprofilebritishrailp5());
	wait1Seconds();
}

@When("User have to click and select the railprofile")
public void user_have_to_click_and_select_the_railprofile()throws InterruptedException {
	elementClick(o.getRaildataoptionbutton());
	wait1Seconds();
	elementClick(o.getRailprofilebox());
	wait1Seconds();
	elementClick(o.getRailprofileUIC54RAIL());
	wait1Seconds();
	
}


@When("User have to click wheel rail calculate button")
public void user_have_to_click_wheel_rail_calculate_button()throws InterruptedException {
	elementClick(o.getWheelrailcalculate());
    wait5seconds();  
    elementClick(o.getWheelrailreview());
    Thread.sleep(6000);
	
//    elementClick(o.getWheelrailcancelfinalbutton());
//    wait1Seconds();
}





@When("User have to click the wheel and rail profile review contact button")
public void user_have_to_click_the_wheel_and_rail_profile_review_contact_button() throws InterruptedException {
	try {
		elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift3());
	    wait1Seconds();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",o.getNewcontactfullviewofcontact());
	    elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift6());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift9());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift12());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift15());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift18());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift0());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshiftnagative3());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshiftnagative6());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshiftnagative9());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshiftnagative12());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshiftnagative15());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshift());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelateralshiftnagative18());
	    Thread.sleep(3000);
	    elementClick(o.getNewcontactprofilepointplot());
	    wait1Seconds();
	    js.executeScript("arguments[0].scrollIntoView(true)",o.getNewcontactprofilepointplotleftrailincline());
	    wait5seconds();
	    elementClick(o.getNewcontactprofiledataplot());
	    wait1Seconds();
	    js.executeScript("arguments[0].scrollIntoView(true)",o.getNewcontactprofilemm());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofiledataplotselectchannel());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilecontactangleleftwheel());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofiledataplotselectchannel());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilelatposition());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofiledataplotselectchannel());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilevertpostion());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofiledataplotselectchannel());
	    wait1Seconds();
	    elementClick(o.getNewcontactprofilecontactpatcharea());
	    wait1Seconds();
	    
	} catch (Exception e) {
	    elementClick(o.getWheelrailcalculate());
	    Thread.sleep(3000);
	    closeTab();
	}
	
    
}



//Check the View Usage option in the bogie assembly

@When("User have mouseover the y type bogie")
public void user_have_mouseover_the_y_type_bogie()throws InterruptedException {
	
	mouseOverAction(o.getY25bogieoption());
	wait1Seconds();
	
    
}

@When("User have to click the y type action button")
public void user_have_to_click_the_y_type_action_button()throws InterruptedException {
    elementClick(o.getY25bogiesaction());
    wait1Seconds();
    
}

@When("User have to click the y type view usage option")
public void user_have_to_click_the_y_type_view_usage_option()throws InterruptedException {
    elementClick(o.getY25bogieshowoption());
    wait1Seconds();
    String text =o.getY25panelbody().getText();
	System.out.println(text);
	boolean contains = text.contains("My vehicle");
	Assert.assertTrue("Check the usage my vehicle",contains);
    
}

@When("User have to click the view usage view button")
public void user_have_to_click_the_view_usage_view_button() throws InterruptedException {
    elementClick(o.getY25bogieviewoption());
    wait5seconds();
    switchWindow();
    wait1Seconds();
    String url = driver.getCurrentUrl();
	boolean contains = url.contains("vehicles");
	Assert.assertTrue("Check the url",contains);
	wait1Seconds();
    
}



//Check the view usage option in the vehicle 


@Given("User have to mouseover the vehicle option")
public void user_have_to_mouseover_the_vehicle_option()throws InterruptedException {
    
	mouseOverAction(o.getVehiclemyvehicle());
	wait1Seconds();
	
}

@When("User have to click the vehicle action button")
public void user_have_to_click_the_vehicle_action_button()throws InterruptedException {
	
	elementClick(o.getVehicleaction());
	wait1Seconds();
	
}

@When("User have to click the vehicle view usage option")
public void user_have_to_click_the_vehicle_view_usage_option()throws InterruptedException {
	elementClick(o.getVehicleviewusageoption());
    wait1Seconds();
    String text =o.getVehiclepanelbody().getText();
	System.out.println(text);
	boolean contains = text.contains("My train");
	Assert.assertTrue("Check the usage bogie",contains);
	
	
}

@When("User have to click the vehicle view option")
public void user_have_to_click_the_vehicle_view_option() throws InterruptedException {
    
	   elementClick(o.getVehicleusageview());
	    wait5seconds();
	    switchWindow();
	    wait1Seconds();
	    String url = driver.getCurrentUrl();
		boolean contains = url.contains("trains");
		Assert.assertTrue("Check the url",contains);
		wait1Seconds();
	
}



//Check the view usage option in the train 


@When("User have to mouseover the train option")
public void user_have_to_mouseover_the_train_option() throws InterruptedException {
	mouseOverAction(o.getTrainmytrain());
	wait1Seconds();
}

@When("User have to click the train action button")
public void user_have_to_click_the_train_action_button() throws InterruptedException {
	elementClick(o.getTrainaction());
	wait1Seconds();
}

@When("User have to click the train view usage option")
public void user_have_to_click_the_train_view_usage_option() throws InterruptedException {
    
	elementClick(o.getTrainviewusageoption());
    wait1Seconds();
    String text =o.getTrainpanelbody().getText();
	System.out.println(text);
	boolean contains = text.contains("Running Train");
	Assert.assertTrue("Check the usage train",contains);
	
}

@When("User have to click the train view option")
public void user_have_to_click_the_train_view_option() throws InterruptedException {
    
	    elementClick(o.getTrainview());
	    wait5seconds();
	    switchWindow();
	    wait1Seconds();
	    String url = driver.getCurrentUrl();
		boolean contains = url.contains("projects");
		Assert.assertTrue("Check the url",contains);
		wait1Seconds();
	
}





//Check the view usage option in  the project


@When("User have to click the DVRS one project button")
public void user_have_to_click_the_DVRS_one_project_button()throws InterruptedException  {
    elementClick(o.getProjectDVRS01());
    wait1Seconds();
}

@When("User have to mouseover the running train simulation")
public void user_have_to_mouseover_the_running_train_simulation()throws InterruptedException  {

	mouseOverAction(o.getProjectrunningtrain());
	wait1Seconds();
	
}

@When("User have to click the project acton button")
public void user_have_to_click_the_project_acton_button()throws InterruptedException  {
	elementClick(o.getProjectrunningtrainaction());
	wait1Seconds();
}

@When("User have ro click the project view usageusage option")
public void user_have_ro_click_the_project_view_usageusage_option() throws InterruptedException {

	elementClick(o.getProjectrunningtrainshowusage());
    wait1Seconds();
    String text =o.getProjectrunnigtrainpanelbody().getText();
	System.out.println(text);
	boolean contains = text.contains("Reverse curve route profile");
	Assert.assertTrue("Check the usage train",contains);
	wait1Seconds();
}

@When("User have to click the project view option")
public void user_have_to_click_the_project_view_option() throws InterruptedException {
	    elementClick(o.getProjectrunningtrainviewbutton());
	    wait5seconds();
	    switchWindow();
	    wait1Seconds();
	    String url = driver.getCurrentUrl();
		boolean contains = url.contains("terrains");
		Assert.assertTrue("Check the url",contains);
		wait1Seconds();
	

}



//Train to train impact simulation under DVRS 2 project


@Given("User have to mouseover the DVRS two and click the action button")
public void user_have_to_mouseover_the_DVRS_two_and_click_the_action_button() throws InterruptedException{
	String url = driver.getCurrentUrl();
	boolean contains = url.contains("projects");
    Assert.assertTrue("Check the url",contains);
    mouseOverAction(o.getTraintotrainDVRS2());
    wait1Seconds();
    elementClick(o.getTraintotrainactionbutton());
    wait1Seconds();
}

@Given("User have to click the DVRS two create simulation option")
public void user_have_to_click_the_DVRS_two_create_simulation_option()throws InterruptedException {
    elementClick(o.getTraintotraincreatesimulation());
    wait1Seconds();
}

@When("User have to enter the DVRS two simulation name")
public void user_have_to_enter_the_DVRS_two_simulation_name()throws InterruptedException {
    sendKeys(o.getTraintotrainsuimulationnamebox(),"Train1 to train2 impact simulation");
    wait1Seconds();
   
    
}

@When("User have to enter the DVRS two simulation speed")
public void user_have_to_enter_the_DVRS_two_simulation_speed()throws InterruptedException {
	 sendKeys(o.getTraintotrainsimulationspeed(),"20");
	    wait1Seconds();
}

@When("User have to fill the train one all data in DVRS two")
public void user_have_to_fill_the_train_one_all_data_in_DVRS_two() throws InterruptedException{
    elementClick(o.getTraintotrainselecttrain());
    wait1Seconds();
    elementClick(o.getPubliclibrary4X90tonnewagons());
    wait1Seconds();
    elementClick(o.getTraintotrainmassconditionbox());
    wait1Seconds();
    elementClick(o.getTraintotrainmassAW2());
    wait1Seconds();
    sendKeys(o.getTraintotrainbrakesbox(),"0");
}

@When("User have to fill the train two all data in DVRS two")
public void user_have_to_fill_the_train_two_all_data_in_DVRS_two()throws InterruptedException {
    elementClick(o.getTraintotrain2());
    wait1Seconds();
    sendKeys(o.getTraintotrainbrakes2(),"0.2");
    wait1Seconds();
}

@When("User have to click the DVRS two run button")
public void user_have_to_click_the_DVRS_two_run_button()throws InterruptedException {
    elementClick(o.getTraintotrainrunbutton());
    Thread.sleep(18000);
}

@When("User have to click the DVRS two simulation result button")
public void user_have_to_click_the_DVRS_two_simulation_result_button()throws InterruptedException {
    elementClick(o.getTraintotrainsimulationresults());
    wait5seconds();
}

@When("User have to scroll down force and displacement in DVRS two")
public void user_have_to_scroll_down_force_and_displacement_in_DVRS_two()throws InterruptedException {
    wait5seconds();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTraintotrainscrolltotalforace());
    wait5seconds();
    
    
}

@When("User have to click the DVRS two threeD view button")
public void user_have_to_click_the_DVRS_two_threeD_view_button() throws InterruptedException {
    elementClick(o.getTraintotrain3Dview());
    Thread.sleep(70000);
    elementClick(o.getTraintotrainplaybutton());
    wait5seconds();
    
}




//Compare the two simulation and check the graphs


@Given("User have to click the DVRS two project mouseover the simulation")
public void user_have_to_click_the_DVRS_two_project_mouseover_the_simulation()throws InterruptedException  {
	
	String url = driver.getCurrentUrl();
	boolean contains = url.contains("projects");
    Assert.assertTrue("Check the url",contains);
    elementClick(o.getTraintotrainDVRS2());
    wait1Seconds();
    mouseOverAction(o.getTrain1andtrain2simulation());
    wait1Seconds();
    
    
}

@Given("User have to click the train one and train two simulation action button")
public void user_have_to_click_the_train_one_and_train_two_simulation_action_button() throws InterruptedException {
	elementClick(o.getTrain1andtrain2action());
    wait1Seconds();
}

@Given("User have to click the the simulation compare option")
public void user_have_to_click_the_the_simulation_compare_option()throws InterruptedException  {
    elementClick(o.getTrain1andtrain2comparesimulation());
    wait1Seconds();
}

@When("User have to first select the project and select the library option")
public void user_have_to_first_select_the_project_and_select_the_library_option()throws InterruptedException  {
    elementClick(o.getTrain1andtrain2selectproject());
    wait5seconds();
    elementClick(o.getTrain1andtrain2DVRS1());
    wait1Seconds();
    elementClick(o.getTrain1andtrain2selectlibrary());
    wait1Seconds();
    elementClick(o.getTrain1andtrain2selectimpacttest());
    wait1Seconds();
}

@When("User have to click compare selected button")
public void user_have_to_click_compare_selected_button()throws InterruptedException  {
    elementClick(o.getTrain1andtrain2compareselected());
    wait1Seconds();
}

@When("User have to scroll down the graph view")
public void user_have_to_scroll_down_the_graph_view()throws InterruptedException  {
	String url = driver.getCurrentUrl();
	boolean contains = url.contains("compare");
    Assert.assertTrue("Check the url",contains);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2overviewgraphscrollpoint());
    wait5seconds();
}

@When("User have to click the graph option and select the force time and scroll down")
public void user_have_to_click_the_graph_option_and_select_the_force_time_and_scroll_down()throws InterruptedException  {
    elementClick(o.getTrain1andtrain2graphoption());
    wait1Seconds();
    elementClick(o.getTrain1andtrain2cascadeforcetime());
    wait1Seconds();
    String url = driver.getCurrentUrl();
	boolean contains = url.contains("cascade-force");
    Assert.assertTrue("Check the url",contains);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2forcetimescroll1());
    wait1Seconds();
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2forcetimescroll2());
    wait1Seconds();
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2forcetimescroll3());
    wait1Seconds();
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2forcetimescroll4());
    wait1Seconds();
    
    
}

@When("User have to click the graph option and select the velocity time and scroll down")
public void user_have_to_click_the_graph_option_and_select_the_velocity_time_and_scroll_down() throws InterruptedException {
    elementClick(o.getTrain1andtrain2graphoption());
    wait1Seconds();
    elementClick(o.getTrain1andtrain2cascadevelocitytime());
    wait1Seconds();
    String url = driver.getCurrentUrl();
	boolean contains = url.contains("cascade-velocity");
    Assert.assertTrue("Check the url",contains);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2velocitytimescroll1());
    wait1Seconds();
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2velocitytimescroll2());
    wait1Seconds();
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2velocitytimescroll3());
    wait1Seconds();
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2velocitytimescroll4());
    wait1Seconds();
}

@When("User have to click the graph option and select the acceleration time and scroll down")
public void user_have_to_click_the_graph_option_and_select_the_acceleration_time_and_scroll_down() throws InterruptedException {
    elementClick(o.getTrain1andtrain2graphoption());
    wait1Seconds();
    elementClick(o.getTrain1andtrain2cascadeaccelerationtime());
    wait1Seconds();
    String url = driver.getCurrentUrl();
  	boolean contains = url.contains("cascade-acceleration");
      Assert.assertTrue("Check the url",contains);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2accelerationtimescroll1());
    wait1Seconds();
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2accelerationtimescroll2());
    wait1Seconds();
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2accelerationtimescroll3());
    wait1Seconds();
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2accelerationtimescroll4());
    wait1Seconds();
}

@When("User have to click the graph option and select the displacement time and scroll down")
public void user_have_to_click_the_graph_option_and_select_the_displacement_time_and_scroll_down()throws InterruptedException  {
    elementClick(o.getTrain1andtrain2graphoption());
    wait1Seconds();
    elementClick(o.getTrain1andtrain2cascadedisplacementtime());
    wait1Seconds();
    String url = driver.getCurrentUrl();
  	boolean contains = url.contains("cascade-displacement");
      Assert.assertTrue("Check the url",contains);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2displacementtimescroll1());
    wait1Seconds();
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2displacementtimescroll2());
    wait1Seconds();
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2displacementtimescroll3());
    wait1Seconds();
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2displacementtimescroll4());
    wait1Seconds();
}

@When("User have to click the graph overview option")
public void user_have_to_click_the_graph_overview_option() throws InterruptedException {
    elementClick(o.getTrain1andtrain2overviewgraph());
    wait5seconds();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getTrain1andtrain2overviewgraphscrollpoint());
    wait1Seconds();
}





//Check the invoice mail options and invoice details


@Given("User have to launch browser and MailHog url")
public void user_have_to_launch_browser_and_MailHog_url() throws InterruptedException{
    launchChromeBrowser();
    screenMaximize();
    launchURL("https://oleo:Coventry@test.digitaltrains.online:8025/");
//    ChromeOptions options = new ChromeOptions();
//    options.addArguments("--disable-infobars");
    Thread.sleep(10000);
    o=new OleoPojo();
    wait1Seconds();
	
}
@Given("User have to click the first mail")
public void user_have_to_click_the_first_mail()throws InterruptedException {
    elementClick(o.getMailHogselectfirstmail());
    Thread.sleep(6000);
}

@Given("User have to click the payonline button in MailHog")
public void user_have_to_click_the_payonline_button_in_MailHog() throws InterruptedException {

	driver.switchTo().frame(o.getMailHogswitchtoframe());
	elementClick(o.getMailHogpayonlinebutton());
	Thread.sleep(6000);
  
    
    
}
@Given("User have to switch to the window and enter username and password click the submit button")
public void user_have_to_switch_to_the_window_and_enter_username_and_password_click_the_submit_button() throws InterruptedException {
	    switchWindow();
	    wait1Seconds();
	    WebElement findElement = driver.findElement(By.xpath("(//form[@action=\"#\"])[1]"));
	    switchToFrameWebelement(findElement);
	    sendKeys(o.getMailHogusername(),"hemkumard@digitaltrains.online");// Mail id
	    wait1Seconds();
		sendKeys(o.getMailHogpassword(),"Password!12");
		wait1Seconds();
		elementClick(o.getMailHogsubmitbutton());
		wait5seconds();
}


@Given("User have to enter the mail check the invoice date")
public void user_have_to_enter_the_mail_check_the_invoice_date() {
	
	String text = o.getMailHoginvoicecenter().getText();
	boolean contains = text.contains("Invoice Date");
    Assert.assertTrue("Check the invoice date",contains);
	
}

@Given("User have to check the due date")
public void user_have_to_check_the_due_date() {
	String text = o.getMailHoginvoicecenter().getText();
	boolean contains = text.contains("Due Date");
    Assert.assertTrue("Check the Due Date",contains);
}

@Given("User have to check the invoice number")
public void user_have_to_check_the_invoice_number() {
	String text = o.getMailHoginvoicecenter().getText();
	boolean contains = text.contains("Invoice No");
    Assert.assertTrue("Check the Invoice Number",contains);
}

@When("User have to check the amount due")
public void user_have_to_check_the_amount_due() {
	String text = o.getMailHoginvoicecenter().getText();
	boolean contains = text.contains("Amount Due");
    Assert.assertTrue("Check the Amount Due",contains);
}

@When("User have to check the card number field")
public void user_have_to_check_the_card_number_field() {
	String text = o.getMailHoginvoicecenter().getText();
	boolean contains = text.contains("Card number");
    Assert.assertTrue("Check the Card number",contains);
}

@When("User have to check the expiry date field")
public void user_have_to_check_the_expiry_date_field() {
	String text = o.getMailHoginvoicecenter().getText();
	boolean contains = text.contains("Expiry");
    Assert.assertTrue("Check the Expiry date",contains);
}

@When("User have to check the CVC field")
public void user_have_to_check_the_CVC_field() {
	String text = o.getMailHoginvoicecenter().getText();
	boolean contains = text.contains("CVC");
    Assert.assertTrue("Check the CVC",contains);
}

@When("User have to check the country option")
public void user_have_to_check_the_country_option() {
	String text = o.getMailHoginvoicecenter().getText();
	boolean contains = text.contains("Country");
    Assert.assertTrue("Check the Country",contains);
}
@Then("User have to chcek the paynow button")
public void user_have_to_chcek_the_paynow_button() {
	String text = o.getMailHoginvoicecenter().getText();
	boolean contains = text.contains("Pay now");
    Assert.assertTrue("Check the Pay now button",contains);
    
}


@Given("User have to fill the visa card number details")
public void user_have_to_fill_the_visa_card_number_details() throws InterruptedException {
    sendKeys(o.getMailHogcardnumberbox(),"4242424242424242");
    wait5seconds();
}

@When("User have to see the visa icon showing the side")
public void user_have_to_see_the_visa_icon_showing_the_side()throws InterruptedException {
	String text = o.getMailHognetworkinput().getText();
	boolean contains = text.contains("Visa");
    Assert.assertTrue("Check the visa",contains);
    Thread.sleep(3000);
    
}

@Then("User have to clear the card details")
public void user_have_to_clear_the_card_details() throws InterruptedException{
    o.getMailHogcardnumberbox().clear();
    wait1Seconds();
}

@Given("User have to fill the master card number details")
public void user_have_to_fill_the_master_card_number_details() throws InterruptedException{
	   sendKeys(o.getMailHogcardnumberbox(),"5555555555554444");
	    wait1Seconds();
}

@When("User have to see the master card icon showing the side")
public void user_have_to_see_the_master_card_icon_showing_the_side()throws InterruptedException {
	String text = o.getMailHognetworkinput().getText();
	boolean contains = text.contains("Master");
    Assert.assertTrue("Check the Master",contains);
    Thread.sleep(3000);
}

@Given("User have to fill the American express number details")
public void user_have_to_fill_the_American_express_number_details()throws InterruptedException {
	   sendKeys(o.getMailHogcardnumberbox(),"378282246310005");
	    wait1Seconds();
}

@When("User have to see the American express icon showing the side")
public void user_have_to_see_the_American_express_icon_showing_the_side()throws InterruptedException {
	String text = o.getMailHognetworkinput().getText();
	boolean contains = text.contains("American express");
    Assert.assertTrue("Check the American express",contains);
    Thread.sleep(3000);
}

@Given("User have to fill the discover number details")
public void user_have_to_fill_the_discover_number_details()throws InterruptedException {
	   sendKeys(o.getMailHogcardnumberbox(),"6011111111111117");
	    wait1Seconds();
}

@When("User have to see the discover icon showing the side")
public void user_have_to_see_the_discover_icon_showing_the_side()throws InterruptedException {
	String text = o.getMailHognetworkinput().getText();
	boolean contains = text.contains("Discover");
    Assert.assertTrue("Check the Discover",contains);
    Thread.sleep(3000);
}

@Given("User have to fill the dinerscard number details")
public void user_have_to_fill_the_dinerscard_number_details()throws InterruptedException {
	   sendKeys(o.getMailHogcardnumberbox(),"3056930009020004");
	    wait1Seconds();
}

@When("User have to see the dinerscard icon showing the side")
public void user_have_to_see_the_dinerscard_icon_showing_the_side() throws InterruptedException{
	String text = o.getMailHognetworkinput().getText();
	boolean contains = text.contains("Dinerscard");
    Assert.assertTrue("Check the Dinerscard",contains);
    Thread.sleep(3000);
}

@Given("User have to fill the unionpay number details")
public void user_have_to_fill_the_unionpay_number_details()throws InterruptedException {
	   sendKeys(o.getMailHogcardnumberbox(),"6200000000000005");
	    wait1Seconds();
}

@When("User have to see the unionpay icon showing the side")
public void user_have_to_see_the_unionpay_icon_showing_the_side()throws InterruptedException {
	String text = o.getMailHognetworkinput().getText();
	boolean contains = text.contains("Unionpay");
    Assert.assertTrue("Check the unionpay",contains);
    Thread.sleep(3000);
}




//Check the functionality of simulation result graph option


@When("User have to mouse over the DVRS two and click the action button in simulation result")
public void user_have_to_mouse_over_the_DVRS_two_and_click_the_action_button_in_simulation_result()throws InterruptedException {
    elementClick(o.getDigitaltrainsdvrs2project());
    wait1Seconds();
    mouseOverAction(o.getDigitaltrainstraintotrainimpactsimulation());
    wait1Seconds();
    elementClick(o.getDigitaltrainstraintotrainactionbutton());
    wait1Seconds();
}

@When("User have to click the view result option in simulation result")
public void user_have_to_click_the_view_result_option_in_simulation_result()throws InterruptedException {
    elementClick(o.getDigitaltrainstraintotrainviewresultoption());
    wait5seconds();
}

@Then("User have to check the graph option is present or not")
public void user_have_to_check_the_graph_option_is_present_or_not()throws InterruptedException {
    String text = o.getDigitaltrainssimulationviewresultpanel().getText();
    System.out.println(text);
    boolean contains = text.contains("OVERVIEW GRAPHS");
    Assert.assertTrue("Check the graph is presnt or not",contains);
    wait1Seconds();
}

@Given("User have to click the simulation graph option")
public void user_have_to_click_the_simulation_graph_option()throws InterruptedException {
    elementClick(o.getDigitaltrainstraintotraingraphs());
    wait1Seconds();
}

@When("User have to enter simulation result graph url")
public void user_have_to_enter_simulation_result_graph_url()throws InterruptedException {
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("results/view");
    Assert.assertTrue("Check the graph url",contains);
    wait1Seconds();
    
}

@Then("User have to check the dropdown is contain maximun force")
public void user_have_to_check_the_dropdown_is_contain_maximun_force()throws InterruptedException {
    String text = o.getDigitaltrainsdropdwonpanel().getText();
    boolean contains = text.contains("Maximum Force");
    Assert.assertTrue("Check the dropdwon maximum force present or not",contains);
    wait1Seconds();
}

@Given("User have to click the force graph in simulation result")
public void user_have_to_click_the_force_graph_in_simulation_result()throws InterruptedException {
    elementClick(o.getDigitaltrainstraintotrainforcegraph());
    wait1Seconds();
}

@When("User have to scrolldwon the simulation result force graph")
public void user_have_to_scrolldwon_the_simulation_result_force_graph()throws InterruptedException {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(true)",o.getDigitaltrainstraintotraingraphscrolldown1());
	 wait1Seconds();
}

@Then("User have to enter the simulation result force graph URL")
public void user_have_to_enter_the_simulation_result_force_graph_URL()throws InterruptedException {
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("force");
    Assert.assertTrue("Check the url",contains);
    wait1Seconds();
    
}

@Given("User have to click the velocity graph in simulation result")
public void user_have_to_click_the_velocity_graph_in_simulation_result()throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(false)",o.getDigitaltrainssimulationresultscrollup());
	 wait1Seconds();
	elementClick(o.getDigitaltrainstraintotraingraphs());
	wait1Seconds();
    elementClick(o.getDigitaltrainstraintotrainvelocitygraph());
    wait1Seconds();
}

@When("User have to scrolldwon the simulation result velocity graph")
public void user_have_to_scrolldwon_the_simulation_result_velocity_graph()throws InterruptedException {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(true)",o.getDigitaltrainstraintotraingraphscrolldown2());
	 wait1Seconds();
}

@Then("User have to enter the simulation result velocity graph URL")
public void user_have_to_enter_the_simulation_result_velocity_graph_URL()throws InterruptedException {
	  String currentUrl = driver.getCurrentUrl();
	  boolean contains = currentUrl.contains("velocity");
	  Assert.assertTrue("Check the url",contains);
	  wait1Seconds();
}

@Given("User have to click the Acceleration graph in simulation result")
public void user_have_to_click_the_Acceleration_graph_in_simulation_result()throws InterruptedException {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(false)",o.getDigitaltrainssimulationresultscrollup());
	 wait1Seconds();
	elementClick(o.getDigitaltrainstraintotraingraphs());
	wait1Seconds();
    elementClick(o.getDigitaltrainstraintotrainaccelerationgraph());
    wait1Seconds();
}

@When("User have to scrolldwon the simulation result Acceleration graph")
public void user_have_to_scrolldwon_the_simulation_result_Acceleration_graph()throws InterruptedException {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(true)",o.getDigitaltrainstraintotraingraphscrolldown3());
	 wait1Seconds();
}

@Then("User have to enter the simulation result Acceleration graph URL")
public void user_have_to_enter_the_simulation_result_Acceleration_graph_URL()throws InterruptedException {
	 String currentUrl = driver.getCurrentUrl();
	  boolean contains = currentUrl.contains("acceleration");
	  Assert.assertTrue("Check the url",contains);
	  wait1Seconds();
}

@Given("User have to click the Displacement graph in simulation result")
public void user_have_to_click_the_Displacement_graph_in_simulation_result()throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(false)",o.getDigitaltrainssimulationresultscrollup());
	 wait1Seconds();
	 elementClick(o.getDigitaltrainstraintotraingraphs());
	wait1Seconds();
    elementClick(o.getDigitaltrainstraintotraindisplacementgraph());
    wait1Seconds();
}

@When("User have to scrolldwon the simulation result Displacement graph")
public void user_have_to_scrolldwon_the_simulation_result_Displacement_graph()throws InterruptedException {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(true)",o.getDigitaltrainstraintotraingraphscrolldown4());
	 wait1Seconds();
}

@Then("User have to enter the simulation result Displacement graph URL")
public void user_have_to_enter_the_simulation_result_Displacement_graph_URL()throws InterruptedException {
	String currentUrl = driver.getCurrentUrl();
	boolean contains = currentUrl.contains("displacement");
	Assert.assertTrue("Check the url",contains);
    wait1Seconds();
}

@Given("User have to click the Energy Balance graph in simulation result")
public void user_have_to_click_the_Energy_Balance_graph_in_simulation_result()throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)",o.getDigitaltrainssimulationresultscrollup());
	wait1Seconds();
	elementClick(o.getDigitaltrainstraintotraingraphs());
	wait1Seconds();
    elementClick(o.getDigitaltrainstraintotrainenergybalance());
    wait1Seconds();
}

@When("User have to scrolldwon the simulation result Energy Balance graph")
public void user_have_to_scrolldwon_the_simulation_result_Energy_Balance_graph()throws InterruptedException {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(true)",o.getDigitaltrainsenergybalancescroll());
	 wait1Seconds();
}

@Then("User have to enter the simulation result Energy Balance graph URL")
public void user_have_to_enter_the_simulation_result_Energy_Balance_graph_URL()throws InterruptedException {
	  String title = driver.getTitle();
	  System.out.println(title);
	  boolean contains = title.contains("DigitalTrains - Simulation Results");
	  Assert.assertTrue("Check the url",contains);
	  wait1Seconds();
	  elementClick(o.getDigitaltrainstraintotrainenergybalancecancel());
	  wait1Seconds();
}

@Given("User have to click the Energy Absorbed graph in simulation result")
public void user_have_to_click_the_Energy_Absorbed_graph_in_simulation_result()throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(false)",o.getDigitaltrainssimulationresultscrollup());
	 wait1Seconds();
	elementClick(o.getDigitaltrainstraintotraingraphs());
	wait1Seconds();
    elementClick(o.getDigitaltrainstraintotrainenergyabsorbed());
    wait1Seconds();
}

@When("User have to scrolldwon the simulation result Energy Absorbed graph")
public void user_have_to_scrolldwon_the_simulation_result_Energy_Absorbed_graph()throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",o.getDigitaltrainstraintotraincouplinginterfacescrolldown());
	wait1Seconds();
}

@Then("User have to enter the simulation result Energy Absorbed graph URL")
public void user_have_to_enter_the_simulation_result_Energy_Absorbed_graph_URL()throws InterruptedException {
	  String currentUrl = driver.getCurrentUrl();
	  boolean contains = currentUrl.contains("absorbed");
	  Assert.assertTrue("Check the url",contains);
	  wait1Seconds();
}

@Given("User have to click the Energy Stored graph in simulation result")
public void user_have_to_click_the_Energy_Stored_graph_in_simulation_result()throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(false)",o.getDigitaltrainssimulationresultscrollup());
	 wait1Seconds();
	elementClick(o.getDigitaltrainstraintotraingraphs());
	wait1Seconds();
    elementClick(o.getDigitaltrainstraintotrainenergystored());
    wait1Seconds();
}

@When("User have to scrolldwon the simulation result Energy Stored graph")
public void user_have_to_scrolldwon_the_simulation_result_Energy_Stored_graph()throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",o.getDigitaltrainstraintotraincouplinginterfacescrolldown());
	wait1Seconds();
}

@Then("User have to enter the simulation result Energy Stored graph URL")
public void user_have_to_enter_the_simulation_result_Energy_Stored_graph_URL()throws InterruptedException {
	  String currentUrl = driver.getCurrentUrl();
	  boolean contains = currentUrl.contains("energy-stored");
	  Assert.assertTrue("Check the url",contains);
	  wait1Seconds();
}

@Given("User have to click the Maximum Force graph in simulation result")
public void user_have_to_click_the_Maximum_Force_graph_in_simulation_result()throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(false)",o.getDigitaltrainssimulationresultscrollup());
	 wait1Seconds();
	elementClick(o.getDigitaltrainstraintotraingraphs());
	wait1Seconds();
	elementClick(o.getDigitaltrainstraintotrainmaximunforce());
	wait1Seconds();
}

@When("User have to scrolldwon the simulation result Maximum Force graph")
public void user_have_to_scrolldwon_the_simulation_result_Maximum_Force_graph() throws InterruptedException{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",o.getDigitaltrainstraintotraincouplinginterfacescrolldown());
	wait1Seconds();
}

@Then("User have to enter the simulation result Maximum Force graph URL")
public void user_have_to_enter_the_simulation_result_Maximum_Force_graph_URL() throws InterruptedException {
	String currentUrl = driver.getCurrentUrl();
	  boolean contains = currentUrl.contains("max-force");
	  Assert.assertTrue("Check the url",contains);
	  wait1Seconds();
	  quitTab();
}




//Check the simulation additional speed setting option 



@When("User have to click the edit speed option")
public void user_have_to_click_the_edit_speed_option()throws InterruptedException {
    elementClick(o.getSpeedsettingeditoption());
    wait1Seconds();
}

@Then("User have to enter the edit simulation setting")
public void user_have_to_enter_the_edit_simulation_setting()throws InterruptedException {
	
	String text = o.getSpeedsettingpagecontent().getText();
    System.out.println(text);
    boolean contains = text.contains("Edit Simulation Settings");
    Assert.assertTrue("Check the page title", contains);
    wait1Seconds();
}

@Given("User have to click the add speed setting option")
public void user_have_to_click_the_add_speed_setting_option()throws InterruptedException {
    elementClick(o.getSpeedsettingplusbutton());
    wait1Seconds();
  
    
}

@Given("User have to enter the second speed value in the second box")
public void user_have_to_enter_the_second_speed_value_in_the_second_box()throws InterruptedException {
	    o.getSpeedsettinginputbox().clear();
	    sendKeys(o.getSpeedsettinginputbox(),"50");
	    wait1Seconds();
	    
}

@When("User have to click the save the speed setting")
public void user_have_to_click_the_save_the_speed_setting()throws InterruptedException {
	elementClick(o.getSpeedsettingsavebutton());
    Thread.sleep(25000);
}

@When("User have to click simulation result the after adding second speed")
public void user_have_to_click_simulation_result_the_after_adding_second_speed()throws InterruptedException {
    elementClick(o.getSpeedsettingsimulationresults());
    Thread.sleep(10000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)",o.getSpeedsettingsimulationresultsscrolldown());
	wait5seconds();
    
   
}

@Then("User have to click the select the second speed option")
public void user_have_to_click_the_select_the_second_speed_option() throws InterruptedException {
    elementClick(o.getSpeedsettingselectbox());
    wait1Seconds();
    elementClick(o.getSpeedsettingselectsecodoption());
    wait5seconds();
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)",o.getSpeedsettingsimulationresultsscrolldown());
	wait5seconds();
	quitTab();
    
}





// Smoke test scripts



@When("User have to click the project smoke option and click the three type of simulation")
public void user_have_to_click_the_project_smoke_option_and_click_the_three_type_of_simulation() throws InterruptedException {
    o=new OleoPojo();
	elementClick(o.getProjectsmoke());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("projects");
    Assert.assertTrue("Check the url",contains);
	 wait1Seconds();
    elementClick(o.getProjectcreatesimulationsmoke());
    wait5seconds();
    elementClick(o.getProjectbufferstopsimulationsmoke());
    wait1Seconds();
    elementClick(o.getProjecttrainrunningsimulationsmoke());
    wait1Seconds();
    elementClick(o.getProjecttrainimpactsimulationsmoke());
    wait1Seconds();
    elementClick(o.getCreatesimulationcancelsmoke());
    wait5seconds();
    elementClick(o.getProjectsmoke());
    wait1Seconds();
    elementClick(o.getCreateprojectsmoke());
    wait1Seconds();
    elementClick(o.getCancelprojectsmoke());
    wait1Seconds();
}

@Then("User have to click the page back button")
public void user_have_to_click_the_page_back_button() throws InterruptedException {
    driver.navigate().back();
    wait1Seconds();
}

@Given("User have to click the train smoke option")
public void user_have_to_click_the_train_smoke_option() throws InterruptedException {
    elementClick(o.getTrainsmoke());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("trains");
    Assert.assertTrue("Check the url",contains);
    wait1Seconds();
    
}

@When("User have to click the main three type of train cration")
public void user_have_to_click_the_main_three_type_of_train_cration() throws InterruptedException {
    elementClick(o.getTraindropdownbutton());
    wait1Seconds();
}

@Then("User have to click the type of train options")
public void user_have_to_click_the_type_of_train_options() throws InterruptedException {
    elementClick(o.getCreatwithtrainbuildersmoke());
    wait1Seconds();
    elementClick(o.getReturntotrainbuttonsmoke());
    wait1Seconds();
    elementClick(o.getTraindropdownbutton());
    wait1Seconds();
    elementClick(o.getCreatwithtrainbuildersmoke());
    wait1Seconds();
    elementClick(o.getReturntotrainbuttonsmoke());
    wait1Seconds();
    elementClick(o.getTraindropdownbutton());
    wait1Seconds();
    elementClick(o.getCopyfromlibrarysmoke());
    wait1Seconds();
    elementClick(o.getCancelbuttononetrainsmoke());
    wait1Seconds();
    elementClick(o.getTraindropdownbutton());
    wait1Seconds();
    elementClick(o.getCreatewithvehiclesmoke());
    wait1Seconds();
    elementClick(o.getCancelbuttononetrainsmoke());
    wait1Seconds();
}

@Given("User have to click the vehicle smoke option")
public void user_have_to_click_the_vehicle_smoke_option() throws InterruptedException {
    elementClick(o.getVehiclessmoke());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("vehicles");
    Assert.assertTrue("Check the url",contains);
    wait1Seconds();
    
}

@When("User have to click the create vehicle smoke option")
public void user_have_to_click_the_create_vehicle_smoke_option() throws InterruptedException {
    elementClick(o.getCreatevehiclesmoke());
    wait1Seconds();
    elementClick(o.getCancelbuttonvehiclesmoke());
    wait1Seconds();
}

@Given("User have to click the wheel rail smoke profile option")
public void user_have_to_click_the_wheel_rail_smoke_profile_option()throws InterruptedException {
    elementClick(o.getWheelrailsmoke());
    wait1Seconds();
    
    
}

@Given("User have to click the two types of profile smoke option")
public void user_have_to_click_the_two_types_of_profile_smoke_option()throws InterruptedException {
    elementClick(o.getProfilesmoke());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("profiles");
    Assert.assertTrue("Check the url",contains);
    wait1Seconds();
    elementClick(o.getCreateprofilesmoke());
    wait5seconds();
    elementClick(o.getWheelprofilesmoke());
    wait5seconds();
    elementClick(o.getWheelprofilecancelsmoke());
    wait1Seconds();
    
    elementClick(o.getCreateprofilesmoke());
    wait1Seconds();
    elementClick(o.getRailprofilesmoke());
    wait5seconds();
    elementClick(o.getRailprofilecancelsmoke());
    wait1Seconds();
 
}

@When("User have to click the wheel rail contact smoke option")
public void user_have_to_click_the_wheel_rail_contact_smoke_option()throws InterruptedException {
    elementClick(o.getWheelrailsmoke());
    wait1Seconds();
    
  
}

@When("User have to click the contact profile smoke option")
public void user_have_to_click_the_contact_profile_smoke_option()throws InterruptedException {
	  elementClick(o.getWheelrailcontactsmoke());
	  wait5seconds();
	  String currentUrl = driver.getCurrentUrl();
	  boolean contains = currentUrl.contains("contacts");
	  Assert.assertTrue("Check the url",contains);
	  wait1Seconds();
	  elementClick(o.getWheelrailCreatecontactsmoke());
	  Thread.sleep(2000);
	  elementClick(o.getWheelrailcontactcancelsmoke());
	  wait1Seconds();
}

@Given("User have to click the bogie part smoke option")
public void user_have_to_click_the_bogie_part_smoke_option()throws InterruptedException {
    elementClick(o.getBogiesmoke());
    wait1Seconds();
}

@Given("User have to click the create part and check the all part option")
public void user_have_to_click_the_create_part_and_check_the_all_part_option() throws InterruptedException{
    elementClick(o.getBogiepartsmoke());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("parts");
    Assert.assertTrue("Check the url",contains);
    wait1Seconds();
    elementClick(o.getBogiecreatepartsmoke());
    Thread.sleep(2000);
    elementClick(o.getBogiemasssmoke());
    wait1Seconds();
    elementClick(o.getBogiemasscancelsmoke());
    wait1Seconds();
    elementClick(o.getBogiecreatepartsmoke());
    Thread.sleep(2000);
    elementClick(o.getBogiewheelsetsmoke());
    wait1Seconds();
    elementClick(o.getBogiewheelsetcancelsmoke());
    wait1Seconds();
    
}

@When("User have to click the bogie assemblie smoke option")
public void user_have_to_click_the_bogie_assemblie_smoke_option()throws InterruptedException {
    elementClick(o.getBogiesmoke());
    wait1Seconds();
    elementClick(o.getBogieassembliesmoke());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("bogies");
    Assert.assertTrue("Check the url",contains);
    wait1Seconds();
    
}

@When("User have to click the create assemblie smoke button")
public void user_have_to_click_the_create_assemblie_smoke_button()throws InterruptedException {
	elementClick(o.getBogiecreatebogiesmoke());
    Thread.sleep(2000);
    elementClick(o.getBogiecreatebogiecancelbuttonsmoke());
    wait1Seconds();
}

@Given("User have to click the gauges smoke option")
public void user_have_to_click_the_gauges_smoke_option()throws InterruptedException {
    elementClick(o.getGaugessmoke());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("gauges");
    Assert.assertTrue("Check the url",contains);
    wait1Seconds();
}

@Given("User have to click the create gauge smoke button")
public void user_have_to_click_the_create_gauge_smoke_button()throws InterruptedException {
       elementClick(o.getCreategaugesmoke());
       wait1Seconds();
}

@When("User have to check the two type of gauges smoke option")
public void user_have_to_check_the_two_type_of_gauges_smoke_option()throws InterruptedException {
    elementClick(o.getCreatevehiclegaugesmoke());
    Thread.sleep(2000);
    elementClick(o.getCreatevehiclegaugecancel());
    wait1Seconds();
    elementClick(o.getCreategaugesmoke());
    wait1Seconds();
    elementClick(o.getCreatestructuralgaugesmoke());
    Thread.sleep(2000);
    elementClick(o.getCreatestructuralgaugecancel());
    wait1Seconds();
}

@Given("User have to click the route profile smoke option")
public void user_have_to_click_the_route_profile_smoke_option()throws InterruptedException {
    elementClick(o.getRouteprofilesmoke());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("terrains");
    Assert.assertTrue("Check the url",contains);
    wait1Seconds();
}

@Given("User have to click the create route profile smoke button")
public void user_have_to_click_the_create_route_profile_smoke_button()throws InterruptedException {
    elementClick(o.getCreaterouteprofilesmoke());
    wait5seconds();
}



@When("User have to check the two type of route profile smoke option")
public void user_have_to_check_the_two_type_of_route_profile_smoke_option()throws InterruptedException {
    elementClick(o.getManualrouteprofilesmoke());
    wait5seconds();
    driver.navigate().back();
    wait1Seconds();
    elementClick(o.getCreaterouteprofilesmoke());
    wait1Seconds();
    elementClick(o.getMaprouteprofilesmoke());
    wait5seconds();
    driver.navigate().back();
    wait1Seconds();
}

@Given("User have to click the buffer stop smoke option")
public void user_have_to_click_the_buffer_stop_smoke_option()throws InterruptedException {
    elementClick(o.getBufferstopsmoke());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("endstops");
    Assert.assertTrue("Check the url",contains);
    wait1Seconds();
}

@When("User have to click the create buffer stop smoke button")
public void user_have_to_click_the_create_buffer_stop_smoke_button() throws InterruptedException{
    elementClick(o.getCreatebufferstopsmoke());
    wait5seconds();
    elementClick(o.getCancelbufferstopsmoke());
    wait1Seconds();
}

@Given("User have to click the coupler interface smoke option")
public void user_have_to_click_the_coupler_interface_smoke_option()throws InterruptedException {
    elementClick(o.getCouplinginterfacesmoke());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("interfaces");
    Assert.assertTrue("Check the url",contains);
    wait1Seconds();
}

@When("User have to click the create coupling interface smoke button")
public void user_have_to_click_the_create_coupling_interface_smoke_button() throws InterruptedException{
    elementClick(o.getCreatecouplinginterfacesmoke());
    wait5seconds();
    elementClick(o.getCancelcouplininterfacesmoke());
    wait1Seconds();
}

@Given("User have to click the device smoke option")
public void user_have_to_click_the_device_smoke_option()throws InterruptedException {
    elementClick(o.getDevicesmoke());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("devices");
    Assert.assertTrue("Check the url",contains);
    wait1Seconds();
}

@When("User have to click the create device smoke option")
public void user_have_to_click_the_create_device_smoke_option()throws InterruptedException {
    elementClick(o.getCreatedevicesmoke());
    wait5seconds();
    elementClick(o.getCanceldevicesmoke());
    wait1Seconds();
}

@Given("User have to click the shared library smoke option")
public void user_have_to_click_the_shared_library_smoke_option()throws InterruptedException {
    elementClick(o.getSharedlibrarysmoke());
    wait1Seconds();
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("corporate");
    Assert.assertTrue("Check the url",contains);
    wait1Seconds();
}

@When("User have to click the all option of shared library smoke option")
public void user_have_to_click_the_all_option_of_shared_library_smoke_option()throws InterruptedException {
    elementClick(o.getTrainsharedlibrarysmoke());
    wait1Seconds();
    elementClick(o.getVehiclesheardlibrarysmoke());
    wait1Seconds();
    driver.navigate().back();
    
}

@Given("User have to click the dashboard smoke option")
public void user_have_to_click_the_dashboard_smoke_option() throws InterruptedException{
    elementClick(o.getDashboardsmoke());
    wait1Seconds();
}

@When("User have to enter the dashboard of the webpage")
public void user_have_to_enter_the_dashboard_of_the_webpage() throws InterruptedException {
    String text = o.getMainbodydashboardsmoke().getText();
    System.out.println(text);
	String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("dashboard");
    Assert.assertTrue("Check the page dashbord url", contains);
    wait1Seconds();
    
}



//Checking Simulation result under gauges option

@When("User have to mouseover the my vehicle option")
public void user_have_to_mouseover_the_my_vehicle_option()throws InterruptedException {
	String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("vehicles");
    Assert.assertTrue("Check the url", contains);
    wait1Seconds();
	mouseOverAction(o.getSimulationresultgaugesmyvehicle());
    wait1Seconds();

	
}

@When("User have to click the action button in the my vehicle and click edit option")
public void user_have_to_click_the_action_button_in_the_my_vehicle_and_click_edit_option()throws InterruptedException {
    elementClick(o.getSimulationresultgaugesactions());
    wait1Seconds();
    elementClick(o.getSimulationresultgaugeseditvehicle());
    wait1Seconds();
	
}

@When("User have to click the vehicle gauges box under my vehicle and select the Y type gauge")
public void user_have_to_click_the_vehicle_gauges_box_under_my_vehicle_and_select_the_Y_type_gauge()throws InterruptedException {
 elementClick(o.getSimulationresultgaugesboxinvehicle());
 wait1Seconds();
 elementClick(o.getSimulationresultgaugesy26());
 wait1Seconds();
	
}

@Then("User have to click save button vehicle under the simulation result gauges option")
public void user_have_to_click_save_button_vehicle_under_the_simulation_result_gauges_option() throws InterruptedException {
    elementClick(o.getSimulationresultgauesvehicledsave());
    wait5seconds();
}


@Given("User have to click train option under the simulation result gauges")
public void user_have_to_click_train_option_under_the_simulation_result_gauges() throws InterruptedException {
   
	elementClick(o.getSimulationresultgaugestrain());
    wait1Seconds();
}

@Given("User have to mouseover my tain option and click the action button")
public void user_have_to_mouseover_my_tain_option_and_click_the_action_button()throws InterruptedException {
	String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("trains");
    Assert.assertTrue("Check the url", contains);
    wait1Seconds();
	mouseOverAction(o.getSimulationresultgaugesmytain());
    wait1Seconds();
    elementClick(o.getSimulationresultgaugestrainaction());
    wait1Seconds();
   
	
}

@When("User have to click edit button in tain option")
public void user_have_to_click_edit_button_in_tain_option()throws InterruptedException {
	 elementClick(o.getSimulationresultgaugesedittrain());
	    wait1Seconds();
	
}

@When("User have to click the select vehicle box and select the my vehicle option")
public void user_have_to_click_the_select_vehicle_box_and_select_the_my_vehicle_option()throws InterruptedException {
	   elementClick(o.getSimulationresultgaugesselecttrainbox());
	    wait1Seconds();
	    elementClick(o.getSimulationresultgaugesselectmyvehicle());
	    wait1Seconds();
	    elementClick(o.getSimulationresultgaugesselect2cabin());
	    wait1Seconds();
	    elementClick(o.getSimulationresultgaugesselecttrainboxtwo());
	    wait1Seconds();
	    elementClick(o.getSimulationresultgaugesselectmyvehicle());
	    wait1Seconds();
	    elementClick(o.getSimulationresultgaugesselect3cabin());
	    wait1Seconds();
	    elementClick(o.getSimulationresultgaugesselecttrainboxthree());
	    wait1Seconds();
	    elementClick(o.getSimulationresultgaugesselectmyvehicle());
	    wait1Seconds();
	    elementClick(o.getSimulationresultgaugesselect4cabin());
	    wait1Seconds();
	    elementClick(o.getSimulationresultgaugesselecttrainboxfour());
	    wait1Seconds();
	    elementClick(o.getSimulationresultgaugesselectmyvehicle());
	    wait1Seconds();
	    
	
}

@Then("User have to click the save button and conform to save updated tain")
public void user_have_to_click_the_save_button_and_conform_to_save_updated_tain() throws InterruptedException {
    elementClick(o.getSimulationresultgaugessavetrain());
    wait1Seconds();
    elementClick(o.getSimulationresultgaugesconformsavetrain());
    wait5seconds();
	
}

@Given("User have to click the DVRS one and mouseover the running train simulation")
public void user_have_to_click_the_DVRS_one_and_mouseover_the_running_train_simulation()throws InterruptedException {
	String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("projects");
    Assert.assertTrue("Check the url", contains);
    wait1Seconds();
	elementClick(o.getSimulationresultgaugesDVRS1project());
	wait1Seconds();
	mouseOverAction(o.getSimulationresultgaugesrunningtrain());
	wait1Seconds();
	
}

@Given("User have to click the simulation under action button and click edit simulation option")
public void user_have_to_click_the_simulation_under_action_button_and_click_edit_simulation_option()throws InterruptedException {
    elementClick(o.getSimulationresultgaugesrunningtainaction());
    wait1Seconds();
    elementClick(o.getSimulationresultgaugesrunningtraineditoption());
    wait5seconds();
	
}

@When("User have to select the name of the train and select the name of the route profile")
public void user_have_to_select_the_name_of_the_train_and_select_the_name_of_the_route_profile()throws InterruptedException {
    elementClick(o.getSimulationresultgaugesrunningtrainselecttrainbox());
    wait1Seconds();
    elementClick(o.getSimulationresultgaugesrunningtrainmytrain());
    wait1Seconds();
    elementClick(o.getSimulationresultgaugesrunningtrainselectrouteprofile());
    wait1Seconds();
    elementClick(o.getSimulationresultgaugesrunningtraintunneladdedrouteprofile());
    wait1Seconds();
	
}

@When("User have to click the save and run simulation and click simulation results")
public void user_have_to_click_the_save_and_run_simulation_and_click_simulation_results()throws InterruptedException {

    wait1Seconds();
	elementClick(o.getSimulationresultgaugessaveandrunsimulation());
    Thread.sleep(30000);
   
	
}

@When("User have to click the simulation result gauges option")
public void user_have_to_click_the_simulation_result_gauges_option()throws InterruptedException {
	 elementClick(o.getSimulationresultgaugessimulationresultsbutton());
	 wait5seconds();
	
}

@When("User have to click the simulation result clearance and three D swept path option")
public void user_have_to_click_the_simulation_result_clearance_and_three_D_swept_path_option()throws InterruptedException {
	
	elementClick(o.getSimulationresultgaugesoption());
    Thread.sleep(8000);
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("gauging");
    Assert.assertTrue("Check the url", contains);
    wait1Seconds();
    elementClick(o.getSimulationresultgaugesclearance());
    wait5seconds();
    elementClick(o.getSimulationresultgauges3Dsweptpath());
    Thread.sleep(20000);
	
}

@When("User have to click the fullscreen option and click the play button")
public void user_have_to_click_the_fullscreen_option_and_click_the_play_button()throws InterruptedException {
    
	elementClick(o.getSimulationresultgaugesfullscreen());
	wait1Seconds();
	elementClick(o.getSimulationresultgaugesplaybutton());
	wait5seconds();
}

@Then("User have to click the close the fullscreen option and close the tab")
public void user_have_to_click_the_close_the_fullscreen_option_and_close_the_tab() throws InterruptedException {
    elementClick(o.getSimulationresultgaugesremovefullscreen());
    wait1Seconds();
    quitTab();
	
}




//Check the crating the slanding route profile



@When("User have to enter the slanding profile vertical data and click the horizontal option")
public void user_have_to_enter_the_slanding_profile_vertical_data_and_click_the_horizontal_option()throws InterruptedException {
	String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("manual");
    Assert.assertTrue("Check the url", contains);
    wait1Seconds();
    elementClick(o.getSlandingmanualinputdata());
    wait1Seconds();
    elementClick(o.getSlandingmanualverticalcheckbox());
    wait1Seconds();
    for (int n = 0; n <5; n++) {
	elementClick(o.getSlandingmanualverticalplusbutton());
	wait1Seconds();
	}
    o.getSlandingdistanceboxtwo().clear();
    sendKeys(o.getSlandingdistanceboxtwo(), "390");
    wait1Seconds();
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)",o.getSlandingverticaltotaldistance());
	wait1Seconds();
    o.getSlandingdistanceboxthree().clear();
    sendKeys(o.getSlandingdistanceboxthree(), "350");
    wait1Seconds();
    o.getSlandingdistanceboxfour().clear();
    sendKeys(o.getSlandingdistanceboxfour(), "250");
    wait1Seconds();
    o.getSlandingdistanceboxfive().clear();
    sendKeys(o.getSlandingdistanceboxfive(), "603.17");
    wait1Seconds();
    o.getSlandingdistanceboxsix().clear();
    sendKeys(o.getSlandingdistanceboxsix(), "250");
    wait1Seconds();
    o.getSlandinggradientboxtwo().clear();
    sendKeys(o.getSlandinggradientboxtwo() , "1");
    wait1Seconds();
    o.getSlandinggradientboxthree().clear();
    sendKeys(o.getSlandinggradientboxthree() , "-0.7");
    wait1Seconds();
    o.getSlandinggradientboxfour().clear();
    sendKeys(o.getSlandinggradientboxfour() , "1.4");
    wait1Seconds();
    o.getSlandinggradientboxfive().clear();
    sendKeys(o.getSlandinggradientboxfive() , "0");
    wait1Seconds();
    o.getSlandinggradientboxsix().clear();
    sendKeys(o.getSlandinggradientboxsix() , "1.1");
    wait1Seconds();
    o.getSlandingconnectingradiusone().clear();
    sendKeys(o.getSlandingconnectingradiusone(), "10000");
    wait1Seconds();
    o.getSlandingconnectingradiustwo().clear();
    sendKeys(o.getSlandingconnectingradiustwo(), "10000");
    wait1Seconds();
    o.getSlandingconnectingradiusthree().clear();
    sendKeys(o.getSlandingconnectingradiusthree(), "10000");
    wait1Seconds();
    o.getSlandingconnectingradiusfour().clear();
    sendKeys(o.getSlandingconnectingradiusfour(), "10000");
    wait1Seconds();
    o.getSlandingconnectingradiusfive().clear();
    sendKeys(o.getSlandingconnectingradiusfive(), "10000");
    wait1Seconds();
    o.getSlandingconnectingradiussix().clear();
    sendKeys(o.getSlandingconnectingradiussix(), "10000");
    wait1Seconds();
    elementClick(o.getSlandinghorizontalprofile());
    wait1Seconds();
	
	
}

@When("User have to enter the slanding profile horizontal data")
public void user_have_to_enter_the_slanding_profile_horizontal_data()throws InterruptedException {
    elementClick(o.getSlandinghorizontalcheckbox());
    wait1Seconds();
   
    for (int i = 0; i < 2; i++) {
		elementClick(o.getSlandinghorizontalplusbutton());
	}
    o.getSlandinghorizontalstraightone().clear();
    sendKeys(o.getSlandinghorizontalstraightone(),"50");
    wait1Seconds();
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)",o.getSlandinghorizontaltotaldistance());
	wait1Seconds();
    sendKeys(o.getSlandinghorizontalstraighttwo(),"150");
    wait1Seconds();
    sendKeys(o.getSlandinghorizontalstraightthree(),"40");
    wait1Seconds();
    o.getSlandinghorizontalcurveradiusone().clear();
    sendKeys(o.getSlandinghorizontalcurveradiusone(),"1500");
    wait1Seconds();
    o.getSlandinghorizontalcurveradiustwo().clear();
    sendKeys(o.getSlandinghorizontalcurveradiustwo(),"1200");
    wait1Seconds();
    o.getSlandinghorizontalcurveradiusthree().clear();
    sendKeys(o.getSlandinghorizontalcurveradiusthree(),"1800");
    wait1Seconds();
    o.getSlandinghorizontalcurveangleone().clear();
    sendKeys(o.getSlandinghorizontalcurveangleone(),"20");
    wait1Seconds();
    o.getSlandinghorizontalcurveangletwo().clear();
    sendKeys(o.getSlandinghorizontalcurveangletwo(),"-22");
    wait1Seconds();
    o.getSlandinghorizontalcurveanglethree().clear();
    sendKeys(o.getSlandinghorizontalcurveanglethree(),"40");
    wait1Seconds();
    elementClick(o.getSlandinghorizontalsettingone());
    wait5seconds();
    elementClick(o.getSlandinghorizontalsetspesificgradientcheckbox());
    wait1Seconds();
    elementClick(o.getSlandinghorizontalcalculatetransition());
    wait1Seconds();
    o.getSlandinghorizontaltransitionin().clear();
    sendKeys(o.getSlandinghorizontaltransitionin(),"24.35");
    o.getSlandinghorizontaltransitionout().clear();
    sendKeys(o.getSlandinghorizontaltransitionout(),"24.35");
    wait1Seconds();
    elementClick(o.getSlandinghorizontaltansitioninsert());
    wait1Seconds();  
    elementClick(o.getSlandinghorizontalsettingtwo());
    wait5seconds();
    elementClick(o.getSlandinghorizontalsetspesificgradientcheckbox());
    wait1Seconds();
    elementClick(o.getSlandinghorizontalsetspesificgradientcheckbox());
    wait1Seconds();
    elementClick(o.getSlandinghorizontalcalculatetransition());
    wait1Seconds();
    o.getSlandinghorizontaltransitionin().clear();
    sendKeys(o.getSlandinghorizontaltransitionin(),"36.41");
    o.getSlandinghorizontaltransitionout().clear();
    sendKeys(o.getSlandinghorizontaltransitionout(),"36.41");
    wait1Seconds();
    elementClick(o.getSlandinghorizontaltansitioninsert());
    wait1Seconds();
    elementClick(o.getSlandinghorizontalsettingthree());
    wait5seconds();
    elementClick(o.getSlandinghorizontalsetspesificgradientcheckbox());
    wait1Seconds();
    elementClick(o.getSlandinghorizontalsetspesificgradientcheckbox());
    wait1Seconds();
    elementClick(o.getSlandinghorizontalcalculatetransition());
    wait1Seconds();
    o.getSlandinghorizontaltransitionin().clear();
    sendKeys(o.getSlandinghorizontaltransitionin(),"32.38");
    o.getSlandinghorizontaltransitionout().clear();
    sendKeys(o.getSlandinghorizontaltransitionout(),"32.38");
    wait1Seconds();
    elementClick(o.getSlandinghorizontaltansitioninsert());
    wait1Seconds(); 
    elementClick(o.getSlandingprofilerefresh());
    wait5seconds();
	
}

@When("User have to enter the loacton setting of slanding route profile")
public void user_have_to_enter_the_loacton_setting_of_slanding_route_profile()throws InterruptedException {
    elementClick(o.getSlandingloactionsetting());
    wait1Seconds();
    o.getSlandingprofilelatitude().clear();
    sendKeys(o.getSlandingprofilelatitude(),"52.406");
    wait1Seconds();
    o.getSlandingprofilelongtitude().clear();
    sendKeys(o.getSlandingprofilelongtitude(),"-1.512");
    wait1Seconds();
    o.getSlandingprofileheading().clear();
    sendKeys(o.getSlandingprofileheading(),"90");
    wait5seconds();
	
}

@When("User have to click the map view option in slandind profile")
public void user_have_to_click_the_map_view_option_in_slandind_profile()throws InterruptedException {
    elementClick(o.getSlandingprofilemapview());
    wait5seconds();
	
}

@Then("User havae to fill the name box and click the save button")
public void user_havae_to_fill_the_name_box_and_click_the_save_button() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)",o.getSlandingprofiledistanceunitsscrollup());
	wait1Seconds();
	sendKeys(o.getSlandingprofilenamebox(),"Slanding route profile");
	wait1Seconds();
	elementClick(o.getSlandingprofilesavebutton());
	wait5seconds();
	quitTab();
	
}


//Check the vehicle suspension CoG Z is not accept the bellow wheel diameter value

@When("User have to click the my vehicle suspension option")
public void user_have_to_click_the_my_vehicle_suspension_option() throws InterruptedException {
    elementClick(o.getY25bogiesselectsuspension());
    wait1Seconds();
}

@When("User have to enter bellow the wheel diameter value it throw the error")
public void user_have_to_enter_bellow_the_wheel_diameter_value_it_throw_the_error() throws InterruptedException {
    o.getY25bogiecogz().clear();
    wait1Seconds();
    sendKeys(o.getY25bogiecogz(),"850");
    wait1Seconds();
    String text = o.getVehicleheader().getText();
    System.out.println(text);
    boolean contains = text.contains("Must be greater than or equal to Wheel Diameter");
    Assert.assertTrue("Check the error msg", contains);
    wait1Seconds();
}

@Then("User have to above or equel the wheel diameter after click the save without error to save")
public void user_have_to_above_or_equel_the_wheel_diameter_after_click_the_save_without_error_to_save() throws InterruptedException {
	o.getY25bogiecogz().clear();
    wait1Seconds();
    sendKeys(o.getY25bogiecogz(),"957");
    wait1Seconds();
    elementClick(o.getY25bogievehiclesavebutton());
    Thread.sleep(5000);
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("vehicles");
    Assert.assertTrue("Check the vehicle url",contains);
    wait1Seconds();
    quitTab();
    
}


//Check the all duplicate option is not allow to save the same name 


@When("User have to click the project duplicat option")
public void user_have_to_click_the_project_duplicat_option() throws InterruptedException {
    
    mouseOverAction(o.getDuplicateimpacttest());
	wait1Seconds();
	elementClick(o.getDuplicateimpacttestaction());
	wait1Seconds();
	elementClick(o.getProijectduplicatoption());
	Thread.sleep(3000);
	
}

@When("User have to click the project save button without changing the name not allow to save")
public void user_have_to_click_the_project_save_button_without_changing_the_name_not_allow_to_save() throws InterruptedException {
    elementClick(o.getProjectDvrs1());
    wait1Seconds();
    elementClick(o.getProjectDvrs1());
    wait1Seconds();
    elementClick(o.getProjectduplicatesave());
    wait1Seconds();
    String text = o.getProjectduplicatbody().getText();
    System.out.println(text);
    boolean contains = text.contains("The simulation name has already been saved");
    Assert.assertTrue("Check the simulation same name save msg is showing error or not", contains);
    wait1Seconds();
    quitTab();
    
	
}

@When("User have to click the train duplicate button")
public void user_have_to_click_the_train_duplicate_button()throws InterruptedException {
    elementClick(o.getTrainduplicateoption());
    wait1Seconds();
    
	
}

@When("User have to click the train save button without changing the name not allow to save")
public void user_have_to_click_the_train_save_button_without_changing_the_name_not_allow_to_save()throws InterruptedException {
    elementClick(o.getTrainduplicatesavebutton());
    wait1Seconds();
    String text = o.getTrainduplicatebody().getText();
    System.out.println(text);
    boolean contains = text.contains("The train name has already been saved");
    Assert.assertTrue("Check the train same name save msg is showing error or not", contains);
    wait1Seconds();
    quitTab();
	
}

@When("User have to click the vehicle duplicate option")
public void user_have_to_click_the_vehicle_duplicate_option()throws InterruptedException {
    elementClick(o.getVehicleduplicateoption());
    wait1Seconds();
	
}

@When("User have to click the vehicle save button without changing the name not allow to save")
public void user_have_to_click_the_vehicle_save_button_without_changing_the_name_not_allow_to_save()throws InterruptedException {
    elementClick(o.getVehicleduplicatesave());
    wait1Seconds();
    String text = o.getVehicleduplicatebody().getText();
    System.out.println(text);
    boolean contains = text.contains("The vehicle name has already been saved");
    Assert.assertTrue("Check the vehicle same name save msg is showing error or not", contains);
    wait1Seconds();
    quitTab();
	
}

@When("User have to mouse over the first profile and click the action button")
public void user_have_to_mouse_over_the_first_profile_and_click_the_action_button()throws InterruptedException {
    mouseOverAction(o.getRailprofileduplicate());
    wait1Seconds();
    elementClick(o.getRailprofileactionbutton());
    wait1Seconds();
    
	
}

@When("User have to click the wheel rail profile duplicate option")
public void user_have_to_click_the_wheel_rail_profile_duplicate_option()throws InterruptedException {
    elementClick(o.getRailprofileduplicatebutton());
    wait1Seconds();
	
}

@When("User have to click the wheel rail profile save button without changing the name not allow to save")
public void user_have_to_click_the_wheel_rail_profile_save_button_without_changing_the_name_not_allow_to_save()throws InterruptedException {
    elementClick(o.getRailprofileduplicatesavebutton());
    wait1Seconds();
    String text = o.getRailprofileduplicatebody().getText();
    System.out.println(text);
    boolean contains = text.contains("The profile name specified has already been used");
    Assert.assertTrue("Check the wheel rail profile same name save msg is showing error or not", contains);
	wait1Seconds();
	quitTab();
}

@When("User have to mouse over the first contact and click the action button")
public void user_have_to_mouse_over_the_first_contact_and_click_the_action_button()throws InterruptedException {
    mouseOverAction(o.getNewcontactprofileoption());
    wait1Seconds();
    elementClick(o.getContactprofileactionbutton());
    wait1Seconds();
	
}

@When("User have to click the wheel rail contact duplicate option")
public void user_have_to_click_the_wheel_rail_contact_duplicate_option()throws InterruptedException {
    elementClick(o.getContactprofileduplicateoption());
    wait1Seconds();
    
	
}

@When("User have to click the wheel rail contact save button without changing the name not allow to save")
public void user_have_to_click_the_wheel_rail_contact_save_button_without_changing_the_name_not_allow_to_save()throws InterruptedException {
    elementClick(o.getContactprofileduplicatesave());
    wait1Seconds();
    String text = o.getContactprofileduplicatebody().getText();
    System.out.println(text);
    boolean contains = text.contains("The selected contact has already been saved to the selected library");
    Assert.assertTrue("Check the wheel rail contact same name save msg is showing error or not", contains);
	wait1Seconds();
	quitTab();
}

@When("User have mouseover the first bogie assembly option and click the action button")
public void user_have_mouseover_the_first_bogie_assembly_option_and_click_the_action_button()throws InterruptedException {
    mouseOverAction(o.getBogieY25bogie());
    wait1Seconds();
    elementClick(o.getBogiey25actionbutton());
    wait1Seconds();
	
}

@When("User have to click the bogie assembly duplicate option")
public void user_have_to_click_the_bogie_assembly_duplicate_option()throws InterruptedException {
    elementClick(o.getBogieY25duplicateoption());
    wait1Seconds();
	
}

@When("User have to click the bogie assembly save button without changing the name not allow to save")
public void user_have_to_click_the_bogie_assembly_save_button_without_changing_the_name_not_allow_to_save()throws InterruptedException {
    elementClick(o.getBogieY25duplicatesave());
    wait1Seconds();
    String text = o.getBogieY25duplicatebody().getText();
    System.out.println(text);
    boolean contains = text.contains("The bogie name specified has already been used");
    Assert.assertTrue("Check the bogie assembly same name save msg is showing error or not", contains);
    wait1Seconds();
    quitTab();
	
}

@When("User have mouseover the first bogiepart and click the action button")
public void user_have_mouseover_the_first_bogiepart_and_click_the_action_button()throws InterruptedException {
    mouseOverAction(o.getY25bogieframe());
    wait1Seconds();
    elementClick(o.getY25bogiefarmeaction());
    wait1Seconds();
   
	
}

@When("User have to click the bogie part duplicate option")
public void user_have_to_click_the_bogie_part_duplicate_option()throws InterruptedException {
    elementClick(o.getY25bogieframeduplicatebutton());
    wait1Seconds();
	
}

@When("User have to click the bogie part save button without changing the name not allow to save")
public void user_have_to_click_the_bogie_part_save_button_without_changing_the_name_not_allow_to_save()throws InterruptedException {
    elementClick(o.getY25bogieframeduplicatesave());
    wait1Seconds();
    String text = o.getY25bogieframeduplicatebody().getText();
    System.out.println(text);
    boolean contains = text.contains("The part name specified has already been used");
    Assert.assertTrue("Check the bogie part same name save msg is showing error or not", contains);
    wait1Seconds();
    quitTab();
	
}

@When("User have to mouseover the first gauge and click the action button")
public void user_have_to_mouseover_the_first_gauge_and_click_the_action_button()throws InterruptedException {
    mouseOverAction(o.getTunnelnewedit());
    wait1Seconds();
    elementClick(o.getTunnelneweditaction());
    wait1Seconds();
	
}

@When("User have to click the gauge duplicate option")
public void user_have_to_click_the_gauge_duplicate_option()throws InterruptedException {
    elementClick(o.getTunnelneweditduplicateoption());
    wait1Seconds();
	
}

@When("User have to click the gauge save button without changing the name not allow to save")
public void user_have_to_click_the_gauge_save_button_without_changing_the_name_not_allow_to_save()throws InterruptedException {
    elementClick(o.getTunnelneweditduplicatesave());
    wait1Seconds();
    String text = o.getTunnelneweditsuplicatebody().getText();
    System.out.println(text);
    boolean contains = text.contains("A gauge with the same name has already been saved");
    Assert.assertTrue("Check the gauge same name save msg is showing error or not", contains);
    wait1Seconds();
    quitTab();
	
}

@When("User have mouseover the first routeprofile and click the action button")
public void user_have_mouseover_the_first_routeprofile_and_click_the_action_button()throws InterruptedException {
    mouseOverAction(o.getFirstrouteprofile());
    wait1Seconds();
    elementClick(o.getFirstrouteprofileaction());
    wait1Seconds();
	
}

@When("User have to click the routeprofile duplicate option")
public void user_have_to_click_the_routeprofile_duplicate_option()throws InterruptedException {
    elementClick(o.getFirstrouteprofileduplicateoption());
    wait1Seconds();
	
}

@When("User have to click the routeprofile save button without changing the name not allow to save")
public void user_have_to_click_the_routeprofile_save_button_without_changing_the_name_not_allow_to_save()throws InterruptedException {
    elementClick(o.getFirstrouteprofileduplicatesave());
    wait1Seconds();
    String text = o.getFirstrouteprofileduplicatebody().getText();
    System.out.println(text);
    boolean contains = text.contains("Route Profile with this name has already been saved");
    Assert.assertTrue("Check the routeprofile same name save msg is showing error or not", contains);
    wait1Seconds();
    quitTab();
	
}

@When("User have mouseover the first bufferstop and click the action button")
public void user_have_mouseover_the_first_bufferstop_and_click_the_action_button()throws InterruptedException {
    mouseOverAction(o.getThreepointslidingbufferstop());
    wait1Seconds();
    elementClick(o.getThreepointslidingbufferstopaction());
    wait1Seconds();
	
}

@When("User have to click the bufferstop duplicate option")
public void user_have_to_click_the_bufferstop_duplicate_option()throws InterruptedException {
    elementClick(o.getThreepointslidingbufferstopsuplicate());
    wait1Seconds();
	
}

@When("User have to click the bufferstop save button without changing the name not allow to save")
public void user_have_to_click_the_bufferstop_save_button_without_changing_the_name_not_allow_to_save() throws InterruptedException {
    elementClick(o.getThreepointslidingbufferstopduplicatesave());
    wait1Seconds();
    String text = o.getThreepointslidingbufferstopduplicatebody().getText();
    System.out.println(text);
    boolean contains = text.contains("The buffer stop name has already been saved");
    Assert.assertTrue("Check the bufferstop same name save msg is showing error or not", contains);
    wait1Seconds();
    quitTab();
	
}


//Check the connection of the left side bogie mass it showing correct or not


@When("User have to mouseover the y type bogie and click the action button")
public void user_have_to_mouseover_the_y_type_bogie_and_click_the_action_button() throws InterruptedException {
    mouseOverAction(o.getY25bogie());
    wait1Seconds();
    elementClick(o.getY25bogieaction());
    wait1Seconds();
}

@When("User have to click y type bogie edit option and click the bogie mass")
public void user_have_to_click_y_type_bogie_edit_option_and_click_the_bogie_mass() throws InterruptedException {
    elementClick(o.getY25bogieeditoption());
    Thread.sleep(20000);
    elementClick(o.getY25bogiemass());
    wait1Seconds();
    
   
}

@When("User have to select the left side mass and click the edit")
public void user_have_to_select_the_left_side_mass_and_click_the_edit() throws InterruptedException {
	elementClick(o.getY25bogiesidebearerl());
    wait1Seconds();
	elementClick(o.getY25bogiemassedit());
    wait1Seconds();
    
}
@When("User have to click the bogie left side mass connection option and check the number of part")
public void user_have_to_click_the_bogie_left_side_mass_connection_option_and_check_the_number_of_part() throws InterruptedException {
    
	elementClick(o.getY25bogiemassconnections());
    wait1Seconds();
    
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	List<WebElement> findelement = driver.findElements(By.xpath("//div[@class=\"panel-body px-3 py-3\"]"));
	System.out.println("Total parts in the connection: " + findelement.size());
	
	for(int i =0;i<findelement.size();i++){
		
		System.out.println("Xpath Value is : " + findelement.get(i).getAttribute("Xpath"));
		
        if (i<3) {
                System.out.println("-----The mass connection part option is working properly-----");
         } else {

                System.out.println("-----The mass connection part are repeating not working properly-----");
                Assert.assertEquals("check the mass connection part count","3",i);
                      
         }
	      }
         
}

@When("User have to click the bogie left mass cancel button")
public void user_have_to_click_the_bogie_left_mass_cancel_button() throws InterruptedException {
	
    elementClick(o.getY25bogieleftmasscancel());
    wait1Seconds();
	
}

@When("User have to select the second time left side mass and click the edit")
public void user_have_to_select_the_second_time_left_side_mass_and_click_the_edit() throws InterruptedException {
	elementClick(o.getY25bogiemassedit());
    wait1Seconds();
}

@When("User have to click the second time bogie left mass connection option and check the number of part")
public void user_have_to_click_the_second_time_bogie_left_mass_connection_option_and_check_the_number_of_part() throws InterruptedException {
	
	elementClick(o.getY25bogiemassconnections());
    wait1Seconds();
    
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	List<WebElement> findelement = driver.findElements(By.xpath("//div[@class=\"panel-body px-3 py-3\"]"));
	System.out.println("Total parts in the connection: " + findelement.size());
	
	for(int i =0;i<findelement.size();i++){
		
        if (i<3) {
                System.out.println("-----The mass connection part option is working properly-----");
         } else {

                System.out.println("-----The mass connection part are repeating not working properly-----");
                Assert.assertEquals("check the mass connection part count","3",i);
                }
	      }
	
}


//Check the right side mass connection option

@When("User have to select the right side mass and click the edit")
public void user_have_to_select_the_right_side_mass_and_click_the_edit() throws InterruptedException {
    
	elementClick(o.getY25bogiesidebearerr());
    wait1Seconds();
	elementClick(o.getY25bogiemassedit());
    wait1Seconds();
	
}

@When("User have to click the bogie right side mass connection option and check the number of part")
public void user_have_to_click_the_bogie_right_side_mass_connection_option_and_check_the_number_of_part() throws InterruptedException {
    
	elementClick(o.getY25bogiemassconnections());
    wait1Seconds();
    
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	List<WebElement> findelement = driver.findElements(By.xpath("//div[@class=\"panel-body px-3 py-3\"]"));
	System.out.println("Total parts in the connection: " + findelement.size());
	
	for(int i =0;i<findelement.size();i++){
		
		System.out.println("Xpath Value is : " + findelement.get(i).getAttribute("Xpath"));
		
        if (i<3) {
                System.out.println("-----The mass connection part option is working properly-----");
         } else {

                System.out.println("-----The mass connection part are repeating not working properly-----");
                Assert.assertEquals("check the mass connection part count","3",i); 
                }
	      }
	
}

@When("User have to click the bogie right mass cancel button")
public void user_have_to_click_the_bogie_right_mass_cancel_button()throws InterruptedException {
    
	elementClick(o.getY25bogierightmasscancel());
    wait1Seconds();
}


@When("User have to select the second time right side mass and click the edit")
public void user_have_to_select_the_second_time_right_side_mass_and_click_the_edit() throws InterruptedException {
    
	
	elementClick(o.getY25bogiemassedit());
    wait1Seconds();
    

	
}

@When("User have to click the second time bogie right mass connection option and check the number of part")
public void user_have_to_click_the_second_time_bogie_right_mass_connection_option_and_check_the_number_of_part() throws InterruptedException {
    
	elementClick(o.getY25bogiemassconnections());
    wait1Seconds();
    
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	List<WebElement> findelement = driver.findElements(By.xpath("//div[@class=\"panel-body px-3 py-3\"]"));
	System.out.println("Total parts in the connection: " + findelement.size());
	
	for(int i =0;i<findelement.size();i++){
		
        if (i<3) {
                System.out.println("-----The mass connection part option is working properly-----");
         } else {

                System.out.println("-----The mass connection part are repeating not working properly-----");
                Assert.assertEquals("check the mass connection part count","3",i);       
         }
        
    }
}


//Check the center mass connection in bogie


@When("User have to select the center mass and click the edit")
public void user_have_to_select_the_center_mass_and_click_the_edit()throws InterruptedException {
	
	elementClick(o.getY25bogiecentermass());
    wait1Seconds();
	elementClick(o.getY25bogiemassedit());
    wait1Seconds();
	
	
}

@When("User have to click the bogie center mass connection option and check the number of part")
public void user_have_to_click_the_bogie_center_mass_connection_option_and_check_the_number_of_part() throws InterruptedException {
    
	elementClick(o.getY25bogiemassconnections());
    wait1Seconds();
   
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	List<WebElement> findelement = driver.findElements(By.xpath("//div[@class=\"panel-body px-3 py-3\"]"));
	System.out.println("Total parts in the connection: " + findelement.size());
	
	int size = findelement.size();
	if (size<61) {
		System.out.println("-----The wheelset connection part option is working properly-----");
		
	} else {
        System.out.println("-----The wheelset connection part are repeating not working properly-----");
        Assert.assertEquals("check the wheelset connection part count","61",size);
       
	}
	
}

@When("User have to click the bogie center mass cancel button")
public void user_have_to_click_the_bogie_center_mass_cancel_button()throws InterruptedException {
    
	elementClick(o.getY25bogiecentermasscancel());
    wait1Seconds();
	
}


@When("User have to select the second time center mass and click the edit")
public void user_have_to_select_the_second_time_center_mass_and_click_the_edit()throws InterruptedException {
    
	elementClick(o.getY25bogiemassedit());
    wait1Seconds();
    

	
}
@When("User have to click the second time bogie center mass connection option and check the number of part")
public void user_have_to_click_the_second_time_bogie_center_mass_connection_option_and_check_the_number_of_part() throws InterruptedException {
	elementClick(o.getY25bogiemassconnections());
    wait1Seconds();
   
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	List<WebElement> findelement = driver.findElements(By.xpath("//div[@class=\"panel-body px-3 py-3\"]"));
	System.out.println("Total parts in the connection: " + findelement.size());
	
	int size = findelement.size();
	if (size<61) {
		System.out.println("-----The wheelset connection part option is working properly-----");
		
	} else {
        System.out.println("-----The wheelset connection part are repeating not working properly-----");
        Assert.assertEquals("check the wheelset connection part count","61",size);
	}

	      
	
}



//Check the functionality of front wheel set connection option


@When("User have to click y type bogie edit option and click the bogie wheelset")
public void user_have_to_click_y_type_bogie_edit_option_and_click_the_bogie_wheelset() throws InterruptedException {
	elementClick(o.getY25bogieeditoption());
    wait5seconds();
    elementClick(o.getY25wheelsetoption());
    wait1Seconds();
    
	
}

@When("User have to select the front wheelset and click the edit")
public void user_have_to_select_the_front_wheelset_and_click_the_edit() throws InterruptedException {
	elementClick(o.getY25frontwheelset());
    wait1Seconds();
    elementClick(o.getY25bogiewheelsetedit());
    wait1Seconds();
	
}

@When("User have to click the bogie front wheelset connection option and check the number of part")
public void user_have_to_click_the_bogie_front_wheelset_connection_option_and_check_the_number_of_part() throws InterruptedException {
	
	elementClick(o.getY25bogiewheelsetconnections());
    wait1Seconds();
    
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	List<WebElement> findelement = driver.findElements(By.xpath("//div[@class=\"panel-body px-3 py-3\"]"));
	System.out.println("Total parts in the connection: " + findelement.size());
	
	int size = findelement.size();
	if (size<=23) {
		System.out.println("-----The wheelset connection part option is working properly-----");
		
	} else {
        System.out.println("-----The wheelset connection part are repeating not working properly-----");
        Assert.assertEquals("check the wheelset connection part count","23",size);
       
	}
}


@When("User have to click the bogie front wheelset cancel button")
public void user_have_to_click_the_bogie_front_wheelset_cancel_button()throws InterruptedException {
    elementClick(o.getY25bogiewheelsetcancel());
	wait1Seconds();
}

@When("User have to select the second time front wheelset and click the edit")
public void user_have_to_select_the_second_time_front_wheelset_and_click_the_edit()throws InterruptedException {
	
    elementClick(o.getY25bogiewheelsetedit());
    wait1Seconds();
	
}

@When("User have to click the second time bogie front wheelset connection option and check the number of part")
public void user_have_to_click_the_second_time_bogie_front_wheelset_connection_option_and_check_the_number_of_part() throws InterruptedException {
    
	elementClick(o.getY25bogiewheelsetconnections());
    wait1Seconds();
    
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	List<WebElement> findelement = driver.findElements(By.xpath("//div[@class=\"panel-body px-3 py-3\"]"));
	System.out.println("Total parts in the connection: " + findelement.size());
	int size = findelement.size();
	if (size<=23) {
		System.out.println("-----The wheelset connection part option is working properly-----");
		
	} else {
        System.out.println("-----The wheelset connection part are repeating not working properly-----");
        Assert.assertEquals("check the wheelset connection part count","23",size);
	}
	
	
}


//Check the functionality of back wheel set connection option

@When("User have to select the back wheelset and click the edit")
public void user_have_to_select_the_back_wheelset_and_click_the_edit()throws InterruptedException {
    
	elementClick(o.getY25backwheelset());
    wait1Seconds();
    elementClick(o.getY25bogiewheelsetedit());
    wait1Seconds();
	
}

@When("User have to click the bogie back wheelset connection option and check the number of part")
public void user_have_to_click_the_bogie_back_wheelset_connection_option_and_check_the_number_of_part()throws InterruptedException {
    
	elementClick(o.getY25bogiewheelsetconnections());
    Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<WebElement> findelement = driver.findElements(By.xpath("//div[@class=\"panel-body px-3 py-3\"]"));
	System.out.println("Total parts in the connection: " + findelement.size());
	int size = findelement.size();
	if (size<=23) {
		System.out.println("-----The wheelset connection part option is working properly-----");
		
	} else {
        System.out.println("-----The wheelset connection part are repeating not working properly-----");
        Assert.assertEquals("check the wheelset connection part count","23",size);
	}
	
	
}

@When("User have to click the bogie back wheelset cancel button")
public void user_have_to_click_the_bogie_back_wheelset_cancel_button()throws InterruptedException {
    
	elementClick(o.getY25bogiewheelsetcancel());
	wait1Seconds();
	
}

@When("User have to select the second time back wheelset and click the edit")
public void user_have_to_select_the_second_time_back_wheelset_and_click_the_edit() throws InterruptedException {
    
	  elementClick(o.getY25bogiewheelsetedit());
	  wait1Seconds();
	
}

@When("User have to click the second time bogie back wheelset connection option and check the number of part")
public void user_have_to_click_the_second_time_bogie_back_wheelset_connection_option_and_check_the_number_of_part() throws InterruptedException {
    
	elementClick(o.getY25bogiewheelsetconnections());
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<WebElement> findelement = driver.findElements(By.xpath("//div[@class=\"panel-body px-3 py-3\"]"));
	System.out.println("Total parts in the connection: " + findelement.size());
	int size = findelement.size();
	if (size<=23) {
		System.out.println("-----The wheelset connection part option is working properly-----");
		
	} else {
        System.out.println("-----The wheelset connection part are repeating not working properly-----");
        Assert.assertEquals("check the wheelset connection part count","23",size);
	}
}



//Check the functionality of simulations transducers option


@When("User have to click to enable the simulation dynamic suspension")
public void user_have_to_click_to_enable_the_simulation_dynamic_suspension() throws InterruptedException {
    
	elementClick(o.getDynamicsuspensionyes());
	wait1Seconds();
	String text = o.getSimulationmainbody().getText();
	System.out.println(text);
	if (text.contains("Wheel to Rail Contact Profile")) {
		System.out.println("-----After click the dynamic suspension yes it show the wheel rail contact profile-----");
		String partial = "Wheel to Rail Contact Profile";
		Assert.assertTrue(text.contains(partial));
	
	} else {
		System.out.println("-----After click the dynamic suspension it not show the wheel rail contact profile option-----");
		String partial = "Wheel to Rail Contact Profile";
		Assert.assertTrue(text.contains(partial));
	}
	
	
}

@When("User have to click the running simulation transducser button")
public void user_have_to_click_the_running_simulation_transducser_button() throws InterruptedException {
    
	elementClick(o.getTransducersbutton());
	wait1Seconds();
	String text = o.getTransducerbody().getText();
	System.out.println(text);
	if (text.contains("Select Transducers")) {
		System.out.println("-----After click the transducers it show the parts enable and disable-----");
		String partial = "Select Transducers";
		Assert.assertTrue(text.contains(partial));
		
	} else {
		System.out.println("-----After click the dynamic suspension it not show the wheel rail contact profile option-----");
		String partial = "Wheel to Rail Contact Profile";
		Assert.assertTrue(text.contains(partial));
	}
	
}

@When("User have to click the running simulation dynamic suspension click desable all part")
public void user_have_to_click_the_running_simulation_dynamic_suspension_click_desable_all_part()throws InterruptedException {
    elementClick(o.getTransducersmass());
    wait1Seconds();
    elementClick(o.getTransducerswheelset());
    wait1Seconds();
    elementClick(o.getTransducersairspring());
    wait1Seconds();
    elementClick(o.getTransducersbumpstop());
    wait1Seconds();
    elementClick(o.getTransducerbush());
    wait1Seconds();
    elementClick(o.getTransducersconstraint());
    wait1Seconds();
    elementClick(o.getTransducerdamper());
    wait1Seconds();
    elementClick(o.getTransducerfriction());
    wait1Seconds();
    elementClick(o.getTransducerpinlink());
    wait1Seconds();
    elementClick(o.getTransducerstiffness());
    wait1Seconds();
    elementClick(o.getTransducershearspring());
    wait1Seconds();
    elementClick(o.getTransducerhysteresis());
    wait1Seconds();
	
	
}

@Then("User have to click the running simulation dynamic suspension click enable all part")
public void user_have_to_click_the_running_simulation_dynamic_suspension_click_enable_all_part()throws InterruptedException {
	   elementClick(o.getTransducersmass());
	    wait1Seconds();
	    elementClick(o.getTransducerswheelset());
	    wait1Seconds();
	    elementClick(o.getTransducersairspring());
	    wait1Seconds();
	    elementClick(o.getTransducersbumpstop());
	    wait1Seconds();
	    elementClick(o.getTransducerbush());
	    wait1Seconds();
	    elementClick(o.getTransducersconstraint());
	    wait1Seconds();
	    elementClick(o.getTransducerdamper());
	    wait1Seconds();
	    elementClick(o.getTransducerfriction());
	    wait1Seconds();
	    elementClick(o.getTransducerpinlink());
	    wait1Seconds();
	    elementClick(o.getTransducerstiffness());
	    wait1Seconds();
	    elementClick(o.getTransducershearspring());
	    wait1Seconds();
	    elementClick(o.getTransducerhysteresis());
	    wait1Seconds();
	
	
}

@Given("User have to click the vehicle one and select the display detailed bogie on threeD animation")
public void user_have_to_click_the_vehicle_one_and_select_the_display_detailed_bogie_on_threeD_animation()throws InterruptedException {
    
	elementClick(o.getSelectvehiclebox());
	wait1Seconds();
	selectByIndex(o.getSelectvehiclebox(),1);
	wait1Seconds();
	elementClick(o.getDisplaydetailedbogie3Danimation());
	wait1Seconds();
	
	
	
}

@Given("User have to click the vehicle two and select the display detailed bogie on threeD animation")
public void user_have_to_click_the_vehicle_two_and_select_the_display_detailed_bogie_on_threeD_animation()throws InterruptedException {
	selectByIndex(o.getSelectvehiclebox(),2);
	wait1Seconds();
	elementClick(o.getDisplaydetailedbogie3Danimation());
	wait1Seconds();
	
	
}

@When("User have to click the vehicle three and select the display detailed bogie on threeD animation")
public void user_have_to_click_the_vehicle_three_and_select_the_display_detailed_bogie_on_threeD_animation()throws InterruptedException {
    
	selectByIndex(o.getSelectvehiclebox(),3);
	wait1Seconds();
	elementClick(o.getDisplaydetailedbogie3Danimation());
	wait1Seconds();
	
	
	
}

@When("User have to click the vehicle four and select the display detailed bogie on threeD animation")
public void user_have_to_click_the_vehicle_four_and_select_the_display_detailed_bogie_on_threeD_animation()throws InterruptedException {
	selectByIndex(o.getSelectvehiclebox(),4);
	wait1Seconds();
	elementClick(o.getDisplaydetailedbogie3Danimation());
	wait1Seconds();
	
}

@When("User have to click the save transducer after click to the simulation save button")
public void user_have_to_click_the_save_transducer_after_click_to_the_simulation_save_button()throws InterruptedException {
    elementClick(o.getTransducersavebutton());
    wait1Seconds();
	
	
}

@When("User have to click the after transducer run the simulation and click the Simulation result")
public void user_have_to_click_the_after_transducer_run_the_simulation_and_click_the_Simulation_result()throws InterruptedException {

    implicitWait();
	elementClick(o.getSaveandrunsimulationbutton());
    Thread.sleep(35000);
    String text = o.getAftersaveandrunsimulationbody().getText();
    System.out.println(text);
    if (text.contains("TRANSDUCERS")) {
  		System.out.println("------After click the save and run simulation is show simulation running title-----");
  		String partial = "Running Simulation";
  		Assert.assertTrue(text.contains(partial));
  	} else {
  		System.out.println("-----After click the save and run simulation is not show simulation running title-----");
  		String partial = "Running Simulation";
  		Assert.assertTrue(text.contains(partial));
  	}
      elementClick(o.getAftertransducersimulationresults());
      Thread.sleep(3000);
      try {
      	elementClick(o.getAftertransducersimulation3D());
          Thread.sleep(40000);
  	} catch (Exception e) {
  		elementClick(o.getAftertransducersaveandexit());
  		wait5seconds();
  		closeTab();
  	}
   
	
	
}

@When("User have to click the after transducer threeD button and click run button")
public void user_have_to_click_the_after_transducer_threeD_button_and_click_run_button() throws InterruptedException {
	
    elementClick(o.getAftertransducer3Dpalybutton());
    wait5seconds();	
	
}


@When("User have to click to disable the simulation dynamic suspension")
public void user_have_to_click_to_disable_the_simulation_dynamic_suspension() throws InterruptedException {
    
	elementClick(o.getDynamicsuspensionno());
	wait1Seconds();
	String text = o.getSimulationmainbody().getText();
	System.out.println(text);
	if (text.contains("Advanced Options")) {
		System.out.println("-----After click the dynamic suspension yes it show the wheel rail contact profile-----");
		String partial = "Advanced Options";
		Assert.assertTrue(text.contains(partial));
		
	} else {
		System.out.println("-----After click the dynamic suspension it not show the wheel rail contact profile option-----");
		String partial = "Advanced Options";
		Assert.assertTrue(text.contains(partial));
}
}
@Then("User have to click the save simulation button and close the tab")
public void user_have_to_click_the_save_simulation_button_and_close_the_tab() throws InterruptedException {
    elementClick(o.getAftertransducersaveandexit());
    Thread.sleep(3000);
    quitTab();
}


//Check after edit the subscription to view the subscription view show updated plan or not


@When("User have mouseover the first subscription and click the action button")
public void user_have_mouseover_the_first_subscription_and_click_the_action_button()throws InterruptedException {
    
	mouseOverAction(o.getSubscription1());
	wait1Seconds();
	elementClick(o.getSubscriptionaction());
	wait1Seconds();
	
	
}

@When("User have to click the view subscription option and check correct page navigate")
public void user_have_to_click_the_view_subscription_option_and_check_correct_page_navigate()throws InterruptedException {
    elementClick(o.getSubscriptionview());
    wait1Seconds();
    String text = o.getSubscriptionviewbody().getText();
    if (text.contains("Subscription Details")) {
		System.out.println("View subscription navigate to subscription correct page");
    	
	} else {
		System.out.println("View subscription navigate to subscription not correct page");
	}

    
	
}

@When("User have to click the subscription edit button check correct page navigate")
public void user_have_to_click_the_subscription_edit_button_check_correct_page_navigate()throws InterruptedException {
    elementClick(o.getSubscriptionedit());
    wait1Seconds();
    String text = o.getSubscriptioneditbody().getText();
    if (text.contains("Amend Subscription")) {
  		System.out.println("View edit subscription navigate to edit subscription correct page");
      	
  	} else {
  		System.out.println("View edit subscription navigate to edit subscription not correct page");
  	}
	
	
}

@When("User have to click the subscription edit cancel button")
public void user_have_to_click_the_subscription_edit_cancel_button() throws InterruptedException {
    elementClick(o.getSubscriptioneditcancel());
    wait1Seconds();
    String text = o.getSubscriptionviewbody().getText();
    if (text.contains("Subscription Details")) {
		System.out.println("After cancel edit subscription navigate to subscription correct page");
    	
	} else {
		System.out.println("After cancel edit subscription navigate to subscription not correct page");
	}
    
}

@When("User have to select running pro subscription and it show upgrade to downgrade subscription msg")
public void user_have_to_select_running_pro_subscription_and_it_show_upgrade_to_downgrade_subscription_msg() throws InterruptedException {
    elementClick(o.getSubscriptionedselectbox());
    wait1Seconds();
    elementClick(o.getSubscriptionrunningpro());
    wait1Seconds();
    String text = o.getSubscriptioneditbody().getText();
    System.out.println(text);
    if (text.contains("Downgrading")) {
		System.out.println("It showing Downgrading msg");
    	
	} else {
		System.out.println("It showing Upgrading not show correct msg");
	}
	
	
}

@When("User have to click edit subscription conform and check the sucess msg")
public void user_have_to_click_edit_subscription_conform_and_check_the_sucess_msg() {
	
    elementClick(o.getSubscriptioneditconform());
    String text = o.getSubscriptionviewbody().getText();
    System.out.println(text);
     
    if (text.contains("Payment successful, you will receive an invoice via email shortly")) {
		System.out.println("It showing success payment msg in the view subscription page");
    	
	} else {
		System.out.println("It not showing success payment msg in the view subscription page");
	}
	
	
}


@When("User have to select impact running pro subscription and it show downgrade to upgrade subscription msg")
public void user_have_to_select_impact_running_pro_subscription_and_it_show_downgrade_to_upgrade_subscription_msg() {
    String text = o.getSubscriptioneditbody().getText();
    System.out.println(text);
    if (text.contains("Upgrading")) {
		System.out.println("It showing Upgrading msg");
    	
	} else {
		System.out.println("It showing Downgrading not show correct msg");
	}	
	
}

@When("User have to check view subscription is show updated paln\\(upgrade to downgrade)")
public void user_have_to_check_view_subscription_is_show_updated_paln_upgrade_to_downgrade() {
	String text = o.getSubscriptionviewbody().getText();
    System.out.println(text);
}

@When("User have to check view subscription is show updated plan\\(downgrade to upgrade)")
public void user_have_to_check_view_subscription_is_show_updated_plan_downgrade_to_upgrade() {
	String text = o.getSubscriptionviewbody().getText();
    System.out.println(text);
     
    if (text.contains("DigitalTrains Running - Pro")) {
		System.out.println("It showing Updated plan in the view subscription page");
    	
	} else {
		System.out.println("It not showing Updated plan in the view subscription page");
	}
   
}



//Check the mirror option in of the bogies Bush top and bottom input fields

@When("User have to enter air spring two bogies name and create")
public void user_have_to_enter_air_spring_two_bogies_name_and_create() throws InterruptedException {
    
	sendKeys(o.getAirspringbogienamebox(),"Airspring bogie2");
	wait1Seconds();
	elementClick(o.getAirspringbogiecreatebutton());
	wait1Seconds();
	
}

@When("User have to enter bush the top x input field and check the bottom x input field is refelecting the same data")
public void user_have_to_enter_bush_the_top_x_input_field_and_check_the_bottom_x_input_field_is_refelecting_the_same_data() throws InterruptedException {
    
	o.getAirspringbushxbox().clear();
	sendKeys(o.getAirspringbushxbox(),"100");
	wait1Seconds();
	String text = o.getBottomy25bogiesbushxbox().getText();
	System.out.println(text);
	wait1Seconds();
	if (text=="100") {
		System.out.println("The Bush Top and bottom input field mirror option working fine");
		
	} else {
        System.out.println("The Bush Top and bottom input field mirror option not working properly");
        Assert.assertEquals("Compare the values of top and bottom","",text);
        
	}
	wait1Seconds();
	
}

@When("User have to enter bush the top y input field and check the bottom y input field is refelecting the same data")
public void user_have_to_enter_bush_the_top_y_input_field_and_check_the_bottom_y_input_field_is_refelecting_the_same_data() throws InterruptedException {
    
	o.getAirspringbushybox().clear();
	sendKeys(o.getAirspringbushybox(),"100");
	wait1Seconds();
	String text = o.getBottomy25bogiesbushxbox().getText();
	System.out.println(text);
	wait1Seconds();
	if (text=="100") {
		System.out.println("The Bush Top and bottom input field mirror option working fine");
		
	} else {
        System.out.println("The Bush Top and bottom input field mirror option not working properly");
        Assert.assertEquals("Compare the values of top and bottom","",text);
	}
	wait1Seconds();
	
}

@When("User have to enter bush the top z input field and check the bottom z input field is refelecting the same data")
public void user_have_to_enter_bush_the_top_z_input_field_and_check_the_bottom_z_input_field_is_refelecting_the_same_data() throws InterruptedException {
    
	o.getAirspringbushzbox().clear();
	sendKeys(o.getAirspringbushzbox(),"100");
	wait1Seconds();
	String text = o.getBottomy25bogiesbushxbox().getText();
	System.out.println(text);
	wait1Seconds();
	if (text=="100") {
		System.out.println("The Bush Top and bottom input field mirror option working fine");
		
	} else {
        System.out.println("The Bush Top and bottom input field mirror option not working properly");
        Assert.assertEquals("Compare the values of top and bottom","",text);
	}
	wait1Seconds();
	elementClick(o.getBushcancelbutton());
	wait5seconds();
	
}

@When("User have to enter Airspring the top x input field and check the bottom x input field is refelecting the same data")
public void user_have_to_enter_Airspring_the_top_x_input_field_and_check_the_bottom_x_input_field_is_refelecting_the_same_data()throws InterruptedException {
    o.getAirspeingxone().clear();
    sendKeys(o.getAirspeingxone(),"100");
    wait1Seconds();
	String text = o.getBottomairspringxbox().getText();
	System.out.println(text);
	wait1Seconds();
	if (text=="100") {
		System.out.println("The Airspring Top and bottom input field mirror option working fine");
		
	} else {
        System.out.println("The Airspring Top and bottom input field mirror option not working properly");
        Assert.assertEquals("Compare the values of top and bottom","",text);
	}
	wait1Seconds();
}

@When("User have to enter Airspring the top y input field and check the bottom y input field is refelecting the same data")
public void user_have_to_enter_Airspring_the_top_y_input_field_and_check_the_bottom_y_input_field_is_refelecting_the_same_data()throws InterruptedException {
    o.getAirspringyone().clear();
    sendKeys(o.getAirspringyone(),"100");
    wait1Seconds();
	String text = o.getBottomairspringybox().getText();
	System.out.println(text);
	wait1Seconds();
	if (text=="100") {
		System.out.println("-----The Airspring Top and bottom input field mirror option working fine-----");
		
	} else {
        System.out.println("-----The Airspring Top and bottom input field mirror option not working properly-----");
        Assert.assertEquals("Compare the values of top and bottom","",text);
	}
	wait1Seconds();
}

@Then("User have to cancel the air spring button")
public void user_have_to_cancel_the_air_spring_button() throws InterruptedException {
    elementClick(o.getAirspringcancelbutton());
    wait5seconds();
}

@Given("User have to enter shear spring x y values")
public void user_have_to_enter_shear_spring_x_y_values() throws InterruptedException {
	o.getAirsptingshaerspringxone().clear();
	sendKeys(o.getAirsptingshaerspringxone(),"100");
	wait1Seconds();
	o.getAirsptingshaerspringyone().clear();
	sendKeys(o.getAirsptingshaerspringyone(),"100");
	wait1Seconds();
	
}

@When("User have to enter Shearspring the top x input field and check the bottom x input field is refelecting the same data")
public void user_have_to_enter_Shearspring_the_top_x_input_field_and_check_the_bottom_x_input_field_is_refelecting_the_same_data()throws InterruptedException {
    String text = o.getBottomshearspringxbox().getText();
    System.out.println(text);
    wait1Seconds();
	if (text=="100") {
		System.out.println("-----The Shearspring Top and bottom input field mirror option working fine-----");
		
	} else {
        System.out.println("-----The Shearspring Top and bottom input field mirror option not working properly-----");
        Assert.assertEquals("Compare the values of top and bottom","",text);
	}
	wait1Seconds();
}

@When("User have to enter Shearspring the top y input field and check the bottom y input field is refelecting the same data")
public void user_have_to_enter_Shearspring_the_top_y_input_field_and_check_the_bottom_y_input_field_is_refelecting_the_same_data()throws InterruptedException {
	String text = o.getBottomshearspringybox().getText();
    System.out.println(text);
    wait1Seconds();
	if (text=="100") {
		System.out.println("-----The Shearspring Top and bottom input field mirror option working fine-----");
		
	} else {
        System.out.println("-----The Shearspring Top and bottom input field mirror option not working properly-----");
        Assert.assertEquals("Compare the values of top and bottom","",text);
	}
	wait1Seconds();
}

@Then("User have to click the shearspring cancel button")
public void user_have_to_click_the_shearspring_cancel_button()throws InterruptedException {
    elementClick(o.getShearspringcancelbutton());
    wait5seconds();
}

@Given("User have to the constraint option")
public void user_have_to_the_constraint_option()throws InterruptedException {
    elementClick(o.getConstraintpart());
    Thread.sleep(3000);
}

@Given("User have to enter constraint x y z values")
public void user_have_to_enter_constraint_x_y_z_values()throws InterruptedException {
    o.getConstrainttopx().clear();
    sendKeys(o.getConstrainttopx(),"100");
    wait1Seconds();
    o.getConstrainttopy().clear();
    sendKeys(o.getConstrainttopy(),"100");
    wait1Seconds();
    o.getConstrainttopz().clear();
    sendKeys(o.getConstrainttopz(),"100");
    wait1Seconds();
    
}

@Given("User have to enter constraint the top x input field and check the bottom x input field is refelecting the same data")
public void user_have_to_enter_constraint_the_top_x_input_field_and_check_the_bottom_x_input_field_is_refelecting_the_same_data()throws InterruptedException {
    String text = o.getConstraintbottomx().getText();
    System.out.println(text);
    wait1Seconds();
	if (text=="100") {
		System.out.println("-----The Constraint Top and bottom input field mirror option working fine-----");
		
	} else {
        System.out.println("-----The Constraint Top and bottom input field mirror option not working properly-----");
        Assert.assertEquals("Compare the values of top and bottom","",text);
	}
	wait1Seconds();
}

@Given("User have to enter constraint the top y input field and check the bottom y input field is refelecting the same data")
public void user_have_to_enter_constraint_the_top_y_input_field_and_check_the_bottom_y_input_field_is_refelecting_the_same_data()throws InterruptedException {
	String text = o.getConstraintbottomy().getText();
    System.out.println(text);
    wait1Seconds();
	if (text=="100") {
		System.out.println("-----The Constraint Top and bottom input field mirror option working fine-----");
		
	} else {
        System.out.println("-----The Constraint Top and bottom input field mirror option not working properly-----");
        Assert.assertEquals("Compare the values of top and bottom","",text);
	}
	wait1Seconds();
}

@Given("User have to enter constraint the top z input field and check the bottom z input field is refelecting the same data")
public void user_have_to_enter_constraint_the_top_z_input_field_and_check_the_bottom_z_input_field_is_refelecting_the_same_data()throws InterruptedException {
	String text = o.getConstraintbottomz().getText();
    System.out.println(text);
    wait1Seconds();
	if (text=="100") {
		System.out.println("-----The Constraint Top and bottom input field mirror option working fine-----");
		
	} else {
        System.out.println("-----The Constraint Top and bottom input field mirror option not working properly-----");
        Assert.assertEquals("Compare the values of top and bottom","",text);
	}
	wait1Seconds();
}

@Then("User have to click the constraint cancel button")
public void user_have_to_click_the_constraint_cancel_button() throws InterruptedException {
    elementClick(o.getConstraintcancelbutton());
    wait1Seconds();
}

@When("User mouseover the airspring second bogie and click the action")
public void user_mouseover_the_airspring_second_bogie_and_click_the_action() throws InterruptedException {
    elementClick(o.getBogieassamblyleavewithoutsaving());
    wait1Seconds();
    mouseOverAction(o.getAirspringbogie2());
    wait1Seconds();
    elementClick(o.getAirspring2actionbutton());
    wait1Seconds();
}

@When("User have to click the airspring second bogie delete button")
public void user_have_to_click_the_airspring_second_bogie_delete_button() throws InterruptedException {
    elementClick(o.getAirspring2bogiedeletebutton());
    wait1Seconds();
    elementClick(o.getAirspring2bogiedeleteconformbutton());
    wait1Seconds();
}


//Check the all train create next option

@Then("User have to check the now the page is show the review the interfaces")
public void user_have_to_check_the_now_the_page_is_show_the_review_the_interfaces() throws InterruptedException {
    wait5seconds();
	String text = o.getCreatetrainmainbody().getText();
    System.out.println(text);
    boolean contains = text.contains("Review Interfaces");
    Assert.assertTrue("Check the create train next page title",contains);
    
}

@When("User have to click the freight train and click next")
public void user_have_to_click_the_freight_train_and_click_next()throws InterruptedException {
	String text = o.getCreatetrainmainbody().getText();
    System.out.println(text);
    boolean contains = text.contains("Setup Train");
    Assert.assertTrue("Check the create train page title",contains);
    wait1Seconds();
    elementClick(o.getFreighttrain());
    Thread.sleep(3000);
    elementClick(o.getCreatetrainnextbutton());
    Thread.sleep(3000);
}

@When("User have to click the metro train and click next")
public void user_have_to_click_the_metro_train_and_click_next() throws InterruptedException{
	String text = o.getCreatetrainmainbody().getText();
    System.out.println(text);
    boolean contains = text.contains("Setup Train");
    Assert.assertTrue("Check the create train page title",contains);
    wait1Seconds();
    elementClick(o.getHighspeedtrain());
    Thread.sleep(3000);
    elementClick(o.getCreatetrainnextbutton());
    Thread.sleep(3000);
}

@When("User have to click the light train and click next")
public void user_have_to_click_the_light_train_and_click_next()throws InterruptedException {
	String text = o.getCreatetrainmainbody().getText();
    System.out.println(text);
    boolean contains = text.contains("Setup Train");
    Assert.assertTrue("Check the create train page title",contains);
    wait1Seconds();
    elementClick(o.getLightrailtrain());
    Thread.sleep(3000);
    elementClick(o.getCreatetrainnextbutton());
    Thread.sleep(3000);
}
@When("User have to click mainline train and click next")
public void user_have_to_click_mainline_train_and_click_next()throws InterruptedException {
	String text = o.getCreatetrainmainbody().getText();
    System.out.println(text);
    boolean contains = text.contains("Setup Train");
    Assert.assertTrue("Check the create train page title",contains);
    wait1Seconds();
	elementClick(o.getMainlinetrain());
    Thread.sleep(3000);
    elementClick(o.getCreatetrainnextbutton());
    Thread.sleep(3000);
}

@When("User have to click the high speed train and click next")
public void user_have_to_click_the_high_speed_train_and_click_next()throws InterruptedException {
	String text = o.getCreatetrainmainbody().getText();
    System.out.println(text);
    boolean contains = text.contains("Setup Train");
    Assert.assertTrue("Check the create train page title",contains);
    wait1Seconds();
	elementClick(o.getMainlinetrain());
	Thread.sleep(3000);
    elementClick(o.getCreatetrainnextbutton());
    Thread.sleep(3000);
}



//Check the project edit option 

@When("User have to click the prject option")
public void user_have_to_click_the_prject_option() throws InterruptedException {
    elementClick(o.getCreateprojectbutton());
    wait1Seconds();
    String text = o.getCreateprojectpage().getText();
    System.out.println(text);
    boolean contains = text.contains("Create Project");
    Assert.assertTrue("Check the create project page title",contains);
    
}

@Then("User have to fill the DVRS Three project name and click to save")
public void user_have_to_fill_the_DVRS_Three_project_name_and_click_to_save() throws InterruptedException{
    sendKeys(o.getProjectnamebox(),"DVRS3");
    wait1Seconds();
    elementClick(o.getCreateprojectButton());
    Thread.sleep(3000);
    String text = o.getCreateprojectmainpagebody().getText();
    System.out.println(text);
    boolean contains = text.contains("DVRS3");
    Assert.assertTrue("Check the DVRS3 project is created or not",contains);
    
}

@Given("User have to mouseover the DVRS Three project name")
public void user_have_to_mouseover_the_DVRS_Three_project_name()throws InterruptedException {
    mouseOverAction(o.getDVRS3());
    wait1Seconds();
    
}

@Given("User have to click the DVRS Three action button")
public void user_have_to_click_the_DVRS_Three_action_button()throws InterruptedException {
    elementClick(o.getDVRS3action());
    wait1Seconds();
}

@When("User have to click the DVRS Three project edit button")
public void user_have_to_click_the_DVRS_Three_project_edit_button()throws InterruptedException {
    elementClick(o.getDVRS3editprojectbutton());
    wait1Seconds();
    String text = o.getDVRS3editbody().getText();
    System.out.println(text);
    boolean contains = text.contains("Edit Project");
    Assert.assertTrue("Check the DVRS3 project edit page",contains);
    
}

@Then("User have to edit the DVRS Three project name and click the save button")
public void user_have_to_edit_the_DVRS_Three_project_name_and_click_the_save_button()throws InterruptedException {
	o.getDVRS3editbox().clear();
	wait1Seconds();
	sendKeys(o.getDVRS3editbox(),"DVRS31");
	wait1Seconds();
    elementClick(o.getDVRS3savebutton());
    wait1Seconds();
    String text = o.getCreateprojectmainpagebody().getText();
    System.out.println(text);
    boolean contains = text.contains("DVRS31");
    Assert.assertTrue("Check the DVRS3 project is created",contains);
    wait1Seconds();
}

@When("User have to click the DVRS Three project delete button")
public void user_have_to_click_the_DVRS_Three_project_delete_button()throws InterruptedException {
    driver.navigate().refresh();
    Thread.sleep(5000);
	mouseOverAction(o.getDVRS31());
    wait1Seconds();
    elementClick(o.getDVRS31action());
    wait1Seconds();
    mouseOverAction(o.getDVRS3deletebutton());
    wait1Seconds();
    elementClick(o.getDVRS3deletebutton());
    wait1Seconds();
    String text = o.getDVRS3deletebody().getText();
    System.out.println(text);
    boolean contains = text.contains("Delete Project");
    Assert.assertTrue("Check the DVRS3 project delete page",contains);
    wait1Seconds();
}

@When("User have to click the conform project delete button")
public void user_have_to_click_the_conform_project_delete_button() throws InterruptedException {
    elementClick(o.getDVRS3conformdelete());
    wait5seconds();
}



//Check the coupler interface after delete device still show use error


@Given("User have to send the device dimention details")
public void user_have_to_send_the_device_dimention_details() throws InterruptedException {
    

	String text = o.getPivotassemblypagebody().getText();
	System.out.println(text);
	boolean contains = text.contains("Pivot Assembly");
	Assert.assertTrue("Check the pivot assemble device page",contains);
	wait1Seconds();
	sendKeys(o.getPivotassemblyname(),"H300 Pivot");
	wait1Seconds();
	elementClick(o.getPivotanchorconnectorbox());
	wait1Seconds();
	elementClick(o.getPivotanchorconnectoreyelet());
	wait1Seconds();
	elementClick(o.getPivotanchorconnectinterfacetypebox());
	wait1Seconds();
	elementClick(o.getPivotanchorconnectautocoupler());
	wait1Seconds();
	elementClick(o.getPivotanchorconnectpivottypebox());
	wait1Seconds();
	elementClick(o.getPivotanchorconnectstanderdbracket());
	wait1Seconds();
	sendKeys(o.getPivotlengthbox(),"300");
	wait1Seconds();
	sendKeys(o.getPivotdistancebox(),"200");
	wait1Seconds();
	sendKeys(o.getPivotdeviceweightbox(),"200");
	wait1Seconds();
	sendKeys(o.getPivotdevicemuffbox(),"150");
	wait1Seconds();
	
}

@Given("User have to click the pivot assemble save button")
public void user_have_to_click_the_pivot_assemble_save_button() throws InterruptedException {

	elementClick(o.getPivotassemblydevicesave());
	Thread.sleep(3000);
	String text = o.getDevicemainpagebody().getText();
	System.out.println(text);
	boolean contains = text.contains("H300 Pivot");
	Assert.assertTrue("Check the device page is show the saved device",contains);
	wait5seconds();
}


@When("User have to click select coupling interface and click blank auto coupler interface option")
public void user_have_to_click_select_coupling_interface_and_click_blank_auto_coupler_interface_option()throws InterruptedException {
    elementClick(o.getBlankautocouplerinterface());
    wait1Seconds();
    elementClick(o.getSelecttemplatefromcouplinginterface());
    wait5seconds();
	
	
}

@When("User have to click the pivot assambly add button")
public void user_have_to_click_the_pivot_assambly_add_button()throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getCouplinginterfaceafterselecttemplate());
    Thread.sleep(2000);
	elementClick(o.getCreatecouplinginterfaceaddpivotassemble());
    wait1Seconds();
    
	
	
}

@When("User have to click the select the choose from library option adding the pivot assemble")
public void user_have_to_click_the_select_the_choose_from_library_option_adding_the_pivot_assemble()throws InterruptedException {
	elementClick(o.getCreatecouplingchoosefromlibrary());
    wait5seconds();
    elementClick(o.getCouplinginterfacepersonallibrary());
    elementClick(o.getCouplinginterfaceH300pivot());
    Thread.sleep(3000);
	
	
}

@When("User have to click the personal library H pivot after attach the device")
public void user_have_to_click_the_personal_library_H_pivot_after_attach_the_device() throws InterruptedException {
	elementClick(o.getCouplinginterfaceafterselecttemplate());
	wait1Seconds();
	elementClick(o.getCouplinginterfaceattachbutton());
	wait1Seconds();

}
@When("User have to click coupling interface create button")
public void user_have_to_click_coupling_interface_create_button() throws InterruptedException {
	elementClick(o.getCouplinginterfacecreatebutton());
	Thread.sleep(5000);
	String text = o.getCouplinginterfacemainpagebody().getText();
	System.out.println(text);
	boolean contains = text.contains("New interface");
	Assert.assertTrue("Check after create the coupling interface in main page",contains);
	wait1Seconds();
	
}


//Adding the braking and drive characteristics in vehicle option 

@When("User have to mouseover my vehicle option and click the action button")
public void user_have_to_mouseover_my_vehicle_option_and_click_the_action_button() throws InterruptedException {
    String currentUrl = driver.getCurrentUrl();
    System.err.println(currentUrl);
    boolean contains = currentUrl.contains("https://testphp.digitaltrains.online/vehicles");
	Assert.assertTrue("Check after click the vehicle button is show correct page",contains);
	wait1Seconds();
	mouseOverAction(o.getMyvehicleoption());
	wait1Seconds();
	elementClick(o.getMyvehicleactionbutton());
	wait1Seconds();
	
}

@When("User have to click the braking characteristics box and select the type")
public void user_have_to_click_the_braking_characteristics_box_and_select_the_type() throws InterruptedException {
    elementClick(o.getMyvehicleeditbutton());
    wait1Seconds();
    String text = o.getMyvehicleeditbody().getText();
    System.out.println(text);
    boolean contains = text.contains("Vehicle Setup");
	Assert.assertTrue("Check after edit vehicle it show the shadow page",contains);
	wait1Seconds();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getMyvehiclebrackingcharacteristicsoption());
    Thread.sleep(2000);
    elementClick(o.getMyvehicleeditbrakingcharacteristicsbox());
    wait1Seconds();
    elementClick(o.getBRKK55brakingcharacteristics());
    wait1Seconds();
}

@When("User have to click the drive characteristics box and select the type")
public void user_have_to_click_the_drive_characteristics_box_and_select_the_type() throws InterruptedException {

	
    elementClick(o.getMyvehicleeditdriveforcecharacteristicsbox());
    wait1Seconds();
    elementClick(o.getDRV56drivecharacteristics());
    wait1Seconds();

}


@When("User have to click the vehicle save button")
public void user_have_to_click_the_vehicle_save_button() throws InterruptedException {
	
    elementClick(o.getMyvehiclesavebutton());
    Thread.sleep(3000);
    
}






//New window option train and route profile option in simulation and train module


@Given("User have mouseover the running train simulation option")
public void user_have_mouseover_the_running_train_simulation_option() throws InterruptedException {
    
	elementClick(o.getProjectoption());
	wait1Seconds();
	elementClick(o.getSimulationdvrs1());
	wait1Seconds();
	mouseOverAction(o.getSimulationrunningtrain());
}

@When("User have to click the action and edit simulation button")
public void user_have_to_click_the_action_and_edit_simulation_button() throws InterruptedException {
    
	elementClick(o.getSimulationrunningtrainactionbutton());
	wait1Seconds();
	elementClick(o.getSimulationrunningtraineditoption());
	wait1Seconds();
	
}

@When("User have to click the first train new window option and check the train module")
public void user_have_to_click_the_first_train_new_window_option_and_check_the_train_module() throws InterruptedException {
    
	elementClick(o.getSimulationtrainnewwindow());
	wait1Seconds();
	String parentid = driver.getWindowHandle();
	Set<String> allwindowid = driver.getWindowHandles();
	for (String id : allwindowid) {
		if (parentid != id) {
			driver.switchTo().window(id);
		}
	}
	Thread.sleep(8000);
	String text = o.getTrainpagemainbody().getText();
	System.out.println(text);
	boolean contains = text.contains("CREATE TRAIN");
	Assert.assertTrue("Check after click the new window it show train module",contains);
	wait1Seconds();
	driver.close();
	driver.switchTo().window(parentid);
	wait1Seconds();
	
	
}


@When("User have to click the route profile new window option and check the route profile module")
public void user_have_to_click_the_route_profile_new_window_option_and_check_the_route_profile_module() throws InterruptedException {
	
	wait1Seconds();
	elementClick(o.getSimulationtrouteprofilenewwindow());
	wait1Seconds();
	String parentid = driver.getWindowHandle();
	Set<String> allwindowid = driver.getWindowHandles();
	for (String id : allwindowid) {
		if (parentid != id) {
			driver.switchTo().window(id);
		}
	}
	Thread.sleep(8000);
	String text = o.getTrainpagemainbody().getText();
	System.out.println(text);
	boolean contains = text.contains("Tunnel Added Reverse curve route");
	Assert.assertTrue("Check after click new window it show route profile module",contains);
	wait1Seconds();
	driver.close();
	driver.switchTo().window(parentid);
	wait1Seconds();
	
}

@When("User have to click the train two or bufferstop option and click the route profile new window option")
public void user_have_to_click_the_train_two_or_bufferstop_option_and_click_the_route_profile_new_window_option() throws InterruptedException {
    
	elementClick(o.getSimulationtrain2option());
	wait1Seconds();
	elementClick(o.getSimulationtrouteprofilenewwindow());
	String parentid = driver.getWindowHandle();
	Set<String> allwindowid = driver.getWindowHandles();
	for (String id : allwindowid) {
		if (parentid != id) {
			driver.switchTo().window(id);
		}
	}
	wait5seconds();
	String text = o.getTrainpagemainbody().getText();
	System.out.println(text);
	boolean contains = text.contains("Tunnel Added Reverse curve route");
	Assert.assertTrue("Check after click new window it show route profile module",contains);
	wait1Seconds();
	driver.close();
	driver.switchTo().window(parentid);
	wait1Seconds();
	
}


@Given("User have to click the train option and mouse over the my train")
public void user_have_to_click_the_train_option_and_mouse_over_the_my_train()throws InterruptedException {
    
	elementClick(o.getTrainoption());
	wait1Seconds();
	mouseOverAction(o.getMytrainoption());
	wait1Seconds();
	
	
	
}

@Given("User have to click the my train edit option")
public void user_have_to_click_the_my_train_edit_option()throws InterruptedException {
    
	elementClick(o.getMytrainactionoption());
	wait1Seconds();
	elementClick(o.getTraineditoption());
	wait1Seconds();
	
}

@Given("User have to click the vehicle new window option and check the vehicle module")
public void user_have_to_click_the_vehicle_new_window_option_and_check_the_vehicle_module()throws InterruptedException {
    
	elementClick(o.getTrainvehiclenewwindow());
	wait1Seconds();
	String parentid = driver.getWindowHandle();
	Set<String> allwindowid = driver.getWindowHandles();
	for (String id : allwindowid) {
		if (parentid != id) {
			driver.switchTo().window(id);
		}
	}
	wait5seconds();
	String text = o.getTrainpagemainbody().getText();
	System.out.println(text);
	boolean contains = text.contains("CREATE VEHICLE");
	Assert.assertTrue("Check after click new window it show vehicle module",contains);
	wait1Seconds();
	driver.close();
	driver.switchTo().window(parentid);
	wait1Seconds();
	
}

@Given("User have to click the left coupling inter face new window option and check the coupling interface module")
public void user_have_to_click_the_left_coupling_inter_face_new_window_option_and_check_the_coupling_interface_module()throws InterruptedException {
   
	wait1Seconds();
    elementClick(o.getTrainleftcouplinginterfacenewwindowoption());
    wait1Seconds();
    String parentid = driver.getWindowHandle();
	Set<String> allwindowid = driver.getWindowHandles();
	for (String id : allwindowid) {
		if (parentid != id) {
			driver.switchTo().window(id);
		}
	}
	wait5seconds();
	String text = o.getTrainpagemainbody().getText();
	System.out.println(text);
	boolean contains = text.contains("CREATE COUPLING INTERFACE");
	Assert.assertTrue("Check after click new window it show coupling interface module",contains);
	wait1Seconds();
	driver.close();
	driver.switchTo().window(parentid);
	wait1Seconds();
    
	
	
}

@Given("User have to click the right coupling inter face new window option and check the coupling interface module")
public void user_have_to_click_the_right_coupling_inter_face_new_window_option_and_check_the_coupling_interface_module() throws InterruptedException {
    
	    wait1Seconds();
	    elementClick(o.getTrainrightcouplinginterfacenewwindowoption());
	    wait1Seconds();
	    String parentid = driver.getWindowHandle();
		Set<String> allwindowid = driver.getWindowHandles();
		for (String id : allwindowid) {
			if (parentid != id) {
				driver.switchTo().window(id);
			}
		}
		wait5seconds();
		String text = o.getTrainpagemainbody().getText();
		System.out.println(text);
		boolean contains = text.contains("CREATE COUPLING INTERFACE");
		Assert.assertTrue("Check after click new window it show coupling interface module",contains);
		wait1Seconds();
		driver.close();
		driver.switchTo().window(parentid);
		wait1Seconds();
	
}



//Check the option of attach and detach option of friction shoes in buffer stop


@Given("User have mouse over view to the three point sliding bufferstop")
public void user_have_mouse_over_view_to_the_three_point_sliding_bufferstop()throws InterruptedException {
    
	String text = o.getTrainpagemainbody().getText();
	System.out.println(text);
	boolean contains = text.contains("CREATE BUFFER STOP");
	Assert.assertTrue("Check after click the buffer stop it show buffer stop module",contains);
	wait1Seconds();
	mouseOverAction(o.getThreepointslidingbufferstopoption());
	wait1Seconds();

	
}

@Given("User have to click the bufferstop action and view bufferstop button")
public void user_have_to_click_the_bufferstop_action_and_view_bufferstop_button()throws InterruptedException {
    
	elementClick(o.getThreepointbufferstopactionbutton());
	wait1Seconds();
	elementClick(o.getThreepointbufferstopviewbufferstopoption());
	Thread.sleep(3000);
	
}

@When("User have to click the friction shoe plus button")
public void user_have_to_click_the_friction_shoe_plus_button()throws InterruptedException {
  
	elementClick(o.getSlidingbufferstopfrictionshoeaddbutton());
    wait1Seconds();
	
	
}

@When("User have to click the friction shoe edit button")
public void user_have_to_click_the_friction_shoe_edit_button() throws InterruptedException {
    elementClick(o.getSlidingbufferstopfrictionshoeseditbutton());
    wait1Seconds();
}

@When("User have clear the elenemt under frame box and fill the data")
public void user_have_clear_the_elenemt_under_frame_box_and_fill_the_data()throws InterruptedException {

	o.getElementunderframesbox().clear();
	wait1Seconds();
    sendKeys(o.getElementunderframesbox(),"2");
    wait1Seconds();
    
	
}

@When("User have to click the bufferstop friction attach option")
public void user_have_to_click_the_bufferstop_friction_attach_option()throws InterruptedException {

	elementClick(o.getThreepointbufferstopattachbutton());
    Thread.sleep(3000);
   
 
	
}

@When("User have to click the buffer stop friction conform save option")
public void user_have_to_click_the_buffer_stop_friction_conform_save_option()throws InterruptedException {
	 elementClick(o.getThreepointbufferstopattachsavebutton());
	 wait1Seconds();
	
	
}

@Then("User have to click then done button after edit bufferstop")
public void user_have_to_click_then_done_button_after_edit_bufferstop()throws InterruptedException {
   
	elementClick(o.getTreepointbufferstopsaveafterdonebutton());
	wait5seconds();
	String text = o.getTrainpagemainbody().getText();
	System.out.println(text);
	boolean contains = text.contains("CREATE BUFFER STOP");
	Assert.assertTrue("Check after click the buffer stop it show buffer stop module",contains);
	wait1Seconds();
	
}


@When("User have to click the bufferstop friction shoe detach option")
public void user_have_to_click_the_bufferstop_friction_shoe_detach_option()throws InterruptedException {
	
	wait5seconds();
	String text = o.getTrainpagemainbody().getText();
	System.out.println(text);
	boolean contains = text.contains("EDIT FABRICATED STRUCTURE");
	Assert.assertTrue("Check after click the bufferstop review it show buffestop review module",contains);
	wait1Seconds();
	elementClick(o.getThreepointbufferstopdetachbutton());
    Thread.sleep(3000);
	
	
}

@When("User have to click to conform save button for detach firction shoes")
public void user_have_to_click_to_conform_save_button_for_detach_firction_shoes() throws InterruptedException {
    elementClick(o.getThreepointbufferstopdetachsavebutton());
    Thread.sleep(3000);
	
}



//Buffer stop adding the side buffers


@Given("User have to click the bufferstop side buffer add button")
public void user_have_to_click_the_bufferstop_side_buffer_add_button()throws InterruptedException {
	
	String text = o.getTrainpagemainbody().getText();
	System.out.println(text);
	boolean contains = text.contains("Buffer Stop Side Buffer");
	Assert.assertTrue("Check after click the buffer stop it show buffer stop review module",contains);
	elementClick(o.getBufferstopaddingsidebufferbuttton());
    wait5seconds();
    
}

@When("User have to click the gashydraulic option and choose from library option")
public void user_have_to_click_the_gashydraulic_option_and_choose_from_library_option()throws InterruptedException {
   
	elementClick(o.getSidebuffergashydralicoption());
    wait1Seconds();
    elementClick(o.getSidebufferchoosefromlibrary());
    wait1Seconds();
}

@When("User have to click the public library option and select saas type")
public void user_have_to_click_the_public_library_option_and_select_saas_type()throws InterruptedException {
   
	elementClick(o.getSidebufferselectpubliclibrarybox());
    wait1Seconds();
    elementClick(o.getSidebuffertest());
    wait1Seconds();
}

@When("User have to click the sidebuffer select template button")
public void user_have_to_click_the_sidebuffer_select_template_button()throws InterruptedException {
   
	elementClick(o.getSidebufferselcttemplate());
    wait1Seconds();
    
}

@When("User have to click the side buffer attach button")
public void user_have_to_click_the_side_buffer_attach_button()throws InterruptedException {
    
	elementClick(o.getSidebufferattachbutton());
    wait5seconds();
    elementClick(o.getSidebuffersavebutton());
    wait5seconds();
    
}

@When("User have to click the after adding the side buffer three D option")
public void user_have_to_click_the_after_adding_the_side_buffer_three_D_option() throws InterruptedException {
    
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getSidebufferattached3doption());
    Thread.sleep(2000);
    elementClick(o.getSidebufferattached3doption());
    Thread.sleep(7000);
    
}

@When("User have to click the side buffer added buffer stop done button")
public void user_have_to_click_the_side_buffer_added_buffer_stop_done_button() throws InterruptedException {
	
	String text = o.getTrainpagemainbody().getText();
	System.out.println(text);
	boolean contains = text.contains("EDIT FABRICATED STRUCTURE");
	Assert.assertTrue("Check after click the buffer stop it show buffer stop module",contains);
	wait1Seconds();
	elementClick(o.getSidebufferattacheddone());
	wait1Seconds();
	quitTab();
}

@Given("User have to click the bufferstop side buffer detach add button")
public void user_have_to_click_the_bufferstop_side_buffer_detach_add_button() throws InterruptedException {
	
	String text = o.getTrainpagemainbody().getText();
	System.out.println(text);
	boolean contains = text.contains("EDIT FABRICATED STRUCTURE");
	Assert.assertTrue("Check after click the buffer stop it show buffer stop module",contains);
	wait1Seconds();
	elementClick(o.getSidebufferselectedoption());
	wait5seconds();
	
}


@When("User have to click the sidebuffer detach button")
public void user_have_to_click_the_sidebuffer_detach_button() throws InterruptedException {
    
	elementClick(o.getSidebufferdetachbutton());
	Thread.sleep(3000);
	elementClick(o.getSidebuffersavebutton());
	wait1Seconds();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",o.getSidebufferattached3doption());
    Thread.sleep(2000);
	
}



//Check the Adding the Door in the vehicle option


@When("User have to click the vehicle doors option")
public void user_have_to_click_the_vehicle_doors_option() throws InterruptedException {
    
	elementClick(o.getVehicledoorsoption());
	wait1Seconds();
	String text = o.getVehiclesetupbody().getText();
	System.out.println(text);
	boolean contains = text.contains("Vehicle Setup");
	Assert.assertTrue("Check after click the vehicle edit option show vehicle setup",contains);
	wait1Seconds();
	elementClick(o.getVehicledoorenable());
	wait1Seconds();

}

@When("User have to click the vehicle door plus button")
public void user_have_to_click_the_vehicle_door_plus_button()throws InterruptedException {
    
	elementClick(o.getVehicledoorplusoption());
	wait1Seconds();
	
}

@When("User have to enter details of the door start and end distance")
public void user_have_to_enter_details_of_the_door_start_and_end_distance()throws InterruptedException {
    
	sendKeys(o.getVehicledoorstartpointone(),"250");
	sendKeys(o.getVehicledoorstartpointtwo(),"350");
	sendKeys(o.getVehicledoorendpointone(),"750");
	sendKeys(o.getVehicledoorendpointtwo(),"1050");
	wait1Seconds();
	
}

@When("User have to click the vehicle three D option")
public void user_have_to_click_the_vehicle_three_D_option()throws InterruptedException {
    
	elementClick(o.getVehicle3Dbutton());
	Thread.sleep(25000);
	
}

@When("User have to click the vehicle door save button")
public void user_have_to_click_the_vehicle_door_save_button() throws InterruptedException {
	
	elementClick(o.getVehicledooreditsavebutton());
	Thread.sleep(3000);
}




//Check the contact review option is repeating or not


@When("User have to click the contact profile option review option under the action button")
public void user_have_to_click_the_contact_profile_option_review_option_under_the_action_button() throws InterruptedException {
   wait5seconds();
   mouseOverAction(o.getNewcontactprofileblock());
   wait1Seconds();
   elementClick(o.getNewcontactprofileaction());
   wait1Seconds();

   
	
	
}

@When("User have to chcek the loop count of review option is showing the contact profile option")
public void user_have_to_chcek_the_loop_count_of_review_option_is_showing_the_contact_profile_option() throws InterruptedException {
	   elementClick(o.getNewcontactprofilereview());
	   Thread.sleep(4000);
	   elementClick(o.getNewcontactprofilesave());
	   wait1Seconds();
	   elementClick(o.getNewcontactprofilesaveconform());
	   Thread.sleep(5000);
	   elementClick(o.getNewcontactprofilereviewpopupbutton());
	   wait5seconds();
	   elementClick(o.getNewcontactprofilesave());
	   wait1Seconds();
	   elementClick(o.getNewcontactprofilesaveconform());
	   Thread.sleep(5000);
	   String text = o.getContactprofilemainbody().getText();
	   System.out.println(text);
	   if (text.contains("Review Contact")) {
		   System.out.println("----After click the save button is showing again the review option----");
	}
	   else {
			System.out.println("----After click the save butto is not show again the review option----");
		}
	
}



//check the running train second train option to click the identical and load train from library navigate to train one


@Given("User have to click the dvrs one option")
public void user_have_to_click_the_dvrs_one_option() throws InterruptedException {
    String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
    boolean contains = currentUrl.contains("projects");
    Assert.assertTrue("After click the project option is show the Dvrs1 project", contains);
	wait1Seconds();
	elementClick(o.getDvrs1project());
	wait1Seconds();
	
}

@When("User have to mouseover the running train simulation option and click the action")
public void user_have_to_mouseover_the_running_train_simulation_option_and_click_the_action() throws InterruptedException {
    
	mouseOverAction(o.getRunningtrainsimulation());
	wait1Seconds();
	elementClick(o.getRunningtrainsimulationaction());
	Thread.sleep(1000);
	
}

@When("User have to click the running train edit option")
public void user_have_to_click_the_running_train_edit_option() throws InterruptedException {
   
	elementClick(o.getRunningtrainsimulationeditoption());
	Thread.sleep(3000);
	String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
    boolean contains = currentUrl.contains("simulations");
    Assert.assertTrue("After click the running train simulation edit simulation is show the simulation page", contains);
    wait1Seconds();
	
	
}

@When("User have to click the traintwo option and select the identical train option load train select form library")
public void user_have_to_click_the_traintwo_option_and_select_the_identical_train_option_load_train_select_form_library() throws InterruptedException {
    
	elementClick(o.getRunningtrainsecondtrain());
	wait1Seconds();
	elementClick(o.getRunningtrainsecondtrainidenticaloption());
	wait1Seconds();
	elementClick(o.getRunningtrainsecondtrain());
	wait1Seconds();
	elementClick(o.getRunningtrainsecondtrainloadtrainfromthelibrary());
	wait1Seconds();
	elementClick(o.getRunningtrainsecondtrain());
	wait1Seconds();
	String text = o.getRunningtrainsimulationsecondtrainmainbody().getText();
	System.out.println(text);
	if (text.contains("Identical train settings")) {
		System.out.println("----The Running train simulation train two option showing the idetical is not correct----");
		
	}
	else {
		System.out.println("----The Running train simulation train two option is not show the identical option working correctly----");
	}
	
}


//Check the Buffer stop edit fabrication contact option

@When("User have to click the edit fabrication option")
public void user_have_to_click_the_edit_fabrication_option()throws InterruptedException {
	String text = o.getBufferstopmainbody().getText();
	System.out.println(text);
	Thread.sleep(3000);
	boolean contains = text.contains("EDIT FABRICATED STRUCTURE");
	Assert.assertTrue("Check after click the bufferstop view option",contains);
	wait1Seconds();
    elementClick(o.getBufferstopeditfabricationbutton());
    wait1Seconds();
    
    
	
}

@When("User have to click the contact type option box")
public void user_have_to_click_the_contact_type_option_box()throws InterruptedException {
	String text = o.getBufferstopshadowbody().getText();
	System.out.println(text);
	boolean contains = text.contains("EDIT FABRICATED STRUCTURE");
	Assert.assertTrue("Check after click the bufferstop view option",contains);
	wait1Seconds();
    elementClick(o.getBufferstopselectcouplingtypebox());
    wait1Seconds();
    
	
	
}

@When("User have to select the side contact type option")
public void user_have_to_select_the_side_contact_type_option()throws InterruptedException {
    
	elementClick(o.getBufferstopsidecontact());
    wait1Seconds();
	
}

@When("User have to click the geometry option and fill the unfiled option")
public void user_have_to_click_the_geometry_option_and_fill_the_unfiled_option()throws InterruptedException {
    
	elementClick(o.getBufferstopgeometryoption());
	wait1Seconds();
	o.getBufferstopcoupleroffset().clear();
	sendKeys(o.getBufferstopcoupleroffset(),"0");
	o.getBufferstopbeamwidth().clear();
	sendKeys(o.getBufferstopbeamwidth(),"120");
	o.getBufferstopdistancebetweenrearandfront().clear();
	sendKeys(o.getBufferstopdistancebetweenrearandfront(),"1500");
	
}

@When("User have to click the bufferstop apply button")
public void user_have_to_click_the_bufferstop_apply_button()throws InterruptedException {
    
	elementClick(o.getBufferstopapplybutton());
	Thread.sleep(5000);
	
}

@When("User have to click the bufferstop done button")
public void user_have_to_click_the_bufferstop_done_button() throws InterruptedException {
    String text = o.getBufferstopmainbody().getText();
    System.out.println(text);
    boolean contains = text.contains("Buffer Stop Review");
	Assert.assertTrue("Check after click the bufferstop done option",contains);
	wait1Seconds();
	elementClick(o.getBufferstopdonebutton());
	wait1Seconds();
	
}





//Check the simulation PDF report generate option

@Given("User have to click the DVRS one option")
public void user_have_to_click_the_DVRS_one_option()throws InterruptedException {
    elementClick(o.getProjectdvrsone());
    wait1Seconds();
	
}

@When("User have to mouse over the running train simulation")
public void user_have_to_mouse_over_the_running_train_simulation()throws InterruptedException {
    mouseOverAction(o.getRunningtrainsimualtion());
    wait1Seconds();
	
	
}

@When("User have to click Running train simulation action button")
public void user_have_to_click_Running_train_simulation_action_button() throws InterruptedException{
    elementClick(o.getRunningtrainsimulationactionbutton());
	wait1Seconds();
	
	
}

@When("User have to click the Running train view result simulation option")
public void user_have_to_click_the_Running_train_view_result_simulation_option()throws InterruptedException {
    elementClick(o.getRunningtrainsimulationviewresultsoption());
    wait1Seconds();
    String text = o.getRunningtrainsimualtionmainpage().getText();
    System.out.println(text);
    boolean contains = text.contains("PDF DOWNLOAD");
   	Assert.assertTrue("Check after click theview result option it show pdf report ",contains);
   	wait1Seconds();
    
	
}

@When("User have to click the simulation pdf report option")
public void user_have_to_click_the_simulation_pdf_report_option()throws InterruptedException {
    elementClick(o.getRunningtrainsimulationpdfreportoption());
    wait1Seconds();
    String text = o.getPdfreportshadowpage().getText();
    System.out.println(text);
    boolean contains = text.contains("GENERATE REPORT");
   	Assert.assertTrue("Check after click the pdf report it show generate pdf option",contains);
   	wait1Seconds();
	
	
}

@When("User have to click the generate option")
public void user_have_to_click_the_generate_option() throws InterruptedException {
    
	elementClick(o.getPdfreportgeneraterbutton());
	Thread.sleep(40000);
	
}




//Check the bogie part without data and without name able to save or not

@Given("User have to click the bogie option and click the bogie part")
public void user_have_to_click_the_bogie_option_and_click_the_bogie_part()throws InterruptedException {
    elementClick(o.getDigitaltrainsbogies());
    wait1Seconds();
    elementClick(o.getBogiespartsoption());
    wait1Seconds();
}

@When("User have to click the create bogie part option")
public void user_have_to_click_the_create_bogie_part_option()throws InterruptedException {
    
	elementClick(o.getBogiescreatepart());
	wait1Seconds();
	
}

@When("User have to select part and create part button")
public void user_have_to_select_part_and_create_part_button()throws InterruptedException {
    elementClick(o.getBogiesmass());
    wait1Seconds();
   
}

@When("User have to fill the part name without data to save button")
public void user_have_to_fill_the_part_name_without_data_to_save_button()throws InterruptedException {
    sendKeys(o.getBogiespartmassnamebox(),"Withoutdatamass");
    wait1Seconds();
    o.getBogiespartmassmassbox().clear();
    wait1Seconds();
    o.getBogiespartmassrollinertia().clear();
    wait1Seconds();
    o.getBogiespartmasspitchinertia().clear();
    wait1Seconds();
    o.getBogiespartmassyawinertia().clear();
    wait1Seconds();
}

@When("User have to check the part able to save or not")
public void user_have_to_check_the_part_able_to_save_or_not()throws InterruptedException {
    
	elementClick(o.getBogiespartmasssavebutton());
	wait5seconds();
	String text = o.getBogiepartmainbody().getText();
	System.out.println(text);
	boolean contains = text.contains("Withoutdatamass");
   	Assert.assertTrue("Check after click the save button without data part save or not ",contains);
   	wait1Seconds();
	
}

@When("User have to fill the part data without name to save button")
public void user_have_to_fill_the_part_data_without_name_to_save_button() throws InterruptedException {
    
    wait1Seconds();
    o.getBogiespartmassmassbox().clear();
    o.getBogiespartmassrollinertia().clear();
    o.getBogiespartmasspitchinertia().clear();
    o.getBogiespartmassyawinertia().clear();
    sendKeys(o.getBogiespartmassmassbox(),"5.0");
    sendKeys(o.getBogiespartmassrollinertia(),"1.0");
    sendKeys(o.getBogiespartmasspitchinertia(),"2.0");
    sendKeys(o.getBogiespartmassyawinertia(),"3.0");
	
}

@When("User have to check the with out name part able to save or not")
public void user_have_to_check_the_with_out_name_part_able_to_save_or_not() throws InterruptedException {
	elementClick(o.getBogiespartmasssavebutton());
	Thread.sleep(8000);
	String text = o.getWithoutnamesavingshowshadowtab().getText();
	System.out.println(text);
	boolean contains = text.contains("Unable to save the part, please ensure that all enabled fields have been filled in.");
   	Assert.assertTrue("Check after click the save button without name part save or not ",contains);
   	wait1Seconds();
	
	
}


//Delete the without data bogie part option

@When("User have to mouseover the without name simulation")
public void user_have_to_mouseover_the_without_name_simulation()throws InterruptedException {
    String url = driver.getCurrentUrl();
    System.out.println(url);
    boolean equals = url.equals("https://testphp.digitaltrains.online/parts");
    wait1Seconds();
	mouseOverAction(o.getWithoutdatabogiepart());
	wait1Seconds();
	
}


@When("User have to click the without data bogie part action button")
public void user_have_to_click_the_without_data_bogie_part_action_button()throws InterruptedException {
    elementClick(o.getWithoutdatabogiepartactionbutton());
    wait1Seconds();
	
}

@When("User have to click the without data bogie part delete button")
public void user_have_to_click_the_without_data_bogie_part_delete_button() throws InterruptedException {
	 elementClick(o.getWithoutdatabogiepartdeletebutton());
	 Thread.sleep(3000);
	 String text = o.getWithoutdatabogiepartshadowpage().getText();
	 System.out.println(text);
	 boolean contains = text.contains("Are you sure you want to delete this part?");
	 Assert.assertTrue("Check after click the bogie part delete option ",contains);
	 wait1Seconds();
	 elementClick(o.getWithoutdatabogiepartdeleteconformbutton());
	 wait5seconds();
	
	
}


//Check the functionality of the vehicle under 3D model adding option

@When("User have to click the vehicle setup option")
public void user_have_to_click_the_vehicle_setup_option() throws InterruptedException {
	String url = driver.getCurrentUrl();
	System.out.println(url);
    boolean equals = url.equals("https://testphp.digitaltrains.online/vehicles");
    wait1Seconds();
    elementClick(o.getVehicleeditsetupoption());
    wait1Seconds();
	
	
}

@When("User have to click the vehicle three D model option")
public void user_have_to_click_the_vehicle_three_D_model_option() throws InterruptedException {
    String text = o.getVehicleeditshadowtab().getText();
    System.out.println(text);
    boolean contains = text.contains("Vehicle Setup");
	Assert.assertTrue("Check after click the vehicle edit it show the vehicle edit shadow tab",contains);
	wait5seconds();
//	elementClick(o.getVehiclecustomthreeDmodulebox());
//	waitAndClickElement("(//span[@class=\"select2-selection__rendered\"])[2]");
	elementClick(o.getVehiclecustomthreeDmodulebox());
	wait1Seconds();
    elementClick(o.getVehiclecutomvehiclebody());
	wait1Seconds();
	
}

@When("User have to select the three D model and save the vehicle")
public void user_have_to_select_the_three_D_model_and_save_the_vehicle() throws InterruptedException {
    
	elementClick(o.getVehicleeditsavebutton());
	wait5seconds();
	
	
}

@When("User have to deselect the three D model and save the vehicle")
public void user_have_to_deselect_the_three_D_model_and_save_the_vehicle() throws InterruptedException {
	String text = o.getVehicleeditshadowtab().getText();
    System.out.println(text);
    boolean contains = text.contains("Vehicle Setup");
	 Assert.assertTrue("Check after click the vehicle edit it show the vehicle edit shadow tab",contains);
	 wait1Seconds();
	 elementClick(o.getVehiclecustomvehiclebodybox());
	 wait1Seconds();
	 elementClick(o.getVehicleselectnocustommodel());
	 wait1Seconds();
	 elementClick(o.getVehicleeditsavebutton());
	 wait1Seconds();
}



// Check the functionality of the route profile 3D model adding option

@When("User have to mouseover the tunneladded reverse cure route profile and click the action")
public void user_have_to_mouseover_the_tunneladded_reverse_cure_route_profile_and_click_the_action() throws InterruptedException {
    
	mouseOverAction(o.getReversecurverouteprofile());
	wait1Seconds();
	elementClick(o.getReversecurveactionbutton());
	wait1Seconds();
}

@When("User have to click the tunneladded reverse cure route profile edit button")
public void user_have_to_click_the_tunneladded_reverse_cure_route_profile_edit_button() throws InterruptedException {
    elementClick(o.getReversecurveeditbutton());
	wait5seconds();
	
	
}

@When("User have to click the three D model route profile option")
public void user_have_to_click_the_three_D_model_route_profile_option() throws InterruptedException {
    
	elementClick(o.getReversecurve3Dmodeloption());
	wait1Seconds();
	elementClick(o.getReversecurve3Dmodelbox());
	wait1Seconds();
	
}

@When("User have to select the three D model in the route profile and save")
public void user_have_to_select_the_three_D_model_in_the_route_profile_and_save() throws InterruptedException {
    
//	elementClick(o.get);
	wait1Seconds();
	elementClick(o.getReversecurvesavebutton());
	wait5seconds();
	
	
}

@When("User have to deselect the three D model in the route profile and save")
public void user_have_to_deselect_the_three_D_model_in_the_route_profile_and_save() throws InterruptedException {
    
	mouseOverAction(o.getReversecurverouteprofile());
	wait1Seconds();
	elementClick(o.getReversecurveactionbutton());
	wait1Seconds();
	elementClick(o.getReversecurveeditbutton());
	wait5seconds();
	elementClick(o.getReversecurve3Dmodeloption());
	wait1Seconds();
	elementClick(o.getReversecurve3Dmodelbox());
	wait1Seconds();
	elementClick(o.getReversecurvenocustommodelselected());
	wait1Seconds();
	elementClick(o.getReversecurvesavebutton());
	wait5seconds();
	
}


//Check the option of the pivot assembly of linear and shear out selected or not  


@When("User have to click the auto coupler option and select the public libray box generic type")
public void user_have_to_click_the_auto_coupler_option_and_select_the_public_libray_box_generic_type()throws InterruptedException {
//    elementClick(o.getPivotmodule());
//    wait1Seconds();
//    elementClick(o.getPivotchoosefromlibrary());
	String text = o.getPivotshadowtab().getText();
    System.out.println(text);
    boolean contains = text.contains("Pivot Library");
    Assert.assertTrue("After click the pivot choose from library", contains);
	elementClick(o.getCouplertypebox());
	wait1Seconds();
	elementClick(o.getCouplertypeautocoupler());
	wait1Seconds();
	elementClick(o.getPivottypebox());
	elementClick(o.getPivottyperubberdonuts());
	wait1Seconds();
	elementClick(o.getPubliclibraryinpivot());
	wait1Seconds();
	elementClick(o.getPubliclibrarygenericautorubberdonut());
	
}

@When("User have to click select pivot assembly template option")
public void user_have_to_click_select_pivot_assembly_template_option()throws InterruptedException {
    elementClick(o.getPivotselecttemplate());
    wait1Seconds();
	
}

@When("User have to click the pivot assambly linear option and select the personal library donut option")
public void user_have_to_click_the_pivot_assambly_linear_option_and_select_the_personal_library_donut_option()throws InterruptedException {
    elementClick(o.getPivotlinearoption());
    wait1Seconds();
    elementClick(o.getPivotlinearchoosefromlibrary());
    wait1Seconds();
    elementClick(o.getPivotlinearpubliclibrary());
    wait1Seconds();
    elementClick(o.getPivotlinearEFGtype());
    wait1Seconds();
    elementClick(o.getPivotlinearselecttemplate());
    wait1Seconds();
    elementClick(o.getPivotlinearattach());
    wait1Seconds();
	
}

@When("User have to click the sharout option and select personal library vanday barath select template")
public void user_have_to_click_the_sharout_option_and_select_personal_library_vanday_barath_select_template()throws InterruptedException {
    elementClick(o.getPivotshearoutoption());
    wait1Seconds();
    elementClick(o.getPivotshearoutchoosefromlibrary());
    wait1Seconds();
    elementClick(o.getPivotshearoutpubliclibrary());
    wait1Seconds();
    elementClick(o.getPivotshearoutpubliclibraryoleodhearout());
    wait1Seconds();
    elementClick(o.getPivotshearoutselecttemplate());
    wait1Seconds();
    elementClick(o.getPivotshearoutattach());
    wait5seconds();
}

@When("User have to fill the pivot assambly name and save button")
public void user_have_to_fill_the_pivot_assambly_name_and_save_button()throws InterruptedException {
    elementClick(o.getPivotsavebutton());
    wait5seconds();
	
}

@When("User have to mouseover the vanday barath pivot and click the action button and click the review option")
public void user_have_to_mouseover_the_vanday_barath_pivot_and_click_the_action_button_and_click_the_review_option() throws InterruptedException {
    
	mouseOverAction(o.getGenericautorubberdonut());
	wait1Seconds();
	elementClick(o.getPivotactionbutton());
	wait1Seconds();
	elementClick(o.getPivotviewdetails());
}

@When("User have to check the linear and shearout selected or not")
public void user_have_to_check_the_linear_and_shearout_selected_or_not() {
   
    List<WebElement> findelement = driver.findElements(By.xpath("(//div[@class=\"modal-content modal-content-shadow\"])[14]"));
    System.out.println(findelement);
    if (findelement.contains("(//button[@class=\"btn jqSubDeviceButton btn-primary\"])[1]")) {
		 
    	System.out.println("-----The pivot assambly after save to view again it showing the linear option not selected-----");
    	
	} else {
        System.out.println("-----The pivot assambly after save to view again it showing the linear option selected-----");
	}
    if (findelement.contains("(//button[@class=\"btn jqSubDeviceButton btn-primary\"])[1]")) {
		 
    	System.out.println("-----The pivot assambly after save to view again it showing the shearout option not selected-----");
    	
	} else {
        System.out.println("-----The pivot assambly after save to view again it showing the shearout option selected-----");
	}
    
}



//Checking the coupler assembly deformation data are missing or not

@When("User have to click the coupler assembly deformation option")
public void user_have_to_click_the_coupler_assembly_deformation_option() throws InterruptedException {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	boolean contains = currentUrl.contains("devices");
	Assert.assertTrue("Check the url is correct or not", contains);
    elementClick(o.getCouplerassemblydeformation());
    wait1Seconds();
}

@When("User have to fill the coupler assembly deformation device name and datas")
public void user_have_to_fill_the_coupler_assembly_deformation_device_name_and_datas() throws InterruptedException {
    String text = o.getCouplerassemblydeformationshadowtab().getText();
    System.out.println(text);
    boolean contains = text.contains("Coupler Assembly Deformation");
    Assert.assertTrue("Check the correct device shadow tab open or not", contains);
	sendKeys(o.getCouplerassemblydeforamtionname(),"600KNCoupler");
	wait1Seconds();
	elementClick(o.getCouplerassemblydeformationplusbutton());
	wait1Seconds();
	sendKeys(o.getCouplerassemblydeformationforceone(),"0");
	wait1Seconds();
	sendKeys(o.getCouplerassemblydeformationforcetwo(),"150");
	wait1Seconds();
	sendKeys(o.getCouplerassemblydeformationforcethree(),"500");
	wait1Seconds();
	sendKeys(o.getCouplerassemblydeformationstroketwo(),"20");
	wait1Seconds();
	sendKeys(o.getCouplerassemblydeformationstrokethree(),"50");
	wait1Seconds();
	
}

@When("User have to click the coupler assembly deformation save button")
public void user_have_to_click_the_coupler_assembly_deformation_save_button() throws InterruptedException {
    elementClick(o.getCouplerassemblydeformationsavebutton());
    Thread.sleep(4000);
	
}

@When("User have to reopen the coupler assembly deformation device")
public void user_have_to_reopen_the_coupler_assembly_deformation_device() throws InterruptedException {
    mouseOverAction(o.getCouplerassemblydeformation600kncoupler());
    wait1Seconds();
    elementClick(o.getCouplerassemblydeformationactionbutton());
    wait1Seconds();
    elementClick(o.getCouplerassemblydeformationviewdeviceoption());
    Thread.sleep(3000);
    
	
}

@When("User have to check the coupler assembly deformation data")
public void user_have_to_check_the_coupler_assembly_deformation_data() throws InterruptedException {
    try {
    	String text = o.getCouplerassemblydeformationshadowtab().getText();
        System.out.println(text);
        if (text.contains("50")) {
			System.out.println("-----Check the device after reopen the data is contain the stroke 50-----");
		} else {
			System.out.println("-----Check the device after reopen the data is not contain the stroke 50-----");
		}
	} catch (Exception e) {
	
		o.getCouplerassemblydeformationstrokethree().clear();
		wait1Seconds();
		closeTab();
	}
    
	
}






}



