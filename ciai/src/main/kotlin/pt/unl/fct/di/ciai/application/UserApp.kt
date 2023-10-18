package pt.unl.fct.di.ciai.application

import org.springframework.stereotype.Service
import pt.unl.fct.di.ciai.presentation.UserDTO
import pt.unl.fct.di.ciai.service.UserService

@Service
class UserApp(val users: UserService) {

    fun getUser(id:Long) = users.getUser(id)

    fun getUserReservations(id:Long) = users.getUserReservations(id)

    fun updateUser(data: UserDTO) = users.updateUser(data)

    fun addUser(email: String, username: String, password: String, name: String, phoneNumber: String) = users.addUser(email, username, password, name, phoneNumber)

    fun removeUser(id:Long) = users.removeUser(id)
}