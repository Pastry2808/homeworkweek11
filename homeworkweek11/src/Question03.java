import java.util.ArrayList;

/*
Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.
 */
public class Question03 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Black");
        colours.add("White");
        colours.add("Orange");
      for(String colour: colours){
          System.out.println(colour);
      }
    }


}
