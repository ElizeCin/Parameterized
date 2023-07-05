package exam;
import java.util.Iterator;
import java.util.ResourceBundle;

public class ResourseExample {
    public static void main(String[] args) {
        ResourceBundle takeNames = ResourceBundle.getBundle("liza");
//        Iterator<String> iterator = takeNames.getKeys().asIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        System.out.println(takeNames.getString("familyname"));
    }
}
