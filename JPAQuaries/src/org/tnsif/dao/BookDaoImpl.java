package org.tnsif.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.tnsif.entities.Book;

public class BookDaoImpl implements BookDao{
	
	private EntityManager em;
	
	

	public BookDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	//to retreive the book with specific id
	@Override
	public Book getBookById(int id) {
		Book book=em.find(Book.class, id);
		return book;
	}

	//to retrieve all the records
	@Override
	public List<Book> getAllBooks() {
		Query query=em.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book>b1=query.getResultList();
		return b1;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		String query="SELECT book From Book book WHERE book.author=:pAuthor";
		TypedQuery<Book>query1=em.createQuery(query,Book.class);
		query1.setParameter("pAuthor", author);
		List<Book>b1=query1.getResultList();
		return b1;
	}

	@Override
	public Long getBooksCount() {
		String query="SELECT COUNT(book.id)FROM Book book";
		TypedQuery<Long>query1=em.createQuery(query,Long.class);
		Long count=query1.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getBookByPrice(int low, int high) {
		String query="SELECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Book>query1=em.createQuery(query,Book.class);
		query1.setParameter("low",low);
		query1.setParameter("high",high);
		List<Book>b1=query1.getResultList();
		return b1;
	}



}
