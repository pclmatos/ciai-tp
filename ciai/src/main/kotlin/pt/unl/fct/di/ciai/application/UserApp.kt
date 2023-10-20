package pt.unl.fct.di.ciai.application

import org.springframework.stereotype.Service
import pt.unl.fct.di.ciai.presentation.UserDTO
import pt.unl.fct.di.ciai.service.UserService

@Service
class UserApp(val users: UserService) {

    fun getUser(id:Long): UserDTO = users.getUser(id)

    fun getAllUsers(): List<UserDTO> = users.getAllUsers()

    fun findUserByUsername(username:String): UserDTO = users.findUserByUsername(username)

    fun getUserReservations(id:Long) = users.getUserReservations(id)

    fun updateUser(data: UserDTO) = users.updateUser(data)

    fun addUser(user: UserDTO): UserDTO = users.addUser(user)

    fun removeUser(id:Long) = users.removeUser(id)
}