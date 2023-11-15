package io.cucumber.skeleton;

import base.AutomationMethods;
import com.erdioran.utils.ConfigManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import static base.ProjectMethods.*;
import static com.erdioran.utils.ConfigManager.getOperatingSystem;
import static com.erdioran.utils.DataManager.getData;
import static com.erdioran.utils.Helper.sleepInSeconds;


public class StepDefinitionsGeneral extends AutomationMethods {

    private static final Logger LOGGER = LogManager.getLogger(StepDefinitionsGeneral.class);


    @Given("click {string}")
    public void clickElement(String element) throws Exception {
        int elapsedTime = ConfigManager.getWaitTimeSplashScreen();

        boolean isElementVisible = waitItemVisibleSecond(element, elapsedTime);

        if (isElementVisible) {
            click(element);
        } else {
            LOGGER.info("Element not visible, increase cooldown.");
        }

    }

    @And("enter {string} in {string}")
    public void sendKeysInput(String text, String element) throws Exception {
        sendKeys(element, text);
    }

    @Given("open app")
    public void openApp() {
        openApp(getData("activity.main_" + getOperatingSystem() + ""));
    }


    @And("wait until see the {string} element")
    public void skipOnboarding(String element) throws Exception {
        int elapsedTime = ConfigManager.getWaitTimeSplashScreen();
        boolean isElementVisible = waitItemVisibleSecond(element, elapsedTime);
        if (isElementVisible) {
            LOGGER.info("The element was seen and the step was passed.");
        } else {
            LOGGER.info("Element not visible, increase cooldown.");
        }
    }

    @And("i see {string} text")
    public void iSeeTextInPage(String text) throws Exception {
        Assert.assertTrue(findTextOnPage(text));
    }

    @And("i see {string} element")
    public void iSeeElementInPage(String element) throws Exception {
        int elapsedTime = ConfigManager.getWaitTimeSplashScreen();
        boolean isElementVisible = waitItemVisibleSecond(element, elapsedTime);
        if (isElementVisible) {
            Assert.assertTrue(elementVisibiltyWithSize(element));
        } else {
            LOGGER.info("Element not visible, increase cooldown.");
        }
    }

    @And("i cant see {string} element")
    public void iCantSeeElementInPage(String element) throws Exception {
        Assert.assertFalse(elementVisibiltyWithSize(element));
    }

    @And("i cant see {string} text")
    public void iCantSeeTextInPage(String text) throws Exception {
        sleepInSeconds(2);
        Assert.assertFalse(findTextOnPage(text));
    }

    @And("swipe right")
    public void swipeRight() throws Exception {
        swipeScreen("right");
    }

    @And("swipe left")
    public void swipeLeft() throws Exception {
        swipeScreen("left");
    }


    @And("app goes to background")
    public void appGoesToBackground() throws Exception {
        appBackgroundStay();
    }

    @And("app goes to foreground")
    public void appGoesToForeground() throws Exception {
        appForeground(getData("activity.main_" + getOperatingSystem() + ""));
    }

    @And("wait {string} second")
    public void waitSecond(String second) throws Exception {
        sleepInSeconds(Integer.parseInt(second));
    }

    @And("kill app")
    public void killApp() throws Exception {
        terminateApp(getData("activity.main_" + getOperatingSystem() + ""));
    }

    @And("i see the keyboard is on")
    public void keyboardOn() throws Exception {
        Assert.assertTrue(isKeyboardShowStatus());
    }

    @And("i see the keyboard is off")
    public void keyboardOff() throws Exception {
        Assert.assertFalse(isKeyboardShowStatus());
    }

    @And("i see {string} button is clickable")
    public void buttonIsClickable(String element) throws Exception {
        Assert.assertTrue(isButtonClickableStatus(element));
    }

    @And("i see {string} button is not clickable")
    public void buttonIsNotClickable(String element) throws Exception {
        Assert.assertFalse(isButtonClickableStatus(element));
    }

    @And("i see {string} input is selected")
    public void inputIsSelected(String element) throws Exception {
        Assert.assertTrue(isInputSelectedStatus(element));
    }


}
