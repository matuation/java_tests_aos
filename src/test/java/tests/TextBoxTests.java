package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.TestBoxPage;

import static tests.RandomTestData.*;


public class TextBoxTests extends TestBase {

    TestBoxPage testBoxPage = new TestBoxPage();



    @Test
    @DisplayName("Успешная отправка формы")
    void fillFormTest() {

        testBoxPage.openPage()
                .closeBanners()
                .setFullName(userFullName)
                .setEmail(userEmail)
                .setCurrentAddress(userCurrentAddress)
                .setPermanentAddress(userPermanentAddress)
                .confirm()
                .checkResult("Name", userFullName)
                .checkResult("Email", userEmail)
                .checkResult("Current Address", userCurrentAddress)
                .checkResult("Permananet Address", userPermanentAddress);
    }
}