import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: "Importando a classe scanner"
        Scanner input = new Scanner(System.in);


        System.out.println("Digite o numero da conta: ");
        int numero = input.nextInt();
        input.nextLine();

        System.out.println("Digite a agencia: ");
        String agencia = input.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCliente = input.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +  " e seu saldo " + saldo + " já está disponível para saque");


    }
}
