package cn.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private String id;
    private String name;
    private Integer age;
    private Date bir;
    private Double salary;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bir=" + bir +
                ", salary=" + salary +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Student(String id, String name, Integer age, Date bir, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bir = bir;
        this.salary = salary;
    }

    public Student() {
    }
}
