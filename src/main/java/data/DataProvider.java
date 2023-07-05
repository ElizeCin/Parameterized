package data;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    static List<String> names = new ArrayList<>();
    public static List<String> getValidNames() {
        names.clear();
        names.add("Vasiliy");
        names.add("Liza");
        return names;
    }
    public static List<String> getNotValidNames() {
        names.clear();
        names.add("rtdbrberb");
        names.add("izere5a");
        return names;
    }
    public static List<String> getNotvalidCertificate() {
        names.clear();
        names.add("rtdbrberb");
        names.add("izere5a");
        return names;
    }
}
