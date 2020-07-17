package DAO;

public class UserDAOProxy implements DAO.UserDAO {
  private String _endpoint = null;
  private DAO.UserDAO userDAO = null;
  
  public UserDAOProxy() {
    _initUserDAOProxy();
  }
  
  public UserDAOProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserDAOProxy();
  }
  
  private void _initUserDAOProxy() {
    try {
      userDAO = (new User_ServiceLocator()).getUserDAOPort();
      if (userDAO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userDAO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userDAO != null)
      ((javax.xml.rpc.Stub)userDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DAO.UserDAO getUserDAO() {
    if (userDAO == null)
      _initUserDAOProxy();
    return userDAO;
  }
  
  public DAO.User_Type getuser(int id) throws java.rmi.RemoteException{
    if (userDAO == null)
      _initUserDAOProxy();
    return userDAO.getuser(id);
  }
  
  public DAO.User_Type[] getAllUsers() throws java.rmi.RemoteException{
    if (userDAO == null)
      _initUserDAOProxy();
    return userDAO.getAllUsers();
  }
  
  public DAO.User_Type authenUser(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (userDAO == null)
      _initUserDAOProxy();
    return userDAO.authenUser(email, password);
  }
  
  public void deleteuser(int id) throws java.rmi.RemoteException{
    if (userDAO == null)
      _initUserDAOProxy();
    userDAO.deleteuser(id);
  }
  
  public void adduser(DAO.User_Type user) throws java.rmi.RemoteException{
    if (userDAO == null)
      _initUserDAOProxy();
    userDAO.adduser(user);
  }
  
  
}