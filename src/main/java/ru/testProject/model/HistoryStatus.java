package ru.testProject.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "history_status", schema = "public")
public class HistoryStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String value;

    @OneToMany(mappedBy = "status", cascade = CascadeType.PERSIST)
    private List<History> historyList;
}
