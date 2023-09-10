import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class EstruturaExcepcionais {
    public static void main(String[] args) {
    
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobreanome");
        String sobreanome = scanner.next();
        
        System.out.println("Digite seu idade");
        double idade = scanner.nextDouble();

        System.out.println("Digite seu Altura");
        double altura = scanner.nextDouble();
        
        //imprimindo dados do usuario
        System.out.println("Olá, me chamo" +" "+ " " + nome.toUpperCase() + sobreanome);
        System.out.println("Tenho" + " " + idade + "anos");
        System.out.println("Minha altura é" + " "+ altura + "cm");
        scanner.close();
        }
        catch (InputMismatchException e){
           System.out.println("Os campos idade e altura precisam ser números");
        }
        
        
    }
}
