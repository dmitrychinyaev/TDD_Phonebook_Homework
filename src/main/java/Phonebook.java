import java.util.Map;
import java.util.TreeMap;

public class Phonebook {
    protected Map<String,String> phonebook = new TreeMap<>();

    public int add(String name, String number){
        phonebook.put(name,number);
        return phonebook.size();
    }

    public String findByName(String name){
        return phonebook.get(name);
    }

    public String findByNumber(String number){
        return phonebook.keySet()
                .stream()
                .filter(key -> number.equals(phonebook.get(key)))
                .findFirst().get();
    }

    public String printAllNames(){
        return phonebook.keySet().toString();
    }
}
