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
class PersonController(val app:PersonApp):PersonAPI {
    override fun getPerson(id: Long) {
    }

    override fun getPersonReservations(id: Long) {
    }

    override fun updatePerson(id: Long, email: String, username: String, password: String, name: String, phoneNumber: String) {
    }

    override fun addPerson(email: String, username: String, password: String, name: String, phoneNumber: String) {
    }

    override fun removePerson(id: Long) {
    }

}