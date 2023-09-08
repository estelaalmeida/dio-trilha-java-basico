public class ContaTerminal {
    
    public static void main(String[] args) {
       
        String nome = args [0];
        String sobrenome = args [1];
        String agencia=  args [2];
        int    conta = Integer.valueOf( args [3]);
        double saldo = Double.valueOf(args[4]);
      
        System.out.println("Olá" + nome + sobrenome +
         ",obrigado por criar uma conta em nosso banco, sua agênicia" + agencia + conta + 
        "e seu saldo" + saldo + "ja estão disponivel para saque");
    }
}
