import java.util.Random;

public class Prova_Java {

	public static int[] menor50(int[] b) {
		int[] resultado = new int[b.length];
		for (int i = 0, j = 0; i < resultado.length; i++) {
			if (b[i] < 50) {
				resultado[j] = b[i];
				j++;
			}
		}
		return resultado;
	}

	public static int[] multiplicar(int[] b, int v) {
		int[] resultado = new int[b.length];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = v * b[i];
		}
		return resultado;
	}

	public static int[] somar(int[] b, int[] v) {
		int[] resultado = new int[b.length];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = v[i] + b[i];
		}
		return resultado;
	}

	public static void imprimir(int[] l) {
		for (int i = 0; i < l.length; i++) {
			if (l[i] > 0)

				System.out.print(l[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] a = new int[50];

		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}

		int[] b = menor50(a);
		int[] c = multiplicar(b, 2);
		int[] d = somar(b, c);
		imprimir(a);
		imprimir(b);
		imprimir(c);
		imprimir(d);
	}
}
