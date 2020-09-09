import java.util.Scanner;

public class NumberString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so :  ");
        int number = scanner.nextInt();
        String result = "";
        if (number<10) {
            result = readNumber(number);
        }

        result = readNumbers(number);
        System.out.println(result);

    }

    public static String readNumber(int number) {
        String result = "";
        switch (number) {
            case 0:
                result = "zeo";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "nice";
                break;
        }
        return result;

    }
    public static String readNumbers(int number) {
        String result = "";
        switch (number) {
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "Twelve";
                break;
            case 13:
                result = "Thirteen";
                break;
            case 14:
                result = "Fourteen";
                break;
            case 15:
                result = "Fifteen";
                break;
            case 16:
                result = "Sixteen";
                break;
            case 17:
                result = "Seventeen";
                break;
            case 18:
                result = "Eighteen";
                break;
            case 19:
                result = "Nineteen";
                break;
        }
        return result;
    }
}
