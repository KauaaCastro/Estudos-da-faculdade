package produtos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("digite aqui o primeiro número");
    int A = scanner.nextInt();

    System.out.println("digite aqui o segundo número");
    int B = scanner.nextInt();
    
    System.out.println("digite aqui o terceiro número");
    int C = scanner.nextInt();
    
    System.out.println("digite aqui o quarto número");
    int D = scanner.nextInt();

    int diferença = (A*B - C*D);

    System.out.println(diferença);

   }
}