package ru.neutrino.domain;

import lombok.*;

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
    private String name;

    @Column(name="phone")
    private int phone;



}
