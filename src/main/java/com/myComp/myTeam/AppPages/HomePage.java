package com.myComp.myTeam.AppPages;

import com.myComp.myTeam.Util.ExtendedLibrary;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends ExtendedLibrary {
    public void tab_Verification(){
        try{
            WebElement seinfeldElm =waitForPresenceOfElementLocatedBy(path.seinfeldChar_Tab,"unable to locate element");
            String seinfeldTxt =  seinfeldElm.getText();
            Assert.assertEquals(seinfeldTxt,"Seinfeld Characters And Quotes",seinfeldTxt+" tab verified at the Homepage Successfully");

            WebElement shop_seinfeldElm =waitForPresenceOfElementLocatedBy(path.shop_Seinfeld_Tab,"unable to locate element");
            String shop_SeinfeldTxt =  shop_seinfeldElm.getText();
            Assert.assertEquals(shop_SeinfeldTxt,"Shop - Seinfeld Merchandise",shop_SeinfeldTxt+" tab verified at the Homepage Successfully");

        }catch (Exception e){
            System.out.println(e.getMessage());
            Assert.fail("Unable to Verify tab at Homepage");
        }
    }

    public void shop_seinfeld_Tab_Click(){
        try{
             WebElement shop_seinfeldElm =waitForPresenceOfElementLocatedBy(path.shop_Seinfeld_Tab,"unable to locate element");
             shop_seinfeldElm.click();

        }catch (Exception e){
            System.out.println(e.getMessage());
            Assert.fail("Unable to click shop seinfeld Tab at Homepage");
        }
    }
}
