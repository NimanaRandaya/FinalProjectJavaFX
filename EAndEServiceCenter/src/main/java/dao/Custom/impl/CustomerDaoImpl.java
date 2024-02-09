package dao.Custom.impl;

import dao.Custom.CustomerDao;
import entity.CustomerEntity;
import java.sql.SQLException;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean save(Object entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(Object entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String value) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public List getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public CustomerEntity getItemByPhoneNumber(String phonenumber) {
        return null;
    }

    @Override
    public String getSearchByCustomer(String phonenumber) {
        return null;
    }
}
