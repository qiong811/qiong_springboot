package cn.baizhi.controller;

import cn.baizhi.entity.Student;
import cn.baizhi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("stu")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("save")
    public String save(Student student){
        System.out.println(student);
        studentService.save(student);
        return "redirect:/stu/findAll";
    }
    @RequestMapping("findAll")
    public String findAll(HttpServletRequest request){
        List<Student> students = studentService.selectAll();
        request.setAttribute("list", students);
        return "findAll";
    }
}
