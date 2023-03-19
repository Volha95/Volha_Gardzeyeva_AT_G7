package classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFor {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        String str = "мама мыла раму";
        String[] words = str.split("\\s");
        for (String x : words) {
            myList.add(x);
        }
        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
        for(String y : myList){
            System.out.println(y);
        }
    }
}
