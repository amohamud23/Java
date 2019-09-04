import java.util.HashMap;
import java.util.LinkedList;

public class deletedups {



    public static void main(String args[])
    {
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        linkedList.add("Abdi");
        linkedList.add("Mohamud");
        linkedList.add("is");
        linkedList.add("my");
        linkedList.add("name");
        linkedList.add("Mohamud");

        for (int i = 0; i < linkedList.size(); i++)
        {
            hashMap.put(i, linkedList.get(i));
            if (hashMap.containsValue(linkedList.get(i))) {
                linkedList.remove(i);
                System.out.println("Found");
            }
        }
        for (int i = 0; i < linkedList.size(); i++)
            System.out.println(linkedList.get(i));





    }

}
