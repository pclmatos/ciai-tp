package pt.unl.fct.di.ciai.presentation

import io.swagger.v3.core.util.Json
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.*


@RequestMapping("/apartments")
interface ApartmentAPI {

    @Operation(summary = "Adds a new apartment given needed data")
    @PostMapping("add")
    fun addApartment(name:String, description: String, amenities: String, location: String, pricePerNight:Int) //= apartmentApp.addApartment(name, price)

    @Operation(summary = "Retrieves the apartment with the given id")
    @GetMapping("{id}")
    fun getApartment(@PathVariable id:Long) //= apartmentApp.getApartment(id)

    @Operation(summary = "Retrieves the history of reservations of the apartment with the given id")
    @GetMapping("{id}/history")
    fun getApartmentHistory(@PathVariable id:Long) //= apartmentApp.getApartmentHistory(id)

    @Operation(summary = "Retrieves the reservations of the apartment with the given id")
    @GetMapping("{id}/reservations")
    fun getApartmentReservations(@PathVariable id:Long) //= apartmentApp.getApartmentReservations(id)

    @Operation(summary = "Retrieves the reviews of the apartment with the given id")
    @GetMapping("{id}/reviews")
    fun getApartmentReviews(@PathVariable id:Long) //= apartmentApp.getApartmentReviews(id)

    @Operation(summary = "Retrieves the calendar of the apartment with the given id")
    @GetMapping("{id}/calendar")
    fun getApartmentCalendar(@PathVariable id:Long) //= apartmentApp.getApartmentCalendar(id)

    @Operation(summary = "Updates an apartment")
    @PutMapping("{id}/update")
    fun updateApartment(@PathVariable id:Long, name:String, description: String, amenities: String, location: String, pricePerNight:Int) //= apartmentApp.updateApartment(id, updatedInfo)

    @Operation(summary = "Deletes the apartment with the given id")
    @DeleteMapping("{id}")
    fun deleteApartment(@PathVariable id:Long) //= apartmentApp.deleteApartment(id)
}