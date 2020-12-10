package ru.testProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.testProject.model.Point;

@Repository
public interface PointRepository extends JpaRepository<Point, Integer> {
}
