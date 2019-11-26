package com.myComp.myTeam.Util;

import com.myComp.myTeam.ElementLocatorsRepo.elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class ExtendedLibrary extends AndroidCapabilities {

   public static Reference _ref = new Reference();

   public static elementLocators path;




   public WebElement waitForPresenceOfElementLocatedBy(final By locator, String errorMessage){
      try{
      WebDriverWait wait =new WebDriverWait(driver,30);
      WebElement elm = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
      return elm;
      } catch (WebDriverException we) {
         System.out.println(errorMessage);
         return null;
      }
   }

   public List<WebElement> waitForPresenceOfAllElementsLocatedBy(final By locator,String errorMessage){
      try {
         WebDriverWait wait = new WebDriverWait(driver, 30);
         List<WebElement> elm = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
         return elm;
      }catch (WebDriverException we){

         System.out.println(errorMessage);
         return null;
      }
   }

}
