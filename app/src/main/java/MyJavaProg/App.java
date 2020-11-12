package MyJavaProg;

import javax.swing.*;
import java.util.LinkedList;

public class App {

    public static String Vorname = " Denis";
    public static String Name =  " Latt";
    public static String MatrNr =" 568344 ";

    public static void main(String[] args) {
        LinkedList<ICommand> commands = CommandFactory.returnCommandList();
        do {
            System.out.println(buildCLIMenu(commands));
            ICommand selectedCMD = selectCommand(commands);
            System.out.println(selectedCMD.execute());
        } while (true);
    }

    static private String buildCLIMenu(LinkedList<ICommand> commands) {
        StringBuilder builder = new StringBuilder();
        builder.append(System.lineSeparator());
        builder.append("Console-Application: Exercise-1" + Vorname  + Name + MatrNr+  System.lineSeparator());
        builder.append(System.lineSeparator());
        for (int i = 1; i < commands.size(); i++) {
            ICommand cmd = commands.get(i);
            builder.append(" " + i + "." + cmd.description() + System.lineSeparator());
        }
        builder.append(" " + 0 + "." + commands.get(0).description() + System.lineSeparator());
        return builder.toString();
    }

    static private ICommand selectCommand(LinkedList<ICommand> commands) {
        do {
            int select = Console.readIntegerFromStdIn("Please select an option:");
            if (select >= 0 && select < commands.size()) {
                return commands.get(select);
            }   System.out.println("\tWarning -> Please select a valid option between 0 and " + (commands.size() - 1) + ".");
        }
        while (true);
    }
}
