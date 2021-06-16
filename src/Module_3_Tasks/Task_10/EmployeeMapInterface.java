package Module_3_Tasks.Task_10;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@FunctionalInterface
public interface EmployeeMapInterface {
    List<Map.Entry<Integer, String> > sortEmployeeByName(TreeMap<Integer,String> input);
}
