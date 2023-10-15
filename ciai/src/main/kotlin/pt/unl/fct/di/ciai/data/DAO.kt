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
    @OneToOne @Column(unique = true) val user: UserDAO
)

@Entity
data class ClientDAO(
    @Id @GeneratedValue val id: Long,
    @OneToOne @Column(unique = true) val user: UserDAO
)

@Entity
data class OwnerDAO(
        @Id @GeneratedValue val id: Long,
        @OneToOne @Column(unique = true) val user: UserDAO,
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
    @OneToMany(cascade = [CascadeType.ALL]) val periods: List<PeriodDAO>,
    @OneToMany(cascade = [CascadeType.ALL]) val reviews: List<ReviewDAO>,
    @OneToMany val reservations: List<ReservationDAO>
)

@Entity
data class PeriodDAO(
    @Id val from: Date,
    val to: Date,
    val state: ApartmentState
)

@Entity
data class ReservationDAO(
    @Id @GeneratedValue val id: Long,
    val from: Date,
    val to: Date,
    @ManyToOne val apartment: ApartmentDAO
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
    val byte: ByteArray
)
enum class ApartmentState{
    UNDER_CONSIDERATION,
    BOOKED,
    OCCUPIED,
    AWAITING_REVIEW,
    CLOSED
}