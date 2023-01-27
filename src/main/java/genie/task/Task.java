package genie.task;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }
    public void markDone() {
        this.isDone = true;
    }
    public void unmarkDone() {
        this.isDone = false;
    }
    @Override
    public String toString() {
        return this.getStatusBox() + this.description;
    }
    public String getStatusBox() {
        return "[" +  this.getStatusIcon() + "] ";
    }
    public String toFileFormat() {
        return this.getStatusBox() + this.description;
    }
}
