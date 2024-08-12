package education.java;
public class ConcatNome {

    public static void main(String[] args) {
        String primeiroNome = "Denis Vinicius";
        String segundoNome = "Bolla da Silva" ;

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    }