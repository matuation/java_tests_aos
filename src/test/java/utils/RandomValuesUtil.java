package utils;

import tests.RandomTestData;

import java.util.concurrent.ThreadLocalRandom;


public class RandomValuesUtil extends RandomTestData {

    public static void main(String[] args) { //отладка
        System.out.println();

    }


    public static int getRandomInt(int min, int max) { //метод генерации числовых значений

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }


    public static String getRandomItemFromStringArray(String[] stringArray) {
        int arrayLenght = stringArray.length - 1;
        int randomInt = getRandomInt(0, arrayLenght);

        return stringArray[randomInt];
    }


    public static String userHobby = faker.options().option("Sports", "Reading", "Music");


    public static final String getRandomHobby2() {
        String randomHobby2 = "";
        String selectedHobby = userHobby;

        if ((!selectedHobby.equals("Music"))) {
            randomHobby2 = "Music";
        } else {
            randomHobby2 = faker.options().option("Sports", "Reading");
        }

        return randomHobby2;
    }


    public static String userStates = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");


    public static String getRandomCity() {
        return switch (userStates) {

            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> null;
        };
    }


}
