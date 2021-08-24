package cn.baizhi.test;

import cn.baizhi.entity.Student;
import cn.baizhi.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class Test1 extends BaseTest{
    @Autowired
    private StudentService ss;
    @Test
    public void findAll(){
        List<Student> students = ss.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void save(){
        ss.save(new Student(null, "jj", 20, new Date(), 13000.0));
    }

}
