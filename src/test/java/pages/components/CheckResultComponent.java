package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckResultComponent {
    private final SelenideElement output = $("#output"),
            table = $(".table");

    public void checkOutputResultValues(String key, String value) {
        output.shouldHave(text(key)).parent().shouldHave(text(value));

    }

    public void checkTableResultValues(String key, String value) {
        table.shouldHave(text(key)).parent().shouldHave(text(value));

    }
}
