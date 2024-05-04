import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digita sua Agencia");
        String agencia = scanner.next();
 
        System.out.println("Digite sua Conta");
        int conta = scanner.nextInt();

        System.out.println("Digite o saldo da sua Conta");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, " + nome + " " + sobrenome + ", obrigado por cadastrar uma nova conta no nosso banco os dados da conta são: ");
        System.out.println("O número de sua Agencia e: " + agencia );
        System.out.println("O número de sua Conta e:  " + conta );
        System.out.println("O seu Saldo da sua conta e:  " + saldo );
        
        
    }

    
     
}