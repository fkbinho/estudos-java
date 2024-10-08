package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Case2 {

	public static void main(String[] args) {

		selecaoCandidatos();
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
		
		for (String candidato : candidatosSelecionados) {
			entrandoEmContato(candidato);
		}
	}

	// solução para o case 3
	public static void imprimirSelecionados(List<String> candidatosSelecionados) {
		System.out.println("\nLista de candidatos selecionados:");
		for (String candidato : candidatosSelecionados) {
			System.out.println(candidato);
		}
	}

	// método que simula o valor pretendido
	public static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	// solução para o case 4
	public static void entrandoEmContato(String candidato) {

		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if(continuarTentando) {
				tentativasRealizadas++;
			} else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
		} while (continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMÉRO MÁXIMO DE TENTATIVA" + tentativasRealizadas + " TENTATIVA.");
	}
	
	// método auxiliar
	public static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
}