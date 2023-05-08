package ru.merenkoff.mapagangtrapschool.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.merenkoff.mapagangtrapschool.domain.QuestionRightAnswerConnection;

public interface QuestionRightAnswerConnectionRepo extends JpaRepository<QuestionRightAnswerConnection, Long> {
}
