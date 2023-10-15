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
import pt.unl.fct.di.ciai.application.PersonApp

@RestController
@RequestMapping("/people")
class PersonController(val app:PersonApp) {
    @GetMapping("{id}")
    fun getPerson(@PathVariable id:Long) = app.getPerson(id)

    @GetMapping("{id}/reservations")
    fun getPersonReservations(@PathVariable id:Long) = app.getPersonReservations(id)

    @PutMapping("{id}/update")
    fun updatePerson(@PathVariable id:Long, updatedInfo:Json) = app.updatePerson(id, updatedInfo)

    @PostMapping("add")
    fun addPerson(@RequestBody personInfo:Json) = app.addPerson(personInfo)

    @DeleteMapping("{id}/remove")
    fun removePerson(@PathVariable id:Long) = app.removePerson(id)

}