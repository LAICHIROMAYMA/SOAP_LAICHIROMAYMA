/**
 * CategoryDAO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public interface CategoryDAO extends java.rmi.Remote {
    public void deletecategory(int id) throws java.rmi.RemoteException;
    public void addcategory(java.lang.String type) throws java.rmi.RemoteException;
    public java.lang.String getcategoryType(int id) throws java.rmi.RemoteException;
    public DAO.Category[] getCategory() throws java.rmi.RemoteException;
    public void ajouterCategory(DAO.Category category) throws java.rmi.RemoteException;
    public void updatecategory(int id, java.lang.String type) throws java.rmi.RemoteException;
}
