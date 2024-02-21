package az.edu.ada.wm2.firstspringapp.controller;

import az.edu.ada.wm2.firstspringapp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private Person defaultPerson;

    @GetMapping()
    public String listPersons(Model model) {
        System.out.println(defaultPerson);
        model.addAttribute("persons", List.of(new Person("Abdullah", "Bayramov"),
                new Person("Mammad", "Mammadov")));
        return "person_list";
    }
}
