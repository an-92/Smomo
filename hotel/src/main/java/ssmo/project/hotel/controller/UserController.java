package ssmo.project.hotel.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
@Slf4j
@Controller
public class UserController {

    @GetMapping("/hotel")
    @ApiOperation(value = "hotel")
    public String hotel(@RequestParam(required = true) String hotelString) {
        return hotelString;
    }
}
