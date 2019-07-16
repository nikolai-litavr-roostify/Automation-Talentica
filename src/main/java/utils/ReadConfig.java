package utils;

import enums.DriverType;
import enums.EnvironmentType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    private Properties pro;
    private final String propertyFilePath= "src/test/java/configFiles/config.properties";

    public ReadConfig() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            pro = new Properties();
            try {
                pro.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }
    public String getDriverPath(){
        String chromeDriver = pro.getProperty("chromePath");
        if(chromeDriver!= null) return chromeDriver;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public long getImplicitlyWait() {
        String implicitWait = pro.getProperty("implicitlyWait");
        if(implicitWait != null) return Long.parseLong(implicitWait);
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }

    public String getApplicationUrl() {
        String url = pro.getProperty("ApplicationUrl");
        if(url != null) return url;
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }


    public String getOs() {
        String osName = pro.getProperty("os");
        if(osName != null) return osName;
        else throw new RuntimeException("browser not specified in the Configuration.properties file.");
    }

    public String getFirefoxDriver() {
        String firefoxDriver = pro.getProperty("firefoxPath");
        if(firefoxDriver != null) return firefoxDriver;
        else throw new RuntimeException("browser not specified in the Configuration.properties file.");
    }

    public String getInternetDriver() {
        String explorerDriver = pro.getProperty("explorerpath");
        if(explorerDriver != null) return explorerDriver;
        else throw new RuntimeException("browser not specified in the Configuration.properties file.");
    }

    public EnvironmentType getEnvironment() {
        String environmentName = pro.getProperty("environment");
        if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
        else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
        else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
    }

    public String getUsername() {
        String usernm = pro.getProperty("username");
        if(usernm != null) return usernm;
        else throw new RuntimeException("browser not specified in the Configuration.properties file.");
    }

    public String getPassword() {
        String passwd = pro.getProperty("password");
        if(passwd != null) return passwd;
        else throw new RuntimeException("browser not specified in the Configuration.properties file.");
    }

    public DriverType getBrowser() {
        String browserName = pro.getProperty("browser");
        if(browserName == null || browserName.equals("Chrome")) return DriverType.CHROME;
        else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
        else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
        else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
    }

    public Boolean getBrowserWindowSize() {
        String windowSize = pro.getProperty("windowMaximize");
        if(windowSize != null) return Boolean.valueOf(windowSize);
        return true;
    }

    public String getTestDataResourcePath(){
        String testDataResourcePath = pro.getProperty("testDataResourcePath");
        if(testDataResourcePath!= null) return testDataResourcePath;
        else throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");
    }

    public String getReportConfigPath(){
        String reportConfigPath = pro.getProperty("reportConfigPath");
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }
}

