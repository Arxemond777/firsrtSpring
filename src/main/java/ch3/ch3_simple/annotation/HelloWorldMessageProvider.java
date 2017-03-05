package ch3.ch3_simple.annotation;

import org.springframework.stereotype.Service;
import ch3.ch3_simple.MessageProvider;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
