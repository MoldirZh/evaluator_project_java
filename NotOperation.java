package evaluator;

public class NotOperation extends UnaryOperation {

    public NotOperation (IntExpression x) {
        super(x);
    }

    protected int doOperation (int xval) {
        if (xval == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    protected String toStringOperator() {
        return "!";
    }
}
