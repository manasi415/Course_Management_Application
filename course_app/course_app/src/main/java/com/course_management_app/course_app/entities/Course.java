package com.course_management_app.course_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString

public class Course {
    @Id
    private long id;
    private String title;
    private String description;
}
