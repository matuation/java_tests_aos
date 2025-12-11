package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;
import static tests.RandomTestData.*;

public class PracticeFormTests extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void successfulFormFillTest(){
        practiceFormPage.openPage() // открываем форму и заполняем форму
                .closeBanners()
                .setFirstName(userFirstName)
                .setLastName(userLastName)
                .setEmail(userEmail)
                .setGenderRadio("Other")
                .setUserNumber(userNumber)
                .setDateOfBirth("20", "July", "1991")
                .setSubject("Accounting")
                .setHobbies("Reading")
                .setHobbies("Music")
                .setUserPicture("sample.png")
                .setUserCurrentAddress("1835 73rd Ave NE, Medina, WA 98039, USA")
                .setUserState("Uttar Pradesh")
                .setUserCity("Merrut")
                .confirm()
                //проверяем итоговую таблицу
                .checkResult("Student Name", userFirstName + " " + userLastName)
                .checkResult("Student Email", userEmail)
                .checkResult("Gender", "Other")
                .checkResult("Mobile", userNumber)
                .checkResult("Date of Birth", "20 July,1991")
                .checkResult("Subjects", "Accounting")
                .checkResult("Hobbies", "Reading, Music")
                .checkResult("Picture", "sample.png")
                .checkResult("Address", "1835 73rd Ave NE, Medina, WA 98039, USA")
                .checkResult("State and City", "Uttar Pradesh Merrut");
    }
    @Test
    void successfulMinFormFillTest(){
        practiceFormPage.openPage()
                .closeBanners()
                .setFirstName(userFirstName)
                .setLastName(userLastName)
                .setGenderRadio("Other")
                .setUserNumber(userNumber)
                .setDateOfBirth("20", "July", "1991")
                .confirm()
                .checkResult("Student Name", userFirstName + " " + userLastName)
                .checkResult("Gender", "Other")
                .checkResult("Mobile", userNumber)
                .checkResult("Date of Birth", "20 July,1991");

        }

    @Test
    void NegativeFormFillTest(){
        practiceFormPage.openPage()
                .closeBanners()
                .confirm()
                .checkNegativeResult("Thanks for submitting the form");

    }
}
