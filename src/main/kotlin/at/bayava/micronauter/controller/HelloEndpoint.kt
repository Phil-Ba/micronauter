package at.bayava.micronauter.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

/**
 *
 */
@Controller("/hello")
class HelloEndpoint{

    @Get("/")
    fun hello():String{
        return "Hello World!"
    }

}