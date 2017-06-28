import java.util.Scanner;

/**
 * Created by rizwa on 6/27/2017.
 */
public class LabTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String x = " ";
        do {
            System.out.print("Enter a number between 1 and 100: ");
            int userNum = scan.nextInt();
            if (userNum % 2 == 0 && userNum > 25) {
                System.out.println("Output: " + userNum + " and Even");
            } else if (userNum % 2 == 0 && userNum >= 2 && userNum <= 25) {
                System.out.println("Output: " + userNum + ", Even and less than 25");
            } else if (userNum > 60) {
                System.out.println("Output: " + userNum + " Odd and over 60");
            } else {
                System.out.println("Output: " + userNum + " and Odd");
            }
            System.out.print("Continue? (y/n); ");
            x = scan.next();
        } while (x.equals("y"));
        System.out.println();
        System.out.println("Bye!");
    }
}
