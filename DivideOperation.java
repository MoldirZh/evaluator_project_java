package evaluator;

public class DivideOperation extends BinaryOperation {

    public DivideOperation (IntExpression lhs, IntExpression rhs) {
        super(lhs, rhs);
    }

    protected int doOperation (int lhsval, int rhsval) {
        if (rhsval == 0) {
            throw new DivideByZeroException();
        } else {
            return lhsval / rhsval;
        }
    }

    protected String toStringOperator () {
        return "/";
    }
}
