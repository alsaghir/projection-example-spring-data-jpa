package com.github.alsaghir.projection.repo;

import com.github.alsaghir.projection.entity.FirstNameOnly;
import com.github.alsaghir.projection.entity.LastNameOnly;
import com.github.alsaghir.projection.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>, PersonRepositoryCustom {

    List<FirstNameOnly> queryAllBy();

    @Query("select p.firstName as firstname, a as address from Person p LEFT JOIN p.address a")
    List<FirstNameOnly> getAllBy();

    @Query("select new com.github.alsaghir.projection.entity.LastNameOnly(p.lastName, a.street) from Person p LEFT JOIN p.address a")
    List<LastNameOnly> findAllBy();

    List<LastNameOnly> findCustom();

}
