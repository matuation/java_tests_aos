package tests;

import com.github.javafaker.Faker;

import static utils.RandomValuesUtil.*;

public class RandomTestData {
    protected static Faker faker = new Faker();
    static String userFirstName = faker.name().firstName();
    static String userLastName = faker.name().lastName();
    static String userNumber = faker.phoneNumber().subscriberNumber(10);
    static String userFullName = faker.name().fullName();
    static String userEmail = faker.internet().emailAddress();
    static String userCurrentAddress = faker.address().fullAddress();
    static String userPermanentAddress = faker.address().fullAddress();
    static String userGender = faker.options().option("Male", "Female", "Other");
    static String userDayOfBirth = String.format("%s", faker.number().numberBetween(10, 28));
    ;
    static String userMonthOfBirth = String.format("%s", faker.options().option("January", "February", "March",
            "April", "May", "June", "July", "August",
            "September", "October", "November", "December"));
    static String userYearOfBirth = String.format("%s", faker.number().numberBetween(1980, 2010));
    static String userSubject = faker.options().option("Accounting",
            "Arts", "Biology", "Business Studies", "Chemistry", "Civics", "Commerce", "Computer Science",
            "Economics", "English", "Finance", "Hindi", "History", "Maths", "Physics", "Social Studies");
    static String userHobby1 = userHobby;
    static String userHobby2 = getRandomHobby2();
    static String userPicture = faker.options().option("sample.png", "sample1.png");
    static String userState = userStates;
    static String userCity = getRandomCity();


}

