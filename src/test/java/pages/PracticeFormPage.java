package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.CalendarComponent;
import pages.components.CheckResultComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage { //класс объектов страницы automation-practice-form
    private final SelenideElement firstNameInput = $("#firstName"), //создаем переменные для хранения локаторов
     lastNameInput = $("#lastName"),
     userEmailInput = $("#userEmail"),
     userGenderSelect = $("#genterWrapper"),
     userNumberInput = $("#userNumber"),
     calendarInput = $("#dateOfBirthInput"),
     usersubjectInput = $("#subjectsInput"),
     userHobbiesSelect = $("#hobbiesWrapper"),
     userPictureUpload = $("#uploadPicture"),
     usercurrentAddressInput = $("#currentAddress"),
     userStateListInput = $("#state"),
     userCityListInput = $("#city"),
     userStateCityListInput = $(".css-26l3qy-menu"),
     confirmLocator =  $("#submit"),
     page = $("#app");

     public static String submitMessage = "Thanks for submitting the form";


    CalendarComponent calendarComponent = new CalendarComponent(); //создаем новый объект типа CalendarComponent для использования в методе выбора объекта типа календарь
    CheckResultComponent checkResultComponent = new CheckResultComponent();
    @Step("Открыть форму регистрации /automation-practice-form")
    public PracticeFormPage openPage() { //метод для открытия тестируемой страницы
        open("automation-practice-form");

        return this;
    }
    @Step("Закрыть баннеры")
    public PracticeFormPage closeBanners() { //метод для открытия тестируемой страницы
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }
    @Step("Ввести имя {value}")
    public PracticeFormPage setFirstName(String value) { //метод для имени
        firstNameInput.setValue(value);

        return this;
    }
    @Step("Ввести фамилию {value}")
    public PracticeFormPage setLastName(String value) { //метод для фамилии
        lastNameInput.setValue(value);

        return this;
    }
    @Step("Ввести эл. почту {value}")
    public PracticeFormPage setEmail(String value) { //метод для эл. почты
        userEmailInput.setValue(value);

        return this;
    }
    @Step("Выбрать пол {value}")
    public PracticeFormPage setGenderRadio(String value) { //метод для пола
        userGenderSelect.$(byText(value)).click();

        return this;
    }
    @Step("Ввести номер телефона {value}")
    public PracticeFormPage setUserNumber(String value) { //метод для телефона
        userNumberInput.setValue(value);

        return this;
    }
    @Step("Ввести дату рождения {value}")
    public PracticeFormPage setDateOfBirth(String day, String month, String year) { //метод для дня рождения
        calendarInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }
    @Step("Выбрать предмет {value}")
    public PracticeFormPage setSubject(String value) { //метод для темы
        usersubjectInput.setValue(value).pressEnter().scrollTo();

        return this;
    }
    @Step("Выбрать хобби {value}")
    public PracticeFormPage setHobbies(String value) { //метод для хобби
        userHobbiesSelect.$(byText(value)).click();

        return this;
    }
    @Step("Загрузить фотографию {value}")
    public PracticeFormPage setUserPicture(String value) { //метод для картинки
        userPictureUpload.uploadFromClasspath(value);

        return this;
    }
    @Step("Ввести текущий адрес {value}")
    public PracticeFormPage setUserCurrentAddress(String value) { //метод для адреса
        usercurrentAddressInput.setValue(value);

        return this;
    }
    @Step("Выбрать штат {value}")
    public PracticeFormPage setUserState(String value) { //метод для штата
        userStateListInput.click();
        userStateCityListInput.$(byText(value)).click();

        return this;
    }
    @Step("Выбрать город {value}")
    public PracticeFormPage setUserCity(String value) { //метод для города
        userCityListInput.click();
        userStateCityListInput.$(byText(value)).click();

        return this;
    }
    @Step("Подтвердить отправку формы")
    public PracticeFormPage confirm() { //метод для подтверждения
        confirmLocator.click();

        return this;
    }
    @Step("Проверить, что значение поля {key} содержит ожидаемое {value}")
    public PracticeFormPage checkResult(String key, String value) { //метод для провери результирующей таблицы
        checkResultComponent.checkTableResultValues(key, value);

        return this;
    }
    @Step("Проверить, что значение не содержит ожидаемое {value}")
    public PracticeFormPage checkNegativeResult(String value) { //метод для провери результирующей таблицы
        page.shouldNotHave(text(value));

        return this;
    }
}