/**
 * CartDAO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public interface CartDAO extends java.rmi.Remote {
    public void deletefromcat(int id) throws java.rmi.RemoteException;
    public DAO.Cart_Type[] getcart() throws java.rmi.RemoteException;
    public void addcart(java.lang.String image, java.lang.String nom, double price) throws java.rmi.RemoteException;
    public void addcartbook(DAO.Book b) throws java.rmi.RemoteException;
}
