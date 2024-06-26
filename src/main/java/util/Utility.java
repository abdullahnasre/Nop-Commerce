package util;

import java.util.Random;

public class Utility {
    public static String getRandomFirstName() {
        String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace", "Henry", "Isabel", "Jack"};
        Random random = new Random();
        int index = random.nextInt(firstNames.length);
        return firstNames[index];
    }

    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com"};
        String firstName = randomString(10); // Generate random alphanumeric string
        String lastName = randomString(5);  // Generate random alphanumeric string
        String domain = domains[(int) (Math.random() * domains.length)]; // Pick random domain
        return firstName + "." + lastName + "@" + domain;
    }

    private static String randomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
    public static String generateComplexPassword() {
        int minLength = 8;
        int maxLength = 12; // Increase for stronger passwords
        int length = (int) (Math.random() * (maxLength - minLength + 1)) + minLength;

        StringBuilder password = new StringBuilder();
        int remainingChars = length;
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = lowercase.toUpperCase();
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()_+-=[]{};':\\|,.<>/?";

        // Ensure at least one character from each category
        String[] charCategories = {lowercase, uppercase, digits, specialChars};
        for (String category : charCategories) {
            password.append(category.charAt((int) (Math.random() * category.length())));
            remainingChars--;
        }

        // Fill remaining characters with random characters from all categories
        while (remainingChars > 0) {
            String allChars = lowercase + uppercase + digits + specialChars;
            int index = (int) (Math.random() * allChars.length());
            password.append(allChars.charAt(index));
            remainingChars--;
        }

        // Shuffle characters for better randomness (optional)
        char[] chars = password.toString().toCharArray();
        shuffleArray(chars);
        return new String(chars);
    }

    private static void shuffleArray(char[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            char temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
    public static String generateWeekPassword() {
        StringBuilder password = new StringBuilder();
        String digits = "0123456789";

        // Generate four random digits
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * digits.length());
            password.append(digits.charAt(index));
        }

        return password.toString();
    }


    public static int generateRandomIntFrom1To3() {
        Random random = new Random();
        int randomInt = random.nextInt(3);
        return randomInt + 1;
    }

    public static int generateRandomIntFrom1To4() {
        Random random = new Random();
        int randomInt = random.nextInt(4);
        return randomInt + 1;
    }

    public static String generateRandomComputerKeywords() {
        String[] computerTypes = {"mac", "asus", "lenovo"};
        int randomIndex = (int) (Math.random() * computerTypes.length);
        String randomComputerType = computerTypes[randomIndex];
        return randomComputerType;
    }

    public static void keyword(String searchKeyword) {
        System.out.println("Using search keyword in key method: " + searchKeyword);
    }

    public static class RandomEmailGenerator {
        public static String generateRandomEmail() {
            int nameLength = 4 + new Random().nextInt(4); // Length between 6-13 characters
            String firstName = randomString(nameLength, "abcdefghij");
            int lastNameLength = 4 + new Random().nextInt(4); // Length between 4-9 characters
            String lastName = randomString(lastNameLength, "abcdefghij");
            int number = new Random().nextInt(999); // Random number between 0-999
            String email = firstName + "." + lastName + number + "@gmail.com";
            SharedData.sharedEmail = email; // Save the generated email to SharedData
            return email;
        }

        private static String randomString(int length, String characters) {
            StringBuilder result = new StringBuilder(length);
            Random random = new Random();
            for (int i = 0; i < length; i++) {
                int charIndex = random.nextInt(characters.length());
                result.append(characters.charAt(charIndex));
            }
            return result.toString();
        }
    }
}


