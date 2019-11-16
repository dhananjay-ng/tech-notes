package com.pluralsight.persistence.module04.demo01;

import com.pluralsight.persistence.module04.CD;

import javax.persistence.EntityManager;

public class MySer {
    public void persist(EntityManager entityManager , CD cd) {
        entityManager.persist(cd);
    }
}
