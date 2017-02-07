package com.refleqt.jbc.setup;

import com.refleqt.jbc.support.PageController;
import cucumber.api.java.Before;
import org.junit.Assert;
import org.junit.Test;
import com.refleqt.jbc.setup.SessionStorage;

import static com.refleqt.jbc.setup.PhantomDriverProvider.driver;

/**
 * Created by Kristof on 7/02/2017.
 */
public class sessionTest
{
    private PageController pageController;
    public sessionTest() {this.pageController = PageController.getInstance();}
    @Before
    public void beforeScenario() {
        pageController.setupDriver();
    }
    @Test
    public void hackTheSite()
    {
        //pageController.openWebPage("http://172.16.62.26/#/");
        pageController.getDriver().get("http://172.16.62.26/#/");
        //Make sure we are on the website
        Assert.assertEquals(driver.getTitle(),"B-Central");
        SessionStorage ss = new com.refleqt.jbc.setup.SessionStorage(pageController.getDriver());
        ss.setItemInSessionStorage("username","badusername");
        ss.setItemInSessionStorage("password","badpass");
        driver.navigate().refresh();
    }
}
