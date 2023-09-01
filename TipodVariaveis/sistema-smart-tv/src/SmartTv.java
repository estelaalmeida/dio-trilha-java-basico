public class SmartTv{
    boolean  ligada=false;
    int canal =1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
canal = novoCanal;
    }
    

    public void aumentarCanal(){
        canal++;
    }

      public void diminuirCanal(){
        canal--;
    }

    public void ligar(){
        ligada=true;
    }
    
    public void desligar(){
        desligar=false;
    }

     public void aumentarvolume(){
        System.out.println("Aumentar o volume");
        volume++;
    
    }

     public void diminuirvolume(){
        System.out.println("Diminuir o volume");

        volume--;


}