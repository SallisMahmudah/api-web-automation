package starter.pages;

import starter.TestInstrument;

import java.util.Random;

public class Helper extends TestInstrument {
    public static String generateFirstNameFaker() {
        Random rand = new Random();
        String[] firstNameList = {"Salis", "Mahmudah", "Trisya", "Syauqi", "Rahmat"};
        String firstName = firstNameList[rand.nextInt(firstNameList.length)];

        return firstName;
    }

    public static String generateLastNameFaker() {
        Random rand = new Random();
        String[] lastNameList = { "Sugara", "Ramadhan", "Wafa", "Belfa", "Willys"};

        String lastName = lastNameList[rand.nextInt(lastNameList.length)];

        return lastName;
    }

    public static String generateEmailFaker() {
        return generateFirstNameFaker() + generateLastNameFaker() + "@gmail.com";
    }
}
