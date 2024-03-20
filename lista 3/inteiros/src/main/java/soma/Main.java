package soma;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha o primeiro valor (lembrando que somente números inteiros)");
        int x = scanner.nextInt();
        
        System.out.println("escolha o segundo valor (lembrando que somente números inteiros)");
        int y = scanner.nextInt();

        int calc = x + y;
        System.out.println("A soma de " + x + " + " + y + " é = " + calc);

    }
}