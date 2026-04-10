package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String input) {
        if (input == null) return "I didn't understand";

        switch (input.toLowerCase()) {
            case "hi":
                return "Hello";
            case "bye":
                return "Goodbye";
            default:
                return "Sorry, I don't understand";
        }
    }

}