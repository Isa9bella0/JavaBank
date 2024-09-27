package application;

//Importações
import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Account account;
		
		//Leitura dos dados
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		//condição para o depósito inicial
		System.out.print("  Is therena initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		
		//Impressão e atualização dos dados da conta
		System.out.println();
		System.out.println( "Account data: " );
		System.out.println(account);
		
		
		System.out.println();
		System.out.print("Enter a deposit value:");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("updated account data:");
		System.out.println(account);
		
		

		System.out.println();
		System.out.print("Enter a withdraw value:");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("updated account data:");
		System.out.println(account);
		
		
		
		
		sc.close();
	}

}
