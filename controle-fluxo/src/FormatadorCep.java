
public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExeption e) {
          
            System.out.println("CEP invalido");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExeption{
        if(cep.length()!=8)
        throw new CepInvalidoExeption();

        //simulando um cep formatado
        return "23.765-064";
    }
}
