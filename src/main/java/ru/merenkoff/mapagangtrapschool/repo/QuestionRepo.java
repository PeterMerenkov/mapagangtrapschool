package ru.merenkoff.mapagangtrapschool.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.merenkoff.mapagangtrapschool.domain.Question;

public interface QuestionRepo extends JpaRepository<Question, Long> {
}
