package ru.testProject.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "auto", schema = "public")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    @ManyToOne
    @JoinColumn(name="brand_id", referencedColumnName = "id")
    private Brand brand;

    @OneToOne(mappedBy = "auto")
    private AutoPosition autoPosition;

    @OneToMany(mappedBy = "auto", cascade = CascadeType.PERSIST)
    private List<History> historyList;
}
