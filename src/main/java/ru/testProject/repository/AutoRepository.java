package ru.testProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.testProject.model.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Integer> {
}
