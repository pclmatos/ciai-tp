package pt.unl.fct.di.ciai.presentation

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pt.unl.fct.di.ciai.application.UserApp



@RestController
class UserController(val app:UserApp): UserAPI {
    override fun getUser(id: Long): UserDTO = app.getUser(id)
    override fun getAllUsers(): List<UserDTO> = app.getAllUsers()

    override fun findUserByUsername(username: String) {

    }

    override fun getUserReservations(id: Long) {
    }

    override fun updateUser(@PathVariable id: Long, userData: UserDTO) {
    }

    override fun addUser(user: UserDTO): UserDTO = app.addUser(user)

    override fun removeUser(id: Long) {
    }

}