package senha;

import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 

      while(true){ 
      System.out.println("digite a senha (PIN) de acesso para obter acesso");
      int tentativa = scanner.nextInt();

      if(tentativa == 2024){
        System.out.println("acesso permitido");
        break;
      } else {
        System.out.println("senha inválida");
      }
    }
   }
  }