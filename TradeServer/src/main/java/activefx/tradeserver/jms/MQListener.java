package activefx.tradeserver.jms;

import org.springframework.context.annotation.Bean;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

 /* Created by steve on 15/12/2014.
 */
public class MQListener {

    @Bean
    public DefaultMessageListenerContainer jmsListenerContainer() {
        DefaultMessageListenerContainer dmlc = new DefaultMessageListenerContainer();

       /*  dmlc.setConnectionFactory(new ());
       dmlc.setDestination(new MQConnection("orders.queue"));

        // To schedule our concurrent listening tasks
        dmlc.setTaskExecutor(taskExecutor());

        // To perform actual message processing
        dmlc.setMessageListener(messageListener());*/

        dmlc.setConcurrentConsumers(10);

        // ... more parameters that you might want to inject ...
        return dmlc;
    }
}

/*
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:aop="http://www.springframework.org/schema/aop" xmlns:util="http://www.springframework.org/schema/util"
    xmlns:ctx="http://www.springframework.org/schema/context" xmlns:sws="http://www.springframework.org/schema/web-services"
    xmlns:context="http://www.springframework.org/schema/context" xmlns:p="http://www.springframework.org/schema/p"
    xsi:schemaLocation="
    http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
    http://www.springframework.org/schema/aop
    http://www.springframework.org/schema/aop/spring-aop-3.0.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context-3.0.xsd
    http://www.springframework.org/schema/web-services
    http://www.springframework.org/schema/web-services/web-services-2.0.xsd
    http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.0.xsd http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util-2.0.xsd">

    <bean id="mqConnectionFactory" class="com.ibm.mq.jms.MQQueueConnectionFactory">
        <property name="port" value="${mqSeriesQueueManagerPortNumber}" />
        <property name="hostName" value="${mqSeriesServerHostAddress}" />
        <property name="channel" value="${mqSeriesQueueManagerChannelName}" />
        <property name="queueManager" value="${mqSeriesQueueManager}" />
        <property name="CCSID" value="${mqSeriesQueueManagerCCSID}" />
        <property name="transportType">
            <util:constant static-field="com.ibm.mq.jms.JMSC.MQJMS_TP_CLIENT_MQ_TCPIP" />
        </property>
    </bean>

    <bean id="mqQueue_Reader" class="com.ibm.mq.jms.MQQueue">
        <property name="baseQueueName" value="${mqSeriesQueueName}" />
        <property name="CCSID" value="${mqSeriesQueueManagerCCSID}" />
        <property name="targetClient">
            <util:constant static-field="com.ibm.mq.jms.JMSC.MQJMS_CLIENT_NONJMS_MQ" />
        </property>
    </bean>

    <bean id="jmsQueueConnectionFactory" class="org.springframework.jms.connection.UserCredentialsConnectionFactoryAdapter">
        <property name="targetConnectionFactory" ref="mqConnectionFactory" />
        <property name="username" value="${mqSeriesUserName}" />
        <property name="password" value="${mqSeriesPassword}" />
    </bean>

    <bean id="jmsDestinationResolver" class="org.springframework.jms.support.destination.DynamicDestinationResolver"/>

    <bean id="jmsQueueTemplate" class="org.springframework.jms.core.JmsTemplate">
        <property name="connectionFactory" ref="jmsQueueConnectionFactory" />
        <property name="destinationResolver" ref="jmsDestinationResolver" />
        <property name="pubSubDomain" value="false" />
        <property name="receiveTimeout" value="10000" />
    </bean>

    <bean id="messageListener" class="your.jms.JmsQueueListener"/>

    <bean id="jmsContainer" class="org.springframework.jms.listener.DefaultMessageListenerContainer">
        <property name="connectionFactory" ref="jmsQueueConnectionFactory" />
        <property name="destination" ref="mqQueue_Reader" />
        <property name="messageListener" ref="messageListener" />
        <property name="receiveTimeout" value="3000" />
        <property name="maxMessagesPerTask" value="8" />
        <property name="autoStartup" value="true" />
        <property name="acceptMessagesWhileStopping" value="false" />
        <property name="maxConcurrentConsumers" value="3"/>
    </bean>

</beans>
 */