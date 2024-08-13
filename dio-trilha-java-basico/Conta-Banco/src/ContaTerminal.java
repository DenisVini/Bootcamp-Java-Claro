import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

            Scanner read = new Scanner(System.in);

       
        String agencia = "067-8" ;
        int usuario = 1021;
        String primeiroNome = "MARIO";
        String segundoNome = "ANDRADE" ;
        double saldo = 237.48;


        System.out.println("Digite o número de sua agência: ");
        agencia = read.next(agencia);


        System.out.println("Por favor, digite seu número de usuário: ");
        usuario = read.nextInt();

        System.out.println("Olá "+primeiroNome+" "+segundoNome+ ",obrigado por criar uma conta em nosso banco, sua agência é: "+agencia+", conta: "+usuario+" e seu saldo: "+ saldo+" já está disponível para saque.");
    }
}
