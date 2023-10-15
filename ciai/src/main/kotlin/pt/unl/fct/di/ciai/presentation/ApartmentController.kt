package pt.unl.fct.di.ciai.presentation

import io.swagger.v3.core.util.Json
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import pt.unl.fct.di.ciai.application.App

@RestController
@RequestMapping("/apartments")
class ApartmentController (val app:App) {
    @PostMapping("add")
    fun addApartment(name:String, price:Int) = app.addApartment(name, price)

    @GetMapping("{id}")
    fun getApartment(@PathVariable id:Long) = app.getApartment(id)

    @GetMapping("{id}/history")
    fun getApartmentHistory(@PathVariable id:Long) = app.getApartmentHistory(id)

    @GetMapping("{id}/reservations")
    fun getApartmentReservations(@PathVariable id:Long) = app.getApartmentReservations(id)

    @GetMapping("{id}/reviews")
    fun getApartmentReviews(@PathVariable id:Long) = app.getApartmentReviews(id)

    @GetMapping("{id}/calendar")
    fun getApartmentCalendar(@PathVariable id:Long) = app.getApartmentCalendar(id)

    @PutMapping("{id}/update")
    fun updateApartment(@PathVariable id:Long, @RequestBody updatedInfo:Json) = app.updateApartment(id, updatedInfo)

    @DeleteMapping("{id}")
    fun deleteApartment(@PathVariable id:Long) = app.deleteApartment(id)
}