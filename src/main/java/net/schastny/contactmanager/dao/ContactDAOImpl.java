package net.schastny.contactmanager.dao;

import java.util.List;

import net.schastny.contactmanager.domain.Contact;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class ContactDAOImpl implements ContactDAO {

	@Autowired
	private SessionFactory sessionFactory;

    @Autowired
    private DataSource dataSource;

//	public void addContact(Contact contact) {
//		sessionFactory.getCurrentSession().save(contact);
//	}

    public void addContact(Contact contact) {
        String name = "public.insert_city";
        Insert testSP = new Insert(dataSource,contact.getFirstname(),false);
        testSP.execute();
    }

	@SuppressWarnings("unchecked")
	public List<Contact> listContact() {

		return sessionFactory.getCurrentSession().createQuery("from Contact")
			.list();
	}

	public void removeContact(Integer id) {
		Contact contact = (Contact) sessionFactory.getCurrentSession().load(
				Contact.class, id);
		if (null != contact) {
			sessionFactory.getCurrentSession().delete(contact);
		}

	}
}
