public class ContaTerminal {



    public static void main(String[] args){
            String nome = args [0];
            String sobrenome = args [1];
            String  agencia=  args [2];
            String conta =  args [3];
            double saldo = Double.valueOf(args [4]);

            System.out.println("Olá" + nome + sobrenome);
            System.out.println("Obrigada por criar conta em nosso banco" + saldo);
            System.out.println("já está disponivel para saque" + saldo);  
}
}
