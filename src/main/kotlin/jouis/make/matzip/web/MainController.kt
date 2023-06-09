package jouis.make.matzip.web

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class MainController {
    @GetMapping("/")
    fun index(): String {
        return "hello"
    }

    @GetMapping("/kakao/map")
    fun map(): String {
        return "kakaoMap"
    }

    @GetMapping("/kakao/search")
    fun search(): String {
        return "kakaoSearchMap"
    }
}
