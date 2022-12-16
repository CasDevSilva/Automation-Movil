package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.view.ViewGroup[1]")
    private WebElement userInput;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUser;
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.view.ViewGroup[2]")
    private WebElement passswordInput;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement txtPassword;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]/android.widget.TextView")
    private WebElement btnLogin;
    @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement textTitle;

    public void writeUsername(String user){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userInput.click();
        txtUser.sendKeys(user);
    }
    public void writePassword(String password){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        passswordInput.click();
        txtPassword.sendKeys(password);
    }
    public void signin(){
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        btnLogin.click();
    }
    public String verifyTextTitle(){
        return textTitle.getText();
    }
    public int getItemSize(){
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> elements = this.getDriver().findElements(By.xpath("//*"));
        System.out.println(elements.size());
        return elements.size();
    }
}
