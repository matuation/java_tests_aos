package tests;

import org.junit.jupiter.api.Test;
import pages.TestBoxPage;


public class TextBoxTests extends TestBase {

    TestBoxPage testBoxPage = new TestBoxPage();

    @Test
    void fillFormTest() {
        testBoxPage.openPage()
                .setFullName("Barry Methods")
                .setEmail("me@you.com")
                .setCurrentAddress("value1")
                .setPermanentAddress("value2")
                .confirm()
                .checkResult("Name", "Barry Methods")
                .checkResult("Email", "me@you.com")
                .checkResult("Current Address", "value1")
                .checkResult("Permananet Address", "value2");
    }
}