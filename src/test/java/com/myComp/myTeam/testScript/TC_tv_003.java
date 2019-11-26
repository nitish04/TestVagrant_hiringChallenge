package com.myComp.myTeam.testScript;

import com.myComp.myTeam.Util.ExtendedLibrary;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC_tv_003 extends ExtendedLibrary {

    @BeforeClass
    public void preRequisite() throws MalformedURLException {
        nativeAppCap();
    }

    @Test
    public void testCase(){
        _ref.loginPage.login();
        _ref.homePage.tab_Verification();
    }

    @AfterClass
    public void endSession()
    {
        driver.quit();
    }
}
