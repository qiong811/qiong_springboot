package cn.baizhi.dao;

import cn.baizhi.entity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student student);
    List<Student> selectAll();
}
