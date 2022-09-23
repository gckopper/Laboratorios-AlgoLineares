import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o nome da conta: ");
			Conta conta = new Conta(sc.next());
			System.out.println("Digite o quanto quer depositar: ");
			conta.depositar(sc.nextInt());
			System.out.println("Digite o quanto quer sacar: ");
			conta.sacar(sc.nextInt());
			conta.toString();
		}
	}

}
