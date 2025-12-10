package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent { //компонент для работы с объектами типа Календарь

    public void setDate(String day, String month, String year) {

        $(".react-datepicker__year-select").$(byText(year)).click();
        $(".react-datepicker__month-select").$(byText(month)).click();
        $(".react-datepicker__day--0" + day).click();


    }
}
