package pt.unl.fct.di.ciai.application

import org.springframework.stereotype.Service

@Service
class App {

    fun hello() = "Hello World"

    fun print(word:String): String{
        return word
    }

}