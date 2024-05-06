import java.util.Scanner;

public class ContaTerminal {
    //Função para pular linhas e passar a impressão de um "cls"
    static void limpaTela(){
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void main(String[] args) {
        //Definição dos atributos da conta
        String nomeCliente, agencia;
        int numero;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        /*
        * Fluxo principal
        */

        System.out.print("Hello world!");
        limpaTela();

        System.out.println("Qual o seu nome?");
        nomeCliente = scanner.nextLine();
        limpaTela();

        System.out.println("Bem-vindo " + nomeCliente + ", por favor informe sua agencia:");
        agencia = scanner.next();
        limpaTela();

        System.out.println("Agora insira o numero da sua conta:");
        numero = scanner.nextInt();
        limpaTela();

        System.out.println("Quanto deseja adicionar de saldo?");
        saldo = scanner.nextDouble();
        limpaTela();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}