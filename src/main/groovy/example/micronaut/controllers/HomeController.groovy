package example.micronaut.controllers

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.Secured
import io.micronaut.security.rules.SecurityRule
import io.micronaut.views.View

import javax.annotation.Nullable
import java.security.Principal

@Secured(SecurityRule.IS_AUTHENTICATED)
@Controller("/") // <2>
class HomeController {

    @Get("/") // <3>
    @View("home") // <4>
    Map<String, Object>  index() { // <5>
        [:]
    }
}
