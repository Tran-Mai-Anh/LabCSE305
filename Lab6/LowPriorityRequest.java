import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LowPriorityRequest implements Request {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().format(DateTimeFormatter.ISO_DATE);
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
        System.out.println("Check\nPriority: " + priority + ", Status: " + status + ", Expire Day: " + expireDay);
    }
}
