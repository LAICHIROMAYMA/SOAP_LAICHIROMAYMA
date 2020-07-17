package DAO;

public class CategoryDAOProxy implements DAO.CategoryDAO {
  private String _endpoint = null;
  private DAO.CategoryDAO categoryDAO = null;
  
  public CategoryDAOProxy() {
    _initCategoryDAOProxy();
  }
  
  public CategoryDAOProxy(String endpoint) {
    _endpoint = endpoint;
    _initCategoryDAOProxy();
  }
  
  private void _initCategoryDAOProxy() {
    try {
      categoryDAO = (new DAO.CatLocator()).getCategoryDAOPort();
      if (categoryDAO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)categoryDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)categoryDAO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (categoryDAO != null)
      ((javax.xml.rpc.Stub)categoryDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DAO.CategoryDAO getCategoryDAO() {
    if (categoryDAO == null)
      _initCategoryDAOProxy();
    return categoryDAO;
  }
  
  public void deletecategory(int id) throws java.rmi.RemoteException{
    if (categoryDAO == null)
      _initCategoryDAOProxy();
    categoryDAO.deletecategory(id);
  }
  
  public void addcategory(java.lang.String type) throws java.rmi.RemoteException{
    if (categoryDAO == null)
      _initCategoryDAOProxy();
    categoryDAO.addcategory(type);
  }
  
  public java.lang.String getcategoryType(int id) throws java.rmi.RemoteException{
    if (categoryDAO == null)
      _initCategoryDAOProxy();
    return categoryDAO.getcategoryType(id);
  }
  
  public DAO.Category[] getCategory() throws java.rmi.RemoteException{
    if (categoryDAO == null)
      _initCategoryDAOProxy();
    return categoryDAO.getCategory();
  }
  
  public void ajouterCategory(DAO.Category category) throws java.rmi.RemoteException{
    if (categoryDAO == null)
      _initCategoryDAOProxy();
    categoryDAO.ajouterCategory(category);
  }
  
  public void updatecategory(int id, java.lang.String type) throws java.rmi.RemoteException{
    if (categoryDAO == null)
      _initCategoryDAOProxy();
    categoryDAO.updatecategory(id, type);
  }
  
  
}