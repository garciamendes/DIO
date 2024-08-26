import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        String[] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA"};

        for (String candidato : candidatos) {
            entrandoEmContanto(candidato);
        }
    }

    static void entrandoEmContanto(String candidato) {
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativaRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativaRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativaRealizadas + " TENTATIVAS");
        } else {
            System.out.println("NÂO CONSEGUIMOS CONTATO COM " + candidato + "NÚMERO MAXIMO TENTATIVAS " + tentativaRealizadas + " REALIZADAS");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA"};

        for (int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice+1) + " é o " + candidatos[indice]);
        }

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double saslarioPretendido = valorPretentido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + saslarioPretendido);

            if (salarioBase >= saslarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
    }

    static double valorPretentido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidato(double saslarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > saslarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == saslarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDADNO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
