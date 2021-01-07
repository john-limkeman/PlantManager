package DAOs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.plantManager.Models.Garden;

public class JDBCGardenDAO implements GardenDAO{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public Garden getGardenByUserId(Long id) {
		Garden garden = new Garden();
		String sql = "SELECT * FROM gardens WHERE user_id = ?";
		SqlRowSet results = template.queryForRowSet(sql, id);
		while (results.next()) {
			
		}
		// TODO Auto-generated method stub
		return garden;
	}

	@Override
	public Garden getGardenById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
