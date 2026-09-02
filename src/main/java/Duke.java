public class Duke {
    private String commandType;

    public static void main(String[] args) {
        System.out.println("Hello!");
    }


    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        Command c = Parser.parse(input);
        c.execute();
        commandType = c.getClass().getSimpleName();
        return c.getString();
    }

    /**
     * Returns the type of the latest command for styling Duke's response.
     */
    public String getCommandType() {
        return commandType;
    }
}
