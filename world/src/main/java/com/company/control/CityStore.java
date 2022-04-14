/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.control;

import com.company.entity.City;
import java.util.List;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Named("citystore")
@RequestScoped
@Transactional(Transactional.TxType.REQUIRED)
public class CityStore {

    @PersistenceContext
    EntityManager em;

    public List<City> allPage(int page, int size) {
        return em.createQuery("select e from City e", City.class)
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public List<City> all() {
        return em.createQuery("select e from City e", City.class)
                .getResultList();
    }

    public Optional<City> find(Long id) {
        City found = em.find(City.class, id);
        return found == null ? Optional.empty() : Optional.of(found);
    }

    public Optional<City> findByName(String name) {
        try {
            return Optional.of(em.createQuery("select e from City e where e.Name = :name", City.class)
                    .setParameter("name", name)
                    .getSingleResult());
        } catch (NoResultException ex) {
            return Optional.empty();
        }
    }

    public City save(City entity) {
        return em.merge(entity);
    }

}
