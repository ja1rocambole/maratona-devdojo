package academy.devdojo.maratonajava;

import java.text.DateFormat;
import java.util.Date;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String name = "Jacinto";
        String address = "Rua dos bobos 0";
        double payment = 130000.00D;
        String dateRecebimento = "13/12/2013";

        System.out.println("Eu " + name +", morando no endereço "+ address +", confirmo que recebi o salário de "+ payment +", na data "+ dateRecebimento +".");
    }
}
