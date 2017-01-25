package com.refleqt.jbc.support;

import com.refleqt.jbc.pages.HomePage;
import com.refleqt.jbc.pages.LoginPage;
import com.refleqt.jbc.pages.ProfilePage;
import com.refleqt.jbc.pages.RegisterForm;
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
    private LoginPage loginPage;
    private ProfilePage profilePage;
    private RegisterForm registerForm;

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

    public void setupDriver(){
        driver = DriverProvider.setupDriver();
    }

    public void tearDownDriver(){
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

    public LoginPage loginPage(){
        if (loginPage == null){
            loginPage = new LoginPage();
        }
        PageFactory.initElements(driver, loginPage);
        return loginPage;
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
}