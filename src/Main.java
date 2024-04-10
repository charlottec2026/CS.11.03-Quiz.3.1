public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int num) {
        if (num>=90) {
            return 'A';
        }
        if (num>=80 && num<=89) {
            return 'B';
        }
        if (num>=70 && num<=79) {
            return 'C';
        }
        if (num>=60 && num<=69) {
            return 'D';
        }
        if (num>=50 && num<=59) {
            return 'E';
        }
        if (num<50) {
            return 'F';
        }
        return 'U';
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num) {
        if (num%3==0 && num%5!=0) {
            return "fizz";
        }
        if (num%3!=0 && num%5==0) {
            return "buzz";
        }
        if (num%15==0) {
            return "fizzbuzz";
        }
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String str) {
        if (str.length()<2) {
            return str;
        }
        else {
            return str.substring(0,2) + str + str.substring(0,2);
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        if (a+b==c || a+c==b || b+c==a) {
            return true;
        }
        return false;
    }

    // Question 5 - endUp
    public static String endUp(String str) {
        if (str.length()<3) {
            return str.toUpperCase();
        }
        else {
            return str.substring(0,str.length()-3) + str.substring(str.length()-3).toUpperCase();
        }
    }
}
