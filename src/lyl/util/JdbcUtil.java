package lyl.util;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 连接池版本的jdbcUtil
 * @author APPle
 *
 */
public class JdbcUtil {

	//创建连接池对象
	private static DataSource ds = new ComboPooledDataSource(); 
	
	/**
	 * 获取连接池对象
	 */
	public static DataSource getDataSource(){
		 //注意： 不要这么写，这样会导致的连接很快用完了
		//DataSource ds = new ComboPooledDataSource(); 
		return ds;
	}
	
	 private static ComboPooledDataSource dataSource = null;
	    static{
	        //初始化操作
	        // 自动加载src目录下c3p0的配置文件【c3p0-config.xml】
	        dataSource = new ComboPooledDataSource();// 使用默认的配置
	        //使用c3p0-config.xml配置文件中named-config的name属性为C3P0TestName的配置
	        //dataSource = new ComboPooledDataSource("C3P0TestName");
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
