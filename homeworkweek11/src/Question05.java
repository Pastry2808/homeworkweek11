import java.util.ArrayList;

/*
Write a Java program to test an array list is empty or not. Define array list with
underground tube names
 */
public class Question05 {
    public static void main(String[] args) {
        ArrayList<String> tubes = new ArrayList<>();
        tubes.add("Paddigton");
        tubes.add("Victoria");
        tubes.add("Waterloo");
        tubes.add("Bakerloo");
        tubes.add("Barking");
        tubes.add("Stratford");
        tubes.add("Goodmayes");

        if (tubes.isEmpty()){
            System.out.println("The list is Empty");
        }
        for (String stations :tubes){
            System.out.println(stations);
        }
    }
}
