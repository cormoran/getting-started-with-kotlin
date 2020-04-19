# Spring Boot Pratice

- First RESTFul Web Service: <https://spring.io/guides/gs/rest-service/>
- Mysql with Hibernate: <https://spring.io/guides/gs/accessing-data-mysql/>
  - for kotlin (Qiita): <https://qiita.com/morimorim/items/2447048c0275c843b89c>
- kotlin sample (github): <https://github.com/jkazama/sample-boot-kotlin>

Repository は、データの annotation を見て勝手に対応する DB を使う repository 実装を作ってくれるらしい

MySQL: `org.springframework.boot:spring-boot-starter-data-jpa`

```
spring.jpa.hibernate.ddl-auto=update # auto migration by hibernate
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/spring_test
spring.datasource.username=spring_test
spring.datasource.password=password
```

```
@Entity
data class User(
        @javax.persistence.Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        var id:Int?=null,
        var name:String="",
        var email:String="")
```

Redis: `org.springframework.boot:spring-boot-starter-data-redis`

```
spring.redis.host=localhost
spring.redis.port=6379
```

```
@RedisHash("users")
data class User(
        @org.springframework.data.annotation.Id
        var id:String?=null,
        var name:String="",
        var email:String="")
```