package pt.unl.fct.di.ciai.presentation

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@Schema(name = "User")
data class UserDTO(val id: Long, val name:String, val username: String,val password: String,val email: String,val phoneNumber: String)

@RequestMapping("/users")
@Tag(name = "Users", description = "Users API")
interface UserAPI {
    @GetMapping("{id}")
    @Operation(summary = "Retrieves User with the given id")
    @ApiResponses(value = [
            ApiResponse(responseCode = "200", description = "The user with the given id")
        ])
    fun getUser(@PathVariable id:Long)// = app.getUser(id)

    @GetMapping("{username}")
    @Operation(summary = "Retrieves User with the given username")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "The user with the given username"),
        ApiResponse(responseCode = "404", description = "User does not exist"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    ])
    fun findUserByUsername(@PathVariable username:String)// = app.getUser(id)

    @GetMapping("{id}/reservations")
    @Operation(summary = "Retrieves the reservations of the User with the given id")
    fun getUserReservations(@PathVariable id:Long)// = app.getUserReservations(id)

    @PutMapping("{id}/update")
    @Operation(summary = "Updates the User with the given id, with the information provided in the request")
    fun updateUser(@PathVariable id:Long, userData: UserDTO)// = app.updateUser(id, updatedInfo)

    @PostMapping("")
    @Operation(summary = "Adds a new User given the needed data")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Added user successfully"),
        ApiResponse(responseCode = "400", description = "User already exists"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    ])
    fun addUser(user:UserDTO)// = app.addUser(UserInfo)

    @DeleteMapping("{id}/remove")
    @Operation(summary = "Deletes the User with the given id")
    fun removeUser(@PathVariable id:Long)// = app.removeUser(id)
}