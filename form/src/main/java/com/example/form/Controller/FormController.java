package com.example.form.Controller;

import com.example.form.Model.Volunteer;
import com.example.form.Service.FormService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    private final FormService service;

    protected FormController(FormService service)
    {
        this.service = service;
    }

    @GetMapping("/signup")
    protected String showForm(Model model)
    {
        model.addAttribute("volunteer", new Volunteer());
        return "signup";
    }

    @PostMapping("/volunteers")
    public String submitForm(Volunteer volunteer)
    {
        service.saveVolunteer(volunteer);
        return "success";
    }

//    @GetMapping("/volunteers-list")



}
