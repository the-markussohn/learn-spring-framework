package lt.markussohn.dao;

import lt.markussohn.model.Invoice;

public interface InvoiceDao {
    void save(Invoice invoice);
    void update(Invoice invoice);
    void delete(Invoice invoice);
}
