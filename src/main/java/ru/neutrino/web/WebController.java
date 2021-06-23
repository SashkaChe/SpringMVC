package ru.neutrino.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.neutrino.dao.SpringDataConfig;
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

    @GetMapping("/{id}")
    public String user(@PathVariable("id") long id, Model model) {

        People obj = peopleservice.findById(id);

        if (obj == null) {
            return "empty";
        }

        model.addAttribute("single", obj);
        return "users";
    }

    @GetMapping("/new")
    public String newuser(Model model) {
        model.addAttribute("newpeople", new People());
        return "adduser";
    }



    @PostMapping()
    public String save(@ModelAttribute("newpeople") People people, Model model) {

    people = peopleservice.saveAndFlush(people);

    model.addAttribute("single", people);

    return "newuser";

    }
}



