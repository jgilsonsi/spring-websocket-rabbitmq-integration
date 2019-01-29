package com.jjdev.ws.controller;

import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Controller;

/**
 *
 * @author jgilson
 */
@Controller
public class JMessageController {

    @MessageMapping("/message")
    @SendTo("/topic/mq")
    public String send(String content, Message<?> message) {

        StompHeaderAccessor sha = StompHeaderAccessor.wrap(message);
        System.out.println("\nUser: " + sha.getSessionId());
        System.out.println("Message: " + content);

        return content + " " + sha.getSessionId();
    }

}
