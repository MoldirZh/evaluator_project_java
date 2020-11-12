package evaluator;

public class MinusOperation extends UnaryOperation {

    public MinusOperation (IntExpression x) {
        super (x);
    }

    protected int doOperation (int xval) {
        return xval;
    }

    protected String toStringOperator() {
        return "-";
    }
}
