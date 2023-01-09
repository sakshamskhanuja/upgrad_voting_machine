import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the input.
        Scanner scanner = new Scanner(System.in);

        // Stores the age.
        int age = scanner.nextInt();

        // Stores the vote.
        int vote = scanner.nextInt();

        // Checks if the person is of voting age.
        if (!(age >= 18)) {
            System.out.println("You are not eligible");
        } else {
            // Checks who the person voted for.
            switch (vote) {
                case 1:
                    System.out.println("You have voted for Ram");
                    break;
                case 2:
                    System.out.println("You have voted for Shyam");
                    break;
                case 3:
                    System.out.println("You have voted for Ghanshyam");
            }
        }
    }
}