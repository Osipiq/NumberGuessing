import java.util.Scanner; // import the Scanner class

public class GuessingGame {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userNum;

        int randomNum;
        randomNum = (int)(Math.random() * 101);

        System.out.print("Guess a Number Between 1 and 100: ");
        userNum = myObj.nextInt();

        while (userNum != randomNum) {
            if (userNum > randomNum) {
                System.out.println("Too High!");
                System.out.println("Guess Again: ");
                userNum = myObj.nextInt(); }
            else if (userNum < randomNum) {
                System.out.println("Too Low!");
                System.out.println("Guess Again: ");
                userNum = myObj.nextInt(); }
        }
        System.out.println("Correct, the number was: " + userNum);
    }
}
