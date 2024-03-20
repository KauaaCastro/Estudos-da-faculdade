package diferenca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Digite o primeiro número aqui:");
        int A = scanner.nextInt();
        System.out.println();
        System.out.println("Digite o segundo número aqui:");
        int B = scanner.nextInt();
        System.out.println();
        System.out.println("Digite o terceiro número aqui:");
        int C = scanner.nextInt();
        System.out.println();
        System.out.println("Digite o quarto número aqui:");
        int D = scanner.nextInt();

        int calc = (A * B -  C * D);

        System.out.println();
        System.out.print("O resultado da diferença entre os numeros " + A + ", " + B + ", " + C + ", " + D + " é igual a "  + calc);
    }
}