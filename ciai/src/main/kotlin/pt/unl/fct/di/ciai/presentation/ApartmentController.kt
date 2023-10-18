package pt.unl.fct.di.ciai.presentation

import io.swagger.v3.core.util.Json
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pt.unl.fct.di.ciai.application.ApartmentApp

@RestController class ApartmentController (val apartmentApp:ApartmentApp): ApartmentAPI {
    override fun addApartment(dto: ApartmentDTO) {
    }

    override fun getAllApartment(): List<ApartmentDTO> {
        return apartmentApp.getAllApartments().map {
            ApartmentDTO(it.id,it.name,it.description,it.amenities,it.location,it.pricePerNight)
        }
    }

    override fun getApartment(id: Long) {
    }

    override fun getApartmentHistory(id: Long) {
    }

    override fun getApartmentReservations(id: Long) {
    }

    override fun getApartmentReviews(id: Long) {
    }

    override fun getApartmentCalendar(id: Long) {
    }

    override fun updateApartment(@PathVariable id: Long, dto: ApartmentDTO) {
    }

    override fun deleteApartment(id: Long) {
    }

}