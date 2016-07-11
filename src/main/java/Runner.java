public class Runner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();;
        Provider provider = new Provider();
        Parser parser = new ParsedExpression();

        String expressionToCalculate;

        expressionToCalculate = Console.readString("Введіть, будь ласка, вираз.");

        provider.init();
        calculator.setOperationsSet(provider.getOperations());
        calculator.setParser(parser);
        System.out.println(expressionToCalculate + "=" + calculator.calculate(expressionToCalculate));

    }
}
