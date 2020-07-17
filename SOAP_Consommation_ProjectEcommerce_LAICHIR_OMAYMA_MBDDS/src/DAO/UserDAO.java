/**
 * UserDAO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public interface UserDAO extends java.rmi.Remote {
    public DAO.User_Type getuser(int id) throws java.rmi.RemoteException;
    public DAO.User_Type[] getAllUsers() throws java.rmi.RemoteException;
    public DAO.User_Type authenUser(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException;
    public void deleteuser(int id) throws java.rmi.RemoteException;
    public void adduser(DAO.User_Type user) throws java.rmi.RemoteException;
}
