package Facade;
import Facade.Subsistema2cep.CepApi;
import Facade.Subsistema1.CrmService;


public class Facade {

/**
 *
 * 
 */
public void migrarCliente(String nome, String cep) {
    String cidade = CepApi.getInstancia().recuperarCidade(cep);
    String estado =CepApi.getInstancia().recuperarEstado(cep);
    
CrmService.gravarCliente(nome,cep, cidade,estado);

}  
}
