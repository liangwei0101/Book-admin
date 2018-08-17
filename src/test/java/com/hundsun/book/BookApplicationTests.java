package com.hundsun.book;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookApplicationTests {

	static final String DB_URL = "jdbc:mysql://101.132.124.171:3306/liang";
	// MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称
	static final String USER = "root";
	static final String PASS = "root";

	@Test
	public void contextLoads() throws ClassNotFoundException, SQLException {

        Connection conn = null;
        Statement stat = null;

        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        // 创建链接
        conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);

        stat = conn.createStatement();

        String sql = "SELECT * FROM BookInfo";
        ResultSet rs = stat.executeQuery(sql);
        rs.getStatement();
	}

}
