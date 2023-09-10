public class ForArrays {
    public static void main(String[] args) {
        // em arrays o indice inicia com 0
        String alunos[] = {"FELIPE","JONAS", "JULIA","MARCOS"};

        //for (int x = 0; x < alunos.length; x++){
         //System.out.println("Oaluno x=" + x + "é" + alunos[x]);
            
         for(String aluno : alunos){
                    System.out.println("Nome do aluno é:" + aluno);
            }

        }

    }
    

