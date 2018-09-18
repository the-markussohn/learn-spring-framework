package lt.markussohn.dao.impl;

import lt.markussohn.dao.InvoiceDao;
import lt.markussohn.exceptions.DatabaseUnavailableException;
import lt.markussohn.model.Invoice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HsqlInvoiceDao implements InvoiceDao {

    private static final String INSERT_SQL = "insert into INVOICES (INVOICE_ID, MESSAGE) values (?, ?)";
    private static final String DRIVER_URL = "org.hsqldb.jdbcDriver";
    private static final String DB_URL = "jdbc:hsqldb:file:invoicedb.dat;shutdown=true";
    private static final String CREATE_TABLES_SQL = "create table INVOICES(INVOICE_ID VARCHAR(255), MESSAGE VARCHAR(255))";

    public HsqlInvoiceDao() {
        try {
            Class.forName(DRIVER_URL);
            createTables();
        } catch (ClassNotFoundException e) {
            throw new DatabaseUnavailableException();
        }
    }

    @Override
    public void save(Invoice invoice) {
        try {
            Connection connection = null;
            PreparedStatement statement = null;

            try {
                connection = DriverManager.getConnection(DB_URL, "sa", "");
                statement = connection.prepareStatement(INSERT_SQL);
                statement.setString(1, invoice.getId());
                statement.setString(2, invoice.getMsg());
                statement.executeUpdate();
            } finally {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            }
        } catch (SQLException e) {
            throw new DatabaseUnavailableException();
        }
    }

    @Override
    public void delete(Invoice oldInvoice) {
        System.out.println("This is a stub of the delete method");
    }

    @Override
    public void update(Invoice invoiceToCancel) {
        System.out.println("This is a stub of the update method");
    }

    private static void createTables() {
        try {
            Connection connection = null;
            PreparedStatement statement = null;

            try {
                connection = DriverManager.getConnection(DB_URL, "sa", "");
                statement = connection.prepareStatement(CREATE_TABLES_SQL);
                statement.executeUpdate();
            } finally {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            }
        } catch (SQLException e) {
            // assuming the table already exists
            // not a good assumption
            // later - how Spring helps to handle this case
        }
    }
}
