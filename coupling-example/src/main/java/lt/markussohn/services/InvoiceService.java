package lt.markussohn.services;

import lt.markussohn.dao.InvoiceDao;
import lt.markussohn.model.Invoice;

public class InvoiceService {

    public void raiseInvoice(Invoice invoice) {
        InvoiceDao dao = new InvoiceDao();
        dao.save(invoice);
    }
}
