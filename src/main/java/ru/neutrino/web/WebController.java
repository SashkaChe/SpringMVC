package ru.neutrino.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.neutrino.domain.People;
import ru.neutrino.service.PeopleService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class WebController {

    @Autowired
    PeopleService peopleservice;

    @GetMapping("/")
    public String hello(Model model) {

        model.addAttribute("people", peopleservice.findAll());

        return "index";
    }
}
