package ru.testProject.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "person", schema = "public")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fio;

    @OneToMany(mappedBy = "person", cascade = CascadeType.PERSIST)
    private List<History> historyList;
}
