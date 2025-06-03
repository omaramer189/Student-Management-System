package com.studentms.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String grade;

    @ManyToOne
    private User student;
}
