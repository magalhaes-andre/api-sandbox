package com.code_brain.writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class Resource {

    @Autowired
    private StreamBridge bridge;
    private static final String MESSAGE_SUPPLIER_BINDING = "messageSupplier-out-0";

    @PostMapping("/{message}")
    public String personalMessage(@PathVariable String message){
        if(bridge.send(MESSAGE_SUPPLIER_BINDING, message)){
            return "Message sent: ".concat(message);
        }
        return "Message wasn't delivered";
    }
}
