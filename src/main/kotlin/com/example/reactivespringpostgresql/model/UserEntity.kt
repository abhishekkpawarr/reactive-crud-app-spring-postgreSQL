package com.example.reactivespringpostgresql.model

import org.springframework.data.annotation.Id

class UserEntity(
    @Id
    var userId: Int,

    var userName: String,

    var jobDetails: String,

    var noOfPosts: Int
)