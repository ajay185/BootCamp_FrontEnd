package com.example.backend.repository;

import com.example.backend.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public static ArrayList<Student> data = new ArrayList<>();
    public static int counter = 0;
    public List<Student> getAllStudent(){
        if(counter == 0) {
            Student s1 = new Student();
            s1.setDepartment("CloudEngineering");
            s1.setFirstName("Ajay");
            s1.setLastName("Singh");
            Student s2 = new Student();
            s2.setDepartment("CloudEngineering");
            s2.setFirstName("Rom");
            s2.setLastName("Solanki");
            data.add(s1);
            data.add(s2);
            counter ++;
        }
        return data;
    }

    public String saveStudent(Student s1){
       data.add(s1);
       return "SUCCESS";
    }
}
