package config;

public class BuildParameters {
    public String browser = System.getProperty("browser", "chrome");
    public String browserVersion = System.getProperty("browserVersion");
    public String baseUrl = System.getProperty("baseUrl", "https://demoqa.com/");
    public String remoteBaseUsername = System.getProperty("remoteBaseUsername");
    public String remoteBasePass = System.getProperty("remoteBasePass");
    public String remoteBaseUrl = System.getProperty("remoteBaseUrl");
    public String isHeadless = System.getProperty("isHeadless", "false");
    public String browserSize = System.getProperty("browserSize", "1920x1080");
    public String pageLoadStrat = System.getProperty("pageLoadStrat", "eager");

}
