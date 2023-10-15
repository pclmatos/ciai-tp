package pt.unl.fct.di.ciai.service

import io.swagger.v3.core.util.Json
import org.springframework.stereotype.Service

@Service
class PersonService {
    fun getPerson(id:Long) {
        //get person by id
    }

    fun getPersonReservations(id:Long) {
        //get person reservations by id
    }

    fun updatePerson(id:Long, updatedInfo:Json) {
        //update person information by id
    }

    fun addPerson(personInfo:Json) {
        //add person to DB with personInfo
    }

    fun removePerson(id:Long) {
        //remove person by id
    }
}