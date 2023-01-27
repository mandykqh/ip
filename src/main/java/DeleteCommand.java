public class DeleteCommand extends Command {
    private int index;
    public DeleteCommand(int index) {
        this.index = index;
    }
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        Task t = taskList.getTasks().get(index - 1);
        taskList.deleteTask(index - 1);
        ui.showDeleteTaskMessage(t, taskList.getTasks().size());
    }
    @Override
    public boolean isExitCommand() { return false; }
}
