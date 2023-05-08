package ru.merenkoff.mapagangtrapschool.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Answer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String text;
}
