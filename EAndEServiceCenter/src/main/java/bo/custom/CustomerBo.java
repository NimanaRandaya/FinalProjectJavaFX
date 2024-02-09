package bo.custom;

import bo.SuperBo;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import dto.CustomerDto;

import java.sql.SQLException;

public interface CustomerBo extends SuperBo {
    boolean saveCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException;
    boolean deleteCustomer(String ContactNumber) throws SQLException, ClassNotFoundException;

    boolean updateCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException;

    String  searchByCustomerDetails(String phonenumber) throws MessagingException;

    String getphonenumber();
}
