import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in); 
        System.out.println("Por favor, me fale seu nome:");
        var NomeCliente = scanner.next();
        System.out.println("Agora o número da conta:");
        var numero = scanner.nextInt(); 
        System.out.println("Qual é a sua agência:");
        var agencia = scanner.next();
        System.out.println("quanto você quer deposita:");
        var saldo = scanner.nextFloat();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", NomeCliente, agencia, numero, saldo);
    }
}
