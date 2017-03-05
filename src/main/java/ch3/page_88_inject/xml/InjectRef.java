package ch3.page_88_inject.xml;

import org.springframework.context.support.GenericXmlApplicationContext;
import ch3.page_88_inject.Oracle;
import ch3.page_88_inject.BookwormOracle;

public class InjectRef {
    private Oracle oracle;

    public void setOracle(Oracle oracle) { 
        this.oracle = oracle;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch3/page_88_inject/app-context-xml.xml");
        ctx.refresh();

        InjectRef injectRef = (InjectRef) ctx.getBean("injectRef");
        System.out.println(injectRef);
    }

    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
