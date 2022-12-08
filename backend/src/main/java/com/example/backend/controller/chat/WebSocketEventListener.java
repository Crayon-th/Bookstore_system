package com.example.backend.controller.chat;

import com.example.backend.pojo.ChatMessage;
import com.example.backend.pojo.MessageType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
public class WebSocketEventListener {
    private static final Logger logger= LoggerFactory.getLogger(WebSocketEventListener.class);

    @Autowired
    private SimpMessageSendingOperations sendingOperations;

    @EventListener
    public void handleWebSocketConnectListener(final SessionConnectedEvent sessionConnectedEvent){
        logger.info("BING bong bing. We have a new connection!");
    }

    @EventListener
    public void handleWebSocketDisconnectListener(final SessionDisconnectEvent sessionDisconnectEvent){
        final StompHeaderAccessor headerAccessor=StompHeaderAccessor.wrap(sessionDisconnectEvent.getMessage());

        final String username=(String) headerAccessor.getSessionAttributes().get("username");
        final ChatMessage chatMessage=ChatMessage.builder()
                .type(MessageType.DISCONNECT)
                .sender(username)
                .build();

        //System.out.println(chatMessage);
        sendingOperations.convertAndSend("/topic/public",chatMessage);
    }
}