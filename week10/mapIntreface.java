import java.util.HashMap;
import java.util.Map;
public class mapInterface {
public static void main(String[] args) {
Map<String,Integer> obj=new HashMap<String,Integer>();
obj.put("priya", 1);
obj.put("vyshnavi", 2);
obj.put("divya", 3);
obj.put("vanitha", 4);
for(Map.Entry<String,Integer> m:obj.entrySet()){
System.out.println(m.getKey()+" = "+m.getValue());
}
}
}
