package com.myComp.myTeam.ElementLocatorsRepo;

import org.openqa.selenium.By;

public class elementLocators {
    public static final By userName_textBox = By.id("com.tv.testvagrantqa:id/username_text");
    public static final By password_textBox = By.id("com.tv.testvagrantqa:id/password_text");
    public static final By login_tab = By.id("com.tv.testvagrantqa:id/login_btn");
    public static final By seinfeldChar_Tab = By.id("com.tv.testvagrantqa:id/character_link_text_view");
    public static final By shop_Seinfeld_Tab = By.id("com.tv.testvagrantqa:id/shop_link_text_view");

    public static final By shop_Label= By.xpath("//android.widget.TextView[@text='Shop']");
    public static final By seinfeldMug_Add_Tab= By.xpath("//android.widget.Button[@text='+']");
    public static final By mug_price_Label= By.id("com.tv.testvagrantqa:id/mug_price_text_view");
    public static final By addBag_CheckBox= By.xpath("//android.widget.CheckBox[@text='Add Carry Bag?']");
    public static final By totalPrice_Label= By.id("com.tv.testvagrantqa:id/final_price_text_view");


}
