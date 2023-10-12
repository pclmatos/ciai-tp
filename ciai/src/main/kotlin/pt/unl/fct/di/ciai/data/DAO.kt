package pt.unl.fct.di.ciai.data


import jakarta.persistence.*
import org.apache.catalina.User
import java.util.Date

@Entity
data class UserDAO(
    @Id @GeneratedValue val id:Long,
    @Column(unique = true) val email:String,
    val name: String,
    @OneToMany val ownedApartments: List<ApartmentDAO>
)

data class ManagerDAO(
    @Id @GeneratedValue val id: Long,
    @OneToOne @Column(unique = true) val user: UserDAO
)
data class ClientDAO(
    @Id @GeneratedValue val id: Long,
    @OneToOne @Column(unique = true) val user: UserDAO
)

@Entity
data class ApartmentDAO(
    @Id @GeneratedValue val id:Long,
    val location: String,
    @ManyToOne val owner: UserDAO,
    @OneToMany val periods: List<PeriodDAO>
)

@Entity
data class PeriodDAO(
    @Id val from: Date,
    val to: Date,
    val state: ApartmentState,
)

enum class ApartmentState{
    UNDER_CONSIDERATION,
    BOOKED,
    OCCUPIED,
    AWAITING_REVIEW,
    CLOSED
}