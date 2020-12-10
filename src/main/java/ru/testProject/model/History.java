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
    @JoinColumn(name="status_id", referencedColumnName = "id")
    private HistoryStatus status;
    @ManyToOne
    @JoinColumn(name="auto_id", referencedColumnName = "id")
    private Auto auto;
    @ManyToOne
    @JoinColumn(name="point_id", referencedColumnName = "id")
    private Point point;
    @ManyToOne
    @JoinColumn(name="person_id", referencedColumnName = "id")
    private Person person;
    private LocalDateTime date;
}
