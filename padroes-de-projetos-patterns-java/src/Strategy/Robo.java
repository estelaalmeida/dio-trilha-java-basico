package Strategy;

public class Robo {
    private Comportamento comportamento;//strategy
    public void setStrategy (Comportamento comportamento){//strategy
        this.comportamento = comportamento;//strategy
    }
    public void mover(){
        comportamento.mover();
    }
}
