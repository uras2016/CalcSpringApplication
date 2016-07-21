package ua.goit.java;

import org.apache.log4j.Logger;

public class Runner {

    private static Logger log = Logger.getLogger(Runner.class);

    private Provider provider; // создаем поле для инжекта в контейнер
    private Calculator calculator;
    private ParsedExpression parsedExpression;
    private Dividing dividing;
    private Multiplying multiplying;

    public void execute() {
        log.info("Log4j. Start logging with Log4j method:" + log.getName());
        String expressionToCalculate;

        boolean quit = false;
        while (!quit) {

            while (true) {

                expressionToCalculate = Console.readString("Please enter your expression to calculate:");

                provider.init();
                log.info("Run init method");

                provider.initAdditionalOperation(dividing);
                provider.initAdditionalOperation(multiplying);
                calculator.setOperationsSet(provider.getAllOperations());
                calculator.setParser(parsedExpression);
                System.out.println(expressionToCalculate + "=" + calculator.calculate(expressionToCalculate));

                if (Console.readString("\n - In order to calculate one more expression press  \"Enter\". \n - For Exit press \"q\" and press \"Enter\" ").equals("q"))
                    quit = true;
                break;
            }
        }

        log.info("Log4j. Stщз logging with Log4j method:" + log.getName());

    }

    public void setProvider(Provider provider) {
        this.provider = provider;
        log.info("Run " + provider.getClass());

    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        log.info("Run " + calculator.getClass());

    }

    public void setParsedExpression(ParsedExpression parsedExpression) {
        this.parsedExpression = parsedExpression;
        log.info("Run " + parsedExpression.getClass());

    }

    public void setDividing(Dividing dividing) {
        this.dividing = dividing;
        log.info("Run " + dividing.getClass());

    }

    public void setMultiplying(Multiplying multiplying) {
        this.multiplying = multiplying;
        log.info("Run " + multiplying.getClass());

    }
}
