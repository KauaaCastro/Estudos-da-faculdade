# Soma

![Captura de tela 2024-03-23 234031](https://github.com/KauaaCastro/Estudos-da-faculdade/assets/162861675/dc0f871d-5bde-48f7-a04a-f74ebf415f59)

# Sobre o código
Por mais que seja uma atividade da lista 3, acredito que esse tenha sido a atividade mais simples de se fazer sinceramente, isso porque aqui só faremos o básico para podermos fazer um código que reliza somas, bem simples né? pois é.

       package soma;
    import java.util.Scanner;
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    {
       System.out.println("Digite o primeiro número abaixo:");
       int x = scanner.nextInt();

       System.out.println();

       System.out.println("Digite o segundo número da soma: ");
       int y = scanner.nextInt();

       int calc = x + y;

       System.out.println(calc);
     }}}  

# "Traudizndo" o código
Aqui é bm simpels, só que eu fiz foi utilizar um comando de out println para perguntar qual seria o primeiro número que deveria ser calculado e posteriormente usei o int para declarar, nesse exemplo aqui eu fiz da forma mais básica utilizando apenas o int para declarar, porém aqui podemos substituir os int e colocarmos double, para que a soma também pudesse ser realizada utilizando números decimais pós virgula, o que abriria novas opções de soma e etc... Basta alterar os int e colocar double no lugar deles e no "nextInt" colocar "nextDouble", é um comando bem simples que na vdd não tem nem muito o que explicar aqui.
Por fim utilizei o int novamente para declarar calc como sendo a soma portanto calc é o nome da variavel que armazena o RESULTADO da soma entre os dois numeros escolhidos 
