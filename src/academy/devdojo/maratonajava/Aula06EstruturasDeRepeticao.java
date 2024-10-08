package academy.devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        //    while, do while, for
        int count = 0;

//        while repete ações até que que o boolean seja falso
        while (count <= 10) {
//            System.out.println(count);
            count++;
        }

//        igual o while, mas ele vai iterar no minimo uma vez mesmo que o boolean seja false desde o primeiro
        do {
//            System.out.println(count);
            count++;
        } while (count <= 10);

//        for é engual o do javascript
        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
        }

//        EXERCICIO: IMPRIMA TODOS OS NUMEROS PARES DE 0 ATÉ 1 🌽
        for (int i = 0; i <= 1000000; i++) {
            int isEqual = i % 2;

//      NA CONDIÇÃO DO IF SERIA POSSIVEL FAZER ASIMM " I % 2 == 0 " ASSIM SIMPLIFICANDO UM POUCO
            if (isEqual == 0) {
//                System.out.println(i);
            }
        }

//       DADO O VALOR DE UM CARRO DESCRUBRA EM QUANTAS PARCELAS ELE PODE SER COMPRADO, A CONDIÇÃO
//       É QUE A PARCELA NÃO PODE SER INFERIOR A 1000

        double valorCarro = 999;
        int parcelaMinima = 1000;

        for (int i = 1; true; i++) {

            if (parcelaMinima * i >= valorCarro) {
                System.out.println("Será possivel pagar em " + i + " parcelas.");
                break;
            }
        }


    }
}
