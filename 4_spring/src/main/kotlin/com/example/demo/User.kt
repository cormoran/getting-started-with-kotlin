package com.example.demo

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Table

// import javax.persistence.Id

@Entity
@Table(name="users")
data class MySQLUser(
        @javax.persistence.Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        var id:Int?=null,
        var name:String="",
        var email:String="")


@RedisHash("users")
data class RedisUser(
        @Id
        var id:String?=null,
        var name:String="",
        var email:String="")
