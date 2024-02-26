import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu numero de usuario!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite sua agencia!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo!");
        Float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " ,conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");

    }
}
