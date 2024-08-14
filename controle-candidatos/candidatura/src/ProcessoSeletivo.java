import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] candidatos = {"Denis", "Igor", "Rayssa", "Sheyla", "Joyce"};
        for (String candidato : candidatos) {
            tentandoContato(candidato); 
        }
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"Denis", "Igor", "Rayssa", "Sheyla", "Joyce"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }
    }

    static void tentandoContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender(); 
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na tentativa " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas: " + tentativasRealizadas);
        }
    }

    static boolean atender() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Denis", "Vinicius", "Igor", "Kaique", "Kaue", "Yuri", "Giovana", "Rayssa", "Sheyla", "Joyce"};
        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
                analisarCandidato(salarioPretendido); 
            }
            candidatosAtuais++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta.");
        } else {
            System.out.println("Aguardando resultado demais candidatos.");
        }
    }
}