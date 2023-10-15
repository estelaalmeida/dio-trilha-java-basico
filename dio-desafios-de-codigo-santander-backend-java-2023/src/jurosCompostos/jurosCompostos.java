import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;


public class jurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##0.00");
   
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble()*100/100.0;
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        
        for (int i =0; i<= periodo;i++){
          valorFinal= valorInicial*Math.pow(1+ taxaJuros,periodo);
        }

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}