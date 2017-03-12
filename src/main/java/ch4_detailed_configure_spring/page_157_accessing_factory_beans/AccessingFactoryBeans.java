package ch4_detailed_configure_spring.page_157_accessing_factory_beans;

import java.security.MessageDigest;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AccessingFactoryBeans {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch4_detailed_configure_spring/page_157_accessing_factory_beans/app-context-xml.xml");
        ctx.refresh();

        MessageDigest digest = (MessageDigest) ctx.getBean("shaDigest");

        MessageDigestFactoryBean factoryBean = 
            (MessageDigestFactoryBean) ctx.getBean("&shaDigest"); //TODO

        try {
            MessageDigest shaDigest = factoryBean.getObject();
            System.out.println(shaDigest.digest("Hello world".getBytes()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
