package ru.merenkoff.mapagangtrapschool.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.merenkoff.mapagangtrapschool.domain.Exam;

public interface ExamRepo extends JpaRepository<Exam, Long> {
}
