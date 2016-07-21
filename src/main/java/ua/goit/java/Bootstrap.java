package ua.goit.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml",
                                                        "aop-context-withAnotations.xml"); // ищет конфиг
        //файл в класспасе
        Runner runner = applicationContext.getBean("runner", Runner.class);
        runner.execute();


    }

}
