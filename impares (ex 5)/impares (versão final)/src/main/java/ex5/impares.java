package ex5;

import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

       while(true) {
        System.out.println("digite o valor de X (limitando-se somente aos números de 1 a 100)");
      int Xf = scanner.nextInt();

      if(Xf >= 1 && Xf <= 100){
        System.out.println("Aqui estao alguns números ímpares de 1 a " + Xf + ":");

        int Xi = 1;
        while(Xi <= Xf){
          if(Xi % 2 == 1){
            System.out.println(Xi);  
          }  Xi++; 
        }
        System.out.println("deseja iniciar novamente?");
        String s2 = scanner.next();
   
             if(s2.equalsIgnoreCase ("s")){
               System.out.println("reiniciando o programa. aguarde...");
             System.out.println("");
             } else{
               System.out.println("Encerrando o programa.");
             break;
             }
      }else {
        System.out.println("Erro no código, deseja iniciar novamente? (s/n)");
        String sn = scanner.next();

        if(sn.equalsIgnoreCase ("s")){
          System.out.println("reiniciando o programa. aguarde...");
          System.out.println("");
        } else {
          System.out.println("Encerrando o programa.");
          break;
        }
      }        
    }
  }
}

