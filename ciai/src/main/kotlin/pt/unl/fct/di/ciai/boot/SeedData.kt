package pt.unl.fct.di.ciai.boot

import jakarta.transaction.Transactional
import org.springframework.boot.CommandLineRunner
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import pt.unl.fct.di.ciai.data.ApartmentRepository
import pt.unl.fct.di.ciai.data.UserRepository

@Component
@Order(1)
class SeedData(val users: UserRepository, val apartmentsRepository: ApartmentRepository): CommandLineRunner {

    @Transactional
    override fun run(vararg args: String?) {
        TODO("Not yet implemented")
    }
}