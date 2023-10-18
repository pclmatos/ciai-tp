package pt.unl.fct.di.ciai.presentation

import io.swagger.v3.core.util.Json
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@Schema(name="Apartment")
data class ApartmentDTO(val id: Long, val name:String, val description: String, val amenities: String,val location: String, val pricePerNight:Int)

@RequestMapping("/apartments")
@Tag(name = "Apartments", description = "Apartments API")
interface ApartmentAPI {

    @PostMapping("add")
    @Operation(summary = "Adds a new apartment given needed data")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Apartment added successfully"),
        ApiResponse(responseCode = "400", description = "Invalid apartment information"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    ])
    fun addApartment(dto: ApartmentDTO) //= apartmentApp.addApartment(name, price)


    @GetMapping("")
    @Operation(summary = "Retrieves all apartments")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Success"),
        ApiResponse(responseCode = "404", description = "No apartments found"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    ])
    fun getAllApartment(): List<ApartmentDTO>

    @GetMapping("{id}")
    @Operation(summary = "Retrieves the apartment with the given id")
    fun getApartment(@PathVariable id:Long) //= apartmentApp.getApartment(id)

    @GetMapping("{id}/history")
    @Operation(summary = "Retrieves the history of reservations of the apartment with the given id")
    fun getApartmentHistory(@PathVariable id:Long) //= apartmentApp.getApartmentHistory(id)

    @GetMapping("{id}/reservations")
    @Operation(summary = "Retrieves the reservations of the apartment with the given id")
    fun getApartmentReservations(@PathVariable id:Long) //= apartmentApp.getApartmentReservations(id)

    @GetMapping("{id}/reviews")
    @Operation(summary = "Retrieves the reviews of the apartment with the given id")
    fun getApartmentReviews(@PathVariable id:Long) //= apartmentApp.getApartmentReviews(id)

    @GetMapping("{id}/calendar")
    @Operation(summary = "Retrieves the calendar of the apartment with the given id")
    fun getApartmentCalendar(@PathVariable id:Long) //= apartmentApp.getApartmentCalendar(id)

    @PutMapping("{id}/update")
    @Operation(summary = "Updates an apartment")
    fun updateApartment(@PathVariable id:Long, dto: ApartmentDTO) //= apartmentApp.updateApartment(id, updatedInfo)

    @DeleteMapping("{id}")
    @Operation(summary = "Deletes the apartment with the given id")
    fun deleteApartment(@PathVariable id:Long) //= apartmentApp.deleteApartment(id)
}