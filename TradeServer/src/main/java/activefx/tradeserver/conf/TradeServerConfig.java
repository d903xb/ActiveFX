package activefx.tradeserver.conf;

import activefx.tradeserver.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("activefx.tradeserver")
public class TradeServerConfig {

    @Bean
    MessageService mockMessageService() {
        MessageService msgService = () -> "Live Hello World";
        return msgService;
    }

}
