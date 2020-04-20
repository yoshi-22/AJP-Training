import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Week{
    public static void main (String []args){
        
        //listをString型で宣言
        List<String> list = new ArrayList<String>();
    
        //listにデータ追加
        list.add("monday");
        list.add("tuesday");
        list.add("wednesday");
        list.add("thursday");
        list.add("friday");
        list.add("saturday");
        list.add("sunnday");
        
        //mapを宣言
        Map<String,String> map = new LinkedHashMap<>();
        
        // Mapにlistの値を代入
        map.put(list.get(0),"(月曜日)");
        map.put(list.get(1),"(火曜日)");
        map.put(list.get(2),"(水曜日)");
        map.put(list.get(3),"(木曜日)");
        map.put(list.get(4),"(金曜日)");
        map.put(list.get(5),"(土曜日)");
        map.put(list.get(6),"(日曜日)");
        
        // Iterator<Map.Entry<String, String>> の宣言
        Iterator<Map.Entry<String,String>> ite = map.entrySet().iterator();
        
        // key, valueの取得
        while(ite.hasNext()) {
            
        // nextを使用して値を取得する
        Map.Entry<String, String> ent = ite.next();
            
            System.out.println(ent.getKey() + ent.getValue());
        }
    }
}