package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

import static pages.PracticeFormPage.submitMessage;
import static tests.RandomTestData.*;

import tests.RandomTestData.*;


public class PracticeFormTests extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void successfulFormFillTest(){
        practiceFormPage.openPage() // открываем форму и заполняем форму
                .closeBanners()
                .setFirstName(userFirstName)
                .setLastName(userLastName)
                .setEmail(userEmail)
                .setGenderRadio(userGender)
                .setUserNumber(userNumber)
                .setDateOfBirth(userDayOfBirth, userMonthOfBirth, userYearOfBirth)
                .setSubject(userSubject)
                .setHobbies(userHobby1)
                .setHobbies(userHobby2)
                .setUserPicture(userPicture)
                .setUserCurrentAddress(userCurrentAddress)
                .setUserState(userState)
                .setUserCity(userCity)
                .confirm()
                //проверяем итоговую таблицу
                .checkResult("Student Name", userFirstName + " " + userLastName)
                .checkResult("Student Email", userEmail)
                .checkResult("Gender", userGender)
                .checkResult("Mobile", userNumber)
                .checkResult("Date of Birth", userDayOfBirth + " " + userMonthOfBirth +  "," + userYearOfBirth)
                .checkResult("Subjects", userSubject)
                .checkResult("Hobbies", userHobby1 + ", " + userHobby2)
                .checkResult("Picture", userPicture)
                .checkResult("Address", userCurrentAddress)
                .checkResult("State and City", userState + " " + userCity);
    }
    @Test
    void successfulMinFormFillTest(){
        practiceFormPage.openPage()
                .closeBanners()
                .setFirstName(userFirstName)
                .setLastName(userLastName)
                .setGenderRadio(userGender)
                .setUserNumber(userNumber)
                .setDateOfBirth(userDayOfBirth, userMonthOfBirth, userYearOfBirth)
                .confirm()
                .checkResult("Student Name", userFirstName + " " + userLastName)
                .checkResult("Gender", userGender)
                .checkResult("Mobile", userNumber)
                .checkResult("Date of Birth", userDayOfBirth + " " + userMonthOfBirth +  "," + userYearOfBirth);

        }

    @Test
    void NegativeFormFillTest(){
        practiceFormPage.openPage()
                .closeBanners()
                .confirm()
                .checkNegativeResult(submitMessage);

    }
}
