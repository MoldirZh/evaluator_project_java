package evaluator;

public class TernaryOperation implements IntExpression {

    private IntExpression exp1;
    private IntExpression exp2;
    private IntExpression exp3;

    public TernaryOperation (IntExpression exp1, IntExpression exp2, IntExpression exp3) {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.exp3 = exp3;
    }

    protected int doOperation(int exp1val, int exp2val, int exp3val) {
        if (exp1val == 0) {
            return exp3val;
        } else {
            return exp2val;
        }
    }

    public int getValue() {
        return doOperation (exp1.getValue(), exp2.getValue(), exp3.getValue());
    }

    public String toString() {
        return "( " + exp1 + " ? " + exp2 + " : " + exp3 + " )";
    }
}
