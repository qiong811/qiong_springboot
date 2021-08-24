package cn.baizhi.service;

import cn.baizhi.dao.StudentDao;
import cn.baizhi.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public void save(Student student) {
        student.setId(UUID.randomUUID().toString());
        studentDao.save(student);
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }
}
