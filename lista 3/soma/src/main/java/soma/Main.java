package soma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    {
       System.out.println("Digite o primeiro número abaixo:");
       int x = scanner.nextInt();

       System.out.println();

       System.out.println("Digite o segundo número da soma: ");
       int y = scanner.nextInt();

       int calc = x + y;

       System.out.println(calc);
}
    }
}