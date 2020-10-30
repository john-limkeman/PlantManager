package DAOs;

import java.util.List;

import org.springframework.stereotype.Component;

import com.plantManager.Models.Plant;

@Component
public interface PlantDAO {

	public List<Plant> getAllPlantsByUserId(long id);
	
	
}
