package utils;

import tests.RandomTestData;

import java.util.concurrent.ThreadLocalRandom;


public class RandomValuesUtil extends RandomTestData {

    public static void main(String[] args) { //отладка
        System.out.println();

    }


//    public static String getRandomString(int len) { //хороший метод для генерации строки

    /// /        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//
//        SecureRandom rnd = new SecureRandom();
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < len; i++)
//            result.append(AB.charAt(rnd.nextInt(AB.length())));
//
//        return result.toString();
//    }
//
    public static int getRandomInt(int min, int max) { //метод генерации числовых значений
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

//    // +3 (263) 253 - 66 - 12
//    public static String getRandomPhoneExtended() { //генерация форматированного телефона например
//        return "+" + getRandomInt(1, 9) + " (" ....
//
//      String.format("Hello, %s!", "username"); -> "Hello, username!";
//      String.format("Hello, %s %s!", "Alex", "Egorov"); -> "Hello, Alex !";
//        String.format("Hello, %s %s %s!", "Alex", "Egorov"); -> "Hello, Alex !";
//
//        return String.format("+%s (%s) %s - %s - %s", getRandomInt(1, 9), getRandomInt(111, 999),
//                getRandomInt(111, 999), getRandomInt(11, 99), getRandomInt(11, 99));
//    }

    public static String getRandomItemFromStringArray(String[] stringArray) {
        int arrayLenght = stringArray.length - 1;
        int randomInt = getRandomInt(0, arrayLenght);

        return stringArray[randomInt];
    }

    //gender
//    public static String getRandomGender() {
//        String[] genders = {"Male", "Female", "Other"};
//
//        String randomGender = getRandomItemFromStringArray(genders);
//
//        return randomGender;
//    }
    //birth

//    public static String getRandomYear() {
//        String year = getRandomInt(1970, 2100) + "";
//
//        return year;
//    }
//
//    static RandomValuesUtil randomValuesUtilY = new RandomValuesUtil();
//    public static String chosenYear = randomValuesUtilY.getRandomYear();
//
//
//    public static String getRandomMonth() {
//        String[] months = {"January", "February", "March", "April",
//                "May", "June", "July", "August",
//                "September", "October", "November", "December",};
//
//        String randomMonth = getRandomItemFromStringArray(months);
//
//        return randomMonth;
//    }
//
//    static RandomValuesUtil randomValuesUtilM = new RandomValuesUtil();
//    public static String chosenMonth = randomValuesUtilM.getRandomMonth();


//    public static String getRandomDay() {
//        String randomDay = ""; //обьявили и инициализировали переменную для хранения случайного дня
//        String pickedYear = chosenYear; //получаем случайный год
//        String pickedMonth = chosenMonth; //получаем случайный месяц
//        int intYear = Integer.parseInt(pickedYear); //приводим год к типу Число
//        String[] monthsWith31Day = {"January", "March", "May", "July", "August", "October", "December"};
//        String[] monthsWith30Day = {"April", "June", "September", "November"};
//        boolean found31 = Arrays.stream(monthsWith31Day)
//                .anyMatch(s -> s.equals(pickedMonth));
//        boolean found30 = Arrays.stream(monthsWith30Day)
//                .anyMatch(s -> s.equals(pickedMonth));
//        if ((intYear % 100 == 0) && ((intYear % 400 != 0))) { //если год НЕ високосный
//            if (found31) { //если в месяце 31 день
//                randomDay = getRandomInt(1, 31) + "";
//            } else if (found30) { //если в месяце 30 дней
//                randomDay = getRandomInt(1, 30) + "";
//            } else { //если это февраль
//                randomDay = getRandomInt(1, 28) + "";
//            }
//        } else { //если год високосный - всё тоже самое, но в феврале на 1 день больше
//            if (found31) {
//                randomDay = getRandomInt(1, 31) + "";
//
//            } else if (found30) {
//                randomDay = getRandomInt(1, 30) + "";
//            } else {
//                randomDay = getRandomInt(1, 29) + "";
//            }
//        }
//        int randomDayInt = Integer.parseInt(randomDay);
//        if (randomDayInt < 10) //если день меньше 10 добавляем 0 чтобы правильно попадать в локатор
//            randomDay = "0" + randomDay;
//        return randomDay; // получаем наш день
//    }
//
//    static RandomValuesUtil randomValuesUtilD = new RandomValuesUtil();
//    public static String chosenDay = randomValuesUtilD.getRandomDay();


    //subject
//    public static String getRandomSubject() {
//        String[] subjects = {
//                "Accounting",
//                "Arts",
//                "Biology",
//                "Business Studies",
//                "Chemistry",
//                "Civics",
//                "Commerce",
//                "Computer Science",
//                "Economics",
//                "English",
//                "Finance",
//                "Hindi",
//                "History",
//                "Maths",
//                "Physics",
//                "Social Studies"
//        };
//
//        String randomSubject = getRandomItemFromStringArray(subjects);
//
//        return randomSubject;
//    }

    //hobbies (how to set 2?)

    public static String userHobby = faker.options().option("Sports", "Reading", "Music");

//    public static final String getRandomHobby() {
//        String[] hobbies = {"Sports", "Reading", "Music"};
//
//        String randomHobby = getRandomItemFromStringArray(hobbies);
//
//        return randomHobby;
//    }

//    static RandomValuesUtil randomValuesUtilH = new RandomValuesUtil();
//    public static String chosenHobby = randomValuesUtilH.getRandomHobby();


    public static final String getRandomHobby2() {
        String randomHobby2 = "";
        String selectedHobby = userHobby;
        //String[] hobbies = {"Sports", "Reading", "Music"};
        if ((!selectedHobby.equals("Music"))) {
            randomHobby2 = "Music";
        } else {
            randomHobby2 = faker.options().option("Sports", "Reading");
        }

        return randomHobby2;
    }

    //picture
//    public static String getRandomPicture() {
//        String[] pictures = {"sample.png", "sample1.png"};
//
//        String randomPictures = getRandomItemFromStringArray(pictures);
//
//        return randomPictures;
//    }

    //state states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
    public String getRandomState() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

        String randomState = getRandomItemFromStringArray(states);

        return randomState;
    }

    public static String userStates = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");

    static RandomValuesUtil randomValuesUtilS = new RandomValuesUtil();
    public static String chosenState = randomValuesUtilS.getRandomState();

    //city
    public static String getRandomCity() {
        String randomCity = "";
//        String[] citiesNCR = {"Delhi", "Gurgaon", "Noida"};
//        String[] citiesUttarPradesh = {"Agra", "Lucknow", "Merrut"};
//        String[] citiesHaryana = {"Karnal", "Panipat"};
//        String[] citiesRajasthan = {"Jaipur", "Jaiselmer"};
        if (userStates.equals("NCR")) {
            randomCity = faker.options().option("Delhi", "Gurgaon", "Noida");
        } else if (userStates.equals("Uttar Pradesh")) {
            randomCity = faker.options().option("Agra", "Lucknow", "Merrut");
        } else if (userStates.equals("Haryana")) {
            randomCity = faker.options().option("Karnal", "Panipat");
        } else {
            randomCity = faker.options().option("Jaipur", "Jaiselmer");
        }
        return randomCity;
    }
}
