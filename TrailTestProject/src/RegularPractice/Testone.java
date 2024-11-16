package RegularPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Testone {
    public static void main(String arg[]) {
       


        List<Employee> employees = List.of(new Employee(2, 25, 25000, "M", "Raj", "Manager"),
                new Employee(5, 25, 25000, "M", "Raj", "developer"),
                new Employee(3, 25, 25000, "M", "Raj", "CCO"));
        Map<Integer, Employee> map = new HashMap<>();

        for (Employee e : employees) {
            map.put(e.id, e);
        }
        Iterator mapIterate = map.entrySet().iterator();

        while (mapIterate.hasNext()) {
            System.out.println(mapIterate.next());
        }

       
    }
}

