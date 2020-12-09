package ru.testProject.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "auto_position", schema = "public")
public class AutoPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="auto_id", referencedColumnName = "id")
    private Auto auto;
    @ManyToOne
    @JoinColumn(name="point_id", referencedColumnName = "id")
    private Point point;
}
