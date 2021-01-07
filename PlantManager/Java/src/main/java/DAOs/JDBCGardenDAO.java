package DAOs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.plantManager.Models.Garden;

public class JDBCGardenDAO implements GardenDAO {

	@Autowired
	private JdbcTemplate template;

	@Override
	public Garden getGardenByUserId(Long id) {
		Garden garden = new Garden();
		String sql = "SELECT * FROM gardens WHERE user_id = ?";
		SqlRowSet results = template.queryForRowSet(sql, id);
		while (results.next()) {

		}

		return garden;
	}

	@Override
	public Garden getGardenById(Long id) {
		Garden garden = new Garden();
		String sql = "SELECT * FROM gardens WHERE id = ?";
		SqlRowSet results = template.queryForRowSet(sql, id);
		while (results.next()) {

		}
		return garden;
	}

	public Garden mapRowToGarden(SqlRowSet row) {
		List<Boolean> plotList = new ArrayList<>();
		for(int i = 1; i < 101; i++) {
			Boolean status = row.getBoolean("plot" + i);
			plotList.add(status);
		}
		
		Boolean[] plots = new Boolean[plotList.size()]; 
		plots = plotList.toArray(plots);
		Garden garden = new Garden();

		garden.setId(row.getLong("id"));
		garden.setUserId(row.getLong("user_id"));
		garden.setPlots(plots);
		return garden;
	}

}
