package com.msschool.dmv.repositories;

import com.msschool.dmv.models.License;
import com.msschool.dmv.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LicenseRepo extends CrudRepository<License, Long> {
    @Override
    Optional<License> findById(Long id);

    List<License> findAll();
//    License creator(Person person);

//    List<License> findByCreator(Person person);
}
