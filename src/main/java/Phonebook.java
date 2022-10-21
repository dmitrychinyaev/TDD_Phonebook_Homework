import java.util.Map;
import java.util.TreeMap;

public class Phonebook {
    protected Map<String,String> phonebook = new TreeMap<>();

    public int add(String name, String number){
        phonebook.put(name,number);
        return phonebook.size();
    }

    public String findByName(String number){
        return phonebook.get(number);
    }
}
