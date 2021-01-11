import java.util.Scanner;

public class main {
    private static boolean checkEnd = false;
    public static String input;

    public static void main(String[] args){
        initUI();
    }

    private static void initUI(){
        System.out.println(welcome());
        while(!checkEnd){
            System.out.println(startApplication());
        }
    }

    private static String welcome(){
        return constants.WELCOME_TEXT;
    }

    private static String startApplication(){
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        if(input.equals(constants.END_APPLICATION)){
            checkEnd = true;
            return setup.end();
        }
        return setup.answer();
    }
}
