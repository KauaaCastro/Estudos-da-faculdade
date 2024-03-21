package ex5;

import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

       while(true) {
        System.out.println("digite o valor de X (limitando-se somente aos números de 1 a 100)");
      int Nfinal = scanner.nextInt();

      if(Nfinal >= 1 && Nfinal <= 100){
        System.out.println("Aqui estao alguns números ímpares de 1 a " + Nfinal + ":");

        int impar = 1;
        while(impar <= Nfinal){
          if(impar % 2 == 1){
            System.out.println(impar);
          }
          impar++;

        }
      }        
    }
  }
}