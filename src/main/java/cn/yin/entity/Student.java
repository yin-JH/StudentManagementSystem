package cn.yin.entity;

import java.util.Date;

public class Student {
    private Long id;
    private String stuId;
    private String name;
    private String gender;
    private Integer age;
    private Date admissionDate;
    private Date graduationDate;
    private String dept;
    private String major;
    private String education;

    public Student() {
    }

    public Student(Long id, String stuId, String name, String gender, Integer age, Date admissionDate, Date graduationDate, String dept, String major, String education) {
        this.id = id;
        this.stuId = stuId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.admissionDate = admissionDate;
        this.graduationDate = graduationDate;
        this.dept = dept;
        this.major = major;
        this.education = education;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
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

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuId='" + stuId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", admissionDate=" + admissionDate +
                ", graduationDate=" + graduationDate +
                ", dept='" + dept + '\'' +
                ", major='" + major + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
