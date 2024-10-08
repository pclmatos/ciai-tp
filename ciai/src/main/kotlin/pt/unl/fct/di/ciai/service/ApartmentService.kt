package pt.unl.fct.di.ciai.service
import io.swagger.v3.core.util.Json
import org.springframework.stereotype.Service
import pt.unl.fct.di.ciai.data.ApartmentDAO
import pt.unl.fct.di.ciai.data.ApartmentRepository
import pt.unl.fct.di.ciai.presentation.ApartmentDTO
import pt.unl.fct.di.ciai.presentation.LocationInApartment

@Service
class ApartmentService(val apartments: ApartmentRepository) {
    fun addApartment(data: ApartmentDTO): ApartmentDTO {
        //add apartment to DB
        return ApartmentDTO(0,"","","",0, LocationInApartment(""))
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