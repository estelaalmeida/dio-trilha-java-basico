package Singleton;

public class SingletonLazyHolder {
 
  /**Singleton Lazy Holder
   *
   */
    private static class InstanceHholder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstancia(){
        return InstanceHholder.instancia;
    }
}
