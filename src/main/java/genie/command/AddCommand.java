package genie.command;

import genie.Storage;
import genie.TaskList;
import genie.Ui;
import genie.task.Task;

public class AddCommand extends Command {
    private String taskType;
    private String fullCommand;
    private Task task;
    public AddCommand(String taskType, String fullCommand) { //todo javadoc for command package
        this.taskType = taskType;
        this.fullCommand = fullCommand;
    }
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        switch(taskType) {
        case "todo":
            task = taskList.addToDoFromUser(fullCommand);
            break;
        case "deadline":
            task = taskList.addDeadlineFromUser(fullCommand);
            break;
        case "event":
            task = taskList.addEventFromUser(fullCommand);
            break;
        }
        ui.showAddTaskMessage(task, taskList.getTasks().size());
    }
    @Override
    public boolean isExitCommand() { return false; }
}
