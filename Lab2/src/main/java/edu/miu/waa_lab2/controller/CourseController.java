package edu.miu.waa_lab2.controller;

import edu.miu.waa_lab2.Service.Interface.ICourseService;
import edu.miu.waa_lab2.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @GetMapping
    public List<Course> getAllCourse() {
        return courseService.getAllCourse();
    }

    @GetMapping("/{id}")
    public Course getById(@PathVariable int id) {
        return courseService.getById(id);
    }

    @PostMapping
    public Course saveCourse( @RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    @PutMapping
    public Course updateCourse(@PathVariable int id, @RequestBody Course course) {
        return courseService.updateCourse(id, course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable int id) {
        courseService.deleteCourse(id);
    }


    @GetMapping("/student/{sid}")
    public List<Course> getAllCourse(@PathVariable int sid) {
        return courseService.getCourseByStudentId(sid);
    }
}

