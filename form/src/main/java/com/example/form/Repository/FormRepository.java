package com.example.form.Repository;

import com.example.form.Model.Volunteer;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Repository
public class FormRepository {
    private static final String fileName = "volunteers.txt";

    public void writeToFile(Volunteer volunteer)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true)))
        {
            writer.write(volunteer.toString());
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException("Could not write volunteer to file",e);
        }
    }
}
