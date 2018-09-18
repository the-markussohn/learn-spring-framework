package lt.markussohn.container;

import lt.markussohn.dao.InvoiceDao;
import lt.markussohn.dao.impl.HsqlInvoiceDao;
import lt.markussohn.services.InvoiceService;
import lt.markussohn.services.impl.InvoiceServiceImpl;

public class SimpleContainer {

    public static InvoiceService getInvoiceService() {
        InvoiceDao invoiceDao = new HsqlInvoiceDao();
        InvoiceServiceImpl invoiceService = new InvoiceServiceImpl();
        invoiceService.setInvoiceDao(invoiceDao);
        return invoiceService;
    }
}
