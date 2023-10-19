package pt.unl.fct.di.ciai.data

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface  ApartmentRepository: CrudRepository<ApartmentDAO, Long>
interface UserRepository : CrudRepository<UserDAO, Long>{
    fun findByUsername(username: String): UserDAO?

}

interface ReservationRepository: CrudRepository<ReservationDAO,Long>

interface PeriodRepository: CrudRepository<PeriodDAO,Long>

interface PictureRepository: CrudRepository<Picture, Long>