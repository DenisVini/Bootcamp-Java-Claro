import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
        public static void main(String[] args) {

            double salarioSemana = 500.0;

            while(salarioSemana>0){
                Double valorCamiseta = valorAleatorio();
                if (valorCamiseta>salarioSemana) 
                valorCamiseta = salarioSemana;
                System.out.println("Preço da camiseta: " + valorCamiseta + " Adicionado no carrinho");
                salarioSemana = salarioSemana - valorCamiseta;
            }
            System.out.println("Mesada: "+salarioSemana);
            System.out.println("Denisinho gastou todo seu salário da semana com roupas");


    }
        private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(100 , 250);
        }


}
