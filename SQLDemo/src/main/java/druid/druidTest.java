package druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.SQLException;

//Druid连接池

public class druidTest {
    public static void main(String[] args) {
        // 创建Druid数据源
        DruidDataSource dataSource = new DruidDataSource();

        // 配置数据库连接信息
        dataSource.setUrl("jdbc:postgresql://localhost:5432/DEMO");
        dataSource.setUsername("postgres");
        dataSource.setPassword("123456");

        // 其他连接池配置，例如最大连接数、初始化连接数等
        dataSource.setMaxActive(10);
        dataSource.setInitialSize(5);

        DruidPooledConnection connection = null;

        try {
            // 获取数据库连接
            connection = dataSource.getConnection();

            // 在此处可以执行数据库操作

            // 关闭数据库连接
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        // 关闭数据源
        dataSource.close();
    }
}