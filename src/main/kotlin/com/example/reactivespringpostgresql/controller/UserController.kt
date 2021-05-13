package com.example.reactivespringpostgresql.controller

import com.example.reactivespringpostgresql.model.UserEntity
import com.example.reactivespringpostgresql.service.UserService
import com.example.reactivespringpostgresql.source.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/v2/user")
class UserController(private val service: UserService) {

    @Autowired
    private val repository: UserRepository?= null

    @GetMapping
    fun getUsers(): Flux<UserEntity> = service.getUsers()

    @GetMapping("/{userId}")
    fun getUser(@PathVariable userId: Int): Mono<UserEntity> = service.getUser(userId)

    @PostMapping
    fun createUser(@RequestBody user: UserEntity): Mono<UserEntity> = service.createUser(user)

    @PutMapping("/{userId}")
    fun updateCustomer(@RequestBody user: UserEntity, @PathVariable userId: Int): Mono<UserEntity> = service.updateUser(user,userId)

    @DeleteMapping("/{userId}")
    fun deleteUser(@PathVariable userId: Int): Mono<Void> = service.deleteUser(userId)
}