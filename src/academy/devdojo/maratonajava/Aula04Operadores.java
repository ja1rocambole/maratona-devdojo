package academy.devdojo.maratonajava;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        //ARITIMETICOS
        // + - * /
        System.out.println(numero1 + numero2);//30
        System.out.println(numero1 - numero2);//-10
        System.out.println(numero1 * numero2);//200
        System.out.println(numero1 / numero2);//0
        //O resultado aqui dá 0, mas deveria ser 0,5, isso acontece pq operaçoes com variaveis inteiras
        // não podem resultar em numeros quebrados umas solução seria mudar o tipo da variavel ou fazer um casting
        System.out.println(numero1 / (double) numero2);//0,5 👌

        // % resto
        int resto = 21 % 2; // sobra 1
        System.out.println(resto);//1

        //COMPARAÇÃO
        // < > <= >= == !=
        // O "is" no começo da variavel indica que ela é um boleano
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10;

        //LOGICOS
        //&&(AND) ||(OR) !(NOT)
        //FUNCIONA COMO EM QUALQUER OUTRA LINGUAGEM
        //👌

        //ATRIBUIÇÃO
        // = += -= *= /= %=
        int bonus = 1800;
        bonus = bonus + 1000;
        //ambos são a mesma coisa porem com um pouco menos de codigo
        //bonus +=1000;
        System.out.println(bonus);

        //INCREMENTAÇÃO E DECREMENTAÇÃO
        //++ --
        int contador = 0;
        //EXISTE UMA DIFERENÇA ENTRE BOTAR O ++/-- ANTES OU DEPOIS DA VARIAVEL!!!
        //AQUI O 1 SÓ É ATRIBUIDO DEPOIS DO USO DA VARIAVEL
        contador++;
        contador--;
        //AQUI É ATRIBUIDO ANTES
        ++contador;
        --contador;


    }
}
