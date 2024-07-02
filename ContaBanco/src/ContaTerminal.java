import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String name, agency;
        int accountNumber; 
        float balance;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);      

        System.out.println("Por favor, digite o número da Agência!");
        agency = scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente");
        name = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta!");
        accountNumber = scanner.nextInt();
        System.out.println("Por favor, digite o saldo inicial!");
        balance = scanner.nextFloat();

        scanner.close();

        String accountCreated = String.format(Locale.US, "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", name, agency, accountNumber, balance);

        System.out.println(accountCreated);

    }
}
