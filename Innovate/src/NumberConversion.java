import java.util.Scanner;

class NumberConversion {
    public static void main(String[] args) {
       try{
           Scanner sc = new Scanner(System.in);
           System.out.print("Input Number: ");
           long number = sc.nextLong();

           char[] numberCharacterArray = (number + "").toCharArray();
           int length = numberCharacterArray.length;

           String[] zeroToNineTeen = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
           String[] tenToNineteen = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};


           String[] singleDigit = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
           String[] doubleDigit = {"", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};


           if (number < 10) {
               System.out.println(zeroToNineTeen[(int) number]);
           } else if (number < 20 && number >= 10) {
               System.out.println(tenToNineteen[(int) number-10]);
           }

           String output = "";

           // Hundred thousands
            if(length == 6) {
                output = output + " " + singleDigit[(int) number / 100000 - 1] + " hundred";
                length--;
            }

            // Thousands/Ten Thousands
            if(length == 5) {

                int temp = (int) number % 100000 / 1000;

                if (!(temp > 9 && temp < 20)) {
                    int tenThousands = temp / 10;
                    int thousands = temp % 10;
                    output = output + " " + doubleDigit[tenThousands-1];
                    output = output + " " + singleDigit[thousands-1] + " thousand";
                } else {
                    output = output + " " + zeroToNineTeen[temp] + " thousand";
                }

                length = length - 2;
            }

           // Hundreds
           if(length == 3) {
               output = output + " " + singleDigit[(int) number % 1000 / 100 - 1] + " hundred";
               length--;
           }

           // Thousands/Ten Thousands
           if(length == 2) {

               int temp = (int) number % 100;

               if (!(temp > 9 && temp < 20)) {
                   int tens = temp / 10;
                   int ones = temp % 10;
                   output = output + " " + doubleDigit[tens-1];
                   output = output + " " + singleDigit[ones-1];
               } else {
                   output = output + " " + zeroToNineTeen[temp];
               }
           }

           System.out.println("Output: " + output);

           sc.close();
       } catch(Exception e) {
           System.out.println(e);
       }
    }
}


