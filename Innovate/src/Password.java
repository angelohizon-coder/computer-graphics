import java.util.Scanner;

public class Password {

    public static boolean checkSpecialCharacters(char[] specialCharacters, char[] passwordArray) {
        int counter = 0;

        for(char passwordCharacter: passwordArray) {
            for(char specialCharacter: specialCharacters) {
                if(passwordCharacter == specialCharacter) {
                    counter++;
                }
            }
        }

        if(counter >= 2) {
            return false;
        }

        return true;
    }

    public static boolean checkNumbers(String[] specialNumbers, String password) {
        // For each loop that checks if there's special character within the password
        for (String number: specialNumbers) {
            if(password.contains(number)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkUpperCase(char[] passwordArray, String Password) {
        for(char character: passwordArray) {
            if(Character.isUpperCase(character)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkLowerCase(char[] passwordArray, String Password) {
        for(char character: passwordArray) {
            if(Character.isLowerCase(character)) {
                return false;
            }
        }
        return true;
    }

    public static boolean arrayChecker(boolean[] array)
    {
        for(boolean b : array) if(b) return false;
        return true;
    }

    public static void main(String[] args) {

       try {
           // Initialization
           boolean checker;
           boolean lowercaseChecker;
           boolean specialCharacterChecker;
           boolean uppercaseChecker;
           boolean numberChecker;

           // Array Initialization and Declaration
           char[] passwordArray;
           char[] specialCharacters = {'!', '@', '#', '$', '%', '^', '&', '*'};
           String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

           // Scanner for input
           Scanner sc= new Scanner(System.in);
           System.out.print("Enter Password: ");
           String password = sc.nextLine();

           passwordArray = password.toCharArray();

           // Call the following functions
           specialCharacterChecker = checkSpecialCharacters(specialCharacters, passwordArray);
           numberChecker = checkNumbers(numbers, password);
           uppercaseChecker = checkUpperCase(passwordArray, password);
           lowercaseChecker = checkLowerCase(passwordArray, password);

           // Place results within an array
           boolean[] results = {specialCharacterChecker, numberChecker, uppercaseChecker, lowercaseChecker};

           // Checks if an error has occurred within password input
           if(specialCharacterChecker) {
               System.out.println("Incorrect Password, Please insert at least two of the following special characters: !, @, #, $, %, ^ ,& ,*");
           } if(numberChecker) {
               System.out.println("Incorrect Password, Please insert at least one number");
           } if(uppercaseChecker) {
               System.out.println("Incorrect Password, Please have at least one uppercase");
           } if(lowercaseChecker) {
               System.out.println("Incorrect Password, Please have at least one lowercase");
           }

           checker = arrayChecker(results);

           if(checker) {
               System.out.println("Good Password!");
           }

           // Close the scanner
           sc.close();
       } catch(Exception e) {
           System.out.println(e);
       }

    }
}
