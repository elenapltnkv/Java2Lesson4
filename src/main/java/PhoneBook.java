import java.util.*;

public class PhoneBook {
    private static Object String;

    public static void main(String[] args) {
        HashMap<String, String> pn = new HashMap<>();
        pn.put("Иванов", "81283216598");
        pn.put("Иванов", "81283216599");
        pn.put("Петров", "81283216588");
        pn.put("Березова", "81283316598");
        pn.put("Сидоров", "81283215598");
        pn.put("Харламов", "81383216598");
        pn.put("Кузнецов", "81293216598");
        pn.put("Денисов", "81283217598");
        pn.put("Пучкова", "81284216598");
        pn.put("Безруков", "81283226598");

        pn.get("Кузнецов");
        pn.get("Пучкова");

        System.out.println(pn.get("Кузнецов"));
        System.out.println(pn.get("Пучкова"));

        System.out.println(pn + pn.get("Иванов"));
        }

    }
