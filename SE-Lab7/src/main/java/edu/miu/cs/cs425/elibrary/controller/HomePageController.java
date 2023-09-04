package edu.miu.cs.cs425.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: BETELHEM GEBREHAWARYAT GEBRESILASSE
 * Date: 9/03/2023
 */
@Controller
public class HomePageController {

    @GetMapping(value = {"/", "/elibrary", "/elibrary/home"})
    public String displayHomePage() {
        return "home/index";
    }
}
