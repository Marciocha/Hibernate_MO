package com.sdajava.hibernate;

import com.sdajava.hibernate.entity.BooksEntity;
import com.sdajava.hibernate.entity.PersonsEntity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by lukas on 25.04.2017.
 */
public class Main {
    private static final SessionFactory ourSessionFactory;

    static {    //konstruktor klasy jak klasa jest zainicjalizowana
        try {
            Configuration configuration = new Configuration();
            configuration.configure();  //czyta plik konfiguracyjny jak ten plik nie istnieje to wyrzuca blad

            ourSessionFactory = configuration.buildSessionFactory();    //polaczenie program w javie a baza danych
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            List<BooksEntity> books =
                    session.createQuery("FROM " + BooksEntity.class.getName()).list();  //select na cala tabele i zrzuca liste BooksEntity zrzuca nazwe klasy createQuery wykonuje polecenie do bazy danych czyli select*from

            for (BooksEntity book: books) {
                System.out.println(" Autor: " + book.getAuthor());
                System.out.println(" Tytul: " + book.getTitle());
            }
            List<PersonsEntity> persons =
            session.createQuery("FROM " + PersonsEntity.class.getName()).list();  //select na cala tabele i zrzuca liste BooksEntity zrzuca nazwe klasy createQuery wykonuje polecenie do bazy danych czyli select*from

            for (PersonsEntity person: persons){
            System.out.println(" Imie: " + person.getFirst_name());
            System.out.println(" Nazwisko: " + person.getLastname());
            }

            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
