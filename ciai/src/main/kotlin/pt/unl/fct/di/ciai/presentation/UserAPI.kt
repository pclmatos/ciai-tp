package pt.unl.fct.di.ciai.presentation

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*
import pt.unl.fct.di.ciai.data.Picture

@Schema(name = "User")
data class UserDTO(val name:String, val username: String,val password: String,val email: String, val phoneNumber: String, val picture: PictureInUserDTO)

@Schema(name = "Picture")
data class PictureInUserDTO(val url: String)

@RequestMapping("/users")
@Tag(name = "Users", description = "Users API")
interface UserAPI {
    @GetMapping("{id}/getById")
    @Operation(summary = "Retrieves User with the given id")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "The user with the given id"),
        ApiResponse(responseCode = "404", description = "User does not exist"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    ])
    fun getUser(@PathVariable id:Long): UserDTO// = app.getUser(id)

    @GetMapping("")
    @Operation(summary = "Retrieves all users ")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "A list of all users"),
        ApiResponse(responseCode = "404", description = "There are no users"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    ])
    fun getAllUsers(): List<UserDTO>

    @GetMapping("{username}/getByUsername")
    @Operation(summary = "Retrieves User with the given username")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "The user with the given username"),
        ApiResponse(responseCode = "400", description = "Wrong user data format"),
        ApiResponse(responseCode = "404", description = "User does not exist"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    ])
    fun findUserByUsername(@PathVariable username:String): UserDTO// = app.getUser(id)

    @GetMapping("{id}/reservations")
    @Operation(summary = "Retrieves the reservations of the User with the given id")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "User's current reservations"),
        ApiResponse(responseCode = "204", description = "User doesn't have reservations"),
        ApiResponse(responseCode = "404", description = "User not found"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    ])
    fun getUserReservations(@PathVariable id:Long)// = app.getUserReservations(id)

    @PutMapping("{id}/update")
    @Operation(summary = "Updates the User with the given id, with the information provided in the request")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "User information has been updated"),
        ApiResponse(responseCode = "400", description = "Wrong user data format"),
        ApiResponse(responseCode = "404", description = "User not found"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    ])
    fun updateUser(@PathVariable id:Long, userData: UserDTO)// = app.updateUser(id, updatedInfo)

    @PostMapping("add")
    @Operation(summary = "Adds a new User given the needed data")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Added user successfully"),
        ApiResponse(responseCode = "400", description = "User already exists or user data is not properly formatted"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    ])
    fun addUser(@RequestBody user:UserDTO): UserDTO

    @DeleteMapping("{id}/remove")
    @Operation(summary = "Deletes the User with the given id")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "User removed successfully"),
        ApiResponse(responseCode = "404", description = "User not found"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    ])
    fun removeUser(@PathVariable id:Long)// = app.removeUser(id)
}