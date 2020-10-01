package ee.reneroost.springloomakliinik.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VeterinaarKontroller {

    @RequestMapping({"/veterinaarid", "/veterinaarid/indeks", "/veterinaarid/indeks.html"})
    public String listVeterinaarid() {

        return "veterinaarid/indeks";
    }
}
