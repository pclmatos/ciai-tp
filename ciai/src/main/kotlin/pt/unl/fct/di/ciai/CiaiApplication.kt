package pt.unl.fct.di.ciai

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CiaiApplication

fun main(args: Array<String>) {
    runApplication<CiaiApplication>(*args)
}
