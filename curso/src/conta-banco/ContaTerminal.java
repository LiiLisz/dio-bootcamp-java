import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        
        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta:");
        numero = scan.nextInt();

        System.out.println("Por favor, digite a Agência:");
        agencia = scan.next();

        System.out.println("Por favor, digite o nome do cliente:");
        scan.nextLine();
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o saldo do cliente:");
        saldo = scan.nextDouble();

        scan.close();

        System.out.println("Olá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+", conta "+ numero + " e seu saldo de R$ "+saldo+" já está disponível para saque.");
        
    }
}
