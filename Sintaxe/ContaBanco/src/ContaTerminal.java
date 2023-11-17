import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia, nome_cliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência !");
        numero = sc.nextInt();

        System.out.println("Por favor, digite a Agência!");
        agencia = sc.next();

        System.out.println("Por favor, digite seu nome!");
        nome_cliente = sc.next();

        System.out.println("Por favor, digite o saldo!");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nome_cliente, agencia, numero, saldo);
    }
}
