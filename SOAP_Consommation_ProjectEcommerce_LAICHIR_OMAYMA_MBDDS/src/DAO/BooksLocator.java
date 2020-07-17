/**
 * BooksLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class BooksLocator extends org.apache.axis.client.Service implements DAO.Books {

    public BooksLocator() {
    }


    public BooksLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BooksLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BookDAOPort
    private java.lang.String BookDAOPort_address = "http://localhost:1991/booksclient/BookDAO";

    public java.lang.String getBookDAOPortAddress() {
        return BookDAOPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BookDAOPortWSDDServiceName = "BookDAOPort";

    public java.lang.String getBookDAOPortWSDDServiceName() {
        return BookDAOPortWSDDServiceName;
    }

    public void setBookDAOPortWSDDServiceName(java.lang.String name) {
        BookDAOPortWSDDServiceName = name;
    }

    public DAO.BookDAO getBookDAOPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BookDAOPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBookDAOPort(endpoint);
    }

    public DAO.BookDAO getBookDAOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DAO.BookDAOPortBindingStub _stub = new DAO.BookDAOPortBindingStub(portAddress, this);
            _stub.setPortName(getBookDAOPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBookDAOPortEndpointAddress(java.lang.String address) {
        BookDAOPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DAO.BookDAO.class.isAssignableFrom(serviceEndpointInterface)) {
                DAO.BookDAOPortBindingStub _stub = new DAO.BookDAOPortBindingStub(new java.net.URL(BookDAOPort_address), this);
                _stub.setPortName(getBookDAOPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BookDAOPort".equals(inputPortName)) {
            return getBookDAOPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DAO/", "Books");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DAO/", "BookDAOPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BookDAOPort".equals(portName)) {
            setBookDAOPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
