package com.contr;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
@Tag(name = "HelloController11", description = "Hello Controller22")
public class HelloController {

    @Operation(summary = "Hello World44444")
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
