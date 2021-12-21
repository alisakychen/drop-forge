package com.celnoda.dropforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celnoda.dropforge.dao.*;
import com.celnoda.dropforge.model.*;

@Service
public class PlayerCharacterManagerImpl implements PlayerCharacterManager {
	
	@Autowired
	PlayerCharacterDAO pcDAO;
		
	@Override
	public List<PlayerCharacter> getPlayerCharacters() {
		return pcDAO.getPlayerCharacters();
	}

	@Override
	public PlayerCharacter createPlayerCharacter(PlayerCharacter character) {
		return pcDAO.createPlayerCharacter(character);
	}
}
