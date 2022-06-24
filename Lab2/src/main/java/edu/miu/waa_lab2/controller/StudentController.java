package edu.miu.waa_lab2.controller;

import edu.miu.waa_lab2.Service.Interface.IStudentService;
import edu.miu.waa_lab2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping
    public List<Student> getAllCategory() {
        return studentService.getAllStudent();
    }

    @GetMapping("/{id}")
    public Student getCategoryById(@PathVariable int id) {
        return studentService.getById(id);
    }

    @PostMapping
    public Student createCategory( @RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping
    public Student updateCategory(@PathVariable int id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deletecategoryById(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

}
