package lab7;
/**
Client configures commands and assigns them to buttons
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        // Створення команд
        Command openCommand = new OpenCommand(receiver);
        Command saveCommand = new SaveCommand(receiver);
        Command exitCommand = new ExitCommand(receiver);

        // Створення кнопок
        Button openButton = new Button();
        Button saveButton = new Button();
        Button exitButton = new Button();

        // Призначення команд кнопкам
        openButton.setCommand(openCommand);
        saveButton.setCommand(saveCommand);
        exitButton.setCommand(exitCommand);

        // Симуляція натискання кнопок
        openButton.press();
        saveButton.press();
        exitButton.press();

        // Створення макрокоманди
        MakroCommand macro = new MakroCommand();
        macro.addCommand(openCommand);
        macro.addCommand(saveCommand);
        macro.addCommand(exitCommand);

        // Виконання макрокоманди
        System.out.println("Виконуємо макрокоманду:");
        macro.execute();
    }
}