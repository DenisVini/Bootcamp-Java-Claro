import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       
    }
    static void selecaoCandidatos(){
        String candidatos[] ={"Denis" , "Vinicius","Igor","Kaique","Kaue","Yuri","Giovana","Rayssa","Sheyla","Joyce"};
        int candidatosSelecionados = 0;
        int candidatosAtuais=0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5 && candidatosAtuais < candidatos.length){
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtuais++;
        }
    }
     static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
     }
    
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato.");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para candidato com contra proposta.");
        }else System.out.println("Aguardando resultado demais candidatos.");
    }
}
