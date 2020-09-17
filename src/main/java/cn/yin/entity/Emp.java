package cn.yin.entity;

import java.util.Date;

public class Emp {
    private Long id;
    private String empId;
    private String name;
    private String gender;
    private Integer age;
    private Date hireDate;
    private Double sal;
    private String jobName;
    private String title;
    private String education;
    private String graduatedSchool;
    private String dept;

    public Emp() {
    }

    public Emp(Long id, String empId, String name, String gender, Integer age, Date hireDate, Double sal, String jobName, String title, String education, String graduatedSchool, String dept) {
        this.id = id;
        this.empId = empId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hireDate = hireDate;
        this.sal = sal;
        this.jobName = jobName;
        this.title = title;
        this.education = education;
        this.graduatedSchool = graduatedSchool;
        this.dept = dept;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGraduatedSchool() {
        return graduatedSchool;
    }

    public void setGraduatedSchool(String graduatedSchool) {
        this.graduatedSchool = graduatedSchool;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hireDate=" + hireDate +
                ", sal=" + sal +
                ", jobName='" + jobName + '\'' +
                ", title='" + title + '\'' +
                ", education='" + education + '\'' +
                ", graduatedSchool='" + graduatedSchool + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
