package org.fasttrackit.universityapp;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UniversityAppApplication {

    public static final String topicExchangeName = "spring-boot-exchange";

    public static final String queueName = "queue-01";

    @Bean
    Queue queue() {
        return new Queue(queueName, true);
    }

    public static void main(String[] args) {
        SpringApplication.run(UniversityAppApplication.class, args);
    }

}
