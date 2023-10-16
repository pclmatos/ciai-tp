package pt.unl.fct.di.ciai.application

import io.swagger.v3.core.util.Json
import org.springframework.stereotype.Service
import pt.unl.fct.di.ciai.service.PersonService

@Service
class PersonApp(val people: PersonService) {

    fun getPerson(id:Long) = people.getPerson(id)

    fun getPersonReservations(id:Long) = people.getPersonReservations(id)

    fun updatePerson(id:Long, email: String, username: String, password: String, name: String, phoneNumber: String) = people.updatePerson(id, email, username, password, name, phoneNumber)

    fun addPerson(email: String, username: String, password: String, name: String, phoneNumber: String) = people.addPerson(email, username, password, name, phoneNumber)

    fun removePerson(id:Long) = people.removePerson(id)
}