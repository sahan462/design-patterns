package structural.proxy;

public class main {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
        try {
            // Use Windows equivalent commands and cmd.exe as the shell
            executor.runCommand("cmd /c dir");
            executor.runCommand("cmd /c del abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }

    }
}
