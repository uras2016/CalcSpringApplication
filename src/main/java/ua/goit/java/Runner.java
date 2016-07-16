package ua.goit.java;

public class Runner {

    private Provider provider; // создаем поле для инжекта в контейнер
    private Calculator calculator;
    private ParsedExpression parsedExpression;
    private Dividing dividing;
    private Multiplying multiplying;

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void setParsedExpression(ParsedExpression parsedExpression) {
        this.parsedExpression = parsedExpression;
    }

    public void setDividing(Dividing dividing) {
        this.dividing = dividing;
    }

    public void setMultiplying(Multiplying multiplying) {
        this.multiplying = multiplying;
    }

    public void execute() {

        String expressionToCalculate;

        expressionToCalculate = Console.readString("Please enter your expression:");

        provider.init();
        provider.initAdditionalOperation(dividing);
        provider.initAdditionalOperation(multiplying);
        calculator.setOperationsSet(provider.getAllOperations());
        calculator.setParser(parsedExpression);
        System.out.println(expressionToCalculate + "=" + calculator.calculate(expressionToCalculate));

    }
}
