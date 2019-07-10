import java.util.Date;

public class Task {
    private String description = null;
    private boolean isComplete = false;
    Date dateOfTask;

    public Task(String description) {
        super();
        this.description = description;
    }

    public Task(String description, boolean isComplete) {
        super();
        this.description = description;
        this.isComplete = isComplete;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Date getDateOfTask() {
        return dateOfTask;
    }
    public void setdateOfTask(Date dateOfTask) {
        this.dateOfTask = dateOfTask;
    }
    
    public boolean isComplete() {
        return isComplete;
    }
    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

}
