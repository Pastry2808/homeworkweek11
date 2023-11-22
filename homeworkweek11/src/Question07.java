import java.util.HashMap;
/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */
public class Question07 {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap();
        people.put("Avani", 1);
        people.put("Khushbu", 2);
        people.put("Kinjal", 3);
        people.put("Nayan", 4);
        people.put("Ripti", 5);
        people.put("Shikha", 6);

        //Collections.checkedSortedMap(String, Integer);

//        for(Object person : people.entrySet()){
//            System.out.println(person);
//        }
        for (Integer person : people.values()){
            System.out.println(person);
        }
    }
}
