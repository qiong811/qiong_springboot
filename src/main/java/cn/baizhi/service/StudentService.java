package cn.baizhi.service;

import cn.baizhi.entity.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);
    List<Student> selectAll();
}
