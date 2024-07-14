import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("-----------------------------------");
            System.out.println("Para continuar, escolha uma opçao: ");
            System.out.println("1 - Depositar ");
            System.out.println("2 - Sacar ");
            System.out.println("3 - Consultar saldo ");
            System.out.println("0 - Encerrar Operaçao ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:{
                    //Ler o valor a ser depositado e atualizar ou imprimir o saldo
                    System.out.println("Digite o valor de deseja depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Deposito realizado com sucesso no valor de R$" + deposito);
                    System.out.println("Saldo atual: " + saldo);
                    break;
                }
                case 2:{
                    //Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite quanto deseja sacar: ");
                    double saque = scanner.nextDouble();
                    if(saque < saldo){
                      saldo -= saque;
                      System.out.println("Saldo atual: " + saldo);
                    }else 
                      System.out.println("Saldo insuficiente.");
                    break;
                }
                case 3:{
                    //Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo);
                    break;
                }
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
