package database.application.development.repository;

import database.application.development.model.domain.Customer;

import java.util.List;

/**
 * Created by HrvojeGrgic on 11/10/2017.
 */
public interface CustomerDao {
    Customer getCustomerById(int entityId);

    Customer getCustomerByEmail(String email);

    Customer updateCustomer(Customer customer);

    Customer createCustomer(Customer customer);

    void deleteCustomer(Customer customer);
}
