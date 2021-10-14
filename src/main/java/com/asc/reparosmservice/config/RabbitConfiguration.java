package com.asc.reparosmservice.config;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// classe de configuração do ambiente do Rabbit para troca de mensagens entre microserviços
@Configuration
public class RabbitConfiguration {

    // Bean de instanciação de uma ConnectionFactory ao servidor Rabbit
    @Bean
    public CachingConnectionFactory connectionFactory()
    {
        return new CachingConnectionFactory("localhost");
    }

    // Bean de instanciação da classe de operações administrativas
    @Bean(name="rAdmin")
    public RabbitAdmin amqpAdmin()
    {
        return new RabbitAdmin(connectionFactory());
    }
    
    // Bean de instanciação da classe de envio e recebimento de mensagens
    @Bean(name="rTemplate")
    public RabbitTemplate rabbitTemplate()
    {
        return new RabbitTemplate(connectionFactory());
    }

    // Bean de exposição de ceonversão de classes POJO para JSON string
    @Bean(name="mConverter")
    public ObjectMapper messageConverter()
    {
        return new ObjectMapper();
    }
}
