package lyl.util;

import java.beans.PropertyVetoException;
import java.sql.Connection;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtil2 {

    private static String url = "jdbc:mysql://localhost:3306/bookstore?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
    private static String user = "root";
    private static String password = "1234";
    private static ComboPooledDataSource dataSource = null;
    private Connection con = null;
    static{
        //初始化操作
        dataSource = new ComboPooledDataSource();// 使用默认的配置
        dataSource.setJdbcUrl(url);//设置连接字符串
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");//获取驱动
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        dataSource.setUser(user);//用户名
        dataSource.setPassword(password);//密码
        dataSource.setInitialPoolSize(3);//初始化时获取三个连接
        dataSource.setMaxPoolSize(20);//连接池中保留的最大连接数
        dataSource.setMaxIdleTime(60); //最大空闲时间,60秒内未使用则连接被丢弃。若为0则永不丢弃
    }
    
    //获取QueryRunner对象
    public static QueryRunner getQueryRunner(){
        return new QueryRunner(dataSource);
    }
    //获取连接纯 通过c3p0核心类对象获取(此例子没用到该方法)
    public static Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
