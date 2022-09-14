public class Main {
    public static void main(String[] args){
        IExpression exp;
        exp = new Additions(new Constante(4), new Multiplications(new Constante(2), new Constante(7)));
        System.out.println(exp.evaluate());
    }
}
