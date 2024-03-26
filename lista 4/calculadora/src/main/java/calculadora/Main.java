package calculadora;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean start = true;

       while(start){ System.out.println("");
        System.out.println("Digite aqui o número que deseja realizar a operçao (qualquer número inteiro)");
        double x = scanner.nextDouble();

        System.out.println("");
        System.out.println("Digite aqui qual operação deseja realizar");
        System.out.println("1 - adiçao");
        System.out.println("2 - subtraçao");
        System.out.println("3 - multiplicaçao");
        System.out.println("4 - divisao");
        double y = scanner.nextDouble();

        System.out.println("");
        System.out.println("Qual o próximo número da operaçao?");
        double w = scanner.nextDouble();

        if(y == 1){
            double calc = x + y;
            System.out.println(calc);
        } else if( y == 2){
            double calc = x - y;
            System.out.println(calc);
        } else if(y == 3){
            double calc = x * y;
            System.out.println(calc);
        } else if(y == 4){
            double calc = x / y;
            System.out.println(calc);
        } else {
            System.out.println("erro na calculadora, deseja reinicar? (s/n)");
            String s = scanner.next();

        if(s == "s"){
           System.out.println("Reiniciando");
        } else {
            start = false;
        }
        }

    }
}}