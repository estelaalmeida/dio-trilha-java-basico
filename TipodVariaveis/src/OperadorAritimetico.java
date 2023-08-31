public class OperadorAritimetico {
     public static void main(String[] args) {
       int numero = 5;
        numero = - numero;
        System.out.println(numero);

        numero =  numero * -1;// para torna positivo
        System.out.println(numero);

        // repetição
        int numero = numero++;
        System.out.println(++numero);// incremento antes
        System.out.println(--numero);// decremento antes
        System.out.println(numero--);//depois
        System.out.println(numero ++);//depois */

        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);//! simbolo de negação

        // Ternário ?! <expressão condicional>?<caso condição seja verdadeira>: <Caso condição seja false>
          
        int a,b;
        a = 5;
        b = 6;

        String resultado = "";
        if(a==b)
        resultado = "verdadeiro";
       else
        resultado = "falso"; 
        System.out.println(resultado);System.out.println(resultado);
        //ou ternario

         int a,b;
        a = 5;
        b = 6;

        String resultado = a==b ?"verdadeiro";:"falso";
        //true ou false
        System.out.println(resultado);

        //Relacionais

        int numero1 = 1;
        int numero2 = 2; 

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2?" + simNao);
        if(numero1 < numero2)// verdadeiro
        {
           System.out.println("numero1 é maior a numero2?" + simNao);  
        }

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente a numero2?" + simNao);

        simNao = numero1 >= numero2;
        System.out.println("numero1 é maior a numero2?" + simNao);

        simNao = numero1 <= numero2;
        System.out.println("numero1 é menor a numero2?" + simNao);


        /// qunado falamos de obj e strings usamos  equals
         String nome1 = "ESTELA";
         String nome2 =  new String ("ESTELA");// cria um novo objeto

        System.out.println(nome1.equals(nome2));

       //////
       
       boolean condicao1 =true;
       boolean condicao2 =true;

       if(condicao1 && condicao2)//(7 > 4)
       {
            System.out.println(" as duas são verdadeiras");
       }

        if(condicao1 || condicao2){
            System.out.println(" uma das condições são verdadeiras");
    
    }


    
}