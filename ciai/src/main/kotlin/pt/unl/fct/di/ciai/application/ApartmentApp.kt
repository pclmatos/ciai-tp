package pt.unl.fct.di.ciai.application

import io.swagger.v3.core.util.Json
import org.springframework.stereotype.Service
import pt.unl.fct.di.ciai.service.ApartmentService

@Service
class ApartmentApp(val apartments:ApartmentService) {

    fun hello() = "Hello World"

    fun print(word:String): String{
        return word
    }

    //Should we create an apartmentApp?

    fun addApartment(name:String, price:Int) = apartments.addApartment(name, price)

    fun getApartment(id:Long) = apartments.getApartment(id)

    fun getApartmentHistory(id:Long) = apartments.getApartmentHistory(id)

    fun getApartmentReservations(id:Long) = apartments.getApartmentReservations(id)

    fun getApartmentReviews(id:Long) = apartments.getApartmentReviews(id)

    fun getApartmentCalendar(id:Long) = apartments.getApartmentCalendar(id)

    fun updateApartment(id:Long, updatedInfo:Json) = apartments.updateApartment(id, updatedInfo)

    fun deleteApartment(id:Long) = apartments.deleteApartment(id)


}