import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    // nome do cliente, numero, agencia e saldo da conta. Informando o texto no final. 

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        String nome  = scanner.next();

        System.out.println("Por favor, digite o numero: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Saldo disponível para saque: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+", obrigada por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+ numero+" e seu saldo " +saldo+ " está disponível para saque.");

        scanner.close();
    }
}
