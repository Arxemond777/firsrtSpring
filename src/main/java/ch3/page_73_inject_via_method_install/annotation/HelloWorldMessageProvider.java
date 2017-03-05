package ch3.page_73_inject_via_method_install.annotation;

import org.springframework.stereotype.Service;
import ch3.page_73_inject_via_method_install.MessageProvider;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
