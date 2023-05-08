package ru.merenkoff.mapagangtrapschool.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.merenkoff.mapagangtrapschool.domain.Answer;

public interface AnswerRepo extends JpaRepository<Answer, Long> {
}
