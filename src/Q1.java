import java.util.Scanner;

public class Q1 {

	public static void elementos(int[] a) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int qtd_elementos(int[] a) {
		int qtd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				qtd++;
			}
		}

		return qtd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] a = new int[5];

		System.out.println("Informe 5 numeros");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		elementos(a);
		System.out.println();
		System.out.println("A quatidade de elementos negativos "
				+ qtd_elementos(a));
	}

}
