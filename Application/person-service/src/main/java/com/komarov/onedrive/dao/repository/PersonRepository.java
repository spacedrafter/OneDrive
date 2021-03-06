package com.komarov.onedrive.dao.repository;

import com.komarov.onedrive.dao.entity.Person;
import com.komarov.onedrive.dao.entity.Role;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

  Person findPersonByEmail(String email);

  List<Person> findPeopleByRole(Role role);

  @Query("select p from Person p where p.date >= :early and p.date <= :later ")
  List<Person> findPeopleByDateBetweenEarlyAndLater(Date early, Date later);
}
