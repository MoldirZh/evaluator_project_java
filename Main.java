package evaluator;

public class Main {

    public static void main (String[] args) {

        //5 + (-8 + 13) (add operation)
        IntExpression add =
                new AddOperation(
                        new IntConstant(5),
                        new AddOperation(
                                new IntConstant(-8),
                                new IntConstant(13)));
        System.out.println("Add: " + add.toString() + " = " + add.getValue());

        //10 - (-5 - 1) (subtract operation)
        IntExpression sub =
                new SubtractOperation(
                        new IntConstant(10),
                        new SubtractOperation(
                                new IntConstant(-5),
                                new IntConstant(1)));
        System.out.println("Subtract: " + sub.toString() + " = " + sub.getValue());

        //2 * (-4 * 5) (multiply operation)
        IntExpression mult =
                new MultiplyOperation(
                        new IntConstant(2),
                        new MultiplyOperation(
                                new IntConstant(-4),
                                new IntConstant(5)));
        System.out.println("Multiply: " + mult.toString() + " = " + mult.getValue());

        //100 / (20 / 5) (divide operation)
        IntExpression div =
                new DivideOperation(
                        new IntConstant(100),
                        new DivideOperation(
                                new IntConstant(20),
                                new IntConstant(5)));
        System.out.println("Divide: " + div.toString() + " = " + div.getValue());

        /*//100 / (20 / 0) (divide with exception)
        IntExpression divEx =
                new DivideOperation(
                        new IntConstant(100),
                        new DivideOperation(
                                new IntConstant(20),
                                new IntConstant(0)));
        System.out.println("Divide: " + divEx.toString() + " = " + divEx.getValue());*/

        //5 & (10 & 0) (and operation)
        IntExpression and =
                new AndOperation(
                        new IntConstant(5),
                        new AndOperation(
                                new IntConstant(10),
                                new IntConstant(0)));
        System.out.println("And: " + and.toString() + " = " + and.getValue());

        //5 & (10 & 0) (or operation)
        IntExpression or =
                new OrOperation(
                        new IntConstant(5),
                        new OrOperation(
                                new IntConstant(10),
                                new IntConstant(0)));
        System.out.println("Or: " + or.toString() + " = " + or.getValue());

        //-5 (minus operation)
        IntExpression minus =
                new MinusOperation(
                        new IntConstant(-5));
        System.out.println("Minus: " + minus.toString());

        //5 (not operation)
        IntExpression not =
                new NotOperation(
                        new IntConstant(10));
        System.out.println("Not: " + not.toString() + " = " + not.getValue());

        //0 ? 10 : 2 (ternary operation)
        IntExpression tern =
                new TernaryOperation(
                        new IntConstant(0),
                        new IntConstant(10),
                        new IntConstant(2));
        System.out.println("Ternary: " + tern.toString() + " = " + tern.getValue());
    }
}
