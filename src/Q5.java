import java.util.Random;
import java.util.Scanner;

public class Q5 {

	public static void soma_numeros(double[] n) {
		double qtd_negativo = 0, soma = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] > 0) {
				soma += n[i];
			} else {
				qtd_negativo++;
			}
		}
		System.out.println("Soma: " + soma + "qtd negativos " + qtd_negativo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		double[] n = new double[10];

		System.out.println("Informe 10 numeros");
		for (int i = 0; i < n.length; i++) {
			n[i] = random.nextDouble();
		}
		soma_numeros(n);
	}

}
