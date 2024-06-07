import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu Nome Completo.: ");
        String NomeCompleto = scanner.nextLine();

        System.out.println("Digite a sua Agencia.: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta.: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o seu saldo.: ");
        double saldo = scanner.nextDouble();

        System.out.println("Seja bem Vindo " + NomeCompleto + " Obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + "," + " Conta: " + conta + " e seu saldo  " + saldo + " Já está disponivel para saque ");

    }
}