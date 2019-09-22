import java.util.HashMap;
import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectEmployeeByIdLike(HashMap<String, Object> params);
}
