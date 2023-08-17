import pojo.Result;

import java.sql.*;
import java.util.*;

//查询数据库表将结果封装到结果集中
public class SQLDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/DEMO";
        String username = "postgres";
        String password = "123456";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            // 连接成功后，您可以在此处执行数据库操作
            Statement statement = connection.createStatement();
            String query1 = "SELECT * FROM students";
//            String query2 = "INSERT INTO students (name, age, gender) VALUES ('Process', 25, 'male')";
//            statement.executeUpdate(query2); // 使用executeUpdate()方法执行插入语句
            ResultSet resultSet = statement.executeQuery(query1);
            //创建集合
            List<Result> list = new ArrayList<>();


            while (resultSet.next()) {
                Result result = new Result();
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
               //给对象赋值
                result.setName(name);
                result.setAge(age);
                result.setGender(gender);
                list.add(result);
            }
            System.out.println(list);

            resultSet.close();
            statement.close();
            connection.close(); // 关闭连接
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
