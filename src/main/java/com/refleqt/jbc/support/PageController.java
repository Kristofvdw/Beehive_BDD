package com.refleqt.jbc.support;

import com.refleqt.jbc.pages.*;
import com.refleqt.jbc.setup.PhantomDriverProvider;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageController {
    /** Members */
    private WebDriver driver;
    private static PageController pageController;

    private HomePage homePage;
    private ProfilePage profilePage;
    private RegisterForm registerForm;
    private LoginHeader loginHeader;
    private CreateBeehivePage createBeehivePage;
    private InspectionPage inspectionPage;
    private TreatmentPage treatmentPage;
    private CreateHoneyExtractionPage createHoneyExtractionPage;

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
    public void setupDriver(){
        driver = DriverProvider.setupDriver();
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



    public ProfilePage profilePage(){
        if (profilePage == null){
            profilePage = new ProfilePage();
        }
        PageFactory.initElements(driver, profilePage);
        return profilePage;
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

}