package ru.merenkoff.mapagangtrapschool.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.merenkoff.mapagangtrapschool.domain.Discipline;

public interface DisciplineRepo extends JpaRepository<Discipline, Long> {
}
