package activefx.tradeserver.conf;

import activefx.tradeserver.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("activefx.tradeserver")
public class TradeServerConfigTest {

    @Bean
    MessageService mockMessageService() {
        MessageService mock = () -> "Test Hello World";
        return mock;
    }

}
