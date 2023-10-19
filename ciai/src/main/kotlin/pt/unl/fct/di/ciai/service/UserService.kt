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
        return UserDTO("","","","","", PictureInUserDTO(""))
    }

    fun getAllUsers(): List<UserDTO> {
        return users.findAll().map {
            UserDTO(it.name,it.username,it.password,it.email,it.phoneNumber,PictureInUserDTO(it.picture.url))
        }.toList()
    }

    fun findUserByUsername(username: String?): Optional<MyUserDetails> =
        Optional.of(MyUserDetails("admin","admin","ADMIN"))

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
        //remove User by id
    }
}