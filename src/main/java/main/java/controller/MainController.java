package main.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ioannis on 19/4/2018.
 */
@RestController
@RequestMapping(value = "")
public class MainController {

    @RequestMapping(value = "/health", method = RequestMethod.GET, produces = "application/json")
    public int check() {
        return 200;
    }
}
