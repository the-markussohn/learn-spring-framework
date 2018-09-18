package lt.markussohn;

import lt.markussohn.container.SimpleContainer;
import lt.markussohn.model.Invoice;
import lt.markussohn.services.InvoiceService;

public class Client {
    public static void main(String[] args) {
        InvoiceService invoiceService = SimpleContainer.getInvoiceService();
        Invoice invoice = new Invoice("111", "markussohn");
        invoiceService.raiseInvoice(invoice);
    }
}
