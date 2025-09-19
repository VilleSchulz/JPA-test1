package org.example;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TimeSpent> timeSpentList = new ArrayList<>();

    public Student(String name, String email){
        this.name = name;
        this.email = email;
    }

    public Student() {}

    public void addTimeSpent(TimeSpent timeSpent){
        timeSpentList.add(timeSpent);
        timeSpent.setStudent(this); // tärkeä, jotta bi-directional toimii
    }
}
