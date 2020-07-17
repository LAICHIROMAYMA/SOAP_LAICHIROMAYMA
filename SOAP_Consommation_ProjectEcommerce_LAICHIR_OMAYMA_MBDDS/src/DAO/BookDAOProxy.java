package DAO;

public class BookDAOProxy implements DAO.BookDAO {
  private String _endpoint = null;
  private DAO.BookDAO bookDAO = null;
  
  public BookDAOProxy() {
    _initBookDAOProxy();
  }
  
  public BookDAOProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookDAOProxy();
  }
  
  private void _initBookDAOProxy() {
    try {
      bookDAO = (new DAO.BooksLocator()).getBookDAOPort();
      if (bookDAO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookDAO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookDAO != null)
      ((javax.xml.rpc.Stub)bookDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DAO.BookDAO getBookDAO() {
    if (bookDAO == null)
      _initBookDAOProxy();
    return bookDAO;
  }
  
  public DAO.Book findBook(int id) throws java.rmi.RemoteException{
    if (bookDAO == null)
      _initBookDAOProxy();
    return bookDAO.findBook(id);
  }
  
  public int deletebook(int id) throws java.rmi.RemoteException{
    if (bookDAO == null)
      _initBookDAOProxy();
    return bookDAO.deletebook(id);
  }
  
  public void addBook(DAO.Book book) throws java.rmi.RemoteException{
    if (bookDAO == null)
      _initBookDAOProxy();
    bookDAO.addBook(book);
  }
  
  public DAO.Book[] allBooks() throws java.rmi.RemoteException{
    if (bookDAO == null)
      _initBookDAOProxy();
    return bookDAO.allBooks();
  }
  
  public int updatebookby(int id, DAO.Book b) throws java.rmi.RemoteException{
    if (bookDAO == null)
      _initBookDAOProxy();
    return bookDAO.updatebookby(id, b);
  }
  
  
}