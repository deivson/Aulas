import java.util.Random;
import java.util.Scanner;

public class Prova_2 {

	public static double atulizacao(double saldo, String operacao, double valor) {
		double resultado = 0;
		if (operacao.equals("C")) {
			resultado = valor + saldo;
		} else {
			resultado = saldo - valor;
		}

		return resultado;
	}

	public static void maior_valor(Object[][] op) {
		double maior = (double) op[0][1];
		int indice = 0;
		for (int i = 0; i < op.length; i++) {
			if (maior < (double) op[i][1] && op[i][0].equals("D")) {
				indice = i;
				maior = (double) op[i][1];
			}
		}
		System.out.println(op[indice][2] + " " + op[indice][1]);
	}

	public static void menor_valor(Object[][] op) {
		double menor = (double) op[0][1];
		int indice = 0;
		for (int i = 0; i < op.length; i++) {
			if (menor > (double) op[i][1] && op[i][0].equals("C")) {
				indice = i;
				menor = (double) op[i][1];
			}
		}
		System.out.println(op[indice][2] + " " + op[indice][1]);
	}

	public static void lista_nome(Object[][] op) {
		for (int i = 0; i < op.length; i++) {
			if (200 < (double) op[i][1] && op[i][0].equals("D")) {
				System.out.println(op[i][2] + " " + op[i][1]);
			}
		}

	}

	public static void extrato(Object[][] op, double saldo) {
		System.out.println("Saldo Inicial " + saldo);
		for (int i = 0; i < op.length; i++) {
			System.out.println(op[i][0] + " " + op[i][1] + " " + op[i][2]);
			saldo = atulizacao(saldo, (String) op[i][0], (double) op[i][1]);
		}
		System.out.println("Saldo atual " + saldo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o saldo");
		double saldo = input.nextDouble();
		Object[][] operacoes = new Object[10][3];
		double credito = 0, debito = 0;

		for (int i = 0; i < 10; i++) {

			/*
			 * operacoes[i][0] = input.next(); operacoes[i][1] =
			 * input.nextDouble(); operacoes[i][2] = input.next();
			 */

			operacoes[i][0] = (new Random().nextInt(2) == 0) ? "C" : "D";
			operacoes[i][1] = (double) new Random().nextInt(1000);
			operacoes[i][2] = ((char) (i + 65)) + "";

			if (operacoes[i][0].equals("D")) {
				debito += (double) operacoes[i][1];
			} else {
				credito += (double) operacoes[i][1];
			}

		}
		System.out.println();
		maior_valor(operacoes);
		menor_valor(operacoes);
		System.out.println("Debito Total" + debito);
		System.out.println("Credito Total" + credito);
		lista_nome(operacoes);
		extrato(operacoes, saldo);
	}
}
