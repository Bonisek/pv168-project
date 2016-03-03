package cz.muni.fi.pv168.projekt;

import java.util.List;

/**
 * @author Lenka (433591)
 * @version 28.02.2016
 */
public interface CustomerManager {

    void createCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Customer findCustomerById(Long id);

    List<Customer> findCustomersByName(String name);


}
