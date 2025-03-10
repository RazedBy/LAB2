import java.util.Random;
import java.util.Scanner;

public class LAB2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // Nombre entre 1 et 100
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        System.out.println("Devinez le nombre (entre 1 et 100) :");

        while (userInput != randomNumber) {
            System.out.print("Votre choix : ");
            userInput = scanner.nextInt();

            if (userInput < randomNumber) {
                System.out.println("Trop petit !");
            } else if (userInput > randomNumber) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Bravo, vous avez trouvé !");
            }
        }

        scanner.close();
    }
}