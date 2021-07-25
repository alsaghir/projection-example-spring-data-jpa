package com.github.alsaghir.projection.repo;

import com.github.alsaghir.projection.entity.Address_;
import com.github.alsaghir.projection.entity.LastNameOnly;
import com.github.alsaghir.projection.entity.Person;
import com.github.alsaghir.projection.entity.Person_;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class PersonRepositoryImpl implements PersonRepositoryCustom {

    private final EntityManager em;

    public PersonRepositoryImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<LastNameOnly> findCustom() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<LastNameOnly> cq = cb.createQuery(LastNameOnly.class);
        Root<Person> root = cq.from(Person.class);
        cq.multiselect(root.get(Person_.lastName), root.get(Person_.address).get(Address_.STREET));
        List<LastNameOnly> result = em.createQuery(cq).getResultList();
        return result;
    }
}
