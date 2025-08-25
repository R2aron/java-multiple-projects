package com.example.form.Service;

import com.example.form.Model.Volunteer;
import com.example.form.Repository.FormRepository;
import org.springframework.stereotype.Service;

@Service
public class FormService {

    private final FormRepository repository;

    public FormService(FormRepository repository)
    {
        this.repository = repository;
    }

    public void saveVolunteer(Volunteer volunteer)
    {
        repository.writeToFile(volunteer);
    }
}
