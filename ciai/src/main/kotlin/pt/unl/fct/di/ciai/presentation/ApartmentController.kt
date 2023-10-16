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
    override fun addApartment(name:String, description: String, amenities: String, location: String, pricePerNight:Int) {
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

    override fun updateApartment(id: Long, name:String, description: String, amenities: String, location: String, pricePerNight:Int) {
    }

    override fun deleteApartment(id: Long) {
    }

}