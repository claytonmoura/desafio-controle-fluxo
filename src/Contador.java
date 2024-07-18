import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			System.out.println("\nO segundo parâmetro deve ser maior que o primeiro\n");
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm < parametroDois) {
			int contagem = parametroDois - parametroUm;
			System.out.println();
			System.out.println("Parametro 1 " + "(" + parametroUm + ")" + " - " + "Parametro 2 " + "(" + parametroDois
					+ ")" + " = " + contagem + " números a serem impressos");
			System.out.println();
			// realizar o for para imprimir os números com base na variável contagem
			for (int x = 1; x <= contagem; x++) {
				System.out.println("Imprimindo o número " + x);

			}
			System.out.println();
		} else {
			throw new ParametrosInvalidosException();
		}
	}
}