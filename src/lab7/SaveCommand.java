package lab7;
/**
 * The specific command that handles the "Save action"
 */
public class SaveCommand implements Command {
    private final Receiver receiver;

    /**
     * Constructor for SaveCommand.
     * @param receiver the receiver that executes the command
     */
    public SaveCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * Executes the save file command.
     */
    @Override
    public void execute() {
        receiver.saveFile();
    }
}
