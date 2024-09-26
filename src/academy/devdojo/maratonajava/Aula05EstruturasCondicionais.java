package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        //IF, ELSE, ELSEIF SÃO TODOS IGUAIS!!
        //ENTÃO VOU DIRETO PRO TERNARIO

        String vouComprar = "Me veja 10Kg de po";
        String naoVouComprar = "To sem dinheiro Boy";
        int dinheiro = 10;

        //condição ? caso True : caso False;
        String resultado = dinheiro >= 10 ? vouComprar : naoVouComprar;

        System.out.println(resultado);

    /*   //🚨É POSSIVEL FAZER UM TERNARIO DENTRO DE OUTRO COMO SE FOSSE UM ELSEIF, MAS NÃO É RECOMENDADO🚨

        String vouComprar = "Me veja 10Kg de po.";
        String dinheiroCertim = "Tá trocado já, me veja 10Kg de po.";
        String naoVouComprar = "To sem dinheiro Boy.";
        int dinheiro = 9;

        //condição ? caso True : caso False;
        String resultado = dinheiro > 10 ?  vouComprar : dinheiro == 10 ? dinheiroCertim : naoVouComprar;

         System.out.println(resultado);
    */

    /*    //EXERCICIO:
       Quanto tenho que pagar de imposto na holanda, baseado no meu salario? 🤓
       Taxable income band EUR	Tax rates for box 1 income
        1 to 37,149	        9.28%
        37,150 to 73,031	36.93%
        73,031+	            49.5%
    */
        double salario = 70000;
        double taxa = 0;


        if (salario >= 1 && salario <= 37149.00) {
            taxa = 0.0928;
        } else if (salario >= 37150.00 && salario <= 68507) {
            taxa = 0.03693;
        } else if (salario > 68507) {
            taxa = 0.0495;
        } else {
            System.out.println("salario negativo");
        }


        System.out.println(taxa);
        System.out.println(salario);
        System.out.println("De acordo com seu salario voce devera pagar: " + salario * taxa);


        /* RESOLUÇÃO PROFESSOR 🤓👌
        public static void main(String[] args) {
            double salaricAnual = 70000;
            double primeiraFaixa = 9.70/109;
            double segunda Faixa = 37.35 / 108;
            double terceiraFaixa 49.50/190;
            double valorImposto;

            if (salarioAnual <= 34712) {
            valorImposto salarioAnual primeiraFaixa;
            } else if (salarioAnual - 3/713 && salarioAnual <- 68507) {
            valorImposto salarioAnual sequndaFaixa:
            } else {
            valorImposto salarioAnual terceiraFaixa;
            }

            System.out.println(valorInposto);
        }
         */

    }
}
