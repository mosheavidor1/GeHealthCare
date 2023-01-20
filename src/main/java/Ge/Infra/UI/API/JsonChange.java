package Ge.Infra.UI.API;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JsonChange {


    public Set<Map.Entry<String,String>> JsonChange() {

        HashMap<String, String> map = new HashMap<>();
        map.put("firstname", "Moshe");
        map.put("lastname", "Avidor");
        map.put("checkin", "2023-01-20");
        map.put("checkout", "2023-01-25");

        Set<Map.Entry<String, String>> sets = map.entrySet();
        for (Map.Entry<String, String> set : sets) {

         map.entrySet();
        }

return sets;

    }

    }


