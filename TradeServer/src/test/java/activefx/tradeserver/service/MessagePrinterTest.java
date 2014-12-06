package activefx.tradeserver.service;


import activefx.tradeserver.conf.TradeServerConfig;
import activefx.tradeserver.conf.TradeServerConfigTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessagePrinterTest {

    @Test
    public void testSpring() {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(TradeServerConfigTest.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        Assert.assertEquals(printer.getMessage(), "Test Hello World");
    }

}