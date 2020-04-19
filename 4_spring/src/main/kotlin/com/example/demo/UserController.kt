package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path= arrayOf("/redisuser"))
class RedisUserController(private val userRepository: RedisUserRepository) {

    @PostMapping(path= arrayOf("/add"))
    fun  addNewUser(@RequestParam  name: String, @RequestParam  email: String):  String  {
        val user = RedisUser(name=name, email=email)
        userRepository.save(user)
        return "saved"
    }

    @GetMapping(path= arrayOf("/get"))
    fun getAllUsers(): Iterable<RedisUser> {
        return userRepository.findAll()
    }
}

@RestController
@RequestMapping(path= arrayOf("/mysqluser"))
class MySQLUserController(private val userRepository: MySQLUserRepository) {

    @PostMapping(path= arrayOf("/add"))
    fun  addNewUser(@RequestParam  name: String, @RequestParam  email: String):  String  {
        val user = MySQLUser(name=name, email=email)
        userRepository.save(user)
        return "saved"
    }

    @GetMapping(path= arrayOf("/get"))
    fun getAllUsers(): Iterable<MySQLUser> {
        return userRepository.findAll()
    }
}