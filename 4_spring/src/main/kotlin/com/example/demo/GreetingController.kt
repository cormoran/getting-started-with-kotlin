package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


data class Greeting(val id: String= "xxxxxx", val name: String)

@RestController
class GreetingController {
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value="name", defaultValue = "Hello") name: String) : Greeting {
        return Greeting(name=name)
    }
}



@RestController
class HelloController {
    @GetMapping("/hello")
    fun hello(@RequestParam(value="name", defaultValue = "Hello") name: String) : String {
        return name
    }
}