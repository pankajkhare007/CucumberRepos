package testRunner.stepDefinitions;


import dataOne.Global;
import dataOne.Person;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import properties.RunSettings;
import util.DriverManager;
import util.WebUtils;
import webObjectLib.CommonObjects;

public class CommonStepDefinitions extends DriverManager
{
    @Given("User logins as Admin")
    public void login()
    {

        Person p = new Person();
        if(driver==null)
            launchBrowser(RunSettings.Browser,RunSettings.URL);
        WebUtils.setValueOnEditBox(CommonObjects.editUsername, Global.userName,"Username");
        WebUtils.setValueOnEditBox(CommonObjects.editPassword, Global.password,"Password");
        WebUtils.clickonObject(CommonObjects.btnLogin,"Login Button");

    }


    @Given("login as Admin")
    public void login_as_admin() {
       System.out.println("Login as admin");
    }

    @Then("Enter Username")
    public void enter_username() {
        System.out.println("Enter Username");
    }

    @And("Enter Password")
    public void enter_password() {
        System.out.println("Enter Password");
    }

    @And("Click on login button")
    public void click_on_login_button() {
        System.out.println("Click on login button");
    }
}
