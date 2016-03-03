package cz.muni.fi.pv168.projekt;

import java.util.List;

/**
 * @author Lenka (433591)
 * @version 28.02.2016
 */
public interface LeaseManager {

    void createLease(Lease lease);

    void updateLease(Lease lease);

    void deleteLease(Lease lease);

    List<Lease> findLeasesByBook(Book book);

    List<Lease> findAllLeases();

    List<Lease> findLeasesByCust(Customer customer);

}
