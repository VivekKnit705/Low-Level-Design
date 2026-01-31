package com.example.low_level_design.BuilderDesingPattern.models;

import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects(){
        List<String> subjects= List.of("Math", "Python", "JAVA", "Physics");
        this.setSubject(subjects);
        return this;
    }
}
