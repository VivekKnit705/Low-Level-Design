package com.example.low_level_design.BuilderDesingPattern.models;

import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects(){
        List<String> subjects= List.of("Statics", "commerse");
        this.setSubject(subjects);
        return this;
    }
}
