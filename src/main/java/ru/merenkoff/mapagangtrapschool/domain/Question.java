package ru.merenkoff.mapagangtrapschool.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String text;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Answer> answerList;
}
