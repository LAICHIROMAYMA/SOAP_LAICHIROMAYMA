/**
 * CatLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class CatLocator extends org.apache.axis.client.Service implements DAO.Cat {

    public CatLocator() {
    }


    public CatLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CatLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CategoryDAOPort
    private java.lang.String CategoryDAOPort_address = "http://localhost:1998/DAO/CategoryDAO";

    public java.lang.String getCategoryDAOPortAddress() {
        return CategoryDAOPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CategoryDAOPortWSDDServiceName = "CategoryDAOPort";

    public java.lang.String getCategoryDAOPortWSDDServiceName() {
        return CategoryDAOPortWSDDServiceName;
    }

    public void setCategoryDAOPortWSDDServiceName(java.lang.String name) {
        CategoryDAOPortWSDDServiceName = name;
    }

    public DAO.CategoryDAO getCategoryDAOPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CategoryDAOPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCategoryDAOPort(endpoint);
    }

    public DAO.CategoryDAO getCategoryDAOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DAO.CategoryDAOPortBindingStub _stub = new DAO.CategoryDAOPortBindingStub(portAddress, this);
            _stub.setPortName(getCategoryDAOPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCategoryDAOPortEndpointAddress(java.lang.String address) {
        CategoryDAOPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DAO.CategoryDAO.class.isAssignableFrom(serviceEndpointInterface)) {
                DAO.CategoryDAOPortBindingStub _stub = new DAO.CategoryDAOPortBindingStub(new java.net.URL(CategoryDAOPort_address), this);
                _stub.setPortName(getCategoryDAOPortWSDDServiceName());
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
        if ("CategoryDAOPort".equals(inputPortName)) {
            return getCategoryDAOPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DAO/", "Cat");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DAO/", "CategoryDAOPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CategoryDAOPort".equals(portName)) {
            setCategoryDAOPortEndpointAddress(address);
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
