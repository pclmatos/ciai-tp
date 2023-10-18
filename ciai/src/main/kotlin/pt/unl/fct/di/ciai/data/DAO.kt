package pt.unl.fct.di.ciai.data

import jakarta.persistence.*
import jakarta.persistence.CascadeType
import java.util.Date

@Entity
data class UserDAO(
    @Id @GeneratedValue val id:Long,
    @Column(unique = true) val email:String,
    @Column(unique = true) val username: String,
    val password: String,
    val name: String,
    val phoneNumber: String,
    @OneToOne(cascade = [CascadeType.ALL]) val picture: Picture
)

@Entity
data class ManagerDAO(
    @Id @GeneratedValue val id: Long,
    @OneToOne val user: UserDAO
)

@Entity
data class ClientDAO(
    @Id @GeneratedValue val id: Long,
    @OneToOne val user: UserDAO,
    @OneToMany val reservations: List<ReservationDAO>
)

@Entity
data class OwnerDAO(
        @Id @GeneratedValue val id: Long,
        @OneToOne val user: UserDAO,
        @OneToMany val ownedApartments: List<ApartmentDAO>
)

@Entity
data class ApartmentDAO(
    @Id @GeneratedValue val id:Long,
    val name: String,
    val description: String,
    val amenities: String,
    val location: String,
    val pricePerNight: Int,
    @OneToMany(cascade = [CascadeType.ALL]) val pictures: List<Picture>,
    @ManyToOne val owner: OwnerDAO,
    @OneToMany(cascade = [CascadeType.ALL]) val reservations: List<ReservationDAO>,
    @OneToMany(cascade = [CascadeType.ALL]) val reviews: List<ReviewDAO>
)

@Entity
data class PeriodDAO(
    @Id @GeneratedValue val id: Long, //consider changing id to initDate
    val initDate: Date,
    val endDate: Date,
    val state: ApartmentState,
    @ManyToOne val apartment: ApartmentDAO,
)

@Entity
data class ReservationDAO(
    @Id @GeneratedValue val id: Long,
    val initDate:Date,
    val endDate: Date,
    val state: ReservationState,
    @ManyToOne val apartment: ApartmentDAO,
    @ManyToOne val client: ClientDAO
)

@Entity
data class ReviewDAO(
    @Id @GeneratedValue val id: Long,
    val description: String,
    val rating: Double,
    @ManyToOne val apartment: ApartmentDAO
)

@Entity
data class Picture(
    @Id @GeneratedValue val id: Long,
    val url: String
)
enum class ApartmentState{
    BOOKED,
    OCCUPIED,
    AWAITING_REVIEW,
    CLOSED
}

enum class ReservationState{
    UNDER_CONSIDERATION,
    ACCEPTED
}