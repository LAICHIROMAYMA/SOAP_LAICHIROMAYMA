package DAO;

public class CartDAOProxy implements DAO.CartDAO {
  private String _endpoint = null;
  private DAO.CartDAO cartDAO = null;
  
  public CartDAOProxy() {
    _initCartDAOProxy();
  }
  
  public CartDAOProxy(String endpoint) {
    _endpoint = endpoint;
    _initCartDAOProxy();
  }
  
  private void _initCartDAOProxy() {
    try {
      cartDAO = (new Cart_ServiceLocator()).getCartDAOPort();
      if (cartDAO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cartDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cartDAO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cartDAO != null)
      ((javax.xml.rpc.Stub)cartDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DAO.CartDAO getCartDAO() {
    if (cartDAO == null)
      _initCartDAOProxy();
    return cartDAO;
  }
  
  public void deletefromcat(int id) throws java.rmi.RemoteException{
    if (cartDAO == null)
      _initCartDAOProxy();
    cartDAO.deletefromcat(id);
  }
  
  public DAO.Cart_Type[] getcart() throws java.rmi.RemoteException{
    if (cartDAO == null)
      _initCartDAOProxy();
    return cartDAO.getcart();
  }
  
  public void addcart(java.lang.String image, java.lang.String nom, double price) throws java.rmi.RemoteException{
    if (cartDAO == null)
      _initCartDAOProxy();
    cartDAO.addcart(image, nom, price);
  }
  
  public void addcartbook(DAO.Book b) throws java.rmi.RemoteException{
    if (cartDAO == null)
      _initCartDAOProxy();
    cartDAO.addcartbook(b);
  }
  
  
}