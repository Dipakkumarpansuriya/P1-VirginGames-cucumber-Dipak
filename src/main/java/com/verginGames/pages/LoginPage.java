package com.verginGames.pages;

import com.verginGames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    WebElement acceptAllCookies;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/a[1]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"__next\"]/form/p[1]")
    WebElement verifyText;

//   _______________________________________________________________________________________

    public void acceptAllCookies() {
        clickOnElement(acceptAllCookies);
        log.info("accept All Cookies : " + acceptAllCookies.toString());

    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("click On Login Button : " + loginLink.toString());

    }

    public String getverifyText() {
        String actMassage = getTextFromElement(verifyText);
        return actMassage;

    }


}
