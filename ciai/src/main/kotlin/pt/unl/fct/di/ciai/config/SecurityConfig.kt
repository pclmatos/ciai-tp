package pt.unl.fct.di.ciai.config
/*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.invoke
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.security.provisioning.UserDetailsManager
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.config.web.server.invoke
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Service
import pt.unl.fct.di.ciai.service.UserService


// check: https://docs.spring.io/spring-security/reference/servlet/getting-started.html

@EnableWebSecurity
@Configuration
class SecurityConfig {

    @Bean
    @Throws(Exception::class)
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http.invoke {
            authorizeHttpRequests {
                authorize("/api/books", permitAll)
                authorize("/swagger-ui/index.html#", permitAll)
                authorize(anyRequest, authenticated)
            }
            formLogin {  }
        }
        return http.build()
    }

    //@Bean
//    fun userDetailsService(): UserDetailsService {
//        val userDetails = User.withDefaultPasswordEncoder()
//            .username("user")
//            .password("password")
//            .roles("USER")
//            .build()
//        return InMemoryUserDetailsManager(userDetails)
//    }
}


@Service
class MyUserDetailsService(val users: UserService) : UserDetailsService {
    override fun loadUserByUsername(username: String?): UserDetails? =
        users.findUserByUsername(username).map {
            User.withDefaultPasswordEncoder()
                .username(it.username)
                .password(it.password)
                .roles(it.roles)
                .build()
        }.orElse(null)
}*/