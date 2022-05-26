package edu.ilp.sisgail.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class PruevaController {

    @GetMapping("/saludo")
    public String saludo() {
        return "hola papa";
    }

    @GetMapping("/we")
    public String identificacion(@RequestParam String datos) {
        return "welcome welcom to the classs" + datos;
    }
}