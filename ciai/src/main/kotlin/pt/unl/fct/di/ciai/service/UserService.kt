package pt.unl.fct.di.ciai.service

import org.springframework.stereotype.Service
import pt.unl.fct.di.ciai.presentation.UserDTO
import java.util.*

data class MyUserDetails(val username:String, val password:String, val roles:String)
@Service
class UserService {
    fun getUser(id:Long) {
        //get User by id
    }

    fun findUserByUsername(username: String?): Optional<MyUserDetails> =
        Optional.of(MyUserDetails("admin","admin","ADMIN"))

    fun getUserReservations(id:Long) {
        //get User reservations by id
    }

    fun updateUser(data: UserDTO) {
        //update User information by id
    }

    fun addUser(email: String, username: String, password: String, name: String, phoneNumber: String) {
        //add User to DB with UserInfo
    }

    fun removeUser(id:Long) {
        //remove User by id
    }
}