import java.io.File;
import java.util.Scanner;

public class Q4 {

	public static int busca_nome(String[] nomes, String nome) {
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(nome)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("entrada.txt"));
		String[] nome = new String[10];
		int k = 0;
		while (k < 10) {
			nome[k++] = input.nextLine();
		}

		/*
		 * System.out.println("Informe 10 nomes"); for (int i = 0; i <
		 * nome.length; i++) { nome[i] = input.nextLine(); }
		 */
		int i = busca_nome(nome, input.nextLine());
		if (i >= 0) {
			System.out.println("Nome encontrado foi " + nome[i] + " " + i);
		} else {
			System.out.println("Nome inexistente");
		}

	}

}
