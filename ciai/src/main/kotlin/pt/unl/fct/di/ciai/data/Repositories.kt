package pt.unl.fct.di.ciai.data

import org.springframework.data.repository.CrudRepository

interface  ApartmentRepository: CrudRepository<ApartmentDAO, Long>

interface UserRepository : CrudRepository<UserDAO, Long>

