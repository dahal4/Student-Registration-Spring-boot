package com.manish.webApp.service;

import com.manish.webApp.model.Student;
import com.manish.webApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> listAll() {
        return repo.findAll();
    }

    public void save(Student std) {
        repo.save(std);
    }

    public Student get(int id) {
        return repo.findById(id).get();
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

}