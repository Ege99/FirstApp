public class Main
{
    public static void main(String[] args)
    {
        performCalculations();
    }

    static void performCalculations()
    {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');

        for (MathEquation equation : equations){
            equation.execute();
            System.out.println(" Result = " + equation.result);
        }
    }

    private static MathEquation create(double leftVal, double rightVal, char opCode)
    {
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;
        return equation;

    }
}