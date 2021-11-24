package com.celnoda.dropforge.playercharacter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerCharacterManagerImpl implements PlayerCharacterManager {
	
	@Autowired
	PlayerCharacterDAO pcDAO;
	
	@Override
	public List<PlayerCharacter> getPlayerCharacters() {
		return pcDAO.getPlayerCharacters();
	}
}
