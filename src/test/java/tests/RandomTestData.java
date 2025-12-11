package tests;

import com.github.javafaker.Faker;

public class RandomTestData {
    static Faker faker = new Faker();
    static String userFirstName = faker.name().firstName();
    static String userLastName = faker.name().lastName();
    static String userNumber = faker.phoneNumber().subscriberNumber(10);
    static String userFullName = faker.name().fullName();
    static String userEmail = faker.internet().emailAddress();
    static String userCurrentAddress = faker.address().fullAddress();
    static String userPermanentAddress = faker.address().fullAddress();
}
