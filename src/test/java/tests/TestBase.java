package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.BuildParameters;
import helpers.Attachments;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.PracticeFormPage;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    static BuildParameters buildParam = new BuildParameters();

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @BeforeAll
    static void beforeAll() {
        if (buildParam.remoteBaseUrl != null) {
            Configuration.remote = "https://" + buildParam.remoteBaseUsername + ":" + buildParam.remoteBasePass + "@" + buildParam.remoteBaseUrl;
        }
        Configuration.baseUrl = buildParam.baseUrl;
        Configuration.browser = buildParam.browser;
        Configuration.browserVersion = buildParam.browserVersion;
        Configuration.headless = Boolean.parseBoolean(buildParam.isHeadless);
        Configuration.browserSize = buildParam.browserSize;
        Configuration.pageLoadStrategy = buildParam.pageLoadStrat;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
        }

    @AfterEach
    void addAttachments() {
        Attachments.screenshotAs("Скрин");
        Attachments.pageSource();
        Attachments.browserConsoleLogs();
        Attachments.addVideo();
        closeWebDriver();
    }
}

