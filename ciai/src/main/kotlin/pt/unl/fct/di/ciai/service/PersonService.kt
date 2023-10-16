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

    fun updatePerson(id:Long, email: String, username: String, password: String, name: String, phoneNumber: String) {
        //update person information by id
    }

    fun addPerson(email: String, username: String, password: String, name: String, phoneNumber: String) {
        //add person to DB with personInfo
    }

    fun removePerson(id:Long) {
        //remove person by id
    }
}