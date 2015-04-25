import java.util.Scanner;

public class Q2 {

	public static void ordem_inversa(int[] n) {
		System.out.println();
		for (int i = n.length - 1; i >= 0; i--) {
			System.out.print(n[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] n = new int[10];

		System.out.println("Informe o 10 numeros intteiros");
		for (int i = 0; i < n.length; i++) {
			n[i] = input.nextInt();
		}
		ordem_inversa(n);
	}

}
