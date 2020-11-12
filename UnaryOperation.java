package evaluator;

public abstract class UnaryOperation implements IntExpression {

    private IntExpression x;

    public UnaryOperation (IntExpression x) {
        this.x = x;
    }

    abstract protected int doOperation(int xval);

    public int getValue() {
        return doOperation (x.getValue());
    }

    abstract protected String toStringOperator();

    public String toString() {
        return toStringOperator() + "(" +  x.getValue() + ")";
    }
}
