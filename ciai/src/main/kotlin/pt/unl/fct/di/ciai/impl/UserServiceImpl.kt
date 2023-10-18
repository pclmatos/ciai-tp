package pt.unl.fct.di.ciai.impl

import io.swagger.v3.oas.models.responses.ApiResponse
import org.springframework.stereotype.Service
import pt.unl.fct.di.ciai.data.*
import pt.unl.fct.di.ciai.exceptions.UserAlreadyExistsException
import pt.unl.fct.di.ciai.presentation.UserDTO

@Service
class UserServiceImpl(val users:UserRepository, val aparts: ApartmentRepository, val reservations: ReservationRepository, val pictures: PictureRepository){
    fun addUser(user: UserDTO): UserDTO{
        if(users.checkIfExists(user.username)){
            throw UserAlreadyExistsException()
        }

        pictures.save(Picture(0, user.picture.url))

        users.save(UserDAO(0,user.email,user.username,user.password,user.name,user.phoneNumber, user.picture))

        return user;
    }



}