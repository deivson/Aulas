import java.util.Random;
import java.util.Scanner;

public class Q6 {

	public static void troca_numero(int[] n) {
		System.out.println();
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		for (int i = 0, j = n.length - 1; i < n.length / 2; i++, j--) {
			int temp = n[i];
			n[i] = n[j];
			n[j] = temp;
		}
		System.out.println();
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] n = new int[20];

		System.out.println("Informe 20 numeros");
		for (int i = 0; i < n.length; i++) {
			// n[i] = input.nextInt();
			n[i] = new Random().nextInt(10);
		}
		troca_numero(n);
	}

}
