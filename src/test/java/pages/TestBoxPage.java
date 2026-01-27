package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
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
    @Step("Открыть форму")
    public TestBoxPage openPage() { //метод для открытия тестируемой страницы
        open("text-box");

        return this;
    }
    @Step("Закрыть баннеры")
    public TestBoxPage closeBanners() { //метод для открытия тестируемой страницы
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }
    @Step("Ввести полное имя {value}")
    public TestBoxPage setFullName(String value) { //метод для имени
    fullNameInput.setValue(value);

    return this;
}
    @Step("Ввести эл. почту {value}")
    public TestBoxPage setEmail(String value) { //метод для эл.почты
    emailInput.setValue(value);

    return this;
}
    @Step("Ввести текущий адрес {value}")
    public TestBoxPage setCurrentAddress(String value) { //метод для текущего адресв
        currentAddressInpur.setValue(value);

        return this;
    }
    @Step("Ввести постоянный адрес {value}")
    public TestBoxPage setPermanentAddress(String value) { //метод для постоянного адреса
        permanentAddressInput.setValue(value);

        return this;
    }
    @Step("Подтвердить отправку формы")
    public TestBoxPage confirm() { //метод для подтверждения
        confirmLocator.click();

        return this;
    }
    @Step("Проверить, что значение поля {key} содержит ожидаемое {value}")
    public TestBoxPage checkResult(String key, String value) { //метод для провери результирующей таблицы

        checkResultComponent.checkOutputResultValues(key, value);

        return this;
    }

}

