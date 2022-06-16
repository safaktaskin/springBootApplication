package com.billpost.billpost.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * BaseRepository
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

public class BaseRepository<T> {

    public Class<T> t;

    @Autowired
    EntityManager entityManager;

    public BaseRepository(Class<T> t) {
        this.t = t;
    }

    public List<T> findAll() {
        CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = builder.createQuery(t);
        Root<T> root = cq.from(t);
        cq.select(root);
        return this.entityManager.createQuery(cq).getResultList();
    }

//    public void add(Class<T> t){
//        CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
//        CriteriaQuery<T> cq = builder.createQuery(t);
//        Root<T> root = cq.from(t);
//        Predicate[] predicates = new Predicate[] ;
//        cq.where(predicates)
//    }

}
