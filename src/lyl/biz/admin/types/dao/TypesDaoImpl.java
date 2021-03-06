package lyl.biz.admin.types.dao;

import lyl.entity.Types;
import lyl.util.BaseDao;
import lyl.util.JdbcUtil;
import lyl.util.WebUtil;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class TypesDaoImpl extends BaseDao<Types> implements TypesDao {

	public void saveTypes(Types type) {
		try {
			QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
			qr.update("insert into types(id,name,descr) values(?,?,?)",
						new Object[]{
						WebUtil.uuid(),
						type.getName(),
						type.getDescr()
			});
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	
	/*@Test
	public void test(){
		TypesDaoImpl dao = new TypesDaoImpl();
		List<Types> list = dao.findAll();
		for (Types types : list) {
			System.out.println(types);
		}
	}*/
}
