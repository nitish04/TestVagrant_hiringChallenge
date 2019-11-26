package com.myComp.myTeam.AppPages;

import com.myComp.myTeam.Util.ExtendedLibrary;
import com.myComp.myTeam.Util.Prerequisite;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends ExtendedLibrary


{
public void login(){
    try{
        WebElement userElm=waitForPresenceOfElementLocatedBy(path.userName_textBox,"unable to locate element");
        userElm.sendKeys(Prerequisite.configMap.get("userName"));
        WebElement passwordElm=waitForPresenceOfElementLocatedBy(path.password_textBox,"unable to locate element");
        passwordElm.sendKeys(Prerequisite.configMap.get("password"));
        WebElement loginElm=waitForPresenceOfElementLocatedBy(path.login_tab,"unable to locate element");
        loginElm.click();
        WebElement seinfeldElm =waitForPresenceOfElementLocatedBy(path.seinfeldChar_Tab,"unable to locate element");
        String seinfeldTxt =  seinfeldElm.getText();
        Assert.assertEquals(seinfeldTxt,"Seinfeld Characters And Quotes","Login to App Successfully");

    }catch (Exception e){
        System.out.println(e.getMessage());
        Assert.fail("Unable to login to App");
    }
   }

    public void login_IncorrectPassword(){
        try{
            WebElement userElm=waitForPresenceOfElementLocatedBy(path.userName_textBox,"unable to locate element");
            userElm.sendKeys(Prerequisite.configMap.get("userName"));
            WebElement passwordElm=waitForPresenceOfElementLocatedBy(path.password_textBox,"unable to locate element");
            passwordElm.sendKeys(Prerequisite.configMap.get("password")+"123");
            WebElement loginElm=waitForPresenceOfElementLocatedBy(path.login_tab,"unable to locate element");
            loginElm.click();
            Thread.sleep(2000);
            String loginTxt =  loginElm.getText();
            Assert.assertEquals(loginTxt,"LOGIN","User unable login to the App with invalid password");

        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}
