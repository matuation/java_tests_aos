package tests;

import com.github.javafaker.Faker;
import static utils.RandomValuesUtil.*;

public class RandomTestData {
    static Faker faker = new Faker();
    static String userFirstName = faker.name().firstName();
    static String userLastName = faker.name().lastName();
    static String userNumber = faker.phoneNumber().subscriberNumber(10);
    static String userFullName = faker.name().fullName();
    static String userEmail = faker.internet().emailAddress();
    static String userCurrentAddress = faker.address().fullAddress();
    static String userPermanentAddress = faker.address().fullAddress();
    static String userGender = getRandomGender();
    static String userDayOfBirth = chosenDay;
    static String userMonthOfBirth = chosenMonth;
    static String userYearOfBirth = chosenYear;
    static String userSubject = getRandomSubject();
    static String userHobby1 = chosenHobby;
    static String userHobby2 = getRandomHobby2();
    static String userPicture = getRandomPicture();
    static String userState = chosenState;
    static String userCity = getRandomCity();



}

