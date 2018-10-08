package lyl.util;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * ���ӳذ汾��jdbcUtil
 * @author APPle
 *
 */
public class JdbcUtil {

	//�������ӳض���
	private static DataSource ds = new ComboPooledDataSource(); 
	
	/**
	 * ��ȡ���ӳض���
	 */
	public static DataSource getDataSource(){
		 //ע�⣺ ��Ҫ��ôд�������ᵼ�µ����Ӻܿ�������
		//DataSource ds = new ComboPooledDataSource(); 
		return ds;
	}
	
	 private static ComboPooledDataSource dataSource = null;
	    static{
	        //��ʼ������
	        // �Զ�����srcĿ¼��c3p0�������ļ���c3p0-config.xml��
	        dataSource = new ComboPooledDataSource();// ʹ��Ĭ�ϵ�����
	        //ʹ��c3p0-config.xml�����ļ���named-config��name����ΪC3P0TestName������
	        //dataSource = new ComboPooledDataSource("C3P0TestName");
	    }
	    
	    //��ȡQueryRunner����
	    public static QueryRunner getQueryRunner(){
	        return new QueryRunner(dataSource);
	    }
	    //��ȡ���Ӵ� ͨ��c3p0����������ȡ(������û�õ��÷���)
	    public static Connection getConnection(){
	        try {
	            return dataSource.getConnection();
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException(e);
	        }
	    }
}
