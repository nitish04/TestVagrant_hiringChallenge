package com.myComp.myTeam.Util;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;

public class AppiumConfig extends ExtendedLibrary {
    protected static AppiumDriverLocalService service;
    protected static AppiumServiceBuilder builder;
    protected static DesiredCapabilities cap;


    public static void startServer() throws MalformedURLException {
        try{
            cap = new DesiredCapabilities();
            cap.setCapability("noReset", "true");

            //Build the Appium service
            builder = new AppiumServiceBuilder();
            builder.withIPAddress("127.0.0.1");
            builder.usingPort(4723);
            builder.withCapabilities(cap);
            builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
            builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");

            //Start the server with the builder
            service = AppiumDriverLocalService.buildService(builder);
            service.start();
            Assert.assertTrue(true,"Appium Server started successfully");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("FAIL"+"EXCEPTION at AppiumConfig Page to Start Appium Server" + e.getMessage());

        }

    }
    public static void stopServer()  {
        try{
            service.stop();
            Assert.assertTrue(true,"Appium Server stopped successfully");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("FAIL"+"EXCEPTION at AppiumConfig Page to Stop Appium Server" + e.getMessage());

        }

    }


}
