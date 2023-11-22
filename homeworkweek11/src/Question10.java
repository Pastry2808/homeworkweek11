import java.util.ArrayList;

/*
Write program and add all group members names in to array and iterates
through for each loop and print your name.
 */
public class Question10 {
    public static void main(String[] args) {
        ArrayList<String> groupMembers = new ArrayList<>();
        groupMembers.add("Khushbu");
        groupMembers.add("Avani");
        groupMembers.add("Nayan");
        groupMembers.add("Kinjal");
        groupMembers.add("Ripti");
        groupMembers.add("Shikha");

        for (String name : groupMembers) {
            if(name.equalsIgnoreCase("khushbu")){
                System.out.println("Name: " + name);

            }
        }
    }
}
