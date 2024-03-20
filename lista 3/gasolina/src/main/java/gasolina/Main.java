package gasolina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(continuar){
            System.out.println("Selecione abaixo o tipo de combustivel de seu automóvel");
        System.out.println();
        System.out.println("1 - alcool");
        System.out.println("2 - gasolina ");
        System.out.println("3 - diesel");
        System.out.println("4 - Fim");
        int x = scanner.nextInt();

        if(x <= 4 && x >= 0){
            if(x == 1){
            alcool += 1;
        } else if(x == 2){
            gasolina += 1;
        } else if(x == 3){
            diesel += 1;
        } else if(x == 4){
            System.out.println("alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("diesel: " + diesel);
            System.out.print("muito obrigado");

            continuar = false;
        } else{
            System.out.println("Opção invalido");
          }
      }
    } 
  }
}