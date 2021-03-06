package activefx.tradeserver.runner;

import activefx.tradeserver.conf.TradeServerConfig;
import activefx.tradeserver.service.MessagePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TradeServerRunner {

        public static void main(final String ... args) {
            System.out.println("Trade Server Initialising");
            ApplicationContext context =
                    new AnnotationConfigApplicationContext(TradeServerConfig.class);
            MessagePrinter printer = context.getBean(MessagePrinter.class);
            System.out.println(printer.getMessage());
        }
}
