package lyl.util;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.commons.dbutils.QueryRunner;

public class JdbcUtil1 {
	 private static String url = "jdbc:mysql://localhost:3306/bookstore?useUnicode=true&characterEncoding=utf8";
	    private static String user = "root";
	    private static String password = "1234";
	    //��ȡQueryRunner����
	    public static QueryRunner getQueryRunner(){
	        return new QueryRunner();
	    }
	    //��ȡ����
	    public static Connection getConnection(){
	        try {
	            Class.forName("com.mysql.jdbc.Driver");      //��������
	            return DriverManager.getConnection(url, user, password);
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException(e);
	        }
	    }

}
