package lab7;
/**
 * A command interface that defines a contract for all commands
 */
public interface Command {
    /**
     * Executes the command. This method encapsulates the request to perform an action on the receiver.
     */
    void execute();
}

