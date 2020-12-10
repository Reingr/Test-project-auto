package ru.testProject.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "history", schema = "public")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="auto_id", referencedColumnName = "id")
    private Auto auto;
    @ManyToOne
    @JoinColumn(name="point_rent_id", referencedColumnName = "id")
    private Point pointRent;
    @ManyToOne
    @JoinColumn(name="point_return_id", referencedColumnName = "id")
    private Point pointReturn;
    @ManyToOne
    @JoinColumn(name="person_id", referencedColumnName = "id")
    private Person person;
    private LocalDateTime dateRent;
    private LocalDateTime dateReturn;
}
