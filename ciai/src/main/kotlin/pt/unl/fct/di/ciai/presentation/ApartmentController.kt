package pt.unl.fct.di.ciai.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import pt.unl.fct.di.ciai.application.App

@RestController
@RequestMapping("/apartment")
class ApartmentController (val app:App) {

    @GetMapping("all")
    fun hello() = app.hello()

    @PostMapping("test")
    fun print(@RequestParam word:String) = app.print(word)

}