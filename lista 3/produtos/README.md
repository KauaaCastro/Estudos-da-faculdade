# Exercicio 2: Produtos
![Captura de tela 2024-03-24 223922](https://github.com/KauaaCastro/Estudos-da-faculdade/assets/162861675/68d53cba-4c90-4df4-b288-7d7cb6fcfa87)

Aqui temos um exercício matemático bem simples até, onde basicamente precisamos escolher quatro números para que possamos realizar o cálculo do produto dos quatro por meio da fórmula dada acima, fórmula essa como sendo (AB - CD). Aqui nessa atividade eu realizei praticamente o mesmo procedimento da atividade anterior (sobre as somas) utilizando os "int" para poder declarar os quatro algarismos e utilizando uma variável chamada de "diferença" para armazenar o resultado da diferença dos produtos e, por fim, um System.out.println para poder estar exibindo o resultado da variável "diferença". Veja o trecho em questão abaixo:

    Scanner scanner = new Scanner(System.in);
    System.out.println("digite aqui o primeiro número");
    int A = scanner.nextInt();
    System.out.println("digite aqui o segundo número");
    int B = scanner.nextInt();
    System.out.println("digite aqui o terceiro número");
    int C = scanner.nextInt();
    System.out.println("digite aqui o quarto número");
    int D = scanner.nextInt();
    int diferença = (A*B - C*D);

    System.out.println(diferença);

# Resumindo
Em resumo, só o que foi feito aqui foi a declaração das variáveis usando o int e depois uma nova variável usando a fórmula, portanto o computador irá calcular os números digitados pelo usuário e colocará eles na fórmula e, por fim, após calcular o resultado, irá exibi-lo no comando abaixo (System.out.println) e sim, dá para realizar o mesmo procedimento utilizando a variável double, sim, ficaria muito mais abrangente, porém nesse caso foi pedido em sala de aula que realizássemos eles com o int, portanto prossegui com o int, o double acabou ficando para uma próxima.
