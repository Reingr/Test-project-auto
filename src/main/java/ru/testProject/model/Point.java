package ru.testProject.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "point", schema = "public")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String address;

    @OneToMany(mappedBy = "point", cascade = CascadeType.PERSIST)
    private List<AutoPosition> autoPositionList;

    @OneToMany(mappedBy = "pointRent", cascade = CascadeType.PERSIST)
    private List<History> historyListRent;

    @OneToMany(mappedBy = "pointReturn", cascade = CascadeType.PERSIST)
    private List<History> historyListReturn;
}
