/**
 * Book.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class Book  implements java.io.Serializable {
    private java.lang.String autor_name;

    private int book_Quantity;

    private java.lang.String book_Summary;

    private DAO.Category book_category;

    private int book_id;

    private java.lang.String book_image;

    private java.lang.String book_name;

    private java.lang.Double book_price;

    private java.lang.String books_availibility;

    public Book() {
    }

    public Book(
           java.lang.String autor_name,
           int book_Quantity,
           java.lang.String book_Summary,
           DAO.Category book_category,
           int book_id,
           java.lang.String book_image,
           java.lang.String book_name,
           java.lang.Double book_price,
           java.lang.String books_availibility) {
           this.autor_name = autor_name;
           this.book_Quantity = book_Quantity;
           this.book_Summary = book_Summary;
           this.book_category = book_category;
           this.book_id = book_id;
           this.book_image = book_image;
           this.book_name = book_name;
           this.book_price = book_price;
           this.books_availibility = books_availibility;
    }


    /**
     * Gets the autor_name value for this Book.
     * 
     * @return autor_name
     */
    public java.lang.String getAutor_name() {
        return autor_name;
    }


    /**
     * Sets the autor_name value for this Book.
     * 
     * @param autor_name
     */
    public void setAutor_name(java.lang.String autor_name) {
        this.autor_name = autor_name;
    }


    /**
     * Gets the book_Quantity value for this Book.
     * 
     * @return book_Quantity
     */
    public int getBook_Quantity() {
        return book_Quantity;
    }


    /**
     * Sets the book_Quantity value for this Book.
     * 
     * @param book_Quantity
     */
    public void setBook_Quantity(int book_Quantity) {
        this.book_Quantity = book_Quantity;
    }


    /**
     * Gets the book_Summary value for this Book.
     * 
     * @return book_Summary
     */
    public java.lang.String getBook_Summary() {
        return book_Summary;
    }


    /**
     * Sets the book_Summary value for this Book.
     * 
     * @param book_Summary
     */
    public void setBook_Summary(java.lang.String book_Summary) {
        this.book_Summary = book_Summary;
    }


    /**
     * Gets the book_category value for this Book.
     * 
     * @return book_category
     */
    public DAO.Category getBook_category() {
        return book_category;
    }


    /**
     * Sets the book_category value for this Book.
     * 
     * @param book_category
     */
    public void setBook_category(DAO.Category book_category) {
        this.book_category = book_category;
    }


    /**
     * Gets the book_id value for this Book.
     * 
     * @return book_id
     */
    public int getBook_id() {
        return book_id;
    }


    /**
     * Sets the book_id value for this Book.
     * 
     * @param book_id
     */
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }


    /**
     * Gets the book_image value for this Book.
     * 
     * @return book_image
     */
    public java.lang.String getBook_image() {
        return book_image;
    }


    /**
     * Sets the book_image value for this Book.
     * 
     * @param book_image
     */
    public void setBook_image(java.lang.String book_image) {
        this.book_image = book_image;
    }


    /**
     * Gets the book_name value for this Book.
     * 
     * @return book_name
     */
    public java.lang.String getBook_name() {
        return book_name;
    }


    /**
     * Sets the book_name value for this Book.
     * 
     * @param book_name
     */
    public void setBook_name(java.lang.String book_name) {
        this.book_name = book_name;
    }


    /**
     * Gets the book_price value for this Book.
     * 
     * @return book_price
     */
    public java.lang.Double getBook_price() {
        return book_price;
    }


    /**
     * Sets the book_price value for this Book.
     * 
     * @param book_price
     */
    public void setBook_price(java.lang.Double book_price) {
        this.book_price = book_price;
    }


    /**
     * Gets the books_availibility value for this Book.
     * 
     * @return books_availibility
     */
    public java.lang.String getBooks_availibility() {
        return books_availibility;
    }


    /**
     * Sets the books_availibility value for this Book.
     * 
     * @param books_availibility
     */
    public void setBooks_availibility(java.lang.String books_availibility) {
        this.books_availibility = books_availibility;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autor_name==null && other.getAutor_name()==null) || 
             (this.autor_name!=null &&
              this.autor_name.equals(other.getAutor_name()))) &&
            this.book_Quantity == other.getBook_Quantity() &&
            ((this.book_Summary==null && other.getBook_Summary()==null) || 
             (this.book_Summary!=null &&
              this.book_Summary.equals(other.getBook_Summary()))) &&
            ((this.book_category==null && other.getBook_category()==null) || 
             (this.book_category!=null &&
              this.book_category.equals(other.getBook_category()))) &&
            this.book_id == other.getBook_id() &&
            ((this.book_image==null && other.getBook_image()==null) || 
             (this.book_image!=null &&
              this.book_image.equals(other.getBook_image()))) &&
            ((this.book_name==null && other.getBook_name()==null) || 
             (this.book_name!=null &&
              this.book_name.equals(other.getBook_name()))) &&
            ((this.book_price==null && other.getBook_price()==null) || 
             (this.book_price!=null &&
              this.book_price.equals(other.getBook_price()))) &&
            ((this.books_availibility==null && other.getBooks_availibility()==null) || 
             (this.books_availibility!=null &&
              this.books_availibility.equals(other.getBooks_availibility())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAutor_name() != null) {
            _hashCode += getAutor_name().hashCode();
        }
        _hashCode += getBook_Quantity();
        if (getBook_Summary() != null) {
            _hashCode += getBook_Summary().hashCode();
        }
        if (getBook_category() != null) {
            _hashCode += getBook_category().hashCode();
        }
        _hashCode += getBook_id();
        if (getBook_image() != null) {
            _hashCode += getBook_image().hashCode();
        }
        if (getBook_name() != null) {
            _hashCode += getBook_name().hashCode();
        }
        if (getBook_price() != null) {
            _hashCode += getBook_price().hashCode();
        }
        if (getBooks_availibility() != null) {
            _hashCode += getBooks_availibility().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Book.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DAO/", "book"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autor_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autor_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_Quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_Summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_Summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://DAO/", "category"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_image");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("books_availibility");
        elemField.setXmlName(new javax.xml.namespace.QName("", "books_availibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
