package strings;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;



public class Main {

    public static void main(String[] args) {
        String language;
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while(stop==false){
            System.out.println("Выберите язык:\n" +
                    "1 - Русский\n" +
                    "2 - English");
            choose = scanner.nextLine();

            switch (choose){
                case "1":
                    language = "RU";
                    stop = true;
                    break;
                case "2":
                    language = "EN";
                    stop = true;
                    break;
                default:
                    System.out.println("Выберите 1 или 2. Choose 1 or 2");
            }
        }
        Locale local = new Locale(language);

        ResourceBundle rb = ResourceBundle.getBundle("text", local);

        String cpu = rb.getString("cpu");
        String memory = rb.getString("memory");
        String storage = rb.getString("storage");

        System.out.println(cpu);
        System.out.println(memory);
        System.out.println(storage);
    }
}
