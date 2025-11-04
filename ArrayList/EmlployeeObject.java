import java.util.ArrayList;
import java.util.Iterator;

public class EmlployeeObject {
    public static void main(String[] args) {
        Employee em1 = new Employee("Sukman", "nagsukman@gmail.com", "Amazon", "Khutpadar");
        Employee em2 = new Employee("Jogeeram", "jaybaghel@gmail.com", "Microsoft", "Kawapaal");
        Employee em3 = new Employee("Krishna", "tablubaghel12@gmail.com", "Oracle", "Jagdalpur");
        Employee em4 = new Employee("Gagan", "gaganbaghel23@gmail.com", "Flifkart", "Markel");
        Employee em5 = new Employee("Nushant", "nushubaghel21@gmail.com", "Infosis", "Jagdalpur");
        ArrayList<Employee> arr1 = new ArrayList<>();
        arr1.add(em1);
        arr1.add(em2);
        arr1.add(em3);
        arr1.add(em4);
        arr1.add(em5);

        // yaha par getter and setter karke attributes ko change kar rahe hai aur print
        // bhi kar rahe...

        for(int i = 0;i< arr1.size();i++){
        Employee e1 = arr1.get(i);
        if(e1.getUserName().equalsIgnoreCase("jogeeram")){
        System.out.println(e1);
        System.out.println(e1.getComponyName());
        e1.setComponyName("vivo");
        System.out.println(e1.getComponyName());
        System.out.println(e1);
        }
        }
        // yaha par delete or remove() karke check karenge
        // aur Iterator ka use karenge
        // while loop ka use karenge

        Iterator<Employee> itr = arr1.listIterator();
        while (itr.hasNext()) {
            Employee emm = itr.next();
            if (emm.getComponyName().equalsIgnoreCase("Amazon")) {
                itr.remove();
            }
        }
        for (Employee remm1 : arr1) {
            System.out.println(remm1);
        }
    }
}
