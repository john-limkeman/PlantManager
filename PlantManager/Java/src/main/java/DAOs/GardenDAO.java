package DAOs;

import com.plantManager.Models.Garden;

public interface GardenDAO {

	public Garden getGardenByUserId(Long id);
	public Garden getGardenById(Long id);
}
