# Estudos da faculdade
### Um breve resumo sobre a faculdade até agora

Até o momneto em que este pequeno e simples comando está sendo postado, vimos e aprendemos um pouco do básico sobre java, comando como variáveis, while, if e else, break, Scanner e algumas outras coisas mais básicas do java, estou aprendendo e programando utilizando o VScode e as vezes o Inteliji (afinal, quero aprender em mais de um programa), essa é apenas uma tarefa simples na qual meu professor pediu para que pudessemos "codar" ela de forma simples no therminal java, fiz um código utilizando o if e else para poder determinar as frases e condições e decidi aprimorar um pouco utilizando o while e o break para criar um laço de repetição que ocorre toda vez que o comando é finalizado, perguntando assim se desejará continuar usando ou não, explicarei isso melhor abaixo, quando eu for falar melhor sobre o objetivo e o intuito dessa atividade passada pelo professor.

# Qual o objetivo?
![Exercício 3_page-0001](https://github.com/KauaaCastro/Estudos-da-faculdade/assets/162861675/bc5b0698-d97a-4a3f-9357-15101a3e3563)

## Variaveis
Basicamente decidi fazer uma espécie de código para que possamos analisar e calcular o salário que um funcionario recebe, utilizando variaveis de hora, nome, número do funcionario e o valor por hora que o funcionario recebe, em seguida utilizei comandos basicos de "System.out.print" para que pudesse imprimir os questionamentos para o usuario e posteriormente utilizei o comando "Scanner" para armazenar as escolhas do usuario e por fim, utilizamos uma ultima variavel titulada como "calc" para poder calcular o valor recebido por ele através de uma multiplicação simples: horas * valor (recebido por hora).
## Aqui está a parte em questão:

      package github;
      
      import java.util.Scanner;
      
      public class Main {
          public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
      
         while(true){ System.out.println("digite aqui o nome do funcionario");
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
      }}

## If e Else
Posteriormente eu usei um sistema básico de if e else para poder definir os parametros e média do salário para os funcionarios, variando dependendo da quantidade de horas e quanto recebem, por exemplo alguem que trabalha por mais tempo e recebe menos que o minimo estaria na lista como alguem que recebe abaixo da "média salárial da empresa", ao rodarmos ele no therminal podemos ver o nome do funcionário, seu número de identificação, suas horas trabalhadas, quanto recebe por hora, o salário dele e se está ou não abaixo da média salárial.
exemplo:

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
         } ``
## Finalização
Aqui por si só ja estamos com o código finalizado, porém, decidi adicionar algo que trouxesse uma automatização extra para o código, portanto realizei um pequeno código de WHILE, basicamente eu queria que o sistema pudesse reiniciar de forma automatica ao chegar no fim. A intenção era que ao chegar no fim do programa, ele desse a opção de pedir e buscar por um novo funcionário para que possamos obter a identificação e os resultados dele, portanto adicionei um System.out.print questionando o usuario se deseja buscar ou não um outro funcionario, caso a resposta seja "n" ele irá encerrar o programa, caso a resposta seja "s" ele voltará desde o começo para que o processo se repita, lá no começo do código (ainda nas variaveis) eu coloquei um comando 

      while(true) {

para que ele pudesse ser o inicio da repetição, ou melhor do laço, no final do código adicionei um if para que o usuario escolhesse entre "s/n", caso o "n" fosse digitado como resposta do if o programa seria encerrado e caso o "s" fosse digitado o programa te levaria de volta até o while lá do começo, o código utilizado foi esse abaixo: 
    
    System.out.println("deseja buscar por um funcionário? (s/n)");
         String x = scanner.next();
        
        if(x.equalsIgnoreCase("n")){
            System.out.print("programa encerrado");
            break;
    }

  ## Finalização
Não é nada tão avançado e tão absurdo, se trata apenas do básico por enquanto, mas com o tempo os códigos aqui serão aprimorados e espero até o fim desse ano estar conseguindo fazer coisas incriveis e enormes com programação, espero poder evoluir muito com a faculdade e o curso que realizarei e espero poder visualizar isso de forma cada vez mais nítida ao analisar os códigos antes e depois aqui e é claro que com o decorrer do tempo esse código e os próximos serão atualizado, mas sempre mantendo suas versões iniciais, as primeiras postadas aqui, atualizarei elas para que eu possa ver a melhora e diferença em meus conhecimentos.
Mesmo que esse código seja inútil para você, peço para que acesse a página e dê uma lida, me corrija, faça recomendações e auxilie caso algo possa ser melhorado, sempre desposto à receber críticas e é isso.

