import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

//哈哈
public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        HashMap<String, Object> params = new HashMap<>();
        params.put("id", 1);
        List<Employee> list = session.selectList("mapper.EmployeeMapper.selectEmployeeByIdLike", params);
        for (Employee employee : list) {
            System.out.println(employee);
        }
        session.commit();
        session.close();
    }
}
