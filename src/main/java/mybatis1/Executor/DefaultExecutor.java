package mybatis1.Executor;


import com.sun.javafx.binding.StringFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by dell on 2019/1/10.
 */
public class DefaultExecutor implements Executor {
	private static Logger log = LoggerFactory.getLogger(DefaultExecutor.class);
	@Override
	public <T> T query(String statement, Object parameter) {
		try {
			DataSource dataSource = getDataSource();
			Connection connection= dataSource.getConnection();
			String sql = String.format(statement,parameter);
			PreparedStatement pstmt = connection.prepareStatement(sql);
			log.error(sql);
			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()){
				log.error(String.format("name:%s",resultSet.getString(1)));
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public DataSource getDataSource(){
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("123456");
		return driverManagerDataSource;
	}
}
