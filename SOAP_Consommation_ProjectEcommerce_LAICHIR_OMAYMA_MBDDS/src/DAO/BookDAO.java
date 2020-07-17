/**
 * BookDAO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public interface BookDAO extends java.rmi.Remote {
    public DAO.Book findBook(int id) throws java.rmi.RemoteException;
    public int deletebook(int id) throws java.rmi.RemoteException;
    public void addBook(DAO.Book book) throws java.rmi.RemoteException;
    public DAO.Book[] allBooks() throws java.rmi.RemoteException;
    public int updatebookby(int id, DAO.Book b) throws java.rmi.RemoteException;
}
