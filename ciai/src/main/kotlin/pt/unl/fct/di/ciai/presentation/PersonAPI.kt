package pt.unl.fct.di.ciai.presentation

import io.swagger.v3.core.util.Json
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.*

@RequestMapping("/people")
interface PersonAPI {
    @Operation(summary = "Retrieves person with the given id")
    @GetMapping("{id}")
    fun getPerson(@PathVariable id:Long)// = app.getPerson(id)

    @Operation(summary = "Retrieves the reservations of the person with the given id")
    @GetMapping("{id}/reservations")
    fun getPersonReservations(@PathVariable id:Long)// = app.getPersonReservations(id)

    @Operation(summary = "Updates the person with the given id")
    @PutMapping("{id}/update")
    fun updatePerson(@PathVariable id:Long, email: String, username: String, password: String, name: String, phoneNumber: String)// = app.updatePerson(id, updatedInfo)

    @Operation(summary = "Adds a new person given the needed data")
    @PostMapping("add")
    fun addPerson(email: String, username: String, password: String, name: String, phoneNumber: String)// = app.addPerson(personInfo)

    @Operation(summary = "Deletes the person with the given id")
    @DeleteMapping("{id}/remove")
    fun removePerson(@PathVariable id:Long)// = app.removePerson(id)
}