package com.course_management_app.course_app.services;

import com.course_management_app.course_app.dao.CourseDao;
import com.course_management_app.course_app.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDao courseDao;
    @Override
    public List<Course> getCourses() {
        return courseDao.findAll() ;
    }

    @Override
    public Course getCourse(long id) {
        Optional<Course> byId = courseDao.findById(id);
        if(byId.isPresent())
        {
            return byId.get();
        }
        else
            return null;
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
       Course course = courseDao.findById(courseId).get();
       courseDao.delete(course);
    }
}
