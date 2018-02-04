/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ngarambes.data.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ngarambes.data.model.Asisten;

/**
 *
 * @author ngarambes
 */
public class AsistenDao {
    private SessionFactory sessionFactory;
    private Session session;
    
    public void connect(){
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }
    public void save(Asisten asisten){
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(asisten);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
        session.close();
    }
    public void delete(Asisten asisten){
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(asisten);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
        session.close();
    }
    public List<Asisten> getAsistens(){
        session= sessionFactory.openSession();
        Query query = session.createQuery("from Asisten a");
        List<Asisten> asistens = query.list();
        return asistens;
    }
}
