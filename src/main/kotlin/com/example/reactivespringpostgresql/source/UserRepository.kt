package com.example.reactivespringpostgresql.source

import com.example.reactivespringpostgresql.model.UserEntity
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : ReactiveCrudRepository<UserEntity, Int> {
}