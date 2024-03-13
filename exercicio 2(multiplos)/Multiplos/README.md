# Sobre o exercicio 
O exercício pede para fazermos um código que calcule se um número é divisível pelo outro, como por exemplo, se 20 é divisível ou não por 5. Neste código, eu apenas declarei algumas variáveis, usei o resto das divisões para poder descobrir se era verdadeiro ou falso e utilizei if e else para separar e utilizar os casos. A ideia é simples, realizar uma divisão para que possamos descobrir o resto da divisão e, a partir disso, saber qual caso usaremos e como faremos o cálculo do resto.

![montar](https://github.com/KauaaCastro/Estudos-da-faculdade/assets/162861675/8f6d561c-960a-489c-9725-9038873d0add)

# Declarando variáveis 
## OBS: eu declarei vários scanners, pois fiz esse exercicio a um tempinho atrás e não sabia que poderia usar um só para tudo, então declarei vários, recomendo que declare somente um e use-o para tudo

    Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o número que deseja saber");
        int a = scanner.nextInt();
        System.out.println("escreva o multiplicador");
        int m = scanner.nextInt();

Basicamente, o que eu fiz foi declarar o Scanner. Primeiramente, utilizamos o comando "import java.util.Scanner". Este comando deve ser utilizado FORA da chave de programação, de forma simples, abaixo do comando "package ...". Após isso, utilizei o "Scanner scanner = new Scanner(System.in)" para declarar o scanner. Vale ressaltar que só precisa fazer isso uma vez. Fiz três porque eu achei que não pudesse usar apenas um para tudo. Posteriormente, utilizei o "System.out.println("")" para escrever o que eu queria que aparecesse no terminal quando a pessoa rodasse o comando. Declarei que "a" seria a variável responsável pela resposta do usuário. Portanto, ao rodarmos o terminal, teríamos a frase que inseri ali dentro ("Escolha o número que deseja saber"), o usuário responderia (por exemplo, 5), e o 5 seria armazenado em "a". Assim, temos que: a = escolha do usuário, e o mesmo se aplica para "m".

Agora, vamos para o If e Else.

# If e Else
Uma explicação rápida a respeito: If e Else se trata do "se e somente se", ou seja, toda vez que vemos if, traduza assim, e Else como sendo sua forma "falsa". Exemplo rápido:

      If(2<3){
      Sim, dois é menor que três, portanto verdadeiro e por isso o código que estaria aqui dentro seria rodado e executado
      } Else { 
      Se por algum motivo 2 for maior que 3 ele não irá rodar o código acima (if) mas sim este que está lendo, o else, sempre que if for verdadeiro, rodará o       if, quando if for falso, rodará else
      }
Agora vamos para o code em si, abaixo está o código que eu recomendo usar:
                         
    if(a % m == 0){
            System.out.println("é multiplo");      
      } else{
            System.out.println("nao é multiplo");
      }
      
É um código simples de if e else. Vamos para a explicação dele. Aquele sinal que utilizei "%" não significa porcentagem aqui, ok? Significa RESTO, sim, RESTO de divisões. Portanto, pense comigo: qualquer número dividido por um número divisível por ele (por exemplo, 22 dividido por 2 = 11) terá resto 0, enquanto números não divisíveis por eles (por exemplo, 22 dividido por 4 = 5,5) darão 1 de resto. Portanto, eu escrevi que o sinal de igual precisa ser duplo nesses casos, pois estou dizendo que uma conta é igual a um algoritmo.
      
      
      Se e somente se ( o resto da divisão entre os dois números for == 0){
      Escreva que ele é múltiplos
      }Se for igual a 1{
      Escreva que não é múltiplo
      }
      
Acima está o comando if e Else "traduzido" 
E por fim usei o "System.out.println("")" para a frase aparecer no terminal ao final do comando.
# Considerações finais:
Sim, o comando aqui está diferente do da pasta (que eu fiz), mas isso ocorre porque lá eu fiz de forma bem diferente. Deu um pouco mais de trabalho e ficou um pouco desorganizado, pois fiz errado devido à falta de conhecimento (na verdade, estava com sono e fiz dormindo de qualquer jeito, cometi alguns erros). Este método que estou passando aqui acredito que seja a forma mais simples e rápida de fazer, além de ser a correta. Na pasta, há o arquivo com o exercício da forma como eu fiz, está funcionando também, com algumas informações adicionais e alguns erros.

Há detalhes extras, como o resultado da multiplicação, da divisão, o resto e se é múltiplo ou não. Caso queira ver e tentar fazer o mesmo, sinta-se à vontade para baixar o arquivo e estudá-lo. Recomendo que dê uma olhada e tente entender melhor alguns "if" e "else" que estão lá, assim como algumas variações nos cálculos (tanto de divisão quanto de multiplicação).

Lembrando novamente que, para qualquer coisa, me avise sobre algum erro aqui ou alguma mudança ou sugestão. Fique à vontade. Curta e favorite o repositório e o perfil para fortalecer, por favor. Estou fazendo o meu máximo para ajudar aqui, e isso é só o que eu peço.








