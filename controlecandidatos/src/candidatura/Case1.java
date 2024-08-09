package candidatura;

public class Case1 {

	public static void main(String[] args) {

		analisarCanditato(1900.0);
		analisarCanditato(2200.0);
		analisarCanditato(2000.0);
		
	}

	public static void analisarCanditato(double salarioPretendido) {
		double salarioBase = 2000.0;

		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
