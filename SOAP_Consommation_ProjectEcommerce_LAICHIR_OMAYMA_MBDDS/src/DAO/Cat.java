/**
 * Cat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public interface Cat extends javax.xml.rpc.Service {
    public java.lang.String getCategoryDAOPortAddress();

    public DAO.CategoryDAO getCategoryDAOPort() throws javax.xml.rpc.ServiceException;

    public DAO.CategoryDAO getCategoryDAOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
