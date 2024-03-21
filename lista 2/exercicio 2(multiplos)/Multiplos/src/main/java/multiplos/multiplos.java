package multiplos;

import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
     while (true) {
        
        //Scanners
           Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in); 

        //pedido do terminal
        System.out.println("Escolha o número que deseja saber");
        int a = scanner.nextInt();
        System.out.println("escreva o multiplicador");
        int m = scanner2.nextInt();
        int R = a * m;
        int RD = a / m;

        //se e somente se   
        if(a % m == 0){
            System.out.println("é multiplo");
            System.out.println("o resultado da multiplicacao é = "+ R);
            System.out.println("o resultado da divisao de " + a + " por " + m + " é = " + RD);

        } else{
            System.out.println("nao é multiplo");
            System.out.println("o resultado da multiplicacao é = "+ R);
            System.out.println("o resultado da divisao de " + a + " por " + m + " é = " + RD);
          
        }
        
        System.out.println("deseja analisar mais algum numero?? (s/n)");
        String r = scanner.next();
        
        if(!r.equalsIgnoreCase("s")){
            System.out.print("programa encerrado");
            break;
        }
     }
    }
}
