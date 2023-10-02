
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ParametrosInvalidosException extends ExecutionException{
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    try {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite Parâmetro Um");
    String parametroUm = scanner.nextLine();

    System.out.println("Digite Parâmentro Dois");
    String parametroDois = scanner.nextLine();
    
    System.out.println("Meus Parâmetro infomados são: " + parametroUm + " "+ parametroDois);
    scanner.close();
    }catch (Exception ex){

      System.out.println("O paramentros devem seguir as solicitações acima ");
    }
  }
  }

  
    

