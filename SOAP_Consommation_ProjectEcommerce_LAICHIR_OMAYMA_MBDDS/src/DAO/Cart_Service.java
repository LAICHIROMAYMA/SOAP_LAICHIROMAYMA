/**
 * Cart_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public interface Cart_Service extends javax.xml.rpc.Service {
    public java.lang.String getCartDAOPortAddress();

    public DAO.CartDAO getCartDAOPort() throws javax.xml.rpc.ServiceException;

    public DAO.CartDAO getCartDAOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
