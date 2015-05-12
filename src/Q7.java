import java.util.Random;
import java.util.Scanner;

public class Q7 {

	public static int produto_escalar(int[] v1, int[] v2) {
		int produto = 0;
		for (int i = 0; i < v2.length; i++) {
			produto += v1[i] * v2[i];
		}
		System.out.println("O produto é: " + produto);
		return produto;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int[] v1 = new int[20];
		int[] v2 = new int[20];

		System.out.println("Informe dois vetores do 20 posições");
		for (int i = 0; i < v2.length; i++) {
			v1[i] = random.nextInt(20);
			v2[i] = random.nextInt(20);
		}
		produto_escalar(v1, v2);
	}

}
