package com.refleqt.jbc.support;

import com.refleqt.jbc.pages.*;
import com.refleqt.jbc.setup.EdgeDriverProvider;
import com.refleqt.jbc.setup.FirefoxDriverProvider;
import com.refleqt.jbc.setup.PhantomDriverProvider;
import com.refleqt.jbc.setup.SafariDriverProvider;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PageController {
    /** Members */
    private WebDriver driver;
    private static PageController pageController;

    private HomePage homePage;
    private RegisterForm registerForm;
    private LoginHeader loginHeader;
    private CreateBeehivePage createBeehivePage;
    private InspectionPage inspectionPage;
    private TreatmentPage treatmentPage;
    private CreateHoneyExtractionPage createHoneyExtractionPage;
    private AdminPage adminPage;

    // Private members
    private int shortTimeOut = 10;
    private int longTimeOut = 60;

    // Constructor
    private PageController(){}

    public static PageController getInstance(){
        if (pageController == null){
            pageController = new PageController();
        }
        return pageController;
    }
    //Choose between the Headlessdriver or the other drivers
    //Enter the to use driver in .idea/config.properties
    //Values chrome, edge, phantom, safari (Only on IOS) or firefox.
    public void setupDriver() {
        Properties p=new Properties();
        try {
            FileReader reader=new FileReader(".idea\\config.properties");
            p.load(reader);
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Could not find properties file, starting default driver");
        }
        System.out.println((char)27 +"Found driver: " + p.getProperty("driver") + " in the config file @.idea/config.properties" + (char)27 + "[0m");
        switch (p.getProperty("driver")) {
            case "firefox": driver = FirefoxDriverProvider.setupDriver();
                break;
            case "edge": driver = EdgeDriverProvider.setupDriver();
                break;
            case "phantom":  driver = PhantomDriverProvider.setupDriver();
                break;
            case "safari":  driver = SafariDriverProvider.setupDriver();
                break;
            default: driver = DriverProvider.setupDriver();
                break;
        }

    }

    public void tearDownDriver(){
        String msg = "Quitting driver";
        System.out.println((char)27 + "[34m" + msg + (char)27 + "[0m");
        driver.quit();
    }

    public void waitForFullPageLoad() {
        try {
            (new WebDriverWait(driver, longTimeOut)).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    return ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete");
                }
            });
        } catch (Exception e) {
            System.out.println("-- Wait for page load exception --");
        }
    }

    public void openWebPage(String url){

        driver.get(url);
        waitForFullPageLoad();
    }

    /** Pages */
    public HomePage homePage(){
        if (homePage == null){
            homePage = new HomePage();
        }
        PageFactory.initElements(driver, homePage);
        return homePage;
    }
    public RegisterForm registerForm() {
        if (registerForm == null){
            registerForm = new RegisterForm();
        }
        PageFactory.initElements(driver, registerForm);
        return registerForm;
    }
    public LoginHeader loginHeader()
    {
        if (loginHeader == null){
            loginHeader = new LoginHeader();
        }
        PageFactory.initElements(driver, loginHeader);
        return loginHeader;
    }
    public CreateBeehivePage createBeehivePage()
    {
        if (createBeehivePage == null){
            createBeehivePage = new CreateBeehivePage();
        }
        PageFactory.initElements(driver, createBeehivePage);
        return createBeehivePage;
    }
    public InspectionPage inspectionPage()
    {
        if (inspectionPage == null){
            inspectionPage = new InspectionPage();
        }
        PageFactory.initElements(driver, inspectionPage);
        return inspectionPage;
    }
    public TreatmentPage treatmentPage()
    {
        if (treatmentPage == null){
            treatmentPage = new TreatmentPage();
        }
        PageFactory.initElements(driver, treatmentPage);
        return treatmentPage;
    }
    public CreateHoneyExtractionPage createHoneyExtractionPage()
    {
        if (createHoneyExtractionPage == null){
            createHoneyExtractionPage = new CreateHoneyExtractionPage();
        }
        PageFactory.initElements(driver, createHoneyExtractionPage);
        return createHoneyExtractionPage;
    }
    public AdminPage adminPage()
    {
        if (adminPage == null){
            adminPage = new AdminPage();
        }
        PageFactory.initElements(driver, adminPage);
        return adminPage;
    }

}