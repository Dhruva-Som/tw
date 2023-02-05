package lumous.learning.aspiration.tw.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class User : BaseRequestController() {

    @GetMapping("/test")
    fun getUser():String {
    return "Connected Successfully"
    }
}