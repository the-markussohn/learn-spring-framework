package lt.markussohn.services.impl;

import lt.markussohn.dao.InvoiceDao;
import lt.markussohn.model.Invoice;
import lt.markussohn.services.InvoiceService;

public class InvoiceServiceImpl implements InvoiceService {

    private InvoiceDao invoiceDao;

    public void setInvoiceDao(InvoiceDao invoiceDao) {
        this.invoiceDao = invoiceDao;
    }

    @Override
    public void raiseInvoice(Invoice invoice) {
        invoiceDao.save(invoice);
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        invoiceDao.update(invoice);
    }
}
