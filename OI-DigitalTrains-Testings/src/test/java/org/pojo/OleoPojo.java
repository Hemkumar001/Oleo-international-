package org.pojo;

import org.baseclass.OleoBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class OleoPojo extends OleoBaseClass {
	// constructor

	public OleoPojo() {
		PageFactory.initElements(driver,this);

	}
	// Login page locater

	@FindBy(xpath = "(//input[@id=\"modal-login-email\"])[2]")
	private WebElement Loginusername;
	@FindBy(xpath = "(//input[@id=\"modal-login-password\"])[2]")
	private WebElement Loginpassword;
	@FindBy(xpath = "(//input[@id=\"remember\"])[2]")
	private WebElement Loginrmember;
	@FindBy(xpath = "(//input[@class=\"button\"])[4]")
	private WebElement Loginsubmit;
	@FindBy(xpath = "(//a[text()='Forgotten Password?'])[2]")
	private WebElement Loginforgottenpassword;
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement Loginsignup;
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement Logintopregister;
	
	


	public WebElement getLoginusername() {
		return Loginusername;
	}

	public WebElement getLoginpassword() {
		return Loginpassword;
	}

	public WebElement getLoginrmember() {
		return Loginrmember;
	}

	public WebElement getLoginsubmit() {
		return Loginsubmit;
	}

	public WebElement getLoginforgottenpassword() {
		return Loginforgottenpassword;
	}

	public WebElement getLoginsignup() {
		return Loginsignup;
	}

	public WebElement getLogintopregister() {
		return Logintopregister;
	}

	// Forgotten password locater

	@FindBy(xpath = "(//a[text()='Forgotten Password?'])[2]")
	private WebElement Forgottenpassword;
	@FindBy(xpath = "//input[@id=\"forgot-pass-email\"]")
	private WebElement Forgottenpasswordemailbox;
	@FindBy(xpath = "//a[text()='Back to login']")
	private WebElement Forgottenpasswordbacktologin;
	@FindBy(xpath = "//input[@class=\"btn btn-primary\"]")
	private WebElement Forgottenpaswordsubmit;
	@FindBy(xpath = "//p[text()='A password reset link has been sent, please check your mailbox.']")
	private WebElement Forgottenmsg;

	public WebElement getForgottenpassword() {
		return Forgottenpassword;
	}

	public WebElement getForgottenpasswordemailbox() {
		return Forgottenpasswordemailbox;
	}

	public WebElement getForgottenpasswordbacktologin() {
		return Forgottenpasswordbacktologin;
	}

	public WebElement getForgottenpaswordsubmit() {
		return Forgottenpaswordsubmit;
	}

	public WebElement getForgottenmsg() {
		return Forgottenmsg;
	}
	
	//Register login page option locater
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement Registersignupbutton;
	@FindBy(xpath = "(//a[text()='View Plans'])[2]")
	private WebElement Registerviewplanoption;
	@FindBy(xpath = "//label[@class=\"btn btn-primary btn-md jqMonthSelect active\"]")
	private WebElement Registermonthlyoption;
	@FindBy(xpath = "//label[@class=\"btn btn-primary btn-md jqYearSelect \"]")
	private WebElement Registeryearlyoption;
	@FindBy(xpath = "//a[text()='Proceed to Next Step']")
	private WebElement Registerproceedtonextstepbutton;
	@FindBy(xpath = "//input[@name=\"account_name\"]")
	private WebElement Registercompanyname;
	@FindBy(xpath = "//input[@name=\"company_registration_no\"]")
	private WebElement Registercompanyregisternumber;
	@FindBy(xpath = "//input[@name=\"registered_address_line_1\"]")
	private WebElement Registeraddone;
	@FindBy(xpath = "//input[@name=\"registered_address_line_2\"]")
	private WebElement Registeraddtwo;
	@FindBy(xpath = "//input[@name=\"registered_address_line_3\"]")
	private WebElement Registeraddthree;
	@FindBy(xpath = "//input[@name=\"registered_town_city\"]")
	private WebElement Registercity;
	@FindBy(xpath = "//input[@name=\"registered_county_state\"]")
	private WebElement Registerstate;
	@FindBy(xpath = "//input[@name=\"registered_postcode_zipcode\"]")
	private WebElement Registerzipcode;
	@FindBy(xpath = "//input[@name=\"user_details[0][first_name]\"]")
	private WebElement Registerfirstname;
	@FindBy(xpath = "//input[@name=\"user_details[0][last_name]\"]")
	private WebElement Registerlastname;
	@FindBy(xpath = "//input[@name=\"user_details[0][email]\"]")
	private WebElement Registeremail;
	@FindBy(xpath = "//input[@name=\"user_details[0][phone]\"]")
	private WebElement Registerphonenumber;
	@FindBy(xpath = "(//input[@class=\"form-control w-100\"])[20]")
	private WebElement Registerjobtitle;
	@FindBy(xpath = "//input[@name=\"user_details[0][password]\"]")
	private WebElement Registerpassword;
	@FindBy(xpath = "//input[@name=\"user_details[0][repeat_password]\"]")
	private WebElement Registerreenterpassword;
	@FindBy(xpath = "//input[@name=\"user_details[0][first_name]\"]")
	private WebElement Registersignature;
	@FindBy(xpath = "//input[@id=\"terms_accepted\"]")
	private WebElement Registeragreethetermsandcondition;
	@FindBy(xpath = "//select[@name=\"user_details[0][plan]\"]")
	private WebElement Registerselectyourplanbox;
	@FindBy(xpath = "//option[text()='DigitalTrains Impact - Viewer Plus']")
	private WebElement Registerdigitaltrainsimpactviewerplusoption;
	@FindBy(xpath = "//button[@name=\"submit\"]")
	private WebElement Registerproceedtopaymentbutton;
	@FindBy(xpath = "//input[@id=\"Field-numberInput\"]")
	private WebElement Registercardnumber;
	@FindBy(xpath = "//input[@placeholder=\"MM / YY\"]")
	private WebElement Registerexpirydate;
	@FindBy(xpath = "//input[@placeholder=\"CVC\"]")
	private WebElement Registercvcnumber;
	@FindBy(xpath = "//span[text()='Pay now']")
	private WebElement Registerpaynowbutton;
	@FindBy(xpath = "//select[@name=\"registered_country\"]")
	private WebElement Registercountrybox;
	@FindBy(xpath = "(//option[@value=\"IND\"])[1]")
	private WebElement Registerindia;
	@FindBy(xpath = "(//label[text()='Select feature'])[1]")
	private WebElement Registerselectimpacttest;
	@FindBy(xpath = "(//a[text()='Add to Order'])[4]")
	private WebElement Registerselectviewpluse;
	@FindBy(xpath = "//iframe[@title=\"Secure payment input frame\"]")
	private WebElement Registerswitchtoframe;
	
	
	

	public WebElement getRegisterselectyourplanbox() {
		return Registerselectyourplanbox;
	}

	public WebElement getRegisterdigitaltrainsimpactviewerplusoption() {
		return Registerdigitaltrainsimpactviewerplusoption;
	}

	public WebElement getRegisterviewplanoption() {
		return Registerviewplanoption;
	}

	public WebElement getRegisterswitchtoframe() {
		return Registerswitchtoframe;
	}

	public WebElement getRegisterselectimpacttest() {
		return Registerselectimpacttest;
	}

	public WebElement getRegisterselectviewpluse() {
		return Registerselectviewpluse;
	}

	public WebElement getRegistercountrybox() {
		return Registercountrybox;
	}

	public WebElement getRegisterindia() {
		return Registerindia;
	}

	public WebElement getRegistersignupbutton() {
		return Registersignupbutton;
	}

	public WebElement getRegistermonthlyoption() {
		return Registermonthlyoption;
	}

	public WebElement getRegisteryearlyoption() {
		return Registeryearlyoption;
	}

	public WebElement getRegisterproceedtonextstepbutton() {
		return Registerproceedtonextstepbutton;
	}

	public WebElement getRegistercompanyname() {
		return Registercompanyname;
	}

	public WebElement getRegistercompanyregisternumber() {
		return Registercompanyregisternumber;
	}

	public WebElement getRegisteraddone() {
		return Registeraddone;
	}

	public WebElement getRegisteraddtwo() {
		return Registeraddtwo;
	}

	public WebElement getRegisteraddthree() {
		return Registeraddthree;
	}

	public WebElement getRegistercity() {
		return Registercity;
	}

	public WebElement getRegisterstate() {
		return Registerstate;
	}

	public WebElement getRegisterzipcode() {
		return Registerzipcode;
	}

	public WebElement getRegisterfirstname() {
		return Registerfirstname;
	}

	public WebElement getRegisterlastname() {
		return Registerlastname;
	}

	public WebElement getRegisteremail() {
		return Registeremail;
	}

	public WebElement getRegisterphonenumber() {
		return Registerphonenumber;
	}

	public WebElement getRegisterjobtitle() {
		return Registerjobtitle;
	}

	public WebElement getRegisterpassword() {
		return Registerpassword;
	}

	public WebElement getRegisterreenterpassword() {
		return Registerreenterpassword;
	}

	public WebElement getRegistersignature() {
		return Registersignature;
	}

	public WebElement getRegisteragreethetermsandcondition() {
		return Registeragreethetermsandcondition;
	}

	public WebElement getRegisterproceedtopaymentbutton() {
		return Registerproceedtopaymentbutton;
	}

	public WebElement getRegistercardnumber() {
		return Registercardnumber;
	}

	public WebElement getRegisterexpirydate() {
		return Registerexpirydate;
	}

	public WebElement getRegistercvcnumber() {
		return Registercvcnumber;
	}

	public WebElement getRegisterpaynowbutton() {
		return Registerpaynowbutton;
	}

	
	// Digital Trains Page locators

    @FindBy(xpath = "//a[text()='DigitalTrains™ Website							']")
    private WebElement Digitaltrainsaboutlink;
	@FindBy(xpath = "//a[text()='About']")
	private WebElement Digitaltrainsaboutbutton;
	@FindBy(xpath = "(//a[text()='Features'])[1]")
	private WebElement Digitaltrainsfeatures1;
	@FindBy(xpath = "(//a[text()='Features'])[2]")
	private WebElement Digitaltrainsfeatures2;
	@FindBy(xpath = "//a[text()='Contact']")
	private WebElement Digitaltrainscontactbutton;
	@FindBy(xpath = "(//a[text()='Get In Touch'])[1]")
	private WebElement Digitaltrainsgetintouchbutton;
	@FindBy(xpath = "//a[text()='Subscribe']")
	private WebElement Digitaltarinssubscribebutton;
	@FindBy(xpath = "(//a[text()='Get In Touch'])[2]")
	private WebElement Trainrunninggetintouch;
	@FindBy(xpath = "(//a[text()='Get In Touch'])[3]")
	private WebElement Crashenergymanagmentgetintouch;
	@FindBy(xpath = "(//a[text()='Get In Touch'])[4]")
	private WebElement Bufferstopsgetintouch;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement Digitaltrainsloginbutton;
	@FindBy(name = "your-name")
	private WebElement Contactyourname;
	@FindBy(name = "email")
	private WebElement Contactemail;
	@FindBy(name = "phone")
	private WebElement Contactphonenumber;
	@FindBy(name = "query")
	private WebElement Contactreasonforcontacting;
	@FindBy(name = "message")
	private WebElement Contactmessage;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement Contactsubmit;
	@FindBy(className = "fab fa-youtube-square")
	private WebElement Digitaltrainsyoutubebutton;
	@FindBy(className = "navbar-toggler-icon")
	private WebElement Digitaltrainsmenubar;
	@FindBy(xpath = "//a[text()='Read The Getting Started Guide']")
	private WebElement Digitaltrainsreadthegettingstartedguide;
	@FindBy(xpath = "(//a[text()='Homepage'])[1]")
	private WebElement Digitaltrainsreadthegettingstartedguidehomepage;

	
	
	public WebElement getDigitaltrainsaboutlink() {
		return Digitaltrainsaboutlink;
	}

	public WebElement getDigitaltrainsreadthegettingstartedguidehomepage() {
		return Digitaltrainsreadthegettingstartedguidehomepage;
	}

	public WebElement getDigitaltrainsreadthegettingstartedguide() {
		return Digitaltrainsreadthegettingstartedguide;
	}

	public WebElement getDigitaltrainsaboutbutton() {
		return Digitaltrainsaboutbutton;
	}

	public WebElement getDigitaltrainsfeatures1() {
		return Digitaltrainsfeatures1;
	}

	public WebElement getDigitaltrainsfeatures2() {
		return Digitaltrainsfeatures2;
	}

	public WebElement getDigitaltrainscontactbutton() {
		return Digitaltrainscontactbutton;
	}

	public WebElement getDigitaltrainsgetintouchbutton() {
		return Digitaltrainsgetintouchbutton;
	}

	public WebElement getDigitaltarinssubscribebutton() {
		return Digitaltarinssubscribebutton;
	}

	public WebElement getTrainrunninggetintouch() {
		return Trainrunninggetintouch;
	}

	public WebElement getCrashenergymanagmentgetintouch() {
		return Crashenergymanagmentgetintouch;
	}

	public WebElement getBufferstopsgetintouch() {
		return Bufferstopsgetintouch;
	}

	public WebElement getDigitaltrainsloginbutton() {
		return Digitaltrainsloginbutton;
	}

	public WebElement getContactyourname() {
		return Contactyourname;
	}

	public WebElement getContactemail() {
		return Contactemail;
	}

	public WebElement getContactphonenumber() {
		return Contactphonenumber;
	}

	public WebElement getContactreasonforcontacting() {
		return Contactreasonforcontacting;
	}

	public WebElement getContactmessage() {
		return Contactmessage;
	}

	public WebElement getContactsubmit() {
		return Contactsubmit;
	}

	public WebElement getDigitaltrainsyoutubebutton() {
		return Digitaltrainsyoutubebutton;
	}

	public WebElement getDigitaltrainsmenubar() {
		return Digitaltrainsmenubar;
	}

	// Digital trains support page locators

	@FindBy(xpath = "(//a[text()='Homepage'])[1]")
	private WebElement Digitaltarinssupporttophomepagebutton;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement Digitaltrainssupportloginbutton;
	@FindBy(xpath = "(//a[text()='Contact Us'])[1]")
	private WebElement Digitaltrainssupporttopcontactbutton;
	@FindBy(xpath = "//a[text()='Get Started']")
	private WebElement Digitaltrainssupportgetstarted;
	@FindBy(xpath = "//a[text()='Devices']")
	private WebElement Digitaltrainssupportdevices;
	@FindBy(xpath = "//a[text()='Interfaces']")
	private WebElement Digitaltrainssupportinterface;
	@FindBy(xpath = "//a[text()='Buffer Stops']")
	private WebElement Digitaltarainssupportbufferstop;
	@FindBy(xpath = "//a[text()='Vehicles']")
	private WebElement Digitaltrainssupportvehicles;
	@FindBy(xpath = "//a[text()='Trains']")
	private WebElement Digitaltrainssupporttrains;
	@FindBy(xpath = "//a[text()='Getting Started']")
	private WebElement Digitaltrainssupportgettingstarted;
	@FindBy(xpath = "//a[text()='Create Train Impact Simulation']")
	private WebElement Digitaltrainssupportcreatetrainimpactsimulation;
	@FindBy(xpath = "//a[text()='Create Buffer Stop Impact Simulation']")
	private WebElement Digitaltrainssupportcreatebufferstopimpactsimulation;
	@FindBy(xpath = "//a[text()='DigitalTrains']")
	private WebElement Digitaltarinssupportdigitaltrainsbutton;
	@FindBy(xpath = "(//a[text()='Homepage'])[2]")
	private WebElement Digitaltarinssupportdownhomepagebutton;
	@FindBy(xpath = "(//a[text()='Contact Us'])[2]")
	private WebElement Digitaltrainssupportdowncontactbutton;
	@FindBy(xpath = "//a[text()='Help							']")
	private WebElement Digitaltrainssupporthelpbutton;
	@FindBy(id = "search_input_react")
	private WebElement Digitaltrainssupportsearchbox;
	@FindBy(id = "back-to-top")
	private WebElement Digitaltrainssupportbacktotop;
	@FindBy(xpath = "//img[@src='/img/oleo.png']")
	private WebElement Digitaltrainssupportdigitaltrainsbutton;

	public WebElement getDigitaltarinssupporttophomepagebutton() {
		return Digitaltarinssupporttophomepagebutton;
	}

	public WebElement getDigitaltrainssupportloginbutton() {
		return Digitaltrainssupportloginbutton;
	}

	public WebElement getDigitaltrainssupporttopcontactbutton() {
		return Digitaltrainssupporttopcontactbutton;
	}

	public WebElement getDigitaltrainssupportgetstarted() {
		return Digitaltrainssupportgetstarted;
	}

	public WebElement getDigitaltrainssupportdevices() {
		return Digitaltrainssupportdevices;
	}

	public WebElement getDigitaltrainssupportinterface() {
		return Digitaltrainssupportinterface;
	}

	public WebElement getDigitaltarainssupportbufferstop() {
		return Digitaltarainssupportbufferstop;
	}

	public WebElement getDigitaltrainssupportvehicles() {
		return Digitaltrainssupportvehicles;
	}

	public WebElement getDigitaltrainssupporttrains() {
		return Digitaltrainssupporttrains;
	}

	public WebElement getDigitaltrainssupportgettingstarted() {
		return Digitaltrainssupportgettingstarted;
	}

	public WebElement getDigitaltrainssupportcreatetrainimpactsimulation() {
		return Digitaltrainssupportcreatetrainimpactsimulation;
	}

	public WebElement getDigitaltrainssupportcreatebufferstopimpactsimulation() {
		return Digitaltrainssupportcreatebufferstopimpactsimulation;
	}

	public WebElement getDigitaltarinssupportdigitaltrainsbutton() {
		return Digitaltarinssupportdigitaltrainsbutton;
	}

	public WebElement getDigitaltarinssupportdownhomepagebutton() {
		return Digitaltarinssupportdownhomepagebutton;
	}

	public WebElement getDigitaltrainssupportdowncontactbutton() {
		return Digitaltrainssupportdowncontactbutton;
	}

	public WebElement getDigitaltrainssupporthelpbutton() {
		return Digitaltrainssupporthelpbutton;
	}

	public WebElement getDigitaltrainssupportsearchbox() {
		return Digitaltrainssupportsearchbox;
	}

	public WebElement getDigitaltrainssupportbacktotop() {
		return Digitaltrainssupportbacktotop;
	}

	public WebElement getDigitaltrainssupportdigitaltrainsbutton() {
		return Digitaltrainssupportdigitaltrainsbutton;
	}

	public WebElement getDigitaltrainsprojects() {
		return Digitaltrainsprojects;
	}

	/// Digital trains support locater(New)

	@FindBy(xpath = "(//a[text()='Home'])[1]")
	private WebElement Digitaltrainsupporthomeoption;
	@FindBy(xpath = "(//a[text()='Home'])[2]")
	private WebElement Digitaltrainsupporthomeoptiondown;
	@FindBy(xpath = "(//a[text()='DigitalTrains Login'])[1]")
	private WebElement Digitaltrainsupportlogin;
	@FindBy(xpath = "(//a[text()='Contact Us'])[1]")
	private WebElement Digitaltrainsupportcontact;
	@FindBy(xpath = "(//a[text()='Contact Us'])[2]")
	private WebElement Digitaltrainsupportcontactdown;
	@FindBy(xpath = "(//a[text()='Getting Started'])[1]")
	private WebElement Digitaltrainsupportgettingstarted;
	@FindBy(xpath = "(//a[text()='Getting Started'])[2]")
	private WebElement Digitaltrainsupportgettingstarteddown;
	@FindBy(xpath = "(//a[text()='Devices Library'])[1]")
	private WebElement Digitaltrainsupportdevicelibrary;
	@FindBy(xpath = "(//a[text()='Devices Library'])[2]")
	private WebElement Digitaltrainsupportdevicelibrarydown;
	@FindBy(xpath = "(//a[text()='Interfaces Library'])[1]")
	private WebElement Digitaltrainsupportinterfaceslibrary;
	@FindBy(xpath = "(//a[text()='Interfaces Library'])[2]")
	private WebElement Digitaltrainsupportinterfaceslibrarydown;
	@FindBy(xpath = "(//a[text()='Buffer Stops Library'])[1]")
	private WebElement Digitaltrainsupportbufferstoplibrary;
	@FindBy(xpath = "(//a[text()='Buffer Stops Library'])[2]")
	private WebElement Digitaltrainsupportbufferstoplibrarydown;
	@FindBy(xpath = "(//a[text()='Vehicles Library'])[1]")
	private WebElement Digitaltrainsupportvehicleslibrary;
	@FindBy(xpath = "(//a[text()='Vehicles Library'])[2]")
	private WebElement Digitaltrainsupportvehicleslibrarydown;
	@FindBy(xpath = "(//a[text()='Trains Library'])[1]")
	private WebElement Digitaltrainsupporttrainslibrary;
	@FindBy(xpath = "(//a[text()='Trains Library'])[2]")
	private WebElement Digitaltrainsupporttrainslibrarydown;
	@FindBy(xpath = "//a[text()='DigitalTrains™']")
	private WebElement Digitaltrainsupportdigitaltrainsbutton;
	@FindBy(xpath = "//input[@class=\"search-field\"]")
	private WebElement Digitaltrainsupportsearchbutton;
	@FindBy(xpath = "//span[text()='Search for:']")
	private WebElement Digitaltrainsupportsearchlogo;

	public WebElement getDigitaltrainsupportsearchlogo() {
		return Digitaltrainsupportsearchlogo;
	}

	public WebElement getDigitaltrainsupportsearchbutton() {
		return Digitaltrainsupportsearchbutton;
	}

	public WebElement getDigitaltrainsupporthomeoption() {
		return Digitaltrainsupporthomeoption;
	}

	public WebElement getDigitaltrainsupporthomeoptiondown() {
		return Digitaltrainsupporthomeoptiondown;
	}

	public WebElement getDigitaltrainsupportlogin() {
		return Digitaltrainsupportlogin;
	}

	public WebElement getDigitaltrainsupportcontact() {
		return Digitaltrainsupportcontact;
	}

	public WebElement getDigitaltrainsupportcontactdown() {
		return Digitaltrainsupportcontactdown;
	}

	public WebElement getDigitaltrainsupportgettingstarted() {
		return Digitaltrainsupportgettingstarted;
	}

	public WebElement getDigitaltrainsupportgettingstarteddown() {
		return Digitaltrainsupportgettingstarteddown;
	}

	public WebElement getDigitaltrainsupportdevicelibrary() {
		return Digitaltrainsupportdevicelibrary;
	}

	public WebElement getDigitaltrainsupportdevicelibrarydown() {
		return Digitaltrainsupportdevicelibrarydown;
	}

	public WebElement getDigitaltrainsupportinterfaceslibrary() {
		return Digitaltrainsupportinterfaceslibrary;
	}

	public WebElement getDigitaltrainsupportinterfaceslibrarydown() {
		return Digitaltrainsupportinterfaceslibrarydown;
	}

	public WebElement getDigitaltrainsupportbufferstoplibrary() {
		return Digitaltrainsupportbufferstoplibrary;
	}

	public WebElement getDigitaltrainsupportbufferstoplibrarydown() {
		return Digitaltrainsupportbufferstoplibrarydown;
	}

	public WebElement getDigitaltrainsupportvehicleslibrary() {
		return Digitaltrainsupportvehicleslibrary;
	}

	public WebElement getDigitaltrainsupportvehicleslibrarydown() {
		return Digitaltrainsupportvehicleslibrarydown;
	}

	public WebElement getDigitaltrainsupporttrainslibrary() {
		return Digitaltrainsupporttrainslibrary;
	}

	public WebElement getDigitaltrainsupporttrainslibrarydown() {
		return Digitaltrainsupporttrainslibrarydown;
	}

	public WebElement getDigitaltrainsupportdigitaltrainsbutton() {
		return Digitaltrainsupportdigitaltrainsbutton;
	}

	// Digital trains main menu locater

	@FindBy(xpath = "//a[text()='Projects']")
	private WebElement Digitaltrainsprojects;
	@FindBy(xpath = "//a[text()='Trains']")
	private WebElement Digitaltrainstrins;
	@FindBy(xpath = "//a[text()='Vehicles']")
	private WebElement Digitaltrainsvehicles;
	@FindBy(xpath = "//a[text()='Wheels/Rails']")
	private WebElement Digitaltrainswheelsrails;
	@FindBy(xpath = "//a[text()='Bogies']")
	private WebElement Digitaltrainsbogies;
	@FindBy(xpath = "//a[text()='Gauges']")
	private WebElement Digitaltrainsgauges;
	@FindBy(xpath = "//a[text()='Route Profiles']")
	private WebElement Digitaltrainsrouteprofiles;
	@FindBy(xpath = "//a[text()='Buffer Stops']")
	private WebElement Digitaltrainsbufferstop;
	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement Digitaltrainsdashboard;
	@FindBy(xpath = "//a[text()='Coupling Interfaces']")
	private WebElement Digitaltrainscouplinginterfaces;
	@FindBy(xpath = "//a[text()='Devices']")
	private WebElement Digitaltrainsdevices;
	@FindBy(xpath = "//a[text()='Shared Library']")
	private WebElement Digitaltrainssharedlibrary;
	@FindBy(xpath = "(//a[@class=\" mr-4\"])[2]")
	private WebElement Digitaltrainsservices;
	@FindBy(xpath = "//a[text()='Profiles']")
	private WebElement Wheelsrailprofiles;
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement Wheelsrailscontacts;
	@FindBy(xpath = "(//a[@class=\" mr-4\"])[2]")
	private WebElement Digitaltrainsmenuhelp;
	@FindBy(xpath = "(//button[@type=\"button\"])[1]")
	private WebElement Digitaltrainscreatesimulation;
	@FindBy(xpath = "(//button[@type=\"button\"])[2]")
	private WebElement Digitaltrainscreateproject;
	@FindBy(id = "projects_search")
	private WebElement Digitaltrainssearch;
	@FindBy(xpath = "//input[@id=\"date-filter-from-projects-input\"]")
	private WebElement Digitaltrainsdatefrom;
	@FindBy(id = "date-filter-to-projects-input")
	private WebElement Digitaltrainsdateto;
	@FindBy(id = "filter-sort-select")
	private WebElement Digitaltrainssort;
	@FindBy(id = "filter-sort-direction-select")
	private WebElement Digitaltrainssortdirection;
	@FindBy(xpath = "//a[text()='Assemblies']")
	private WebElement Bogiesassemblies;
	@FindBy(xpath = "//a[text()='Parts']")
	private WebElement Bogiesparts;

	public WebElement getBogiesassemblies() {
		return Bogiesassemblies;
	}

	public WebElement getBogiesparts() {
		return Bogiesparts;
	}

	public WebElement getDigitaltrainstrins() {
		return Digitaltrainstrins;
	}

	public WebElement getDigitaltrainsvehicles() {
		return Digitaltrainsvehicles;
	}

	public WebElement getDigitaltrainswheelsrails() {
		return Digitaltrainswheelsrails;
	}

	public WebElement getDigitaltrainsbogies() {
		return Digitaltrainsbogies;
	}

	public WebElement getDigitaltrainsgauges() {
		return Digitaltrainsgauges;
	}

	public WebElement getDigitaltrainsrouteprofiles() {
		return Digitaltrainsrouteprofiles;
	}

	public WebElement getDigitaltrainsbufferstop() {
		return Digitaltrainsbufferstop;
	}

	public WebElement getDigitaltrainsdashboard() {
		return Digitaltrainsdashboard;
	}

	public WebElement getDigitaltrainscouplinginterfaces() {
		return Digitaltrainscouplinginterfaces;
	}

	public WebElement getDigitaltrainsdevices() {
		return Digitaltrainsdevices;
	}

	public WebElement getDigitaltrainssharedlibrary() {
		return Digitaltrainssharedlibrary;
	}

	public WebElement getDigitaltrainsservices() {
		return Digitaltrainsservices;
	}

	public WebElement getDigitaltrainscreatesimulation() {
		return Digitaltrainscreatesimulation;
	}

	public WebElement getDigitaltrainscreateproject() {
		return Digitaltrainscreateproject;
	}

	public WebElement getDigitaltrainssearch() {
		return Digitaltrainssearch;
	}

	public WebElement getDigitaltrainsdatefrom() {
		return Digitaltrainsdatefrom;
	}

	public WebElement getDigitaltrainsdateto() {
		return Digitaltrainsdateto;
	}

	public WebElement getDigitaltrainssort() {
		return Digitaltrainssort;
	}

	public WebElement getDigitaltrainssortdirection() {
		return Digitaltrainssortdirection;
	}

	public WebElement getDigitaltrainsmenuhelp() {
		return Digitaltrainsmenuhelp;
	}

	public WebElement getWheelsrailprofiles() {
		return Wheelsrailprofiles;
	}

	public WebElement getWheelsrailscontacts() {
		return Wheelsrailscontacts;
	}

	// create Project options locater

	@FindBy(xpath = "(//input[@class=\"form-control input-sm\"])[1]")
	private WebElement Createsimulationname;
	@FindBy(xpath = "(//input[@class=\"form-control input-sm\"])[2]")
	private WebElement Createsimulationproject;
	@FindBy(xpath = "(//input[@class=\"jqSimulationTypeButton\"])[1]")
	private WebElement Createsimulationtrainimpact;
	@FindBy(xpath = "//input[@class='form-control input-sm w-80']")
	private WebElement Createsimulationspeed;
	@FindBy(xpath = "(//a[contains(text(),'Train')])[2]")
	private WebElement Createsimulationtrain1;
	@FindBy(xpath = "(//span[text()='- Select Train from Library -'])[1]")
	private WebElement Createsimulationselecttrain1library;
	@FindBy(id = "mass_condition")
	private WebElement Createsimulationmassconditiontrain1;
	@FindBy(xpath = "(//input[@name=\"trains[1][impact_brakes][]\"])[1]")
	private WebElement Createsimulationbrakestrain1;
	@FindBy(xpath = "(//a[contains(text(),'Train')])[3]")
	private WebElement Createsimulationtrain2;
	@FindBy(xpath = "//input[@name='trains[2][mirror_brakes]']")
	private WebElement Createsimulationbrakestrain2;
	@FindBy(xpath = "//button[text()='Run']")
	private WebElement Createsimulationrun;
	@FindBy(xpath = "//a[text()='Simulation Results']")
	private WebElement Createsimulationsimulationresult;
	@FindBy(xpath = "//strong[text()='Total Force vs Displacement, Top 20 Peak Coupling Interfaces']")
	private WebElement Createsimulationtotalforce;
	@FindBy(xpath = "//a[text()='3D            ']")
	private WebElement Createsimulation3d;
	@FindBy(xpath = "//button[contains(text(),'Save & Exit')]")
	private WebElement Createsimulationsaveandexitoption;
	@FindBy(xpath = "(//li[text()='4x90 Tonne Wagons'])[1]")
	private WebElement Publiclibrary4X90tonnewagons;
	@FindBy(xpath = "//span[text()='My train']")
	private WebElement Personallibrarymytrain;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary text-capitalize w-35\"])[1]")
	private WebElement Createbufferstopimapacttype;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[4]")
	private WebElement Createsimulationselecttrain1usingbufferstopimpact;
	@FindBy(xpath = "//li[text()='Generic Mainline']")
	private WebElement Createsimulationselectgenericmainline;
	@FindBy(id = "mass_condition")
	private WebElement Createsimulatiobufferstopimpactmasscondition;
	@FindBy(xpath = "//option[text()='AW1']")
	private WebElement CreatesimulationAw1masscondition;
	@FindBy(xpath = "(//a[@role=\"tab\"])[4]")
	private WebElement Createbufferstopbufferstopbutton;
	@FindBy(xpath = "(//span[@class=\"select2-selection__placeholder\"])[3]")
	private WebElement Createsimulationselectbufferstop;
	@FindBy(xpath = "//li[text()='Fixed 3 Point No Trolley']")
	private WebElement Createsimulationthreepointslidingbufferstop;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[1]")
	private WebElement Createsimulationdynamicsuspentionno;
	@FindBy(xpath = "//button[text()='Run']")
	private WebElement Createbufferstoprunbutton;
	@FindBy(xpath = "(//button[@type=\"submit\"])[1]")
	private WebElement Createbufferstopsaveandreview;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary text-capitalize w-35\"])[2]")
	private WebElement Createrunningtrainoption;
	@FindBy(xpath = "//span[text()='No Route Profile Selected (Rescue or Simple Gradient)']")
	private WebElement Createrunningtrainselectprofileoption;
	@FindBy(xpath = "//li[contains(text(),'Reverse curve route profile')]")
	private WebElement Createrunningtrainfirstprofile;
	@FindBy(xpath = "(//span[text()='- Select Train from Library -'])[4]")
	private WebElement Createrunningtrainselecttrainoption;
	@FindBy(xpath = "//li[text()='Generic Mainline']")
	private WebElement Createrunningtrainselectgenericmainline;
	@FindBy(xpath = "//button[text()='Run']")
	private WebElement Createrunningtrainrunbutton;
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[10]")
	private WebElement Createrunningtrainsimulationshadowtab;
	@FindBy(xpath = "//a[text()='Simulation Results']")
	private WebElement Createrunningtrainsimulationresult;
	@FindBy(xpath = "//div[@class=\"dw3MenuButton dw3PlaybackButton\"]")
	private WebElement Bufferstopplaybutton;
	@FindBy(id = "impact_gradient")
	private WebElement Createsimulationimpactgradient;
	@FindBy(xpath = "//option[text()='DVRS 1']")
	private WebElement Projectdvrs1;

	
	
	public WebElement getCreatesimulationdynamicsuspentionno() {
		return Createsimulationdynamicsuspentionno;
	}

	public WebElement getPersonallibrarymytrain() {
		return Personallibrarymytrain;
	}

	public WebElement getCreatesimulationsaveandexitoption() {
		return Createsimulationsaveandexitoption;
	}

	public WebElement getCreaterunningtrainsimulationshadowtab() {
		return Createrunningtrainsimulationshadowtab;
	}

	public WebElement getProjectdvrs1() {
		return Projectdvrs1;
	}

	public WebElement getCreatesimulationimpactgradient() {
		return Createsimulationimpactgradient;
	}

	public WebElement getBufferstopplaybutton() {
		return Bufferstopplaybutton;
	}

	public WebElement getCreaterunningtrainsimulationresult() {
		return Createrunningtrainsimulationresult;
	}

	public WebElement getCreaterunningtrainrunbutton() {
		return Createrunningtrainrunbutton;
	}

	public WebElement getCreaterunningtrainselecttrainoption() {
		return Createrunningtrainselecttrainoption;
	}

	public WebElement getCreaterunningtrainselectgenericmainline() {
		return Createrunningtrainselectgenericmainline;
	}

	public WebElement getCreaterunningtrainoption() {
		return Createrunningtrainoption;
	}

	public WebElement getCreaterunningtrainselectprofileoption() {
		return Createrunningtrainselectprofileoption;
	}

	public WebElement getCreaterunningtrainfirstprofile() {
		return Createrunningtrainfirstprofile;
	}

	public WebElement getCreatebufferstopimapacttype() {
		return Createbufferstopimapacttype;
	}

	public WebElement getCreatesimulationselecttrain1usingbufferstopimpact() {
		return Createsimulationselecttrain1usingbufferstopimpact;
	}

	public WebElement getCreatesimulationselectgenericmainline() {
		return Createsimulationselectgenericmainline;
	}

	public WebElement getCreatesimulatiobufferstopimpactmasscondition() {
		return Createsimulatiobufferstopimpactmasscondition;
	}

	public WebElement getCreatesimulationAw1masscondition() {
		return CreatesimulationAw1masscondition;
	}

	public WebElement getCreatebufferstopbufferstopbutton() {
		return Createbufferstopbufferstopbutton;
	}

	public WebElement getCreatesimulationselectbufferstop() {
		return Createsimulationselectbufferstop;
	}

	public WebElement getCreatesimulationthreepointslidingbufferstop() {
		return Createsimulationthreepointslidingbufferstop;
	}

	public WebElement getCreatebufferstoprunbutton() {
		return Createbufferstoprunbutton;
	}

	public WebElement getCreatebufferstopsaveandreview() {
		return Createbufferstopsaveandreview;
	}

	public WebElement getCreatesimulationname() {
		return Createsimulationname;
	}

	public WebElement getCreatesimulationproject() {
		return Createsimulationproject;
	}

	public WebElement getCreatesimulationtrainimpact() {
		return Createsimulationtrainimpact;
	}

	public WebElement getCreatesimulationspeed() {
		return Createsimulationspeed;
	}

	public WebElement getCreatesimulationtrain1() {
		return Createsimulationtrain1;
	}

	public WebElement getCreatesimulationselecttrain1library() {
		return Createsimulationselecttrain1library;
	}

	public WebElement getCreatesimulationmassconditiontrain1() {
		return Createsimulationmassconditiontrain1;
	}

	public WebElement getCreatesimulationbrakestrain1() {
		return Createsimulationbrakestrain1;
	}

	public WebElement getCreatesimulationtrain2() {
		return Createsimulationtrain2;
	}

	public WebElement getCreatesimulationbrakestrain2() {
		return Createsimulationbrakestrain2;
	}

	public WebElement getCreatesimulationrun() {
		return Createsimulationrun;
	}

	public WebElement getCreatesimulationsimulationresult() {
		return Createsimulationsimulationresult;
	}

	public WebElement getCreatesimulationtotalforce() {
		return Createsimulationtotalforce;
	}

	public WebElement getCreatesimulation3d() {
		return Createsimulation3d;
	}

	public WebElement getPubliclibrary4X90tonnewagons() {
		return Publiclibrary4X90tonnewagons;
	}

	// delete project locater

	@FindBy(xpath = "(//button[@data-toggle=\"dropdown\"])[1]")
	private WebElement Actionbutton;
	@FindBy(xpath = "(//div[@class=\"item-type js-project-toggle\"])[1]")
	private WebElement Project;
	@FindBy(xpath = "//div[@class=\"item-type js-simulation-toggle\"]")
	private WebElement Sim;
	@FindBy(xpath = "(//span[text()='Delete Project'])[1]")
	private WebElement Deleteproject;
	@FindBy(xpath = "(//button[text()='Delete'])[1]")
	private WebElement Deletebutton;
	@FindBy(xpath = "(//div[@class=\"item-column item-column-main\"])[1]")
	private WebElement projectbox;

	public WebElement getDeletebutton() {
		return Deletebutton;
	}

	public WebElement getProjectbox() {
		return projectbox;
	}

	public WebElement getActionbutton() {
		return Actionbutton;
	}

	public WebElement getProject() {
		return Project;
	}

	public WebElement getSim() {
		return Sim;
	}

	public WebElement getDeleteproject() {
		return Deleteproject;
	}

	// Create train module locater

	@FindBy(xpath = "//button[text()='Create Train										']")
	private WebElement Createtrainbutton;
	@FindBy(xpath = "//label[@class=\"btn btn-primary text-capitalize active\"]")
	private WebElement Createtrainselecthighspeedtrain;
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement Createtrainnextbutton;
	@FindBy(xpath = "//button[@id=\"jqTrainSetupComplete\"]")
	private WebElement Createtraincompletebutton;
	@FindBy(xpath = "//button[text()='View in 3D']")
	private WebElement CreatetrainviewinthreeD;
	@FindBy(xpath = "(//a[contains(text(),'Public')])[2]")
	private WebElement Createtrainpubliclibrary;
	@FindBy(xpath = "(//select[@id=\"train_type\"])[2]")
	private WebElement Createtrainselecttypeoftrain;
	@FindBy(xpath = "//span[text()='Select template']")
	private WebElement Createtrainselecttemplate;
	@FindBy(xpath = "//button[text()='Select Template']")
	private WebElement Createtrainselecttemplatebutton;
	@FindBy(xpath = "//a[text()='Save & Review']")
	private WebElement Createtrainsaveandreview;
	@FindBy(xpath = "(//a[contains(text(),'3D')])[1]")
	private WebElement Createtrainthreedview;
	@FindBy(xpath = "(//option[@value=\"highspeed\"])[1]")
	private WebElement Createtrainselecttrainhighspeed;
	@FindBy(xpath = "//li[text()='Generic Highspeed Train']")
	private WebElement Createtrainselectgenerictemplate;

	public WebElement getCreatetrainselecthighspeedtrain() {
		return Createtrainselecthighspeedtrain;
	}

	public WebElement getCreatetrainnextbutton() {
		return Createtrainnextbutton;
	}

	public WebElement getCreatetraincompletebutton() {
		return Createtraincompletebutton;
	}

	public WebElement getCreatetrainviewinthreeD() {
		return CreatetrainviewinthreeD;
	}

	public WebElement getCreatetrainselecttrainhighspeed() {
		return Createtrainselecttrainhighspeed;
	}

	public WebElement getCreatetrainselectgenerictemplate() {
		return Createtrainselectgenerictemplate;
	}

	public WebElement getCreatetrainbutton() {
		return Createtrainbutton;
	}

	public WebElement getCreatetrainpubliclibrary() {
		return Createtrainpubliclibrary;
	}

	public WebElement getCreatetrainselecttypeoftrain() {
		return Createtrainselecttypeoftrain;
	}

	public WebElement getCreatetrainselecttemplate() {
		return Createtrainselecttemplate;
	}

	public WebElement getCreatetrainselecttemplatebutton() {
		return Createtrainselecttemplatebutton;
	}

	public WebElement getCreatetrainsaveandreview() {
		return Createtrainsaveandreview;
	}

	public WebElement getCreatetrainthreedview() {
		return Createtrainthreedview;
	}

	// Delete train(inside of main menu trains option)

	@FindBy(xpath = "(//div[@class=\"item-column item-column-main\"])[1]")
	private WebElement Trainbox;
	@FindBy(xpath = "//button[@class=\"btn btn-primary btn-sm dropdown-toggle js-dropdown-toggle\"]")
	private WebElement Trainactionbutton;
	@FindBy(xpath = "(//span[text()='Delete Train'])[1]")
	private WebElement Deletetrain;
	@FindBy(xpath = "(//button[text()='Delete'])[1]")
	private WebElement Traindeletebutton;

	public WebElement getTrainbox() {
		return Trainbox;
	}

	public WebElement getTrainactionbutton() {
		return Trainactionbutton;
	}

	public WebElement getDeletetrain() {
		return Deletetrain;
	}

	public WebElement getTraindeletebutton() {
		return Traindeletebutton;
	}

	// create vehicle locater

	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[2]")
	private WebElement Createvehicleselecttemplatetype;
	@FindBy(xpath = "//li[text()='DMU Carriage']")
	private WebElement Createvehicleselectgenerichighspeed;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[3]")
	private WebElement Createvehicleselecttemplatetypevehicle;
	@FindBy(xpath = "//li[text()='Generic 4 car metro fitted with EFG3 and DT (EN15227) - Vehicle 1']")
	private WebElement Createvehicleselectfirst;
	@FindBy(xpath = "//button[text()='Create Vehicle							']")
	private WebElement Createvehiclebutton;
	@FindBy(id = "jqSaveButton")
	private WebElement Createvehiclesave;
	@FindBy(xpath = "//label[@aria-controls=\"vehicle-3d\"]")
	private WebElement CreatevehiclethreeDview;
	@FindBy(xpath = "//button[text()='Select Template']")
	private WebElement Createvehicleselecttemplatebutton;

	public WebElement getCreatevehicleselecttemplatetypevehicle() {
		return Createvehicleselecttemplatetypevehicle;
	}

	public WebElement getCreatevehicleselectfirst() {
		return Createvehicleselectfirst;
	}

	public WebElement getCreatevehicleselecttemplatebutton() {
		return Createvehicleselecttemplatebutton;
	}

	public WebElement getCreatevehiclethreeDview() {
		return CreatevehiclethreeDview;
	}

	public WebElement getCreatevehicleselecttemplatetype() {
		return Createvehicleselecttemplatetype;
	}

	public WebElement getCreatevehicleselectgenerichighspeed() {
		return Createvehicleselectgenerichighspeed;
	}

	public WebElement getCreatevehiclebutton() {
		return Createvehiclebutton;
	}

	public WebElement getCreatevehiclesave() {
		return Createvehiclesave;
	}

	// Delete vehicle (inside of main menu vehicle)

	@FindBy(xpath = "//div[contains(text(),'Generic 4 car metro')]")
	private WebElement Vehiclebox;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Vehicleaction;
	@FindBy(xpath = "(//span[text()='Delete Vehicle'])[1]")
	private WebElement Vehicledeleteoption;

	public WebElement getVehiclebox() {
		return Vehiclebox;
	}

	public WebElement getVehicleaction() {
		return Vehicleaction;
	}

	public WebElement getVehicledeleteoption() {
		return Vehicledeleteoption;
	}

	// create buffer stop(inside of main menu buffer stop)

	@FindBy(id = "jqEndstopCreateBtn")
	private WebElement Bufferstopcreatebufferstopbutton;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[2]")
	private WebElement Bufferstopselecttemplatebufferstop;
	@FindBy(xpath = "//li[text()='3 Point Sliding Buffer Stop x2 hydraulic']")
	private WebElement Bufferstopselectthreepointslidingbufferstop;
	@FindBy(xpath = "//button[text()='Select Template']")
	private WebElement Bufferstopselecttemplatebutton;
	@FindBy(xpath = "//a[text()='Save & Review']")
	private WebElement Bufferstopsaveandreview;
	@FindBy(xpath = "//a[text()='3D']")
	private WebElement Bufferstopthreedview;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[1]")
    private WebElement Bufferstopgashydrolicplusbutton;
    @FindBy(xpath = "(//a[text()='Choose from library'])[1]")
    private WebElement Bufferstopchoosefromlibrary;
    @FindBy(xpath = "(//select[@class=\"form-control form-control-select w-100\"])[1]")
    private WebElement Bufferstopselectdevicebox;
    @FindBy(xpath = "//option[contains(text(),'Type53')]")
    private WebElement Bufferstopselecttype53;
    @FindBy(xpath = "(//button[@class=\"btn btn-primary btn-block js-modal-device-template-btn js-modal-sidebar-close\"])[1]")
    private WebElement Bufferstopselecttemplatehydrolicbutton;    
    @FindBy(xpath = "(//button[contains(text(),'Attach')])[1]")
    private WebElement Bufferstopattachbutton;
    @FindBy(xpath = "//input[@name=\"device_data[options][parallel]\"]")
    private WebElement Bufferstopparalleloption;
    @FindBy(xpath = "//button[text()='Edit Fabricated Structure				']")
    private WebElement Bufferstopedit;
    @FindBy(xpath = "//a[text()='Geometry']")
    private WebElement Bufferstopgeometry;
    @FindBy(id = "endstop_coupler_offset")
    private WebElement Bufferstopcoupleroffsetbox;
    @FindBy(xpath = "//input[@name=\"endstop_coupler_height\"]")
    private WebElement Bufferstopimpacthightbox;
    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    private WebElement Bufferstopapplydimention;
    
    
	public WebElement getBufferstopedit() {
		return Bufferstopedit;
	}

	public WebElement getBufferstopgeometry() {
		return Bufferstopgeometry;
	}

	public WebElement getBufferstopcoupleroffsetbox() {
		return Bufferstopcoupleroffsetbox;
	}

	public WebElement getBufferstopimpacthightbox() {
		return Bufferstopimpacthightbox;
	}

	public WebElement getBufferstopapplydimention() {
		return Bufferstopapplydimention;
	}

	public WebElement getBufferstopparalleloption() {
		return Bufferstopparalleloption;
	}

	public WebElement getBufferstopgashydrolicplusbutton() {
		return Bufferstopgashydrolicplusbutton;
	}

	public WebElement getBufferstopchoosefromlibrary() {
		return Bufferstopchoosefromlibrary;
	}

	public WebElement getBufferstopselectdevicebox() {
		return Bufferstopselectdevicebox;
	}

	public WebElement getBufferstopselecttype53() {
		return Bufferstopselecttype53;
	}

	public WebElement getBufferstopselecttemplatehydrolicbutton() {
		return Bufferstopselecttemplatehydrolicbutton;
	}

	public WebElement getBufferstopattachbutton() {
		return Bufferstopattachbutton;
	}

	public WebElement getBufferstopcreatebufferstopbutton() {
		return Bufferstopcreatebufferstopbutton;
	}

	public WebElement getBufferstopselecttemplatebufferstop() {
		return Bufferstopselecttemplatebufferstop;
	}

	public WebElement getBufferstopselectthreepointslidingbufferstop() {
		return Bufferstopselectthreepointslidingbufferstop;
	}

	public WebElement getBufferstopselecttemplatebutton() {
		return Bufferstopselecttemplatebutton;
	}

	public WebElement getBufferstopsaveandreview() {
		return Bufferstopsaveandreview;
	}

	public WebElement getBufferstopthreedview() {
		return Bufferstopthreedview;
	}
	// Delete buffer stop(inside of main menu buffer stop option)

	@FindBy(xpath = "(//div[@class=\"btn-group js-dropdown-wrap\"])[1]")
	private WebElement Bufferstopbox;
	@FindBy(xpath = "(//button[@class=\"btn btn-primary btn-sm dropdown-toggle js-dropdown-toggle\"])[1]")
	private WebElement Bufferstopaction;
	@FindBy(xpath = "(//span[text()='Delete Buffer Stop'])[1]")
	private WebElement Bufferstopdelete;

	public WebElement getBufferstopbox() {
		return Bufferstopbox;
	}

	public WebElement getBufferstopaction() {
		return Bufferstopaction;
	}

	public WebElement getBufferstopdelete() {
		return Bufferstopdelete;
	}

	// Create Interface (inside of main menu coupling interface

	@FindBy(xpath = "//button[@id=\"jqInterfaceCreateBtn\"]")
	private WebElement Createcouplinginterface;
	@FindBy(xpath = "(//a[text()='Choose from library'])[1]")
	private WebElement Createcouplinginterfaceselectlibrary;
	@FindBy(xpath = "//span[text()='Select a Template Coupling Interface']")
	private WebElement Createcouplinginterfaceselecttemplate;
	@FindBy(xpath = "//li[text()='EFG3_plus_deforming_tube']")
	private WebElement CreatecouplinginterfaceEFG3type;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[1]")
	private WebElement Createcouplinginterfaceselecttemplatebutton;
	@FindBy(xpath = "(//span[text()='Devices'])[1]")
	private WebElement Createcouplinginterfacedevicesword;
	@FindBy(xpath = "(//a[text()='3D'])[1]")
	private WebElement CreatecouplinginterfacethreeDview;
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement Createcouplinginterfacecreatebutton;

	public WebElement getCreatecouplinginterface() {
		return Createcouplinginterface;
	}

	public WebElement getCreatecouplinginterfaceselectlibrary() {
		return Createcouplinginterfaceselectlibrary;
	}

	public WebElement getCreatecouplinginterfaceselecttemplate() {
		return Createcouplinginterfaceselecttemplate;
	}

	public WebElement getCreatecouplinginterfaceEFG3type() {
		return CreatecouplinginterfaceEFG3type;
	}

	public WebElement getCreatecouplinginterfaceselecttemplatebutton() {
		return Createcouplinginterfaceselecttemplatebutton;
	}

	public WebElement getCreatecouplinginterfacedevicesword() {
		return Createcouplinginterfacedevicesword;
	}

	public WebElement getCreatecouplinginterfacethreeDview() {
		return CreatecouplinginterfacethreeDview;
	}

	public WebElement getCreatecouplinginterfacecreatebutton() {
		return Createcouplinginterfacecreatebutton;
	}

	// Delete coupling interface(Inside of main menu coupling interface option)
	
	@FindBy(xpath = "//div[@class=\"item-column item-column-main\"]")
	private WebElement Couplinginterfacebox;
	@FindBy(xpath = "(//button[@data-toggle=\"dropdown\"])[1]")
	private WebElement Couplinginterfaceaction;
	@FindBy(xpath = "(//span[text()='Delete Interface'])[1]")
	private WebElement Couplinginterfacedeleteoption;

	public WebElement getCouplinginterfacebox() {
		return Couplinginterfacebox;
	}

	public WebElement getCouplinginterfaceaction() {
		return Couplinginterfaceaction;
	}

	public WebElement getCouplinginterfacedeleteoption() {
		return Couplinginterfacedeleteoption;
	}

	// create route profile locater

	@FindBy(id = "jqTerrainCreateBtn")
	private WebElement Createrouteprofileoptionbutton;
	@FindBy(xpath = "//a[@data-title=\"Manual Profile Route\"]")
	private WebElement Createmanualprofileoption;
	@FindBy(xpath = "//span[text()=' a track from a mapped route 						']")
	private WebElement Createmapprofileoption;
	@FindBy(xpath = "//a[text()='Manual Input Data']")
	private WebElement Manualinputdatabutton;
	@FindBy(xpath = "//a[text()='Location Settings']")
	private WebElement Locationsettingbutton;
	@FindBy(xpath = "//a[text()='Upload Map Data']")
	private WebElement Uploadmapdatabutton;
	@FindBy(xpath = "//a[text()='Location Settings']")
	private WebElement Loactionsettingbutton;
	@FindBy(xpath = "//span[text()='More Tools']")
	private WebElement Moretoolsbutton;
	@FindBy(xpath = "//a[text()='Satelite Map                                            ']")
	private WebElement Satelitemapbutton;
	@FindBy(className = "mapboxgl-ctrl-zoom-in")
	private WebElement Satelitezoomin;
	@FindBy(className = "mapboxgl-ctrl-zoom-out")
	private WebElement Satelitezoomout;

	public WebElement getCreaterouteprofileoptionbutton() {
		return Createrouteprofileoptionbutton;
	}

	public WebElement getCreatemanualprofileoption() {
		return Createmanualprofileoption;
	}

	public WebElement getCreatemapprofileoption() {
		return Createmapprofileoption;
	}

	public WebElement getManualinputdatabutton() {
		return Manualinputdatabutton;
	}

	public WebElement getLocationsettingbutton() {
		return Locationsettingbutton;
	}

	public WebElement getUploadmapdatabutton() {
		return Uploadmapdatabutton;
	}

	public WebElement getLoactionsettingbutton() {
		return Loactionsettingbutton;
	}

	public WebElement getMoretoolsbutton() {
		return Moretoolsbutton;
	}

	public WebElement getSatelitemapbutton() {
		return Satelitemapbutton;
	}

	public WebElement getSatelitezoomin() {
		return Satelitezoomin;
	}

	public WebElement getSatelitezoomout() {
		return Satelitezoomout;
	}

	// Shared library locater

	@FindBy(xpath = "//span[text()='Vehicles']")
	private WebElement Sharedlibraryvehicles;
	@FindBy(xpath = "//span[text()='Profiles']")
	private WebElement Sharedlibraryprofiles;
	@FindBy(xpath = "//span[text()='Contacts']")
	private WebElement Sharedlibrarycontacts;
	@FindBy(xpath = "//span[text()='Bogies']")
	private WebElement Sharedlibrarybogies;
	@FindBy(xpath = "//span[text()='Parts']")
	private WebElement Sharedlibraryparts;
	@FindBy(xpath = "//span[text()='Gauges']")
	private WebElement Sharedlibrarygauges;
	@FindBy(xpath = "//span[text()='Route Profiles']")
	private WebElement Sharedlibraryrouteprofiles;
	@FindBy(xpath = "//span[text()='Buffer Stops']")
	private WebElement Sharedlibrarybufferstops;
	@FindBy(xpath = "//span[text()='Coupling Interfaces']")
	private WebElement Sharedlibrarycouplinginterfaces;
	@FindBy(xpath = "//span[text()='Devices']")
	private WebElement Sharedlibrarydevices;
	@FindBy(xpath = "//span[text()='Trains']")
	private WebElement Sharedlibrarytrains;

	public WebElement getSharedlibraryvehicles() {
		return Sharedlibraryvehicles;
	}

	public WebElement getSharedlibraryprofiles() {
		return Sharedlibraryprofiles;
	}

	public WebElement getSharedlibrarycontacts() {
		return Sharedlibrarycontacts;
	}

	public WebElement getSharedlibrarybogies() {
		return Sharedlibrarybogies;
	}

	public WebElement getSharedlibraryparts() {
		return Sharedlibraryparts;
	}

	public WebElement getSharedlibrarygauges() {
		return Sharedlibrarygauges;
	}

	public WebElement getSharedlibraryrouteprofiles() {
		return Sharedlibraryrouteprofiles;
	}

	public WebElement getSharedlibrarybufferstops() {
		return Sharedlibrarybufferstops;
	}

	public WebElement getSharedlibrarycouplinginterfaces() {
		return Sharedlibrarycouplinginterfaces;
	}

	public WebElement getSharedlibrarydevices() {
		return Sharedlibrarydevices;
	}

	public WebElement getSharedlibrarytrains() {
		return Sharedlibrarytrains;
	}

	// Create coupling head locater(inside of main menu devices)

	@FindBy(id = "jqDeviceCreateBtn")
	private WebElement Createdevicebutton;
	@FindBy(xpath = "//button[@data-target='#jqDeviceModal-head']")
	private WebElement Couplerhead;
	@FindBy(xpath = "(//a[text()='Choose from library'])[5]") // (//a[text()='Choose from library'])[3]
	private WebElement Couplerheadchoosefromlibrary;
	@FindBy(xpath = "(//select[@name=\"device_data[library][public]\"])[5]")
	private WebElement CouplerheadSelectpubliclibrary;
	@FindBy(xpath = "(//option[contains(text(),'Generic Type 10')])[1]")
	private WebElement Couplerheadselectgenerictypeten;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[5]")
	private WebElement Couplerheadselecttemplatebutton;
	@FindBy(xpath = "(//div[@class='btn btn-primary btn-sm jqPictureButton'])[5]")
	private WebElement Couplerheaddeviceimage;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[5]")
	private WebElement Savebutton;

	public WebElement getCreatedevicebutton() {
		return Createdevicebutton;
	}

	public WebElement getCouplerhead() {
		return Couplerhead;
	}

	public WebElement getCouplerheadchoosefromlibrary() {
		return Couplerheadchoosefromlibrary;
	}

	public WebElement getCouplerheadSelectpubliclibrary() {
		return CouplerheadSelectpubliclibrary;
	}

	public WebElement getCouplerheadselectgenerictypeten() {
		return Couplerheadselectgenerictypeten;
	}

	public WebElement getCouplerheadselecttemplatebutton() {
		return Couplerheadselecttemplatebutton;
	}

	public WebElement getCouplerheaddeviceimage() {
		return Couplerheaddeviceimage;
	}

	public WebElement getSavebutton() {
		return Savebutton;
	}

	// create coupler bar locater(inside main menu device option)

	@FindBy(xpath = "//button[@data-title='Coupler Bar']")
	private WebElement Couplerbaroption;
	@FindBy(xpath = "//option[contains(text(),'1500mm Coupler Bar')]")
	private WebElement Selectcouplerbar;
	@FindBy(xpath = "(//a[text()='Choose from library'])[6]")
	private WebElement Couplerbarchoosefromlibrary;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[6]")
	private WebElement Couplerbarselecttemplate;
	@FindBy(xpath = "(//select[@name=\"device_data[library][public]\"])[6]")
	private WebElement Couplerbarselectpubliclibrary;
	@FindBy(xpath = "//option[contains(text(),'1500mm Coupler Bar')]")
	private WebElement Couplerbarselectfirstbar;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[6]")
	private WebElement Couplerbarsavebutton;

	public WebElement getCouplerbarsavebutton() {
		return Couplerbarsavebutton;
	}

	public WebElement getCouplerbarchoosefromlibrary() {
		return Couplerbarchoosefromlibrary;
	}

	public WebElement getCouplerbarselecttemplate() {
		return Couplerbarselecttemplate;
	}

	public WebElement getCouplerbarselectpubliclibrary() {
		return Couplerbarselectpubliclibrary;
	}

	public WebElement getCouplerbarselectfirstbar() {
		return Couplerbarselectfirstbar;
	}

	public WebElement getCouplerbaroption() {
		return Couplerbaroption;
	}

	public WebElement getSelectcouplerbar() {
		return Selectcouplerbar;
	}

	// Create modular coupler shanks locater(inside main menu device option)

	@FindBy(xpath = "//button[@data-target=\"#jqDeviceModal-sentry\"]")
	private WebElement Couplershanksoption;
	@FindBy(xpath = "(//select[@name=\"device_data[library][public]\"])[7]")
	private WebElement Couplershankpubliclibrary;
	@FindBy(xpath = "//option[contains(text(),'M300E-70-350')]")
	private WebElement Couplershankselectsecond;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[7]")
	private WebElement Couplershankselecttemplatebutton;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-picture \"])[7]")
	private WebElement Couplershankimg;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[7]")
	private WebElement Couplershanksavebutton;

	public WebElement getCouplershanksoption() {
		return Couplershanksoption;
	}

	public WebElement getCouplershankpubliclibrary() {
		return Couplershankpubliclibrary;
	}

	public WebElement getCouplershankselectsecond() {
		return Couplershankselectsecond;
	}

	public WebElement getCouplershankselecttemplatebutton() {
		return Couplershankselecttemplatebutton;
	}

	public WebElement getCouplershankimg() {
		return Couplershankimg;
	}

	public WebElement getCouplershanksavebutton() {
		return Couplershanksavebutton;
	}

	// create Deformation tube locater(inside main menu device option)

	@FindBy(xpath = "//button[@data-target=\"#jqDeviceModal-deformation\"]")
	private WebElement Deformationtubeoption;
	@FindBy(xpath = "(//a[text()='Choose from library'])[10]")
	private WebElement Deformationtubechooselibrary;
	@FindBy(xpath = "(//select[@name=\"device_data[library][public]\"])[10]")
	private WebElement Deformationtubepubliclibrary;
	@FindBy(xpath = "//option[contains(text(),'D02040')]")
	private WebElement Deformationtubeselectsecond;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[10]")
	private WebElement Deformationtubeselecttemplate;
	@FindBy(xpath = "(//div[@class=\"btn btn-primary btn-sm jqPictureButton\"])[9]")
	private WebElement Deformationtubeimg;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[10]")
	private WebElement Deformationtubesavebutton;

	public WebElement getDeformationtubeoption() {
		return Deformationtubeoption;
	}

	public WebElement getDeformationtubechooselibrary() {
		return Deformationtubechooselibrary;
	}

	public WebElement getDeformationtubepubliclibrary() {
		return Deformationtubepubliclibrary;
	}

	public WebElement getDeformationtubeselectsecond() {
		return Deformationtubeselectsecond;
	}

	public WebElement getDeformationtubeselecttemplate() {
		return Deformationtubeselecttemplate;
	}

	public WebElement getDeformationtubeimg() {
		return Deformationtubeimg;
	}

	public WebElement getDeformationtubesavebutton() {
		return Deformationtubesavebutton;
	}

	// create Rubber or spring locater(inside of main menu device option)

	@FindBy(xpath = "(//span[contains(text(),'Rubber, Spring')])[1]")
	private WebElement Rubberorspringoption;
	@FindBy(xpath = "(//a[text()='Choose from library'])[11]")
	private WebElement Rubberorspringchooselibrary;
	@FindBy(xpath = "(//select[@name=\"device_data[library][public]\"])[11]")
	private WebElement Rubberorspringselectpubliclibrary;
	@FindBy(xpath = "//option[contains(text(),'durel_combi')]")
	private WebElement Rubberorspringselectsecond;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[11]")
	private WebElement Rubberorspringselecttemplatebutton;
	@FindBy(xpath = "(//button[@type=\"submit\"])[21]")
	private WebElement Rubberorspringsavebutton;

	public WebElement getRubberorspringoption() {
		return Rubberorspringoption;
	}

	public WebElement getRubberorspringchooselibrary() {
		return Rubberorspringchooselibrary;
	}

	public WebElement getRubberorspringselectpubliclibrary() {
		return Rubberorspringselectpubliclibrary;
	}

	public WebElement getRubberorspringselectsecond() {
		return Rubberorspringselectsecond;
	}

	public WebElement getRubberorspringselecttemplatebutton() {
		return Rubberorspringselecttemplatebutton;
	}

	public WebElement getRubberorspringsavebutton() {
		return Rubberorspringsavebutton;
	}

	// create Pivot Assembly (inside main menu devices option)

	@FindBy(xpath = "//button[@data-title=\"Pivot Assembly\"]")
	private WebElement Pivotassemblyoption;
	@FindBy(xpath = "(//a[text()='Choose from library'])[13]")
	private WebElement Pivotassemblychooselibrary;
	@FindBy(xpath = "(//select[@name=\"device_data[library][public]\"])[13]")
	private WebElement Pivotassemblyselectpubliclibrary;
	@FindBy(xpath = "//option[contains(text(),'Generic auto EFG3 with central support')]")
	private WebElement Pivotassemblyselectsecond;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[13]")
	private WebElement Pivotassemblyselecttemplate;
	@FindBy(xpath = "(//div[@class=\"btn btn-primary btn-sm jqPictureButton\"])[12]")
	private WebElement Pivoteassemblyimg;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[13]")
	private WebElement Pivoteassemblysave;

	public WebElement getPivotassemblyoption() {
		return Pivotassemblyoption;
	}

	public WebElement getPivotassemblychooselibrary() {
		return Pivotassemblychooselibrary;
	}

	public WebElement getPivotassemblyselectpubliclibrary() {
		return Pivotassemblyselectpubliclibrary;
	}

	public WebElement getPivotassemblyselectsecond() {
		return Pivotassemblyselectsecond;
	}

	public WebElement getPivotassemblyselecttemplate() {
		return Pivotassemblyselecttemplate;
	}

	public WebElement getPivoteassemblyimg() {
		return Pivoteassemblyimg;
	}

	public WebElement getPivoteassemblysave() {
		return Pivoteassemblysave;
	}

	// create Shear out locater (inside of main menu devices)

	@FindBy(xpath = "(//button[@data-title=\"Shear Out\"])[1]")
	private WebElement Shearoutoption;
	@FindBy(xpath = "(//a[text()='Choose from library'])[20]")
	private WebElement Shearoutchooselibrary;
	@FindBy(xpath = "(//select[@name=\"device_data[library][public]\"])[21]")
	private WebElement Shearoutpubliclibrary;
	@FindBy(xpath = "//option[contains(text(),'OLEO Shear Out 1500')]")
	private WebElement Shearoutselectfirst;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[20]")
	private WebElement Shearoutselecttemplate;
	@FindBy(xpath = "//button[text()='Plot Graph								']")
	private WebElement Shearoutplotgraph;
	@FindBy(xpath = "(//button[text()='Cancel'])[26]")
	private WebElement Shearoutcancelbutton;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[21]")
	private WebElement Shearoutsavebutton;

	public WebElement getShearoutoption() {
		return Shearoutoption;
	}

	public WebElement getShearoutchooselibrary() {
		return Shearoutchooselibrary;
	}

	public WebElement getShearoutpubliclibrary() {
		return Shearoutpubliclibrary;
	}

	public WebElement getShearoutselectfirst() {
		return Shearoutselectfirst;
	}

	public WebElement getShearoutselecttemplate() {
		return Shearoutselecttemplate;
	}

	public WebElement getShearoutplotgraph() {
		return Shearoutplotgraph;
	}

	public WebElement getShearoutcancelbutton() {
		return Shearoutcancelbutton;
	}

	public WebElement getShearoutsavebutton() {
		return Shearoutsavebutton;
	}

	// create Anti climber locater (inside of main menu devices)

	@FindBy(xpath = "//button[@data-title=\"Anti Climber\"]")
	private WebElement Anticlimberoption;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[1]")
	private WebElement Anticlimbersaidanticlimberoption;
	@FindBy(xpath = "(//a[text()='Choose from library'])[1]")
	private WebElement Anticlimberchooselibrary;
	@FindBy(xpath = "(//select[@name=\"device_data[library][public]\"])[1]")
	private WebElement Anticlimberselectpubliclibrary;
	@FindBy(xpath = "//option[contains(text(),'AP20-025')]")
	private WebElement AnticlimberselectAmmodel;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[1]")
	private WebElement Anticlimberselecttemplatebutton;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-picture \"])[1]")
	private WebElement Anticlimberimg;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	private WebElement Anticlimbersavebutton;

	public WebElement getAnticlimberoption() {
		return Anticlimberoption;
	}

	public WebElement getAnticlimbersaidanticlimberoption() {
		return Anticlimbersaidanticlimberoption;
	}

	public WebElement getAnticlimberchooselibrary() {
		return Anticlimberchooselibrary;
	}

	public WebElement getAnticlimberselectpubliclibrary() {
		return Anticlimberselectpubliclibrary;
	}

	public WebElement getAnticlimberselectAmmodel() {
		return AnticlimberselectAmmodel;
	}

	public WebElement getAnticlimberselecttemplatebutton() {
		return Anticlimberselecttemplatebutton;
	}

	public WebElement getAnticlimberimg() {
		return Anticlimberimg;
	}

	public WebElement getAnticlimbersavebutton() {
		return Anticlimbersavebutton;
	}
	
	// delete the all devices (inside the device option)
	
	@FindBy(xpath = "//button[text()='Bulk Delete							']")
	private WebElement Deletealldevicesoption;
	@FindBy(xpath = "//button[text()='Select All									']")
	private WebElement Selectalldevicesoption;
	@FindBy(xpath = "//button[text()='Delete all selected 									']")
	private WebElement Deleteallselecteddevices;
	
	public WebElement getDeletealldevicesoption() {
		return Deletealldevicesoption;
	}

	public WebElement getSelectalldevicesoption() {
		return Selectalldevicesoption;
	}

	public WebElement getDeleteallselecteddevices() {
		return Deleteallselecteddevices;
	}


	// Wheels and rails locater(inside of main menu wheels and rail)


	@FindBy(xpath = "//a[text()='Profiles']")
	private WebElement profileoption;
	@FindBy(xpath = "//button[text()='Create Profile							']")
	private WebElement Createprofilebutton;
	@FindBy(xpath = "(//span[contains(text(),'Wheel')])[1]")
	private WebElement Createprofilewheel;
	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	private WebElement Wheelprofilecancel;
	@FindBy(xpath = "(//span[contains(text(),'Rail')])[1]")
	private WebElement Createprofilerail;
	@FindBy(xpath = "(//button[text()='Cancel'])[3]")
	private WebElement Railprofilecancel;
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement Contactoption;
	@FindBy(xpath = "//button[text()='Create Contact							']")
	private WebElement Createcontactoption;
	@FindBy(xpath = "//a[contains(text(),'Rail Data')]")
	private WebElement Raildataoption;
	@FindBy(xpath = "//a[contains(text(),'Settings')]")
	private WebElement Settingoption;
	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
	private WebElement Contactcancel;

	public WebElement getProfileoption() {
		return profileoption;
	}

	public WebElement getCreateprofilebutton() {
		return Createprofilebutton;
	}

	public WebElement getCreateprofilewheel() {
		return Createprofilewheel;
	}

	public WebElement getWheelprofilecancel() {
		return Wheelprofilecancel;
	}

	public WebElement getCreateprofilerail() {
		return Createprofilerail;
	}

	public WebElement getRailprofilecancel() {
		return Railprofilecancel;
	}

	public WebElement getContactoption() {
		return Contactoption;
	}

	public WebElement getCreatecontactoption() {
		return Createcontactoption;
	}

	public WebElement getRaildataoption() {
		return Raildataoption;
	}

	public WebElement getSettingoption() {
		return Settingoption;
	}

	public WebElement getContactcancel() {
		return Contactcancel;
	}

//create Gauges option locater(main menu gauges)(2078)

	@FindBy(xpath = "//button[text()='Create Gauge							']")
	private WebElement Creategaugebutton;
	@FindBy(xpath = "(//span[contains(text(),'Vehicle')])[1]")
	private WebElement Creategaugevehicle;
	@FindBy(xpath = "(//span[contains(text(),'Structural')])[1]")
	private WebElement Creategaugestructural;
	@FindBy(xpath = "(//a[text()='Choose from library'])[1]")
	private WebElement Creategaugevehiclechoosefromlibrary;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[1]")
	private WebElement Creategaugevehicleselecttemplate;
	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	private WebElement Creategaugevehiclecancel;
	@FindBy(xpath = "(//a[text()='Choose from library'])[2]")
	private WebElement Creategaugesstructuralchoosefromlibrary;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[3]")
	private WebElement Creategaugesstructuralselecttemplate;
	@FindBy(xpath = "(//button[text()='Cancel'])[3]")
	private WebElement Creategaugesstructuralcancel;

	public WebElement getCreategaugebutton() {
		return Creategaugebutton;
	}

	public WebElement getCreategaugevehicle() {
		return Creategaugevehicle;
	}

	public WebElement getCreategaugestructural() {
		return Creategaugestructural;
	}

	public WebElement getCreategaugevehiclechoosefromlibrary() {
		return Creategaugevehiclechoosefromlibrary;
	}

	public WebElement getCreategaugevehicleselecttemplate() {
		return Creategaugevehicleselecttemplate;
	}

	public WebElement getCreategaugevehiclecancel() {
		return Creategaugevehiclecancel;
	}

	public WebElement getCreategaugesstructuralchoosefromlibrary() {
		return Creategaugesstructuralchoosefromlibrary;
	}

	public WebElement getCreategaugesstructuralselecttemplate() {
		return Creategaugesstructuralselecttemplate;
	}

	public WebElement getCreategaugesstructuralcancel() {
		return Creategaugesstructuralcancel;
	}
	
	//create vehicle gauges (in side the gauges main menu)locater
	
	@FindBy(xpath = "(//input[@name=\"gauge_name\"])[1]")
	private WebElement Creategaugesnamebox;
	
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[1]")
	private WebElement Creategaugesupperxone;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[2]")
	private WebElement Creategaugesupperxtwo;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[3]")
	private WebElement Creategaugesupperxthree;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[4]")
	private WebElement Creategaugesupperxfour;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[5]")
	private WebElement Creategaugeslowerxfive;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[6]")
	private WebElement Creategaugeslowerxsix;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[7]")
	private WebElement Creategaugeslowerxseven;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[8]")
	private WebElement Creategaugeslowerxeight;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[9]")
	private WebElement Creategaugeslowerxnine;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[10]")
	private WebElement Creategaugeslowerxten;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[11]")
	private WebElement Creategaugesfootstepxone;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[12]")
	private WebElement Creategaugesfootstepxtwo;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[13]")
	private WebElement Creategaugesfootstepxthree;
	@FindBy(xpath = "(//input[@placeholder=\"X\"])[14]")
	private WebElement Creategaugesfootstepxfour;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[1]")
	private WebElement Creategaugesupperyone;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[2]")
	private WebElement Creategaugesupperytwo;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[3]")
	private WebElement Creategaugesupperythree;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[4]")
	private WebElement Creategaugesupperyfour;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[5]")
	private WebElement Creategaugesloweryfive;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[6]")
	private WebElement Creategaugeslowerysix;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[7]")
	private WebElement Creategaugesloweryseven;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[8]")
	private WebElement Creategaugesloweryeight;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[9]")
	private WebElement Creategaugeslowerynine;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[10]")
	private WebElement Creategaugesloweryten;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[11]")
	private WebElement Creategaugesfootstepyone;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[12]")
	private WebElement Creategaugesfootstepytwo;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[13]")
	private WebElement Creategaugesfootstepythree;
	@FindBy(xpath = "(//input[@placeholder=\"Y\"])[14]")
	private WebElement Creategaugesfootstepyfour;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[1]")
    private WebElement Upperplus;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[2]")
 	private WebElement Upperplustwo;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[3]")
 	private WebElement Upperplusthree;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[5]")
	private WebElement Lowerplus;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[6]")
   	private WebElement Lowerplustwo;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[7]")
   	private WebElement Lowerplusthree;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[8]")
   	private WebElement Lowerplusfour;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[9]")
   	private WebElement Lowerplusfive;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[11]")
	private WebElement Footstepplus;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[12]")
   	private WebElement Footstepplustwo;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[13]")
   	private WebElement Footstepplusthree;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[14]")
   	private WebElement Footstepplusfour;
    @FindBy(xpath = "//button[text()='Create Gauge							']")
    private WebElement Creategauge;
    @FindBy(xpath = "//button[@data-title=\"Vehicle Gauge\"]")
    private WebElement Createvehiclegauge;
    @FindBy(xpath = "//a[text()='Save']")
    private WebElement Creategaugessavebutton;
    
    
    
    public WebElement getUpperplustwo() {
		return Upperplustwo;
	}

	public WebElement getUpperplusthree() {
		return Upperplusthree;
	}

	public WebElement getLowerplustwo() {
		return Lowerplustwo;
	}

	public WebElement getLowerplusthree() {
		return Lowerplusthree;
	}

	public WebElement getLowerplusfour() {
		return Lowerplusfour;
	}

	public WebElement getLowerplusfive() {
		return Lowerplusfive;
	}

	public WebElement getFootstepplustwo() {
		return Footstepplustwo;
	}

	public WebElement getFootstepplusthree() {
		return Footstepplusthree;
	}

	public WebElement getFootstepplusfour() {
		return Footstepplusfour;
	}

	public WebElement getCreategaugessavebutton() {
		return Creategaugessavebutton;
	}

	public WebElement getCreategaugesnamebox() {
		return Creategaugesnamebox;
	}

	public WebElement getCreategaugesupperxone() {
		return Creategaugesupperxone;
	}

	public WebElement getCreategaugesupperxtwo() {
		return Creategaugesupperxtwo;
	}

	public WebElement getCreategaugesupperxthree() {
		return Creategaugesupperxthree;
	}

	public WebElement getCreategaugesupperxfour() {
		return Creategaugesupperxfour;
	}

	public WebElement getCreategaugeslowerxfive() {
		return Creategaugeslowerxfive;
	}

	public WebElement getCreategaugeslowerxsix() {
		return Creategaugeslowerxsix;
	}

	public WebElement getCreategaugeslowerxseven() {
		return Creategaugeslowerxseven;
	}

	public WebElement getCreategaugeslowerxeight() {
		return Creategaugeslowerxeight;
	}

	public WebElement getCreategaugeslowerxnine() {
		return Creategaugeslowerxnine;
	}

	public WebElement getCreategaugeslowerxten() {
		return Creategaugeslowerxten;
	}

	public WebElement getCreategaugesfootstepxone() {
		return Creategaugesfootstepxone;
	}

	public WebElement getCreategaugesfootstepxtwo() {
		return Creategaugesfootstepxtwo;
	}

	public WebElement getCreategaugesfootstepxthree() {
		return Creategaugesfootstepxthree;
	}

	public WebElement getCreategaugesfootstepxfour() {
		return Creategaugesfootstepxfour;
	}

	public WebElement getCreategaugesupperyone() {
		return Creategaugesupperyone;
	}

	public WebElement getCreategaugesupperytwo() {
		return Creategaugesupperytwo;
	}

	public WebElement getCreategaugesupperythree() {
		return Creategaugesupperythree;
	}

	public WebElement getCreategaugesupperyfour() {
		return Creategaugesupperyfour;
	}

	public WebElement getCreategaugesloweryfive() {
		return Creategaugesloweryfive;
	}

	public WebElement getCreategaugeslowerysix() {
		return Creategaugeslowerysix;
	}

	public WebElement getCreategaugesloweryseven() {
		return Creategaugesloweryseven;
	}

	public WebElement getCreategaugesloweryeight() {
		return Creategaugesloweryeight;
	}

	public WebElement getCreategaugeslowerynine() {
		return Creategaugeslowerynine;
	}

	public WebElement getCreategaugesloweryten() {
		return Creategaugesloweryten;
	}

	public WebElement getCreategaugesfootstepyone() {
		return Creategaugesfootstepyone;
	}

	public WebElement getCreategaugesfootstepytwo() {
		return Creategaugesfootstepytwo;
	}

	public WebElement getCreategaugesfootstepythree() {
		return Creategaugesfootstepythree;
	}

	public WebElement getCreategaugesfootstepyfour() {
		return Creategaugesfootstepyfour;
	}

	public WebElement getUpperplus() {
		return Upperplus;
	}

	public WebElement getLowerplus() {
		return Lowerplus;
	}

	public WebElement getFootstepplus() {
		return Footstepplus;
	}

	public WebElement getCreategauge() {
		return Creategauge;
	}

	public WebElement getCreatevehiclegauge() {
		return Createvehiclegauge;
	}
    
    
    
    // create bogie(main menu bogie option)

	

	@FindBy(xpath = "//a[text()='Assemblies']")
	private WebElement CreatebogiesAssembliesoption;
	@FindBy(xpath = "//a[text()='Parts']")
	private WebElement Createbogiespart;
	@FindBy(xpath = "//button[text()='Create Bogie						']")
	private WebElement Createbogiebutton;
	@FindBy(xpath = "(//a[contains(text(),'Shared')])[2]")
	private WebElement Createbogiesharedbutton;
	@FindBy(xpath = "//a[contains(text(),'Personal')]")
	private WebElement Createbogiepersonalbutton;
	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
	private WebElement Createbogiecencelbutton;
	@FindBy(xpath = "//button[text()='Create Part						']")
	private WebElement Createpartoption;
	@FindBy(xpath = "//button[@data-title=\"Hysteresis\"]")
	private WebElement Createhysteresis;
	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
	private WebElement Createbogicancelbutton;

	public WebElement getCreatepartoption() {
		return Createpartoption;
	}

	public WebElement getCreatehysteresis() {
		return Createhysteresis;
	}

	public WebElement getCreatebogicancelbutton() {
		return Createbogicancelbutton;
	}

	public WebElement getCreatebogiesAssembliesoption() {
		return CreatebogiesAssembliesoption;
	}

	public WebElement getCreatebogiespart() {
		return Createbogiespart;
	}

	public WebElement getCreatebogiebutton() {
		return Createbogiebutton;
	}

	public WebElement getCreatebogiesharedbutton() {
		return Createbogiesharedbutton;
	}

	public WebElement getCreatebogiepersonalbutton() {
		return Createbogiepersonalbutton;
	}

	public WebElement getCreatebogiecencelbutton() {
		return Createbogiecencelbutton;
	}

//under statistics locater(under the main menu)

	@FindBy(xpath = "//div[text()='Projects']")
	private WebElement Statisticsproject;
	@FindBy(xpath = "//div[text()='Sims']")
	private WebElement Statisticssim;
	@FindBy(xpath = "//div[text()='Trains']")
	private WebElement Statisticstrains;
	@FindBy(xpath = "//div[text()='Vehicles']")
	private WebElement Statisticsvehicles;
	@FindBy(xpath = "//div[text()='Buffer Stops']")
	private WebElement Statisticsbufferstops;
	@FindBy(xpath = "//div[text()='Gauges']")
	private WebElement Statisticsgauges;
	@FindBy(xpath = "//div[text()='Route Profiles']")
	private WebElement Statisticsrouteprofiles;
	@FindBy(xpath = "//div[text()='Coupling Interfaces']")
	private WebElement Statisticscouplinginterfaces;
	@FindBy(xpath = "//div[text()='Devices']")
	private WebElement Statisticsdevices;
	@FindBy(xpath = "//span[text()='Statistics']")
	private WebElement Statisticstitle;

	public WebElement getStatisticstitle() {
		return Statisticstitle;
	}

	public WebElement getStatisticsproject() {
		return Statisticsproject;
	}

	public WebElement getStatisticssim() {
		return Statisticssim;
	}

	public WebElement getStatisticstrains() {
		return Statisticstrains;
	}

	public WebElement getStatisticsvehicles() {
		return Statisticsvehicles;
	}

	public WebElement getStatisticsbufferstops() {
		return Statisticsbufferstops;
	}

	public WebElement getStatisticsgauges() {
		return Statisticsgauges;
	}

	public WebElement getStatisticsrouteprofiles() {
		return Statisticsrouteprofiles;
	}

	public WebElement getStatisticscouplinginterfaces() {
		return Statisticscouplinginterfaces;
	}

	public WebElement getStatisticsdevices() {
		return Statisticsdevices;
	}

	// Under the Get started Option(under main menu(payment options))

	@FindBy(xpath = "//a[text()='Get Started']")
	private WebElement Digitaltrainsgetstarted;
	@FindBy(xpath = "//a[text()='Buffer Stop Modelling']")
	private WebElement Getbufferstopoption;
	@FindBy(xpath = "//a[text()='Simulations']")
	private WebElement Getsimulationoption;
	@FindBy(xpath = "//a[text()='Train Modelling']")
	private WebElement Gettrainmodelling;
	@FindBy(xpath = "//a[text()='Route Profiles']")
	private WebElement Getrouteprofiles;
	@FindBy(xpath = "//a[text()='Infrastructure']")
	private WebElement Getinfrastructure;
	@FindBy(xpath = "//div[@class=\"panel-body services\"]")
	private WebElement Getstaetedbodyfortext;
	@FindBy(xpath = "//h5[text()='Custom train using library components']")
	private WebElement Customtrainusinglibrarycomponents;
	@FindBy(xpath = "//h5[text()='Customised vehicle geometry']")
	private WebElement Customisedvehiclegeometry;
	@FindBy(xpath = "//h5[text()='Custom bogie']")
	private WebElement Custombogies;
	@FindBy(xpath = "//h5[text()='Custom coupling interface using library components']")
	private WebElement Customcouplinginterfaceusinglibrarycomponents;
	@FindBy(xpath = "//h5[text()='Custom coupling Interface using user defined components']")
	private WebElement Customcouplinginterfaceusinguserdefinedcomponents;
	@FindBy(xpath = "//h5[text()='Hydraulic performance optimisation of a coupling interface']")
	private WebElement Hydraulicperformanceoptimisationofacpouplinginterface;
	@FindBy(xpath = "//h5[text()='Coupling interface Super Elements']")
	private WebElement Coupinginterfacesuperelements;
	@FindBy(xpath = "//h5[text()='Customised interface components (CAD)']")
	private WebElement CustomisedinterfacecomponentsCAD;
	@FindBy(xpath = "//h5[text()='Customised vehicle model (CAD)']")
	private WebElement Customisedvehiclemodel;
	@FindBy(xpath = "//h5[text()='Customised vehicle livery']")
	private WebElement Customisedvehiclelivery;
	@FindBy(xpath = "//h5[text()='Identical train impact simulation - longitudinal dynamics']")
	private WebElement Identicaltrainimpactsimulationlongitudionaldynamics;
	@FindBy(xpath = "//h5[text()='Identical train impact simulation - 3D multi body dynamics']")
	private WebElement Identicaltrainimpactsimulation3Dmultibodydynamics;
	@FindBy(xpath = "//h5[text()='Train to other train impact simulation - longitudinal dynamics']")
	private WebElement Traintoothertrainimpactsimulationlongitudionaldynamics;
	@FindBy(xpath = "//h5[text()='Train to other train impact simulation - 3D multi body dynamics']")
	private WebElement Traintoothertrainimpactsimulation3Dmultibobydynamics;
	@FindBy(xpath = "//h5[text()='Train to buffer stop simulation - longitudinal dynamics']")
	private WebElement Traintobufferstopsimulationlongitudinaldynamics;
	@FindBy(xpath = "//h5[text()='Train to buffer stop simulation - 3D multi body dynamics']")
	private WebElement Traintobufferstopsimulation3Dmultibodydynamics;
	@FindBy(xpath = "//h5[text()='Effect of braking characteristics on simulation']")
	private WebElement Effectofbrakingcharacteristicsonsimulation;
	@FindBy(xpath = "//h5[text()='Effect of drive characteristics on simulation']")
	private WebElement Effectofdrivercharacteristicsonsimulation;
	@FindBy(xpath = "//h5[text()='Effect of braking and drive characteristics on simulation']")
	private WebElement Effectofbrakinganddrivecharacteristicsonsimulation;
	@FindBy(xpath = "//h5[text()='Track lift vertical force applied to track']")
	private WebElement Trackliftverticalforceappliedtotrack;
	@FindBy(xpath = "//h5[text()='Optimised buffer stop performance - sliding']")
	private WebElement Optimisedbufferstopperformancesliding;
	@FindBy(xpath = "//h5[text()='Optimised buffer stop performance - hydraulic sliding']")
	private WebElement Optimisedbufferstopperformacehydraulicsliding;
	@FindBy(xpath = "//h5[text()='Optimised buffer stop performance - fixed sliding']")
	private WebElement Optimisedbufferstopperformancefixedsliding;
	@FindBy(xpath = "//h5[text()='Add structural CAD model to route profile']")
	private WebElement AddstructuralCADmodeltorouteprofile;
	@FindBy(xpath = "//h5[text()='Mapping & rendering background scene']")
	private WebElement Mappingrenderingbackgroundscene;
	@FindBy(xpath = "//h5[text()='Map existing railway from online mapping/satellite view']")
	private WebElement Mapexistingrailwayfromonlinemappingsateliteview;
	@FindBy(xpath = "//h5[text()='Map existing railway from GPS route data']")
	private WebElement MapexisitingrailwayfromGPSroutedata;
	@FindBy(xpath = "//h5[text()='Map railway using survey data']")
	private WebElement Maprailwayusingsurveydata;
	@FindBy(xpath = "//h5[text()='Creation of a test facility digital twin']")
	private WebElement Creationofatestfacilitydigitaltwin;
	@FindBy(xpath = "//h5[text()='Add event markers to route profile']")
	private WebElement Addeventmarkertorouteprofile;
	
	
	
	

	public WebElement getGetstaetedbodyfortext() {
		return Getstaetedbodyfortext;
	}

	public WebElement getGetbufferstopoption() {
		return Getbufferstopoption;
	}

	public WebElement getGetsimulationoption() {
		return Getsimulationoption;
	}

	public WebElement getGettrainmodelling() {
		return Gettrainmodelling;
	}

	public WebElement getGetrouteprofiles() {
		return Getrouteprofiles;
	}

	public WebElement getGetinfrastructure() {
		return Getinfrastructure;
	}

	public WebElement getDigitaltrainsgetstarted() {
		return Digitaltrainsgetstarted;
	}

	public WebElement getCustomtrainusinglibrarycomponents() {
		return Customtrainusinglibrarycomponents;
	}

	public WebElement getCustomisedvehiclegeometry() {
		return Customisedvehiclegeometry;
	}

	public WebElement getCustombogies() {
		return Custombogies;
	}

	public WebElement getCustomcouplinginterfaceusinglibrarycomponents() {
		return Customcouplinginterfaceusinglibrarycomponents;
	}

	public WebElement getCustomcouplinginterfaceusinguserdefinedcomponents() {
		return Customcouplinginterfaceusinguserdefinedcomponents;
	}

	public WebElement getHydraulicperformanceoptimisationofacpouplinginterface() {
		return Hydraulicperformanceoptimisationofacpouplinginterface;
	}

	public WebElement getCoupinginterfacesuperelements() {
		return Coupinginterfacesuperelements;
	}

	public WebElement getCustomisedinterfacecomponentsCAD() {
		return CustomisedinterfacecomponentsCAD;
	}

	public WebElement getCustomisedvehiclemodel() {
		return Customisedvehiclemodel;
	}

	public WebElement getCustomisedvehiclelivery() {
		return Customisedvehiclelivery;
	}

	public WebElement getIdenticaltrainimpactsimulationlongitudionaldynamics() {
		return Identicaltrainimpactsimulationlongitudionaldynamics;
	}

	public WebElement getIdenticaltrainimpactsimulation3Dmultibodydynamics() {
		return Identicaltrainimpactsimulation3Dmultibodydynamics;
	}

	public WebElement getTraintoothertrainimpactsimulationlongitudionaldynamics() {
		return Traintoothertrainimpactsimulationlongitudionaldynamics;
	}

	public WebElement getTraintoothertrainimpactsimulation3Dmultibobydynamics() {
		return Traintoothertrainimpactsimulation3Dmultibobydynamics;
	}

	public WebElement getTraintobufferstopsimulationlongitudinaldynamics() {
		return Traintobufferstopsimulationlongitudinaldynamics;
	}

	public WebElement getTraintobufferstopsimulation3Dmultibodydynamics() {
		return Traintobufferstopsimulation3Dmultibodydynamics;
	}

	public WebElement getEffectofbrakingcharacteristicsonsimulation() {
		return Effectofbrakingcharacteristicsonsimulation;
	}

	public WebElement getEffectofdrivercharacteristicsonsimulation() {
		return Effectofdrivercharacteristicsonsimulation;
	}

	public WebElement getEffectofbrakinganddrivecharacteristicsonsimulation() {
		return Effectofbrakinganddrivecharacteristicsonsimulation;
	}

	public WebElement getTrackliftverticalforceappliedtotrack() {
		return Trackliftverticalforceappliedtotrack;
	}

	public WebElement getOptimisedbufferstopperformancesliding() {
		return Optimisedbufferstopperformancesliding;
	}

	public WebElement getOptimisedbufferstopperformacehydraulicsliding() {
		return Optimisedbufferstopperformacehydraulicsliding;
	}

	public WebElement getOptimisedbufferstopperformancefixedsliding() {
		return Optimisedbufferstopperformancefixedsliding;
	}

	public WebElement getAddstructuralCADmodeltorouteprofile() {
		return AddstructuralCADmodeltorouteprofile;
	}

	public WebElement getMappingrenderingbackgroundscene() {
		return Mappingrenderingbackgroundscene;
	}

	public WebElement getMapexistingrailwayfromonlinemappingsateliteview() {
		return Mapexistingrailwayfromonlinemappingsateliteview;
	}

	public WebElement getMapexisitingrailwayfromGPSroutedata() {
		return MapexisitingrailwayfromGPSroutedata;
	}

	public WebElement getMaprailwayusingsurveydata() {
		return Maprailwayusingsurveydata;
	}

	public WebElement getCreationofatestfacilitydigitaltwin() {
		return Creationofatestfacilitydigitaltwin;
	}

	public WebElement getAddeventmarkertorouteprofile() {
		return Addeventmarkertorouteprofile;
	}

	// first employ basic payment option check locater
	
	@FindBy(xpath = "//div[contains(text(),'Upgrade')]")
	private WebElement Firstuserupgradescrolldown;
	@FindBy(xpath = "//a[text()='Upgrade your account']")
	private WebElement Firstuserupgradeyouraccountoption;
	@FindBy(xpath = "(//label[text()='Select feature'])[1]")
	private WebElement Firstuserselectimpact;
	@FindBy(xpath = "(//a[text()='Upgrade'])[4]")
	private WebElement Firstuserimpactselectviewoption;
	@FindBy(xpath = "(//a[text()='Upgrade'])[5]")
	private WebElement Firstuserimpactselectprooption;
	@FindBy(xpath = "(//a[text()='Upgrade'])[6]")
	private WebElement Firstuserimpactselectexpertoption;
	@FindBy(xpath = "(//label[text()='Select feature'])[2]")
	private WebElement Firstuserrunningtrainoption;
	@FindBy(xpath = "(//a[text()='Upgrade'])[10]")
	private WebElement Firstuserrunningtrainselectviewoption;;
	@FindBy(xpath = "(//a[text()='Upgrade'])[11]")
	private WebElement Firstuserrunningtrainselectprooption;
	@FindBy(xpath = "(//a[text()='Upgrade'])[12]")
	private WebElement Firstuserrunningtrainselectexpertoption;
	@FindBy(xpath = "(//label[text()='Select feature'])[3]")
	private WebElement Firstusergaugingoption;
	@FindBy(xpath = "(//a[text()='Upgrade'])[22]")
	private WebElement Firstusergaugingselectviewoption;
	@FindBy(xpath = "(//a[text()='Upgrade'])[23]")
	private WebElement Firstusergaugingselectprooption;
	@FindBy(xpath = "(//a[text()='Upgrade'])[24]")
	private WebElement Firstusergaugingselectexpertoption;
	@FindBy(xpath = "//a[text()='Users']")
	private WebElement Firstuseruseroption;
	@FindBy(xpath = "//a[text()='Subscriptions']")
	private WebElement Firstusersubscriptionoption;
	@FindBy(xpath = "//a[text()='Invoices']")
	private WebElement Firstuserinvoicesoption;
	@FindBy(xpath = "//a[text()='Update Payment Details']")
	private WebElement Firstuserupdatepaymentdetails;

	
	
	
	public WebElement getFirstuserupgradescrolldown() {
		return Firstuserupgradescrolldown;
	}

	public WebElement getFirstuserupgradeyouraccountoption() {
		return Firstuserupgradeyouraccountoption;
	}

	public WebElement getFirstuserselectimpact() {
		return Firstuserselectimpact;
	}

	public WebElement getFirstuserimpactselectviewoption() {
		return Firstuserimpactselectviewoption;
	}

	public WebElement getFirstuserimpactselectprooption() {
		return Firstuserimpactselectprooption;
	}

	public WebElement getFirstuserimpactselectexpertoption() {
		return Firstuserimpactselectexpertoption;
	}

	public WebElement getFirstuserrunningtrainoption() {
		return Firstuserrunningtrainoption;
	}

	public WebElement getFirstuserrunningtrainselectviewoption() {
		return Firstuserrunningtrainselectviewoption;
	}

	public WebElement getFirstuserrunningtrainselectprooption() {
		return Firstuserrunningtrainselectprooption;
	}

	public WebElement getFirstuserrunningtrainselectexpertoption() {
		return Firstuserrunningtrainselectexpertoption;
	}

	public WebElement getFirstusergaugingoption() {
		return Firstusergaugingoption;
	}

	public WebElement getFirstusergaugingselectviewoption() {
		return Firstusergaugingselectviewoption;
	}

	public WebElement getFirstusergaugingselectprooption() {
		return Firstusergaugingselectprooption;
	}

	public WebElement getFirstusergaugingselectexpertoption() {
		return Firstusergaugingselectexpertoption;
	}

	public WebElement getFirstuseruseroption() {
		return Firstuseruseroption;
	}

	public WebElement getFirstusersubscriptionoption() {
		return Firstusersubscriptionoption;
	}

	public WebElement getFirstuserinvoicesoption() {
		return Firstuserinvoicesoption;
	}

	public WebElement getFirstuserupdatepaymentdetails() {
		return Firstuserupdatepaymentdetails;
	}

	// fred jones payment option

	@FindBy(xpath = "(//a[text()='Fred Jones '])[1]")
	private WebElement Fredjonesoption;
	@FindBy(xpath = "//a[text()='Settings									']")
	private WebElement Fredjonessettingoption;
	@FindBy(xpath = "//a[text()='Upgrade your account']")
	private WebElement Fredjonesupgradeaccount;
	@FindBy(xpath = "(//label[text()='Select feature'])[1]")
	private WebElement Fredjonesselectfirstoption;
	@FindBy(xpath = "(//a[text()='Upgrade'])[4]")
	private WebElement Fredjonesupgradebutton;
	@FindBy(xpath = "//button[text()='Proceed to Payment']")
	private WebElement Fredjonesproceedtopayment;
	@FindBy(xpath = "//input[@id=\"Field-numberInput\"]")
	private WebElement Fredjonescardnumber;
	@FindBy(xpath = "//input[@placeholder=\"MM / YY\"]")
	private WebElement Fredjonesexpiredate;
	@FindBy(xpath = "//input[@placeholder=\"CVC\"]")
	private WebElement Fredjonescvcnumber;
	@FindBy(xpath = "//span[text()='Pay now']")
	private WebElement Fredjonespaynowbutton;

	public WebElement getFredjonesoption() {
		return Fredjonesoption;
	}

	public WebElement getFredjonessettingoption() {
		return Fredjonessettingoption;
	}

	public WebElement getFredjonesupgradeaccount() {
		return Fredjonesupgradeaccount;
	}

	public WebElement getFredjonesselectfirstoption() {
		return Fredjonesselectfirstoption;
	}

	public WebElement getFredjonesupgradebutton() {
		return Fredjonesupgradebutton;
	}

	public WebElement getFredjonesproceedtopayment() {
		return Fredjonesproceedtopayment;
	}

	public WebElement getFredjonescardnumber() {
		return Fredjonescardnumber;
	}

	public WebElement getFredjonesexpiredate() {
		return Fredjonesexpiredate;
	}

	public WebElement getFredjonescvcnumber() {
		return Fredjonescvcnumber;
	}

	public WebElement getFredjonespaynowbutton() {
		return Fredjonespaynowbutton;
	}

	// first user check the payment option(inside the upgrade option) locater

	@FindBy(xpath = "(//a[text()='First User '])[1]")
	private WebElement Firstuseroption;
	@FindBy(xpath = "//a[text()='Settings									']")
	private WebElement Firstusersettingoption;
	@FindBy(xpath = "//a[text()='Upgrade your account']")
	private WebElement Firstuserupgradeaccount;
	@FindBy(xpath = "(//label[text()='Select feature'])[1]")
	private WebElement Firstuserselectfirstoption;
	@FindBy(xpath = "(//a[text()='Upgrade'])[4]")
	private WebElement Firstuserupgradebutton;
	@FindBy(xpath = "//button[text()='Proceed to Payment']")
	private WebElement Firstuserproceedtopayment;
	@FindBy(xpath = "//input[@id=\"Field-numberInput\"]")
	private WebElement Firstusercardnumber;
	@FindBy(xpath = "//input[@placeholder=\"MM / YY\"]")
	private WebElement Firstuserexpiredate;
	@FindBy(xpath = "//input[@placeholder=\"CVC\"]")
	private WebElement Firstusercvcnumber;
	@FindBy(xpath = "//span[text()='Pay now']")
	private WebElement Firstuserpaynowbutton;
	@FindBy(xpath = "(//iframe[@allow=\"payment *\"])[1]")
	private WebElement Firstuserpaymentoptioninsideframe;
	@FindBy(xpath = "//a[text()='Hemkumar D ']")
	private WebElement hemkumaruseroption;
	@FindBy(xpath = "//a[text()='Fred Jones ']")
	private WebElement Fredjohnoption;
	@FindBy(xpath = "//a[text()='John Smith ']")
	private WebElement Johnsmithoption;
	@FindBy(xpath = "//a[text()='Subscriptions']")
	private WebElement FirstuserSubscriptions;
	@FindBy(xpath = "//a[text()='14']")
	private WebElement Firstuserselectlastpage;
	@FindBy(xpath = "(//button[@style=\"visibility: hidden;\"])[4]")
	private WebElement Firstuseractionsbutton;
	@FindBy(xpath = "(//span[text()='Cancel Subscription (Immediate)'])[4]")
	private WebElement Firstusercancelsub;
	@FindBy(xpath = "(//button[text()='Confirm'])[2]")
	private WebElement Firstuserconfirmbutton;
	@FindBy(xpath = "(//div[@class=\"col-sm-12\"])[2]")
	private WebElement Firstuserpaymentbody;
	

	public WebElement getFirstuserpaymentbody() {
		return Firstuserpaymentbody;
	}

	public WebElement getFirstuserSubscriptions() {
		return FirstuserSubscriptions;
	}

	public WebElement getFirstuserselectlastpage() {
		return Firstuserselectlastpage;
	}

	public WebElement getFirstuseractionsbutton() {
		return Firstuseractionsbutton;
	}

	public WebElement getFirstusercancelsub() {
		return Firstusercancelsub;
	}

	public WebElement getFirstuserconfirmbutton() {
		return Firstuserconfirmbutton;
	}

	public WebElement getFredjohnoption() {
		return Fredjohnoption;
	}

	public WebElement getJohnsmithoption() {
		return Johnsmithoption;
	}

	public WebElement getHemkumaruseroption() {
		return hemkumaruseroption;
	}

	public WebElement getFirstuserpaymentoptioninsideframe() {
		return Firstuserpaymentoptioninsideframe;
	}

	public WebElement getFirstuseroption() {
		return Firstuseroption;
	}

	public WebElement getFirstusersettingoption() {
		return Firstusersettingoption;
	}

	public WebElement getFirstuserupgradeaccount() {
		return Firstuserupgradeaccount;
	}

	public WebElement getFirstuserselectfirstoption() {
		return Firstuserselectfirstoption;
	}

	public WebElement getFirstuserupgradebutton() {
		return Firstuserupgradebutton;
	}

	public WebElement getFirstuserproceedtopayment() {
		return Firstuserproceedtopayment;
	}

	public WebElement getFirstusercardnumber() {
		return Firstusercardnumber;
	}

	public WebElement getFirstuserexpiredate() {
		return Firstuserexpiredate;
	}

	public WebElement getFirstusercvcnumber() {
		return Firstusercvcnumber;
	}

	public WebElement getFirstuserpaynowbutton() {
		return Firstuserpaynowbutton;
	}

	// first user invalid card and decline card ,insufficient balance card locater
	
	@FindBy(xpath = "//div[text()='A processing error occurred.']")
	private WebElement Processingerroroccurred;
	@FindBy(xpath = "//div[text()='Your card has been declined.']")
	private WebElement Yourcardhasbeendeclined;
	@FindBy(xpath = "//form[@id=\"payment-form\"]")
	private WebElement viewresult;

	public WebElement getViewresult() {
		return viewresult;
	}

	public WebElement getProcessingerroroccurred() {
		return Processingerroroccurred;
	}

	public WebElement getYourcardhasbeendeclined() {
		return Yourcardhasbeendeclined;
	}

	// fred jones add new plan locater(setting > User >Addplan)

	@FindBy(xpath = "//a[text()='Users']")
	private WebElement Fredjonesuserbutton;
	@FindBy(xpath = "//a[text()=' Add User Plan']")
	private WebElement Fredjonesadduserplan;
	@FindBy(xpath = "//label[@class=\"btn btn-primary \"]")
	private WebElement Fredjonesexistinguseroption;
	@FindBy(xpath = "//option[text()='Please select....']")
	private WebElement Fredjonesselectuserbox;
	@FindBy(xpath = "//option[text()='John Smith']")
	private WebElement Fredjonesaddjohnsmithaccount;
	@FindBy(xpath = "//option[text()='Please select subscription length']")
	private WebElement Fredjonesselectsubscriptionbox;
	@FindBy(xpath = "//option[text()='Monthly']")
	private WebElement Fredjonesmonthlysubscription;
	@FindBy(xpath = "//option[text()='Please select...']")
	private WebElement Fredjonesselectsubscriptionlistbox;
	@FindBy(xpath = "//option[text()='DigitalTrains Impact - Expert']")
	private WebElement Fredjonesselectexpertimpactoption;
	@FindBy(xpath = "//button[text()='Confirm & Pay']")
	private WebElement Fredjonesconfirmpaybutton;
	@FindBy(xpath = "//button[text()='Pay']")
	private WebElement Fredjonespaybutton;

	public WebElement getFredjonesuserbutton() {
		return Fredjonesuserbutton;
	}

	public WebElement getFredjonesadduserplan() {
		return Fredjonesadduserplan;
	}

	public WebElement getFredjonesexistinguseroption() {
		return Fredjonesexistinguseroption;
	}

	public WebElement getFredjonesselectuserbox() {
		return Fredjonesselectuserbox;
	}

	public WebElement getFredjonesaddjohnsmithaccount() {
		return Fredjonesaddjohnsmithaccount;
	}

	public WebElement getFredjonesselectsubscriptionbox() {
		return Fredjonesselectsubscriptionbox;
	}

	public WebElement getFredjonesmonthlysubscription() {
		return Fredjonesmonthlysubscription;
	}

	public WebElement getFredjonesselectsubscriptionlistbox() {
		return Fredjonesselectsubscriptionlistbox;
	}

	public WebElement getFredjonesselectexpertimpactoption() {
		return Fredjonesselectexpertimpactoption;
	}

	public WebElement getFredjonesconfirmpaybutton() {
		return Fredjonesconfirmpaybutton;
	}

	public WebElement getFredjonespaybutton() {
		return Fredjonespaybutton;
	}
	
	//john smith account to check upgrade or not locater
	
	@FindBy(xpath = "//button[text()='Create Project							']")
	private WebElement Johnsmithprojectoption;
	@FindBy(xpath = "//button[text()='Create Simulation								']")
	private WebElement Johnsmithcreatesimulationoption;
	@FindBy(xpath = "//a[text()='Create a Simulation']")
	private WebElement Johnsmithcreateasimulation;
	

	public WebElement getJohnsmithcreateasimulation() {
		return Johnsmithcreateasimulation;
	}

	public WebElement getJohnsmithprojectoption() {
		return Johnsmithprojectoption;
	}

	public WebElement getJohnsmithcreatesimulationoption() {
		return Johnsmithcreatesimulationoption;
	}


	// create bogie option locater

	@FindBy(xpath = "//a[text()='Assemblies']")
	private WebElement Bogiesassembliesoption;
	@FindBy(xpath = "//a[text()='Parts']")
	private WebElement Bogiespartsoption;
	@FindBy(xpath = "//button[text()='Create Bogie						']")
	private WebElement Createbogie;
	@FindBy(xpath = "//button[text()='Create Part						']")
	private WebElement Bogiescreatepart;
	@FindBy(xpath = "//button[@data-title=\"Mass\"]") 
	private WebElement Bogiesmass;
	@FindBy(xpath = "//button[@data-title=\"Wheelset\"]")
	private WebElement Bogieswheelset;
	@FindBy(xpath = "//button[@data-title=\"Air Spring\"]")
	private WebElement Bogiesairspring;
	@FindBy(xpath = "//button[@data-title=\"Bumpstop\"]")
	private WebElement Bogiesbumpstop;
	@FindBy(xpath = "//button[@data-title=\"Bush\"]")
	private WebElement Bogiesbush;
	@FindBy(xpath = "//button[@data-title=\"Damper\"]")
	private WebElement Bogiesdamper;
	@FindBy(xpath = "//button[@data-title=\"Friction\"]")
	private WebElement Bogiesfriction;
	@FindBy(xpath = "//button[@data-title=\"Pinlink\"]")
	private WebElement Bogiespinlink;
	@FindBy(xpath = "//button[@data-title=\"Stiffness\"]")
	private WebElement Bogiesstiffness;
	@FindBy(xpath = "//button[@data-part_type=\"shear-spring\"]")
	private WebElement Bogiesshearspring;
	@FindBy(xpath = "//button[@data-title=\"Hysteresis\"]")
	private WebElement Bogieshysteresis;

	public WebElement getBogiesassembliesoption() {
		return Bogiesassembliesoption;
	}

	public WebElement getBogiespartsoption() {
		return Bogiespartsoption;
	}

	public WebElement getCreatebogie() {
		return Createbogie;
	}

	public WebElement getBogiescreatepart() {
		return Bogiescreatepart;
	}

	public WebElement getBogiesmass() {
		return Bogiesmass;
	}

	public WebElement getBogieswheelset() {
		return Bogieswheelset;
	}

	public WebElement getBogiesairspring() {
		return Bogiesairspring;
	}

	public WebElement getBogiesbumpstop() {
		return Bogiesbumpstop;
	}

	public WebElement getBogiesbush() {
		return Bogiesbush;
	}

	public WebElement getBogiesdamper() {
		return Bogiesdamper;
	}

	public WebElement getBogiesfriction() {
		return Bogiesfriction;
	}

	public WebElement getBogiespinlink() {
		return Bogiespinlink;
	}

	public WebElement getBogiesstiffness() {
		return Bogiesstiffness;
	}

	public WebElement getBogiesshearspring() {
		return Bogiesshearspring;
	}

	public WebElement getBogieshysteresis() {
		return Bogieshysteresis;
	}

	// Create bogie parts Mass

	@FindBy(xpath = "(//input[@name=\"part_name\"])[1]")
	private WebElement Bogiespartmassnamebox;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][mass]\"])[1]")
	private WebElement Bogiespartmassmassbox;
	@FindBy(name = "part_data[inertia][roll_inertia]")
	private WebElement Bogiespartmassrollinertia;
	@FindBy(name = "part_data[inertia][pitch_inertia]")
	private WebElement Bogiespartmasspitchinertia;
	@FindBy(name = "part_data[inertia][pitch_inertia_units]")
	private WebElement Bogiespartmasspitchinertiaunits;
	@FindBy(name = "part_data[inertia][yaw_inertia]")
	private WebElement Bogiespartmassyawinertia;
	@FindBy(xpath = "(//a[contains(text(),'Appearance')])[1]")
	private WebElement Bogiespartappearance;
	@FindBy(xpath = "(//span[text()='No Custom Model Selected'])[1]")
	private WebElement Bogiespartmassnocustommodelselected;
	@FindBy(xpath = "(//input[@name=\"part_data[appearance][colour]\"])[1]")
	private WebElement Bogiespartmasscolour;
	@FindBy(xpath = "(//a[text()='Save'])[1]")
	private WebElement Bogiespartmasssavebutton;
	@FindBy(xpath = "//div[@class=\"main-body \"]")
	private WebElement Bogiepartmainbody;
	

	
	public WebElement getBogiepartmainbody() {
		return Bogiepartmainbody;
	}

	public WebElement getBogiespartmassnamebox() {
		return Bogiespartmassnamebox;
	}

	public WebElement getBogiespartmassmassbox() {
		return Bogiespartmassmassbox;
	}

	public WebElement getBogiespartmassrollinertia() {
		return Bogiespartmassrollinertia;
	}

	public WebElement getBogiespartmasspitchinertia() {
		return Bogiespartmasspitchinertia;
	}

	public WebElement getBogiespartmasspitchinertiaunits() {
		return Bogiespartmasspitchinertiaunits;
	}

	public WebElement getBogiespartmassyawinertia() {
		return Bogiespartmassyawinertia;
	}

	public WebElement getBogiespartappearance() {
		return Bogiespartappearance;
	}

	public WebElement getBogiespartmassnocustommodelselected() {
		return Bogiespartmassnocustommodelselected;
	}

	public WebElement getBogiespartmasscolour() {
		return Bogiespartmasscolour;
	}

	public WebElement getBogiespartmasssavebutton() {
		return Bogiespartmasssavebutton;
	}

	// create bogie part wheel set(inside the Bogie option)
	
    @FindBy(xpath = "//button[@data-title=\"Wheelset\"]")
    private WebElement Bogiespartwheelset;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[2]")
	private WebElement Bogiespartwheelsetnamebox;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][mass]\"])[2]")
	private WebElement Bogiespartwheelsetmass;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][roll_inertia]\"])[2]")
	private WebElement Bogiespartwheelsetrollinertia;
	@FindBy(name = "part_data[inertia][has_axel_pitch_inertia]")
	private WebElement Bogiespartwheelsetaxelpitchinertia;
	@FindBy(xpath = "//input[@ name=\"part_data[inertia][axel_pitch_inertia]\"]")
	private WebElement Bogiespartwheelsetaxelpitchinertiabox;
	@FindBy(xpath = "(//a[text()='Save'])[2]")
	private WebElement Bogiespartwheelsetsave;

	
	
	public WebElement getBogiespartwheelset() {
		return Bogiespartwheelset;
	}

	public WebElement getBogiespartwheelsetnamebox() {
		return Bogiespartwheelsetnamebox;
	}

	public WebElement getBogiespartwheelsetmass() {
		return Bogiespartwheelsetmass;
	}

	public WebElement getBogiespartwheelsetrollinertia() {
		return Bogiespartwheelsetrollinertia;
	}

	public WebElement getBogiespartwheelsetaxelpitchinertia() {
		return Bogiespartwheelsetaxelpitchinertia;
	}

	public WebElement getBogiespartwheelsetaxelpitchinertiabox() {
		return Bogiespartwheelsetaxelpitchinertiabox;
	}

	public WebElement getBogiespartwheelsetsave() {
		return Bogiespartwheelsetsave;
	}

	// create bogie part shear spring

	@FindBy(xpath = "(//input[@name=\"part_name\"])[11]")
	private WebElement Bogiespartshearspringpartnamebox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[11]")
	private WebElement Bogiespartshearspringxbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[11]")
	private WebElement Bogiespartshearspringybox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[11]")
	private WebElement Bogiespartsheatspringzbox;
	@FindBy(xpath = "(//a[text()='Save'])[11]")
	private WebElement Bogiespartshearspringsavebutton;

	public WebElement getBogiespartshearspringpartnamebox() {
		return Bogiespartshearspringpartnamebox;
	}

	public WebElement getBogiespartshearspringxbox() {
		return Bogiespartshearspringxbox;
	}

	public WebElement getBogiespartshearspringybox() {
		return Bogiespartshearspringybox;
	}

	public WebElement getBogiespartsheatspringzbox() {
		return Bogiespartsheatspringzbox;
	}

	public WebElement getBogiespartshearspringsavebutton() {
		return Bogiespartshearspringsavebutton;
	}

	// create bogie friction(Inside of bogie option)

	@FindBy(xpath = "(//input[@name=\"part_name\"])[8]")
	private WebElement Bogiespartfrictionnamebox;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[5]")
	private WebElement Bogiespartfrictiondetailedoption;
	@FindBy(xpath = "//input[@name=\"part_data[friction][compression]\"]")
	private WebElement Bogiespartfrictioncoefficientoffrictioncompression;
	@FindBy(xpath = "//input[@name=\"part_data[friction][tension]\"]")
	private WebElement Bogiespartfrictioncoefficientoffrictiontension;
	@FindBy(xpath = "//input[@name=\"part_data[friction][load]\"]")
	private WebElement Bogiespartfrictionstaticpartofnormalload;
	@FindBy(xpath = "(//a[contains(text(),'Stiffness/Damping')])[2]")
	private WebElement Bogiespartfrictionstiffnessdampingbutton;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][has_series_stiffness]\"]")
	private WebElement Bogiespartfrictionstiffnessdampingcheckboxs;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][series_stiffness]\"])[2]")
	private WebElement Bogiespartfrictionstiffnessdampingseriesstiffnessbox;
	@FindBy(xpath = "(//a[text()='Save'])[8]")
	private WebElement Bogiespartfrictionstiffnessdampingsavebutton;

	public WebElement getBogiespartfrictionnamebox() {
		return Bogiespartfrictionnamebox;
	}

	public WebElement getBogiespartfrictiondetailedoption() {
		return Bogiespartfrictiondetailedoption;
	}

	public WebElement getBogiespartfrictioncoefficientoffrictioncompression() {
		return Bogiespartfrictioncoefficientoffrictioncompression;
	}

	public WebElement getBogiespartfrictioncoefficientoffrictiontension() {
		return Bogiespartfrictioncoefficientoffrictiontension;
	}

	public WebElement getBogiespartfrictionstaticpartofnormalload() {
		return Bogiespartfrictionstaticpartofnormalload;
	}

	public WebElement getBogiespartfrictionstiffnessdampingbutton() {
		return Bogiespartfrictionstiffnessdampingbutton;
	}

	public WebElement getBogiespartfrictionstiffnessdampingcheckboxs() {
		return Bogiespartfrictionstiffnessdampingcheckboxs;
	}

	public WebElement getBogiespartfrictionstiffnessdampingseriesstiffnessbox() {
		return Bogiespartfrictionstiffnessdampingseriesstiffnessbox;
	}

	public WebElement getBogiespartfrictionstiffnessdampingsavebutton() {
		return Bogiespartfrictionstiffnessdampingsavebutton;
	}

	// create Bogies Bump Stop (Inside the bogies part bump stop) locater

	@FindBy(xpath = "(//input[@name=\"part_name\"])[4]")
	private WebElement Bogiespartbumpstopnamebox;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[2]")
	private WebElement Bogiespartbumpstopplusbutton;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[3]")
	private WebElement Bogiespartbumpstopplusbuttontwo;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[4]")
	private WebElement Bogiespartbumpstopplusbuttonthree;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[5]")
	private WebElement Bogiespartbumpstopplusbuttonfoure;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[6]")
	private WebElement Bogiespartbumpstopstrokefive;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[5]")
	private WebElement Bogiespartbumpstopstrokefour;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[4]")
	private WebElement Bogiespartbumpstopstrokethree;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[3]")
	private WebElement Bogiespartbumpstopstroketwo;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[2]")
	private WebElement Bogiespartbumpstopstrokeone;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[6]")
	private WebElement Bogiespartbumpstopforcefive;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[5]")
	private WebElement Bogiespartbumpstopforcefour;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[4]")
	private WebElement Bogiespartbumpstopforcethree;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[3]")
	private WebElement Bogiespartbumpstopforcetwo;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[2]")
	private WebElement Bogiespartbumpstopforceone;
	@FindBy(name = "part_data[stiffness][has_offset]")
	private WebElement Bogiespartbumpstopdefineoffset;
	@FindBy(xpath = "//input[@value=\"clearance\"]")
	private WebElement Bogiespartbumpstopclearancerediobutton;
	@FindBy(xpath = "(//input[@data-toggle=\"dropdown\"])[2]")
	private WebElement Bogiespartbumpstopclearancebox;
	@FindBy(xpath = "(//a[text()='Save'])[4]")
	private WebElement Bogiespartbumpstopsavebutton;

	public WebElement getBogiespartbumpstopstrokefive() {
		return Bogiespartbumpstopstrokefive;
	}

	public WebElement getBogiespartbumpstopstrokefour() {
		return Bogiespartbumpstopstrokefour;
	}

	public WebElement getBogiespartbumpstopforcefive() {
		return Bogiespartbumpstopforcefive;
	}

	public WebElement getBogiespartbumpstopforcefour() {
		return Bogiespartbumpstopforcefour;
	}

	public WebElement getBogiespartbumpstopplusbuttonthree() {
		return Bogiespartbumpstopplusbuttonthree;
	}

	public WebElement getBogiespartbumpstopplusbuttonfoure() {
		return Bogiespartbumpstopplusbuttonfoure;
	}

	public WebElement getBogiespartbumpstopplusbuttontwo() {
		return Bogiespartbumpstopplusbuttontwo;
	}

	public WebElement getBogiespartbumpstopnamebox() {
		return Bogiespartbumpstopnamebox;
	}

	public WebElement getBogiespartbumpstopplusbutton() {
		return Bogiespartbumpstopplusbutton;
	}

	public WebElement getBogiespartbumpstopstrokethree() {
		return Bogiespartbumpstopstrokethree;
	}

	public WebElement getBogiespartbumpstopstroketwo() {
		return Bogiespartbumpstopstroketwo;
	}

	public WebElement getBogiespartbumpstopstrokeone() {
		return Bogiespartbumpstopstrokeone;
	}

	public WebElement getBogiespartbumpstopforcethree() {
		return Bogiespartbumpstopforcethree;
	}

	public WebElement getBogiespartbumpstopforcetwo() {
		return Bogiespartbumpstopforcetwo;
	}

	public WebElement getBogiespartbumpstopforceone() {
		return Bogiespartbumpstopforceone;
	}

	public WebElement getBogiespartbumpstopdefineoffset() {
		return Bogiespartbumpstopdefineoffset;
	}

	public WebElement getBogiespartbumpstopclearancerediobutton() {
		return Bogiespartbumpstopclearancerediobutton;
	}

	public WebElement getBogiespartbumpstopclearancebox() {
		return Bogiespartbumpstopclearancebox;
	}

	public WebElement getBogiespartbumpstopsavebutton() {
		return Bogiespartbumpstopsavebutton;
	}

	// create bogie Bush (Inside of bogie part option)locater

	@FindBy(xpath = "(//input[@name=\"part_name\"])[5]")
	private WebElement Bogiespartbushpartname;
	@FindBy(name = "part_data[stiffness][has_stiffness]")
	private WebElement Bogiespartbushhasstiffnessrediobutton;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][x]\"]")
	private WebElement Bogiespartbushxbox;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][y]\"]")
	private WebElement Bogiespartbushybox;
	@FindBy(xpath = "(//a[contains(text(),'Appearance')])[4]")
	private WebElement Bogiespartbushappearancebutton;
	@FindBy(xpath = "//input[@value=\"small\"]")
	private WebElement Bogiespartbushsizesmall;
	@FindBy(xpath = "//input[@value=\"z\"]")
	private WebElement Bogiespartbushaxisz;
	@FindBy(xpath = "(//a[text()='Save'])[5]")
	private WebElement Bogiespartbushsavebutton;

	public WebElement getBogiespartbushpartname() {
		return Bogiespartbushpartname;
	}

	public WebElement getBogiespartbushhasstiffnessrediobutton() {
		return Bogiespartbushhasstiffnessrediobutton;
	}

	public WebElement getBogiespartbushxbox() {
		return Bogiespartbushxbox;
	}

	public WebElement getBogiespartbushybox() {
		return Bogiespartbushybox;
	}

	public WebElement getBogiespartbushappearancebutton() {
		return Bogiespartbushappearancebutton;
	}

	public WebElement getBogiespartbushsizesmall() {
		return Bogiespartbushsizesmall;
	}

	public WebElement getBogiespartbushaxisz() {
		return Bogiespartbushaxisz;
	}

	public WebElement getBogiespartbushsavebutton() {
		return Bogiespartbushsavebutton;
	}

	// create bogies stiffness(Inside the bogies part option) locater

	@FindBy(xpath = "(//input[@name=\"part_name\"])[10]")
	private WebElement Bogiespartsiffnesspartnamebox;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][linear]\"]")
	private WebElement Bogiespartstiffnesslinearstiffness;
	@FindBy(xpath = "(//a[text()='Save'])[10]")
	private WebElement Bogiespartstiffnesssavebutton;

	public WebElement getBogiespartsiffnesspartnamebox() {
		return Bogiespartsiffnesspartnamebox;
	}

	public WebElement getBogiespartstiffnesslinearstiffness() {
		return Bogiespartstiffnesslinearstiffness;
	}

	public WebElement getBogiespartstiffnesssavebutton() {
		return Bogiespartstiffnesssavebutton;
	}

	// create bogie shear spring (inside the bogie part option)locater
	
	@FindBy(xpath = "(//a[text()='Choose from library'])[10]")
	private WebElement Bogiesshearspringchoosefromlibrary;
	@FindBy(xpath = "(//input[@class=\"form-control\"])[11]")
	private WebElement Bogiesshearspringpartnamebox;
	@FindBy(xpath = "//input[@name=\"part_data[spring][x]\"]")
	private WebElement Bogiesshearspringxbox;
	@FindBy(xpath = "//input[@name=\"part_data[spring][y]\"]")
	private WebElement Bogiesshearspringybox;
	@FindBy(xpath = "//input[@name=\"part_data[spring][z]\"]")
	private WebElement Bogiesshearspringzbox;
	@FindBy(xpath = "(//a[text()='Save'])[11]")
	private WebElement Bogiesshearspringsavebutton;

	public WebElement getBogiesshearspringchoosefromlibrary() {
		return Bogiesshearspringchoosefromlibrary;
	}

	public WebElement getBogiesshearspringpartnamebox() {
		return Bogiesshearspringpartnamebox;
	}

	public WebElement getBogiesshearspringxbox() {
		return Bogiesshearspringxbox;
	}

	public WebElement getBogiesshearspringybox() {
		return Bogiesshearspringybox;
	}

	public WebElement getBogiesshearspringzbox() {
		return Bogiesshearspringzbox;
	}

	public WebElement getBogiesshearspringsavebutton() {
		return Bogiesshearspringsavebutton;
	}

	public WebElement getAddshearspringchoosefromlibrary() {
		return Addshearspringchoosefromlibrary;
	}

	public WebElement getAddshearspringbubliclibrarybox() {
		return Addshearspringbubliclibrarybox;
	}

	public WebElement getShearspringactionsbutton() {
		return Shearspringactionsbutton;
	}

	public WebElement getShearspringeditbox() {
		return Shearspringeditbox;
	}
	
	//Delete bulk bogies option(inside of Bogies option) locater
	
	@FindBy(xpath = "//button[text()='Bulk Delete						']")
	private WebElement Bulkdeleteoptioninbogiespart;
	@FindBy(xpath = "//button[text()='Select All								']")
	private WebElement Selectalloptioninbogiespart;
	@FindBy(xpath = "//button[text()='Delete all selected 								']")
    private WebElement Deleteallbuttoninbogiespart;
	

	public WebElement getBulkdeleteoptioninbogiespart() {
		return Bulkdeleteoptioninbogiespart;
	}

	public WebElement getSelectalloptioninbogiespart() {
		return Selectalloptioninbogiespart;
	}

	public WebElement getDeleteallbuttoninbogiespart() {
		return Deleteallbuttoninbogiespart;
	}
	
	//Delete bogies assembly (inside of bogies assembly option)locater
	
	@FindBy(xpath = "//button[text()='Bulk Delete						']")
	private WebElement Bulkdeleteoptioninbogiesassembly;
	@FindBy(xpath = "//button[text()='Select All								']")
	private WebElement Sellectalloptionbogiesassembly;
	@FindBy(xpath = "//button[text()='Delete all selected 								']")
	private WebElement Deleteallbuttoninbogiesassembly;

	public WebElement getBulkdeleteoptioninbogiesassembly() {
		return Bulkdeleteoptioninbogiesassembly;
	}

	public WebElement getSellectalloptionbogiesassembly() {
		return Sellectalloptionbogiesassembly;
	}

	public WebElement getDeleteallbuttoninbogiesassembly() {
		return Deleteallbuttoninbogiesassembly;
	}

	
	
	// create hydraulic sliding buffer stop(Inside the buffer stop option)locater


	@FindBy(xpath = "(//a[contains(text(),'Personal')])[2]")
	private WebElement Bufferstoppersonaloption;
	@FindBy(xpath = "//select[@data-placeholder=\"Select Buffer Stop Type\"]")
	private WebElement Bufferstopselectbufferstoptype;
	@FindBy(xpath = "//select[@data-placeholder=\"Select Contact Type\"]")
	private WebElement Bufferstopselectcontacttype;
	@FindBy(xpath = "(//span[text()='Select a Template Buffer Stop'])[2]")
	private WebElement Bufferstopselecttemlatebufferstop;
	@FindBy(xpath = "//button[text()='Select Template']")
	private WebElement Bufferstopselecttemplatebuttonslidingbuffer;
	@FindBy(id = "sliding")
	private WebElement Bufferstopselectslidingtype;
	@FindBy(xpath = "//option[@data-name=\"Centre contact\"]")
	private WebElement Bufferstopselectcentercontact;
	@FindBy(xpath = "//button[text()='Select Template']")
	private WebElement Bufferstopselecttemplatebuttoninslidingbufferstop;
	@FindBy(xpath = "//li[text()='Coupler Sliding BufferStop']")
	private WebElement Bufferstopselecttemplatecouplerslidingbufferstop;
	@FindBy(xpath = "//a[text()='Save & Review']")
	private WebElement Bufferstopsaveandreviewslidingbufferstop;
	@FindBy(xpath = "(//span[@class='glyphicon glyphicon-plus'])[3]")
	private WebElement Bufferstopaddfrictionshoes;
	@FindBy(xpath = "(//button[contains(text(),'Attach')])[5]")
	private WebElement Bufferstopattachfrictionshoes;
	@FindBy(xpath = "//input[@name=\"device_data[spec][back_elem]\"]")
	private WebElement Bufferstopeditfrictionshoes;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement Bufferstopsaveditfrictionshoes;
	@FindBy(xpath = "//a[text()='3D']")
	private WebElement Bufferstopfrictionshoes3dview;

	public WebElement getBufferstoppersonaloption() {
		return Bufferstoppersonaloption;
	}

	public WebElement getBufferstopselectbufferstoptype() {
		return Bufferstopselectbufferstoptype;
	}

	public WebElement getBufferstopselectcontacttype() {
		return Bufferstopselectcontacttype;
	}

	public WebElement getBufferstopselecttemlatebufferstop() {
		return Bufferstopselecttemlatebufferstop;
	}

	public WebElement getBufferstopselecttemplatebuttonslidingbuffer() {
		return Bufferstopselecttemplatebuttonslidingbuffer;
	}

	public WebElement getBufferstopselectslidingtype() {
		return Bufferstopselectslidingtype;
	}

	public WebElement getBufferstopselectcentercontact() {
		return Bufferstopselectcentercontact;
	}

	public WebElement getBufferstopselecttemplatebuttoninslidingbufferstop() {
		return Bufferstopselecttemplatebuttoninslidingbufferstop;
	}

	public WebElement getBufferstopselecttemplatecouplerslidingbufferstop() {
		return Bufferstopselecttemplatecouplerslidingbufferstop;
	}

	public WebElement getBufferstopsaveandreviewslidingbufferstop() {
		return Bufferstopsaveandreviewslidingbufferstop;
	}

	public WebElement getBufferstopaddfrictionshoes() {
		return Bufferstopaddfrictionshoes;
	}

	public WebElement getBufferstopattachfrictionshoes() {
		return Bufferstopattachfrictionshoes;
	}

	public WebElement getBufferstopeditfrictionshoes() {
		return Bufferstopeditfrictionshoes;
	}

	public WebElement getBufferstopsaveditfrictionshoes() {
		return Bufferstopsaveditfrictionshoes;
	}

	public WebElement getBufferstopfrictionshoes3dview() {
		return Bufferstopfrictionshoes3dview;
	}

	// create bogies Assambly option(inside the bogies)locater(4546)

	@FindBy(xpath = "//button[text()='Create Bogie						']")
	private WebElement bogiescreatebogiesoption;
	@FindBy(xpath = "(//a[@role=\"button\"])[6]")
	private WebElement bogiescreatebogiespersonaloption;
	@FindBy(xpath = "(//input[@name=\"bogie_name\"])[1]")
	private WebElement bogiescreatebogiesentername;
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement bogiescreatebogiescreatebutton;
	@FindBy(xpath = "(//form[@class=\"js-modal-body-form\"])[1]")
	private WebElement bogiescreatebogiesform;

	public WebElement getBogiescreatebogiesform() {
		return bogiescreatebogiesform;
	}

	public WebElement getBogiescreatebogiesoption() {
		return bogiescreatebogiesoption;
	}

	public WebElement getBogiescreatebogiespersonaloption() {
		return bogiescreatebogiespersonaloption;
	}

	public WebElement getBogiescreatebogiesentername() {
		return bogiescreatebogiesentername;
	}

	public WebElement getBogiescreatebogiescreatebutton() {
		return bogiescreatebogiescreatebutton;
	}

	// Add mass in bogie assambly option(Inside the bogie)locater(4577)
	
	
	@FindBy(xpath = "(//a[text()='Add'])[1]")
	private WebElement Bogiescreatebogiesaddoption;
	@FindBy(xpath = "//button[@data-title=\"Mass\"]")
	private WebElement Bogiescreatebogiesselectmassoption;
	@FindBy(xpath = "(//a[text()='Choose from library'])[1]")
	private WebElement Bogiescreatebogieschoosefromlibrary;
	@FindBy(xpath = "(//select[@class=\"form-control form-control-select w-100\"])[2]")
	private WebElement Bogiescreatebogiesselecttemplatebox;
	@FindBy(xpath = "(//option[@data-published=\"1\"])[1]")
	private WebElement Bogiescreatebogiesselectfirstoption;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[1]")
	private WebElement Bogiescreatebogiesselecttamplatebutton;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[1]")
	private WebElement Bogiescreatebogiescenterofgravityz;
	@FindBy(xpath = "(//a[text()='Add'])[2]")
	private WebElement Bogiescreatebogiesaddbutton;
	@FindBy(xpath = "//button[text()='Click to Refresh 3D View']")
	private WebElement BogiescreatebogiesrefreshthreeDview;

	public WebElement getBogiescreatebogiesrefreshthreeDview() {
		return BogiescreatebogiesrefreshthreeDview;
	}

	public WebElement getBogiescreatebogiesaddoption() {
		return Bogiescreatebogiesaddoption;
	}

	public WebElement getBogiescreatebogiesselectmassoption() {
		return Bogiescreatebogiesselectmassoption;
	}

	public WebElement getBogiescreatebogieschoosefromlibrary() {
		return Bogiescreatebogieschoosefromlibrary;
	}

	public WebElement getBogiescreatebogiesselecttemplatebox() {
		return Bogiescreatebogiesselecttemplatebox;
	}

	public WebElement getBogiescreatebogiesselectfirstoption() {
		return Bogiescreatebogiesselectfirstoption;
	}

	public WebElement getBogiescreatebogiesselecttamplatebutton() {
		return Bogiescreatebogiesselecttamplatebutton;
	}

	public WebElement getBogiescreatebogiescenterofgravityz() {
		return Bogiescreatebogiescenterofgravityz;
	}

	public WebElement getBogiescreatebogiesaddbutton() {
		return Bogiescreatebogiesaddbutton;
	}
	
	

	// Add side mass in the bogie assmbliy locater(4629)

	@FindBy(xpath = "(//option[@data-published=\"1\"])[1]")
	private WebElement Bogiescreatebogiesselectsecondoption;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[2]")
	private WebElement Bogiescreatebogiescenterofgravityy;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[1]")
	private WebElement Bogiescreatebogiespartnamebox;

	public WebElement getBogiescreatebogiespartnamebox() {
		return Bogiescreatebogiespartnamebox;
	}

	public WebElement getBogiescreatebogiesselectsecondoption() {
		return Bogiescreatebogiesselectsecondoption;
	}

	public WebElement getBogiescreatebogiescenterofgravityy() {
		return Bogiescreatebogiescenterofgravityy;
	}
	
	

	// Add wheel set in bogies assembly option locater(4680)

	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[4]")
	private WebElement Bogiescreatebogiescenterofgravityxwheelset;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[6]")
	private WebElement Bogiescreatebogiescenterofgravityzwheelset;
	@FindBy(xpath = "(//a[text()='Choose from library'])[2]")
	private WebElement Addwheelsetchoosefromlibrary;
	@FindBy(xpath = "(//select[@name=\"part_data[library][user]\"])[2]")
	private WebElement Addwheelsetpubliclibrarybox;
	@FindBy(xpath = "//option[contains(text(),'SHY-05Wheel')]")
	private WebElement Addwheelsetselectfirstwheelset;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[2]")
	private WebElement Addwheelsetselecttemplatebutton;
	@FindBy(xpath = "(//a[text()='Semi Wheelbase'])[4]")
	private WebElement Addwheelsetsemiwheelbase;
	@FindBy(xpath = "(//a[text()='Wheel Radius'])[6]")
	private WebElement Addwheelsetwheelradius;
	@FindBy(xpath = "(//a[@class=\"btn btn-primary pull-right\"])[3]")
	private WebElement Addwheelsetaddbutton;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][mass]\"])[2]")
	private WebElement Addwheelsetinertiamass;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][roll_inertia]\"])[2]")
	private WebElement Addwheelsetrollinertia;

	
	
	public WebElement getAddwheelsetinertiamass() {
		return Addwheelsetinertiamass;
	}

	public WebElement getAddwheelsetrollinertia() {
		return Addwheelsetrollinertia;
	}

	public WebElement getAddwheelsetaddbutton() {
		return Addwheelsetaddbutton;
	}

	public WebElement getAddwheelsetsemiwheelbase() {
		return Addwheelsetsemiwheelbase;
	}

	public WebElement getAddwheelsetwheelradius() {
		return Addwheelsetwheelradius;
	}

	public WebElement getAddwheelsetchoosefromlibrary() {
		return Addwheelsetchoosefromlibrary;
	}

	public WebElement getAddwheelsetpubliclibrarybox() {
		return Addwheelsetpubliclibrarybox;
	}

	public WebElement getAddwheelsetselectfirstwheelset() {
		return Addwheelsetselectfirstwheelset;
	}

	public WebElement getAddwheelsetselecttemplatebutton() {
		return Addwheelsetselecttemplatebutton;
	}

	public WebElement getBogiescreatebogiescenterofgravityxwheelset() {
		return Bogiescreatebogiescenterofgravityxwheelset;
	}

	public WebElement getBogiescreatebogiescenterofgravityzwheelset() {
		return Bogiescreatebogiescenterofgravityzwheelset;
	}

	// Add the clone wheel set in bogie option locater(4729)
	
    @FindBy(xpath = "(//input[@name=\"part_name\"])[2]")
    private WebElement Addwheelsetpartname;
	@FindBy(xpath = "//li[text()='Wheelset']")
	private WebElement Addclonewheelsetoption;
	@FindBy(xpath = "(//span[@class=\"icon expand-icon glyphicon glyphicon-menu-right\"])[2]")
	private WebElement Addclonewheelsetdropdwon;
	@FindBy(xpath = "//li[text()='SHY-05 Right Wheel set']")
	private WebElement AddclonewheelsetSHY;
	@FindBy(xpath = "//a[text()='Clone']")
	private WebElement Addwheelsetcloneoption;
	@FindBy(xpath = "(//a[text()='Save'])[3]")
	private WebElement Addclonewheelsetsavebutton;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[2]")
	private WebElement Addclonepartnamebox;
	@FindBy(xpath = "(//a[text()='Save'])[1]")
	private WebElement Addclonewheelsetsavebuttontwo;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement Addclonewheelsetsavebogie;
	
	

	public WebElement getAddwheelsetpartname() {
		return Addwheelsetpartname;
	}

	public WebElement getAddclonewheelsetsavebogie() {
		return Addclonewheelsetsavebogie;
	}

	public WebElement getAddclonewheelsetsavebuttontwo() {
		return Addclonewheelsetsavebuttontwo;
	}

	public WebElement getAddclonepartnamebox() {
		return Addclonepartnamebox;
	}

	public WebElement getAddclonewheelsetsavebutton() {
		return Addclonewheelsetsavebutton;
	}

	public WebElement getAddclonewheelsetoption() {
		return Addclonewheelsetoption;
	}

	public WebElement getAddclonewheelsetdropdwon() {
		return Addclonewheelsetdropdwon;
	}

	public WebElement getAddclonewheelsetSHY() {
		return AddclonewheelsetSHY;
	}

	public WebElement getAddwheelsetcloneoption() {
		return Addwheelsetcloneoption;
	}

	// Add shear spring in bogie assemble option locater(4773)

	@FindBy(xpath = "(//a[text()='Choose from library'])[10]")
	private WebElement Addshearspringchoosefromlibrary;
	@FindBy(xpath = "(//select[@class=\"form-control form-control-select w-100\"])[22]")
	private WebElement Addshearspringbubliclibrarybox;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement Shearspringactionsbutton;
	@FindBy(xpath = "//a[text()='Edit Bogie												']")
	private WebElement Shearspringeditbox;
	@FindBy(xpath = "//option[contains(text(),'SHY-05 shear spring')]")
	private WebElement Shearspringselectfirst;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[11]")
	private WebElement Shearspringselecttemplate;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[11]") 
	private WebElement Shearspringpartnamebox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[11]")
	private WebElement Shearspringxbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[11]")
	private WebElement Shearspringybox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[11]")
	private WebElement Shearspringzbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][z]\"])[9]")
	private WebElement Shearspringzsecondbox;
	@FindBy(xpath = "//span[text()='Not Connected']")
	private WebElement Shearspringmassone;
	@FindBy(xpath = "//span[text()='Not Connected']")
	private WebElement Shearspringmasstwo;
	@FindBy(xpath = "(//li[text()='SHY-05 Left Wheel set'])[2]")
	private WebElement Shearspringrightsidemass;
	@FindBy(xpath = "//li[text()='Vehicle Body']")
	private WebElement Shearspringwheelset;
	@FindBy(xpath = "(//a[text()='Add'])[12]")
	private WebElement Shearspringaddbutton;
	@FindBy(xpath = "(//a[text()='Vehicle Body Mass (x1000kg) '])[11]")
	private WebElement Vehiclebodymass;
	@FindBy(xpath = "(//a[text()='Wheel Radius'])[12]")
	private WebElement Wheelradius;
	@FindBy(xpath = "//button[text()='Click to Refresh 3D View']")
	private WebElement viewthreeDbutton;
	@FindBy(xpath = "//button[@class=\"btn btn-primary btn-block action-btn\"]")
	private WebElement viewthreeDshearspring;
	@FindBy(xpath = "//li[text()='Shear Spring']")
	private WebElement selectmenushearspring;
	@FindBy(xpath = "//li[text()='Front shear spring']")
	private WebElement Frontshearspring;

	public WebElement getSelectmenushearspring() {
		return selectmenushearspring;
	}

	public WebElement getFrontshearspring() {
		return Frontshearspring;
	}

	public WebElement getViewthreeDshearspring() {
		return viewthreeDshearspring;
	}

	public WebElement getViewthreeDbutton() {
		return viewthreeDbutton;
	}

	public WebElement getVehiclebodymass() {
		return Vehiclebodymass;
	}

	public WebElement getWheelradius() {
		return Wheelradius;
	}

	public WebElement getShearspringzsecondbox() {
		return Shearspringzsecondbox;
	}

	public WebElement getShearspringselectfirst() {
		return Shearspringselectfirst;
	}

	public WebElement getShearspringselecttemplate() {
		return Shearspringselecttemplate;
	}

	public WebElement getShearspringpartnamebox() {
		return Shearspringpartnamebox;
	}

	public WebElement getShearspringxbox() {
		return Shearspringxbox;
	}

	public WebElement getShearspringybox() {
		return Shearspringybox;
	}

	public WebElement getShearspringzbox() {
		return Shearspringzbox;
	}

	public WebElement getShearspringmassone() {
		return Shearspringmassone;
	}

	public WebElement getShearspringmasstwo() {
		return Shearspringmasstwo;
	}

	public WebElement getShearspringrightsidemass() {
		return Shearspringrightsidemass;
	}

	public WebElement getShearspringwheelset() {
		return Shearspringwheelset;
	}

	public WebElement getShearspringaddbutton() {
		return Shearspringaddbutton;
	}

	// Add friction part in bogie assembly option locater(4864)

	@FindBy(xpath = "(//a[text()='Choose from library'])[7]")
	private WebElement Bogiesfrictionchooesfromlib;
	@FindBy(xpath = "(//select[@name=\"part_data[library][user]\"])[8]")
	private WebElement Bogiesfrictionpleaseselectbox;
	@FindBy(xpath = "//option[contains(text(),'SHY-05 Center friction pivot')]")
	private WebElement Bogiesfrictionselectcenterfrictionpivot;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[8]")
	private WebElement Bogiesfrictionselecttemplate;
	@FindBy(xpath = "(//a[text()='Add'])[9]")
	private WebElement Bogiesfrictionaddbutton;

	public WebElement getBogiesfrictionchooesfromlib() {
		return Bogiesfrictionchooesfromlib;
	}

	public WebElement getBogiesfrictionpleaseselectbox() {
		return Bogiesfrictionpleaseselectbox;
	}

	public WebElement getBogiesfrictionselectcenterfrictionpivot() {
		return Bogiesfrictionselectcenterfrictionpivot;
	}

	public WebElement getBogiesfrictionselecttemplate() {
		return Bogiesfrictionselecttemplate;
	}

	public WebElement getBogiesfrictionaddbutton() {
		return Bogiesfrictionaddbutton;
	}

//Add Bumpstop part in bogie assembly option locater(4899)

	@FindBy(xpath = "(//a[text()='Choose from library'])[4]")
	private WebElement Bogiesbumpstopchoosefromlibrary;
	@FindBy(xpath = "(//select[@name=\"part_data[library][user]\"])[4]")
	private WebElement Bogiesbumpstopselectbox;
	@FindBy(xpath = "//option[contains(text(),'SHY-05 Bumpstop')]")
	private WebElement Bogiesbumpstopselectfirstoption;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[4]")
	private WebElement Bogiesbumpstopselecttemplate;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[11]")
	private WebElement Bogiesbumpstopxonebox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[12]")
	private WebElement Bogiesbumpstopxtwobox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[13]")
	private WebElement Bogiesbumpstopyonebox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[14]")
	private WebElement Bogiesbumpstopytwobox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[15]")
	private WebElement Bogiesbumpstopzonebox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[16]")
	private WebElement Bogiesbumpstopztwobox;
	@FindBy(xpath = "(//span[text()='Not Connected'])[1]")
	private WebElement Bogiesbumpstopmassone;
	@FindBy(xpath = "(//span[text()='Not Connected'])[1]")
	private WebElement Bogiesbumpstopmasstwo;
	@FindBy(xpath = "(//a[text()='Add'])[5]")
	private WebElement Bogiesbumpstopaddbutton;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[4]")
	private WebElement Bogiesbumpstoppartname;
	@FindBy(xpath = "(//li[text()='SHY-05 Right Wheel set'])[2]")
	private WebElement BogiesbumpstopShywheelset;
	@FindBy(xpath = "(//li[text()='Vehicle Body'])")
	private WebElement Bogiesbumpstopvehiclebody;
	@FindBy(xpath = "(//a[text()='Semi Wheelbase (0.75m)'])[11]")
	private WebElement Bogiesbumpstopsemiwheelbase;
	@FindBy(xpath = "(//a[text()='Wheel Radius (0.4m)'])[12]")
	private WebElement Bogiesbumpstopwheelradius;

	public WebElement getBogiesbumpstopsemiwheelbase() {
		return Bogiesbumpstopsemiwheelbase;
	}

	public WebElement getBogiesbumpstopwheelradius() {
		return Bogiesbumpstopwheelradius;
	}

	public WebElement getBogiesbumpstopShywheelset() {
		return BogiesbumpstopShywheelset;
	}

	public WebElement getBogiesbumpstopvehiclebody() {
		return Bogiesbumpstopvehiclebody;
	}

	public WebElement getBogiesbumpstoppartname() {
		return Bogiesbumpstoppartname;
	}

	public WebElement getBogiesbumpstopchoosefromlibrary() {
		return Bogiesbumpstopchoosefromlibrary;
	}

	public WebElement getBogiesbumpstopselectbox() {
		return Bogiesbumpstopselectbox;
	}

	public WebElement getBogiesbumpstopselectfirstoption() {
		return Bogiesbumpstopselectfirstoption;
	}

	public WebElement getBogiesbumpstopselecttemplate() {
		return Bogiesbumpstopselecttemplate;
	}

	public WebElement getBogiesbumpstopxonebox() {
		return Bogiesbumpstopxonebox;
	}

	public WebElement getBogiesbumpstopxtwobox() {
		return Bogiesbumpstopxtwobox;
	}

	public WebElement getBogiesbumpstopyonebox() {
		return Bogiesbumpstopyonebox;
	}

	public WebElement getBogiesbumpstopytwobox() {
		return Bogiesbumpstopytwobox;
	}

	public WebElement getBogiesbumpstopzonebox() {
		return Bogiesbumpstopzonebox;
	}

	public WebElement getBogiesbumpstopztwobox() {
		return Bogiesbumpstopztwobox;
	}

	public WebElement getBogiesbumpstopmassone() {
		return Bogiesbumpstopmassone;
	}

	public WebElement getBogiesbumpstopmasstwo() {
		return Bogiesbumpstopmasstwo;
	}

	public WebElement getBogiesbumpstopaddbutton() {
		return Bogiesbumpstopaddbutton;
	}
	
	
	//Add bush option in bogie assembly option locater(4967)
	
	
	@FindBy(xpath = "(//a[text()='Choose from library'])[5]")
	private WebElement Bogiesbushchoosefromlibrary;
	@FindBy(xpath = "(//select[@name=\"part_data[library][user]\"])[5]")
	private WebElement Bogiesbushuserlibrarybox;
    @FindBy(xpath = "//option[contains(text(),'SHY-05 Bush')]")
    private WebElement BogiesbushselectSHYbush;
    @FindBy(xpath = "(//button[contains(text(),'Select Template')])[5]")
    private WebElement Bogiesbushselecttemplatebutton;
    @FindBy(xpath = "(//input[@name=\"part_name\"])[5]")
    private WebElement Bogiesbushnamebox;
    @FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[5]")
    private WebElement Bogiesbushtopzbox;
    @FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[6]")
	private WebElement Bogiesbushbuttomzbox;
    @FindBy(xpath = "(//span[text()='Not Connected'])[3]")
    private WebElement Bogiesbushmassone;
    @FindBy(xpath = "(//span[text()='Not Connected'])[3]")
    private WebElement Bogiesbushmasstwo;
    @FindBy(xpath = "(//li[text()='SHY-05 left side mass'])[2]")
    private WebElement Bogiesbushvehiclebody;
    @FindBy(xpath = "//li[text()='Ground']")  
    private WebElement Bogiesbushground;
    @FindBy(xpath = "(//a[text()='Add'])[6]")
    private WebElement Bogiesbushaddbutton;
    

	public WebElement getBogiesbushnamebox() {
		return Bogiesbushnamebox;
	}

	public WebElement getBogiesbushchoosefromlibrary() {
		return Bogiesbushchoosefromlibrary;
	}

	public WebElement getBogiesbushuserlibrarybox() {
		return Bogiesbushuserlibrarybox;
	}

	public WebElement getBogiesbushselectSHYbush() {
		return BogiesbushselectSHYbush;
	}

	public WebElement getBogiesbushselecttemplatebutton() {
		return Bogiesbushselecttemplatebutton;
	}

	public WebElement getBogiesbushtopzbox() {
		return Bogiesbushtopzbox;
	}

	public WebElement getBogiesbushbuttomzbox() {
		return Bogiesbushbuttomzbox;
	}

	public WebElement getBogiesbushmassone() {
		return Bogiesbushmassone;
	}

	public WebElement getBogiesbushmasstwo() {
		return Bogiesbushmasstwo;
	}

	public WebElement getBogiesbushvehiclebody() {
		return Bogiesbushvehiclebody;
	}

	public WebElement getBogiesbushground() {
		return Bogiesbushground;
	}

	public WebElement getBogiesbushaddbutton() {
		return Bogiesbushaddbutton;
	}
	
	
	
	
	//Add stiffness part in bogie assembly option locater(5018)
	
	
	@FindBy(xpath = "(//a[text()='Choose from library'])[9]")
	private WebElement Bogiesstiffnesschoosefromlibrary;
	@FindBy(xpath = "(//select[@class=\"form-control form-control-select w-100\"])[30]")
	private WebElement Bogiesstiffnesspubliclibrarybox;
	@FindBy(xpath = "//option[contains(text(),'SHY-05 Stiffness')]")
	private WebElement BogiesstiffnessSHYstiffness;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[10]")
	private WebElement Bogiesstiffnessselecttemplatebutton;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[10]")
	private WebElement Bogiesstiffnessnamebox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[10]")
	private WebElement Bogiesstiffnessendonez;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][z]\"])[8]")
	private WebElement Bogiesstiffnessendtwoz;
	@FindBy(xpath = "(//span[text()='Not Connected'])[7]")
	private WebElement Bogiesstiffnessmassone;
	@FindBy(xpath = "(//span[text()='Not Connected'])[7]")
	private WebElement Bogiesstiffnessmasstwo;
	@FindBy(xpath = "//li[text()='Vehicle Body']")
	private WebElement Bogiesstiffnessvehiclebody;
	@FindBy(xpath = "//li[text()='Ground']")
	private WebElement Bogiesstiffnessground;
	@FindBy(xpath = "(//a[text()='Add'])[11]")
	private WebElement Bogiesstiffnessaddbutton;

	public WebElement getBogiesstiffnessnamebox() {
		return Bogiesstiffnessnamebox;
	}

	public WebElement getBogiesstiffnesschoosefromlibrary() {
		return Bogiesstiffnesschoosefromlibrary;
	}

	public WebElement getBogiesstiffnesspubliclibrarybox() {
		return Bogiesstiffnesspubliclibrarybox;
	}

	public WebElement getBogiesstiffnessSHYstiffness() {
		return BogiesstiffnessSHYstiffness;
	}

	public WebElement getBogiesstiffnessselecttemplatebutton() {
		return Bogiesstiffnessselecttemplatebutton;
	}

	public WebElement getBogiesstiffnessendonez() {
		return Bogiesstiffnessendonez;
	}

	public WebElement getBogiesstiffnessendtwoz() {
		return Bogiesstiffnessendtwoz;
	}

	public WebElement getBogiesstiffnessmassone() {
		return Bogiesstiffnessmassone;
	}

	public WebElement getBogiesstiffnessmasstwo() {
		return Bogiesstiffnessmasstwo;
	}

	public WebElement getBogiesstiffnessvehiclebody() {
		return Bogiesstiffnessvehiclebody;
	}

	public WebElement getBogiesstiffnessground() {
		return Bogiesstiffnessground;
	}

	public WebElement getBogiesstiffnessaddbutton() {
		return Bogiesstiffnessaddbutton;
	}
	
	//After the bogies completed save and come to see next time present or not locator(5073)
	
	@FindBy(xpath = "//li[text()='Bumpstop']")
	private WebElement Bogiesafterseetheassembly;
	@FindBy(xpath = "//a[text()='Assemblies']")
	private WebElement Bogiesassemblyoption;
	@FindBy(xpath = "//div[contains(text(),'SHY-05 Bogie')]")
	private WebElement BogiesassemblyselectSYHbogies;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement Bogiesassemblyselectaction;
	@FindBy(xpath = "//a[text()='Edit Bogie												']")
	private WebElement Bogiesassemblyeditbogieoption;
	
	
	
	public WebElement getBogiesassemblyselectSYHbogies() {
		return BogiesassemblyselectSYHbogies;
	}

	public WebElement getBogiesassemblyselectaction() {
		return Bogiesassemblyselectaction;
	}

	public WebElement getBogiesassemblyeditbogieoption() {
		return Bogiesassemblyeditbogieoption;
	}

	public WebElement getBogiesafterseetheassembly() {
		return Bogiesafterseetheassembly;
	}

	public WebElement getBogiesassemblyoption() {
		return Bogiesassemblyoption;
	}
	
	
	//Setting under update unit option locater(5098)
	


	@FindBy(xpath = "(//a[text()='Hemkumar D '])[2]")
	private WebElement Hemkumaroption;
	@FindBy(xpath = "//a[text()='Settings									']")
	private WebElement Hemkumarsettingoption;
	@FindBy(xpath = "//a[text()='Units']")
	private WebElement Hemkumarunitoption;
	@FindBy(xpath = "//div[@class=\"col-sm-9 settings-content\"]")
	private WebElement Hemkumarunitoptionbody;
	@FindBy(xpath = "//select[@class=\"form-control form-control-select\"]")
	private WebElement Hemkumarselectbox;
	@FindBy(xpath = "//option[text()='Metric']")
	private WebElement Hemkumarmetricoption;
	@FindBy(xpath = "//option[text()='US']")
	private WebElement Hemkumarusoption;
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement Hemkumarsubmitbutton;

	
	public WebElement getHemkumarunitoptionbody() {
		return Hemkumarunitoptionbody;
	}

	public WebElement getHemkumaroption() {
		return Hemkumaroption;
	}

	public WebElement getHemkumarsettingoption() {
		return Hemkumarsettingoption;
	}

	public WebElement getHemkumarunitoption() {
		return Hemkumarunitoption;
	}

	public WebElement getHemkumarselectbox() {
		return Hemkumarselectbox;
	}

	public WebElement getHemkumarmetricoption() {
		return Hemkumarmetricoption;
	}

	public WebElement getHemkumarusoption() {
		return Hemkumarusoption;
	}

	public WebElement getHemkumarsubmitbutton() {
		return Hemkumarsubmitbutton;
	}
	
	
	
	//Setting under select currency option(inside the your details)(5152)
	
	@FindBy(xpath = "//a[text()='Your Details']")
	private WebElement Hemkumaryourdetails;
	@FindBy(xpath = "//div[@class=\"col-sm-9 settings-content\"]")
	private WebElement Hemkumaryourdetailsbody;
	@FindBy(xpath = "//select[@class=\"form-control form-control-select\"]")
	private WebElement Hemkumarselectcurrencybox;
	@FindBy(xpath = "//option[text()='EUR']")
	private WebElement HemkuamrselectEURcurrency;
	@FindBy(xpath = "//option[text()='USD']")
	private WebElement HemkuamrselectUSDcurrency;
	@FindBy(xpath = "//option[text()='GBP']")
	private WebElement HemkuamrselectGBPcurrency;
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	private WebElement Hemkumarcurrencysubmitbutton;
	@FindBy(xpath = "//h1[contains(text(),'Your Details')]")
	private WebElement Hemkumaryourdetailshader;
	


	public WebElement getHemkumaryourdetailsbody() {
		return Hemkumaryourdetailsbody;
	}

	public WebElement getHemkumaryourdetailshader() {
		return Hemkumaryourdetailshader;
	}

	public WebElement getHemkumaryourdetails() {
		return Hemkumaryourdetails;
	}

	public WebElement getHemkumarselectcurrencybox() {
		return Hemkumarselectcurrencybox;
	}

	public WebElement getHemkuamrselectEURcurrency() {
		return HemkuamrselectEURcurrency;
	}

	public WebElement getHemkuamrselectUSDcurrency() {
		return HemkuamrselectUSDcurrency;
	}

	public WebElement getHemkuamrselectGBPcurrency() {
		return HemkuamrselectGBPcurrency;
	}

	public WebElement getHemkumarcurrencysubmitbutton() {
		return Hemkumarcurrencysubmitbutton;
	}
	
	
	//Setting under create shared library and delete options(inside the shared library option)locater(5195)
	
	@FindBy(xpath = "//a[text()='Shared Libraries']")
	private WebElement Hemkumarsharedlibrariesoption;
	@FindBy(xpath = "//div[@class=\"col-sm-9 settings-content\"]")
	private WebElement Hemkumarsharedlibrariesbody;
	@FindBy(xpath = "//a[text()='Create Shared Libraries']")
	private WebElement Hemkumarcreatesharedlibrariesoption;
	@FindBy(xpath = "//input[@name=\"account_name\"]")
	private WebElement Hemkumarsharedlibrarysendbox;
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement Hemkumarsharedlibrarycreatebutton;
	@FindBy(xpath = "//td[@class=\" cell-actions\"]")
	private WebElement Hemkumarsharedlibraryaction;
	@FindBy(xpath = "//button[@data-action=\"delete\"]")
	private WebElement Hemkumarsharedlibrarydeletebutton;
	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement Hemkumarsharedlibrarydeleteconform;
	
	

	public WebElement getHemkumarsharedlibrariesbody() {
		return Hemkumarsharedlibrariesbody;
	}

	public WebElement getHemkumarsharedlibrarydeleteconform() {
		return Hemkumarsharedlibrarydeleteconform;
	}

	public WebElement getHemkumarsharedlibrariesoption() {
		return Hemkumarsharedlibrariesoption;
	}

	public WebElement getHemkumarcreatesharedlibrariesoption() {
		return Hemkumarcreatesharedlibrariesoption;
	}

	public WebElement getHemkumarsharedlibrarysendbox() {
		return Hemkumarsharedlibrarysendbox;
	}

	public WebElement getHemkumarsharedlibrarycreatebutton() {
		return Hemkumarsharedlibrarycreatebutton;
	}

	public WebElement getHemkumarsharedlibraryaction() {
		return Hemkumarsharedlibraryaction;
	}

	public WebElement getHemkumarsharedlibrarydeletebutton() {
		return Hemkumarsharedlibrarydeletebutton;
	}
	
	
	//project options (sort the project name in project main menu)locater
	
	@FindBy(xpath = "//button[text()='Create Project							']")
	private WebElement Projectcreateprojectoption;
	@FindBy(xpath = "(//input[@name=\"project_name\"])[1]")
	private WebElement Projectprojectnamebox;
	@FindBy(xpath = "(//button[text()='Create'])[1]")
	private WebElement Projectcreatebutton;
	@FindBy(xpath = "//select[@name=\"filter_sort_by\"]")
	private WebElement Projectsortbox;
	@FindBy(xpath = "//option[text()='Project Name']")
	private WebElement Projectselectprojectname;
	@FindBy(xpath = "//input[@name=\"filter_search\"]")
	private WebElement Projectsearchbox;
	@FindBy(xpath = "//div[contains(text(),'DVRS2')]")
	private WebElement ProjectDVRStwo;
	@FindBy(xpath = "//div[contains(text(),'DVRS1')]")
	private WebElement ProjectDVRSone;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement ProjectDVRStwoaction;
	@FindBy(xpath = "(//span[text()='Delete Project'])[1]")
	private WebElement ProjectDVRStwodeleteoption;
	@FindBy(xpath = "(//button[text()='Delete'])[1]")
	private WebElement ProjectDVRStwodeletebutton;
	@FindBy(xpath = "//select[@name=\"filter_sort_direction\"]")
	private WebElement Projectasendingordesandingbox;
	@FindBy(xpath = "//option[text()='Asc']")
	private WebElement ProjectselectAsc;
	@FindBy(xpath = "//option[text()='Desc']")
	private WebElement ProjectselectDesc;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement ProjectDVRSoneaction;
	@FindBy(xpath = "(//span[text()='Delete Project'])[1]")
	private WebElement ProjectDVRSonedeleteoption;
	@FindBy(xpath = "(//button[text()='Delete'])[1]")
	private WebElement ProjectDVRSonedeletebutton;
	@FindBy(xpath = "(//span[@aria-hidden=\"true\"])[9]")
	private WebElement Projectsearchboxclearoption;
    @FindBy(xpath = "//input[@name=\"filter_date_from\"]")
    private WebElement Projectcreatedatebox;
    @FindBy(xpath = "//div[text()='13']")
    private WebElement Projectselectdate;
    @FindBy(xpath = "(//div[text()='13'])[2]")
    private WebElement Projectselectseconddate;
	@FindBy(xpath = "//button[text()='Clear']")
    private WebElement Projectclearbutton;
    @FindBy(xpath = "//input[@name=\"filter_date_to\"]")
    private WebElement Projectmodifieddatebox;
    @FindBy(xpath = "(//button[text()='Clear'])[2]")
    private WebElement Projectclearsecondbutton;
    
	
	
    public WebElement getProjectselectseconddate() {
		return Projectselectseconddate;
	}

	
	public WebElement getProjectclearsecondbutton() {
		return Projectclearsecondbutton;
	}

	public WebElement getProjectcreatedatebox() {
		return Projectcreatedatebox;
	}

	public WebElement getProjectselectdate() {
		return Projectselectdate;
	}

	public WebElement getProjectclearbutton() {
		return Projectclearbutton;
	}

	public WebElement getProjectmodifieddatebox() {
		return Projectmodifieddatebox;
	}

	public WebElement getProjectsearchboxclearoption() {
		return Projectsearchboxclearoption;
	}

	public WebElement getProjectDVRSoneaction() {
		return ProjectDVRSoneaction;
	}

	public WebElement getProjectDVRSonedeleteoption() {
		return ProjectDVRSonedeleteoption;
	}

	public WebElement getProjectDVRSonedeletebutton() {
		return ProjectDVRSonedeletebutton;
	}

	public WebElement getProjectDVRStwodeletebutton() {
		return ProjectDVRStwodeletebutton;
	}

	public WebElement getProjectDVRStwo() {
		return ProjectDVRStwo;
	}

	public WebElement getProjectDVRSone() {
		return ProjectDVRSone;
	}

	public WebElement getProjectDVRStwoaction() {
		return ProjectDVRStwoaction;
	}

	public WebElement getProjectDVRStwodeleteoption() {
		return ProjectDVRStwodeleteoption;
	}

	public WebElement getProjectasendingordesandingbox() {
		return Projectasendingordesandingbox;
	}

	public WebElement getProjectselectAsc() {
		return ProjectselectAsc;
	}

	public WebElement getProjectselectDesc() {
		return ProjectselectDesc;
	}

	public WebElement getProjectcreateprojectoption() {
		return Projectcreateprojectoption;
	}

	public WebElement getProjectprojectnamebox() {
		return Projectprojectnamebox;
	}

	public WebElement getProjectcreatebutton() {
		return Projectcreatebutton;
	}

	public WebElement getProjectsortbox() {
		return Projectsortbox;
	}

	public WebElement getProjectselectprojectname() {
		return Projectselectprojectname;
	}

	public WebElement getProjectsearchbox() {
		return Projectsearchbox;
	}
	
	//second vehicle gauge creation locator
	
	@FindBy(xpath = "(//button[@name=\"add-upper\"])[1]")
	private WebElement Secondvehiclegaugeupperplusone;
	@FindBy(xpath = "(//button[@name=\"add-upper\"])[2]")
	private WebElement Secondvehiclegaugeupperplustwo;
	@FindBy(xpath = "(//button[@name=\"add-upper\"])[3]")
	private WebElement Secondvehiclegaugeupperplusthree;
	@FindBy(xpath = "(//button[@name=\"add-upper\"])[4]")
	private WebElement Secondvehiclegaugeupperplusfour;
	@FindBy(xpath = "(//button[@name=\"add-upper\"])[5]")
	private WebElement Secondvehiclegaugeupperplusfive;
	@FindBy(xpath = "(//button[@class=\"btn btn-small btn-block btn-success mt-0 jqMultiDataAdd\"])[2]")
	private WebElement secondvehiclegaugelowerplusone;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[8]")
	private WebElement secondvehiclegaugelowerplustwo;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[9]")
	private WebElement secondvehiclegaugelowerplusthree;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[10]")
	private WebElement secondvehiclegaugelowerplusfour;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[11]")
	private WebElement secondvehiclegaugelowerplusfive;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[12]")
	private WebElement secondvehiclegaugelowerplussix;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][upper][x][]\"])[1]")
    private WebElement Secondvehiclegaugeupperxone;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][upper][x][]\"])[2]")
    private WebElement Secondvehiclegaugeupperxtwo;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][upper][x][]\"])[3]")
    private WebElement Secondvehiclegaugeupperxthree;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][upper][x][]\"])[4]")
    private WebElement Secondvehiclegaugeupperxfour;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][upper][x][]\"])[5]")
    private WebElement Secondvehiclegaugeupperxfive;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][upper][x][]\"])[6]")
    private WebElement Secondvehiclegaugeupperxsix;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][x][]\"])[1]")
	private WebElement Secondvehiclegaugelowerxone;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][x][]\"])[2]")
	private WebElement Secondvehiclegaugelowerxtwo;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][x][]\"])[3]")
	private WebElement Secondvehiclegaugelowerxthree;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][x][]\"])[4]")
	private WebElement Secondvehiclegaugelowerxfour;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][x][]\"])[5]")
	private WebElement Secondvehiclegaugelowerxfive;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][x][]\"])[6]")
	private WebElement Secondvehiclegaugelowerxsix;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][x][]\"])[7]")
	private WebElement Secondvehiclegaugelowerxseven;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][upper][y][]\"])[1]")
	private WebElement Secondvehiclegaugeupperyone;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][upper][y][]\"])[2]")
	private WebElement Secondvehiclegaugeupperytwo;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][upper][y][]\"])[3]")
	private WebElement Secondvehiclegaugeupperythree;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][upper][y][]\"])[4]")
	private WebElement Secondvehiclegaugeupperyfour;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][upper][y][]\"])[5]")
	private WebElement Secondvehiclegaugeupperyfive;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][upper][y][]\"])[6]")
	private WebElement Secondvehiclegaugeupperysix;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][y][]\"])[1]")
	private WebElement Secondvehiclegaugeloweryone;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][y][]\"])[2]")
	private WebElement Secondvehiclegaugelowerytwo;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][y][]\"])[3]")
	private WebElement Secondvehiclegaugelowerythree;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][y][]\"])[4]")
	private WebElement Secondvehiclegaugeloweryfour;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][y][]\"])[5]")
	private WebElement Secondvehiclegaugeloweryfive;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][y][]\"])[6]")
	private WebElement Secondvehiclegaugelowerysix;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][lower][y][]\"])[7]")
	private WebElement Secondvehiclegaugeloweryseven;
    @FindBy(xpath = "(//input[@name=\"gauge_name\"])[1]")
    private WebElement Secondvehiclegaugenamebox;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[14]")
    private WebElement Secondvehiclegaugefootstepgaugeplusone;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[15]")
    private WebElement Secondvehiclegaugefootstepgaugeplustwo;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[16]")
    private WebElement Secondvehiclegaugefootstepgaugeplusthree;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[17]")
    private WebElement Secondvehiclegaugefootstepgaugeplusfour;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[18]")
    private WebElement Secondvehiclegaugefootstepgaugeplusfive;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[19]")
    private WebElement Secondvehiclegaugefootstepgaugeplussix;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[20]")
    private WebElement Secondvehiclegaugefootstepgaugeplusseven;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[21]")
    private WebElement Secondvehiclegaugefootstepgaugepluseight;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][x][]\"])[1]")
    private WebElement Secondvehiclegaugefootstepxboxone;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][y][]\"])[1]")
    private WebElement Secondvehiclegaugefootstepyboxone;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][x][]\"])[2]")
    private WebElement Secondvehiclegaugefootstepxboxtwo;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][y][]\"])[2]")
    private WebElement Secondvehiclegaugefootstepyboxtwo;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][x][]\"])[3]")
    private WebElement Secondvehiclegaugefootstepxboxthree;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][y][]\"])[3]")
    private WebElement Secondvehiclegaugefootstepyboxthree;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][x][]\"])[4]")
    private WebElement Secondvehiclegaugefootstepxboxfour;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][y][]\"])[4]")
    private WebElement Secondvehiclegaugefootstepyboxfour;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][x][]\"])[5]")
    private WebElement Secondvehiclegaugefootstepxboxfive;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][y][]\"])[5]")
    private WebElement Secondvehiclegaugefootstepyboxfive;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][x][]\"])[6]")
    private WebElement Secondvehiclegaugefootstepxboxsix;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][y][]\"])[6]")
    private WebElement Secondvehiclegaugefootstepyboxsix;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][x][]\"])[7]")
    private WebElement Secondvehiclegaugefootstepxboxseven;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][y][]\"])[7]")
    private WebElement Secondvehiclegaugefootstepyboxseven;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][x][]\"])[8]")
    private WebElement Secondvehiclegaugefootstepxboxeight;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][y][]\"])[8]")
    private WebElement Secondvehiclegaugefootstepyboxeight;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][x][]\"])[9]")
    private WebElement Secondvehiclegaugefootstepxboxnine;
    @FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][footstep][y][]\"])[9]")
    private WebElement Secondvehiclegaugefootstepyboxnine;
    
    
    

	public WebElement getSecondvehiclegaugefootstepgaugeplusone() {
		return Secondvehiclegaugefootstepgaugeplusone;
	}

	public WebElement getSecondvehiclegaugefootstepgaugeplustwo() {
		return Secondvehiclegaugefootstepgaugeplustwo;
	}

	public WebElement getSecondvehiclegaugefootstepgaugeplusthree() {
		return Secondvehiclegaugefootstepgaugeplusthree;
	}

	public WebElement getSecondvehiclegaugefootstepgaugeplusfour() {
		return Secondvehiclegaugefootstepgaugeplusfour;
	}

	public WebElement getSecondvehiclegaugefootstepgaugeplusfive() {
		return Secondvehiclegaugefootstepgaugeplusfive;
	}

	public WebElement getSecondvehiclegaugefootstepgaugeplussix() {
		return Secondvehiclegaugefootstepgaugeplussix;
	}

	public WebElement getSecondvehiclegaugefootstepgaugeplusseven() {
		return Secondvehiclegaugefootstepgaugeplusseven;
	}

	public WebElement getSecondvehiclegaugefootstepgaugepluseight() {
		return Secondvehiclegaugefootstepgaugepluseight;
	}

	public WebElement getSecondvehiclegaugefootstepxboxone() {
		return Secondvehiclegaugefootstepxboxone;
	}

	public WebElement getSecondvehiclegaugefootstepyboxone() {
		return Secondvehiclegaugefootstepyboxone;
	}

	public WebElement getSecondvehiclegaugefootstepxboxtwo() {
		return Secondvehiclegaugefootstepxboxtwo;
	}

	public WebElement getSecondvehiclegaugefootstepyboxtwo() {
		return Secondvehiclegaugefootstepyboxtwo;
	}

	public WebElement getSecondvehiclegaugefootstepxboxthree() {
		return Secondvehiclegaugefootstepxboxthree;
	}

	public WebElement getSecondvehiclegaugefootstepyboxthree() {
		return Secondvehiclegaugefootstepyboxthree;
	}

	public WebElement getSecondvehiclegaugefootstepxboxfour() {
		return Secondvehiclegaugefootstepxboxfour;
	}

	public WebElement getSecondvehiclegaugefootstepyboxfour() {
		return Secondvehiclegaugefootstepyboxfour;
	}

	public WebElement getSecondvehiclegaugefootstepxboxfive() {
		return Secondvehiclegaugefootstepxboxfive;
	}

	public WebElement getSecondvehiclegaugefootstepyboxfive() {
		return Secondvehiclegaugefootstepyboxfive;
	}

	public WebElement getSecondvehiclegaugefootstepxboxsix() {
		return Secondvehiclegaugefootstepxboxsix;
	}

	public WebElement getSecondvehiclegaugefootstepyboxsix() {
		return Secondvehiclegaugefootstepyboxsix;
	}

	public WebElement getSecondvehiclegaugefootstepxboxseven() {
		return Secondvehiclegaugefootstepxboxseven;
	}

	public WebElement getSecondvehiclegaugefootstepyboxseven() {
		return Secondvehiclegaugefootstepyboxseven;
	}

	public WebElement getSecondvehiclegaugefootstepxboxeight() {
		return Secondvehiclegaugefootstepxboxeight;
	}

	public WebElement getSecondvehiclegaugefootstepyboxeight() {
		return Secondvehiclegaugefootstepyboxeight;
	}

	public WebElement getSecondvehiclegaugefootstepxboxnine() {
		return Secondvehiclegaugefootstepxboxnine;
	}

	public WebElement getSecondvehiclegaugefootstepyboxnine() {
		return Secondvehiclegaugefootstepyboxnine;
	}

	public WebElement getSecondvehiclegaugefootstepxbox() {
		return Secondvehiclegaugefootstepxboxone;
	}

	public WebElement getSecondvehiclegaugefootstepybox() {
		return Secondvehiclegaugefootstepyboxone;
	}

	public WebElement getSecondvehiclegaugeupperplusone() {
		return Secondvehiclegaugeupperplusone;
	}

	public WebElement getSecondvehiclegaugeupperplustwo() {
		return Secondvehiclegaugeupperplustwo;
	}

	public WebElement getSecondvehiclegaugeupperplusthree() {
		return Secondvehiclegaugeupperplusthree;
	}

	public WebElement getSecondvehiclegaugeupperplusfour() {
		return Secondvehiclegaugeupperplusfour;
	}

	public WebElement getSecondvehiclegaugeupperplusfive() {
		return Secondvehiclegaugeupperplusfive;
	}

	public WebElement getSecondvehiclegaugelowerplusone() {
		return secondvehiclegaugelowerplusone;
	}

	public WebElement getSecondvehiclegaugelowerplustwo() {
		return secondvehiclegaugelowerplustwo;
	}

	public WebElement getSecondvehiclegaugelowerplusthree() {
		return secondvehiclegaugelowerplusthree;
	}

	public WebElement getSecondvehiclegaugelowerplusfour() {
		return secondvehiclegaugelowerplusfour;
	}

	public WebElement getSecondvehiclegaugelowerplusfive() {
		return secondvehiclegaugelowerplusfive;
	}

	public WebElement getSecondvehiclegaugelowerplussix() {
		return secondvehiclegaugelowerplussix;
	}

	public WebElement getSecondvehiclegaugeupperxone() {
		return Secondvehiclegaugeupperxone;
	}

	public WebElement getSecondvehiclegaugeupperxtwo() {
		return Secondvehiclegaugeupperxtwo;
	}

	public WebElement getSecondvehiclegaugeupperxthree() {
		return Secondvehiclegaugeupperxthree;
	}

	public WebElement getSecondvehiclegaugeupperxfour() {
		return Secondvehiclegaugeupperxfour;
	}

	public WebElement getSecondvehiclegaugeupperxfive() {
		return Secondvehiclegaugeupperxfive;
	}

	public WebElement getSecondvehiclegaugeupperxsix() {
		return Secondvehiclegaugeupperxsix;
	}

	public WebElement getSecondvehiclegaugelowerxone() {
		return Secondvehiclegaugelowerxone;
	}

	public WebElement getSecondvehiclegaugelowerxtwo() {
		return Secondvehiclegaugelowerxtwo;
	}

	public WebElement getSecondvehiclegaugelowerxthree() {
		return Secondvehiclegaugelowerxthree;
	}

	public WebElement getSecondvehiclegaugelowerxfour() {
		return Secondvehiclegaugelowerxfour;
	}

	public WebElement getSecondvehiclegaugelowerxfive() {
		return Secondvehiclegaugelowerxfive;
	}

	public WebElement getSecondvehiclegaugelowerxsix() {
		return Secondvehiclegaugelowerxsix;
	}

	public WebElement getSecondvehiclegaugelowerxseven() {
		return Secondvehiclegaugelowerxseven;
	}

	public WebElement getSecondvehiclegaugeupperyone() {
		return Secondvehiclegaugeupperyone;
	}

	public WebElement getSecondvehiclegaugeupperytwo() {
		return Secondvehiclegaugeupperytwo;
	}

	public WebElement getSecondvehiclegaugeupperythree() {
		return Secondvehiclegaugeupperythree;
	}

	public WebElement getSecondvehiclegaugeupperyfour() {
		return Secondvehiclegaugeupperyfour;
	}

	public WebElement getSecondvehiclegaugeupperyfive() {
		return Secondvehiclegaugeupperyfive;
	}

	public WebElement getSecondvehiclegaugeupperysix() {
		return Secondvehiclegaugeupperysix;
	}

	public WebElement getSecondvehiclegaugeloweryone() {
		return Secondvehiclegaugeloweryone;
	}

	public WebElement getSecondvehiclegaugelowerytwo() {
		return Secondvehiclegaugelowerytwo;
	}

	public WebElement getSecondvehiclegaugelowerythree() {
		return Secondvehiclegaugelowerythree;
	}

	public WebElement getSecondvehiclegaugeloweryfour() {
		return Secondvehiclegaugeloweryfour;
	}

	public WebElement getSecondvehiclegaugeloweryfive() {
		return Secondvehiclegaugeloweryfive;
	}

	public WebElement getSecondvehiclegaugelowerysix() {
		return Secondvehiclegaugelowerysix;
	}

	public WebElement getSecondvehiclegaugeloweryseven() {
		return Secondvehiclegaugeloweryseven;
	}

	public WebElement getSecondvehiclegaugenamebox() {
		return Secondvehiclegaugenamebox;
	}
    

	
	//Structural gauge creating locater (5461)
	
	@FindBy(xpath = "(//span[contains(text(),'Structural')])[1]")
    private WebElement Structuralgaugesoption;
	@FindBy(xpath = "(//input[@name=\"gauge_name\"])[2]")
	private WebElement Structuralgaugenamebox;

	//x
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[1]")
	private WebElement Structuralx1;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[2]")
	private WebElement Structuralx2;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[3]")
	private WebElement Structuralx3;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[4]")
	private WebElement Structuralx4;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[5]")
	private WebElement Structuralx5;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[6]")
	private WebElement Structuralx6;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[7]")
	private WebElement Structuralx7;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[8]")
	private WebElement Structuralx8;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[9]")
	private WebElement Structuralx9;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[10]")
	private WebElement Structuralx10;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[11]")
	private WebElement Structuralx11;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[12]")
	private WebElement Structuralx12;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[13]")
	private WebElement Structuralx13;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[14]")
	private WebElement Structuralx14;
	
	//y
	
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[1]")
	private WebElement Structuraly1;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[2]")
	private WebElement Structuraly2;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[3]")
	private WebElement Structuraly3;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[4]")
	private WebElement Structuraly4;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[5]")
	private WebElement Structuraly5;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[6]")
	private WebElement Structuraly6;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[7]")
	private WebElement Structuraly7;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[8]")
	private WebElement Structuraly8;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[9]")
	private WebElement Structuraly9;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[10]")
	private WebElement Structuraly10;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[11]")
	private WebElement Structuraly11;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[12]")
	private WebElement Structuraly12;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[13]")
	private WebElement Structuraly13;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][y][]\"])[14]")
	private WebElement Structuraly14;
	
	//+
	
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[5]")
	private WebElement Structuralplus1;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[6]")
	private WebElement Structuralplus2;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[7]")
	private WebElement Structuralplus3;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[8]")
	private WebElement Structuralplus4;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[9]")
	private WebElement Structuralplus5;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[10]")
	private WebElement Structuralplus6;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[11]")
	private WebElement Structuralplus7;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[12]")
	private WebElement Structuralplus8;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[13]")
	private WebElement Structuralplus9;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[14]")
	private WebElement Structuralplus10;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[15]")
	private WebElement Structuralplus11;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[16]")
	private WebElement Structuralplus12;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[17]")
	private WebElement Structuralplus13;
	@FindBy(xpath = "(//a[text()='Save'])[2]")
	private WebElement Structuralgaugesave;
	@FindBy(xpath = "(//input[@name=\"gauge_data[mirror]\"])[2]")
	private WebElement Tunnelcheckbox;
	
	
	
	
	
	public WebElement getTunnelcheckbox() {
		return Tunnelcheckbox;
	}

	public WebElement getStructuralgaugesave() {
		return Structuralgaugesave;
	}

	public WebElement getStructuralgaugesoption() {
		return Structuralgaugesoption;
	}

	public WebElement getStructuralgaugenamebox() {
		return Structuralgaugenamebox;
	}

	public WebElement getStructuralx1() {
		return Structuralx1;
	}

	public WebElement getStructuralx2() {
		return Structuralx2;
	}

	public WebElement getStructuralx3() {
		return Structuralx3;
	}

	public WebElement getStructuralx4() {
		return Structuralx4;
	}

	public WebElement getStructuralx5() {
		return Structuralx5;
	}

	public WebElement getStructuralx6() {
		return Structuralx6;
	}

	public WebElement getStructuralx7() {
		return Structuralx7;
	}

	public WebElement getStructuralx8() {
		return Structuralx8;
	}

	public WebElement getStructuralx9() {
		return Structuralx9;
	}

	public WebElement getStructuralx10() {
		return Structuralx10;
	}

	public WebElement getStructuralx11() {
		return Structuralx11;
	}

	public WebElement getStructuralx12() {
		return Structuralx12;
	}

	public WebElement getStructuralx13() {
		return Structuralx13;
	}

	public WebElement getStructuralx14() {
		return Structuralx14;
	}

	public WebElement getStructuraly1() {
		return Structuraly1;
	}

	public WebElement getStructuraly2() {
		return Structuraly2;
	}

	public WebElement getStructuraly3() {
		return Structuraly3;
	}

	public WebElement getStructuraly4() {
		return Structuraly4;
	}

	public WebElement getStructuraly5() {
		return Structuraly5;
	}

	public WebElement getStructuraly6() {
		return Structuraly6;
	}

	public WebElement getStructuraly7() {
		return Structuraly7;
	}

	public WebElement getStructuraly8() {
		return Structuraly8;
	}

	public WebElement getStructuraly9() {
		return Structuraly9;
	}

	public WebElement getStructuraly10() {
		return Structuraly10;
	}

	public WebElement getStructuraly11() {
		return Structuraly11;
	}

	public WebElement getStructuraly12() {
		return Structuraly12;
	}

	public WebElement getStructuraly13() {
		return Structuraly13;
	}

	public WebElement getStructuraly14() {
		return Structuraly14;
	}

	public WebElement getStructuralplus1() {
		return Structuralplus1;
	}

	public WebElement getStructuralplus2() {
		return Structuralplus2;
	}

	public WebElement getStructuralplus3() {
		return Structuralplus3;
	}

	public WebElement getStructuralplus4() {
		return Structuralplus4;
	}

	public WebElement getStructuralplus5() {
		return Structuralplus5;
	}

	public WebElement getStructuralplus6() {
		return Structuralplus6;
	}

	public WebElement getStructuralplus7() {
		return Structuralplus7;
	}

	public WebElement getStructuralplus8() {
		return Structuralplus8;
	}

	public WebElement getStructuralplus9() {
		return Structuralplus9;
	}

	public WebElement getStructuralplus10() {
		return Structuralplus10;
	}

	public WebElement getStructuralplus11() {
		return Structuralplus11;
	}

	public WebElement getStructuralplus12() {
		return Structuralplus12;
	}

	public WebElement getStructuralplus13() {
		return Structuralplus13;
	}


	//Edit the gauges option (5584)
	
	
	@FindBy(xpath = "(//div[@class='name'])[2]")
	private WebElement Gaugetunnel;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[2]")
	private WebElement Gaugetunnelaction;
	@FindBy(xpath = "(//a[@class=\"jqGaugeBtn\"])[2]")
	private WebElement Gaugeeditoption;
	@FindBy(xpath = "(//select[@name='gauge_comparison'])[2]")
	private WebElement Gaugecomarisonbox;
	@FindBy(xpath = "//select[@name='gauge_vehicle']")
	private WebElement Gaugevechiclebopx;
	@FindBy(xpath = "(//option[text()='Japan Structural gauge'])[2]")
	private WebElement Japanstructuralgauge;
	@FindBy(xpath = "(//option[text()='Y26vehicle gauges'])[2]")
	private WebElement Ytypevehiclegauge;
	@FindBy(xpath = "(//input[@name=\"gauge_data[coordinates][0][x][]\"])[5]")
	private WebElement Scrolltolastbox;
	@FindBy(xpath = "(//a[text()='Save As New'])[2]")
	private WebElement Saveasnewbutton;
	@FindBy(xpath = "//input[@id='modal-savenew-gauge']")
	private WebElement Newnamebox;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement Newnamesavebutton;
	
	


	public WebElement getSaveasnewbutton() {
		return Saveasnewbutton;
	}

	public WebElement getNewnamebox() {
		return Newnamebox;
	}

	public WebElement getNewnamesavebutton() {
		return Newnamesavebutton;
	}

	public WebElement getGaugetunnel() {
		return Gaugetunnel;
	}

	public WebElement getGaugetunnelaction() {
		return Gaugetunnelaction;
	}

	public WebElement getGaugeeditoption() {
		return Gaugeeditoption;
	}

	public WebElement getGaugecomarisonbox() {
		return Gaugecomarisonbox;
	}

	public WebElement getGaugevechiclebopx() {
		return Gaugevechiclebopx;
	}

	public WebElement getJapanstructuralgauge() {
		return Japanstructuralgauge;
	}

	public WebElement getYtypevehiclegauge() {
		return Ytypevehiclegauge;
	}

	public WebElement getScrolltolastbox() {
		return Scrolltolastbox;
	}

	
	
	
	
	
	
	
	
	//Y25 bogies add parameter options(5750)
	

	@FindBy(xpath = "(//input[@name=\"bogie_name\"])[1]")
	private WebElement Bogiesnamebox;
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement Bogiescreatebutton;
	@FindBy(xpath = "//a[text()='Parameters']")
    private WebElement Bogiesparametersoption;
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[10]")
	private WebElement Bogiesparameterbody;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[1]")
	private WebElement Bogiesparameterplusnumberonebutton;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[2]")
	private WebElement Bogiesparameterplusnumbertwobutton;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[3]")
	private WebElement Bogiesparameterplusnumberthreebutton;
	@FindBy(xpath = "//input[@name=\"bogie_parameters[user][0][name]\"]")
	private WebElement Bogiesparameterdescriptionnumberonebox;
	@FindBy(xpath = "//input[@name=\"bogie_parameters[user][1][name]\"]")
	private WebElement Bogiesparameterdescriptionnumbertwobox;
	@FindBy(xpath = "//input[@name=\"bogie_parameters[user][2][name]\"]")
	private WebElement Bogiesparameterdescriptionnumberthreebox;
	@FindBy(xpath = "//input[@name=\"bogie_parameters[user][3][name]\"]")
	private WebElement Bogiesparameterdescriptionnumberfourbox;
    @FindBy(xpath = "//input[@name=\"bogie_parameters[user][0][pname]\"]")
    private WebElement Bogiesparameterparameternumberonebox;
    @FindBy(xpath = "//input[@name=\"bogie_parameters[user][1][pname]\"]")
    private WebElement Bogiesparameterparameternumbertwobox;
    @FindBy(xpath = "//input[@name=\"bogie_parameters[user][2][pname]\"]")
    private WebElement Bogiesparameterparameternumberthreebox;
    @FindBy(xpath = "//input[@name=\"bogie_parameters[user][3][pname]\"]")
    private WebElement Bogiesparameterparameternumberfourbox;
    @FindBy(xpath = "//input[@name=\"bogie_parameters[user][0][value]\"]")
    private WebElement Bogiesparametervaluenumberonebox;
    @FindBy(xpath = "//input[@name=\"bogie_parameters[user][1][value]\"]")
    private WebElement Bogiesparametervaluenumbertwobox;
    @FindBy(xpath = "//input[@name=\"bogie_parameters[user][2][value]\"]")
    private WebElement Bogiesparametervaluenumberthreebox;
    @FindBy(xpath = "//input[@name=\"bogie_parameters[user][3][value]\"]")
    private WebElement Bogiesparametervaluenumberfourbox;
    @FindBy(xpath = "(//input[@class=\"form-control w-60 jqParameterAutocomplete\"])[1]")
    private WebElement Bogiesparametervalueforsemiwheelbasebox;
    @FindBy(xpath = "(//input[@class=\"form-control w-60 jqParameterAutocomplete\"])[2]")
    private WebElement Bogiesparametervalueforwheelradiusbox;
    @FindBy(xpath = "(//input[@class=\"form-control w-60 jqParameterAutocomplete\"])[4]")
    private WebElement Bogiesparametervaluedorvehiclebodybox; 
    @FindBy(xpath = "(//button[text()='Save'])[7]")
    private WebElement Bogiesparametersavebutton;

    
    
	public WebElement getBogiesparameterbody() {
		return Bogiesparameterbody;
	}

	public WebElement getBogiesparametervaluedorvehiclebodybox() {
		return Bogiesparametervaluedorvehiclebodybox;
	}

	public WebElement getBogiesnamebox() {
		return Bogiesnamebox;
	}

	public WebElement getBogiescreatebutton() {
		return Bogiescreatebutton;
	}

	public WebElement getBogiesparametersoption() {
		return Bogiesparametersoption;
	}

	public WebElement getBogiesparameterplusnumberonebutton() {
		return Bogiesparameterplusnumberonebutton;
	}

	public WebElement getBogiesparameterplusnumbertwobutton() {
		return Bogiesparameterplusnumbertwobutton;
	}

	public WebElement getBogiesparameterplusnumberthreebutton() {
		return Bogiesparameterplusnumberthreebutton;
	}

	public WebElement getBogiesparameterdescriptionnumberonebox() {
		return Bogiesparameterdescriptionnumberonebox;
	}

	public WebElement getBogiesparameterdescriptionnumbertwobox() {
		return Bogiesparameterdescriptionnumbertwobox;
	}

	public WebElement getBogiesparameterdescriptionnumberthreebox() {
		return Bogiesparameterdescriptionnumberthreebox;
	}

	public WebElement getBogiesparameterdescriptionnumberfourbox() {
		return Bogiesparameterdescriptionnumberfourbox;
	}

	public WebElement getBogiesparameterparameternumberonebox() {
		return Bogiesparameterparameternumberonebox;
	}

	public WebElement getBogiesparameterparameternumbertwobox() {
		return Bogiesparameterparameternumbertwobox;
	}

	public WebElement getBogiesparameterparameternumberthreebox() {
		return Bogiesparameterparameternumberthreebox;
	}

	public WebElement getBogiesparameterparameternumberfourbox() {
		return Bogiesparameterparameternumberfourbox;
	}

	public WebElement getBogiesparametervaluenumberonebox() {
		return Bogiesparametervaluenumberonebox;
	}

	public WebElement getBogiesparametervaluenumbertwobox() {
		return Bogiesparametervaluenumbertwobox;
	}

	public WebElement getBogiesparametervaluenumberthreebox() {
		return Bogiesparametervaluenumberthreebox;
	}

	public WebElement getBogiesparametervaluenumberfourbox() {
		return Bogiesparametervaluenumberfourbox;
	}

	public WebElement getBogiesparametervalueforsemiwheelbasebox() {
		return Bogiesparametervalueforsemiwheelbasebox;
	}

	public WebElement getBogiesparametervalueforwheelradiusbox() {
		return Bogiesparametervalueforwheelradiusbox;
	}

	public WebElement getBogiesparametersavebutton() {
		return Bogiesparametersavebutton;
	}

    
    
    
    //Y25 Bogies create part option locators(5823)
	
	@FindBy(xpath = "(//input[@class=\"form-control\"])[2]")
	private WebElement Bogiesmassnameeditbox;
	@FindBy(xpath = "(//a[contains(text(),'Inertia')])[2]")
	private WebElement Bogiesinertiaoption;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][mass]\"])[2]")
	private WebElement Bogiesaddmassinertiamassbox;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][roll_inertia]\"])[2]")
	private WebElement Bogiesaddmassinertiarollinertiabox;
	@FindBy(xpath = "//input[@class=\"jqAxelPitchInertia mr-1\"]")
	private WebElement Bogiesaddpitchinertiacheckbox;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][axel_pitch_inertia]\"])[1]")
	private WebElement Bogiesaddmassinertiapitchinertiabox;                     //name="part_data[inertia][axel_pitch_inertia]"
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][yaw_inertia]\"])[2]")
	private WebElement Bogiesaddmassinertiayawinertiabox;
	@FindBy(xpath = "(//a[contains(text(),'Appearance')])[2]")
	private WebElement Bogiesaddmassappearanceoption;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[2]")
	private WebElement BogiesaddmasscustomthreeDmodule;
	@FindBy(xpath = "(//a[text()='Save'])[2]")
	private WebElement Bogiesaddmassaddbutton;
	@FindBy(xpath = "(//a[text()='Save'])[1]")
	private WebElement Bogiesaddmasssaveone;
	@FindBy(xpath = "(//span[text()='No Custom Model Selected'])[2]")
	private WebElement Bogiesaddmassselectleftaxlebox;
	@FindBy(xpath = "(//span[text()='No Custom Model Selected'])[1]")
	private WebElement BogiesaddmassselectthreeDtype;
	@FindBy(xpath = "//li[text()='Updated Y25 Axlebox']")
	private WebElement Bogiesselectytype;
	@FindBy(xpath = "(//span[text()='No Custom Model Selected'])[2]")
	private WebElement Bogiesaddmassselectlrightaxlebox;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[1]")
	private WebElement Bogiesaddmassnamebox;
	@FindBy(xpath = "//button[text()='Create Part						']")
    private WebElement Bogiescreatepartoption;
	@FindBy(xpath = "//li[text()='Y25 Side Bearer']")
	private WebElement Bogiesaddmasssidebearer;

	
	

	public WebElement getBogiesaddmasssidebearer() {
		return Bogiesaddmasssidebearer;
	}

	public WebElement getBogiesaddmasssaveone() {
		return Bogiesaddmasssaveone;
	}

	public WebElement getBogiespartnameeditbox() {
		return Bogiespartnameeditbox;
	}

	public WebElement getBogiesmassxeditbox() {
		return Bogiesmassxeditbox;
	}

	public WebElement getBogiesmassyeditbox() {
		return Bogiesmassyeditbox;
	}

	public WebElement getBogiesmasszeditbox() {
		return Bogiesmasszeditbox;
	}

	public WebElement getBogiesmassinertiaoption() {
		return Bogiesmassinertiaoption;
	}

	public WebElement getBogiescreatepartoption() {
		return Bogiescreatepartoption;
	}

	public WebElement getBogiesaddmassnamebox() {
		return Bogiesaddmassnamebox;
	}

	public WebElement getBogiesaddmassselectthreeDtype() {
		return BogiesaddmassselectthreeDtype;
	}

	public WebElement getBogiesaddmassselectleftaxlebox() {
		return Bogiesaddmassselectleftaxlebox;
	}

	public WebElement getBogiesselectytype() {
		return Bogiesselectytype;
	}

	public WebElement getBogiesaddmassselectlrightaxlebox() {
		return Bogiesaddmassselectlrightaxlebox;
	}

	public WebElement getBogiesaddpitchinertiacheckbox() {
		return Bogiesaddpitchinertiacheckbox;
	}

	public WebElement getBogiesmassnameeditbox() {
		return Bogiesmassnameeditbox;
	}


	public WebElement getBogiesinertiaoption() {
		return Bogiesinertiaoption;
	}

	public WebElement getBogiesaddmassinertiamassbox() {
		return Bogiesaddmassinertiamassbox;
	}

	public WebElement getBogiesaddmassinertiarollinertiabox() {
		return Bogiesaddmassinertiarollinertiabox;
	}

	public WebElement getBogiesaddmassinertiapitchinertiabox() {
		return Bogiesaddmassinertiapitchinertiabox;
	}

	public WebElement getBogiesaddmassinertiayawinertiabox() {
		return Bogiesaddmassinertiayawinertiabox;
	}

	public WebElement getBogiesaddmassappearanceoption() {
		return Bogiesaddmassappearanceoption;
	}

	public WebElement getBogiesaddmasscustomthreeDmodule() {
		return BogiesaddmasscustomthreeDmodule;
	}

	public WebElement getBogiesaddmassaddbutton() {
		return Bogiesaddmassaddbutton;
	}
	
	
	//Y25 add Mass options locater(5941)
	
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[12]")
	private WebElement Bogiesmassbody;
	@FindBy(xpath = "(//a[text()='Add'])[1]")
	private WebElement Bogiesaddbutton;
	@FindBy(xpath = "(//button[@class=\"btn btn-primary btn-block jqPartBtn create-part-btn\"])[1]")
	private WebElement Bogiesmassoption;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[1]")
	private WebElement Bogiespartnameeditbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[1]")
	private WebElement Bogiesmassxeditbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[1]")
	private WebElement Bogiesmassyeditbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[1]")
	private WebElement Bogiesmasszeditbox;
	@FindBy(xpath = "(//a[contains(text(),'Inertia')])[1]")
	private WebElement Bogiesmassinertiaoption;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqConvertValue\"])[1]")
	private WebElement Bogiesaddmasseditmassbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqConvertValue\"])[2]")
	private WebElement Bogiesaddmasseditrollinertiabox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqConvertValue\"])[3]")
	private WebElement Bogiesaddmasseditpitchinertiabox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqConvertValue\"])[4]")
	private WebElement Bogiesaddmassedityowinertiabox;
	@FindBy(xpath = "(//a[contains(text(),'Appearance')])[1]")
	private WebElement Bogiesaddmasseditappearance;
	@FindBy(xpath = "(//span[text()='No Custom Model Selected'])[1]")
	private WebElement BogiesaddmasseditthreeDmodelselectbox;
	@FindBy(xpath = "//li[text()='Updated Y25 Bogie Frame']")
	private WebElement Bogiesaddmassseectymodel;
	@FindBy(xpath = "(//a[text()='Add'])[2]")
	private WebElement Bogiesaddmassavebutton;
	@FindBy(xpath = "(//button[@class=\"btn btn-primary btn-block jqPartBtn create-part-btn\"])[1]")
	private WebElement Bogiesframeoption;
	@FindBy(xpath ="//button[text()='Click to Refresh 3D View']")
	private WebElement BogiesclicktorefreshthreeDview;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[1]")
	private WebElement Bogiesaddmasspositionoption;
	@FindBy(xpath = "//button[@id=\"jq3DBogieRefresh\"]")
	private WebElement BogiesaddmassviewThreeDmouseover;
	@FindBy(xpath = "//li[text()='Mass']")
	private WebElement Bogieaddmassselectmassoption;
	
	
	
	public WebElement getBogiesmassbody() {
		return Bogiesmassbody;
	}
	public WebElement getBogieaddmassselectmassoption() {
		return Bogieaddmassselectmassoption;
	}

	public WebElement getBogiesaddmassviewThreeDmouseover() {
		return BogiesaddmassviewThreeDmouseover;
	}

	public WebElement getBogiesaddmasspositionoption() {
		return Bogiesaddmasspositionoption;
	}

	public WebElement getBogiesclicktorefreshthreeDview() {
		return BogiesclicktorefreshthreeDview;
	}

	public WebElement getBogiesmassoption() {
		return Bogiesmassoption;
	}

	public WebElement getBogiesaddbutton() {
		return Bogiesaddbutton;
	}
	
	
	public WebElement getBogiesframeoption() {
		return Bogiesframeoption;
	}

	public WebElement getBogiesaddmassavebutton() {
		return Bogiesaddmassavebutton;
	}

	public WebElement getBogiesaddmassseectymodel() {
		return Bogiesaddmassseectymodel;
	}

	public WebElement getBogiesaddmasseditmassbox() {
		return Bogiesaddmasseditmassbox;
	}

	public WebElement getBogiesaddmasseditrollinertiabox() {
		return Bogiesaddmasseditrollinertiabox;
	}

	public WebElement getBogiesaddmasseditpitchinertiabox() {
		return Bogiesaddmasseditpitchinertiabox;
	}

	public WebElement getBogiesaddmassedityowinertiabox() {
		return Bogiesaddmassedityowinertiabox;
	}

	public WebElement getBogiesaddmasseditappearance() {
		return Bogiesaddmasseditappearance;
	}

	public WebElement getBogiesaddmasseditthreeDmodelselectbox() {
		return BogiesaddmasseditthreeDmodelselectbox;
	}

	
	
	
	//Y25 bogies friction element locater(6519)
	
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[19]")
	private WebElement Bogiesfrictionbody;
    @FindBy(xpath = "//button[@data-target=\"#jqPartModal-friction\"]")
    private WebElement Bogiesfrictionmainfrictionoption;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[8]")
	private WebElement Bogiesfrictioneditnamebox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[29]")
	private WebElement Bogiesfrictionpositiontopxbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[30]")
	private WebElement Bogiesfrictionpositionbottomxbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[31]")
	private WebElement Bogiesfrictionpositiontopybox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[32]")
	private WebElement Bogiesfrictionpositionbottomybox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[33]")
	private WebElement Bogiesfrictionpositiontopzbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[34]")
	private WebElement Bogiesfrictionpositionbottomzbox;
	@FindBy(xpath = "(//span[text()='Not Connected'])[5]")
	private WebElement Bogiesfrictiontopmassbox;
	@FindBy(xpath = "(//span[text()='Not Connected'])[5]")
	private WebElement Bogiesfrictionbottommassbox;
	@FindBy(xpath = "//li[text()='Vehicle Body']")
	private WebElement Bogiesfrictionvehiclebody;
	@FindBy(xpath = "(//li[text()='Bogies_Frame_Modelled'])[2]")
	private WebElement Bogiesfrictionbogiesframemodelled;
	@FindBy(xpath = "(//li[text()='Fron_Wheelset_modelled'])[2]")
	private WebElement Bogiesfrictionfrontwheelset;
	@FindBy(xpath = "(//li[text()='Rear_Wheelset_modelled'])[2]")
	private WebElement Bogiesfrictionrearwheelset;
	@FindBy(xpath = "(//li[text()='Side bearer_L_Modelled'])[2]")
	private WebElement Bogiesfrictionsidebearerleft;
	@FindBy(xpath = "(//li[text()='Side bearer_R_Modelled'])[2]")
	private WebElement Bogiesfrictionsidebearerright;
	//friction
	@FindBy(xpath = "(//a[contains(text(),'Friction')])[1]")
	private WebElement Bogiesfrictionoption;
	@FindBy(xpath = "(//a[contains(text(),'Friction')])[1]")
	private WebElement Bogiesfrictionoptiontwo;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[25]")
	private WebElement Bogiesfrictiondetailedoption;
	@FindBy(xpath = "((//input[@class=\"form-control w-65 jqConvertValue\"]))[61]")
	private WebElement BogiesfrictiondetailedCOFC;
	@FindBy(xpath = "((//input[@class=\"form-control w-65 jqConvertValue\"]))[62]")
	private WebElement BogiesfrictiondetailedCOFT;
	@FindBy(xpath = "//input[@name=\"part_data[friction][load]\"]")
	private WebElement Bogiesfrictiondetailedsaticpartnormalload;
	//stiffness
	@FindBy(xpath = "(//a[contains(text(),'Stiffness/Damping')])[2]")
	private WebElement Bogiesfrictionstiffnessoption;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][has_series_stiffness]\"]")
	private WebElement Bogiesfrictionstiffnessselectseriesstiffness;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][series_stiffness]\"])[2]")
	private WebElement Bogiesfrictionstiffnessvaluebox;
	//dynamic/stiffness
	@FindBy(xpath = "//a[contains(text(),'Dynamic')]")
	private WebElement Bogiesfrictiondynamicoption;
	@FindBy(xpath = "//input[@class=\"jqPartSelect-stiffness\"]")
	private WebElement Bogiesfrictiondynamicstiffnessoption;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[11]") 
	private WebElement Bogiesfrictiondynamicstiffnessselectbox;
	@FindBy(xpath = "(//li[text()='Center_Pivot_Z'])[2]")
	private WebElement Bogiesfrictiondynamicstiffnesscenterpivotz;
	@FindBy(xpath = "(//li[text()='Sidebearer_Stiff_Z_L'])[2]")
	private WebElement Bogiesfrictiondynamicstiffnesssidebearerstiffzleft;
	@FindBy(xpath = "(//li[text()='Sidebearer_Stiff_Z_R'])[2]")
	private WebElement Bogiesfrictiondynamicstiffnesssidebearerstiffzright;
	@FindBy(xpath = "//input[@class=\"form-control jqConvertValue jqPartFactor-stiffness\"]")
	private WebElement Bogiesfrictiondynamicstiffnessfactorbox;
	//Dynamic/bumpstop
	@FindBy(xpath = "//input[@name=\"bptg_bogie_part_data[load][bumpstop]\"]")
	private WebElement Bogiesfrictiondynamicbumpstopoption;
	@FindBy(xpath = "(//span[@class=\"select2-selection__placeholder\"])[2]")
	private WebElement Bogiesfrictiondynamicbumpstopbox;
	@FindBy(xpath = "//input[@class=\"form-control jqConvertValue jqPartFactor-bumpstop\"]")
	private WebElement Bogiesfrictiondynamicbumpstopforcebox;
	
	@FindBy(xpath = "(//li[text()='Y25D_Sidebearer_Stop'])[2]")
	private WebElement BogiesfrictiondynamicbumstopY25sidebearer;
	@FindBy(xpath = "(//li[text()='PR1_X_LL_1'])[2]")
	private WebElement BogiesfrictiondynamicbumpstopPR1_X_LL_1;
	@FindBy(xpath = "(//li[text()='PR1_X_RL_1'])[2]")
	private WebElement BogiesfrictiondynamicbumpstopPR1_X_RL_1;
	@FindBy(xpath = "(//li[text()='PR1_X_TR_1'])[2]")
	private WebElement BogiesfrictiondynamicbumpstopPR1_X_TR_1;
	@FindBy(xpath = "(//li[text()='Primery_X_LL_O'])[2]")
	private WebElement BogiesfrictiondynamicbumpstopPrimery_X_LL_O;
	@FindBy(xpath = "(//li[text()='Primery_X_LR_O'])[2]")
	private WebElement BogiesfrictiondynamicbumpstopPrimery_X_LR_O;
	@FindBy(xpath = "(//li[text()='Primery_X_TL_O'])[2]")
	private WebElement BogiesfrictiondynamicbumpstopPrimery_X_TL_O;
	@FindBy(xpath = "(//li[text()='Primery_X_TR_O'])[2]")
	private WebElement BogiesfrictiondynamicbumpstopPrimery_X_TR_O;
	@FindBy(xpath = "(//li[text()='Y25D_Primary_Long_Bumper_Stop_Inner'])[2]")
	private WebElement BogiesfrictiondynamicbumpstopY25D_primary_long_Bump_Stop_Inner;
	//Dynamic/shear spring
	@FindBy(xpath = "(//input[@class=\"jqPartSelect-shear-spring\"])[1]")
	private WebElement Bogiesfrictiondynamicshearspringoption;
	@FindBy(xpath = "(//span[@class=\"select2-selection__placeholder\"])[3]")
	private WebElement Bogiesfrictiondynmaicshearspringbox;
	@FindBy(xpath = "//input[@name=\"bptg_bogie_part_data[load][shear_spring_factor]\"]")
	private WebElement Bogiesfrictiondynamicshearspringforcebox;
	@FindBy(xpath = "(//a[contains(text(),'Coupling')])[2]")
	private WebElement Bogiesfrictioncouplingoption;
	@FindBy(xpath = "//input[@name=\"bptg_bogie_part_data[coupling][friction]\"]")
	private WebElement Bogiesfrictioncouplingselectbutton;
	@FindBy(xpath = "//input[@name=\\\"bptg_bogie_part_data[coupling][friction]\\\"]")
	private WebElement Bogiesfrictioncouplingselectbox;
	@FindBy(xpath = "(//a[text()='Add'])[9]")
	private WebElement YtypeBogiesfrictionaddbutton;
    @FindBy(xpath = "(//li[text()='PR1_LL_1'])[2]")
    private WebElement BogiesfrictiondynamicshearspringPR1_LL_1;
    @FindBy(xpath = "(//li[text()='PR1_LR_1'])[2]")
    private WebElement BogiesfrictiondynamicshearspringPR1_LR_1;
    @FindBy(xpath = "(//li[text()='PR1_TL_1'])[2]")
    private WebElement BogiesfrictiondynamicshearspringPR1_TL_1;
	@FindBy(xpath = "(//li[text()='PR1_TR_1'])[2]")
	private WebElement BogiesfrictiondynamicshearspringPR1_TR_1;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[8]")
	private WebElement Bogiesfrictionpositionoption;
	
	
	
	public WebElement getBogiesfrictionbody() {
		return Bogiesfrictionbody;
	}

	public WebElement getBogiesfrictiondynamicbumstopY25sidebearer() {
		return BogiesfrictiondynamicbumstopY25sidebearer;
	}

	public WebElement getBogiesfrictionoptiontwo() {
		return Bogiesfrictionoptiontwo;
	}

	public WebElement getBogiesfrictiontwo() {
		return Bogiesfrictionoptiontwo;
	}

	public WebElement getBogiesfrictionpositionoption() {
		return Bogiesfrictionpositionoption;
	}

	public WebElement getBOgiesfrictionpositionoption() {
		return Bogiesfrictionpositionoption;
	}

	public WebElement getBogiesfrictiondynamicshearspringforcebox() {
		return Bogiesfrictiondynamicshearspringforcebox;
	}

	public WebElement getBogiesfrictiondynamicbumpstopforcebox() {
		return Bogiesfrictiondynamicbumpstopforcebox;
	}

	public WebElement getBogiesfrictiondynamicstiffnesscenterpivotz() {
		return Bogiesfrictiondynamicstiffnesscenterpivotz;
	}

	public WebElement getBogiesfrictiondynamicstiffnesssidebearerstiffzleft() {
		return Bogiesfrictiondynamicstiffnesssidebearerstiffzleft;
	}

	public WebElement getBogiesfrictiondynamicstiffnesssidebearerstiffzright() {
		return Bogiesfrictiondynamicstiffnesssidebearerstiffzright;
	}

	public WebElement getBogiesfrictiondynamicbumpstopPR1_X_LL_1() {
		return BogiesfrictiondynamicbumpstopPR1_X_LL_1;
	}

	public WebElement getBogiesfrictiondynamicbumpstopPR1_X_RL_1() {
		return BogiesfrictiondynamicbumpstopPR1_X_RL_1;
	}

	public WebElement getBogiesfrictiondynamicbumpstopPR1_X_TR_1() {
		return BogiesfrictiondynamicbumpstopPR1_X_TR_1;
	}

	public WebElement getBogiesfrictiondynamicbumpstopPrimery_X_LL_O() {
		return BogiesfrictiondynamicbumpstopPrimery_X_LL_O;
	}

	public WebElement getBogiesfrictiondynamicbumpstopPrimery_X_LR_O() {
		return BogiesfrictiondynamicbumpstopPrimery_X_LR_O;
	}

	public WebElement getBogiesfrictiondynamicbumpstopPrimery_X_TL_O() {
		return BogiesfrictiondynamicbumpstopPrimery_X_TL_O;
	}

	public WebElement getBogiesfrictiondynamicbumpstopPrimery_X_TR_O() {
		return BogiesfrictiondynamicbumpstopPrimery_X_TR_O;
	}

	public WebElement getBogiesfrictiondynamicbumpstopY25D_primary_long_Bump_Stop_Inner() {
		return BogiesfrictiondynamicbumpstopY25D_primary_long_Bump_Stop_Inner;
	}

	public WebElement getBogiesfrictiondynamicshearspringPR1_LL_1() {
		return BogiesfrictiondynamicshearspringPR1_LL_1;
	}

	public WebElement getBogiesfrictiondynamicshearspringPR1_LR_1() {
		return BogiesfrictiondynamicshearspringPR1_LR_1;
	}

	public WebElement getBogiesfrictiondynamicshearspringPR1_TL_1() {
		return BogiesfrictiondynamicshearspringPR1_TL_1;
	}

	public WebElement getBogiesfrictiondynamicshearspringPR1_TR_1() {
		return BogiesfrictiondynamicshearspringPR1_TR_1;
	}

	public WebElement getBogiesfrictionmainfrictionoption() {
		return Bogiesfrictionmainfrictionoption;
	}

	public WebElement getBogiesfrictioneditnamebox() {
		return Bogiesfrictioneditnamebox;
	}

	public WebElement getBogiesfrictionpositiontopxbox() {
		return Bogiesfrictionpositiontopxbox;
	}

	public WebElement getBogiesfrictionpositionbottomxbox() {
		return Bogiesfrictionpositionbottomxbox;
	}

	public WebElement getBogiesfrictionpositiontopybox() {
		return Bogiesfrictionpositiontopybox;
	}

	public WebElement getBogiesfrictionpositionbottomybox() {
		return Bogiesfrictionpositionbottomybox;
	}

	public WebElement getBogiesfrictionpositiontopzbox() {
		return Bogiesfrictionpositiontopzbox;
	}

	public WebElement getBogiesfrictionpositionbottomzbox() {
		return Bogiesfrictionpositionbottomzbox;
	}

	public WebElement getBogiesfrictiontopmassbox() {
		return Bogiesfrictiontopmassbox;
	}

	public WebElement getBogiesfrictionbottommassbox() {
		return Bogiesfrictionbottommassbox;
	}

	public WebElement getBogiesfrictionoption() {
		return Bogiesfrictionoption;
	}

	public WebElement getBogiesfrictiondetailedoption() {
		return Bogiesfrictiondetailedoption;
	}

	public WebElement getBogiesfrictiondetailedCOFC() {
		return BogiesfrictiondetailedCOFC;
	}

	public WebElement getBogiesfrictiondetailedCOFT() {
		return BogiesfrictiondetailedCOFT;
	}

	public WebElement getBogiesfrictiondetailedsaticpartnormalload() {
		return Bogiesfrictiondetailedsaticpartnormalload;
	}

	public WebElement getBogiesfrictionstiffnessoption() {
		return Bogiesfrictionstiffnessoption;
	}

	public WebElement getBogiesfrictionstiffnessselectseriesstiffness() {
		return Bogiesfrictionstiffnessselectseriesstiffness;
	}

	public WebElement getBogiesfrictionstiffnessvaluebox() {
		return Bogiesfrictionstiffnessvaluebox;
	}

	public WebElement getBogiesfrictiondynamicoption() {
		return Bogiesfrictiondynamicoption;
	}

	public WebElement getBogiesfrictiondynamicstiffnessoption() {
		return Bogiesfrictiondynamicstiffnessoption;
	}

	public WebElement getBogiesfrictiondynamicstiffnessselectbox() {
		return Bogiesfrictiondynamicstiffnessselectbox;
	}

	public WebElement getBogiesfrictiondynamicstiffnessfactorbox() {
		return Bogiesfrictiondynamicstiffnessfactorbox;
	}

	public WebElement getBogiesfrictioncouplingoption() {
		return Bogiesfrictioncouplingoption;
	}

	public WebElement getBogiesfrictioncouplingselectbutton() {
		return Bogiesfrictioncouplingselectbutton;
	}

	public WebElement getBogiesfrictioncouplingselectbox() {
		return Bogiesfrictioncouplingselectbox;
	}

	public WebElement getYtypeBogiesfrictionaddbutton() {
		return YtypeBogiesfrictionaddbutton;
	}
	
	
	
	
	//Y25 Bogie create bush locater(6395)
	
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[16]")
	private WebElement Bogiesbushbody;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[5]")
	private WebElement Bogiesbbusheditnamebox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[5]")
	private WebElement Bogiesfrictionbushxbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[5]")
	private WebElement Bogiesfrictionbushybox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[5]")
	private WebElement Bogiesfrictionbushzbox;
    @FindBy(xpath = "(//span[text()='Not Connected'])[3]")
    private WebElement Bogiesfrictionbushtopmassbox;
    @FindBy(xpath = "(//span[text()='Not Connected'])[3]")
    private WebElement Bogiesfrictionbushbottommassbox;
    @FindBy(xpath = "(//a[text()='Add'])[6]")
    private WebElement Bogiesfrictionbushaddbutton;
    @FindBy(xpath = "//button[@data-target=\"#jqPartModal-bush\"]")
    private WebElement Bogiesfrictionbushoption;
    @FindBy(xpath = "(//a[contains(text(),'Stiffness')])[3]")
    private WebElement Bogiesfrictionbushstiffnessoption;
    @FindBy(xpath = "(//input[@name=\"part_data[stiffness][has_stiffness]\"])[1]")
    private WebElement Bogiesfrictionbushstiffnesscheckbox;
    @FindBy(xpath = "//input[@name=\"part_data[stiffness][x]\"]")
    private WebElement Bogiesfrictionbushstiffnessxbox;
    @FindBy(xpath = "//input[@name=\"part_data[stiffness][y]\"]")
    private WebElement Bogiesfrictionbushstiffnessybox;
    @FindBy(xpath = "(//li[text()='Bogies_Frame_Modelled'])[2]")
    private WebElement Bogiesframemodelledbush;
    @FindBy(xpath = "(//li[text()='Vehicle Body'])[1]")
    private WebElement Vehiclenodymodelledbush;
    @FindBy(xpath = "(//a[contains(text(),'Appearance')])[4]")
    private WebElement Bogiesfrictionbushapprearanceoption;
    @FindBy(xpath = "(//input[@name=\"part_data[appearance][size]\"])[1]")
    private WebElement Bogiesfrictionbushsmall;
    @FindBy(xpath = "(//input[@name=\"part_data[appearance][axis]\"])[3]")
    private WebElement Bogiesfrictionbushaxisz;
    
    
    
	public WebElement getBogiesbushbody() {
		return Bogiesbushbody;
	}

	public WebElement getBogiesfrictionbushapprearanceoption() {
		return Bogiesfrictionbushapprearanceoption;
	}

	public WebElement getBogiesfrictionbushsmall() {
		return Bogiesfrictionbushsmall;
	}

	public WebElement getBogiesfrictionbushaxisz() {
		return Bogiesfrictionbushaxisz;
	}

	public WebElement getBogiesframemodelledbush() {
		return Bogiesframemodelledbush;
	}

	public WebElement getVehiclenodymodelledbush() {
		return Vehiclenodymodelledbush;
	}

	public WebElement getBogiesfrictionbushoption() {
		return Bogiesfrictionbushoption;
	}

	public WebElement getBogiesfrictionbushstiffnessoption() {
		return Bogiesfrictionbushstiffnessoption;
	}

	public WebElement getBogiesfrictionbushstiffnesscheckbox() {
		return Bogiesfrictionbushstiffnesscheckbox;
	}

	public WebElement getBogiesfrictionbushstiffnessxbox() {
		return Bogiesfrictionbushstiffnessxbox;
	}

	public WebElement getBogiesfrictionbushstiffnessybox() {
		return Bogiesfrictionbushstiffnessybox;
	}

	public WebElement getBogiesbbusheditnamebox() {
		return Bogiesbbusheditnamebox;
	}

	public WebElement getBogiesfrictionbushxbox() {
		return Bogiesfrictionbushxbox;
	}

	public WebElement getBogiesfrictionbushybox() {
		return Bogiesfrictionbushybox;
	}

	public WebElement getBogiesfrictionbushzbox() {
		return Bogiesfrictionbushzbox;
	}

	public WebElement getBogiesfrictionbushtopmassbox() {
		return Bogiesfrictionbushtopmassbox;
	}

	public WebElement getBogiesfrictionbushbottommassbox() {
		return Bogiesfrictionbushbottommassbox;
	}

	public WebElement getBogiesfrictionbushaddbutton() {
		return Bogiesfrictionbushaddbutton;
	}
    
    
    
    //Y25 Bogie add stiffness element locator(6437)
	
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[21]")
	private WebElement Bogiesstiffnessbody;
	@FindBy(xpath = "//button[@data-part_type=\"stiffness\"]")
	private WebElement Bogiesfrictionytypestiffnessoption;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[10]")
	private WebElement Bogiesfrictionstiffnessnamebox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[41]")
	private WebElement Bogiesfrictionstiffnesstopxbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[42]")
	private WebElement Bogiesfrictionstiffnessbottomxbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[43]")
	private WebElement Bogiesfrictionstiffnesstopybox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[44]")
	private WebElement Bogiesfrictionstiffnessbottomybox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[45]")
	private WebElement Bogiesfrictionstiffnesstopzbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[46]")
	private WebElement Bogiesfrictionstiffnessbottomzbox;
	@FindBy(xpath = "(//span[text()='Not Connected'])[5]")
	private WebElement Bogiesfrictionstiffnesstopmassbox;
	@FindBy(xpath = "(//span[text()='Not Connected'])[5]")
	private WebElement Bogiesfrictionstiffnessbottommassbox;
	@FindBy(xpath = "(//span[text()='Not Connected'])[5]")
	private WebElement Bogiesfrictionstiffnesstopmassboxsecond;
	@FindBy(xpath = "(//span[text()='Not Connected'])[5]")
	private WebElement Bogiesfrictionstiffnessbottommassboxsecond;
	@FindBy(xpath = "(//a[text()='Add'])[11]")
	private WebElement Bogiesfrictionstiffnessaddbutton;
	@FindBy(xpath = "//li[text()='Vehicle Body']")
	private WebElement Bogiesfrictionstiffnessvehiclebody;
	@FindBy(xpath = "(//li[text()='Side bearer_L_Modelled'])[2]")
	private WebElement Bogiesfrictionstiffnesssidebearerleft;
	@FindBy(xpath = "(//li[text()='Side bearer_R_Modelled'])[2]")
	private WebElement Bogiesfrictionstiffnesssidebearerright;
	@FindBy(xpath = "(//li[text()='Bogies_Frame_Modelled'])[2]")
    private WebElement Bogiesfrictionstiffnessbogiesframemodelled;
	@FindBy(xpath = "(//a[contains(text(),'Stiffness')])[7]")
	private WebElement Bogiesfrictionstiffnessvalueoption;
	@FindBy(xpath = "(//a[contains(text(),'Stiffness')])[7]")
	private WebElement Bogiesfrictionstiffnessvalueoptiontwo;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][linear]\"]")
	private WebElement Bogiesfrictionstiffnesslinearbox;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[10]")
	private WebElement Bogiesfrictionstiffnesspositionoption;
	
	
	
	
	
	public WebElement getBogiesstiffnessbody() {
		return Bogiesstiffnessbody;
	}

	public WebElement getBogiesfrictionstiffnessvalueoptiontwo() {
		return Bogiesfrictionstiffnessvalueoptiontwo;
	}

	public WebElement getBogiesfrictionstiffnesstopmassboxsecond() {
		return Bogiesfrictionstiffnesstopmassboxsecond;
	}

	public WebElement getBogiesfrictionstiffnessbottommassboxsecond() {
		return Bogiesfrictionstiffnessbottommassboxsecond;
	}

	public WebElement getBogiesfrictionstiffnesspositionoption() {
		return Bogiesfrictionstiffnesspositionoption;
	}

	public WebElement getBogiesfrictionstiffnessvalueoption() {
		return Bogiesfrictionstiffnessvalueoption;
	}

	public WebElement getBogiesfrictionstiffnesslinearbox() {
		return Bogiesfrictionstiffnesslinearbox;
	}

	public WebElement getBogiesfrictionytypestiffnessoption() {
		return Bogiesfrictionytypestiffnessoption;
	}

	public WebElement getBogiesfrictionstiffnessvehiclebody() {
		return Bogiesfrictionstiffnessvehiclebody;
	}

	public WebElement getBogiesfrictionstiffnesssidebearerleft() {
		return Bogiesfrictionstiffnesssidebearerleft;
	}

	public WebElement getBogiesfrictionstiffnesssidebearerright() {
		return Bogiesfrictionstiffnesssidebearerright;
	}

	public WebElement getBogiesfrictionstiffnessbogiesframemodelled() {
		return Bogiesfrictionstiffnessbogiesframemodelled;
	}

	public WebElement getBogiesfrictionstiffnessnamebox() {
		return Bogiesfrictionstiffnessnamebox;
	}

	public WebElement getBogiesfrictionstiffnesstopxbox() {
		return Bogiesfrictionstiffnesstopxbox;
	}

	public WebElement getBogiesfrictionstiffnessbottomxbox() {
		return Bogiesfrictionstiffnessbottomxbox;
	}

	public WebElement getBogiesfrictionstiffnesstopybox() {
		return Bogiesfrictionstiffnesstopybox;
	}

	public WebElement getBogiesfrictionstiffnessbottomybox() {
		return Bogiesfrictionstiffnessbottomybox;
	}

	public WebElement getBogiesfrictionstiffnesstopzbox() {
		return Bogiesfrictionstiffnesstopzbox;
	}

	public WebElement getBogiesfrictionstiffnessbottomzbox() {
		return Bogiesfrictionstiffnessbottomzbox;
	}

	public WebElement getBogiesfrictionstiffnesstopmassbox() {
		return Bogiesfrictionstiffnesstopmassbox;
	}

	public WebElement getBogiesfrictionstiffnessbottommassbox() {
		return Bogiesfrictionstiffnessbottommassbox;
	}

	public WebElement getBogiesfrictionstiffnessaddbutton() {
		return Bogiesfrictionstiffnessaddbutton;
	}
	
	
	
	//Y25 Bogie add wheel set option locater(6089)
	
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[13]")
	private WebElement Bogieswheelsetbody;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[2]")
	private WebElement Bogiesfrictionwheelsetnamebox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[2]")
	private WebElement Bogiesfrictionwheelsetxbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[2]")
	private WebElement Bogiesfrictionwheelsetybox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[2]")
	private WebElement Bogiesfrictionwheelsetzbox;
	@FindBy(xpath = "(//a[contains(text(),'Inertia')])[2]")
	private WebElement Bogiesfrictionwheelsetinertia;
	@FindBy(xpath = "//input[@name=\"part_data[inertia][has_axel_pitch_inertia]\"]")
	private WebElement Bogiesfrictionwheelsetaxelpitch;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 \"])[3]")
	private WebElement Bogiesfrictionwheelsetaxelpitchbox;
	@FindBy(xpath = "(//a[contains(text(),'Appearance')])[2]")
	private WebElement Bogiesfrictionwheelsetappearanceoption;
	@FindBy(xpath = "(//span[text()='No Custom Model Selected'])[3]")
	private WebElement Bogiesfrictionwheelsetleftaxlebox;
	@FindBy(xpath = "(//span[text()='No Custom Model Selected'])[3]")
	private WebElement Bogiesfrictionwheelsetrightaxlebox;
	@FindBy(xpath = "(//a[text()='Add'])[3]")
	private WebElement Bogiesfrictionwheelsetaddbutton;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[2]")
	private WebElement Bogiespositionforwheelset;
	@FindBy(xpath = "//li[text()='Updated Y25 Axlebox']")
	private WebElement Bogiesfrictionwheelsetselectytype;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][mass]\"])[2]")
	private WebElement Bogiesfrictionwheelsetmassbox;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][roll_inertia]\"])[2]")
	private WebElement Bogiesfrictionwheelsetrollinertia;
	

	
	
	public WebElement getBogieswheelsetbody() {
		return Bogieswheelsetbody;
	}

	public WebElement getBogiesfrictionwheelsetmassbox() {
		return Bogiesfrictionwheelsetmassbox;
	}

	public WebElement getBogiesfrictionwheelsetrollinertia() {
		return Bogiesfrictionwheelsetrollinertia;
	}

	public WebElement getBogiesfrictionwheelsetselectytype() {
		return Bogiesfrictionwheelsetselectytype;
	}

	public WebElement getBogiespositionforwheelset() {
		return Bogiespositionforwheelset;
	}

	public WebElement getBogiesfrictionwheelsetrightaxlebox() {
		return Bogiesfrictionwheelsetrightaxlebox;
	}

	public WebElement getBogiesfrictionwheelsetnamebox() {
		return Bogiesfrictionwheelsetnamebox;
	}

	public WebElement getBogiesfrictionwheelsetxbox() {
		return Bogiesfrictionwheelsetxbox;
	}

	public WebElement getBogiesfrictionwheelsetybox() {
		return Bogiesfrictionwheelsetybox;
	}

	public WebElement getBogiesfrictionwheelsetzbox() {
		return Bogiesfrictionwheelsetzbox;
	}

	public WebElement getBogiesfrictionwheelsetinertia() {
		return Bogiesfrictionwheelsetinertia;
	}

	public WebElement getBogiesfrictionwheelsetaxelpitch() {
		return Bogiesfrictionwheelsetaxelpitch;
	}

	public WebElement getBogiesfrictionwheelsetaxelpitchbox() {
		return Bogiesfrictionwheelsetaxelpitchbox;
	}

	public WebElement getBogiesfrictionwheelsetappearanceoption() {
		return Bogiesfrictionwheelsetappearanceoption;
	}

	public WebElement getBogiesfrictionwheelsetleftaxlebox() {
		return Bogiesfrictionwheelsetleftaxlebox;
	}

	public WebElement getBogiesfrictionwheelsetaddbutton() {
		return Bogiesfrictionwheelsetaddbutton;
	}
	
	
	
	//Y25 Bogie add bump stop option locater(7642)
	
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[15]")
	private WebElement Bogiebumopstopbody;
	@FindBy(xpath = "(//select[@name=\"part_data[stiffness][multiple][stroke_unit][]\"])[2]")
	private WebElement Bogiesstockinchone;
	@FindBy(xpath = "(//select[@name=\"part_data[stiffness][multiple][stroke_unit][]\"])[3]")
	private WebElement Bogiesstockinchtwo;
	@FindBy(xpath = "(//select[@name=\"part_data[stiffness][multiple][stroke_unit][]\"])[4]")
	private WebElement Bogiesstockinchthree;
	@FindBy(xpath = "(//option[@value=\"mm\"])[3]")
	private WebElement Bogiesstockmmone;
	@FindBy(xpath = "(//option[@value=\"mm\"])[4]")
	private WebElement Bogiesstockmmtwo;
	@FindBy(xpath = "(//option[@value=\"mm\"])[5]")
	private WebElement Bogiesstockmmthree;
	@FindBy(xpath = "(//select[@name=\"part_data[stiffness][multiple][force_unit][]\"])[2]")
	private WebElement Bogiesforcelbfone;
	@FindBy(xpath = "(//select[@name=\"part_data[stiffness][multiple][force_unit][]\"])[3]")
	private WebElement Bogiesforcelbftwo;
	@FindBy(xpath = "(//select[@name=\"part_data[stiffness][multiple][force_unit][]\"])[4]")
	private WebElement Bogiesforcelbfthree;
	@FindBy(xpath = "(//option[@value=\"kN\"])[3]")
	private WebElement Bogiesforceknone;
	@FindBy(xpath = "(//option[@value=\"kN\"])[4]")
	private WebElement Bogiesforcekntwo;
	@FindBy(xpath = "(//option[@value=\"kN\"])[5]")
	private WebElement Bogiesforceknthree;
	@FindBy(xpath = "//button[@data-part_type=\"bumpstop\"]")
	private WebElement Bogiesfrictionbumpstop;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[4]")
	private WebElement Bogiesfrictionbumpstopnamebox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[4]")
	private WebElement Bogiesfrictionbumpstoptopxbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][x]\"])[2]")
	private WebElement Bogiesfrictionbumpstopbottomxbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[4]")
	private WebElement Bogiesfrictionbumpstoptopybox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][y]\"])[2]")
	private WebElement Bogiesfrictionbumpstopbottomybox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[4]")
	private WebElement Bogiesfrictionbumpstoptopzbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][z]\"])[2]")
	private WebElement Bogiesfrictionbumpstopbottomzbox;
	@FindBy(xpath = "(//span[text()='Not Connected'])[1]")
	private WebElement Bogiesfrictionbumpstoptopmassbox;
	@FindBy(xpath = "(//span[text()='Not Connected'])[1]")
	private WebElement Bogiesfrictionbumpstopbottommassbox;
	@FindBy(xpath = "(//a[contains(text(),'Stiffness')])[2]")
	private WebElement Bogiesfrictionbumpstopstiffnessoption;
	@FindBy(xpath = "(//a[text()='Add'])[5]")
	private WebElement Bogiesfrictionbumpstopaddbutton;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[4]")
	private WebElement Bogiesfrictionbumpstopposition;
	@FindBy(xpath = "//li[text()='Vehicle Body']")
	private WebElement Bogiesfrictionbumpstopvehiclebody;
	@FindBy(xpath = "(//li[text()='Fron_Wheelset_modelled'])[2]")
	private WebElement Bogiesfrictionbumpstopfrontwheelset;
	@FindBy(xpath = "(//li[text()='Rear_Wheelset_modelled'])[2]")
	private WebElement Bogiesfrictionbumpstoprearwheelset;
	@FindBy(xpath = "(//li[text()='Bogies_Frame_Modelled'])[2]")
	private WebElement Bogiesfrictionbumpstopbogiesframemodelled;
	@FindBy(xpath = "(//li[text()='Side bearer_L_Modelled'])[2]")
	private WebElement Bogiesfrictionbumpstopsidebearerleft;
	@FindBy(xpath = "(//li[text()='Side bearer_R_Modelled'])[2]")
	private WebElement Bogiesfrictionbumpstopsidebearerright;
	@FindBy(xpath = "(//button[@class=\"btn btn-block btn-sm btn-success mt-0 jqMultiDataAdd\"])[2]")
	private WebElement Bogiesfrictionbumpstopstiffnesplusbutton;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[3]")
	private WebElement Bogiesfrictionbumpstopfirstplus;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[4]")
	private WebElement Bogiesfrictionbumpstopsecondplus;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[2]")
	private WebElement Bogiesfrictionbumpstopstiffnessstokeone;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[2]")
	private WebElement Bogiesfrictionbumpstopstiffnessforceone;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[3]")
	private WebElement Bogiesfrictionbumpstopstiffnessstoketwo;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[3]")
	private WebElement Bogiesfrictionbumpstopstiffnessforcetwo;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[4]")
	private WebElement Bogiesfrictionbumpstopstiffnessstokethree;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[4]")
	private WebElement Bogiesfrictionbumpstopstiffnessforcethree;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[5]")
	private WebElement Bogiesfrictionbumpstopstiffnessstokefour;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[5]")
	private WebElement Bogiesfrictionbumpstopstiffnessforcefour;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[6]")
	private WebElement Bogiesfrictionbumpstopstiffnessstokefive;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[6]")
	private WebElement Bogiesfrictionbumpstopstiffnessforcefive;
	//new add locater
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][has_offset]\"]")
	private WebElement Bogiesfrictionbumpstopdefineoffsetcheckbox;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][preload_offset]\"]")
	private WebElement Bogiesfrictionbumpstoppreloadbox;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][offset_type]\"])[1]")
	private WebElement Bogiesfrictionbumpstoppreloadcheckbox;
	@FindBy(xpath = "//input[@data-enable=\".clearance-offset\"]")
	private WebElement Bogiesfrictionbumpstopclearancecheckbox;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][clearance_offset]\"]")
	private WebElement Bogiesfrictionbumpstopclearancebox;
	
	

	public WebElement getBogiebumopstopbody() {
		return Bogiebumopstopbody;
	}

	public WebElement getBogiesstockinchone() {
		return Bogiesstockinchone;
	}

	public WebElement getBogiesstockinchtwo() {
		return Bogiesstockinchtwo;
	}

	public WebElement getBogiesstockinchthree() {
		return Bogiesstockinchthree;
	}

	public WebElement getBogiesstockmmone() {
		return Bogiesstockmmone;
	}

	public WebElement getBogiesstockmmtwo() {
		return Bogiesstockmmtwo;
	}

	public WebElement getBogiesstockmmthree() {
		return Bogiesstockmmthree;
	}

	public WebElement getBogiesforcelbfone() {
		return Bogiesforcelbfone;
	}

	public WebElement getBogiesforcelbftwo() {
		return Bogiesforcelbftwo;
	}

	public WebElement getBogiesforcelbfthree() {
		return Bogiesforcelbfthree;
	}

	public WebElement getBogiesforceknone() {
		return Bogiesforceknone;
	}

	public WebElement getBogiesforcekntwo() {
		return Bogiesforcekntwo;
	}

	public WebElement getBogiesforceknthree() {
		return Bogiesforceknthree;
	}

	public WebElement getBogiesfrictionbumpstopdefineoffsetcheckbox() {
		return Bogiesfrictionbumpstopdefineoffsetcheckbox;
	}

	public WebElement getBogiesfrictionbumpstoppreloadbox() {
		return Bogiesfrictionbumpstoppreloadbox;
	}

	public WebElement getBogiesfrictionbumpstoppreloadcheckbox() {
		return Bogiesfrictionbumpstoppreloadcheckbox;
	}

	public WebElement getBogiesfrictionbumpstopclearancecheckbox() {
		return Bogiesfrictionbumpstopclearancecheckbox;
	}

	public WebElement getBogiesfrictionbumpstopclearancebox() {
		return Bogiesfrictionbumpstopclearancebox;
	}

	public WebElement getBogiesfrictionbumpstopfirstplus() {
		return Bogiesfrictionbumpstopfirstplus;
	}

	public WebElement getBogiesfrictionbumpstopsecondplus() {
		return Bogiesfrictionbumpstopsecondplus;
	}

	public WebElement getBogiesfrictionbumpstopstiffnessstokefive() {
		return Bogiesfrictionbumpstopstiffnessstokefive;
	}

	public WebElement getBogiesfrictionbumpstopstiffnessforcefive() {
		return Bogiesfrictionbumpstopstiffnessforcefive;
	}

	public WebElement getBogiesfrictionbumpstopstiffnesplusbutton() {
		return Bogiesfrictionbumpstopstiffnesplusbutton;
	}

	public WebElement getBogiesfrictionbumpstopstiffnessoption() {
		return Bogiesfrictionbumpstopstiffnessoption;
	}

	public WebElement getBogiesfrictionbumpstopstiffnessstokeone() {
		return Bogiesfrictionbumpstopstiffnessstokeone;
	}

	public WebElement getBogiesfrictionbumpstopstiffnessforceone() {
		return Bogiesfrictionbumpstopstiffnessforceone;
	}

	public WebElement getBogiesfrictionbumpstopstiffnessstoketwo() {
		return Bogiesfrictionbumpstopstiffnessstoketwo;
	}

	public WebElement getBogiesfrictionbumpstopstiffnessforcetwo() {
		return Bogiesfrictionbumpstopstiffnessforcetwo;
	}

	public WebElement getBogiesfrictionbumpstopstiffnessstokethree() {
		return Bogiesfrictionbumpstopstiffnessstokethree;
	}

	public WebElement getBogiesfrictionbumpstopstiffnessforcethree() {
		return Bogiesfrictionbumpstopstiffnessforcethree;
	}

	public WebElement getBogiesfrictionbumpstopstiffnessstokefour() {
		return Bogiesfrictionbumpstopstiffnessstokefour;
	}

	public WebElement getBogiesfrictionbumpstopstiffnessforcefour() {
		return Bogiesfrictionbumpstopstiffnessforcefour;
	}

	public WebElement getBogiesfrictionbumpstopposition() {
		return Bogiesfrictionbumpstopposition;
	}

	public WebElement getBogiesfrictionbumpstopvehiclebody() {
		return Bogiesfrictionbumpstopvehiclebody;
	}

	public WebElement getBogiesfrictionbumpstopfrontwheelset() {
		return Bogiesfrictionbumpstopfrontwheelset;
	}

	public WebElement getBogiesfrictionbumpstoprearwheelset() {
		return Bogiesfrictionbumpstoprearwheelset;
	}

	public WebElement getBogiesfrictionbumpstopbogiesframemodelled() {
		return Bogiesfrictionbumpstopbogiesframemodelled;
	}

	public WebElement getBogiesfrictionbumpstopsidebearerleft() {
		return Bogiesfrictionbumpstopsidebearerleft;
	}

	public WebElement getBogiesfrictionbumpstopsidebearerright() {
		return Bogiesfrictionbumpstopsidebearerright;
	}

	public WebElement getBogiesfrictionvehiclebody() {
		return Bogiesfrictionvehiclebody;
	}

	public WebElement getBogiesfrictionbogiesframemodelled() {
		return Bogiesfrictionbogiesframemodelled;
	}

	public WebElement getBogiesfrictionfrontwheelset() {
		return Bogiesfrictionfrontwheelset;
	}

	public WebElement getBogiesfrictionrearwheelset() {
		return Bogiesfrictionrearwheelset;
	}

	public WebElement getBogiesfrictionsidebearerleft() {
		return Bogiesfrictionsidebearerleft;
	}

	public WebElement getBogiesfrictionsidebearerright() {
		return Bogiesfrictionsidebearerright;
	}

	public WebElement getBogiesfrictiondynamicbumpstopoption() {
		return Bogiesfrictiondynamicbumpstopoption;
	}

	public WebElement getBogiesfrictiondynamicbumpstopbox() {
		return Bogiesfrictiondynamicbumpstopbox;
	}

	public WebElement getBogiesfrictiondynamicshearspringoption() {
		return Bogiesfrictiondynamicshearspringoption;
	}

	public WebElement getBogiesfrictiondynmaicshearspringbox() {
		return Bogiesfrictiondynmaicshearspringbox;
	}

	public WebElement getBogiesfrictionbumpstop() {
		return Bogiesfrictionbumpstop;
	}

	public WebElement getBogiesfrictionbumpstopnamebox() {
		return Bogiesfrictionbumpstopnamebox;
	}

	public WebElement getBogiesfrictionbumpstoptopxbox() {
		return Bogiesfrictionbumpstoptopxbox;
	}

	public WebElement getBogiesfrictionbumpstopbottomxbox() {
		return Bogiesfrictionbumpstopbottomxbox;
	}

	public WebElement getBogiesfrictionbumpstoptopybox() {
		return Bogiesfrictionbumpstoptopybox;
	}

	public WebElement getBogiesfrictionbumpstopbottomybox() {
		return Bogiesfrictionbumpstopbottomybox;
	}

	public WebElement getBogiesfrictionbumpstoptopzbox() {
		return Bogiesfrictionbumpstoptopzbox;
	}

	public WebElement getBogiesfrictionbumpstopbottomzbox() {
		return Bogiesfrictionbumpstopbottomzbox;
	}

	public WebElement getBogiesfrictionbumpstoptopmassbox() {
		return Bogiesfrictionbumpstoptopmassbox;
	}

	public WebElement getBogiesfrictionbumpstopbottommassbox() {
		return Bogiesfrictionbumpstopbottommassbox;
	}

	public WebElement getBogiesfrictionbumpstopaddbutton() {
		return Bogiesfrictionbumpstopaddbutton;
	}
	
	
	
	
	
	//Y25 Bogie shear spring add options locater
	
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[22]")
	private WebElement Bogiesshearspringbody;
	@FindBy(xpath = "//button[@data-target=\"#jqPartModal-shear-spring\"]")
	private WebElement Bogiesfrictionshearspring;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[11]")
	private WebElement Bogiesfrictionshearspringpartname;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[49]")
	private WebElement Bogiesfrictionshearspringxbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[50]")
	private WebElement Bogiesfrictionshearspringybox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[51]")
	private WebElement Bogiesfrictionshearspringtopzbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqParameterAutocomplete\"])[52]")
	private WebElement Bogiesfrictionshearspringbottomzbox;
	@FindBy(xpath = "(//span[text()='Not Connected'])[7]")
	private WebElement Bogiesfrictionshearspringtopmassbox;
	@FindBy(xpath = "(//span[text()='Not Connected'])[7]")
	private WebElement Bogiesfrictionshearspringbottommassbox;
	@FindBy(xpath ="(//a[text()='Add'])[12]" )
	private WebElement Bogiesfrictionshearspringaddbutton;
    @FindBy(xpath = "(//li[text()='Bogies_Frame_Modelled'])[2]")
    private WebElement Bogiesframemodelled;
    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    private WebElement Bogiessearchboxshearspring;
	@FindBy(xpath = "(//li[text()='Fron_Wheelset_modelled'])[2]")
	private WebElement Bogiesshearspringfrontwheelset;
	@FindBy(xpath = "(//li[text()='Rear_Wheelset_modelled'])[2]")
	private WebElement Bogiesshearspringrearwheelset;
	@FindBy(xpath = "(//a[contains(text(),'Shear Spring')])[1]")
	private WebElement Bogiesshearspringoption;
	@FindBy(xpath = "(//a[contains(text(),'Shear Spring')])[2]")
	private WebElement Bogiesshearspringoptiontwo;
	@FindBy(xpath = "(//a[contains(text(),'Shear Spring')])[3]")
	private WebElement Bogiesshearspringoptionthree;
	@FindBy(xpath = "(//a[contains(text(),'Shear Spring')])[4]")
	private WebElement Bogiesshearspringoptionfour;
	@FindBy(xpath = "(//a[contains(text(),'Shear Spring')])[5]")
	private WebElement Bogiesshearspringoptionfive;
	@FindBy(xpath = "(//a[contains(text(),'Shear Spring')])[6]")
	private WebElement Bogiesshearspringoptionsix;
	@FindBy(xpath = "(//a[contains(text(),'Shear Spring')])[7]")
	private WebElement Bogiesshearspringoptionseven;
	@FindBy(xpath = "(//a[contains(text(),'Shear Spring')])[8]")
	private WebElement Bogiesshearspringoptioneight;
	@FindBy(xpath = "//input[@name=\"part_data[spring][x]\"]")
	private WebElement Bogiesshearspringxvaluebox;
	@FindBy(xpath = "//input[@name=\"part_data[spring][y]\"]")
	private WebElement Bogiesshearspringyvaluebox;
	@FindBy(xpath = "//input[@name=\"part_data[spring][z]\"]")
	private WebElement Bogiesshearspringzvaluebox;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[11]")
	private WebElement Bogiesshearspringposition;
	@FindBy(xpath = "//button[text()='Click to Refresh 3D View']")
	private WebElement BogiesshearspringThreeDoption;
	
	
	
	
	public WebElement getBogiesshearspringbody() {
		return Bogiesshearspringbody;
	}

	public WebElement getBogiesshearspringoptionthree() {
		return Bogiesshearspringoptionthree;
	}

	public WebElement getBogiesshearspringoptionfour() {
		return Bogiesshearspringoptionfour;
	}

	public WebElement getBogiesshearspringoptionfive() {
		return Bogiesshearspringoptionfive;
	}

	public WebElement getBogiesshearspringoptionsix() {
		return Bogiesshearspringoptionsix;
	}

	public WebElement getBogiesshearspringoptionseven() {
		return Bogiesshearspringoptionseven;
	}

	public WebElement getBogiesshearspringoptioneight() {
		return Bogiesshearspringoptioneight;
	}

	public WebElement getBogiesshearspringoptiontwo() {
		return Bogiesshearspringoptiontwo;
	}

	public WebElement getBogiesshearspringThreeDoption() {
		return BogiesshearspringThreeDoption;
	}

	public WebElement getBogiesshearspringposition() {
		return Bogiesshearspringposition;
	}

	public WebElement getBogiesshearspringoption() {
		return Bogiesshearspringoption;
	}

	public WebElement getBogiesshearspringxvaluebox() {
		return Bogiesshearspringxvaluebox;
	}

	public WebElement getBogiesshearspringyvaluebox() {
		return Bogiesshearspringyvaluebox;
	}

	public WebElement getBogiesshearspringzvaluebox() {
		return Bogiesshearspringzvaluebox;
	}

	public WebElement getBogiesshearspringfrontwheelset() {
		return Bogiesshearspringfrontwheelset;
	}

	public WebElement getBogiesshearspringrearwheelset() {
		return Bogiesshearspringrearwheelset;
	}

	public WebElement getBogiessearchboxshearspring() {
		return Bogiessearchboxshearspring;
	}

	public WebElement getBogiesframemodelled() {
		return Bogiesframemodelled;
	}

	public WebElement getBogiesfrictionshearspring() {
		return Bogiesfrictionshearspring;
	}

	public WebElement getBogiesfrictionshearspringpartname() {
		return Bogiesfrictionshearspringpartname;
	}

	public WebElement getBogiesfrictionshearspringxbox() {
		return Bogiesfrictionshearspringxbox;
	}

	public WebElement getBogiesfrictionshearspringybox() {
		return Bogiesfrictionshearspringybox;
	}

	public WebElement getBogiesfrictionshearspringtopzbox() {
		return Bogiesfrictionshearspringtopzbox;
	}

	public WebElement getBogiesfrictionshearspringbottomzbox() {
		return Bogiesfrictionshearspringbottomzbox;
	}

	public WebElement getBogiesfrictionshearspringtopmassbox() {
		return Bogiesfrictionshearspringtopmassbox;
	}

	public WebElement getBogiesfrictionshearspringbottommassbox() {
		return Bogiesfrictionshearspringbottommassbox;
	}

	public WebElement getBogiesfrictionshearspringaddbutton() {
		return Bogiesfrictionshearspringaddbutton;
	}
	
	
	
	//coupling the friction elements locater (8549)
	
	
	@FindBy(xpath = "//li[text()='Friction']")
	private WebElement Bogiescouplingfrictionoption;
	@FindBy(xpath = "(//li[text()='Center Pivot_X_L'])[1]")
	private WebElement Bogiescenterpivot_X_L;
	@FindBy(xpath = "(//li[text()='Center Pivot_X_R'])[1]")
	private WebElement Bogiescenterpivot_X_R;
	@FindBy(xpath = "(//li[text()='Center Pivot_Y_B'])[1]")
	private WebElement Bogiescenterpivot_Y_B;
	@FindBy(xpath = "(//li[text()='Center Pivot_Y_F'])[1]")
	private WebElement Bogiescenterpivot_Y_F;
	@FindBy(xpath = "(//li[text()='Center Pivot_Z_B'])[1]")
	private WebElement Bogiescenterpivot_Z_B;
	@FindBy(xpath = "(//li[text()='Center Pivot_Z_F'])[1]")
	private WebElement Bogiescenterpivot_Z_F;
	@FindBy(xpath = "(//li[text()='Center Pivot_Z_L'])[1]")
	private WebElement Bogiescenterpivot_Z_L;
	@FindBy(xpath = "(//li[text()='Center Pivot_Z_R'])[1]")
	private WebElement Bogiescenterpivot_Z_R;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_LL_1'])[1]")
	private WebElement Bogiesprimarylateralfriction_LL_1;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_LL_O'])[1]")
	private WebElement Bogiesprimarylateralfriction_LL_O;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_LR_1'])[1]")
	private WebElement Bogiesprimarylateralfriction_LR_1;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_LR_O'])[1]")
	private WebElement Bogiesprimarylateralfriction_LR_O;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_TL_1'])[1]")
	private WebElement Bogiesprimarylateralfriction_TL_1;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_TL_O'])[1]")
	private WebElement Bogiesprimarylateralfriction_TL_O;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_TR_1'])[1]")
	private WebElement Bogiesprimarylateralfriction_TR_1;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_TR_O'])[1]")
	private WebElement Bogiesprimarylateralfriction_TR_O;
	@FindBy(xpath = "(//li[text()='Primary_Vertical_Friction_LL_1'])[1]")
	private WebElement Bogiesprimaryverticalfriction_LL_1;
	@FindBy(xpath = "(//li[text()='Primary_Vertical_Friction_LL_O'])[1]")
	private WebElement Bogiesprimaryverticalfriction_LL_O;
	@FindBy(xpath = "(//li[text()='Primary_Vertical_Friction_LR_1'])[1]")
	private WebElement Bogiesprimaryverticalfriction_LR_1;
	@FindBy(xpath = "(//li[text()='Primary_Vertical_Friction_LR_O'])[1]")
	private WebElement Bogiesprimaryverticalfriction_LR_O;
	@FindBy(xpath = "(//li[text()='Primary_Vertical_Friction_TL_1'])[1]")
	private WebElement Bogiesprimaryverticalfriction_TL_1;
	@FindBy(xpath = "(//li[text()='Primary_Vertical_Friction_TL_O'])[1]")
	private WebElement Bogiesprimaryverticalfriction_TL_O;
	@FindBy(xpath = "(//li[text()='Primary_Vretical_Friction_TR_1'])[1]")
	private WebElement Bogiesprimaryverticalfriction_TR_1;
	@FindBy(xpath = "(//li[text()='Primary_Vretical_Friction_TR_O'])[1]")
	private WebElement Bogiesprimaryverticalfriction_TR_O;
	@FindBy(xpath = "(//li[text()='Sidebarer_X_L'])[1]")
	private WebElement Bogiessidebarer_X_L;
	@FindBy(xpath = "(//li[text()='Sidebarer_X_R'])[1]")
	private WebElement Bogiessidebarer_X_R;
	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement Bogieseditoption;
	@FindBy(xpath = "(//a[contains(text(),'Coupling')])[2]")
	private WebElement Bogiescouplingoption;
	@FindBy(xpath = "//input[@class=\"jqPartSelect-friction\"]")
	private WebElement Bogiesselectcheckboxcouplingopiton;
	@FindBy(xpath = "(//span[@class=\"icon expand-icon glyphicon glyphicon-menu-right\"])[2]")
	private WebElement Bogiesselectfrictiondropdwon;
	@FindBy(xpath = "(//span[text()='Please select....'])[4]")
	private WebElement Bogiesselectcouplingbox;
	@FindBy(xpath = "(//span[text()='Please select....'])[3]")
	private WebElement Bogiesselectcouplingboxtwo;
	@FindBy(xpath = "(//a[text()='Save'])[9]")
	private WebElement Bogiescouplingsave;
	@FindBy(xpath = "//div[@class=\"body\"]")
	private WebElement Bogoiefirsttitle;
	
	
	

	public WebElement getBogoiefirsttitle() {
		return Bogoiefirsttitle;
	}

	public WebElement getBogiesselectcouplingboxtwo() {
		return Bogiesselectcouplingboxtwo;
	}

	public WebElement getBogiesselectfrictiondropdwon() {
		return Bogiesselectfrictiondropdwon;
	}

	public WebElement getBogiescouplingsave() {
		return Bogiescouplingsave;
	}

	public WebElement getBogiescouplingfrictionoption() {
		return Bogiescouplingfrictionoption;
	}

	public WebElement getBogiescenterpivot_X_L() {
		return Bogiescenterpivot_X_L;
	}

	public WebElement getBogiescenterpivot_X_R() {
		return Bogiescenterpivot_X_R;
	}

	public WebElement getBogiescenterpivot_Y_B() {
		return Bogiescenterpivot_Y_B;
	}

	public WebElement getBogiescenterpivot_Y_F() {
		return Bogiescenterpivot_Y_F;
	}

	public WebElement getBogiescenterpivot_Z_B() {
		return Bogiescenterpivot_Z_B;
	}

	public WebElement getBogiescenterpivot_Z_F() {
		return Bogiescenterpivot_Z_F;
	}

	public WebElement getBogiescenterpivot_Z_L() {
		return Bogiescenterpivot_Z_L;
	}

	public WebElement getBogiescenterpivot_Z_R() {
		return Bogiescenterpivot_Z_R;
	}

	public WebElement getBogiesprimarylateralfriction_LL_1() {
		return Bogiesprimarylateralfriction_LL_1;
	}

	public WebElement getBogiesprimarylateralfriction_LL_O() {
		return Bogiesprimarylateralfriction_LL_O;
	}

	public WebElement getBogiesprimarylateralfriction_LR_1() {
		return Bogiesprimarylateralfriction_LR_1;
	}

	public WebElement getBogiesprimarylateralfriction_LR_O() {
		return Bogiesprimarylateralfriction_LR_O;
	}

	public WebElement getBogiesprimarylateralfriction_TL_1() {
		return Bogiesprimarylateralfriction_TL_1;
	}

	public WebElement getBogiesprimarylateralfriction_TL_O() {
		return Bogiesprimarylateralfriction_TL_O;
	}

	public WebElement getBogiesprimarylateralfriction_TR_1() {
		return Bogiesprimarylateralfriction_TR_1;
	}

	public WebElement getBogiesprimarylateralfriction_TR_O() {
		return Bogiesprimarylateralfriction_TR_O;
	}

	public WebElement getBogiesprimaryverticalfriction_LL_1() {
		return Bogiesprimaryverticalfriction_LL_1;
	}

	public WebElement getBogiesprimaryverticalfriction_LL_O() {
		return Bogiesprimaryverticalfriction_LL_O;
	}

	public WebElement getBogiesprimaryverticalfriction_LR_1() {
		return Bogiesprimaryverticalfriction_LR_1;
	}

	public WebElement getBogiesprimaryverticalfriction_LR_O() {
		return Bogiesprimaryverticalfriction_LR_O;
	}

	public WebElement getBogiesprimaryverticalfriction_TL_1() {
		return Bogiesprimaryverticalfriction_TL_1;
	}

	public WebElement getBogiesprimaryverticalfriction_TL_O() {
		return Bogiesprimaryverticalfriction_TL_O;
	}

	public WebElement getBogiesprimaryverticalfriction_TR_1() {
		return Bogiesprimaryverticalfriction_TR_1;
	}

	public WebElement getBogiesprimaryverticalfriction_TR_O() {
		return Bogiesprimaryverticalfriction_TR_O;
	}

	public WebElement getBogiessidebarer_X_L() {
		return Bogiessidebarer_X_L;
	}

	public WebElement getBogiessidebarer_X_R() {
		return Bogiessidebarer_X_R;
	}

	public WebElement getBogieseditoption() {
		return Bogieseditoption;
	}

	public WebElement getBogiescouplingoption() {
		return Bogiescouplingoption;
	}

	public WebElement getBogiesselectcheckboxcouplingopiton() {
		return Bogiesselectcheckboxcouplingopiton;
	}

	public WebElement getBogiesselectcouplingbox() {
		return Bogiesselectcouplingbox;
	}
	
	//second locater in friction coupling option
	
	@FindBy(xpath = "(//li[text()='Center Pivot_X_L'])[2]")
	private WebElement Bogies2centerpivot_X_L;
	@FindBy(xpath = "(//li[text()='Center Pivot_X_R'])[2]")
	private WebElement Bogies2centerpivot_X_R;
	@FindBy(xpath = "(//li[text()='Center Pivot_Y_B'])[2]")
	private WebElement Bogies2centerpivot_Y_B;
	@FindBy(xpath = "(//li[text()='Center Pivot_Y_F'])[2]")
	private WebElement Bogies2centerpivot_Y_F;
	@FindBy(xpath = "(//li[text()='Center Pivot_Z_B'])[2]")
	private WebElement Bogies2centerpivot_Z_B;
	@FindBy(xpath = "(//li[text()='Center Pivot_Z_F'])[2]")
	private WebElement Bogies2centerpivot_Z_F;
	@FindBy(xpath = "(//li[text()='Center Pivot_Z_L'])[2]")
	private WebElement Bogies2centerpivot_Z_L;
	@FindBy(xpath = "(//li[text()='Center Pivot_Z_R'])[2]")
	private WebElement Bogies2centerpivot_Z_R;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_LL_1'])[2]")
	private WebElement Bogies2primarylateralfriction_LL_1;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_LL_O'])[2]")
	private WebElement Bogies2primarylateralfriction_LL_O;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_LR_1'])[2]")
	private WebElement Bogies2primarylateralfriction_LR_1;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_LR_O'])[2]")
	private WebElement Bogies2primarylateralfriction_LR_O;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_TL_1'])[2]")
	private WebElement Bogies2primarylateralfriction_TL_1;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_TL_O'])[2]")
	private WebElement Bogies2primarylateralfriction_TL_O;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_TR_1'])[2]")
	private WebElement Bogies2primarylateralfriction_TR_1;
	@FindBy(xpath = "(//li[text()='Primary_Lateral_Friction_TR_O'])[2]")
	private WebElement Bogies2primarylateralfriction_TR_O;
	@FindBy(xpath = "(//li[text()='Primary_Vertical_Friction_LL_1'])[2]")
	private WebElement Bogies2primaryverticalfriction_LL_1;
	@FindBy(xpath = "(//li[text()='Primary_Vertical_Friction_LL_O'])[2]")
	private WebElement Bogies2primaryverticalfriction_LL_O;
	@FindBy(xpath = "(//li[text()='Primary_Vertical_Friction_LR_1'])[2]")
	private WebElement Bogies2primaryverticalfriction_LR_1;
	@FindBy(xpath = "(//li[text()='Primary_Vertical_Friction_LR_O'])[2]")
	private WebElement Bogies2primaryverticalfriction_LR_O;
	@FindBy(xpath = "(//li[text()='Primary_Vertical_Friction_TL_1'])[2]")
	private WebElement Bogies2primaryverticalfriction_TL_1;
	@FindBy(xpath = "(//li[text()='Primary_Vertical_Friction_TL_O'])[2]")
	private WebElement Bogies2primaryverticalfriction_TL_O;
	@FindBy(xpath = "(//li[text()='Primary_Vretical_Friction_TR_1'])[2]")
	private WebElement Bogies2primaryverticalfriction_TR_1;
	@FindBy(xpath = "(//li[text()='Primary_Vretical_Friction_TR_O'])[2]")
	private WebElement Bogies2primaryverticalfriction_TR_O;
	@FindBy(xpath = "(//li[text()='Sidebarer_X_L'])[2]")
	private WebElement Bogies2sidebarer_X_L;
	@FindBy(xpath = "(//li[text()='Sidebarer_X_R'])[2]")
	private WebElement Bogies2sidebarer_X_R;
	@FindBy(xpath = "//a[@class=\"btn btn-primary pull-right jqBogieSaveBtn\"]")
	private WebElement Bogiesfullsave;
	@FindBy(xpath = "(//button[@class=\"btn btn-primary pull-right\"])[1]")
	private WebElement Bogiesconformsave;
	

	public WebElement getBogiesconformsave() {
		return Bogiesconformsave;
	}

	public WebElement getBogiesfullsave() {
		return Bogiesfullsave;
	}

	public WebElement getBogies2centerpivot_X_L() {
		return Bogies2centerpivot_X_L;
	}

	public WebElement getBogies2centerpivot_X_R() {
		return Bogies2centerpivot_X_R;
	}

	public WebElement getBogies2centerpivot_Y_B() {
		return Bogies2centerpivot_Y_B;
	}

	public WebElement getBogies2centerpivot_Y_F() {
		return Bogies2centerpivot_Y_F;
	}

	public WebElement getBogies2centerpivot_Z_B() {
		return Bogies2centerpivot_Z_B;
	}

	public WebElement getBogies2centerpivot_Z_F() {
		return Bogies2centerpivot_Z_F;
	}

	public WebElement getBogies2centerpivot_Z_L() {
		return Bogies2centerpivot_Z_L;
	}

	public WebElement getBogies2centerpivot_Z_R() {
		return Bogies2centerpivot_Z_R;
	}

	public WebElement getBogies2primarylateralfriction_LL_1() {
		return Bogies2primarylateralfriction_LL_1;
	}

	public WebElement getBogies2primarylateralfriction_LL_O() {
		return Bogies2primarylateralfriction_LL_O;
	}

	public WebElement getBogies2primarylateralfriction_LR_1() {
		return Bogies2primarylateralfriction_LR_1;
	}

	public WebElement getBogies2primarylateralfriction_LR_O() {
		return Bogies2primarylateralfriction_LR_O;
	}

	public WebElement getBogies2primarylateralfriction_TL_1() {
		return Bogies2primarylateralfriction_TL_1;
	}

	public WebElement getBogies2primarylateralfriction_TL_O() {
		return Bogies2primarylateralfriction_TL_O;
	}

	public WebElement getBogies2primarylateralfriction_TR_1() {
		return Bogies2primarylateralfriction_TR_1;
	}

	public WebElement getBogies2primarylateralfriction_TR_O() {
		return Bogies2primarylateralfriction_TR_O;
	}

	public WebElement getBogies2primaryverticalfriction_LL_1() {
		return Bogies2primaryverticalfriction_LL_1;
	}

	public WebElement getBogies2primaryverticalfriction_LL_O() {
		return Bogies2primaryverticalfriction_LL_O;
	}

	public WebElement getBogies2primaryverticalfriction_LR_1() {
		return Bogies2primaryverticalfriction_LR_1;
	}

	public WebElement getBogies2primaryverticalfriction_LR_O() {
		return Bogies2primaryverticalfriction_LR_O;
	}

	public WebElement getBogies2primaryverticalfriction_TL_1() {
		return Bogies2primaryverticalfriction_TL_1;
	}

	public WebElement getBogies2primaryverticalfriction_TL_O() {
		return Bogies2primaryverticalfriction_TL_O;
	}

	public WebElement getBogies2primaryverticalfriction_TR_1() {
		return Bogies2primaryverticalfriction_TR_1;
	}

	public WebElement getBogies2primaryverticalfriction_TR_O() {
		return Bogies2primaryverticalfriction_TR_O;
	}

	public WebElement getBogies2sidebarer_X_L() {
		return Bogies2sidebarer_X_L;
	}

	public WebElement getBogies2sidebarer_X_R() {
		return Bogies2sidebarer_X_R;
	}
	
	
	//Manual route profile locater(8984)
	
	
	@FindBy(xpath = "//input[@name=\"terrain_name\"]")
	private WebElement Manualrouteprofilenamebox;
	@FindBy(xpath = "//a[text()='Manual Input Data']")
	private WebElement Manualrouteprofilemanualinputdata;
	@FindBy(xpath = "//button[text()='Create Route Profile							']")
	private WebElement Createrouteprofile;
	@FindBy(xpath = "(//a[@class=\"btn btn-primary btn-block jqTerrainBtn create-terrain-btn\"])[1]")
	private WebElement Createmanulaprofileroute;
	@FindBy(xpath = "//a[text()='Manual Input Data']")
	private WebElement Createmanualinputdata;
	@FindBy(xpath = "//a[contains(text(),'Vertical Profile')]")
	private WebElement verticalprofile;
	@FindBy(xpath = "//input[@name=\"terrain_data[has_vertical]\"]")
	private WebElement Verticalcheckbox;
	@FindBy(xpath = "(//button[@class=\"btn btn-sm btn-success btn-block glyphicon glyphicon-plus jqMultiDataAdd mt-0\"])[1]")
	private WebElement Verticalplusbutton;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][1][gradient]\"]")
	private WebElement Verticalgradienttwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][2][gradient]\"]")
	private WebElement Verticalgradientthree;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][3][gradient]\"]")
	private WebElement Verticalgradientfour;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][4][gradient]\"]")
	private WebElement Verticalgradientfive;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][0][distance]\"]")
	private WebElement Verticaldistanceone;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][1][distance]\"]")
	private WebElement Verticaldistancetwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][2][distance]\"]")
	private WebElement Verticaldistancethree;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][3][distance]\"]")
	private WebElement Verticaldistancefour;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][4][distance]\"]")
	private WebElement Verticaldistancefive;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][0][radius]\"]")
	private WebElement Verticalconnectingradiusone;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][1][radius]\"]")
	private WebElement Verticalconnectingradiustwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][2][radius]\"]")
	private WebElement Verticalconnectingradiusthree;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][3][radius]\"]")
	private WebElement Verticalconnectingradiusfour;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][4][radius]\"]")
	private WebElement Verticalconnectingradiusfive;
	@FindBy(xpath = "//a[contains(text(),'Horizontal Profile')]")
	private WebElement Horizontalprofile;
	@FindBy(xpath = "//input[@name=\"terrain_data[has_horizontal]\"]")
	private WebElement Horizontalcheckbox;
	@FindBy(xpath = "(//button[@type=\"button\"])[12]")
    private WebElement Horizontalplusbutton;
	@FindBy(xpath = "(//button[@type=\"button\"])[15]")
	private WebElement Horizandalplustwobutton;
	@FindBy(xpath = "(//button[@type=\"button\"])[18]")
	private WebElement Horizontalplusthreebutton;
	@FindBy(xpath = "(//button[@type=\"button\"])[21]")
	private WebElement Horizontalplusfourbutton;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][0][straight]\"]")
	private WebElement Horizontalstraightone;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][1][straight]\"]")
	private WebElement Horizontalstraighttwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][2][straight]\"]")
	private WebElement Horizontalstraightthree;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][3][straight]\"]")
	private WebElement Horizontalstraightfour;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][4][straight]\"]")
	private WebElement Horizontalstraightfive;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][0][radius]\"]")
	private WebElement Horizontalcurveradiusone;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][1][radius]\"]")
	private WebElement Horizontalcurveradiustwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][2][radius]\"]")
	private WebElement Horizontalcurveradiusthree;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][3][radius]\"]")
	private WebElement Horizontalcurveradiusfour;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][4][radius]\"]")
	private WebElement Horizontalcurveradiusfive;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][0][angle]\"]")
	private WebElement Horizontalcurveangleone;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][1][angle]\"]")
	private WebElement Horizontalcurveangletwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][2][angle]\"]")
	private WebElement Horizontalcurveanglethree;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][3][angle]\"]")
	private WebElement Horizontalcurveanglefour;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][4][angle]\"]")
	private WebElement Horizontalcurveanglefive;
	@FindBy(xpath = "(//button[@data-toggle=\"modal\"])[1]")
	private WebElement Horizontalsettingone;
	@FindBy(xpath = "(//button[@data-toggle=\"modal\"])[2]")
	private WebElement Horizontalsettingtwo;
	@FindBy(xpath = "(//button[@data-toggle=\"modal\"])[3]")
	private WebElement Horizontalsettingthree;
	@FindBy(xpath = "(//button[@data-toggle=\"modal\"])[4]")
	private WebElement Horizontalsettingfour;
	@FindBy(xpath = "(//button[@data-toggle=\"modal\"])[5]")
	private WebElement Horizontalsettingfive;
	@FindBy(xpath = "//a[text()='Insert Transition                        ']")
	private WebElement Horizontalinserttranstion;
	@FindBy(xpath = "//input[@class=\"form-control input-sm jqCantRadius\"]")
	private WebElement Horizontaltransitionradius;
	@FindBy(xpath = "//a[contains(text(),'Vertical Profile')]")
	private WebElement Manualrouteprofileverticaloption;
	@FindBy(xpath = "//span[@class=\"glyphicon glyphicon-plus mr-2\"]")
	private WebElement Horizontalcalculatetranstioncurve;
	@FindBy(xpath = "//input[@name=\"unlock_gradient\"]")
	private WebElement Horizontalunlockgradient;
	@FindBy(xpath = "//input[@class=\"form-control input-sm jqCantTransitionInCurve jqAlwaysReadonly\"]")
	private WebElement Horizontaltransitionin;
	@FindBy(xpath = "//input[@class=\"form-control input-sm jqCantTransitionOutCurve jqAlwaysReadonly\"]")
	private WebElement Horizontaltransitionout;
	@FindBy(xpath = "//a[text()='Location Settings']")
	private WebElement Locationsetting;
	@FindBy(xpath = "//input[@name=\"terrain_data[manual_terrain_lat]\"]")
	private WebElement Locationlatitude;
	@FindBy(xpath = "//input[@ name=\"terrain_data[manual_terrain_long]\"]")
	private WebElement Locationlongtitude;
	@FindBy(xpath = "//input[@name=\"terrain_data[manual_terrain_heading]\"]")
	private WebElement Locationheading;
	@FindBy(xpath = "//a[text()='Set Coordinates                                                                ']")
	private WebElement Locationsetcoordinates;
	@FindBy(xpath = "//a[text()='Markers']")
	private WebElement Markersbutton;
	@FindBy(xpath = "//input[@name=\"terrain_data[has_markers]\"]")
	private WebElement Markerscheckbox;
	@FindBy(xpath = "(//button[@class=\"btn btn-md btn-success btn-block glyphicon glyphicon-plus jqMultiDataAdd mt-0\"])[1]")
	private WebElement Markerspluse;
	@FindBy(xpath = "//input[@name=\"terrain_data[marker][0][name]\"]")
	private WebElement Markernameone;
	@FindBy(xpath = "//input[@name=\"terrain_data[marker][1][name]\"]")
	private WebElement Markernametwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[marker][0][distance]\"]")
	private WebElement Markerdistanceone;
	@FindBy(xpath = "//input[@name=\"terrain_data[marker][1][distance]\"]")
	private WebElement Markerdistancetwo;
	@FindBy(xpath = "//a[@class=\"btn btn-primary btn-sm mt-3 mt-sm-0 ml-sm-3 jsRefreshPlot\"]")
	private WebElement Terrainrefreshbutton;
	@FindBy(xpath = "//a[text()='Realistic View                                                ']")
	private WebElement Realisticviewoption;
	@FindBy(xpath = "//a[text()='Map                                                ']")
	private WebElement Mapviewoption;
	@FindBy(xpath = "(//button[text()='Save'])[1]")
	private WebElement Manualprofilesavebutton;
	@FindBy(xpath = "(//label[text()='Total Distance'])[2]")
	private WebElement Manualprofilehorizandaltotaldistance;
	@FindBy(xpath = "//label[text()='Distance Units:']")
	private WebElement Manualprofiledistanceunits;
	
	
	

	public WebElement getManualprofiledistanceunits() {
		return Manualprofiledistanceunits;
	}

	public WebElement getManualprofilehorizandaltotaldistance() {
		return Manualprofilehorizandaltotaldistance;
	}

	public WebElement getHorizandalplustwobutton() {
		return Horizandalplustwobutton;
	}

	public WebElement getHorizontalplusthreebutton() {
		return Horizontalplusthreebutton;
	}

	public WebElement getHorizontalplusfourbutton() {
		return Horizontalplusfourbutton;
	}

	public WebElement getManualrouteprofileverticaloption() {
		return Manualrouteprofileverticaloption;
	}

	public WebElement getLocationheading() {
		return Locationheading;
	}

	public WebElement getHorizontaltransitionradius() {
		return Horizontaltransitionradius;
	}

	public WebElement getHorizontaltransitionin() {
		return Horizontaltransitionin;
	}

	public WebElement getHorizontaltransitionout() {
		return Horizontaltransitionout;
	}

	public WebElement getHorizontalunlockgradient() {
		return Horizontalunlockgradient;
	}

	public WebElement getManualrouteprofilenamebox() {
		return Manualrouteprofilenamebox;
	}

	public WebElement getManualrouteprofilemanualinputdata() {
		return Manualrouteprofilemanualinputdata;
	}

	public WebElement getCreaterouteprofile() {
		return Createrouteprofile;
	}

	public WebElement getCreatemanulaprofileroute() {
		return Createmanulaprofileroute;
	}

	public WebElement getCreatemanualinputdata() {
		return Createmanualinputdata;
	}

	public WebElement getVerticalprofile() {
		return verticalprofile;
	}

	public WebElement getVerticalcheckbox() {
		return Verticalcheckbox;
	}

	public WebElement getVerticalplusbutton() {
		return Verticalplusbutton;
	}

	public WebElement getVerticalgradienttwo() {
		return Verticalgradienttwo;
	}

	public WebElement getVerticalgradientthree() {
		return Verticalgradientthree;
	}

	public WebElement getVerticalgradientfour() {
		return Verticalgradientfour;
	}

	public WebElement getVerticalgradientfive() {
		return Verticalgradientfive;
	}

	public WebElement getVerticaldistanceone() {
		return Verticaldistanceone;
	}

	public WebElement getVerticaldistancetwo() {
		return Verticaldistancetwo;
	}

	public WebElement getVerticaldistancethree() {
		return Verticaldistancethree;
	}

	public WebElement getVerticaldistancefour() {
		return Verticaldistancefour;
	}

	public WebElement getVerticaldistancefive() {
		return Verticaldistancefive;
	}

	public WebElement getVerticalconnectingradiusone() {
		return Verticalconnectingradiusone;
	}

	public WebElement getVerticalconnectingradiustwo() {
		return Verticalconnectingradiustwo;
	}

	public WebElement getVerticalconnectingradiusthree() {
		return Verticalconnectingradiusthree;
	}

	public WebElement getVerticalconnectingradiusfour() {
		return Verticalconnectingradiusfour;
	}

	public WebElement getVerticalconnectingradiusfive() {
		return Verticalconnectingradiusfive;
	}

	public WebElement getHorizontalprofile() {
		return Horizontalprofile;
	}

	public WebElement getHorizontalcheckbox() {
		return Horizontalcheckbox;
	}

	public WebElement getHorizontalplusbutton() {
		return Horizontalplusbutton;
	}

	public WebElement getHorizontalstraightone() {
		return Horizontalstraightone;
	}

	public WebElement getHorizontalstraighttwo() {
		return Horizontalstraighttwo;
	}

	public WebElement getHorizontalstraightthree() {
		return Horizontalstraightthree;
	}

	public WebElement getHorizontalstraightfour() {
		return Horizontalstraightfour;
	}

	public WebElement getHorizontalstraightfive() {
		return Horizontalstraightfive;
	}

	public WebElement getHorizontalcurveradiusone() {
		return Horizontalcurveradiusone;
	}

	public WebElement getHorizontalcurveradiustwo() {
		return Horizontalcurveradiustwo;
	}

	public WebElement getHorizontalcurveradiusthree() {
		return Horizontalcurveradiusthree;
	}

	public WebElement getHorizontalcurveradiusfour() {
		return Horizontalcurveradiusfour;
	}

	public WebElement getHorizontalcurveradiusfive() {
		return Horizontalcurveradiusfive;
	}

	public WebElement getHorizontalcurveangleone() {
		return Horizontalcurveangleone;
	}

	public WebElement getHorizontalcurveangletwo() {
		return Horizontalcurveangletwo;
	}

	public WebElement getHorizontalcurveanglethree() {
		return Horizontalcurveanglethree;
	}

	public WebElement getHorizontalcurveanglefour() {
		return Horizontalcurveanglefour;
	}

	public WebElement getHorizontalcurveanglefive() {
		return Horizontalcurveanglefive;
	}

	public WebElement getHorizontalsettingone() {
		return Horizontalsettingone;
	}

	public WebElement getHorizontalsettingtwo() {
		return Horizontalsettingtwo;
	}

	public WebElement getHorizontalsettingthree() {
		return Horizontalsettingthree;
	}

	public WebElement getHorizontalsettingfour() {
		return Horizontalsettingfour;
	}

	public WebElement getHorizontalsettingfive() {
		return Horizontalsettingfive;
	}

	public WebElement getHorizontalinserttranstion() {
		return Horizontalinserttranstion;
	}

	public WebElement getHorizontalcalculatetranstioncurve() {
		return Horizontalcalculatetranstioncurve;
	}

	public WebElement getLocationsetting() {
		return Locationsetting;
	}

	public WebElement getLocationlatitude() {
		return Locationlatitude;
	}

	public WebElement getLocationlongtitude() {
		return Locationlongtitude;
	}

	public WebElement getLocationsetcoordinates() {
		return Locationsetcoordinates;
	}

	public WebElement getMarkersbutton() {
		return Markersbutton;
	}

	public WebElement getMarkerscheckbox() {
		return Markerscheckbox;
	}

	public WebElement getMarkerspluse() {
		return Markerspluse;
	}

	public WebElement getMarkernameone() {
		return Markernameone;
	}

	public WebElement getMarkernametwo() {
		return Markernametwo;
	}

	public WebElement getMarkerdistanceone() {
		return Markerdistanceone;
	}

	public WebElement getMarkerdistancetwo() {
		return Markerdistancetwo;
	}

	public WebElement getTerrainrefreshbutton() {
		return Terrainrefreshbutton;
	}

	public WebElement getRealisticviewoption() {
		return Realisticviewoption;
	}

	public WebElement getMapviewoption() {
		return Mapviewoption;
	}

	public WebElement getManualprofilesavebutton() {
		return Manualprofilesavebutton;
	}
	
	
	//Create Y25 bogie vehicle(9180)
	
	@FindBy(xpath = "//button[text()='Create Vehicle							']")
	private WebElement Y25createvehiclebutton;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[2]")
	private WebElement Y25bogiesvehicletemplatebox;
	@FindBy(xpath = "//li[text()='DMU Carriage']")
	private WebElement Y25bogiesvehicleselectDMU;
	@FindBy(xpath = "(//span[text()='Select a Template Vehicle'])[2]")
	private WebElement Y25bogiesvehicleselectsecondbox;
	@FindBy(xpath = "//li[text()='Generic 4 car metro fitted with EFG3 and DT (EN15227) - Vehicle 1']")
	private WebElement Y25bogiesgeneric4carmetro;
	@FindBy(xpath = "//button[text()='Select Template']")
	private WebElement Y25bogiesselecttemplate;
	@FindBy(xpath = "(//label[@class='btn btn-primary'])[1]")
	private WebElement Y25bogiesselectsuspension;
	@FindBy(xpath = "//input[@name=\"vehicle_has_suspension\"]")
	private WebElement Y25bogievehiclecheckbox;
	@FindBy(xpath = "//input[@name=\"vehicle_body_mass\"]")
	private WebElement Y25bogievehiclebodymass;
	@FindBy(xpath = "//input[@name=\"vehicle_body_cog_x\"]")
	private WebElement Y25bogiecogx;
	@FindBy(xpath = "//input[@name=\"vehicle_body_cog_y\"]")
	private WebElement Y25bogiecogy;
	@FindBy(xpath = "//input[@name=\"vehicle_body_cog_z\"]")
	private WebElement Y25bogiecogz;
	@FindBy(xpath = "//input[@name=\"vehicle_body_roll_inertia\"]")
	private WebElement Y25bogierollinertia;
	@FindBy(xpath = "//input[@name=\"vehicle_body_pitch_inertia\"]")
	private WebElement Y25bogiepitchinertia;
	@FindBy(xpath = "//input[@name=\"vehicle_body_yaw_inertia\"]")
	private WebElement Y25bogieyawinertia;
	@FindBy(xpath = "(//span[text()='No dynamic bogie selected'])[1]")
	private WebElement Y25bogierearbogiebox;
	@FindBy(xpath = "//span[@id=\"select2-vehicle_front_bogie_id-qk-container\"]")
	private WebElement Y25bogiefrontbogiebox;
	@FindBy(xpath = "//li[text()='Y25Bogie']")
	private WebElement Y25bogieselectY25bogie;
	@FindBy(xpath = "//a[text()='Save']")
	private WebElement Y25bogievehiclesavebutton;
	@FindBy(xpath = "(//input[@name=\"vehicle_name\"])[5]")
	private WebElement Y25bogievehiclenamebox;
	@FindBy(xpath = "//label[@data-target=\"#vehicle-3d\"]")
	private WebElement Y25bogievehicle3doption;
	@FindBy(xpath = "(//a[contains(text(),'Public')])[2]")
	private WebElement Y25bogievehiclepublic;
	
	
	public WebElement getY25bogiesvehicleselectDMU() {
		return Y25bogiesvehicleselectDMU;
	}

	public WebElement getY25bogiesvehicleselectsecondbox() {
		return Y25bogiesvehicleselectsecondbox;
	}
	public WebElement getY25bogiesvehicletemplatebox() {
		return Y25bogiesvehicletemplatebox;
	}

	public WebElement getY25bogievehiclepublic() {
		return Y25bogievehiclepublic;
	}

	public WebElement getY25bogievehicle3doption() {
		return Y25bogievehicle3doption;
	}

	public WebElement getY25createvehiclebutton() {
		return Y25createvehiclebutton;
	}


	public WebElement getY25bogiesgeneric4carmetro() {
		return Y25bogiesgeneric4carmetro;
	}

	public WebElement getY25bogiesselecttemplate() {
		return Y25bogiesselecttemplate;
	}

	public WebElement getY25bogiesselectsuspension() {
		return Y25bogiesselectsuspension;
	}

	public WebElement getY25bogievehiclecheckbox() {
		return Y25bogievehiclecheckbox;
	}

	public WebElement getY25bogievehiclebodymass() {
		return Y25bogievehiclebodymass;
	}

	public WebElement getY25bogiecogx() {
		return Y25bogiecogx;
	}

	public WebElement getY25bogiecogy() {
		return Y25bogiecogy;
	}

	public WebElement getY25bogiecogz() {
		return Y25bogiecogz;
	}

	public WebElement getY25bogierollinertia() {
		return Y25bogierollinertia;
	}

	public WebElement getY25bogiepitchinertia() {
		return Y25bogiepitchinertia;
	}

	public WebElement getY25bogieyawinertia() {
		return Y25bogieyawinertia;
	}

	public WebElement getY25bogierearbogiebox() {
		return Y25bogierearbogiebox;
	}

	public WebElement getY25bogiefrontbogiebox() {
		return Y25bogiefrontbogiebox;
	}

	public WebElement getY25bogieselectY25bogie() {
		return Y25bogieselectY25bogie;
	}

	public WebElement getY25bogievehiclesavebutton() {
		return Y25bogievehiclesavebutton;
	}

	public WebElement getY25bogievehiclenamebox() {
		return Y25bogievehiclenamebox;
	}
	
	
	// Create Y25 bogie base  train(9244)
	
	@FindBy(xpath = "//button[@class=\"btn btn-primary dropdown-toggle\"]")
	private WebElement Y25bogietraindropdwon;
	@FindBy(xpath = "//a[text()='Create With Vehicles']")
	private WebElement Y25bogiecreatewithvehicles;
	@FindBy(xpath = "(//a[text()='Choose from library'])[2]")
	private WebElement Y25bogiechoosefromlibrary;
	@FindBy(xpath = "(//select[@name=\"template_train\"])[3]")
	private WebElement Y25bogieselecttemplatebox;
	@FindBy(xpath = "(//option[text()='Generic 4 car metro (Sentry - AC)'])[1]")
	private WebElement Y25bogieselectgeneric4carmetro;
	@FindBy(xpath = "(//button[contains(text(),'Select template')])[2]")
	private WebElement Y25bogieslecttempaltebutton;
	@FindBy(xpath = "(//select[@id=\"train_type\"])[4]")
	private WebElement Y25bogieselecttraintype;
	@FindBy(xpath = "(//option[text()='Metro'])[5]")
	private WebElement Y25bogieselectmetrotype;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[1]")
	private WebElement Y25bogiesselectvehiclebox;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[3]")
	private WebElement Y25bogiesselectvehicleboxsecond;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[4]")
	private WebElement Y25bogiesselectvehicleboxthird;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[5]")
	private WebElement Y25bogiesselectvehicleboxfourth;
	@FindBy(xpath = "(//input[@name=\"train_name\"])[2]")
	private WebElement Y25bogietrainnamebox;
	@FindBy(xpath = "//li[text()='My vehicle']")
	private WebElement Y25bogieselectmyvehicle;
	@FindBy(xpath = "(//a[@data-vehicle_number=\"1\"])[1]")
	private WebElement Y25bogiesecondcabin;
	@FindBy(xpath = "(//label[text()='Library'])[2]")
	private WebElement Y25bogielibrary;
	@FindBy(xpath = "(//label[text()='Library'])[3]")
	private WebElement Y25bogielibrarytwo;
	@FindBy(xpath = "(//label[text()='Library'])[4]")
	private WebElement Y25bogielibrarythree;
	@FindBy(xpath = "(//a[@data-vehicle_number=\"2\"])[1]")
	private WebElement Y25bogiethiredcabin;
	@FindBy(xpath = "(//a[@data-vehicle_number=\"3\"])[1]")
	private WebElement Y25bogiefourthcabin;
	@FindBy(xpath = "(//button[@type=\"submit\"])[3]")
	private WebElement Y25bogiesaveandreview;
	@FindBy(xpath = "(//a[contains(text(),'3D')])[1]")
	private WebElement Y25bogietrain3Dview;
	@FindBy(xpath = "//a[contains(text(),'Return To Library')]")
	private WebElement Y25bogiereturntolibrary;

	
	public WebElement getY25bogielibrarytwo() {
		return Y25bogielibrarytwo;
	}

	public WebElement getY25bogielibrarythree() {
		return Y25bogielibrarythree;
	}

	public WebElement getY25bogiesselectvehicleboxsecond() {
		return Y25bogiesselectvehicleboxsecond;
	}

	public WebElement getY25bogiesselectvehicleboxthird() {
		return Y25bogiesselectvehicleboxthird;
	}

	public WebElement getY25bogiesselectvehicleboxfourth() {
		return Y25bogiesselectvehicleboxfourth;
	}

	public WebElement getY25bogielibrary() {
		return Y25bogielibrary;
	}

	public WebElement getY25bogiereturntolibrary() {
		return Y25bogiereturntolibrary;
	}

	public WebElement getY25bogietrainnamebox() {
		return Y25bogietrainnamebox;
	}

	public WebElement getY25bogieselecttraintype() {
		return Y25bogieselecttraintype;
	}

	public WebElement getY25bogieselectmetrotype() {
		return Y25bogieselectmetrotype;
	}

	public WebElement getY25bogietraindropdwon() {
		return Y25bogietraindropdwon;
	}

	public WebElement getY25bogiecreatewithvehicles() {
		return Y25bogiecreatewithvehicles;
	}

	public WebElement getY25bogiechoosefromlibrary() {
		return Y25bogiechoosefromlibrary;
	}

	public WebElement getY25bogieselecttemplatebox() {
		return Y25bogieselecttemplatebox;
	}

	public WebElement getY25bogieselectgeneric4carmetro() {
		return Y25bogieselectgeneric4carmetro;
	}

	public WebElement getY25bogieslecttempaltebutton() {
		return Y25bogieslecttempaltebutton;
	}

	public WebElement getY25bogiesselectvehiclebox() {
		return Y25bogiesselectvehiclebox;
	}

	public WebElement getY25bogieselectmyvehicle() {
		return Y25bogieselectmyvehicle;
	}

	public WebElement getY25bogiesecondcabin() {
		return Y25bogiesecondcabin;
	}

	public WebElement getY25bogiethiredcabin() {
		return Y25bogiethiredcabin;
	}

	public WebElement getY25bogiefourthcabin() {
		return Y25bogiefourthcabin;
	}

	public WebElement getY25bogiesaveandreview() {
		return Y25bogiesaveandreview;
	}

	public WebElement getY25bogietrain3Dview() {
		return Y25bogietrain3Dview;
	}

	
	
	//create Y25 dynamic simulation project(9332)
	
	@FindBy(xpath = "Create Simulation								")
	private WebElement Y25bogiecreatesimulationbutton;
	@FindBy(xpath = "(//input[@name=\"simulation_name\"])[2]")
	private WebElement Y25bogiesimulationnamebox;
	@FindBy(xpath = "(//input[@name=\"simulation_project_name\"])[1]")
	private WebElement Y25bogieprojectnamebox;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary text-capitalize w-35\"])[2]")
	private WebElement Y25bogieselectrunningtrainoption;
	@FindBy(xpath = "//input[@name=\"simulation_data[impact_speeds][0][speed]\"]")
	private WebElement Y25bogiesimulationspeedbox;
	@FindBy(xpath = "//span[text()='No Route Profile Selected (Rescue or Simple Gradient)']")
	private WebElement Y25bogieselectroutprofilebox;
	@FindBy(xpath = "//li[text()='singapor route profile']")
	private WebElement Y25bogieselectsingaporrouteprofile;
	@FindBy(xpath = "//li[text()='11']")
	private WebElement Y25bogieselect11routeprofile;
	@FindBy(xpath = "(//input[@class=\"form-control input-sm js-not-required\"])[5]")
	private WebElement Y25bogiebrakeoverride;
	@FindBy(xpath = "(//span[text()='- Select Train from Library -'])[4]")
	private WebElement Y25bogieslecttrainbox;
	@FindBy(xpath = "//li[text()='My train']")
	private WebElement Y25bogieselectmytrain1;
	@FindBy(xpath = "(//select[@id=\"mass_condition\"])[4]")
	private WebElement Y25bogiemasscondition;
	@FindBy(xpath = "//option[text()='AW1']")
	private WebElement Y25bogieAW1mass;
	@FindBy(xpath = "//button[text()='Run']")
	private WebElement Y25bogierunbutton;
	@FindBy(xpath = "//button[text()='Stop']")
	private WebElement Y25bogiestopbutton;
	@FindBy(xpath = "//a[text()='Simulation Results']")
	private WebElement Y25bogiesimulationresults;
	@FindBy(xpath = "//a[text()='3D            ']")
	private WebElement Y25bogie3Dview;
	@FindBy(xpath = "//i[@class=\"glyphicon glyphicon-cog\"]")
    private WebElement Y25bogie3Dsettingbutton;
	@FindBy(xpath = "//div[text()='Slow']")
	private WebElement Y25bogie3Dslowoption;
	@FindBy(xpath = "//i[@class=\"glyphicon glyphicon-play\"]")
	private WebElement Y25bogiesimualtionplaybutton;
	@FindBy(xpath = "//a[text()=' Return to Simulation Setup']")
	private WebElement Y25bogiereturntosimulationsetip;
	@FindBy(xpath = "//label[text()=' Yes                                                            ']")
    private WebElement Y25bogiedynalicsuspensionyes;
	@FindBy(xpath = "//button[@data-target=\"#jqTransducerSettingsModal\"]")
	private WebElement Y25bogietransducer;
	@FindBy(xpath = "//input[@name=\"transducer_1_0\"]")
	private WebElement Y25bogiedynamicfirstcabin;
	@FindBy(xpath = "//input[@name=\"transducer_1_1\"]")
	private WebElement Y25bogiedynamicsecondcabin;
	@FindBy(xpath = "//input[@name=\"transducer_1_2\"]")
	private WebElement Y25bogiedynamicthiredcabin;
	@FindBy(xpath = "//input[@name=\"transducer_1_3\"]")
	private WebElement Y25bogiedynamicfourthcabin;
	@FindBy(xpath = "(//button[text()='Save'])[3]")
	private WebElement Y25bogiedynamicsuspensionsavebutton;
	@FindBy(xpath = "//button[contains(text(),'Save & Run Simulation')]")
	private WebElement Y25bogiesavenandrunsimulation;
    @FindBy(xpath = "//option[text()='DVRS 1']")
    private WebElement Y25bogieselectsimulationname;
	
	


	public WebElement getY25bogieselect11routeprofile() {
		return Y25bogieselect11routeprofile;
	}

	public WebElement getY25bogieselectsimulationname() {
		return Y25bogieselectsimulationname;
	}

	public WebElement getY25bogiestopbutton() {
		return Y25bogiestopbutton;
	}

	public WebElement getY25bogiecreatesimulationbutton() {
		return Y25bogiecreatesimulationbutton;
	}

	public WebElement getY25bogiesimulationnamebox() {
		return Y25bogiesimulationnamebox;
	}

	public WebElement getY25bogieprojectnamebox() {
		return Y25bogieprojectnamebox;
	}

	public WebElement getY25bogieselectrunningtrainoption() {
		return Y25bogieselectrunningtrainoption;
	}

	public WebElement getY25bogiesimulationspeedbox() {
		return Y25bogiesimulationspeedbox;
	}

	public WebElement getY25bogieselectroutprofilebox() {
		return Y25bogieselectroutprofilebox;
	}

	public WebElement getY25bogieselectsingaporrouteprofile() {
		return Y25bogieselectsingaporrouteprofile;
	}

	public WebElement getY25bogiebrakeoverride() {
		return Y25bogiebrakeoverride;
	}

	public WebElement getY25bogieslecttrainbox() {
		return Y25bogieslecttrainbox;
	}

	public WebElement getY25bogieselectmytrain1() {
		return Y25bogieselectmytrain1;
	}

	public WebElement getY25bogiemasscondition() {
		return Y25bogiemasscondition;
	}

	public WebElement getY25bogieAW1mass() {
		return Y25bogieAW1mass;
	}

	public WebElement getY25bogierunbutton() {
		return Y25bogierunbutton;
	}

	public WebElement getY25bogiesimulationresults() {
		return Y25bogiesimulationresults;
	}

	public WebElement getY25bogie3Dview() {
		return Y25bogie3Dview;
	}

	public WebElement getY25bogie3Dsettingbutton() {
		return Y25bogie3Dsettingbutton;
	}

	public WebElement getY25bogie3Dslowoption() {
		return Y25bogie3Dslowoption;
	}

	public WebElement getY25bogiesimualtionplaybutton() {
		return Y25bogiesimualtionplaybutton;
	}

	public WebElement getY25bogiereturntosimulationsetip() {
		return Y25bogiereturntosimulationsetip;
	}

	public WebElement getY25bogiedynalicsuspensionyes() {
		return Y25bogiedynalicsuspensionyes;
	}

	public WebElement getY25bogietransducer() {
		return Y25bogietransducer;
	}

	public WebElement getY25bogiedynamicfirstcabin() {
		return Y25bogiedynamicfirstcabin;
	}

	public WebElement getY25bogiedynamicsecondcabin() {
		return Y25bogiedynamicsecondcabin;
	}

	public WebElement getY25bogiedynamicthiredcabin() {
		return Y25bogiedynamicthiredcabin;
	}

	public WebElement getY25bogiedynamicfourthcabin() {
		return Y25bogiedynamicfourthcabin;
	}

	public WebElement getY25bogiedynamicsuspensionsavebutton() {
		return Y25bogiedynamicsuspensionsavebutton;
	}

	public WebElement getY25bogiesavenandrunsimulation() {
		return Y25bogiesavenandrunsimulation;
	}
	
	
	
	
	//Edit the My Train dimension of projection(9393)
	
	@FindBy(xpath = "//div[contains(text(),'My train')]")
	private WebElement Mytrain;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement Mytrainaction;
	@FindBy(xpath = "(//a[text()='Edit Train													'])[1]")
	private WebElement Mytrainedittrainoption;
	@FindBy(xpath = "//a[@class=\"train-vehicle js-train-vehicle js-train-vehicle-0\"]")
	private WebElement Mytrainfistcabin;
	@FindBy(xpath = "//a[@class=\"train-vehicle js-train-vehicle js-train-vehicle-1\"]")
	private WebElement Mytrainsecondcabin;
	@FindBy(xpath = "//a[@class=\"train-vehicle js-train-vehicle js-train-vehicle-2\"]")
	private WebElement Mytrainthiredcabin;
	@FindBy(xpath = "//a[@class=\"train-vehicle js-train-vehicle js-train-vehicle-3\"]")
	private WebElement Mytrainfourthcabin;
	@FindBy(xpath = "(//button[@id='vehicle-actions-dropdown'])[1]")
	private WebElement Mytrainfirstcabinaction;
	@FindBy(xpath = "(//button[@id='vehicle-actions-dropdown'])[2]")
	private WebElement Mytrainsecondcabinaction;
	@FindBy(xpath = "(//button[@id='vehicle-actions-dropdown'])[3]")
	private WebElement Mytrainthiredcabinaction;
	@FindBy(xpath = "(//button[@id='vehicle-actions-dropdown'])[4]")
	private WebElement Mytrainfourthcabinaction;
	@FindBy(xpath = "(//a[text()='View Vehicle                                                    '])[1]")
	private WebElement Mytrainviewvehicleoption;
	@FindBy(xpath = "(//a[text()='View Vehicle                                                    '])[2]")
	private WebElement Mytrainviewsecondvehicleoption;
	@FindBy(xpath = "(//a[text()='View Vehicle                                                    '])[3]")
	private WebElement Mytrainviewthiredvehicleoption;
	@FindBy(xpath = "(//a[text()='View Vehicle                                                    '])[4]")
	private WebElement Mytrainviewfourthvehicleoption;
	@FindBy(xpath = "//label[@aria-controls=\"geometry\"]")
	private WebElement Mytraingeometryoption;
	@FindBy(xpath = "(//a[text()='Rear'])[3]")
	private WebElement Mytrainrearone;
	@FindBy(xpath = "(//a[text()='Rear'])[3]")
	private WebElement Mytrainreartwo;
	@FindBy(xpath = "(//a[text()='Rear'])[3]")
	private WebElement Mytrainrearthree;
	@FindBy(xpath = "(//a[text()='Rear'])[3]")
	private WebElement Mytrainrearfour;
	@FindBy(xpath = "//input[@name=\"vehicle_geometry_front_rear_identical\"]")
	private WebElement Mytrainrearcheckbox;
	@FindBy(xpath = "//input[@id=\"vehicle_geometry[rear][coupler_mount_to_vehicle_front]\"]")
	private WebElement Mytrainbodyprojectionbox;
	@FindBy(xpath = "(//a[text()='Save'])[2]")
	private WebElement Mytrainsavedimention;
	@FindBy(xpath = "(//button[@type=\"submit\"])[19]")
	private WebElement Mytrainsaveconform;
	@FindBy(xpath = "(//a[text()='Save'])[1]")
	private WebElement Mytrainfinalsave;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement Mytarinfinalconformsave;
	
	
	
	public WebElement getMytrainsaveconform() {
		return Mytrainsaveconform;
	}

	public WebElement getMytrain() {
		return Mytrain;
	}

	public WebElement getMytrainaction() {
		return Mytrainaction;
	}

	public WebElement getMytrainedittrainoption() {
		return Mytrainedittrainoption;
	}

	public WebElement getMytrainfistcabin() {
		return Mytrainfistcabin;
	}

	public WebElement getMytrainsecondcabin() {
		return Mytrainsecondcabin;
	}

	public WebElement getMytrainthiredcabin() {
		return Mytrainthiredcabin;
	}

	public WebElement getMytrainfourthcabin() {
		return Mytrainfourthcabin;
	}

	public WebElement getMytrainfirstcabinaction() {
		return Mytrainfirstcabinaction;
	}

	public WebElement getMytrainsecondcabinaction() {
		return Mytrainsecondcabinaction;
	}

	public WebElement getMytrainthiredcabinaction() {
		return Mytrainthiredcabinaction;
	}

	public WebElement getMytrainfourthcabinaction() {
		return Mytrainfourthcabinaction;
	}

	public WebElement getMytrainviewvehicleoption() {
		return Mytrainviewvehicleoption;
	}

	public WebElement getMytrainviewsecondvehicleoption() {
		return Mytrainviewsecondvehicleoption;
	}

	public WebElement getMytrainviewthiredvehicleoption() {
		return Mytrainviewthiredvehicleoption;
	}

	public WebElement getMytrainviewfourthvehicleoption() {
		return Mytrainviewfourthvehicleoption;
	}

	public WebElement getMytraingeometryoption() {
		return Mytraingeometryoption;
	}

	public WebElement getMytrainrearone() {
		return Mytrainrearone;
	}

	public WebElement getMytrainreartwo() {
		return Mytrainreartwo;
	}

	public WebElement getMytrainrearthree() {
		return Mytrainrearthree;
	}

	public WebElement getMytrainrearfour() {
		return Mytrainrearfour;
	}

	public WebElement getMytrainrearcheckbox() {
		return Mytrainrearcheckbox;
	}

	public WebElement getMytrainbodyprojectionbox() {
		return Mytrainbodyprojectionbox;
	}

	public WebElement getMytrainsavedimention() {
		return Mytrainsavedimention;
	}

	public WebElement getMytrainfinalsave() {
		return Mytrainfinalsave;
	}

	public WebElement getMytarinfinalconformsave() {
		return Mytarinfinalconformsave;
	}


	
	
//create the reverse curve route profile(9514)
	
	
	@FindBy(xpath = "(//button[@type=\"button\"])[4]")
	private WebElement Curvehorizontalpluseone;
	@FindBy(xpath = "(//button[@type=\"button\"])[7]")
	private WebElement Curvehorizontalplusetwo;
	@FindBy(xpath = "//a[text()='Refresh Terrain plot                                                            ']")
	private WebElement Curverefreshterrainbutton;
	@FindBy(xpath = "(//label[text()='Total Distance'])[2]")
	private WebElement horizandalroutrprfiletotaldistance;
	@FindBy(xpath = "//a[text()='Manual Input Data']")
	private WebElement Manualinputdatatitle;
	
	

	public WebElement getManualinputdatatitle() {
		return Manualinputdatatitle;
	}

	public WebElement getHorizandalroutrprfiletotaldistance() {
		return horizandalroutrprfiletotaldistance;
	}

	public WebElement getDigitaltrainsubscriptionplanfindoutmore() {
		return Digitaltrainsubscriptionplanfindoutmore;
	}

	public WebElement getDigitaltrainimpactyearly() {
		return Digitaltrainimpactyearly;
	}

	public WebElement getDigitaltrainimpactmonthly() {
		return Digitaltrainimpactmonthly;
	}

	public WebElement getDigitaltrainrunning() {
		return Digitaltrainrunning;
	}

	public WebElement getDigitaltrainrunningyearly() {
		return Digitaltrainrunningyearly;
	}

	public WebElement getDigitaltrainrunningmonthly() {
		return Digitaltrainrunningmonthly;
	}

	public WebElement getDigitaltraingaugingoption() {
		return Digitaltraingaugingoption;
	}

	public WebElement getDigitaltraingaugingyearly() {
		return Digitaltraingaugingyearly;
	}

	public WebElement getDigitaltraingaugingmonthly() {
		return Digitaltraingaugingmonthly;
	}

	public WebElement getCurverefreshterrainbutton() {
		return Curverefreshterrainbutton;
	}

	public WebElement getCurvehorizontalpluseone() {
		return Curvehorizontalpluseone;
	}

	public WebElement getCurvehorizontalplusetwo() {
		return Curvehorizontalplusetwo;
	}
	
	//Adding the tunnel option in the route profile(9612)
	
	@FindBy(xpath = "//a[text()='Structures']")
	private WebElement Structuresoption;
	@FindBy(xpath = "//select[@name='terrain_data[structure][0][gauge_id]']")
	private WebElement Structuresgaugebox;
	@FindBy(xpath = "//option[text()='Tunnel']")
	private WebElement Structurestunneloption;
	@FindBy(xpath = "//input[@name='terrain_data[structure][0][start]']")
	private WebElement Structuresstartbox;
	@FindBy(xpath = "//input[@name='terrain_data[structure][0][end]']")
	private WebElement Structuresendbox;
	
	
	
	public WebElement getStructuresoption() {
		return Structuresoption;
	}

	public WebElement getStructuresgaugebox() {
		return Structuresgaugebox;
	}

	public WebElement getStructurestunneloption() {
		return Structurestunneloption;
	}

	public WebElement getStructuresstartbox() {
		return Structuresstartbox;
	}

	public WebElement getStructuresendbox() {
		return Structuresendbox;
	}
	
	
	
	
	//Create the wheel Rails (manual wheel profile)(9636)


	@FindBy(xpath = "//button[@id='jqProfileCreateBtn']")
	private WebElement Wheelrailcreateprofilebutton;
	@FindBy(xpath = "//button[@data-target='#jqProfileModal-wheel']")
	private WebElement WheelrailWheeloption;
	@FindBy(xpath = "(//input[@name='profile_name'])[1]")
	private WebElement Wheelrailprofilename;
	@FindBy(xpath = "(//input[@class='js-input-method-toggle'])[1]")
	private WebElement Wheelrailmanual;
	@FindBy(xpath = "(//button[@class='btn btn-sm btn-success btn-block glyphicon glyphicon-plus jqMultiDataAdd mt-0'])[1]")
	private WebElement Wheelrailmanualplus;
	@FindBy(xpath = "(//button[@id='jqSaveButton'])[1]")
	private WebElement Wheelrailprofilesave;
	@FindBy(xpath = "//input[@name='profile_data[flangeback]']")
	private WebElement Wheelrailflangbackbox;
	
	//LL
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[1]")
	private WebElement Wheelrailleftlateralone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[2]")
	private WebElement Wheelrailleftlateraltwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[3]")
	private WebElement Wheelrailleftlateralthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[4]")
	private WebElement Wheelrailleftlateralfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[5]")
	private WebElement Wheelrailleftlateralfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[6]")
	private WebElement Wheelrailleftlateralsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[7]")
	private WebElement Wheelrailleftlateralseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[8]")
	private WebElement Wheelrailleftlateraleight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[9]")
	private WebElement Wheelrailleftlateralnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[10]")
	private WebElement Wheelrailleftlateralten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[11]")
	private WebElement Wheelrailleftlateralcountone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[12]")
	private WebElement Wheelrailleftlateralcounttwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[13]")
	private WebElement Wheelrailleftlateralcountthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[14]")
	private WebElement Wheelrailleftlateralcountfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[15]")
	private WebElement Wheelrailleftlateralcountfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[16]")
	private WebElement Wheelrailleftlateralcountsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[17]")
	private WebElement Wheelrailleftlateralcountseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[18]")
	private WebElement Wheelrailleftlateralcounteight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[19]")
	private WebElement Wheelrailleftlateralcountnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[20]")
	private WebElement Wheelrailleftlateralcountten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[21]")
	private WebElement Wheelrailleftlateralnumberone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[22]")
	private WebElement Wheelrailleftlateralnumbertwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[23]")
	private WebElement Wheelrailleftlateralnumberthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[24]")
	private WebElement Wheelrailleftlateralnumberfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[25]")
	private WebElement Wheelrailleftlateralnumberfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[26]")
	private WebElement Wheelrailleftlateralnumbersix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[27]")
	private WebElement Wheelrailleftlateralnumberseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[28]")
	private WebElement Wheelrailleftlateralnumbereight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[29]")
	private WebElement Wheelrailleftlateralnumbernine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[30]")
	private WebElement Wheelrailleftlateralnumberten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[31]")
	private WebElement Wheelrailleftlateralunitone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[32]")
	private WebElement Wheelrailleftlateralunittwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[33]")
	private WebElement Wheelrailleftlateralunitthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[34]")
	private WebElement Wheelrailleftlateralunitfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[35]")
	private WebElement Wheelrailleftlateralunitfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[36]")
	private WebElement Wheelrailleftlateralunitsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[37]")
	private WebElement Wheelrailleftlateralunitseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[38]")
	private WebElement Wheelrailleftlateraluniteight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[39]")
	private WebElement Wheelrailleftlateralunitnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[40]")
	private WebElement Wheelrailleftlateralunitten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[41]")
	private WebElement Wheelrailleftlateralmassone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[42]")
	private WebElement Wheelrailleftlateralmasstwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[43]")
	private WebElement Wheelrailleftlateralmassthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[44]")
	private WebElement Wheelrailleftlateralmassfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[45]")
	private WebElement Wheelrailleftlateralmassfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[46]")
	private WebElement Wheelrailleftlateralmasssix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[47]")
	private WebElement Wheelrailleftlateralmassseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[48]")
	private WebElement Wheelrailleftlateralmasseight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[49]")
	private WebElement Wheelrailleftlateralmassnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[50]")
	private WebElement Wheelrailleftlateralmassten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[51]")
	private WebElement Wheelrailleftlaterallabone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[52]")
	private WebElement Wheelrailleftlaterallabtwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[53]")
	private WebElement Wheelrailleftlaterallabthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[54]")
	private WebElement Wheelrailleftlaterallabfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[55]")
	private WebElement Wheelrailleftlaterallabfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[56]")
	private WebElement Wheelrailleftlaterallabsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[57]")
	private WebElement Wheelrailleftlaterallabseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[58]")
	private WebElement Wheelrailleftlaterallabeight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[59]")
	private WebElement Wheelrailleftlaterallabnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[60]")
	private WebElement Wheelrailleftlaterallabten;
	
	
	//LV
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[1]")
	private WebElement Wheelrailleftverticalone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[2]")
	private WebElement Wheelrailleftverticaltwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[3]")
	private WebElement Wheelrailleftverticalthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[4]")
	private WebElement Wheelrailleftverticalfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[5]")
	private WebElement Wheelrailleftverticalfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[6]")
	private WebElement Wheelrailleftverticalsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[7]")
	private WebElement Wheelrailleftverticalseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[8]")
	private WebElement Wheelrailleftverticaleight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[9]")
	private WebElement Wheelrailleftverticalnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[10]")
	private WebElement Wheelrailleftverticalten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[11]")
	private WebElement Wheelrailleftverticalcountone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[12]")
	private WebElement Wheelrailleftverticalcounttwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[13]")
	private WebElement Wheelrailleftverticalcountthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[14]")
	private WebElement Wheelrailleftverticalcountfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[15]")
	private WebElement Wheelrailleftverticalcountfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[16]")
	private WebElement Wheelrailleftverticalcountsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[17]")
	private WebElement Wheelrailleftverticalcountseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[18]")
	private WebElement Wheelrailleftverticalcounteight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[19]")
	private WebElement Wheelrailleftverticalcountnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[20]")
	private WebElement Wheelrailleftverticalcountten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[21]")
	private WebElement Wheelrailleftverticalnumberone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[22]")
	private WebElement Wheelrailleftverticalnumbertwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[23]")
	private WebElement Wheelrailleftverticalnumberthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[24]")
	private WebElement Wheelrailleftverticalnumberfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[25]")
	private WebElement Wheelrailleftverticalnumberfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[26]")
	private WebElement Wheelrailleftverticalnumbersix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[27]")
	private WebElement Wheelrailleftverticalnumberseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[28]")
	private WebElement Wheelrailleftverticalnumbereight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[29]")
	private WebElement Wheelrailleftverticalnumbernine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[30]")
	private WebElement Wheelrailleftverticalnumberten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[31]")
	private WebElement Wheelrailleftverticalunitone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[32]")
	private WebElement Wheelrailleftverticalunittwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[33]")
	private WebElement Wheelrailleftverticalunitthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[34]")
	private WebElement Wheelrailleftverticalunitfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[35]")
	private WebElement Wheelrailleftverticalunitfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[36]")
	private WebElement Wheelrailleftverticalunitsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[37]")
	private WebElement Wheelrailleftverticalunitseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[38]")
	private WebElement Wheelrailleftverticaluniteight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[39]")
	private WebElement Wheelrailleftverticalunitnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[40]")
	private WebElement Wheelrailleftverticalunitten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[41]")
	private WebElement Wheelrailleftverticalmassone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[42]")
	private WebElement Wheelrailleftverticalmasstwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[43]")
	private WebElement Wheelrailleftverticalmassthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[44]")
	private WebElement Wheelrailleftverticalmassfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[45]")
	private WebElement Wheelrailleftverticalmassfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[46]")
	private WebElement Wheelrailleftverticalmasssix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[47]")
	private WebElement Wheelrailleftverticalmassseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[48]")
	private WebElement Wheelrailleftverticalmasseight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[49]")
	private WebElement Wheelrailleftverticalmassnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[50]")
	private WebElement Wheelrailleftverticalmassten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[51]")
	private WebElement Wheelrailleftverticallabone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[52]")
	private WebElement Wheelrailleftverticallabtwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[53]")
	private WebElement Wheelrailleftverticallabthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[54]")
	private WebElement Wheelrailleftverticallabfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[55]")
	private WebElement Wheelrailleftverticallabfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[56]")
	private WebElement Wheelrailleftverticallabsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[57]")
	private WebElement Wheelrailleftverticallabseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[58]")
	private WebElement Wheelrailleftverticallabeight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[59]")
	private WebElement Wheelrailleftverticallabnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[60]")
	private WebElement Wheelrailleftverticallabten;

	
	//RL
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[1]")
	private WebElement Wheelrailrightlateralone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[2]")
	private WebElement Wheelrailrightlateraltwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[3]")
	private WebElement Wheelrailrightlateralthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[4]")
	private WebElement Wheelrailrightlateralfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[5]")
	private WebElement Wheelrailrightlateralfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[6]")
	private WebElement Wheelrailrightlateralsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[7]")
	private WebElement Wheelrailrightlateralseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[8]")
	private WebElement Wheelrailrightlateraleight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[9]")
	private WebElement Wheelrailrightlateralnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[10]")
	private WebElement Wheelrailrightlateralten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[11]")
	private WebElement Wheelrailrightlateralcountone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[12]")
	private WebElement Wheelrailrightlateralcounttwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[13]")
	private WebElement Wheelrailrightlateralcountthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[14]")
	private WebElement Wheelrailrightlateralcountfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[15]")
	private WebElement Wheelrailrightlateralcountfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[16]")
	private WebElement Wheelrailrightlateralcountsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[17]")
	private WebElement Wheelrailrightlateralcountseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[18]")
	private WebElement Wheelrailrightlateralcounteight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[19]")
	private WebElement Wheelrailrightlateralcountnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[20]")
	private WebElement Wheelrailrightlateralcountten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[21]")
	private WebElement Wheelrailrightlateralnumberone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[22]")
	private WebElement Wheelrailrightlateralnumbertwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[23]")
	private WebElement Wheelrailrightlateralnumberthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[24]")
	private WebElement Wheelrailrightlateralnumberfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[25]")
	private WebElement Wheelrailrightlateralnumberfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[26]")
	private WebElement Wheelrailrightlateralnumbersix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[27]")
	private WebElement Wheelrailrightlateralnumberseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[28]")
	private WebElement Wheelrailrightlateralnumbereight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[29]")
	private WebElement Wheelrailrightlateralnumbernine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[30]")
	private WebElement Wheelrailrightlateralnumberten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[31]")
	private WebElement Wheelrailrightlateralunitone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[32]")
	private WebElement Wheelrailrightlateralunittwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[33]")
	private WebElement Wheelrailrightlateralunitthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[34]")
	private WebElement Wheelrailrightlateralunitfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[35]")
	private WebElement Wheelrailrightlateralunitfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[36]")
	private WebElement Wheelrailrightlateralunitsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[37]")
	private WebElement Wheelrailrightlateralunitseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[38]")
	private WebElement Wheelrailrightlateraluniteight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[39]")
	private WebElement Wheelrailrightlateralunitnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[40]")
	private WebElement Wheelrailrightlateralunitten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[41]")
	private WebElement Wheelrailrightlateralmassone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[42]")
	private WebElement Wheelrailrightlateralmasstwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[43]")
	private WebElement Wheelrailrightlateralmassthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[44]")
	private WebElement Wheelrailrightlateralmassfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[45]")
	private WebElement Wheelrailrightlateralmassfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[46]")
	private WebElement Wheelrailrightlateralmasssix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[47]")
	private WebElement Wheelrailrightlateralmassseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[48]")
	private WebElement Wheelrailrightlateralmasseight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[49]")
	private WebElement Wheelrailrightlateralmassnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[50]")
	private WebElement Wheelrailrightlateralmassten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[51]")
	private WebElement Wheelrailrightlaterallabone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[52]")
	private WebElement Wheelrailrightlaterallabtwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[53]")
	private WebElement Wheelrailrightlaterallabthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[54]")
	private WebElement Wheelrailrightlaterallabfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[55]")
	private WebElement Wheelrailrightlaterallabfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[56]")
	private WebElement Wheelrailrightlaterallabsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[57]")
	private WebElement Wheelrailrightlaterallabseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[58]")
	private WebElement Wheelrailrightlaterallabeight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[59]")
	private WebElement Wheelrailrightlaterallabnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[60]")
	private WebElement Wheelrailrightlaterallabten;
	
	
	//RV
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[1]")
	private WebElement Wheelrailrightverticalone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[2]")
	private WebElement Wheelrailrightverticaltwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[3]")
	private WebElement Wheelrailrightverticalthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[4]")
	private WebElement Wheelrailrightverticalfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[5]")
	private WebElement Wheelrailrightverticalfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[6]")
	private WebElement Wheelrailrightverticalsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[7]")
	private WebElement Wheelrailrightverticalseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[8]")
	private WebElement Wheelrailrightverticaleight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[9]")
	private WebElement Wheelrailrightverticalnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[10]")
	private WebElement Wheelrailrightverticalten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[11]")
	private WebElement Wheelrailrightverticalcountone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[12]")
	private WebElement Wheelrailrightverticalcounttwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[13]")
	private WebElement Wheelrailrightverticalcountthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[14]")
	private WebElement Wheelrailrightverticalcountfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[15]")
	private WebElement Wheelrailrightverticalcountfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[16]")
	private WebElement Wheelrailrightverticalcountsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[17]")
	private WebElement Wheelrailrightverticalcountseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[18]")
	private WebElement Wheelrailrightverticalcounteight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[19]")
	private WebElement Wheelrailrightverticalcountnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[20]")
	private WebElement Wheelrailrightverticalcountten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[21]")
	private WebElement Wheelrailrightverticalnumberone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[22]")
	private WebElement Wheelrailrightverticalnumbertwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[23]")
	private WebElement Wheelrailrightverticalnumberthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[24]")
	private WebElement Wheelrailrightverticalnumberfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[25]")
	private WebElement Wheelrailrightverticalnumberfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[26]")
	private WebElement Wheelrailrightverticalnumbersix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[27]")
	private WebElement Wheelrailrightverticalnumberseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[28]")
	private WebElement Wheelrailrightverticalnumbereight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[29]")
	private WebElement Wheelrailrightverticalnumbernine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[30]")
	private WebElement Wheelrailrightverticalnumberten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[31]")
	private WebElement Wheelrailrightverticalunitone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[32]")
	private WebElement Wheelrailrightverticalunittwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[33]")
	private WebElement Wheelrailrightverticalunitthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[34]")
	private WebElement Wheelrailrightverticalunitfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[35]")
	private WebElement Wheelrailrightverticalunitfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[36]")
	private WebElement Wheelrailrightverticalunitsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[37]")
	private WebElement Wheelrailrightverticalunitseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[38]")
	private WebElement Wheelrailrightverticaluniteight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[39]")
	private WebElement Wheelrailrightverticalunitnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[40]")
	private WebElement Wheelrailrightverticalunitten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[41]")
	private WebElement Wheelrailrightverticalmassone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[42]")
	private WebElement Wheelrailrightverticalmasstwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[43]")
	private WebElement Wheelrailrightverticalmassthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[44]")
	private WebElement Wheelrailrightverticalmassfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[45]")
	private WebElement Wheelrailrightverticalmassfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[46]")
	private WebElement Wheelrailrightverticalmasssix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[47]")
	private WebElement Wheelrailrightverticalmassseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[48]")
	private WebElement Wheelrailrightverticalmasseight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[49]")
	private WebElement Wheelrailrightverticalmassnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[50]")
	private WebElement Wheelrailrightverticalmassten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[51]")
	private WebElement Wheelrailrightverticallabone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[52]")
	private WebElement Wheelrailrightverticallabtwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[53]")
	private WebElement Wheelrailrightverticallabthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[54]")
	private WebElement Wheelrailrightverticallabfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[55]")
	private WebElement Wheelrailrightverticallabfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[56]")
	private WebElement Wheelrailrightverticallabsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[57]")
	private WebElement Wheelrailrightverticallabseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[58]")
	private WebElement Wheelrailrightverticallabeight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[59]")
	private WebElement Wheelrailrightverticallabnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[60]")
	private WebElement Wheelrailrightverticallabten;
	
	
	
	
	
	
	
	
	
	public WebElement getWheelrailleftlateralmassfour() {
		return Wheelrailleftlateralmassfour;
	}

	public WebElement getWheelrailleftlateralmassone() {
		return Wheelrailleftlateralmassone;
	}

	public WebElement getWheelrailleftlateralmasstwo() {
		return Wheelrailleftlateralmasstwo;
	}

	public WebElement getWheelrailleftlateralmassthree() {
		return Wheelrailleftlateralmassthree;
	}


	public WebElement getWheelrailleftlateralmassfive() {
		return Wheelrailleftlateralmassfive;
	}

	public WebElement getWheelrailleftlateralmasssix() {
		return Wheelrailleftlateralmasssix;
	}

	public WebElement getWheelrailleftlateralmassseven() {
		return Wheelrailleftlateralmassseven;
	}

	public WebElement getWheelrailleftlateralmasseight() {
		return Wheelrailleftlateralmasseight;
	}

	public WebElement getWheelrailleftlateralmassnine() {
		return Wheelrailleftlateralmassnine;
	}

	public WebElement getWheelrailleftlateralmassten() {
		return Wheelrailleftlateralmassten;
	}

	public WebElement getWheelrailleftlaterallabone() {
		return Wheelrailleftlaterallabone;
	}

	public WebElement getWheelrailleftlaterallabtwo() {
		return Wheelrailleftlaterallabtwo;
	}

	public WebElement getWheelrailleftlaterallabthree() {
		return Wheelrailleftlaterallabthree;
	}

	public WebElement getWheelrailleftlaterallabfour() {
		return Wheelrailleftlaterallabfour;
	}

	public WebElement getWheelrailleftlaterallabfive() {
		return Wheelrailleftlaterallabfive;
	}

	public WebElement getWheelrailleftlaterallabsix() {
		return Wheelrailleftlaterallabsix;
	}

	public WebElement getWheelrailleftlaterallabseven() {
		return Wheelrailleftlaterallabseven;
	}

	public WebElement getWheelrailleftlaterallabeight() {
		return Wheelrailleftlaterallabeight;
	}

	public WebElement getWheelrailleftlaterallabnine() {
		return Wheelrailleftlaterallabnine;
	}

	public WebElement getWheelrailleftlaterallabten() {
		return Wheelrailleftlaterallabten;
	}

	public WebElement getWheelrailleftverticalmassone() {
		return Wheelrailleftverticalmassone;
	}

	public WebElement getWheelrailleftverticalmasstwo() {
		return Wheelrailleftverticalmasstwo;
	}

	public WebElement getWheelrailleftverticalmassthree() {
		return Wheelrailleftverticalmassthree;
	}

	public WebElement getWheelrailleftverticalmassfour() {
		return Wheelrailleftverticalmassfour;
	}

	public WebElement getWheelrailleftverticalmassfive() {
		return Wheelrailleftverticalmassfive;
	}

	public WebElement getWheelrailleftverticalmasssix() {
		return Wheelrailleftverticalmasssix;
	}

	public WebElement getWheelrailleftverticalmassseven() {
		return Wheelrailleftverticalmassseven;
	}

	public WebElement getWheelrailleftverticalmasseight() {
		return Wheelrailleftverticalmasseight;
	}

	public WebElement getWheelrailleftverticalmassnine() {
		return Wheelrailleftverticalmassnine;
	}

	public WebElement getWheelrailleftverticalmassten() {
		return Wheelrailleftverticalmassten;
	}

	public WebElement getWheelrailleftverticallabone() {
		return Wheelrailleftverticallabone;
	}

	public WebElement getWheelrailleftverticallabtwo() {
		return Wheelrailleftverticallabtwo;
	}

	public WebElement getWheelrailleftverticallabthree() {
		return Wheelrailleftverticallabthree;
	}

	public WebElement getWheelrailleftverticallabfour() {
		return Wheelrailleftverticallabfour;
	}

	public WebElement getWheelrailleftverticallabfive() {
		return Wheelrailleftverticallabfive;
	}

	public WebElement getWheelrailleftverticallabsix() {
		return Wheelrailleftverticallabsix;
	}

	public WebElement getWheelrailleftverticallabseven() {
		return Wheelrailleftverticallabseven;
	}

	public WebElement getWheelrailleftverticallabeight() {
		return Wheelrailleftverticallabeight;
	}

	public WebElement getWheelrailleftverticallabnine() {
		return Wheelrailleftverticallabnine;
	}

	public WebElement getWheelrailleftverticallabten() {
		return Wheelrailleftverticallabten;
	}

	public WebElement getWheelrailrightlateralmassone() {
		return Wheelrailrightlateralmassone;
	}

	public WebElement getWheelrailrightlateralmasstwo() {
		return Wheelrailrightlateralmasstwo;
	}

	public WebElement getWheelrailrightlateralmassthree() {
		return Wheelrailrightlateralmassthree;
	}

	public WebElement getWheelrailrightlateralmassfour() {
		return Wheelrailrightlateralmassfour;
	}

	public WebElement getWheelrailrightlateralmassfive() {
		return Wheelrailrightlateralmassfive;
	}

	public WebElement getWheelrailrightlateralmasssix() {
		return Wheelrailrightlateralmasssix;
	}

	public WebElement getWheelrailrightlateralmassseven() {
		return Wheelrailrightlateralmassseven;
	}

	public WebElement getWheelrailrightlateralmasseight() {
		return Wheelrailrightlateralmasseight;
	}

	public WebElement getWheelrailrightlateralmassnine() {
		return Wheelrailrightlateralmassnine;
	}

	public WebElement getWheelrailrightlateralmassten() {
		return Wheelrailrightlateralmassten;
	}

	public WebElement getWheelrailrightlaterallabone() {
		return Wheelrailrightlaterallabone;
	}

	public WebElement getWheelrailrightlaterallabtwo() {
		return Wheelrailrightlaterallabtwo;
	}

	public WebElement getWheelrailrightlaterallabthree() {
		return Wheelrailrightlaterallabthree;
	}

	public WebElement getWheelrailrightlaterallabfour() {
		return Wheelrailrightlaterallabfour;
	}

	public WebElement getWheelrailrightlaterallabfive() {
		return Wheelrailrightlaterallabfive;
	}

	public WebElement getWheelrailrightlaterallabsix() {
		return Wheelrailrightlaterallabsix;
	}

	public WebElement getWheelrailrightlaterallabseven() {
		return Wheelrailrightlaterallabseven;
	}

	public WebElement getWheelrailrightlaterallabeight() {
		return Wheelrailrightlaterallabeight;
	}

	public WebElement getWheelrailrightlaterallabnine() {
		return Wheelrailrightlaterallabnine;
	}

	public WebElement getWheelrailrightlaterallabten() {
		return Wheelrailrightlaterallabten;
	}

	public WebElement getWheelrailrightverticalmassone() {
		return Wheelrailrightverticalmassone;
	}

	public WebElement getWheelrailrightverticalmasstwo() {
		return Wheelrailrightverticalmasstwo;
	}

	public WebElement getWheelrailrightverticalmassthree() {
		return Wheelrailrightverticalmassthree;
	}

	public WebElement getWheelrailrightverticalmassfour() {
		return Wheelrailrightverticalmassfour;
	}

	public WebElement getWheelrailrightverticalmassfive() {
		return Wheelrailrightverticalmassfive;
	}

	public WebElement getWheelrailrightverticalmasssix() {
		return Wheelrailrightverticalmasssix;
	}

	public WebElement getWheelrailrightverticalmassseven() {
		return Wheelrailrightverticalmassseven;
	}

	public WebElement getWheelrailrightverticalmasseight() {
		return Wheelrailrightverticalmasseight;
	}

	public WebElement getWheelrailrightverticalmassnine() {
		return Wheelrailrightverticalmassnine;
	}

	public WebElement getWheelrailrightverticalmassten() {
		return Wheelrailrightverticalmassten;
	}

	public WebElement getWheelrailrightverticallabone() {
		return Wheelrailrightverticallabone;
	}

	public WebElement getWheelrailrightverticallabtwo() {
		return Wheelrailrightverticallabtwo;
	}

	public WebElement getWheelrailrightverticallabthree() {
		return Wheelrailrightverticallabthree;
	}

	public WebElement getWheelrailrightverticallabfour() {
		return Wheelrailrightverticallabfour;
	}

	public WebElement getWheelrailrightverticallabfive() {
		return Wheelrailrightverticallabfive;
	}

	public WebElement getWheelrailrightverticallabsix() {
		return Wheelrailrightverticallabsix;
	}

	public WebElement getWheelrailrightverticallabseven() {
		return Wheelrailrightverticallabseven;
	}

	public WebElement getWheelrailrightverticallabeight() {
		return Wheelrailrightverticallabeight;
	}

	public WebElement getWheelrailrightverticallabnine() {
		return Wheelrailrightverticallabnine;
	}

	public WebElement getWheelrailrightverticallabten() {
		return Wheelrailrightverticallabten;
	}

	public WebElement getWheelrailflangbackbox() {
		return Wheelrailflangbackbox;
	}

	public WebElement getWheelrailprofilesave() {
		return Wheelrailprofilesave;
	}

	public WebElement getWheelrailrightlateralcountone() {
		return Wheelrailrightlateralcountone;
	}

	public WebElement getWheelrailleftlateralcountone() {
		return Wheelrailleftlateralcountone;
	}

	public WebElement getWheelrailleftlateralcounttwo() {
		return Wheelrailleftlateralcounttwo;
	}

	public WebElement getWheelrailleftlateralcountthree() {
		return Wheelrailleftlateralcountthree;
	}

	public WebElement getWheelrailleftlateralcountfour() {
		return Wheelrailleftlateralcountfour;
	}

	public WebElement getWheelrailleftlateralcountfive() {
		return Wheelrailleftlateralcountfive;
	}

	public WebElement getWheelrailleftlateralcountsix() {
		return Wheelrailleftlateralcountsix;
	}

	public WebElement getWheelrailleftlateralcountseven() {
		return Wheelrailleftlateralcountseven;
	}

	public WebElement getWheelrailleftlateralcounteight() {
		return Wheelrailleftlateralcounteight;
	}

	public WebElement getWheelrailleftlateralcountnine() {
		return Wheelrailleftlateralcountnine;
	}

	public WebElement getWheelrailleftlateralcountten() {
		return Wheelrailleftlateralcountten;
	}

	public WebElement getWheelrailleftlateralnumberone() {
		return Wheelrailleftlateralnumberone;
	}

	public WebElement getWheelrailleftlateralnumbertwo() {
		return Wheelrailleftlateralnumbertwo;
	}

	public WebElement getWheelrailleftlateralnumberthree() {
		return Wheelrailleftlateralnumberthree;
	}

	public WebElement getWheelrailleftlateralnumberfour() {
		return Wheelrailleftlateralnumberfour;
	}

	public WebElement getWheelrailleftlateralnumberfive() {
		return Wheelrailleftlateralnumberfive;
	}

	public WebElement getWheelrailleftlateralnumbersix() {
		return Wheelrailleftlateralnumbersix;
	}

	public WebElement getWheelrailleftlateralnumberseven() {
		return Wheelrailleftlateralnumberseven;
	}

	public WebElement getWheelrailleftlateralnumbereight() {
		return Wheelrailleftlateralnumbereight;
	}

	public WebElement getWheelrailleftlateralnumbernine() {
		return Wheelrailleftlateralnumbernine;
	}

	public WebElement getWheelrailleftlateralnumberten() {
		return Wheelrailleftlateralnumberten;
	}

	public WebElement getWheelrailleftlateralunitone() {
		return Wheelrailleftlateralunitone;
	}

	public WebElement getWheelrailleftlateralunittwo() {
		return Wheelrailleftlateralunittwo;
	}

	public WebElement getWheelrailleftlateralunitthree() {
		return Wheelrailleftlateralunitthree;
	}

	public WebElement getWheelrailleftlateralunitfour() {
		return Wheelrailleftlateralunitfour;
	}

	public WebElement getWheelrailleftlateralunitfive() {
		return Wheelrailleftlateralunitfive;
	}

	public WebElement getWheelrailleftlateralunitsix() {
		return Wheelrailleftlateralunitsix;
	}

	public WebElement getWheelrailleftlateralunitseven() {
		return Wheelrailleftlateralunitseven;
	}

	public WebElement getWheelrailleftlateraluniteight() {
		return Wheelrailleftlateraluniteight;
	}

	public WebElement getWheelrailleftlateralunitnine() {
		return Wheelrailleftlateralunitnine;
	}

	public WebElement getWheelrailleftlateralunitten() {
		return Wheelrailleftlateralunitten;
	}

	public WebElement getWheelrailleftverticalcountone() {
		return Wheelrailleftverticalcountone;
	}

	public WebElement getWheelrailleftverticalcounttwo() {
		return Wheelrailleftverticalcounttwo;
	}

	public WebElement getWheelrailleftverticalcountthree() {
		return Wheelrailleftverticalcountthree;
	}

	public WebElement getWheelrailleftverticalcountfour() {
		return Wheelrailleftverticalcountfour;
	}

	public WebElement getWheelrailleftverticalcountfive() {
		return Wheelrailleftverticalcountfive;
	}

	public WebElement getWheelrailleftverticalcountsix() {
		return Wheelrailleftverticalcountsix;
	}

	public WebElement getWheelrailleftverticalcountseven() {
		return Wheelrailleftverticalcountseven;
	}

	public WebElement getWheelrailleftverticalcounteight() {
		return Wheelrailleftverticalcounteight;
	}

	public WebElement getWheelrailleftverticalcountnine() {
		return Wheelrailleftverticalcountnine;
	}

	public WebElement getWheelrailleftverticalcountten() {
		return Wheelrailleftverticalcountten;
	}

	public WebElement getWheelrailleftverticalnumberone() {
		return Wheelrailleftverticalnumberone;
	}

	public WebElement getWheelrailleftverticalnumbertwo() {
		return Wheelrailleftverticalnumbertwo;
	}

	public WebElement getWheelrailleftverticalnumberthree() {
		return Wheelrailleftverticalnumberthree;
	}

	public WebElement getWheelrailleftverticalnumberfour() {
		return Wheelrailleftverticalnumberfour;
	}

	public WebElement getWheelrailleftverticalnumberfive() {
		return Wheelrailleftverticalnumberfive;
	}

	public WebElement getWheelrailleftverticalnumbersix() {
		return Wheelrailleftverticalnumbersix;
	}

	public WebElement getWheelrailleftverticalnumberseven() {
		return Wheelrailleftverticalnumberseven;
	}

	public WebElement getWheelrailleftverticalnumbereight() {
		return Wheelrailleftverticalnumbereight;
	}

	public WebElement getWheelrailleftverticalnumbernine() {
		return Wheelrailleftverticalnumbernine;
	}

	public WebElement getWheelrailleftverticalnumberten() {
		return Wheelrailleftverticalnumberten;
	}

	public WebElement getWheelrailleftverticalunitone() {
		return Wheelrailleftverticalunitone;
	}

	public WebElement getWheelrailleftverticalunittwo() {
		return Wheelrailleftverticalunittwo;
	}

	public WebElement getWheelrailleftverticalunitthree() {
		return Wheelrailleftverticalunitthree;
	}

	public WebElement getWheelrailleftverticalunitfour() {
		return Wheelrailleftverticalunitfour;
	}

	public WebElement getWheelrailleftverticalunitfive() {
		return Wheelrailleftverticalunitfive;
	}

	public WebElement getWheelrailleftverticalunitsix() {
		return Wheelrailleftverticalunitsix;
	}

	public WebElement getWheelrailleftverticalunitseven() {
		return Wheelrailleftverticalunitseven;
	}

	public WebElement getWheelrailleftverticaluniteight() {
		return Wheelrailleftverticaluniteight;
	}

	public WebElement getWheelrailleftverticalunitnine() {
		return Wheelrailleftverticalunitnine;
	}

	public WebElement getWheelrailleftverticalunitten() {
		return Wheelrailleftverticalunitten;
	}

	public WebElement getWheelrailrightlateralcounttwo() {
		return Wheelrailrightlateralcounttwo;
	}

	public WebElement getWheelrailrightlateralcountthree() {
		return Wheelrailrightlateralcountthree;
	}

	public WebElement getWheelrailrightlateralcountfour() {
		return Wheelrailrightlateralcountfour;
	}

	public WebElement getWheelrailrightlateralcountfive() {
		return Wheelrailrightlateralcountfive;
	}

	public WebElement getWheelrailrightlateralcountsix() {
		return Wheelrailrightlateralcountsix;
	}

	public WebElement getWheelrailrightlateralcountseven() {
		return Wheelrailrightlateralcountseven;
	}

	public WebElement getWheelrailrightlateralcounteight() {
		return Wheelrailrightlateralcounteight;
	}

	public WebElement getWheelrailrightlateralcountnine() {
		return Wheelrailrightlateralcountnine;
	}

	public WebElement getWheelrailrightlateralcountten() {
		return Wheelrailrightlateralcountten;
	}

	public WebElement getWheelrailrightlateralnumberone() {
		return Wheelrailrightlateralnumberone;
	}

	public WebElement getWheelrailrightlateralnumbertwo() {
		return Wheelrailrightlateralnumbertwo;
	}

	public WebElement getWheelrailrightlateralnumberthree() {
		return Wheelrailrightlateralnumberthree;
	}

	public WebElement getWheelrailrightlateralnumberfour() {
		return Wheelrailrightlateralnumberfour;
	}

	public WebElement getWheelrailrightlateralnumberfive() {
		return Wheelrailrightlateralnumberfive;
	}

	public WebElement getWheelrailrightlateralnumbersix() {
		return Wheelrailrightlateralnumbersix;
	}

	public WebElement getWheelrailrightlateralnumberseven() {
		return Wheelrailrightlateralnumberseven;
	}

	public WebElement getWheelrailrightlateralnumbereight() {
		return Wheelrailrightlateralnumbereight;
	}

	public WebElement getWheelrailrightlateralnumbernine() {
		return Wheelrailrightlateralnumbernine;
	}

	public WebElement getWheelrailrightlateralnumberten() {
		return Wheelrailrightlateralnumberten;
	}

	public WebElement getWheelrailrightlateralunitone() {
		return Wheelrailrightlateralunitone;
	}

	public WebElement getWheelrailrightlateralunittwo() {
		return Wheelrailrightlateralunittwo;
	}

	public WebElement getWheelrailrightlateralunitthree() {
		return Wheelrailrightlateralunitthree;
	}

	public WebElement getWheelrailrightlateralunitfour() {
		return Wheelrailrightlateralunitfour;
	}

	public WebElement getWheelrailrightlateralunitfive() {
		return Wheelrailrightlateralunitfive;
	}

	public WebElement getWheelrailrightlateralunitsix() {
		return Wheelrailrightlateralunitsix;
	}

	public WebElement getWheelrailrightlateralunitseven() {
		return Wheelrailrightlateralunitseven;
	}

	public WebElement getWheelrailrightlateraluniteight() {
		return Wheelrailrightlateraluniteight;
	}

	public WebElement getWheelrailrightlateralunitnine() {
		return Wheelrailrightlateralunitnine;
	}

	public WebElement getWheelrailrightlateralunitten() {
		return Wheelrailrightlateralunitten;
	}

	public WebElement getWheelrailrightverticalcountone() {
		return Wheelrailrightverticalcountone;
	}

	public WebElement getWheelrailrightverticalcounttwo() {
		return Wheelrailrightverticalcounttwo;
	}

	public WebElement getWheelrailrightverticalcountthree() {
		return Wheelrailrightverticalcountthree;
	}

	public WebElement getWheelrailrightverticalcountfour() {
		return Wheelrailrightverticalcountfour;
	}

	public WebElement getWheelrailrightverticalcountfive() {
		return Wheelrailrightverticalcountfive;
	}

	public WebElement getWheelrailrightverticalcountsix() {
		return Wheelrailrightverticalcountsix;
	}

	public WebElement getWheelrailrightverticalcountseven() {
		return Wheelrailrightverticalcountseven;
	}

	public WebElement getWheelrailrightverticalcounteight() {
		return Wheelrailrightverticalcounteight;
	}

	public WebElement getWheelrailrightverticalcountnine() {
		return Wheelrailrightverticalcountnine;
	}

	public WebElement getWheelrailrightverticalcountten() {
		return Wheelrailrightverticalcountten;
	}

	public WebElement getWheelrailrightverticalnumberone() {
		return Wheelrailrightverticalnumberone;
	}

	public WebElement getWheelrailrightverticalnumbertwo() {
		return Wheelrailrightverticalnumbertwo;
	}

	public WebElement getWheelrailrightverticalnumberthree() {
		return Wheelrailrightverticalnumberthree;
	}

	public WebElement getWheelrailrightverticalnumberfour() {
		return Wheelrailrightverticalnumberfour;
	}

	public WebElement getWheelrailrightverticalnumberfive() {
		return Wheelrailrightverticalnumberfive;
	}

	public WebElement getWheelrailrightverticalnumbersix() {
		return Wheelrailrightverticalnumbersix;
	}

	public WebElement getWheelrailrightverticalnumberseven() {
		return Wheelrailrightverticalnumberseven;
	}

	public WebElement getWheelrailrightverticalnumbereight() {
		return Wheelrailrightverticalnumbereight;
	}

	public WebElement getWheelrailrightverticalnumbernine() {
		return Wheelrailrightverticalnumbernine;
	}

	public WebElement getWheelrailrightverticalnumberten() {
		return Wheelrailrightverticalnumberten;
	}

	public WebElement getWheelrailrightverticalunitone() {
		return Wheelrailrightverticalunitone;
	}

	public WebElement getWheelrailrightverticalunittwo() {
		return Wheelrailrightverticalunittwo;
	}

	public WebElement getWheelrailrightverticalunitthree() {
		return Wheelrailrightverticalunitthree;
	}

	public WebElement getWheelrailrightverticalunitfour() {
		return Wheelrailrightverticalunitfour;
	}

	public WebElement getWheelrailrightverticalunitfive() {
		return Wheelrailrightverticalunitfive;
	}

	public WebElement getWheelrailrightverticalunitsix() {
		return Wheelrailrightverticalunitsix;
	}

	public WebElement getWheelrailrightverticalunitseven() {
		return Wheelrailrightverticalunitseven;
	}

	public WebElement getWheelrailrightverticaluniteight() {
		return Wheelrailrightverticaluniteight;
	}

	public WebElement getWheelrailrightverticalunitnine() {
		return Wheelrailrightverticalunitnine;
	}

	public WebElement getWheelrailrightverticalunitten() {
		return Wheelrailrightverticalunitten;
	}

	public WebElement getWheelrailcreateprofilebutton() {
		return Wheelrailcreateprofilebutton;
	}

	public WebElement getWheelrailWheeloption() {
		return WheelrailWheeloption;
	}

	public WebElement getWheelrailprofilename() {
		return Wheelrailprofilename;
	}

	public WebElement getWheelrailmanual() {
		return Wheelrailmanual;
	}

	public WebElement getWheelrailmanualplus() {
		return Wheelrailmanualplus;
	}

	public WebElement getWheelrailleftlateralone() {
		return Wheelrailleftlateralone;
	}

	public WebElement getWheelrailleftlateraltwo() {
		return Wheelrailleftlateraltwo;
	}

	public WebElement getWheelrailleftlateralthree() {
		return Wheelrailleftlateralthree;
	}

	public WebElement getWheelrailleftlateralfour() {
		return Wheelrailleftlateralfour;
	}

	public WebElement getWheelrailleftlateralfive() {
		return Wheelrailleftlateralfive;
	}

	public WebElement getWheelrailleftlateralsix() {
		return Wheelrailleftlateralsix;
	}

	public WebElement getWheelrailleftlateralseven() {
		return Wheelrailleftlateralseven;
	}

	public WebElement getWheelrailleftlateraleight() {
		return Wheelrailleftlateraleight;
	}

	public WebElement getWheelrailleftlateralnine() {
		return Wheelrailleftlateralnine;
	}

	public WebElement getWheelrailleftlateralten() {
		return Wheelrailleftlateralten;
	}

	public WebElement getWheelrailleftverticalone() {
		return Wheelrailleftverticalone;
	}

	public WebElement getWheelrailleftverticaltwo() {
		return Wheelrailleftverticaltwo;
	}

	public WebElement getWheelrailleftverticalthree() {
		return Wheelrailleftverticalthree;
	}

	public WebElement getWheelrailleftverticalfour() {
		return Wheelrailleftverticalfour;
	}

	public WebElement getWheelrailleftverticalfive() {
		return Wheelrailleftverticalfive;
	}

	public WebElement getWheelrailleftverticalsix() {
		return Wheelrailleftverticalsix;
	}

	public WebElement getWheelrailleftverticalseven() {
		return Wheelrailleftverticalseven;
	}

	public WebElement getWheelrailleftverticaleight() {
		return Wheelrailleftverticaleight;
	}

	public WebElement getWheelrailleftverticalnine() {
		return Wheelrailleftverticalnine;
	}

	public WebElement getWheelrailleftverticalten() {
		return Wheelrailleftverticalten;
	}

	public WebElement getWheelrailrightlateralone() {
		return Wheelrailrightlateralone;
	}

	public WebElement getWheelrailrightlateraltwo() {
		return Wheelrailrightlateraltwo;
	}

	public WebElement getWheelrailrightlateralthree() {
		return Wheelrailrightlateralthree;
	}

	public WebElement getWheelrailrightlateralfour() {
		return Wheelrailrightlateralfour;
	}

	public WebElement getWheelrailrightlateralfive() {
		return Wheelrailrightlateralfive;
	}

	public WebElement getWheelrailrightlateralsix() {
		return Wheelrailrightlateralsix;
	}

	public WebElement getWheelrailrightlateralseven() {
		return Wheelrailrightlateralseven;
	}

	public WebElement getWheelrailrightlateraleight() {
		return Wheelrailrightlateraleight;
	}

	public WebElement getWheelrailrightlateralnine() {
		return Wheelrailrightlateralnine;
	}

	public WebElement getWheelrailrightlateralten() {
		return Wheelrailrightlateralten;
	}

	public WebElement getWheelrailrightverticalone() {
		return Wheelrailrightverticalone;
	}

	public WebElement getWheelrailrightverticaltwo() {
		return Wheelrailrightverticaltwo;
	}

	public WebElement getWheelrailrightverticalthree() {
		return Wheelrailrightverticalthree;
	}

	public WebElement getWheelrailrightverticalfour() {
		return Wheelrailrightverticalfour;
	}

	public WebElement getWheelrailrightverticalfive() {
		return Wheelrailrightverticalfive;
	}

	public WebElement getWheelrailrightverticalsix() {
		return Wheelrailrightverticalsix;
	}

	public WebElement getWheelrailrightverticalseven() {
		return Wheelrailrightverticalseven;
	}

	public WebElement getWheelrailrightverticaleight() {
		return Wheelrailrightverticaleight;
	}

	public WebElement getWheelrailrightverticalnine() {
		return Wheelrailrightverticalnine;
	}

	public WebElement getWheelrailrightverticalten() {
		return Wheelrailrightverticalten;
	}
	
	
	
	
	//New Digital trains web page locater(10208)
	
	@FindBy(xpath = "//a[text()='DigitalTrains™ Website							']")
	private WebElement Newdigitaltraindwebsitebutton;
	@FindBy(xpath = "//a[text()='About']")
	private WebElement Digitaltrainabout;
	@FindBy(xpath = "//a[text()='Simulator']")
	private WebElement Digitaltrainsimulator;
	@FindBy(xpath = "//a[text()='DigitalTrains™ Impact']")
	private WebElement Digitaltrainimapct;
	@FindBy(xpath = "//a[text()='DigitalTrains™ Train Running']")
	private WebElement Digitaltraintrainrunning;
	@FindBy(xpath = "//a[text()='DigitalTrains™ Gauging']")
	private WebElement Digitaltraingauging;
	@FindBy(xpath = "//a[text()='Tools']")
	private WebElement Digitaltraintools;
	@FindBy(xpath = "//a[text()='Route Profiles']")
	private WebElement Digitaltrainrouteptofiles;
	@FindBy(xpath = "(//a[text()='Trains'])[1]")
	private WebElement Digitaltraintrains;
	@FindBy(xpath = "(//a[text()='Vehicles'])[1]")
	private WebElement Digitaltrainvehicles;
	@FindBy(xpath = "(//a[text()='Wheels/Rails'])[1]")
	private WebElement Digitaltrainwheelsrails;
	@FindBy(xpath = "(//a[text()='Bogies'])[1]")
	private WebElement Digitaltrainbogies;
	@FindBy(xpath = "(//a[text()='Buffer Stops'])[1]")
	private WebElement Digitaltrainbufferstops;
	@FindBy(xpath = "(//a[text()='Devices'])[1]")
	private WebElement Digitaltraindevices;
	@FindBy(xpath = "(//a[text()='Coupling Interfaces'])[1]")
	private WebElement Digitaltraincouplinginterfaces;
	@FindBy(xpath = "(//a[text()='Train Optimiser'])[1]")
	private WebElement Digitaltraintrainoptimiser;
	@FindBy(xpath = "(//a[text()='Comparison Tools'])[1]")
	private WebElement Digitaltraincomparisontool;
	@FindBy(xpath = "(//a[text()='Analysis Tools'])[1]")
	private WebElement Digitaltrainanalysistools;
	@FindBy(xpath = "(//a[text()='Digital Twins'])[1]")
	private WebElement Digitaltraindigitaltwins;
	@FindBy(xpath = "//a[text()='Contact']")
	private WebElement Digitaltraincontact;
	@FindBy(xpath = "(//a[text()='Free Demo Licence'])[2]")
	private WebElement Digitaltrainfreedemolicence;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement Digitaltrainsignupandlogin;
    @FindBy(xpath = "(//a[text()='Free Demo Licence'])[3]")
    private WebElement Digitaltrainfreedemolicencetwo;
    @FindBy(xpath = "(//a[text()='Find out more'])[1]")
    private WebElement Digitaltrainvampirefindoutmorebutton;
    @FindBy(xpath = "//h2[text()='Features']")
    private WebElement Digitaltrainfeatureoption;
    @FindBy(xpath = "//a[@id='feature-tab-1']")
    private WebElement Digitaltraincollaborating;
    @FindBy(xpath = "//a[@id='feature-tab-2']")
    private WebElement Digitaltrainmodellingandvisualisation;
    @FindBy(xpath = "//strong[text()='Route Profiles']")
    private WebElement Digitaltrainmodellingrouteprofiles;
    @FindBy(xpath = "//strong[text()='Vehicles']")
    private WebElement Digitaltrainmodellingvehicles;
    @FindBy(xpath = "//strong[text()='Interfaces']")
    private WebElement Digitaltrainmodellinginterfaces;
    @FindBy(xpath = "//strong[text()='Buffer stops']")
    private WebElement Digitaltrainmodellingbufferstops;
    @FindBy(xpath = "//a[@id='feature-tab-3']")
    private WebElement Digitaltraindatabasesandlibraries;
    @FindBy(xpath = "//a[text()='Bogie components']")
    private WebElement Digitaltraindatabogiecomponents;
    @FindBy(xpath = "//a[text()='Bogie assemblies']")
    private WebElement Digitaltraindatabogieassemblies;
    @FindBy(xpath = "(//a[text()='Vehicles'])[2]")
    private WebElement Digitaltraindatavehicles;
    @FindBy(xpath = "//a[text()='Coupling components']")
    private WebElement Digitaltraindatacouplingcomponents;
    @FindBy(xpath = "//a[text()='Coupling interface']")
    private WebElement Digitaltraindatacouplinginterface;
    @FindBy(xpath = "(//a[text()='Trains'])[2]")
    private WebElement Digitaltraindatatrains;
    @FindBy(xpath = "//a[text()='Rail routes']")
    private WebElement Digitaltraindatarailroutes;
    @FindBy(xpath = "//a[text()='Wheel and rail profiles']")
    private WebElement Digitaltraindatawheelandrailprofiles;
    @FindBy(xpath = "//a[text()='Train gauges']")
    private WebElement Digitaltraindatatraingauges;
    @FindBy(xpath = "//a[text()='Structural gauges']")
    private WebElement Digitaltraindatastructuralgauges;
    @FindBy(xpath = "//a[text()='Buffer stops']")
    private WebElement Digitaltraindatabufferstops;
    @FindBy(xpath = "//a[text()='Impact']")
    private WebElement Digitaltrainsimulationimpactfindoutmore;
    @FindBy(xpath = "(//a[text()='Find out more'])[3]")
    private WebElement Digitaltrainsimulationtrainrunningfindoutmore;
    @FindBy(xpath = "(//a[text()='Find out more'])[4]")
    private WebElement Digitaltrainsimulationgaugingfindoutmore;
    @FindBy(xpath = "//h5[text()='Route Profiles']")
    private WebElement Digitaltraininfrastracturerouteprofiles;
    @FindBy(xpath = "//h5[text()='Trains']")
    private WebElement Digitaltraininfrastracturetrains;
	@FindBy(xpath = "//h5[text()='Buffer Stops']")
	private WebElement Digitaltraininfrastracturebufferstops;
	@FindBy(xpath = "//h5[text()='Vehicles']")
	private WebElement Digitaltraininfrastracturevehicles;
	@FindBy(xpath = "//h5[text()='Bogies']")
	private WebElement Digitaltraininfrastracturebogies;
	@FindBy(xpath = "//h5[text()='Coupling interfaces']")
	private WebElement Digitaltraininfrastracturecouplinginterfaces;
	@FindBy(xpath = "//h5[text()='Wheels/Rails']")
	private WebElement Digitaltraincomponentswheelsandrails;
	@FindBy(xpath = "//h5[text()='Devices']")
	private WebElement Digitaltraincomponentsdevices;
	@FindBy(xpath = "//h5[text()='Digital Twins']")
	private WebElement Digitaltraincomponentsdigitaltwins;
	@FindBy(xpath = "//h5[text()='Comparison tools']")
	private WebElement Digitaltraintoolscomparisontools;
	@FindBy(xpath = "//h5[text()='Analysis tools']")
	private WebElement Digitaltraintoolsanalysistools;
	@FindBy(xpath = "//h5[text()='Train Optimiser']")
	private WebElement Digitaltraintooltrainoptimiser;
	@FindBy(xpath = "//h2[text()='Features']")
	private WebElement Digitaltrainfeatures;
	
	                    //new
	@FindBy(xpath = "(//a[text()='Find out more'])[5]")
	private WebElement Digitaltrainsubscriptionplanfindoutmore;
	@FindBy(xpath = "(//label[text()='Yearly'])[1]")
	private WebElement Digitaltrainimpactyearly;
	@FindBy(xpath = "(//label[text()='Monthly'])[1]")
	private WebElement Digitaltrainimpactmonthly;
	@FindBy(xpath = "//a[text()='DigitalTrains™  Train Running']")
	private WebElement Digitaltrainrunning;
	@FindBy(xpath ="(//label[text()='Yearly'])[2]")
	private WebElement Digitaltrainrunningyearly;
	@FindBy(xpath = "(//label[text()='Monthly'])[2]")
	private WebElement Digitaltrainrunningmonthly;
	@FindBy(xpath = "//a[text()='DigitalTrains™  Gauging']")
	private WebElement Digitaltraingaugingoption;
	@FindBy(xpath = "//label[text()='Yearly'])[3]")
	private WebElement Digitaltraingaugingyearly;
	@FindBy(xpath = "(//label[text()='Monthly'])[3]")
	private WebElement Digitaltraingaugingmonthly;
	
			

	              //scroll down
	@FindBy(xpath = "//h3[text()='IMPACT SIMULATION SETUP']")
	private WebElement imapctsimulationsetup;
	
	
	
	public WebElement getDigitaltrainfeatures() {
		return Digitaltrainfeatures;
	}

	public WebElement getImapctsimulationsetup() {
		return imapctsimulationsetup;
	}

	public WebElement getNewdigitaltraindwebsitebutton() {
		return Newdigitaltraindwebsitebutton;
	}

	public WebElement getDigitaltrainabout() {
		return Digitaltrainabout;
	}

	public WebElement getDigitaltrainsimulator() {
		return Digitaltrainsimulator;
	}

	public WebElement getDigitaltrainimapct() {
		return Digitaltrainimapct;
	}

	public WebElement getDigitaltraintrainrunning() {
		return Digitaltraintrainrunning;
	}

	public WebElement getDigitaltraingauging() {
		return Digitaltraingauging;
	}

	public WebElement getDigitaltraintools() {
		return Digitaltraintools;
	}

	public WebElement getDigitaltrainrouteptofiles() {
		return Digitaltrainrouteptofiles;
	}

	public WebElement getDigitaltraintrains() {
		return Digitaltraintrains;
	}

	public WebElement getDigitaltrainvehicles() {
		return Digitaltrainvehicles;
	}

	public WebElement getDigitaltrainwheelsrails() {
		return Digitaltrainwheelsrails;
	}

	public WebElement getDigitaltrainbogies() {
		return Digitaltrainbogies;
	}

	public WebElement getDigitaltrainbufferstops() {
		return Digitaltrainbufferstops;
	}

	public WebElement getDigitaltraindevices() {
		return Digitaltraindevices;
	}

	public WebElement getDigitaltraincouplinginterfaces() {
		return Digitaltraincouplinginterfaces;
	}

	public WebElement getDigitaltraintrainoptimiser() {
		return Digitaltraintrainoptimiser;
	}

	public WebElement getDigitaltraincomparisontool() {
		return Digitaltraincomparisontool;
	}

	public WebElement getDigitaltrainanalysistools() {
		return Digitaltrainanalysistools;
	}

	public WebElement getDigitaltraindigitaltwins() {
		return Digitaltraindigitaltwins;
	}

	public WebElement getDigitaltraincontact() {
		return Digitaltraincontact;
	}

	public WebElement getDigitaltrainfreedemolicence() {
		return Digitaltrainfreedemolicence;
	}

	public WebElement getDigitaltrainsignupandlogin() {
		return Digitaltrainsignupandlogin;
	}

	public WebElement getDigitaltrainfreedemolicencetwo() {
		return Digitaltrainfreedemolicencetwo;
	}

	public WebElement getDigitaltrainvampirefindoutmorebutton() {
		return Digitaltrainvampirefindoutmorebutton;
	}

	public WebElement getDigitaltraincollaborating() {
		return Digitaltraincollaborating;
	}

	public WebElement getDigitaltrainmodellingandvisualisation() {
		return Digitaltrainmodellingandvisualisation;
	}

	public WebElement getDigitaltrainmodellingrouteprofiles() {
		return Digitaltrainmodellingrouteprofiles;
	}

	public WebElement getDigitaltrainmodellingvehicles() {
		return Digitaltrainmodellingvehicles;
	}

	public WebElement getDigitaltrainmodellinginterfaces() {
		return Digitaltrainmodellinginterfaces;
	}

	public WebElement getDigitaltrainmodellingbufferstops() {
		return Digitaltrainmodellingbufferstops;
	}

	public WebElement getDigitaltraindatabasesandlibraries() {
		return Digitaltraindatabasesandlibraries;
	}

	public WebElement getDigitaltraindatabogiecomponents() {
		return Digitaltraindatabogiecomponents;
	}

	public WebElement getDigitaltraindatabogieassemblies() {
		return Digitaltraindatabogieassemblies;
	}

	public WebElement getDigitaltraindatavehicles() {
		return Digitaltraindatavehicles;
	}

	public WebElement getDigitaltraindatacouplingcomponents() {
		return Digitaltraindatacouplingcomponents;
	}

	public WebElement getDigitaltraindatacouplinginterface() {
		return Digitaltraindatacouplinginterface;
	}

	public WebElement getDigitaltraindatatrains() {
		return Digitaltraindatatrains;
	}

	public WebElement getDigitaltraindatarailroutes() {
		return Digitaltraindatarailroutes;
	}

	public WebElement getDigitaltraindatawheelandrailprofiles() {
		return Digitaltraindatawheelandrailprofiles;
	}

	public WebElement getDigitaltraindatatraingauges() {
		return Digitaltraindatatraingauges;
	}

	public WebElement getDigitaltraindatastructuralgauges() {
		return Digitaltraindatastructuralgauges;
	}

	public WebElement getDigitaltraindatabufferstops() {
		return Digitaltraindatabufferstops;
	}

	public WebElement getDigitaltrainsimulationimpactfindoutmore() {
		return Digitaltrainsimulationimpactfindoutmore;
	}

	public WebElement getDigitaltrainsimulationtrainrunningfindoutmore() {
		return Digitaltrainsimulationtrainrunningfindoutmore;
	}

	public WebElement getDigitaltrainsimulationgaugingfindoutmore() {
		return Digitaltrainsimulationgaugingfindoutmore;
	}

	public WebElement getDigitaltraininfrastracturerouteprofiles() {
		return Digitaltraininfrastracturerouteprofiles;
	}

	public WebElement getDigitaltraininfrastracturetrains() {
		return Digitaltraininfrastracturetrains;
	}

	public WebElement getDigitaltraininfrastracturebufferstops() {
		return Digitaltraininfrastracturebufferstops;
	}

	public WebElement getDigitaltraininfrastracturevehicles() {
		return Digitaltraininfrastracturevehicles;
	}

	public WebElement getDigitaltraininfrastracturebogies() {
		return Digitaltraininfrastracturebogies;
	}

	public WebElement getDigitaltraininfrastracturecouplinginterfaces() {
		return Digitaltraininfrastracturecouplinginterfaces;
	}

	public WebElement getDigitaltraincomponentswheelsandrails() {
		return Digitaltraincomponentswheelsandrails;
	}

	public WebElement getDigitaltraincomponentsdevices() {
		return Digitaltraincomponentsdevices;
	}

	public WebElement getDigitaltraincomponentsdigitaltwins() {
		return Digitaltraincomponentsdigitaltwins;
	}

	public WebElement getDigitaltraintoolscomparisontools() {
		return Digitaltraintoolscomparisontools;
	}

	public WebElement getDigitaltraintoolsanalysistools() {
		return Digitaltraintoolsanalysistools;
	}

	public WebElement getDigitaltraintooltrainoptimiser() {
		return Digitaltraintooltrainoptimiser;
	}
	
	
	
	
	//create the rail profile locater (9914)
	
	@FindBy(xpath = "(//button[@class='btn btn-primary btn-block jqProfileBtn create-profile-btn'])[2]")
	private WebElement Railprofilebutton;
	@FindBy(xpath = "(//button[@class='btn btn-sm btn-success btn-block glyphicon glyphicon-plus jqMultiDataAdd mt-0'])[2]")
	private WebElement Railprofileplusbutton;
	//LL
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[2]")
	private WebElement Railprofileleftlateralone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[3]")
	private WebElement Railprofileleftlateraltwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[4]")
	private WebElement Railprofileleftlateralthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[5]")
	private WebElement Railprofileleftlateralfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[6]")
	private WebElement Railprofileleftlateralfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[7]")
	private WebElement Railprofileleftlateralsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[8]")
	private WebElement Railprofileleftlateralseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[9]")
	private WebElement Railprofileleftlateraleight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[10]")
	private WebElement Railprofileleftlateralnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[11]")
	private WebElement Railprofileleftlateralten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[12]")
	private WebElement Railprofileleftlateralnumberone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[13]")
	private WebElement Railprofileleftlateralnumbertwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[14]")
	private WebElement Railprofileleftlateralnumberthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[15]")
	private WebElement Railprofileleftlateralnumberfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[16]")
	private WebElement Railprofileleftlateralnumberfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[17]")
	private WebElement Railprofileleftlateralnumbersix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[18]")
	private WebElement Railprofileleftlateralnumberseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[19]")
	private WebElement Railprofileleftlateralnumbereight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[20]")
	private WebElement Railprofileleftlateralnumbernine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[21]")
	private WebElement Railprofileleftlateralnumberten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[22]")
	private WebElement Railprofileleftlateralcountone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[23]")
	private WebElement Railprofileleftlateralcounttwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[24]")
	private WebElement Railprofileleftlateralcountthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[25]")
	private WebElement Railprofileleftlateralcountfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[26]")
	private WebElement Railprofileleftlateralcountfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[27]")
	private WebElement Railprofileleftlateralcountsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[28]")
	private WebElement Railprofileleftlateralcountseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[29]")
	private WebElement Railprofileleftlateralcounteight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[30]")
	private WebElement Railprofileleftlateralcountnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[31]")
	private WebElement Railprofileleftlateralcountten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[32]")
	private WebElement Railprofileleftlateralserialone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[33]")
	private WebElement Railprofileleftlateralserialtwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[34]")
	private WebElement Railprofileleftlateralserialthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[35]")
	private WebElement Railprofileleftlateralserialfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[36]")
	private WebElement Railprofileleftlateralserialfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[37]")
	private WebElement Railprofileleftlateralserialsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[38]")
	private WebElement Railprofileleftlateralserialseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[39]")
	private WebElement Railprofileleftlateralserialeight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[40]")
	private WebElement Railprofileleftlateralserialnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[41]")
	private WebElement Railprofileleftlateralserialten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[42]")
	private WebElement Railprofileleftlateralthredone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[43]")
	private WebElement Railprofileleftlateralthredtwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[44]")
	private WebElement Railprofileleftlateralthredthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[45]")
	private WebElement Railprofileleftlateralthredfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[46]")
	private WebElement Railprofileleftlateralthredfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[47]")
	private WebElement Railprofileleftlateralthredsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[48]")
	private WebElement Railprofileleftlateralthredseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[49]")
	private WebElement Railprofileleftlateralthredeight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[50]")
	private WebElement Railprofileleftlateralthrednine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[51]")
	private WebElement Railprofileleftlateralthredten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[52]")
	private WebElement Railprofileleftlateralserialnumberone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[53]")
	private WebElement Railprofileleftlateralserialnumbertwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[54]")
	private WebElement Railprofileleftlateralserialnumberthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[55]")
	private WebElement Railprofileleftlateralserialnumberfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[56]")
	private WebElement Railprofileleftlateralserialnumberfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[57]")
	private WebElement Railprofileleftlateralserialnumbersix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_lateral][]'])[58]")
	private WebElement Railprofileleftlateralserialnumberseven;
	
	//LV
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[2]")
	private WebElement Railprofileleftverticalone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[3]")
	private WebElement Railprofileleftverticaltwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[4]")
	private WebElement Railprofileleftverticalthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[5]")
	private WebElement Railprofileleftverticalfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[6]")
	private WebElement Railprofileleftverticalfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[7]")
	private WebElement Railprofileleftverticalsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[8]")
	private WebElement Railprofileleftverticalseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[9]")
	private WebElement Railprofileleftverticaleight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[10]")
	private WebElement Railprofileleftverticalnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[11]")
	private WebElement Railprofileleftverticalten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[12]")
	private WebElement Railprofileleftverticalnumberone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[13]")
	private WebElement Railprofileleftverticalnumbertwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[14]")
	private WebElement Railprofileleftverticalnumberthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[15]")
	private WebElement Railprofileleftverticalnumberfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[16]")
	private WebElement Railprofileleftverticalnumberfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[17]")
	private WebElement Railprofileleftverticalnumbersix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[18]")
	private WebElement Railprofileleftverticalnumberseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[19]")
	private WebElement Railprofileleftverticalnumbereight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[20]")
	private WebElement Railprofileleftverticalnumbernine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[21]")
	private WebElement Railprofileleftverticalnumberten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[22]")
	private WebElement Railprofileleftverticalcountone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[23]")
	private WebElement Railprofileleftverticalcounttwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[24]")
	private WebElement Railprofileleftverticalcountthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[25]")
	private WebElement Railprofileleftverticalcountfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[26]")
	private WebElement Railprofileleftverticalcountfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[27]")
	private WebElement Railprofileleftverticalcountsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[28]")
	private WebElement Railprofileleftverticalcountseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[29]")
	private WebElement Railprofileleftverticalcounteight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[30]")
	private WebElement Railprofileleftverticalcountnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[31]")
	private WebElement Railprofileleftverticalcountten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[32]")
	private WebElement Railprofileleftverticalserialone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[33]")
	private WebElement Railprofileleftverticalserialtwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[34]")
	private WebElement Railprofileleftverticalserialthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[35]")
	private WebElement Railprofileleftverticalserialfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[36]")
	private WebElement Railprofileleftverticalserialfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[37]")
	private WebElement Railprofileleftverticalserialsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[38]")
	private WebElement Railprofileleftverticalserialseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[39]")
	private WebElement Railprofileleftverticalserialeight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[40]")
	private WebElement Railprofileleftverticalserialnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[41]")
	private WebElement Railprofileleftverticalserialten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[42]")
	private WebElement Railprofileleftverticalthredone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[43]")
	private WebElement Railprofileleftverticalthredtwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[44]")
	private WebElement Railprofileleftverticalthredthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[45]")
	private WebElement Railprofileleftverticalthredfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[46]")
	private WebElement Railprofileleftverticalthredfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[47]")
	private WebElement Railprofileleftverticalthredsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[48]")
	private WebElement Railprofileleftverticalthredseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[49]")
	private WebElement Railprofileleftverticalthredeight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[50]")
	private WebElement Railprofileleftverticalthrednine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[51]")
	private WebElement Railprofileleftverticalthredten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[52]")
	private WebElement Railprofileleftverticalserialnumberone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[53]")
	private WebElement Railprofileleftverticalserialnumbertwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[54]")
	private WebElement Railprofileleftverticalserialnumberthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[55]")
	private WebElement Railprofileleftverticalserialnumberfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[56]")
	private WebElement Railprofileleftverticalserialnumberfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[57]")
	private WebElement Railprofileleftverticalserialnumbersix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][left_vertical][]'])[58]")
	private WebElement Railprofileleftverticalserialnumberseven;
	
	//RL
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[2]")
	private WebElement Railprofilerightlateralone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[3]")
	private WebElement Railprofilerightlateraltwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[4]")
	private WebElement Railprofilerightlateralthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[5]")
	private WebElement Railprofilerightlateralfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[6]")
	private WebElement Railprofilerightlateralfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[7]")
	private WebElement Railprofilerightlateralsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[8]")
	private WebElement Railprofilerightlateralseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[9]")
	private WebElement Railprofilerightlateraleight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[10]")
	private WebElement Railprofilerightlateralnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[11]")
	private WebElement Railprofilerightlateralten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[12]")
	private WebElement Railprofilerightlateralnumberone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[13]")
	private WebElement Railprofilerightlateralnumbertwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[14]")
	private WebElement Railprofilerightlateralnumberthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[15]")
	private WebElement Railprofilerightlateralnumberfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[16]")
	private WebElement Railprofilerightlateralnumberfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[17]")
	private WebElement Railprofilerightlateralnumbersix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[18]")
	private WebElement Railprofilerightlateralnumberseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[19]")
	private WebElement Railprofilerightlateralnumbereight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[20]")
	private WebElement Railprofilerightlateralnumbernine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[21]")
	private WebElement Railprofilerightlateralnumberten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[22]")
	private WebElement Railprofilerightlateralcountone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[23]")
	private WebElement Railprofilerightlateralcounttwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[24]")
	private WebElement Railprofilerightlateralcountthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[25]")
	private WebElement Railprofilerightlateralcountfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[26]")
	private WebElement Railprofilerightlateralcountfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[27]")
	private WebElement Railprofilerightlateralcountsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[28]")
	private WebElement Railprofilerightlateralcountseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[29]")
	private WebElement Railprofilerightlateralcounteight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[30]")
	private WebElement Railprofilerightlateralcountnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[31]")
	private WebElement Railprofilerightlateralcountten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[32]")
	private WebElement Railprofilerightlateralserialone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[33]")
	private WebElement Railprofilerightlateralserialtwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[34]")
	private WebElement Railprofilerightlateralserialthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[35]")
	private WebElement Railprofilerightlateralserialfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[36]")
	private WebElement Railprofilerightlateralserialfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[37]")
	private WebElement Railprofilerightlateralserialsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[38]")
	private WebElement Railprofilerightlateralserialseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[39]")
	private WebElement Railprofilerightlateralserialeight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[40]")
	private WebElement Railprofilerightlateralserialnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[41]")
	private WebElement Railprofilerightlateralserialten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[42]")
	private WebElement Railprofilerightlateralthredone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[43]")
	private WebElement Railprofilerightlateralthredtwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[44]")
	private WebElement Railprofilerightlateralthredthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[45]")
	private WebElement Railprofilerightlateralthredfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[46]")
	private WebElement Railprofilerightlateralthredfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[47]")
	private WebElement Railprofilerightlateralthredsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[48]")
	private WebElement Railprofilerightlateralthredseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[49]")
	private WebElement Railprofilerightlateralthredeight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[50]")
	private WebElement Railprofilerightlateralthrednine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[51]")
	private WebElement Railprofilerightlateralthredten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[52]")
	private WebElement Railprofilerightlateralserialnumberone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[53]")
	private WebElement Railprofilerightlateralserialnumbertwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[54]")
	private WebElement Railprofilerightlateralserialnumberthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[55]")
	private WebElement Railprofilerightlateralserialnumberfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[56]")
	private WebElement Railprofilerightlateralserialnumberfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[57]")
	private WebElement Railprofilerightlateralserialnumbersix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_lateral][]'])[58]")
	private WebElement Railprofilerightlateralserialnumberseven;
	
	//RV
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[2]")
	private WebElement Railprofilerightverticalone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[3]")
	private WebElement Railprofilerightverticaltwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[4]")
	private WebElement Railprofilerightverticalthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[5]")
	private WebElement Railprofilerightverticalfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[6]")
	private WebElement Railprofilerightverticalfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[7]")
	private WebElement Railprofilerightverticalsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[8]")
	private WebElement Railprofilerightverticalseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[9]")
	private WebElement Railprofilerightverticaleight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[10]")
	private WebElement Railprofilerightverticalnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[11]")
	private WebElement Railprofilerightverticalten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[12]")
	private WebElement Railprofilerightverticalnumberone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[13]")
	private WebElement Railprofilerightverticalnumbertwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[14]")
	private WebElement Railprofilerightverticalnumberthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[15]")
	private WebElement Railprofilerightverticalnumberfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[16]")
	private WebElement Railprofilerightverticalnumberfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[17]")
	private WebElement Railprofilerightverticalnumbersix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[18]")
	private WebElement Railprofilerightverticalnumberseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[19]")
	private WebElement Railprofilerightverticalnumbereight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[20]")
	private WebElement Railprofilerightverticalnumbernine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[21]")
	private WebElement Railprofilerightverticalnumberten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[22]")
	private WebElement Railprofilerightverticalcountone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[23]")
	private WebElement Railprofilerightverticalcounttwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[24]")
	private WebElement Railprofilerightverticalcountthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[25]")
	private WebElement Railprofilerightverticalcountfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[26]")
	private WebElement Railprofilerightverticalcountfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[27]")
	private WebElement Railprofilerightverticalcountsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[28]")
	private WebElement Railprofilerightverticalcountseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[29]")
	private WebElement Railprofilerightverticalcounteight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[30]")
	private WebElement Railprofilerightverticalcountnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[31]")
	private WebElement Railprofilerightverticalcountten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[32]")
	private WebElement Railprofilerightverticalserialone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[33]")
	private WebElement Railprofilerightverticalserialtwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[34]")
	private WebElement Railprofilerightverticalserialthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[35]")
	private WebElement Railprofilerightverticalserialfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[36]")
	private WebElement Railprofilerightverticalserialfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[37]")
	private WebElement Railprofilerightverticalserialsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[38]")
	private WebElement Railprofilerightverticalserialseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[39]")
	private WebElement Railprofilerightverticalserialeight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[40]")
	private WebElement Railprofilerightverticalserialnine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[41]")
	private WebElement Railprofilerightverticalserialten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[42]")
	private WebElement Railprofilerightverticalthredone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[43]")
	private WebElement Railprofilerightverticalthredtwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[44]")
	private WebElement Railprofilerightverticalthredthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[45]")
	private WebElement Railprofilerightverticalthredfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[46]")
	private WebElement Railprofilerightverticalthredfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[47]")
	private WebElement Railprofilerightverticalthredsix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[48]")
	private WebElement Railprofilerightverticalthredseven;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[49]")
	private WebElement Railprofilerightverticalthredeight;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[50]")
	private WebElement Railprofilerightverticalthrednine;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[51]")
	private WebElement Railprofilerightverticalthredten;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[52]")
	private WebElement Railprofilerightverticalserialnumberone;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[53]")
	private WebElement Railprofilerightverticalserialnumbertwo;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[54]")
	private WebElement Railprofilerightverticalserialnumberthree;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[55]")
	private WebElement Railprofilerightverticalserialnumberfour;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[56]")
	private WebElement Railprofilerightverticalserialnumberfive;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[57]")
	private WebElement Railprofilerightverticalserialnumbersix;
	@FindBy(xpath = "(//input[@name='profile_data[multiple][right_vertical][]'])[58]")
	private WebElement Railprofilerightverticalserialnumberseven;
	
	//save
	@FindBy(xpath = "(//input[@name='profile_name'])[2]")
	private WebElement Railprofilenamebox;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement Railprofilesavebutton;
	@FindBy(xpath = "//input[@name='profile_data[gauge]']")
	private WebElement Railprofilegaugebox;
	

	
	
	public WebElement getRailprofilegaugebox() {
		return Railprofilegaugebox;
	}

	public WebElement getRailprofilebutton() {
		return Railprofilebutton;
	}

	public WebElement getRailprofileplusbutton() {
		return Railprofileplusbutton;
	}

	public WebElement getRailprofileleftlateralone() {
		return Railprofileleftlateralone;
	}

	public WebElement getRailprofileleftlateraltwo() {
		return Railprofileleftlateraltwo;
	}

	public WebElement getRailprofileleftlateralthree() {
		return Railprofileleftlateralthree;
	}

	public WebElement getRailprofileleftlateralfour() {
		return Railprofileleftlateralfour;
	}

	public WebElement getRailprofileleftlateralfive() {
		return Railprofileleftlateralfive;
	}

	public WebElement getRailprofileleftlateralsix() {
		return Railprofileleftlateralsix;
	}

	public WebElement getRailprofileleftlateralseven() {
		return Railprofileleftlateralseven;
	}

	public WebElement getRailprofileleftlateraleight() {
		return Railprofileleftlateraleight;
	}

	public WebElement getRailprofileleftlateralnine() {
		return Railprofileleftlateralnine;
	}

	public WebElement getRailprofileleftlateralten() {
		return Railprofileleftlateralten;
	}

	public WebElement getRailprofileleftlateralnumberone() {
		return Railprofileleftlateralnumberone;
	}

	public WebElement getRailprofileleftlateralnumbertwo() {
		return Railprofileleftlateralnumbertwo;
	}

	public WebElement getRailprofileleftlateralnumberthree() {
		return Railprofileleftlateralnumberthree;
	}

	public WebElement getRailprofileleftlateralnumberfour() {
		return Railprofileleftlateralnumberfour;
	}

	public WebElement getRailprofileleftlateralnumberfive() {
		return Railprofileleftlateralnumberfive;
	}

	public WebElement getRailprofileleftlateralnumbersix() {
		return Railprofileleftlateralnumbersix;
	}

	public WebElement getRailprofileleftlateralnumberseven() {
		return Railprofileleftlateralnumberseven;
	}

	public WebElement getRailprofileleftlateralnumbereight() {
		return Railprofileleftlateralnumbereight;
	}

	public WebElement getRailprofileleftlateralnumbernine() {
		return Railprofileleftlateralnumbernine;
	}

	public WebElement getRailprofileleftlateralnumberten() {
		return Railprofileleftlateralnumberten;
	}

	public WebElement getRailprofileleftlateralcountone() {
		return Railprofileleftlateralcountone;
	}

	public WebElement getRailprofileleftlateralcounttwo() {
		return Railprofileleftlateralcounttwo;
	}

	public WebElement getRailprofileleftlateralcountthree() {
		return Railprofileleftlateralcountthree;
	}

	public WebElement getRailprofileleftlateralcountfour() {
		return Railprofileleftlateralcountfour;
	}

	public WebElement getRailprofileleftlateralcountfive() {
		return Railprofileleftlateralcountfive;
	}

	public WebElement getRailprofileleftlateralcountsix() {
		return Railprofileleftlateralcountsix;
	}

	public WebElement getRailprofileleftlateralcountseven() {
		return Railprofileleftlateralcountseven;
	}

	public WebElement getRailprofileleftlateralcounteight() {
		return Railprofileleftlateralcounteight;
	}

	public WebElement getRailprofileleftlateralcountnine() {
		return Railprofileleftlateralcountnine;
	}

	public WebElement getRailprofileleftlateralcountten() {
		return Railprofileleftlateralcountten;
	}

	public WebElement getRailprofileleftlateralserialone() {
		return Railprofileleftlateralserialone;
	}

	public WebElement getRailprofileleftlateralserialtwo() {
		return Railprofileleftlateralserialtwo;
	}

	public WebElement getRailprofileleftlateralserialthree() {
		return Railprofileleftlateralserialthree;
	}

	public WebElement getRailprofileleftlateralserialfour() {
		return Railprofileleftlateralserialfour;
	}

	public WebElement getRailprofileleftlateralserialfive() {
		return Railprofileleftlateralserialfive;
	}

	public WebElement getRailprofileleftlateralserialsix() {
		return Railprofileleftlateralserialsix;
	}

	public WebElement getRailprofileleftlateralserialseven() {
		return Railprofileleftlateralserialseven;
	}

	public WebElement getRailprofileleftlateralserialeight() {
		return Railprofileleftlateralserialeight;
	}

	public WebElement getRailprofileleftlateralserialnine() {
		return Railprofileleftlateralserialnine;
	}

	public WebElement getRailprofileleftlateralserialten() {
		return Railprofileleftlateralserialten;
	}

	public WebElement getRailprofileleftlateralthredone() {
		return Railprofileleftlateralthredone;
	}

	public WebElement getRailprofileleftlateralthredtwo() {
		return Railprofileleftlateralthredtwo;
	}

	public WebElement getRailprofileleftlateralthredthree() {
		return Railprofileleftlateralthredthree;
	}

	public WebElement getRailprofileleftlateralthredfour() {
		return Railprofileleftlateralthredfour;
	}

	public WebElement getRailprofileleftlateralthredfive() {
		return Railprofileleftlateralthredfive;
	}

	public WebElement getRailprofileleftlateralthredsix() {
		return Railprofileleftlateralthredsix;
	}

	public WebElement getRailprofileleftlateralthredseven() {
		return Railprofileleftlateralthredseven;
	}

	public WebElement getRailprofileleftlateralthredeight() {
		return Railprofileleftlateralthredeight;
	}

	public WebElement getRailprofileleftlateralthrednine() {
		return Railprofileleftlateralthrednine;
	}

	public WebElement getRailprofileleftlateralthredten() {
		return Railprofileleftlateralthredten;
	}

	public WebElement getRailprofileleftlateralserialnumberone() {
		return Railprofileleftlateralserialnumberone;
	}

	public WebElement getRailprofileleftlateralserialnumbertwo() {
		return Railprofileleftlateralserialnumbertwo;
	}

	public WebElement getRailprofileleftlateralserialnumberthree() {
		return Railprofileleftlateralserialnumberthree;
	}

	public WebElement getRailprofileleftlateralserialnumberfour() {
		return Railprofileleftlateralserialnumberfour;
	}

	public WebElement getRailprofileleftlateralserialnumberfive() {
		return Railprofileleftlateralserialnumberfive;
	}

	public WebElement getRailprofileleftlateralserialnumbersix() {
		return Railprofileleftlateralserialnumbersix;
	}

	public WebElement getRailprofileleftlateralserialnumberseven() {
		return Railprofileleftlateralserialnumberseven;
	}

	public WebElement getRailprofileleftverticalone() {
		return Railprofileleftverticalone;
	}

	public WebElement getRailprofileleftverticaltwo() {
		return Railprofileleftverticaltwo;
	}

	public WebElement getRailprofileleftverticalthree() {
		return Railprofileleftverticalthree;
	}

	public WebElement getRailprofileleftverticalfour() {
		return Railprofileleftverticalfour;
	}

	public WebElement getRailprofileleftverticalfive() {
		return Railprofileleftverticalfive;
	}

	public WebElement getRailprofileleftverticalsix() {
		return Railprofileleftverticalsix;
	}

	public WebElement getRailprofileleftverticalseven() {
		return Railprofileleftverticalseven;
	}

	public WebElement getRailprofileleftverticaleight() {
		return Railprofileleftverticaleight;
	}

	public WebElement getRailprofileleftverticalnine() {
		return Railprofileleftverticalnine;
	}

	public WebElement getRailprofileleftverticalten() {
		return Railprofileleftverticalten;
	}

	public WebElement getRailprofileleftverticalnumberone() {
		return Railprofileleftverticalnumberone;
	}

	public WebElement getRailprofileleftverticalnumbertwo() {
		return Railprofileleftverticalnumbertwo;
	}

	public WebElement getRailprofileleftverticalnumberthree() {
		return Railprofileleftverticalnumberthree;
	}

	public WebElement getRailprofileleftverticalnumberfour() {
		return Railprofileleftverticalnumberfour;
	}

	public WebElement getRailprofileleftverticalnumberfive() {
		return Railprofileleftverticalnumberfive;
	}

	public WebElement getRailprofileleftverticalnumbersix() {
		return Railprofileleftverticalnumbersix;
	}

	public WebElement getRailprofileleftverticalnumberseven() {
		return Railprofileleftverticalnumberseven;
	}

	public WebElement getRailprofileleftverticalnumbereight() {
		return Railprofileleftverticalnumbereight;
	}

	public WebElement getRailprofileleftverticalnumbernine() {
		return Railprofileleftverticalnumbernine;
	}

	public WebElement getRailprofileleftverticalnumberten() {
		return Railprofileleftverticalnumberten;
	}

	public WebElement getRailprofileleftverticalcountone() {
		return Railprofileleftverticalcountone;
	}

	public WebElement getRailprofileleftverticalcounttwo() {
		return Railprofileleftverticalcounttwo;
	}

	public WebElement getRailprofileleftverticalcountthree() {
		return Railprofileleftverticalcountthree;
	}

	public WebElement getRailprofileleftverticalcountfour() {
		return Railprofileleftverticalcountfour;
	}

	public WebElement getRailprofileleftverticalcountfive() {
		return Railprofileleftverticalcountfive;
	}

	public WebElement getRailprofileleftverticalcountsix() {
		return Railprofileleftverticalcountsix;
	}

	public WebElement getRailprofileleftverticalcountseven() {
		return Railprofileleftverticalcountseven;
	}

	public WebElement getRailprofileleftverticalcounteight() {
		return Railprofileleftverticalcounteight;
	}

	public WebElement getRailprofileleftverticalcountnine() {
		return Railprofileleftverticalcountnine;
	}

	public WebElement getRailprofileleftverticalcountten() {
		return Railprofileleftverticalcountten;
	}

	public WebElement getRailprofileleftverticalserialone() {
		return Railprofileleftverticalserialone;
	}

	public WebElement getRailprofileleftverticalserialtwo() {
		return Railprofileleftverticalserialtwo;
	}

	public WebElement getRailprofileleftverticalserialthree() {
		return Railprofileleftverticalserialthree;
	}

	public WebElement getRailprofileleftverticalserialfour() {
		return Railprofileleftverticalserialfour;
	}

	public WebElement getRailprofileleftverticalserialfive() {
		return Railprofileleftverticalserialfive;
	}

	public WebElement getRailprofileleftverticalserialsix() {
		return Railprofileleftverticalserialsix;
	}

	public WebElement getRailprofileleftverticalserialseven() {
		return Railprofileleftverticalserialseven;
	}

	public WebElement getRailprofileleftverticalserialeight() {
		return Railprofileleftverticalserialeight;
	}

	public WebElement getRailprofileleftverticalserialnine() {
		return Railprofileleftverticalserialnine;
	}

	public WebElement getRailprofileleftverticalserialten() {
		return Railprofileleftverticalserialten;
	}

	public WebElement getRailprofileleftverticalthredone() {
		return Railprofileleftverticalthredone;
	}

	public WebElement getRailprofileleftverticalthredtwo() {
		return Railprofileleftverticalthredtwo;
	}

	public WebElement getRailprofileleftverticalthredthree() {
		return Railprofileleftverticalthredthree;
	}

	public WebElement getRailprofileleftverticalthredfour() {
		return Railprofileleftverticalthredfour;
	}

	public WebElement getRailprofileleftverticalthredfive() {
		return Railprofileleftverticalthredfive;
	}

	public WebElement getRailprofileleftverticalthredsix() {
		return Railprofileleftverticalthredsix;
	}

	public WebElement getRailprofileleftverticalthredseven() {
		return Railprofileleftverticalthredseven;
	}

	public WebElement getRailprofileleftverticalthredeight() {
		return Railprofileleftverticalthredeight;
	}

	public WebElement getRailprofileleftverticalthrednine() {
		return Railprofileleftverticalthrednine;
	}

	public WebElement getRailprofileleftverticalthredten() {
		return Railprofileleftverticalthredten;
	}

	public WebElement getRailprofileleftverticalserialnumberone() {
		return Railprofileleftverticalserialnumberone;
	}

	public WebElement getRailprofileleftverticalserialnumbertwo() {
		return Railprofileleftverticalserialnumbertwo;
	}

	public WebElement getRailprofileleftverticalserialnumberthree() {
		return Railprofileleftverticalserialnumberthree;
	}

	public WebElement getRailprofileleftverticalserialnumberfour() {
		return Railprofileleftverticalserialnumberfour;
	}

	public WebElement getRailprofileleftverticalserialnumberfive() {
		return Railprofileleftverticalserialnumberfive;
	}

	public WebElement getRailprofileleftverticalserialnumbersix() {
		return Railprofileleftverticalserialnumbersix;
	}

	public WebElement getRailprofileleftverticalserialnumberseven() {
		return Railprofileleftverticalserialnumberseven;
	}

	public WebElement getRailprofilerightlateralone() {
		return Railprofilerightlateralone;
	}

	public WebElement getRailprofilerightlateraltwo() {
		return Railprofilerightlateraltwo;
	}

	public WebElement getRailprofilerightlateralthree() {
		return Railprofilerightlateralthree;
	}

	public WebElement getRailprofilerightlateralfour() {
		return Railprofilerightlateralfour;
	}

	public WebElement getRailprofilerightlateralfive() {
		return Railprofilerightlateralfive;
	}

	public WebElement getRailprofilerightlateralsix() {
		return Railprofilerightlateralsix;
	}

	public WebElement getRailprofilerightlateralseven() {
		return Railprofilerightlateralseven;
	}

	public WebElement getRailprofilerightlateraleight() {
		return Railprofilerightlateraleight;
	}

	public WebElement getRailprofilerightlateralnine() {
		return Railprofilerightlateralnine;
	}

	public WebElement getRailprofilerightlateralten() {
		return Railprofilerightlateralten;
	}

	public WebElement getRailprofilerightlateralnumberone() {
		return Railprofilerightlateralnumberone;
	}

	public WebElement getRailprofilerightlateralnumbertwo() {
		return Railprofilerightlateralnumbertwo;
	}

	public WebElement getRailprofilerightlateralnumberthree() {
		return Railprofilerightlateralnumberthree;
	}

	public WebElement getRailprofilerightlateralnumberfour() {
		return Railprofilerightlateralnumberfour;
	}

	public WebElement getRailprofilerightlateralnumberfive() {
		return Railprofilerightlateralnumberfive;
	}

	public WebElement getRailprofilerightlateralnumbersix() {
		return Railprofilerightlateralnumbersix;
	}

	public WebElement getRailprofilerightlateralnumberseven() {
		return Railprofilerightlateralnumberseven;
	}

	public WebElement getRailprofilerightlateralnumbereight() {
		return Railprofilerightlateralnumbereight;
	}

	public WebElement getRailprofilerightlateralnumbernine() {
		return Railprofilerightlateralnumbernine;
	}

	public WebElement getRailprofilerightlateralnumberten() {
		return Railprofilerightlateralnumberten;
	}

	public WebElement getRailprofilerightlateralcountone() {
		return Railprofilerightlateralcountone;
	}

	public WebElement getRailprofilerightlateralcounttwo() {
		return Railprofilerightlateralcounttwo;
	}

	public WebElement getRailprofilerightlateralcountthree() {
		return Railprofilerightlateralcountthree;
	}

	public WebElement getRailprofilerightlateralcountfour() {
		return Railprofilerightlateralcountfour;
	}

	public WebElement getRailprofilerightlateralcountfive() {
		return Railprofilerightlateralcountfive;
	}

	public WebElement getRailprofilerightlateralcountsix() {
		return Railprofilerightlateralcountsix;
	}

	public WebElement getRailprofilerightlateralcountseven() {
		return Railprofilerightlateralcountseven;
	}

	public WebElement getRailprofilerightlateralcounteight() {
		return Railprofilerightlateralcounteight;
	}

	public WebElement getRailprofilerightlateralcountnine() {
		return Railprofilerightlateralcountnine;
	}

	public WebElement getRailprofilerightlateralcountten() {
		return Railprofilerightlateralcountten;
	}

	public WebElement getRailprofilerightlateralserialone() {
		return Railprofilerightlateralserialone;
	}

	public WebElement getRailprofilerightlateralserialtwo() {
		return Railprofilerightlateralserialtwo;
	}

	public WebElement getRailprofilerightlateralserialthree() {
		return Railprofilerightlateralserialthree;
	}

	public WebElement getRailprofilerightlateralserialfour() {
		return Railprofilerightlateralserialfour;
	}

	public WebElement getRailprofilerightlateralserialfive() {
		return Railprofilerightlateralserialfive;
	}

	public WebElement getRailprofilerightlateralserialsix() {
		return Railprofilerightlateralserialsix;
	}

	public WebElement getRailprofilerightlateralserialseven() {
		return Railprofilerightlateralserialseven;
	}

	public WebElement getRailprofilerightlateralserialeight() {
		return Railprofilerightlateralserialeight;
	}

	public WebElement getRailprofilerightlateralserialnine() {
		return Railprofilerightlateralserialnine;
	}

	public WebElement getRailprofilerightlateralserialten() {
		return Railprofilerightlateralserialten;
	}

	public WebElement getRailprofilerightlateralthredone() {
		return Railprofilerightlateralthredone;
	}

	public WebElement getRailprofilerightlateralthredtwo() {
		return Railprofilerightlateralthredtwo;
	}

	public WebElement getRailprofilerightlateralthredthree() {
		return Railprofilerightlateralthredthree;
	}

	public WebElement getRailprofilerightlateralthredfour() {
		return Railprofilerightlateralthredfour;
	}

	public WebElement getRailprofilerightlateralthredfive() {
		return Railprofilerightlateralthredfive;
	}

	public WebElement getRailprofilerightlateralthredsix() {
		return Railprofilerightlateralthredsix;
	}

	public WebElement getRailprofilerightlateralthredseven() {
		return Railprofilerightlateralthredseven;
	}

	public WebElement getRailprofilerightlateralthredeight() {
		return Railprofilerightlateralthredeight;
	}

	public WebElement getRailprofilerightlateralthrednine() {
		return Railprofilerightlateralthrednine;
	}

	public WebElement getRailprofilerightlateralthredten() {
		return Railprofilerightlateralthredten;
	}

	public WebElement getRailprofilerightlateralserialnumberone() {
		return Railprofilerightlateralserialnumberone;
	}

	public WebElement getRailprofilerightlateralserialnumbertwo() {
		return Railprofilerightlateralserialnumbertwo;
	}

	public WebElement getRailprofilerightlateralserialnumberthree() {
		return Railprofilerightlateralserialnumberthree;
	}

	public WebElement getRailprofilerightlateralserialnumberfour() {
		return Railprofilerightlateralserialnumberfour;
	}

	public WebElement getRailprofilerightlateralserialnumberfive() {
		return Railprofilerightlateralserialnumberfive;
	}

	public WebElement getRailprofilerightlateralserialnumbersix() {
		return Railprofilerightlateralserialnumbersix;
	}

	public WebElement getRailprofilerightlateralserialnumberseven() {
		return Railprofilerightlateralserialnumberseven;
	}

	public WebElement getRailprofilerightverticalone() {
		return Railprofilerightverticalone;
	}

	public WebElement getRailprofilerightverticaltwo() {
		return Railprofilerightverticaltwo;
	}

	public WebElement getRailprofilerightverticalthree() {
		return Railprofilerightverticalthree;
	}

	public WebElement getRailprofilerightverticalfour() {
		return Railprofilerightverticalfour;
	}

	public WebElement getRailprofilerightverticalfive() {
		return Railprofilerightverticalfive;
	}

	public WebElement getRailprofilerightverticalsix() {
		return Railprofilerightverticalsix;
	}

	public WebElement getRailprofilerightverticalseven() {
		return Railprofilerightverticalseven;
	}

	public WebElement getRailprofilerightverticaleight() {
		return Railprofilerightverticaleight;
	}

	public WebElement getRailprofilerightverticalnine() {
		return Railprofilerightverticalnine;
	}

	public WebElement getRailprofilerightverticalten() {
		return Railprofilerightverticalten;
	}

	public WebElement getRailprofilerightverticalnumberone() {
		return Railprofilerightverticalnumberone;
	}

	public WebElement getRailprofilerightverticalnumbertwo() {
		return Railprofilerightverticalnumbertwo;
	}

	public WebElement getRailprofilerightverticalnumberthree() {
		return Railprofilerightverticalnumberthree;
	}

	public WebElement getRailprofilerightverticalnumberfour() {
		return Railprofilerightverticalnumberfour;
	}

	public WebElement getRailprofilerightverticalnumberfive() {
		return Railprofilerightverticalnumberfive;
	}

	public WebElement getRailprofilerightverticalnumbersix() {
		return Railprofilerightverticalnumbersix;
	}

	public WebElement getRailprofilerightverticalnumberseven() {
		return Railprofilerightverticalnumberseven;
	}

	public WebElement getRailprofilerightverticalnumbereight() {
		return Railprofilerightverticalnumbereight;
	}

	public WebElement getRailprofilerightverticalnumbernine() {
		return Railprofilerightverticalnumbernine;
	}

	public WebElement getRailprofilerightverticalnumberten() {
		return Railprofilerightverticalnumberten;
	}

	public WebElement getRailprofilerightverticalcountone() {
		return Railprofilerightverticalcountone;
	}

	public WebElement getRailprofilerightverticalcounttwo() {
		return Railprofilerightverticalcounttwo;
	}

	public WebElement getRailprofilerightverticalcountthree() {
		return Railprofilerightverticalcountthree;
	}

	public WebElement getRailprofilerightverticalcountfour() {
		return Railprofilerightverticalcountfour;
	}

	public WebElement getRailprofilerightverticalcountfive() {
		return Railprofilerightverticalcountfive;
	}

	public WebElement getRailprofilerightverticalcountsix() {
		return Railprofilerightverticalcountsix;
	}

	public WebElement getRailprofilerightverticalcountseven() {
		return Railprofilerightverticalcountseven;
	}

	public WebElement getRailprofilerightverticalcounteight() {
		return Railprofilerightverticalcounteight;
	}

	public WebElement getRailprofilerightverticalcountnine() {
		return Railprofilerightverticalcountnine;
	}

	public WebElement getRailprofilerightverticalcountten() {
		return Railprofilerightverticalcountten;
	}

	public WebElement getRailprofilerightverticalserialone() {
		return Railprofilerightverticalserialone;
	}

	public WebElement getRailprofilerightverticalserialtwo() {
		return Railprofilerightverticalserialtwo;
	}

	public WebElement getRailprofilerightverticalserialthree() {
		return Railprofilerightverticalserialthree;
	}

	public WebElement getRailprofilerightverticalserialfour() {
		return Railprofilerightverticalserialfour;
	}

	public WebElement getRailprofilerightverticalserialfive() {
		return Railprofilerightverticalserialfive;
	}

	public WebElement getRailprofilerightverticalserialsix() {
		return Railprofilerightverticalserialsix;
	}

	public WebElement getRailprofilerightverticalserialseven() {
		return Railprofilerightverticalserialseven;
	}

	public WebElement getRailprofilerightverticalserialeight() {
		return Railprofilerightverticalserialeight;
	}

	public WebElement getRailprofilerightverticalserialnine() {
		return Railprofilerightverticalserialnine;
	}

	public WebElement getRailprofilerightverticalserialten() {
		return Railprofilerightverticalserialten;
	}

	public WebElement getRailprofilerightverticalthredone() {
		return Railprofilerightverticalthredone;
	}

	public WebElement getRailprofilerightverticalthredtwo() {
		return Railprofilerightverticalthredtwo;
	}

	public WebElement getRailprofilerightverticalthredthree() {
		return Railprofilerightverticalthredthree;
	}

	public WebElement getRailprofilerightverticalthredfour() {
		return Railprofilerightverticalthredfour;
	}

	public WebElement getRailprofilerightverticalthredfive() {
		return Railprofilerightverticalthredfive;
	}

	public WebElement getRailprofilerightverticalthredsix() {
		return Railprofilerightverticalthredsix;
	}

	public WebElement getRailprofilerightverticalthredseven() {
		return Railprofilerightverticalthredseven;
	}

	public WebElement getRailprofilerightverticalthredeight() {
		return Railprofilerightverticalthredeight;
	}

	public WebElement getRailprofilerightverticalthrednine() {
		return Railprofilerightverticalthrednine;
	}

	public WebElement getRailprofilerightverticalthredten() {
		return Railprofilerightverticalthredten;
	}

	public WebElement getRailprofilerightverticalserialnumberone() {
		return Railprofilerightverticalserialnumberone;
	}

	public WebElement getRailprofilerightverticalserialnumbertwo() {
		return Railprofilerightverticalserialnumbertwo;
	}

	public WebElement getRailprofilerightverticalserialnumberthree() {
		return Railprofilerightverticalserialnumberthree;
	}

	public WebElement getRailprofilerightverticalserialnumberfour() {
		return Railprofilerightverticalserialnumberfour;
	}

	public WebElement getRailprofilerightverticalserialnumberfive() {
		return Railprofilerightverticalserialnumberfive;
	}

	public WebElement getRailprofilerightverticalserialnumbersix() {
		return Railprofilerightverticalserialnumbersix;
	}

	public WebElement getRailprofilerightverticalserialnumberseven() {
		return Railprofilerightverticalserialnumberseven;
	}

	public WebElement getRailprofilenamebox() {
		return Railprofilenamebox;
	}

	public WebElement getRailprofilesavebutton() {
		return Railprofilesavebutton;
	}
	
	
	
	//contact the profile locater (10166)
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement Profilecontacts;
	@FindBy(xpath = "//button[text()='Create Contact							']")
	private WebElement Profilecreatecontact;
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement Contactnamebox;
	@FindBy(xpath = "//select[@id='jqTemplateProfile-wheel']")
	private WebElement Wheelprofileselectbox;
	@FindBy(xpath = "//option[text()='Y25bogies wheel profile']")
	private WebElement Selecty25bogieswheelprofile;
	@FindBy(xpath = "//label[text()=' European (70mm)                                    ']")
	private WebElement Selecteuropean70mm;
	@FindBy(xpath = "//a[contains(text(),'Rail Data')]")
	private WebElement Raildatabutton;
	@FindBy(xpath = "//select[@id='jqTemplateProfile-rail']")
	private WebElement Railprofileselectbox;
	@FindBy(xpath = "//option[text()='Rail Profile']")
	private WebElement Selectrailprofile;
	@FindBy(xpath = "//label[text()=' European (14mm below crown)                                    ']")
	private WebElement Selecteuropean14mm;
	@FindBy(xpath = "//a[contains(text(),'Settings')]")
	private WebElement Settingsbutton;
	@FindBy(xpath = "//label[text()=' UK                                    ']")
	private WebElement Selectukoptionsetting;
	@FindBy(xpath = "(//button[text()='Save'])[1]")
	private WebElement Calculatebutton;
	@FindBy(xpath = "(//button[text()='Save'])[4]")
	private WebElement Calculateconformbutton;
	@FindBy(xpath = "//button[contains(text(),'Review Contact')]")
	private WebElement Contactprofilereviewbutton;
	@FindBy(xpath = "//button[contains(text(),'Close')]")
	private WebElement Calculatecancelbutton;
	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
	private WebElement Calculatesecondcancelbutton;
	@FindBy(xpath = "(//button[text()='Save'])[1]")
	private WebElement Contactsavebutton;
	
	

	public WebElement getCalculateconformbutton() {
		return Calculateconformbutton;
	}

	public WebElement getContactprofilereviewbutton() {
		return Contactprofilereviewbutton;
	}

	public WebElement getCalculatesecondcancelbutton() {
		return Calculatesecondcancelbutton;
	}

	public WebElement getCalculatecancelbutton() {
		return Calculatecancelbutton;
	}

	public WebElement getContactsavebutton() {
		return Contactsavebutton;
	}

	public WebElement getProfilecontacts() {
		return Profilecontacts;
	}

	public WebElement getProfilecreatecontact() {
		return Profilecreatecontact;
	}

	public WebElement getContactnamebox() {
		return Contactnamebox;
	}

	public WebElement getWheelprofileselectbox() {
		return Wheelprofileselectbox;
	}

	public WebElement getSelecty25bogieswheelprofile() {
		return Selecty25bogieswheelprofile;
	}

	public WebElement getSelecteuropean70mm() {
		return Selecteuropean70mm;
	}

	public WebElement getRaildatabutton() {
		return Raildatabutton;
	}

	public WebElement getRailprofileselectbox() {
		return Railprofileselectbox;
	}

	public WebElement getSelectrailprofile() {
		return Selectrailprofile;
	}

	public WebElement getSelecteuropean14mm() {
		return Selecteuropean14mm;
	}

	public WebElement getSettingsbutton() {
		return Settingsbutton;
	}

	public WebElement getSelectukoptionsetting() {
		return Selectukoptionsetting;
	}

	public WebElement getCalculatebutton() {
		return Calculatebutton;
	}
	
	
	
	// create tunnel added running train()
	
	@FindBy(xpath = "//span[@title='No Route Profile Selected (Rescue or Simple Gradient)']")
	private WebElement Selecttheroutprofilebox;
	@FindBy(xpath = "//li[text()='Tunnel Added Reverse curve route']")
	private WebElement Tunneladdedreversecurveroute;
	@FindBy(xpath = "//option[text()='DVRS1']")
	private WebElement Tunnelsimulationselectdvrs1;
	

	public WebElement getDigitaltrainfeatureoption() {
		return Digitaltrainfeatureoption;
	}

	public WebElement getTunnelsimulationselectdvrs1() {
		return Tunnelsimulationselectdvrs1;
	}

	public WebElement getSelecttheroutprofilebox() {
		return Selecttheroutprofilebox;
	}

	public WebElement getTunneladdedreversecurveroute() {
		return Tunneladdedreversecurveroute;
	}
	
	
	//create the Train filter option locater(10949)
	
	@FindBy(xpath = "//select[@id=\"filter-trains-select\"]")
	private WebElement Trainbybox;
	@FindBy(xpath = "//option[text()='All']")
	private WebElement Trainselctbyall;
	@FindBy(xpath = "//option[text()='Mainline']")
	private WebElement Trainselectbymainline;
	@FindBy(xpath = "(//option[text()='Freight'])[1]")
	private WebElement Trainselectbyfreight;
	@FindBy(xpath = "//option[text()='Metro']")
	private WebElement Trainselectbymetro;
	@FindBy(xpath = "//input[@id='trains_search']")
	private WebElement Trainsearchoption;
	@FindBy(xpath = "//div[contains(text(),'My train')]")
	private WebElement MyTrain;
	@FindBy(xpath = "//input[@id='date-filter-from-trains-input']")
	private WebElement Trainfromdate;
	@FindBy(xpath = "//input[@id='date-filter-to-trains-input']")
	private WebElement Traintodate;
	@FindBy(xpath = "//select[@id='filter-sort-select']")
	private WebElement Trainsortoption;
	@FindBy(xpath = "//option[text()='Name']")
	private WebElement Trainselectbyname;
	@FindBy(xpath = "//option[text()='Created date']")
	private WebElement Trainselectbycreateddate;
	@FindBy(xpath = "(//div[text()='13'])[1]")
	private WebElement Trainselectdateseven;
	@FindBy(xpath = "(//div[text()='13'])[2]")
	private WebElement Trainselectdatesecodseven;
	@FindBy(xpath = "//button[text()='Clear']")
	private WebElement Traincleardate;
	@FindBy(xpath = "(//button[text()='Clear'])[2]")
	private WebElement Traincleardateto;
	@FindBy(xpath = "//option[text()='Modified date']")
	private WebElement Trainselectbymodifieddate;
	@FindBy(xpath = "//select[@id='filter-sort-direction-select']")
	private WebElement Trainsort2;
	@FindBy(xpath = "//option[text()='Asc']")
	private WebElement Trainselectasc;
	@FindBy(xpath = "//option[text()='Desc']")
	private WebElement Trainselectdesc;

	
	
	public WebElement getTraincleardateto() {
		return Traincleardateto;
	}

	public WebElement getTrainselectdatesecodseven() {
		return Trainselectdatesecodseven;
	}

	public WebElement getMyTrain() {
		return MyTrain;
	}

	public WebElement getTrainselectbyfreight() {
		return Trainselectbyfreight;
	}

	public WebElement getTrainbybox() {
		return Trainbybox;
	}

	public WebElement getTrainselctbyall() {
		return Trainselctbyall;
	}

	public WebElement getTrainselectbymainline() {
		return Trainselectbymainline;
	}

	public WebElement getTrainselectbymetro() {
		return Trainselectbymetro;
	}

	public WebElement getTrainselectdateseven() {
		return Trainselectdateseven;
	}

	public WebElement getTraincleardate() {
		return Traincleardate;
	}

	public WebElement getTrainsearchoption() {
		return Trainsearchoption;
	}

	public WebElement getTrainfromdate() {
		return Trainfromdate;
	}

	public WebElement getTraintodate() {
		return Traintodate;
	}

	public WebElement getTrainsortoption() {
		return Trainsortoption;
	}

	public WebElement getTrainselectbyname() {
		return Trainselectbyname;
	}

	public WebElement getTrainselectbycreateddate() {
		return Trainselectbycreateddate;
	}

	public WebElement getTrainselectbymodifieddate() {
		return Trainselectbymodifieddate;
	}

	public WebElement getTrainsort2() {
		return Trainsort2;
	}

	public WebElement getTrainselectasc() {
		return Trainselectasc;
	}

	public WebElement getTrainselectdesc() {
		return Trainselectdesc;
	}
	
	
	//create vehicle filter option locater(11085)
	
	@FindBy(xpath = "//select[@id='filter-vehicles-select']")
	private WebElement Vehiclebybox;
	@FindBy(xpath = "//option[text()='All']")
	private WebElement Vehicleselectall;
	@FindBy(xpath = "//option[text()='Carriage']")
	private WebElement Vehicleselectcarriage;
	@FindBy(xpath = "//option[text()='DMU Cab']")
	private WebElement Vehicleselectdmucab;
	@FindBy(xpath = "//option[text()='DMU Carriage']")
	private WebElement Vehicleselectdmucarriage;
	@FindBy(xpath = "//option[text()='EMU Cab']")
	private WebElement Vehicleselectemucab;
	@FindBy(xpath = "//option[text()='EMU Carriage']")
	private WebElement Vehicleselectemucarriage;
	@FindBy(xpath = "//input[@id='vehicles_search']")
	private WebElement Vehiclesearchbox;
	@FindBy(xpath = "//input[@id='date-filter-from-vehicles-input']")
	private WebElement Vehicleselectfromdate;
	@FindBy(xpath = "(//div[text()='13'])[1]")
	private WebElement Vehiclefirstdate;
	@FindBy(xpath = "(//div[text()='13'])[2]")
	private WebElement Vehicleseconddate;
	@FindBy(xpath = "//button[text()='Clear']")
	private WebElement Vehiclefirstclear;
	@FindBy(xpath = "(//button[text()='Clear'])[2]")
	private WebElement Vehiclesecondclear;
	@FindBy(xpath ="//input[@id='date-filter-to-vehicles-input']" )
	private WebElement Vehicleselecttodate;
	@FindBy(xpath = "//select[@id=\"filter-sort-select\"]")
	private WebElement Vehiclesort;
	@FindBy(xpath = "//option[text()='Name']")
	private WebElement Vehiclesortbyname;
	@FindBy(xpath = "//option[text()='Created Date']")
	private WebElement Vehiclesortbycreatedate;
	@FindBy(xpath = "//option[text()='Modified Date']")
	private WebElement Vehiclesortbymodifieddate;
	@FindBy(xpath = "//select[@id='filter-sort-direction-select']")
	private WebElement Vehiclesort2;
	@FindBy(xpath = "//option[text()='Asc']")
	private WebElement Vehiclesortasc;
	@FindBy(xpath = "//option[text()='Desc']")
	private WebElement Vehiclesortdesc;
	
	

	public WebElement getVehiclefirstdate() {
		return Vehiclefirstdate;
	}

	public WebElement getVehicleseconddate() {
		return Vehicleseconddate;
	}

	public WebElement getVehiclefirstclear() {
		return Vehiclefirstclear;
	}

	public WebElement getVehiclesecondclear() {
		return Vehiclesecondclear;
	}

	public WebElement getVehiclebybox() {
		return Vehiclebybox;
	}

	public WebElement getVehicleselectall() {
		return Vehicleselectall;
	}

	public WebElement getVehicleselectcarriage() {
		return Vehicleselectcarriage;
	}

	public WebElement getVehicleselectdmucab() {
		return Vehicleselectdmucab;
	}

	public WebElement getVehicleselectdmucarriage() {
		return Vehicleselectdmucarriage;
	}

	public WebElement getVehicleselectemucab() {
		return Vehicleselectemucab;
	}

	public WebElement getVehicleselectemucarriage() {
		return Vehicleselectemucarriage;
	}

	public WebElement getVehiclesearchbox() {
		return Vehiclesearchbox;
	}

	public WebElement getVehicleselectfromdate() {
		return Vehicleselectfromdate;
	}

	public WebElement getVehicleselecttodate() {
		return Vehicleselecttodate;
	}

	public WebElement getVehiclesort() {
		return Vehiclesort;
	}

	public WebElement getVehiclesortbyname() {
		return Vehiclesortbyname;
	}

	public WebElement getVehiclesortbycreatedate() {
		return Vehiclesortbycreatedate;
	}

	public WebElement getVehiclesortbymodifieddate() {
		return Vehiclesortbymodifieddate;
	}

	public WebElement getVehiclesort2() {
		return Vehiclesort2;
	}

	public WebElement getVehiclesortasc() {
		return Vehiclesortasc;
	}

	public WebElement getVehiclesortdesc() {
		return Vehiclesortdesc;
	}
	
	

	
	//create Wheel and rail profile filter option locater(11229)
	
	@FindBy(xpath = "//select[@id='filter-profiles-select']")
	private WebElement Wheelrailprofileselectbox;
	@FindBy(xpath = "//option[text()='All']")
	private WebElement Wheelrailprofileselectall;
	@FindBy(xpath = "//option[text()='Wheel']")
	private WebElement Wheelrailprofileselectwheel;
	@FindBy(xpath = "//option[text()='Rail']")
	private WebElement Wheelrailprofileselectrail;
	@FindBy(xpath = "//input[@id=\"profiles_search\"]")
	private WebElement Wheelrailprofilesearchbox;
	@FindBy(xpath = "//input[@id=\"date-filter-from-profiles-input\"]")
	private WebElement Wheelrailprofiledatefrom;
	@FindBy(xpath = "//input[@id=\"date-filter-to-profiles-input\"]")
	private WebElement Wheelrailprofiledateto;
	@FindBy(xpath = "//select[@id=\"filter-sort-select\"]")
	private WebElement Wheelrailprofilesortbox;
	@FindBy(xpath = "//option[text()='Name']")
	private WebElement Wheelrailprofilesortbyname;
	@FindBy(xpath = "//option[text()='Created date']")
	private WebElement Wheelrailprofilesortbycreatedate;
	@FindBy(xpath = "//option[text()='Modified date']")
	private WebElement Wheelrailprofilesortbymodifieddate;
	@FindBy(xpath = "(//div[text()='13'])[1]")
	private WebElement Wheelrailfirstseven;
	@FindBy(xpath = "(//div[text()='13'])[2]")
	private WebElement Wheelrailsecondseven;
	@FindBy(xpath = "//button[text()='Clear']")
	private WebElement Wheelrailclearone;
	@FindBy(xpath = "(//button[text()='Clear'])[2]")
	private WebElement Wheelrailcleartwo;
	@FindBy(xpath = "//option[text()='Type']")
	private WebElement Wheelrailprofilesortbytype;
	@FindBy(xpath = "//select[@id=\"filter-sort-direction-select\"]")
	private WebElement Wheelrailprofilesort2;
	@FindBy(xpath = "//option[text()='Asc']")
	private WebElement Wheelrailsortbyasc;
	@FindBy(xpath = "//option[text()='Desc']")
	private WebElement Wheelrailsortbydesc;
	
	

	public WebElement getWheelrailfirstseven() {
		return Wheelrailfirstseven;
	}

	public WebElement getWheelrailsecondseven() {
		return Wheelrailsecondseven;
	}

	public WebElement getWheelrailclearone() {
		return Wheelrailclearone;
	}

	public WebElement getWheelrailcleartwo() {
		return Wheelrailcleartwo;
	}

	public WebElement getWheelrailprofileselectbox() {
		return Wheelrailprofileselectbox;
	}

	public WebElement getWheelrailprofileselectall() {
		return Wheelrailprofileselectall;
	}

	public WebElement getWheelrailprofileselectwheel() {
		return Wheelrailprofileselectwheel;
	}

	public WebElement getWheelrailprofileselectrail() {
		return Wheelrailprofileselectrail;
	}

	public WebElement getWheelrailprofilesearchbox() {
		return Wheelrailprofilesearchbox;
	}

	public WebElement getWheelrailprofiledatefrom() {
		return Wheelrailprofiledatefrom;
	}

	public WebElement getWheelrailprofiledateto() {
		return Wheelrailprofiledateto;
	}

	public WebElement getWheelrailprofilesortbox() {
		return Wheelrailprofilesortbox;
	}

	public WebElement getWheelrailprofilesortbyname() {
		return Wheelrailprofilesortbyname;
	}

	public WebElement getWheelrailprofilesortbycreatedate() {
		return Wheelrailprofilesortbycreatedate;
	}

	public WebElement getWheelrailprofilesortbymodifieddate() {
		return Wheelrailprofilesortbymodifieddate;
	}

	public WebElement getWheelrailprofilesortbytype() {
		return Wheelrailprofilesortbytype;
	}

	public WebElement getWheelrailprofilesort2() {
		return Wheelrailprofilesort2;
	}

	public WebElement getWheelrailsortbyasc() {
		return Wheelrailsortbyasc;
	}

	public WebElement getWheelrailsortbydesc() {
		return Wheelrailsortbydesc;
	}
	
	
	
	//create Bogie part filter option locater(11357)
	
	@FindBy(xpath = "//select[@id=\"filter-parts-select\"]")
	private WebElement Bogiespartbybox;
	@FindBy(xpath = "//option[text()='All']")
	private WebElement Bogiespartsortbyall;
	@FindBy(xpath = "//option[text()='Mass']")
	private WebElement Bogiespartsortbymass;
	@FindBy(xpath = "//option[text()='Wheelset']")
	private WebElement Bogiespartsortbywheelset;
	@FindBy(xpath = "//input[@id=\"parts_search\"]")
	private WebElement Bogiespartsearchbox;
	@FindBy(xpath = "//input[@id=\"date-filter-from-parts-input\"]")
	private WebElement Bogiespartdatefrom;
	@FindBy(xpath = "//input[@id=\"date-filter-to-parts-input\"]")
	private WebElement Bogiespartdateto;
	@FindBy(xpath = "//button[text()='Close']")
	private WebElement Bogiespartdateclose;
	@FindBy(xpath = "//button[text()='Clear']")
	private WebElement Bogiespartdateclear;
	@FindBy(xpath = "(//button[text()='Clear'])[2]")
	private WebElement Bogiespartdatecleartwo;
	@FindBy(xpath = "(//div[text()='6'])[1]")
	private WebElement Bogiespartselect6;
	@FindBy(xpath = "(//div[text()='6'])[3]")
	private WebElement Bogiespartselect6two;
	@FindBy(xpath = "//select[@id=\"filter-sort-select\"]")
	private WebElement Bogiespartsortbox;
	@FindBy(xpath = "//option[text()='Name']")
	private WebElement Bogiespartsortbyname;
	@FindBy(xpath = "//option[text()='Created date']")
	private WebElement Bogiespartsortbycreateddate;
	@FindBy(xpath = "//option[text()='Modified date']")
	private WebElement Bogiespartsortbymodifieddate;
	@FindBy(xpath = "//option[text()='Type']")
	private WebElement Bogiespartsortbytype;
	@FindBy(xpath = "//select[@id=\"filter-sort-direction-select\"]")
	private WebElement Bogiespartsort2;
	@FindBy(xpath = "//option[text()='Asc']")
	private WebElement Bogiespartsortbyasc;
	@FindBy(xpath = "//option[text()='Desc']")
	private WebElement Bogiespartsortbydesc;
	
	

	public WebElement getBogiespartdatecleartwo() {
		return Bogiespartdatecleartwo;
	}

	public WebElement getBogiespartselect6two() {
		return Bogiespartselect6two;
	}

	public WebElement getBogiespartbybox() {
		return Bogiespartbybox;
	}

	public WebElement getBogiespartsortbyall() {
		return Bogiespartsortbyall;
	}

	public WebElement getBogiespartsortbymass() {
		return Bogiespartsortbymass;
	}

	public WebElement getBogiespartsortbywheelset() {
		return Bogiespartsortbywheelset;
	}

	public WebElement getBogiespartsearchbox() {
		return Bogiespartsearchbox;
	}

	public WebElement getBogiespartdatefrom() {
		return Bogiespartdatefrom;
	}

	public WebElement getBogiespartdateto() {
		return Bogiespartdateto;
	}

	public WebElement getBogiespartdateclose() {
		return Bogiespartdateclose;
	}

	public WebElement getBogiespartdateclear() {
		return Bogiespartdateclear;
	}

	public WebElement getBogiespartselect6() {
		return Bogiespartselect6;
	}

	public WebElement getBogiespartsortbox() {
		return Bogiespartsortbox;
	}

	public WebElement getBogiespartsortbyname() {
		return Bogiespartsortbyname;
	}

	public WebElement getBogiespartsortbycreateddate() {
		return Bogiespartsortbycreateddate;
	}

	public WebElement getBogiespartsortbymodifieddate() {
		return Bogiespartsortbymodifieddate;
	}

	public WebElement getBogiespartsortbytype() {
		return Bogiespartsortbytype;
	}

	public WebElement getBogiespartsort2() {
		return Bogiespartsort2;
	}

	public WebElement getBogiespartsortbyasc() {
		return Bogiespartsortbyasc;
	}

	public WebElement getBogiespartsortbydesc() {
		return Bogiespartsortbydesc;
	}
	
	
	
	//Bogie assembly filter option locater(11435)
	
	@FindBy(xpath = "//a[text()='Assemblies']")
	private WebElement Bogieassemblyoption;
	@FindBy(xpath = "//input[@id=\"bogies_search\"]")
	private WebElement Bogieassemblysearchbox;
	@FindBy(xpath = "//input[@id=\"date-filter-from-bogies-input\"]")
	private WebElement Bogieassemblydatefrombox;
	@FindBy(xpath = "(//div[text()='13'])[1]")
	private WebElement Bogieassemblyselectdatesix;
	@FindBy(xpath = "(//button[text()='Clear'])[1]")
	private WebElement Bogieassemblycleardateone;
	@FindBy(xpath = "//input[@id=\"date-filter-to-bogies-input\"]")
	private WebElement Bogieassemblydatetobox;
	@FindBy(xpath = "(//div[text()='13'])[2]")
	private WebElement Bogieassemblyselectdatesixsecond;
	@FindBy(xpath = "(//button[text()='Clear'])[2]")
	private WebElement Bogieassemblycleardatesecond;
	@FindBy(xpath = "//select[@id=\"filter-sort-select\"]")
	private WebElement Bogieassemblysortone;
	@FindBy(xpath = "//option[text()='Name']")
	private WebElement Bogieassemblysortname;
	@FindBy(xpath = "//option[text()='Created date']")
	private WebElement Bogieassemblysortcreateddate;
	@FindBy(xpath = "//option[text()='Modified date']")
	private WebElement Bogieassemblysortmodifieddate;
	@FindBy(xpath = "//select[@id=\"filter-sort-direction-select\"]")
	private WebElement Bogieassemblysorttwo;
	@FindBy(xpath = "//option[text()=\"Asc\"]")
	private WebElement Bogieassemblysortasc;
	@FindBy(xpath = "//option[text()=\"Desc\"]")
	private WebElement Bogieassemblysortdesc;

	public WebElement getBogieassemblyoption() {
		return Bogieassemblyoption;
	}

	public WebElement getBogieassemblysearchbox() {
		return Bogieassemblysearchbox;
	}

	public WebElement getBogieassemblydatefrombox() {
		return Bogieassemblydatefrombox;
	}

	public WebElement getBogieassemblyselectdatesix() {
		return Bogieassemblyselectdatesix;
	}

	public WebElement getBogieassemblycleardateone() {
		return Bogieassemblycleardateone;
	}

	public WebElement getBogieassemblydatetobox() {
		return Bogieassemblydatetobox;
	}

	public WebElement getBogieassemblyselectdatesixsecond() {
		return Bogieassemblyselectdatesixsecond;
	}

	public WebElement getBogieassemblycleardatesecond() {
		return Bogieassemblycleardatesecond;
	}

	public WebElement getBogieassemblysortone() {
		return Bogieassemblysortone;
	}

	public WebElement getBogieassemblysortname() {
		return Bogieassemblysortname;
	}

	public WebElement getBogieassemblysortcreateddate() {
		return Bogieassemblysortcreateddate;
	}

	public WebElement getBogieassemblysortmodifieddate() {
		return Bogieassemblysortmodifieddate;
	}

	public WebElement getBogieassemblysorttwo() {
		return Bogieassemblysorttwo;
	}

	public WebElement getBogieassemblysortasc() {
		return Bogieassemblysortasc;
	}

	public WebElement getBogieassemblysortdesc() {
		return Bogieassemblysortdesc;
	}

	
	//Running train simulation select locater()
	
	@FindBy(xpath = "//option[text()='DVRS 1']")
	private WebElement Runningtrainsimulationdvrs1;

	public WebElement getRunningtrainsimulationdvrs1() {
		return Runningtrainsimulationdvrs1;
	}
	
	
	
	//gauges filter option locater(11513)

	@FindBy(xpath = "//label[text()='Gauges by']")
	private WebElement Gaugesbybox;
	@FindBy(xpath = "//option[text()='All']")
	private WebElement Gaugesall;
	@FindBy(xpath = "//option[text()='Vehicle']")
	private WebElement Gaugesvehicle;
	@FindBy(xpath = "//option[text()='Structural']")
	private WebElement Gaugesstractural;
	@FindBy(xpath = "//input[@id=\"gauges_search\"]")
	private WebElement Gaugessearchbox;
	@FindBy(xpath = "//input[@id=\"date-filter-from-gauges-input\"]")
	private WebElement Gaugesdatefrom;
	@FindBy(xpath = "//input[@id=\"date-filter-to-gauges-input\"]")
	private WebElement Gaugesdateto;
	@FindBy(xpath = "(//div[text()='6'])[1]")
	private WebElement Gaugesdate7;
	@FindBy(xpath = "(//div[text()='6'])[3]")
	private WebElement Gaugesdate7two;
	@FindBy(xpath = "(//button[text()='Clear'])[1]")
	private WebElement Gaugesclearone;
	@FindBy(xpath = "(//button[text()='Clear'])[2]")
	private WebElement Gaugescleartwo;
	@FindBy(xpath = "//select[@id=\"filter-sort-select\"]")
	private WebElement Gaugessortone;
	@FindBy(xpath = "//option[text()='Name']")
	private WebElement Gaugessortname;
	@FindBy(xpath = "//option[text()='Created date']")
	private WebElement Gaugessortcreateddate;
	@FindBy(xpath = "//option[text()='Modified date']")
	private WebElement Gaugessortmodifieddate;
	@FindBy(xpath = "//select[@id=\"filter-sort-direction-select\"]")
	private WebElement Gaugessorttwo;
	@FindBy(xpath = "//option[text()='Asc']")
	private WebElement Gaugessortasc;
	@FindBy(xpath = "//option[text()='Desc']")
	private WebElement Gaugessortdesc;
	
	

	public WebElement getGaugesbybox() {
		return Gaugesbybox;
	}

	public WebElement getGaugesall() {
		return Gaugesall;
	}

	public WebElement getGaugesvehicle() {
		return Gaugesvehicle;
	}

	public WebElement getGaugesstractural() {
		return Gaugesstractural;
	}

	public WebElement getGaugessearchbox() {
		return Gaugessearchbox;
	}

	public WebElement getGaugesdatefrom() {
		return Gaugesdatefrom;
	}

	public WebElement getGaugesdateto() {
		return Gaugesdateto;
	}

	public WebElement getGaugesdate7() {
		return Gaugesdate7;
	}

	public WebElement getGaugesdate7two() {
		return Gaugesdate7two;
	}

	public WebElement getGaugesclearone() {
		return Gaugesclearone;
	}

	public WebElement getGaugescleartwo() {
		return Gaugescleartwo;
	}

	public WebElement getGaugessortone() {
		return Gaugessortone;
	}

	public WebElement getGaugessortname() {
		return Gaugessortname;
	}

	public WebElement getGaugessortcreateddate() {
		return Gaugessortcreateddate;
	}

	public WebElement getGaugessortmodifieddate() {
		return Gaugessortmodifieddate;
	}

	public WebElement getGaugessorttwo() {
		return Gaugessorttwo;
	}

	public WebElement getGaugessortasc() {
		return Gaugessortasc;
	}

	public WebElement getGaugessortdesc() {
		return Gaugessortdesc;
	}
	
	
	
	//Check the route profile filter option(11626)
	
	@FindBy(xpath = "//input[@id=\"terrains_search\"]")
	private WebElement Routeprofilesearchbox;
	@FindBy(xpath = "//input[@id=\"date-filter-from-terrains-input\"]")
	private WebElement Routeprofiledatefrom;
	@FindBy(xpath = "(//div[text()='6'])[1]")
	private WebElement Routeprofiledate6;
	@FindBy(xpath = "//input[@id=\"date-filter-to-terrains-input\"]")
	private WebElement Routeprofiledateto;
	@FindBy(xpath = "(//div[text()='6'])[3]")
	private WebElement Routeprofiledate7;
	@FindBy(xpath = "(//button[text()='Clear'])[1]")
	private WebElement Routeprofileclearone;
	@FindBy(xpath = "(//button[text()='Clear'])[2]")
	private WebElement Routeprofilecleartwo;
	@FindBy(xpath = "//select[@id=\"filter-sort-select\"]")
	private WebElement Routeprofilesortone;
	@FindBy(xpath = "//option[text()='Name']")
	private WebElement Routeprofilesortname;
	@FindBy(xpath = "//option[text()='Created date']")
	private WebElement Routeprofilesortcreateddate;
	@FindBy(xpath = "//option[text()='Modified date']")
	private WebElement Routeprofilesortmodifieddate;
	@FindBy(xpath = "//select[@id=\"filter-sort-direction-select\"]")
	private WebElement Routeprofilesorttwo;
	@FindBy(xpath = "//option[text()='Asc']")
	private WebElement Routeprofilesortasc;
	@FindBy(xpath = "//option[text()='Desc']")
	private WebElement Routeprofilesortdesc;

	
	
	public WebElement getRouteprofilesearchbox() {
		return Routeprofilesearchbox;
	}

	public WebElement getRouteprofiledatefrom() {
		return Routeprofiledatefrom;
	}

	public WebElement getRouteprofiledate6() {
		return Routeprofiledate6;
	}

	public WebElement getRouteprofiledateto() {
		return Routeprofiledateto;
	}

	public WebElement getRouteprofiledate7() {
		return Routeprofiledate7;
	}

	public WebElement getRouteprofileclearone() {
		return Routeprofileclearone;
	}

	public WebElement getRouteprofilecleartwo() {
		return Routeprofilecleartwo;
	}

	public WebElement getRouteprofilesortone() {
		return Routeprofilesortone;
	}

	public WebElement getRouteprofilesortname() {
		return Routeprofilesortname;
	}

	public WebElement getRouteprofilesortcreateddate() {
		return Routeprofilesortcreateddate;
	}

	public WebElement getRouteprofilesortmodifieddate() {
		return Routeprofilesortmodifieddate;
	}

	public WebElement getRouteprofilesorttwo() {
		return Routeprofilesorttwo;
	}

	public WebElement getRouteprofilesortasc() {
		return Routeprofilesortasc;
	}

	public WebElement getRouteprofilesortdesc() {
		return Routeprofilesortdesc;
	}
	
	
	
	//check the buffer stop filter option locater(11715)
	
	
	@FindBy(xpath = "//input[@id=\"endstops_search\"]")
	private WebElement Bufferstopsearchbox;
	@FindBy(xpath = "//input[@id=\"date-filter-from-endstops-input\"]")
	private WebElement Bufferstopdatefrom;
	@FindBy(xpath = "(//div[text()='6'])[1]")
	private WebElement Bufferstopdate6;
	@FindBy(xpath = "(//button[text()='Clear'])[1]")
	private WebElement Bufferstopfirstclear;
	@FindBy(xpath = "//input[@id=\"date-filter-to-endstops-input\"]")
	private WebElement Bufferstopdateto;
	@FindBy(xpath = "(//div[text()='6'])[3]")
	private WebElement Bufferstopdate7;
	@FindBy(xpath = "(//button[text()='Clear'])[2]")
	private WebElement Bufferstopsecondclear;
	@FindBy(xpath = "//select[@id=\"filter-sort-select\"]")
	private WebElement Bufferstopsortone;
	@FindBy(xpath = "//option[text()='Name']")
	private WebElement Bufferstopsortname;
	@FindBy(xpath = "//option[text()='Created date']")
	private WebElement Bufferstopsortcreateddate;
	@FindBy(xpath = "//option[text()='Modified date']")
	private WebElement Bufferstopsortmodifieddate;
	@FindBy(xpath = "//select[@id=\"filter-sort-direction-select\"]")
	private WebElement Bufferstopsorttwo;
	@FindBy(xpath = "//option[text()='Asc']")
	private WebElement Bufferstopsortasc;
	@FindBy(xpath = "//option[text()='Desc']")
    private WebElement Bufferstopsortdesc;

	
	public WebElement getBufferstopsearchbox() {
		return Bufferstopsearchbox;
	}

	public WebElement getBufferstopdatefrom() {
		return Bufferstopdatefrom;
	}

	public WebElement getBufferstopdate6() {
		return Bufferstopdate6;
	}

	public WebElement getBufferstopfirstclear() {
		return Bufferstopfirstclear;
	}

	public WebElement getBufferstopdateto() {
		return Bufferstopdateto;
	}

	public WebElement getBufferstopdate7() {
		return Bufferstopdate7;
	}

	public WebElement getBufferstopsecondclear() {
		return Bufferstopsecondclear;
	}

	public WebElement getBufferstopsortone() {
		return Bufferstopsortone;
	}

	public WebElement getBufferstopsortname() {
		return Bufferstopsortname;
	}

	public WebElement getBufferstopsortcreateddate() {
		return Bufferstopsortcreateddate;
	}

	public WebElement getBufferstopsortmodifieddate() {
		return Bufferstopsortmodifieddate;
	}

	public WebElement getBufferstopsorttwo() {
		return Bufferstopsorttwo;
	}

	public WebElement getBufferstopsortasc() {
		return Bufferstopsortasc;
	}

	public WebElement getBufferstopsortdesc() {
		return Bufferstopsortdesc;
	}
	
	//Check the coupling interface filter option locater(11821)
	
	@FindBy(xpath = "//input[@id=\"interfaces_search\"]")
	private WebElement Interfacesearchbox;
	@FindBy(xpath = "//input[@id=\"date-filter-from-interfaces-input\"]")
	private WebElement Interfacedatefrombox;
	@FindBy(xpath = "//input[@id=\"date-filter-to-interfaces-input\"]")
	private WebElement Interfacedateto;
	@FindBy(xpath = "(//div[text()='6'])[1]")
	private WebElement Interfacedate6;
	@FindBy(xpath = "(//button[text()='Clear'])[1]")
	private WebElement Interfaceclearone;
	@FindBy(xpath = "(//div[text()='6'])[3]")
	private WebElement Interfacedate7;
	@FindBy(xpath = "(//button[text()='Clear'])[2]")
	private WebElement Interfacecleartwo;
	@FindBy(xpath = "//select[@id=\"filter-sort-select\"]")
	private WebElement Interfacesortone;
	@FindBy(xpath = "//option[text()='Name']")
	private WebElement Interfacesortname;
	@FindBy(xpath = "//option[text()='Created date']")
	private WebElement Interfacesortcreateddate;
	@FindBy(xpath = "//option[text()='Modified date']")
	private WebElement Interfacesortmodifieddate;
	@FindBy(xpath = "//select[@id=\"filter-sort-direction-select\"]")
	private WebElement Interfacesorttwo;
	@FindBy(xpath = "//option[text()='Asc']")
	private WebElement Interfacesortasc;
	@FindBy(xpath = "//option[text()='Desc']")
	private WebElement Interfacesortdesc;

	
	
	public WebElement getInterfacesearchbox() {
		return Interfacesearchbox;
	}

	public WebElement getInterfacedatefrombox() {
		return Interfacedatefrombox;
	}

	public WebElement getInterfacedateto() {
		return Interfacedateto;
	}

	public WebElement getInterfacedate6() {
		return Interfacedate6;
	}

	public WebElement getInterfaceclearone() {
		return Interfaceclearone;
	}

	public WebElement getInterfacedate7() {
		return Interfacedate7;
	}

	public WebElement getInterfacecleartwo() {
		return Interfacecleartwo;
	}

	public WebElement getInterfacesortone() {
		return Interfacesortone;
	}

	public WebElement getInterfacesortname() {
		return Interfacesortname;
	}

	public WebElement getInterfacesortcreateddate() {
		return Interfacesortcreateddate;
	}

	public WebElement getInterfacesortmodifieddate() {
		return Interfacesortmodifieddate;
	}

	public WebElement getInterfacesorttwo() {
		return Interfacesorttwo;
	}

	public WebElement getInterfacesortasc() {
		return Interfacesortasc;
	}

	public WebElement getInterfacesortdesc() {
		return Interfacesortdesc;
	}

	
	//check the device filter option locater(11926)
	
	@FindBy(xpath = "//select[@id=\"filter-devices-select\"]")
	private WebElement Devicebyoptionbox;
	@FindBy(xpath = "(//option[text()='All'])[1]")
	private WebElement Devicesortall;
	@FindBy(xpath = "//option[text()='Coupler Head']")
	private WebElement Devicesortcouplerhead;
	@FindBy(xpath = "//option[text()='Coupler Bar']")
	private WebElement Devicesortcouplerbar;
	@FindBy(xpath = "//input[@id=\"devices_search\"]")
	private WebElement Devicesearchbox;
	@FindBy(xpath = "//input[@id=\"date-filter-from-devices-input\"]")
	private WebElement Devicedatefrom;
	@FindBy(xpath = "(//div[text()='6'])[1]")
	private WebElement Devicedatesix;
	@FindBy(xpath = "//button[text()='Clear']")
	private WebElement Devicedateclearone;
	@FindBy(xpath = "//input[@id=\"date-filter-to-devices-input\"]")
	private WebElement Devicedateto;
	@FindBy(xpath = "(//div[text()='6'])[3]")
	private WebElement Devicedateseven;
	@FindBy(xpath = "(//button[text()='Clear'])[2]")
	private WebElement Devicedatecleartwo;
	@FindBy(xpath ="//select[@id=\"filter-sort-select\"]")
	private WebElement Devicesortone;
	@FindBy(xpath = "//option[text()='Name']")
	private WebElement Devicesortname;
	@FindBy(xpath = "//option[text()='Created date']")
	private WebElement Devicesortcreateddate;
	@FindBy(xpath = "//option[text()='Modified date']")
	private WebElement Devicesortmodifieddate;
	@FindBy(xpath = "//select[@id=\"filter-sort-direction-select\"]")
	private WebElement Devicesorttwo;
	@FindBy(xpath = "//option[text()='Asc']")
	private WebElement Devicesortasc;
	@FindBy(xpath = "//option[text()='Desc']")
	private WebElement Devicesortdesc;
	
	

	public WebElement getDevicedatecleartwo() {
		return Devicedatecleartwo;
	}

	public WebElement getDevicebyoptionbox() {
		return Devicebyoptionbox;
	}

	public WebElement getDevicesortall() {
		return Devicesortall;
	}

	public WebElement getDevicesortcouplerhead() {
		return Devicesortcouplerhead;
	}

	public WebElement getDevicesortcouplerbar() {
		return Devicesortcouplerbar;
	}

	public WebElement getDevicesearchbox() {
		return Devicesearchbox;
	}

	public WebElement getDevicedatefrom() {
		return Devicedatefrom;
	}

	public WebElement getDevicedatesix() {
		return Devicedatesix;
	}

	public WebElement getDevicedateclearone() {
		return Devicedateclearone;
	}

	public WebElement getDevicedateto() {
		return Devicedateto;
	}

	public WebElement getDevicedateseven() {
		return Devicedateseven;
	}

	public WebElement getDevicesortone() {
		return Devicesortone;
	}

	public WebElement getDevicesortname() {
		return Devicesortname;
	}

	public WebElement getDevicesortcreateddate() {
		return Devicesortcreateddate;
	}

	public WebElement getDevicesortmodifieddate() {
		return Devicesortmodifieddate;
	}

	public WebElement getDevicesorttwo() {
		return Devicesorttwo;
	}

	public WebElement getDevicesortasc() {
		return Devicesortasc;
	}

	public WebElement getDevicesortdesc() {
		return Devicesortdesc;
	}
	
	
	//shear library filter option locater(12054)
	
	@FindBy(xpath = "//select[@id=\"filter-status-select\"]")
	private WebElement Sharedlibrarystatusbox;
	@FindBy(xpath = "//option[text()='All']")
	private WebElement Sharedlibrarysortall;
	@FindBy(xpath = "//option[text()='Published']")
	private WebElement Sharedlibrarysortpublished;
	@FindBy(xpath = "//option[text()='Unpublished']")
	private WebElement Sharedlibrarysortunpublished;
	@FindBy(xpath = "//input[@id=\"corporate_search\"]")
	private WebElement Sharedlibrarysearchbox;
	@FindBy(xpath = "//input[@id=\"date-filter-from-corporate-input\"]")
	private WebElement Sharedlibrarydatefrom;
	@FindBy(xpath = "(//div[text()='6'])[1]")
	private WebElement Sharedlibrarydatesix;
	@FindBy(xpath = "//button[text()='Clear']")
	private WebElement Sharedlibrarycencelone;
	@FindBy(xpath = "//input[@id=\"date-filter-to-corporate-input\"]")
	private WebElement Sharedlibrarydateto;
	@FindBy(xpath = "(//div[text()='6'])[3]")
	private WebElement Sharedlibrarydateseven;
	@FindBy(xpath = "(//button[text()='Clear'])[2]")
	private WebElement Sharedlibrarycanceltwo;
	@FindBy(xpath = "//select[@id=\"filter-sort-select\"]")
	private WebElement Sharedlibrarysortone;
	@FindBy(xpath = "//option[text()='Name']")
	private WebElement Sharedlibrarysortname;
	@FindBy(xpath = "//option[text()='Created Date']")
	private WebElement sharedlibrarysortcreateddate;
	@FindBy(xpath = "//option[text()='Modified Date']")
	private WebElement Sharedlibrarysortmodifieddate;
	@FindBy(xpath = "//select[@id=\"filter-sort-direction-select\"]")
	private WebElement Sharedlibrarysorttwo;
	@FindBy(xpath = "//option[text()='Asc']")
	private WebElement Sharedlibrarysortasc;
	@FindBy(xpath = "//option[text()='Desc']")
	private WebElement Sharedlibrarysortdesc;
	
	

	public WebElement getSharedlibrarystatusbox() {
		return Sharedlibrarystatusbox;
	}

	public WebElement getSharedlibrarysortall() {
		return Sharedlibrarysortall;
	}

	public WebElement getSharedlibrarysortpublished() {
		return Sharedlibrarysortpublished;
	}

	public WebElement getSharedlibrarysortunpublished() {
		return Sharedlibrarysortunpublished;
	}

	public WebElement getSharedlibrarysearchbox() {
		return Sharedlibrarysearchbox;
	}

	public WebElement getSharedlibrarydatefrom() {
		return Sharedlibrarydatefrom;
	}

	public WebElement getSharedlibrarydatesix() {
		return Sharedlibrarydatesix;
	}

	public WebElement getSharedlibrarycencelone() {
		return Sharedlibrarycencelone;
	}

	public WebElement getSharedlibrarydateto() {
		return Sharedlibrarydateto;
	}

	public WebElement getSharedlibrarydateseven() {
		return Sharedlibrarydateseven;
	}

	public WebElement getSharedlibrarycanceltwo() {
		return Sharedlibrarycanceltwo;
	}

	public WebElement getSharedlibrarysortone() {
		return Sharedlibrarysortone;
	}

	public WebElement getSharedlibrarysortname() {
		return Sharedlibrarysortname;
	}

	public WebElement getSharedlibrarysortcreateddate() {
		return sharedlibrarysortcreateddate;
	}

	public WebElement getSharedlibrarysortmodifieddate() {
		return Sharedlibrarysortmodifieddate;
	}

	public WebElement getSharedlibrarysorttwo() {
		return Sharedlibrarysorttwo;
	}

	public WebElement getSharedlibrarysortasc() {
		return Sharedlibrarysortasc;
	}

	public WebElement getSharedlibrarysortdesc() {
		return Sharedlibrarysortdesc;
	}
	
	
	
	//Check the functionality of Admin Area locater(12198)
	
	
	@FindBy(xpath = "(//a[text()='Hemkumar D '])[2]")
	private WebElement Adminusername;
	@FindBy(xpath = "//a[text()='Admin Area											']")
	private WebElement Adminareabutton;
	@FindBy(xpath = "(//a[text()='Users'])[1]")
	private WebElement Adminuseroption;
	@FindBy(xpath = "//a[text()='Companies']")
	private WebElement Admincompanies;
	@FindBy(xpath = "//a[text()='Previous']")
	private WebElement Adminpreviousbutton;
	@FindBy(xpath = "(//a[text()='Invoices'])[1]")
	private WebElement Admininvoices;
	@FindBy(xpath = "(//a[text()='Invoices'])[2]")
	private WebElement Adminsecondinvoices;
	@FindBy(xpath = "//a[text()='Subscriptions']")
	private WebElement Adminsubscriptions;
	@FindBy(xpath = "//a[text()='Files']")
	private WebElement Adminfiles;
	@FindBy(xpath = "//button[text()='Library']")
	private WebElement Adminlibrary;
	@FindBy(xpath = "//button[text()='Superseded']")
	private WebElement Adminsuperseded;
	@FindBy(xpath = "//button[text()='Archived']")
	private WebElement Adminarchived;
	@FindBy(xpath = "//a[text()='Upload File']")
	private WebElement Adminuploadfile;
	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	private WebElement Adminuploadfilecancel;
	@FindBy(xpath = "//a[text()='Config']")
	private WebElement Adminconfig;
	@FindBy(xpath = "//a[text()='Vehicle types']")
	private WebElement Adminvehicletypes;
	@FindBy(xpath = "//a[text()='Device mounting diagrams']")
	private WebElement Admindevicemountingdiagrams;
	@FindBy(xpath = "//a[text()='Anti Climber']")
	private WebElement Adminanticliber;
	@FindBy(xpath = "//a[text()='Side Buffer']")
	private WebElement Adminsidebuffer;
	@FindBy(xpath = "//a[text()='Buffer Casing']")
	private WebElement Adminbuffercasing;
	@FindBy(xpath = "//a[text()='Pivot Assembly']")
	private WebElement Adminpivotassembly;
	@FindBy(xpath = "//a[text()='Currency']")
	private WebElement Admincurrency;
	@FindBy(xpath = "//a[text()='Device configurator']")
	private WebElement Admindeviceconfigurator;
	@FindBy(xpath = "//a[text()='Automatic Coupling Head - Electrical Head']")
	private WebElement Adimnautocouplingelectricalhead;
	@FindBy(xpath = "//a[text()='Automatic Coupling Head - Mechanical Head']")
	private WebElement Adminautocouplingmechanicalhead;
	@FindBy(xpath = "//a[text()='Pivot Assembly - Additional Extras']")
	private WebElement Adminpivotassemblyadditionalextras;
	@FindBy(xpath = "//a[text()='Extras - Muff']")
	private WebElement Adminextrasmuff;
	@FindBy(xpath = "//a[text()='Extras - Final']")
	private WebElement Adminextrasfinal;
	@FindBy(xpath = "//a[text()='Train Builder Templates']")
	private WebElement Admintrainbuildertemplates;
	@FindBy(xpath = "//a[text()='Reports']")
	private WebElement Adminreports;
	@FindBy(xpath = "//label[text()='All Reports']")
	private WebElement Adminallreports;
	@FindBy(xpath = "//select[@id=\"filter-company-select\"]")
	private WebElement Admincompanyfilterbox;
	@FindBy(xpath = "//option[text()='All']")
	private WebElement Adminsortall;
	@FindBy(xpath = "//option[text()='Oleo International Ltd']")
	private WebElement Adminsortoleointernational;
	@FindBy(xpath = "//option[text()='Deleted Company #0']")
	private WebElement Adminsortdeletedcompany;
	@FindBy(xpath = "(//a[text()='Devices'])[2]")
	private WebElement Adminreportdevices;
	@FindBy(xpath = "//label[text()='Devices Created']")
	private WebElement Admindevicescreated;
	@FindBy(xpath = "//label[text()='Devices Sent']")
	private WebElement Admindevicessent;
	@FindBy(xpath = "//label[text()='Digital Twins']")
	private WebElement Admindevicedigitaltwins;
	@FindBy(xpath = "//label[text()='Climbers Attached To Interfaces']")
	private WebElement Admindeviceclimberattachestointerfaces;
	@FindBy(xpath = "//label[text()='Buffers Attached To Interfaces']")  
	private WebElement Admindevicebufferattachedtointerfaces;
	@FindBy(xpath = "//label[text()='Hydraulic Coupler Shanks Attached To Interfaces']")
	private WebElement Admindevicehydroliccouplershanksattachedinterfaces;
	@FindBy(xpath = "//label[text()='Coupler Heads Attached To Interfaces']")
	private WebElement Admindevicecouplerheadsattachedinterfaces;
	@FindBy(xpath = "//label[text()='Gas Hydraulics Attached To Interfaces']")
	private WebElement Admindevicegashydraulicsattachedinterfaces;
	@FindBy(xpath = "//label[text()='Deformation Tubes Attached To Interfaces']")
	private WebElement Admindevicedeformationtubesattachedinterface;
	@FindBy(xpath = "//label[text()='Springs/Rubbers Attached To Interfaces']")
	private WebElement Admindevicesprindsandrubbers;
	@FindBy(xpath = "//label[text()='Shears Attached To Interfaces']")
	private WebElement Admindeviceshearsattachedinterfaces;
	@FindBy(xpath = "//label[text()='Pivot Assemblies Attached To Interfaces']")
	private WebElement Admindevicepivotassembliesattached;
	@FindBy(xpath = "//label[text()='Friction Shoes Attached']")
	private WebElement Admindevicefrictionshoesattached;
	@FindBy(xpath = "//label[text()='Industrial Hydraulics Attached']")
	private WebElement Admindeviceindustrialhydraulicsattached;
	@FindBy(xpath = "//label[text()='Endstop Buffers Attached']")
	private WebElement Admindeviceendstopbuffersattached;
	@FindBy(xpath = "//label[text()='Endstop Buffers/Rubbers Attached']")
	private WebElement Admindeviceendstopbufferrubbersattached;
	@FindBy(xpath = "//label[text()='Draw Gears Attached']")
	private WebElement Admindevicedrawgearattached;
	@FindBy(xpath = "//a[text()='Projects And Simulations']")
	private WebElement Adminreportprojectandsimulations;
	@FindBy(xpath = "//label[text()='Projects Created']")
	private WebElement Adminreportprojectcreated;
	@FindBy(xpath = "//label[text()='Simulations Created']")
	private WebElement Adminreportsimulationscreated;
	@FindBy(xpath = "//label[text()='Simulations Sent']")
	private WebElement Adminreportsimulationsent;
	@FindBy(xpath = "//label[text()='Simulations Ran']")
	private WebElement Adminreportsimulationsrun;
	@FindBy(xpath = "//label[text()='Simulations PDF Generated']")
	private WebElement AdminreportsimulationPDFgenerated;
	@FindBy(xpath = "//label[text()='Simulations Device Drawings']")
	private WebElement Adminreportsimulationsdevicedrawings;
	@FindBy(xpath = "//a[text()='Trains, Vehicles, Buffer Stops and Interfaces']")
	private WebElement Adminreporttrainvehiclesbufferstopinterfaces;
	@FindBy(xpath = "//label[text()='Trains Created']")
	private WebElement Adminreporttrainscreated;
	@FindBy(xpath = "//label[text()='Trains Sent']")
	private WebElement Adminreporttrainsent;
	@FindBy(xpath = "//label[text()='Vehicles Created']")
	private WebElement Adminreportvehiclescreated;
	@FindBy(xpath = "//label[text()='Vehicles Sent']")
	private WebElement Adminreportvehiclessent;
	@FindBy(xpath = "//label[text()='Endstops Created']")
	private WebElement Adminreportendstopscreated;
	@FindBy(xpath = "//label[text()='Endstops Sent']")
	private WebElement Adminreportendstopssent;
	@FindBy(xpath = "//label[text()='Interfaces Created']")
	private WebElement Adminreportinterfacescreated;
	@FindBy(xpath = "//label[text()='Interfaces Sent']")
	private WebElement Adminreportinterfacessent;
	@FindBy(xpath = "(//a[text()='Route Profiles'])[2]")
	private WebElement Adminreportrouteprofiles;
	@FindBy(xpath = "//label[text()='Route Profiles Created']")
	private WebElement Adminreportrouteprofilescreated;
	@FindBy(xpath = "//label[text()='Route Profiles Sent']")
	private WebElement Adminreportrouteprofilessent;
	@FindBy(xpath = "(//a[text()='Gauges'])[2]")
	private WebElement Adminreportgauges;
	@FindBy(xpath = "//label[text()='Gauges Created']")
	private WebElement Adminreportgaugescreated;
	@FindBy(xpath = "//label[text()='Gauges Sent']")
	private WebElement Adminreportgaugessent;

	
	
	
	
	
	
	public WebElement getAdminuploadfilecancel() {
		return Adminuploadfilecancel;
	}

	public WebElement getAdmincompanies() {
		return Admincompanies;
	}

	
	public WebElement getAdmindevicescreated() {
		return Admindevicescreated;
	}

	public WebElement getAdmindevicessent() {
		return Admindevicessent;
	}

	public WebElement getAdmindevicedigitaltwins() {
		return Admindevicedigitaltwins;
	}

	public WebElement getAdmindeviceclimberattachestointerfaces() {
		return Admindeviceclimberattachestointerfaces;
	}

	public WebElement getAdmindevicebufferattachedtointerfaces() {
		return Admindevicebufferattachedtointerfaces;
	}

	public WebElement getAdmindevicehydroliccouplershanksattachedinterfaces() {
		return Admindevicehydroliccouplershanksattachedinterfaces;
	}

	public WebElement getAdmindevicecouplerheadsattachedinterfaces() {
		return Admindevicecouplerheadsattachedinterfaces;
	}

	public WebElement getAdmindevicegashydraulicsattachedinterfaces() {
		return Admindevicegashydraulicsattachedinterfaces;
	}

	public WebElement getAdmindevicedeformationtubesattachedinterface() {
		return Admindevicedeformationtubesattachedinterface;
	}

	public WebElement getAdmindevicesprindsandrubbers() {
		return Admindevicesprindsandrubbers;
	}

	public WebElement getAdmindeviceshearsattachedinterfaces() {
		return Admindeviceshearsattachedinterfaces;
	}

	public WebElement getAdmindevicepivotassembliesattached() {
		return Admindevicepivotassembliesattached;
	}

	public WebElement getAdmindevicefrictionshoesattached() {
		return Admindevicefrictionshoesattached;
	}

	public WebElement getAdmindeviceindustrialhydraulicsattached() {
		return Admindeviceindustrialhydraulicsattached;
	}

	public WebElement getAdmindeviceendstopbuffersattached() {
		return Admindeviceendstopbuffersattached;
	}

	public WebElement getAdmindeviceendstopbufferrubbersattached() {
		return Admindeviceendstopbufferrubbersattached;
	}

	public WebElement getAdmindevicedrawgearattached() {
		return Admindevicedrawgearattached;
	}

	public WebElement getAdminusername() {
		return Adminusername;
	}

	public WebElement getAdminareabutton() {
		return Adminareabutton;
	}

	public WebElement getAdminuseroption() {
		return Adminuseroption;
	}

	public WebElement getAdminpreviousbutton() {
		return Adminpreviousbutton;
	}

	public WebElement getAdmininvoices() {
		return Admininvoices;
	}

	public WebElement getAdminsecondinvoices() {
		return Adminsecondinvoices;
	}

	public WebElement getAdminsubscriptions() {
		return Adminsubscriptions;
	}

	public WebElement getAdminfiles() {
		return Adminfiles;
	}

	public WebElement getAdminlibrary() {
		return Adminlibrary;
	}

	public WebElement getAdminsuperseded() {
		return Adminsuperseded;
	}

	public WebElement getAdminarchived() {
		return Adminarchived;
	}

	public WebElement getAdminuploadfile() {
		return Adminuploadfile;
	}

	public WebElement getAdminconfig() {
		return Adminconfig;
	}

	public WebElement getAdminvehicletypes() {
		return Adminvehicletypes;
	}

	public WebElement getAdmindevicemountingdiagrams() {
		return Admindevicemountingdiagrams;
	}

	public WebElement getAdminanticliber() {
		return Adminanticliber;
	}

	public WebElement getAdminsidebuffer() {
		return Adminsidebuffer;
	}

	public WebElement getAdminbuffercasing() {
		return Adminbuffercasing;
	}

	public WebElement getAdminpivotassembly() {
		return Adminpivotassembly;
	}

	public WebElement getAdmincurrency() {
		return Admincurrency;
	}

	public WebElement getAdmindeviceconfigurator() {
		return Admindeviceconfigurator;
	}

	public WebElement getAdimnautocouplingelectricalhead() {
		return Adimnautocouplingelectricalhead;
	}

	public WebElement getAdminautocouplingmechanicalhead() {
		return Adminautocouplingmechanicalhead;
	}

	public WebElement getAdminpivotassemblyadditionalextras() {
		return Adminpivotassemblyadditionalextras;
	}

	public WebElement getAdminextrasmuff() {
		return Adminextrasmuff;
	}

	public WebElement getAdminextrasfinal() {
		return Adminextrasfinal;
	}

	public WebElement getAdmintrainbuildertemplates() {
		return Admintrainbuildertemplates;
	}

	public WebElement getAdminreports() {
		return Adminreports;
	}

	public WebElement getAdminallreports() {
		return Adminallreports;
	}

	public WebElement getAdmincompanyfilterbox() {
		return Admincompanyfilterbox;
	}

	public WebElement getAdminsortall() {
		return Adminsortall;
	}

	public WebElement getAdminsortoleointernational() {
		return Adminsortoleointernational;
	}

	public WebElement getAdminsortdeletedcompany() {
		return Adminsortdeletedcompany;
	}

	public WebElement getAdminreportdevices() {
		return Adminreportdevices;
	}

	public WebElement getAdminreportprojectandsimulations() {
		return Adminreportprojectandsimulations;
	}

	public WebElement getAdminreportprojectcreated() {
		return Adminreportprojectcreated;
	}

	public WebElement getAdminreportsimulationscreated() {
		return Adminreportsimulationscreated;
	}

	public WebElement getAdminreportsimulationsent() {
		return Adminreportsimulationsent;
	}

	public WebElement getAdminreportsimulationsrun() {
		return Adminreportsimulationsrun;
	}

	public WebElement getAdminreportsimulationPDFgenerated() {
		return AdminreportsimulationPDFgenerated;
	}

	public WebElement getAdminreportsimulationsdevicedrawings() {
		return Adminreportsimulationsdevicedrawings;
	}

	public WebElement getAdminreporttrainvehiclesbufferstopinterfaces() {
		return Adminreporttrainvehiclesbufferstopinterfaces;
	}

	public WebElement getAdminreporttrainscreated() {
		return Adminreporttrainscreated;
	}

	public WebElement getAdminreporttrainsent() {
		return Adminreporttrainsent;
	}

	public WebElement getAdminreportvehiclescreated() {
		return Adminreportvehiclescreated;
	}

	public WebElement getAdminreportvehiclessent() {
		return Adminreportvehiclessent;
	}

	public WebElement getAdminreportendstopscreated() {
		return Adminreportendstopscreated;
	}

	public WebElement getAdminreportendstopssent() {
		return Adminreportendstopssent;
	}

	public WebElement getAdminreportinterfacescreated() {
		return Adminreportinterfacescreated;
	}

	public WebElement getAdminreportinterfacessent() {
		return Adminreportinterfacessent;
	}

	public WebElement getAdminreportrouteprofiles() {
		return Adminreportrouteprofiles;
	}

	public WebElement getAdminreportrouteprofilescreated() {
		return Adminreportrouteprofilescreated;
	}

	public WebElement getAdminreportrouteprofilessent() {
		return Adminreportrouteprofilessent;
	}

	public WebElement getAdminreportgauges() {
		return Adminreportgauges;
	}

	public WebElement getAdminreportgaugescreated() {
		return Adminreportgaugescreated;
	}

	public WebElement getAdminreportgaugessent() {
		return Adminreportgaugessent;
	}
	
	
	
	////////***Air Spring Bogie creation locater***////////
	
	//Add parameter of Air spring Bogie(12613)
	
	@FindBy(xpath = "(//input[@class=\"form-control w-60 jqParameterAutocomplete\"])[1]")
	private WebElement Airspringfirstparameterbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-60 jqParameterAutocomplete\"])[2]")
	private WebElement Airspringsecondparameterbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-60 jqParameterAutocomplete\"])[3]")
	private WebElement Airspringthiredparameterbox;
	@FindBy(xpath = "(//button[text()='Save'])[7]")
	private WebElement Airspringsaveparameter;
	@FindBy(xpath = "//input[@id=\"bogie_name\"]")
	private WebElement Airspringbogienamebox;
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement Airspringbogiecreatebutton;

	
	public WebElement getAirspringbogienamebox() {
		return Airspringbogienamebox;
	}

	public WebElement getAirspringbogiecreatebutton() {
		return Airspringbogiecreatebutton;
	}

	public WebElement getAirspringfirstparameterbox() {
		return Airspringfirstparameterbox;
	}

	public WebElement getAirspringsecondparameterbox() {
		return Airspringsecondparameterbox;
	}

	public WebElement getAirspringthiredparameterbox() {
		return Airspringthiredparameterbox;
	}

	public WebElement getAirspringsaveparameter() {
		return Airspringsaveparameter;
	}
	
	
	
	
	//Create the Air spring Mass(12637)
	
	@FindBy(xpath = "(//a[text()='Add'])[1]")
	private WebElement Airspringadd;
	@FindBy(xpath = "(//span[contains(text(),'Mass')])[1]")
	private WebElement Airspringmass;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[1]")
	private WebElement Airspringmassnamebox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[1]")
	private WebElement Airspringmasspositionzbox;
	@FindBy(xpath = "(//a[contains(text(),'Inertia')])[1]")
	private WebElement Airspringmassinertia;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][mass]\"])[1]")
	private WebElement Airspringmassinertiamass;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][roll_inertia]\"])[1]")
	private WebElement Airspringmassinertiarollinertia;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][pitch_inertia]\"])[1]")
	private WebElement Airspringmassinertiapitchinertia;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][yaw_inertia]\"])[1]")
	private WebElement Airspringmassinertiayawinertia;
	@FindBy(xpath = "(//a[text()='Save To Library and Add'])[1]")
	private WebElement Airspringmasssavebutton;
	@FindBy(xpath = "//button[text()='Click to Refresh 3D View']")
	private WebElement Airspringsrefreshbutton;

	public WebElement getAirspringadd() {
		return Airspringadd;
	}

	public WebElement getAirspringmass() {
		return Airspringmass;
	}

	public WebElement getAirspringmassnamebox() {
		return Airspringmassnamebox;
	}

	public WebElement getAirspringmasspositionzbox() {
		return Airspringmasspositionzbox;
	}

	public WebElement getAirspringmassinertia() {
		return Airspringmassinertia;
	}

	public WebElement getAirspringmassinertiamass() {
		return Airspringmassinertiamass;
	}

	public WebElement getAirspringmassinertiarollinertia() {
		return Airspringmassinertiarollinertia;
	}

	public WebElement getAirspringmassinertiapitchinertia() {
		return Airspringmassinertiapitchinertia;
	}

	public WebElement getAirspringmassinertiayawinertia() {
		return Airspringmassinertiayawinertia;
	}

	public WebElement getAirspringmasssavebutton() {
		return Airspringmasssavebutton;
	}

	public WebElement getAirspringsrefreshbutton() {
		return Airspringsrefreshbutton;
	}
	
	
	
	
	
	//create the Air spring wheel set(12686)
	
	

	@FindBy(xpath = "(//span[contains(text(),'Wheelset')])[1]")
	private WebElement Airspringwheelset;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[2]")
	private WebElement Airspringwheelsetnamebox;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[2]")
	private WebElement Airspringwheelsetposition;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[2]")
	private WebElement Airspringwheelsetxbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[2]")
	private WebElement Airspringwheelsetzbox;
	@FindBy(xpath = "(//a[contains(text(),'Inertia')])[2]")
	private WebElement Airspringwheelsetinertia;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][mass]\"])[2]")
	private WebElement Airspringwheelsetinertiamass;
	@FindBy(xpath = "(//input[@name=\"part_data[inertia][roll_inertia]\"])[2]")
	private WebElement Airspringwheelsetinertiaroll;
	@FindBy(xpath = "//input[@name=\"part_data[inertia][has_axel_pitch_inertia]\"]")
	private WebElement Airspringwheelsetinertiaaxelboxcheckbox;
	@FindBy(xpath = "//input[@name=\"part_data[inertia][axel_pitch_inertia]\"]")
	private WebElement Airspringwheelsetinertiaaxelbox;
    @FindBy(xpath = "(//a[text()='Save To Library and Add'])[2]")
    private WebElement Airsparigwheelsetsavebutton;

    
	public WebElement getAirspringwheelsetposition() {
		return Airspringwheelsetposition;
	}

	public WebElement getAirspringwheelset() {
		return Airspringwheelset;
	}

	public WebElement getAirspringwheelsetnamebox() {
		return Airspringwheelsetnamebox;
	}

	public WebElement getAirspringwheelsetxbox() {
		return Airspringwheelsetxbox;
	}

	public WebElement getAirspringwheelsetzbox() {
		return Airspringwheelsetzbox;
	}

	public WebElement getAirspringwheelsetinertia() {
		return Airspringwheelsetinertia;
	}

	public WebElement getAirspringwheelsetinertiamass() {
		return Airspringwheelsetinertiamass;
	}

	public WebElement getAirspringwheelsetinertiaroll() {
		return Airspringwheelsetinertiaroll;
	}

	public WebElement getAirspringwheelsetinertiaaxelboxcheckbox() {
		return Airspringwheelsetinertiaaxelboxcheckbox;
	}

	public WebElement getAirspringwheelsetinertiaaxelbox() {
		return Airspringwheelsetinertiaaxelbox;
	}

	public WebElement getAirsparigwheelsetsavebutton() {
		return Airsparigwheelsetsavebutton;
	}
    
    
    
	//create the Air spring bush(12755)
	
	@FindBy(xpath = "(//span[contains(text(),'Bush')])[1]")
	private WebElement Airspringbush;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[5]")
	private WebElement Airspringbushnamebox;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[5]")
	private WebElement Airspringbushposition;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[5]")
	private WebElement Airspringbushxbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[5]")
	private WebElement Airspringbushybox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[5]")
	private WebElement Airspringbushzbox;
	@FindBy(xpath = "(//span[text()='Not Connected'])[1]")
	private WebElement Airspringbushmassbox;
	@FindBy(xpath = "//li[text()='Vehicle Body']")
	private WebElement Airspringbushvehiclebody;
	@FindBy(xpath = "(//li[text()='Bogie frame'])[2]")
	private WebElement Airspringbushbogieframe;
	@FindBy(xpath = "(//li[text()='003wheelsetL'])[2]")
	private WebElement Airspringbush003wheelsetl;
	@FindBy(xpath = "(//li[text()='003wheelsetT'])[2]")
    private WebElement Airspringbush003wheelsett;
	@FindBy(xpath = "(//a[contains(text(),'Stiffness')])[3]")
	private WebElement Airspringbushstiffness;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][has_stiffness]\"])[1]")
	private WebElement Airspringbushstiffnesscheckbox;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][x]\"]")
	private WebElement Airspringbushstiffnessxbox;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][y]\"]")
	private WebElement Airspringbushstiffnessybox;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][z]\"]")
	private WebElement Airspringbushstiffnesszbox;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][roll]\"]")
	private WebElement Airspringbushstiffnessroll;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][pitch]\"]")
	private WebElement Airspringbushstiffnesspitch;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][yaw]\"]")
	private WebElement Airspringbushstiffnessyaw;
	@FindBy(xpath = "(//a[contains(text(),'Damping')])[2]")
	private WebElement Airspringbushdamping;
	@FindBy(xpath = "(//input[@name=\"part_data[damping][has_damping]\"])[1]")
	private WebElement Airspringbushdampingcheckbox;
	@FindBy(xpath = "//input[@name=\"part_data[damping][x]\"]")
	private WebElement Airspaingbushdampingxbox;
	@FindBy(xpath = "//input[@name=\"part_data[damping][y]\"]")
	private WebElement Airspringbushdampingybox;
	@FindBy(xpath = "//input[@name=\"part_data[damping][z]\"]")
	private WebElement Airspringbushdampingzbox;
	@FindBy(xpath = "//input[@name=\"part_data[damping][pitch]\"]")
	private WebElement Airspringbushdampingpitchbox;
	@FindBy(xpath = "//a[contains(text(),'Series Stiffness')]")
	private WebElement Airspringbushseriesstiffness;
	@FindBy(xpath = "//input[@name=\"part_data[sstiffness][has_sstiffness]\"]")
	private WebElement Airspringbushseriesstiffnesscheckbox;
	@FindBy(xpath = "//input[@name=\"part_data[sstiffness][x]\"]")
	private WebElement Airspringbushseriesstiffnessxbox;
	@FindBy(xpath = "//input[@name=\"part_data[sstiffness][y]\"]")
	private WebElement Airspringbushseriesstiffnessybox;
	@FindBy(xpath = "//input[@name=\"part_data[sstiffness][z]\"]")
	private WebElement Airspringbushseriesstiffnesszbox;
	@FindBy(xpath = "//input[@name=\"part_data[sstiffness][pitch]\"]")
	private WebElement Airspringbushseriesstiffnesspitchbox;
	@FindBy(xpath = "(//a[contains(text(),'Appearance')])[4]")
	private WebElement Airspringbushappearance;
	@FindBy(xpath = "(//input[@name=\"part_data[appearance][shape]\"])[1]")
	private WebElement Airspringbushappearancebush;
	@FindBy(xpath = "(//input[@name=\"part_data[appearance][size]\"])[1]")
	private WebElement Airspringbushappearancesmall;
	@FindBy(xpath = "(//input[@name=\"part_data[appearance][size]\"])[2]")
	private WebElement Airspringbushappearancestandard;
	@FindBy(xpath = "(//input[@name=\"part_data[appearance][axis]\"])[2]")
	private WebElement Airspringbushappearanceyaxis;
	@FindBy(xpath = "(//input[@name=\"part_data[appearance][axis]\"])[3]")
	private WebElement Airspringbushappearancezaxis;
	@FindBy(xpath = "(//a[text()='Save To Library and Add'])[5]")
	private WebElement Airspringbushsavebutton;

	
	public WebElement getAirspringbushvehiclebody() {
		return Airspringbushvehiclebody;
	}

	public WebElement getAirspringbushposition() {
		return Airspringbushposition;
	}

	public WebElement getAirspringbushbogieframe() {
		return Airspringbushbogieframe;
	}

	public WebElement getAirspringbush003wheelsetl() {
		return Airspringbush003wheelsetl;
	}

	public WebElement getAirspringbush003wheelsett() {
		return Airspringbush003wheelsett;
	}

	public WebElement getAirspringbush() {
		return Airspringbush;
	}

	public WebElement getAirspringbushnamebox() {
		return Airspringbushnamebox;
	}

	public WebElement getAirspringbushxbox() {
		return Airspringbushxbox;
	}

	public WebElement getAirspringbushybox() {
		return Airspringbushybox;
	}

	public WebElement getAirspringbushzbox() {
		return Airspringbushzbox;
	}

	public WebElement getAirspringbushmassbox() {
		return Airspringbushmassbox;
	}

	public WebElement getAirspringbushstiffness() {
		return Airspringbushstiffness;
	}

	public WebElement getAirspringbushstiffnesscheckbox() {
		return Airspringbushstiffnesscheckbox;
	}

	public WebElement getAirspringbushstiffnessxbox() {
		return Airspringbushstiffnessxbox;
	}

	public WebElement getAirspringbushstiffnessybox() {
		return Airspringbushstiffnessybox;
	}

	public WebElement getAirspringbushstiffnesszbox() {
		return Airspringbushstiffnesszbox;
	}

	public WebElement getAirspringbushstiffnessroll() {
		return Airspringbushstiffnessroll;
	}

	public WebElement getAirspringbushstiffnesspitch() {
		return Airspringbushstiffnesspitch;
	}

	public WebElement getAirspringbushstiffnessyaw() {
		return Airspringbushstiffnessyaw;
	}

	public WebElement getAirspringbushdamping() {
		return Airspringbushdamping;
	}

	public WebElement getAirspringbushdampingcheckbox() {
		return Airspringbushdampingcheckbox;
	}

	public WebElement getAirspaingbushdampingxbox() {
		return Airspaingbushdampingxbox;
	}

	public WebElement getAirspringbushdampingybox() {
		return Airspringbushdampingybox;
	}

	public WebElement getAirspringbushdampingzbox() {
		return Airspringbushdampingzbox;
	}

	public WebElement getAirspringbushdampingpitchbox() {
		return Airspringbushdampingpitchbox;
	}

	public WebElement getAirspringbushseriesstiffness() {
		return Airspringbushseriesstiffness;
	}

	public WebElement getAirspringbushseriesstiffnesscheckbox() {
		return Airspringbushseriesstiffnesscheckbox;
	}

	public WebElement getAirspringbushseriesstiffnessxbox() {
		return Airspringbushseriesstiffnessxbox;
	}

	public WebElement getAirspringbushseriesstiffnessybox() {
		return Airspringbushseriesstiffnessybox;
	}

	public WebElement getAirspringbushseriesstiffnesszbox() {
		return Airspringbushseriesstiffnesszbox;
	}

	public WebElement getAirspringbushseriesstiffnesspitchbox() {
		return Airspringbushseriesstiffnesspitchbox;
	}

	public WebElement getAirspringbushappearance() {
		return Airspringbushappearance;
	}

	public WebElement getAirspringbushappearancebush() {
		return Airspringbushappearancebush;
	}

	public WebElement getAirspringbushappearancesmall() {
		return Airspringbushappearancesmall;
	}

	public WebElement getAirspringbushappearancestandard() {
		return Airspringbushappearancestandard;
	}

	public WebElement getAirspringbushappearanceyaxis() {
		return Airspringbushappearanceyaxis;
	}

	public WebElement getAirspringbushappearancezaxis() {
		return Airspringbushappearancezaxis;
	}

	public WebElement getAirspringbushsavebutton() {
		return Airspringbushsavebutton;
	}
	
	
	
	//create the Air spring Bump stop(13059)
	
	@FindBy(xpath = "(//button[@class=\"btn btn-primary btn-block jqPartBtn create-part-btn\"])[5]")
	private WebElement Airspringbumpstop;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[4]")
	private WebElement Airspringbumpstopposition;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[4]")
	private WebElement Airspringbumpstopnamebox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[4]")
	private WebElement Airspringbumpstopxone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[4]")
	private WebElement Airspringbumpstopyone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[4]")
	private WebElement Airspringbumpstopzone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][x]\"])[2]")
	private WebElement Airspringbumpstopxtwo;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][y]\"])[2]")
	private WebElement Airspringbumpstopytwo;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][z]\"])[2]")
	private WebElement Airspringbumpstopztwo;
	@FindBy(xpath = "(//span[text()='Not Connected'])[1]")
	private WebElement Airspringbumpstopmassbox;
	@FindBy(xpath = "//li[text()='Vehicle Body']")
	private WebElement Airspringbumpstopvehiclebody;
	@FindBy(xpath = "(//li[text()='Bogie frame'])[2]")
	private WebElement Airspringbumpstopbogieframe;
    @FindBy(xpath = "(//a[contains(text(),'Stiffness')])[2]")
    private WebElement Airspringbumpstopstiffness;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[3]")
    private WebElement Airspringbumpstopstiffnesspluesone;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[4]")
    private WebElement Airspringbumpstopstiffnesspluestwo;
    @FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[5]")
    private WebElement Airspringbumpstopstiffnesspluesthree;
    @FindBy(xpath = "//input[@name=\"part_data[stiffness][has_offset]\"]")
    private WebElement Airspringbumpstopstiffnessdefineoffsetcheckbox;
    @FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[2]")
    private WebElement Airspringbumpstopstiffnessstrockone;
    @FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[2]")
    private WebElement Airspringbumpstopstiffnessforceone;
    @FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[3]")
    private WebElement Airspringbumpstopstiffnessstrocktwo;
    @FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[3]")
    private WebElement Airspringbumpstopstiffnessforcetwo;
    @FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[4]")
    private WebElement Airspringbumpstopstiffnessstrockthree;
    @FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[4]")
    private WebElement Airspringbumpstopstiffnessforcethree;
    @FindBy(xpath = "(//input[@class=\"jqToggleOffsetType\"])[2]")
    private WebElement Airspringbumpstopstiffnessclearancecheckbox;
    @FindBy(xpath = "//input[@name=\"part_data[stiffness][clearance_offset]\"]")
    private WebElement Airspringbumpstopstiffnessclearancebox;
    @FindBy(xpath = "(//a[text()='Save To Library and Add'])[4]")
    private WebElement Airspringbumpstopsavebutton;
    

    
	public WebElement getAirspringbumpstopposition() {
		return Airspringbumpstopposition;
	}
	public WebElement getAirspringbumpstopbogieframe() {
		return Airspringbumpstopbogieframe;
	}

	public WebElement getAirspringbumpstop() {
		return Airspringbumpstop;
	}

	public WebElement getAirspringbumpstopnamebox() {
		return Airspringbumpstopnamebox;
	}

	public WebElement getAirspringbumpstopxone() {
		return Airspringbumpstopxone;
	}

	public WebElement getAirspringbumpstopyone() {
		return Airspringbumpstopyone;
	}

	public WebElement getAirspringbumpstopzone() {
		return Airspringbumpstopzone;
	}

	public WebElement getAirspringbumpstopxtwo() {
		return Airspringbumpstopxtwo;
	}

	public WebElement getAirspringbumpstopytwo() {
		return Airspringbumpstopytwo;
	}

	public WebElement getAirspringbumpstopztwo() {
		return Airspringbumpstopztwo;
	}

	public WebElement getAirspringbumpstopmassbox() {
		return Airspringbumpstopmassbox;
	}

	public WebElement getAirspringbumpstopvehiclebody() {
		return Airspringbumpstopvehiclebody;
	}

	public WebElement getAirspringbumpstopstiffness() {
		return Airspringbumpstopstiffness;
	}

	public WebElement getAirspringbumpstopstiffnesspluesone() {
		return Airspringbumpstopstiffnesspluesone;
	}

	public WebElement getAirspringbumpstopstiffnesspluestwo() {
		return Airspringbumpstopstiffnesspluestwo;
	}

	public WebElement getAirspringbumpstopstiffnesspluesthree() {
		return Airspringbumpstopstiffnesspluesthree;
	}

	public WebElement getAirspringbumpstopstiffnessdefineoffsetcheckbox() {
		return Airspringbumpstopstiffnessdefineoffsetcheckbox;
	}

	public WebElement getAirspringbumpstopstiffnessstrockone() {
		return Airspringbumpstopstiffnessstrockone;
	}

	public WebElement getAirspringbumpstopstiffnessforceone() {
		return Airspringbumpstopstiffnessforceone;
	}

	public WebElement getAirspringbumpstopstiffnessstrocktwo() {
		return Airspringbumpstopstiffnessstrocktwo;
	}

	public WebElement getAirspringbumpstopstiffnessforcetwo() {
		return Airspringbumpstopstiffnessforcetwo;
	}

	public WebElement getAirspringbumpstopstiffnessstrockthree() {
		return Airspringbumpstopstiffnessstrockthree;
	}

	public WebElement getAirspringbumpstopstiffnessforcethree() {
		return Airspringbumpstopstiffnessforcethree;
	}

	public WebElement getAirspringbumpstopstiffnessclearancecheckbox() {
		return Airspringbumpstopstiffnessclearancecheckbox;
	}

	public WebElement getAirspringbumpstopstiffnessclearancebox() {
		return Airspringbumpstopstiffnessclearancebox;
	}

	public WebElement getAirspringbumpstopsavebutton() {
		return Airspringbumpstopsavebutton;
	}
   
    
    
	
	
	//Create the Air spring Pin link(13252)
	
	
	@FindBy(xpath = "(//span[contains(text(),'Pinlink')])[1]")
	private WebElement Airspringpinlink;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[9]")
	private WebElement Airspringpinlinkposition;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[9]")
	private WebElement Airspringpinlinkpartnamebox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[9]")
	private WebElement Airspringpinlinkxone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[9]")
	private WebElement Airspringpinlinkyone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[9]")
	private WebElement Airspringpinlinkzone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][x]\"])[7]")
	private WebElement Airspringpinlinkxtwo;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][y]\"])[7]")
	private WebElement Airspringpinlinkytwo;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][z]\"])[7]")
	private WebElement Airspringpinlinkztwo;
	@FindBy(xpath = "(//span[text()='Not Connected'])[5]")
	private WebElement Airspringpinlinkmassbox;
	@FindBy(xpath = "//li[text()='Vehicle Body']")
	private WebElement Airspringpinlinkvehiclebody;
	@FindBy(xpath = "(//li[text()='Bogie frame'])[2]")
	private WebElement Airspringpinlinkbogieframe;
	@FindBy(xpath = "(//a[contains(text(),'Stiffness')])[6]")
	private WebElement Airspringpinlinkstiffness;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][has_stiffness]\"])[2]")
	private WebElement Airspringpinlinkstiffnesscheckbox;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[26]")
	private WebElement Airspringpinlinkstiffnesslinearstiffness;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][linear_stiffness]\"])[1]")
	private WebElement Airsptingpinlinkstiffnesslinearstiffnessbox;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[26]")
	private WebElement Airspringpinlinkstiffnessnonlinear;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[5]")
	private WebElement Airspringpinlinkstiffnessnonlinearplusone;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[6]")
	private WebElement Airspringpinlinkstiffnessnonlinearplustwo;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[7]")
	private WebElement Airspringpinlinkstiffnessnonlinearplusthree;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-minus\"])[5]")
	private WebElement Airspringpinlinkstiffnessnonlinearminusone;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-minus\"])[6]")
	private WebElement Airspringpinlinkstiffnessnonlinearminustwo;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-minus\"])[7]")
	private WebElement Airspringpinlinkstiffnessnonlinearminusthree;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[3]")
	private WebElement Airspringpinlinkstiffnessnonlinearstockone;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[4]")
	private WebElement Airspringpinlinkstiffnessnonlinearstocktwo;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[5]")
	private WebElement Airspringpinlinkstiffnessnonlinearstockthree;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[3]")
	private WebElement Airspringpinlinkstiffnessnonlinearforceone;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[4]")
	private WebElement Airspringpinlinkstiffnessnonlinearforcetwo;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[5]")
	private WebElement Airspringpinlinkstiffnessnonlinearforcethree;
	@FindBy(xpath = "(//a[contains(text(),'Damping')])[5]")
	private WebElement Airspringpinlinkdamping;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[27]")
	private WebElement Airspringpinlinkdampinglineardamping;
	@FindBy(xpath = "//input[@class=\"jqHasDamping mr-1\"]")
	private WebElement Airspringpinlinkdampingcheckbox;
	@FindBy(xpath = "(//input[@name=\"part_data[damping][linear_damping]\"])[2]")
	private WebElement Airspringpinlinkdampinglineardampingbox;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[27]")
	private WebElement Airspringpinlinkdampingnonlineardamping;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[8]")
	private WebElement Airspringpinlinkdampingnonlinearpluesone;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[9]")
	private WebElement Airspringpinlinkdampingnonlinearpluestwo;
	@FindBy(xpath = "(//input[@name=\"part_data[damping][multiple][velocity][]\"])[2]")
	private WebElement Airspringpinlinkdampingnonlinearvelocityone;
	@FindBy(xpath = "(//input[@name=\"part_data[damping][multiple][velocity][]\"])[3]")
	private WebElement Airspringpinlinkdampingnonlinearvelocitytwo;
	@FindBy(xpath = "(//input[@name=\"part_data[damping][multiple][velocity][]\"])[4]")
	private WebElement Airspringpinlinkdampingnonlinearvelocitythree;
	@FindBy(xpath = "(//input[@name=\"part_data[damping][multiple][force][]\"])[2]")
	private WebElement Airspringpinlinkdampingnonlinearforceone;
	@FindBy(xpath = "(//input[@name=\"part_data[damping][multiple][force][]\"])[3]")
	private WebElement Airspringpinlinkdampingnonlinearforcetwo;
	@FindBy(xpath = "(//input[@name=\"part_data[damping][multiple][force][]\"])[4]")
	private WebElement Airspringpinlinkdampingnonlinearforcethree;
	@FindBy(xpath = "//a[contains(text(),'Options')]")
	private WebElement Airspringpinlinkoptions;
	@FindBy(xpath = "//input[@name=\"part_data[options][has_series_stiffness]\"]")
	private WebElement Airspringpinlinkoptionscheckbox;
	@FindBy(xpath = "(//input[@name=\"part_data[options][series_stiffness]\"])[1]")
	private WebElement Airspringpinlinkoptionsseriesstiffnessbox;
	@FindBy(xpath = "(//a[text()='Save To Library and Add'])[9]")
	private WebElement Airspringpinlinksavebutton;

	
	public WebElement getAirspringpinlinkstiffnessnonlinearplusthree() {
		return Airspringpinlinkstiffnessnonlinearplusthree;
	}

	public WebElement getAirspringpinlinkstiffnessnonlinearminusone() {
		return Airspringpinlinkstiffnessnonlinearminusone;
	}

	public WebElement getAirspringpinlinkstiffnessnonlinearminustwo() {
		return Airspringpinlinkstiffnessnonlinearminustwo;
	}

	public WebElement getAirspringpinlinkstiffnessnonlinearminusthree() {
		return Airspringpinlinkstiffnessnonlinearminusthree;
	}

	public WebElement getAirspringpinlinkstiffnesslinearstiffness() {
		return Airspringpinlinkstiffnesslinearstiffness;
	}

	public WebElement getAirspringpinlinkdampinglineardamping() {
		return Airspringpinlinkdampinglineardamping;
	}

	public WebElement getAirspringpinlinkstiffness() {
		return Airspringpinlinkstiffness;
	}

	public WebElement getAirspringpinlinkstiffnesscheckbox() {
		return Airspringpinlinkstiffnesscheckbox;
	}

	public WebElement getAirsptingpinlinkstiffnesslinearstiffnessbox() {
		return Airsptingpinlinkstiffnesslinearstiffnessbox;
	}

	public WebElement getAirspringpinlinkstiffnessnonlinear() {
		return Airspringpinlinkstiffnessnonlinear;
	}

	public WebElement getAirspringpinlinkstiffnessnonlinearplusone() {
		return Airspringpinlinkstiffnessnonlinearplusone;
	}

	public WebElement getAirspringpinlinkstiffnessnonlinearplustwo() {
		return Airspringpinlinkstiffnessnonlinearplustwo;
	}

	public WebElement getAirspringpinlinkstiffnessnonlinearstockone() {
		return Airspringpinlinkstiffnessnonlinearstockone;
	}

	public WebElement getAirspringpinlinkstiffnessnonlinearstocktwo() {
		return Airspringpinlinkstiffnessnonlinearstocktwo;
	}

	public WebElement getAirspringpinlinkstiffnessnonlinearstockthree() {
		return Airspringpinlinkstiffnessnonlinearstockthree;
	}

	public WebElement getAirspringpinlinkstiffnessnonlinearforceone() {
		return Airspringpinlinkstiffnessnonlinearforceone;
	}

	public WebElement getAirspringpinlinkstiffnessnonlinearforcetwo() {
		return Airspringpinlinkstiffnessnonlinearforcetwo;
	}

	public WebElement getAirspringpinlinkstiffnessnonlinearforcethree() {
		return Airspringpinlinkstiffnessnonlinearforcethree;
	}

	public WebElement getAirspringpinlinkdampingnonlineardamping() {
		return Airspringpinlinkdampingnonlineardamping;
	}

	public WebElement getAirspringpinlinkdampingnonlinearpluesone() {
		return Airspringpinlinkdampingnonlinearpluesone;
	}

	public WebElement getAirspringpinlinkdampingnonlinearpluestwo() {
		return Airspringpinlinkdampingnonlinearpluestwo;
	}

	public WebElement getAirspringpinlinkdampingnonlinearvelocityone() {
		return Airspringpinlinkdampingnonlinearvelocityone;
	}

	public WebElement getAirspringpinlinkdampingnonlinearvelocitytwo() {
		return Airspringpinlinkdampingnonlinearvelocitytwo;
	}

	public WebElement getAirspringpinlinkdampingnonlinearvelocitythree() {
		return Airspringpinlinkdampingnonlinearvelocitythree;
	}

	public WebElement getAirspringpinlinkdampingnonlinearforceone() {
		return Airspringpinlinkdampingnonlinearforceone;
	}

	public WebElement getAirspringpinlinkdampingnonlinearforcetwo() {
		return Airspringpinlinkdampingnonlinearforcetwo;
	}

	public WebElement getAirspringpinlinkdampingnonlinearforcethree() {
		return Airspringpinlinkdampingnonlinearforcethree;
	}

	public WebElement getAirspringpinlinkposition() {
		return Airspringpinlinkposition;
	}

	public WebElement getAirspringpinlinkbogieframe() {
		return Airspringpinlinkbogieframe;
	}

	public WebElement getAirspringpinlink() {
		return Airspringpinlink;
	}

	public WebElement getAirspringpinlinkpartnamebox() {
		return Airspringpinlinkpartnamebox;
	}

	public WebElement getAirspringpinlinkxone() {
		return Airspringpinlinkxone;
	}

	public WebElement getAirspringpinlinkyone() {
		return Airspringpinlinkyone;
	}

	public WebElement getAirspringpinlinkzone() {
		return Airspringpinlinkzone;
	}

	public WebElement getAirspringpinlinkxtwo() {
		return Airspringpinlinkxtwo;
	}

	public WebElement getAirspringpinlinkytwo() {
		return Airspringpinlinkytwo;
	}

	public WebElement getAirspringpinlinkztwo() {
		return Airspringpinlinkztwo;
	}

	public WebElement getAirspringpinlinkmassbox() {
		return Airspringpinlinkmassbox;
	}

	public WebElement getAirspringpinlinkvehiclebody() {
		return Airspringpinlinkvehiclebody;
	}

	public WebElement getAirspringpinlinkdamping() {
		return Airspringpinlinkdamping;
	}

	public WebElement getAirspringpinlinkdampingcheckbox() {
		return Airspringpinlinkdampingcheckbox;
	}

	public WebElement getAirspringpinlinkdampinglineardampingbox() {
		return Airspringpinlinkdampinglineardampingbox;
	}

	public WebElement getAirspringpinlinkoptions() {
		return Airspringpinlinkoptions;
	}

	public WebElement getAirspringpinlinkoptionscheckbox() {
		return Airspringpinlinkoptionscheckbox;
	}

	public WebElement getAirspringpinlinkoptionsseriesstiffnessbox() {
		return Airspringpinlinkoptionsseriesstiffnessbox;
	}

	public WebElement getAirspringpinlinksavebutton() {
		return Airspringpinlinksavebutton;
	}
	
	
	
	
	//Create the Air spring (13413)
	
	@FindBy(xpath = "(//span[contains(text(),'Air Spring')])[1]")
	private WebElement Airspringbutton;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[3]")
	private WebElement Airspringposition;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[3]")
	private WebElement Airspringnamebox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[3]")
	private WebElement Airspeingxone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[3]")
	private WebElement Airspringyone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[3]")
	private WebElement Airspringzone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][y]\"])[1]")
	private WebElement Airspringytwo;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][z]\"])[1]")
	private WebElement Airspringztwo;
	@FindBy(xpath = "(//span[text()='Not Connected'])[1]")
	private WebElement Airspringmassbox;
	@FindBy(xpath = "//li[text()='Vehicle Body']")
	private WebElement Airspringvehiclebody;
	@FindBy(xpath = "(//li[text()='Bogie frame'])[2]")
	private WebElement Airspringbogieframe;
	@FindBy(xpath = "//a[contains(text(),'Vertical')]")
	private WebElement Airspringvertical;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[23]")
	private WebElement Airspringverticalsample;
	@FindBy(xpath = "//input[@name=\"part_data[vertical][stiffness]\"]")
	private WebElement Airspringverticalsamplelinearstiffness;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[23]")
	private WebElement Airspringverticaldetailed;
	@FindBy(xpath = "(//input[@class=\"jqSquareDamping mr-1\"])[1]")
	private WebElement Airspringverticaldetailedcheckboxone;
	@FindBy(xpath = "(//input[@class=\"jqSquareDamping mr-1\"])[2]")
	private WebElement Airspringverticaldetailedcheckboxtwo;
	@FindBy(xpath = "(//input[@class=\"jqSquareDamping mr-1\"])[3]")
	private WebElement Airspringverticaldetailedcheckboxthree;
	@FindBy(xpath = "(//input[@class=\"jqSquareDamping mr-1\"])[5]")
	private WebElement Airspringverticaldetailedcheckboxfour;
	@FindBy(xpath = "//input[@name=\"part_data[vertical][airspring_stiffness]\"]")
	private WebElement Airspringverticaldetailedairspringstiffness;
	@FindBy(xpath = "//input[@name=\"part_data[vertical][reservoir_stiffness]\"]")
	private WebElement Airspringverticaldetailedreservoirstiffness;
	@FindBy(xpath = "//input[@name=\"part_data[vertical][square_damping]\"]")
	private WebElement Airspringverticaldetailedsquaredamping;
	@FindBy(xpath = "//input[@name=\"part_data[vertical][viscous_damping]\"]")
	private WebElement Airspringverticaldetailedviscousdamping;
	@FindBy(xpath = "//input[@name=\"part_data[vertical][referred_inertia]\"]")
	private WebElement Airspringverticaldetailedreferredinertia;
	@FindBy(xpath = "//input[@name=\"part_data[vertical][auxiliary_stiffness]\"]")
	private WebElement Airspringverticaldetailedauxiliarystiffness;
	@FindBy(xpath = "//a[contains(text(),'Lateral Stiffness/Damping')]")
	private WebElement Airspringlateralstiffness;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[24]")
	private WebElement Airspringlateralstiffnesslinearstiffness;
	@FindBy(xpath = "//input[@name=\"part_data[stiffness][lateral_stiffness]\"]")
	private WebElement Airspringlateralstiffnessbox;
	@FindBy(xpath = "(//input[@class=\"jqLinearDamping mr-1\"])[1]")
	private WebElement Airspringlateralstiffnesslineardampingcheckbox;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][linear_damping]\"])[1]")
	private WebElement Airspringlateralstiffnesslineardampingbox;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[24]")
	private WebElement Airspringlateralstiffnessnonlinearstiffness;
	@FindBy(xpath = "(//button[@class=\"btn btn-block btn-sm btn-success mt-0 jqMultiDataAdd\"])[1]")
	private WebElement Airspringlateralstiffnessnonlinearstiffnessplusone;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[1]")
	private WebElement Airspringlateralstiffnessnonlinearstiffnessstrokeone;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[2]")
	private WebElement Airspringlateralstiffnessnonlinearstiffnessstroketwo;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][stroke][]\"])[3]")
	private WebElement Airspringlateralstiffnessnonlinearstiffnessstrokethree;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[1]")
	private WebElement Airspringlateralstiffnessnonlinearstiffnessforceone;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[2]")
	private WebElement Airspringlateralstiffnessnonlinearstiffnessforcetwo;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][force][]\"])[3]")
	private WebElement Airspringlateralstiffnessnonlinearstiffnessforcethree;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][moment][]\"])[1]")
	private WebElement Airspringlateralstiffnessnonlinearstiffnessmomentone;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][moment][]\"])[2]")
	private WebElement Airspringlateralstiffnessnonlinearstiffnessmomenttwo;
	@FindBy(xpath = "(//input[@name=\"part_data[stiffness][multiple][moment][]\"])[3]")
	private WebElement Airspringlateralstiffnessnonlinearstiffnessmomentthree;
	@FindBy(xpath = "//a[contains(text(),'Lateral Hysteresis')]")
	private WebElement Airspringlateralhysteresis;
	@FindBy(xpath = "(//input[@class=\"jqEquivalentStiffness mr-1\"])[2]")
	private WebElement Airspringlateralhysteresischeckboxone;
	@FindBy(xpath = "(//input[@class=\"jqEquivalentStiffness mr-1\"])[3]")
	private WebElement Airspringlateralhysteresischeckboxtwo;
	@FindBy(xpath = "(//input[@class=\"jqEquivalentStiffness mr-1\"])[4]")
	private WebElement Airspringlateralhysteresischeckboxthree;
	@FindBy(xpath = "(//input[@class=\"jqEquivalentStiffness mr-1\"])[5]")
	private WebElement Airspringlateralhysteresischeckboxfour;
	@FindBy(xpath = "(//input[@name=\"part_data[hysteresis][hysteresis_force]\"])[1]")
	private WebElement Airspringlateralhysteresisforcebox;
	@FindBy(xpath = "(//input[@name=\"part_data[hysteresis][hysteresis_exponent]\"])[1]")
	private WebElement Airspringlateralhysteresisexponent;
	@FindBy(xpath = "(//input[@name=\"part_data[hysteresis][equivalent_stiffness]\"])[1]")
	private WebElement Airspringlateralhysteresisequivalentstiffness;
	@FindBy(xpath = "(//input[@name=\"part_data[hysteresis][equivalent_damping]\"])[1]")
	private WebElement Airspringlateralhysteresisequivalentdamping;
	@FindBy(xpath = "(//input[@name=\"part_data[hysteresis][equivalent_series_stiffness]\"])[1]")
	private WebElement Airspringlateralhysteresisequivalentseriesstiffness;
	@FindBy(xpath = "(//a[text()='Save To Library and Add'])[3]")
	private WebElement  Airspringsavebutton;

	
	
	
	public WebElement getAirspeingxone() {
		return Airspeingxone;
	}

	public WebElement getAirspringlateralstiffnesslinearstiffness() {
		return Airspringlateralstiffnesslinearstiffness;
	}

	public WebElement getAirspringverticalsample() {
		return Airspringverticalsample;
	}

	public WebElement getAirspringlateralstiffnessnonlinearstiffness() {
		return Airspringlateralstiffnessnonlinearstiffness;
	}

	public WebElement getAirspringlateralstiffnessnonlinearstiffnessplusone() {
		return Airspringlateralstiffnessnonlinearstiffnessplusone;
	}

	public WebElement getAirspringlateralstiffnessnonlinearstiffnessstrokeone() {
		return Airspringlateralstiffnessnonlinearstiffnessstrokeone;
	}

	public WebElement getAirspringlateralstiffnessnonlinearstiffnessstroketwo() {
		return Airspringlateralstiffnessnonlinearstiffnessstroketwo;
	}

	public WebElement getAirspringlateralstiffnessnonlinearstiffnessstrokethree() {
		return Airspringlateralstiffnessnonlinearstiffnessstrokethree;
	}

	public WebElement getAirspringlateralstiffnessnonlinearstiffnessforceone() {
		return Airspringlateralstiffnessnonlinearstiffnessforceone;
	}

	public WebElement getAirspringlateralstiffnessnonlinearstiffnessforcetwo() {
		return Airspringlateralstiffnessnonlinearstiffnessforcetwo;
	}

	public WebElement getAirspringlateralstiffnessnonlinearstiffnessforcethree() {
		return Airspringlateralstiffnessnonlinearstiffnessforcethree;
	}

	public WebElement getAirspringlateralstiffnessnonlinearstiffnessmomentone() {
		return Airspringlateralstiffnessnonlinearstiffnessmomentone;
	}

	public WebElement getAirspringlateralstiffnessnonlinearstiffnessmomenttwo() {
		return Airspringlateralstiffnessnonlinearstiffnessmomenttwo;
	}

	public WebElement getAirspringlateralstiffnessnonlinearstiffnessmomentthree() {
		return Airspringlateralstiffnessnonlinearstiffnessmomentthree;
	}

	public WebElement getAirspringverticalsamplelinearstiffness() {
		return Airspringverticalsamplelinearstiffness;
	}

	public WebElement getAirspringposition() {
		return Airspringposition;
	}

	public WebElement getAirspringbogieframe() {
		return Airspringbogieframe;
	}

	public WebElement getAirspringbutton() {
		return Airspringbutton;
	}

	public WebElement getAirspringnamebox() {
		return Airspringnamebox;
	}

	public WebElement getAirspringyone() {
		return Airspringyone;
	}

	public WebElement getAirspringzone() {
		return Airspringzone;
	}

	public WebElement getAirspringytwo() {
		return Airspringytwo;
	}

	public WebElement getAirspringztwo() {
		return Airspringztwo;
	}

	public WebElement getAirspringmassbox() {
		return Airspringmassbox;
	}

	public WebElement getAirspringvehiclebody() {
		return Airspringvehiclebody;
	}

	public WebElement getAirspringvertical() {
		return Airspringvertical;
	}

	public WebElement getAirspringverticaldetailed() {
		return Airspringverticaldetailed;
	}

	public WebElement getAirspringverticaldetailedcheckboxone() {
		return Airspringverticaldetailedcheckboxone;
	}

	public WebElement getAirspringverticaldetailedcheckboxtwo() {
		return Airspringverticaldetailedcheckboxtwo;
	}

	public WebElement getAirspringverticaldetailedcheckboxthree() {
		return Airspringverticaldetailedcheckboxthree;
	}

	public WebElement getAirspringverticaldetailedcheckboxfour() {
		return Airspringverticaldetailedcheckboxfour;
	}

	public WebElement getAirspringverticaldetailedairspringstiffness() {
		return Airspringverticaldetailedairspringstiffness;
	}

	public WebElement getAirspringverticaldetailedreservoirstiffness() {
		return Airspringverticaldetailedreservoirstiffness;
	}

	public WebElement getAirspringverticaldetailedsquaredamping() {
		return Airspringverticaldetailedsquaredamping;
	}

	public WebElement getAirspringverticaldetailedviscousdamping() {
		return Airspringverticaldetailedviscousdamping;
	}

	public WebElement getAirspringverticaldetailedreferredinertia() {
		return Airspringverticaldetailedreferredinertia;
	}

	public WebElement getAirspringverticaldetailedauxiliarystiffness() {
		return Airspringverticaldetailedauxiliarystiffness;
	}

	public WebElement getAirspringlateralstiffness() {
		return Airspringlateralstiffness;
	}

	public WebElement getAirspringlateralstiffnessbox() {
		return Airspringlateralstiffnessbox;
	}

	public WebElement getAirspringlateralstiffnesslineardampingcheckbox() {
		return Airspringlateralstiffnesslineardampingcheckbox;
	}

	public WebElement getAirspringlateralstiffnesslineardampingbox() {
		return Airspringlateralstiffnesslineardampingbox;
	}

	public WebElement getAirspringlateralhysteresis() {
		return Airspringlateralhysteresis;
	}

	public WebElement getAirspringlateralhysteresischeckboxone() {
		return Airspringlateralhysteresischeckboxone;
	}

	public WebElement getAirspringlateralhysteresischeckboxtwo() {
		return Airspringlateralhysteresischeckboxtwo;
	}

	public WebElement getAirspringlateralhysteresischeckboxthree() {
		return Airspringlateralhysteresischeckboxthree;
	}

	public WebElement getAirspringlateralhysteresischeckboxfour() {
		return Airspringlateralhysteresischeckboxfour;
	}

	public WebElement getAirspringlateralhysteresisforcebox() {
		return Airspringlateralhysteresisforcebox;
	}

	public WebElement getAirspringlateralhysteresisexponent() {
		return Airspringlateralhysteresisexponent;
	}

	public WebElement getAirspringlateralhysteresisequivalentstiffness() {
		return Airspringlateralhysteresisequivalentstiffness;
	}

	public WebElement getAirspringlateralhysteresisequivalentdamping() {
		return Airspringlateralhysteresisequivalentdamping;
	}

	public WebElement getAirspringlateralhysteresisequivalentseriesstiffness() {
		return Airspringlateralhysteresisequivalentseriesstiffness;
	}

	public WebElement getAirspringsavebutton() {
		return Airspringsavebutton;
	}

	
	
	
	
	//create the Air spring Damper (13604)
	
	@FindBy(xpath = "(//span[contains(text(),'Damper')])[1]")
	private WebElement Airspringdamper;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[7]")
	private WebElement Airspringdamperposition;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[7]")
	private WebElement Airspringdampernamebox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[7]")
	private WebElement Airspringdamperxone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[7]")
	private WebElement Airspringdamperyone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[7]")
	private WebElement Airspringdamperzone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][x]\"])[5]")
	private WebElement Airsoringdamperxtwo;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][y]\"])[5]")
	private WebElement Airsoringdamperytwo;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][z]\"])[5]")
	private WebElement Airsoringdamperztwo;
	@FindBy(xpath = "(//span[text()='Not Connected'])[7]")
	private WebElement Airspringdampermassbox;
	@FindBy(xpath = "//li[text()='Vehicle Body']")
	private WebElement Airspringdampervehiclebody;
	@FindBy(xpath = "(//li[text()='Bogie frame'])[2]")
	private WebElement Airspringdamperbogieframe;
	@FindBy(xpath = "(//li[text()='003wheelsetT'])[2]")
	private WebElement Airspringdamperwheelsett;
	@FindBy(xpath = "(//li[text()='003wheelsetL'])[2]")
	private WebElement Airspringdamperwheelsetl;
	@FindBy(xpath = "(//a[contains(text(),'Damping')])[3]")
	private WebElement Airdpringdamperdamping;
	@FindBy(xpath = "//input[@name=\"part_data[damping][has_sstiffness]\"]")
	private WebElement Airspringdamperdampingsttiffnesscheckbox;
	@FindBy(xpath = "(//input[@name=\"part_data[damping][damping_type]\"])[1]")
	private WebElement Airspringdamperdampinglineardampingcheckbox;
	@FindBy(xpath = "(//input[@name=\"part_data[damping][sstiffness]\"])[1]")
	private WebElement Airsptingdamperdampingstiffnessbox;
	@FindBy(xpath = "(//input[@name=\"part_data[damping][linear_damping]\"])[1]")
	private WebElement Airspringdamperdampinglineardampingbox;
	@FindBy(xpath = "(//a[text()='Save To Library and Add'])[7]")
	private WebElement Airspringdampersavebutton;

	
	public WebElement getAirspringdamperposition() {
		return Airspringdamperposition;
	}

	public WebElement getAirspringdamperwheelsett() {
		return Airspringdamperwheelsett;
	}

	public WebElement getAirspringdamperwheelsetl() {
		return Airspringdamperwheelsetl;
	}

	public WebElement getAirspringdamperbogieframe() {
		return Airspringdamperbogieframe;
	}

	public WebElement getAirspringdamper() {
		return Airspringdamper;
	}

	public WebElement getAirspringdampernamebox() {
		return Airspringdampernamebox;
	}

	public WebElement getAirspringdamperxone() {
		return Airspringdamperxone;
	}

	public WebElement getAirspringdamperyone() {
		return Airspringdamperyone;
	}

	public WebElement getAirspringdamperzone() {
		return Airspringdamperzone;
	}

	public WebElement getAirsoringdamperxtwo() {
		return Airsoringdamperxtwo;
	}

	public WebElement getAirsoringdamperytwo() {
		return Airsoringdamperytwo;
	}

	public WebElement getAirsoringdamperztwo() {
		return Airsoringdamperztwo;
	}

	public WebElement getAirspringdampermassbox() {
		return Airspringdampermassbox;
	}

	public WebElement getAirspringdampervehiclebody() {
		return Airspringdampervehiclebody;
	}

	public WebElement getAirdpringdamperdamping() {
		return Airdpringdamperdamping;
	}

	public WebElement getAirspringdamperdampingsttiffnesscheckbox() {
		return Airspringdamperdampingsttiffnesscheckbox;
	}

	public WebElement getAirspringdamperdampinglineardampingcheckbox() {
		return Airspringdamperdampinglineardampingcheckbox;
	}

	public WebElement getAirsptingdamperdampingstiffnessbox() {
		return Airsptingdamperdampingstiffnessbox;
	}

	public WebElement getAirspringdamperdampinglineardampingbox() {
		return Airspringdamperdampinglineardampingbox;
	}

	public WebElement getAirspringdampersavebutton() {
		return Airspringdampersavebutton;
	}
	
	
	
	
	//create the Air spring shear spring (13948)
	
	
	@FindBy(xpath = "(//span[contains(text(),'Shear Spring')])[1]")
	private WebElement Airspringshearspring;
	@FindBy(xpath = "(//a[contains(text(),'Position')])[11]")
	private WebElement Airspringshearspringposition;
	@FindBy(xpath = "(//input[@name=\"part_name\"])[11]")
	private WebElement Airspringshearspringpartname;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[11]")
	private WebElement Airsptingshaerspringxone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[11]")
	private WebElement Airsptingshaerspringyone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[11]")
	private WebElement Airsptingshaerspringzone;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][x]\"])[9]")
	private WebElement Airspringshearspringxtwo;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][y]\"])[9]")
	private WebElement Airspringshearspringytwo;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][z]\"])[9]")
	private WebElement Airspringshearspringztwo;
	@FindBy(xpath = "(//span[text()='Not Connected'])[11]")
	private WebElement Airspringshaerspringmassbox;
	@FindBy(xpath = "(//li[text()='Bogie frame'])[2]")
	private WebElement Airspringshearspringbogieframe;
	@FindBy(xpath = "(//li[text()='003wheelsetT'])[2]")
	private WebElement Airspringshearspringwheelsett;
	@FindBy(xpath = "(//li[text()='003wheelsetL'])[2]")
	private WebElement Airspringshearspringwheelsetl;
	@FindBy(xpath = "(//h5[text()='End 2'])[2]")
	private WebElement Airspringshearspringend2;
	@FindBy(xpath = "(//a[contains(text(),'Shear Spring')])[1]")
	private WebElement Airspringshearspringspoption;
	@FindBy(xpath = "(//a[contains(text(),'Shear Spring')])[2]")
	private WebElement Airspringshearspringspoptiontwo;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqConvertValue\"])[69]")
	private WebElement Airspringshearspringspxbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqConvertValue\"])[70]")
	private WebElement Airspringshearspringsprollbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqConvertValue\"])[71]")
	private WebElement Airspringshearspringspybox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqConvertValue\"])[72]")
	private WebElement Airspringshearspringsppitchbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqConvertValue\"])[73]")
	private WebElement Airspringshearspringspzbox;
	@FindBy(xpath = "(//input[@class=\"form-control w-65 jqConvertValue\"])[74]")
	private WebElement Airspringshearspringspyawbox;
	@FindBy(xpath = "(//a[text()='Save To Library and Add'])[11]")
	private WebElement Airspringshearspringsavebutton;
	@FindBy(xpath = "(//a[text()='Save'])[1]")
	private WebElement Airspringbogiefinalsave;
	@FindBy(xpath = "(//button[text()='Save'])[1]")
	private WebElement Airspringbogieconformfinalsave;
	@FindBy(xpath = "//div[@class=\"body\"]")
	private WebElement Airspringbogiedashboardbody;
	@FindBy(xpath = "//div[@class=\"name\"]")
	private WebElement Airspringbogiesimulationtitle;
	
	

	public WebElement getAirspringbogiesimulationtitle() {
		return Airspringbogiesimulationtitle;
	}

	public WebElement getAirspringbogiedashboardbody() {
		return Airspringbogiedashboardbody;
	}

	public WebElement getAirspringbogiefinalsave() {
		return Airspringbogiefinalsave;
	}

	public WebElement getAirspringbogieconformfinalsave() {
		return Airspringbogieconformfinalsave;
	}

	public WebElement getAirspringshearspringspoptiontwo() {
		return Airspringshearspringspoptiontwo;
	}

	public WebElement getAirspringshearspringend2() {
		return Airspringshearspringend2;
	}

	public WebElement getAirspringshearspringspoption() {
		return Airspringshearspringspoption;
	}

	public WebElement getAirspringshearspringspxbox() {
		return Airspringshearspringspxbox;
	}

	public WebElement getAirspringshearspringsprollbox() {
		return Airspringshearspringsprollbox;
	}

	public WebElement getAirspringshearspringspybox() {
		return Airspringshearspringspybox;
	}

	public WebElement getAirspringshearspringsppitchbox() {
		return Airspringshearspringsppitchbox;
	}

	public WebElement getAirspringshearspringspzbox() {
		return Airspringshearspringspzbox;
	}

	public WebElement getAirspringshearspringspyawbox() {
		return Airspringshearspringspyawbox;
	}

	public WebElement getAirspringshearspringbogieframe() {
		return Airspringshearspringbogieframe;
	}

	public WebElement getAirspringshearspringwheelsett() {
		return Airspringshearspringwheelsett;
	}

	public WebElement getAirspringshearspringwheelsetl() {
		return Airspringshearspringwheelsetl;
	}

	public WebElement getAirspringshearspringxtwo() {
		return Airspringshearspringxtwo;
	}

	public WebElement getAirspringshearspringytwo() {
		return Airspringshearspringytwo;
	}

	public WebElement getAirspringshearspringposition() {
		return Airspringshearspringposition;
	}

	public WebElement getAirspringshearspring() {
		return Airspringshearspring;
	}

	public WebElement getAirspringshearspringpartname() {
		return Airspringshearspringpartname;
	}

	public WebElement getAirsptingshaerspringxone() {
		return Airsptingshaerspringxone;
	}

	public WebElement getAirsptingshaerspringyone() {
		return Airsptingshaerspringyone;
	}

	public WebElement getAirsptingshaerspringzone() {
		return Airsptingshaerspringzone;
	}

	public WebElement getAirspringshearspringztwo() {
		return Airspringshearspringztwo;
	}

	public WebElement getAirspringshaerspringmassbox() {
		return Airspringshaerspringmassbox;
	}

	public WebElement getAirspringshearspringsavebutton() {
		return Airspringshearspringsavebutton;
	}
	
	
	
	//Digital Trains sales Tool Page locater(14217)
	
	
	@FindBy(xpath = "(//a[@class=\"dropdown-link dropdown-toggle\"])[2]")
	private WebElement Salestooluserhemkumarsetting;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-wrench mr-3\"])[2]")
	private WebElement Salestooloption;
	@FindBy(xpath = "//a[text()='Manage Invoices']")
	private WebElement Salestoolmanageinvoices;
	@FindBy(xpath = "//a[text()='Create Invoice']")
	private WebElement Salestoolcreateinvoice;
	@FindBy(xpath = "//span[text()='- Please Select User -']")
	private WebElement Salestoolusernamedropdown;
	@FindBy(xpath = "//input[@class=\"select2-search__field\"]")
	private WebElement Salestoolusernamesearchbox;
	@FindBy(xpath = "//li[text()='Hemkumar D (hemkumard@digitaltrains.online)']")
	private WebElement Salestooluserhemkumar;
	@FindBy(xpath = "//input[@name=\"email_reference\"]")
	private WebElement Salestoolemailref;
	@FindBy(xpath = "//input[@id=\"date-filter-due-date\"]")
	private WebElement Salestoolduedate;
	@FindBy(xpath = "//div[text()='16']")
	private WebElement Salestoolduedate16;
	@FindBy(xpath = "//select[@class=\"form-control\"]")
	private WebElement Salestoolamountareinusdbox;
	@FindBy(xpath = "//option[text()='Include Tax']")
	private WebElement Salestoolincludetax;
	@FindBy(xpath = "//option[text()='Exclude Tax']")
	private WebElement Salestoolexcludetax;
	@FindBy(xpath = "//input[@name=\"invoice_item[description][]\"]")
	private WebElement Salestooldescription;
	@FindBy(xpath = "//input[@name=\"invoice_item[unit_cost][]\"]")
	private WebElement Salestoolunitprice;
	@FindBy(xpath = "//input[@name=\"invoice_item[qty][]\"]")
	private WebElement Salestoolqty;
	@FindBy(xpath = "(//input[@name=\"invoice_item[description][]\"])[2]")
	private WebElement Salestooldescription2;
	@FindBy(xpath = "(//input[@name=\"invoice_item[unit_cost][]\"])[2]")
	private WebElement Salestoolunitprice2;
	@FindBy(xpath = "(//input[@name=\"invoice_item[qty][]\"])[2]")
	private WebElement Salestoolqty2;
	@FindBy(xpath = "//span[@class=\"glyphicon glyphicon-plus\"]")
	private WebElement Salestooladdbuton;
	@FindBy(xpath = "//span[contains(text(),'Browse')]")
	private WebElement Salestoolbrowsebutton;
	@FindBy(xpath = "//textarea[@name=\"notes\"]")
	private WebElement Salestoolnotetextarea;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement Salestoolsavebutton;
	@FindBy(xpath = "//button[text()='Save & Send']")
	private WebElement Salestoolsaveandsendbutton;
	@FindBy(xpath = "//a[text()='Cancel']")
	private WebElement Salestoolcancelbutton;
	@FindBy(xpath = "//input[@class=\"form-control input-sm\"]")
	private WebElement Salestoolsearchbox;
	@FindBy(xpath = "//td[text()='DTS-100101']")
	private WebElement Salestooldts101;
	@FindBy(xpath = "(//button[text()=' Actions '])[1]")
	private WebElement Salestoolactionbutton;
	@FindBy(xpath = "(//a[text()='View Invoice'])[1]")
	private WebElement Salestoolactioninvoice;
	@FindBy(xpath = "//a[text()='Download Invoice']")
	private WebElement Salestooldwonloadinvoice;
	@FindBy(xpath = "(//a[text()='Resend Invoice'])[1]")
	private WebElement Salestoolresendinvoice;
	@FindBy(xpath = "(//a[text()='Mark as Paid'])[1]")
	private WebElement Salestoolmarkaspaid;
	@FindBy(xpath = "(//a[text()='Download PDF'])[1]")
	private WebElement Salestooldwonloadpdf;
	@FindBy(xpath = "(//a[text()='Cancel Invoice'])[1]")
	private WebElement Salestoolcancelinvoice;
	@FindBy(xpath = "//td[text()='DTS-100103']")
	private WebElement Salestooldts103;
	@FindBy(xpath = "(//button[text()=' Actions '])[3]")
	private WebElement Salestooldraftaction;
	@FindBy(xpath = "(//a[text()='Edit Invoice'])[1]")
	private WebElement Salestooldrafteditinvoice;

	
	
	public WebElement getSalestooluserhemkumarsetting() {
		return Salestooluserhemkumarsetting;
	}

	public WebElement getSalestooldescription2() {
		return Salestooldescription2;
	}

	public WebElement getSalestoolunitprice2() {
		return Salestoolunitprice2;
	}

	public WebElement getSalestoolqty2() {
		return Salestoolqty2;
	}

	public WebElement getSalestooluserhemkumar() {
		return Salestooluserhemkumar;
	}

	public WebElement getSalestooldwonloadinvoice() {
		return Salestooldwonloadinvoice;
	}

	public WebElement getSalestooldts103() {
		return Salestooldts103;
	}

	public WebElement getSalestooldts101() {
		return Salestooldts101;
	}

	public WebElement getSalestoolusernamesearchbox() {
		return Salestoolusernamesearchbox;
	}

	public WebElement getSalestooloption() {
		return Salestooloption;
	}

	public WebElement getSalestoolmanageinvoices() {
		return Salestoolmanageinvoices;
	}

	public WebElement getSalestoolcreateinvoice() {
		return Salestoolcreateinvoice;
	}

	public WebElement getSalestoolusernamedropdown() {
		return Salestoolusernamedropdown;
	}

	public WebElement getSalestoolemailref() {
		return Salestoolemailref;
	}

	public WebElement getSalestoolduedate() {
		return Salestoolduedate;
	}

	public WebElement getSalestoolduedate16() {
		return Salestoolduedate16;
	}

	public WebElement getSalestoolamountareinusdbox() {
		return Salestoolamountareinusdbox;
	}

	public WebElement getSalestoolincludetax() {
		return Salestoolincludetax;
	}

	public WebElement getSalestoolexcludetax() {
		return Salestoolexcludetax;
	}

	public WebElement getSalestooldescription() {
		return Salestooldescription;
	}

	public WebElement getSalestoolunitprice() {
		return Salestoolunitprice;
	}

	public WebElement getSalestoolqty() {
		return Salestoolqty;
	}

	public WebElement getSalestooladdbuton() {
		return Salestooladdbuton;
	}

	public WebElement getSalestoolbrowsebutton() {
		return Salestoolbrowsebutton;
	}

	public WebElement getSalestoolnotetextarea() {
		return Salestoolnotetextarea;
	}

	public WebElement getSalestoolsavebutton() {
		return Salestoolsavebutton;
	}

	public WebElement getSalestoolsaveandsendbutton() {
		return Salestoolsaveandsendbutton;
	}

	public WebElement getSalestoolcancelbutton() {
		return Salestoolcancelbutton;
	}

	public WebElement getSalestoolsearchbox() {
		return Salestoolsearchbox;
	}

	public WebElement getSalestoolactionbutton() {
		return Salestoolactionbutton;
	}

	public WebElement getSalestoolactioninvoice() {
		return Salestoolactioninvoice;
	}

	public WebElement getSalestoolresendinvoice() {
		return Salestoolresendinvoice;
	}

	public WebElement getSalestoolmarkaspaid() {
		return Salestoolmarkaspaid;
	}

	public WebElement getSalestooldwonloadpdf() {
		return Salestooldwonloadpdf;
	}

	public WebElement getSalestoolcancelinvoice() {
		return Salestoolcancelinvoice;
	}

	public WebElement getSalestooldraftaction() {
		return Salestooldraftaction;
	}

	public WebElement getSalestooldrafteditinvoice() {
		return Salestooldrafteditinvoice;
	}
	
	
	
	
	//Check the Composite Graph(Under the train review option)(14367)
	
	@FindBy(xpath = "//div[contains(text(),'My train')]")
	private WebElement Trainmytrainoption;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement Trainmytrainactionbutton;
	@FindBy(xpath = "//span[@class=\"glyphicon glyphicon-eye-open mr-2\"]")
	private WebElement Trainreviewoption;
	@FindBy(xpath = "//span[@class=\"glyphicon glyphicon-signal mr-2\"]")
	private WebElement Traincompositegraph;
	@FindBy(xpath = "//h5[text()='Legend']")
	private WebElement Trainlegend;
	@FindBy(xpath = "(//button[text()='Cancel'])[38]")
	private WebElement Traincancelbutton;
	@FindBy(xpath = "//a[text()='Next Coupling Interface					']")
	private WebElement Trainnextcouplerinterface;
	

	public WebElement getTrainmytrainoption() {
		return Trainmytrainoption;
	}

	public WebElement getTrainmytrainactionbutton() {
		return Trainmytrainactionbutton;
	}

	public WebElement getTrainreviewoption() {
		return Trainreviewoption;
	}

	public WebElement getTraincompositegraph() {
		return Traincompositegraph;
	}

	public WebElement getTrainlegend() {
		return Trainlegend;
	}

	public WebElement getTraincancelbutton() {
		return Traincancelbutton;
	}

	public WebElement getTrainnextcouplerinterface() {
		return Trainnextcouplerinterface;
	}


	//Check the project delete option (14418)
	
	@FindBy(xpath = "//div[contains(text(),'DVRS1')]")
	private WebElement ProjectDVRS1;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[2]")
	private WebElement Projectactionbutton;
	@FindBy(xpath = "(//span[text()='Delete Project'])[2]")
	private WebElement Projectdeletebutton;
	@FindBy(xpath = "(//button[text()='Delete'])[1]")
	private WebElement Projectconformdelete;
	
	

	public WebElement getProjectconformdelete() {
		return Projectconformdelete;
	}

	public WebElement getProjectDVRS1() {
		return ProjectDVRS1;
	}

	public WebElement getProjectactionbutton() {
		return Projectactionbutton;
	}

	public WebElement getProjectdeletebutton() {
		return Projectdeletebutton;
	}
	
	
	
	
	//Check the wheel rail profile contact functionality(14445)
	
	
	@FindBy(xpath = "//a[text()='Wheels/Rails']")
	private WebElement Wheelrailoption;
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement Wheelrailcontacts;
	@FindBy(xpath = "//button[text()='Create Contact							']")
	private WebElement Wheelrailcreatecontact;
	@FindBy(xpath = "(//input[@name=\"contact_name\"])[1]")
	private WebElement Wheelrailcontactnamebox;
	@FindBy(xpath = "//select[@id=\"jqTemplateProfile-wheel\"]")
	private WebElement Wheelprofilebox;
	@FindBy(xpath = "//option[text()='British Rail P5']")
	private WebElement Wheelprofilebritishrailp5;
	@FindBy(xpath = "//a[contains(text(),'Rail Data')]")
	private WebElement Raildataoptionbutton;
	@FindBy(xpath = "//select[@id=\"jqTemplateProfile-rail\"]")
	private WebElement Railprofilebox;
	@FindBy(xpath = "//option[text()='UIC54 Rail inclined at 1 in 20']")
	private WebElement RailprofileUIC54RAIL;
	@FindBy(xpath = "//button[contains(text(),'Close')]")
	private WebElement railprofileerrorclosebutton;
	@FindBy(xpath = "(//button[text()='Save'])[1]")
	private WebElement Wheelrailcalculate;
	@FindBy(xpath = "//button[contains(text(),'Review Contact')]")
	private WebElement Wheelrailreview;
	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
	private WebElement Wheelrailcancelbutton;
	@FindBy(xpath = "//div[contains(text(),'New contact profile')]")
	private WebElement Newcontactprofile;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[2]")
	private WebElement Newcontactprofilefirstaction;
	@FindBy(xpath = "(//a[text()='Review Contact													'])[2]")
	private WebElement Newcontactprofileeditbuttonfirst;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement Newcontactprofileactionbutton;
	@FindBy(xpath = "//a[text()='Review Contact													']")
	private WebElement Newcontactprofileeditbutton;
	@FindBy(xpath = "//select[@id=\"jqShift\"]")
	private WebElement Newcontactprofilelateralshift;
	@FindBy(xpath = "//div[contains(text(),'Left Contact Angle')]")
	private WebElement Newcontactfullviewofcontact;
	@FindBy(xpath = "(//option[text()='3.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshift3;
	@FindBy(xpath = "(//option[text()='6.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshift6;
	@FindBy(xpath = "(//option[text()='9.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshift9;
	@FindBy(xpath = "(//option[text()='12.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshift12;
	@FindBy(xpath = "(//option[text()='15.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshift15;
	@FindBy(xpath = "(//option[text()='18.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshift18;
	@FindBy(xpath = "(//option[text()='0.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshift0;
	@FindBy(xpath = "(//option[text()='-3.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshiftnagative3;
	@FindBy(xpath = "(//option[text()='-6.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshiftnagative6;
	@FindBy(xpath = "(//option[text()='-9.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshiftnagative9;
	@FindBy(xpath = "(//option[text()='-12.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshiftnagative12;
	@FindBy(xpath = "(//option[text()='-15.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshiftnagative15;
	@FindBy(xpath = "(//option[text()='-18.00 mm'])[1]")
	private WebElement Newcontactprofilelateralshiftnagative18;
	@FindBy(xpath = "//a[contains(text(),'Point Plot')]")
	private WebElement Newcontactprofilepointplot;
	@FindBy(xpath = "(//div[contains(text(),'Left Rail Incline')])[2]")
	private WebElement Newcontactprofilepointplotleftrailincline;
	@FindBy(xpath = "//a[contains(text(),'Data Plot')]")
	private WebElement Newcontactprofiledataplot;
	@FindBy(xpath = "(//div[text()='mm'])[1]")
	private WebElement Newcontactprofilemm;
	@FindBy(xpath ="//select[@id=\"jqChannel\"]")
	private WebElement Newcontactprofiledataplotselectchannel;
	@FindBy(xpath = "//option[text()='Contact Angle Left Wheel']")
	private WebElement Newcontactprofilecontactangleleftwheel;
	@FindBy(xpath = "//option[text()='Lat. Position of Left Contact']")
	private WebElement Newcontactprofilelatposition;
	@FindBy(xpath = "//option[text()='Vert. portion of Left Contact']")
	private WebElement Newcontactprofilevertpostion;
	@FindBy(xpath = "//option[text()='Contact Patch Area Left Wheel']")
	private WebElement Newcontactprofilecontactpatcharea;

	
	
	

	public WebElement getNewcontactprofileeditbuttonfirst() {
		return Newcontactprofileeditbuttonfirst;
	}

	public WebElement getNewcontactprofilefirstaction() {
		return Newcontactprofilefirstaction;
	}

	public WebElement getRailprofileerrorclosebutton() {
		return railprofileerrorclosebutton;
	}

	public WebElement getWheelrailreview() {
		return Wheelrailreview;
	}

	public WebElement getWheelrailcancelbutton() {
		return Wheelrailcancelbutton;
	}

	public WebElement getNewcontactprofilemm() {
		return Newcontactprofilemm;
	}

	public WebElement getWheelrailoption() {
		return Wheelrailoption;
	}

	public WebElement getWheelrailcontacts() {
		return Wheelrailcontacts;
	}

	public WebElement getWheelrailcreatecontact() {
		return Wheelrailcreatecontact;
	}

	public WebElement getWheelrailcontactnamebox() {
		return Wheelrailcontactnamebox;
	}

	public WebElement getWheelprofilebox() {
		return Wheelprofilebox;
	}

	public WebElement getWheelprofilebritishrailp5() {
		return Wheelprofilebritishrailp5;
	}

	public WebElement getRaildataoptionbutton() {
		return Raildataoptionbutton;
	}

	public WebElement getRailprofilebox() {
		return Railprofilebox;
	}

	public WebElement getRailprofileUIC54RAIL() {
		return RailprofileUIC54RAIL;
	}

	public WebElement getWheelrailcalculate() {
		return Wheelrailcalculate;
	}

	public WebElement getNewcontactprofile() {
		return Newcontactprofile;
	}

	public WebElement getNewcontactprofileactionbutton() {
		return Newcontactprofileactionbutton;
	}

	public WebElement getNewcontactprofileeditbutton() {
		return Newcontactprofileeditbutton;
	}

	public WebElement getNewcontactprofilelateralshift() {
		return Newcontactprofilelateralshift;
	}

	public WebElement getNewcontactfullviewofcontact() {
		return Newcontactfullviewofcontact;
	}

	public WebElement getNewcontactprofilelateralshift3() {
		return Newcontactprofilelateralshift3;
	}

	public WebElement getNewcontactprofilelateralshift6() {
		return Newcontactprofilelateralshift6;
	}

	public WebElement getNewcontactprofilelateralshift9() {
		return Newcontactprofilelateralshift9;
	}

	public WebElement getNewcontactprofilelateralshift12() {
		return Newcontactprofilelateralshift12;
	}

	public WebElement getNewcontactprofilelateralshift15() {
		return Newcontactprofilelateralshift15;
	}

	public WebElement getNewcontactprofilelateralshift18() {
		return Newcontactprofilelateralshift18;
	}

	public WebElement getNewcontactprofilelateralshift0() {
		return Newcontactprofilelateralshift0;
	}

	public WebElement getNewcontactprofilelateralshiftnagative3() {
		return Newcontactprofilelateralshiftnagative3;
	}

	public WebElement getNewcontactprofilelateralshiftnagative6() {
		return Newcontactprofilelateralshiftnagative6;
	}

	public WebElement getNewcontactprofilelateralshiftnagative9() {
		return Newcontactprofilelateralshiftnagative9;
	}

	public WebElement getNewcontactprofilelateralshiftnagative12() {
		return Newcontactprofilelateralshiftnagative12;
	}

	public WebElement getNewcontactprofilelateralshiftnagative15() {
		return Newcontactprofilelateralshiftnagative15;
	}

	public WebElement getNewcontactprofilelateralshiftnagative18() {
		return Newcontactprofilelateralshiftnagative18;
	}

	public WebElement getNewcontactprofilepointplot() {
		return Newcontactprofilepointplot;
	}

	public WebElement getNewcontactprofilepointplotleftrailincline() {
		return Newcontactprofilepointplotleftrailincline;
	}

	public WebElement getNewcontactprofiledataplot() {
		return Newcontactprofiledataplot;
	}

	public WebElement getNewcontactprofiledataplotselectchannel() {
		return Newcontactprofiledataplotselectchannel;
	}

	public WebElement getNewcontactprofilecontactangleleftwheel() {
		return Newcontactprofilecontactangleleftwheel;
	}

	public WebElement getNewcontactprofilelatposition() {
		return Newcontactprofilelatposition;
	}

	public WebElement getNewcontactprofilevertpostion() {
		return Newcontactprofilevertpostion;
	}

	public WebElement getNewcontactprofilecontactpatcharea() {
		return Newcontactprofilecontactpatcharea;
	}
	
	
	//Check the functionality of show Usage option(14583)
	
	@FindBy(xpath = "//div[contains(text(),'Y25Bogie')]")
	private WebElement Y25bogieoption;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Y25bogiesaction;
	@FindBy(xpath = "(//a[text()='Show usage...													'])[1]")
    private WebElement Y25bogieshowoption;
	@FindBy(xpath = "(//div[@class=\"panel-body\"])[3]")
	private WebElement Y25panelbody;
	@FindBy(xpath = "(//button[contains(text(),'View')])[1]")
	private WebElement Y25bogieviewoption;

	public WebElement getY25panelbody() {
		return Y25panelbody;
	}

	public WebElement getY25bogieoption() {
		return Y25bogieoption;
	}

	public WebElement getY25bogiesaction() {
		return Y25bogiesaction;
	}

	public WebElement getY25bogieshowoption() {
		return Y25bogieshowoption;
	}

	public WebElement getY25bogieviewoption() {
		return Y25bogieviewoption;
	}
	
	
	
	//Check the view usage option in the vehicle (14627)
	
	@FindBy(xpath = "(//div[@class=\"item-column item-column-main\"])[1]")
	private WebElement vehiclemyvehicle;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement vehicleaction;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-search mr-2\"])[1]")
	private WebElement vehicleviewusageoption;
	@FindBy(xpath = "//div[@class=\"table panel-body p-0\"]")
	private WebElement vehiclepanelbody;
	@FindBy(xpath = "(//button[contains(text(),'View')])[1]")
	private WebElement vehicleusageview;


	public WebElement getVehiclemyvehicle() {
		return vehiclemyvehicle;
	}

	public WebElement getVehicleviewusageoption() {
		return vehicleviewusageoption;
	}

	public WebElement getVehiclepanelbody() {
		return vehiclepanelbody;
	}

	public WebElement getVehicleusageview() {
		return vehicleusageview;
	}
	
	
	
	//Check the view usage option in the train (14674)
	

	@FindBy(xpath = "//div[contains(text(),'My train')]")
	private WebElement Trainmytrain;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement Trainaction;
	@FindBy(xpath = "//span[@class=\"glyphicon glyphicon-search mr-2\"]")
	private WebElement Trainviewusageoption;
	@FindBy(xpath = "//div[@class=\"table panel-body p-0\"]")
	private WebElement Trainpanelbody;
	@FindBy(xpath = "(//button[contains(text(),'View')])[1]")
	private WebElement Trainview;
	@FindBy(xpath = "(//div[@class=\"wrap js-wrap\"])[2]")
	private WebElement Trainwarp;

	public WebElement getTrainmytrain() {
		return Trainmytrain;
	}

	public WebElement getTrainaction() {
		return Trainaction;
	}

	public WebElement getTrainviewusageoption() {
		return Trainviewusageoption;
	}

	public WebElement getTrainpanelbody() {
		return Trainpanelbody;
	}

	public WebElement getTrainview() {
		return Trainview;
	}

	public WebElement getTrainwarp() {
		return Trainwarp;
	}
	
	
	
	//Check the view usage option in the project(14719)
	
	@FindBy(xpath = "//div[contains(text(),'DVRS 1')]")
	private WebElement ProjectDVRS01;
	@FindBy(xpath = "//div[contains(text(),'Running Train')]")
	private WebElement Projectrunningtrain;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[3]")
	private WebElement Projectrunningtrainaction;
	@FindBy(xpath = "(//a[@class=\"jqRecordUsageBtn\"])[1]")
	private WebElement Projectrunningtrainshowusage;
	@FindBy(xpath = "//div[@class=\"table panel-body p-0\"]")
	private WebElement Projectrunnigtrainpanelbody;
	@FindBy(xpath = "(//button[contains(text(),'View')])[1]")
	private WebElement Projectrunningtrainviewbutton;

	public WebElement getProjectDVRS01() {
		return ProjectDVRS01;
	}

	public WebElement getProjectrunningtrain() {
		return Projectrunningtrain;
	}

	public WebElement getProjectrunningtrainaction() {
		return Projectrunningtrainaction;
	}

	public WebElement getProjectrunningtrainshowusage() {
		return Projectrunningtrainshowusage;
	}

	public WebElement getProjectrunnigtrainpanelbody() {
		return Projectrunnigtrainpanelbody;
	}

	public WebElement getProjectrunningtrainviewbutton() {
		return Projectrunningtrainviewbutton;
	}
	
	
	
	//Train to train impact simulation under the DVRS2(14770)
	
	@FindBy(xpath = "//a[text()='Projects']")
	private WebElement Traintotrainproject;
	@FindBy(xpath = "//div[contains(text(),'DVRS2')]")
	private WebElement TraintotrainDVRS2;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Traintotrainactionbutton;
	@FindBy(xpath = "(//a[text()='Create Simulation                                                    '])[1]")
	private WebElement Traintotraincreatesimulation;
	@FindBy(xpath = "(//input[@name=\"simulation_name\"])[2]")
	private WebElement Traintotrainsuimulationnamebox;
	@FindBy(xpath = "//input[@name=\"simulation_data[impact_speeds][0][speed]\"]")
	private WebElement Traintotrainsimulationspeed;
	@FindBy(xpath = "(//span[@class=\"select2-selection__placeholder\"])[1]")
	private WebElement Traintotrainselecttrain;
	@FindBy(xpath = "//li[text()='My train']")
	private WebElement Traintotrainselectmytrain;
	@FindBy(xpath = "(//select[@id=\"mass_condition\"])[1]")
	private WebElement Traintotrainmassconditionbox;
	@FindBy(xpath = "//option[text()='AW2']")
	private WebElement TraintotrainmassAW2;
	@FindBy(xpath = "(//input[@name=\"trains[1][impact_brakes][]\"])[1]")
	private WebElement Traintotrainbrakesbox;
	@FindBy(xpath = "//a[contains(text(),'Train 2')]")
	private WebElement Traintotrain2;
	@FindBy(xpath = "//input[@name=\"trains[2][mirror_brakes]\"]")
	private WebElement Traintotrainbrakes2;
	@FindBy(xpath = "//button[text()='Run']")
	private WebElement Traintotrainrunbutton;
	@FindBy(xpath = "//a[text()='Simulation Results']")
	private WebElement Traintotrainsimulationresults;
	@FindBy(xpath = "//strong[contains(text(),'Total Force')]")
	private WebElement Traintotrainscrolltotalforace;
	@FindBy(xpath = "//a[text()='3D            ']")
	private WebElement Traintotrain3Dview;
	@FindBy(xpath = "//i[@class=\"glyphicon glyphicon-play\"]")
	private WebElement Traintotrainplaybutton;

	
	
	public WebElement getTraintotrainproject() {
		return Traintotrainproject;
	}

	public WebElement getTraintotrainDVRS2() {
		return TraintotrainDVRS2;
	}

	public WebElement getTraintotrainactionbutton() {
		return Traintotrainactionbutton;
	}

	public WebElement getTraintotraincreatesimulation() {
		return Traintotraincreatesimulation;
	}

	public WebElement getTraintotrainsuimulationnamebox() {
		return Traintotrainsuimulationnamebox;
	}

	public WebElement getTraintotrainsimulationspeed() {
		return Traintotrainsimulationspeed;
	}

	public WebElement getTraintotrainselecttrain() {
		return Traintotrainselecttrain;
	}

	public WebElement getTraintotrainselectmytrain() {
		return Traintotrainselectmytrain;
	}

	public WebElement getTraintotrainmassconditionbox() {
		return Traintotrainmassconditionbox;
	}

	public WebElement getTraintotrainmassAW2() {
		return TraintotrainmassAW2;
	}

	public WebElement getTraintotrainbrakesbox() {
		return Traintotrainbrakesbox;
	}

	public WebElement getTraintotrain2() {
		return Traintotrain2;
	}

	public WebElement getTraintotrainbrakes2() {
		return Traintotrainbrakes2;
	}

	public WebElement getTraintotrainrunbutton() {
		return Traintotrainrunbutton;
	}

	public WebElement getTraintotrainsimulationresults() {
		return Traintotrainsimulationresults;
	}

	public WebElement getTraintotrainscrolltotalforace() {
		return Traintotrainscrolltotalforace;
	}

	public WebElement getTraintotrain3Dview() {
		return Traintotrain3Dview;
	}

	public WebElement getTraintotrainplaybutton() {
		return Traintotrainplaybutton;
	}
	
	
	
	
	
	//Compare the two simulation and check the graphs(14859)
	
	@FindBy(xpath = "//div[contains(text(),'Train1 to train2 impact simulation')]")
	private WebElement Train1andtrain2simulation;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[2]")
	private WebElement Train1andtrain2action;
	@FindBy(xpath = "//a[text()='Compare Simulation To...												']")
	private WebElement Train1andtrain2comparesimulation;
	@FindBy(xpath = "//span[text()='Please select....']")
	private WebElement Train1andtrain2selectproject;
	@FindBy(xpath = "//li[text()='DVRS 1']")
	private WebElement Train1andtrain2DVRS1;
	@FindBy(xpath = "//span[text()='Select template']")
	private WebElement Train1andtrain2selectlibrary;
	@FindBy(xpath = "//li[text()='Impact test']")
	private WebElement Train1andtrain2selectimpacttest;
	@FindBy(xpath = "//a[text()='Compare Selected']")
	private WebElement Train1andtrain2compareselected;
	@FindBy(xpath = "//strong[contains(text(),'Total Force vs Displacement')]")
	private WebElement Train1andtrain2overviewgraphscrollpoint;
	@FindBy(xpath = "//button[text()='Graphs ']")
	private WebElement Train1andtrain2graphoption;
	@FindBy(xpath = "//a[text()='Cascade Force Time                                        ']")
	private WebElement Train1andtrain2cascadeforcetime;
	@FindBy(xpath = "//strong[text()='Simulation 2: Train 1, Coupling Interface 4 - Force vs Time']")
	private WebElement Train1andtrain2forcetimescroll1;
	@FindBy(xpath = "//strong[text()='Train 1, Coupling Interface 1 - Force vs Time']")
	private WebElement Train1andtrain2forcetimescroll2;
	@FindBy(xpath = "//strong[text()='Train 1, Coupling Interface 3 - Force vs Time']")
	private WebElement Train1andtrain2forcetimescroll3;
	@FindBy(xpath = "//strong[text()='Train 2, Coupling Interface 2 - Force vs Time']")
	private WebElement Train1andtrain2forcetimescroll4;
	@FindBy(xpath = "//a[text()='Cascade Velocity Time                                        ']")
	private WebElement Train1andtrain2cascadevelocitytime;
	@FindBy(xpath = "//strong[text()='Train 1, Vehicle 1 - Velocity vs Time']")
	private WebElement Train1andtrain2velocitytimescroll1;
	@FindBy(xpath = "//strong[text()='Train 1, Vehicle 3 - Velocity vs Time']")
	private WebElement Train1andtrain2velocitytimescroll2;
	@FindBy(xpath = "//strong[text()='Train 1, Vehicle 6 - Velocity vs Time']")
	private WebElement Train1andtrain2velocitytimescroll3;
	@FindBy(xpath = "//strong[text()='Train 1, Vehicle 8 - Velocity vs Time']")
	private WebElement Train1andtrain2velocitytimescroll4;
	@FindBy(xpath = "//a[text()='Cascade Acceleration Time                                        ']")
	private WebElement Train1andtrain2cascadeaccelerationtime;
	@FindBy(xpath = "//strong[text()='Train 1, Vehicle 2 - Acceleration vs Time']")
	private WebElement Train1andtrain2accelerationtimescroll1;
	@FindBy(xpath = "//strong[text()='Train 1, Vehicle 4 - Acceleration vs Time']")
	private WebElement Train1andtrain2accelerationtimescroll2;
	@FindBy(xpath = "//strong[text()='Train 1, Vehicle 6 - Acceleration vs Time']")
	private WebElement Train1andtrain2accelerationtimescroll3;
	@FindBy(xpath = "//strong[text()='Train 1, Vehicle 8 - Acceleration vs Time']")
	private WebElement Train1andtrain2accelerationtimescroll4;
	@FindBy(xpath = "//a[text()='Cascade Displacement Time                                        ']")
	private WebElement Train1andtrain2cascadedisplacementtime;
	@FindBy(xpath = "//strong[text()='Simulation 2: Train 1, Coupling Interface 4 - Displacement vs Time']")
	private WebElement Train1andtrain2displacementtimescroll1;
	@FindBy(xpath = "//strong[text()='Train 1, Coupling Interface 1 - Displacement vs Time']")
	private WebElement Train1andtrain2displacementtimescroll2;
	@FindBy(xpath = "//strong[text()='Train 1, Coupling Interface 2 - Displacement vs Time']")
	private WebElement Train1andtrain2displacementtimescroll3;
	@FindBy(xpath = "//strong[text()='Impact Coupling Interface - Displacement vs Time']")
	private WebElement Train1andtrain2displacementtimescroll4;
	@FindBy(xpath = "//button[text()='Overview                            ']")
	private WebElement Train1andtrain2overviewgraph;

	
	
	
	public WebElement getTrain1andtrain2simulation() {
		return Train1andtrain2simulation;
	}

	public WebElement getTrain1andtrain2action() {
		return Train1andtrain2action;
	}

	public WebElement getTrain1andtrain2comparesimulation() {
		return Train1andtrain2comparesimulation;
	}

	public WebElement getTrain1andtrain2selectproject() {
		return Train1andtrain2selectproject;
	}

	public WebElement getTrain1andtrain2DVRS1() {
		return Train1andtrain2DVRS1;
	}

	public WebElement getTrain1andtrain2selectlibrary() {
		return Train1andtrain2selectlibrary;
	}

	public WebElement getTrain1andtrain2selectimpacttest() {
		return Train1andtrain2selectimpacttest;
	}

	public WebElement getTrain1andtrain2compareselected() {
		return Train1andtrain2compareselected;
	}

	public WebElement getTrain1andtrain2overviewgraphscrollpoint() {
		return Train1andtrain2overviewgraphscrollpoint;
	}

	public WebElement getTrain1andtrain2graphoption() {
		return Train1andtrain2graphoption;
	}

	public WebElement getTrain1andtrain2cascadeforcetime() {
		return Train1andtrain2cascadeforcetime;
	}

	public WebElement getTrain1andtrain2forcetimescroll1() {
		return Train1andtrain2forcetimescroll1;
	}

	public WebElement getTrain1andtrain2forcetimescroll2() {
		return Train1andtrain2forcetimescroll2;
	}

	public WebElement getTrain1andtrain2forcetimescroll3() {
		return Train1andtrain2forcetimescroll3;
	}

	public WebElement getTrain1andtrain2forcetimescroll4() {
		return Train1andtrain2forcetimescroll4;
	}

	public WebElement getTrain1andtrain2cascadevelocitytime() {
		return Train1andtrain2cascadevelocitytime;
	}

	public WebElement getTrain1andtrain2velocitytimescroll1() {
		return Train1andtrain2velocitytimescroll1;
	}

	public WebElement getTrain1andtrain2velocitytimescroll2() {
		return Train1andtrain2velocitytimescroll2;
	}

	public WebElement getTrain1andtrain2velocitytimescroll3() {
		return Train1andtrain2velocitytimescroll3;
	}

	public WebElement getTrain1andtrain2velocitytimescroll4() {
		return Train1andtrain2velocitytimescroll4;
	}

	public WebElement getTrain1andtrain2cascadeaccelerationtime() {
		return Train1andtrain2cascadeaccelerationtime;
	}

	public WebElement getTrain1andtrain2accelerationtimescroll1() {
		return Train1andtrain2accelerationtimescroll1;
	}

	public WebElement getTrain1andtrain2accelerationtimescroll2() {
		return Train1andtrain2accelerationtimescroll2;
	}

	public WebElement getTrain1andtrain2accelerationtimescroll3() {
		return Train1andtrain2accelerationtimescroll3;
	}

	public WebElement getTrain1andtrain2accelerationtimescroll4() {
		return Train1andtrain2accelerationtimescroll4;
	}

	public WebElement getTrain1andtrain2cascadedisplacementtime() {
		return Train1andtrain2cascadedisplacementtime;
	}

	public WebElement getTrain1andtrain2displacementtimescroll1() {
		return Train1andtrain2displacementtimescroll1;
	}

	public WebElement getTrain1andtrain2displacementtimescroll2() {
		return Train1andtrain2displacementtimescroll2;
	}

	public WebElement getTrain1andtrain2displacementtimescroll3() {
		return Train1andtrain2displacementtimescroll3;
	}

	public WebElement getTrain1andtrain2displacementtimescroll4() {
		return Train1andtrain2displacementtimescroll4;
	}

	public WebElement getTrain1andtrain2overviewgraph() {
		return Train1andtrain2overviewgraph;
	} 


	
	//Check the invoice after click the pay now button locater(15011)
	
	@FindBy(xpath = "(//div[contains(text(),'DigitalTrains Online')])[1]")
	private WebElement MailHogselectfirstmail;
	@FindBy(xpath = "//td[@align=\"center\"]")
	private WebElement MailHoginvoicecenter;
	@FindBy(xpath = "//iframe[@id=\"preview-html\"]")
	private WebElement MailHogswitchtoframe;
	@FindBy(xpath = "//a[@href=\"https://test.digitaltrains.online/services/pay/DTS-100205\"]")
	private WebElement MailHogpayonlinebutton;
	@FindBy(xpath = "(//input[@id=\"modal-login-email\"])[1]")
	private WebElement MailHogusername;
	@FindBy(xpath = "(//input[@id=\"modal-login-password\"])[1]")
	private WebElement MailHogpassword;
	@FindBy(xpath = "(//input[@class=\"button\"])[1]")
	private WebElement MailHogsubmitbutton;
	@FindBy(xpath = "//strong[text()='Invoice Date']")
	private WebElement MailHoginvoicedate;
	@FindBy(xpath = "//strong[text()='Due Date']")
	private WebElement MailHogduedate;
	@FindBy(xpath = "//strong[text()='Invoice No.']")
	private WebElement MailHoginvoiceNo;
	@FindBy(xpath = "//strong[text()='Amount Due']")
	private WebElement MailHogamountdue;
	@FindBy(xpath = "//label[text()='Card number']")
	private WebElement MailHogcardnumber;
	@FindBy(xpath = "//label[text()='Expiry']")
	private WebElement MailHogexpiry;
	@FindBy(xpath = "//label[text()='CVC']")
	private WebElement MailHogcvc;
	@FindBy(xpath = "//label[text()='Country']")
	private WebElement MailHogcountry;
	@FindBy(xpath = "//input[@id=\"Field-numberInput\"]")
	private WebElement MailHogcardnumberbox;
	@FindBy(xpath = "//input[@id=\"Field-expiryInput\"]")
	private WebElement MailHogexpirydatebox;
	@FindBy(xpath = "//input[@id=\"Field-cvcInput\"]")
	private WebElement MailHogcvcbox;
	@FindBy(xpath = "//select[@id=\"Field-countryInput\"]")
	private WebElement MailHogcountrybox;
	@FindBy(xpath = "//option[text()='Canada']")
	private WebElement MailHogcanada;
	@FindBy(xpath = "//option[text()='Austria']")
	private WebElement MailHogaustria;
	@FindBy(xpath = "//option[text()='United States']")
	private WebElement MailHogunitedstates;
	@FindBy(xpath = "//option[text()='United Kingdom']")
	private WebElement MailHogunitedkingdom;
	@FindBy(xpath = "//option[text()='India']")
	private WebElement MailHogindia;
	@FindBy(xpath = "//span[text()='Pay now']")
	private WebElement MailHogpaynow;
	@FindBy(xpath = "//select[@id=\"Field-networkInput\"]")
	private WebElement MailHognetworkinput;
	@FindBy(xpath = "//img[@alt=\"visa\"]")
	private WebElement MailHogvisa;
	@FindBy(xpath = "//img[@alt=\"mastercard\"]")
	private WebElement MailHogmastercard;
	@FindBy(xpath = "//img[@alt=\"amex\"]")
	private WebElement MailHogamericanexpress;
	@FindBy(xpath = "//img[@alt=\"discover\"]")
	private WebElement MailHogdiscover;
	@FindBy(xpath = "//img[@alt=\"diners\"]")
	private WebElement MailHogdinerscard;
	@FindBy(xpath = "//img[@alt=\"unionpay\"]")
	private WebElement MailHogunionpay;




	public WebElement getMailHogusername() {
		return MailHogusername;
	}

	public WebElement getMailHogpassword() {
		return MailHogpassword;
	}

	public WebElement getMailHogsubmitbutton() {
		return MailHogsubmitbutton;
	}

	public WebElement getMailHogswitchtoframe() {
		return MailHogswitchtoframe;
	}

	public WebElement getMailHoginvoicecenter() {
		return MailHoginvoicecenter;
	}

	public WebElement getMailHogselectfirstmail() {
		return MailHogselectfirstmail;
	}

	public WebElement getMailHogpayonlinebutton() {
		return MailHogpayonlinebutton;
	}

	public WebElement getMailHoginvoicedate() {
		return MailHoginvoicedate;
	}

	public WebElement getMailHogduedate() {
		return MailHogduedate;
	}

	public WebElement getMailHoginvoiceNo() {
		return MailHoginvoiceNo;
	}

	public WebElement getMailHogamountdue() {
		return MailHogamountdue;
	}

	public WebElement getMailHogcardnumber() {
		return MailHogcardnumber;
	}

	public WebElement getMailHogexpiry() {
		return MailHogexpiry;
	}

	public WebElement getMailHogcvc() {
		return MailHogcvc;
	}

	public WebElement getMailHogcountry() {
		return MailHogcountry;
	}

	public WebElement getMailHogcardnumberbox() {
		return MailHogcardnumberbox;
	}

	public WebElement getMailHogexpirydatebox() {
		return MailHogexpirydatebox;
	}

	public WebElement getMailHogcvcbox() {
		return MailHogcvcbox;
	}

	public WebElement getMailHogcountrybox() {
		return MailHogcountrybox;
	}

	public WebElement getMailHogcanada() {
		return MailHogcanada;
	}

	public WebElement getMailHogaustria() {
		return MailHogaustria;
	}

	public WebElement getMailHogunitedstates() {
		return MailHogunitedstates;
	}

	public WebElement getMailHogunitedkingdom() {
		return MailHogunitedkingdom;
	}

	public WebElement getMailHogindia() {
		return MailHogindia;
	}

	public WebElement getMailHogpaynow() {
		return MailHogpaynow;
	}

	public WebElement getMailHognetworkinput() {
		return MailHognetworkinput;
	}

	public WebElement getMailHogvisa() {
		return MailHogvisa;
	}

	public WebElement getMailHogmastercard() {
		return MailHogmastercard;
	}

	public WebElement getMailHogamericanexpress() {
		return MailHogamericanexpress;
	}

	public WebElement getMailHogdiscover() {
		return MailHogdiscover;
	}

	public WebElement getMailHogdinerscard() {
		return MailHogdinerscard;
	}

	public WebElement getMailHogunionpay() {
		return MailHogunionpay;
	}
	
	
	
	//Check the simulation project graph details option(15217)
	
	@FindBy(xpath = "//div[contains(text(),'DVRS2')]")
	private WebElement Digitaltrainsdvrs2project;
	@FindBy(xpath = "//div[contains(text(),'Train1 to train2 impact simulation')]")
	private WebElement Digitaltrainstraintotrainimpactsimulation;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[2]")
	private WebElement Digitaltrainstraintotrainactionbutton;
	@FindBy(xpath = "//a[text()='View Results                                                    ']")
	private WebElement Digitaltrainstraintotrainviewresultoption;
	@FindBy(xpath = "(//div[@class=\"panel panel-default\"])[1]")
	private WebElement Digitaltrainssimulationviewresultpanel;
	@FindBy(xpath = "//button[text()='Graphs ']")
	private WebElement Digitaltrainstraintotraingraphs;
	@FindBy(xpath = "(//ul[@class=\"dropdown-menu\"])[18]")
	private WebElement Digitaltrainsdropdwonpanel;
	@FindBy(xpath = "//a[text()='Cascade Force Time                                        ']")
	private WebElement Digitaltrainstraintotrainforcegraph;
	@FindBy(xpath = "//strong[text()='Train 1, Coupling Interface 2 - Force vs Time']")
	private WebElement Digitaltrainstraintotraingraphscrolldown1;
	@FindBy(xpath = "//h1[contains(text(),'Simulation Results')]")
	private WebElement Digitaltrainssimulationresultscrollup;
	@FindBy(xpath = "//a[text()='Cascade Velocity Time                                        ']")
	private WebElement Digitaltrainstraintotrainvelocitygraph;
	@FindBy(xpath = "//strong[text()='Train 1, Vehicle 2 - Velocity vs Time']")
	private WebElement Digitaltrainstraintotraingraphscrolldown2;
	@FindBy(xpath = "//a[text()='Cascade Acceleration Time                                        ']")
	private WebElement Digitaltrainstraintotrainaccelerationgraph;
	@FindBy(xpath = "//strong[text()='Train 1, Vehicle 3 - Acceleration vs Time']")
	private WebElement Digitaltrainstraintotraingraphscrolldown3;
	@FindBy(xpath = "//a[text()='Cascade Displacement Time                                        ']")
	private WebElement Digitaltrainstraintotraindisplacementgraph;
	@FindBy(xpath = "//strong[text()='Impact Coupling Interface - Displacement vs Time']")
	private WebElement Digitaltrainstraintotraingraphscrolldown4;
	@FindBy(xpath = "//a[text()='Energy Balance                                        ']")
	private WebElement Digitaltrainstraintotrainenergybalance;
	@FindBy(xpath = "//strong[text()='Energy Distribution By Vehicle (kJ)']")
	private WebElement Digitaltrainsenergybalancescroll;
	@FindBy(xpath = "(//button[text()='Cancel'])[7]")
	private WebElement Digitaltrainstraintotrainenergybalancecancel;
	@FindBy(xpath = "//a[text()='Energy Absorbed                                        ']")
	private WebElement Digitaltrainstraintotrainenergyabsorbed;
	@FindBy(xpath = "//div[text()='Coupling Interface']")
	private WebElement Digitaltrainstraintotraincouplinginterfacescrolldown;
	@FindBy(xpath ="//a[text()='Energy Stored                                        ']" )
	private WebElement Digitaltrainstraintotrainenergystored;
	@FindBy(xpath = "//a[text()='Maximum Force                                        ']")
	private WebElement Digitaltrainstraintotrainmaximunforce;




	public WebElement getDigitaltrainssimulationresultscrollup() {
		return Digitaltrainssimulationresultscrollup;
	}

	public WebElement getDigitaltrainsenergybalancescroll() {
		return Digitaltrainsenergybalancescroll;
	}

	public WebElement getDigitaltrainsdropdwonpanel() {
		return Digitaltrainsdropdwonpanel;
	}

	public WebElement getDigitaltrainssimulationviewresultpanel() {
		return Digitaltrainssimulationviewresultpanel;
	}

	public WebElement getDigitaltrainsdvrs2project() {
		return Digitaltrainsdvrs2project;
	}

	public WebElement getDigitaltrainstraintotrainimpactsimulation() {
		return Digitaltrainstraintotrainimpactsimulation;
	}

	public WebElement getDigitaltrainstraintotrainactionbutton() {
		return Digitaltrainstraintotrainactionbutton;
	}

	public WebElement getDigitaltrainstraintotrainviewresultoption() {
		return Digitaltrainstraintotrainviewresultoption;
	}

	public WebElement getDigitaltrainstraintotraingraphs() {
		return Digitaltrainstraintotraingraphs;
	}

	public WebElement getDigitaltrainstraintotrainforcegraph() {
		return Digitaltrainstraintotrainforcegraph;
	}

	public WebElement getDigitaltrainstraintotraingraphscrolldown1() {
		return Digitaltrainstraintotraingraphscrolldown1;
	}

	public WebElement getDigitaltrainstraintotrainvelocitygraph() {
		return Digitaltrainstraintotrainvelocitygraph;
	}

	public WebElement getDigitaltrainstraintotraingraphscrolldown2() {
		return Digitaltrainstraintotraingraphscrolldown2;
	}

	public WebElement getDigitaltrainstraintotrainaccelerationgraph() {
		return Digitaltrainstraintotrainaccelerationgraph;
	}

	public WebElement getDigitaltrainstraintotraingraphscrolldown3() {
		return Digitaltrainstraintotraingraphscrolldown3;
	}

	public WebElement getDigitaltrainstraintotraindisplacementgraph() {
		return Digitaltrainstraintotraindisplacementgraph;
	}

	public WebElement getDigitaltrainstraintotraingraphscrolldown4() {
		return Digitaltrainstraintotraingraphscrolldown4;
	}

	public WebElement getDigitaltrainstraintotrainenergybalance() {
		return Digitaltrainstraintotrainenergybalance;
	}

	public WebElement getDigitaltrainstraintotrainenergybalancecancel() {
		return Digitaltrainstraintotrainenergybalancecancel;
	}

	public WebElement getDigitaltrainstraintotrainenergyabsorbed() {
		return Digitaltrainstraintotrainenergyabsorbed;
	}

	public WebElement getDigitaltrainstraintotraincouplinginterfacescrolldown() {
		return Digitaltrainstraintotraincouplinginterfacescrolldown;
	}

	public WebElement getDigitaltrainstraintotrainenergystored() {
		return Digitaltrainstraintotrainenergystored;
	}

	public WebElement getDigitaltrainstraintotrainmaximunforce() {
		return Digitaltrainstraintotrainmaximunforce;
	}
	
	
	
	
	//Check the simulation additional speed setting option locater (15479)
	
	@FindBy(xpath = "//button[text()='Edit']")
	private WebElement Speedsettingeditoption;
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[2]")
	private WebElement Speedsettingpagecontent;
	@FindBy(xpath = "//span[@class=\"glyphicon glyphicon-plus\"]")
	private WebElement Speedsettingplusbutton;
	@FindBy(xpath = "//input[@name=\"simulation_data[impact_speeds][1][speed]\"]")
	private WebElement Speedsettinginputbox;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement Speedsettingsavebutton;
	@FindBy(xpath = "//a[text()='Simulation Results']")
	private WebElement Speedsettingsimulationresults;
	@FindBy(xpath = "//div[text()='Displacement (mm)']")
	private WebElement Speedsettingsimulationresultsscrolldown;
	@FindBy(xpath = "//select[@name=\"simulation_id\"]")
	private WebElement Speedsettingselectbox;
	@FindBy(xpath = "//option[text()='Speed Setting 3: 50km/h']")
	private WebElement Speedsettingselectsecodoption;




	public WebElement getSpeedsettingeditoption() {
		return Speedsettingeditoption;
	}

	public WebElement getSpeedsettingpagecontent() {
		return Speedsettingpagecontent;
	}

	public WebElement getSpeedsettingplusbutton() {
		return Speedsettingplusbutton;
	}

	public WebElement getSpeedsettinginputbox() {
		return Speedsettinginputbox;
	}

	public WebElement getSpeedsettingsavebutton() {
		return Speedsettingsavebutton;
	}

	public WebElement getSpeedsettingsimulationresults() {
		return Speedsettingsimulationresults;
	}

	public WebElement getSpeedsettingsimulationresultsscrolldown() {
		return Speedsettingsimulationresultsscrolldown;
	}

	public WebElement getSpeedsettingselectbox() {
		return Speedsettingselectbox;
	}

	public WebElement getSpeedsettingselectsecodoption() {
		return Speedsettingselectsecodoption;
	}
	
	
	
	
	//Smoke test locater(15557)
	
	//project
	@FindBy(xpath = "//a[text()='Projects']")
	private WebElement Projectsmoke;
	@FindBy(xpath = "//button[text()='Create Simulation								']")
	private WebElement Projectcreatesimulationsmoke;
	@FindBy(xpath = "//label[@class=\"btn btn-primary text-capitalize w-30\"]")
	private WebElement Projecttrainimpactsimulationsmoke;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary text-capitalize w-35\"])[1]")
	private WebElement Projectbufferstopsimulationsmoke;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary text-capitalize w-35\"])[1]")
	private WebElement Projecttrainrunningsimulationsmoke;
	@FindBy(xpath = "(//button[text()='Cancel'])[6]")
	private WebElement Createsimulationcancelsmoke;
	@FindBy(xpath = "//button[text()='Create Project							']")
	private WebElement createprojectsmoke;
	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
	private WebElement Cancelprojectsmoke;




	public WebElement getCreatesimulationcancelsmoke() {
		return Createsimulationcancelsmoke;
	}

	public WebElement getProjecttrainimpactsimulationsmoke() {
		return Projecttrainimpactsimulationsmoke;
	}

	public WebElement getProjectsmoke() {
		return Projectsmoke;
	}

	public WebElement getProjectcreatesimulationsmoke() {
		return Projectcreatesimulationsmoke;
	}

	public WebElement getProjectbufferstopsimulationsmoke() {
		return Projectbufferstopsimulationsmoke;
	}

	public WebElement getProjecttrainrunningsimulationsmoke() {
		return Projecttrainrunningsimulationsmoke;
	}

	public WebElement getCreateprojectsmoke() {
		return createprojectsmoke;
	}

	public WebElement getCancelprojectsmoke() {
		return Cancelprojectsmoke;
	}
	
	
	//Train 
	
	@FindBy(xpath = "//a[text()='Trains']")
	private WebElement Trainsmoke;
	@FindBy(xpath = "//button[@class=\"btn btn-primary dropdown-toggle\"]")
	private WebElement Traindropdownbutton;
	@FindBy(xpath = "//a[text()='Create With Train Builder']")
	private WebElement Creatwithtrainbuildersmoke;
	@FindBy(xpath = "//a[text()='Return To Trains        ']")
	private WebElement Returntotrainbuttonsmoke;
	@FindBy(xpath = "//a[text()='Create With Vehicles']")
	private WebElement Copyfromlibrarysmoke;
	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	private WebElement Cancelbuttononetrainsmoke;
	@FindBy(xpath = "//a[text()='Create With Vehicles']")
	private WebElement Createwithvehiclesmoke;
	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
	private WebElement Cancelbuttontwotrainsmoke;




	public WebElement getTrainsmoke() {
		return Trainsmoke;
	}

	public WebElement getTraindropdownbutton() {
		return Traindropdownbutton;
	}

	public WebElement getCreatwithtrainbuildersmoke() {
		return Creatwithtrainbuildersmoke;
	}

	public WebElement getReturntotrainbuttonsmoke() {
		return Returntotrainbuttonsmoke;
	}

	public WebElement getCopyfromlibrarysmoke() {
		return Copyfromlibrarysmoke;
	}

	public WebElement getCancelbuttononetrainsmoke() {
		return Cancelbuttononetrainsmoke;
	}

	public WebElement getCreatewithvehiclesmoke() {
		return Createwithvehiclesmoke;
	}

	public WebElement getCancelbuttontwotrainsmoke() {
		return Cancelbuttontwotrainsmoke;
	}

	
	//Vehicle
	
	@FindBy(xpath = "//a[text()='Vehicles']")
	private WebElement Vehiclessmoke;
	@FindBy(xpath = "//button[text()='Create Vehicle							']")
	private WebElement Createvehiclesmoke;
	@FindBy(xpath = "(//button[text()='Cancel'])[8]")
	private WebElement Cancelbuttonvehiclesmoke;




	public WebElement getVehiclessmoke() {
		return Vehiclessmoke;
	}

	public WebElement getCreatevehiclesmoke() {
		return Createvehiclesmoke;
	}

	public WebElement getCancelbuttonvehiclesmoke() {
		return Cancelbuttonvehiclesmoke;
	}
	
	
	
	//Wheel and rail
	
	@FindBy(xpath = "//a[text()='Wheels/Rails']")
	private WebElement Wheelrailsmoke;
	@FindBy(xpath = "//a[text()='Profiles']")
	private WebElement Profilesmoke;
	@FindBy(xpath = "//button[text()='Create Profile							']")
	private WebElement Createprofilesmoke;
	@FindBy(xpath = "(//span[contains(text(),'Wheel')])[1]")
	private WebElement Wheelprofilesmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[2]")
	private WebElement Wheelprofilecancelsmoke;
	@FindBy(xpath = "(//span[contains(text(),'Rail')])[1]")
	private WebElement Railprofilesmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[3]")
	private WebElement Railprofilecancelsmoke;
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement Wheelrailcontactsmoke;
    @FindBy(xpath = "//button[text()='Create Contact							']")
    private WebElement WheelrailCreatecontactsmoke;
    @FindBy(xpath = "(//button[text()='Cancel'])[1]")
    private WebElement Wheelrailcontactcancelsmoke;



	

	public WebElement getWheelrailcontactsmoke() {
		return Wheelrailcontactsmoke;
	}

	public WebElement getWheelrailCreatecontactsmoke() {
		return WheelrailCreatecontactsmoke;
	}

	public WebElement getWheelrailcontactcancelsmoke() {
		return Wheelrailcontactcancelsmoke;
	}

	public WebElement getWheelrailsmoke() {
		return Wheelrailsmoke;
	}

	public WebElement getProfilesmoke() {
		return Profilesmoke;
	}

	public WebElement getCreateprofilesmoke() {
		return Createprofilesmoke;
	}

	public WebElement getWheelprofilesmoke() {
		return Wheelprofilesmoke;
	}

	public WebElement getWheelprofilecancelsmoke() {
		return Wheelprofilecancelsmoke;
	}

	public WebElement getRailprofilesmoke() {
		return Railprofilesmoke;
	}

	public WebElement getRailprofilecancelsmoke() {
		return Railprofilecancelsmoke;
	}
	
	
	//Bogie
	
	@FindBy(xpath = "//a[text()='Bogies']")
	private WebElement Bogiesmoke;
	@FindBy(xpath = "//a[text()='Assemblies']")
	private WebElement Bogieassembliesmoke;
	@FindBy(xpath = "//button[text()='Create Bogie						']")
	private WebElement Bogiecreatebogiesmoke;
	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
	private WebElement Bogiecreatebogiecancelbuttonsmoke;
	@FindBy(xpath = "//a[text()='Parts']")
	private WebElement Bogiepartsmoke;
	@FindBy(xpath = "//button[text()='Create Part						']")
	private WebElement Bogiecreatepartsmoke;
	@FindBy(xpath = "(//span[contains(text(),'Mass')])[1]")
	private WebElement Bogiemasssmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[2]")
	private WebElement Bogiemasscancelsmoke;
	@FindBy(xpath = "(//span[contains(text(),'Wheelset')])[1]")
	private WebElement Bogiewheelsetsmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[3]")
	private WebElement Bogiewheelsetcancelsmoke;
	@FindBy(xpath = "(//span[contains(text(),'Air Spring')])[1]")
	private WebElement Bogieairspringsmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[4]")
	private WebElement Bogieairspringcancelsmoke;
	@FindBy(xpath = "(//span[contains(text(),'Bumpstop')])[1]")
	private WebElement Bogiebumpstopsmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[5]")
	private WebElement Bogiebumpstopcancelsmoke;
	@FindBy(xpath = "(//span[contains(text(),'Bush')])[1]")
	private WebElement Bogiebushsmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[6]")
	private WebElement Bogiebushcancelsmoke;
	@FindBy(xpath = "(//span[contains(text(),'Damper')])[1]")
	private WebElement Bogiedampersmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[7]")
	private WebElement Bogiedampercancelsmoke;
	@FindBy(xpath = "(//span[contains(text(),'Friction')])[1]")
	private WebElement Bogiefrictionsmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[8]")
	private WebElement Bogiefrictioncancelsmoke;
	@FindBy(xpath = "(//span[contains(text(),'Pinlink')])[1]")
	private WebElement Bogiepinlinksmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[9]")
	private WebElement Bogiepinlinkcancelsmoke;
	@FindBy(xpath = "(//span[contains(text(),'Stiffness')])[1]")
	private WebElement Bogiestiffnesssmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[10]")
	private WebElement Bogiestiffnesscancelsmoke;
	@FindBy(xpath = "(//span[contains(text(),'Shear Spring')])[1]")
	private WebElement Bogieshearspringsmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[11]")
	private WebElement Bogieshearspringcancelsmoke;
	@FindBy(xpath = "(//span[contains(text(),'Hysteresis')])[1]")
	private WebElement Bogiehysteresissmoke;
	@FindBy(xpath = "(//button[@class=\"btn btn-default pull-left cancel\"])[12]")
	private WebElement Bogiehysteresiscancelsmoke;




	public WebElement getBogiesmoke() {
		return Bogiesmoke;
	}

	public WebElement getBogieassembliesmoke() {
		return Bogieassembliesmoke;
	}

	public WebElement getBogiecreatebogiesmoke() {
		return Bogiecreatebogiesmoke;
	}

	public WebElement getBogiecreatebogiecancelbuttonsmoke() {
		return Bogiecreatebogiecancelbuttonsmoke;
	}

	public WebElement getBogiepartsmoke() {
		return Bogiepartsmoke;
	}

	public WebElement getBogiecreatepartsmoke() {
		return Bogiecreatepartsmoke;
	}

	public WebElement getBogiemasssmoke() {
		return Bogiemasssmoke;
	}

	public WebElement getBogiemasscancelsmoke() {
		return Bogiemasscancelsmoke;
	}

	public WebElement getBogiewheelsetsmoke() {
		return Bogiewheelsetsmoke;
	}

	public WebElement getBogiewheelsetcancelsmoke() {
		return Bogiewheelsetcancelsmoke;
	}

	public WebElement getBogieairspringsmoke() {
		return Bogieairspringsmoke;
	}

	public WebElement getBogieairspringcancelsmoke() {
		return Bogieairspringcancelsmoke;
	}

	public WebElement getBogiebumpstopsmoke() {
		return Bogiebumpstopsmoke;
	}

	public WebElement getBogiebumpstopcancelsmoke() {
		return Bogiebumpstopcancelsmoke;
	}

	public WebElement getBogiebushsmoke() {
		return Bogiebushsmoke;
	}

	public WebElement getBogiebushcancelsmoke() {
		return Bogiebushcancelsmoke;
	}

	public WebElement getBogiedampersmoke() {
		return Bogiedampersmoke;
	}

	public WebElement getBogiedampercancelsmoke() {
		return Bogiedampercancelsmoke;
	}

	public WebElement getBogiefrictionsmoke() {
		return Bogiefrictionsmoke;
	}

	public WebElement getBogiefrictioncancelsmoke() {
		return Bogiefrictioncancelsmoke;
	}

	public WebElement getBogiepinlinksmoke() {
		return Bogiepinlinksmoke;
	}

	public WebElement getBogiepinlinkcancelsmoke() {
		return Bogiepinlinkcancelsmoke;
	}

	public WebElement getBogiestiffnesssmoke() {
		return Bogiestiffnesssmoke;
	}

	public WebElement getBogiestiffnesscancelsmoke() {
		return Bogiestiffnesscancelsmoke;
	}

	public WebElement getBogieshearspringsmoke() {
		return Bogieshearspringsmoke;
	}

	public WebElement getBogieshearspringcancelsmoke() {
		return Bogieshearspringcancelsmoke;
	}

	public WebElement getBogiehysteresissmoke() {
		return Bogiehysteresissmoke;
	}

	public WebElement getBogiehysteresiscancelsmoke() {
		return Bogiehysteresiscancelsmoke;
	}
	
	
	
	//Gauges
	
	@FindBy(xpath = "//a[text()='Gauges']")
	private WebElement Gaugessmoke;
	@FindBy(xpath = "//button[text()='Create Gauge							']")
	private WebElement Creategaugesmoke;
	@FindBy(xpath = "(//span[contains(text(),'Vehicle')])[1]")
	private WebElement Createvehiclegaugesmoke;
	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	private WebElement Createvehiclegaugecancel;
	@FindBy(xpath = "(//span[contains(text(),'Structural')])[1]")
	private WebElement Createstructuralgaugesmoke;
	@FindBy(xpath = "(//button[text()='Cancel'])[3]")
	private WebElement Createstructuralgaugecancel;




	public WebElement getGaugessmoke() {
		return Gaugessmoke;
	}

	public WebElement getCreategaugesmoke() {
		return Creategaugesmoke;
	}

	public WebElement getCreatevehiclegaugesmoke() {
		return Createvehiclegaugesmoke;
	}

	public WebElement getCreatevehiclegaugecancel() {
		return Createvehiclegaugecancel;
	}

	public WebElement getCreatestructuralgaugesmoke() {
		return Createstructuralgaugesmoke;
	}

	public WebElement getCreatestructuralgaugecancel() {
		return Createstructuralgaugecancel;
	}
	
	
	//Route profile
	
	@FindBy(xpath = "//a[text()='Route Profiles']")
	private WebElement Routeprofilesmoke;
	@FindBy(xpath = "//button[text()='Create Route Profile							']")
	private WebElement Createrouteprofilesmoke;
	@FindBy(xpath = "//span[contains(text(),'Manual')]")
	private WebElement Manualrouteprofilesmoke;
	@FindBy(xpath = "//span[contains(text(),'Map')]")
	private WebElement Maprouteprofilesmoke;




	public WebElement getRouteprofilesmoke() {
		return Routeprofilesmoke;
	}

	public WebElement getCreaterouteprofilesmoke() {
		return Createrouteprofilesmoke;
	}

	public WebElement getManualrouteprofilesmoke() {
		return Manualrouteprofilesmoke;
	}

	public WebElement getMaprouteprofilesmoke() {
		return Maprouteprofilesmoke;
	}
	
	
	
	
	//Buffer stop
	
	@FindBy(xpath = "//a[text()='Buffer Stops']")
	private WebElement Bufferstopsmoke;
	@FindBy(xpath = "//button[text()='Create Buffer Stop							']")
	private WebElement Createbufferstopsmoke;
	@FindBy(xpath = "(//button[text()='Cancel'])[6]")
	private WebElement Cancelbufferstopsmoke;




	public WebElement getBufferstopsmoke() {
		return Bufferstopsmoke;
	}

	public WebElement getCreatebufferstopsmoke() {
		return Createbufferstopsmoke;
	}

	public WebElement getCancelbufferstopsmoke() {
		return Cancelbufferstopsmoke;
	}
	
	
	
	
	//Coupling Interface
	
	@FindBy(xpath = "//a[text()='Coupling Interfaces']")
	private WebElement Couplinginterfacesmoke;
	@FindBy(xpath = "//button[text()='Create Coupling Interface							']")
	private WebElement Createcouplinginterfacesmoke;
	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
	private WebElement Cancelcouplininterfacesmoke;




	public WebElement getCouplinginterfacesmoke() {
		return Couplinginterfacesmoke;
	}

	public WebElement getCreatecouplinginterfacesmoke() {
		return Createcouplinginterfacesmoke;
	}

	public WebElement getCancelcouplininterfacesmoke() {
		return Cancelcouplininterfacesmoke;
	}
	
	
	
	//Device
	
	@FindBy(xpath = "//a[text()='Devices']")
	private WebElement Devicesmoke;
	@FindBy(xpath = "//button[text()='Create Device							']")
	private WebElement Createdevicesmoke;
	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
	private WebElement Canceldevicesmoke;




	public WebElement getDevicesmoke() {
		return Devicesmoke;
	}

	public WebElement getCreatedevicesmoke() {
		return Createdevicesmoke;
	}

	public WebElement getCanceldevicesmoke() {
		return Canceldevicesmoke;
	}
	
	
	
	//Shared library
	
	@FindBy(xpath = "//a[text()='Shared Library']")
	private WebElement Sharedlibrarysmoke;
	@FindBy(xpath = "//span[text()='Trains']")
	private WebElement Trainsharedlibrarysmoke;
	@FindBy(xpath = "//span[text()='Vehicles']")
	private WebElement Vehiclesheardlibrarysmoke;




	public WebElement getSharedlibrarysmoke() {
		return Sharedlibrarysmoke;
	}

	public WebElement getTrainsharedlibrarysmoke() {
		return Trainsharedlibrarysmoke;
	}

	public WebElement getVehiclesheardlibrarysmoke() {
		return Vehiclesheardlibrarysmoke;
	}
	
	
	
	
	// Dash board 
	
	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement Dashboardsmoke;
	@FindBy(xpath = "//div[@class=\"main-body \"]")
	private WebElement Mainbodydashboardsmoke;



	public WebElement getDashboardsmoke() {
		return Dashboardsmoke;
	}

	public WebElement getMainbodydashboardsmoke() {
		return Mainbodydashboardsmoke;
	}
	
	
	
	
	//Simulation Result under gauges option locater
	
	@FindBy(xpath = "//a[text()='Vehicles']")
	private WebElement Simulationresultgaugesvehicleoption;
	@FindBy(xpath = "//div[contains(text(),'My vehicle')]")
	private WebElement Simulationresultgaugesmyvehicle;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Simulationresultgaugesactions;
	@FindBy(xpath = "(//a[text()='Edit Vehicle													'])[1]")
	private WebElement Simulationresultgaugeseditvehicle;
	@FindBy(xpath = "(//span[@class=\"select2-selection select2-selection--single\"])[1]")
	private WebElement Simulationresultgaugesboxinvehicle;
	@FindBy(xpath = "//li[text()='Y26vehicle gauges']")
	private WebElement Simulationresultgaugesy26;
	@FindBy(xpath = "//a[text()='Save']")
	private WebElement Simulationresultgauesvehicledsave;
	@FindBy(xpath = "//a[text()='Trains']")
	private WebElement Simulationresultgaugestrain;
	@FindBy(xpath = "//div[contains(text(),'My train')]")
	private WebElement Simulationresultgaugesmytain;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement Simulationresultgaugestrainaction;
	@FindBy(xpath = "//a[text()='Edit Train													']")
	private WebElement Simulationresultgaugesedittrain;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[3]")
	private WebElement Simulationresultgaugesselecttrainbox;
	@FindBy(xpath = "//li[text()='My vehicle']")
	private WebElement Simulationresultgaugesselectmyvehicle;
	@FindBy(xpath = "//a[contains(text(),'2')]")
	private WebElement Simulationresultgaugesselect2cabin;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[5]")
	private WebElement Simulationresultgaugesselecttrainboxtwo;
	@FindBy(xpath = "//a[contains(text(),'3')]")
	private WebElement Simulationresultgaugesselect3cabin;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[6]")
	private WebElement Simulationresultgaugesselecttrainboxthree;
	@FindBy(xpath = "//a[contains(text(),'4')]")
	private WebElement Simulationresultgaugesselect4cabin;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[7]")
	private WebElement Simulationresultgaugesselecttrainboxfour;
	@FindBy(xpath = "(//a[text()='Save'])[1]")
	private WebElement Simulationresultgaugessavetrain;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement Simulationresultgaugesconformsavetrain;
	@FindBy(xpath = "//a[text()='Projects']")
	private WebElement Simulationresultgaugesproject;
	@FindBy(xpath = "//div[contains(text(),'DVRS 1')]")
	private WebElement SimulationresultgaugesDVRS1project;
	@FindBy(xpath = "//div[contains(text(),'Running Train')]")
	private WebElement Simulationresultgaugesrunningtrain;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[3]")
	private WebElement Simulationresultgaugesrunningtainaction;
	@FindBy(xpath = "(//a[text()='Edit Simulation												'])[1]")
	private WebElement Simulationresultgaugesrunningtraineditoption;
	@FindBy(xpath = "//span[text()='My train']")
	private WebElement Simulationresultgaugesrunningtrainselecttrainbox;
	@FindBy(xpath = "(//li[text()='My train'])[1]")
	private WebElement Simulationresultgaugesrunningtrainmytrain;
	@FindBy(xpath = "//span[text()='11']")
	private WebElement Simulationresultgaugesrunningtrainselectrouteprofile;
	@FindBy(xpath = "//li[text()='Tunnel Added Reverse curve route']")
	private WebElement Simulationresultgaugesrunningtraintunneladdedrouteprofile;
	@FindBy(xpath = "//button[contains(text(),'Save & Run Simulation')]")
	private WebElement Simulationresultgaugessaveandrunsimulation;
	@FindBy(xpath = "//a[text()='Simulation Results']")
	private WebElement Simulationresultgaugessimulationresultsbutton;
	@FindBy(xpath = "//a[text()='Gauging                ']")
	private WebElement Simulationresultgaugesoption;
	@FindBy(xpath = "//a[text()='Clearance']")
	private WebElement Simulationresultgaugesclearance;
	@FindBy(xpath = "//a[text()='3D Swept Path']")
	private WebElement Simulationresultgauges3Dsweptpath;
	@FindBy(xpath = "//i[@class=\"glyphicon glyphicon-fullscreen\"]")
	private WebElement Simulationresultgaugesfullscreen;
	@FindBy(xpath = "//i[@class=\"glyphicon glyphicon-play\"]")
	private WebElement Simulationresultgaugesplaybutton;
	@FindBy(xpath = "//i[@class=\"glyphicon glyphicon-remove-circle\"]")
	private WebElement Simulationresultgaugesremovefullscreen;




	public WebElement getSimulationresultgaugesselecttrainboxtwo() {
		return Simulationresultgaugesselecttrainboxtwo;
	}

	public WebElement getSimulationresultgaugesselecttrainboxthree() {
		return Simulationresultgaugesselecttrainboxthree;
	}

	public WebElement getSimulationresultgaugesselecttrainboxfour() {
		return Simulationresultgaugesselecttrainboxfour;
	}

	public WebElement getSimulationresultgaugesvehicleoption() {
		return Simulationresultgaugesvehicleoption;
	}

	public WebElement getSimulationresultgaugesmyvehicle() {
		return Simulationresultgaugesmyvehicle;
	}

	public WebElement getSimulationresultgaugesactions() {
		return Simulationresultgaugesactions;
	}

	public WebElement getSimulationresultgaugeseditvehicle() {
		return Simulationresultgaugeseditvehicle;
	}

	public WebElement getSimulationresultgaugesboxinvehicle() {
		return Simulationresultgaugesboxinvehicle;
	}

	public WebElement getSimulationresultgaugesy26() {
		return Simulationresultgaugesy26;
	}

	public WebElement getSimulationresultgauesvehicledsave() {
		return Simulationresultgauesvehicledsave;
	}

	public WebElement getSimulationresultgaugestrain() {
		return Simulationresultgaugestrain;
	}

	public WebElement getSimulationresultgaugesmytain() {
		return Simulationresultgaugesmytain;
	}

	public WebElement getSimulationresultgaugestrainaction() {
		return Simulationresultgaugestrainaction;
	}

	public WebElement getSimulationresultgaugesedittrain() {
		return Simulationresultgaugesedittrain;
	}

	public WebElement getSimulationresultgaugesselecttrainbox() {
		return Simulationresultgaugesselecttrainbox;
	}

	public WebElement getSimulationresultgaugesselectmyvehicle() {
		return Simulationresultgaugesselectmyvehicle;
	}

	public WebElement getSimulationresultgaugesselect2cabin() {
		return Simulationresultgaugesselect2cabin;
	}

	public WebElement getSimulationresultgaugesselect3cabin() {
		return Simulationresultgaugesselect3cabin;
	}

	public WebElement getSimulationresultgaugesselect4cabin() {
		return Simulationresultgaugesselect4cabin;
	}

	public WebElement getSimulationresultgaugessavetrain() {
		return Simulationresultgaugessavetrain;
	}

	public WebElement getSimulationresultgaugesconformsavetrain() {
		return Simulationresultgaugesconformsavetrain;
	}

	public WebElement getSimulationresultgaugesproject() {
		return Simulationresultgaugesproject;
	}

	public WebElement getSimulationresultgaugesDVRS1project() {
		return SimulationresultgaugesDVRS1project;
	}

	public WebElement getSimulationresultgaugesrunningtrain() {
		return Simulationresultgaugesrunningtrain;
	}

	public WebElement getSimulationresultgaugesrunningtainaction() {
		return Simulationresultgaugesrunningtainaction;
	}

	public WebElement getSimulationresultgaugesrunningtraineditoption() {
		return Simulationresultgaugesrunningtraineditoption;
	}

	public WebElement getSimulationresultgaugesrunningtrainselecttrainbox() {
		return Simulationresultgaugesrunningtrainselecttrainbox;
	}

	public WebElement getSimulationresultgaugesrunningtrainmytrain() {
		return Simulationresultgaugesrunningtrainmytrain;
	}

	public WebElement getSimulationresultgaugesrunningtrainselectrouteprofile() {
		return Simulationresultgaugesrunningtrainselectrouteprofile;
	}

	public WebElement getSimulationresultgaugesrunningtraintunneladdedrouteprofile() {
		return Simulationresultgaugesrunningtraintunneladdedrouteprofile;
	}

	public WebElement getSimulationresultgaugessaveandrunsimulation() {
		return Simulationresultgaugessaveandrunsimulation;
	}

	public WebElement getSimulationresultgaugessimulationresultsbutton() {
		return Simulationresultgaugessimulationresultsbutton;
	}

	public WebElement getSimulationresultgaugesoption() {
		return Simulationresultgaugesoption;
	}

	public WebElement getSimulationresultgaugesclearance() {
		return Simulationresultgaugesclearance;
	}

	public WebElement getSimulationresultgauges3Dsweptpath() {
		return Simulationresultgauges3Dsweptpath;
	}

	public WebElement getSimulationresultgaugesfullscreen() {
		return Simulationresultgaugesfullscreen;
	}

	public WebElement getSimulationresultgaugesplaybutton() {
		return Simulationresultgaugesplaybutton;
	}

	public WebElement getSimulationresultgaugesremovefullscreen() {
		return Simulationresultgaugesremovefullscreen;
	}
	
	
	
	//Creating the slanding route profile
	
	@FindBy(xpath = "//a[text()='Route Profiles']")
	private WebElement Slandingrouteprofile;
	@FindBy(xpath = "//button[text()='Create Route Profile							']")
	private WebElement Slandingcreaterouteprofile;
	@FindBy(xpath = "//a[@data-title=\"Manual Profile Route\"]")
	private WebElement Slandingmanualrouteprofile;
	@FindBy(xpath = "//a[text()='Manual Input Data']")
	private WebElement Slandingmanualinputdata;
	@FindBy(id = "has_vertical")
	private WebElement Slandingmanualverticalcheckbox;
	@FindBy(xpath = "(//button[@class=\"btn btn-sm btn-success btn-block glyphicon glyphicon-plus jqMultiDataAdd mt-0\"])[1]")
	private WebElement Slandingmanualverticalplusbutton;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][0][distance]\"]")
	private WebElement Slandingdistanceboxone;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][1][distance]\"]")
	private WebElement Slandingdistanceboxtwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][2][distance]\"]")
	private WebElement Slandingdistanceboxthree;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][3][distance]\"]")
	private WebElement Slandingdistanceboxfour;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][4][distance]\"]")
	private WebElement Slandingdistanceboxfive;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][5][distance]\"]")
	private WebElement Slandingdistanceboxsix;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][1][gradient]\"]")
	private WebElement Slandinggradientboxtwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][2][gradient]\"]")
	private WebElement Slandinggradientboxthree;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][3][gradient]\"]")
	private WebElement Slandinggradientboxfour;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][4][gradient]\"]")
	private WebElement Slandinggradientboxfive;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][5][gradient]\"]")
	private WebElement Slandinggradientboxsix;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][0][radius]\"]")
	private WebElement Slandingconnectingradiusone;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][1][radius]\"]")
	private WebElement Slandingconnectingradiustwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][2][radius]\"]")
	private WebElement Slandingconnectingradiusthree;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][3][radius]\"]")
	private WebElement Slandingconnectingradiusfour;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][4][radius]\"]")
	private WebElement Slandingconnectingradiusfive;
	@FindBy(xpath = "//input[@name=\"terrain_data[vertical_profile][5][radius]\"]")
	private WebElement Slandingconnectingradiussix;
	@FindBy(xpath = "//a[contains(text(),'Horizontal Profile')]")
	private WebElement Slandinghorizontalprofile;
	@FindBy(xpath = "//label[text()=' Terrain has horizontal profile                                                                        ']")
	private WebElement Slandinghorizontalcheckbox;
	@FindBy(xpath = "//button[@class=\"btn btn-sm btn-success glyphicon glyphicon-plus jqMultiDataAdd mt-0\"]")
	private WebElement Slandinghorizontalplusbutton;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][0][straight]\"]")
	private WebElement Slandinghorizontalstraightone;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][1][straight]\"]")
	private WebElement Slandinghorizontalstraighttwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][2][straight]\"]")
	private WebElement Slandinghorizontalstraightthree;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][0][radius]\"]")
	private WebElement Slandinghorizontalcurveradiusone;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][1][radius]\"]")
	private WebElement Slandinghorizontalcurveradiustwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][2][radius]\"]")
	private WebElement Slandinghorizontalcurveradiusthree;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][0][angle]\"]")
	private WebElement Slandinghorizontalcurveangleone;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][1][angle]\"]")
	private WebElement Slandinghorizontalcurveangletwo;
	@FindBy(xpath = "//input[@name=\"terrain_data[horizontal_profile][2][angle]\"]")
	private WebElement Slandinghorizontalcurveanglethree;
	@FindBy(xpath = "(//button[@class=\"btn btn-sm btn-info glyphicon glyphicon-cog jqMultiDataOptions mt-0\"])[1]")
	private WebElement Slandinghorizontalsettingone;
	@FindBy(xpath = "(//button[@class=\"btn btn-sm btn-info glyphicon glyphicon-cog jqMultiDataOptions mt-0\"])[2]")
	private WebElement Slandinghorizontalsettingtwo;
	@FindBy(xpath = "(//button[@class=\"btn btn-sm btn-info glyphicon glyphicon-cog jqMultiDataOptions mt-0\"])[3]")
	private WebElement Slandinghorizontalsettingthree;
	@FindBy(xpath = "//input[@name=\"unlock_gradient\"]")
	private WebElement Slandinghorizontalsetspesificgradientcheckbox;
	@FindBy(xpath = "//a[text()='Calculate Transition Curve                        ']")
	private WebElement Slandinghorizontalcalculatetransition;
	@FindBy(xpath = "//input[@name=\"curve_in_length\"]")
	private WebElement Slandinghorizontaltransitionin;
	@FindBy(xpath = "//input[@name=\"curve_out_length\"]")
	private WebElement Slandinghorizontaltransitionout;
	@FindBy(xpath = "//a[text()='Insert Transition                        ']")
	private WebElement Slandinghorizontaltansitioninsert;
	@FindBy(xpath = "//a[text()='Refresh Terrain plot                                                            ']")
	private WebElement Slandingprofilerefresh;
	@FindBy(xpath = "(//label[text()='Total Distance'])[1]")
	private WebElement Slandingverticaltotaldistance;
	@FindBy(xpath = "(//label[text()='Total Distance'])[2]")
	private WebElement Slandinghorizontaltotaldistance;
	@FindBy(xpath = "//a[text()='Location Settings']")
	private WebElement Slandingloactionsetting;
	@FindBy(xpath = "//input[@class=\"form-control input-md text-right jqMapStartLat\"]")
	private WebElement Slandingprofilelatitude;
	@FindBy(xpath = "//input[@class=\"form-control input-md text-right jqMapStartLong\"]")
	private WebElement Slandingprofilelongtitude;
	@FindBy(xpath = "//input[@name=\"terrain_data[manual_terrain_heading]\"]")
	private WebElement Slandingprofileheading;
	@FindBy(xpath = "//a[text()='Set Coordinates                                                                ']")
	private WebElement Slandingprofilesetcoordinates;
	@FindBy(xpath = "//a[text()='Map                                                ']")
	private WebElement Slandingprofilemapview;
	@FindBy(xpath = "//label[text()='Distance Units:']")
	private WebElement Slandingprofiledistanceunitsscrollup;
	@FindBy(xpath = "//input[@class=\"form-control w-70\"]")
	private WebElement Slandingprofilenamebox;
	@FindBy(xpath = "(//button[text()='Save'])[1]")
	private WebElement Slandingprofilesavebutton;




	public WebElement getSlandingrouteprofile() {
		return Slandingrouteprofile;
	}

	public WebElement getSlandingcreaterouteprofile() {
		return Slandingcreaterouteprofile;
	}

	public WebElement getSlandingmanualrouteprofile() {
		return Slandingmanualrouteprofile;
	}

	public WebElement getSlandingmanualinputdata() {
		return Slandingmanualinputdata;
	}

	public WebElement getSlandingmanualverticalcheckbox() {
		return Slandingmanualverticalcheckbox;
	}

	public WebElement getSlandingmanualverticalplusbutton() {
		return Slandingmanualverticalplusbutton;
	}

	public WebElement getSlandingdistanceboxone() {
		return Slandingdistanceboxone;
	}

	public WebElement getSlandingdistanceboxtwo() {
		return Slandingdistanceboxtwo;
	}

	public WebElement getSlandingdistanceboxthree() {
		return Slandingdistanceboxthree;
	}

	public WebElement getSlandingdistanceboxfour() {
		return Slandingdistanceboxfour;
	}

	public WebElement getSlandingdistanceboxfive() {
		return Slandingdistanceboxfive;
	}

	public WebElement getSlandingdistanceboxsix() {
		return Slandingdistanceboxsix;
	}

	public WebElement getSlandinggradientboxtwo() {
		return Slandinggradientboxtwo;
	}

	public WebElement getSlandinggradientboxthree() {
		return Slandinggradientboxthree;
	}

	public WebElement getSlandinggradientboxfour() {
		return Slandinggradientboxfour;
	}

	public WebElement getSlandinggradientboxfive() {
		return Slandinggradientboxfive;
	}

	public WebElement getSlandinggradientboxsix() {
		return Slandinggradientboxsix;
	}

	public WebElement getSlandingconnectingradiusone() {
		return Slandingconnectingradiusone;
	}

	public WebElement getSlandingconnectingradiustwo() {
		return Slandingconnectingradiustwo;
	}

	public WebElement getSlandingconnectingradiusthree() {
		return Slandingconnectingradiusthree;
	}

	public WebElement getSlandingconnectingradiusfour() {
		return Slandingconnectingradiusfour;
	}

	public WebElement getSlandingconnectingradiusfive() {
		return Slandingconnectingradiusfive;
	}

	public WebElement getSlandingconnectingradiussix() {
		return Slandingconnectingradiussix;
	}

	public WebElement getSlandinghorizontalprofile() {
		return Slandinghorizontalprofile;
	}

	public WebElement getSlandinghorizontalcheckbox() {
		return Slandinghorizontalcheckbox;
	}

	public WebElement getSlandinghorizontalplusbutton() {
		return Slandinghorizontalplusbutton;
	}

	public WebElement getSlandinghorizontalstraightone() {
		return Slandinghorizontalstraightone;
	}

	public WebElement getSlandinghorizontalstraighttwo() {
		return Slandinghorizontalstraighttwo;
	}

	public WebElement getSlandinghorizontalstraightthree() {
		return Slandinghorizontalstraightthree;
	}

	public WebElement getSlandinghorizontalcurveradiusone() {
		return Slandinghorizontalcurveradiusone;
	}

	public WebElement getSlandinghorizontalcurveradiustwo() {
		return Slandinghorizontalcurveradiustwo;
	}

	public WebElement getSlandinghorizontalcurveradiusthree() {
		return Slandinghorizontalcurveradiusthree;
	}

	public WebElement getSlandinghorizontalcurveangleone() {
		return Slandinghorizontalcurveangleone;
	}

	public WebElement getSlandinghorizontalcurveangletwo() {
		return Slandinghorizontalcurveangletwo;
	}

	public WebElement getSlandinghorizontalcurveanglethree() {
		return Slandinghorizontalcurveanglethree;
	}

	public WebElement getSlandinghorizontalsettingone() {
		return Slandinghorizontalsettingone;
	}

	public WebElement getSlandinghorizontalsettingtwo() {
		return Slandinghorizontalsettingtwo;
	}

	public WebElement getSlandinghorizontalsettingthree() {
		return Slandinghorizontalsettingthree;
	}

	public WebElement getSlandinghorizontalsetspesificgradientcheckbox() {
		return Slandinghorizontalsetspesificgradientcheckbox;
	}

	public WebElement getSlandinghorizontalcalculatetransition() {
		return Slandinghorizontalcalculatetransition;
	}

	public WebElement getSlandinghorizontaltransitionin() {
		return Slandinghorizontaltransitionin;
	}

	public WebElement getSlandinghorizontaltransitionout() {
		return Slandinghorizontaltransitionout;
	}

	public WebElement getSlandinghorizontaltansitioninsert() {
		return Slandinghorizontaltansitioninsert;
	}

	public WebElement getSlandingprofilerefresh() {
		return Slandingprofilerefresh;
	}

	public WebElement getSlandingverticaltotaldistance() {
		return Slandingverticaltotaldistance;
	}

	public WebElement getSlandinghorizontaltotaldistance() {
		return Slandinghorizontaltotaldistance;
	}

	public WebElement getSlandingloactionsetting() {
		return Slandingloactionsetting;
	}

	public WebElement getSlandingprofilelatitude() {
		return Slandingprofilelatitude;
	}

	public WebElement getSlandingprofilelongtitude() {
		return Slandingprofilelongtitude;
	}

	public WebElement getSlandingprofileheading() {
		return Slandingprofileheading;
	}

	public WebElement getSlandingprofilesetcoordinates() {
		return Slandingprofilesetcoordinates;
	}

	public WebElement getSlandingprofilemapview() {
		return Slandingprofilemapview;
	}

	public WebElement getSlandingprofiledistanceunitsscrollup() {
		return Slandingprofiledistanceunitsscrollup;
	}

	public WebElement getSlandingprofilenamebox() {
		return Slandingprofilenamebox;
	}

	public WebElement getSlandingprofilesavebutton() {
		return Slandingprofilesavebutton;
	}



	//Check the vehicle suspension CoG Z is not accept the bellow wheel diameter value locater
	//(balance locater tack to this line 7809)
	
	@FindBy(xpath = "//li[text()='Must be greater than or equal to Wheel Diameter']")
	private WebElement Vehiclecogzerror;
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[8]")
	private WebElement Vehicleheader;




	public WebElement getVehiclecogzerror() {
		return Vehiclecogzerror;
	}

	public WebElement getVehicleheader() {
		return Vehicleheader;
	}
	
	
	//Check the all duplicate option is not allow to save the same name locater
	
	//project duplicate locater
	@FindBy(xpath = "//div[contains(text(),'Impact test')]")
	private WebElement Duplicateimpacttest;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[4]")
	private WebElement Duplicateimpacttestaction;
	@FindBy(xpath = "(//a[text()='Duplicate Simulation                                                    '])[2]")
	private WebElement Proijectduplicatoption;
	@FindBy(xpath = "//span[text()='DVRS 1']")
	private WebElement ProjectDvrs1;
	@FindBy(xpath = "//li[text()='DVRS2']")
	private WebElement ProjectDvrs2;
	@FindBy(xpath = "(//button[text()='Save'])[3]")
	private WebElement Projectduplicatesave;
	@FindBy(xpath = "(//form[@class=\"js-modal-body-form\"])[8]")
	private WebElement Projectduplicatbody;




	public WebElement getProjectduplicatbody() {
		return Projectduplicatbody;
	}

	public WebElement getTrainduplicateoption() {
		return Trainduplicateoption;
	}

	public WebElement getTrainsuplicatesavebutton() {
		return Trainduplicatesavebutton;
	}

	public WebElement getProjectDvrs1() {
		return ProjectDvrs1;
	}

	public WebElement getProjectDvrs2() {
		return ProjectDvrs2;
	}

	public WebElement getDuplicateimpacttest() {
		return Duplicateimpacttest;
	}

	public WebElement getDuplicateimpacttestaction() {
		return Duplicateimpacttestaction;
	}

	public WebElement getProijectduplicatoption() {
		return Proijectduplicatoption;
	}

	public WebElement getProjectduplicatesave() {
		return Projectduplicatesave;
	}
	
	//Train duplicate locater
	
	@FindBy(xpath = "//a[text()='Duplicate Train													']")
	private WebElement Trainduplicateoption;
	@FindBy(xpath = "(//button[text()='Save'])[3]")
	private WebElement Trainduplicatesavebutton;
	@FindBy(xpath = "(//form[@class=\"js-modal-body-form\"])[6]")
	private WebElement Trainduplicatebody;




	public WebElement getTrainduplicatesavebutton() {
		return Trainduplicatesavebutton;
	}

	public WebElement getTrainduplicatebody() {
		return Trainduplicatebody;
	}
	
	
	//Vehicle Duplicate locater
	
	@FindBy(xpath = "(//a[text()='Duplicate Vehicle													'])[1]")
	private WebElement Vehicleduplicateoption;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement Vehicleduplicatesave;
	@FindBy(xpath = "(//form[@class=\"js-modal-body-form\"])[3]")
	private WebElement Vehicleduplicatebody;




	public WebElement getVehicleduplicateoption() {
		return Vehicleduplicateoption;
	}

	public WebElement getVehicleduplicatesave() {
		return Vehicleduplicatesave;
	}

	public WebElement getVehicleduplicatebody() {
		return Vehicleduplicatebody;
	}
	
	
	//Wheel rail profile duplicate locater
	
	@FindBy(xpath = "//div[contains(text(),'Rail Profile')]")
	private WebElement Railprofileduplicate;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Railprofileactionbutton;
	@FindBy(xpath = "(//a[text()='Duplicate Profile													'])[1]")
	private WebElement Railprofileduplicatebutton;
	@FindBy(xpath = "(//button[text()='Save'])[3]")
	private WebElement Railprofileduplicatesavebutton;
	@FindBy(xpath = "(//form[@class=\"js-modal-body-form\"])[4]")
	private WebElement Railprofileduplicatebody;




	public WebElement getRailprofileduplicate() {
		return Railprofileduplicate;
	}

	public WebElement getRailprofileactionbutton() {
		return Railprofileactionbutton;
	}

	public WebElement getRailprofileduplicatebutton() {
		return Railprofileduplicatebutton;
	}

	public WebElement getRailprofileduplicatesavebutton() {
		return Railprofileduplicatesavebutton;
	}

	public WebElement getRailprofileduplicatebody() {
		return Railprofileduplicatebody;
	}
	
	
	//Wheel rail contact duplicate locater
	
	@FindBy(xpath = "//div[contains(text(),'New contact profile')]")
	private WebElement Newcontactprofileoption;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement Contactprofileactionbutton;
	@FindBy(xpath = "//a[text()='Duplicate Contact													']")
	private WebElement Contactprofileduplicateoption;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement Contactprofileduplicatesave;
	@FindBy(xpath = "(//form[@class=\"js-modal-body-form\"])[2]")
	private WebElement Contactprofileduplicatebody;




	public WebElement getNewcontactprofileoption() {
		return Newcontactprofileoption;
	}

	public WebElement getContactprofileactionbutton() {
		return Contactprofileactionbutton;
	}

	public WebElement getContactprofileduplicateoption() {
		return Contactprofileduplicateoption;
	}

	public WebElement getContactprofileduplicatesave() {
		return Contactprofileduplicatesave;
	}

	public WebElement getContactprofileduplicatebody() {
		return Contactprofileduplicatebody;
	}
	
	
	//Bogie assembly duplicate locater
	
	@FindBy(xpath = "//div[contains(text(),'Y25Bogie')]")
	private WebElement BogieY25bogie;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Bogiey25actionbutton;
	@FindBy(xpath = "(//a[text()='Duplicate Bogie												'])[1]")
	private WebElement BogieY25duplicateoption;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement BogieY25duplicatesave;
	@FindBy(xpath = "(//form[@class=\"js-modal-body-form\"])[2]")
	private WebElement BogieY25duplicatebody;




	public WebElement getBogieY25bogie() {
		return BogieY25bogie;
	}

	public WebElement getBogiey25actionbutton() {
		return Bogiey25actionbutton;
	}

	public WebElement getBogieY25duplicateoption() {
		return BogieY25duplicateoption;
	}

	public WebElement getBogieY25duplicatesave() {
		return BogieY25duplicatesave;
	}

	public WebElement getBogieY25duplicatebody() {
		return BogieY25duplicatebody;
	}
	
	
	
	//Bogie part duplicate locater
	
	@FindBy(xpath = "//div[contains(text(),'Y25 Bogieframe')]")
	private WebElement Y25bogieframe;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Y25bogiefarmeaction;
	@FindBy(xpath = "(//a[text()='Duplicate Part												'])[1]")
	private WebElement Y25bogieframeduplicatebutton;
	@FindBy(xpath = "(//a[text()='Save'])[1]")
	private WebElement Y25bogieframeduplicatesave;
	@FindBy(xpath = "(//form[@class=\"js-modal-body-form\"])[2]")
	private WebElement Y25bogieframeduplicatebody;




	public WebElement getY25bogieframe() {
		return Y25bogieframe;
	}

	public WebElement getY25bogiefarmeaction() {
		return Y25bogiefarmeaction;
	}

	public WebElement getY25bogieframeduplicatebutton() {
		return Y25bogieframeduplicatebutton;
	}

	public WebElement getY25bogieframeduplicatesave() {
		return Y25bogieframeduplicatesave;
	}

	public WebElement getY25bogieframeduplicatebody() {
		return Y25bogieframeduplicatebody;
	}
	
	
	
	//Gauges duplicate locater
	
	@FindBy(xpath = "//div[contains(text(),'TunnelNewedit')]")
	private WebElement Tunnelnewedit;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Tunnelneweditaction;
	@FindBy(xpath = "//a[text()='Duplicate Gauge													']")
	private WebElement Tunnelneweditduplicateoption;
	@FindBy(xpath = "(//button[text()='Save'])[1]")
	private WebElement Tunnelneweditduplicatesave;
	@FindBy(xpath = "(//form[@class=\"js-modal-body-form\"])[4]")
	private WebElement Tunnelneweditsuplicatebody;




	public WebElement getTunnelnewedit() {
		return Tunnelnewedit;
	}

	public WebElement getTunnelneweditaction() {
		return Tunnelneweditaction;
	}

	public WebElement getTunnelneweditduplicateoption() {
		return Tunnelneweditduplicateoption;
	}

	public WebElement getTunnelneweditduplicatesave() {
		return Tunnelneweditduplicatesave;
	}

	public WebElement getTunnelneweditsuplicatebody() {
		return Tunnelneweditsuplicatebody;
	}
	
	
	//Route profile duplicate locater
	
	@FindBy(xpath = "//div[contains(text(),'Tunnel Added Reverse curve route')]")
	private WebElement Firstrouteprofile;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Firstrouteprofileaction;
	@FindBy(xpath = "(//a[text()='Duplicate Route Profile													'])[1]")
	private WebElement Firstrouteprofileduplicateoption;
	@FindBy(xpath = "(//button[text()='Save'])[1]")
	private WebElement Firstrouteprofileduplicatesave;
	@FindBy(xpath = "(//form[@class=\"js-modal-body-form\"])[2]")
	private WebElement Firstrouteprofileduplicatebody;




	public WebElement getFirstrouteprofile() {
		return Firstrouteprofile;
	}

	public WebElement getFirstrouteprofileaction() {
		return Firstrouteprofileaction;
	}

	public WebElement getFirstrouteprofileduplicateoption() {
		return Firstrouteprofileduplicateoption;
	}

	public WebElement getFirstrouteprofileduplicatesave() {
		return Firstrouteprofileduplicatesave;
	}

	public WebElement getFirstrouteprofileduplicatebody() {
		return Firstrouteprofileduplicatebody;
	}
	
	
	//Buffer stop duplicate locater
	
	@FindBy(xpath = "//div[contains(text(),'3 Point Sliding Buffer Stop')]")
	private WebElement Threepointslidingbufferstop;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement Threepointslidingbufferstopaction;
	@FindBy(xpath = "//a[text()='Duplicate Buffer Stop													']" )
	private WebElement Threepointslidingbufferstopsuplicate;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement Threepointslidingbufferstopduplicatesave;
	@FindBy(xpath = "(//form[@class=\"js-modal-body-form\"])[3]")
	private WebElement Threepointslidingbufferstopduplicatebody;




	public WebElement getThreepointslidingbufferstop() {
		return Threepointslidingbufferstop;
	}

	public WebElement getThreepointslidingbufferstopaction() {
		return Threepointslidingbufferstopaction;
	}

	public WebElement getThreepointslidingbufferstopsuplicate() {
		return Threepointslidingbufferstopsuplicate;
	}

	public WebElement getThreepointslidingbufferstopduplicatesave() {
		return Threepointslidingbufferstopduplicatesave;
	}

	public WebElement getThreepointslidingbufferstopduplicatebody() {
		return Threepointslidingbufferstopduplicatebody;
	}
	
	
	
	
	
	
	//Check the bogie connection option part count locater
	
	@FindBy(xpath = "//div[contains(text(),'Y25Bogie')]")
	private WebElement Y25bogie;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Y25bogieaction;
	@FindBy(xpath = "(//a[text()='Edit Bogie												'])[1]")
	private WebElement Y25bogieeditoption;
	@FindBy(xpath = "(//span[@class=\"icon expand-icon glyphicon glyphicon-menu-right\"])[1]")
	private WebElement Y25bogiemass;
	@FindBy(xpath = "//li[text()='Side bearer_L_Modelled']")
	private WebElement Y25bogiesidebearerl;
	@FindBy(xpath = "//li[text()='Side bearer_R_Modelled']")
	private WebElement Y25bogiesidebearerr;
	@FindBy(xpath = "//li[text()='Bogies_Frame_Modelled']")
	private WebElement Y25bogiecentermass;
	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement Y25bogiemassedit;
	@FindBy(xpath = "(//a[contains(text(),'Connections')])[1]")
	private WebElement Y25bogiemassconnections;
	@FindBy(xpath = "//div[@class=\"panel-body px-3 py-3\"]")
	private WebElement Y25bogiemasspannelbody;
	@FindBy(xpath = "(//button[text()='Cancel'])[12]")
	private WebElement Y25bogiecentermasscancel;
	@FindBy(xpath = "(//button[text()='Cancel'])[12]")
	private WebElement Y25bogieleftmasscancel;
	@FindBy(xpath = "(//button[text()='Cancel'])[12]")
	private WebElement Y25bogierightmasscancel;
	




	

	public WebElement getY25bogiecentermass() {
		return Y25bogiecentermass;
	}

	public WebElement getY25bogiecentermasscancel() {
		return Y25bogiecentermasscancel;
	}

	public WebElement getY25bogiesidebearerr() {
		return Y25bogiesidebearerr;
	}

	public WebElement getY25bogieleftmasscancel() {
		return Y25bogieleftmasscancel;
	}

	public WebElement getY25bogierightmasscancel() {
		return Y25bogierightmasscancel;
	}

	public WebElement getY25bogie() {
		return Y25bogie;
	}

	public WebElement getY25bogieaction() {
		return Y25bogieaction;
	}

	public WebElement getY25bogieeditoption() {
		return Y25bogieeditoption;
	}

	public WebElement getY25bogiemass() {
		return Y25bogiemass;
	}

	public WebElement getY25bogiesidebearerl() {
		return Y25bogiesidebearerl;
	}

	public WebElement getY25bogiemassedit() {
		return Y25bogiemassedit;
	}

	public WebElement getY25bogiemassconnections() {
		return Y25bogiemassconnections;
	}

	public WebElement getY25bogiemasspannelbody() {
		return Y25bogiemasspannelbody;
	}
	
	
	//Check the wheel set connection option locater
	
	@FindBy(xpath = "(//span[@class=\"icon expand-icon glyphicon glyphicon-menu-right\"])[5]")
	private WebElement Y25wheelsetoption;
	@FindBy(xpath = "//li[text()='Fron_Wheelset_modelled']")
	private WebElement Y25frontwheelset;
	@FindBy(xpath = "//li[text()='Rear_Wheelset_modelled']")
	private WebElement Y25backwheelset;
	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement Y25bogiewheelsetedit;
	@FindBy(xpath = "(//a[contains(text(),'Connections')])[2]")
	private WebElement Y25bogiewheelsetconnections;
	@FindBy(xpath = "//div[@class=\"row w-100 m-0\"]")
	private WebElement Y25bogiewheelsetpannelbody;
	@FindBy(xpath = "(//button[text()='Cancel'])[13]")
	private WebElement Y25bogiewheelsetcancel;
	



	public WebElement getY25backwheelset() {
		return Y25backwheelset;
	}

	public WebElement getY25wheelsetoption() {
		return Y25wheelsetoption;
	}

	public WebElement getY25frontwheelset() {
		return Y25frontwheelset;
	}

	public WebElement getY25bogiewheelsetedit() {
		return Y25bogiewheelsetedit;
	}

	public WebElement getY25bogiewheelsetconnections() {
		return Y25bogiewheelsetconnections;
	}

	public WebElement getY25bogiewheelsetpannelbody() {
		return Y25bogiewheelsetpannelbody;
	}

	public WebElement getY25bogiewheelsetcancel() {
		return Y25bogiewheelsetcancel;
	}
	
	

	//Check the functionality of simulations transducers option locater 
	
	@FindBy(xpath = "//label[text()=' Yes                                                            ']")
	private WebElement Dynamicsuspensionyes;
	@FindBy(xpath = "//label[text()=' No                                                            ']")
	private WebElement Dynamicsuspensionno;
	@FindBy(xpath = "//div[@class=\"main-body \"]")
	private WebElement Simulationmainbody;
	@FindBy(xpath = "//button[contains(text(),'Transducers')]")
	private WebElement Transducersbutton;
	@FindBy(xpath = "(//div[@class=\"modal-dialog modal-lg\"])[4]")
	private WebElement Transducerbody;
	@FindBy(xpath = "(//span[contains(text(),'Mass')])[2]")
	private WebElement Transducersmass;
	@FindBy(xpath = "(//span[contains(text(),'Wheelset')])[3]")
	private WebElement Transducerswheelset;
	@FindBy(xpath = "(//span[contains(text(),'Air Spring')])[1]")
	private WebElement Transducersairspring;
	@FindBy(xpath = "(//span[contains(text(),'Bumpstop')])[1]")
	private WebElement Transducersbumpstop;
	@FindBy(xpath = "(//span[contains(text(),'Bush')])[1]")
	private WebElement Transducerbush;
	@FindBy(xpath = "(//span[contains(text(),'Constraint')])[1]")
	private WebElement Transducersconstraint;
	@FindBy(xpath = "(//span[contains(text(),'Damper')])[1]")
	private WebElement Transducerdamper;
	@FindBy(xpath = "(//span[contains(text(),'Friction')])[2]")
	private WebElement Transducerfriction;
	@FindBy(xpath = "(//span[contains(text(),'Pinlink')])[1]")
	private WebElement Transducerpinlink;
	@FindBy(xpath = "(//span[contains(text(),'Stiffness')])[1]")
	private WebElement Transducerstiffness;
	@FindBy(xpath = "(//span[contains(text(),'Shear Spring')])[1]")
	private WebElement Transducershearspring;
	@FindBy(xpath = "(//span[contains(text(),'Hysteresis')])[1]")
	private WebElement Transducerhysteresis;
	@FindBy(xpath = "//select[@class=\"form-control form-control-select w-70 jqVehicleSelect jqTransducerVehicleSelect\"]")
	private WebElement Selectvehiclebox;
	@FindBy(xpath = "(//option[text()='Train 1 - Vehicle 1'])[1]")
	private WebElement Selecttrain1andvehicle1;
	@FindBy(xpath = "(//option[text()='Train 1 - Vehicle 2'])[1]")
	private WebElement Selecttrain1andvehicle2;
	@FindBy(xpath = "(//option[text()='Train 1 - Vehicle 3'])[1]")
	private WebElement Selecttrain1andvehicle3;
	@FindBy(xpath = "(//option[text()='Train 1 - Vehicle 4'])[1]")
	private WebElement Selecttrain1andvehicle4;
	@FindBy(id ="jqDetailedBogie")
	private WebElement Displaydetailedbogie3Danimation;
	@FindBy(xpath = "(//button[text()='Save'])[4]")
	private WebElement Transducersavebutton;
	@FindBy(xpath = "//button[contains(text(),'Save & Run Simulation')]")
	private WebElement Saveandrunsimulationbutton;
	@FindBy(xpath = "(//div[@class=\"modal-dialog modal-md\"])[3]")
	private WebElement Aftersaveandrunsimulationbody;
	@FindBy(xpath = "//a[text()='Simulation Results']")
	private WebElement Aftertransducersimulationresults;
	@FindBy(xpath = "//a[text()='3D            ']")
	private WebElement Aftertransducersimulation3D;
	@FindBy(xpath = "//i[@class=\"glyphicon glyphicon-play\"]")
	private WebElement Aftertransducer3Dpalybutton;
	@FindBy(xpath = "//button[contains(text(),'Save & Exit')]")
	private WebElement Aftertransducersaveandexit;




	public WebElement getDynamicsuspensionno() {
		return Dynamicsuspensionno;
	}

	public WebElement getAftertransducersaveandexit() {
		return Aftertransducersaveandexit;
	}

	public WebElement getAftersaveandrunsimulationbody() {
		return Aftersaveandrunsimulationbody;
	}

	public WebElement getTransducerbody() {
		return Transducerbody;
	}

	public WebElement getSimulationmainbody() {
		return Simulationmainbody;
	}

	public WebElement getDynamicsuspensionyes() {
		return Dynamicsuspensionyes;
	}

	public WebElement getTransducersbutton() {
		return Transducersbutton;
	}

	public WebElement getTransducersmass() {
		return Transducersmass;
	}

	public WebElement getTransducerswheelset() {
		return Transducerswheelset;
	}

	public WebElement getTransducersairspring() {
		return Transducersairspring;
	}

	public WebElement getTransducersbumpstop() {
		return Transducersbumpstop;
	}

	public WebElement getTransducerbush() {
		return Transducerbush;
	}

	public WebElement getTransducersconstraint() {
		return Transducersconstraint;
	}

	public WebElement getTransducerdamper() {
		return Transducerdamper;
	}

	public WebElement getTransducerfriction() {
		return Transducerfriction;
	}

	public WebElement getTransducerpinlink() {
		return Transducerpinlink;
	}

	public WebElement getTransducerstiffness() {
		return Transducerstiffness;
	}

	public WebElement getTransducershearspring() {
		return Transducershearspring;
	}

	public WebElement getTransducerhysteresis() {
		return Transducerhysteresis;
	}

	public WebElement getSelectvehiclebox() {
		return Selectvehiclebox;
	}

	public WebElement getSelecttrain1andvehicle1() {
		return Selecttrain1andvehicle1;
	}

	public WebElement getSelecttrain1andvehicle2() {
		return Selecttrain1andvehicle2;
	}

	public WebElement getSelecttrain1andvehicle3() {
		return Selecttrain1andvehicle3;
	}

	public WebElement getSelecttrain1andvehicle4() {
		return Selecttrain1andvehicle4;
	}

	public WebElement getDisplaydetailedbogie3Danimation() {
		return Displaydetailedbogie3Danimation;
	}

	public WebElement getTransducersavebutton() {
		return Transducersavebutton;
	}

	public WebElement getSaveandrunsimulationbutton() {
		return Saveandrunsimulationbutton;
	}

	public WebElement getAftertransducersimulationresults() {
		return Aftertransducersimulationresults;
	}

	public WebElement getAftertransducersimulation3D() {
		return Aftertransducersimulation3D;
	}

	public WebElement getAftertransducer3Dpalybutton() {
		return Aftertransducer3Dpalybutton;
	}
	
	
	
	//Check after edit the subscription to view the subscription view show updated plan or not locater
	
	@FindBy(xpath = "//td[text()='1']")
	private WebElement Subscription1;
	@FindBy(xpath = "//button[text()=' Actions ']")
	private WebElement Subscriptionaction;
	@FindBy(xpath = "//a[text()='View Subscriptions']")
	private WebElement Subscriptionview;
	@FindBy(xpath = "//div[@class=\"panel panel-default panel-body\"]")
	private WebElement Subscriptionviewbody;
	@FindBy(xpath = "//span[@class=\"glyphicon glyphicon-pencil\"]")
	private WebElement Subscriptionedit;
	@FindBy(xpath = "(//div[@class=\"modal-content\"])[6]")
	private WebElement Subscriptioneditbody;
	@FindBy(xpath = "(//button[text()='Cancel'])[6]")
	private WebElement Subscriptioneditcancel;
	@FindBy(name = "plan_id")
	private WebElement Subscriptionedselectbox;
	@FindBy(xpath = "//option[text()='DigitalTrains Running - Pro']")
	private WebElement Subscriptionrunningpro;
	@FindBy(xpath = "(//button[text()='Confirm'])[4]")
	private WebElement Subscriptioneditconform;
	@FindBy(xpath = "//option[text()='DigitalTrains Impact + Running - Pro']")
	private WebElement Subscriptioneditimpactrunningpro;




	public WebElement getSubscription1() {
		return Subscription1;
	}

	public WebElement getSubscriptionaction() {
		return Subscriptionaction;
	}

	public WebElement getSubscriptionview() {
		return Subscriptionview;
	}

	public WebElement getSubscriptionviewbody() {
		return Subscriptionviewbody;
	}

	public WebElement getSubscriptionedit() {
		return Subscriptionedit;
	}

	public WebElement getSubscriptioneditbody() {
		return Subscriptioneditbody;
	}

	public WebElement getSubscriptioneditcancel() {
		return Subscriptioneditcancel;
	}

	public WebElement getSubscriptionedselectbox() {
		return Subscriptionedselectbox;
	}

	public WebElement getSubscriptionrunningpro() {
		return Subscriptionrunningpro;
	}

	public WebElement getSubscriptioneditconform() {
		return Subscriptioneditconform;
	}

	public WebElement getSubscriptioneditimpactrunningpro() {
		return Subscriptioneditimpactrunningpro;
	}
	
	
	
	//Check the mirror option in of the bogies Bush top and bottom input fields locater
	
	//Bush
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][x]\"])[3]")
	private WebElement Bottomy25bogiesbushxbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][y]\"])[3]")
	private WebElement Bottomy25bogiesbushybox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][z]\"])[3]")
	private WebElement Bottomy25bogiesbushzbox;
	@FindBy(xpath = "(//button[text()='Cancel'])[16]")
	private WebElement Bushcancelbutton;




	public WebElement getBushcancelbutton() {
		return Bushcancelbutton;
	}

	public WebElement getBottomy25bogiesbushxbox() {
		return Bottomy25bogiesbushxbox;
	}

	public WebElement getBottomy25bogiesbushybox() {
		return Bottomy25bogiesbushybox;
	}

	public WebElement getBottomy25bogiesbushzbox() {
		return Bottomy25bogiesbushzbox;
	}
	
	//Air spring
	
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][x]\"])[1]")
	private WebElement Bottomairspringxbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][y]\"])[1]")
	private WebElement Bottomairspringybox;
	@FindBy(xpath = "(//button[text()='Cancel'])[14]")
	private WebElement Airspringcancelbutton;




	public WebElement getBottomairspringxbox() {
		return Bottomairspringxbox;
	}

	public WebElement getBottomairspringybox() {
		return Bottomairspringybox;
	}

	public WebElement getAirspringcancelbutton() {
		return Airspringcancelbutton;
	}
	
	//Shear spring
	
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][x]\"])[9]")
	private WebElement Bottomshearspringxbox;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][y]\"])[9]")
	private WebElement Bottomshearspringybox;
	@FindBy(xpath = "(//button[text()='Cancel'])[22]")
	private WebElement Shearspringcancelbutton;




	public WebElement getBottomshearspringxbox() {
		return Bottomshearspringxbox;
	}

	public WebElement getBottomshearspringybox() {
		return Bottomshearspringybox;
	}

	public WebElement getShearspringcancelbutton() {
		return Shearspringcancelbutton;
	}
	
	
	//Constraint
	
	@FindBy(xpath = "(//span[contains(text(),'Constraint')])[1]")
	private WebElement Constraintpart;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][x]\"])[6]")
	private WebElement Constrainttopx;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][y]\"])[6]")
	private WebElement Constrainttopy;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][0][z]\"])[6]")
	private WebElement Constrainttopz;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][x]\"])[4]")
	private WebElement Constraintbottomx;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][y]\"])[4]")
	private WebElement Constraintbottomy;
	@FindBy(xpath = "(//input[@name=\"bptg_bogie_part_data[position][1][z]\"])[4]")
	private WebElement Constraintbottomz;
	@FindBy(xpath = "(//button[text()='Cancel'])[17]")
	private WebElement Constraintcancelbutton;
	@FindBy(xpath = "//button[contains(text(),'Leave Without Saving')]")
	private WebElement Bogieassamblyleavewithoutsaving;
	@FindBy(xpath = "//div[contains(text(),'Airspring bogie2')]")
	private WebElement Airspringbogie2;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Airspring2actionbutton;
	@FindBy(xpath = "(//span[text()='Delete Bogie'])[1]")
	private WebElement Airspring2bogiedeletebutton;
	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement Airspring2bogiedeleteconformbutton;
	




	public WebElement getBogieassamblyleavewithoutsaving() {
		return Bogieassamblyleavewithoutsaving;
	}

	public WebElement getAirspringbogie2() {
		return Airspringbogie2;
	}

	public WebElement getAirspring2actionbutton() {
		return Airspring2actionbutton;
	}

	public WebElement getAirspring2bogiedeletebutton() {
		return Airspring2bogiedeletebutton;
	}

	public WebElement getAirspring2bogiedeleteconformbutton() {
		return Airspring2bogiedeleteconformbutton;
	}

	public WebElement getConstraintpart() {
		return Constraintpart;
	}

	public WebElement getConstrainttopx() {
		return Constrainttopx;
	}

	public WebElement getConstrainttopy() {
		return Constrainttopy;
	}

	public WebElement getConstrainttopz() {
		return Constrainttopz;
	}

	public WebElement getConstraintbottomx() {
		return Constraintbottomx;
	}

	public WebElement getConstraintbottomy() {
		return Constraintbottomy;
	}

	public WebElement getConstraintbottomz() {
		return Constraintbottomz;
	}

	public WebElement getConstraintcancelbutton() {
		return Constraintcancelbutton;
	}
	
	
	
	
	//Check the all train create next option locater
	
	@FindBy(xpath = "//label[@class=\"btn btn-primary text-capitalize active\"]")
	private WebElement Mainlinetrain;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary text-capitalize\"])[1]")
	private WebElement Freighttrain;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary text-capitalize\"])[2]")
	private WebElement Highspeedtrain;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary text-capitalize\"])[3]")
	private WebElement Metrotrain;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary text-capitalize\"])[4]")
	private WebElement Lightrailtrain;
	@FindBy(xpath = "//div[@class=\"main-body \"]")
	private WebElement Createtrainmainbody;




	public WebElement getMainlinetrain() {
		return Mainlinetrain;
	}

	public WebElement getFreighttrain() {
		return Freighttrain;
	}

	public WebElement getHighspeedtrain() {
		return Highspeedtrain;
	}

	public WebElement getMetrotrain() {
		return Metrotrain;
	}

	public WebElement getLightrailtrain() {
		return Lightrailtrain;
	}

	public WebElement getCreatetrainmainbody() {
		return Createtrainmainbody;
	}
	
	
	//check the project edit option locater
	
	@FindBy(xpath = "//button[text()='Create Project							']")
	private WebElement Createprojectbutton;
	@FindBy(xpath = "(//div[@class=\"modal-dialog modal-md\"])[1]")
	private WebElement Createprojectpage;
	@FindBy(id ="modal-project_name")
	private WebElement Projectnamebox;
	@FindBy(xpath = "(//button[text()='Create'])[1]")
	private WebElement CreateprojectButton;
	@FindBy(xpath = "//div[@class=\"body\"]")
	private WebElement Createprojectmainpagebody;
	@FindBy(xpath = "//div[contains(text(),'DVRS3')]")
	private WebElement DVRS3;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement DVRS3action;
	@FindBy(xpath = "(//a[text()='Edit Project												'])[1]")
	private WebElement DVRS3editprojectbutton;
	@FindBy(xpath = "(//input[@id=\"modal-project_name\"])[2]")
	private WebElement DVRS3editbox;
	@FindBy(xpath = "(//button[text()='Save'])[1]")
	private WebElement DVRS3savebutton;
	@FindBy(xpath = "(//div[@class=\"modal-dialog modal-md\"])[2]")
	private WebElement DVRS3editbody;
	@FindBy(xpath = "(//div[@class=\"modal-dialog modal-md\"])[3]")
	private WebElement DVRS3deletebody;
	@FindBy(xpath = "//div[contains(text(),'DVRS31')]")
	private WebElement DVRS31;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement DVRS31action;
	@FindBy(xpath = "(//span[text()='Delete Project'])[1]")
	private WebElement DVRS3deletebutton;
	@FindBy(xpath = "(//button[text()='Delete'])[1]")
	private WebElement DVRS3conformdelete;
	@FindBy(xpath = "//tr[@role=\\\"row\\")
	private WebElement Projectcount;




	public WebElement getProjectcount() {
		return Projectcount;
	}

	public WebElement getDVRS3deletebody() {
		return DVRS3deletebody;
	}

	public WebElement getCreateprojectpage() {
		return Createprojectpage;
	}

	public WebElement getDVRS31action() {
		return DVRS31action;
	}

	public WebElement getDVRS31() {
		return DVRS31;
	}

	public WebElement getDVRS3editbox() {
		return DVRS3editbox;
	}

	public WebElement getCreateprojectmainpagebody() {
		return Createprojectmainpagebody;
	}

	public WebElement getCreateprojectbutton() {
		return Createprojectbutton;
	}

	public WebElement getProjectnamebox() {
		return Projectnamebox;
	}

	public WebElement getCreateprojectButton() {
		return CreateprojectButton;
	}

	public WebElement getDVRS3() {
		return DVRS3;
	}

	public WebElement getDVRS3action() {
		return DVRS3action;
	}

	public WebElement getDVRS3editprojectbutton() {
		return DVRS3editprojectbutton;
	}

	public WebElement getDVRS3savebutton() {
		return DVRS3savebutton;
	}

	public WebElement getDVRS3editbody() {
		return DVRS3editbody;
	}

	public WebElement getDVRS3deletebutton() {
		return DVRS3deletebutton;
	}

	public WebElement getDVRS3conformdelete() {
		return DVRS3conformdelete;
	}
	
	
	
	//Check the coupler interface after delete device still show use error
	
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[14]")
	private WebElement Pivotassemblypagebody;
	@FindBy(xpath = "(//input[@name=\"device_name\"])[13]")
	private WebElement pivotassemblyname;
	@FindBy(xpath = "//select[@name=\"device_data[anchor_connector]\"]")
	private WebElement Pivotanchorconnectorbox;
	@FindBy(xpath = "(//option[text()='Eyelet'])[5]")
	private WebElement Pivotanchorconnectoreyelet;
	@FindBy(xpath = "//select[@name=\"device_data[interface_type]\"]")
	private WebElement Pivotanchorconnectinterfacetypebox;
	@FindBy(xpath = "(//option[text()='Auto Coupler'])[2]")
	private WebElement Pivotanchorconnectautocoupler;
	@FindBy(xpath = "//select[@name=\"device_data[pivot_type]\"]")
	private WebElement Pivotanchorconnectpivottypebox;
	@FindBy(xpath = "(//option[text()='Standard Bracket'])[2]")
	private WebElement Pivotanchorconnectstanderdbracket;
	@FindBy(xpath = "(//input[@name=\"device_data[length]\"])[11]")
	private WebElement Pivotlengthbox;
	@FindBy(xpath = "(//input[@name=\"device_data[pivot_distance]\"])[2]")
	private WebElement Pivotdistancebox;
	@FindBy(xpath = "(//input[@name=\"device_data[weight]\"])[16]")
	private WebElement Pivotdeviceweightbox;
	@FindBy(xpath = "(//input[@name=\"device_data[muff]\"])[3]")
	private WebElement Pivotdevicemuffbox;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[13]")
	private WebElement Pivotassemblydevicesave;
	@FindBy(xpath = "//div[@class=\"main-body \"]")
	private WebElement Devicemainpagebody;
	




	public WebElement getDevicemainpagebody() {
		return Devicemainpagebody;
	}

	public WebElement getPivotassemblypagebody() {
		return Pivotassemblypagebody;
	}

	public WebElement getPivotassemblyname() {
		return pivotassemblyname;
	}

	public WebElement getPivotanchorconnectorbox() {
		return Pivotanchorconnectorbox;
	}

	public WebElement getPivotanchorconnectoreyelet() {
		return Pivotanchorconnectoreyelet;
	}

	public WebElement getPivotanchorconnectinterfacetypebox() {
		return Pivotanchorconnectinterfacetypebox;
	}

	public WebElement getPivotanchorconnectautocoupler() {
		return Pivotanchorconnectautocoupler;
	}

	public WebElement getPivotanchorconnectpivottypebox() {
		return Pivotanchorconnectpivottypebox;
	}

	public WebElement getPivotanchorconnectstanderdbracket() {
		return Pivotanchorconnectstanderdbracket;
	}

	public WebElement getPivotlengthbox() {
		return Pivotlengthbox;
	}

	public WebElement getPivotdistancebox() {
		return Pivotdistancebox;
	}

	public WebElement getPivotdeviceweightbox() {
		return Pivotdeviceweightbox;
	}

	public WebElement getPivotdevicemuffbox() {
		return Pivotdevicemuffbox;
	}

	public WebElement getPivotassemblydevicesave() {
		return Pivotassemblydevicesave;
	}
	
	
	
	
	//Check the coupling interface create and delete option
	
	@FindBy(xpath = "(//li[text()='Blank Auto Coupler Interface'])[1]")
	private WebElement Blankautocouplerinterface;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[1]")
	private WebElement Selecttemplatefromcouplinginterface;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[22]")
	private WebElement createcouplinginterfaceaddpivotassemble;
	@FindBy(xpath = "(//a[text()='Choose from library'])[17]")
	private WebElement Createcouplingchoosefromlibrary;
	@FindBy(xpath = "(//select[@name=\"device_data[library][user][]\"])[5]")
	private WebElement Couplinginterfacepersonallibrary;
	@FindBy(xpath = "//option[contains(text(),'H300 Pivot')]")
	private WebElement CouplinginterfaceH300pivot;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[17]")
	private WebElement Couplinginterfaceafterselecttemplate;
	@FindBy(xpath = "(//button[contains(text(),'Attach')])[13]")
	private WebElement Couplinginterfaceattachbutton;
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement Couplinginterfacecreatebutton;
	@FindBy(xpath = "//div[@class=\"body\"]")
	private WebElement Couplinginterfacemainpagebody;




	public WebElement getBlankautocouplerinterface() {
		return Blankautocouplerinterface;
	}

	public WebElement getSelecttemplatefromcouplinginterface() {
		return Selecttemplatefromcouplinginterface;
	}

	public WebElement getCreatecouplinginterfaceaddpivotassemble() {
		return createcouplinginterfaceaddpivotassemble;
	}

	public WebElement getCreatecouplingchoosefromlibrary() {
		return Createcouplingchoosefromlibrary;
	}

	public WebElement getCouplinginterfacepersonallibrary() {
		return Couplinginterfacepersonallibrary;
	}

	public WebElement getCouplinginterfaceH300pivot() {
		return CouplinginterfaceH300pivot;
	}

	public WebElement getCouplinginterfaceafterselecttemplate() {
		return Couplinginterfaceafterselecttemplate;
	}

	public WebElement getCouplinginterfaceattachbutton() {
		return Couplinginterfaceattachbutton;
	}

	public WebElement getCouplinginterfacecreatebutton() {
		return Couplinginterfacecreatebutton;
	}

	public WebElement getCouplinginterfacemainpagebody() {
		return Couplinginterfacemainpagebody;
	}
	
	
	//Adding the braking and drive characteristics in vehicle option 
	
	@FindBy(xpath = "//div[contains(text(),'My vehicle')]")
	private WebElement Myvehicleoption;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Myvehicleactionbutton;
	@FindBy(xpath = "(//a[text()='Edit Vehicle													'])[1]")
	private WebElement Myvehicleeditbutton;
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[8]")
	private WebElement Myvehicleeditbody;
	@FindBy(xpath = "//strong[text()='Braking Characteristics']")
	private WebElement Myvehiclebrackingcharacteristicsoption;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[3]")
	private WebElement Myvehicleeditbrakingcharacteristicsbox;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[4]")
	private WebElement Myvehicleeditdriveforcecharacteristicsbox;
	@FindBy(xpath = "//li[text()='BRK55']")
	private WebElement BRKK55brakingcharacteristics;
	@FindBy(xpath = "(//li[text()='DRV56'])[1]")
	private WebElement DRV56drivecharacteristics;
	@FindBy(xpath = "(//button[contains(text(),'View')])[1]")
	private WebElement Myvehiclebrakingcharacteristicsview;
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[8]")
	private WebElement Brakingviewbody;
	@FindBy(xpath = "(//button[text()='Cancel'])[8]")
	private WebElement Myvehiclebrakingcharacteristicscancel;
	@FindBy(xpath = "(//button[contains(text(),'View')])[2]")
	private WebElement Myvehicledrivecharacteristicsview;
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[9]")
	private WebElement Driveviewbody;
	@FindBy(xpath = "(//button[text()='Cancel'])[9]")
	private WebElement Myvehicledrivecharacteristicscancel;
	@FindBy(xpath = "//a[text()='Save']")
	private WebElement Myvehiclesavebutton;
	@FindBy(xpath = "//div[@class=\"body\"]")
	private WebElement Vehiclemainbody;




	public WebElement getBrakingviewbody() {
		return Brakingviewbody;
	}

	public WebElement getDriveviewbody() {
		return Driveviewbody;
	}

	public WebElement getMyvehiclebrackingcharacteristicsoption() {
		return Myvehiclebrackingcharacteristicsoption;
	}

	public WebElement getMyvehicleeditbody() {
		return Myvehicleeditbody;
	}

	public WebElement getVehiclemainbody() {
		return Vehiclemainbody;
	}

	public WebElement getMyvehicleoption() {
		return Myvehicleoption;
	}

	public WebElement getMyvehicleactionbutton() {
		return Myvehicleactionbutton;
	}

	public WebElement getMyvehicleeditbutton() {
		return Myvehicleeditbutton;
	}

	public WebElement getMyvehicleeditbrakingcharacteristicsbox() {
		return Myvehicleeditbrakingcharacteristicsbox;
	}

	public WebElement getMyvehicleeditdriveforcecharacteristicsbox() {
		return Myvehicleeditdriveforcecharacteristicsbox;
	}

	public WebElement getBRKK55brakingcharacteristics() {
		return BRKK55brakingcharacteristics;
	}

	public WebElement getDRV56drivecharacteristics() {
		return DRV56drivecharacteristics;
	}

	public WebElement getMyvehiclebrakingcharacteristicsview() {
		return Myvehiclebrakingcharacteristicsview;
	}

	public WebElement getMyvehiclebrakingcharacteristicscancel() {
		return Myvehiclebrakingcharacteristicscancel;
	}

	public WebElement getMyvehicledrivecharacteristicsview() {
		return Myvehicledrivecharacteristicsview;
	}

	public WebElement getMyvehicledrivecharacteristicscancel() {
		return Myvehicledrivecharacteristicscancel;
	}

	public WebElement getMyvehiclesavebutton() {
		return Myvehiclesavebutton;
	}
	
	
	
	
	//New window option train and route profile option in simulation locater
	
	
	@FindBy(xpath = "//a[text()='Projects']")
	private WebElement Projectoption;
	@FindBy(xpath = "//div[contains(text(),'DVRS 1')]")
	private WebElement Simulationdvrs1;
	@FindBy(xpath = "//div[contains(text(),'Running Train')]")
	private WebElement Simulationrunningtrain;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[3]")
	private WebElement Simulationrunningtrainactionbutton;
	@FindBy(xpath = "(//a[text()='Edit Simulation												'])[1]")
	private WebElement Simulationrunningtraineditoption;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-new-window\"])[1]")
	private WebElement Simulationtrainnewwindow;
	@FindBy(xpath = "//div[@class=\"main-body \"]")
	private WebElement Trainpagemainbody;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-new-window\"])[4]")
	private WebElement Simulationtrouteprofilenewwindow;
	@FindBy(xpath = "//a[contains(text(),'Train 2 / Buffer Stop')]")
	private WebElement Simulationtrain2option;
	@FindBy(xpath = "//a[text()='Trains']")
	private WebElement Trainoption;
	@FindBy(xpath = "//div[contains(text(),'My train')]")
	private WebElement Mytrainoption;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement Mytrainactionoption;
	@FindBy(xpath ="//a[text()='Edit Train													']")
	private WebElement Traineditoption;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-new-window\"])[1]")
	private WebElement Trainvehiclenewwindow;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-new-window\"])[2]")
	private WebElement Trainleftcouplinginterfacenewwindowoption;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-new-window\"])[3]" )
	private WebElement Trainrightcouplinginterfacenewwindowoption;






	public WebElement getMytrainactionoption() {
		return Mytrainactionoption;
	}

	public WebElement getTrainoption() {
		return Trainoption;
	}

	public WebElement getMytrainoption() {
		return Mytrainoption;
	}

	public WebElement getProjectoption() {
		return Projectoption;
	}

	public WebElement getSimulationdvrs1() {
		return Simulationdvrs1;
	}

	public WebElement getSimulationrunningtrain() {
		return Simulationrunningtrain;
	}

	public WebElement getSimulationrunningtrainactionbutton() {
		return Simulationrunningtrainactionbutton;
	}

	public WebElement getSimulationrunningtraineditoption() {
		return Simulationrunningtraineditoption;
	}

	public WebElement getSimulationtrainnewwindow() {
		return Simulationtrainnewwindow;
	}

	public WebElement getTrainpagemainbody() {
		return Trainpagemainbody;
	}

	public WebElement getSimulationtrouteprofilenewwindow() {
		return Simulationtrouteprofilenewwindow;
	}

	public WebElement getSimulationtrain2option() {
		return Simulationtrain2option;
	}

	public WebElement getTraineditoption() {
		return Traineditoption;
	}

	public WebElement getTrainvehiclenewwindow() {
		return Trainvehiclenewwindow;
	}

	public WebElement getTrainleftcouplinginterfacenewwindowoption() {
		return Trainleftcouplinginterfacenewwindowoption;
	}

	public WebElement getTrainrightcouplinginterfacenewwindowoption() {
		return Trainrightcouplinginterfacenewwindowoption;
	}
	

	//Check the option of attach and detach option of friction shoes in buffer stop locater
	
	@FindBy(xpath = "//div[contains(text(),'3 Point Sliding Buffer Stop')]")
	private WebElement Threepointslidingbufferstopoption;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement Threepointbufferstopactionbutton;
	@FindBy(xpath = "//a[text()='View Buffer Stop													']")
	private WebElement Threepointbufferstopviewbufferstopoption;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[4]")
	private WebElement Slidingbufferstopfrictionshoeaddbutton;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-edit\"])[1]")
	private WebElement Slidingbufferstopfrictionshoeseditbutton;
	@FindBy(xpath = "(//div[@class=\"modal-dialog modal-lg\"])[5]")
	private WebElement Slidingbufferstopfrictionplusclickaftershowbody;
	@FindBy(xpath = "//input[@name=\"device_data[spec][back_elem]\"]")
	private WebElement Elementunderframesbox;
	@FindBy(xpath = "(//button[contains(text(),'Attach')])[5]")
	private WebElement Threepointbufferstopattachbutton;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement Threepointbufferstopattachsavebutton;
	@FindBy(xpath = "(//button[contains(text(),'Detach')])[5]")
	private WebElement Threepointbufferstopdetachbutton;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement Threepointbufferstopdetachsavebutton;
	@FindBy(xpath = "//a[text()='Done']")
	private WebElement Treepointbufferstopsaveafterdonebutton;




	public WebElement getSlidingbufferstopfrictionshoeseditbutton() {
		return Slidingbufferstopfrictionshoeseditbutton;
	}

	public WebElement getSlidingbufferstopfrictionplusclickaftershowbody() {
		return Slidingbufferstopfrictionplusclickaftershowbody;
	}

	public WebElement getTreepointbufferstopsaveafterdonebutton() {
		return Treepointbufferstopsaveafterdonebutton;
	}

	public WebElement getThreepointslidingbufferstopoption() {
		return Threepointslidingbufferstopoption;
	}

	public WebElement getThreepointbufferstopactionbutton() {
		return Threepointbufferstopactionbutton;
	}

	public WebElement getThreepointbufferstopviewbufferstopoption() {
		return Threepointbufferstopviewbufferstopoption;
	}

	public WebElement getSlidingbufferstopfrictionshoeaddbutton() {
		return Slidingbufferstopfrictionshoeaddbutton;
	}

	public WebElement getElementunderframesbox() {
		return Elementunderframesbox;
	}

	public WebElement getThreepointbufferstopattachbutton() {
		return Threepointbufferstopattachbutton;
	}

	public WebElement getThreepointbufferstopattachsavebutton() {
		return Threepointbufferstopattachsavebutton;
	}

	public WebElement getThreepointbufferstopdetachbutton() {
		return Threepointbufferstopdetachbutton;
	}

	public WebElement getThreepointbufferstopdetachsavebutton() {
		return Threepointbufferstopdetachsavebutton;
	}
	
	
	
	
	//Buffer stop adding the side buffers locater
	
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[3]")
	private WebElement Bufferstopaddingsidebufferbuttton;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[2]")
	private WebElement Sidebuffergashydralicoption;
	@FindBy(xpath = "(//a[text()='Choose from library'])[2]")
	private WebElement Sidebufferchoosefromlibrary;
	@FindBy(xpath = "(//select[@name=\"device_data[library][public]\"])[2]")
	private WebElement Sidebufferselectpubliclibrarybox;
	@FindBy(xpath = "//option[contains(text(),'Side Buffer Test')]")
	private WebElement Sidebuffertest;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[2]")
	private WebElement Sidebufferselcttemplate;
	@FindBy(xpath = "(//button[contains(text(),'Attach')])[2]")
	private WebElement Sidebufferattachbutton;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement Sidebuffersavebutton;
	@FindBy(xpath = "//a[text()='3D']")
	private WebElement Sidebufferattached3doption;
	@FindBy(xpath = "//a[text()='Done']")
	private WebElement Sidebufferattacheddone;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-edit\"])[1]")
	private WebElement Sidebufferselectedoption;
	@FindBy(xpath = "(//button[contains(text(),'Detach')])[2]")
	private WebElement Sidebufferdetachbutton;
	




	public WebElement getSidebufferselectedoption() {
		return Sidebufferselectedoption;
	}

	public WebElement getSidebufferdetachbutton() {
		return Sidebufferdetachbutton;
	}

	public WebElement getSidebuffersavebutton() {
		return Sidebuffersavebutton;
	}

	public WebElement getBufferstopaddingsidebufferbuttton() {
		return Bufferstopaddingsidebufferbuttton;
	}

	public WebElement getSidebuffergashydralicoption() {
		return Sidebuffergashydralicoption;
	}

	public WebElement getSidebufferchoosefromlibrary() {
		return Sidebufferchoosefromlibrary;
	}

	public WebElement getSidebufferselectpubliclibrarybox() {
		return Sidebufferselectpubliclibrarybox;
	}

	public WebElement getSidebuffertest() {
		return Sidebuffertest;
	}

	public WebElement getSidebufferselcttemplate() {
		return Sidebufferselcttemplate;
	}

	public WebElement getSidebufferattachbutton() {
		return Sidebufferattachbutton;
	}

	public WebElement getSidebufferattached3doption() {
		return Sidebufferattached3doption;
	}

	public WebElement getSidebufferattacheddone() {
		return Sidebufferattacheddone;
	}
	
	
	
	//Check the Adding the Door in the vehicle option locater
	
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[5]")
	private WebElement Vehicledoorsoption;
	@FindBy(xpath = "//input[@id=\"has_doors\"]")
	private WebElement Vehicledoorenable;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[11]")
	private WebElement Vehicledoorplusoption;
	@FindBy(xpath = "(//input[@id=\"vehicle_doors[distance][0][start]\"])[1]")
	private WebElement Vehicledoorstartpointone;
	@FindBy(xpath = "(//input[@id=\"vehicle_doors[distance][0][start]\"])[2]")
	private WebElement Vehicledoorstartpointtwo;
	@FindBy(xpath = "(//input[@id=\"vehicle_doors[distance][0][end]\"])[1]")
	private WebElement Vehicledoorendpointone;
	@FindBy(xpath = "(//input[@id=\"vehicle_doors[distance][0][end]\"])[2]")
	private WebElement Vehicledoorendpointtwo;
	@FindBy(xpath = "//a[text()='Save']")
	private WebElement Vehicledooreditsavebutton;
	@FindBy(xpath = "(//label[@class=\"btn btn-primary\"])[6]")
	private WebElement Vehicle3Dbutton;
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[8]")
	private WebElement Vehiclesetupbody;
	




	public WebElement getVehiclesetupbody() {
		return Vehiclesetupbody;
	}

	public WebElement getVehicle3Dbutton() {
		return Vehicle3Dbutton;
	}

	public WebElement getVehicledoorsoption() {
		return Vehicledoorsoption;
	}

	public WebElement getVehicledoorenable() {
		return Vehicledoorenable;
	}

	public WebElement getVehicledoorplusoption() {
		return Vehicledoorplusoption;
	}

	public WebElement getVehicledoorstartpointone() {
		return Vehicledoorstartpointone;
	}

	public WebElement getVehicledoorstartpointtwo() {
		return Vehicledoorstartpointtwo;
	}

	public WebElement getVehicledoorendpointone() {
		return Vehicledoorendpointone;
	}

	public WebElement getVehicledoorendpointtwo() {
		return Vehicledoorendpointtwo;
	}

	public WebElement getVehicledooreditsavebutton() {
		return Vehicledooreditsavebutton;
	}
	
	
	
	//Check the contact review option is repeating or not locater
	
	@FindBy(xpath = "//div[contains(text(),'New contact profile')]")
	private WebElement Newcontactprofileblock;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement Newcontactprofileaction;
	@FindBy(xpath = "//a[text()='Review Contact													']")
	private WebElement Newcontactprofilereview;
	@FindBy(xpath = "(//button[text()='Save'])[1]")
	private WebElement Newcontactprofilesave;
	@FindBy(xpath = "(//button[text()='Save'])[4]")
	private WebElement Newcontactprofilesaveconform;
	@FindBy(xpath = "//button[contains(text(),'Review Contact')]")
	private WebElement Newcontactprofilereviewpopupbutton;
	@FindBy(xpath ="(//div[@class=\"modal-content modal-content-shadow\"])[1]")
	private WebElement Newcontactprofileshadowbody;
	@FindBy(xpath = "//div[@class=\"main-body \"]")
	private WebElement Contactprofilemainbody;




	public WebElement getContactprofilemainbody() {
		return Contactprofilemainbody;
	}

	public WebElement getNewcontactprofileblock() {
		return Newcontactprofileblock;
	}

	public WebElement getNewcontactprofileaction() {
		return Newcontactprofileaction;
	}

	public WebElement getNewcontactprofilereview() {
		return Newcontactprofilereview;
	}

	public WebElement getNewcontactprofilesave() {
		return Newcontactprofilesave;
	}

	public WebElement getNewcontactprofilesaveconform() {
		return Newcontactprofilesaveconform;
	}

	public WebElement getNewcontactprofilereviewpopupbutton() {
		return Newcontactprofilereviewpopupbutton;
	}

	public WebElement getNewcontactprofileshadowbody() {
		return Newcontactprofileshadowbody;
	}
	
	
	
	//check the running train second train option to click the identical and load train from library navigate to train one
	
	@FindBy(xpath = "//div[contains(text(),'DVRS 1')]")
	private WebElement Dvrs1project;
	@FindBy(xpath = "//div[contains(text(),'Running Train')]")
	private WebElement Runningtrainsimulation;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[3]")
	private WebElement Runningtrainsimulationaction;
	@FindBy(xpath = "(//a[text()='Edit Simulation												'])[1]")
	private WebElement Runningtrainsimulationeditoption;
	@FindBy(xpath = "//a[contains(text(),'Train 2 / Buffer Stop')]")
	private WebElement Runningtrainsecondtrain;
	@FindBy(xpath = "(//input[@type=\"radio\"])[1]")
	private WebElement Runningtrainsecondtrainidenticaloption;
	@FindBy(xpath = "(//input[@type=\"radio\"])[2]")
	private WebElement Runningtrainsecondtrainloadtrainfromthelibrary;
	@FindBy(xpath = "//div[@class=\"main-body \"]")
	private WebElement Runningtrainsimulationsecondtrainmainbody;
	@FindBy(xpath = "(//div[@class=\"panel-body\"])[1]")
	private WebElement Runningtrain1panal;




	public WebElement getRunningtrainsimulationsecondtrainmainbody() {
		return Runningtrainsimulationsecondtrainmainbody;
	}

	public WebElement getDvrs1project() {
		return Dvrs1project;
	}

	public WebElement getRunningtrainsimulation() {
		return Runningtrainsimulation;
	}

	public WebElement getRunningtrainsimulationaction() {
		return Runningtrainsimulationaction;
	}

	public WebElement getRunningtrainsimulationeditoption() {
		return Runningtrainsimulationeditoption;
	}

	public WebElement getRunningtrainsecondtrain() {
		return Runningtrainsecondtrain;
	}

	public WebElement getRunningtrainsecondtrainidenticaloption() {
		return Runningtrainsecondtrainidenticaloption;
	}

	public WebElement getRunningtrainsecondtrainloadtrainfromthelibrary() {
		return Runningtrainsecondtrainloadtrainfromthelibrary;
	}

	public WebElement getRunningtrain1panal() {
		return Runningtrain1panal;
	}
	
	
	//Buffer stop check the contact option button
	
	@FindBy(xpath = "//button[text()='Edit Fabricated Structure				']")
	private WebElement Bufferstopeditfabricationbutton;
	@FindBy(xpath = "//select[@id=\"jqEndstopCoupling\"]")
	private WebElement Bufferstopselectcouplingtypebox;
	@FindBy(xpath = "//option[text()='Side contact']")
	private WebElement Bufferstopsidecontact;
	@FindBy(xpath = "//a[text()='Geometry']")
	private WebElement Bufferstopgeometryoption;
	@FindBy(xpath = "//input[@id=\"endstop_beam_depth\"]")
	private WebElement Bufferstopbeamwidth;
	@FindBy(xpath = "//input[@id=\"endstop_distance_front_rear_guide\"]")
	private WebElement Bufferstopdistancebetweenrearandfront;
	@FindBy(xpath = "//input[@id=\"endstop_coupler_offset\"]")
	private WebElement Bufferstopcoupleroffset;
	@FindBy(xpath = "//button[contains(text(),'Apply')]" )
	private WebElement Bufferstopapplybutton;
	@FindBy(xpath = "//a[text()='Done']")
	private WebElement Bufferstopdonebutton;
	@FindBy(xpath = "//div[@class=\"main-body \"]")
	private WebElement Bufferstopmainbody;
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[8]")
	private WebElement Bufferstopshadowbody;




	public WebElement getBufferstopmainbody() {
		return Bufferstopmainbody;
	}

	public WebElement getBufferstopshadowbody() {
		return Bufferstopshadowbody;
	}

	public WebElement getBufferstopeditfabricationbutton() {
		return Bufferstopeditfabricationbutton;
	}

	public WebElement getBufferstopselectcouplingtypebox() {
		return Bufferstopselectcouplingtypebox;
	}

	public WebElement getBufferstopsidecontact() {
		return Bufferstopsidecontact;
	}

	public WebElement getBufferstopgeometryoption() {
		return Bufferstopgeometryoption;
	}

	public WebElement getBufferstopbeamwidth() {
		return Bufferstopbeamwidth;
	}

	public WebElement getBufferstopdistancebetweenrearandfront() {
		return Bufferstopdistancebetweenrearandfront;
	}

	public WebElement getBufferstopcoupleroffset() {
		return Bufferstopcoupleroffset;
	}

	public WebElement getBufferstopapplybutton() {
		return Bufferstopapplybutton;
	}

	public WebElement getBufferstopdonebutton() {
		return Bufferstopdonebutton;
	}
	
	
	
	//Check the simulation PDF report generate option
	
	@FindBy(xpath = "//div[contains(text(),'DVRS 1')]")
	private WebElement Projectdvrsone;
	@FindBy(xpath = "//div[contains(text(),'Running Train')]")
	private WebElement Runningtrainsimualtion;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[3]")
	private WebElement Runningtrainsimulationactionbutton;
	@FindBy(xpath = "(//a[text()='View Results                                                    '])[1]")
	private WebElement Runningtrainsimulationviewresultsoption;
	@FindBy(xpath = "//button[text()='PDF Report                                ']")
	private WebElement Runningtrainsimulationpdfreportoption;
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[1]")
	private WebElement Pdfreportshadowpage;
	@FindBy(xpath = "//button[text()='Generate Report']")
	private WebElement Pdfreportgeneraterbutton;
	@FindBy(xpath = "//div[@class=\"main-body \"]")
	private WebElement Runningtrainsimualtionmainpage;




	public WebElement getProjectdvrsone() {
		return Projectdvrsone;
	}

	public WebElement getRunningtrainsimualtion() {
		return Runningtrainsimualtion;
	}

	public WebElement getRunningtrainsimulationactionbutton() {
		return Runningtrainsimulationactionbutton;
	}

	public WebElement getRunningtrainsimulationviewresultsoption() {
		return Runningtrainsimulationviewresultsoption;
	}

	public WebElement getRunningtrainsimulationpdfreportoption() {
		return Runningtrainsimulationpdfreportoption;
	}

	public WebElement getPdfreportshadowpage() {
		return Pdfreportshadowpage;
	}

	public WebElement getPdfreportgeneraterbutton() {
		return Pdfreportgeneraterbutton;
	}

	public WebElement getRunningtrainsimualtionmainpage() {
		return Runningtrainsimualtionmainpage;
	}
	
	
	//Delete the without data bogie part option locater
	
	@FindBy(xpath = "//div[contains(text(),'Withoutdatamass')]")
	private WebElement Withoutdatabogiepart;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Withoutdatabogiepartactionbutton;
	@FindBy(xpath = "(//span[text()='Delete Part'])[1]")
	private WebElement Withoutdatabogiepartdeletebutton;
	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement Withoutdatabogiepartdeleteconformbutton;
    @FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[17]")
    private WebElement Withoutdatabogiepartshadowpage;
    @FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[2]")
    private WebElement Withoutnamesavingshowshadowtab;



	public WebElement getWithoutnamesavingshowshadowtab() {
		return Withoutnamesavingshowshadowtab;
	}

	public WebElement getWithoutdatabogiepartactionbutton() {
		return Withoutdatabogiepartactionbutton;
	}

	public WebElement getWithoutdatabogiepartdeletebutton() {
		return Withoutdatabogiepartdeletebutton;
	}

	public WebElement getWithoutdatabogiepartdeleteconformbutton() {
		return Withoutdatabogiepartdeleteconformbutton;
	}

	public WebElement getWithoutdatabogiepartshadowpage() {
		return Withoutdatabogiepartshadowpage;
	}

	public WebElement getWithoutdatabogiepart() {
		return Withoutdatabogiepart;
	}


	
	//Check the vehicle under 3D adding module option locater
	
	@FindBy(xpath = "(//label[@class=\"btn btn-primary active\"])[2]")
	private WebElement Vehicleeditsetupoption;
	@FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[2]")
	private WebElement VehiclecustomthreeDmodulebox;
	@FindBy(xpath = "//li[text()='Custom Vehicle Body']")
	private WebElement Vehiclecutomvehiclebody;
	@FindBy(xpath = "//a[text()='Save']")
	private WebElement Vehicleeditsavebutton;
    @FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[8]")
    private WebElement Vehicleeditshadowtab;
    @FindBy(xpath = "//span[text()='Custom Vehicle Body']")
    private WebElement Vehiclecustomvehiclebodybox;
    @FindBy(xpath = "//li[text()='No Custom Model Selected']")
    private WebElement Vehicleselectnocustommodel;
    


	public WebElement getVehiclecustomvehiclebodybox() {
		return Vehiclecustomvehiclebodybox;
	}

	public WebElement getVehiclecutomvehiclebody() {
		return Vehiclecutomvehiclebody;
	}

	public WebElement getVehicleselectnocustommodel() {
		return Vehicleselectnocustommodel;
	}

	public WebElement getVehicleeditshadowtab() {
		return Vehicleeditshadowtab;
	}

	public WebElement getVehicleeditsetupoption() {
		return Vehicleeditsetupoption;
	}

	public WebElement getVehiclecustomthreeDmodulebox() {
		return VehiclecustomthreeDmodulebox;
	}

	public WebElement getVehicleeditsavebutton() {
		return Vehicleeditsavebutton;
	}
	
	
	//Check the route profile adding the 3D model option
	
	@FindBy(xpath = "//div[contains(text(),'Reverse curve route profile')]")
	private WebElement Reversecurverouteprofile;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[2]")
	private WebElement Reversecurveactionbutton;
	@FindBy(xpath = "(//a[@class=\"jqTerrainEditBtn\"])[2]")
	private WebElement Reversecurveeditbutton;
	@FindBy(xpath = "//a[text()='3D Models']")
	private WebElement Reversecurve3Dmodeloption;
	@FindBy(xpath = "//span[text()='No Custom Model Selected']")
	private WebElement Reversecurve3Dmodelbox;
	@FindBy(xpath = "(//button[text()='Save'])[1]")
	private WebElement Reversecurvesavebutton;
	@FindBy(xpath = "//li[text()='No Custom Model Selected']")
	private WebElement Reversecurvenocustommodelselected;
	
	
	public WebElement getReversecurverouteprofile() {
		return Reversecurverouteprofile;
	}

	public WebElement getReversecurveactionbutton() {
		return Reversecurveactionbutton;
	}

	public WebElement getReversecurveeditbutton() {
		return Reversecurveeditbutton;
	}

	public WebElement getReversecurve3Dmodeloption() {
		return Reversecurve3Dmodeloption;
	}

	public WebElement getReversecurve3Dmodelbox() {
		return Reversecurve3Dmodelbox;
	}

	public WebElement getReversecurvesavebutton() {
		return Reversecurvesavebutton;
	}

	public WebElement getReversecurvenocustommodelselected() {
		return Reversecurvenocustommodelselected;
	}
	
	
	
	
	//Check the option of the pivot assembly of linear and shear out selected or not locater
	


	@FindBy(xpath = "(//span[contains(text(),'Pivot')])[1]")
	private WebElement pivotmodule;
	@FindBy(xpath = "(//a[text()='Choose from library'])[13]")
	private WebElement pivotchoosefromlibrary;
	@FindBy(xpath = "//select[@name=\"device_data[filters][interface_type]\"]")
	private WebElement couplertypebox;
	@FindBy(xpath = "(//option[text()='Auto Coupler'])[1]")
	private WebElement couplertypeautocoupler;
	@FindBy(xpath = "//select[@name=\"device_data[filters][pivot_type]\"]")
	private WebElement pivottypebox;
	@FindBy(xpath = "(//option[text()='Rubber Donuts'])[1]")
	private WebElement pivottyperubberdonuts;
	@FindBy(xpath = "(//select[@name=\"device_data[library][user]\"])[13]")
	private WebElement personallibraryinpivot;
	@FindBy(xpath = "(//select[@name=\"device_data[library][public]\"])[13]")
	private WebElement publiclibraryinpivot;
	@FindBy(xpath = "(//option[contains(text(),' Generic auto rubber donut')])[2]")
	private WebElement publiclibrarygenericautorubberdonut;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[13]")
	private WebElement pivotselecttemplate;
	@FindBy(xpath = "(//button[contains(text(),'Linear')])[2]")
	private WebElement pivotlinearoption;
	@FindBy(xpath = "(//a[text()='Choose from library'])[18]")
	private WebElement pivotlinearchoosefromlibrary;
	@FindBy(xpath = "(//select[@name=\"device_data[library][public]\"])[19]")
	private WebElement pivotlinearpubliclibrary;
	@FindBy(xpath = "//option[contains(text(),'EFG3_csv')]")
	private WebElement pivotlinearEFGtype;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[18]")
	private WebElement pivotlinearselecttemplate;
	@FindBy(xpath = "(//button[contains(text(),'Attach')])[19]")
	private WebElement pivotlinearattach;
	@FindBy(xpath = "//button[contains(text(),'Shear Out')]")
	private WebElement pivotshearoutoption;
	@FindBy(xpath = "(//a[text()='Choose from library'])[20]")
	private WebElement pivotshearoutchoosefromlibrary;
	@FindBy(xpath = "(//select[@name=\"device_data[library][public]\"])[21]")
	private WebElement pivotshearoutpubliclibrary;
	@FindBy(xpath = "(//option[contains(text(),'OLEO Shear Out 1200')])[1]")
	private WebElement pivotshearoutpubliclibraryoleodhearout;
	@FindBy(xpath = "(//button[contains(text(),'Select Template')])[20]")
	private WebElement pivotshearoutselecttemplate;
	@FindBy(xpath = "(//button[contains(text(),'Attach')])[21]")
	private WebElement pivotshearoutattach;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[13]")
	private WebElement pivotsavebutton;
	@FindBy(xpath = "(//button[@class=\"btn jqSubDeviceButton btn-primary\"])[1]")
	private WebElement pivotlinearselectprimary;
	@FindBy(xpath = "(//button[@class=\"btn jqSubDeviceButton btn-primary\"])[1]")
	private WebElement pivotshearoutselectprimary;
	@FindBy(xpath = "//div[contains(text(),'Generic auto rubber donut')]")
	private WebElement Genericautorubberdonut;
	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	private WebElement pivotactionbutton;
	@FindBy(xpath = "//a[text()='View Device													']")
	private WebElement pivotviewdetails;
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[14]")
	private WebElement pivotshadowtab;




	public WebElement getPivotshadowtab() {
		return pivotshadowtab;
	}

	public WebElement getGenericautorubberdonut() {
		return Genericautorubberdonut;
	}

	public WebElement getPivotactionbutton() {
		return pivotactionbutton;
	}

	public WebElement getPivotviewdetails() {
		return pivotviewdetails;
	}

	public WebElement getPivotmodule() {
		return pivotmodule;
	}

	public WebElement getPivotchoosefromlibrary() {
		return pivotchoosefromlibrary;
	}

	public WebElement getCouplertypebox() {
		return couplertypebox;
	}

	public WebElement getCouplertypeautocoupler() {
		return couplertypeautocoupler;
	}

	public WebElement getPivottypebox() {
		return pivottypebox;
	}

	public WebElement getPivottyperubberdonuts() {
		return pivottyperubberdonuts;
	}

	public WebElement getPersonallibraryinpivot() {
		return personallibraryinpivot;
	}

	public WebElement getPubliclibraryinpivot() {
		return publiclibraryinpivot;
	}

	public WebElement getPubliclibrarygenericautorubberdonut() {
		return publiclibrarygenericautorubberdonut;
	}

	public WebElement getPivotselecttemplate() {
		return pivotselecttemplate;
	}

	public WebElement getPivotlinearoption() {
		return pivotlinearoption;
	}

	public WebElement getPivotlinearchoosefromlibrary() {
		return pivotlinearchoosefromlibrary;
	}

	public WebElement getPivotlinearpubliclibrary() {
		return pivotlinearpubliclibrary;
	}

	public WebElement getPivotlinearEFGtype() {
		return pivotlinearEFGtype;
	}

	public WebElement getPivotlinearselecttemplate() {
		return pivotlinearselecttemplate;
	}

	public WebElement getPivotlinearattach() {
		return pivotlinearattach;
	}

	public WebElement getPivotshearoutoption() {
		return pivotshearoutoption;
	}

	public WebElement getPivotshearoutchoosefromlibrary() {
		return pivotshearoutchoosefromlibrary;
	}

	public WebElement getPivotshearoutpubliclibrary() {
		return pivotshearoutpubliclibrary;
	}

	public WebElement getPivotshearoutpubliclibraryoleodhearout() {
		return pivotshearoutpubliclibraryoleodhearout;
	}

	public WebElement getPivotshearoutselecttemplate() {
		return pivotshearoutselecttemplate;
	}

	public WebElement getPivotshearoutattach() {
		return pivotshearoutattach;
	}

	public WebElement getPivotsavebutton() {
		return pivotsavebutton;
	}

	public WebElement getPivotlinearselectprimary() {
		return pivotlinearselectprimary;
	}

	public WebElement getPivotshearoutselectprimary() {
		return pivotshearoutselectprimary;
	}
	
	
	
	//Checking the coupler assembly deformation data are missing or not
	
	@FindBy(xpath = "(//span[text()=' Deformation 						'])[2]")
	private WebElement Couplerassemblydeformation;
	@FindBy(xpath = "(//div[@class=\"modal-content modal-content-shadow\"])[16]")
	private WebElement Couplerassemblydeformationshadowtab;
	@FindBy(xpath = "(//input[@name=\"device_name\"])[15]")
	private WebElement Couplerassemblydeforamtionname;
	@FindBy(xpath = "(//span[@class=\"glyphicon glyphicon-plus\"])[12]")
	private WebElement Couplerassemblydeformationplusbutton;
	@FindBy(xpath = "(//input[@name=\"device_data[multiple][force][]\"])[5]")
	private WebElement Couplerassemblydeformationforceone;
	@FindBy(xpath = "(//input[@name=\"device_data[multiple][force][]\"])[6]")
	private WebElement Couplerassemblydeformationforcetwo;
	@FindBy(xpath = "(//input[@name=\"device_data[multiple][force][]\"])[7]")
	private WebElement Couplerassemblydeformationforcethree;
	@FindBy(xpath = "(//input[@name=\"device_data[multiple][stroke][]\"])[6]")
	private WebElement Couplerassemblydeformationstroketwo;
	@FindBy(xpath = "(//input[@name=\"device_data[multiple][stroke][]\"])[7]")
	private WebElement Couplerassemblydeformationstrokethree;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[15]")
	private WebElement Couplerassemblydeformationsavebutton;
	@FindBy(xpath = "//div[contains(text(),'600KNCoupler')]")
	private WebElement Couplerassemblydeformation600kncoupler;
	@FindBy(xpath = "(//button[contains(text(),'Actions')])[1]")
	private WebElement Couplerassemblydeformationactionbutton;
	@FindBy(xpath = "(//a[text()='View Device													'])[1]")
	private WebElement Couplerassemblydeformationviewdeviceoption;




	public WebElement getCouplerassemblydeformation() {
		return Couplerassemblydeformation;
	}

	public WebElement getCouplerassemblydeformationshadowtab() {
		return Couplerassemblydeformationshadowtab;
	}

	public WebElement getCouplerassemblydeforamtionname() {
		return Couplerassemblydeforamtionname;
	}

	public WebElement getCouplerassemblydeformationplusbutton() {
		return Couplerassemblydeformationplusbutton;
	}

	public WebElement getCouplerassemblydeformationforceone() {
		return Couplerassemblydeformationforceone;
	}

	public WebElement getCouplerassemblydeformationforcetwo() {
		return Couplerassemblydeformationforcetwo;
	}

	public WebElement getCouplerassemblydeformationforcethree() {
		return Couplerassemblydeformationforcethree;
	}

	public WebElement getCouplerassemblydeformationstroketwo() {
		return Couplerassemblydeformationstroketwo;
	}

	public WebElement getCouplerassemblydeformationstrokethree() {
		return Couplerassemblydeformationstrokethree;
	}

	public WebElement getCouplerassemblydeformationsavebutton() {
		return Couplerassemblydeformationsavebutton;
	}

	public WebElement getCouplerassemblydeformation600kncoupler() {
		return Couplerassemblydeformation600kncoupler;
	}

	public WebElement getCouplerassemblydeformationactionbutton() {
		return Couplerassemblydeformationactionbutton;
	}

	public WebElement getCouplerassemblydeformationviewdeviceoption() {
		return Couplerassemblydeformationviewdeviceoption;
	}
	
	
	
	
	}
	
	