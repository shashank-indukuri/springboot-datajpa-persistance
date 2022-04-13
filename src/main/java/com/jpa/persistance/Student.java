package com.jpa.persistance;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Data
@Entity(name = "Student")
@Table(
    name = "students",
    uniqueConstraints = {
        @UniqueConstraint(name = "student_email_unique", columnNames = "email")
    }
)
public class Student {
    @Id
    @GeneratedValue
    @Column(
        name = "id"
    )
    private Long id;

    @Column(
        name = "stu_id",
        nullable = false
    )
    private String studentId;

    @Column(
        name = "first_name",
        nullable = false
    )
    private String firstName;

    @Column(
        name = "last_name",
        nullable = false
    )
    private String lastName;

    @Column(
        name = "email",
        nullable = false
    )
    private String email;

    @Column(
        name = "age",
        nullable = false
    )
    private Integer age;

    @Column(
        name = "admitted_date"
    )
    private Date admittedDate;
}
