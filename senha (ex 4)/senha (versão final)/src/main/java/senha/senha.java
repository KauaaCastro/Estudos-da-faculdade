package senha;

import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 

      while(true){ 
        System.out.println("");
      System.out.println("digite a senha (PIN) de acesso para obter acesso");
      int sn = scanner.nextInt();

      if( sn == 2024){
        System.out.println("");
        System.out.println("Aguarde, carregando...");
        System.out.println("acesso permitido");
        System.out.println("https://github.com/KauaaCastro");
        System.out.println("");
        break;
      } else {
        System.out.println();
        System.out.println("senha inválida");
      }
    }
   }
  }

  //os system.out.println que não possuem nenhum conteudo dentro deles, são apenas para que o terminal possa pular uma linha, para ficar mais organizado e bonito no vscode, apenas isso