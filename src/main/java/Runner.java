public class Runner {

    public void execute() {

        Calculator calculator = new Calculator();;
        Provider provider = new Provider();
        Parser parser = new ParsedExpression();

        String expressionToCalculate;

        expressionToCalculate = Console.readString("Please enter your expression:");

        provider.init();
        calculator.setOperationsSet(provider.getOperations());
        calculator.setParser(parser);
        System.out.println(expressionToCalculate + "=" + calculator.calculate(expressionToCalculate));

    }
}
