package ru.merenkoff.mapagangtrapschool.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class QuestionRightAnswerConnection {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @OneToOne
    private Question question;
    @OneToOne
    private Answer answer;
}
