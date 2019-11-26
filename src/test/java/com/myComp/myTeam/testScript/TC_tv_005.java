package com.myComp.myTeam.testScript;

import com.myComp.myTeam.Util.ExtendedLibrary;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC_tv_005 extends ExtendedLibrary {

    @BeforeClass
    public void preRequisite() throws MalformedURLException {
        nativeAppCap();
    }

    @Test
    public void testCase(){
        _ref.loginPage.login();
        _ref.homePage.shop_seinfeld_Tab_Click();
        _ref.shopPage.shop_Page_Verification();
        _ref.shopPage.shop_Add_Mugg_To_Cart();
        _ref.shopPage.add_CarryBag();
        _ref.shopPage.total_Price_Verification();

    }

    @AfterClass
    public void endSession()
    {
        driver.quit();
    }
}
