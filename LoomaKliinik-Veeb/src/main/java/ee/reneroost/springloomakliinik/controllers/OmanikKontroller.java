package ee.reneroost.springloomakliinik.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/omanikud")
@Controller
public class OmanikKontroller {

    @RequestMapping({"", "/indeks", "/indeks.html"})
    public String listOmanik() {

        return "omanikud/indeks";
    }
}
