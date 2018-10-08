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
        //��ʼ������
        dataSource = new ComboPooledDataSource();// ʹ��Ĭ�ϵ�����
        dataSource.setJdbcUrl(url);//���������ַ���
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");//��ȡ����
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        dataSource.setUser(user);//�û���
        dataSource.setPassword(password);//����
        dataSource.setInitialPoolSize(3);//��ʼ��ʱ��ȡ��������
        dataSource.setMaxPoolSize(20);//���ӳ��б��������������
        dataSource.setMaxIdleTime(60); //������ʱ��,60����δʹ�������ӱ���������Ϊ0����������
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
