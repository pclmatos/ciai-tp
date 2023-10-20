package pt.unl.fct.di.ciai.service

import org.springframework.stereotype.Service
import pt.unl.fct.di.ciai.data.*
import pt.unl.fct.di.ciai.exceptions.UserAlreadyExistsException
import pt.unl.fct.di.ciai.presentation.PictureInUserDTO
import pt.unl.fct.di.ciai.presentation.UserDTO
import java.util.Optional

data class MyUserDetails(val username:String, val password:String, val roles:String)
@Service
class UserService(val users: UserRepository, val aparts: ApartmentService, val reservations: ReservationRepository, val pictures: PictureRepository) {
    fun getUser(id:Long): UserDTO {
        //get User by id
        val user = users.findById(id)
        if(user.isPresent) {
            val userAux = user.get()
            return UserDTO(userAux.name,userAux.username,userAux.password,userAux.email,userAux.phoneNumber, PictureInUserDTO(userAux.picture.url))
        }
        return UserDTO("","","","","", PictureInUserDTO(""))
    }

    fun getAllUsers(): List<UserDTO> {
        return users.findAll().map {
            UserDTO(it.name,it.username,it.password,it.email,it.phoneNumber,PictureInUserDTO(it.picture.url))
        }.toList()
    }

    fun findUserByUsername(username: String): UserDTO {
        val user = users.findByUsername(username)
        if(user != null) {
            return UserDTO(user.name, user.username, user.password, user.email, user.phoneNumber, PictureInUserDTO(user.picture.url))
        }
        return UserDTO("","","","","", PictureInUserDTO(""))
        //Optional.of(MyUserDetails("admin","admin","ADMIN"))
    }

    fun getUserReservations(id:Long) {
        //get User reservations by id
    }

    fun updateUser(user: UserDTO) {
        //update User information by id
    }

    fun addUser(user: UserDTO): UserDTO{
        val data = users.findByUsername(user.username)

        if (data != null && users.findById(data.id).isPresent){
            throw UserAlreadyExistsException()
        }

        val picture = pictures.save(Picture(0, user.picture.url))
        val userDao = users.save(UserDAO(0,user.email,user.username,user.password,user.name,user.phoneNumber, picture))

        return UserDTO(userDao.name,userDao.username,userDao.password,userDao.email,userDao.phoneNumber,PictureInUserDTO(userDao.picture.url))
    }
    fun removeUser(id:Long) {
        if(users.existsById(id)) {
            users.deleteById(id)
        }else {
            //throw user not found exception (404)
        }
    }
}