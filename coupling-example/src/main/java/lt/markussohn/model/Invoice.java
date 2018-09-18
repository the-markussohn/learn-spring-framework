package lt.markussohn.model;

public class Invoice {

    private String id;
    private String msg;
    private String status;

    public Invoice(String id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public String getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public void cancel() {
        this.status = "Cancelled";
    }

    @Override
    public String toString() {
        return this.id + ": " + msg + ". Status: " + status;
    }
}
