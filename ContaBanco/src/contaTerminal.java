import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        //lendo nome do responsavél
        //System.out.println("Por favor, Digite o seu nome: ");
        String nome = args[0];//scanner.nextLine();
        System.out.println("\n");

        //lendo numero da conta
        //System.out.println("Por favor, Digite o numero da sua conta incluindo o digito: ");
        String numeroConta = args[1];//scanner.nextLine();
        System.out.println("\n");

        //lendo numero da agencia
        //System.out.println("Por favor, Digite sua agencia: ");
        int agencia = Integer.valueOf(args[2]);//scanner.nextInt();
        System.out.println("\n");

        double saldo = Double.valueOf(args[3]);//agencia * 3;
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta +" e seu saldo " + saldo + " já está disponível para saque\n");
        scanner.close();
        
}
}    

