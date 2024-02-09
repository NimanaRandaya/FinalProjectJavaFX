package dao.Custom;

import dao.CrudDao;
import entity.CustomerEntity;

public interface CustomerDao extends CrudDao {
    CustomerEntity getItemByPhoneNumber(String phonenumber);
    String getSearchByCustomer(String phonenumber);
}
