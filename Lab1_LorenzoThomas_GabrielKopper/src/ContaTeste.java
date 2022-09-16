import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {
		Conta conta = new Conta(0, "01");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o quanto quer depositar: ");
		conta.depositar(sc.nextInt());
		System.out.println("Digite o quanto quer sacar: ");
		conta.sacar(sc.nextInt());
		conta.toString();
		System.out.println("Digite o nome da conta: ");
		conta.Conta(sc.next());
	}

}
