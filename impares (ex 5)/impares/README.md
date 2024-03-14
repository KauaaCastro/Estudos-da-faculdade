# Exercício 5: construção de ímpares 

![Captura de tela 2024-03-13 125028](https://github.com/KauaaCastro/Estudos-da-faculdade/assets/162861675/15acb3ae-0b64-4485-9416-ef10f876bfd1)

Esse é um exercício que envolve bem mais matemática do que os demais, parece ser complicado, mas até que não é tanto quanto aparenta, aqui eu utilizei os comandos: int, while e if
Comecei usando um System.out.println(""); simples para questionar qual será o número máximo da operação (número entre 1 e 100 que finalizará o programa)

      public class impares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o valor de X (limitando-se somente aos números de 1 a 100)");
      int Nfinal = scanner.nextInt();
      
# Variáveis: 
Aqui declaramos apenas duas variáveis, sendo elas:
Nfinal -> que será a resposta do usuário a pergunta anterior, aqui é bem simples, Nfinal é igual ao scanner que o usuário digitar. Basicamente essa variável serve para termos o parâmetro "final" dos números, como assim? Simples, se Nfinal for igual a 10, isso quer dizer que o comando mostrará todos os números entre Nfinal e 10.
Ímpares -> como o próprio nome já diz, são os ímpares que serão exibidos na tela quando o comando for executado, declarei ele como 1 pois o número 1 é o primeiro número ímpar (considerando 0 par), já explicarei melhor (na parte do while) 

       System.out.println("digite o valor de X (limitando-se somente aos números de 1 a 100)");
      int Nfinal = scanner.nextInt();

       int impar = 1;
       
# If e Else
Bom aqui não temos else, pois é um if que será usado somente para "sustentar" o while, nesse caso eu usei o if apenas para limitar o comando ir de 1 a 100, isso porque sem o If ele não teria esse limite, depois temos outro if lá em baixo que explicarei posteriormente, caso o número digitado pelo usuário seja maior que 1 e menor que 100, caso não esteja nesse parâmetro o código apenas dará erro, caso queira deixar mais bonitinho recomendo que faça um comando else para que o console mostre uma frase, como por exemplo:

      }Else {
      System.out.println("erro, tente novamente");
    }

  código que eu usei para declarar o primeiro if:
    
    if(Nfinal >= 1 && Nfinal <= 100){
        System.out.println("Aqui estao alguns números ímpares de 1 a " + Nfinal + ":");
    }

While
Agora vamos para ele, o comando que mais me deu trabalho aqui, o while, basicamente o while se "traduz" para "enquanto", basicamente usei ele para poder calcular e mostrar os ímpares de forma automática.

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

Nesse código eu basicamente disse que:

Enquanto (ímpar for menor ou igual que o número final){
Se e somente se ímpar dividido por 2 der resto 1
Mostre o número no console
A cada item mostrado no console adicione 1 ao seu valor 
 
Vamos lá, basicamente eu disse que enquanto ímpar for menor que o número final (que digitamos lá em cima) o comando deve continuar sendo executado, portanto enquanto ele for menor que o número final, o console deve sempre somar 1 ao valor ímpar (isso que significa o ímpar++ no fim do while), toda vez que ele somar um teremos um número par ou ímpar, este número passara pelo teste que será realizado pelo if, onde o número será dividido por 2 e obteremos o resto, caso o resto seja = 0, ele será considerado par e automáticamente pularemos para o próximo, se ele tiver resto 1 ele será considerado ímpar e será mostrado no console. Agora vem a explicação do porque eu declarei ímpar = 1, fiz isso porque segundo as leis da matemática:

##Qualquer número par + 2 dará um número par e qualquer número PAR dividido por 2 dará resto 0 
##Assim como
##Qualquer número ímpar + 2 dará ímpar e qualquer número ímpar dividido por 2 dará resto 1

##Ou seja um número teria que ser declarado como 1 para que possamos determinar qual número iremos testar, já que a cada teste acrescentará 1 algarismo na     
    ## lista de exemplos:
    Portanto se começar no 1 teremos algo como:
    1/2 Resto 1 = ímpar
    2/2 Resto 0 = (NN mostra nada)
    3/2 Resto 1 = ímpar 
    E assim sucetivamente até chegarmos ao número final (digitado pelo usuário lá no começo).

# Conclusão 
Não é um código tão complexo, é até que bem simples, mas me levou umas boas horas, isso porque o while é um comando que eu considero bem chatinho, as vezes o true já basta, as vezes precisamos do for, do x++, break; e assim por diante, então é um comando que particularmente não curto muito, utilizo para otimizar e deixar automático, mas costuma ser só, ainda sim é um comando muito prático já que se fossemos fazer por if e Else, ficaria enorme e acredito que não seria nem um pouco prático (isso se for de fato possível o que tenho algumas dúvidas sobre), não é um exercício complicado, mas tudo que envolve while requer muita lógica ao utilizá-lo, onde tudo tem que ter ligação com enquanto (while), é bem chatinho mas creio que com o tempo isso venha a se tornar mais fácil, mais rápido e ainda mais prático.  
