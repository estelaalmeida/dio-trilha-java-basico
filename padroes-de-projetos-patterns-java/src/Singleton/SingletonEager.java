package Singleton;
public class SingletonEager {
  /**Singleton "apressado"
   * EstelaAlmeida
   */


    private static SingletonEager instancia;
    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstancia(){
      
        return instancia;
    }
}
