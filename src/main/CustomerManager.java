package main;

import java.util.List;

/**
 * @author Lenka (433591)
 * @version 27.02.2016
 */
public interface CustomerManager {

    void createCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Customer findCustomerById(int id);

    List<Customer> findCustomersByName(String name);
    
        
}
