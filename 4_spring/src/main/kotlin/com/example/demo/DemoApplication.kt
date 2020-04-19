package com.example.demo

import org.springframework.beans.factory.annotation.Configurable
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.connection.jedis.JedisConnection
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

//@Configuration
//// @EnableRedisRepositories
//class Configuration {
////	@Bean
////	fun redisConnectionFactory(): RedisConnectionFactory {
////		return LettuceConnectionFactory()
////	}
////	@Bean
////	fun <T, V> redisTemplate(connectionFactory: RedisConnectionFactory): RedisTemplate<T, V> {
////		val templ = RedisTemplate<T, V>();
////		templ.setConnectionFactory(connectionFactory)
////		return templ
////	}
//}

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
