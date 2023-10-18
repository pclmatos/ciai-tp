package pt.unl.fct.di.ciai.service
import io.swagger.v3.core.util.Json
import org.springframework.stereotype.Service
import pt.unl.fct.di.ciai.data.ApartmentDAO
import pt.unl.fct.di.ciai.data.ApartmentRepository
import pt.unl.fct.di.ciai.presentation.ApartmentDTO

@Service
class ApartmentService(val apartments: ApartmentRepository) {
    fun addApartment(name:String, description: String, amenities: String, location: String, pricePerNight:Int) {
        //add apartment to DB
    }

    fun getApartment(id:Long) {
        //get apartment by id
    }

    fun getApartmentHistory(id:Long) {
        //get apartment history by id
    }

    fun getApartmentReservations(id:Long) {
        //get apartment reservations by id
    }

    fun getApartmentReviews(id:Long) {
        //get apartment reviews by id
    }

    fun getApartmentCalendar(id:Long) {
        //get apartment calendar by id
    }

    fun updateApartment(data: ApartmentDTO) {
        //update apartment info by id to updated info
    }

    fun deleteApartment(id:Long) {
        //remove apartment
    }
}