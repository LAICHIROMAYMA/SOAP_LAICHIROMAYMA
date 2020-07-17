/**
 * User_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public interface User_Service extends javax.xml.rpc.Service {
    public java.lang.String getUserDAOPortAddress();

    public DAO.UserDAO getUserDAOPort() throws javax.xml.rpc.ServiceException;

    public DAO.UserDAO getUserDAOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
