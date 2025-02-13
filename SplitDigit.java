import java.util.Scanner;

public class SplitDigit {
    public static void main(String[] args) {
        System.out.println("Enter number that includes a comma and between 1,000 and 999,999: ");
        Scanner keyboard = new Scanner(System.in);
        String numberWithComma = keyboard.nextLine();
        String numberWithoutComma = numberWithComma.replace(",", "");
        System.out.println(numberWithoutComma);
    }
}
