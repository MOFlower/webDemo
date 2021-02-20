package com.web.study.entity;

import lombok.Data;

@Data
public class Course {
    private Integer id;
    private String courseName;
    private String instructor;
    private double tuition;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", tuition=" + tuition +
                '}';
    }
}
