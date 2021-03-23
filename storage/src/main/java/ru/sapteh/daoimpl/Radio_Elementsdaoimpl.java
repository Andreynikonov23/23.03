package ru.sapteh.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.sapteh.Dao.Dao;
import ru.sapteh.model.Radio_Elements;

import java.util.List;

public class Radio_Elementsdaoimpl implements Dao<Radio_Elements, Integer> {
    private SessionFactory factory;

    public Radio_Elementsdaoimpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public Radio_Elements findById(Integer id) {
        try (Session session = factory.openSession()){
            return session.get(Radio_Elements.class, id);
        }
    }

    @Override
    public List<Radio_Elements> findByAll() {
        try (Session session = factory.openSession()) {
            Query<Radio_Elements> query = session.createQuery("FROM Radio_Elements");
            return query.list();
        }
    }

    @Override
    public void create(Radio_Elements radio_elements) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(radio_elements);
            session.getTransaction().commit();
        }
    }
    @Override
    public void update(Radio_Elements radio_elements) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.update(radio_elements);
            session.getTransaction().commit();

        }
    }

    @Override
    public void delete(Radio_Elements radio_elements) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.delete(radio_elements);
            session.getTransaction().commit();


        }
    }
}