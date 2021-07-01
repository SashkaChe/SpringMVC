package ru.neutrino.domain;

import lombok.*;
import javax.validation.constraints.*;

import javax.persistence.*;

@Entity
@Table(name="People")
@Setter
@Getter
public class People {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    @NotEmpty(message = "Заполните поле")
    @Size(min = 2, max = 15, message = "Минимум 2 символа, но не более 15")
    private String name;

    @Column(name="phone")
    @NotEmpty(message = "Заполните поле")
    @Size(min = 10, max = 11, message = "Номер должен быть длинною 10 цифр")
    @Min(value = 0, message = "Только числа")
    private int phone;



}
