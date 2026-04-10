package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;
import com.example.demo.service.ChatService;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    private final ChatService chatService;

    public WebhookController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public String receiveMessage(@RequestBody Message message) {

        if (message == null || message.getMessage() == null) {
            return "Message is empty";
        }

        System.out.println("Received: " + message.getMessage());

        return chatService.getReply(message.getMessage());
    }
}