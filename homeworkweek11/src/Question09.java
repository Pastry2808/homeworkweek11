import java.util.ArrayList;

/*
Write program and add all group names in to array and iterates through for
each loop.
 */
public class Question09 {
    public static void main(String[] args) {
        ArrayList<String> groups = new ArrayList<>();
        groups.add("Agile");
        groups.add("Code1");
        groups.add("Code2");
        groups.add("Java");
        groups.add("Postman");
        groups.add("Rest Assured");
        for (String names : groups) {
            System.out.println(names);
        }
    }
}
