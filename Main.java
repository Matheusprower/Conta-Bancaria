import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nC:mero da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome da agC*ncia: ");
		String agencia = sc.nextLine();
		System.out.println("Digite o nome do cliente: ");
		String nome_cliente = sc.nextLine();
		System.out.println("Digite o saldo da conta: ");
		double saldo = sc.nextDouble();
		sc.nextLine();
		ContaTerminal contaBancaria = new ContaTerminal(numero, agencia, nome_cliente, saldo);
		System.out.printf("OlC! %s, obrigado por criar uma conta em nosso banco! Sua agC*ncia C) %s, conta %d e seu saldo C) %.2f. JC! estC! disponC-vel para saque!", contaBancaria.nome_cliente, contaBancaria.agencia, contaBancaria.numero, contaBancaria.saldo);
	}
}

class ContaTerminal {
	int numero;
	String agencia;
	String nome_cliente;
	double saldo;

	public ContaTerminal (int numero, String agencia, String nome_cliente, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nome_cliente = nome_cliente;
		this.saldo = saldo;
	}
}

