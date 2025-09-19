package org.example;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TimeSpent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int homeWorkHours;
    private int inClassHours;
    private int theoryHours;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    public TimeSpent() {}

    public TimeSpent(int homeWorkHours, int inClassHours, int theoryHours) {
        this.homeWorkHours = homeWorkHours;
        this.inClassHours = inClassHours;
        this.theoryHours = theoryHours;
    }
}
