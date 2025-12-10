package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage { //класс объектов страницы automation-practice-form
    private SelenideElement firstNameInput = $("#firstName"), //создаем переменные для хранения локаторов
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
     resultTable = $(".table"),
     page = $("#app");


    CalendarComponent calendarComponent = new CalendarComponent(); //создаем новый объект типа CalendarComponent для использования в методе выбора объекта типа календарь

    public PracticeFormPage openPage() { //метод для открытия тестируемой страницы
        open("automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public PracticeFormPage setFirstName(String value) { //метод для имени
        firstNameInput.setValue(value);

        return this;
    }

    public PracticeFormPage setLastName(String value) { //метод для фамилии
        lastNameInput.setValue(value);

        return this;
    }

    public PracticeFormPage setEmail(String value) { //метод для эл. почты
        userEmailInput.setValue(value);

        return this;
    }

    public PracticeFormPage setGenderRadio(String value) { //метод для пола
        userGenderSelect.$(byText(value)).click();

        return this;
    }

    public PracticeFormPage setUserNumber(String value) { //метод для телефона
        userNumberInput.setValue(value);

        return this;
    }

    public PracticeFormPage setDateOfBirth(String day, String month, String year) { //метод для дня рождения
        calendarInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public PracticeFormPage setSubject(String value) { //метод для темы
        usersubjectInput.setValue(value).pressEnter().scrollTo();

        return this;
    }

    public PracticeFormPage setHobbies(String value) { //метод для хобби
        userHobbiesSelect.$(byText(value)).click();

        return this;
    }

    public PracticeFormPage setUserPicture(String value) { //метод для картинки
        userPictureUpload.uploadFromClasspath(value);

        return this;
    }

    public PracticeFormPage setUserCurrentAddress(String value) { //метод для адреса
        usercurrentAddressInput.setValue(value);

        return this;
    }

    public PracticeFormPage setUserState(String value) { //метод для штата
        userStateListInput.click();
        userStateCityListInput.$(byText(value)).click();

        return this;
    }

    public PracticeFormPage setUserCity(String value) { //метод для города
        userCityListInput.click();
        userStateCityListInput.$(byText(value)).click();

        return this;
    }

    public PracticeFormPage confirm() { //метод для подтверждения
        confirmLocator.click();

        return this;
    }

    public PracticeFormPage checkResult(String key, String value) { //метод для провери результирующей таблицы
        resultTable.shouldHave(text(key)).parent().shouldHave(text(value));

        return this;
    }

    public PracticeFormPage checkNegativeResult(String value) { //метод для провери результирующей таблицы
        page.shouldNotHave(text(value));

        return this;
    }
}