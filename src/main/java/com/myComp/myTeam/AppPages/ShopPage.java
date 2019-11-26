package com.myComp.myTeam.AppPages;

import com.myComp.myTeam.Util.ExtendedLibrary;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ShopPage extends ExtendedLibrary {

    public void shop_Page_Verification(){
        try{
            WebElement shopElm =waitForPresenceOfElementLocatedBy(path.shop_Label,"unable to locate element");
            String shopTxtElm =  shopElm.getText();
            Assert.assertEquals(shopTxtElm,"Shop",shopTxtElm+" text verified at the ShopPage Successfully");

        }catch (Exception e){
            System.out.println(e.getMessage());
            Assert.fail("Unable to Verify Shop text at ShopPage");
        }
    }
    public void shop_AddMugg_Cart_Price_Verification(){
        try{
            List<WebElement> seinfeldMugElm =waitForPresenceOfAllElementsLocatedBy(path.seinfeldMug_Add_Tab,"unable to locate element");

            for(int i=1; i<=3; i++){
                WebElement shop_MugPriceElm =waitForPresenceOfElementLocatedBy(path.mug_price_Label,"unable to locate element");
                seinfeldMugElm.get(0).click();
                String mugPriceTxt = shop_MugPriceElm.getText();
                 int price = Integer.parseInt(mugPriceTxt);
                 int ActualMugPrice = 399*i;
            Assert.assertEquals(price, ActualMugPrice, "Price verified for"+i +"Mug");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            Assert.fail("Unable to verify mug price at ShopPage");
        }
    }
    public void shop_Add_Mugg_To_Cart(){
        try{
            List<WebElement> seinfeldMugElm =waitForPresenceOfAllElementsLocatedBy(path.seinfeldMug_Add_Tab,"unable to locate element");
            for(int i=1; i<=3; i++){
                seinfeldMugElm.get(0).click();
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            Assert.fail("Unable to add mug to cart at ShopPage");
        }
    }
    public void add_CarryBag(){
        try{
            WebElement addCarryElm =waitForPresenceOfElementLocatedBy(path.addBag_CheckBox,"unable to locate element");
            addCarryElm.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
            Assert.fail("Unable to add carry bag at ShopPage");
        }
    }

    public void total_Price_Verification(){
        try{
            WebElement totalPriceElm =waitForPresenceOfElementLocatedBy(path.totalPrice_Label,"unable to locate element");
            String totalPrice_TxtElm =  totalPriceElm.getText();
            WebElement shop_MugPriceElm =waitForPresenceOfElementLocatedBy(path.mug_price_Label,"unable to locate element");
            String shop_MugPriceElm_TxtElm =  shop_MugPriceElm.getText();
            Assert.assertEquals(totalPrice_TxtElm,shop_MugPriceElm_TxtElm," Total Price verified at the ShopPage Successfully");

        }catch (Exception e){
            System.out.println(e.getMessage());
            Assert.fail("Unable to Verify Total price at ShopPage");
        }
    }
}
