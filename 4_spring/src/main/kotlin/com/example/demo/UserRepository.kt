package com.example.demo

import org.springframework.data.repository.CrudRepository

interface MySQLUserRepository : CrudRepository<MySQLUser, String>
interface RedisUserRepository : CrudRepository<RedisUser, String>
