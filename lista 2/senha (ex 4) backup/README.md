# Sobre o exercicio

![Captura de tela 2024-03-15 151636](https://github.com/KauaaCastro/Estudos-da-faculdade/assets/162861675/28dea65c-c2db-4b22-b7d5-e14bfc07ac77)

Esse é um exercício que eu gostei bastante, no início ele aparenta ser bem complexo e complicado, aparenta ser um exercício extremamente complicado, mas quando analisamos seu intuito e seu formato, vemos que na verdade é bem simples, se trata de um simples comando while ou for para criarmos uma repetição que tomará 2 rumos possíveis, vou separar as explicações dessa forma, tomando dois rumos distintos. 

# Declarando 

       Scanner scanner = new Scanner(System.in); 
      while(true){ 
      System.out.println("digite a senha (PIN) de acesso     para obter acesso");
      int tentativa = scanner.nextInt();

Aqui se trata de mais um pouco do mesmo de sempre, declarar a variável Scanner, System out println para escrever no terminal o que o usuário deve fazer e declarei INT como tentativa, portanto quando o usuário escrever a senha, ela será armazenada em "tentativa" e a partir dali será enviada e utilizada no resto do code para o que for necessário.

Também ali declarei o comando while que caso ainda resta alguma dúvida, será o início do nosso looping, portanto toda vez que a senha estiver incorreta o terminal irá reiniciar o comando nos retornando o comando while = true e portanto iniciando todo o processo de novo de forma automática até que a senha seja aceita.

# If e Else 
      
      if(tentativa == 2024){
        System.out.println("acesso permitido");
        break;
      } else {
        System.out.println("senha inválida");

Aqui eu fiz mais um comando bem simples e rápido de se entender, o famoso if e Else, declarei que SE E SOMENTE SE O NÚMERO DIGITADO PELO USUARIO FOR IGUAL A 2024, ELE DEVE EXECUTAR E EXIBIR "ACESSO PERMITIDO" NO TERMINAL, caso contrário (a senha for falsa) deve mostrar senha inválida e voltar para o while de forma automática.

# Break;
Vale lembrar que coloquei o comando "break;" após o system out println do acesso permitido em if devido ao uso do while na encima, basicamente o que fiz foi "quebrar" o looping, portanto quando o looping do while for verdadeiro (a senha for 2024) ele irá exibir a mensagem e posteriormente irá executar o break, basicamente o que o break faz é quebrar esse verdade e tornar falso, encerrando portanto o comando while de forma com que ele não volte a ser executado e o comando seja finalizado. 
