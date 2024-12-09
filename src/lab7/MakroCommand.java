package lab7;
import java.util.ArrayList;
import java.util.List;
/**
 * A macro-command that represents a sequence of commands executed together
 */
public class MakroCommand implements Command {
    private final List<Command> commands = new ArrayList<>();

    /**
     * Adds a command to the macro sequence.
     * @param command the command to add
     */
    public void addCommand(Command command) {
        commands.add(command);
    }
    /**
     * Executes all commands in the macro sequence.
     */
    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
