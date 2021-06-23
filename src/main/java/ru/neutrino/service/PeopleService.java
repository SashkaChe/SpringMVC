package ru.neutrino.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neutrino.dao.SpringDataConfig;
import ru.neutrino.domain.People;

import java.util.List;

@Service
public class PeopleService {

    @Autowired
    private SpringDataConfig peopleDAO;

    public List<People> findAll() {
        List<People> allPeople = peopleDAO.findAll();
        return allPeople;
    }

    public People findById(long id) {
        return peopleDAO.findById(id).orElse(null);
    }

    public People saveAndFlush(People people) {
       return peopleDAO.saveAndFlush(people);
    }

}
