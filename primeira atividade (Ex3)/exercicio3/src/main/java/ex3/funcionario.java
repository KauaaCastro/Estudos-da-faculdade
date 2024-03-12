package ex3;

import java.util.Scanner;

public class funcionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //nome do funcionario 
    while (true){  System.out.println("digite aqui o nome do funcionario");
      String name = scanner.next(); 

    //Numero do funcionario 
        System.out.println("Qual o número do funcionario em questao?");
        int nf = scanner.nextInt();

    //quantidade de horas trabalhadas   
        System.out.println("quantas horas o funcionario ("+name+") trabalhou?"); //finalizar string
        int hours = scanner.nextInt();

    //salário
        System.out.println("quanto o funcionario recebe?");
        double salario = scanner.nextDouble();

        //calculo de salário
        double calc = hours * salario;

        //if and else
        //considerando o tempo de trabalho mensal médio da empresa como 200 horas por mês e usando de média 700 a 1200 o salário

        if(calc < 700 && hours >= 200){
         System.out.println("O funcionário de número " + nf + " e nome " + name + " possui os seguintes dados:");
            System.out.println("Horas trabalhadas: " + hours);
            System.out.println("Seu salário por hora trabalhada é: " + salario);
            System.out.println("Seu salário mensal é: R$" + calc);
            System.out.println("Recebe abaixo da média salárial da empresa");
        } else if(calc >= 700 && calc <= 1200 && hours < 200){ 
        System.out.println("O funcionário de número " + nf + " e nome " + name + " possui os seguintes dados:");
            System.out.println("Horas trabalhadas: " + hours);
            System.out.println("Seu salário por hora trabalhada é: " + salario);
            System.out.println("Seu salário mensal é: R$" + calc);
            System.out.println("Recebe o salário minimo considerado pela empresa, com menor carga horaria");
         } else if(calc > 700 && calc <=1200 && hours >= 200){
         System.out.println("O funcionário de número " + nf + " e nome " + name + " possui os seguintes dados:");
            System.out.println("Horas trabalhadas: " + hours);
            System.out.println("Seu salário por hora trabalhada é: " + salario);
            System.out.println("Seu salário mensal é: R$" + calc);
            System.out.println("Recebe o Salário minimo considerado pela empresa");
         } else if(calc > 1200 && hours >= 200){
            System.out.println("O funcionário de número " + nf + " e nome " + name + " possui os seguintes dados:");
            System.out.println("Horas trabalhadas: " + hours);
            System.out.println("Seu salário por hora trabalhada é: " + salario);
            System.out.println("Seu salário mensal é: R$" + calc);
            System.out.println("Recebe acima do salário minimo da empresa");
         } else if(calc < 700 && hours < 200){
            System.out.println("O funcionário de número " + nf + " e nome " + name + " possui os seguintes dados:");
               System.out.println("Horas trabalhadas: " + hours);
               System.out.println("Seu salário por hora trabalhada é: " + salario);
               System.out.println("Seu salário mensal é: R$" + calc);
               System.out.println("Recebe o salário médio de meio periodo");
         }else{
            System.out.println("O funcionário de número " + nf + " e nome " + name + " possui os seguintes dados:");
            System.out.println("Horas trabalhadas: " + hours);
            System.out.println("Seu salário por hora trabalhada é: " + salario);
            System.out.println("Seu salário mensal é: R$" + calc);
         } 
         System.out.println("deseja buscar por um funcionário? (s/n)");
         String x = scanner.next();
        
        if(x.equalsIgnoreCase("n")){
            System.out.print("programa encerrado");
            break;
    }
}
        }
}

