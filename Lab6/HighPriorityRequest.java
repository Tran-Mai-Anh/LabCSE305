import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HighPriorityRequest implements Request {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().format(DateTimeFormatter.ISO_DATE);
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
        System.out.println("Check\nPriority: " + priority + ", Status: " + status + ", Expire Day: " + expireDay);
    }
}
