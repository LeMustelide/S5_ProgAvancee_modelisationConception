public class Constante extends IExpression{

    private int nb;
    public Constante(int i){
       nb = i;
    }

    @Override
    public double evaluate() {
        return nb;
    }
}
