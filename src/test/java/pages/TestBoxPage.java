package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CheckResultComponent;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestBoxPage {

    private final SelenideElement fullNameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInpur = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            confirmLocator = $("#submit");
    CheckResultComponent checkResultComponent = new CheckResultComponent();
    public TestBoxPage openPage() { //метод для открытия тестируемой страницы
        open("text-box");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

public TestBoxPage setFullName(String value) { //метод для имени
    fullNameInput.setValue(value);

    return this;
}

    public TestBoxPage setEmail(String value) { //метод для эл.почты
    emailInput.setValue(value);

    return this;
}

    public TestBoxPage setCurrentAddress(String value) { //метод для текущего адресв
        currentAddressInpur.setValue(value);

        return this;
    }

    public TestBoxPage setPermanentAddress(String value) { //метод для постоянного адреса
        permanentAddressInput.setValue(value);

        return this;
    }

    public TestBoxPage confirm() { //метод для подтверждения
        confirmLocator.click();

        return this;
    }

    public TestBoxPage checkResult(String key, String value) { //метод для провери результирующей таблицы

        checkResultComponent.checkOutputResultValues(key, value);

        return this;
    }

}

