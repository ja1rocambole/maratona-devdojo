package academy.devdojo.maratonajava;

public class Aula07Arrays {

    public static void main(String[] args) {
//  se for sobre arrays comuns tem no notion

//  arrays multidimencionais
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//  Acessando um elemento específico (por exemplo, o valor 5):
        int valor = matriz[1][1]; // Segunda linha, segunda coluna

//  iterando em um array bidimencional
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.println(matriz[i][j]);
            }

        }

//  iterando array bidimencional com forEache

        for (int[] arr : matriz) {
            for (int numero : arr) {
                System.out.println(numero);
            }
        }
    }
}
