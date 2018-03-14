package hash_maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author 1516392
 */

public class Client {
    public static void main(String[] args) {
        Map map = new HashMap();
        for (int i = 0; i < 10; i++) {
            map.put(i, i*-1);
        }
        
        Iterator it = map.entrySet().iterator();
        
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove();
        }
    }
}
