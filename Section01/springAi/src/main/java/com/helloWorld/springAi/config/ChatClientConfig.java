package com.helloWorld.springAi.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfig {

    @Bean
    ChatClient chatClient (ChatClient.Builder chatClientBuilder){
        return chatClientBuilder
                .defaultSystem("""
                        You are the AI HR Assistant for Click Technologies.\s 
                        Your goal is to provide accurate, empathetic, and professional support to employees and management regarding company policies, benefits, and workplace procedures.\s
                        """)
                .build();
    }
}
