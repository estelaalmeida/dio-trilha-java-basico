import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo!");
        
        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/
    } 
            static void selecaoCandidatos(){
            String [] candidatos = {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
                int candidatoSelecionado = 0;
                int candidatoAtual = 0;
                double salarioBase = 2000.0;
            
            while(candidatoSelecionado < 5 && candidatoAtual < candidatos.length){
                String candidato = candidatos [candidatoAtual];
                double salarioPretendido = valorPretndido();
                System.out.println(" O candidato"+ candidato+"Splicitou este valor de sálario" + salarioPretendido);
                if(salarioBase >= salarioPretendido){
                    candidatoSelecionado++;
                    System.out.println(" O candidato"+ candidato+"Splicitou este valor de sálario" + salarioPretendido);
                
                }
                candidatoAtual++;
            
            }

        }   

            static double valorPretndido(){
                return ThreadLocalRandom.current().nextDouble(1800,2200);
        }
            static void analisarCandidato( double salarioPretendido){
            
                double salarioBase = 2000.0;
                    if(salarioBase> salarioBase){
                        System.out.println("LIGAR PARA O CANDIDATO");
                    }else if (salarioBase == salarioPretendido ) {
                        System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA ");
                    }else{
                        System.out.println("AGUARANDO RESULTADO DOS DEMIAS CANDIDATO ");
            
            }
    }
}
