package DAOs;

import java.sql.JDBCType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.plantManager.Models.Plant;

public class JDBCPlantsDAO implements PlantDAO {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Plant> getAllPlantsByUserId(long id) {
		List <Plant> output = new ArrayList<Plant>();
		String sql = "SELECT * FROM plants WHERE user_id = ?";
		SqlRowSet results = template.queryForRowSet(sql, id);
		while (results.next()) {
			output.add(mapRowToPlant(results));
		}
		return output;
	}
	
	@Override
	public Plant getPlantById(long id) {
		Plant plant = new Plant();
		String sql = "SELECT * FROM plants WHERE id = ?";
		SqlRowSet result = template.queryForRowSet(sql, id);
		while(result.next()) {
			plant = mapRowToPlant(result);
		}
		return plant;
	}
	

	
	private Plant mapRowToPlant(SqlRowSet results) {
		Plant plant = new Plant();
		plant.setId(results.getLong("id"));
		plant.setUserId(results.getInt("user_id"));
		plant.setGardenId(results.getInt("garden_id"));
		plant.setName(results.getNString("name"));
		plant.setWaterRate(results.getInt("water_rate"));
		plant.setSunligthPref(results.getNString("sunlight_pref"));
		plant.setDatePlanted(results.getDate("date_planted"));
		plant.setDateFlowered(results.getDate("date_flowered"));
		plant.setDateProduced(results.getDate("date_produced"));
		plant.setPlot(results.getInt("plot"));
		return plant;
	}




}
