package ru.neutrino.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neutrino.domain.People;

public interface SpringDataConfig extends JpaRepository<People, Long> {
}
