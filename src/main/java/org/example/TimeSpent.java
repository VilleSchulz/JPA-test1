package org.example;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TimeSpent {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private int homeWOrkHours;
    private int inClassHours;
    private int theoryHours;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Student student;

    public TimeSpent() {
        // empty constructor
    }

    public TimeSpent(int homeWOrkHours, int inClassHours, int theoryHours) {
        this.homeWOrkHours = homeWOrkHours;
        this.inClassHours = inClassHours;
        this.theoryHours = theoryHours;
    }
}
