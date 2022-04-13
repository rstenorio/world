/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.control;

import com.company.entity.Country;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author tss
 */
@Named("countrystore")
@RequestScoped
@Transactional(Transactional.TxType.REQUIRED)
public class CountryStore {

    @PersistenceContext
    EntityManager em;

    public List<Country> allPage(int page, int size) {
        return em.createQuery("select e from Country e order by e.Name", Country.class)
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

}
