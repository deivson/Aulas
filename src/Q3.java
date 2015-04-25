import java.util.Scanner;

public class Q3 {

	public static double altura_media(double[] altura, int n) {
		double media = 0;
		for (int i = 0; i < n; i++) {
			media += altura[i] / n;
		}
		return media;
	}

	public static void altura_maior(double[] altura, String[] nome, int n) {
		double media = altura_media(altura, n);

		for (int i = 0; i < n; i++) {
			if (altura[i] > media) {
				System.out.println("Nome maior que a media " + nome[i]
						+ " Altura " + altura[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] nome = new String[100];
		double[] altura = new double[100];
		int cont = 0;
		System.out.println("Informe o nome e altura");
		for (int i = 0; i < altura.length; i++) {

			nome[i] = input.next();
			if (nome[i].equals("fim")) {
				break;
			}
			altura[i] = input.nextDouble();
			cont++;

		}
		System.out.println(altura_media(altura, cont));
		altura_maior(altura, nome, cont);
	}

}
