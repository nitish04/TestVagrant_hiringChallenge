package com.myComp.myTeam.Util;

import com.myComp.myTeam.AppPages.HomePage;
import com.myComp.myTeam.AppPages.LoginPage;
import com.myComp.myTeam.AppPages.ShopPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Reference {

    public WebDriver driver;

    public LoginPage loginPage;
    public HomePage homePage;
    public ShopPage shopPage;

    public Reference(){

       loginPage= PageFactory.initElements(driver,LoginPage.class);
       homePage = PageFactory.initElements(driver,HomePage.class);
       shopPage = PageFactory.initElements(driver,ShopPage.class);
    }

}
