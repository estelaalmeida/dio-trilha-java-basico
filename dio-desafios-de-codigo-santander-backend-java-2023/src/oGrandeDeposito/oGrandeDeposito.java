import java.util.Scanner;
import java.text.DecimalFormat;

public class  oGrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("#.00");

        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
         System.out.println("Deposito realizado com sucesso!\r\n" + "Saldo atual: R$"+ " " +  df.format(valor));
        } else if (valor == 0) {
          System.out.println("Encerrando o programa...");
            //TODO: Imprimir a mensagem de valor inválido.
        } else {
          System.out.println("Valor invalido! Digite um valor maior que zero.");
             //TODO: Imprimir a mensagem de encerrar o programa.
        
       
          
        }
    }
}