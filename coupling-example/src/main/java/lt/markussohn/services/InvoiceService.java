package lt.markussohn.services;

import lt.markussohn.model.Invoice;

public interface InvoiceService {
    void raiseInvoice(Invoice invoice);

    void updateInvoice(Invoice invoice);
}