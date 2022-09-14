public class Additions extends IExpression {
    private IExpression nb1;
    private IExpression nb2;

    public Additions(IExpression nb1, IExpression nb2){
        this.nb1 = nb1;
        this.nb2 = nb2;
    }
    
    @Override
    public double evaluate() {
        return nb1.evaluate() + nb2.evaluate();
    }
}
