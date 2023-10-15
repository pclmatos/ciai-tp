package pt.unl.fct.di.ciai.application

import io.swagger.v3.core.util.Json
import org.springframework.stereotype.Service
import pt.unl.fct.di.ciai.service.PersonService

@Service
class PersonApp(val people: PersonService) {

    fun getPerson(id:Long) = people.getPerson(id)

    fun getPersonReservations(id:Long) = people.getPersonReservations(id)

    fun updatePerson(id:Long, updatedInfo:Json) = people.updatePerson(id, updatedInfo)

    fun addPerson(personInfo:Json) = people.addPerson(personInfo)

    fun removePerson(id:Long) = people.removePerson(id)
}