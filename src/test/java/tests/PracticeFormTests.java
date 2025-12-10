package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

public class PracticeFormTests extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void successfulFormFillTest(){
        practiceFormPage.openPage() // открываем форму и заполняем форму
                .setFirstName("Sven")
                .setLastName("Macshnacnecs")
                .setEmail("sven@macshnacnecs.com")
                .setGenderRadio("Other")
                .setUserNumber("1234567890")
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
                .checkResult("Student Name", "Sven Macshnacnecs")
                .checkResult("Student Email", "sven@macshnacnecs.com")
                .checkResult("Gender", "Other")
                .checkResult("Mobile", "1234567890")
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
        .setFirstName("Sven")
        .setLastName("Macshnacnecs")
        .setGenderRadio("Other")
        .setUserNumber("1234567890")
        .confirm()
        .checkResult("Student Name", "Sven Macshnacnecs")
        .checkResult("Gender", "Other")
        .checkResult("Mobile", "1234567890")
        .checkResult("Date of Birth", "10 December,2025");

        }

    @Test
    void NegativeFormFillTest(){
        practiceFormPage.openPage()
                .confirm()
                .checkNegativeResult("Thanks for submitting the form");

    }
}
