package com.example.reactivespringpostgresql.service

import com.example.reactivespringpostgresql.model.UserEntity
import com.example.reactivespringpostgresql.source.UserRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class UserService(private val repository: UserRepository) {
    fun getUsers() = repository.findAll()
    fun getUser(userId: Int) = repository.findById(userId)
    fun updateUser(user: UserEntity, userId: Int): Mono<UserEntity> {
        repository.deleteById(userId)
        return repository.save(user)
    }
    fun createUser(user:UserEntity) = repository.save(user)
    fun deleteUser(userId: Int)=repository.deleteById(userId)
}