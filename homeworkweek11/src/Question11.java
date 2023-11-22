import java.util.ArrayList;

/*
Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.
 */
public class Question11 {
    static String myName = "Khushbu";

    public static void main(String[] args) {
        ArrayList <String> name = new ArrayList<>();
        name.add("Avani");
        name.add("Nayan");
        name.add("Kinjal");
        name.add("Ripti");
        name.add("Shikha");
        name.add(myName);

        for (String n : name) {
            if(n.equalsIgnoreCase("khushbu")){
                System.out.println("Name: " + n);
            }
        }
    }
}
