package com.example.data.repository.user

import com.example.data.response.BaseResponse
import com.example.data.service.user.UserService

class UserRepositoryImpl(
    private val userService: UserService
) : UserRepository {

    override suspend fun getUser(id: Int): BaseResponse<Any> {
        return BaseResponse.SuccessResponse(data = userService.getUser(id))
    }

    override suspend fun getNotification(id: Int): BaseResponse<Any> {
        return BaseResponse.SuccessResponse(data = userService.getAllNotification(id))
    }
}