# Estudos da faculdade
### Um breve resumo sobre a faculdade até agora

Até o momento em que este pequeno e simples comando está sendo postado, vimos e aprendemos um pouco do básico sobre Java, comandos como variáveis, while, if e else, break, Scanner e algumas outras coisas mais básicas do Java. Estou aprendendo e programando utilizando o VSCode e às vezes o IntelliJ (afinal, quero aprender em mais de um programa). Essa é apenas uma tarefa simples na qual meu professor pediu para que pudéssemos "codar" ela de forma simples no terminal Java. Fiz um código utilizando o if e else para poder determinar as frases e condições e decidi aprimorar um pouco utilizando o while e o break para criar um laço de repetição que ocorre toda vez que o comando é finalizado, perguntando assim se desejará continuar usando ou não. Explicarei isso melhor abaixo, quando eu for falar melhor sobre o objetivo e o intuito dessa atividade passada pelo professor.

# Qual o objetivo?
![Exercício 3_page-0001](https://github.com/KauaaCastro/Estudos-da-faculdade/assets/162861675/bc5b0698-d97a-4a3f-9357-15101a3e3563)

## Variáveis
Basicamente, decidi fazer uma espécie de código para que possamos analisar e calcular o salário que um funcionário recebe, utilizando variáveis de hora, nome, número do funcionário e o valor por hora que o funcionário recebe. Em seguida, utilizei comandos básicos de "System.out.print" para que pudesse imprimir os questionamentos para o usuário e posteriormente utilizei o comando "Scanner" para armazenar as escolhas do usuário. Por fim, utilizamos uma última variável intitulada como "calc" para poder calcular o valor recebido por ele através de uma multiplicação simples: horas * valor (recebido por hora).

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
Posteriormente, usei um sistema básico de if e else para poder definir os parâmetros e média do salário para os funcionários, variando dependendo da quantidade de horas e quanto recebem. Por exemplo, alguém que trabalha por mais tempo e recebe menos que o mínimo estaria na lista como alguém que recebe abaixo da "média salarial da empresa". Ao rodarmos ele no terminal, podemos ver o nome do funcionário, seu número de identificação, suas horas trabalhadas, quanto recebe por hora, o salário dele e se está ou não abaixo da média salarial. Exemplo:

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
Aqui por si só já estamos com o código finalizado, porém, decidi adicionar algo que trouxesse uma automatização extra para o código. Portanto, realizei um pequeno código de WHILE. Basicamente, eu queria que o sistema pudesse reiniciar de forma automática ao chegar no fim. A intenção era que ao chegar no fim do programa, ele desse a opção de pedir e buscar por um novo funcionário para que possamos obter a identificação e os resultados dele. Portanto, adicionei um System.out.print questionando o usuário se deseja buscar ou não um outro funcionário. Caso a resposta seja "n", ele irá encerrar o programa; caso a resposta seja "s", ele voltará desde o começo para que o processo se repita. Lá no começo do código (ainda nas variáveis), eu coloquei um comando:

      while(true) {

para que ele pudesse ser o início da repetição, ou melhor do laço. No final do código, adicionei um if para que o usuário escolhesse entre "s/n". Caso o "n" fosse digitado como resposta do if, o programa seria encerrado e caso o "s" fosse digitado, o programa te levaria de volta até o while lá do começo. O código utilizado foi esse abaixo:
    
    System.out.println("deseja buscar por um funcionário? (s/n)");
         String x = scanner.next();
        
        if(x.equalsIgnoreCase("n")){
            System.out.print("programa encerrado");
            break;
    }

  ## Conclusão
Não é nada tão avançado e tão absurdo, se trata apenas do básico por enquanto. Mas com o tempo, os códigos aqui serão aprimorados, e espero até o fim desse ano estar conseguindo fazer coisas incríveis e enormes com programação. Espero poder evoluir muito com a faculdade e o curso que realizarei e espero poder visualizar isso de forma cada vez mais nítida ao analisar os códigos antes e depois aqui. E é claro que com o decorrer do tempo, esse código e os próximos serão atualizados, mas sempre mantendo suas versões iniciais, as primeiras postadas aqui. Atualizarei elas para que eu possa ver a melhora e diferença em meus conhecimentos. Mesmo que esse código seja inútil para você, peço para que acesse a página e dê uma lida, me corrija, faça recomendações e auxilie caso algo possa ser melhorado. Sempre disposto a receber críticas e é isso.

<a href = "https://github.com/KauaaCastro/KauaaCastro">perfil</a>

