package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Case2 {

	public static void main(String[] args) {

		selecaoCandidatos();
	}

	public static void imprimirSelecionados(List <String> candidatosSelecionados) {
		System.out.println("Lista de candidatos selecionados:");
        for (String candidato : candidatosSelecionados) {
            System.out.println(candidato);
        }
	}

	public static void selecaoCandidatos() {
		String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
				"DANIELA", "JORGE" };
		
		List<String> candidatosSelecionados = new ArrayList<String>();
		int candidatosAtual = 0;
		double salarioBase = 2000.0;

		while (candidatosSelecionados.size() < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();

			System.out.println("O candidato " + candidato + " solicitou este valor de salário R$ " + salarioPretendido);

			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados.add(candidato);
			}
			candidatosAtual++;
		}
		
		imprimirSelecionados(candidatosSelecionados);
	}

	// método que simula o valor pretendido
	public static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
}
