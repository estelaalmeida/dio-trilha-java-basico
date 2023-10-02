import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws Exception {
       try (Scanner terminal = new Scanner(System.in)) {
		int parametroUm; 
		int parametroDois;
		
System.out.println("Insira o parâmetroUm");
parametroUm = terminal.nextInt();

System.out.println("Insira o parâmetroDois");
parametroDois= terminal.nextInt();


try {
		//chamando o método contendo a lógica de contagem
		contar(parametroUm, parametroDois);

}catch ( ParametrosInvalidosException exception){
		
		//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro

		System.out.println("O segundo parâmetro deve ser maior que o primeiro");
}
	}
	}
		static void contar(int parametroUm, int parametroDois )throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {

			System.out.println("parâmetro um é Maior que parâmento Dois");
		}else{ 
			System.out.println("parâmetro um é Menor que parâmento Dois");
			
		}
		int contagem = parametroDois - parametroUm;
		
		//realizar o for para imprimir os números com base na variável contagem
        for(int  contar = 0 ; contar <=1;  contar++){
            System.out.println("Contador"+ contar + "Contagem"+ contagem);
        }
		
	}
}


