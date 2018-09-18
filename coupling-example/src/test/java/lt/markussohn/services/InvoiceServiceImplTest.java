package lt.markussohn.services;

import lt.markussohn.exceptions.DatabaseUnavailableException;
import lt.markussohn.model.Invoice;
import lt.markussohn.services.impl.InvoiceServiceImpl;
import org.junit.Test;

public class InvoiceServiceImplTest {

    @Test(expected = DatabaseUnavailableException.class)
    public void whenSendingInvalidInvoiceThrowAnException() {
        InvoiceServiceImpl service = new InvoiceServiceImpl();
        Invoice invalidInvoice = new Invoice("42112X", "invalid message");
        service.raiseInvoice(invalidInvoice);
    }
}