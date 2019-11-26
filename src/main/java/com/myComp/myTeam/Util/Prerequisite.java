package com.myComp.myTeam.Util;

import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static com.myComp.myTeam.Util.AppiumConfig.startServer;
import static com.myComp.myTeam.Util.AppiumConfig.stopServer;

public class Prerequisite extends ExtendedLibrary {
    public static Map<String, String> configMap;


    @BeforeSuite()
    public void initialize(ITestContext context) throws MalformedURLException {

        getExecutionConfig();
        startServer();
    }


    public void getExecutionConfig() {
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("./src/main/java/resources/conf/GlobalConfig.properties"));
            configMap = new HashMap<String, String>();
            for (String key : prop.stringPropertyNames()) {
                configMap.put(key, prop.getProperty(key));
            }
        } catch (Exception e) {

        }
    }
    @AfterSuite()
    public void ending() {
        stopServer();

    }
}