//package util;
//
//import java.util.Random;
//
//public class Utility {
//    public static String getRandomFirstName() {
//        String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace", "Henry", "Isabel", "Jack"};
//        Random random = new Random();
//        int index = random.nextInt(firstNames.length);
//        return firstNames[index];
//    }
//
//
//    public static int generateRandomIntFrom1To3() {
//        // Create a Random object
//        Random random = new Random();
//
//        // Generate a random integer between 0 (inclusive) and 2 (exclusive)
//        int randomInt = random.nextInt(3);
//
//        // Add 1 to get the range from 1 to 3 (inclusive)
//        return randomInt + 1;
//    }
//
//    public static int generateRandomIntFrom1To4() {
//        // Create a Random object
//        Random random = new Random();
//
//        // Generate a random integer between 0 (inclusive) and 6 (exclusive)
//        int randomInt = random.nextInt(4);
//
//        // Add 1 to get the range from 1 to 7 (inclusive)
//        return randomInt + 1;
//    }
//
//    public static String generateRandomComputerKeywords() {
//        // Define an array of computer types
//        String[] computerTypes = {"mac", "asus", "lenovo"};
//
//        // Generate a random number between 0 and the length of the array minus 1
//        int randomIndex = (int) (Math.random() * computerTypes.length);
//
//        // Select a random computer type from the array based on the index
//        String randomComputerType = computerTypes[randomIndex];
//
//        return randomComputerType;
//    }
//
//    public static void keyword(String searchKeyword) {
//        // You can use the searchKeyword variable here
//        System.out.println("Using search keyword in key method: " + searchKeyword);
//
//        // Example: Perform a search using the keyword
//        // ... your search logic using searchKeyword
//    }
////
////    public static void main(String[] args) {
////        // Test the generateRandomComputerKeywords method
////        String searchKeyword = generateRandomComputerKeywords();
////        System.out.println("Generated Search Keyword: " + searchKeyword);
////
////        // Call the jey method with the generated keyword
////        keyword(searchKeyword);
////    }
//
//
//    public  class RandomEmailGenerator {
//
//
//        public static String generateRandomEmail() {
//            int nameLength = 4 + new Random().nextInt(4); // Length between 6-13 characters
//            String firstName = randomString(nameLength, "abcdefghij");
//            int lastNameLength = 4 + new Random().nextInt(4); // Length between 4-9 characters
//            String lastName = randomString(lastNameLength, "abcdefghij");
//            int number = new Random().nextInt(999); // Random number between 0-999998
//            return firstName + "." + lastName + number + "@gmail.com";
//        }
//
//        private static String randomString(int length, String characters) {
//            StringBuilder result = new StringBuilder(length);
//            Random random = new Random();
//            for (int i = 0; i < length; i++) {
//                int charIndex = random.nextInt(characters.length());
//                result.append(characters.charAt(charIndex));
//            }
//            return result.toString();
//        }
//
//        public static void main(String[] args) {
//            String domain = "@gmail.com";
//            // Test 1: Generate random email
//            String email1 = generateRandomEmail();
//            System.out.println("Generated Email 1: " + email1);
//            // Test 2: Expected format
//            String expectedFormat = "^[a-z0-9]+\\.[a-z0-9]+[0-9]{6}@" + domain + "$";
//            if (email1.matches(expectedFormat)) {
//                System.out.println("Test 2 Passed: Email format matches expected pattern");
//
//            } else {
//                System.out.println("Test 2 Failed: Email format does not match expected pattern");
//            }
//        }
//    }
//}
//
//
//
//
////    public static int generateRandomIntFrom1To3() {
////        // Attempt to reuse results from generateRandomIntFrom1To7
////        int randomInt = generateRandomIntFrom1To7();
////        if (randomInt <= 3) {
////            return randomInt;
////        }
////
////        // If not within 1-3 range, try again with a limited random number
////        for (int i = 0; i < 3; i++) { // Repeat a limited number of times (adjust as needed)
////            int limitedRandomInt = new Random().nextInt(3); // Create a new Random object here
////            if (limitedRandomInt != 0) { // Avoid returning 0 (adjust if 0 is valid)
////                return limitedRandomInt + 1;
////            }
////        }
////
////        // If retries fail, throw an exception (or choose a different fallback strategy)
////        throw new RuntimeException("Failed to generate random int from 1 to 3 after retries");
////    }
////
////    public static int generateRandomIntFrom1To7() {
////        Random random = new Random(); // Create a Random object here
////        int randomInt = random.nextInt(7);
////        return randomInt + 1;
////    }
//
