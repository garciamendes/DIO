package DesafioControleFluxo;
import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = Integer.parseInt(terminal.nextLine());

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = Integer.parseInt(terminal.nextLine());

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException err) {
      System.err.println(err.getMessage());
		}

    terminal.close();
	}

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }

    int contagem = parametroDois - parametroUm;

    for (int i = 1; i <= contagem; i++) {
      System.out.println("Imprimindo o número: " + i);
    }
  }
}
