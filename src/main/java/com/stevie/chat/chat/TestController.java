package com.stevie.chat.chat;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestController {
    @GetMapping("/test")
    public String test() {
        ChatMessage message = new ChatMessage();
        return message.getTest();
    }
}
