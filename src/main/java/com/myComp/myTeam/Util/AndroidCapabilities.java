package com.myComp.myTeam.Util;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidCapabilities {

    protected static AndroidDriver driver;

    public static void nativeAppCap() throws MalformedURLException {
        try{
            File file = new File(System.getProperty("user.dir")+"/App_ApkFileshh/app-debug.apk");
            System.setProperty("app-debug.apk", file.getAbsolutePath());
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "pixel_xl (Google)");
            capabilities.setCapability("platformVersion", "10.0");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.tv.testvagrantqa");
            capabilities.setCapability("appActivity", ".MainActivity");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
