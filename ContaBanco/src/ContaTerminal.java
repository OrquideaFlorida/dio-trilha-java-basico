import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TO DO: Conhecer e importar a classe scanner
        Scanner usuario = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Digite a Agência: ");
        String agencia = usuario.next();

        System.out.println("Digite o Número da Conta: ");
        int conta = usuario.nextInt();

        System.out.println("Digite o seu Nome: ");
        String nome = usuario.next();

        System.out.println("Informe o valor a ser depositado (R$): ");
        double saldo = usuario.nextDouble();

        //Obter pela classe scanner os valores digitados no terminal
        //Exibir a mensagem final da conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + "já está disponível para saque.");
    }
}
