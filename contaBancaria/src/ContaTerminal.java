import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number;
    String agencia;
    String nomeCliente;
    Float saldo;

    System.out.println("Por favor, digite o Numero da conta: ");
    number = scanner.nextInt();

    System.out.println("Por favor, digite o Agencia: ");
    agencia = scanner.nextLine();

    System.out.println("Por favor, digite seu nome completo: ");
    nomeCliente = scanner.nextLine();

    System.out.println("Por favor, digite o Saldo da conta: ");
    saldo = scanner.nextFloat();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + number + " e seu saldo " + saldo + " já está disponível para saque");
    scanner.close();
  }
}
