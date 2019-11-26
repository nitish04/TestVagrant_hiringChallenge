package com.myComp.myTeam.testScript;

import com.myComp.myTeam.Util.ExtendedLibrary;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC_tv_002 extends ExtendedLibrary {

    @BeforeClass
    public void preRequisite() throws MalformedURLException {
        nativeAppCap();
    }

    @Test
    public void testCase(){
        _ref.loginPage.login_IncorrectPassword();
    }

    @AfterClass
    public void endSession()
    {
        driver.quit();
    }
}
