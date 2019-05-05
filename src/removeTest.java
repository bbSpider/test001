import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by B00457 on 2019/4/29.
 */
public class removeTest {
    public static void main(String ages[]){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator<String> it =  list.iterator();
        while (it.hasNext()){
            String item = it.next();
            if("3".equals(item)){
                it.remove();
            }
//            System.out.print(item+"  ");
            System.out.println(list.size());
        }

  /*      for (String item : list) {
            if ("1".equals(item)) {
                list.remove(item);
            }
        }*/

//        for (int i = 0; i < list.size(); i++) {
//            String item = list.get(i);
//            if ("1".equals(item)) {
//                list.remove(item);
//            }
//            System.out.println(list.size());
//        }
//
//        list.forEach(item -> {
//            if ("1".equals(item)) {
//                list.remove(item);
//            }
//            System.out.println(list.size());
//        });
    }
}
