package testRunner.stepDefinitions;


import dataOne.Global;
import dataOne.Person;

import io.cucumber.java.en.Given;
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
}
