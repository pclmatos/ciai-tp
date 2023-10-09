package pt.unl.fct.di.ciai.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pt.unl.fct.di.ciai.application.App

@RestController
@RequestMapping("/api")
class AppController (val app:App) {

    @GetMapping("hello")
    fun hello() = app.hello()

}