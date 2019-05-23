package com.msschool.dmv.repositories;

import com.msschool.dmv.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long> {
    @Override
    Optional<Person> findById(Long id);

    List<Person> findAll();
}
