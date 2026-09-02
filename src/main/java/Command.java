/**
 * Represents a command understood by Duke.
 */
public abstract class Command {
    private final String input;
    private String response;

    protected Command(String input) {
        this.input = input;
    }

    /**
     * Executes this command.
     */
    public void execute() {
        response = "Duke heard: " + input;
    }

    /**
     * Returns Duke's response after this command has been executed.
     */
    public String getString() {
        return response;
    }
}
