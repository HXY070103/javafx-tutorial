/**
 * Parses user input into commands.
 */
public class Parser {
    /**
     * Returns the command represented by the user input.
     */
    public static Command parse(String input) {
        String trimmedInput = input.strip();
        String commandWord = trimmedInput.isEmpty() ? "" : trimmedInput.split("\\s+", 2)[0].toLowerCase();

        switch (commandWord) {
        case "todo":
        case "deadline":
        case "event":
            return new AddCommand(input);
        case "mark":
            return new ChangeMarkCommand(input);
        case "delete":
            return new DeleteCommand(input);
        default:
            return new EchoCommand(input);
        }
    }
}
