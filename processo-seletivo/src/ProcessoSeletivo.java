import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos ={"FELIPE","MARCIA","PAULO","AUGUSTO"};
        for(String candidato:candidatos){
             entrandoEmContato(candidato);
        }
    
        System.out.println("Processo seletivo!");
    
        }
            /*analisarCandidato(1900.0);
            analisarCandidato(2200.0);
            analisarCandidato(2000.0);*/
        static void entrandoEmContato(String candidato){
            int tentativasRealizadas =1;
            boolean continuarTentando = true;
            boolean atendeu=false;
                do{
                    atendeu= atender();
                    continuarTentando =!atendeu;
                    if(continuarTentando)
                        tentativasRealizadas++;
                    else
                        System.out.println("CONTATO REALIZADO COM SUCESSO");
                }while(continuarTentando && tentativasRealizadas<3);
            
                }
                    //método auxiliar
                static boolean atender() {
                    return new Random().nextInt(3)==1;
                }

                static void imprimirSelecionados(){
                    String[] candidatos = {"FELIPE","MARCIA","PAULO","AUGUSTO"};
                        System.out.println("Imprimindo a lista de candidatos informando o indice do elemeto");
                            for(int indice=0;indice<candidatos.length;indice++){
                        System.out.println("O candicandidatodato de n°"+(indice+1)+"é"+ candidatos[indice]);
                }

                for(String candidato: candidatos){
                System.out.println("O candidato selecionado foi" + candidato);
                entrandoEmContato(candidato);
                }
            
            
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
