package ee.reneroost.springloomakliinik.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndeksKontroller {

    @RequestMapping({"", "/", "indeks", "indeks.html"})
    public String indeks() {
        return "indeks";
    }
}
